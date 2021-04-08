package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "IN_MEDICAL_RECORD_PAGE_CN")
public class InMedicalRecordPageCn {
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
     * 病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    @Column(name = "HEALTH_CARD_NO")
    private String healthCardNo;

    /**
     * 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 医疗费用支付方式代码CV07.10.003（就诊者或住院者对其所发生的医疗费用支付的方式代码）
     */
    @Column(name = "PAY_WAY_CODE")
    private String payWayCode;

    /**
     * 医疗费用支付方式中文名称（就诊者或住院者对其所发生的医疗费用支付的方式中文名称）
     */
    @Column(name = "PAY_WAY_CN")
    private String payWayCn;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private Integer hospitaltalizationTimes;

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
     * 出生日期（本人出生当日的公元纪年日期）
     */
    @Column(name = "BIRTH_DATE")
    private String birthDate;

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
     * 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    @Column(name = "COUNTRY_CN")
    private String countryCn;

    /**
     * 患者体重（kg)（患者体重）
     */
    @Column(name = "WEIGHT")
    private BigDecimal weight;

    /**
     * 新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    @Column(name = "BIRTH_WEIGHT")
    private Short birthWeight;

    /**
     * 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    @Column(name = "BABY_INPATIENT_WEIGHT")
    private Short babyInpatientWeight;

    /**
     * 出生地-省（自治区、直辖市）（患者出生时所在地点的省、自治区或直辖市名称）
     */
    @Column(name = "BIRTH_ADDR_PROVINCE")
    private String birthAddrProvince;

    /**
     * 出生地-市(地区、州)（患者出生时所在地点的市、地区或州的名称）
     */
    @Column(name = "BIRTH_ADDR_CITY")
    private String birthAddrCity;

    /**
     * 出生地-县(区）（患者出生时所在地点的县（区）的名称）
     */
    @Column(name = "BIRTH_ADDR_COUNTY")
    private String birthAddrCounty;

    /**
     * 籍贯-省（自治区、直辖市）（患者祖居地或原籍所在地的省、自治区或直辖市名称）
     */
    @Column(name = "NATIVE_PROVINCE")
    private String nativeProvince;

    /**
     * 籍贯-市(地区、州)（患者祖居地或原籍所在地的市、地区或州的名称）
     */
    @Column(name = "NATIVE_CITY")
    private String nativeCity;

    /**
     * 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    @Column(name = "NATIONALITY_CODE")
    private String nationalityCode;

    /**
     * 民族中文名称（患者所属民族在特定编码体系中的中文名称）
     */
    @Column(name = "NATIONALITY_CN")
    private String nationalityCn;

    /**
     * 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    @Column(name = "CREDENTIAL_TYPE_CODE")
    private String credentialTypeCode;

    /**
     * 证件类型中文名称（本人身份证件的类别中文名称）
     */
    @Column(name = "CREDENTIAL_TYPE_CN")
    private String credentialTypeCn;

    /**
     * 证件号码（身份证件上唯一的法定标识符）
     */
    @Column(name = "CREDENTIAL_NO")
    private String credentialNo;

    /**
     * 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;

    /**
     * 职业类别中文名称（本人当前职业类别的中文名称）
     */
    @Column(name = "OCCUPATION_CN")
    private String occupationCn;

    /**
     * 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    @Column(name = "MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    @Column(name = "MARRIAGE_CN")
    private String marriageCn;

    /**
     * 现住地址-省（自治区、直辖市）（患者来院前近期的常住地址的省、自治区或直辖市名称）
     */
    @Column(name = "PRESENT_ADDR_PROVINCE")
    private String presentAddrProvince;

    /**
     * 现住地址-市（地区、州）（本人现住地址中的市、地区或州的名称）
     */
    @Column(name = "PRESENT_ADDR_CITY")
    private String presentAddrCity;

    /**
     * 现住地址-县（区）（患者来院前近期的常住地址的县（区）的名称）
     */
    @Column(name = "PRESENT_ADDR_COUNTY")
    private String presentAddrCounty;

    /**
     * 现住地址-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    @Column(name = "PRESENT_ADDR_TOWN")
    private String presentAddrTown;

    /**
     * 现住地址-村（街、路、弄等）（本人现住地址中的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "PRESENT_ADDR_VILLAGE")
    private String presentAddrVillage;

    /**
     * 现住地址-门牌号码（本人现住地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "PRESENT_ADDR_HOUSE_NO")
    private String presentAddrHouseNo;

    /**
     * 现住地址-电话（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "PRESENT_ADDR_TEL_NO")
    private String presentAddrTelNo;

    /**
     * 现住地址-邮编（患者来院前近期的常住地址的邮政编码）
     */
    @Column(name = "PRESENT_ADDR_POSTAL_CODE")
    private String presentAddrPostalCode;

    /**
     * 户籍地址-省（自治区、直辖市）（患者户籍登记所在地址的省、自治区或直辖市名称）
     */
    @Column(name = "REGISTER_ADDR_PROVINCE")
    private String registerAddrProvince;

    /**
     * 户籍地址-市（地区、州）（患者户籍登记所在地址的市、地区或州的名称）
     */
    @Column(name = "REGISTER_ADDR_CITY")
    private String registerAddrCity;

    /**
     * 户籍地址-县（区)（患者户籍登记所在地址的县（区）的名称）
     */
    @Column(name = "REGISTER_ADDR_COUNTY")
    private String registerAddrCounty;

    /**
     * 户籍地址-乡(镇、街道办事处)（患者户籍登记所在地址的乡、镇或城市的街道办事处名称）
     */
    @Column(name = "REGISTER_ADDR_TOWN")
    private String registerAddrTown;

    /**
     * 户籍地址-村（街、路、弄等）（患者户籍登记所在地址的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "REGISTER_ADDR_VILLAGE")
    private String registerAddrVillage;

    /**
     * 户籍地址-门牌号码（患者户籍登记所在地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "REGISTER_ADDR_HOUSE_NO")
    private String registerAddrHouseNo;

    /**
     * 户籍地址-邮编（患者户籍登记所在地址的邮政编码）
     */
    @Column(name = "REGISTER_ADDR_POSTAL_CODE")
    private String registerAddrPostalCode;

    /**
     * 工作单位名称（患者在就诊前的工作单位名称）
     */
    @Column(name = "EMPLOYER_NAME")
    private String employerName;

    /**
     * 工作单位地址-省（自治区、直辖市）（患者当前所在的工作单位地址的省、自治区或直辖市名称）
     */
    @Column(name = "EMPLOYER_ADDR_PROVINCE")
    private String employerAddrProvince;

    /**
     * 工作单位地址-市（地区、州）（患者当前所在的工作单位地址的市、地区或州的名称）
     */
    @Column(name = "EMPLOYER_ADDR_CITY")
    private String employerAddrCity;

    /**
     * 工作单位地址-县（区）（患者当前所在的工作单位地址的县（区）的名称）
     */
    @Column(name = "EMPLOYER_ADDR_COUNTY")
    private String employerAddrCounty;

    /**
     * 工作单位地址-乡（镇、街道办事处）（患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称）
     */
    @Column(name = "EMPLOYER_ADDR_TOWN")
    private String employerAddrTown;

    /**
     * 工作单位地址-村（街、路、弄等）（患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "EMPLOYER_ADDR_VILLAGE")
    private String employerAddrVillage;

    /**
     * 工作单位地址-门牌号码（患者当前所在的工作单位地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "EMPLOYER_ADDR_HOUSE_NO")
    private String employerAddrHouseNo;

    /**
     * 工作单位-电话（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "EMPLOYER_TEL_NO")
    private String employerTelNo;

    /**
     * 工作单位-邮编（患者当前所在的工作单位地址的邮政编码）
     */
    @Column(name = "EMPLOYER_POSTAL_CODE")
    private String employerPostalCode;

    /**
     * 联系人-姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人-关系代码GB/T 4761（联系人与患者之间的关系类别代码）
     */
    @Column(name = "CONTACT_RELATION_CODE")
    private String contactRelationCode;

    /**
     * 联系人-关系中文名称（联系人与患者之间的关系类别中文名称）
     */
    @Column(name = "CONTACT_RELATION_CN")
    private String contactRelationCn;

    /**
     * 联系人地址-省（自治区、直辖市）（联系人当前常驻地址的省、自治区或直辖市名称）
     */
    @Column(name = "CONTACT_PROVINCE")
    private String contactProvince;

    /**
     * 联系人地址-市（地区、州）（联系人当前常驻地址的市、地区或州的名称）
     */
    @Column(name = "CONTACT_CITY")
    private String contactCity;

    /**
     * 联系人地址-县（区）（联系人当前常驻地址的的县（区）的名称）
     */
    @Column(name = "CONTACT_COUNTY")
    private String contactCounty;

    /**
     * 联系人地址-乡（镇、街道办事处）（联系人当前常驻地址的乡、镇或城市的街道办事处名称）
     */
    @Column(name = "CONTACT_TOWN")
    private String contactTown;

    /**
     * 联系人地址-村（街、路、弄等）（联系人当前常驻地址的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "CONTACT_VILLAGE")
    private String contactVillage;

    /**
     * 联系人地址-门牌号码（联系人当前常驻地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "CONTACT_HOUS_NO")
    private String contactHousNo;

    /**
     * 联系人电话号码（联系人的电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "CONTACT_TEL_NO")
    private String contactTelNo;

    /**
     * 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    @Column(name = "INPATIENT_PATH_CODE")
    private String inpatientPathCode;

    /**
     * 入院途径中文名称（患者收治入院治疗的来源分类在特定编码体系中的中文名称）
     */
    @Column(name = "INPATIENT_PATH_CN")
    private String inpatientPathCn;

    /**
     * 治疗类别代码CV06.00.225（对患者采用的医学治疗方法类别在特定编码体系中的代码）
     */
    @Column(name = "INPATIENT_TYPE_CODE")
    private String inpatientTypeCode;

    /**
     * 治疗类别中文名称（对患者采用的医学治疗方法类别在特定编码体系中的中文名称）
     */
    @Column(name = "INPATIENT_TYPE_CN")
    private String inpatientTypeCn;

    /**
     * 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 入院科室编码DIR_DEPT（患者入院时，入住的科室编码）
     */
    @Column(name = "INPATIENT_DEPT_CODE")
    private String inpatientDeptCode;

    /**
     * 入院科室中文名称（患者入院时，入住的科室中文名称）
     */
    @Column(name = "INPATIENT_DEPT_CN")
    private String inpatientDeptCn;

    /**
     * 入院病房（患者入院时，所住病房对应的编号）
     */
    @Column(name = "INPATIENT_ROOM_NO")
    private String inpatientRoomNo;

    /**
     * 转科科室代码DIR_DEPT（患者住院期间转科的转入科室代码）
     */
    @Column(name = "MOVE_DEPT_CODE")
    private String moveDeptCode;

    /**
     * 转科科室中文名称（患者住院期间转科的转入科室中文名称,如果超过一次以上的转科，用“→”转接表示）
     */
    @Column(name = "MOVE_DEPT_CN")
    private String moveDeptCn;

    /**
     * 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 出院科室代码DIR_DEPT（患者出院时的科室代码）
     */
    @Column(name = "OUTPATIENT_DEPT_CODE")
    private String outpatientDeptCode;

    /**
     * 出院科室中文名称（患者出院时的科室中文名称）
     */
    @Column(name = "OUTPATIENT_DEPT_CN")
    private String outpatientDeptCn;

    /**
     * 出院病房（患者入院时，所住病房对应的编号）
     */
    @Column(name = "OUTPATIENT_ROOM_NO")
    private String outpatientRoomNo;

    /**
     * 实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     */
    @Column(name = "ACTUAL_IN_DAYS")
    private Integer actualInDays;

    /**
     * 实施临床路径标志代码DIR_CLINICAL_PATHWAY_CARD（是否实施临床路径或实施临床路径的中、西医类别的分类代码）
     */
    @Column(name = "CLINICAL_PATHWAY_CODE")
    private String clinicalPathwayCode;

    /**
     * 实施临床路径标志中文名称（是否实施临床路径或实施临床路径的中、西医类别的分类中文名称）
     */
    @Column(name = "CLINICAL_PATHWAY_CN")
    private String clinicalPathwayCn;

    /**
     * 使用医疗机构中药制剂标志0否 1是（标识是否使用了医疗机构中药制剂的标志）
     */
    @Column(name = "TCM_MEDICAL_ORG_MARK")
    private String tcmMedicalOrgMark;

    /**
     * 使用中医诊疗设备标志0否 1是（标识是否使用了中医诊疗设备的标志）
     */
    @Column(name = "TCM_DIAG_TREAT_DEVICE_MARK")
    private String tcmDiagTreatDeviceMark;

    /**
     * 使用中医诊疗技术标志0否 1是（标识是否使用了中医诊疗技术的标志）
     */
    @Column(name = "TCM_DIAG_TREAT_TECH_MARK")
    private String tcmDiagTreatTechMark;

    /**
     * 辨证施护标志0否 1是（标识是否进行辨证施护的标志）
     */
    @Column(name = "SYNDROME_NURSING_MARK")
    private String syndromeNursingMark;

    /**
     * 中医门（急）诊诊断编码GB/T 15657（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    @Column(name = "TCM_OUTPATIENT_DIAG_CODE")
    private String tcmOutpatientDiagCode;

    /**
     * 中医门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    @Column(name = "TCM_OUTPATIENT_DIAG_NAME")
    private String tcmOutpatientDiagName;

    /**
     * 门（急）诊诊断编码ICD-10（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    @Column(name = "OUTPATIENT_DIAG_CODE")
    private String outpatientDiagCode;

    /**
     * 门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    @Column(name = "OUTPATIENT_DIAG_NAME")
    private String outpatientDiagName;

    /**
     * 损伤、中毒的疾病编码ICD-10（损伤中毒的外部原因在特定编码体系中的编码）
     */
    @Column(name = "DAMAGE_POISON_CODE")
    private String damagePoisonCode;

    /**
     * 损伤、中毒的疾病中文名称（损伤中毒的外部原因在特定编码体系中的中文名称）
     */
    @Column(name = "DAMAGE_POISON_CN")
    private String damagePoisonCn;

    /**
     * 损伤、中毒的外部原因（造成损伤的外部原因及引起中毒的物质名称）
     */
    @Column(name = "DAMAGE_POISON_REASON")
    private String damagePoisonReason;

    /**
     * 病理号（按照一定的编码规则赋予病理标本的编号）
     */
    @Column(name = "PATHOLOGICAL_NO")
    private String pathologicalNo;

    /**
     * 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    @Column(name = "DRUG_ALLERGY_MARK")
    private String drugAllergyMark;

    /**
     * 过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     */
    @Column(name = "DRUG_ALLERGENS_NAME")
    private String drugAllergensName;

    /**
     * 死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     */
    @Column(name = "AUTOPSY_MARK")
    private String autopsyMark;

    /**
     * ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类类别代码）
     */
    @Column(name = "ABO_CODE")
    private String aboCode;

    /**
     * ABO血型中文名称（按照ABO血型系统决定的本人血型类类别中文名称）
     */
    @Column(name = "ABO_CN")
    private String aboCn;

    /**
     * Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    @Column(name = "RH_CODE")
    private String rhCode;

    /**
     * Rh血型中文名称（按照Rh血型系统决定的本人血型类别中文名称）
     */
    @Column(name = "RH_CN")
    private String rhCn;

    /**
     * 科主任：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "DEPT_DIRECTOR_ID")
    private String deptDirectorId;

    /**
     * 科主任：姓名（患者出院时所在科室的科主任签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DEPT_DIRECTOR_NAME")
    private String deptDirectorName;

    /**
     * 主任（副主任）医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "CHIEF_DOCTOR_ID")
    private String chiefDoctorId;

    /**
     * 主任（副主任）医师：姓名（患者出院时所在科室的具有副主任医师以上专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHIEF_DOCTOR_NAME")
    private String chiefDoctorName;

    /**
     * 主治医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "CHARGE_DOCTOR_ID")
    private String chargeDoctorId;

    /**
     * 主治医师：姓名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHARGE_DOCTOR_NAME")
    private String chargeDoctorName;

    /**
     * 住院医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "RESIDENT_DOCTOR_ID")
    private String residentDoctorId;

    /**
     * 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 责任护士：编号 （医疗服务人员的唯一编号）
     */
    @Column(name = "RESP_NURSE_ID")
    private String respNurseId;

    /**
     * 责任护士：姓名（患者出院时所在的，并已开展责任制护理的科室，负责患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESP_NURSE_NAME")
    private String respNurseName;

    /**
     * 进修医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "LEARNING_DOCTOR_ID")
    private String learningDoctorId;

    /**
     * 进修医师：姓名（在患者出院时所在科室进修并参与患者诊治的进修医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "LEARNING_DOCTOR_NAME")
    private String learningDoctorName;

    /**
     * 实习医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "INTERN_DOCTOR_ID")
    private String internDoctorId;

    /**
     * 实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "INTERN_DOCTOR_NAME")
    private String internDoctorName;

    /**
     * 编码员：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "CATALOGER_ID")
    private String catalogerId;

    /**
     * 编码员：姓名（负责病案编目的分类人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CATALOGER_NAME")
    private String catalogerName;

    /**
     * 病案质量代码DIR_CASE_QUALITY（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类代码）
     */
    @Column(name = "CASE_QUALITY_CODE")
    private String caseQualityCode;

    /**
     * 病案质量中文名称（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类中文名称）
     */
    @Column(name = "CASE_QUALITY_CN")
    private String caseQualityCn;

    /**
     * 质控医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "QC_DOCTOR_ID")
    private String qcDoctorId;

    /**
     * 质控医师：姓名（对病案终末质量进行检查的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "QC_DOCTOR_NAME")
    private String qcDoctorName;

    /**
     * 质控护士：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "QC_NURSE_ID")
    private String qcNurseId;

    /**
     * 质控护士：姓名（对病案终末质量进行检查的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "QC_NURSE_NAME")
    private String qcNurseName;

    /**
     * 质控日期（对病案终末质量进行检查及评价的公元纪年日期的完整描述）
     */
    @Column(name = "QC_DATE")
    private String qcDate;

