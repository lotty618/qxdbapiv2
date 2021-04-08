package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_HOME")
public class QxTMedicalRecordHome {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页解析唯一标识
     */
    @Id
    @Column(name = "MRHUID")
    private String mrhuid;

    /**
     * 住院id
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人id
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 机构id
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院次数
     */
    @Column(name = "INHOS_TIMES")
    private String inhosTimes;

    /**
     * 病案号
     */
    @Column(name = "MEDICAL_NO")
    private String medicalNo;

    /**
     * 入院日期
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 入院科室
     */
    @Column(name = "ADMISSION_DEPT")
    private String admissionDept;

    /**
     * 出院日期
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 出院科室
     */
    @Column(name = "DISCHARGE_DEPT")
    private String dischargeDept;

    /**
     * 主治医师
     */
    @Column(name = "MAIN_DOCTOR")
    private String mainDoctor;

    /**
     * 住院医师
     */
    @Column(name = "INHOS_DOCTOR")
    private String inhosDoctor;

    /**
     * 机构名称
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 健康卡号
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 病人姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 病人性别
     */
    @Column(name = "GENDER")
    private String gender;

    /**
     * 病人出生日期
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 病人年龄
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 病人国籍
     */
    @Column(name = "COUNTRY")
    private String country;

    /**
     * 病人民族
     */
    @Column(name = "ETHNIC")
    private String ethnic;

    /**
     * 病人身份证件号码
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 病人职业
     */
    @Column(name = "OCCUPATION")
    private String occupation;

    /**
     * 病人婚姻状况
     */
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    /**
     * 病人工作单位及地址
     */
    @Column(name = "EMPLOYER_ORG")
    private String employerOrg;

    /**
     * 病人工作单位电话
     */
    @Column(name = "EMPLOYER_ORG_TEL")
    private String employerOrgTel;

    /**
     * 联系人
     */
    @Column(name = "CONTACT")
    private String contact;

    /**
     * 病人与联系人的关系
     */
    @Column(name = "CONTACT_RELATION")
    private String contactRelation;

    /**
     * 联系人电话
     */
    @Column(name = "CONTACT_TEL")
    private String contactTel;

    /**
     * abo血型
     */
    @Column(name = "ABO_BLOOD")
    private String aboBlood;

    /**
     * rh血型
     */
    @Column(name = "RH_BLOOD")
    private String rhBlood;

    /**
     * 入院途径
     */
    @Column(name = "INHOS_PATH")
    private String inhosPath;

    /**
     * 门（急）诊诊断
     */
    @Column(name = "DIAG_NAME")
    private String diagName;

    /**
     * 门（急）诊诊断疾病编码
     */
    @Column(name = "DIAG_CODE")
    private String diagCode;

    /**
     * 手术日期
     */
    @Column(name = "OPERATION_DATE")
    private String operationDate;

    /**
     * 手术级别
     */
    @Column(name = "OPERATION_LEVEL")
    private String operationLevel;

    /**
     * 手术手术操作级别及名称
     */
    @Column(name = "OPERATION_CN")
    private String operationCn;

    /**
     * 主要手术及操作医师（术者）
     */
    @Column(name = "SURGEON_NAME")
    private String surgeonName;

    /**
     * 手术助手1
     */
    @Column(name = "SURGICAL_ASSISTANT1")
    private String surgicalAssistant1;

    /**
     * 手术助手2
     */
    @Column(name = "SURGICAL_ASSISTANT2")
    private String surgicalAssistant2;

    /**
     * 主要手术切口愈合等级
     */
    @Column(name = "INCISION_HEALING")
    private String incisionHealing;

    /**
     * 主要手术麻醉方式
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 主要手术麻醉医师
     */
    @Column(name = "ANESTHESIOLOGIST")
    private String anesthesiologist;

    /**
     * 离院方式
     */
    @Column(name = "DISCHARGE_CLASS")
    private String dischargeClass;

