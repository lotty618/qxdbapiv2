package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_ASS_ADMISSION_RECORD")
public class QxTAssAdmissionRecord {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Column(name = "ADMISSION_EVA_ID")
    private String admissionEvaId;

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
     * 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称（患者在医疗机构就诊的科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 病区名称（患者当前所在病区的名称）
     */
    @Column(name = "WARD_NAME")
    private String wardName;

    /**
     * 病房号（患者住院期间，所住病房对应的编号）
     */
    @Column(name = "ROOM_NO")
    private String roomNo;

    /**
     * 病床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别中文名称（本人生理性别的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

    /**
     * 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_MONTH")
    private String ageMonth;

    /**
     * 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    /**
     * 国籍名称（患者所属国籍在特定编码体系中的名称）
     */
    @Column(name = "COUNTRY_NAME")
    private String countryName;

    /**
     * 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    @Column(name = "NATIONAL_CODE")
    private String nationalCode;

    /**
     * 民族名称（患者所属民族在特定编码体系中的名称）
     */
    @Column(name = "NATIONAL_NAME")
    private String nationalName;

    /**
     * 婚姻状况代码GB/T 2261.2（患者当前婚姻状况在特定编码体系中的代码）
     */
    @Column(name = "MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况名称（患者当前婚姻状况在特定编码体系中的名称）
     */
    @Column(name = "MARRIAGE_NAME")
    private String marriageName;

    /**
     * 职业类别代码GB/T 6565（患者当前从事的职业类别在特定编码体系中的代码）
     */
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;

    /**
     * 职业类别名称（患者当前从事的职业类别在特定编码体系中的名称）
     */
    @Column(name = "OCCUPATION_NAME")
    private String occupationName;

    /**
     * 学历代码GB/T 4658（患者本人受教育的最高程度类别在特定编码体系中的代码）
     */
    @Column(name = "EDUCATION_CODE")
    private String educationCode;

    /**
     * 学历名称（患者本人受教育的最高程度类别在特定编码体系中的名称）
     */
    @Column(name = "EDUCATION_NAME")
    private String educationName;

    /**
     * 患者电话号码（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "TEL_NO")
    private String telNo;

    /**
     * 工作单位电话号码（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "EMPLOYER_TEL_NO")
    private String employerTelNo;

    /**
     * 患者电子邮件地址（患者的电子邮箱地址）
     */
    @Column(name = "PATIENT_EMAIL")
    private String patientEmail;

    /**
     * 联系人姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "CONTACT_TEL_NO")
    private String contactTelNo;

    /**
     * 入病房方式（患者进入病房时采用的方式，如步行、轮椅等）
     */
    @Column(name = "IN_ROOM_WAY")
    private String inRoomWay;

    /**
     * 入院诊断编码ICD-10（患者入院时做出的疾病诊断在特定编码体系中的编码）
     */
    @Column(name = "IN_DIAG_CODE")
    private String inDiagCode;

    /**
     * 入院诊断名称（患者入院时做出的疾病诊断在特定编码体系中的名称）
     */
    @Column(name = "IN_DIAG_NAME")
    private String inDiagName;

    /**
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 主要症状（患者出现的临床主要症状的描述）
     */
    @Column(name = "MAIN_SYMPTOM")
    private String mainSymptom;

    /**
     * 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "BREATHING_RATE")
    private Short breathingRate;

    /**
     * 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private Short pulses;

    /**
     * 体温（℃）（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERATURE")
    private BigDecimal temperature;

    /**
     * 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    @Column(name = "SBP")
    private Short sbp;

    /**
     * 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    @Column(name = "DBP")
    private Short dbp;

    /**
     * 体重（患者体重的测量值，计量单位为 kg）
     */
    @Column(name = "WEIGHT")
    private BigDecimal weight;

    /**
     * 入院原因代码CV06.00.212（因某种疾病或健康问题住院治疗的原因的描述代码）
     */
    @Column(name = "ADMISSION_REASON_CODE")
    private String admissionReasonCode;

    /**
     * 入院原因名称（因某种疾病或健康问题住院治疗的原因的描述名称）
     */
    @Column(name = "ADMISSION_REASON_NAME")
    private String admissionReasonName;

    /**
     * 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    @Column(name = "IN_PATH_CODE")
    private String inPathCode;

    /**
     * 入院途径名称（患者收治入院治疗的来源分类在特定编码体系中的名称）
     */
    @Column(name = "IN_PATH_NAME")
    private String inPathName;

    /**
     * Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    @Column(name = "APGAR_SCORE")
    private Short apgarScore;

    /**
     * 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    @Column(name = "DIET_QUALITY_CODE")
    private String dietQualityCode;

    /**
     * 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    @Column(name = "DIET_QUALITY_NAME")
    private String dietQualityName;

    /**
     * 发育程度代码DIR_DEVELOPERS_LEVEL（发育情况评估结果的分类代码）
     */
    @Column(name = "DEVELOPMENT_DEGREE_CODE")
    private String developmentDegreeCode;

    /**
     * 发育程度名称（发育情况评估结果的分类名称）
     */
    @Column(name = "DEVELOPMENT_DEGREE_NAME")
    private String developmentDegreeName;

    /**
     * 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    @Column(name = "MENTAL_STATE_NORMAL_MARK")
    private String mentalStateNormalMark;

    /**
     * 睡眠状况（患者睡眠状况的描述）
     */
    @Column(name = "SLEEP_STATE")
    private String sleepState;

    /**
     * 特殊情况（对存在特殊情况的描述）
     */
    @Column(name = "SPECIAL_STATE")
    private String specialState;

    /**
     * 心理状态代码DIR_PSYCHOLOGY_STATUS（患者心理状况的分类在特定编码体系中的代码）
     */
    @Column(name = "MENTAL_STATUS_CODE")
    private String mentalStatusCode;

    /**
     * 心理状态名称（患者心理状况的分类在特定编码体系中的名称）
     */
    @Column(name = "MENTAL_STATUS_NAME")
    private String mentalStatusName;

    /**
     * 营养状态代码DIR_NUTRITIONAL_STATUS（患者营养情况评估结果类别的分类代码）
     */
    @Column(name = "NUTRITION_STATUS_CODE")
    private String nutritionStatusCode;

    /**
     * 营养状态名称（患者营养情况评估结果类别的分类名称）
     */
    @Column(name = "NUTRITION_STATUS_NAME")
    private String nutritionStatusName;

    /**
     * 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    @Column(name = "SELFCARE_CODE")
    private String selfcareCode;

    /**
     * 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    @Column(name = "SELFCARE_NAME")
    private String selfcareName;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    @Column(name = "GENERAL_HEALTH_MARK")
    private String generalHealthMark;

    /**
     * 疾病史（含外伤）（对患者既往健康状况和疾病（含外伤）的详细描述）
     */
    @Column(name = "DISEASE_HISTORY")
    private String diseaseHistory;

    /**
     * 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    @Column(name = "INFECTIOUS_MARK")
    private String infectiousMark;

    /**
     * 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    @Column(name = "INFECTION_HISTORY")
    private String infectionHistory;

    /**
     * 预防接种史（与患者预防接种情况的详细描述）
     */
    @Column(name = "VACCINATE_HISTORY")
    private String vaccinateHistory;

    /**
     * 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    @Column(name = "OPERATION_HISTORY")
    private String operationHistory;

    /**
     * 输血史（对患者既往输血史的详细描述）
     */
    @Column(name = "BLOOD_HISTORY")
    private String bloodHistory;

    /**
     * 家族史（患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    @Column(name = "FAMILY_HISTORY")
    private String familyHistory;

    /**
     * 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    @Column(name = "NURSING_OBS_ITEM_NAME")
    private String nursingObsItemName;

    /**
     * 护理观察结果（对护理观察项目结果的详细描述）
     */
    @Column(name = "NURSING_OBS_RESULT")
    private String nursingObsResult;

    /**
     * 吸烟标志0否 1是（标识患者是否吸烟的标志）
     */
    @Column(name = "SMOKING_MARK")
    private String smokingMark;

    /**
     * 停止吸烟天数（患者停止吸烟的总天数，计量单位为 d）
     */
    @Column(name = "STOP_SMOKIING_DAYS")
    private BigDecimal stopSmokiingDays;

    /**
     * 吸烟状况代码DIR_SMOKING_SITUATION（患者过去和现在吸烟情况的分类代码）
     */
    @Column(name = "SMOKING_STATUS_CODE")
    private String smokingStatusCode;

    /**
     * 吸烟状况名称（患者过去和现在吸烟情况的分类名称）
     */
    @Column(name = "SMOKING_STATUS_NAME")
    private String smokingStatusName;

    /**
     * 日吸烟量（支）（最近 1 个月内平均每天的吸烟量，计量单位为支）
     */
    @Column(name = "DAILY_SMOKING")
    private Short dailySmoking;

    /**
     * 饮酒标志（标识患者是否饮酒的标志）
     */
    @Column(name = "DRINK_MARK")
    private String drinkMark;

    /**
     * 饮酒频率代码CV03.00.104（患者饮酒频率分类在特定编码体系中的代码）
     */
    @Column(name = "DRINK_FREQ_CODE")
    private String drinkFreqCode;

    /**
     * 饮酒频率名称（患者饮酒频率分类在特定编码体系中的名称）
     */
    @Column(name = "DRINK_FREQ_NAME")
    private String drinkFreqName;

    /**
     * 日饮酒量（mL）（患者平均每天的饮酒量相当于白酒量,计量单位为 mL）
     */
    @Column(name = "DAILY_DRINKING")
    private Integer dailyDrinking;

    /**
     * 通知医师标志0否 1是（标识是否已通知医师的标志）
     */
    @Column(name = "NOTICE_DOCTOR_MARK")
    private String noticeDoctorMark;

    /**
     * 通知医师日期时间（通知负责医师时的公元纪年日期和时间的完整描）
     */
    @Column(name = "NOTICE_DOCTOR_DATE")
    private String noticeDoctorDate;

    /**
     * 评估日期时间（患者入院后接受护理评估结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "EVALUATION_DATE")
    private String evaluationDate;

    /**
     * 责任护士签名（在已开展责任制护理的科室，负责本患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESP_NURSE_SIGNATURE")
    private String respNurseSignature;

    /**
     * 接诊护士签名（负责患者入院接诊的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ACCEPT_NURSE_SIGNATURE")
    private String acceptNurseSignature;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

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
     * 评估报告ID（对应一次评估报告唯一ID）
     */
    @Column(name = "REPORT_ID")
    private String reportId;

    @Column(name = "IHUID")
    private String ihuid;

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
     * @return ADMISSION_EVA_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getAdmissionEvaId() {
        return admissionEvaId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param admissionEvaId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setAdmissionEvaId(String admissionEvaId) {
        this.admissionEvaId = admissionEvaId == null ? null : admissionEvaId.trim();
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
     * 获取科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @return DEPT_CODE - 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @param deptCode 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称（患者在医疗机构就诊的科室名称）
     *
     * @return DEPT_NAME - 科室名称（患者在医疗机构就诊的科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（患者在医疗机构就诊的科室名称）
     *
     * @param deptName 科室名称（患者在医疗机构就诊的科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取病区名称（患者当前所在病区的名称）
     *
     * @return WARD_NAME - 病区名称（患者当前所在病区的名称）
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病区名称（患者当前所在病区的名称）
     *
     * @param wardName 病区名称（患者当前所在病区的名称）
     */
    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    /**
     * 获取病房号（患者住院期间，所住病房对应的编号）
     *
     * @return ROOM_NO - 病房号（患者住院期间，所住病房对应的编号）
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置病房号（患者住院期间，所住病房对应的编号）
     *
     * @param roomNo 病房号（患者住院期间，所住病房对应的编号）
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * 获取病床号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 病床号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置病床号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 病床号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别中文名称（本人生理性别的中文名称）
     *
     * @return SEX_CN - 性别中文名称（本人生理性别的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别中文名称（本人生理性别的中文名称）
     *
     * @param sexCn 性别中文名称（本人生理性别的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_YEAR - 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageYear 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeYear(String ageYear) {
        this.ageYear = ageYear == null ? null : ageYear.trim();
    }

    /**
     * 获取字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_MONTH - 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageMonth 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeMonth(String ageMonth) {
        this.ageMonth = ageMonth == null ? null : ageMonth.trim();
    }

    /**
     * 获取国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @return COUNTRY_CODE - 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @param countryCode 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 获取国籍名称（患者所属国籍在特定编码体系中的名称）
     *
     * @return COUNTRY_NAME - 国籍名称（患者所属国籍在特定编码体系中的名称）
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国籍名称（患者所属国籍在特定编码体系中的名称）
     *
     * @param countryName 国籍名称（患者所属国籍在特定编码体系中的名称）
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 获取民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     *
     * @return NATIONAL_CODE - 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    public String getNationalCode() {
        return nationalCode;
    }

    /**
     * 设置民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     *
     * @param nationalCode 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode == null ? null : nationalCode.trim();
    }

    /**
     * 获取民族名称（患者所属民族在特定编码体系中的名称）
     *
     * @return NATIONAL_NAME - 民族名称（患者所属民族在特定编码体系中的名称）
     */
    public String getNationalName() {
        return nationalName;
    }

    /**
     * 设置民族名称（患者所属民族在特定编码体系中的名称）
     *
     * @param nationalName 民族名称（患者所属民族在特定编码体系中的名称）
     */
    public void setNationalName(String nationalName) {
        this.nationalName = nationalName == null ? null : nationalName.trim();
    }

    /**
     * 获取婚姻状况代码GB/T 2261.2（患者当前婚姻状况在特定编码体系中的代码）
     *
     * @return MARRIAGE_CODE - 婚姻状况代码GB/T 2261.2（患者当前婚姻状况在特定编码体系中的代码）
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * 设置婚姻状况代码GB/T 2261.2（患者当前婚姻状况在特定编码体系中的代码）
     *
     * @param marriageCode 婚姻状况代码GB/T 2261.2（患者当前婚姻状况在特定编码体系中的代码）
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
    }

    /**
     * 获取婚姻状况名称（患者当前婚姻状况在特定编码体系中的名称）
     *
     * @return MARRIAGE_NAME - 婚姻状况名称（患者当前婚姻状况在特定编码体系中的名称）
     */
    public String getMarriageName() {
        return marriageName;
    }

    /**
     * 设置婚姻状况名称（患者当前婚姻状况在特定编码体系中的名称）
     *
     * @param marriageName 婚姻状况名称（患者当前婚姻状况在特定编码体系中的名称）
     */
    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    /**
     * 获取职业类别代码GB/T 6565（患者当前从事的职业类别在特定编码体系中的代码）
     *
     * @return OCCUPATION_CODE - 职业类别代码GB/T 6565（患者当前从事的职业类别在特定编码体系中的代码）
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * 设置职业类别代码GB/T 6565（患者当前从事的职业类别在特定编码体系中的代码）
     *
     * @param occupationCode 职业类别代码GB/T 6565（患者当前从事的职业类别在特定编码体系中的代码）
     */
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    /**
     * 获取职业类别名称（患者当前从事的职业类别在特定编码体系中的名称）
     *
     * @return OCCUPATION_NAME - 职业类别名称（患者当前从事的职业类别在特定编码体系中的名称）
     */
    public String getOccupationName() {
        return occupationName;
    }

    /**
     * 设置职业类别名称（患者当前从事的职业类别在特定编码体系中的名称）
     *
     * @param occupationName 职业类别名称（患者当前从事的职业类别在特定编码体系中的名称）
     */
    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName == null ? null : occupationName.trim();
    }

    /**
     * 获取学历代码GB/T 4658（患者本人受教育的最高程度类别在特定编码体系中的代码）
     *
     * @return EDUCATION_CODE - 学历代码GB/T 4658（患者本人受教育的最高程度类别在特定编码体系中的代码）
     */
    public String getEducationCode() {
        return educationCode;
    }

    /**
     * 设置学历代码GB/T 4658（患者本人受教育的最高程度类别在特定编码体系中的代码）
     *
     * @param educationCode 学历代码GB/T 4658（患者本人受教育的最高程度类别在特定编码体系中的代码）
     */
    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode == null ? null : educationCode.trim();
    }

    /**
     * 获取学历名称（患者本人受教育的最高程度类别在特定编码体系中的名称）
     *
     * @return EDUCATION_NAME - 学历名称（患者本人受教育的最高程度类别在特定编码体系中的名称）
     */
    public String getEducationName() {
        return educationName;
    }

    /**
     * 设置学历名称（患者本人受教育的最高程度类别在特定编码体系中的名称）
     *
     * @param educationName 学历名称（患者本人受教育的最高程度类别在特定编码体系中的名称）
     */
    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    /**
     * 获取患者电话号码（患者本人的电话号码，包括国际、国内区号和分机号）
     *
     * @return TEL_NO - 患者电话号码（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * 设置患者电话号码（患者本人的电话号码，包括国际、国内区号和分机号）
     *
     * @param telNo 患者电话号码（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    /**
     * 获取工作单位电话号码（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @return EMPLOYER_TEL_NO - 工作单位电话号码（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public String getEmployerTelNo() {
        return employerTelNo;
    }

    /**
     * 设置工作单位电话号码（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @param employerTelNo 工作单位电话号码（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public void setEmployerTelNo(String employerTelNo) {
        this.employerTelNo = employerTelNo == null ? null : employerTelNo.trim();
    }

    /**
     * 获取患者电子邮件地址（患者的电子邮箱地址）
     *
     * @return PATIENT_EMAIL - 患者电子邮件地址（患者的电子邮箱地址）
     */
    public String getPatientEmail() {
        return patientEmail;
    }

    /**
     * 设置患者电子邮件地址（患者的电子邮箱地址）
     *
     * @param patientEmail 患者电子邮件地址（患者的电子邮箱地址）
     */
    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail == null ? null : patientEmail.trim();
    }

