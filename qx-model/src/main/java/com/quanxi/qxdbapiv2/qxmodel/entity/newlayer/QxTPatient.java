package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_PATIENT")
public class QxTPatient {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 机构标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 病人ID
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 国籍名称
     */
    @Column(name = "NATIONALITY_NAME")
    private String nationalityName;

    /**
     * 姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 本人电话（本人的电话号码 ,包括国际、 国内区号和分机号）
     */
    @Column(name = "TEL_NO")
    private String telNo;

    /**
     * 性别代码（本人生理性别的代码）
     */
    @Column(name = "GENDER_CODE")
    private String genderCode;

    /**
     * 性别
     */
    @Column(name = "GENDER_NAME")
    private String genderName;

    /**
     * 民族代码（本人所属民族的类别代码）
     */
    @Column(name = "ETHNIC_CODE")
    private String ethnicCode;

    /**
     * 民族
     */
    @Column(name = "ETHNIC_NAME")
    private String ethnicName;

    /**
     * 出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 证件类型代码（本人身份证件的类别代码）
     */
    @Column(name = "ID_CARD_TYPE")
    private String idCardType;

    /**
     * 证件类型
     */
    @Column(name = "ID_CARD_TYPE_NAME")
    private String idCardTypeName;

    /**
     * 证件号码（身份证件上唯一的法定标识符）
     */
    @Column(name = "ID_CARD_NO")
    private String idCardNo;

    /**
     * 工作单位名称（本人工作单位的组织机构名称 ）
     */
    @Column(name = "EMPLOYER_ORG")
    private String employerOrg;

    /**
     * 参加工作日期YYYY/MM/DD（卫生服务对象参加工作(开始就业)当日的公元纪年日期）
     */
    @Column(name = "WORK_DATE")
    private String workDate;

    /**
     * 工作单位电话号码（当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "EMPLOYER_ORG_TEL")
    private String employerOrgTel;

    /**
     * 联系人姓名（联系人在公安管理部门正式登记注册的 姓氏和名称）
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人：关系（联系人与患者的关系类别在特定编码体系中的代码）
     */
    @Column(name = "CONTACT_RELATION_CODE")
    private String contactRelationCode;

    /**
     * 联系人：关系
     */
    @Column(name = "CONTACT_RELATION_NAME")
    private String contactRelationName;

    /**
     * 联系人电话（联系人的电话号码,包括国际、国内区号和分机号）
     */
    @Column(name = "CONTACT_TEL")
    private String contactTel;

    /**
     * 电子邮件地址（卫生服务对象的电子邮箱名称）
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 学历代码（本人受教育最高程度的类别代码）
     */
    @Column(name = "EDU_CODE")
    private String eduCode;

    /**
     * 学历
     */
    @Column(name = "EDU_NAME")
    private String eduName;

    /**
     * 职业类别代码（本人当前职业类别的代码）
     */
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;

    /**
     * 职业类别
     */
    @Column(name = "OCCUPATION_NAME")
    private String occupationName;

    /**
     * 婚姻状况代码（本人当前婚姻状况代码）
     */
    @Column(name = "MARITAL_STATUS_CODE")
    private String maritalStatusCode;

    /**
     * 婚姻状况
     */
    @Column(name = "MARITAL_STATUS_NAME")
    private String maritalStatusName;

    /**
     * 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    @Column(name = "IS_RESIDENCE_ADD")
    private Long isResidenceAdd;

    /**
     * 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    @Column(name = "CARD_TYPE_CODE")
    private String cardTypeCode;

    /**
     * 卡类型
     */
    @Column(name = "CARD_TYPE_NAME")
    private String cardTypeName;

    /**
     * 医保卡类型代码（医保卡类型在特定编码体系中的编码）
     */
    @Column(name = "HEALTHCARE_TYPE_CODE")
    private String healthcareTypeCode;

    /**
     * 医保卡类型
     */
    @Column(name = "HEALTHCARE_TYPE_NAME")
    private String healthcareTypeName;

    /**
     * 医保卡号码（医保卡在特定编码体系中的编码）
     */
    @Column(name = "HEALTHCARE_NO")
    private String healthcareNo;

    /**
     * 社保号（患者的社保卡卡号）
     */
    @Column(name = "SOCIAL_SECURITY_NO")
    private String socialSecurityNo;

    /**
     * 院内就诊卡号（患者的院内就诊卡号）
     */
    @Column(name = "HOSPITAL_ACC_NO")
    private String hospitalAccNo;

    /**
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 城乡居民健康档案编号（城乡居民个人健康档案的编号）
     */
    @Column(name = "HEALTH_DOC_NO")
    private String healthDocNo;

    /**
     * 健康档案管理机构名称（负责管理和维护个人健康档案的组织机构名称）
     */
    @Column(name = "EHR_MANAGE_ORG_NAME")
    private String ehrManageOrgName;

    /**
     * 健康档案管理机构的组织机构代码（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    @Column(name = "EHR_MANAGE_ORG_ID")
    private String ehrManageOrgId;

    /**
     * ABO血型代码（按照ABO血型系统决定的本人血型类别代码）
     */
    @Column(name = "BLOODTYPE_ABO")
    private String bloodtypeAbo;