    /**
     * 住院费用总费用（元）
     */
    @Column(name = "INHOS_TOTAL_FEE")
    private String inhosTotalFee;

    /**
     * 住院费用自付费用（元）
     */
    @Column(name = "SELF_PAYMENT")
    private String selfPayment;

    /**
     * 综合医疗服务类其他费用(其他费用)
     */
    @Column(name = "OTHER_FEE")
    private String otherFee;

    /**
     * 手术费
     */
    @Column(name = "OPERATION_FEE")
    private String operationFee;

    /**
     * 中成药费
     */
    @Column(name = "CPD_FEE")
    private String cpdFee;

    /**
     * 中草药费
     */
    @Column(name = "CHM_FEE")
    private String chmFee;

    /**
     * 医疗付费方式
     */
    @Column(name = "PAY_WAY")
    private String payWay;

    /**
     * 西药费
     */
    @Column(name = "WM_FEE")
    private String wmFee;

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
     * 获取病案首页解析唯一标识
     *
     * @return MRHUID - 病案首页解析唯一标识
     */
    public String getMrhuid() {
        return mrhuid;
    }

    /**
     * 设置病案首页解析唯一标识
     *
     * @param mrhuid 病案首页解析唯一标识
     */
    public void setMrhuid(String mrhuid) {
        this.mrhuid = mrhuid == null ? null : mrhuid.trim();
    }

    /**
     * 获取住院id
     *
     * @return IHUID - 住院id
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院id
     *
     * @param ihuid 住院id
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人id
     *
     * @return PUID - 病人id
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人id
     *
     * @param puid 病人id
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取机构id
     *
     * @return ORG_ID - 机构id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构id
     *
     * @param orgId 机构id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取住院次数
     *
     * @return INHOS_TIMES - 住院次数
     */
    public String getInhosTimes() {
        return inhosTimes;
    }

    /**
     * 设置住院次数
     *
     * @param inhosTimes 住院次数
     */
    public void setInhosTimes(String inhosTimes) {
        this.inhosTimes = inhosTimes == null ? null : inhosTimes.trim();
    }

    /**
     * 获取病案号
     *
     * @return MEDICAL_NO - 病案号
     */
    public String getMedicalNo() {
        return medicalNo;
    }

    /**
     * 设置病案号
     *
     * @param medicalNo 病案号
     */
    public void setMedicalNo(String medicalNo) {
        this.medicalNo = medicalNo == null ? null : medicalNo.trim();
    }

    /**
     * 获取入院日期
     *
     * @return ADMISSION_DATE - 入院日期
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院日期
     *
     * @param admissionDate 入院日期
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取入院科室
     *
     * @return ADMISSION_DEPT - 入院科室
     */
    public String getAdmissionDept() {
        return admissionDept;
    }