    /**
     * 获取联系人姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CONTACT_NAME - 联系人姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param contactName 联系人姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     *
     * @return CONTACT_TEL_NO - 联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * 设置联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     *
     * @param contactTelNo 联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     */
    public void setContactTelNo(String contactTelNo) {
        this.contactTelNo = contactTelNo == null ? null : contactTelNo.trim();
    }

    /**
     * 获取入病房方式（患者进入病房时采用的方式，如步行、轮椅等）
     *
     * @return IN_ROOM_WAY - 入病房方式（患者进入病房时采用的方式，如步行、轮椅等）
     */
    public String getInRoomWay() {
        return inRoomWay;
    }

    /**
     * 设置入病房方式（患者进入病房时采用的方式，如步行、轮椅等）
     *
     * @param inRoomWay 入病房方式（患者进入病房时采用的方式，如步行、轮椅等）
     */
    public void setInRoomWay(String inRoomWay) {
        this.inRoomWay = inRoomWay == null ? null : inRoomWay.trim();
    }

    /**
     * 获取入院诊断编码ICD-10（患者入院时做出的疾病诊断在特定编码体系中的编码）
     *
     * @return IN_DIAG_CODE - 入院诊断编码ICD-10（患者入院时做出的疾病诊断在特定编码体系中的编码）
     */
    public String getInDiagCode() {
        return inDiagCode;
    }

