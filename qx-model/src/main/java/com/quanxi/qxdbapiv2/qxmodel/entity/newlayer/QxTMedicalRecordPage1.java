package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_PAGE1")
public class QxTMedicalRecordPage1 {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页唯一标识
     */
    @Id
    @Column(name = "MRPUID")
    private String mrpuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 医疗机构
     */
    @Column(name = "MEDICAL_INSTITUTIONS")
    private String medicalInstitutions;

    /**
     * 医疗付款方式
     */
    @Column(name = "MEDICAL_PAYMENT_METHOD")
    private String medicalPaymentMethod;

    /**
     * 卫生机构代码
     */
    @Column(name = "HEALTH_INSTITUTION")
    private String healthInstitution;

    /**
     * 健康卡号
     */
    @Column(name = "HEALTH_CARD_NO")
    private String healthCardNo;

    /**
     * 住院次数
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private String hospitaltalizationTimes;

    /**
     * 病案号
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 年龄
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

    /**
     * 出生日期
     */
    @Column(name = "BIRTH_DATE")
    private String birthDate;

    /**
     * 国籍
     */
    @Column(name = "COUNTRY_CN")
    private String countryCn;

    /**
     * 民族
     */
    @Column(name = "NATIONALITY_CN")
    private String nationalityCn;

    /**
     * 新生儿出生体重
     */
    @Column(name = "BIRTH_WEIGHT")
    private String birthWeight;

    /**
     * 新生儿入院体重
     */
    @Column(name = "BABY_INPATIENT_WEIGHT")
    private String babyInpatientWeight;

    /**
     * 出生地
     */
    @Column(name = "BIRTH_ADDR")
    private String birthAddr;

    /**
     * 籍贯
     */
    @Column(name = "NATIVE")
    private String ntive;

    /**
     * 身份证
     */
    @Column(name = "CREDENTIAL_NO")
    private String credentialNo;

    /**
     * 职业
     */
    @Column(name = "OCCUPATION_CN")
    private String occupationCn;

    /**
     * 婚姻
     */
    @Column(name = "MARRIAGE_CN")
    private String marriageCn;

    /**
     * 现住地
     */
    @Column(name = "PRESENT_ADDR")
    private String presentAddr;

    /**
     * 电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 现住地邮编
     */
    @Column(name = "PRESENT_ADDR_POSTAL_CODE")
    private String presentAddrPostalCode;

    /**
     * 户口地址
     */
    @Column(name = "REGISTER_ADDR")
    private String registerAddr;

    /**
     * 病人来源
     */
    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    /**
     * 户口地址邮编
     */
    @Column(name = "REGISTER_ADDR_POSTAL_CODE")
    private String registerAddrPostalCode;

    /**
     * 工作单位及地址
     */
    @Column(name = "EMPLOYER_NAME")
    private String employerName;

    /**
     * 单位电话
     */
    @Column(name = "EMPLOYER_TEL_NO")
    private String employerTelNo;

    /**
     * 工作单位及地址邮编
     */
    @Column(name = "EMPLOYER_POSTAL_CODE")
    private String employerPostalCode;

    /**
     * 联系人姓名
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人关系
     */
    @Column(name = "CONTACT_RELATION_CN")
    private String contactRelationCn;

    /**
     * 联系人地址
     */
    @Column(name = "CONTACT_ADDRESS")
    private String contactAddress;

    /**
     * 联系人电话
     */
    @Column(name = "CONTACT_TEL_NO")
    private String contactTelNo;

    /**
     * 入院途径
     */
    @Column(name = "INPATIENT_PATH_CN")
    private String inpatientPathCn;

    /**
     * 入院时情况
     */
    @Column(name = "IN_CONDITION_CN")
    private String inConditionCn;

    /**
     * 入院时间
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 入院科别
     */
    @Column(name = "INPATIENT_DEPT_CN")
    private String inpatientDeptCn;

    /**
     * 病房
     */
    @Column(name = "INPATIENT_ROOM_NO")
    private String inpatientRoomNo;

    /**
     * 转科
     */
    @Column(name = "MOVE_DEPT_CN")
    private String moveDeptCn;

    /**
     * 三级护理
     */
    @Column(name = "PROTECT_III")
    private String protectIii;

    /**
     * 二级护理
     */
    @Column(name = "PROTECT_II")
    private String protectIi;

    /**
     * 一级护理
     */
    @Column(name = "PROTECT_I")
    private String protectI;

    /**
     * 特级护理
     */
    @Column(name = "PROTECT_SPECIAL")
    private String protectSpecial;

    /**
     * 日常生活能力评定量表得分
     */
    @Column(name = "DAILY_LIFE_ABILITY_SCORE")
    private String dailyLifeAbilityScore;

    /**
     * 门（急）诊诊断深圳疾病术语名称
     */
    @Column(name = "DISEASE_TERMINOLOGY_CN")
    private String diseaseTerminologyCn;

    /**
     * 深圳疾病术语编码
     */
    @Column(name = "DISEASE_TERMINOLOGY_CODE")
    private String diseaseTerminologyCode;

    /**
     * 部位
     */
    @Column(name = "PART")
    private String part;

    /**
     * 属性
     */
    @Column(name = "ATTRIBUTES")
    private String attributes;

    /**
     * 门（急）诊诊断深圳术语诊断描述
     */
    @Column(name = "DIAGNOSTIC_DESCRIPTION")
    private String diagnosticDescription;