    /**
     * 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    @Column(name = "DISCHARGE_CLASS_CODE")
    private String dischargeClassCode;

    /**
     * 离院方式中文名称（患者本次住院离开医院的方式在特定编码体系中的中文名称）
     */
    @Column(name = "DISCHARGE_CLASS_CN")
    private String dischargeClassCn;

    /**
     * 医嘱转院-医疗机构名称（患者本次住院所在的医疗机构根据诊疗需要，拟将患者转往的其他医疗机构的名称）
     */
    @Column(name = "ORDER_REFERRAL_ORG")
    private String orderReferralOrg;

    /**
     * 出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     */
    @Column(name = "REHOSP_AFTER31_MARK")
    private String rehospAfter31Mark;

    /**
     * 出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     */
    @Column(name = "REHOSP_AFTER31_PURPOSE")
    private String rehospAfter31Purpose;

    /**
     * 颅脑损伤患者入院前昏迷时间（天）（颅脑损伤患者入院前昏迷时间的天数）
     */
    @Column(name = "COMA_DURATION_BEFORE_DAYS")
    private Integer comaDurationBeforeDays;

    /**
     * 颅脑损伤患者入院前昏迷时间（小时）（颅脑损伤患者入院前昏迷时间的小时数）
     */
    @Column(name = "COMA_DURATION_BEFORE_HOURS")
    private Integer comaDurationBeforeHours;

    /**
     * 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    @Column(name = "COMA_DURATION_BEFORE_MINUTES")
    private Integer comaDurationBeforeMinutes;

    /**
     * 颅脑损伤患者入院后昏迷时间（天）（颅脑损伤患者入院后昏迷时间的天数）
     */
    @Column(name = "COMA_DURATION_AFTER_DAYS")
    private Integer comaDurationAfterDays;

    /**
     * 颅脑损伤患者入院后昏迷时间（小时）（颅脑损伤患者入院后昏迷时间的小时数）
     */
    @Column(name = "COMA_DURATION_AFTER_HOURS")
    private Integer comaDurationAfterHours;

    /**
     * 颅脑损伤患者入院后昏迷时间（min）（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    @Column(name = "COMA_DURATION_AFTER_MINUTES")
    private Integer comaDurationAfterMinutes;

    /**
     * 住院总费用（患者在住院期间所有项目的费用之和，计量单位为元）
     */
    @Column(name = "FEE_TOTAL")
    private BigDecimal feeTotal;

    /**
     * 住院自付金额（以除全自费以外方式付费的患者的住院总费用中，由患者支付的费用金额，计量单位为元）
     */
    @Column(name = "FEE_SELF_PAY")
    private BigDecimal feeSelfPay;

    /**
     * 综合医疗服务类-一般医疗服务费（各科室共同使用的医疗服务项目，包括诊查费、床位费、会诊费、营养咨询等的费用，计量单位为元）
     */
    @Column(name = "FEE_GENERAL_MEDICAL")
    private BigDecimal feeGeneralMedical;

    /**
     * 综合医疗服务类-一般医疗服务费-中医辨证论治费（包括普通门诊、副主任医师门诊、主任医师门诊、国医大师门诊、急诊、门/急诊留观及住院中医辨证论治费）
     */
    @Column(name = "FEE_GENERAL_TCM_TREATMENT")
    private BigDecimal feeGeneralTcmTreatment;

    /**
     * 综合医疗服务类-一般医疗服务费-中医辨证论治会诊费（包括院际、院内及远程中医辨证论治会诊费）
     */
    @Column(name = "FEE_GENERAL_TCM_CONSULT")
    private BigDecimal feeGeneralTcmConsult;

    /**
     * 综合医疗服务类-一般治疗操作费（各科室共同使用的医疗服务项目，包括注射、清创、换药、导尿、吸氧、抢救、重症监护等的费用，计量单位为元）
     */
    @Column(name = "FEE_GENERAL_TREATMENT")
    private BigDecimal feeGeneralTreatment;

    /**
     * 综合医疗服务类-护理费（患者住院期间等级护理费用及专项护理费用，计量单位为元）
     */
    @Column(name = "FEE_NURSING")
    private BigDecimal feeNursing;

    /**
     * 综合医疗服务其他费用（各科室共同使用的医疗服务项目，包括病房取暖费、病房空调费、救护车使用费、尸体料理费等的费用，计量单位为元）
     */
    @Column(name = "FEE_MEDICAL_OTHER")
    private BigDecimal feeMedicalOther;

    /**
     * 诊断类-病理诊断费（患者住院期间进行病理学有关检查项目的费用，计量单位为元）
     */
    @Column(name = "FEE_PATHOLOGY")
    private BigDecimal feePathology;

    /**
     * 诊断类-实验室诊断费（患者住院期间进行各项实验室检验的费用，计量单位为元）
     */
    @Column(name = "FEE_LABORATORY")
    private BigDecimal feeLaboratory;

    /**
     * 诊断类-影像学诊断费（患者住院期间进行透视、造影、CT、磁共振检查、B超检查、核素扫描、PET 等影像学检查的费用，计量单位为元）
     */
    @Column(name = "FEE_IMAGING")
    private BigDecimal feeImaging;

    /**
     * 诊断类-临床诊断项目费（临床科室开展的其他用于诊断的各种检查项目的费用，包括有关内镜检查、肛门指诊、视力检测等项目费用，计量单位为元）
     */
    @Column(name = "FEE_CLINC")
    private BigDecimal feeClinc;

    /**
     * 治疗类-非手术治疗项目费（临床利用无创手段进行治疗的项目产生的费用包括高压氧舱、血液净化、精神治疗、临床物理治疗等，计量单位为元）
     */
    @Column(name = "FEE_NONSURGICAL_TREAT")
    private BigDecimal feeNonsurgicalTreat;

    /**
     * 治疗类-临床物理治疗费（临床利用光、电、热等外界物理因素进行治疗的项目产生的费用，如放射治疗、放射性核素治疗、聚焦超声治疗等项目产生的费用，计量单位为元）
     */
    @Column(name = "FEE_CLIN_PHYSICAL")
    private BigDecimal feeClinPhysical;

    /**
     * 治疗类-手术治疗费（临床利用有创手段进行治疗的项目产生的费用包括麻醉费及各种介入、孕产、手术治疗等费用，计量单位为元）
     */
    @Column(name = "FEE_SURGICAL_TREAT")
    private BigDecimal feeSurgicalTreat;

    /**
     * 治疗类-手术治疗费-麻醉费（手术治疗费中麻醉产生的费用，计量单位为元）
     */
    @Column(name = "FEE_ANAES")
    private BigDecimal feeAnaes;

    /**
     * 治疗类-手术治疗费-手术费（手术治疗费中手术产生的费用，计量单位为元）
     */
    @Column(name = "FEE_OPERATION")
    private BigDecimal feeOperation;

    /**
     * 康复类-康复费（对患者进行康复治疗产生的费用，包括康复评定和治疗，计量单位为元）
     */
    @Column(name = "FEE_RECOVERY")
    private BigDecimal feeRecovery;

    /**
     * 中医类-中医诊断费（经络穴位诊断、经络穴位分析、耳穴诊断、脉图诊断、舌象图诊断等中医诊断所产生的费用）
     */
    @Column(name = "FEE_TCM_DIAG")
    private BigDecimal feeTcmDiag;

    /**
     * 中医类-中医治疗费（利用中医手段进行治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_TREATMENT")
    private BigDecimal feeTcmTreatment;

    /**
     * 中医类-中医治疗费-中医外治费（采用中医外治方法进行治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_FOREIGN_RULE")
    private BigDecimal feeTcmForeignRule;

    /**
     * 中医类-中医治疗费-中医骨伤费（采用中医骨伤整复技术进行治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_ORTHOPE_DICS")
    private BigDecimal feeTcmOrthopeDics;

    /**
     * 中医类-中医治疗费-针刺与灸法费（采用中医针灸进行治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_ACU_MOXI")
    private BigDecimal feeTcmAcuMoxi;

    /**
     * 中医类-中医治疗费-中医推拿治疗费（采用中医推拿进行治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_MASSAGE")
    private BigDecimal feeTcmMassage;

    /**
     * 中医类-中医治疗费-中医肛肠治疗费（采用中医方法治疗肛肠疾病所产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_ANORECTAL")
    private BigDecimal feeTcmAnorectal;

    /**
     * 中医类-中医治疗费-中医特殊治疗费（采用中医特殊治疗产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_SPECIAL")
    private BigDecimal feeTcmSpecial;

    /**
     * 中医类-中医其他费（中医特殊调配加工费和辨证施膳费）
     */
    @Column(name = "FEE_TCM_OTHER")
    private BigDecimal feeTcmOther;

    /**
     * 中医类-中医其他费-中医特殊调配加工费（中药调配、煎煮、加工等产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_SPECIAL_MIX")
    private BigDecimal feeTcmSpecialMix;

    /**
     * 中医类-中医其他费-辨证施膳费（中医辨证施膳指导所产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_DRUG_FOOD")
    private BigDecimal feeTcmDrugFood;

    /**
     * 西药类-西药费（患者住院期间使用西药所产生的费用，计量单位为元）
     */
    @Column(name = "FEE_WESTERN_MEDICINE")
    private BigDecimal feeWesternMedicine;

    /**
     * 西药类-西药费-抗菌药物费用（患者住院期间使用抗菌药物所产生的费用，包含于西药费中，计量单位为元）
     */
    @Column(name = "FEE_ANTIMICROBIAL")
    private BigDecimal feeAntimicrobial;

    /**
     * 中药类-中成药费（患者住院期间使用中成药所产生的费用，计量单位为元。中成药是指以中草药为原料，经制剂加工制成各种不同剂型的中药制品）
     */
    @Column(name = "FEE_TCM_MEDICINE")
    private BigDecimal feeTcmMedicine;

    /**
     * 中药类-中成药费-医疗机构中药制剂费（患者住院期间使用医疗机构中药制剂所产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_ORG_MEDICINE")
    private BigDecimal feeTcmOrgMedicine;

    /**
     * 中药类-中草药费（患者住院期间使用中草药所产生的费用，计量单位为元）
     */
    @Column(name = "FEE_TCM_HERBAL_MEDICINE")
    private BigDecimal feeTcmHerbalMedicine;

    /**
     * 血液和血液制品类-血费（患者住院期间使用临床用血所产生的费用，包括输注全血、红细胞、血小板、白细胞、血浆的费用医疗机构对患者临床用血的收费包括血站供应价格、配血费和储血费，计量单位为元）
     */
    @Column(name = "FEE_BLOOD")
    private BigDecimal feeBlood;

    /**
     * 血液和血液制品类-白蛋白类制品费（患者住院期间使用白蛋白的费用，计量单位为元）
     */
    @Column(name = "FEE_ALBUMIN")
    private BigDecimal feeAlbumin;

    /**
     * 血液和血液制品类-球蛋白类制品费（患者住院期间使用球蛋白的费用，计量单位为元）
     */
    @Column(name = "FEE_GLOBULIN")
    private BigDecimal feeGlobulin;

    /**
     * 血液和血液制品类-凝血因子类制品费（患者住院期间使用凝血因子的费用，计量单位为元）
     */
    @Column(name = "FEE_BCF")
    private BigDecimal feeBcf;

    /**
     * 血液和血液制品类-细胞因子类制品费（患者住院期间使用细胞因子的费用，计量单位为元）
     */
    @Column(name = "FEE_CYTOKINE")
    private BigDecimal feeCytokine;

    /**
     * 耗材类-检查用一次性医用材料费（患者住院期间检查检验所使用的一次性医用材料费用，计量单位为元）
     */
    @Column(name = "FEE_CHECK_MATERIAL")
    private BigDecimal feeCheckMaterial;

    /**
     * 耗材类-治疗用一次性医用材料费（患者住院期间治疗所使用的一次性医用材料费用，计量单位为元）
     */
    @Column(name = "FEE_TREAT_MATERIAL")
    private BigDecimal feeTreatMaterial;

    /**
     * 耗材类-手术用一次性医用材料费（患者住院期间进行手术、介入操作时所使用的一次性医用材料费用，计量单位为元）
     */
    @Column(name = "FEE_OPER_MATERIAL")
    private BigDecimal feeOperMaterial;

