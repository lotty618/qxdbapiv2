package com.quanxi.qxdbapiv2.qxdsdaq.service.impl;

import com.quanxi.qxdbapiv2.qxcommon.util.DateTimeUtil;
import com.quanxi.qxdbapiv2.qxcommon.util.StringUtil;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTPatientDao;
import com.quanxi.qxdbapiv2.qxdsdao.entity.original.Patient;
import com.quanxi.qxdbapiv2.qxdsdao.dao.original.PatientDao;
import com.quanxi.qxdbapiv2.qxdsdaq.service.LogService;
import com.quanxi.qxdbapiv2.qxdsdaq.service.PatientService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTLog;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTPatient;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;

    @Autowired
    QxTPatientDao qxTPatientDao;

    @Autowired
    LogService logService;

    @Autowired
    JdbcTemplate newlayerJdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate newlayerNamedParameterJdbcTemplate;

    @Value("${qxds.daq.max.collect.count}")
    private int DAQ_PATIENT_COLLECT_COUNT;

    //每次提交数量
    @Value("${qxds.daq.max.batch.number}")
    private int MAX_BATCH_NUMBER;

    //将原始层患者数据转为新建层数据
    private QxTPatient patientOrgToNew(Patient patient) {
        QxTPatient qxTPatient = new QxTPatient();

        BeanUtils.copyProperties(patient, qxTPatient);
        qxTPatient.setPuid(StringUtil.uuid());
        qxTPatient.setOrguid(StringUtil.uuid());
        qxTPatient.setQid(patient.getQid().toString());
        qxTPatient.setIsInvalid((short)0);
        qxTPatient.setIsDel((short)0);
        qxTPatient.setCreateTime(DateTimeUtil.getCurrSysTime());
        qxTPatient.setUpdateTime(DateTimeUtil.getCurrSysTime());

        return qxTPatient;
    }

    /**
     * 分批导入数据
     * @return
     */
    @Override
    public boolean importPatientData() {
        int qid = 0;
        //查询患者目前导入的最大QID
        QxTLog log = logService.selectOneByTableName("PATIENT");
        if (null != log) {
            qid = Integer.parseInt(log.getQid());
        }

        long startTime = System.currentTimeMillis();

        //根据QID查询最新的原始层患者数据
        List<Patient> listPatient = patientDao.getPatientList(qid, DAQ_PATIENT_COLLECT_COUNT);

        long endTime = System.currentTimeMillis();
        System.out.println("列表查询共用时：" + String.valueOf(endTime - startTime) + "ms");

        if (null == listPatient) {
            return false;   //出错
        }
        if (listPatient.size() < 1) {
            return false;   //无数据更新
        }

        int count = listPatient.size();
        List<QxTPatient> listQxPatient = new ArrayList<>();

        if (count < MAX_BATCH_NUMBER) {
            for (Patient patient : listPatient) {
                QxTPatient qxTPatient = patientOrgToNew(patient);
                listQxPatient.add(qxTPatient);
            }

            int iRet = qxTPatientDao.batchInsertPatient(listQxPatient);
        } else {
            for (int i = 0; i < count;) {
                Patient patient = listPatient.get(i);
                QxTPatient qxTPatient = patientOrgToNew(patient);
                listQxPatient.add(qxTPatient);

                i++;
                if (i % MAX_BATCH_NUMBER == 0 || i == count) {
                    long batchStart = System.currentTimeMillis();

                    int iRet = qxTPatientDao.batchInsertPatient(listQxPatient);
                    listQxPatient.clear();

                    long batchCostTime = System.currentTimeMillis() - batchStart;
                    System.out.println(String.valueOf(i) + " - 批量插入数据用时：" + String.valueOf(batchCostTime) + "ms");
                }
            }
        }

        System.out.println("插入数据共用时：" + String.valueOf(System.currentTimeMillis() - endTime) + "ms");
        return true;
    }


    /**
     * 单条插入10W条数据，共用时：730727ms
     * @return
     */
    @Override
    public boolean importSinglePatientData() {
        int qid = 0;
        //查询患者目前导入的最大QID
        QxTLog log = logService.selectOneByTableName("PATIENT");
        if (null != log) {
            qid = Integer.parseInt(log.getQid());
        }

        long startTime = System.currentTimeMillis();

        //根据QID查询最新的原始层患者数据
        List<Patient> listPatient = patientDao.getPatientList(qid, DAQ_PATIENT_COLLECT_COUNT);
        if (null != listPatient && listPatient.size() > 0) {
            for (Patient patient : listPatient) {
                QxTPatient qxTPatient = patientOrgToNew(patient);
                int iRet = qxTPatientDao.insertPatient(qxTPatient);
//                System.out.println(qxTPatient.getName() + ": " + iRet);
            }

            long costTime = System.currentTimeMillis() - startTime;
            System.out.println("共用时：" + String.valueOf(costTime) + "ms");
            return true;
        }

        return false;
    }

    private ReentrantLock lockBatchImportPatient = new ReentrantLock();

    /**
     * 批量导入数据，10W条数据插入用时35秒左右
     * @return
     */
    @Override
    public boolean batchImportPatientData() {
        if (lockBatchImportPatient.tryLock()) {
            try {
                int qid = 0;
                //查询患者目前导入的最大QID
                QxTLog log = logService.selectOneByTableName("PATIENT");
                if (null != log) {
                    qid = Integer.parseInt(log.getQid());
                }

                long startTime = System.currentTimeMillis();

                //根据QID查询最新的原始层患者数据
                List<Patient> listPatient = patientDao.getPatientList(qid, DAQ_PATIENT_COLLECT_COUNT);

                long endTime = System.currentTimeMillis();
                System.out.println("列表查询共用时：" + String.valueOf(endTime - startTime) + "ms");

                if (null == listPatient) {
                    return false;   //出错
                }
                if (listPatient.size() < 1) {
                    return false;   //无数据更新
                }

                List<QxTPatient> listQxPatient = new ArrayList<>();
                for (int i = 0; i < listPatient.size(); i++) {
                    Patient patient = listPatient.get(i);
                    QxTPatient qxTPatient = patientOrgToNew(patient);
                    listQxPatient.add(qxTPatient);
                }

                String strSql = "INSERT INTO QX_T_PATIENT(PUID, ORGUID, PATIENT_ID, ORG_ID, NATIONALITY_NAME, NAME, TEL_NO, " +
                        "GENDER_CODE, GENDER_NAME, ETHNIC_CODE, ETHNIC_NAME, BIRTHDAY, ID_CARD_TYPE, ID_CARD_TYPE_NAME, " +
                        "ID_CARD_NO, EMPLOYER_ORG, WORK_DATE, EMPLOYER_ORG_TEL, CONTACT_NAME, CONTACT_RELATION_CODE, " +
                        "CONTACT_RELATION_NAME, CONTACT_TEL, EMAIL, EDU_CODE, EDU_NAME, OCCUPATION_CODE, OCCUPATION_NAME, " +
                        "MARITAL_STATUS_CODE, MARITAL_STATUS_NAME, IS_RESIDENCE_ADD, CARD_TYPE_CODE, CARD_TYPE_NAME, " +
                        "HEALTHCARE_TYPE_CODE, HEALTHCARE_TYPE_NAME, HEALTHCARE_NO, SOCIAL_SECURITY_NO, HOSPITAL_ACC_NO, " +
                        "CARD_NO, HEALTH_DOC_NO, EHR_MANAGE_ORG_NAME, EHR_MANAGE_ORG_ID, BLOODTYPE_ABO, BLOODTYPE_ABO_NAME, " +
                        "BLOODTYPE_RH, BLOODTYPE_RH_NAME, HAS_DRUG_ALLERGY, HAS_OP_HISTORY, HAS_TRAUMA_HISTORY, HAS_BLOOD_TRANSF, " +
                        "CARD_EXP_DATE, HAS_ASTHMA, HAS_HEART_DISEASE, HAS_CARDIOVASCULAR, HAS_EPILEPSY, HAS_COAGULOPATHY, " +
                        "HAS_DIABETES, HAS_GLAUCOMA, HAS_DIALYSIS, HAS_ORGAN_TRANSF, HAS_ORGAN_DEFECT, HAS_REMOVAL_PRO, " +
                        "HAS_CARDIAC_PAC, HAS_ORTHER_MEDICAL_ALERT, HAS_PSYCHIATRIC, VACC_HISTORY_CODE, VACC_HISTORY_NAME, " +
                        "EVENT_NAME, EVENT_DATE, EVENT_PLACE, CREATE_OPERATOR, EHR_CREATE_DATE, LAST_UPD_DATE, NAME_PY, " +
                        "NAME_PINYIN, QID, IS_INVALID, IS_DEL, CREATE_TIME, UPDATE_TIME, ILLNESS_HISTORY) VALUES(?, ?, ?, ?, " +
                        "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                        "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                        "?, ?, ?, ?, ?, ?)";

                int[][] updateCount = newlayerJdbcTemplate.batchUpdate(strSql, listQxPatient, MAX_BATCH_NUMBER, new ParameterizedPreparedStatementSetter<QxTPatient>() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement, QxTPatient patient) throws SQLException {
                        int index = 1;
                        preparedStatement.setString(index++, StringUtil.uuid());
                        preparedStatement.setString(index++, StringUtil.uuid());
                        preparedStatement.setString(index++, patient.getPatientId());
                        preparedStatement.setString(index++, patient.getOrgId());
                        preparedStatement.setString(index++, patient.getNationalityName());
                        preparedStatement.setString(index++, patient.getName());
                        preparedStatement.setString(index++, patient.getTelNo());

                        preparedStatement.setString(index++, patient.getGenderCode());
                        preparedStatement.setString(index++, patient.getGenderName());
                        preparedStatement.setString(index++, patient.getEthnicCode());
                        preparedStatement.setString(index++, patient.getEthnicName());
//                preparedStatement.setString(index++, patient.getBirthday());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getBirthday()));
                        preparedStatement.setString(index++, patient.getIdCardType());
                        preparedStatement.setString(index++, patient.getIdCardTypeName());

                        preparedStatement.setString(index++, patient.getIdCardNo());
                        preparedStatement.setString(index++, patient.getEmployerOrg());
//                preparedStatement.setString(index++, patient.getWorkDate());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getWorkDate()));
                        preparedStatement.setString(index++, patient.getEmployerOrgTel());
                        preparedStatement.setString(index++, patient.getContactName());
                        preparedStatement.setString(index++, patient.getContactRelationCode());

                        preparedStatement.setString(index++, patient.getContactRelationName());
                        preparedStatement.setString(index++, patient.getContactTel());
                        preparedStatement.setString(index++, patient.getEmail());
                        preparedStatement.setString(index++, patient.getEduCode());
                        preparedStatement.setString(index++, patient.getEduName());
                        preparedStatement.setString(index++, patient.getOccupationCode());
                        preparedStatement.setString(index++, patient.getOccupationName());

                        preparedStatement.setString(index++, patient.getMaritalStatusCode());
                        preparedStatement.setString(index++, patient.getMaritalStatusName());
                        preparedStatement.setObject(index++, patient.getIsResidenceAdd());
                        preparedStatement.setString(index++, patient.getCardTypeCode());
                        preparedStatement.setString(index++, patient.getCardTypeName());

                        preparedStatement.setString(index++, patient.getHealthcareTypeCode());
                        preparedStatement.setString(index++, patient.getHealthcareTypeName());
                        preparedStatement.setString(index++, patient.getHealthcareNo());
                        preparedStatement.setString(index++, patient.getSocialSecurityNo());
                        preparedStatement.setString(index++, patient.getHospitalAccNo());

                        preparedStatement.setString(index++, patient.getCardNo());
                        preparedStatement.setString(index++, patient.getHealthDocNo());
                        preparedStatement.setString(index++, patient.getEhrManageOrgName());
                        preparedStatement.setString(index++, patient.getEhrManageOrgId());
                        preparedStatement.setString(index++, patient.getBloodtypeAbo());
                        preparedStatement.setString(index++, patient.getBloodtypeAboName());

                        preparedStatement.setString(index++, patient.getBloodtypeRh());
                        preparedStatement.setString(index++, patient.getBloodtypeRhName());
                        preparedStatement.setObject(index++, patient.getHasDrugAllergy());
                        preparedStatement.setObject(index++, patient.getHasOpHistory());
                        preparedStatement.setObject(index++, patient.getHasTraumaHistory());
                        preparedStatement.setObject(index++, patient.getHasBloodTransf());

//                preparedStatement.setString(index++, patient.getCardExpDate());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getCardExpDate()));
                        preparedStatement.setObject(index++, patient.getHasAsthma());
                        preparedStatement.setObject(index++, patient.getHasHeartDisease());
                        preparedStatement.setObject(index++, patient.getHasCardiovascular());
                        preparedStatement.setObject(index++, patient.getHasEpilepsy());
                        preparedStatement.setObject(index++, patient.getHasCoagulopathy());

                        preparedStatement.setObject(index++, patient.getHasDiabetes());
                        preparedStatement.setObject(index++, patient.getHasGlaucoma());
                        preparedStatement.setObject(index++, patient.getHasDialysis());
                        preparedStatement.setObject(index++, patient.getHasOrganTransf());
                        preparedStatement.setObject(index++, patient.getHasOrganDefect());
                        preparedStatement.setObject(index++, patient.getHasRemovalPro());

                        preparedStatement.setObject(index++, patient.getHasCardiacPac());
                        preparedStatement.setString(index++, patient.getHasOrtherMedicalAlert());
                        preparedStatement.setObject(index++, patient.getHasPsychiatric());
                        preparedStatement.setString(index++, patient.getVaccHistoryCode());
                        preparedStatement.setString(index++, patient.getVaccHistoryName());

                        preparedStatement.setString(index++, patient.getEventName());
//                preparedStatement.setString(index++, patient.getEventDate());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getEventDate()));
                        preparedStatement.setString(index++, patient.getEventPlace());
                        preparedStatement.setString(index++, patient.getCreateOperator());
//                preparedStatement.setString(index++, patient.getEhrCreateDate());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getEhrCreateDate()));
//                preparedStatement.setString(index++, patient.getLastUpdDate());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getLastUpdDate()));
                        preparedStatement.setString(index++, patient.getNamePy());

                        preparedStatement.setString(index++, patient.getNamePinyin());
                        preparedStatement.setString(index++, patient.getQid());
                        preparedStatement.setObject(index++, patient.getIsInvalid());
                        preparedStatement.setObject(index++, patient.getIsDel());
//                preparedStatement.setString(index++, patient.getCreateTime());
//                preparedStatement.setString(index++, patient.getUpdateTime());
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getCreateTime()));
                        preparedStatement.setTimestamp(index++, DateTimeUtil.strToDateTimestamp(patient.getUpdateTime()));
                        preparedStatement.setString(index++, patient.getIllnessHistory());
                    }
                });

                logService.addSuccessLog("PATIENT", qid + listQxPatient.size(),
                        listQxPatient.size(), 0, listQxPatient.get(0).getOrgId());

                System.out.println("插入数据共用时：" + String.valueOf(System.currentTimeMillis() - endTime) + "ms");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lockBatchImportPatient.unlock();
            }
        }

        return false;
    }


    /**
     * 批量导入数据，此方式同上，10W条数据插入用时35秒左右
     * @return
     */
    @Override
    public boolean batchImportPatientDataEx() {
        if (lockBatchImportPatient.tryLock()) {
            try {
                int qid = 0;
                //查询患者目前导入的最大QID
                QxTLog log = logService.selectOneByTableName("PATIENT");
                if (null != log) {
                    qid = Integer.parseInt(log.getQid());
                }

                long startTime = System.currentTimeMillis();

                //根据QID查询最新的原始层患者数据
                List<Patient> listPatient = patientDao.getPatientList(qid, DAQ_PATIENT_COLLECT_COUNT);

                long endTime = System.currentTimeMillis();
                System.out.println("列表查询共用时：" + String.valueOf(endTime - startTime) + "ms");

                if (null == listPatient) {
                    return false;   //出错
                }
                if (listPatient.size() < 1) {
                    return false;   //无数据更新
                }

                List<QxTPatient> listQxPatient = new ArrayList<>();
                for (int i = 0; i < listPatient.size(); i++) {
                    Patient patient = listPatient.get(i);
                    QxTPatient qxTPatient = patientOrgToNew(patient);
                    listQxPatient.add(qxTPatient);
                }

                SqlParameterSource[] beanSources = SqlParameterSourceUtils.createBatch(listQxPatient.toArray());

                String strSql = "INSERT INTO QX_T_PATIENT(PUID, ORGUID, PATIENT_ID, ORG_ID, NATIONALITY_NAME, NAME, TEL_NO, " +
                        "GENDER_CODE, GENDER_NAME, ETHNIC_CODE, ETHNIC_NAME, BIRTHDAY, ID_CARD_TYPE, ID_CARD_TYPE_NAME, " +
                        "ID_CARD_NO, EMPLOYER_ORG, WORK_DATE, EMPLOYER_ORG_TEL, CONTACT_NAME, CONTACT_RELATION_CODE, " +
                        "CONTACT_RELATION_NAME, CONTACT_TEL, EMAIL, EDU_CODE, EDU_NAME, OCCUPATION_CODE, OCCUPATION_NAME, " +
                        "MARITAL_STATUS_CODE, MARITAL_STATUS_NAME, IS_RESIDENCE_ADD, CARD_TYPE_CODE, CARD_TYPE_NAME, " +
                        "HEALTHCARE_TYPE_CODE, HEALTHCARE_TYPE_NAME, HEALTHCARE_NO, SOCIAL_SECURITY_NO, HOSPITAL_ACC_NO, " +
                        "CARD_NO, HEALTH_DOC_NO, EHR_MANAGE_ORG_NAME, EHR_MANAGE_ORG_ID, BLOODTYPE_ABO, BLOODTYPE_ABO_NAME, " +
                        "BLOODTYPE_RH, BLOODTYPE_RH_NAME, HAS_DRUG_ALLERGY, HAS_OP_HISTORY, HAS_TRAUMA_HISTORY, HAS_BLOOD_TRANSF, " +
                        "CARD_EXP_DATE, HAS_ASTHMA, HAS_HEART_DISEASE, HAS_CARDIOVASCULAR, HAS_EPILEPSY, HAS_COAGULOPATHY, " +
                        "HAS_DIABETES, HAS_GLAUCOMA, HAS_DIALYSIS, HAS_ORGAN_TRANSF, HAS_ORGAN_DEFECT, HAS_REMOVAL_PRO, " +
                        "HAS_CARDIAC_PAC, HAS_ORTHER_MEDICAL_ALERT, HAS_PSYCHIATRIC, VACC_HISTORY_CODE, VACC_HISTORY_NAME, " +
                        "EVENT_NAME, EVENT_DATE, EVENT_PLACE, CREATE_OPERATOR, EHR_CREATE_DATE, LAST_UPD_DATE, NAME_PY, " +
                        "NAME_PINYIN, QID, IS_INVALID, IS_DEL, CREATE_TIME, UPDATE_TIME, ILLNESS_HISTORY) " +
                        "VALUES(:puid, :orguid, :patientId, :orgId, :nationalityName, :name, :telNo, " +
                        ":genderCode, :genderName, :ethnicCode, :ethnicName, TO_DATE(:birthday, 'yyyy-MM-dd HH24:mi:ss'), :idCardType, :idCardTypeName, " +
                        ":idCardNo, :employerOrg, TO_DATE(:workDate, 'yyyy-MM-dd HH24:mi:ss'), :employerOrgTel, :contactName, :contactRelationCode, " +
                        ":contactRelationName, :contactTel, :email, :eduCode, :eduName, :occupationCode, :occupationName, " +
                        ":maritalStatusCode, :maritalStatusName, :isResidenceAdd, :cardTypeCode, :cardTypeName, " +
                        ":healthcareTypeCode, :healthcareTypeName, :healthcareNo, :socialSecurityNo, :hospitalAccNo, " +
                        ":cardNo, :healthDocNo, :ehrManageOrgName, :ehrManageOrgId, :bloodtypeAbo, :bloodtypeAboName, " +
                        ":bloodtypeRh, :bloodtypeRhName, :hasDrugAllergy, :hasOpHistory, :hasTraumaHistory, :hasBloodTransf, " +
                        "TO_DATE(:cardExpDate, 'yyyy-MM-dd HH24:mi:ss'), :hasAsthma, :hasHeartDisease, :hasCardiovascular, :hasEpilepsy, :hasCoagulopathy, " +
                        ":hasDiabetes, :hasGlaucoma, :hasDialysis, :hasOrganTransf, :hasOrganDefect, :hasRemovalPro, " +
                        ":hasCardiacPac, :hasOrtherMedicalAlert, :hasPsychiatric, :vaccHistoryCode, :vaccHistoryName, " +
                        ":eventName, TO_DATE(:eventDate, 'yyyy-MM-dd HH24:mi:ss'), :eventPlace, :createOperator, TO_DATE(:ehrCreateDate, 'yyyy-MM-dd HH24:mi:ss'), TO_DATE(:lastUpdDate, 'yyyy-MM-dd HH24:mi:ss'), :namePy, " +
                        ":namePinyin, :qid, :isInvalid, :isDel, TO_DATE(:createTime, 'yyyy-MM-dd HH24:mi:ss'), TO_DATE(:updateTime, 'yyyy-MM-dd HH24:mi:ss'), :illnessHistory)";

                int[] updateCounts = newlayerNamedParameterJdbcTemplate.batchUpdate(strSql, beanSources);

                logService.addSuccessLog("PATIENT", qid + listQxPatient.size(),
                        listQxPatient.size(), 0, listQxPatient.get(0).getOrgId());

                System.out.println("插入数据共用时：" + String.valueOf(System.currentTimeMillis() - endTime) + "ms");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lockBatchImportPatient.unlock();
            }
        }

        return false;
    }

//    private void preStmtSetLong(PreparedStatement preparedStatement, int index, Long val) throws SQLException {
//        //preparedStatement.setLong(index, val == null ? 0 : val);
//        //preparedStatement.setString(index, val == null ? null : val.toString());
//        preparedStatement.setObject(index, val);
//    }

}