    /**
     * 门（急）诊诊断
     */
    @Column(name = "OUTPATIENT_DIAG_NAME")
    private String outpatientDiagName;

    /**
     * 疾病编码
     */
    @Column(name = "OUTPATIENT_DIAG_CODE")
    private String outpatientDiagCode;

    /**
     * 门（急）诊医生
     */
    @Column(name = "OUTPATIENT_DOCTOR")
    private String outpatientDoctor;

    /**
     * 病例分型
     */
    @Column(name = "CASE_CLASSIFICATION")
    private String caseClassification;

    /**
     * 临床路径病例
     */
    @Column(name = "CLINICAL_PATHWAY_CN")
    private String clinicalPathwayCn;

    /**
     * 抢救
     */
    @Column(name = "SAVE_TIMES")
    private String saveTimes;

    /**
     * 成功
     */
    @Column(name = "SAVE_SUCCESS_TIMES")
    private String saveSuccessTimes;

    /**
     * 损伤、中毒的外部原因
     */
    @Column(name = "DAMAGE_POISON_REASON")
    private String damagePoisonReason;

    /**
     * 疾病编码
     */
    @Column(name = "DAMAGE_POISON_CODE")
    private String damagePoisonCode;

    /**
     * 病理诊断
     */
    @Column(name = "PATHOLOGICAL_DIAGNOSIS")
    private String pathologicalDiagnosis;

    /**
     * 药物过敏
     */
    @Column(name = "DRUG_ALLERGY_MARK")
    private String drugAllergyMark;

    /**
     * 过敏药物
     */
    @Column(name = "DRUG_ALLERGENS_NAME")
    private String drugAllergensName;

    /**
     * 死亡患者尸检
     */
    @Column(name = "AUTOPSY_MARK")
    private String autopsyMark;

    /**
     * 血型
     */
    @Column(name = "ABO_CN")
    private String aboCn;

    /**
     * Rh
     */
    @Column(name = "RH_CN")
    private String rhCn;

    /**
     * 科主任
     */
    @Column(name = "DEPT_DIRECTOR_NAME")
    private String deptDirectorName;

    /**
     * 主（副主）任医师
     */
    @Column(name = "CHIEF_DOCTOR_NAME")
    private String chiefDoctorName;

    /**
     * 主治医师
     */
    @Column(name = "CHARGE_DOCTOR_NAME")
    private String chargeDoctorName;

    /**
     * 住院医师
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 责任护士
     */
    @Column(name = "RESP_NURSE_NAME")
    private String respNurseName;

    /**
     * 进修医生
     */
    @Column(name = "LEARNING_DOCTOR_NAME")
    private String learningDoctorName;

    /**
     * 实习医师
     */
    @Column(name = "INTERN_DOCTOR_NAME")
    private String internDoctorName;

    /**
     * 编码员
     */
    @Column(name = "CATALOGER_NAME")
    private String catalogerName;

    /**
     * 病案质量
     */
    @Column(name = "CASE_QUALITY_CN")
    private String caseQualityCn;

    /**
     * 质控医师
     */
    @Column(name = "QC_DOCTOR_NAME")
    private String qcDoctorName;

    /**
     * 质控护士
     */
    @Column(name = "QC_NURSE_NAME")
    private String qcNurseName;

    /**
     * 质控日期
     */
    @Column(name = "QC_DATE")
    private String qcDate;

    /**
     * 转科时间
     */
    @Column(name = "MOVE_DEPT_CN_DATE")
    private String moveDeptCnDate;

    /**
     * 门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "CLINIC2OUT_CN")
    private String clinic2outCn;

    /**
     * 入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     */
    @Column(name = "IN2OUT_CN")
    private String in2outCn;

    /**
     * 术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     */
    @Column(name = "PRE_OPER2OPER_CN")
    private String preOper2operCn;

    /**
     * 放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "RADIATION2OPER_CN")
    private String radiation2operCn;

    /**
     * 临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "CLINIC2PATHOLOGY_CN")
    private String clinic2pathologyCn;

    /**
     * 放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "RADIATION2PATHOLOGY_CN")
    private String radiation2pathologyCn;

    /**
     * 临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     */
    @Column(name = "CLINIC2AUTOPSY_CN")
    private String clinic2autopsyCn;

    /**
     * 实际住院天数
     */
    @Column(name = "ACTUAL_IN_DAYS")
    private String actualInDays;

    /**
     * 出院日期
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 出院时间
     */
    @Column(name = "DISCHARGE_TIME")
    private String dischargeTime;