    /**
     * 设置入院科室
     *
     * @param admissionDept 入院科室
     */
    public void setAdmissionDept(String admissionDept) {
        this.admissionDept = admissionDept == null ? null : admissionDept.trim();
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
     * 获取出院科室
     *
     * @return DISCHARGE_DEPT - 出院科室
     */
    public String getDischargeDept() {
        return dischargeDept;
    }

    /**
     * 设置出院科室
     *
     * @param dischargeDept 出院科室
     */
    public void setDischargeDept(String dischargeDept) {
        this.dischargeDept = dischargeDept == null ? null : dischargeDept.trim();
    }

    /**
     * 获取主治医师
     *
     * @return MAIN_DOCTOR - 主治医师
     */
    public String getMainDoctor() {
        return mainDoctor;
    }

    /**
     * 设置主治医师
     *
     * @param mainDoctor 主治医师
     */
    public void setMainDoctor(String mainDoctor) {
        this.mainDoctor = mainDoctor == null ? null : mainDoctor.trim();
    }

    /**
     * 获取住院医师
     *
     * @return INHOS_DOCTOR - 住院医师
     */
    public String getInhosDoctor() {
        return inhosDoctor;
    }

    /**
     * 设置住院医师
     *
     * @param inhosDoctor 住院医师
     */
    public void setInhosDoctor(String inhosDoctor) {
        this.inhosDoctor = inhosDoctor == null ? null : inhosDoctor.trim();
    }

    /**
     * 获取机构名称
     *
     * @return ORG_NAME - 机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称
     *
     * @param orgName 机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取健康卡号
     *
     * @return CARD_NO - 健康卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置健康卡号
     *
     * @param cardNo 健康卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取病人姓名
     *
     * @return NAME - 病人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人姓名
     *
     * @param name 病人姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取病人性别
     *
     * @return GENDER - 病人性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置病人性别
     *
     * @param gender 病人性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取病人出生日期
     *
     * @return BIRTHDAY - 病人出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置病人出生日期
     *
     * @param birthday 病人出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取病人年龄
     *
     * @return AGE - 病人年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置病人年龄
     *
     * @param age 病人年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取病人国籍
     *
     * @return COUNTRY - 病人国籍
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置病人国籍
     *
     * @param country 病人国籍
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取病人民族
     *
     * @return ETHNIC - 病人民族
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * 设置病人民族
     *
     * @param ethnic 病人民族
     */
    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    /**
     * 获取病人身份证件号码
     *
     * @return ID_NO - 病人身份证件号码
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置病人身份证件号码
     *
     * @param idNo 病人身份证件号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取病人职业
     *
     * @return OCCUPATION - 病人职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 设置病人职业
     *
     * @param occupation 病人职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    /**
     * 获取病人婚姻状况
     *
     * @return MARITAL_STATUS - 病人婚姻状况
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置病人婚姻状况
     *
     * @param maritalStatus 病人婚姻状况
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    /**
     * 获取病人工作单位及地址
     *
     * @return EMPLOYER_ORG - 病人工作单位及地址
     */
    public String getEmployerOrg() {
        return employerOrg;
    }

    /**
     * 设置病人工作单位及地址
     *
     * @param employerOrg 病人工作单位及地址
     */
    public void setEmployerOrg(String employerOrg) {
        this.employerOrg = employerOrg == null ? null : employerOrg.trim();
    }

    /**
     * 获取病人工作单位电话
     *
     * @return EMPLOYER_ORG_TEL - 病人工作单位电话
     */
    public String getEmployerOrgTel() {
        return employerOrgTel;
    }

    /**
     * 设置病人工作单位电话
     *
     * @param employerOrgTel 病人工作单位电话
     */
    public void setEmployerOrgTel(String employerOrgTel) {
        this.employerOrgTel = employerOrgTel == null ? null : employerOrgTel.trim();
    }

    /**
     * 获取联系人
     *
     * @return CONTACT - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 获取病人与联系人的关系
     *
     * @return CONTACT_RELATION - 病人与联系人的关系
     */
    public String getContactRelation() {
        return contactRelation;
    }

    /**
     * 设置病人与联系人的关系
     *
     * @param contactRelation 病人与联系人的关系
     */
    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation == null ? null : contactRelation.trim();
    }

    /**
     * 获取联系人电话
     *
     * @return CONTACT_TEL - 联系人电话
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * 设置联系人电话
     *
     * @param contactTel 联系人电话
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    /**
     * 获取abo血型
     *
     * @return ABO_BLOOD - abo血型
     */
    public String getAboBlood() {
        return aboBlood;
    }

    /**
     * 设置abo血型
     *
     * @param aboBlood abo血型
     */
    public void setAboBlood(String aboBlood) {
        this.aboBlood = aboBlood == null ? null : aboBlood.trim();
    }

    /**
     * 获取rh血型
     *
     * @return RH_BLOOD - rh血型
     */
    public String getRhBlood() {
        return rhBlood;
    }

    /**
     * 设置rh血型
     *
     * @param rhBlood rh血型
     */
    public void setRhBlood(String rhBlood) {
        this.rhBlood = rhBlood == null ? null : rhBlood.trim();
    }