    /**
     * ABO血型
     */
    @Column(name = "BLOODTYPE_ABO_NAME")
    private String bloodtypeAboName;

    /**
     * Rh血型代码（按照Rh血型系统决定的本人血型类别代码）
     */
    @Column(name = "BLOODTYPE_RH")
    private String bloodtypeRh;

    /**
     * Rh血型
     */
    @Column(name = "BLOODTYPE_RH_NAME")
    private String bloodtypeRhName;

    /**
     * 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    @Column(name = "HAS_DRUG_ALLERGY")
    private Long hasDrugAllergy;

    /**
     * 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    @Column(name = "HAS_OP_HISTORY")
    private Long hasOpHistory;

    /**
     * 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    @Column(name = "HAS_TRAUMA_HISTORY")
    private Long hasTraumaHistory;

    /**
     * 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    @Column(name = "HAS_BLOOD_TRANSF")
    private Long hasBloodTransf;

    /**
     * 卡有效期（居民健康卡的有效使用期）
     */
    @Column(name = "CARD_EXP_DATE")
    private String cardExpDate;

    /**
     * 哮喘标志0无 1有（标志个人是否有哮喘）
     */
    @Column(name = "HAS_ASTHMA")
    private Long hasAsthma;

    /**
     * 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    @Column(name = "HAS_HEART_DISEASE")
    private Long hasHeartDisease;

    /**
     * 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    @Column(name = "HAS_CARDIOVASCULAR")
    private Long hasCardiovascular;

    /**
     * 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    @Column(name = "HAS_EPILEPSY")
    private Long hasEpilepsy;

    /**
     * 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    @Column(name = "HAS_COAGULOPATHY")
    private Long hasCoagulopathy;

    /**
     * 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    @Column(name = "HAS_DIABETES")
    private Long hasDiabetes;

    /**
     * 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    @Column(name = "HAS_GLAUCOMA")
    private Long hasGlaucoma;

    /**
     * 透析标志0无 1有（标识个人是否有透析）
     */
    @Column(name = "HAS_DIALYSIS")
    private Long hasDialysis;

    /**
     * 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    @Column(name = "HAS_ORGAN_TRANSF")
    private Long hasOrganTransf;

    /**
     * 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    @Column(name = "HAS_ORGAN_DEFECT")
    private Long hasOrganDefect;

    /**
     * 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    @Column(name = "HAS_REMOVAL_PRO")
    private Long hasRemovalPro;

    /**
     * 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    @Column(name = "HAS_CARDIAC_PAC")
    private Long hasCardiacPac;

    /**
     * 其他医学警示名称（对其他医学警示的描述）
     */
    @Column(name = "HAS_ORTHER_MEDICAL_ALERT")
    private String hasOrtherMedicalAlert;

    /**
     * 精神病标志0无 1有（标识个人是否存在精神病）
     */
    @Column(name = "HAS_PSYCHIATRIC")
    private Long hasPsychiatric;

    /**
     * 免疫接种情况代码（卫生服务对象既往接受免疫接种历史的代码）
     */
    @Column(name = "VACC_HISTORY_CODE")
    private String vaccHistoryCode;

    /**
     * 免疫接种情况
     */
    @Column(name = "VACC_HISTORY_NAME")
    private String vaccHistoryName;

    /**
     * 卫生事件名称（本人卫生事件名称，一般指个人基本信息登记）
     */
    @Column(name = "EVENT_NAME")
    private String eventName;

    /**
     * 卫生事件发生日期（本人卫生事件发生当日的公元纪年日期）
     */
    @Column(name = "EVENT_DATE")
    private String eventDate;

    /**
     * 卫生事件发生地点（本人卫生事件发生地点）
     */
    @Column(name = "EVENT_PLACE")
    private String eventPlace;

    /**
     * 建档者姓名（首次为建立健康档案的人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CREATE_OPERATOR")
    private String createOperator;

    /**
     * 建档日期（服务对象建立相关档案当日的公元纪年日期）
     */
    @Column(name = "EHR_CREATE_DATE")
    private String ehrCreateDate;

    /**
     * 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAST_UPD_DATE")
    private String lastUpdDate;

    /**
     * 姓名拼音简称
     */
    @Column(name = "NAME_PY")
    private String namePy;

    /**
     * 姓名拼音全称
     */
    @Column(name = "NAME_PINYIN")
    private String namePinyin;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

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

    @Column(name = "ILLNESS_HISTORY")
    private String illnessHistory;

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
     * 获取机构标识
     *
     * @return ORGUID - 机构标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构标识
     *
     * @param orguid 机构标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取病人ID
     *
     * @return PATIENT_ID - 病人ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置病人ID
     *
     * @param patientId 病人ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取国籍名称
     *
     * @return NATIONALITY_NAME - 国籍名称
     */
    public String getNationalityName() {
        return nationalityName;
    }

