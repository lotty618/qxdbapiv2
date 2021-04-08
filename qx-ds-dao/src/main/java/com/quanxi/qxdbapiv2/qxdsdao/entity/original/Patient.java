package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT")
public class Patient {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
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
     * 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    /**
     * 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    @Column(name = "NATIONALITY_CODE")
    private String nationalityCode;

    /**
     * 个人信息表编号（按照某一特定编码规则赋予卫生服务对象个人信息表的顺序号）
     */
    @Column(name = "PATIENT_INFO_NO")
    private String patientInfoNo;

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
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "GENDER_CODE")
    private String genderCode;

    /**
     * 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    @Column(name = "ETHNIC_CODE")
    private String ethnicCode;

    /**
     * 出生日期YYYY/MM/DD（本人出生当天的公元纪年日期）
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    @Column(name = "ID_CARD_TYPE")
    private String idCardType;

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
     * 联系人：关系GB/T 4761（联系人与患者的关系类别在特定编码体系中的代码）
     */
    @Column(name = "CONTACT_RELATION_CODE")
    private String contactRelationCode;

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
     * 学历代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    @Column(name = "EDU_CODE")
    private String eduCode;

    /**
     * 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;

    /**
     * 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    @Column(name = "MARITAL_STATUS_CODE")
    private String maritalStatusCode;

    /**
     * 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    @Column(name = "IS_RESIDENCE_ADD")
    private String isResidenceAdd;

    /**
     * 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     */
    @Column(name = "CARD_TYPE_CODE")
    private String cardTypeCode;

    /**
     * 医保卡类型代码CV07.10.003（医保卡类型在特定编码体系中的编码）
     */
    @Column(name = "HEALTHCARE_TYPE_CODE")
    private String healthcareTypeCode;

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
     * 健康档案管理机构的组织机构代码DIR_ORG（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    @Column(name = "EHR_MANAGE_ORG_ID")
    private String ehrManageOrgId;

    /**
     * ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类别代码）
     */
    @Column(name = "BLOODTYPE_ABO")
    private String bloodtypeAbo;

    /**
     * Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    @Column(name = "BLOODTYPE_RH")
    private String bloodtypeRh;

    /**
     * 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    @Column(name = "HAS_DRUG_ALLERGY")
    private String hasDrugAllergy;

    /**
     * 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    @Column(name = "HAS_OP_HISTORY")
    private String hasOpHistory;

    /**
     * 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    @Column(name = "HAS_TRAUMA_HISTORY")
    private String hasTraumaHistory;

    /**
     * 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    @Column(name = "HAS_BLOOD_TRANSF")
    private String hasBloodTransf;

    /**
     * 卡有效期（居民健康卡的有效使用期）
     */
    @Column(name = "CARD_EXP_DATE")
    private String cardExpDate;

    /**
     * 哮喘标志0无 1有（标志个人是否有哮喘）
     */
    @Column(name = "HAS_ASTHMA")
    private String hasAsthma;

    /**
     * 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    @Column(name = "HAS_HEART_DISEASE")
    private String hasHeartDisease;

    /**
     * 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    @Column(name = "HAS_CARDIOVASCULAR")
    private String hasCardiovascular;

    /**
     * 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    @Column(name = "HAS_EPILEPSY")
    private String hasEpilepsy;

    /**
     * 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    @Column(name = "HAS_COAGULOPATHY")
    private String hasCoagulopathy;

    /**
     * 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    @Column(name = "HAS_DIABETES")
    private String hasDiabetes;

    /**
     * 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    @Column(name = "HAS_GLAUCOMA")
    private String hasGlaucoma;

    /**
     * 透析标志0无 1有（标识个人是否有透析）
     */
    @Column(name = "HAS_DIALYSIS")
    private String hasDialysis;

    /**
     * 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    @Column(name = "HAS_ORGAN_TRANSF")
    private String hasOrganTransf;

    /**
     * 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    @Column(name = "HAS_ORGAN_DEFECT")
    private String hasOrganDefect;

    /**
     * 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    @Column(name = "HAS_REMOVAL_PRO")
    private String hasRemovalPro;

    /**
     * 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    @Column(name = "HAS_CARDIAC_PAC")
    private String hasCardiacPac;

    /**
     * 其他医学警示名称（对其他医学警示的描述）
     */
    @Column(name = "HAS_ORTHER_MEDICAL_ALERT")
    private String hasOrtherMedicalAlert;

    /**
     * 精神病标志0无 1有（标识个人是否存在精神病）
     */
    @Column(name = "HAS_PSYCHIATRIC")
    private String hasPsychiatric;

    /**
     * 疾病史(含外伤)（对卫生服务对象既往健康状况和疾病的详细描述）
     */
    @Column(name = "ILLNESS_HISTORY")
    private String illnessHistory;

    /**
     * 免疫接种情况代码DIR_IMMUNITY_TREATMENT（卫生服务对象既往接受免疫接种历史的代码）
     */
    @Column(name = "VACC_HISTORY_CODE")
    private String vaccHistoryCode;

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
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
     * 获取患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
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
     * 获取事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @return EVENT_TYPE - 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @param eventType 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * 获取国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @return NATIONALITY_CODE - 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * 设置国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @param nationalityCode 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode == null ? null : nationalityCode.trim();
    }

    /**
     * 获取个人信息表编号（按照某一特定编码规则赋予卫生服务对象个人信息表的顺序号）
     *
     * @return PATIENT_INFO_NO - 个人信息表编号（按照某一特定编码规则赋予卫生服务对象个人信息表的顺序号）
     */
    public String getPatientInfoNo() {
        return patientInfoNo;
    }

    /**
     * 设置个人信息表编号（按照某一特定编码规则赋予卫生服务对象个人信息表的顺序号）
     *
     * @param patientInfoNo 个人信息表编号（按照某一特定编码规则赋予卫生服务对象个人信息表的顺序号）
     */
    public void setPatientInfoNo(String patientInfoNo) {
        this.patientInfoNo = patientInfoNo == null ? null : patientInfoNo.trim();
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
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return GENDER_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param genderCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    /**
     * 获取民族代码GB/T 3304（本人所属民族的类别代码）
     *
     * @return ETHNIC_CODE - 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    public String getEthnicCode() {
        return ethnicCode;
    }

    /**
     * 设置民族代码GB/T 3304（本人所属民族的类别代码）
     *
     * @param ethnicCode 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode == null ? null : ethnicCode.trim();
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
     * 获取证件类型代码CV02.01.101（本人身份证件的类别代码）
     *
     * @return ID_CARD_TYPE - 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    public String getIdCardType() {
        return idCardType;
    }

    /**
     * 设置证件类型代码CV02.01.101（本人身份证件的类别代码）
     *
     * @param idCardType 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType == null ? null : idCardType.trim();
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
     * 获取联系人：关系GB/T 4761（联系人与患者的关系类别在特定编码体系中的代码）
     *
     * @return CONTACT_RELATION_CODE - 联系人：关系GB/T 4761（联系人与患者的关系类别在特定编码体系中的代码）
     */
    public String getContactRelationCode() {
        return contactRelationCode;
    }

    /**
     * 设置联系人：关系GB/T 4761（联系人与患者的关系类别在特定编码体系中的代码）
     *
     * @param contactRelationCode 联系人：关系GB/T 4761（联系人与患者的关系类别在特定编码体系中的代码）
     */
    public void setContactRelationCode(String contactRelationCode) {
        this.contactRelationCode = contactRelationCode == null ? null : contactRelationCode.trim();
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
     * 获取学历代码GB/T 4658（本人受教育最高程度的类别代码）
     *
     * @return EDU_CODE - 学历代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    public String getEduCode() {
        return eduCode;
    }

    /**
     * 设置学历代码GB/T 4658（本人受教育最高程度的类别代码）
     *
     * @param eduCode 学历代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    public void setEduCode(String eduCode) {
        this.eduCode = eduCode == null ? null : eduCode.trim();
    }

    /**
     * 获取职业类别代码GB/T 6565（本人当前职业类别的代码）
     *
     * @return OCCUPATION_CODE - 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * 设置职业类别代码GB/T 6565（本人当前职业类别的代码）
     *
     * @param occupationCode 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    /**
     * 获取婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @return MARITAL_STATUS_CODE - 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * 设置婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @param maritalStatusCode 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode == null ? null : maritalStatusCode.trim();
    }

    /**
     * 获取常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     *
     * @return IS_RESIDENCE_ADD - 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    public String getIsResidenceAdd() {
        return isResidenceAdd;
    }

    /**
     * 设置常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     *
     * @param isResidenceAdd 常住地址户籍标志0否 1是（标识本人的常住地址是否为户籍所在地）
     */
    public void setIsResidenceAdd(String isResidenceAdd) {
        this.isResidenceAdd = isResidenceAdd == null ? null : isResidenceAdd.trim();
    }

    /**
     * 获取卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     *
     * @return CARD_TYPE_CODE - 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * 设置卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     *
     * @param cardTypeCode 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     */
    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode == null ? null : cardTypeCode.trim();
    }

    /**
     * 获取医保卡类型代码CV07.10.003（医保卡类型在特定编码体系中的编码）
     *
     * @return HEALTHCARE_TYPE_CODE - 医保卡类型代码CV07.10.003（医保卡类型在特定编码体系中的编码）
     */
    public String getHealthcareTypeCode() {
        return healthcareTypeCode;
    }

    /**
     * 设置医保卡类型代码CV07.10.003（医保卡类型在特定编码体系中的编码）
     *
     * @param healthcareTypeCode 医保卡类型代码CV07.10.003（医保卡类型在特定编码体系中的编码）
     */
    public void setHealthcareTypeCode(String healthcareTypeCode) {
        this.healthcareTypeCode = healthcareTypeCode == null ? null : healthcareTypeCode.trim();
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
     * 获取健康档案管理机构的组织机构代码DIR_ORG（负责管理和维护个人健康档案的机构的组织机构代码）
     *
     * @return EHR_MANAGE_ORG_ID - 健康档案管理机构的组织机构代码DIR_ORG（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    public String getEhrManageOrgId() {
        return ehrManageOrgId;
    }

    /**
     * 设置健康档案管理机构的组织机构代码DIR_ORG（负责管理和维护个人健康档案的机构的组织机构代码）
     *
     * @param ehrManageOrgId 健康档案管理机构的组织机构代码DIR_ORG（负责管理和维护个人健康档案的机构的组织机构代码）
     */
    public void setEhrManageOrgId(String ehrManageOrgId) {
        this.ehrManageOrgId = ehrManageOrgId == null ? null : ehrManageOrgId.trim();
    }

    /**
     * 获取ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类别代码）
     *
     * @return BLOODTYPE_ABO - ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类别代码）
     */
    public String getBloodtypeAbo() {
        return bloodtypeAbo;
    }

    /**
     * 设置ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类别代码）
     *
     * @param bloodtypeAbo ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类别代码）
     */
    public void setBloodtypeAbo(String bloodtypeAbo) {
        this.bloodtypeAbo = bloodtypeAbo == null ? null : bloodtypeAbo.trim();
    }

    /**
     * 获取Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     *
     * @return BLOODTYPE_RH - Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    public String getBloodtypeRh() {
        return bloodtypeRh;
    }

    /**
     * 设置Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     *
     * @param bloodtypeRh Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    public void setBloodtypeRh(String bloodtypeRh) {
        this.bloodtypeRh = bloodtypeRh == null ? null : bloodtypeRh.trim();
    }

    /**
     * 获取药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     *
     * @return HAS_DRUG_ALLERGY - 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    public String getHasDrugAllergy() {
        return hasDrugAllergy;
    }

    /**
     * 设置药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     *
     * @param hasDrugAllergy 药物过敏史标志0无 1有（标识本人既往有无药物过敏经历）
     */
    public void setHasDrugAllergy(String hasDrugAllergy) {
        this.hasDrugAllergy = hasDrugAllergy == null ? null : hasDrugAllergy.trim();
    }

    /**
     * 获取手术史标志0无 1有（标识本人既往有无手术经历）
     *
     * @return HAS_OP_HISTORY - 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    public String getHasOpHistory() {
        return hasOpHistory;
    }

    /**
     * 设置手术史标志0无 1有（标识本人既往有无手术经历）
     *
     * @param hasOpHistory 手术史标志0无 1有（标识本人既往有无手术经历）
     */
    public void setHasOpHistory(String hasOpHistory) {
        this.hasOpHistory = hasOpHistory == null ? null : hasOpHistory.trim();
    }

    /**
     * 获取外伤史标志0无 1有（标识本人既往有无外伤经历）
     *
     * @return HAS_TRAUMA_HISTORY - 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    public String getHasTraumaHistory() {
        return hasTraumaHistory;
    }

    /**
     * 设置外伤史标志0无 1有（标识本人既往有无外伤经历）
     *
     * @param hasTraumaHistory 外伤史标志0无 1有（标识本人既往有无外伤经历）
     */
    public void setHasTraumaHistory(String hasTraumaHistory) {
        this.hasTraumaHistory = hasTraumaHistory == null ? null : hasTraumaHistory.trim();
    }

    /**
     * 获取输血史标志0无 1有（标识本人既往有无输血经历）
     *
     * @return HAS_BLOOD_TRANSF - 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    public String getHasBloodTransf() {
        return hasBloodTransf;
    }

    /**
     * 设置输血史标志0无 1有（标识本人既往有无输血经历）
     *
     * @param hasBloodTransf 输血史标志0无 1有（标识本人既往有无输血经历）
     */
    public void setHasBloodTransf(String hasBloodTransf) {
        this.hasBloodTransf = hasBloodTransf == null ? null : hasBloodTransf.trim();
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
    public String getHasAsthma() {
        return hasAsthma;
    }

    /**
     * 设置哮喘标志0无 1有（标志个人是否有哮喘）
     *
     * @param hasAsthma 哮喘标志0无 1有（标志个人是否有哮喘）
     */
    public void setHasAsthma(String hasAsthma) {
        this.hasAsthma = hasAsthma == null ? null : hasAsthma.trim();
    }

    /**
     * 获取心脏病标志0无 1有（标识个人是否存在心脏病）
     *
     * @return HAS_HEART_DISEASE - 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    public String getHasHeartDisease() {
        return hasHeartDisease;
    }

    /**
     * 设置心脏病标志0无 1有（标识个人是否存在心脏病）
     *
     * @param hasHeartDisease 心脏病标志0无 1有（标识个人是否存在心脏病）
     */
    public void setHasHeartDisease(String hasHeartDisease) {
        this.hasHeartDisease = hasHeartDisease == null ? null : hasHeartDisease.trim();
    }

    /**
     * 获取心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     *
     * @return HAS_CARDIOVASCULAR - 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    public String getHasCardiovascular() {
        return hasCardiovascular;
    }

    /**
     * 设置心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     *
     * @param hasCardiovascular 心脑血管病标志0无 1有（标识个人是否存在心脑血管病）
     */
    public void setHasCardiovascular(String hasCardiovascular) {
        this.hasCardiovascular = hasCardiovascular == null ? null : hasCardiovascular.trim();
    }

    /**
     * 获取癫痫病标志0无 1有（标识个人是否存在癫痫病）
     *
     * @return HAS_EPILEPSY - 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    public String getHasEpilepsy() {
        return hasEpilepsy;
    }

    /**
     * 设置癫痫病标志0无 1有（标识个人是否存在癫痫病）
     *
     * @param hasEpilepsy 癫痫病标志0无 1有（标识个人是否存在癫痫病）
     */
    public void setHasEpilepsy(String hasEpilepsy) {
        this.hasEpilepsy = hasEpilepsy == null ? null : hasEpilepsy.trim();
    }

    /**
     * 获取凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     *
     * @return HAS_COAGULOPATHY - 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    public String getHasCoagulopathy() {
        return hasCoagulopathy;
    }

    /**
     * 设置凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     *
     * @param hasCoagulopathy 凝血紊乱标志0无 1有（标识个人是否存在凝血紊乱）
     */
    public void setHasCoagulopathy(String hasCoagulopathy) {
        this.hasCoagulopathy = hasCoagulopathy == null ? null : hasCoagulopathy.trim();
    }

    /**
     * 获取糖尿病标志0无 1有（标识个人是否存在糖尿病）
     *
     * @return HAS_DIABETES - 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    public String getHasDiabetes() {
        return hasDiabetes;
    }

    /**
     * 设置糖尿病标志0无 1有（标识个人是否存在糖尿病）
     *
     * @param hasDiabetes 糖尿病标志0无 1有（标识个人是否存在糖尿病）
     */
    public void setHasDiabetes(String hasDiabetes) {
        this.hasDiabetes = hasDiabetes == null ? null : hasDiabetes.trim();
    }

    /**
     * 获取青光眼标志0无 1有（标识个人是否存在青光眼）
     *
     * @return HAS_GLAUCOMA - 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    public String getHasGlaucoma() {
        return hasGlaucoma;
    }

    /**
     * 设置青光眼标志0无 1有（标识个人是否存在青光眼）
     *
     * @param hasGlaucoma 青光眼标志0无 1有（标识个人是否存在青光眼）
     */
    public void setHasGlaucoma(String hasGlaucoma) {
        this.hasGlaucoma = hasGlaucoma == null ? null : hasGlaucoma.trim();
    }

    /**
     * 获取透析标志0无 1有（标识个人是否有透析）
     *
     * @return HAS_DIALYSIS - 透析标志0无 1有（标识个人是否有透析）
     */
    public String getHasDialysis() {
        return hasDialysis;
    }

    /**
     * 设置透析标志0无 1有（标识个人是否有透析）
     *
     * @param hasDialysis 透析标志0无 1有（标识个人是否有透析）
     */
    public void setHasDialysis(String hasDialysis) {
        this.hasDialysis = hasDialysis == null ? null : hasDialysis.trim();
    }

    /**
     * 获取器官移植标志0无 1有（标识个人是否存在器官移植）
     *
     * @return HAS_ORGAN_TRANSF - 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    public String getHasOrganTransf() {
        return hasOrganTransf;
    }

    /**
     * 设置器官移植标志0无 1有（标识个人是否存在器官移植）
     *
     * @param hasOrganTransf 器官移植标志0无 1有（标识个人是否存在器官移植）
     */
    public void setHasOrganTransf(String hasOrganTransf) {
        this.hasOrganTransf = hasOrganTransf == null ? null : hasOrganTransf.trim();
    }

    /**
     * 获取器官缺失标志0无 1有（标识个人是否存在器官缺失）
     *
     * @return HAS_ORGAN_DEFECT - 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    public String getHasOrganDefect() {
        return hasOrganDefect;
    }

    /**
     * 设置器官缺失标志0无 1有（标识个人是否存在器官缺失）
     *
     * @param hasOrganDefect 器官缺失标志0无 1有（标识个人是否存在器官缺失）
     */
    public void setHasOrganDefect(String hasOrganDefect) {
        this.hasOrganDefect = hasOrganDefect == null ? null : hasOrganDefect.trim();
    }

    /**
     * 获取可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     *
     * @return HAS_REMOVAL_PRO - 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    public String getHasRemovalPro() {
        return hasRemovalPro;
    }

    /**
     * 设置可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     *
     * @param hasRemovalPro 可装卸的义肢标志0无 1有（标识个人是否存在可装卸的义肢）
     */
    public void setHasRemovalPro(String hasRemovalPro) {
        this.hasRemovalPro = hasRemovalPro == null ? null : hasRemovalPro.trim();
    }

    /**
     * 获取心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     *
     * @return HAS_CARDIAC_PAC - 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    public String getHasCardiacPac() {
        return hasCardiacPac;
    }

    /**
     * 设置心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     *
     * @param hasCardiacPac 心脏起搏器标志0无 1有（标识个人是否存在心脏起搏器）
     */
    public void setHasCardiacPac(String hasCardiacPac) {
        this.hasCardiacPac = hasCardiacPac == null ? null : hasCardiacPac.trim();
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
    public String getHasPsychiatric() {
        return hasPsychiatric;
    }

    /**
     * 设置精神病标志0无 1有（标识个人是否存在精神病）
     *
     * @param hasPsychiatric 精神病标志0无 1有（标识个人是否存在精神病）
     */
    public void setHasPsychiatric(String hasPsychiatric) {
        this.hasPsychiatric = hasPsychiatric == null ? null : hasPsychiatric.trim();
    }

    /**
     * 获取疾病史(含外伤)（对卫生服务对象既往健康状况和疾病的详细描述）
     *
     * @return ILLNESS_HISTORY - 疾病史(含外伤)（对卫生服务对象既往健康状况和疾病的详细描述）
     */
    public String getIllnessHistory() {
        return illnessHistory;
    }

    /**
     * 设置疾病史(含外伤)（对卫生服务对象既往健康状况和疾病的详细描述）
     *
     * @param illnessHistory 疾病史(含外伤)（对卫生服务对象既往健康状况和疾病的详细描述）
     */
    public void setIllnessHistory(String illnessHistory) {
        this.illnessHistory = illnessHistory == null ? null : illnessHistory.trim();
    }

    /**
     * 获取免疫接种情况代码DIR_IMMUNITY_TREATMENT（卫生服务对象既往接受免疫接种历史的代码）
     *
     * @return VACC_HISTORY_CODE - 免疫接种情况代码DIR_IMMUNITY_TREATMENT（卫生服务对象既往接受免疫接种历史的代码）
     */
    public String getVaccHistoryCode() {
        return vaccHistoryCode;
    }

    /**
     * 设置免疫接种情况代码DIR_IMMUNITY_TREATMENT（卫生服务对象既往接受免疫接种历史的代码）
     *
     * @param vaccHistoryCode 免疫接种情况代码DIR_IMMUNITY_TREATMENT（卫生服务对象既往接受免疫接种历史的代码）
     */
    public void setVaccHistoryCode(String vaccHistoryCode) {
        this.vaccHistoryCode = vaccHistoryCode == null ? null : vaccHistoryCode.trim();
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
     * 获取事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @return EVENT_TYPE_CN - 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public String getEventTypeCn() {
        return eventTypeCn;
    }

    /**
     * 设置事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @param eventTypeCn 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public void setEventTypeCn(String eventTypeCn) {
        this.eventTypeCn = eventTypeCn == null ? null : eventTypeCn.trim();
    }
}