    /**
     * 其他类-其他费（患者住院期间未能归入以上各类的费用总和，计量单位为元）
     */
    @Column(name = "FEE_OTHER")
    private BigDecimal feeOther;

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
     * 获取病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
    }

    /**
     * 获取居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @return HEALTH_CARD_NO - 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public String getHealthCardNo() {
        return healthCardNo;
    }

    /**
     * 设置居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @param healthCardNo 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo == null ? null : healthCardNo.trim();
    }

    /**
     * 获取病案号（个体在医疗机构住院或建立家庭病床的病案号）
     *
     * @return CASE_NO - 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（个体在医疗机构住院或建立家庭病床的病案号）
     *
     * @param caseNo 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取医疗费用支付方式代码CV07.10.003（就诊者或住院者对其所发生的医疗费用支付的方式代码）
     *
     * @return PAY_WAY_CODE - 医疗费用支付方式代码CV07.10.003（就诊者或住院者对其所发生的医疗费用支付的方式代码）
     */
    public String getPayWayCode() {
        return payWayCode;
    }

    /**
     * 设置医疗费用支付方式代码CV07.10.003（就诊者或住院者对其所发生的医疗费用支付的方式代码）
     *
     * @param payWayCode 医疗费用支付方式代码CV07.10.003（就诊者或住院者对其所发生的医疗费用支付的方式代码）
     */
    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode == null ? null : payWayCode.trim();
    }

    /**
     * 获取医疗费用支付方式中文名称（就诊者或住院者对其所发生的医疗费用支付的方式中文名称）
     *
     * @return PAY_WAY_CN - 医疗费用支付方式中文名称（就诊者或住院者对其所发生的医疗费用支付的方式中文名称）
     */
    public String getPayWayCn() {
        return payWayCn;
    }

    /**
     * 设置医疗费用支付方式中文名称（就诊者或住院者对其所发生的医疗费用支付的方式中文名称）
     *
     * @param payWayCn 医疗费用支付方式中文名称（就诊者或住院者对其所发生的医疗费用支付的方式中文名称）
     */
    public void setPayWayCn(String payWayCn) {
        this.payWayCn = payWayCn == null ? null : payWayCn.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @return HOSPITALTALIZATION_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public Integer getHospitaltalizationTimes() {
        return hospitaltalizationTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @param hospitaltalizationTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public void setHospitaltalizationTimes(Integer hospitaltalizationTimes) {
        this.hospitaltalizationTimes = hospitaltalizationTimes;
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
     * 获取出生日期（本人出生当日的公元纪年日期）
     *
     * @return BIRTH_DATE - 出生日期（本人出生当日的公元纪年日期）
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期（本人出生当日的公元纪年日期）
     *
     * @param birthDate 出生日期（本人出生当日的公元纪年日期）
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
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
     * 获取国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     *
     * @return COUNTRY_CN - 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public String getCountryCn() {
        return countryCn;
    }

    /**
     * 设置国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     *
     * @param countryCn 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    /**
     * 获取患者体重（kg)（患者体重）
     *
     * @return WEIGHT - 患者体重（kg)（患者体重）
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置患者体重（kg)（患者体重）
     *
     * @param weight 患者体重（kg)（患者体重）
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     *
     * @return BIRTH_WEIGHT - 新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    public Short getBirthWeight() {
        return birthWeight;
    }

    /**
     * 设置新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     *
     * @param birthWeight 新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    public void setBirthWeight(Short birthWeight) {
        this.birthWeight = birthWeight;
    }

    /**
     * 获取新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     *
     * @return BABY_INPATIENT_WEIGHT - 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    public Short getBabyInpatientWeight() {
        return babyInpatientWeight;
    }

    /**
     * 设置新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     *
     * @param babyInpatientWeight 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    public void setBabyInpatientWeight(Short babyInpatientWeight) {
        this.babyInpatientWeight = babyInpatientWeight;
    }

    /**
     * 获取出生地-省（自治区、直辖市）（患者出生时所在地点的省、自治区或直辖市名称）
     *
     * @return BIRTH_ADDR_PROVINCE - 出生地-省（自治区、直辖市）（患者出生时所在地点的省、自治区或直辖市名称）
     */
    public String getBirthAddrProvince() {
        return birthAddrProvince;
    }

    /**
     * 设置出生地-省（自治区、直辖市）（患者出生时所在地点的省、自治区或直辖市名称）
     *
     * @param birthAddrProvince 出生地-省（自治区、直辖市）（患者出生时所在地点的省、自治区或直辖市名称）
     */
    public void setBirthAddrProvince(String birthAddrProvince) {
        this.birthAddrProvince = birthAddrProvince == null ? null : birthAddrProvince.trim();
    }

    /**
     * 获取出生地-市(地区、州)（患者出生时所在地点的市、地区或州的名称）
     *
     * @return BIRTH_ADDR_CITY - 出生地-市(地区、州)（患者出生时所在地点的市、地区或州的名称）
     */
    public String getBirthAddrCity() {
        return birthAddrCity;
    }

    /**
     * 设置出生地-市(地区、州)（患者出生时所在地点的市、地区或州的名称）
     *
     * @param birthAddrCity 出生地-市(地区、州)（患者出生时所在地点的市、地区或州的名称）
     */
    public void setBirthAddrCity(String birthAddrCity) {
        this.birthAddrCity = birthAddrCity == null ? null : birthAddrCity.trim();
    }

    /**
     * 获取出生地-县(区）（患者出生时所在地点的县（区）的名称）
     *
     * @return BIRTH_ADDR_COUNTY - 出生地-县(区）（患者出生时所在地点的县（区）的名称）
     */
    public String getBirthAddrCounty() {
        return birthAddrCounty;
    }

    /**
     * 设置出生地-县(区）（患者出生时所在地点的县（区）的名称）
     *
     * @param birthAddrCounty 出生地-县(区）（患者出生时所在地点的县（区）的名称）
     */
    public void setBirthAddrCounty(String birthAddrCounty) {
        this.birthAddrCounty = birthAddrCounty == null ? null : birthAddrCounty.trim();
    }

    /**
     * 获取籍贯-省（自治区、直辖市）（患者祖居地或原籍所在地的省、自治区或直辖市名称）
     *
     * @return NATIVE_PROVINCE - 籍贯-省（自治区、直辖市）（患者祖居地或原籍所在地的省、自治区或直辖市名称）
     */
    public String getNativeProvince() {
        return nativeProvince;
    }

    /**
     * 设置籍贯-省（自治区、直辖市）（患者祖居地或原籍所在地的省、自治区或直辖市名称）
     *
     * @param nativeProvince 籍贯-省（自治区、直辖市）（患者祖居地或原籍所在地的省、自治区或直辖市名称）
     */
    public void setNativeProvince(String nativeProvince) {
        this.nativeProvince = nativeProvince == null ? null : nativeProvince.trim();
    }

    /**
     * 获取籍贯-市(地区、州)（患者祖居地或原籍所在地的市、地区或州的名称）
     *
     * @return NATIVE_CITY - 籍贯-市(地区、州)（患者祖居地或原籍所在地的市、地区或州的名称）
     */
    public String getNativeCity() {
        return nativeCity;
    }

    /**
     * 设置籍贯-市(地区、州)（患者祖居地或原籍所在地的市、地区或州的名称）
     *
     * @param nativeCity 籍贯-市(地区、州)（患者祖居地或原籍所在地的市、地区或州的名称）
     */
    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity == null ? null : nativeCity.trim();
    }

    /**
     * 获取民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     *
     * @return NATIONALITY_CODE - 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * 设置民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     *
     * @param nationalityCode 民族代码GB/T 3304（患者所属民族在特定编码体系中的代码）
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode == null ? null : nationalityCode.trim();
    }

    /**
     * 获取民族中文名称（患者所属民族在特定编码体系中的中文名称）
     *
     * @return NATIONALITY_CN - 民族中文名称（患者所属民族在特定编码体系中的中文名称）
     */
    public String getNationalityCn() {
        return nationalityCn;
    }

    /**
     * 设置民族中文名称（患者所属民族在特定编码体系中的中文名称）
     *
     * @param nationalityCn 民族中文名称（患者所属民族在特定编码体系中的中文名称）
     */
    public void setNationalityCn(String nationalityCn) {
        this.nationalityCn = nationalityCn == null ? null : nationalityCn.trim();
    }

    /**
     * 获取证件类型代码CV02.01.101（本人身份证件的类别代码）
     *
     * @return CREDENTIAL_TYPE_CODE - 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    public String getCredentialTypeCode() {
        return credentialTypeCode;
    }

    /**
     * 设置证件类型代码CV02.01.101（本人身份证件的类别代码）
     *
     * @param credentialTypeCode 证件类型代码CV02.01.101（本人身份证件的类别代码）
     */
    public void setCredentialTypeCode(String credentialTypeCode) {
        this.credentialTypeCode = credentialTypeCode == null ? null : credentialTypeCode.trim();
    }

    /**
     * 获取证件类型中文名称（本人身份证件的类别中文名称）
     *
     * @return CREDENTIAL_TYPE_CN - 证件类型中文名称（本人身份证件的类别中文名称）
     */
    public String getCredentialTypeCn() {
        return credentialTypeCn;
    }

    /**
     * 设置证件类型中文名称（本人身份证件的类别中文名称）
     *
     * @param credentialTypeCn 证件类型中文名称（本人身份证件的类别中文名称）
     */
    public void setCredentialTypeCn(String credentialTypeCn) {
        this.credentialTypeCn = credentialTypeCn == null ? null : credentialTypeCn.trim();
    }

    /**
     * 获取证件号码（身份证件上唯一的法定标识符）
     *
     * @return CREDENTIAL_NO - 证件号码（身份证件上唯一的法定标识符）
     */
    public String getCredentialNo() {
        return credentialNo;
    }

    /**
     * 设置证件号码（身份证件上唯一的法定标识符）
     *
     * @param credentialNo 证件号码（身份证件上唯一的法定标识符）
     */
    public void setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo == null ? null : credentialNo.trim();
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
     * 获取职业类别中文名称（本人当前职业类别的中文名称）
     *
     * @return OCCUPATION_CN - 职业类别中文名称（本人当前职业类别的中文名称）
     */
    public String getOccupationCn() {
        return occupationCn;
    }

    /**
     * 设置职业类别中文名称（本人当前职业类别的中文名称）
     *
     * @param occupationCn 职业类别中文名称（本人当前职业类别的中文名称）
     */
    public void setOccupationCn(String occupationCn) {
        this.occupationCn = occupationCn == null ? null : occupationCn.trim();
    }

    /**
     * 获取婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @return MARRIAGE_CODE - 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * 设置婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @param marriageCode 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
    }

    /**
     * 获取婚姻状况中文名称（本人当前婚姻状况中文名称）
     *
     * @return MARRIAGE_CN - 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    public String getMarriageCn() {
        return marriageCn;
    }

    /**
     * 设置婚姻状况中文名称（本人当前婚姻状况中文名称）
     *
     * @param marriageCn 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    public void setMarriageCn(String marriageCn) {
        this.marriageCn = marriageCn == null ? null : marriageCn.trim();
    }

    /**
     * 获取现住地址-省（自治区、直辖市）（患者来院前近期的常住地址的省、自治区或直辖市名称）
     *
     * @return PRESENT_ADDR_PROVINCE - 现住地址-省（自治区、直辖市）（患者来院前近期的常住地址的省、自治区或直辖市名称）
     */
    public String getPresentAddrProvince() {
        return presentAddrProvince;
    }

    /**
     * 设置现住地址-省（自治区、直辖市）（患者来院前近期的常住地址的省、自治区或直辖市名称）
     *
     * @param presentAddrProvince 现住地址-省（自治区、直辖市）（患者来院前近期的常住地址的省、自治区或直辖市名称）
     */
    public void setPresentAddrProvince(String presentAddrProvince) {
        this.presentAddrProvince = presentAddrProvince == null ? null : presentAddrProvince.trim();
    }

    /**
     * 获取现住地址-市（地区、州）（本人现住地址中的市、地区或州的名称）
     *
     * @return PRESENT_ADDR_CITY - 现住地址-市（地区、州）（本人现住地址中的市、地区或州的名称）
     */
    public String getPresentAddrCity() {
        return presentAddrCity;
    }

    /**
     * 设置现住地址-市（地区、州）（本人现住地址中的市、地区或州的名称）
     *
     * @param presentAddrCity 现住地址-市（地区、州）（本人现住地址中的市、地区或州的名称）
     */
    public void setPresentAddrCity(String presentAddrCity) {
        this.presentAddrCity = presentAddrCity == null ? null : presentAddrCity.trim();
    }

    /**
     * 获取现住地址-县（区）（患者来院前近期的常住地址的县（区）的名称）
     *
     * @return PRESENT_ADDR_COUNTY - 现住地址-县（区）（患者来院前近期的常住地址的县（区）的名称）
     */
    public String getPresentAddrCounty() {
        return presentAddrCounty;
    }

    /**
     * 设置现住地址-县（区）（患者来院前近期的常住地址的县（区）的名称）
     *
     * @param presentAddrCounty 现住地址-县（区）（患者来院前近期的常住地址的县（区）的名称）
     */
    public void setPresentAddrCounty(String presentAddrCounty) {
        this.presentAddrCounty = presentAddrCounty == null ? null : presentAddrCounty.trim();
    }

    /**
     * 获取现住地址-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @return PRESENT_ADDR_TOWN - 现住地址-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public String getPresentAddrTown() {
        return presentAddrTown;
    }

    /**
     * 设置现住地址-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @param presentAddrTown 现住地址-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public void setPresentAddrTown(String presentAddrTown) {
        this.presentAddrTown = presentAddrTown == null ? null : presentAddrTown.trim();
    }

    /**
     * 获取现住地址-村（街、路、弄等）（本人现住地址中的村或城市的街、路、里、弄等名称）
     *
     * @return PRESENT_ADDR_VILLAGE - 现住地址-村（街、路、弄等）（本人现住地址中的村或城市的街、路、里、弄等名称）
     */
    public String getPresentAddrVillage() {
        return presentAddrVillage;
    }

    /**
     * 设置现住地址-村（街、路、弄等）（本人现住地址中的村或城市的街、路、里、弄等名称）
     *
     * @param presentAddrVillage 现住地址-村（街、路、弄等）（本人现住地址中的村或城市的街、路、里、弄等名称）
     */
    public void setPresentAddrVillage(String presentAddrVillage) {
        this.presentAddrVillage = presentAddrVillage == null ? null : presentAddrVillage.trim();
    }

    /**
     * 获取现住地址-门牌号码（本人现住地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return PRESENT_ADDR_HOUSE_NO - 现住地址-门牌号码（本人现住地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getPresentAddrHouseNo() {
        return presentAddrHouseNo;
    }

    /**
     * 设置现住地址-门牌号码（本人现住地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param presentAddrHouseNo 现住地址-门牌号码（本人现住地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setPresentAddrHouseNo(String presentAddrHouseNo) {
        this.presentAddrHouseNo = presentAddrHouseNo == null ? null : presentAddrHouseNo.trim();
    }

    /**
     * 获取现住地址-电话（患者本人的电话号码，包括国际、国内区号和分机号）
     *
     * @return PRESENT_ADDR_TEL_NO - 现住地址-电话（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    public String getPresentAddrTelNo() {
        return presentAddrTelNo;
    }

    /**
     * 设置现住地址-电话（患者本人的电话号码，包括国际、国内区号和分机号）
     *
     * @param presentAddrTelNo 现住地址-电话（患者本人的电话号码，包括国际、国内区号和分机号）
     */
    public void setPresentAddrTelNo(String presentAddrTelNo) {
        this.presentAddrTelNo = presentAddrTelNo == null ? null : presentAddrTelNo.trim();
    }

    /**
     * 获取现住地址-邮编（患者来院前近期的常住地址的邮政编码）
     *
     * @return PRESENT_ADDR_POSTAL_CODE - 现住地址-邮编（患者来院前近期的常住地址的邮政编码）
     */
    public String getPresentAddrPostalCode() {
        return presentAddrPostalCode;
    }

    /**
     * 设置现住地址-邮编（患者来院前近期的常住地址的邮政编码）
     *
     * @param presentAddrPostalCode 现住地址-邮编（患者来院前近期的常住地址的邮政编码）
     */
    public void setPresentAddrPostalCode(String presentAddrPostalCode) {
        this.presentAddrPostalCode = presentAddrPostalCode == null ? null : presentAddrPostalCode.trim();
    }

    /**
     * 获取户籍地址-省（自治区、直辖市）（患者户籍登记所在地址的省、自治区或直辖市名称）
     *
     * @return REGISTER_ADDR_PROVINCE - 户籍地址-省（自治区、直辖市）（患者户籍登记所在地址的省、自治区或直辖市名称）
     */
    public String getRegisterAddrProvince() {
        return registerAddrProvince;
    }

    /**
     * 设置户籍地址-省（自治区、直辖市）（患者户籍登记所在地址的省、自治区或直辖市名称）
     *
     * @param registerAddrProvince 户籍地址-省（自治区、直辖市）（患者户籍登记所在地址的省、自治区或直辖市名称）
     */
    public void setRegisterAddrProvince(String registerAddrProvince) {
        this.registerAddrProvince = registerAddrProvince == null ? null : registerAddrProvince.trim();
    }

    /**
     * 获取户籍地址-市（地区、州）（患者户籍登记所在地址的市、地区或州的名称）
     *
     * @return REGISTER_ADDR_CITY - 户籍地址-市（地区、州）（患者户籍登记所在地址的市、地区或州的名称）
     */
    public String getRegisterAddrCity() {
        return registerAddrCity;
    }

    /**
     * 设置户籍地址-市（地区、州）（患者户籍登记所在地址的市、地区或州的名称）
     *
     * @param registerAddrCity 户籍地址-市（地区、州）（患者户籍登记所在地址的市、地区或州的名称）
     */
    public void setRegisterAddrCity(String registerAddrCity) {
        this.registerAddrCity = registerAddrCity == null ? null : registerAddrCity.trim();
    }

    /**
     * 获取户籍地址-县（区)（患者户籍登记所在地址的县（区）的名称）
     *
     * @return REGISTER_ADDR_COUNTY - 户籍地址-县（区)（患者户籍登记所在地址的县（区）的名称）
     */
    public String getRegisterAddrCounty() {
        return registerAddrCounty;
    }

    /**
     * 设置户籍地址-县（区)（患者户籍登记所在地址的县（区）的名称）
     *
     * @param registerAddrCounty 户籍地址-县（区)（患者户籍登记所在地址的县（区）的名称）
     */
    public void setRegisterAddrCounty(String registerAddrCounty) {
        this.registerAddrCounty = registerAddrCounty == null ? null : registerAddrCounty.trim();
    }

    /**
     * 获取户籍地址-乡(镇、街道办事处)（患者户籍登记所在地址的乡、镇或城市的街道办事处名称）
     *
     * @return REGISTER_ADDR_TOWN - 户籍地址-乡(镇、街道办事处)（患者户籍登记所在地址的乡、镇或城市的街道办事处名称）
     */
    public String getRegisterAddrTown() {
        return registerAddrTown;
    }

    /**
     * 设置户籍地址-乡(镇、街道办事处)（患者户籍登记所在地址的乡、镇或城市的街道办事处名称）
     *
     * @param registerAddrTown 户籍地址-乡(镇、街道办事处)（患者户籍登记所在地址的乡、镇或城市的街道办事处名称）
     */
    public void setRegisterAddrTown(String registerAddrTown) {
        this.registerAddrTown = registerAddrTown == null ? null : registerAddrTown.trim();
    }

    /**
     * 获取户籍地址-村（街、路、弄等）（患者户籍登记所在地址的村或城市的街、路、里、弄等名称）
     *
     * @return REGISTER_ADDR_VILLAGE - 户籍地址-村（街、路、弄等）（患者户籍登记所在地址的村或城市的街、路、里、弄等名称）
     */
    public String getRegisterAddrVillage() {
        return registerAddrVillage;
    }

    /**
     * 设置户籍地址-村（街、路、弄等）（患者户籍登记所在地址的村或城市的街、路、里、弄等名称）
     *
     * @param registerAddrVillage 户籍地址-村（街、路、弄等）（患者户籍登记所在地址的村或城市的街、路、里、弄等名称）
     */
    public void setRegisterAddrVillage(String registerAddrVillage) {
        this.registerAddrVillage = registerAddrVillage == null ? null : registerAddrVillage.trim();
    }

    /**
     * 获取户籍地址-门牌号码（患者户籍登记所在地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return REGISTER_ADDR_HOUSE_NO - 户籍地址-门牌号码（患者户籍登记所在地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getRegisterAddrHouseNo() {
        return registerAddrHouseNo;
    }

    /**
     * 设置户籍地址-门牌号码（患者户籍登记所在地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param registerAddrHouseNo 户籍地址-门牌号码（患者户籍登记所在地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setRegisterAddrHouseNo(String registerAddrHouseNo) {
        this.registerAddrHouseNo = registerAddrHouseNo == null ? null : registerAddrHouseNo.trim();
    }

    /**
     * 获取户籍地址-邮编（患者户籍登记所在地址的邮政编码）
     *
     * @return REGISTER_ADDR_POSTAL_CODE - 户籍地址-邮编（患者户籍登记所在地址的邮政编码）
     */
    public String getRegisterAddrPostalCode() {
        return registerAddrPostalCode;
    }

    /**
     * 设置户籍地址-邮编（患者户籍登记所在地址的邮政编码）
     *
     * @param registerAddrPostalCode 户籍地址-邮编（患者户籍登记所在地址的邮政编码）
     */
    public void setRegisterAddrPostalCode(String registerAddrPostalCode) {
        this.registerAddrPostalCode = registerAddrPostalCode == null ? null : registerAddrPostalCode.trim();
    }

    /**
     * 获取工作单位名称（患者在就诊前的工作单位名称）
     *
     * @return EMPLOYER_NAME - 工作单位名称（患者在就诊前的工作单位名称）
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * 设置工作单位名称（患者在就诊前的工作单位名称）
     *
     * @param employerName 工作单位名称（患者在就诊前的工作单位名称）
     */
    public void setEmployerName(String employerName) {
        this.employerName = employerName == null ? null : employerName.trim();
    }

    /**
     * 获取工作单位地址-省（自治区、直辖市）（患者当前所在的工作单位地址的省、自治区或直辖市名称）
     *
     * @return EMPLOYER_ADDR_PROVINCE - 工作单位地址-省（自治区、直辖市）（患者当前所在的工作单位地址的省、自治区或直辖市名称）
     */
    public String getEmployerAddrProvince() {
        return employerAddrProvince;
    }

    /**
     * 设置工作单位地址-省（自治区、直辖市）（患者当前所在的工作单位地址的省、自治区或直辖市名称）
     *
     * @param employerAddrProvince 工作单位地址-省（自治区、直辖市）（患者当前所在的工作单位地址的省、自治区或直辖市名称）
     */
    public void setEmployerAddrProvince(String employerAddrProvince) {
        this.employerAddrProvince = employerAddrProvince == null ? null : employerAddrProvince.trim();
    }

    /**
     * 获取工作单位地址-市（地区、州）（患者当前所在的工作单位地址的市、地区或州的名称）
     *
     * @return EMPLOYER_ADDR_CITY - 工作单位地址-市（地区、州）（患者当前所在的工作单位地址的市、地区或州的名称）
     */
    public String getEmployerAddrCity() {
        return employerAddrCity;
    }

    /**
     * 设置工作单位地址-市（地区、州）（患者当前所在的工作单位地址的市、地区或州的名称）
     *
     * @param employerAddrCity 工作单位地址-市（地区、州）（患者当前所在的工作单位地址的市、地区或州的名称）
     */
    public void setEmployerAddrCity(String employerAddrCity) {
        this.employerAddrCity = employerAddrCity == null ? null : employerAddrCity.trim();
    }

    /**
     * 获取工作单位地址-县（区）（患者当前所在的工作单位地址的县（区）的名称）
     *
     * @return EMPLOYER_ADDR_COUNTY - 工作单位地址-县（区）（患者当前所在的工作单位地址的县（区）的名称）
     */
    public String getEmployerAddrCounty() {
        return employerAddrCounty;
    }

    /**
     * 设置工作单位地址-县（区）（患者当前所在的工作单位地址的县（区）的名称）
     *
     * @param employerAddrCounty 工作单位地址-县（区）（患者当前所在的工作单位地址的县（区）的名称）
     */
    public void setEmployerAddrCounty(String employerAddrCounty) {
        this.employerAddrCounty = employerAddrCounty == null ? null : employerAddrCounty.trim();
    }

    /**
     * 获取工作单位地址-乡（镇、街道办事处）（患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称）
     *
     * @return EMPLOYER_ADDR_TOWN - 工作单位地址-乡（镇、街道办事处）（患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称）
     */
    public String getEmployerAddrTown() {
        return employerAddrTown;
    }

    /**
     * 设置工作单位地址-乡（镇、街道办事处）（患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称）
     *
     * @param employerAddrTown 工作单位地址-乡（镇、街道办事处）（患者当前所在的工作单位地址的乡、镇或城市的街道办事处名称）
     */
    public void setEmployerAddrTown(String employerAddrTown) {
        this.employerAddrTown = employerAddrTown == null ? null : employerAddrTown.trim();
    }

    /**
     * 获取工作单位地址-村（街、路、弄等）（患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称）
     *
     * @return EMPLOYER_ADDR_VILLAGE - 工作单位地址-村（街、路、弄等）（患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称）
     */
    public String getEmployerAddrVillage() {
        return employerAddrVillage;
    }

    /**
     * 设置工作单位地址-村（街、路、弄等）（患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称）
     *
     * @param employerAddrVillage 工作单位地址-村（街、路、弄等）（患者当前所在的工作单位地址的村或城市的街、路、里、弄等名称）
     */
    public void setEmployerAddrVillage(String employerAddrVillage) {
        this.employerAddrVillage = employerAddrVillage == null ? null : employerAddrVillage.trim();
    }

    /**
     * 获取工作单位地址-门牌号码（患者当前所在的工作单位地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return EMPLOYER_ADDR_HOUSE_NO - 工作单位地址-门牌号码（患者当前所在的工作单位地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getEmployerAddrHouseNo() {
        return employerAddrHouseNo;
    }

    /**
     * 设置工作单位地址-门牌号码（患者当前所在的工作单位地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param employerAddrHouseNo 工作单位地址-门牌号码（患者当前所在的工作单位地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setEmployerAddrHouseNo(String employerAddrHouseNo) {
        this.employerAddrHouseNo = employerAddrHouseNo == null ? null : employerAddrHouseNo.trim();
    }

    /**
     * 获取工作单位-电话（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @return EMPLOYER_TEL_NO - 工作单位-电话（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public String getEmployerTelNo() {
        return employerTelNo;
    }

    /**
     * 设置工作单位-电话（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     *
     * @param employerTelNo 工作单位-电话（患者当前所在的工作单位的电话号码，包括国际、国内区号和分机号）
     */
    public void setEmployerTelNo(String employerTelNo) {
        this.employerTelNo = employerTelNo == null ? null : employerTelNo.trim();
    }

    /**
     * 获取工作单位-邮编（患者当前所在的工作单位地址的邮政编码）
     *
     * @return EMPLOYER_POSTAL_CODE - 工作单位-邮编（患者当前所在的工作单位地址的邮政编码）
     */
    public String getEmployerPostalCode() {
        return employerPostalCode;
    }

    /**
     * 设置工作单位-邮编（患者当前所在的工作单位地址的邮政编码）
     *
     * @param employerPostalCode 工作单位-邮编（患者当前所在的工作单位地址的邮政编码）
     */
    public void setEmployerPostalCode(String employerPostalCode) {
        this.employerPostalCode = employerPostalCode == null ? null : employerPostalCode.trim();
    }

    /**
     * 获取联系人-姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CONTACT_NAME - 联系人-姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人-姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param contactName 联系人-姓名（联系人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人-关系代码GB/T 4761（联系人与患者之间的关系类别代码）
     *
     * @return CONTACT_RELATION_CODE - 联系人-关系代码GB/T 4761（联系人与患者之间的关系类别代码）
     */
    public String getContactRelationCode() {
        return contactRelationCode;
    }

    /**
     * 设置联系人-关系代码GB/T 4761（联系人与患者之间的关系类别代码）
     *
     * @param contactRelationCode 联系人-关系代码GB/T 4761（联系人与患者之间的关系类别代码）
     */
    public void setContactRelationCode(String contactRelationCode) {
        this.contactRelationCode = contactRelationCode == null ? null : contactRelationCode.trim();
    }

    /**
     * 获取联系人-关系中文名称（联系人与患者之间的关系类别中文名称）
     *
     * @return CONTACT_RELATION_CN - 联系人-关系中文名称（联系人与患者之间的关系类别中文名称）
     */
    public String getContactRelationCn() {
        return contactRelationCn;
    }

    /**
     * 设置联系人-关系中文名称（联系人与患者之间的关系类别中文名称）
     *
     * @param contactRelationCn 联系人-关系中文名称（联系人与患者之间的关系类别中文名称）
     */
    public void setContactRelationCn(String contactRelationCn) {
        this.contactRelationCn = contactRelationCn == null ? null : contactRelationCn.trim();
    }

    /**
     * 获取联系人地址-省（自治区、直辖市）（联系人当前常驻地址的省、自治区或直辖市名称）
     *
     * @return CONTACT_PROVINCE - 联系人地址-省（自治区、直辖市）（联系人当前常驻地址的省、自治区或直辖市名称）
     */
    public String getContactProvince() {
        return contactProvince;
    }

    /**
     * 设置联系人地址-省（自治区、直辖市）（联系人当前常驻地址的省、自治区或直辖市名称）
     *
     * @param contactProvince 联系人地址-省（自治区、直辖市）（联系人当前常驻地址的省、自治区或直辖市名称）
     */
    public void setContactProvince(String contactProvince) {
        this.contactProvince = contactProvince == null ? null : contactProvince.trim();
    }

    /**
     * 获取联系人地址-市（地区、州）（联系人当前常驻地址的市、地区或州的名称）
     *
     * @return CONTACT_CITY - 联系人地址-市（地区、州）（联系人当前常驻地址的市、地区或州的名称）
     */
    public String getContactCity() {
        return contactCity;
    }

    /**
     * 设置联系人地址-市（地区、州）（联系人当前常驻地址的市、地区或州的名称）
     *
     * @param contactCity 联系人地址-市（地区、州）（联系人当前常驻地址的市、地区或州的名称）
     */
    public void setContactCity(String contactCity) {
        this.contactCity = contactCity == null ? null : contactCity.trim();
    }

    /**
     * 获取联系人地址-县（区）（联系人当前常驻地址的的县（区）的名称）
     *
     * @return CONTACT_COUNTY - 联系人地址-县（区）（联系人当前常驻地址的的县（区）的名称）
     */
    public String getContactCounty() {
        return contactCounty;
    }

    /**
     * 设置联系人地址-县（区）（联系人当前常驻地址的的县（区）的名称）
     *
     * @param contactCounty 联系人地址-县（区）（联系人当前常驻地址的的县（区）的名称）
     */
    public void setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty == null ? null : contactCounty.trim();
    }

    /**
     * 获取联系人地址-乡（镇、街道办事处）（联系人当前常驻地址的乡、镇或城市的街道办事处名称）
     *
     * @return CONTACT_TOWN - 联系人地址-乡（镇、街道办事处）（联系人当前常驻地址的乡、镇或城市的街道办事处名称）
     */
    public String getContactTown() {
        return contactTown;
    }

    /**
     * 设置联系人地址-乡（镇、街道办事处）（联系人当前常驻地址的乡、镇或城市的街道办事处名称）
     *
     * @param contactTown 联系人地址-乡（镇、街道办事处）（联系人当前常驻地址的乡、镇或城市的街道办事处名称）
     */
    public void setContactTown(String contactTown) {
        this.contactTown = contactTown == null ? null : contactTown.trim();
    }

    /**
     * 获取联系人地址-村（街、路、弄等）（联系人当前常驻地址的村或城市的街、路、里、弄等名称）
     *
     * @return CONTACT_VILLAGE - 联系人地址-村（街、路、弄等）（联系人当前常驻地址的村或城市的街、路、里、弄等名称）
     */
    public String getContactVillage() {
        return contactVillage;
    }

    /**
     * 设置联系人地址-村（街、路、弄等）（联系人当前常驻地址的村或城市的街、路、里、弄等名称）
     *
     * @param contactVillage 联系人地址-村（街、路、弄等）（联系人当前常驻地址的村或城市的街、路、里、弄等名称）
     */
    public void setContactVillage(String contactVillage) {
        this.contactVillage = contactVillage == null ? null : contactVillage.trim();
    }

    /**
     * 获取联系人地址-门牌号码（联系人当前常驻地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return CONTACT_HOUS_NO - 联系人地址-门牌号码（联系人当前常驻地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getContactHousNo() {
        return contactHousNo;
    }

    /**
     * 设置联系人地址-门牌号码（联系人当前常驻地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param contactHousNo 联系人地址-门牌号码（联系人当前常驻地址的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setContactHousNo(String contactHousNo) {
        this.contactHousNo = contactHousNo == null ? null : contactHousNo.trim();
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
     * 获取入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     *
     * @return INPATIENT_PATH_CODE - 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    public String getInpatientPathCode() {
        return inpatientPathCode;
    }

    /**
     * 设置入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     *
     * @param inpatientPathCode 入院途径代码CV09.00.403（患者收治入院治疗的来源分类在特定编码体系中的代码）
     */
    public void setInpatientPathCode(String inpatientPathCode) {
        this.inpatientPathCode = inpatientPathCode == null ? null : inpatientPathCode.trim();
    }

    /**
     * 获取入院途径中文名称（患者收治入院治疗的来源分类在特定编码体系中的中文名称）
     *
     * @return INPATIENT_PATH_CN - 入院途径中文名称（患者收治入院治疗的来源分类在特定编码体系中的中文名称）
     */
    public String getInpatientPathCn() {
        return inpatientPathCn;
    }

    /**
     * 设置入院途径中文名称（患者收治入院治疗的来源分类在特定编码体系中的中文名称）
     *
     * @param inpatientPathCn 入院途径中文名称（患者收治入院治疗的来源分类在特定编码体系中的中文名称）
     */
    public void setInpatientPathCn(String inpatientPathCn) {
        this.inpatientPathCn = inpatientPathCn == null ? null : inpatientPathCn.trim();
    }

    /**
     * 获取治疗类别代码CV06.00.225（对患者采用的医学治疗方法类别在特定编码体系中的代码）
     *
     * @return INPATIENT_TYPE_CODE - 治疗类别代码CV06.00.225（对患者采用的医学治疗方法类别在特定编码体系中的代码）
     */
    public String getInpatientTypeCode() {
        return inpatientTypeCode;
    }

    /**
     * 设置治疗类别代码CV06.00.225（对患者采用的医学治疗方法类别在特定编码体系中的代码）
     *
     * @param inpatientTypeCode 治疗类别代码CV06.00.225（对患者采用的医学治疗方法类别在特定编码体系中的代码）
     */
    public void setInpatientTypeCode(String inpatientTypeCode) {
        this.inpatientTypeCode = inpatientTypeCode == null ? null : inpatientTypeCode.trim();
    }

    /**
     * 获取治疗类别中文名称（对患者采用的医学治疗方法类别在特定编码体系中的中文名称）
     *
     * @return INPATIENT_TYPE_CN - 治疗类别中文名称（对患者采用的医学治疗方法类别在特定编码体系中的中文名称）
     */
    public String getInpatientTypeCn() {
        return inpatientTypeCn;
    }

    /**
     * 设置治疗类别中文名称（对患者采用的医学治疗方法类别在特定编码体系中的中文名称）
     *
     * @param inpatientTypeCn 治疗类别中文名称（对患者采用的医学治疗方法类别在特定编码体系中的中文名称）
     */
    public void setInpatientTypeCn(String inpatientTypeCn) {
        this.inpatientTypeCn = inpatientTypeCn == null ? null : inpatientTypeCn.trim();
    }

    /**
     * 获取入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return ADMISSION_DATE - 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param admissionDate 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取入院科室编码DIR_DEPT（患者入院时，入住的科室编码）
     *
     * @return INPATIENT_DEPT_CODE - 入院科室编码DIR_DEPT（患者入院时，入住的科室编码）
     */
    public String getInpatientDeptCode() {
        return inpatientDeptCode;
    }

    /**
     * 设置入院科室编码DIR_DEPT（患者入院时，入住的科室编码）
     *
     * @param inpatientDeptCode 入院科室编码DIR_DEPT（患者入院时，入住的科室编码）
     */
    public void setInpatientDeptCode(String inpatientDeptCode) {
        this.inpatientDeptCode = inpatientDeptCode == null ? null : inpatientDeptCode.trim();
    }

    /**
     * 获取入院科室中文名称（患者入院时，入住的科室中文名称）
     *
     * @return INPATIENT_DEPT_CN - 入院科室中文名称（患者入院时，入住的科室中文名称）
     */
    public String getInpatientDeptCn() {
        return inpatientDeptCn;
    }

    /**
     * 设置入院科室中文名称（患者入院时，入住的科室中文名称）
     *
     * @param inpatientDeptCn 入院科室中文名称（患者入院时，入住的科室中文名称）
     */
    public void setInpatientDeptCn(String inpatientDeptCn) {
        this.inpatientDeptCn = inpatientDeptCn == null ? null : inpatientDeptCn.trim();
    }

    /**
     * 获取入院病房（患者入院时，所住病房对应的编号）
     *
     * @return INPATIENT_ROOM_NO - 入院病房（患者入院时，所住病房对应的编号）
     */
    public String getInpatientRoomNo() {
        return inpatientRoomNo;
    }

    /**
     * 设置入院病房（患者入院时，所住病房对应的编号）
     *
     * @param inpatientRoomNo 入院病房（患者入院时，所住病房对应的编号）
     */
    public void setInpatientRoomNo(String inpatientRoomNo) {
        this.inpatientRoomNo = inpatientRoomNo == null ? null : inpatientRoomNo.trim();
    }

    /**
     * 获取转科科室代码DIR_DEPT（患者住院期间转科的转入科室代码）
     *
     * @return MOVE_DEPT_CODE - 转科科室代码DIR_DEPT（患者住院期间转科的转入科室代码）
     */
    public String getMoveDeptCode() {
        return moveDeptCode;
    }

    /**
     * 设置转科科室代码DIR_DEPT（患者住院期间转科的转入科室代码）
     *
     * @param moveDeptCode 转科科室代码DIR_DEPT（患者住院期间转科的转入科室代码）
     */
    public void setMoveDeptCode(String moveDeptCode) {
        this.moveDeptCode = moveDeptCode == null ? null : moveDeptCode.trim();
    }

    /**
     * 获取转科科室中文名称（患者住院期间转科的转入科室中文名称,如果超过一次以上的转科，用“→”转接表示）
     *
     * @return MOVE_DEPT_CN - 转科科室中文名称（患者住院期间转科的转入科室中文名称,如果超过一次以上的转科，用“→”转接表示）
     */
    public String getMoveDeptCn() {
        return moveDeptCn;
    }

    /**
     * 设置转科科室中文名称（患者住院期间转科的转入科室中文名称,如果超过一次以上的转科，用“→”转接表示）
     *
     * @param moveDeptCn 转科科室中文名称（患者住院期间转科的转入科室中文名称,如果超过一次以上的转科，用“→”转接表示）
     */
    public void setMoveDeptCn(String moveDeptCn) {
        this.moveDeptCn = moveDeptCn == null ? null : moveDeptCn.trim();
    }

    /**
     * 获取出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @return DISCHARGE_DATE - 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @param dischargeDate 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取出院科室代码DIR_DEPT（患者出院时的科室代码）
     *
     * @return OUTPATIENT_DEPT_CODE - 出院科室代码DIR_DEPT（患者出院时的科室代码）
     */
    public String getOutpatientDeptCode() {
        return outpatientDeptCode;
    }

    /**
     * 设置出院科室代码DIR_DEPT（患者出院时的科室代码）
     *
     * @param outpatientDeptCode 出院科室代码DIR_DEPT（患者出院时的科室代码）
     */
    public void setOutpatientDeptCode(String outpatientDeptCode) {
        this.outpatientDeptCode = outpatientDeptCode == null ? null : outpatientDeptCode.trim();
    }

    /**
     * 获取出院科室中文名称（患者出院时的科室中文名称）
     *
     * @return OUTPATIENT_DEPT_CN - 出院科室中文名称（患者出院时的科室中文名称）
     */
    public String getOutpatientDeptCn() {
        return outpatientDeptCn;
    }

    /**
     * 设置出院科室中文名称（患者出院时的科室中文名称）
     *
     * @param outpatientDeptCn 出院科室中文名称（患者出院时的科室中文名称）
     */
    public void setOutpatientDeptCn(String outpatientDeptCn) {
        this.outpatientDeptCn = outpatientDeptCn == null ? null : outpatientDeptCn.trim();
    }

    /**
     * 获取出院病房（患者入院时，所住病房对应的编号）
     *
     * @return OUTPATIENT_ROOM_NO - 出院病房（患者入院时，所住病房对应的编号）
     */
    public String getOutpatientRoomNo() {
        return outpatientRoomNo;
    }

    /**
     * 设置出院病房（患者入院时，所住病房对应的编号）
     *
     * @param outpatientRoomNo 出院病房（患者入院时，所住病房对应的编号）
     */
    public void setOutpatientRoomNo(String outpatientRoomNo) {
        this.outpatientRoomNo = outpatientRoomNo == null ? null : outpatientRoomNo.trim();
    }

    /**
     * 获取实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     *
     * @return ACTUAL_IN_DAYS - 实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     */
    public Integer getActualInDays() {
        return actualInDays;
    }

    /**
     * 设置实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     *
     * @param actualInDays 实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     */
    public void setActualInDays(Integer actualInDays) {
        this.actualInDays = actualInDays;
    }

    /**
     * 获取实施临床路径标志代码DIR_CLINICAL_PATHWAY_CARD（是否实施临床路径或实施临床路径的中、西医类别的分类代码）
     *
     * @return CLINICAL_PATHWAY_CODE - 实施临床路径标志代码DIR_CLINICAL_PATHWAY_CARD（是否实施临床路径或实施临床路径的中、西医类别的分类代码）
     */
    public String getClinicalPathwayCode() {
        return clinicalPathwayCode;
    }

    /**
     * 设置实施临床路径标志代码DIR_CLINICAL_PATHWAY_CARD（是否实施临床路径或实施临床路径的中、西医类别的分类代码）
     *
     * @param clinicalPathwayCode 实施临床路径标志代码DIR_CLINICAL_PATHWAY_CARD（是否实施临床路径或实施临床路径的中、西医类别的分类代码）
     */
    public void setClinicalPathwayCode(String clinicalPathwayCode) {
        this.clinicalPathwayCode = clinicalPathwayCode == null ? null : clinicalPathwayCode.trim();
    }

    /**
     * 获取实施临床路径标志中文名称（是否实施临床路径或实施临床路径的中、西医类别的分类中文名称）
     *
     * @return CLINICAL_PATHWAY_CN - 实施临床路径标志中文名称（是否实施临床路径或实施临床路径的中、西医类别的分类中文名称）
     */
    public String getClinicalPathwayCn() {
        return clinicalPathwayCn;
    }

    /**
     * 设置实施临床路径标志中文名称（是否实施临床路径或实施临床路径的中、西医类别的分类中文名称）
     *
     * @param clinicalPathwayCn 实施临床路径标志中文名称（是否实施临床路径或实施临床路径的中、西医类别的分类中文名称）
     */
    public void setClinicalPathwayCn(String clinicalPathwayCn) {
        this.clinicalPathwayCn = clinicalPathwayCn == null ? null : clinicalPathwayCn.trim();
    }

    /**
     * 获取使用医疗机构中药制剂标志0否 1是（标识是否使用了医疗机构中药制剂的标志）
     *
     * @return TCM_MEDICAL_ORG_MARK - 使用医疗机构中药制剂标志0否 1是（标识是否使用了医疗机构中药制剂的标志）
     */
    public String getTcmMedicalOrgMark() {
        return tcmMedicalOrgMark;
    }

    /**
     * 设置使用医疗机构中药制剂标志0否 1是（标识是否使用了医疗机构中药制剂的标志）
     *
     * @param tcmMedicalOrgMark 使用医疗机构中药制剂标志0否 1是（标识是否使用了医疗机构中药制剂的标志）
     */
    public void setTcmMedicalOrgMark(String tcmMedicalOrgMark) {
        this.tcmMedicalOrgMark = tcmMedicalOrgMark == null ? null : tcmMedicalOrgMark.trim();
    }

    /**
     * 获取使用中医诊疗设备标志0否 1是（标识是否使用了中医诊疗设备的标志）
     *
     * @return TCM_DIAG_TREAT_DEVICE_MARK - 使用中医诊疗设备标志0否 1是（标识是否使用了中医诊疗设备的标志）
     */
    public String getTcmDiagTreatDeviceMark() {
        return tcmDiagTreatDeviceMark;
    }

    /**
     * 设置使用中医诊疗设备标志0否 1是（标识是否使用了中医诊疗设备的标志）
     *
     * @param tcmDiagTreatDeviceMark 使用中医诊疗设备标志0否 1是（标识是否使用了中医诊疗设备的标志）
     */
    public void setTcmDiagTreatDeviceMark(String tcmDiagTreatDeviceMark) {
        this.tcmDiagTreatDeviceMark = tcmDiagTreatDeviceMark == null ? null : tcmDiagTreatDeviceMark.trim();
    }

    /**
     * 获取使用中医诊疗技术标志0否 1是（标识是否使用了中医诊疗技术的标志）
     *
     * @return TCM_DIAG_TREAT_TECH_MARK - 使用中医诊疗技术标志0否 1是（标识是否使用了中医诊疗技术的标志）
     */
    public String getTcmDiagTreatTechMark() {
        return tcmDiagTreatTechMark;
    }

    /**
     * 设置使用中医诊疗技术标志0否 1是（标识是否使用了中医诊疗技术的标志）
     *
     * @param tcmDiagTreatTechMark 使用中医诊疗技术标志0否 1是（标识是否使用了中医诊疗技术的标志）
     */
    public void setTcmDiagTreatTechMark(String tcmDiagTreatTechMark) {
        this.tcmDiagTreatTechMark = tcmDiagTreatTechMark == null ? null : tcmDiagTreatTechMark.trim();
    }

    /**
     * 获取辨证施护标志0否 1是（标识是否进行辨证施护的标志）
     *
     * @return SYNDROME_NURSING_MARK - 辨证施护标志0否 1是（标识是否进行辨证施护的标志）
     */
    public String getSyndromeNursingMark() {
        return syndromeNursingMark;
    }

    /**
     * 设置辨证施护标志0否 1是（标识是否进行辨证施护的标志）
     *
     * @param syndromeNursingMark 辨证施护标志0否 1是（标识是否进行辨证施护的标志）
     */
    public void setSyndromeNursingMark(String syndromeNursingMark) {
        this.syndromeNursingMark = syndromeNursingMark == null ? null : syndromeNursingMark.trim();
    }

    /**
     * 获取中医门（急）诊诊断编码GB/T 15657（出院诊断中的主要诊断在特定编码体系中的编码）
     *
     * @return TCM_OUTPATIENT_DIAG_CODE - 中医门（急）诊诊断编码GB/T 15657（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    public String getTcmOutpatientDiagCode() {
        return tcmOutpatientDiagCode;
    }

    /**
     * 设置中医门（急）诊诊断编码GB/T 15657（出院诊断中的主要诊断在特定编码体系中的编码）
     *
     * @param tcmOutpatientDiagCode 中医门（急）诊诊断编码GB/T 15657（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    public void setTcmOutpatientDiagCode(String tcmOutpatientDiagCode) {
        this.tcmOutpatientDiagCode = tcmOutpatientDiagCode == null ? null : tcmOutpatientDiagCode.trim();
    }

    /**
     * 获取中医门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @return TCM_OUTPATIENT_DIAG_NAME - 中医门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public String getTcmOutpatientDiagName() {
        return tcmOutpatientDiagName;
    }

    /**
     * 设置中医门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @param tcmOutpatientDiagName 中医门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public void setTcmOutpatientDiagName(String tcmOutpatientDiagName) {
        this.tcmOutpatientDiagName = tcmOutpatientDiagName == null ? null : tcmOutpatientDiagName.trim();
    }

    /**
     * 获取门（急）诊诊断编码ICD-10（出院诊断中的主要诊断在特定编码体系中的编码）
     *
     * @return OUTPATIENT_DIAG_CODE - 门（急）诊诊断编码ICD-10（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    public String getOutpatientDiagCode() {
        return outpatientDiagCode;
    }

    /**
     * 设置门（急）诊诊断编码ICD-10（出院诊断中的主要诊断在特定编码体系中的编码）
     *
     * @param outpatientDiagCode 门（急）诊诊断编码ICD-10（出院诊断中的主要诊断在特定编码体系中的编码）
     */
    public void setOutpatientDiagCode(String outpatientDiagCode) {
        this.outpatientDiagCode = outpatientDiagCode == null ? null : outpatientDiagCode.trim();
    }

    /**
     * 获取门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @return OUTPATIENT_DIAG_NAME - 门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public String getOutpatientDiagName() {
        return outpatientDiagName;
    }

    /**
     * 设置门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @param outpatientDiagName 门（急）诊诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public void setOutpatientDiagName(String outpatientDiagName) {
        this.outpatientDiagName = outpatientDiagName == null ? null : outpatientDiagName.trim();
    }

    /**
     * 获取损伤、中毒的疾病编码ICD-10（损伤中毒的外部原因在特定编码体系中的编码）
     *
     * @return DAMAGE_POISON_CODE - 损伤、中毒的疾病编码ICD-10（损伤中毒的外部原因在特定编码体系中的编码）
     */
    public String getDamagePoisonCode() {
        return damagePoisonCode;
    }

    /**
     * 设置损伤、中毒的疾病编码ICD-10（损伤中毒的外部原因在特定编码体系中的编码）
     *
     * @param damagePoisonCode 损伤、中毒的疾病编码ICD-10（损伤中毒的外部原因在特定编码体系中的编码）
     */
    public void setDamagePoisonCode(String damagePoisonCode) {
        this.damagePoisonCode = damagePoisonCode == null ? null : damagePoisonCode.trim();
    }

    /**
     * 获取损伤、中毒的疾病中文名称（损伤中毒的外部原因在特定编码体系中的中文名称）
     *
     * @return DAMAGE_POISON_CN - 损伤、中毒的疾病中文名称（损伤中毒的外部原因在特定编码体系中的中文名称）
     */
    public String getDamagePoisonCn() {
        return damagePoisonCn;
    }

    /**
     * 设置损伤、中毒的疾病中文名称（损伤中毒的外部原因在特定编码体系中的中文名称）
     *
     * @param damagePoisonCn 损伤、中毒的疾病中文名称（损伤中毒的外部原因在特定编码体系中的中文名称）
     */
    public void setDamagePoisonCn(String damagePoisonCn) {
        this.damagePoisonCn = damagePoisonCn == null ? null : damagePoisonCn.trim();
    }

    /**
     * 获取损伤、中毒的外部原因（造成损伤的外部原因及引起中毒的物质名称）
     *
     * @return DAMAGE_POISON_REASON - 损伤、中毒的外部原因（造成损伤的外部原因及引起中毒的物质名称）
     */
    public String getDamagePoisonReason() {
        return damagePoisonReason;
    }

    /**
     * 设置损伤、中毒的外部原因（造成损伤的外部原因及引起中毒的物质名称）
     *
     * @param damagePoisonReason 损伤、中毒的外部原因（造成损伤的外部原因及引起中毒的物质名称）
     */
    public void setDamagePoisonReason(String damagePoisonReason) {
        this.damagePoisonReason = damagePoisonReason == null ? null : damagePoisonReason.trim();
    }

    /**
     * 获取病理号（按照一定的编码规则赋予病理标本的编号）
     *
     * @return PATHOLOGICAL_NO - 病理号（按照一定的编码规则赋予病理标本的编号）
     */
    public String getPathologicalNo() {
        return pathologicalNo;
    }

    /**
     * 设置病理号（按照一定的编码规则赋予病理标本的编号）
     *
     * @param pathologicalNo 病理号（按照一定的编码规则赋予病理标本的编号）
     */
    public void setPathologicalNo(String pathologicalNo) {
        this.pathologicalNo = pathologicalNo == null ? null : pathologicalNo.trim();
    }

    /**
     * 获取药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     *
     * @return DRUG_ALLERGY_MARK - 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    public String getDrugAllergyMark() {
        return drugAllergyMark;
    }

    /**
     * 设置药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     *
     * @param drugAllergyMark 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    public void setDrugAllergyMark(String drugAllergyMark) {
        this.drugAllergyMark = drugAllergyMark == null ? null : drugAllergyMark.trim();
    }

    /**
     * 获取过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     *
     * @return DRUG_ALLERGENS_NAME - 过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     */
    public String getDrugAllergensName() {
        return drugAllergensName;
    }

    /**
     * 设置过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     *
     * @param drugAllergensName 过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     */
    public void setDrugAllergensName(String drugAllergensName) {
        this.drugAllergensName = drugAllergensName == null ? null : drugAllergensName.trim();
    }

    /**
     * 获取死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     *
     * @return AUTOPSY_MARK - 死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     */
    public String getAutopsyMark() {
        return autopsyMark;
    }

    /**
     * 设置死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     *
     * @param autopsyMark 死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     */
    public void setAutopsyMark(String autopsyMark) {
        this.autopsyMark = autopsyMark == null ? null : autopsyMark.trim();
    }

    /**
     * 获取ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类类别代码）
     *
     * @return ABO_CODE - ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类类别代码）
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * 设置ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类类别代码）
     *
     * @param aboCode ABO血型代码CV04.50.005（按照ABO血型系统决定的本人血型类类别代码）
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode == null ? null : aboCode.trim();
    }

    /**
     * 获取ABO血型中文名称（按照ABO血型系统决定的本人血型类类别中文名称）
     *
     * @return ABO_CN - ABO血型中文名称（按照ABO血型系统决定的本人血型类类别中文名称）
     */
    public String getAboCn() {
        return aboCn;
    }

    /**
     * 设置ABO血型中文名称（按照ABO血型系统决定的本人血型类类别中文名称）
     *
     * @param aboCn ABO血型中文名称（按照ABO血型系统决定的本人血型类类别中文名称）
     */
    public void setAboCn(String aboCn) {
        this.aboCn = aboCn == null ? null : aboCn.trim();
    }

    /**
     * 获取Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     *
     * @return RH_CODE - Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * 设置Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     *
     * @param rhCode Rh血型代码CV04.50.020（按照Rh血型系统决定的本人血型类别代码）
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode == null ? null : rhCode.trim();
    }

    /**
     * 获取Rh血型中文名称（按照Rh血型系统决定的本人血型类别中文名称）
     *
     * @return RH_CN - Rh血型中文名称（按照Rh血型系统决定的本人血型类别中文名称）
     */
    public String getRhCn() {
        return rhCn;
    }

    /**
     * 设置Rh血型中文名称（按照Rh血型系统决定的本人血型类别中文名称）
     *
     * @param rhCn Rh血型中文名称（按照Rh血型系统决定的本人血型类别中文名称）
     */
    public void setRhCn(String rhCn) {
        this.rhCn = rhCn == null ? null : rhCn.trim();
    }

    /**
     * 获取科主任：编号（医疗服务人员的唯一编号）
     *
     * @return DEPT_DIRECTOR_ID - 科主任：编号（医疗服务人员的唯一编号）
     */
    public String getDeptDirectorId() {
        return deptDirectorId;
    }

    /**
     * 设置科主任：编号（医疗服务人员的唯一编号）
     *
     * @param deptDirectorId 科主任：编号（医疗服务人员的唯一编号）
     */
    public void setDeptDirectorId(String deptDirectorId) {
        this.deptDirectorId = deptDirectorId == null ? null : deptDirectorId.trim();
    }

    /**
     * 获取科主任：姓名（患者出院时所在科室的科主任签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DEPT_DIRECTOR_NAME - 科主任：姓名（患者出院时所在科室的科主任签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDeptDirectorName() {
        return deptDirectorName;
    }

    /**
     * 设置科主任：姓名（患者出院时所在科室的科主任签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param deptDirectorName 科主任：姓名（患者出院时所在科室的科主任签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDeptDirectorName(String deptDirectorName) {
        this.deptDirectorName = deptDirectorName == null ? null : deptDirectorName.trim();
    }

    /**
     * 获取主任（副主任）医师：编号（医疗服务人员的唯一编号）
     *
     * @return CHIEF_DOCTOR_ID - 主任（副主任）医师：编号（医疗服务人员的唯一编号）
     */
    public String getChiefDoctorId() {
        return chiefDoctorId;
    }

    /**
     * 设置主任（副主任）医师：编号（医疗服务人员的唯一编号）
     *
     * @param chiefDoctorId 主任（副主任）医师：编号（医疗服务人员的唯一编号）
     */
    public void setChiefDoctorId(String chiefDoctorId) {
        this.chiefDoctorId = chiefDoctorId == null ? null : chiefDoctorId.trim();
    }

    /**
     * 获取主任（副主任）医师：姓名（患者出院时所在科室的具有副主任医师以上专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHIEF_DOCTOR_NAME - 主任（副主任）医师：姓名（患者出院时所在科室的具有副主任医师以上专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    /**
     * 设置主任（副主任）医师：姓名（患者出院时所在科室的具有副主任医师以上专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param chiefDoctorName 主任（副主任）医师：姓名（患者出院时所在科室的具有副主任医师以上专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
    }

    /**
     * 获取主治医师：编号（医疗服务人员的唯一编号）
     *
     * @return CHARGE_DOCTOR_ID - 主治医师：编号（医疗服务人员的唯一编号）
     */
    public String getChargeDoctorId() {
        return chargeDoctorId;
    }

    /**
     * 设置主治医师：编号（医疗服务人员的唯一编号）
     *
     * @param chargeDoctorId 主治医师：编号（医疗服务人员的唯一编号）
     */
    public void setChargeDoctorId(String chargeDoctorId) {
        this.chargeDoctorId = chargeDoctorId == null ? null : chargeDoctorId.trim();
    }

    /**
     * 获取主治医师：姓名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHARGE_DOCTOR_NAME - 主治医师：姓名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getChargeDoctorName() {
        return chargeDoctorName;
    }

    /**
     * 设置主治医师：姓名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param chargeDoctorName 主治医师：姓名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setChargeDoctorName(String chargeDoctorName) {
        this.chargeDoctorName = chargeDoctorName == null ? null : chargeDoctorName.trim();
    }

    /**
     * 获取住院医师：编号（医疗服务人员的唯一编号）
     *
     * @return RESIDENT_DOCTOR_ID - 住院医师：编号（医疗服务人员的唯一编号）
     */
    public String getResidentDoctorId() {
        return residentDoctorId;
    }

    /**
     * 设置住院医师：编号（医疗服务人员的唯一编号）
     *
     * @param residentDoctorId 住院医师：编号（医疗服务人员的唯一编号）
     */
    public void setResidentDoctorId(String residentDoctorId) {
        this.residentDoctorId = residentDoctorId == null ? null : residentDoctorId.trim();
    }

    /**
     * 获取住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param residentDoctorName 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取责任护士：编号 （医疗服务人员的唯一编号）
     *
     * @return RESP_NURSE_ID - 责任护士：编号 （医疗服务人员的唯一编号）
     */
    public String getRespNurseId() {
        return respNurseId;
    }

    /**
     * 设置责任护士：编号 （医疗服务人员的唯一编号）
     *
     * @param respNurseId 责任护士：编号 （医疗服务人员的唯一编号）
     */
    public void setRespNurseId(String respNurseId) {
        this.respNurseId = respNurseId == null ? null : respNurseId.trim();
    }

    /**
     * 获取责任护士：姓名（患者出院时所在的，并已开展责任制护理的科室，负责患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESP_NURSE_NAME - 责任护士：姓名（患者出院时所在的，并已开展责任制护理的科室，负责患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getRespNurseName() {
        return respNurseName;
    }

    /**
     * 设置责任护士：姓名（患者出院时所在的，并已开展责任制护理的科室，负责患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param respNurseName 责任护士：姓名（患者出院时所在的，并已开展责任制护理的科室，负责患者整体护理的责任护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setRespNurseName(String respNurseName) {
        this.respNurseName = respNurseName == null ? null : respNurseName.trim();
    }

    /**
     * 获取进修医师：编号（医疗服务人员的唯一编号）
     *
     * @return LEARNING_DOCTOR_ID - 进修医师：编号（医疗服务人员的唯一编号）
     */
    public String getLearningDoctorId() {
        return learningDoctorId;
    }

    /**
     * 设置进修医师：编号（医疗服务人员的唯一编号）
     *
     * @param learningDoctorId 进修医师：编号（医疗服务人员的唯一编号）
     */
    public void setLearningDoctorId(String learningDoctorId) {
        this.learningDoctorId = learningDoctorId == null ? null : learningDoctorId.trim();
    }

    /**
     * 获取进修医师：姓名（在患者出院时所在科室进修并参与患者诊治的进修医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return LEARNING_DOCTOR_NAME - 进修医师：姓名（在患者出院时所在科室进修并参与患者诊治的进修医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getLearningDoctorName() {
        return learningDoctorName;
    }

    /**
     * 设置进修医师：姓名（在患者出院时所在科室进修并参与患者诊治的进修医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param learningDoctorName 进修医师：姓名（在患者出院时所在科室进修并参与患者诊治的进修医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setLearningDoctorName(String learningDoctorName) {
        this.learningDoctorName = learningDoctorName == null ? null : learningDoctorName.trim();
    }

    /**
     * 获取实习医师：编号（医疗服务人员的唯一编号）
     *
     * @return INTERN_DOCTOR_ID - 实习医师：编号（医疗服务人员的唯一编号）
     */
    public String getInternDoctorId() {
        return internDoctorId;
    }

    /**
     * 设置实习医师：编号（医疗服务人员的唯一编号）
     *
     * @param internDoctorId 实习医师：编号（医疗服务人员的唯一编号）
     */
    public void setInternDoctorId(String internDoctorId) {
        this.internDoctorId = internDoctorId == null ? null : internDoctorId.trim();
    }

    /**
     * 获取实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return INTERN_DOCTOR_NAME - 实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getInternDoctorName() {
        return internDoctorName;
    }

    /**
     * 设置实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param internDoctorName 实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setInternDoctorName(String internDoctorName) {
        this.internDoctorName = internDoctorName == null ? null : internDoctorName.trim();
    }

    /**
     * 获取编码员：编号（医疗服务人员的唯一编号）
     *
     * @return CATALOGER_ID - 编码员：编号（医疗服务人员的唯一编号）
     */
    public String getCatalogerId() {
        return catalogerId;
    }

    /**
     * 设置编码员：编号（医疗服务人员的唯一编号）
     *
     * @param catalogerId 编码员：编号（医疗服务人员的唯一编号）
     */
    public void setCatalogerId(String catalogerId) {
        this.catalogerId = catalogerId == null ? null : catalogerId.trim();
    }

    /**
     * 获取编码员：姓名（负责病案编目的分类人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CATALOGER_NAME - 编码员：姓名（负责病案编目的分类人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCatalogerName() {
        return catalogerName;
    }

    /**
     * 设置编码员：姓名（负责病案编目的分类人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param catalogerName 编码员：姓名（负责病案编目的分类人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCatalogerName(String catalogerName) {
        this.catalogerName = catalogerName == null ? null : catalogerName.trim();
    }

    /**
     * 获取病案质量代码DIR_CASE_QUALITY（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类代码）
     *
     * @return CASE_QUALITY_CODE - 病案质量代码DIR_CASE_QUALITY（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类代码）
     */
    public String getCaseQualityCode() {
        return caseQualityCode;
    }

    /**
     * 设置病案质量代码DIR_CASE_QUALITY（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类代码）
     *
     * @param caseQualityCode 病案质量代码DIR_CASE_QUALITY（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类代码）
     */
    public void setCaseQualityCode(String caseQualityCode) {
        this.caseQualityCode = caseQualityCode == null ? null : caseQualityCode.trim();
    }

    /**
     * 获取病案质量中文名称（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类中文名称）
     *
     * @return CASE_QUALITY_CN - 病案质量中文名称（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类中文名称）
     */
    public String getCaseQualityCn() {
        return caseQualityCn;
    }

    /**
     * 设置病案质量中文名称（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类中文名称）
     *
     * @param caseQualityCn 病案质量中文名称（按照医院病案评审标准对病案终末质量所做的综合评价结果的分类中文名称）
     */
    public void setCaseQualityCn(String caseQualityCn) {
        this.caseQualityCn = caseQualityCn == null ? null : caseQualityCn.trim();
    }

    /**
     * 获取质控医师：编号（医疗服务人员的唯一编号）
     *
     * @return QC_DOCTOR_ID - 质控医师：编号（医疗服务人员的唯一编号）
     */
    public String getQcDoctorId() {
        return qcDoctorId;
    }

    /**
     * 设置质控医师：编号（医疗服务人员的唯一编号）
     *
     * @param qcDoctorId 质控医师：编号（医疗服务人员的唯一编号）
     */
    public void setQcDoctorId(String qcDoctorId) {
        this.qcDoctorId = qcDoctorId == null ? null : qcDoctorId.trim();
    }

    /**
     * 获取质控医师：姓名（对病案终末质量进行检查的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return QC_DOCTOR_NAME - 质控医师：姓名（对病案终末质量进行检查的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getQcDoctorName() {
        return qcDoctorName;
    }

    /**
     * 设置质控医师：姓名（对病案终末质量进行检查的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param qcDoctorName 质控医师：姓名（对病案终末质量进行检查的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setQcDoctorName(String qcDoctorName) {
        this.qcDoctorName = qcDoctorName == null ? null : qcDoctorName.trim();
    }

    /**
     * 获取质控护士：编号（医疗服务人员的唯一编号）
     *
     * @return QC_NURSE_ID - 质控护士：编号（医疗服务人员的唯一编号）
     */
    public String getQcNurseId() {
        return qcNurseId;
    }

    /**
     * 设置质控护士：编号（医疗服务人员的唯一编号）
     *
     * @param qcNurseId 质控护士：编号（医疗服务人员的唯一编号）
     */
    public void setQcNurseId(String qcNurseId) {
        this.qcNurseId = qcNurseId == null ? null : qcNurseId.trim();
    }

    /**
     * 获取质控护士：姓名（对病案终末质量进行检查的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return QC_NURSE_NAME - 质控护士：姓名（对病案终末质量进行检查的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getQcNurseName() {
        return qcNurseName;
    }

    /**
     * 设置质控护士：姓名（对病案终末质量进行检查的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param qcNurseName 质控护士：姓名（对病案终末质量进行检查的护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setQcNurseName(String qcNurseName) {
        this.qcNurseName = qcNurseName == null ? null : qcNurseName.trim();
    }

    /**
     * 获取质控日期（对病案终末质量进行检查及评价的公元纪年日期的完整描述）
     *
     * @return QC_DATE - 质控日期（对病案终末质量进行检查及评价的公元纪年日期的完整描述）
     */
    public String getQcDate() {
        return qcDate;
    }

    /**
     * 设置质控日期（对病案终末质量进行检查及评价的公元纪年日期的完整描述）
     *
     * @param qcDate 质控日期（对病案终末质量进行检查及评价的公元纪年日期的完整描述）
     */
    public void setQcDate(String qcDate) {
        this.qcDate = qcDate == null ? null : qcDate.trim();
    }

    /**
     * 获取离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     *
     * @return DISCHARGE_CLASS_CODE - 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    public String getDischargeClassCode() {
        return dischargeClassCode;
    }

    /**
     * 设置离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     *
     * @param dischargeClassCode 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    public void setDischargeClassCode(String dischargeClassCode) {
        this.dischargeClassCode = dischargeClassCode == null ? null : dischargeClassCode.trim();
    }

    /**
     * 获取离院方式中文名称（患者本次住院离开医院的方式在特定编码体系中的中文名称）
     *
     * @return DISCHARGE_CLASS_CN - 离院方式中文名称（患者本次住院离开医院的方式在特定编码体系中的中文名称）
     */
    public String getDischargeClassCn() {
        return dischargeClassCn;
    }

    /**
     * 设置离院方式中文名称（患者本次住院离开医院的方式在特定编码体系中的中文名称）
     *
     * @param dischargeClassCn 离院方式中文名称（患者本次住院离开医院的方式在特定编码体系中的中文名称）
     */
    public void setDischargeClassCn(String dischargeClassCn) {
        this.dischargeClassCn = dischargeClassCn == null ? null : dischargeClassCn.trim();
    }

    /**
     * 获取医嘱转院-医疗机构名称（患者本次住院所在的医疗机构根据诊疗需要，拟将患者转往的其他医疗机构的名称）
     *
     * @return ORDER_REFERRAL_ORG - 医嘱转院-医疗机构名称（患者本次住院所在的医疗机构根据诊疗需要，拟将患者转往的其他医疗机构的名称）
     */
    public String getOrderReferralOrg() {
        return orderReferralOrg;
    }

    /**
     * 设置医嘱转院-医疗机构名称（患者本次住院所在的医疗机构根据诊疗需要，拟将患者转往的其他医疗机构的名称）
     *
     * @param orderReferralOrg 医嘱转院-医疗机构名称（患者本次住院所在的医疗机构根据诊疗需要，拟将患者转往的其他医疗机构的名称）
     */
    public void setOrderReferralOrg(String orderReferralOrg) {
        this.orderReferralOrg = orderReferralOrg == null ? null : orderReferralOrg.trim();
    }

    /**
     * 获取出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     *
     * @return REHOSP_AFTER31_MARK - 出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     */
    public String getRehospAfter31Mark() {
        return rehospAfter31Mark;
    }

    /**
     * 设置出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     *
     * @param rehospAfter31Mark 出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     */
    public void setRehospAfter31Mark(String rehospAfter31Mark) {
        this.rehospAfter31Mark = rehospAfter31Mark == null ? null : rehospAfter31Mark.trim();
    }

    /**
     * 获取出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     *
     * @return REHOSP_AFTER31_PURPOSE - 出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     */
    public String getRehospAfter31Purpose() {
        return rehospAfter31Purpose;
    }

    /**
     * 设置出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     *
     * @param rehospAfter31Purpose 出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     */
    public void setRehospAfter31Purpose(String rehospAfter31Purpose) {
        this.rehospAfter31Purpose = rehospAfter31Purpose == null ? null : rehospAfter31Purpose.trim();
    }

    /**
     * 获取颅脑损伤患者入院前昏迷时间（天）（颅脑损伤患者入院前昏迷时间的天数）
     *
     * @return COMA_DURATION_BEFORE_DAYS - 颅脑损伤患者入院前昏迷时间（天）（颅脑损伤患者入院前昏迷时间的天数）
     */
    public Integer getComaDurationBeforeDays() {
        return comaDurationBeforeDays;
    }

    /**
     * 设置颅脑损伤患者入院前昏迷时间（天）（颅脑损伤患者入院前昏迷时间的天数）
     *
     * @param comaDurationBeforeDays 颅脑损伤患者入院前昏迷时间（天）（颅脑损伤患者入院前昏迷时间的天数）
     */
    public void setComaDurationBeforeDays(Integer comaDurationBeforeDays) {
        this.comaDurationBeforeDays = comaDurationBeforeDays;
    }

    /**
     * 获取颅脑损伤患者入院前昏迷时间（小时）（颅脑损伤患者入院前昏迷时间的小时数）
     *
     * @return COMA_DURATION_BEFORE_HOURS - 颅脑损伤患者入院前昏迷时间（小时）（颅脑损伤患者入院前昏迷时间的小时数）
     */
    public Integer getComaDurationBeforeHours() {
        return comaDurationBeforeHours;
    }

    /**
     * 设置颅脑损伤患者入院前昏迷时间（小时）（颅脑损伤患者入院前昏迷时间的小时数）
     *
     * @param comaDurationBeforeHours 颅脑损伤患者入院前昏迷时间（小时）（颅脑损伤患者入院前昏迷时间的小时数）
     */
    public void setComaDurationBeforeHours(Integer comaDurationBeforeHours) {
        this.comaDurationBeforeHours = comaDurationBeforeHours;
    }

    /**
     * 获取颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     *
     * @return COMA_DURATION_BEFORE_MINUTES - 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    public Integer getComaDurationBeforeMinutes() {
        return comaDurationBeforeMinutes;
    }

    /**
     * 设置颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     *
     * @param comaDurationBeforeMinutes 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    public void setComaDurationBeforeMinutes(Integer comaDurationBeforeMinutes) {
        this.comaDurationBeforeMinutes = comaDurationBeforeMinutes;
    }

    /**
     * 获取颅脑损伤患者入院后昏迷时间（天）（颅脑损伤患者入院后昏迷时间的天数）
     *
     * @return COMA_DURATION_AFTER_DAYS - 颅脑损伤患者入院后昏迷时间（天）（颅脑损伤患者入院后昏迷时间的天数）
     */
    public Integer getComaDurationAfterDays() {
        return comaDurationAfterDays;
    }

    /**
     * 设置颅脑损伤患者入院后昏迷时间（天）（颅脑损伤患者入院后昏迷时间的天数）
     *
     * @param comaDurationAfterDays 颅脑损伤患者入院后昏迷时间（天）（颅脑损伤患者入院后昏迷时间的天数）
     */
    public void setComaDurationAfterDays(Integer comaDurationAfterDays) {
        this.comaDurationAfterDays = comaDurationAfterDays;
    }

    /**
     * 获取颅脑损伤患者入院后昏迷时间（小时）（颅脑损伤患者入院后昏迷时间的小时数）
     *
     * @return COMA_DURATION_AFTER_HOURS - 颅脑损伤患者入院后昏迷时间（小时）（颅脑损伤患者入院后昏迷时间的小时数）
     */
    public Integer getComaDurationAfterHours() {
        return comaDurationAfterHours;
    }

    /**
     * 设置颅脑损伤患者入院后昏迷时间（小时）（颅脑损伤患者入院后昏迷时间的小时数）
     *
     * @param comaDurationAfterHours 颅脑损伤患者入院后昏迷时间（小时）（颅脑损伤患者入院后昏迷时间的小时数）
     */
    public void setComaDurationAfterHours(Integer comaDurationAfterHours) {
        this.comaDurationAfterHours = comaDurationAfterHours;
    }

    /**
     * 获取颅脑损伤患者入院后昏迷时间（min）（颅脑损伤患者入院后昏迷时间的分钟数）
     *
     * @return COMA_DURATION_AFTER_MINUTES - 颅脑损伤患者入院后昏迷时间（min）（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    public Integer getComaDurationAfterMinutes() {
        return comaDurationAfterMinutes;
    }

    /**
     * 设置颅脑损伤患者入院后昏迷时间（min）（颅脑损伤患者入院后昏迷时间的分钟数）
     *
     * @param comaDurationAfterMinutes 颅脑损伤患者入院后昏迷时间（min）（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    public void setComaDurationAfterMinutes(Integer comaDurationAfterMinutes) {
        this.comaDurationAfterMinutes = comaDurationAfterMinutes;
    }

    /**
     * 获取住院总费用（患者在住院期间所有项目的费用之和，计量单位为元）
     *
     * @return FEE_TOTAL - 住院总费用（患者在住院期间所有项目的费用之和，计量单位为元）
     */
    public BigDecimal getFeeTotal() {
        return feeTotal;
    }

    /**
     * 设置住院总费用（患者在住院期间所有项目的费用之和，计量单位为元）
     *
     * @param feeTotal 住院总费用（患者在住院期间所有项目的费用之和，计量单位为元）
     */
    public void setFeeTotal(BigDecimal feeTotal) {
        this.feeTotal = feeTotal;
    }

    /**
     * 获取住院自付金额（以除全自费以外方式付费的患者的住院总费用中，由患者支付的费用金额，计量单位为元）
     *
     * @return FEE_SELF_PAY - 住院自付金额（以除全自费以外方式付费的患者的住院总费用中，由患者支付的费用金额，计量单位为元）
     */
    public BigDecimal getFeeSelfPay() {
        return feeSelfPay;
    }

    /**
     * 设置住院自付金额（以除全自费以外方式付费的患者的住院总费用中，由患者支付的费用金额，计量单位为元）
     *
     * @param feeSelfPay 住院自付金额（以除全自费以外方式付费的患者的住院总费用中，由患者支付的费用金额，计量单位为元）
     */
    public void setFeeSelfPay(BigDecimal feeSelfPay) {
        this.feeSelfPay = feeSelfPay;
    }

    /**
     * 获取综合医疗服务类-一般医疗服务费（各科室共同使用的医疗服务项目，包括诊查费、床位费、会诊费、营养咨询等的费用，计量单位为元）
     *
     * @return FEE_GENERAL_MEDICAL - 综合医疗服务类-一般医疗服务费（各科室共同使用的医疗服务项目，包括诊查费、床位费、会诊费、营养咨询等的费用，计量单位为元）
     */
    public BigDecimal getFeeGeneralMedical() {
        return feeGeneralMedical;
    }

    /**
     * 设置综合医疗服务类-一般医疗服务费（各科室共同使用的医疗服务项目，包括诊查费、床位费、会诊费、营养咨询等的费用，计量单位为元）
     *
     * @param feeGeneralMedical 综合医疗服务类-一般医疗服务费（各科室共同使用的医疗服务项目，包括诊查费、床位费、会诊费、营养咨询等的费用，计量单位为元）
     */
    public void setFeeGeneralMedical(BigDecimal feeGeneralMedical) {
        this.feeGeneralMedical = feeGeneralMedical;
    }

    /**
     * 获取综合医疗服务类-一般医疗服务费-中医辨证论治费（包括普通门诊、副主任医师门诊、主任医师门诊、国医大师门诊、急诊、门/急诊留观及住院中医辨证论治费）
     *
     * @return FEE_GENERAL_TCM_TREATMENT - 综合医疗服务类-一般医疗服务费-中医辨证论治费（包括普通门诊、副主任医师门诊、主任医师门诊、国医大师门诊、急诊、门/急诊留观及住院中医辨证论治费）
     */
    public BigDecimal getFeeGeneralTcmTreatment() {
        return feeGeneralTcmTreatment;
    }

    /**
     * 设置综合医疗服务类-一般医疗服务费-中医辨证论治费（包括普通门诊、副主任医师门诊、主任医师门诊、国医大师门诊、急诊、门/急诊留观及住院中医辨证论治费）
     *
     * @param feeGeneralTcmTreatment 综合医疗服务类-一般医疗服务费-中医辨证论治费（包括普通门诊、副主任医师门诊、主任医师门诊、国医大师门诊、急诊、门/急诊留观及住院中医辨证论治费）
     */
    public void setFeeGeneralTcmTreatment(BigDecimal feeGeneralTcmTreatment) {
        this.feeGeneralTcmTreatment = feeGeneralTcmTreatment;
    }

    /**
     * 获取综合医疗服务类-一般医疗服务费-中医辨证论治会诊费（包括院际、院内及远程中医辨证论治会诊费）
     *
     * @return FEE_GENERAL_TCM_CONSULT - 综合医疗服务类-一般医疗服务费-中医辨证论治会诊费（包括院际、院内及远程中医辨证论治会诊费）
     */
    public BigDecimal getFeeGeneralTcmConsult() {
        return feeGeneralTcmConsult;
    }

    /**
     * 设置综合医疗服务类-一般医疗服务费-中医辨证论治会诊费（包括院际、院内及远程中医辨证论治会诊费）
     *
     * @param feeGeneralTcmConsult 综合医疗服务类-一般医疗服务费-中医辨证论治会诊费（包括院际、院内及远程中医辨证论治会诊费）
     */
    public void setFeeGeneralTcmConsult(BigDecimal feeGeneralTcmConsult) {
        this.feeGeneralTcmConsult = feeGeneralTcmConsult;
    }

    /**
     * 获取综合医疗服务类-一般治疗操作费（各科室共同使用的医疗服务项目，包括注射、清创、换药、导尿、吸氧、抢救、重症监护等的费用，计量单位为元）
     *
     * @return FEE_GENERAL_TREATMENT - 综合医疗服务类-一般治疗操作费（各科室共同使用的医疗服务项目，包括注射、清创、换药、导尿、吸氧、抢救、重症监护等的费用，计量单位为元）
     */
    public BigDecimal getFeeGeneralTreatment() {
        return feeGeneralTreatment;
    }

    /**
     * 设置综合医疗服务类-一般治疗操作费（各科室共同使用的医疗服务项目，包括注射、清创、换药、导尿、吸氧、抢救、重症监护等的费用，计量单位为元）
     *
     * @param feeGeneralTreatment 综合医疗服务类-一般治疗操作费（各科室共同使用的医疗服务项目，包括注射、清创、换药、导尿、吸氧、抢救、重症监护等的费用，计量单位为元）
     */
    public void setFeeGeneralTreatment(BigDecimal feeGeneralTreatment) {
        this.feeGeneralTreatment = feeGeneralTreatment;
    }

    /**
     * 获取综合医疗服务类-护理费（患者住院期间等级护理费用及专项护理费用，计量单位为元）
     *
     * @return FEE_NURSING - 综合医疗服务类-护理费（患者住院期间等级护理费用及专项护理费用，计量单位为元）
     */
    public BigDecimal getFeeNursing() {
        return feeNursing;
    }

    /**
     * 设置综合医疗服务类-护理费（患者住院期间等级护理费用及专项护理费用，计量单位为元）
     *
     * @param feeNursing 综合医疗服务类-护理费（患者住院期间等级护理费用及专项护理费用，计量单位为元）
     */
    public void setFeeNursing(BigDecimal feeNursing) {
        this.feeNursing = feeNursing;
    }

    /**
     * 获取综合医疗服务其他费用（各科室共同使用的医疗服务项目，包括病房取暖费、病房空调费、救护车使用费、尸体料理费等的费用，计量单位为元）
     *
     * @return FEE_MEDICAL_OTHER - 综合医疗服务其他费用（各科室共同使用的医疗服务项目，包括病房取暖费、病房空调费、救护车使用费、尸体料理费等的费用，计量单位为元）
     */
    public BigDecimal getFeeMedicalOther() {
        return feeMedicalOther;
    }

    /**
     * 设置综合医疗服务其他费用（各科室共同使用的医疗服务项目，包括病房取暖费、病房空调费、救护车使用费、尸体料理费等的费用，计量单位为元）
     *
     * @param feeMedicalOther 综合医疗服务其他费用（各科室共同使用的医疗服务项目，包括病房取暖费、病房空调费、救护车使用费、尸体料理费等的费用，计量单位为元）
     */
    public void setFeeMedicalOther(BigDecimal feeMedicalOther) {
        this.feeMedicalOther = feeMedicalOther;
    }

    /**
     * 获取诊断类-病理诊断费（患者住院期间进行病理学有关检查项目的费用，计量单位为元）
     *
     * @return FEE_PATHOLOGY - 诊断类-病理诊断费（患者住院期间进行病理学有关检查项目的费用，计量单位为元）
     */
    public BigDecimal getFeePathology() {
        return feePathology;
    }

    /**
     * 设置诊断类-病理诊断费（患者住院期间进行病理学有关检查项目的费用，计量单位为元）
     *
     * @param feePathology 诊断类-病理诊断费（患者住院期间进行病理学有关检查项目的费用，计量单位为元）
     */
    public void setFeePathology(BigDecimal feePathology) {
        this.feePathology = feePathology;
    }

    /**
     * 获取诊断类-实验室诊断费（患者住院期间进行各项实验室检验的费用，计量单位为元）
     *
     * @return FEE_LABORATORY - 诊断类-实验室诊断费（患者住院期间进行各项实验室检验的费用，计量单位为元）
     */
    public BigDecimal getFeeLaboratory() {
        return feeLaboratory;
    }

    /**
     * 设置诊断类-实验室诊断费（患者住院期间进行各项实验室检验的费用，计量单位为元）
     *
     * @param feeLaboratory 诊断类-实验室诊断费（患者住院期间进行各项实验室检验的费用，计量单位为元）
     */
    public void setFeeLaboratory(BigDecimal feeLaboratory) {
        this.feeLaboratory = feeLaboratory;
    }

    /**
     * 获取诊断类-影像学诊断费（患者住院期间进行透视、造影、CT、磁共振检查、B超检查、核素扫描、PET 等影像学检查的费用，计量单位为元）
     *
     * @return FEE_IMAGING - 诊断类-影像学诊断费（患者住院期间进行透视、造影、CT、磁共振检查、B超检查、核素扫描、PET 等影像学检查的费用，计量单位为元）
     */
    public BigDecimal getFeeImaging() {
        return feeImaging;
    }

    /**
     * 设置诊断类-影像学诊断费（患者住院期间进行透视、造影、CT、磁共振检查、B超检查、核素扫描、PET 等影像学检查的费用，计量单位为元）
     *
     * @param feeImaging 诊断类-影像学诊断费（患者住院期间进行透视、造影、CT、磁共振检查、B超检查、核素扫描、PET 等影像学检查的费用，计量单位为元）
     */
    public void setFeeImaging(BigDecimal feeImaging) {
        this.feeImaging = feeImaging;
    }

    /**
     * 获取诊断类-临床诊断项目费（临床科室开展的其他用于诊断的各种检查项目的费用，包括有关内镜检查、肛门指诊、视力检测等项目费用，计量单位为元）
     *
     * @return FEE_CLINC - 诊断类-临床诊断项目费（临床科室开展的其他用于诊断的各种检查项目的费用，包括有关内镜检查、肛门指诊、视力检测等项目费用，计量单位为元）
     */
    public BigDecimal getFeeClinc() {
        return feeClinc;
    }

    /**
     * 设置诊断类-临床诊断项目费（临床科室开展的其他用于诊断的各种检查项目的费用，包括有关内镜检查、肛门指诊、视力检测等项目费用，计量单位为元）
     *
     * @param feeClinc 诊断类-临床诊断项目费（临床科室开展的其他用于诊断的各种检查项目的费用，包括有关内镜检查、肛门指诊、视力检测等项目费用，计量单位为元）
     */
    public void setFeeClinc(BigDecimal feeClinc) {
        this.feeClinc = feeClinc;
    }

    /**
     * 获取治疗类-非手术治疗项目费（临床利用无创手段进行治疗的项目产生的费用包括高压氧舱、血液净化、精神治疗、临床物理治疗等，计量单位为元）
     *
     * @return FEE_NONSURGICAL_TREAT - 治疗类-非手术治疗项目费（临床利用无创手段进行治疗的项目产生的费用包括高压氧舱、血液净化、精神治疗、临床物理治疗等，计量单位为元）
     */
    public BigDecimal getFeeNonsurgicalTreat() {
        return feeNonsurgicalTreat;
    }

    /**
     * 设置治疗类-非手术治疗项目费（临床利用无创手段进行治疗的项目产生的费用包括高压氧舱、血液净化、精神治疗、临床物理治疗等，计量单位为元）
     *
     * @param feeNonsurgicalTreat 治疗类-非手术治疗项目费（临床利用无创手段进行治疗的项目产生的费用包括高压氧舱、血液净化、精神治疗、临床物理治疗等，计量单位为元）
     */
    public void setFeeNonsurgicalTreat(BigDecimal feeNonsurgicalTreat) {
        this.feeNonsurgicalTreat = feeNonsurgicalTreat;
    }

    /**
     * 获取治疗类-临床物理治疗费（临床利用光、电、热等外界物理因素进行治疗的项目产生的费用，如放射治疗、放射性核素治疗、聚焦超声治疗等项目产生的费用，计量单位为元）
     *
     * @return FEE_CLIN_PHYSICAL - 治疗类-临床物理治疗费（临床利用光、电、热等外界物理因素进行治疗的项目产生的费用，如放射治疗、放射性核素治疗、聚焦超声治疗等项目产生的费用，计量单位为元）
     */
    public BigDecimal getFeeClinPhysical() {
        return feeClinPhysical;
    }

    /**
     * 设置治疗类-临床物理治疗费（临床利用光、电、热等外界物理因素进行治疗的项目产生的费用，如放射治疗、放射性核素治疗、聚焦超声治疗等项目产生的费用，计量单位为元）
     *
     * @param feeClinPhysical 治疗类-临床物理治疗费（临床利用光、电、热等外界物理因素进行治疗的项目产生的费用，如放射治疗、放射性核素治疗、聚焦超声治疗等项目产生的费用，计量单位为元）
     */
    public void setFeeClinPhysical(BigDecimal feeClinPhysical) {
        this.feeClinPhysical = feeClinPhysical;
    }

    /**
     * 获取治疗类-手术治疗费（临床利用有创手段进行治疗的项目产生的费用包括麻醉费及各种介入、孕产、手术治疗等费用，计量单位为元）
     *
     * @return FEE_SURGICAL_TREAT - 治疗类-手术治疗费（临床利用有创手段进行治疗的项目产生的费用包括麻醉费及各种介入、孕产、手术治疗等费用，计量单位为元）
     */
    public BigDecimal getFeeSurgicalTreat() {
        return feeSurgicalTreat;
    }

    /**
     * 设置治疗类-手术治疗费（临床利用有创手段进行治疗的项目产生的费用包括麻醉费及各种介入、孕产、手术治疗等费用，计量单位为元）
     *
     * @param feeSurgicalTreat 治疗类-手术治疗费（临床利用有创手段进行治疗的项目产生的费用包括麻醉费及各种介入、孕产、手术治疗等费用，计量单位为元）
     */
    public void setFeeSurgicalTreat(BigDecimal feeSurgicalTreat) {
        this.feeSurgicalTreat = feeSurgicalTreat;
    }

    /**
     * 获取治疗类-手术治疗费-麻醉费（手术治疗费中麻醉产生的费用，计量单位为元）
     *
     * @return FEE_ANAES - 治疗类-手术治疗费-麻醉费（手术治疗费中麻醉产生的费用，计量单位为元）
     */
    public BigDecimal getFeeAnaes() {
        return feeAnaes;
    }

    /**
     * 设置治疗类-手术治疗费-麻醉费（手术治疗费中麻醉产生的费用，计量单位为元）
     *
     * @param feeAnaes 治疗类-手术治疗费-麻醉费（手术治疗费中麻醉产生的费用，计量单位为元）
     */
    public void setFeeAnaes(BigDecimal feeAnaes) {
        this.feeAnaes = feeAnaes;
    }

    /**
     * 获取治疗类-手术治疗费-手术费（手术治疗费中手术产生的费用，计量单位为元）
     *
     * @return FEE_OPERATION - 治疗类-手术治疗费-手术费（手术治疗费中手术产生的费用，计量单位为元）
     */
    public BigDecimal getFeeOperation() {
        return feeOperation;
    }

    /**
     * 设置治疗类-手术治疗费-手术费（手术治疗费中手术产生的费用，计量单位为元）
     *
     * @param feeOperation 治疗类-手术治疗费-手术费（手术治疗费中手术产生的费用，计量单位为元）
     */
    public void setFeeOperation(BigDecimal feeOperation) {
        this.feeOperation = feeOperation;
    }

    /**
     * 获取康复类-康复费（对患者进行康复治疗产生的费用，包括康复评定和治疗，计量单位为元）
     *
     * @return FEE_RECOVERY - 康复类-康复费（对患者进行康复治疗产生的费用，包括康复评定和治疗，计量单位为元）
     */
    public BigDecimal getFeeRecovery() {
        return feeRecovery;
    }

    /**
     * 设置康复类-康复费（对患者进行康复治疗产生的费用，包括康复评定和治疗，计量单位为元）
     *
     * @param feeRecovery 康复类-康复费（对患者进行康复治疗产生的费用，包括康复评定和治疗，计量单位为元）
     */
    public void setFeeRecovery(BigDecimal feeRecovery) {
        this.feeRecovery = feeRecovery;
    }

    /**
     * 获取中医类-中医诊断费（经络穴位诊断、经络穴位分析、耳穴诊断、脉图诊断、舌象图诊断等中医诊断所产生的费用）
     *
     * @return FEE_TCM_DIAG - 中医类-中医诊断费（经络穴位诊断、经络穴位分析、耳穴诊断、脉图诊断、舌象图诊断等中医诊断所产生的费用）
     */
    public BigDecimal getFeeTcmDiag() {
        return feeTcmDiag;
    }

    /**
     * 设置中医类-中医诊断费（经络穴位诊断、经络穴位分析、耳穴诊断、脉图诊断、舌象图诊断等中医诊断所产生的费用）
     *
     * @param feeTcmDiag 中医类-中医诊断费（经络穴位诊断、经络穴位分析、耳穴诊断、脉图诊断、舌象图诊断等中医诊断所产生的费用）
     */
    public void setFeeTcmDiag(BigDecimal feeTcmDiag) {
        this.feeTcmDiag = feeTcmDiag;
    }

    /**
     * 获取中医类-中医治疗费（利用中医手段进行治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_TREATMENT - 中医类-中医治疗费（利用中医手段进行治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmTreatment() {
        return feeTcmTreatment;
    }

    /**
     * 设置中医类-中医治疗费（利用中医手段进行治疗产生的费用，计量单位为元）
     *
     * @param feeTcmTreatment 中医类-中医治疗费（利用中医手段进行治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmTreatment(BigDecimal feeTcmTreatment) {
        this.feeTcmTreatment = feeTcmTreatment;
    }

    /**
     * 获取中医类-中医治疗费-中医外治费（采用中医外治方法进行治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_FOREIGN_RULE - 中医类-中医治疗费-中医外治费（采用中医外治方法进行治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmForeignRule() {
        return feeTcmForeignRule;
    }

    /**
     * 设置中医类-中医治疗费-中医外治费（采用中医外治方法进行治疗产生的费用，计量单位为元）
     *
     * @param feeTcmForeignRule 中医类-中医治疗费-中医外治费（采用中医外治方法进行治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmForeignRule(BigDecimal feeTcmForeignRule) {
        this.feeTcmForeignRule = feeTcmForeignRule;
    }

    /**
     * 获取中医类-中医治疗费-中医骨伤费（采用中医骨伤整复技术进行治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_ORTHOPE_DICS - 中医类-中医治疗费-中医骨伤费（采用中医骨伤整复技术进行治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmOrthopeDics() {
        return feeTcmOrthopeDics;
    }

    /**
     * 设置中医类-中医治疗费-中医骨伤费（采用中医骨伤整复技术进行治疗产生的费用，计量单位为元）
     *
     * @param feeTcmOrthopeDics 中医类-中医治疗费-中医骨伤费（采用中医骨伤整复技术进行治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmOrthopeDics(BigDecimal feeTcmOrthopeDics) {
        this.feeTcmOrthopeDics = feeTcmOrthopeDics;
    }

    /**
     * 获取中医类-中医治疗费-针刺与灸法费（采用中医针灸进行治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_ACU_MOXI - 中医类-中医治疗费-针刺与灸法费（采用中医针灸进行治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmAcuMoxi() {
        return feeTcmAcuMoxi;
    }

    /**
     * 设置中医类-中医治疗费-针刺与灸法费（采用中医针灸进行治疗产生的费用，计量单位为元）
     *
     * @param feeTcmAcuMoxi 中医类-中医治疗费-针刺与灸法费（采用中医针灸进行治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmAcuMoxi(BigDecimal feeTcmAcuMoxi) {
        this.feeTcmAcuMoxi = feeTcmAcuMoxi;
    }

    /**
     * 获取中医类-中医治疗费-中医推拿治疗费（采用中医推拿进行治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_MASSAGE - 中医类-中医治疗费-中医推拿治疗费（采用中医推拿进行治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmMassage() {
        return feeTcmMassage;
    }

    /**
     * 设置中医类-中医治疗费-中医推拿治疗费（采用中医推拿进行治疗产生的费用，计量单位为元）
     *
     * @param feeTcmMassage 中医类-中医治疗费-中医推拿治疗费（采用中医推拿进行治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmMassage(BigDecimal feeTcmMassage) {
        this.feeTcmMassage = feeTcmMassage;
    }

    /**
     * 获取中医类-中医治疗费-中医肛肠治疗费（采用中医方法治疗肛肠疾病所产生的费用，计量单位为元）
     *
     * @return FEE_TCM_ANORECTAL - 中医类-中医治疗费-中医肛肠治疗费（采用中医方法治疗肛肠疾病所产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmAnorectal() {
        return feeTcmAnorectal;
    }

    /**
     * 设置中医类-中医治疗费-中医肛肠治疗费（采用中医方法治疗肛肠疾病所产生的费用，计量单位为元）
     *
     * @param feeTcmAnorectal 中医类-中医治疗费-中医肛肠治疗费（采用中医方法治疗肛肠疾病所产生的费用，计量单位为元）
     */
    public void setFeeTcmAnorectal(BigDecimal feeTcmAnorectal) {
        this.feeTcmAnorectal = feeTcmAnorectal;
    }

    /**
     * 获取中医类-中医治疗费-中医特殊治疗费（采用中医特殊治疗产生的费用，计量单位为元）
     *
     * @return FEE_TCM_SPECIAL - 中医类-中医治疗费-中医特殊治疗费（采用中医特殊治疗产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmSpecial() {
        return feeTcmSpecial;
    }

    /**
     * 设置中医类-中医治疗费-中医特殊治疗费（采用中医特殊治疗产生的费用，计量单位为元）
     *
     * @param feeTcmSpecial 中医类-中医治疗费-中医特殊治疗费（采用中医特殊治疗产生的费用，计量单位为元）
     */
    public void setFeeTcmSpecial(BigDecimal feeTcmSpecial) {
        this.feeTcmSpecial = feeTcmSpecial;
    }

    /**
     * 获取中医类-中医其他费（中医特殊调配加工费和辨证施膳费）
     *
     * @return FEE_TCM_OTHER - 中医类-中医其他费（中医特殊调配加工费和辨证施膳费）
     */
    public BigDecimal getFeeTcmOther() {
        return feeTcmOther;
    }

    /**
     * 设置中医类-中医其他费（中医特殊调配加工费和辨证施膳费）
     *
     * @param feeTcmOther 中医类-中医其他费（中医特殊调配加工费和辨证施膳费）
     */
    public void setFeeTcmOther(BigDecimal feeTcmOther) {
        this.feeTcmOther = feeTcmOther;
    }

    /**
     * 获取中医类-中医其他费-中医特殊调配加工费（中药调配、煎煮、加工等产生的费用，计量单位为元）
     *
     * @return FEE_TCM_SPECIAL_MIX - 中医类-中医其他费-中医特殊调配加工费（中药调配、煎煮、加工等产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmSpecialMix() {
        return feeTcmSpecialMix;
    }

    /**
     * 设置中医类-中医其他费-中医特殊调配加工费（中药调配、煎煮、加工等产生的费用，计量单位为元）
     *
     * @param feeTcmSpecialMix 中医类-中医其他费-中医特殊调配加工费（中药调配、煎煮、加工等产生的费用，计量单位为元）
     */
    public void setFeeTcmSpecialMix(BigDecimal feeTcmSpecialMix) {
        this.feeTcmSpecialMix = feeTcmSpecialMix;
    }

    /**
     * 获取中医类-中医其他费-辨证施膳费（中医辨证施膳指导所产生的费用，计量单位为元）
     *
     * @return FEE_TCM_DRUG_FOOD - 中医类-中医其他费-辨证施膳费（中医辨证施膳指导所产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmDrugFood() {
        return feeTcmDrugFood;
    }

    /**
     * 设置中医类-中医其他费-辨证施膳费（中医辨证施膳指导所产生的费用，计量单位为元）
     *
     * @param feeTcmDrugFood 中医类-中医其他费-辨证施膳费（中医辨证施膳指导所产生的费用，计量单位为元）
     */
    public void setFeeTcmDrugFood(BigDecimal feeTcmDrugFood) {
        this.feeTcmDrugFood = feeTcmDrugFood;
    }

    /**
     * 获取西药类-西药费（患者住院期间使用西药所产生的费用，计量单位为元）
     *
     * @return FEE_WESTERN_MEDICINE - 西药类-西药费（患者住院期间使用西药所产生的费用，计量单位为元）
     */
    public BigDecimal getFeeWesternMedicine() {
        return feeWesternMedicine;
    }

    /**
     * 设置西药类-西药费（患者住院期间使用西药所产生的费用，计量单位为元）
     *
     * @param feeWesternMedicine 西药类-西药费（患者住院期间使用西药所产生的费用，计量单位为元）
     */
    public void setFeeWesternMedicine(BigDecimal feeWesternMedicine) {
        this.feeWesternMedicine = feeWesternMedicine;
    }

    /**
     * 获取西药类-西药费-抗菌药物费用（患者住院期间使用抗菌药物所产生的费用，包含于西药费中，计量单位为元）
     *
     * @return FEE_ANTIMICROBIAL - 西药类-西药费-抗菌药物费用（患者住院期间使用抗菌药物所产生的费用，包含于西药费中，计量单位为元）
     */
    public BigDecimal getFeeAntimicrobial() {
        return feeAntimicrobial;
    }

    /**
     * 设置西药类-西药费-抗菌药物费用（患者住院期间使用抗菌药物所产生的费用，包含于西药费中，计量单位为元）
     *
     * @param feeAntimicrobial 西药类-西药费-抗菌药物费用（患者住院期间使用抗菌药物所产生的费用，包含于西药费中，计量单位为元）
     */
    public void setFeeAntimicrobial(BigDecimal feeAntimicrobial) {
        this.feeAntimicrobial = feeAntimicrobial;
    }

    /**
     * 获取中药类-中成药费（患者住院期间使用中成药所产生的费用，计量单位为元。中成药是指以中草药为原料，经制剂加工制成各种不同剂型的中药制品）
     *
     * @return FEE_TCM_MEDICINE - 中药类-中成药费（患者住院期间使用中成药所产生的费用，计量单位为元。中成药是指以中草药为原料，经制剂加工制成各种不同剂型的中药制品）
     */
    public BigDecimal getFeeTcmMedicine() {
        return feeTcmMedicine;
    }

    /**
     * 设置中药类-中成药费（患者住院期间使用中成药所产生的费用，计量单位为元。中成药是指以中草药为原料，经制剂加工制成各种不同剂型的中药制品）
     *
     * @param feeTcmMedicine 中药类-中成药费（患者住院期间使用中成药所产生的费用，计量单位为元。中成药是指以中草药为原料，经制剂加工制成各种不同剂型的中药制品）
     */
    public void setFeeTcmMedicine(BigDecimal feeTcmMedicine) {
        this.feeTcmMedicine = feeTcmMedicine;
    }

    /**
     * 获取中药类-中成药费-医疗机构中药制剂费（患者住院期间使用医疗机构中药制剂所产生的费用，计量单位为元）
     *
     * @return FEE_TCM_ORG_MEDICINE - 中药类-中成药费-医疗机构中药制剂费（患者住院期间使用医疗机构中药制剂所产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmOrgMedicine() {
        return feeTcmOrgMedicine;
    }

    /**
     * 设置中药类-中成药费-医疗机构中药制剂费（患者住院期间使用医疗机构中药制剂所产生的费用，计量单位为元）
     *
     * @param feeTcmOrgMedicine 中药类-中成药费-医疗机构中药制剂费（患者住院期间使用医疗机构中药制剂所产生的费用，计量单位为元）
     */
    public void setFeeTcmOrgMedicine(BigDecimal feeTcmOrgMedicine) {
        this.feeTcmOrgMedicine = feeTcmOrgMedicine;
    }

    /**
     * 获取中药类-中草药费（患者住院期间使用中草药所产生的费用，计量单位为元）
     *
     * @return FEE_TCM_HERBAL_MEDICINE - 中药类-中草药费（患者住院期间使用中草药所产生的费用，计量单位为元）
     */
    public BigDecimal getFeeTcmHerbalMedicine() {
        return feeTcmHerbalMedicine;
    }

    /**
     * 设置中药类-中草药费（患者住院期间使用中草药所产生的费用，计量单位为元）
     *
     * @param feeTcmHerbalMedicine 中药类-中草药费（患者住院期间使用中草药所产生的费用，计量单位为元）
     */
    public void setFeeTcmHerbalMedicine(BigDecimal feeTcmHerbalMedicine) {
        this.feeTcmHerbalMedicine = feeTcmHerbalMedicine;
    }

    /**
     * 获取血液和血液制品类-血费（患者住院期间使用临床用血所产生的费用，包括输注全血、红细胞、血小板、白细胞、血浆的费用医疗机构对患者临床用血的收费包括血站供应价格、配血费和储血费，计量单位为元）
     *
     * @return FEE_BLOOD - 血液和血液制品类-血费（患者住院期间使用临床用血所产生的费用，包括输注全血、红细胞、血小板、白细胞、血浆的费用医疗机构对患者临床用血的收费包括血站供应价格、配血费和储血费，计量单位为元）
     */
    public BigDecimal getFeeBlood() {
        return feeBlood;
    }

    /**
     * 设置血液和血液制品类-血费（患者住院期间使用临床用血所产生的费用，包括输注全血、红细胞、血小板、白细胞、血浆的费用医疗机构对患者临床用血的收费包括血站供应价格、配血费和储血费，计量单位为元）
     *
     * @param feeBlood 血液和血液制品类-血费（患者住院期间使用临床用血所产生的费用，包括输注全血、红细胞、血小板、白细胞、血浆的费用医疗机构对患者临床用血的收费包括血站供应价格、配血费和储血费，计量单位为元）
     */
    public void setFeeBlood(BigDecimal feeBlood) {
        this.feeBlood = feeBlood;
    }

    /**
     * 获取血液和血液制品类-白蛋白类制品费（患者住院期间使用白蛋白的费用，计量单位为元）
     *
     * @return FEE_ALBUMIN - 血液和血液制品类-白蛋白类制品费（患者住院期间使用白蛋白的费用，计量单位为元）
     */
    public BigDecimal getFeeAlbumin() {
        return feeAlbumin;
    }

    /**
     * 设置血液和血液制品类-白蛋白类制品费（患者住院期间使用白蛋白的费用，计量单位为元）
     *
     * @param feeAlbumin 血液和血液制品类-白蛋白类制品费（患者住院期间使用白蛋白的费用，计量单位为元）
     */
    public void setFeeAlbumin(BigDecimal feeAlbumin) {
        this.feeAlbumin = feeAlbumin;
    }

    /**
     * 获取血液和血液制品类-球蛋白类制品费（患者住院期间使用球蛋白的费用，计量单位为元）
     *
     * @return FEE_GLOBULIN - 血液和血液制品类-球蛋白类制品费（患者住院期间使用球蛋白的费用，计量单位为元）
     */
    public BigDecimal getFeeGlobulin() {
        return feeGlobulin;
    }

    /**
     * 设置血液和血液制品类-球蛋白类制品费（患者住院期间使用球蛋白的费用，计量单位为元）
     *
     * @param feeGlobulin 血液和血液制品类-球蛋白类制品费（患者住院期间使用球蛋白的费用，计量单位为元）
     */
    public void setFeeGlobulin(BigDecimal feeGlobulin) {
        this.feeGlobulin = feeGlobulin;
    }

    /**
     * 获取血液和血液制品类-凝血因子类制品费（患者住院期间使用凝血因子的费用，计量单位为元）
     *
     * @return FEE_BCF - 血液和血液制品类-凝血因子类制品费（患者住院期间使用凝血因子的费用，计量单位为元）
     */
    public BigDecimal getFeeBcf() {
        return feeBcf;
    }

    /**
     * 设置血液和血液制品类-凝血因子类制品费（患者住院期间使用凝血因子的费用，计量单位为元）
     *
     * @param feeBcf 血液和血液制品类-凝血因子类制品费（患者住院期间使用凝血因子的费用，计量单位为元）
     */
    public void setFeeBcf(BigDecimal feeBcf) {
        this.feeBcf = feeBcf;
    }

    /**
     * 获取血液和血液制品类-细胞因子类制品费（患者住院期间使用细胞因子的费用，计量单位为元）
     *
     * @return FEE_CYTOKINE - 血液和血液制品类-细胞因子类制品费（患者住院期间使用细胞因子的费用，计量单位为元）
     */
    public BigDecimal getFeeCytokine() {
        return feeCytokine;
    }

    /**
     * 设置血液和血液制品类-细胞因子类制品费（患者住院期间使用细胞因子的费用，计量单位为元）
     *
     * @param feeCytokine 血液和血液制品类-细胞因子类制品费（患者住院期间使用细胞因子的费用，计量单位为元）
     */
    public void setFeeCytokine(BigDecimal feeCytokine) {
        this.feeCytokine = feeCytokine;
    }

    /**
     * 获取耗材类-检查用一次性医用材料费（患者住院期间检查检验所使用的一次性医用材料费用，计量单位为元）
     *
     * @return FEE_CHECK_MATERIAL - 耗材类-检查用一次性医用材料费（患者住院期间检查检验所使用的一次性医用材料费用，计量单位为元）
     */
    public BigDecimal getFeeCheckMaterial() {
        return feeCheckMaterial;
    }

    /**
     * 设置耗材类-检查用一次性医用材料费（患者住院期间检查检验所使用的一次性医用材料费用，计量单位为元）
     *
     * @param feeCheckMaterial 耗材类-检查用一次性医用材料费（患者住院期间检查检验所使用的一次性医用材料费用，计量单位为元）
     */
    public void setFeeCheckMaterial(BigDecimal feeCheckMaterial) {
        this.feeCheckMaterial = feeCheckMaterial;
    }

    /**
     * 获取耗材类-治疗用一次性医用材料费（患者住院期间治疗所使用的一次性医用材料费用，计量单位为元）
     *
     * @return FEE_TREAT_MATERIAL - 耗材类-治疗用一次性医用材料费（患者住院期间治疗所使用的一次性医用材料费用，计量单位为元）
     */
    public BigDecimal getFeeTreatMaterial() {
        return feeTreatMaterial;
    }

    /**
     * 设置耗材类-治疗用一次性医用材料费（患者住院期间治疗所使用的一次性医用材料费用，计量单位为元）
     *
     * @param feeTreatMaterial 耗材类-治疗用一次性医用材料费（患者住院期间治疗所使用的一次性医用材料费用，计量单位为元）
     */
    public void setFeeTreatMaterial(BigDecimal feeTreatMaterial) {
        this.feeTreatMaterial = feeTreatMaterial;
    }

    /**
     * 获取耗材类-手术用一次性医用材料费（患者住院期间进行手术、介入操作时所使用的一次性医用材料费用，计量单位为元）
     *
     * @return FEE_OPER_MATERIAL - 耗材类-手术用一次性医用材料费（患者住院期间进行手术、介入操作时所使用的一次性医用材料费用，计量单位为元）
     */
    public BigDecimal getFeeOperMaterial() {
        return feeOperMaterial;
    }

    /**
     * 设置耗材类-手术用一次性医用材料费（患者住院期间进行手术、介入操作时所使用的一次性医用材料费用，计量单位为元）
     *
     * @param feeOperMaterial 耗材类-手术用一次性医用材料费（患者住院期间进行手术、介入操作时所使用的一次性医用材料费用，计量单位为元）
     */
    public void setFeeOperMaterial(BigDecimal feeOperMaterial) {
        this.feeOperMaterial = feeOperMaterial;
    }

    /**
     * 获取其他类-其他费（患者住院期间未能归入以上各类的费用总和，计量单位为元）
     *
     * @return FEE_OTHER - 其他类-其他费（患者住院期间未能归入以上各类的费用总和，计量单位为元）
     */
    public BigDecimal getFeeOther() {
        return feeOther;
    }

    /**
     * 设置其他类-其他费（患者住院期间未能归入以上各类的费用总和，计量单位为元）
     *
     * @param feeOther 其他类-其他费（患者住院期间未能归入以上各类的费用总和，计量单位为元）
     */
    public void setFeeOther(BigDecimal feeOther) {
        this.feeOther = feeOther;
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
}