    /**
     * 设置国籍名称
     *
     * @param nationalityName 国籍名称
     */
    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName == null ? null : nationalityName.trim();
    }

    /**
     * 获取姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取本人电话（本人的电话号码 ,包括国际、 国内区号和分机号）
     *
     * @return TEL_NO - 本人电话（本人的电话号码 ,包括国际、 国内区号和分机号）
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * 设置本人电话（本人的电话号码 ,包括国际、 国内区号和分机号）
     *
     * @param telNo 本人电话（本人的电话号码 ,包括国际、 国内区号和分机号）
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    /**
     * 获取性别代码（本人生理性别的代码）
     *
     * @return GENDER_CODE - 性别代码（本人生理性别的代码）
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * 设置性别代码（本人生理性别的代码）
     *
     * @param genderCode 性别代码（本人生理性别的代码）
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    /**
     * 获取性别
     *
     * @return GENDER_NAME - 性别
     */
    public String getGenderName() {
        return genderName;
    }

    /**
     * 设置性别
     *
     * @param genderName 性别
     */
    public void setGenderName(String genderName) {
        this.genderName = genderName == null ? null : genderName.trim();
    }

    /**
     * 获取民族代码（本人所属民族的类别代码）
     *
     * @return ETHNIC_CODE - 民族代码（本人所属民族的类别代码）
     */
    public String getEthnicCode() {
        return ethnicCode;
    }

    /**
     * 设置民族代码（本人所属民族的类别代码）
     *
     * @param ethnicCode 民族代码（本人所属民族的类别代码）
     */
    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode == null ? null : ethnicCode.trim();
    }

    /**
     * 获取民族
     *
     * @return ETHNIC_NAME - 民族
     */
    public String getEthnicName() {
        return ethnicName;
    }

    /**
     * 设置民族
     *
     * @param ethnicName 民族
     */
    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName == null ? null : ethnicName.trim();
    }

    /**
     * 获取出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     *
     * @return BIRTHDAY - 出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     *
     * @param birthday 出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取证件类型代码（本人身份证件的类别代码）
     *
     * @return ID_CARD_TYPE - 证件类型代码（本人身份证件的类别代码）
     */
    public String getIdCardType() {
        return idCardType;
    }

    /**
     * 设置证件类型代码（本人身份证件的类别代码）
     *
     * @param idCardType 证件类型代码（本人身份证件的类别代码）
     */
    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType == null ? null : idCardType.trim();
    }

    /**
     * 获取证件类型
     *
     * @return ID_CARD_TYPE_NAME - 证件类型
     */
    public String getIdCardTypeName() {
        return idCardTypeName;
    }

    /**
     * 设置证件类型
     *
     * @param idCardTypeName 证件类型
     */
    public void setIdCardTypeName(String idCardTypeName) {
        this.idCardTypeName = idCardTypeName == null ? null : idCardTypeName.trim();
    }

    /**
     * 获取证件号码（身份证件上唯一的法定标识符）
     *
     * @return ID_CARD_NO - 证件号码（身份证件上唯一的法定标识符）
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 设置证件号码（身份证件上唯一的法定标识符）
     *
     * @param idCardNo 证件号码（身份证件上唯一的法定标识符）
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    /**
     * 获取工作单位名称（本人工作单位的组织机构名称 ）
     *
     * @return EMPLOYER_ORG - 工作单位名称（本人工作单位的组织机构名称 ）
     */
    public String getEmployerOrg() {
        return employerOrg;
    }

    /**
     * 设置工作单位名称（本人工作单位的组织机构名称 ）
     *
     * @param employerOrg 工作单位名称（本人工作单位的组织机构名称 ）
     */
    public void setEmployerOrg(String employerOrg) {
        this.employerOrg = employerOrg == null ? null : employerOrg.trim();
    }

    /**
     * 获取参加工作日期YYYY/MM/DD（卫生服务对象参加工作(开始就业)当日的公元纪年日期）
     *
     * @return WORK_DATE - 参加工作日期YYYY/MM/DD（卫生服务对象参加工作(开始就业)当日的公元纪年日期）
     */
    public String getWorkDate() {
        return workDate;
    }

    /**
     * 设置参加工作日期YYYY/MM/DD（卫生服务对象参加工作(开始就业)当日的公元纪年日期）
     *
     * @param workDate 参加工作日期YYYY/MM/DD（卫生服务对象参加工作(开始就业)当日的公元纪年日期）
     */
    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    /**
     * 获取工作单位电话号码（当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @return EMPLOYER_ORG_TEL - 工作单位电话号码（当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public String getEmployerOrgTel() {
        return employerOrgTel;
    }

    /**
     * 设置工作单位电话号码（当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @param employerOrgTel 工作单位电话号码（当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public void setEmployerOrgTel(String employerOrgTel) {
        this.employerOrgTel = employerOrgTel == null ? null : employerOrgTel.trim();
    }

    /**
     * 获取联系人姓名（联系人在公安管理部门正式登记注册的 姓氏和名称）
     *
     * @return CONTACT_NAME - 联系人姓名（联系人在公安管理部门正式登记注册的 姓氏和名称）
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名（联系人在公安管理部门正式登记注册的 姓氏和名称）
     *
     * @param contactName 联系人姓名（联系人在公安管理部门正式登记注册的 姓氏和名称）
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人：关系（联系人与患者的关系类别在特定编码体系中的代码）
     *
     * @return CONTACT_RELATION_CODE - 联系人：关系（联系人与患者的关系类别在特定编码体系中的代码）
     */
    public String getContactRelationCode() {
        return contactRelationCode;
    }

    /**
     * 设置联系人：关系（联系人与患者的关系类别在特定编码体系中的代码）
     *
     * @param contactRelationCode 联系人：关系（联系人与患者的关系类别在特定编码体系中的代码）
     */
    public void setContactRelationCode(String contactRelationCode) {
        this.contactRelationCode = contactRelationCode == null ? null : contactRelationCode.trim();
    }

    /**
     * 获取联系人：关系
     *
     * @return CONTACT_RELATION_NAME - 联系人：关系
     */
    public String getContactRelationName() {
        return contactRelationName;
    }

    /**
     * 设置联系人：关系
     *
     * @param contactRelationName 联系人：关系
     */
    public void setContactRelationName(String contactRelationName) {
        this.contactRelationName = contactRelationName == null ? null : contactRelationName.trim();
    }

    /**
     * 获取联系人电话（联系人的电话号码,包括国际、国内区号和分机号）
     *
     * @return CONTACT_TEL - 联系人电话（联系人的电话号码,包括国际、国内区号和分机号）
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * 设置联系人电话（联系人的电话号码,包括国际、国内区号和分机号）
     *
     * @param contactTel 联系人电话（联系人的电话号码,包括国际、国内区号和分机号）
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    /**
     * 获取电子邮件地址（卫生服务对象的电子邮箱名称）
     *
     * @return EMAIL - 电子邮件地址（卫生服务对象的电子邮箱名称）
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件地址（卫生服务对象的电子邮箱名称）
     *
     * @param email 电子邮件地址（卫生服务对象的电子邮箱名称）
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取学历代码（本人受教育最高程度的类别代码）
     *
     * @return EDU_CODE - 学历代码（本人受教育最高程度的类别代码）
     */
    public String getEduCode() {
        return eduCode;
    }

    /**
     * 设置学历代码（本人受教育最高程度的类别代码）
     *
     * @param eduCode 学历代码（本人受教育最高程度的类别代码）
     */
    public void setEduCode(String eduCode) {
        this.eduCode = eduCode == null ? null : eduCode.trim();
    }

    /**
     * 获取学历
     *
     * @return EDU_NAME - 学历
     */
    public String getEduName() {
        return eduName;
    }

    /**
     * 设置学历
     *
     * @param eduName 学历
     */
    public void setEduName(String eduName) {
        this.eduName = eduName == null ? null : eduName.trim();
    }

    /**
     * 获取职业类别代码（本人当前职业类别的代码）
     *
     * @return OCCUPATION_CODE - 职业类别代码（本人当前职业类别的代码）
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * 设置职业类别代码（本人当前职业类别的代码）
     *
     * @param occupationCode 职业类别代码（本人当前职业类别的代码）
     */
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    /**
     * 获取职业类别
     *
     * @return OCCUPATION_NAME - 职业类别
     */
    public String getOccupationName() {
        return occupationName;
    }

    /**
     * 设置职业类别
     *
     * @param occupationName 职业类别
     */
    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName == null ? null : occupationName.trim();
    }

    /**
     * 获取婚姻状况代码（本人当前婚姻状况代码）
     *
     * @return MARITAL_STATUS_CODE - 婚姻状况代码（本人当前婚姻状况代码）
     */
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * 设置婚姻状况代码（本人当前婚姻状况代码）
     *
     * @param maritalStatusCode 婚姻状况代码（本人当前婚姻状况代码）
     */
    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode == null ? null : maritalStatusCode.trim();
    }

    /**
     * 获取婚姻状况
     *
     * @return MARITAL_STATUS_NAME - 婚姻状况
     */
    public String getMaritalStatusName() {
        return maritalStatusName;
    }

    /**
     * 设置婚姻状况
     *
     * @param maritalStatusName 婚姻状况
     */
    public void setMaritalStatusName(String maritalStatusName) {
        this.maritalStatusName = maritalStatusName == null ? null : maritalStatusName.trim();
    }

    /**
     * 获取常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     *
     * @return IS_RESIDENCE_ADD - 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    public Long getIsResidenceAdd() {
        return isResidenceAdd;
    }

    /**
     * 设置常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     *
     * @param isResidenceAdd 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    public void setIsResidenceAdd(Long isResidenceAdd) {
        this.isResidenceAdd = isResidenceAdd;
    }

    /**
     * 获取卡类型代码（就诊卡类型在特定编码体系中的编码）
     *
     * @return CARD_TYPE_CODE - 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * 设置卡类型代码（就诊卡类型在特定编码体系中的编码）
     *
     * @param cardTypeCode 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode == null ? null : cardTypeCode.trim();
    }

    /**
     * 获取卡类型
     *
     * @return CARD_TYPE_NAME - 卡类型
     */
    public String getCardTypeName() {
        return cardTypeName;
    }

    /**
     * 设置卡类型
     *
     * @param cardTypeName 卡类型
     */
    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName == null ? null : cardTypeName.trim();
    }

    /**
     * 获取医保卡类型代码（医保卡类型在特定编码体系中的编码）
     *
     * @return HEALTHCARE_TYPE_CODE - 医保卡类型代码（医保卡类型在特定编码体系中的编码）
     */
    public String getHealthcareTypeCode() {
        return healthcareTypeCode;
    }

    /**
     * 设置医保卡类型代码（医保卡类型在特定编码体系中的编码）
     *
     * @param healthcareTypeCode 医保卡类型代码（医保卡类型在特定编码体系中的编码）
     */
    public void setHealthcareTypeCode(String healthcareTypeCode) {
        this.healthcareTypeCode = healthcareTypeCode == null ? null : healthcareTypeCode.trim();
    }

    /**
     * 获取医保卡类型
     *
     * @return HEALTHCARE_TYPE_NAME - 医保卡类型
     */
    public String getHealthcareTypeName() {
        return healthcareTypeName;
    }

    /**
     * 设置医保卡类型
     *
     * @param healthcareTypeName 医保卡类型
     */
    public void setHealthcareTypeName(String healthcareTypeName) {
        this.healthcareTypeName = healthcareTypeName == null ? null : healthcareTypeName.trim();
    }

    /**
     * 获取医保卡号码（医保卡在特定编码体系中的编码）
     *
     * @return HEALTHCARE_NO - 医保卡号码（医保卡在特定编码体系中的编码）
     */
    public String getHealthcareNo() {
        return healthcareNo;
    }

    /**
     * 设置医保卡号码（医保卡在特定编码体系中的编码）
     *
     * @param healthcareNo 医保卡号码（医保卡在特定编码体系中的编码）
     */
    public void setHealthcareNo(String healthcareNo) {
        this.healthcareNo = healthcareNo == null ? null : healthcareNo.trim();
    }

    /**
     * 获取社保号（患者的社保卡卡号）
     *
     * @return SOCIAL_SECURITY_NO - 社保号（患者的社保卡卡号）
     */
    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    /**
     * 设置社保号（患者的社保卡卡号）
     *
     * @param socialSecurityNo 社保号（患者的社保卡卡号）
     */
    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo == null ? null : socialSecurityNo.trim();
    }

    /**
     * 获取院内就诊卡号（患者的院内就诊卡号）
     *
     * @return HOSPITAL_ACC_NO - 院内就诊卡号（患者的院内就诊卡号）
     */
    public String getHospitalAccNo() {
        return hospitalAccNo;
    }

    /**
     * 设置院内就诊卡号（患者的院内就诊卡号）
     *
     * @param hospitalAccNo 院内就诊卡号（患者的院内就诊卡号）
     */
    public void setHospitalAccNo(String hospitalAccNo) {
        this.hospitalAccNo = hospitalAccNo == null ? null : hospitalAccNo.trim();
    }

    /**
     * 获取居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @return CARD_NO - 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @param cardNo 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取城乡居民健康档案编号（城乡居民个人健康档案的编号）
     *
     * @return HEALTH_DOC_NO - 城乡居民健康档案编号（城乡居民个人健康档案的编号）
     */
    public String getHealthDocNo() {
        return healthDocNo;
    }

    /**
     * 设置城乡居民健康档案编号（城乡居民个人健康档案的编号）
     *
     * @param healthDocNo 城乡居民健康档案编号（城乡居民个人健康档案的编号）
     */
    public void setHealthDocNo(String healthDocNo) {
        this.healthDocNo = healthDocNo == null ? null : healthDocNo.trim();
    }

    /**
     * 获取健康档案管理机构名称（负责管理和维护个人健康档案的组织机构名称）
     *
     * @return EHR_MANAGE_ORG_NAME - 健康档案管理机构名称（负责管理和维护个人健康档案的组织机构名称）
     */
    public String getEhrManageOrgName() {
        return ehrManageOrgName;
    }

    /**
     * 设置健康档案管理机构名称（负责管理和维护个人健康档案的组织机构名称）
     *
     * @param ehrManageOrgName 健康档案管理机构名称（负责管理和维护个人健康档案的组织机构名称）
     */
    public void setEhrManageOrgName(String ehrManageOrgName) {
        this.ehrManageOrgName = ehrManageOrgName == null ? null : ehrManageOrgName.trim();
    }

    /**
     * 获取健康档案管理机构的组织机构代码（负责管理和维护个人健康档案的机构的组织机构代码）
     *
     * @return EHR_MANAGE_ORG_ID - 健康档案管理机构的组织机构代码（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    public String getEhrManageOrgId() {
        return ehrManageOrgId;
    }

    /**
     * 设置健康档案管理机构的组织机构代码（负责管理和维护个人健康档案的机构的组织机构代码）
     *
     * @param ehrManageOrgId 健康档案管理机构的组织机构代码（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    public void setEhrManageOrgId(String ehrManageOrgId) {
        this.ehrManageOrgId = ehrManageOrgId == null ? null : ehrManageOrgId.trim();
    }

    /**
     * 获取ABO血型代码（按照ABO血型系统决定的本人血型类别代码）
     *
     * @return BLOODTYPE_ABO - ABO血型代码（按照ABO血型系统决定的本人血型类别代码）
     */
    public String getBloodtypeAbo() {
        return bloodtypeAbo;
    }

    /**
     * 设置ABO血型代码（按照ABO血型系统决定的本人血型类别代码）
     *
     * @param bloodtypeAbo ABO血型代码（按照ABO血型系统决定的本人血型类别代码）
     */
    public void setBloodtypeAbo(String bloodtypeAbo) {
        this.bloodtypeAbo = bloodtypeAbo == null ? null : bloodtypeAbo.trim();
    }

    /**
     * 获取ABO血型
     *
     * @return BLOODTYPE_ABO_NAME - ABO血型
     */
    public String getBloodtypeAboName() {
        return bloodtypeAboName;
    }

    /**
     * 设置ABO血型
     *
     * @param bloodtypeAboName ABO血型
     */
    public void setBloodtypeAboName(String bloodtypeAboName) {
        this.bloodtypeAboName = bloodtypeAboName == null ? null : bloodtypeAboName.trim();
    }

    /**
     * 获取Rh血型代码（按照Rh血型系统决定的本人血型类别代码）
     *
     * @return BLOODTYPE_RH - Rh血型代码（按照Rh血型系统决定的本人血型类别代码）
     */
    public String getBloodtypeRh() {
        return bloodtypeRh;
    }

    /**
     * 设置Rh血型代码（按照Rh血型系统决定的本人血型类别代码）
     *
     * @param bloodtypeRh Rh血型代码（按照Rh血型系统决定的本人血型类别代码）
     */
    public void setBloodtypeRh(String bloodtypeRh) {
        this.bloodtypeRh = bloodtypeRh == null ? null : bloodtypeRh.trim();
    }

    /**
     * 获取Rh血型
     *
     * @return BLOODTYPE_RH_NAME - Rh血型
     */
    public String getBloodtypeRhName() {
        return bloodtypeRhName;
    }

    /**
     * 设置Rh血型
     *
     * @param bloodtypeRhName Rh血型
     */
    public void setBloodtypeRhName(String bloodtypeRhName) {
        this.bloodtypeRhName = bloodtypeRhName == null ? null : bloodtypeRhName.trim();
    }

    /**
     * 获取药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     *
     * @return HAS_DRUG_ALLERGY - 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    public Long getHasDrugAllergy() {
        return hasDrugAllergy;
    }

    /**
     * 设置药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     *
     * @param hasDrugAllergy 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    public void setHasDrugAllergy(Long hasDrugAllergy) {
        this.hasDrugAllergy = hasDrugAllergy;
    }

    /**
     * 获取手术史标志0无 1有（标识本人既往有无手术经历）
     *
     * @return HAS_OP_HISTORY - 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    public Long getHasOpHistory() {
        return hasOpHistory;
    }

    /**
     * 设置手术史标志0无 1有（标识本人既往有无手术经历）
     *
     * @param hasOpHistory 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    public void setHasOpHistory(Long hasOpHistory) {
        this.hasOpHistory = hasOpHistory;
    }

    /**
     * 获取外伤史标志0无 1有（标识本人既往有无外伤经历）
     *
     * @return HAS_TRAUMA_HISTORY - 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    public Long getHasTraumaHistory() {
        return hasTraumaHistory;
    }

    /**
     * 设置外伤史标志0无 1有（标识本人既往有无外伤经历）
     *
     * @param hasTraumaHistory 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    public void setHasTraumaHistory(Long hasTraumaHistory) {
        this.hasTraumaHistory = hasTraumaHistory;
    }

    /**
     * 获取输血史标志0无 1有（标识本人既往有无输血经历）
     *
     * @return HAS_BLOOD_TRANSF - 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    public Long getHasBloodTransf() {
        return hasBloodTransf;
    }

    /**
     * 设置输血史标志0无 1有（标识本人既往有无输血经历）
     *
     * @param hasBloodTransf 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    public void setHasBloodTransf(Long hasBloodTransf) {
        this.hasBloodTransf = hasBloodTransf;
    }

    /**
     * 获取卡有效期（居民健康卡的有效使用期）
     *
     * @return CARD_EXP_DATE - 卡有效期（居民健康卡的有效使用期）
     */
    public String getCardExpDate() {
        return cardExpDate;
    }

    /**
     * 设置卡有效期（居民健康卡的有效使用期）
     *
     * @param cardExpDate 卡有效期（居民健康卡的有效使用期）
     */
    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate == null ? null : cardExpDate.trim();
    }

    /**
     * 获取哮喘标志0无 1有（标志个人是否有哮喘）
     *
     * @return HAS_ASTHMA - 哮喘标志0无 1有（标志个人是否有哮喘）
     */
    public Long getHasAsthma() {
        return hasAsthma;
    }

    /**
     * 设置哮喘标志0无 1有（标志个人是否有哮喘）
     *
     * @param hasAsthma 哮喘标志0无 1有（标志个人是否有哮喘）
     */
    public void setHasAsthma(Long hasAsthma) {
        this.hasAsthma = hasAsthma;
    }

    /**
     * 获取心脏病标志0无 1有（标识个人是否存在心脏病）
     *
     * @return HAS_HEART_DISEASE - 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    public Long getHasHeartDisease() {
        return hasHeartDisease;
    }

    /**
     * 设置心脏病标志0无 1有（标识个人是否存在心脏病）
     *
     * @param hasHeartDisease 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    public void setHasHeartDisease(Long hasHeartDisease) {
        this.hasHeartDisease = hasHeartDisease;
    }

    /**
     * 获取心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     *
     * @return HAS_CARDIOVASCULAR - 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    public Long getHasCardiovascular() {
        return hasCardiovascular;
    }

    /**
     * 设置心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     *
     * @param hasCardiovascular 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    public void setHasCardiovascular(Long hasCardiovascular) {
        this.hasCardiovascular = hasCardiovascular;
    }

    /**
     * 获取癫痫病标志0无 1有（标识个人是否存在癫痫病）
     *
     * @return HAS_EPILEPSY - 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    public Long getHasEpilepsy() {
        return hasEpilepsy;
    }

    /**
     * 设置癫痫病标志0无 1有（标识个人是否存在癫痫病）
     *
     * @param hasEpilepsy 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    public void setHasEpilepsy(Long hasEpilepsy) {
        this.hasEpilepsy = hasEpilepsy;
    }

    /**
     * 获取凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     *
     * @return HAS_COAGULOPATHY - 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    public Long getHasCoagulopathy() {
        return hasCoagulopathy;
    }

    /**
     * 设置凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     *
     * @param hasCoagulopathy 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    public void setHasCoagulopathy(Long hasCoagulopathy) {
        this.hasCoagulopathy = hasCoagulopathy;
    }

    /**
     * 获取糖尿病标志0无 1有（标识个人是否存在糖尿病）
     *
     * @return HAS_DIABETES - 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    public Long getHasDiabetes() {
        return hasDiabetes;
    }

    /**
     * 设置糖尿病标志0无 1有（标识个人是否存在糖尿病）
     *
     * @param hasDiabetes 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    public void setHasDiabetes(Long hasDiabetes) {
        this.hasDiabetes = hasDiabetes;
    }

    /**
     * 获取青光眼标志0无 1有（标识个人是否存在青光眼）
     *
     * @return HAS_GLAUCOMA - 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    public Long getHasGlaucoma() {
        return hasGlaucoma;
    }

    /**
     * 设置青光眼标志0无 1有（标识个人是否存在青光眼）
     *
     * @param hasGlaucoma 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    public void setHasGlaucoma(Long hasGlaucoma) {
        this.hasGlaucoma = hasGlaucoma;
    }

    /**
     * 获取透析标志0无 1有（标识个人是否有透析）
     *
     * @return HAS_DIALYSIS - 透析标志0无 1有（标识个人是否有透析）
     */
    public Long getHasDialysis() {
        return hasDialysis;
    }

    /**
     * 设置透析标志0无 1有（标识个人是否有透析）
     *
     * @param hasDialysis 透析标志0无 1有（标识个人是否有透析）
     */
    public void setHasDialysis(Long hasDialysis) {
        this.hasDialysis = hasDialysis;
    }

    /**
     * 获取器官移植标志0无 1有（标识个人是否存在器官移植）
     *
     * @return HAS_ORGAN_TRANSF - 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    public Long getHasOrganTransf() {
        return hasOrganTransf;
    }

    /**
     * 设置器官移植标志0无 1有（标识个人是否存在器官移植）
     *
     * @param hasOrganTransf 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    public void setHasOrganTransf(Long hasOrganTransf) {
        this.hasOrganTransf = hasOrganTransf;
    }

    /**
     * 获取器官缺失标志0无 1有（标识个人是否存在器官缺失）
     *
     * @return HAS_ORGAN_DEFECT - 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    public Long getHasOrganDefect() {
        return hasOrganDefect;
    }

    /**
     * 设置器官缺失标志0无 1有（标识个人是否存在器官缺失）
     *
     * @param hasOrganDefect 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    public void setHasOrganDefect(Long hasOrganDefect) {
        this.hasOrganDefect = hasOrganDefect;
    }

    /**
     * 获取可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     *
     * @return HAS_REMOVAL_PRO - 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    public Long getHasRemovalPro() {
        return hasRemovalPro;
    }

    /**
     * 设置可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     *
     * @param hasRemovalPro 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    public void setHasRemovalPro(Long hasRemovalPro) {
        this.hasRemovalPro = hasRemovalPro;
    }

    /**
     * 获取心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     *
     * @return HAS_CARDIAC_PAC - 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    public Long getHasCardiacPac() {
        return hasCardiacPac;
    }

    /**
     * 设置心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     *
     * @param hasCardiacPac 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    public void setHasCardiacPac(Long hasCardiacPac) {
        this.hasCardiacPac = hasCardiacPac;
    }

    /**
     * 获取其他医学警示名称（对其他医学警示的描述）
     *
     * @return HAS_ORTHER_MEDICAL_ALERT - 其他医学警示名称（对其他医学警示的描述）
     */
    public String getHasOrtherMedicalAlert() {
        return hasOrtherMedicalAlert;
    }

    /**
     * 设置其他医学警示名称（对其他医学警示的描述）
     *
     * @param hasOrtherMedicalAlert 其他医学警示名称（对其他医学警示的描述）
     */
    public void setHasOrtherMedicalAlert(String hasOrtherMedicalAlert) {
        this.hasOrtherMedicalAlert = hasOrtherMedicalAlert == null ? null : hasOrtherMedicalAlert.trim();
    }

    /**
     * 获取精神病标志0无 1有（标识个人是否存在精神病）
     *
     * @return HAS_PSYCHIATRIC - 精神病标志0无 1有（标识个人是否存在精神病）
     */
    public Long getHasPsychiatric() {
        return hasPsychiatric;
    }

    /**
     * 设置精神病标志0无 1有（标识个人是否存在精神病）
     *
     * @param hasPsychiatric 精神病标志0无 1有（标识个人是否存在精神病）
     */
    public void setHasPsychiatric(Long hasPsychiatric) {
        this.hasPsychiatric = hasPsychiatric;
    }

    /**
     * 获取免疫接种情况代码（卫生服务对象既往接受免疫接种历史的代码）
     *
     * @return VACC_HISTORY_CODE - 免疫接种情况代码（卫生服务对象既往接受免疫接种历史的代码）
     */
    public String getVaccHistoryCode() {
        return vaccHistoryCode;
    }

    /**
     * 设置免疫接种情况代码（卫生服务对象既往接受免疫接种历史的代码）
     *
     * @param vaccHistoryCode 免疫接种情况代码（卫生服务对象既往接受免疫接种历史的代码）
     */
    public void setVaccHistoryCode(String vaccHistoryCode) {
        this.vaccHistoryCode = vaccHistoryCode == null ? null : vaccHistoryCode.trim();
    }

    /**
     * 获取免疫接种情况
     *
     * @return VACC_HISTORY_NAME - 免疫接种情况
     */
    public String getVaccHistoryName() {
        return vaccHistoryName;
    }

    /**
     * 设置免疫接种情况
     *
     * @param vaccHistoryName 免疫接种情况
     */
    public void setVaccHistoryName(String vaccHistoryName) {
        this.vaccHistoryName = vaccHistoryName == null ? null : vaccHistoryName.trim();
    }

    /**
     * 获取卫生事件名称（本人卫生事件名称，一般指个人基本信息登记）
     *
     * @return EVENT_NAME - 卫生事件名称（本人卫生事件名称，一般指个人基本信息登记）
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 设置卫生事件名称（本人卫生事件名称，一般指个人基本信息登记）
     *
     * @param eventName 卫生事件名称（本人卫生事件名称，一般指个人基本信息登记）
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * 获取卫生事件发生日期（本人卫生事件发生当日的公元纪年日期）
     *
     * @return EVENT_DATE - 卫生事件发生日期（本人卫生事件发生当日的公元纪年日期）
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * 设置卫生事件发生日期（本人卫生事件发生当日的公元纪年日期）
     *
     * @param eventDate 卫生事件发生日期（本人卫生事件发生当日的公元纪年日期）
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate == null ? null : eventDate.trim();
    }

    /**
     * 获取卫生事件发生地点（本人卫生事件发生地点）
     *
     * @return EVENT_PLACE - 卫生事件发生地点（本人卫生事件发生地点）
     */
    public String getEventPlace() {
        return eventPlace;
    }

    /**
     * 设置卫生事件发生地点（本人卫生事件发生地点）
     *
     * @param eventPlace 卫生事件发生地点（本人卫生事件发生地点）
     */
    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace == null ? null : eventPlace.trim();
    }

    /**
     * 获取建档者姓名（首次为建立健康档案的人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CREATE_OPERATOR - 建档者姓名（首次为建立健康档案的人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * 设置建档者姓名（首次为建立健康档案的人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param createOperator 建档者姓名（首次为建立健康档案的人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    /**
     * 获取建档日期（服务对象建立相关档案当日的公元纪年日期）
     *
     * @return EHR_CREATE_DATE - 建档日期（服务对象建立相关档案当日的公元纪年日期）
     */
    public String getEhrCreateDate() {
        return ehrCreateDate;
    }

    /**
     * 设置建档日期（服务对象建立相关档案当日的公元纪年日期）
     *
     * @param ehrCreateDate 建档日期（服务对象建立相关档案当日的公元纪年日期）
     */
    public void setEhrCreateDate(String ehrCreateDate) {
        this.ehrCreateDate = ehrCreateDate == null ? null : ehrCreateDate.trim();
    }

    /**
     * 获取最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate == null ? null : lastUpdDate.trim();
    }

    /**
     * 获取姓名拼音简称
     *
     * @return NAME_PY - 姓名拼音简称
     */
    public String getNamePy() {
        return namePy;
    }

    /**
     * 设置姓名拼音简称
     *
     * @param namePy 姓名拼音简称
     */
    public void setNamePy(String namePy) {
        this.namePy = namePy == null ? null : namePy.trim();
    }

    /**
     * 获取姓名拼音全称
     *
     * @return NAME_PINYIN - 姓名拼音全称
     */
    public String getNamePinyin() {
        return namePinyin;
    }

    /**
     * 设置姓名拼音全称
     *
     * @param namePinyin 姓名拼音全称
     */
    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin == null ? null : namePinyin.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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

    /**
     * @return ILLNESS_HISTORY
     */
    public String getIllnessHistory() {
        return illnessHistory;
    }

    /**
     * @param illnessHistory
     */
    public void setIllnessHistory(String illnessHistory) {
        this.illnessHistory = illnessHistory == null ? null : illnessHistory.trim();
    }
}