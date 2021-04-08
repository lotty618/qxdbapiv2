package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_DISCHARGE_RECORD")
public class EmrDischargeRecord {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "DISCHARGE_RECORD_ID")
    private String dischargeRecordId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    /**
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    /**
     * 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "IN_DISEASE_DIAG_CODE")
    private String inDiseaseDiagCode;

    /**
     * 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "IN_DISEASE_DIAG_NAME")
    private String inDiseaseDiagName;

    /**
     * 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    @Column(name = "OUT_DATE")
    private String outDate;

    /**
     * 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    @Column(name = "OUT_DISEASE_DIAG_CODE")
    private String outDiseaseDiagCode;

    /**
     * 出院诊断 （患者所患疾病的西医诊断名称）
     */
    @Column(name = "OUT_DISEASE_DIAG_NAME")
    private String outDiseaseDiagName;

    /**
     * 出院情况 （对患者出院情况的详细描述 ）
     */
    @Column(name = "OUT_CONDITION_DESC")
    private String outConditionDesc;

    /**
     * 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    @Column(name = "POSITIVE_AUXI_EXAM_RESULT")
    private String positiveAuxiExamResult;

    /**
     * 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    @Column(name = "OUT_SYMPTOM")
    private String outSymptom;

    /**
     * 出院医嘱 （对患者出院医嘱的详细描述）
     */
    @Column(name = "OUT_ORDER")
    private String outOrder;

    /**
     * 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "HOSPITAL_DOCTOR_SIGNATURE")
    private String hospitalDoctorSignature;

    /**
     * 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "SUPERIOR_DOCTOR_SIGNATURE")
    private String superiorDoctorSignature;

    /**
     * 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    /**
     * 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    @Column(name = "SYNDROME_DIFFER_DESC")
    private String syndromeDifferDesc;

    /**
     * 中药煎煮方法（中药煎煮的方法的描述）
     */
    @Column(name = "TCM_DECOC_PIECE_METHOD")
    private String tcmDecocPieceMethod;

    /**
     * 中药用药方法（中药的用药方法的描述）
     */
    @Column(name = "TCM_USE_METHOD")
    private String tcmUseMethod;

    /**
     * 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    @Column(name = "CHIEF_DOCTOR_SIGNATURE")
    private String chiefDoctorSignature;

    /**
     * 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "ATTENDING_DOCTOR_SIGNATURE")
    private String attendingDoctorSignature;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

    /**
     * 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    @Column(name = "STATUS_CN")
    private String statusCn;

    /**
     * 删除时间YYYY/MM/DD（数据删除时间）
     */
    @Column(name = "CANCEL_TIME")
    private String cancelTime;

    /**
     * 录入人姓名（信息录入人姓名）
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "MODIFIER")
    private String modifier;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    /**
     * 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 病历模板类别代码（例如：11）
     */
    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    /**
     * 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    /**
     * 病历标题名称（例如：XX主任医师查房记录）
     */
    @Column(name = "EMR_TITLE")
    private String emrTitle;

    /**
     * 病历使用医院模板编号
     */
    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

    /**
     * 病历原文（医院病历的原始内容）CLOB类型
     */
    @Column(name = "EMR_CONTENT_CLOB")
    private String emrContentClob;

    /**
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
    }

    /**
     * 获取患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DISCHARGE_RECORD_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDischargeRecordId() {
        return dischargeRecordId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param dischargeRecordId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDischargeRecordId(String dischargeRecordId) {
        this.dischargeRecordId = dischargeRecordId == null ? null : dischargeRecordId.trim();
    }

    /**
     * 获取病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @return CASE_NO - 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @param caseNo 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @return IN_HOSPITAL_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @param inHospitalTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * 获取入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return IN_DATE - 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * 设置入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param inDate 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    /**
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESC - 入院情况（对患者入院情况的详细描述）
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inConditionDesc 入院情况（对患者入院情况的详细描述）
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
    }

    /**
     * 获取入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return IN_DISEASE_DIAG_CODE - 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getInDiseaseDiagCode() {
        return inDiseaseDiagCode;
    }

    /**
     * 设置入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param inDiseaseDiagCode 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setInDiseaseDiagCode(String inDiseaseDiagCode) {
        this.inDiseaseDiagCode = inDiseaseDiagCode == null ? null : inDiseaseDiagCode.trim();
    }

    /**
     * 获取入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return IN_DISEASE_DIAG_NAME - 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getInDiseaseDiagName() {
        return inDiseaseDiagName;
    }

    /**
     * 设置入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param inDiseaseDiagName 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setInDiseaseDiagName(String inDiseaseDiagName) {
        this.inDiseaseDiagName = inDiseaseDiagName == null ? null : inDiseaseDiagName.trim();
    }

    /**
     * 获取出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     *
     * @return OUT_DATE - 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    public String getOutDate() {
        return outDate;
    }

    /**
     * 设置出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     *
     * @param outDate 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    public void setOutDate(String outDate) {
        this.outDate = outDate == null ? null : outDate.trim();
    }

    /**
     * 获取出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     *
     * @return OUT_DISEASE_DIAG_CODE - 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    public String getOutDiseaseDiagCode() {
        return outDiseaseDiagCode;
    }

    /**
     * 设置出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     *
     * @param outDiseaseDiagCode 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    public void setOutDiseaseDiagCode(String outDiseaseDiagCode) {
        this.outDiseaseDiagCode = outDiseaseDiagCode == null ? null : outDiseaseDiagCode.trim();
    }

    /**
     * 获取出院诊断 （患者所患疾病的西医诊断名称）
     *
     * @return OUT_DISEASE_DIAG_NAME - 出院诊断 （患者所患疾病的西医诊断名称）
     */
    public String getOutDiseaseDiagName() {
        return outDiseaseDiagName;
    }

    /**
     * 设置出院诊断 （患者所患疾病的西医诊断名称）
     *
     * @param outDiseaseDiagName 出院诊断 （患者所患疾病的西医诊断名称）
     */
    public void setOutDiseaseDiagName(String outDiseaseDiagName) {
        this.outDiseaseDiagName = outDiseaseDiagName == null ? null : outDiseaseDiagName.trim();
    }

    /**
     * 获取出院情况 （对患者出院情况的详细描述 ）
     *
     * @return OUT_CONDITION_DESC - 出院情况 （对患者出院情况的详细描述 ）
     */
    public String getOutConditionDesc() {
        return outConditionDesc;
    }

    /**
     * 设置出院情况 （对患者出院情况的详细描述 ）
     *
     * @param outConditionDesc 出院情况 （对患者出院情况的详细描述 ）
     */
    public void setOutConditionDesc(String outConditionDesc) {
        this.outConditionDesc = outConditionDesc == null ? null : outConditionDesc.trim();
    }

    /**
     * 获取阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     *
     * @return POSITIVE_AUXI_EXAM_RESULT - 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    public String getPositiveAuxiExamResult() {
        return positiveAuxiExamResult;
    }

    /**
     * 设置阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     *
     * @param positiveAuxiExamResult 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    public void setPositiveAuxiExamResult(String positiveAuxiExamResult) {
        this.positiveAuxiExamResult = positiveAuxiExamResult == null ? null : positiveAuxiExamResult.trim();
    }

    /**
     * 获取出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     *
     * @return OUT_SYMPTOM - 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    public String getOutSymptom() {
        return outSymptom;
    }

    /**
     * 设置出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     *
     * @param outSymptom 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    public void setOutSymptom(String outSymptom) {
        this.outSymptom = outSymptom == null ? null : outSymptom.trim();
    }

    /**
     * 获取出院医嘱 （对患者出院医嘱的详细描述）
     *
     * @return OUT_ORDER - 出院医嘱 （对患者出院医嘱的详细描述）
     */
    public String getOutOrder() {
        return outOrder;
    }

    /**
     * 设置出院医嘱 （对患者出院医嘱的详细描述）
     *
     * @param outOrder 出院医嘱 （对患者出院医嘱的详细描述）
     */
    public void setOutOrder(String outOrder) {
        this.outOrder = outOrder == null ? null : outOrder.trim();
    }

    /**
     * 获取住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return HOSPITAL_DOCTOR_SIGNATURE - 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getHospitalDoctorSignature() {
        return hospitalDoctorSignature;
    }

    /**
     * 设置住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param hospitalDoctorSignature 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setHospitalDoctorSignature(String hospitalDoctorSignature) {
        this.hospitalDoctorSignature = hospitalDoctorSignature == null ? null : hospitalDoctorSignature.trim();
    }

    /**
     * 获取上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return SUPERIOR_DOCTOR_SIGNATURE - 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getSuperiorDoctorSignature() {
        return superiorDoctorSignature;
    }

    /**
     * 设置上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param superiorDoctorSignature 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setSuperiorDoctorSignature(String superiorDoctorSignature) {
        this.superiorDoctorSignature = superiorDoctorSignature == null ? null : superiorDoctorSignature.trim();
    }

    /**
     * 获取签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @return SIGNATURE_DATE - 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public String getSignatureDate() {
        return signatureDate;
    }

    /**
     * 设置签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @param signatureDate 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate == null ? null : signatureDate.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
    }

    /**
     * 获取辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     *
     * @return SYNDROME_DIFFER_DESC - 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    public String getSyndromeDifferDesc() {
        return syndromeDifferDesc;
    }

    /**
     * 设置辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     *
     * @param syndromeDifferDesc 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    public void setSyndromeDifferDesc(String syndromeDifferDesc) {
        this.syndromeDifferDesc = syndromeDifferDesc == null ? null : syndromeDifferDesc.trim();
    }

    /**
     * 获取中药煎煮方法（中药煎煮的方法的描述）
     *
     * @return TCM_DECOC_PIECE_METHOD - 中药煎煮方法（中药煎煮的方法的描述）
     */
    public String getTcmDecocPieceMethod() {
        return tcmDecocPieceMethod;
    }

    /**
     * 设置中药煎煮方法（中药煎煮的方法的描述）
     *
     * @param tcmDecocPieceMethod 中药煎煮方法（中药煎煮的方法的描述）
     */
    public void setTcmDecocPieceMethod(String tcmDecocPieceMethod) {
        this.tcmDecocPieceMethod = tcmDecocPieceMethod == null ? null : tcmDecocPieceMethod.trim();
    }

    /**
     * 获取中药用药方法（中药的用药方法的描述）
     *
     * @return TCM_USE_METHOD - 中药用药方法（中药的用药方法的描述）
     */
    public String getTcmUseMethod() {
        return tcmUseMethod;
    }

    /**
     * 设置中药用药方法（中药的用药方法的描述）
     *
     * @param tcmUseMethod 中药用药方法（中药的用药方法的描述）
     */
    public void setTcmUseMethod(String tcmUseMethod) {
        this.tcmUseMethod = tcmUseMethod == null ? null : tcmUseMethod.trim();
    }

    /**
     * 获取主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     *
     * @return CHIEF_DOCTOR_SIGNATURE - 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    public String getChiefDoctorSignature() {
        return chiefDoctorSignature;
    }

    /**
     * 设置主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     *
     * @param chiefDoctorSignature 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    public void setChiefDoctorSignature(String chiefDoctorSignature) {
        this.chiefDoctorSignature = chiefDoctorSignature == null ? null : chiefDoctorSignature.trim();
    }

    /**
     * 获取主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return ATTENDING_DOCTOR_SIGNATURE - 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getAttendingDoctorSignature() {
        return attendingDoctorSignature;
    }

    /**
     * 设置主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param attendingDoctorSignature 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setAttendingDoctorSignature(String attendingDoctorSignature) {
        this.attendingDoctorSignature = attendingDoctorSignature == null ? null : attendingDoctorSignature.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * 获取状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @return STATUS_CN - 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public String getStatusCn() {
        return statusCn;
    }

    /**
     * 设置状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @param statusCn 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn == null ? null : statusCn.trim();
    }

    /**
     * 获取删除时间YYYY/MM/DD（数据删除时间）
     *
     * @return CANCEL_TIME - 删除时间YYYY/MM/DD（数据删除时间）
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置删除时间YYYY/MM/DD（数据删除时间）
     *
     * @param cancelTime 删除时间YYYY/MM/DD（数据删除时间）
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    /**
     * 获取录入人姓名（信息录入人姓名）
     *
     * @return CREATOR - 录入人姓名（信息录入人姓名）
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param creator 录入人姓名（信息录入人姓名）
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return CREATE_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param createTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return MODIFIER - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param modifier 最后更新人姓名（信息最后更新人姓名）
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 获取最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @return MODIFIED_TIME - 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @param modifiedTime 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime == null ? null : modifiedTime.trim();
    }

    /**
     * 获取系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @return SYSUP_TIME - 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * 设置系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @param sysupTime 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * 获取数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @return SYSCR_TIME - 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * 设置数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @param syscrTime 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
    }

    /**
     * 获取有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 获取病历模板类别代码（例如：11）
     *
     * @return TEMPLATE_TYPE - 病历模板类别代码（例如：11）
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置病历模板类别代码（例如：11）
     *
     * @param templateType 病历模板类别代码（例如：11）
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * 获取病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @return TEMPLATE_TYPE_CN - 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * 设置病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @param templateTypeCn 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * 获取病历标题名称（例如：XX主任医师查房记录）
     *
     * @return EMR_TITLE - 病历标题名称（例如：XX主任医师查房记录）
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * 设置病历标题名称（例如：XX主任医师查房记录）
     *
     * @param emrTitle 病历标题名称（例如：XX主任医师查房记录）
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * 获取病历使用医院模板编号
     *
     * @return EMR_TEMPLATE_CODE - 病历使用医院模板编号
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * 设置病历使用医院模板编号
     *
     * @param emrTemplateCode 病历使用医院模板编号
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
    }

    /**
     * 获取病历原文（医院病历的原始内容）
     *
     * @return EMR_CONTENT - 病历原文（医院病历的原始内容）
     */
    public byte[] getEmrContent() {
        return emrContent;
    }

    /**
     * 设置病历原文（医院病历的原始内容）
     *
     * @param emrContent 病历原文（医院病历的原始内容）
     */
    public void setEmrContent(byte[] emrContent) {
        this.emrContent = emrContent;
    }

    /**
     * 获取病历原文（医院病历的原始内容）CLOB类型
     *
     * @return EMR_CONTENT_CLOB - 病历原文（医院病历的原始内容）CLOB类型
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * 设置病历原文（医院病历的原始内容）CLOB类型
     *
     * @param emrContentClob 病历原文（医院病历的原始内容）CLOB类型
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}