    /**
     * 获取入院途径
     *
     * @return INHOS_PATH - 入院途径
     */
    public String getInhosPath() {
        return inhosPath;
    }

    /**
     * 设置入院途径
     *
     * @param inhosPath 入院途径
     */
    public void setInhosPath(String inhosPath) {
        this.inhosPath = inhosPath == null ? null : inhosPath.trim();
    }

    /**
     * 获取门（急）诊诊断
     *
     * @return DIAG_NAME - 门（急）诊诊断
     */
    public String getDiagName() {
        return diagName;
    }

    /**
     * 设置门（急）诊诊断
     *
     * @param diagName 门（急）诊诊断
     */
    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    /**
     * 获取门（急）诊诊断疾病编码
     *
     * @return DIAG_CODE - 门（急）诊诊断疾病编码
     */
    public String getDiagCode() {
        return diagCode;
    }

    /**
     * 设置门（急）诊诊断疾病编码
     *
     * @param diagCode 门（急）诊诊断疾病编码
     */
    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode == null ? null : diagCode.trim();
    }

    /**
     * 获取手术日期
     *
     * @return OPERATION_DATE - 手术日期
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * 设置手术日期
     *
     * @param operationDate 手术日期
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * 获取手术级别
     *
     * @return OPERATION_LEVEL - 手术级别
     */
    public String getOperationLevel() {
        return operationLevel;
    }

    /**
     * 设置手术级别
     *
     * @param operationLevel 手术级别
     */
    public void setOperationLevel(String operationLevel) {
        this.operationLevel = operationLevel == null ? null : operationLevel.trim();
    }

    /**
     * 获取手术手术操作级别及名称
     *
     * @return OPERATION_CN - 手术手术操作级别及名称
     */
    public String getOperationCn() {
        return operationCn;
    }

    /**
     * 设置手术手术操作级别及名称
     *
     * @param operationCn 手术手术操作级别及名称
     */
    public void setOperationCn(String operationCn) {
        this.operationCn = operationCn == null ? null : operationCn.trim();
    }

    /**
     * 获取主要手术及操作医师（术者）
     *
     * @return SURGEON_NAME - 主要手术及操作医师（术者）
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * 设置主要手术及操作医师（术者）
     *
     * @param surgeonName 主要手术及操作医师（术者）
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    /**
     * 获取手术助手1
     *
     * @return SURGICAL_ASSISTANT1 - 手术助手1
     */
    public String getSurgicalAssistant1() {
        return surgicalAssistant1;
    }

    /**
     * 设置手术助手1
     *
     * @param surgicalAssistant1 手术助手1
     */
    public void setSurgicalAssistant1(String surgicalAssistant1) {
        this.surgicalAssistant1 = surgicalAssistant1 == null ? null : surgicalAssistant1.trim();
    }

    /**
     * 获取手术助手2
     *
     * @return SURGICAL_ASSISTANT2 - 手术助手2
     */
    public String getSurgicalAssistant2() {
        return surgicalAssistant2;
    }

    /**
     * 设置手术助手2
     *
     * @param surgicalAssistant2 手术助手2
     */
    public void setSurgicalAssistant2(String surgicalAssistant2) {
        this.surgicalAssistant2 = surgicalAssistant2 == null ? null : surgicalAssistant2.trim();
    }

    /**
     * 获取主要手术切口愈合等级
     *
     * @return INCISION_HEALING - 主要手术切口愈合等级
     */
    public String getIncisionHealing() {
        return incisionHealing;
    }

    /**
     * 设置主要手术切口愈合等级
     *
     * @param incisionHealing 主要手术切口愈合等级
     */
    public void setIncisionHealing(String incisionHealing) {
        this.incisionHealing = incisionHealing == null ? null : incisionHealing.trim();
    }

    /**
     * 获取主要手术麻醉方式
     *
     * @return ANESTHESIA_CN - 主要手术麻醉方式
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置主要手术麻醉方式
     *
     * @param anesthesiaCn 主要手术麻醉方式
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取主要手术麻醉医师
     *
     * @return ANESTHESIOLOGIST - 主要手术麻醉医师
     */
    public String getAnesthesiologist() {
        return anesthesiologist;
    }

    /**
     * 设置主要手术麻醉医师
     *
     * @param anesthesiologist 主要手术麻醉医师
     */
    public void setAnesthesiologist(String anesthesiologist) {
        this.anesthesiologist = anesthesiologist == null ? null : anesthesiologist.trim();
    }

    /**
     * 获取离院方式
     *
     * @return DISCHARGE_CLASS - 离院方式
     */
    public String getDischargeClass() {
        return dischargeClass;
    }

    /**
     * 设置离院方式
     *
     * @param dischargeClass 离院方式
     */
    public void setDischargeClass(String dischargeClass) {
        this.dischargeClass = dischargeClass == null ? null : dischargeClass.trim();
    }

    /**
     * 获取住院费用总费用（元）
     *
     * @return INHOS_TOTAL_FEE - 住院费用总费用（元）
     */
    public String getInhosTotalFee() {
        return inhosTotalFee;
    }

    /**
     * 设置住院费用总费用（元）
     *
     * @param inhosTotalFee 住院费用总费用（元）
     */
    public void setInhosTotalFee(String inhosTotalFee) {
        this.inhosTotalFee = inhosTotalFee == null ? null : inhosTotalFee.trim();
    }

    /**
     * 获取住院费用自付费用（元）
     *
     * @return SELF_PAYMENT - 住院费用自付费用（元）
     */
    public String getSelfPayment() {
        return selfPayment;
    }

    /**
     * 设置住院费用自付费用（元）
     *
     * @param selfPayment 住院费用自付费用（元）
     */
    public void setSelfPayment(String selfPayment) {
        this.selfPayment = selfPayment == null ? null : selfPayment.trim();
    }

    /**
     * 获取综合医疗服务类其他费用(其他费用)
     *
     * @return OTHER_FEE - 综合医疗服务类其他费用(其他费用)
     */
    public String getOtherFee() {
        return otherFee;
    }

    /**
     * 设置综合医疗服务类其他费用(其他费用)
     *
     * @param otherFee 综合医疗服务类其他费用(其他费用)
     */
    public void setOtherFee(String otherFee) {
        this.otherFee = otherFee == null ? null : otherFee.trim();
    }

    /**
     * 获取手术费
     *
     * @return OPERATION_FEE - 手术费
     */
    public String getOperationFee() {
        return operationFee;
    }

    /**
     * 设置手术费
     *
     * @param operationFee 手术费
     */
    public void setOperationFee(String operationFee) {
        this.operationFee = operationFee == null ? null : operationFee.trim();
    }

    /**
     * 获取中成药费
     *
     * @return CPD_FEE - 中成药费
     */
    public String getCpdFee() {
        return cpdFee;
    }

    /**
     * 设置中成药费
     *
     * @param cpdFee 中成药费
     */
    public void setCpdFee(String cpdFee) {
        this.cpdFee = cpdFee == null ? null : cpdFee.trim();
    }

    /**
     * 获取中草药费
     *
     * @return CHM_FEE - 中草药费
     */
    public String getChmFee() {
        return chmFee;
    }

    /**
     * 设置中草药费
     *
     * @param chmFee 中草药费
     */
    public void setChmFee(String chmFee) {
        this.chmFee = chmFee == null ? null : chmFee.trim();
    }

    /**
     * 获取医疗付费方式
     *
     * @return PAY_WAY - 医疗付费方式
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * 设置医疗付费方式
     *
     * @param payWay 医疗付费方式
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    /**
     * 获取西药费
     *
     * @return WM_FEE - 西药费
     */
    public String getWmFee() {
        return wmFee;
    }

    /**
     * 设置西药费
     *
     * @param wmFee 西药费
     */
    public void setWmFee(String wmFee) {
        this.wmFee = wmFee == null ? null : wmFee.trim();
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