    /**
     * 设置入院诊断编码ICD-10（患者入院时做出的疾病诊断在特定编码体系中的编码）
     *
     * @param inDiagCode 入院诊断编码ICD-10（患者入院时做出的疾病诊断在特定编码体系中的编码）
     */
    public void setInDiagCode(String inDiagCode) {
        this.inDiagCode = inDiagCode == null ? null : inDiagCode.trim();
    }

    /**
     * 获取入院诊断名称（患者入院时做出的疾病诊断在特定编码体系中的名称）
     *
     * @return IN_DIAG_NAME - 入院诊断名称（患者入院时做出的疾病诊断在特定编码体系中的名称）
     */
    public String getInDiagName() {
        return inDiagName;
    }

    /**
     * 设置入院诊断名称（患者入院时做出的疾病诊断在特定编码体系中的名称）
     *
     * @param inDiagName 入院诊断名称（患者入院时做出的疾病诊断在特定编码体系中的名称）
     */
    public void setInDiagName(String inDiagName) {
        this.inDiagName = inDiagName == null ? null : inDiagName.trim();
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
     * 获取主要症状（患者出现的临床主要症状的描述）
     *
     * @return MAIN_SYMPTOM - 主要症状（患者出现的临床主要症状的描述）
     */
    public String getMainSymptom() {
        return mainSymptom;
    }

    /**
     * 设置主要症状（患者出现的临床主要症状的描述）
     *
     * @param mainSymptom 主要症状（患者出现的临床主要症状的描述）
     */
    public void setMainSymptom(String mainSymptom) {
        this.mainSymptom = mainSymptom == null ? null : mainSymptom.trim();
    }

    /**
     * 获取呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @return BREATHING_RATE - 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public Short getBreathingRate() {
        return breathingRate;
    }

    /**
     * 设置呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @param breathingRate 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public void setBreathingRate(Short breathingRate) {
        this.breathingRate = breathingRate;
    }

    /**
     * 获取脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @return PULSES - 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public Short getPulses() {
        return pulses;
    }

    /**
     * 设置脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @param pulses 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public void setPulses(Short pulses) {
        this.pulses = pulses;
    }

    /**
     * 获取体温（℃）（体温的测量值，计量单位为℃）
     *
     * @return TEMPERATURE - 体温（℃）（体温的测量值，计量单位为℃）
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    /**
     * 设置体温（℃）（体温的测量值，计量单位为℃）
     *
     * @param temperature 体温（℃）（体温的测量值，计量单位为℃）
     */
    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     *
     * @return SBP - 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    public Short getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     *
     * @param sbp 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    public void setSbp(Short sbp) {
        this.sbp = sbp;
    }

    /**
     * 获取舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     *
     * @return DBP - 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    public Short getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     *
     * @param dbp 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    public void setDbp(Short dbp) {
        this.dbp = dbp;
    }

    /**
     * 获取体重（患者体重的测量值，计量单位为 kg）
     *
     * @return WEIGHT - 体重（患者体重的测量值，计量单位为 kg）
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置体重（患者体重的测量值，计量单位为 kg）
     *
     * @param weight 体重（患者体重的测量值，计量单位为 kg）
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取入院原因代码CV06.00.212（因某种疾病或健康问题住院治疗的原因的描述代码）
     *
     * @return ADMISSION_REASON_CODE - 入院原因代码CV06.00.212（因某种疾病或健康问题住院治疗的原因的描述代码）
     */
    public String getAdmissionReasonCode() {
        return admissionReasonCode;
    }

    /**
     * 设置入院原因代码CV06.00.212（因某种疾病或健康问题住院治疗的原因的描述代码）
     *
     * @param admissionReasonCode 入院原因代码CV06.00.212（因某种疾病或健康问题住院治疗的原因的描述代码）
     */
    public void setAdmissionReasonCode(String admissionReasonCode) {
        this.admissionReasonCode = admissionReasonCode == null ? null : admissionReasonCode.trim();
    }

    /**
     * 获取入院原因名称（因某种疾病或健康问题住院治疗的原因的描述名称）
     *
     * @return ADMISSION_REASON_NAME - 入院原因名称（因某种疾病或健康问题住院治疗的原因的描述名称）
     */
    public String getAdmissionReasonName() {
        return admissionReasonName;
    }

    /**
     * 设置入院原因名称（因某种疾病或健康问题住院治疗的原因的描述名称）
     *
     * @param admissionReasonName 入院原因名称（因某种疾病或健康问题住院治疗的原因的描述名称）
     */
    public void setAdmissionReasonName(String admissionReasonName) {
        this.admissionReasonName = admissionReasonName == null ? null : admissionReasonName.trim();
    }

    /**
     * 获取入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     *
     * @return IN_PATH_CODE - 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    public String getInPathCode() {
        return inPathCode;
    }

    /**
     * 设置入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     *
     * @param inPathCode 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    public void setInPathCode(String inPathCode) {
        this.inPathCode = inPathCode == null ? null : inPathCode.trim();
    }

    /**
     * 获取入院途径名称（患者收治入院治疗的来源分类在特定编码体系中的名称）
     *
     * @return IN_PATH_NAME - 入院途径名称（患者收治入院治疗的来源分类在特定编码体系中的名称）
     */
    public String getInPathName() {
        return inPathName;
    }

    /**
     * 设置入院途径名称（患者收治入院治疗的来源分类在特定编码体系中的名称）
     *
     * @param inPathName 入院途径名称（患者收治入院治疗的来源分类在特定编码体系中的名称）
     */
    public void setInPathName(String inPathName) {
        this.inPathName = inPathName == null ? null : inPathName.trim();
    }

    /**
     * 获取Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     *
     * @return APGAR_SCORE - Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    public Short getApgarScore() {
        return apgarScore;
    }

    /**
     * 设置Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     *
     * @param apgarScore Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    public void setApgarScore(Short apgarScore) {
        this.apgarScore = apgarScore;
    }

    /**
     * 获取饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     *
     * @return DIET_QUALITY_CODE - 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    public String getDietQualityCode() {
        return dietQualityCode;
    }

    /**
     * 设置饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     *
     * @param dietQualityCode 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    public void setDietQualityCode(String dietQualityCode) {
        this.dietQualityCode = dietQualityCode == null ? null : dietQualityCode.trim();
    }

    /**
     * 获取饮食情况名称（患者饮食情况所属类别的分类名称）
     *
     * @return DIET_QUALITY_NAME - 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    public String getDietQualityName() {
        return dietQualityName;
    }

    /**
     * 设置饮食情况名称（患者饮食情况所属类别的分类名称）
     *
     * @param dietQualityName 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    public void setDietQualityName(String dietQualityName) {
        this.dietQualityName = dietQualityName == null ? null : dietQualityName.trim();
    }

    /**
     * 获取发育程度代码DIR_DEVELOPERS_LEVEL（发育情况评估结果的分类代码）
     *
     * @return DEVELOPMENT_DEGREE_CODE - 发育程度代码DIR_DEVELOPERS_LEVEL（发育情况评估结果的分类代码）
     */
    public String getDevelopmentDegreeCode() {
        return developmentDegreeCode;
    }

    /**
     * 设置发育程度代码DIR_DEVELOPERS_LEVEL（发育情况评估结果的分类代码）
     *
     * @param developmentDegreeCode 发育程度代码DIR_DEVELOPERS_LEVEL（发育情况评估结果的分类代码）
     */
    public void setDevelopmentDegreeCode(String developmentDegreeCode) {
        this.developmentDegreeCode = developmentDegreeCode == null ? null : developmentDegreeCode.trim();
    }

    /**
     * 获取发育程度名称（发育情况评估结果的分类名称）
     *
     * @return DEVELOPMENT_DEGREE_NAME - 发育程度名称（发育情况评估结果的分类名称）
     */
    public String getDevelopmentDegreeName() {
        return developmentDegreeName;
    }

    /**
     * 设置发育程度名称（发育情况评估结果的分类名称）
     *
     * @param developmentDegreeName 发育程度名称（发育情况评估结果的分类名称）
     */
    public void setDevelopmentDegreeName(String developmentDegreeName) {
        this.developmentDegreeName = developmentDegreeName == null ? null : developmentDegreeName.trim();
    }

    /**
     * 获取精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     *
     * @return MENTAL_STATE_NORMAL_MARK - 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    public String getMentalStateNormalMark() {
        return mentalStateNormalMark;
    }

    /**
     * 设置精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     *
     * @param mentalStateNormalMark 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    public void setMentalStateNormalMark(String mentalStateNormalMark) {
        this.mentalStateNormalMark = mentalStateNormalMark == null ? null : mentalStateNormalMark.trim();
    }

    /**
     * 获取睡眠状况（患者睡眠状况的描述）
     *
     * @return SLEEP_STATE - 睡眠状况（患者睡眠状况的描述）
     */
    public String getSleepState() {
        return sleepState;
    }

    /**
     * 设置睡眠状况（患者睡眠状况的描述）
     *
     * @param sleepState 睡眠状况（患者睡眠状况的描述）
     */
    public void setSleepState(String sleepState) {
        this.sleepState = sleepState == null ? null : sleepState.trim();
    }

    /**
     * 获取特殊情况（对存在特殊情况的描述）
     *
     * @return SPECIAL_STATE - 特殊情况（对存在特殊情况的描述）
     */
    public String getSpecialState() {
        return specialState;
    }

    /**
     * 设置特殊情况（对存在特殊情况的描述）
     *
     * @param specialState 特殊情况（对存在特殊情况的描述）
     */
    public void setSpecialState(String specialState) {
        this.specialState = specialState == null ? null : specialState.trim();
    }

    /**
     * 获取心理状态代码DIR_PSYCHOLOGY_STATUS（患者心理状况的分类在特定编码体系中的代码）
     *
     * @return MENTAL_STATUS_CODE - 心理状态代码DIR_PSYCHOLOGY_STATUS（患者心理状况的分类在特定编码体系中的代码）
     */
    public String getMentalStatusCode() {
        return mentalStatusCode;
    }

    /**
     * 设置心理状态代码DIR_PSYCHOLOGY_STATUS（患者心理状况的分类在特定编码体系中的代码）
     *
     * @param mentalStatusCode 心理状态代码DIR_PSYCHOLOGY_STATUS（患者心理状况的分类在特定编码体系中的代码）
     */
    public void setMentalStatusCode(String mentalStatusCode) {
        this.mentalStatusCode = mentalStatusCode == null ? null : mentalStatusCode.trim();
    }

    /**
     * 获取心理状态名称（患者心理状况的分类在特定编码体系中的名称）
     *
     * @return MENTAL_STATUS_NAME - 心理状态名称（患者心理状况的分类在特定编码体系中的名称）
     */
    public String getMentalStatusName() {
        return mentalStatusName;
    }

    /**
     * 设置心理状态名称（患者心理状况的分类在特定编码体系中的名称）
     *
     * @param mentalStatusName 心理状态名称（患者心理状况的分类在特定编码体系中的名称）
     */
    public void setMentalStatusName(String mentalStatusName) {
        this.mentalStatusName = mentalStatusName == null ? null : mentalStatusName.trim();
    }

    /**
     * 获取营养状态代码DIR_NUTRITIONAL_STATUS（患者营养情况评估结果类别的分类代码）
     *
     * @return NUTRITION_STATUS_CODE - 营养状态代码DIR_NUTRITIONAL_STATUS（患者营养情况评估结果类别的分类代码）
     */
    public String getNutritionStatusCode() {
        return nutritionStatusCode;
    }

    /**
     * 设置营养状态代码DIR_NUTRITIONAL_STATUS（患者营养情况评估结果类别的分类代码）
     *
     * @param nutritionStatusCode 营养状态代码DIR_NUTRITIONAL_STATUS（患者营养情况评估结果类别的分类代码）
     */
    public void setNutritionStatusCode(String nutritionStatusCode) {
        this.nutritionStatusCode = nutritionStatusCode == null ? null : nutritionStatusCode.trim();
    }

    /**
     * 获取营养状态名称（患者营养情况评估结果类别的分类名称）
     *
     * @return NUTRITION_STATUS_NAME - 营养状态名称（患者营养情况评估结果类别的分类名称）
     */
    public String getNutritionStatusName() {
        return nutritionStatusName;
    }

    /**
     * 设置营养状态名称（患者营养情况评估结果类别的分类名称）
     *
     * @param nutritionStatusName 营养状态名称（患者营养情况评估结果类别的分类名称）
     */
    public void setNutritionStatusName(String nutritionStatusName) {
        this.nutritionStatusName = nutritionStatusName == null ? null : nutritionStatusName.trim();
    }

    /**
     * 获取自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     *
     * @return SELFCARE_CODE - 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    public String getSelfcareCode() {
        return selfcareCode;
    }

    /**
     * 设置自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     *
     * @param selfcareCode 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    public void setSelfcareCode(String selfcareCode) {
        this.selfcareCode = selfcareCode == null ? null : selfcareCode.trim();
    }

    /**
     * 获取自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     *
     * @return SELFCARE_NAME - 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    public String getSelfcareName() {
        return selfcareName;
    }

    /**
     * 设置自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     *
     * @param selfcareName 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    public void setSelfcareName(String selfcareName) {
        this.selfcareName = selfcareName == null ? null : selfcareName.trim();
    }

    /**
     * 获取过敏史（患者既往发生过敏情况的详细描述）
     *
     * @return ALLERGY_HISTORY - 过敏史（患者既往发生过敏情况的详细描述）
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * 设置过敏史（患者既往发生过敏情况的详细描述）
     *
     * @param allergyHistory 过敏史（患者既往发生过敏情况的详细描述）
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    /**
     * 获取一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     *
     * @return GENERAL_HEALTH_MARK - 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    public String getGeneralHealthMark() {
        return generalHealthMark;
    }

    /**
     * 设置一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     *
     * @param generalHealthMark 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    public void setGeneralHealthMark(String generalHealthMark) {
        this.generalHealthMark = generalHealthMark == null ? null : generalHealthMark.trim();
    }

    /**
     * 获取疾病史（含外伤）（对患者既往健康状况和疾病（含外伤）的详细描述）
     *
     * @return DISEASE_HISTORY - 疾病史（含外伤）（对患者既往健康状况和疾病（含外伤）的详细描述）
     */
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    /**
     * 设置疾病史（含外伤）（对患者既往健康状况和疾病（含外伤）的详细描述）
     *
     * @param diseaseHistory 疾病史（含外伤）（对患者既往健康状况和疾病（含外伤）的详细描述）
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    /**
     * 获取患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     *
     * @return INFECTIOUS_MARK - 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    public String getInfectiousMark() {
        return infectiousMark;
    }

    /**
     * 设置患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     *
     * @param infectiousMark 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    public void setInfectiousMark(String infectiousMark) {
        this.infectiousMark = infectiousMark == null ? null : infectiousMark.trim();
    }

    /**
     * 获取传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     *
     * @return INFECTION_HISTORY - 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    public String getInfectionHistory() {
        return infectionHistory;
    }

    /**
     * 设置传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     *
     * @param infectionHistory 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    public void setInfectionHistory(String infectionHistory) {
        this.infectionHistory = infectionHistory == null ? null : infectionHistory.trim();
    }

    /**
     * 获取预防接种史（与患者预防接种情况的详细描述）
     *
     * @return VACCINATE_HISTORY - 预防接种史（与患者预防接种情况的详细描述）
     */
    public String getVaccinateHistory() {
        return vaccinateHistory;
    }

    /**
     * 设置预防接种史（与患者预防接种情况的详细描述）
     *
     * @param vaccinateHistory 预防接种史（与患者预防接种情况的详细描述）
     */
    public void setVaccinateHistory(String vaccinateHistory) {
        this.vaccinateHistory = vaccinateHistory == null ? null : vaccinateHistory.trim();
    }

    /**
     * 获取手术史（对患者既往接受手术/操作经历的详细描述）
     *
     * @return OPERATION_HISTORY - 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    public String getOperationHistory() {
        return operationHistory;
    }

    /**
     * 设置手术史（对患者既往接受手术/操作经历的详细描述）
     *
     * @param operationHistory 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    public void setOperationHistory(String operationHistory) {
        this.operationHistory = operationHistory == null ? null : operationHistory.trim();
    }

    /**
     * 获取输血史（对患者既往输血史的详细描述）
     *
     * @return BLOOD_HISTORY - 输血史（对患者既往输血史的详细描述）
     */
    public String getBloodHistory() {
        return bloodHistory;
    }

    /**
     * 设置输血史（对患者既往输血史的详细描述）
     *
     * @param bloodHistory 输血史（对患者既往输血史的详细描述）
     */
    public void setBloodHistory(String bloodHistory) {
        this.bloodHistory = bloodHistory == null ? null : bloodHistory.trim();
    }

    /**
     * 获取家族史（患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     *
     * @return FAMILY_HISTORY - 家族史（患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * 设置家族史（患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     *
     * @param familyHistory 家族史（患者3代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory == null ? null : familyHistory.trim();
    }

    /**
     * 获取护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @return NURSING_OBS_ITEM_NAME - 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public String getNursingObsItemName() {
        return nursingObsItemName;
    }

    /**
     * 设置护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @param nursingObsItemName 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public void setNursingObsItemName(String nursingObsItemName) {
        this.nursingObsItemName = nursingObsItemName == null ? null : nursingObsItemName.trim();
    }

    /**
     * 获取护理观察结果（对护理观察项目结果的详细描述）
     *
     * @return NURSING_OBS_RESULT - 护理观察结果（对护理观察项目结果的详细描述）
     */
    public String getNursingObsResult() {
        return nursingObsResult;
    }

    /**
     * 设置护理观察结果（对护理观察项目结果的详细描述）
     *
     * @param nursingObsResult 护理观察结果（对护理观察项目结果的详细描述）
     */
    public void setNursingObsResult(String nursingObsResult) {
        this.nursingObsResult = nursingObsResult == null ? null : nursingObsResult.trim();
    }

    /**
     * 获取吸烟标志0否 1是（标识患者是否吸烟的标志）
     *
     * @return SMOKING_MARK - 吸烟标志0否 1是（标识患者是否吸烟的标志）
     */
    public String getSmokingMark() {
        return smokingMark;
    }

    /**
     * 设置吸烟标志0否 1是（标识患者是否吸烟的标志）
     *
     * @param smokingMark 吸烟标志0否 1是（标识患者是否吸烟的标志）
     */
    public void setSmokingMark(String smokingMark) {
        this.smokingMark = smokingMark == null ? null : smokingMark.trim();
    }

    /**
     * 获取停止吸烟天数（患者停止吸烟的总天数，计量单位为 d）
     *
     * @return STOP_SMOKIING_DAYS - 停止吸烟天数（患者停止吸烟的总天数，计量单位为 d）
     */
    public BigDecimal getStopSmokiingDays() {
        return stopSmokiingDays;
    }

    /**
     * 设置停止吸烟天数（患者停止吸烟的总天数，计量单位为 d）
     *
     * @param stopSmokiingDays 停止吸烟天数（患者停止吸烟的总天数，计量单位为 d）
     */
    public void setStopSmokiingDays(BigDecimal stopSmokiingDays) {
        this.stopSmokiingDays = stopSmokiingDays;
    }

    /**
     * 获取吸烟状况代码DIR_SMOKING_SITUATION（患者过去和现在吸烟情况的分类代码）
     *
     * @return SMOKING_STATUS_CODE - 吸烟状况代码DIR_SMOKING_SITUATION（患者过去和现在吸烟情况的分类代码）
     */
    public String getSmokingStatusCode() {
        return smokingStatusCode;
    }

    /**
     * 设置吸烟状况代码DIR_SMOKING_SITUATION（患者过去和现在吸烟情况的分类代码）
     *
     * @param smokingStatusCode 吸烟状况代码DIR_SMOKING_SITUATION（患者过去和现在吸烟情况的分类代码）
     */
    public void setSmokingStatusCode(String smokingStatusCode) {
        this.smokingStatusCode = smokingStatusCode == null ? null : smokingStatusCode.trim();
    }

    /**
     * 获取吸烟状况名称（患者过去和现在吸烟情况的分类名称）
     *
     * @return SMOKING_STATUS_NAME - 吸烟状况名称（患者过去和现在吸烟情况的分类名称）
     */
    public String getSmokingStatusName() {
        return smokingStatusName;
    }

    /**
     * 设置吸烟状况名称（患者过去和现在吸烟情况的分类名称）
     *
     * @param smokingStatusName 吸烟状况名称（患者过去和现在吸烟情况的分类名称）
     */
    public void setSmokingStatusName(String smokingStatusName) {
        this.smokingStatusName = smokingStatusName == null ? null : smokingStatusName.trim();
    }

    /**
     * 获取日吸烟量（支）（最近 1 个月内平均每天的吸烟量，计量单位为支）
     *
     * @return DAILY_SMOKING - 日吸烟量（支）（最近 1 个月内平均每天的吸烟量，计量单位为支）
     */
    public Short getDailySmoking() {
        return dailySmoking;
    }

    /**
     * 设置日吸烟量（支）（最近 1 个月内平均每天的吸烟量，计量单位为支）
     *
     * @param dailySmoking 日吸烟量（支）（最近 1 个月内平均每天的吸烟量，计量单位为支）
     */
    public void setDailySmoking(Short dailySmoking) {
        this.dailySmoking = dailySmoking;
    }

    /**
     * 获取饮酒标志（标识患者是否饮酒的标志）
     *
     * @return DRINK_MARK - 饮酒标志（标识患者是否饮酒的标志）
     */
    public String getDrinkMark() {
        return drinkMark;
    }

    /**
     * 设置饮酒标志（标识患者是否饮酒的标志）
     *
     * @param drinkMark 饮酒标志（标识患者是否饮酒的标志）
     */
    public void setDrinkMark(String drinkMark) {
        this.drinkMark = drinkMark == null ? null : drinkMark.trim();
    }

    /**
     * 获取饮酒频率代码CV03.00.104（患者饮酒频率分类在特定编码体系中的代码）
     *
     * @return DRINK_FREQ_CODE - 饮酒频率代码CV03.00.104（患者饮酒频率分类在特定编码体系中的代码）
     */
    public String getDrinkFreqCode() {
        return drinkFreqCode;
    }

    /**
     * 设置饮酒频率代码CV03.00.104（患者饮酒频率分类在特定编码体系中的代码）
     *
     * @param drinkFreqCode 饮酒频率代码CV03.00.104（患者饮酒频率分类在特定编码体系中的代码）
     */
    public void setDrinkFreqCode(String drinkFreqCode) {
        this.drinkFreqCode = drinkFreqCode == null ? null : drinkFreqCode.trim();
    }

    /**
     * 获取饮酒频率名称（患者饮酒频率分类在特定编码体系中的名称）
     *
     * @return DRINK_FREQ_NAME - 饮酒频率名称（患者饮酒频率分类在特定编码体系中的名称）
     */
    public String getDrinkFreqName() {
        return drinkFreqName;
    }

    /**
     * 设置饮酒频率名称（患者饮酒频率分类在特定编码体系中的名称）
     *
     * @param drinkFreqName 饮酒频率名称（患者饮酒频率分类在特定编码体系中的名称）
     */
    public void setDrinkFreqName(String drinkFreqName) {
        this.drinkFreqName = drinkFreqName == null ? null : drinkFreqName.trim();
    }

    /**
     * 获取日饮酒量（mL）（患者平均每天的饮酒量相当于白酒量,计量单位为 mL）
     *
     * @return DAILY_DRINKING - 日饮酒量（mL）（患者平均每天的饮酒量相当于白酒量,计量单位为 mL）
     */
    public Integer getDailyDrinking() {
        return dailyDrinking;
    }

    /**
     * 设置日饮酒量（mL）（患者平均每天的饮酒量相当于白酒量,计量单位为 mL）
     *
     * @param dailyDrinking 日饮酒量（mL）（患者平均每天的饮酒量相当于白酒量,计量单位为 mL）
     */
    public void setDailyDrinking(Integer dailyDrinking) {
        this.dailyDrinking = dailyDrinking;
    }

    /**
     * 获取通知医师标志0否 1是（标识是否已通知医师的标志）
     *
     * @return NOTICE_DOCTOR_MARK - 通知医师标志0否 1是（标识是否已通知医师的标志）
     */
    public String getNoticeDoctorMark() {
        return noticeDoctorMark;
    }

    /**
     * 设置通知医师标志0否 1是（标识是否已通知医师的标志）
     *
     * @param noticeDoctorMark 通知医师标志0否 1是（标识是否已通知医师的标志）
     */
    public void setNoticeDoctorMark(String noticeDoctorMark) {
        this.noticeDoctorMark = noticeDoctorMark == null ? null : noticeDoctorMark.trim();
    }

    /**
     * 获取通知医师日期时间（通知负责医师时的公元纪年日期和时间的完整描）
     *
     * @return NOTICE_DOCTOR_DATE - 通知医师日期时间（通知负责医师时的公元纪年日期和时间的完整描）
     */
    public String getNoticeDoctorDate() {
        return noticeDoctorDate;
    }

    /**
     * 设置通知医师日期时间（通知负责医师时的公元纪年日期和时间的完整描）
     *
     * @param noticeDoctorDate 通知医师日期时间（通知负责医师时的公元纪年日期和时间的完整描）
     */
    public void setNoticeDoctorDate(String noticeDoctorDate) {
        this.noticeDoctorDate = noticeDoctorDate == null ? null : noticeDoctorDate.trim();
    }

    /**
     * 获取评估日期时间（患者入院后接受护理评估结束时的公元纪年日期和时间的完整描述）
     *
     * @return EVALUATION_DATE - 评估日期时间（患者入院后接受护理评估结束时的公元纪年日期和时间的完整描述）
     */
    public String getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * 设置评估日期时间（患者入院后接受护理评估结束时的公元纪年日期和时间的完整描述）
     *
     * @param evaluationDate 评估日期时间（患者入院后接受护理评估结束时的公元纪年日期和时间的完整描述）
     */
    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate == null ? null : evaluationDate.trim();
    }