    /**
     * 是否无效
     */
    @Column(name = "IS_INVALID")
    private Short isInvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "IS_DEL")
    private Short isDel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 获取序列号
     *
     * @return SID - 序列号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置序列号
     *
     * @param sid 序列号
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取病案首页唯一标识
     *
     * @return MRPUID - 病案首页唯一标识
     */
    public String getMrpuid() {
        return mrpuid;
    }

    /**
     * 设置病案首页唯一标识
     *
     * @param mrpuid 病案首页唯一标识
     */
    public void setMrpuid(String mrpuid) {
        this.mrpuid = mrpuid == null ? null : mrpuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取机构唯一标识
     *
     * @return ORGUID - 机构唯一标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构唯一标识
     *
     * @param orguid 机构唯一标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取医疗机构
     *
     * @return MEDICAL_INSTITUTIONS - 医疗机构
     */
    public String getMedicalInstitutions() {
        return medicalInstitutions;
    }

    /**
     * 设置医疗机构
     *
     * @param medicalInstitutions 医疗机构
     */
    public void setMedicalInstitutions(String medicalInstitutions) {
        this.medicalInstitutions = medicalInstitutions == null ? null : medicalInstitutions.trim();
    }

    /**
     * 获取医疗付款方式
     *
     * @return MEDICAL_PAYMENT_METHOD - 医疗付款方式
     */
    public String getMedicalPaymentMethod() {
        return medicalPaymentMethod;
    }

    /**
     * 设置医疗付款方式
     *
     * @param medicalPaymentMethod 医疗付款方式
     */
    public void setMedicalPaymentMethod(String medicalPaymentMethod) {
        this.medicalPaymentMethod = medicalPaymentMethod == null ? null : medicalPaymentMethod.trim();
    }

    /**
     * 获取卫生机构代码
     *
     * @return HEALTH_INSTITUTION - 卫生机构代码
     */
    public String getHealthInstitution() {
        return healthInstitution;
    }

    /**
     * 设置卫生机构代码
     *
     * @param healthInstitution 卫生机构代码
     */
    public void setHealthInstitution(String healthInstitution) {
        this.healthInstitution = healthInstitution == null ? null : healthInstitution.trim();
    }

    /**
     * 获取健康卡号
     *
     * @return HEALTH_CARD_NO - 健康卡号
     */
    public String getHealthCardNo() {
        return healthCardNo;
    }

    /**
     * 设置健康卡号
     *
     * @param healthCardNo 健康卡号
     */
    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo == null ? null : healthCardNo.trim();
    }

    /**
     * 获取住院次数
     *
     * @return HOSPITALTALIZATION_TIMES - 住院次数
     */
    public String getHospitaltalizationTimes() {
        return hospitaltalizationTimes;
    }

    /**
     * 设置住院次数
     *
     * @param hospitaltalizationTimes 住院次数
     */
    public void setHospitaltalizationTimes(String hospitaltalizationTimes) {
        this.hospitaltalizationTimes = hospitaltalizationTimes == null ? null : hospitaltalizationTimes.trim();
    }

    /**
     * 获取病案号
     *
     * @return CASE_NO - 病案号
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号
     *
     * @param caseNo 病案号
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别
     *
     * @return SEX_CN - 性别
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别
     *
     * @param sexCn 性别
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取年龄
     *
     * @return AGE_YEAR - 年龄
     */
    public String getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄
     *
     * @param ageYear 年龄
     */
    public void setAgeYear(String ageYear) {
        this.ageYear = ageYear == null ? null : ageYear.trim();
    }

    /**
     * 获取出生日期
     *
     * @return BIRTH_DATE - 出生日期
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期
     *
     * @param birthDate 出生日期
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    /**
     * 获取国籍
     *
     * @return COUNTRY_CN - 国籍
     */
    public String getCountryCn() {
        return countryCn;
    }

    /**
     * 设置国籍
     *
     * @param countryCn 国籍
     */
    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    /**
     * 获取民族
     *
     * @return NATIONALITY_CN - 民族
     */
    public String getNationalityCn() {
        return nationalityCn;
    }

    /**
     * 设置民族
     *
     * @param nationalityCn 民族
     */
    public void setNationalityCn(String nationalityCn) {
        this.nationalityCn = nationalityCn == null ? null : nationalityCn.trim();
    }

    /**
     * 获取新生儿出生体重
     *
     * @return BIRTH_WEIGHT - 新生儿出生体重
     */
    public String getBirthWeight() {
        return birthWeight;
    }

    /**
     * 设置新生儿出生体重
     *
     * @param birthWeight 新生儿出生体重
     */
    public void setBirthWeight(String birthWeight) {
        this.birthWeight = birthWeight == null ? null : birthWeight.trim();
    }

    /**
     * 获取新生儿入院体重
     *
     * @return BABY_INPATIENT_WEIGHT - 新生儿入院体重
     */
    public String getBabyInpatientWeight() {
        return babyInpatientWeight;
    }

    /**
     * 设置新生儿入院体重
     *
     * @param babyInpatientWeight 新生儿入院体重
     */
    public void setBabyInpatientWeight(String babyInpatientWeight) {
        this.babyInpatientWeight = babyInpatientWeight == null ? null : babyInpatientWeight.trim();
    }

    /**
     * 获取出生地
     *
     * @return BIRTH_ADDR - 出生地
     */
    public String getBirthAddr() {
        return birthAddr;
    }

    /**
     * 设置出生地
     *
     * @param birthAddr 出生地
     */
    public void setBirthAddr(String birthAddr) {
        this.birthAddr = birthAddr == null ? null : birthAddr.trim();
    }

    /**
     * 获取籍贯
     *
     * @return NATIVE - 籍贯
     */
    public String getNative() {
        return ntive;
    }

    /**
     * 设置籍贯
     *
     * @param ntive 籍贯
     */
    public void setNative(String ntive) {
        this.ntive = ntive == null ? null : ntive.trim();
    }

    /**
     * 获取身份证
     *
     * @return CREDENTIAL_NO - 身份证
     */
    public String getCredentialNo() {
        return credentialNo;
    }

    /**
     * 设置身份证
     *
     * @param credentialNo 身份证
     */
    public void setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo == null ? null : credentialNo.trim();
    }

    /**
     * 获取职业
     *
     * @return OCCUPATION_CN - 职业
     */
    public String getOccupationCn() {
        return occupationCn;
    }

    /**
     * 设置职业
     *
     * @param occupationCn 职业
     */
    public void setOccupationCn(String occupationCn) {
        this.occupationCn = occupationCn == null ? null : occupationCn.trim();
    }

    /**
     * 获取婚姻
     *
     * @return MARRIAGE_CN - 婚姻
     */
    public String getMarriageCn() {
        return marriageCn;
    }

    /**
     * 设置婚姻
     *
     * @param marriageCn 婚姻
     */
    public void setMarriageCn(String marriageCn) {
        this.marriageCn = marriageCn == null ? null : marriageCn.trim();
    }

    /**
     * 获取现住地
     *
     * @return PRESENT_ADDR - 现住地
     */
    public String getPresentAddr() {
        return presentAddr;
    }

    /**
     * 设置现住地
     *
     * @param presentAddr 现住地
     */
    public void setPresentAddr(String presentAddr) {
        this.presentAddr = presentAddr == null ? null : presentAddr.trim();
    }

    /**
     * 获取电话
     *
     * @return PHONE - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取现住地邮编
     *
     * @return PRESENT_ADDR_POSTAL_CODE - 现住地邮编
     */
    public String getPresentAddrPostalCode() {
        return presentAddrPostalCode;
    }

    /**
     * 设置现住地邮编
     *
     * @param presentAddrPostalCode 现住地邮编
     */
    public void setPresentAddrPostalCode(String presentAddrPostalCode) {
        this.presentAddrPostalCode = presentAddrPostalCode == null ? null : presentAddrPostalCode.trim();
    }

    /**
     * 获取户口地址
     *
     * @return REGISTER_ADDR - 户口地址
     */
    public String getRegisterAddr() {
        return registerAddr;
    }

    /**
     * 设置户口地址
     *
     * @param registerAddr 户口地址
     */
    public void setRegisterAddr(String registerAddr) {
        this.registerAddr = registerAddr == null ? null : registerAddr.trim();
    }

    /**
     * 获取病人来源
     *
     * @return PATIENT_SOURCE - 病人来源
     */
    public String getPatientSource() {
        return patientSource;
    }

    /**
     * 设置病人来源
     *
     * @param patientSource 病人来源
     */
    public void setPatientSource(String patientSource) {
        this.patientSource = patientSource == null ? null : patientSource.trim();
    }

    /**
     * 获取户口地址邮编
     *
     * @return REGISTER_ADDR_POSTAL_CODE - 户口地址邮编
     */
    public String getRegisterAddrPostalCode() {
        return registerAddrPostalCode;
    }

    /**
     * 设置户口地址邮编
     *
     * @param registerAddrPostalCode 户口地址邮编
     */
    public void setRegisterAddrPostalCode(String registerAddrPostalCode) {
        this.registerAddrPostalCode = registerAddrPostalCode == null ? null : registerAddrPostalCode.trim();
    }

    /**
     * 获取工作单位及地址
     *
     * @return EMPLOYER_NAME - 工作单位及地址
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * 设置工作单位及地址
     *
     * @param employerName 工作单位及地址
     */
    public void setEmployerName(String employerName) {
        this.employerName = employerName == null ? null : employerName.trim();
    }

    /**
     * 获取单位电话
     *
     * @return EMPLOYER_TEL_NO - 单位电话
     */
    public String getEmployerTelNo() {
        return employerTelNo;
    }

    /**
     * 设置单位电话
     *
     * @param employerTelNo 单位电话
     */
    public void setEmployerTelNo(String employerTelNo) {
        this.employerTelNo = employerTelNo == null ? null : employerTelNo.trim();
    }

    /**
     * 获取工作单位及地址邮编
     *
     * @return EMPLOYER_POSTAL_CODE - 工作单位及地址邮编
     */
    public String getEmployerPostalCode() {
        return employerPostalCode;
    }

    /**
     * 设置工作单位及地址邮编
     *
     * @param employerPostalCode 工作单位及地址邮编
     */
    public void setEmployerPostalCode(String employerPostalCode) {
        this.employerPostalCode = employerPostalCode == null ? null : employerPostalCode.trim();
    }

    /**
     * 获取联系人姓名
     *
     * @return CONTACT_NAME - 联系人姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名
     *
     * @param contactName 联系人姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人关系
     *
     * @return CONTACT_RELATION_CN - 联系人关系
     */
    public String getContactRelationCn() {
        return contactRelationCn;
    }

    /**
     * 设置联系人关系
     *
     * @param contactRelationCn 联系人关系
     */
    public void setContactRelationCn(String contactRelationCn) {
        this.contactRelationCn = contactRelationCn == null ? null : contactRelationCn.trim();
    }

    /**
     * 获取联系人地址
     *
     * @return CONTACT_ADDRESS - 联系人地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置联系人地址
     *
     * @param contactAddress 联系人地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 获取联系人电话
     *
     * @return CONTACT_TEL_NO - 联系人电话
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * 设置联系人电话
     *
     * @param contactTelNo 联系人电话
     */
    public void setContactTelNo(String contactTelNo) {
        this.contactTelNo = contactTelNo == null ? null : contactTelNo.trim();
    }

    /**
     * 获取入院途径
     *
     * @return INPATIENT_PATH_CN - 入院途径
     */
    public String getInpatientPathCn() {
        return inpatientPathCn;
    }

    /**
     * 设置入院途径
     *
     * @param inpatientPathCn 入院途径
     */
    public void setInpatientPathCn(String inpatientPathCn) {
        this.inpatientPathCn = inpatientPathCn == null ? null : inpatientPathCn.trim();
    }

    /**
     * 获取入院时情况
     *
     * @return IN_CONDITION_CN - 入院时情况
     */
    public String getInConditionCn() {
        return inConditionCn;
    }

    /**
     * 设置入院时情况
     *
     * @param inConditionCn 入院时情况
     */
    public void setInConditionCn(String inConditionCn) {
        this.inConditionCn = inConditionCn == null ? null : inConditionCn.trim();
    }

    /**
     * 获取入院时间
     *
     * @return ADMISSION_DATE - 入院时间
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院时间
     *
     * @param admissionDate 入院时间
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取入院科别
     *
     * @return INPATIENT_DEPT_CN - 入院科别
     */
    public String getInpatientDeptCn() {
        return inpatientDeptCn;
    }

    /**
     * 设置入院科别
     *
     * @param inpatientDeptCn 入院科别
     */
    public void setInpatientDeptCn(String inpatientDeptCn) {
        this.inpatientDeptCn = inpatientDeptCn == null ? null : inpatientDeptCn.trim();
    }

    /**
     * 获取病房
     *
     * @return INPATIENT_ROOM_NO - 病房
     */
    public String getInpatientRoomNo() {
        return inpatientRoomNo;
    }

    /**
     * 设置病房
     *
     * @param inpatientRoomNo 病房
     */
    public void setInpatientRoomNo(String inpatientRoomNo) {
        this.inpatientRoomNo = inpatientRoomNo == null ? null : inpatientRoomNo.trim();
    }

    /**
     * 获取转科
     *
     * @return MOVE_DEPT_CN - 转科
     */
    public String getMoveDeptCn() {
        return moveDeptCn;
    }

    /**
     * 设置转科
     *
     * @param moveDeptCn 转科
     */
    public void setMoveDeptCn(String moveDeptCn) {
        this.moveDeptCn = moveDeptCn == null ? null : moveDeptCn.trim();
    }

    /**
     * 获取三级护理
     *
     * @return PROTECT_III - 三级护理
     */
    public String getProtectIii() {
        return protectIii;
    }

    /**
     * 设置三级护理
     *
     * @param protectIii 三级护理
     */
    public void setProtectIii(String protectIii) {
        this.protectIii = protectIii == null ? null : protectIii.trim();
    }

    /**
     * 获取二级护理
     *
     * @return PROTECT_II - 二级护理
     */
    public String getProtectIi() {
        return protectIi;
    }

    /**
     * 设置二级护理
     *
     * @param protectIi 二级护理
     */
    public void setProtectIi(String protectIi) {
        this.protectIi = protectIi == null ? null : protectIi.trim();
    }

    /**
     * 获取一级护理
     *
     * @return PROTECT_I - 一级护理
     */
    public String getProtectI() {
        return protectI;
    }

    /**
     * 设置一级护理
     *
     * @param protectI 一级护理
     */
    public void setProtectI(String protectI) {
        this.protectI = protectI == null ? null : protectI.trim();
    }

    /**
     * 获取特级护理
     *
     * @return PROTECT_SPECIAL - 特级护理
     */
    public String getProtectSpecial() {
        return protectSpecial;
    }

    /**
     * 设置特级护理
     *
     * @param protectSpecial 特级护理
     */
    public void setProtectSpecial(String protectSpecial) {
        this.protectSpecial = protectSpecial == null ? null : protectSpecial.trim();
    }

    /**
     * 获取日常生活能力评定量表得分
     *
     * @return DAILY_LIFE_ABILITY_SCORE - 日常生活能力评定量表得分
     */
    public String getDailyLifeAbilityScore() {
        return dailyLifeAbilityScore;
    }

    /**
     * 设置日常生活能力评定量表得分
     *
     * @param dailyLifeAbilityScore 日常生活能力评定量表得分
     */
    public void setDailyLifeAbilityScore(String dailyLifeAbilityScore) {
        this.dailyLifeAbilityScore = dailyLifeAbilityScore == null ? null : dailyLifeAbilityScore.trim();
    }

    /**
     * 获取门（急）诊诊断深圳疾病术语名称
     *
     * @return DISEASE_TERMINOLOGY_CN - 门（急）诊诊断深圳疾病术语名称
     */
    public String getDiseaseTerminologyCn() {
        return diseaseTerminologyCn;
    }

    /**
     * 设置门（急）诊诊断深圳疾病术语名称
     *
     * @param diseaseTerminologyCn 门（急）诊诊断深圳疾病术语名称
     */
    public void setDiseaseTerminologyCn(String diseaseTerminologyCn) {
        this.diseaseTerminologyCn = diseaseTerminologyCn == null ? null : diseaseTerminologyCn.trim();
    }

    /**
     * 获取深圳疾病术语编码
     *
     * @return DISEASE_TERMINOLOGY_CODE - 深圳疾病术语编码
     */
    public String getDiseaseTerminologyCode() {
        return diseaseTerminologyCode;
    }

    /**
     * 设置深圳疾病术语编码
     *
     * @param diseaseTerminologyCode 深圳疾病术语编码
     */
    public void setDiseaseTerminologyCode(String diseaseTerminologyCode) {
        this.diseaseTerminologyCode = diseaseTerminologyCode == null ? null : diseaseTerminologyCode.trim();
    }

    /**
     * 获取部位
     *
     * @return PART - 部位
     */
    public String getPart() {
        return part;
    }

    /**
     * 设置部位
     *
     * @param part 部位
     */
    public void setPart(String part) {
        this.part = part == null ? null : part.trim();
    }

    /**
     * 获取属性
     *
     * @return ATTRIBUTES - 属性
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * 设置属性
     *
     * @param attributes 属性
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    /**
     * 获取门（急）诊诊断深圳术语诊断描述
     *
     * @return DIAGNOSTIC_DESCRIPTION - 门（急）诊诊断深圳术语诊断描述
     */
    public String getDiagnosticDescription() {
        return diagnosticDescription;
    }

    /**
     * 设置门（急）诊诊断深圳术语诊断描述
     *
     * @param diagnosticDescription 门（急）诊诊断深圳术语诊断描述
     */
    public void setDiagnosticDescription(String diagnosticDescription) {
        this.diagnosticDescription = diagnosticDescription == null ? null : diagnosticDescription.trim();
    }

    /**
     * 获取门（急）诊诊断
     *
     * @return OUTPATIENT_DIAG_NAME - 门（急）诊诊断
     */
    public String getOutpatientDiagName() {
        return outpatientDiagName;
    }

    /**
     * 设置门（急）诊诊断
     *
     * @param outpatientDiagName 门（急）诊诊断
     */
    public void setOutpatientDiagName(String outpatientDiagName) {
        this.outpatientDiagName = outpatientDiagName == null ? null : outpatientDiagName.trim();
    }

    /**
     * 获取疾病编码
     *
     * @return OUTPATIENT_DIAG_CODE - 疾病编码
     */
    public String getOutpatientDiagCode() {
        return outpatientDiagCode;
    }

    /**
     * 设置疾病编码
     *
     * @param outpatientDiagCode 疾病编码
     */
    public void setOutpatientDiagCode(String outpatientDiagCode) {
        this.outpatientDiagCode = outpatientDiagCode == null ? null : outpatientDiagCode.trim();
    }

    /**
     * 获取门（急）诊医生
     *
     * @return OUTPATIENT_DOCTOR - 门（急）诊医生
     */
    public String getOutpatientDoctor() {
        return outpatientDoctor;
    }

    /**
     * 设置门（急）诊医生
     *
     * @param outpatientDoctor 门（急）诊医生
     */
    public void setOutpatientDoctor(String outpatientDoctor) {
        this.outpatientDoctor = outpatientDoctor == null ? null : outpatientDoctor.trim();
    }

    /**
     * 获取病例分型
     *
     * @return CASE_CLASSIFICATION - 病例分型
     */
    public String getCaseClassification() {
        return caseClassification;
    }

    /**
     * 设置病例分型
     *
     * @param caseClassification 病例分型
     */
    public void setCaseClassification(String caseClassification) {
        this.caseClassification = caseClassification == null ? null : caseClassification.trim();
    }

    /**
     * 获取临床路径病例
     *
     * @return CLINICAL_PATHWAY_CN - 临床路径病例
     */
    public String getClinicalPathwayCn() {
        return clinicalPathwayCn;
    }

    /**
     * 设置临床路径病例
     *
     * @param clinicalPathwayCn 临床路径病例
     */
    public void setClinicalPathwayCn(String clinicalPathwayCn) {
        this.clinicalPathwayCn = clinicalPathwayCn == null ? null : clinicalPathwayCn.trim();
    }

    /**
     * 获取抢救
     *
     * @return SAVE_TIMES - 抢救
     */
    public String getSaveTimes() {
        return saveTimes;
    }

    /**
     * 设置抢救
     *
     * @param saveTimes 抢救
     */
    public void setSaveTimes(String saveTimes) {
        this.saveTimes = saveTimes == null ? null : saveTimes.trim();
    }

    /**
     * 获取成功
     *
     * @return SAVE_SUCCESS_TIMES - 成功
     */
    public String getSaveSuccessTimes() {
        return saveSuccessTimes;
    }

    /**
     * 设置成功
     *
     * @param saveSuccessTimes 成功
     */
    public void setSaveSuccessTimes(String saveSuccessTimes) {
        this.saveSuccessTimes = saveSuccessTimes == null ? null : saveSuccessTimes.trim();
    }

    /**
     * 获取损伤、中毒的外部原因
     *
     * @return DAMAGE_POISON_REASON - 损伤、中毒的外部原因
     */
    public String getDamagePoisonReason() {
        return damagePoisonReason;
    }

    /**
     * 设置损伤、中毒的外部原因
     *
     * @param damagePoisonReason 损伤、中毒的外部原因
     */
    public void setDamagePoisonReason(String damagePoisonReason) {
        this.damagePoisonReason = damagePoisonReason == null ? null : damagePoisonReason.trim();
    }

    /**
     * 获取疾病编码
     *
     * @return DAMAGE_POISON_CODE - 疾病编码
     */
    public String getDamagePoisonCode() {
        return damagePoisonCode;
    }

    /**
     * 设置疾病编码
     *
     * @param damagePoisonCode 疾病编码
     */
    public void setDamagePoisonCode(String damagePoisonCode) {
        this.damagePoisonCode = damagePoisonCode == null ? null : damagePoisonCode.trim();
    }

    /**
     * 获取病理诊断
     *
     * @return PATHOLOGICAL_DIAGNOSIS - 病理诊断
     */
    public String getPathologicalDiagnosis() {
        return pathologicalDiagnosis;
    }

    /**
     * 设置病理诊断
     *
     * @param pathologicalDiagnosis 病理诊断
     */
    public void setPathologicalDiagnosis(String pathologicalDiagnosis) {
        this.pathologicalDiagnosis = pathologicalDiagnosis == null ? null : pathologicalDiagnosis.trim();
    }

    /**
     * 获取药物过敏
     *
     * @return DRUG_ALLERGY_MARK - 药物过敏
     */
    public String getDrugAllergyMark() {
        return drugAllergyMark;
    }

    /**
     * 设置药物过敏
     *
     * @param drugAllergyMark 药物过敏
     */
    public void setDrugAllergyMark(String drugAllergyMark) {
        this.drugAllergyMark = drugAllergyMark == null ? null : drugAllergyMark.trim();
    }

    /**
     * 获取过敏药物
     *
     * @return DRUG_ALLERGENS_NAME - 过敏药物
     */
    public String getDrugAllergensName() {
        return drugAllergensName;
    }

    /**
     * 设置过敏药物
     *
     * @param drugAllergensName 过敏药物
     */
    public void setDrugAllergensName(String drugAllergensName) {
        this.drugAllergensName = drugAllergensName == null ? null : drugAllergensName.trim();
    }

    /**
     * 获取死亡患者尸检
     *
     * @return AUTOPSY_MARK - 死亡患者尸检
     */
    public String getAutopsyMark() {
        return autopsyMark;
    }

    /**
     * 设置死亡患者尸检
     *
     * @param autopsyMark 死亡患者尸检
     */
    public void setAutopsyMark(String autopsyMark) {
        this.autopsyMark = autopsyMark == null ? null : autopsyMark.trim();
    }

    /**
     * 获取血型
     *
     * @return ABO_CN - 血型
     */
    public String getAboCn() {
        return aboCn;
    }

    /**
     * 设置血型
     *
     * @param aboCn 血型
     */
    public void setAboCn(String aboCn) {
        this.aboCn = aboCn == null ? null : aboCn.trim();
    }

    /**
     * 获取Rh
     *
     * @return RH_CN - Rh
     */
    public String getRhCn() {
        return rhCn;
    }

    /**
     * 设置Rh
     *
     * @param rhCn Rh
     */
    public void setRhCn(String rhCn) {
        this.rhCn = rhCn == null ? null : rhCn.trim();
    }

    /**
     * 获取科主任
     *
     * @return DEPT_DIRECTOR_NAME - 科主任
     */
    public String getDeptDirectorName() {
        return deptDirectorName;
    }

    /**
     * 设置科主任
     *
     * @param deptDirectorName 科主任
     */
    public void setDeptDirectorName(String deptDirectorName) {
        this.deptDirectorName = deptDirectorName == null ? null : deptDirectorName.trim();
    }

    /**
     * 获取主（副主）任医师
     *
     * @return CHIEF_DOCTOR_NAME - 主（副主）任医师
     */
    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    /**
     * 设置主（副主）任医师
     *
     * @param chiefDoctorName 主（副主）任医师
     */
    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
    }

    /**
     * 获取主治医师
     *
     * @return CHARGE_DOCTOR_NAME - 主治医师
     */
    public String getChargeDoctorName() {
        return chargeDoctorName;
    }

    /**
     * 设置主治医师
     *
     * @param chargeDoctorName 主治医师
     */
    public void setChargeDoctorName(String chargeDoctorName) {
        this.chargeDoctorName = chargeDoctorName == null ? null : chargeDoctorName.trim();
    }

    /**
     * 获取住院医师
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师
     *
     * @param residentDoctorName 住院医师
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取责任护士
     *
     * @return RESP_NURSE_NAME - 责任护士
     */
    public String getRespNurseName() {
        return respNurseName;
    }

    /**
     * 设置责任护士
     *
     * @param respNurseName 责任护士
     */
    public void setRespNurseName(String respNurseName) {
        this.respNurseName = respNurseName == null ? null : respNurseName.trim();
    }

    /**
     * 获取进修医生
     *
     * @return LEARNING_DOCTOR_NAME - 进修医生
     */
    public String getLearningDoctorName() {
        return learningDoctorName;
    }

    /**
     * 设置进修医生
     *
     * @param learningDoctorName 进修医生
     */
    public void setLearningDoctorName(String learningDoctorName) {
        this.learningDoctorName = learningDoctorName == null ? null : learningDoctorName.trim();
    }

    /**
     * 获取实习医师
     *
     * @return INTERN_DOCTOR_NAME - 实习医师
     */
    public String getInternDoctorName() {
        return internDoctorName;
    }

    /**
     * 设置实习医师
     *
     * @param internDoctorName 实习医师
     */
    public void setInternDoctorName(String internDoctorName) {
        this.internDoctorName = internDoctorName == null ? null : internDoctorName.trim();
    }

    /**
     * 获取编码员
     *
     * @return CATALOGER_NAME - 编码员
     */
    public String getCatalogerName() {
        return catalogerName;
    }

    /**
     * 设置编码员
     *
     * @param catalogerName 编码员
     */
    public void setCatalogerName(String catalogerName) {
        this.catalogerName = catalogerName == null ? null : catalogerName.trim();
    }

    /**
     * 获取病案质量
     *
     * @return CASE_QUALITY_CN - 病案质量
     */
    public String getCaseQualityCn() {
        return caseQualityCn;
    }

    /**
     * 设置病案质量
     *
     * @param caseQualityCn 病案质量
     */
    public void setCaseQualityCn(String caseQualityCn) {
        this.caseQualityCn = caseQualityCn == null ? null : caseQualityCn.trim();
    }

    /**
     * 获取质控医师
     *
     * @return QC_DOCTOR_NAME - 质控医师
     */
    public String getQcDoctorName() {
        return qcDoctorName;
    }

    /**
     * 设置质控医师
     *
     * @param qcDoctorName 质控医师
     */
    public void setQcDoctorName(String qcDoctorName) {
        this.qcDoctorName = qcDoctorName == null ? null : qcDoctorName.trim();
    }

    /**
     * 获取质控护士
     *
     * @return QC_NURSE_NAME - 质控护士
     */
    public String getQcNurseName() {
        return qcNurseName;
    }

    /**
     * 设置质控护士
     *
     * @param qcNurseName 质控护士
     */
    public void setQcNurseName(String qcNurseName) {
        this.qcNurseName = qcNurseName == null ? null : qcNurseName.trim();
    }

    /**
     * 获取质控日期
     *
     * @return QC_DATE - 质控日期
     */
    public String getQcDate() {
        return qcDate;
    }

    /**
     * 设置质控日期
     *
     * @param qcDate 质控日期
     */
    public void setQcDate(String qcDate) {
        this.qcDate = qcDate == null ? null : qcDate.trim();
    }

    /**
     * 获取转科时间
     *
     * @return MOVE_DEPT_CN_DATE - 转科时间
     */
    public String getMoveDeptCnDate() {
        return moveDeptCnDate;
    }

    /**
     * 设置转科时间
     *
     * @param moveDeptCnDate 转科时间
     */
    public void setMoveDeptCnDate(String moveDeptCnDate) {
        this.moveDeptCnDate = moveDeptCnDate == null ? null : moveDeptCnDate.trim();
    }

    /**
     * 获取门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @return CLINIC2OUT_CN - 门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     */
    public String getClinic2outCn() {
        return clinic2outCn;
    }

    /**
     * 设置门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @param clinic2outCn 门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     */
    public void setClinic2outCn(String clinic2outCn) {
        this.clinic2outCn = clinic2outCn == null ? null : clinic2outCn.trim();
    }

    /**
     * 获取入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     *
     * @return IN2OUT_CN - 入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     */
    public String getIn2outCn() {
        return in2outCn;
    }

    /**
     * 设置入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     *
     * @param in2outCn 入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     */
    public void setIn2outCn(String in2outCn) {
        this.in2outCn = in2outCn == null ? null : in2outCn.trim();
    }

    /**
     * 获取术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     *
     * @return PRE_OPER2OPER_CN - 术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     */
    public String getPreOper2operCn() {
        return preOper2operCn;
    }

    /**
     * 设置术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     *
     * @param preOper2operCn 术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     */
    public void setPreOper2operCn(String preOper2operCn) {
        this.preOper2operCn = preOper2operCn == null ? null : preOper2operCn.trim();
    }

    /**
     * 获取放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @return RADIATION2OPER_CN - 放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     */
    public String getRadiation2operCn() {
        return radiation2operCn;
    }

    /**
     * 设置放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @param radiation2operCn 放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     */
    public void setRadiation2operCn(String radiation2operCn) {
        this.radiation2operCn = radiation2operCn == null ? null : radiation2operCn.trim();
    }

    /**
     * 获取临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @return CLINIC2PATHOLOGY_CN - 临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    public String getClinic2pathologyCn() {
        return clinic2pathologyCn;
    }

    /**
     * 设置临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @param clinic2pathologyCn 临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    public void setClinic2pathologyCn(String clinic2pathologyCn) {
        this.clinic2pathologyCn = clinic2pathologyCn == null ? null : clinic2pathologyCn.trim();
    }

    /**
     * 获取放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @return RADIATION2PATHOLOGY_CN - 放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    public String getRadiation2pathologyCn() {
        return radiation2pathologyCn;
    }

    /**
     * 设置放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     *
     * @param radiation2pathologyCn 放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    public void setRadiation2pathologyCn(String radiation2pathologyCn) {
        this.radiation2pathologyCn = radiation2pathologyCn == null ? null : radiation2pathologyCn.trim();
    }

    /**
     * 获取临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     *
     * @return CLINIC2AUTOPSY_CN - 临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     */
    public String getClinic2autopsyCn() {
        return clinic2autopsyCn;
    }

    /**
     * 设置临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     *
     * @param clinic2autopsyCn 临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     */
    public void setClinic2autopsyCn(String clinic2autopsyCn) {
        this.clinic2autopsyCn = clinic2autopsyCn == null ? null : clinic2autopsyCn.trim();
    }

    /**
     * 获取实际住院天数
     *
     * @return ACTUAL_IN_DAYS - 实际住院天数
     */
    public String getActualInDays() {
        return actualInDays;
    }

    /**
     * 设置实际住院天数
     *
     * @param actualInDays 实际住院天数
     */
    public void setActualInDays(String actualInDays) {
        this.actualInDays = actualInDays == null ? null : actualInDays.trim();
    }

    /**
     * 获取出院日期
     *
     * @return DISCHARGE_DATE - 出院日期
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院日期
     *
     * @param dischargeDate 出院日期
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取出院时间
     *
     * @return DISCHARGE_TIME - 出院时间
     */
    public String getDischargeTime() {
        return dischargeTime;
    }

    /**
     * 设置出院时间
     *
     * @param dischargeTime 出院时间
     */
    public void setDischargeTime(String dischargeTime) {
        this.dischargeTime = dischargeTime == null ? null : dischargeTime.trim();
    }

    /**
     * 获取是否无效
     *
     * @return IS_INVALID - 是否无效
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isInvalid 是否无效
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return IS_DEL - 是否逻辑删除
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isDel 是否逻辑删除
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}