    /**
     * 获取责任护士签名（在已开展责任制护理的科室，负责本患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESP_NURSE_SIGNATURE - 责任护士签名（在已开展责任制护理的科室，负责本患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getRespNurseSignature() {
        return respNurseSignature;
    }

    /**
     * 设置责任护士签名（在已开展责任制护理的科室，负责本患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param respNurseSignature 责任护士签名（在已开展责任制护理的科室，负责本患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setRespNurseSignature(String respNurseSignature) {
        this.respNurseSignature = respNurseSignature == null ? null : respNurseSignature.trim();
    }

    /**
     * 获取接诊护士签名（负责患者入院接诊的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ACCEPT_NURSE_SIGNATURE - 接诊护士签名（负责患者入院接诊的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAcceptNurseSignature() {
        return acceptNurseSignature;
    }

    /**
     * 设置接诊护士签名（负责患者入院接诊的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param acceptNurseSignature 接诊护士签名（负责患者入院接诊的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAcceptNurseSignature(String acceptNurseSignature) {
        this.acceptNurseSignature = acceptNurseSignature == null ? null : acceptNurseSignature.trim();
    }

    /**
     * 获取签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return SIGNATURE_DATE - 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getSignatureDate() {
        return signatureDate;
    }

    /**
     * 设置签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param signatureDate 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate == null ? null : signatureDate.trim();
    }

    /**
     * 获取备注（需要添加的注释说明的具体内容）
     *
     * @return NOTES - 备注（需要添加的注释说明的具体内容）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注（需要添加的注释说明的具体内容）
     *
     * @param notes 备注（需要添加的注释说明的具体内容）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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
     * 获取评估报告ID（对应一次评估报告唯一ID）
     *
     * @return REPORT_ID - 评估报告ID（对应一次评估报告唯一ID）
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设置评估报告ID（对应一次评估报告唯一ID）
     *
     * @param reportId 评估报告ID（对应一次评估报告唯一ID）
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * @return IHUID
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * @param ihuid
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }
}