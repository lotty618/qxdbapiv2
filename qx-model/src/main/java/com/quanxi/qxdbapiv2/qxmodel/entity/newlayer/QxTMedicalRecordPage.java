package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_PAGE")
public class QxTMedicalRecordPage {
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
     * 病案首页报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

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
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    @Column(name = "HEALTH_CARD_NO")
    private String healthCardNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private Long hospitaltalizationTimes;

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
     * 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    @Column(name = "AGE_YEAR")
    private Long ageYear;

    /**
     * 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
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
    private BigDecimal birthWeight;

    /**
     * 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    @Column(name = "BABY_INPATIENT_WEIGHT")
    private BigDecimal babyInpatientWeight;

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
     * 出生地-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    @Column(name = "BIRTH_ADDR_TOWN")
    private String birthAddrTown;

    /**
     * 出生地-村(街、路、弄等)（个体或机构地址中的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "BIRTH_ADDR_VILLAGE")
    private String birthAddrVillage;

    /**
     * 出生地-门牌号码（个体或机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "BIRTH_ADDR_HOUSE_NO")
    private String birthAddrHouseNo;

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
     * 联系人-地址（地址的详细描述）
     */
    @Column(name = "CONTACT_ADDRESS")
    private String contactAddress;

    /**
     * 联系人-电话（联系人的电话号码，包括国际、国内区号和分机号）
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
    private Long actualInDays;

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
     * 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    @Column(name = "DRUG_ALLERGY_MARK")
    private Long drugAllergyMark;

    /**
     * 过敏药物（患者在本次住院治疗以及既往就诊过程中的过敏药物的描述）
     */
    @Column(name = "DRUG_ALLERGENS_NAME")
    private String drugAllergensName;

    /**
     * 死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     */
    @Column(name = "AUTOPSY_MARK")
    private Long autopsyMark;

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
    private Long rehospAfter31Mark;

    /**
     * 出院31天内再住院目的（患者计划在本次住院出院后31天内再住院的目的）
     */
    @Column(name = "REHOSP_AFTER31_PURPOSE")
    private String rehospAfter31Purpose;

    /**
     * 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    @Column(name = "COMA_DURATION_BEFORE")
    private Long comaDurationBefore;

    /**
     * 颅脑损伤患者入院后昏迷时间（min)（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    @Column(name = "COMA_DURATION_AFTER")
    private Long comaDurationAfter;

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
     * 创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 死亡原因描述（患者死亡直接原因的详细描述）
     */
    @Column(name = "DEATH_CAUSE")
    private String deathCause;

    /**
     * 死亡根本原因诊断代码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    @Column(name = "ROOT_DEATH_CODE")
    private String rootDeathCode;

    /**
     * 死亡根本原因诊断中文名称（死亡诊断在特定编码体系中的中文名称）
     */
    @Column(name = "ROOT_DEATH_CN")
    private String rootDeathCn;

    /**
     * 输液反应标志0否 1是（标识个体是否出现输液反应）
     */
    @Column(name = "INFUSION_REACTION_MARK")
    private Long infusionReactionMark;

    /**
     * 随访时间间隔(天)（两次随访的间隔天数，单位（天））
     */
    @Column(name = "FOLLOW_INTERVAL")
    private Long followInterval;

    /**
     * 科研病例标志0否 1是（标识个体案例是否为科研病例）
     */
    @Column(name = "RESEARCH_EXAMPLE_MARK")
    private Long researchExampleMark;

    /**
     * 手术为本院第一例标志0否 1是（标识个体接受的手术治疗为本院第一例）
     */
    @Column(name = "FIRST_OPERATION_MARK")
    private Long firstOperationMark;

    /**
     * 治疗为本院第一例标志0否 1是（是否治疗为本院第一例）
     */
    @Column(name = "FIRST_TREATMENT_MARK")
    private Long firstTreatmentMark;

    /**
     * 检查为本院第一例标志0否 1是（是否检查为本院第一例）
     */
    @Column(name = "FIRST_EXAM_MARK")
    private Long firstExamMark;

    /**
     * 诊断为本院第一例标志0否 1是（是否诊断为本院第一例）
     */
    @Column(name = "FIRST_DIAGNOSIS_MARK")
    private Long firstDiagnosisMark;

    /**
     * 传染性标志0否 1是（标识是否传染性）
     */
    @Column(name = "INFECTIOUS_MARK")
    private Long infectiousMark;

    /**
     * 传染病分类代码DIR_DANGER_LEVEL（传染病防治法规定的传染病的类别在特定分类中的代码）
     */
    @Column(name = "INFECTIOUS_TYPE_CODE")
    private String infectiousTypeCode;

    /**
     * 传染病分类中文名称（传染病防治法规定的传染病的类别在特定分类中的中文名称）
     */
    @Column(name = "INFECTIOUS_TYPE_CN")
    private String infectiousTypeCn;

    /**
     * 传染病已报标志0否 1是（标识个体传染病是否已上报）
     */
    @Column(name = "INFECTIOUS_REPORTED_MARK")
    private Long infectiousReportedMark;

    /**
     * 感染次数（受检者的感染累计次数）
     */
    @Column(name = "INFECTIOUSNESS_TIMES")
    private Long infectiousnessTimes;

    /**
     * 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    @Column(name = "INSURANCE_NO")
    private String insuranceNo;

    /**
     * 入院情况代码CV05.10.019（入院情况所对应的代码）
     */
    @Column(name = "IN_CONDITION_CODE")
    private String inConditionCode;

    /**
     * 入院情况中文名称（入院情况所对应的中文名称）
     */
    @Column(name = "IN_CONDITION_CN")
    private String inConditionCn;

    /**
     * 过敏源代码CV05.01.038（诱发本人过敏性疾病的药物代码）
     */
    @Column(name = "ALLERGENS_CODE")
    private String allergensCode;

    /**
     * 过敏源中文名称（诱发本人过敏性疾病的药物中文名称）
     */
    @Column(name = "ALLERGENS_CN")
    private String allergensCn;

    /**
     * HbsAg 检查结果代码DIR_SEROLOGY_TEST_RESULT（受检者 HbsAg 检查结果在特定编码体系中的代码）
     */
    @Column(name = "HBSAG_CODE")
    private String hbsagCode;

    /**
     * HbsAg 检查结果中文名称（受检者 HbsAg 检查结果在特定编码体系中的中文名称）
     */
    @Column(name = "HBSAG_CN")
    private String hbsagCn;

    /**
     * HCV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HCV_Ab 检查结果在特定编码体系中的编码）
     */
    @Column(name = "HCV_AB_CODE")
    private String hcvAbCode;

    /**
     * HCV_Ab 检查结果中文名称（HCV_Ab 检查结果在特定编码体系中的中文名称）
     */
    @Column(name = "HCV_AB_CN")
    private String hcvAbCn;

    /**
     * HIV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HIV_Ab 检查结果在特定编码体系中的编码）
     */
    @Column(name = "HIV_AB_CODE")
    private String hivAbCode;

    /**
     * HIV_Ab 检查结果中文名称（HIV_Ab 检查结果在特定编码体系中的中文名称）
     */
    @Column(name = "HIV_AB_CN")
    private String hivAbCn;

    /**
     * 门诊与出院诊断对比符合情况代码DIR_MATCH_RESULT（门诊与出院诊断对比符合情况在特定编码体系中的代码）
     */
    @Column(name = "CLINIC2OUT_CODE")
    private String clinic2outCode;

    /**
     * 门诊与出院诊断对比符合情况中文名称（门诊与出院诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "CLINIC2OUT_CN")
    private String clinic2outCn;

    /**
     * 入院与出院诊断对比符合情况代码DIR_MATCH_RESULT（个体入院与出院诊断对比符合情况的分类代码）
     */
    @Column(name = "IN2OUT_CODE")
    private String in2outCode;

    /**
     * 入院与出院诊断对比符合情况中文名称（个体入院与出院诊断对比符合情况的分类中文名称）
     */
    @Column(name = "IN2OUT_CN")
    private String in2outCn;

    /**
     * 术前与术后诊断对比符合情况代码DIR_MATCH_RESULT（个体术前与术后诊断对比符合情况的分类代码）
     */
    @Column(name = "PRE_OPER2OPER_CODE")
    private String preOper2operCode;

    /**
     * 术前与术后诊断对比符合情况中文名称（个体术前与术后诊断对比符合情况的分类中文名称）
     */
    @Column(name = "PRE_OPER2OPER_CN")
    private String preOper2operCn;

    /**
     * 放射与术后诊断对比符合情况代码DIR_MATCH_RESULT（放射与术后诊断对比符合情况在特定编码体系中的代码）
     */
    @Column(name = "RADIATION2OPER_CODE")
    private String radiation2operCode;

    /**
     * 放射与术后诊断对比符合情况中文名称（放射与术后诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "RADIATION2OPER_CN")
    private String radiation2operCn;

    /**
     * 临床与病理诊断对比符合情况代码DIR_MATCH_RESULT（临床与病理诊断对比符合情况在特定编码体系中的代码）
     */
    @Column(name = "CLINIC2PATHOLOGY_CODE")
    private String clinic2pathologyCode;

    /**
     * 临床与病理诊断对比符合情况中文名称（临床与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "CLINIC2PATHOLOGY_CN")
    private String clinic2pathologyCn;

    /**
     * 放射与病理诊断对比符合情况代码DIR_MATCH_RESULT（放射与病理诊断对比符合情况在特定编码体系中的代码）
     */
    @Column(name = "RADIATION2PATHOLOGY_CODE")
    private String radiation2pathologyCode;

    /**
     * 放射与病理诊断对比符合情况中文名称（放射与病理诊断对比符合情况在特定编码体系中的中文名称）
     */
    @Column(name = "RADIATION2PATHOLOGY_CN")
    private String radiation2pathologyCn;

    /**
     * 临床与尸检诊断对比符合情况代码DIR_MATCH_RESULT（个体临床与尸检诊断对比符合情况的分类代码）
     */
    @Column(name = "CLINIC2AUTOPSY_CODE")
    private String clinic2autopsyCode;

    /**
     * 临床与尸检诊断对比符合情况中文名称（个体临床与尸检诊断对比符合情况的分类中文名称）
     */
    @Column(name = "CLINIC2AUTOPSY_CN")
    private String clinic2autopsyCn;

    /**
     * 抢救次数（个体接受抢救的次数（次））
     */
    @Column(name = "SAVE_TIMES")
    private Long saveTimes;

    /**
     * 抢救成功次数（患者进行抢救并成功的次数合计）
     */
    @Column(name = "SAVE_SUCCESS_TIMES")
    private Long saveSuccessTimes;

    /**
     * 最高诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    @Column(name = "DIAG_BASIS_CODE")
    private String diagBasisCode;

    /**
     * 最高诊断依据中文名称（患者最高诊断依据在特定编码体系中的中文名称）
     */
    @Column(name = "DIAG_BASIS_CN")
    private String diagBasisCn;

    /**
     * 分化程度代码DIR_DIFFER_LEVEL（分化程度在特定编码体系中的代码）
     */
    @Column(name = "DIFFER_LEVEL_CODE")
    private String differLevelCode;

    /**
     * 分化程度中文名称（分化程度在特定编码体系中的中文名称）
     */
    @Column(name = "DIFFER_LEVEL_CN")
    private String differLevelCn;

    /**
     * 研究生实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "GRADUATE_INTERN_DOCTOR_NAME")
    private String graduateInternDoctorName;

    /**
     * 特级护理天数（个体在院期间接受特级护理的天数）
     */
    @Column(name = "PROTECT_SPECIAL")
    private Long protectSpecial;

    /**
     * 一级护理天数（个体在院期间接受一级护理的天数）
     */
    @Column(name = "PROTECT_I")
    private Long protectI;

    /**
     * 二级护理天数（个体接受二级护理的天数）
     */
    @Column(name = "PROTECT_II")
    private Long protectIi;

    /**
     * 三级护理天数（患者接受三级护理的天数合计）
     */
    @Column(name = "PROTECT_III")
    private Long protectIii;

    /**
     * 重症监护（重症监护过程的详细内容描述）
     */
    @Column(name = "INTENSIVE_CARE_THERAPY")
    private String intensiveCareTherapy;

    /**
     * 手术患者类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    @Column(name = "OPER_PATIENT_TYPE_CODE")
    private String operPatientTypeCode;

    /**
     * 手术患者类型中文名称（进行手术治疗的患者类型在特定编码体系中的中文名称）
     */
    @Column(name = "OPER_PATIENT_TYPE_CN")
    private String operPatientTypeCn;

    /**
     * 随诊周数（个体进行随诊的周数合计）
     */
    @Column(name = "FOLLOW_UP_WEEKS")
    private Long followUpWeeks;

    /**
     * 随诊月数（当前已随诊时长，单位为月）
     */
    @Column(name = "FOLLOW_UP_MONTHS")
    private Long followUpMonths;

    /**
     * 随诊年数（当前已随诊时长，单位为年）
     */
    @Column(name = "FOLLOW_UP_YEARS")
    private Long followUpYears;

    /**
     * 住院患者示教病例标志0否 1是（标识该患者是否被作为教学示范病例）
     */
    @Column(name = "TEACHING_EXAMPLE_MARK")
    private Long teachingExampleMark;

    /**
     * 住院患者输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    @Column(name = "TRANSFUSION_REACTION_MARK")
    private Long transfusionReactionMark;

    /**
     * 输红细胞量(单位)（输红细胞量(单位)）
     */
    @Column(name = "RED_BLOOD_CELL")
    private BigDecimal redBloodCell;

    /**
     * 输血小板量(袋)（输血小板量(袋)）
     */
    @Column(name = "PLATELET")
    private BigDecimal platelet;

    /**
     * 输血浆量(ml)（患者进行输血的血浆量结果值）
     */
    @Column(name = "PLASMA")
    private BigDecimal plasma;

    /**
     * 输全血量(ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    @Column(name = "WHOLE_BLOOD")
    private BigDecimal wholeBlood;

    /**
     * 自身回收(ml)（血液自身回收量，单位为(ml)）
     */
    @Column(name = "SELF_BLOOD")
    private BigDecimal selfBlood;

    /**
     * 输其它血制品量(ml)（输其它血制品量(ml)）
     */
    @Column(name = "OTHER_BLOOD")
    private BigDecimal otherBlood;

    /**
     * 住院患者随诊标志0否 1是（标识该患者是否需要随诊）
     */
    @Column(name = "FOLLOW_MARK")
    private Long followMark;

    /**
     * 婴幼儿年龄（天）（婴幼儿的年龄，单位为天）
     */
    @Column(name = "AGE_BABY")
    private Long ageBaby;

    /**
     * 呼吸机使用时间（h）（呼吸机使用时长，单位为小时）
     */
    @Column(name = "LIFE_SUPPORT_MACHINE_TIME")
    private String lifeSupportMachineTime;

    /**
     * 转入医院名称（转入的医疗机构名称）
     */
    @Column(name = "REF_IN_ORG_NAME")
    private String refInOrgName;

    /**
     * 入院本院科室代码（患者入院时，入住的科室本地代码）
     */
    @Column(name = "IN_DEPT_TYPE_CODE")
    private String inDeptTypeCode;

    /**
     * 入院本院科室名称（患者入院时，入住的科室本地名称）
     */
    @Column(name = "IN_DEPT_TYPE_NAME")
    private String inDeptTypeName;

    /**
     * 转科本院科别代码（患者住院期间转科的转入科室本地代码）
     */
    @Column(name = "MOVE_DEPT_TYPE_CODE")
    private String moveDeptTypeCode;

    /**
     * 转科本院科别名称（患者住院期间转科的转入科室本地名称，如果超过一次以上的转科，用“→”转接表示）
     */
    @Column(name = "MOVE_DEPT_TYPE_NAME")
    private String moveDeptTypeName;

    /**
     * 出院本院科别代码（患者出院时的科室本地代码）
     */
    @Column(name = "OUT_DEPT_TYPE_CODE")
    private String outDeptTypeCode;

    /**
     * 出院本院科别名称（患者出院时的科室本地名称）
     */
    @Column(name = "OUT_DEPT_TYPE_NAME")
    private String outDeptTypeName;

    /**
     * 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DEATH_DTIME")
    private String deathDtime;

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
     * 病历解析
     */
    @Column(name = "EMR_PARSING")
    private String emrParsing;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

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
    @Column(name = "INPUT_TIME")
    private String inputTime;

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
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

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
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @return HOSPITALTALIZATION_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public Long getHospitaltalizationTimes() {
        return hospitaltalizationTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @param hospitaltalizationTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public void setHospitaltalizationTimes(Long hospitaltalizationTimes) {
        this.hospitaltalizationTimes = hospitaltalizationTimes;
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
     * 获取年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @return AGE_YEAR - 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public Long getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @param ageYear 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public void setAgeYear(Long ageYear) {
        this.ageYear = ageYear;
    }

    /**
     * 获取年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_MONTH - 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageMonth 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
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
    public BigDecimal getBirthWeight() {
        return birthWeight;
    }

    /**
     * 设置新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     *
     * @param birthWeight 新生儿出生体重（新生儿出生后第1小时内第1次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    public void setBirthWeight(BigDecimal birthWeight) {
        this.birthWeight = birthWeight;
    }

    /**
     * 获取新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     *
     * @return BABY_INPATIENT_WEIGHT - 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    public BigDecimal getBabyInpatientWeight() {
        return babyInpatientWeight;
    }

    /**
     * 设置新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     *
     * @param babyInpatientWeight 新生儿入院体重（g）（新生儿患儿入院时称得的重量，新生儿期住院的患儿应填写）
     */
    public void setBabyInpatientWeight(BigDecimal babyInpatientWeight) {
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
     * 获取出生地-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @return BIRTH_ADDR_TOWN - 出生地-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public String getBirthAddrTown() {
        return birthAddrTown;
    }

    /**
     * 设置出生地-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @param birthAddrTown 出生地-乡(镇、街道办事处)（个体或机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public void setBirthAddrTown(String birthAddrTown) {
        this.birthAddrTown = birthAddrTown == null ? null : birthAddrTown.trim();
    }

    /**
     * 获取出生地-村(街、路、弄等)（个体或机构地址中的村或城市的街、路、里、弄等名称）
     *
     * @return BIRTH_ADDR_VILLAGE - 出生地-村(街、路、弄等)（个体或机构地址中的村或城市的街、路、里、弄等名称）
     */
    public String getBirthAddrVillage() {
        return birthAddrVillage;
    }

    /**
     * 设置出生地-村(街、路、弄等)（个体或机构地址中的村或城市的街、路、里、弄等名称）
     *
     * @param birthAddrVillage 出生地-村(街、路、弄等)（个体或机构地址中的村或城市的街、路、里、弄等名称）
     */
    public void setBirthAddrVillage(String birthAddrVillage) {
        this.birthAddrVillage = birthAddrVillage == null ? null : birthAddrVillage.trim();
    }

    /**
     * 获取出生地-门牌号码（个体或机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return BIRTH_ADDR_HOUSE_NO - 出生地-门牌号码（个体或机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getBirthAddrHouseNo() {
        return birthAddrHouseNo;
    }

    /**
     * 设置出生地-门牌号码（个体或机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param birthAddrHouseNo 出生地-门牌号码（个体或机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setBirthAddrHouseNo(String birthAddrHouseNo) {
        this.birthAddrHouseNo = birthAddrHouseNo == null ? null : birthAddrHouseNo.trim();
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
     * 获取联系人-地址（地址的详细描述）
     *
     * @return CONTACT_ADDRESS - 联系人-地址（地址的详细描述）
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置联系人-地址（地址的详细描述）
     *
     * @param contactAddress 联系人-地址（地址的详细描述）
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 获取联系人-电话（联系人的电话号码，包括国际、国内区号和分机号）
     *
     * @return CONTACT_TEL_NO - 联系人-电话（联系人的电话号码，包括国际、国内区号和分机号）
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * 设置联系人-电话（联系人的电话号码，包括国际、国内区号和分机号）
     *
     * @param contactTelNo 联系人-电话（联系人的电话号码，包括国际、国内区号和分机号）
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
    public Long getActualInDays() {
        return actualInDays;
    }

    /**
     * 设置实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     *
     * @param actualInDays 实际住院天数（患者实际的住院天数，入院日与出院日只计算 1 天）
     */
    public void setActualInDays(Long actualInDays) {
        this.actualInDays = actualInDays;
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
     * 获取药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     *
     * @return DRUG_ALLERGY_MARK - 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    public Long getDrugAllergyMark() {
        return drugAllergyMark;
    }

    /**
     * 设置药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     *
     * @param drugAllergyMark 药物过敏标志0否 1是（患者在本次住院治疗以及既往就诊过程中有无明确药物过敏史的标志）
     */
    public void setDrugAllergyMark(Long drugAllergyMark) {
        this.drugAllergyMark = drugAllergyMark;
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
    public Long getAutopsyMark() {
        return autopsyMark;
    }

    /**
     * 设置死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     *
     * @param autopsyMark 死亡患者尸检标志0否 1是（标识是否对死亡患者的机体进行剖验，以明确死亡原因的标志）
     */
    public void setAutopsyMark(Long autopsyMark) {
        this.autopsyMark = autopsyMark;
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
    public Long getRehospAfter31Mark() {
        return rehospAfter31Mark;
    }

    /**
     * 设置出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     *
     * @param rehospAfter31Mark 出院31天内再住院计划标志0否 1是（标识患者本次住院出院后31天内是否有诊疗需要的再住院安排的标志）
     */
    public void setRehospAfter31Mark(Long rehospAfter31Mark) {
        this.rehospAfter31Mark = rehospAfter31Mark;
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
     * 获取颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     *
     * @return COMA_DURATION_BEFORE - 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    public Long getComaDurationBefore() {
        return comaDurationBefore;
    }

    /**
     * 设置颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     *
     * @param comaDurationBefore 颅脑损伤患者入院前昏迷时间（min）（颅脑损伤患者入院前昏迷时间的分钟数）
     */
    public void setComaDurationBefore(Long comaDurationBefore) {
        this.comaDurationBefore = comaDurationBefore;
    }

    /**
     * 获取颅脑损伤患者入院后昏迷时间（min)（颅脑损伤患者入院后昏迷时间的分钟数）
     *
     * @return COMA_DURATION_AFTER - 颅脑损伤患者入院后昏迷时间（min)（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    public Long getComaDurationAfter() {
        return comaDurationAfter;
    }

    /**
     * 设置颅脑损伤患者入院后昏迷时间（min)（颅脑损伤患者入院后昏迷时间的分钟数）
     *
     * @param comaDurationAfter 颅脑损伤患者入院后昏迷时间（min)（颅脑损伤患者入院后昏迷时间的分钟数）
     */
    public void setComaDurationAfter(Long comaDurationAfter) {
        this.comaDurationAfter = comaDurationAfter;
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
     * 获取创建时间（为服务对象建立相关档案当日的公元纪年日期）
     *
     * @return EFFECTIVE_DATE - 创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置创建时间（为服务对象建立相关档案当日的公元纪年日期）
     *
     * @param effectiveDate 创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取死亡原因描述（患者死亡直接原因的详细描述）
     *
     * @return DEATH_CAUSE - 死亡原因描述（患者死亡直接原因的详细描述）
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * 设置死亡原因描述（患者死亡直接原因的详细描述）
     *
     * @param deathCause 死亡原因描述（患者死亡直接原因的详细描述）
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * 获取死亡根本原因诊断代码ICD-10（死亡诊断在特定编码体系中的编码）
     *
     * @return ROOT_DEATH_CODE - 死亡根本原因诊断代码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    public String getRootDeathCode() {
        return rootDeathCode;
    }

    /**
     * 设置死亡根本原因诊断代码ICD-10（死亡诊断在特定编码体系中的编码）
     *
     * @param rootDeathCode 死亡根本原因诊断代码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    public void setRootDeathCode(String rootDeathCode) {
        this.rootDeathCode = rootDeathCode == null ? null : rootDeathCode.trim();
    }

    /**
     * 获取死亡根本原因诊断中文名称（死亡诊断在特定编码体系中的中文名称）
     *
     * @return ROOT_DEATH_CN - 死亡根本原因诊断中文名称（死亡诊断在特定编码体系中的中文名称）
     */
    public String getRootDeathCn() {
        return rootDeathCn;
    }

    /**
     * 设置死亡根本原因诊断中文名称（死亡诊断在特定编码体系中的中文名称）
     *
     * @param rootDeathCn 死亡根本原因诊断中文名称（死亡诊断在特定编码体系中的中文名称）
     */
    public void setRootDeathCn(String rootDeathCn) {
        this.rootDeathCn = rootDeathCn == null ? null : rootDeathCn.trim();
    }

    /**
     * 获取输液反应标志0否 1是（标识个体是否出现输液反应）
     *
     * @return INFUSION_REACTION_MARK - 输液反应标志0否 1是（标识个体是否出现输液反应）
     */
    public Long getInfusionReactionMark() {
        return infusionReactionMark;
    }

    /**
     * 设置输液反应标志0否 1是（标识个体是否出现输液反应）
     *
     * @param infusionReactionMark 输液反应标志0否 1是（标识个体是否出现输液反应）
     */
    public void setInfusionReactionMark(Long infusionReactionMark) {
        this.infusionReactionMark = infusionReactionMark;
    }

    /**
     * 获取随访时间间隔(天)（两次随访的间隔天数，单位（天））
     *
     * @return FOLLOW_INTERVAL - 随访时间间隔(天)（两次随访的间隔天数，单位（天））
     */
    public Long getFollowInterval() {
        return followInterval;
    }

    /**
     * 设置随访时间间隔(天)（两次随访的间隔天数，单位（天））
     *
     * @param followInterval 随访时间间隔(天)（两次随访的间隔天数，单位（天））
     */
    public void setFollowInterval(Long followInterval) {
        this.followInterval = followInterval;
    }

    /**
     * 获取科研病例标志0否 1是（标识个体案例是否为科研病例）
     *
     * @return RESEARCH_EXAMPLE_MARK - 科研病例标志0否 1是（标识个体案例是否为科研病例）
     */
    public Long getResearchExampleMark() {
        return researchExampleMark;
    }

    /**
     * 设置科研病例标志0否 1是（标识个体案例是否为科研病例）
     *
     * @param researchExampleMark 科研病例标志0否 1是（标识个体案例是否为科研病例）
     */
    public void setResearchExampleMark(Long researchExampleMark) {
        this.researchExampleMark = researchExampleMark;
    }

    /**
     * 获取手术为本院第一例标志0否 1是（标识个体接受的手术治疗为本院第一例）
     *
     * @return FIRST_OPERATION_MARK - 手术为本院第一例标志0否 1是（标识个体接受的手术治疗为本院第一例）
     */
    public Long getFirstOperationMark() {
        return firstOperationMark;
    }

    /**
     * 设置手术为本院第一例标志0否 1是（标识个体接受的手术治疗为本院第一例）
     *
     * @param firstOperationMark 手术为本院第一例标志0否 1是（标识个体接受的手术治疗为本院第一例）
     */
    public void setFirstOperationMark(Long firstOperationMark) {
        this.firstOperationMark = firstOperationMark;
    }

    /**
     * 获取治疗为本院第一例标志0否 1是（是否治疗为本院第一例）
     *
     * @return FIRST_TREATMENT_MARK - 治疗为本院第一例标志0否 1是（是否治疗为本院第一例）
     */
    public Long getFirstTreatmentMark() {
        return firstTreatmentMark;
    }

    /**
     * 设置治疗为本院第一例标志0否 1是（是否治疗为本院第一例）
     *
     * @param firstTreatmentMark 治疗为本院第一例标志0否 1是（是否治疗为本院第一例）
     */
    public void setFirstTreatmentMark(Long firstTreatmentMark) {
        this.firstTreatmentMark = firstTreatmentMark;
    }

    /**
     * 获取检查为本院第一例标志0否 1是（是否检查为本院第一例）
     *
     * @return FIRST_EXAM_MARK - 检查为本院第一例标志0否 1是（是否检查为本院第一例）
     */
    public Long getFirstExamMark() {
        return firstExamMark;
    }

    /**
     * 设置检查为本院第一例标志0否 1是（是否检查为本院第一例）
     *
     * @param firstExamMark 检查为本院第一例标志0否 1是（是否检查为本院第一例）
     */
    public void setFirstExamMark(Long firstExamMark) {
        this.firstExamMark = firstExamMark;
    }

    /**
     * 获取诊断为本院第一例标志0否 1是（是否诊断为本院第一例）
     *
     * @return FIRST_DIAGNOSIS_MARK - 诊断为本院第一例标志0否 1是（是否诊断为本院第一例）
     */
    public Long getFirstDiagnosisMark() {
        return firstDiagnosisMark;
    }

    /**
     * 设置诊断为本院第一例标志0否 1是（是否诊断为本院第一例）
     *
     * @param firstDiagnosisMark 诊断为本院第一例标志0否 1是（是否诊断为本院第一例）
     */
    public void setFirstDiagnosisMark(Long firstDiagnosisMark) {
        this.firstDiagnosisMark = firstDiagnosisMark;
    }

    /**
     * 获取传染性标志0否 1是（标识是否传染性）
     *
     * @return INFECTIOUS_MARK - 传染性标志0否 1是（标识是否传染性）
     */
    public Long getInfectiousMark() {
        return infectiousMark;
    }

    /**
     * 设置传染性标志0否 1是（标识是否传染性）
     *
     * @param infectiousMark 传染性标志0否 1是（标识是否传染性）
     */
    public void setInfectiousMark(Long infectiousMark) {
        this.infectiousMark = infectiousMark;
    }

    /**
     * 获取传染病分类代码DIR_DANGER_LEVEL（传染病防治法规定的传染病的类别在特定分类中的代码）
     *
     * @return INFECTIOUS_TYPE_CODE - 传染病分类代码DIR_DANGER_LEVEL（传染病防治法规定的传染病的类别在特定分类中的代码）
     */
    public String getInfectiousTypeCode() {
        return infectiousTypeCode;
    }

    /**
     * 设置传染病分类代码DIR_DANGER_LEVEL（传染病防治法规定的传染病的类别在特定分类中的代码）
     *
     * @param infectiousTypeCode 传染病分类代码DIR_DANGER_LEVEL（传染病防治法规定的传染病的类别在特定分类中的代码）
     */
    public void setInfectiousTypeCode(String infectiousTypeCode) {
        this.infectiousTypeCode = infectiousTypeCode == null ? null : infectiousTypeCode.trim();
    }

    /**
     * 获取传染病分类中文名称（传染病防治法规定的传染病的类别在特定分类中的中文名称）
     *
     * @return INFECTIOUS_TYPE_CN - 传染病分类中文名称（传染病防治法规定的传染病的类别在特定分类中的中文名称）
     */
    public String getInfectiousTypeCn() {
        return infectiousTypeCn;
    }

    /**
     * 设置传染病分类中文名称（传染病防治法规定的传染病的类别在特定分类中的中文名称）
     *
     * @param infectiousTypeCn 传染病分类中文名称（传染病防治法规定的传染病的类别在特定分类中的中文名称）
     */
    public void setInfectiousTypeCn(String infectiousTypeCn) {
        this.infectiousTypeCn = infectiousTypeCn == null ? null : infectiousTypeCn.trim();
    }

    /**
     * 获取传染病已报标志0否 1是（标识个体传染病是否已上报）
     *
     * @return INFECTIOUS_REPORTED_MARK - 传染病已报标志0否 1是（标识个体传染病是否已上报）
     */
    public Long getInfectiousReportedMark() {
        return infectiousReportedMark;
    }

    /**
     * 设置传染病已报标志0否 1是（标识个体传染病是否已上报）
     *
     * @param infectiousReportedMark 传染病已报标志0否 1是（标识个体传染病是否已上报）
     */
    public void setInfectiousReportedMark(Long infectiousReportedMark) {
        this.infectiousReportedMark = infectiousReportedMark;
    }

    /**
     * 获取感染次数（受检者的感染累计次数）
     *
     * @return INFECTIOUSNESS_TIMES - 感染次数（受检者的感染累计次数）
     */
    public Long getInfectiousnessTimes() {
        return infectiousnessTimes;
    }

    /**
     * 设置感染次数（受检者的感染累计次数）
     *
     * @param infectiousnessTimes 感染次数（受检者的感染累计次数）
     */
    public void setInfectiousnessTimes(Long infectiousnessTimes) {
        this.infectiousnessTimes = infectiousnessTimes;
    }

    /**
     * 获取医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @return INSURANCE_NO - 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * 设置医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @param insuranceNo 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo == null ? null : insuranceNo.trim();
    }

    /**
     * 获取入院情况代码CV05.10.019（入院情况所对应的代码）
     *
     * @return IN_CONDITION_CODE - 入院情况代码CV05.10.019（入院情况所对应的代码）
     */
    public String getInConditionCode() {
        return inConditionCode;
    }

    /**
     * 设置入院情况代码CV05.10.019（入院情况所对应的代码）
     *
     * @param inConditionCode 入院情况代码CV05.10.019（入院情况所对应的代码）
     */
    public void setInConditionCode(String inConditionCode) {
        this.inConditionCode = inConditionCode == null ? null : inConditionCode.trim();
    }

    /**
     * 获取入院情况中文名称（入院情况所对应的中文名称）
     *
     * @return IN_CONDITION_CN - 入院情况中文名称（入院情况所对应的中文名称）
     */
    public String getInConditionCn() {
        return inConditionCn;
    }

    /**
     * 设置入院情况中文名称（入院情况所对应的中文名称）
     *
     * @param inConditionCn 入院情况中文名称（入院情况所对应的中文名称）
     */
    public void setInConditionCn(String inConditionCn) {
        this.inConditionCn = inConditionCn == null ? null : inConditionCn.trim();
    }

    /**
     * 获取过敏源代码CV05.01.038（诱发本人过敏性疾病的药物代码）
     *
     * @return ALLERGENS_CODE - 过敏源代码CV05.01.038（诱发本人过敏性疾病的药物代码）
     */
    public String getAllergensCode() {
        return allergensCode;
    }

    /**
     * 设置过敏源代码CV05.01.038（诱发本人过敏性疾病的药物代码）
     *
     * @param allergensCode 过敏源代码CV05.01.038（诱发本人过敏性疾病的药物代码）
     */
    public void setAllergensCode(String allergensCode) {
        this.allergensCode = allergensCode == null ? null : allergensCode.trim();
    }

    /**
     * 获取过敏源中文名称（诱发本人过敏性疾病的药物中文名称）
     *
     * @return ALLERGENS_CN - 过敏源中文名称（诱发本人过敏性疾病的药物中文名称）
     */
    public String getAllergensCn() {
        return allergensCn;
    }

    /**
     * 设置过敏源中文名称（诱发本人过敏性疾病的药物中文名称）
     *
     * @param allergensCn 过敏源中文名称（诱发本人过敏性疾病的药物中文名称）
     */
    public void setAllergensCn(String allergensCn) {
        this.allergensCn = allergensCn == null ? null : allergensCn.trim();
    }

    /**
     * 获取HbsAg 检查结果代码DIR_SEROLOGY_TEST_RESULT（受检者 HbsAg 检查结果在特定编码体系中的代码）
     *
     * @return HBSAG_CODE - HbsAg 检查结果代码DIR_SEROLOGY_TEST_RESULT（受检者 HbsAg 检查结果在特定编码体系中的代码）
     */
    public String getHbsagCode() {
        return hbsagCode;
    }

    /**
     * 设置HbsAg 检查结果代码DIR_SEROLOGY_TEST_RESULT（受检者 HbsAg 检查结果在特定编码体系中的代码）
     *
     * @param hbsagCode HbsAg 检查结果代码DIR_SEROLOGY_TEST_RESULT（受检者 HbsAg 检查结果在特定编码体系中的代码）
     */
    public void setHbsagCode(String hbsagCode) {
        this.hbsagCode = hbsagCode == null ? null : hbsagCode.trim();
    }

    /**
     * 获取HbsAg 检查结果中文名称（受检者 HbsAg 检查结果在特定编码体系中的中文名称）
     *
     * @return HBSAG_CN - HbsAg 检查结果中文名称（受检者 HbsAg 检查结果在特定编码体系中的中文名称）
     */
    public String getHbsagCn() {
        return hbsagCn;
    }

    /**
     * 设置HbsAg 检查结果中文名称（受检者 HbsAg 检查结果在特定编码体系中的中文名称）
     *
     * @param hbsagCn HbsAg 检查结果中文名称（受检者 HbsAg 检查结果在特定编码体系中的中文名称）
     */
    public void setHbsagCn(String hbsagCn) {
        this.hbsagCn = hbsagCn == null ? null : hbsagCn.trim();
    }

    /**
     * 获取HCV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HCV_Ab 检查结果在特定编码体系中的编码）
     *
     * @return HCV_AB_CODE - HCV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HCV_Ab 检查结果在特定编码体系中的编码）
     */
    public String getHcvAbCode() {
        return hcvAbCode;
    }

    /**
     * 设置HCV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HCV_Ab 检查结果在特定编码体系中的编码）
     *
     * @param hcvAbCode HCV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HCV_Ab 检查结果在特定编码体系中的编码）
     */
    public void setHcvAbCode(String hcvAbCode) {
        this.hcvAbCode = hcvAbCode == null ? null : hcvAbCode.trim();
    }

    /**
     * 获取HCV_Ab 检查结果中文名称（HCV_Ab 检查结果在特定编码体系中的中文名称）
     *
     * @return HCV_AB_CN - HCV_Ab 检查结果中文名称（HCV_Ab 检查结果在特定编码体系中的中文名称）
     */
    public String getHcvAbCn() {
        return hcvAbCn;
    }

    /**
     * 设置HCV_Ab 检查结果中文名称（HCV_Ab 检查结果在特定编码体系中的中文名称）
     *
     * @param hcvAbCn HCV_Ab 检查结果中文名称（HCV_Ab 检查结果在特定编码体系中的中文名称）
     */
    public void setHcvAbCn(String hcvAbCn) {
        this.hcvAbCn = hcvAbCn == null ? null : hcvAbCn.trim();
    }

    /**
     * 获取HIV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HIV_Ab 检查结果在特定编码体系中的编码）
     *
     * @return HIV_AB_CODE - HIV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HIV_Ab 检查结果在特定编码体系中的编码）
     */
    public String getHivAbCode() {
        return hivAbCode;
    }

    /**
     * 设置HIV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HIV_Ab 检查结果在特定编码体系中的编码）
     *
     * @param hivAbCode HIV_Ab 检查结果代码DIR_SEROLOGY_TEST_RESULT（HIV_Ab 检查结果在特定编码体系中的编码）
     */
    public void setHivAbCode(String hivAbCode) {
        this.hivAbCode = hivAbCode == null ? null : hivAbCode.trim();
    }

    /**
     * 获取HIV_Ab 检查结果中文名称（HIV_Ab 检查结果在特定编码体系中的中文名称）
     *
     * @return HIV_AB_CN - HIV_Ab 检查结果中文名称（HIV_Ab 检查结果在特定编码体系中的中文名称）
     */
    public String getHivAbCn() {
        return hivAbCn;
    }

    /**
     * 设置HIV_Ab 检查结果中文名称（HIV_Ab 检查结果在特定编码体系中的中文名称）
     *
     * @param hivAbCn HIV_Ab 检查结果中文名称（HIV_Ab 检查结果在特定编码体系中的中文名称）
     */
    public void setHivAbCn(String hivAbCn) {
        this.hivAbCn = hivAbCn == null ? null : hivAbCn.trim();
    }

    /**
     * 获取门诊与出院诊断对比符合情况代码DIR_MATCH_RESULT（门诊与出院诊断对比符合情况在特定编码体系中的代码）
     *
     * @return CLINIC2OUT_CODE - 门诊与出院诊断对比符合情况代码DIR_MATCH_RESULT（门诊与出院诊断对比符合情况在特定编码体系中的代码）
     */
    public String getClinic2outCode() {
        return clinic2outCode;
    }

    /**
     * 设置门诊与出院诊断对比符合情况代码DIR_MATCH_RESULT（门诊与出院诊断对比符合情况在特定编码体系中的代码）
     *
     * @param clinic2outCode 门诊与出院诊断对比符合情况代码DIR_MATCH_RESULT（门诊与出院诊断对比符合情况在特定编码体系中的代码）
     */
    public void setClinic2outCode(String clinic2outCode) {
        this.clinic2outCode = clinic2outCode == null ? null : clinic2outCode.trim();
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
     * 获取入院与出院诊断对比符合情况代码DIR_MATCH_RESULT（个体入院与出院诊断对比符合情况的分类代码）
     *
     * @return IN2OUT_CODE - 入院与出院诊断对比符合情况代码DIR_MATCH_RESULT（个体入院与出院诊断对比符合情况的分类代码）
     */
    public String getIn2outCode() {
        return in2outCode;
    }

    /**
     * 设置入院与出院诊断对比符合情况代码DIR_MATCH_RESULT（个体入院与出院诊断对比符合情况的分类代码）
     *
     * @param in2outCode 入院与出院诊断对比符合情况代码DIR_MATCH_RESULT（个体入院与出院诊断对比符合情况的分类代码）
     */
    public void setIn2outCode(String in2outCode) {
        this.in2outCode = in2outCode == null ? null : in2outCode.trim();
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
     * 获取术前与术后诊断对比符合情况代码DIR_MATCH_RESULT（个体术前与术后诊断对比符合情况的分类代码）
     *
     * @return PRE_OPER2OPER_CODE - 术前与术后诊断对比符合情况代码DIR_MATCH_RESULT（个体术前与术后诊断对比符合情况的分类代码）
     */
    public String getPreOper2operCode() {
        return preOper2operCode;
    }

    /**
     * 设置术前与术后诊断对比符合情况代码DIR_MATCH_RESULT（个体术前与术后诊断对比符合情况的分类代码）
     *
     * @param preOper2operCode 术前与术后诊断对比符合情况代码DIR_MATCH_RESULT（个体术前与术后诊断对比符合情况的分类代码）
     */
    public void setPreOper2operCode(String preOper2operCode) {
        this.preOper2operCode = preOper2operCode == null ? null : preOper2operCode.trim();
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
     * 获取放射与术后诊断对比符合情况代码DIR_MATCH_RESULT（放射与术后诊断对比符合情况在特定编码体系中的代码）
     *
     * @return RADIATION2OPER_CODE - 放射与术后诊断对比符合情况代码DIR_MATCH_RESULT（放射与术后诊断对比符合情况在特定编码体系中的代码）
     */
    public String getRadiation2operCode() {
        return radiation2operCode;
    }

    /**
     * 设置放射与术后诊断对比符合情况代码DIR_MATCH_RESULT（放射与术后诊断对比符合情况在特定编码体系中的代码）
     *
     * @param radiation2operCode 放射与术后诊断对比符合情况代码DIR_MATCH_RESULT（放射与术后诊断对比符合情况在特定编码体系中的代码）
     */
    public void setRadiation2operCode(String radiation2operCode) {
        this.radiation2operCode = radiation2operCode == null ? null : radiation2operCode.trim();
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
     * 获取临床与病理诊断对比符合情况代码DIR_MATCH_RESULT（临床与病理诊断对比符合情况在特定编码体系中的代码）
     *
     * @return CLINIC2PATHOLOGY_CODE - 临床与病理诊断对比符合情况代码DIR_MATCH_RESULT（临床与病理诊断对比符合情况在特定编码体系中的代码）
     */
    public String getClinic2pathologyCode() {
        return clinic2pathologyCode;
    }

    /**
     * 设置临床与病理诊断对比符合情况代码DIR_MATCH_RESULT（临床与病理诊断对比符合情况在特定编码体系中的代码）
     *
     * @param clinic2pathologyCode 临床与病理诊断对比符合情况代码DIR_MATCH_RESULT（临床与病理诊断对比符合情况在特定编码体系中的代码）
     */
    public void setClinic2pathologyCode(String clinic2pathologyCode) {
        this.clinic2pathologyCode = clinic2pathologyCode == null ? null : clinic2pathologyCode.trim();
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
     * 获取放射与病理诊断对比符合情况代码DIR_MATCH_RESULT（放射与病理诊断对比符合情况在特定编码体系中的代码）
     *
     * @return RADIATION2PATHOLOGY_CODE - 放射与病理诊断对比符合情况代码DIR_MATCH_RESULT（放射与病理诊断对比符合情况在特定编码体系中的代码）
     */
    public String getRadiation2pathologyCode() {
        return radiation2pathologyCode;
    }

    /**
     * 设置放射与病理诊断对比符合情况代码DIR_MATCH_RESULT（放射与病理诊断对比符合情况在特定编码体系中的代码）
     *
     * @param radiation2pathologyCode 放射与病理诊断对比符合情况代码DIR_MATCH_RESULT（放射与病理诊断对比符合情况在特定编码体系中的代码）
     */
    public void setRadiation2pathologyCode(String radiation2pathologyCode) {
        this.radiation2pathologyCode = radiation2pathologyCode == null ? null : radiation2pathologyCode.trim();
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
     * 获取临床与尸检诊断对比符合情况代码DIR_MATCH_RESULT（个体临床与尸检诊断对比符合情况的分类代码）
     *
     * @return CLINIC2AUTOPSY_CODE - 临床与尸检诊断对比符合情况代码DIR_MATCH_RESULT（个体临床与尸检诊断对比符合情况的分类代码）
     */
    public String getClinic2autopsyCode() {
        return clinic2autopsyCode;
    }

    /**
     * 设置临床与尸检诊断对比符合情况代码DIR_MATCH_RESULT（个体临床与尸检诊断对比符合情况的分类代码）
     *
     * @param clinic2autopsyCode 临床与尸检诊断对比符合情况代码DIR_MATCH_RESULT（个体临床与尸检诊断对比符合情况的分类代码）
     */
    public void setClinic2autopsyCode(String clinic2autopsyCode) {
        this.clinic2autopsyCode = clinic2autopsyCode == null ? null : clinic2autopsyCode.trim();
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
     * 获取抢救次数（个体接受抢救的次数（次））
     *
     * @return SAVE_TIMES - 抢救次数（个体接受抢救的次数（次））
     */
    public Long getSaveTimes() {
        return saveTimes;
    }

    /**
     * 设置抢救次数（个体接受抢救的次数（次））
     *
     * @param saveTimes 抢救次数（个体接受抢救的次数（次））
     */
    public void setSaveTimes(Long saveTimes) {
        this.saveTimes = saveTimes;
    }

    /**
     * 获取抢救成功次数（患者进行抢救并成功的次数合计）
     *
     * @return SAVE_SUCCESS_TIMES - 抢救成功次数（患者进行抢救并成功的次数合计）
     */
    public Long getSaveSuccessTimes() {
        return saveSuccessTimes;
    }

    /**
     * 设置抢救成功次数（患者进行抢救并成功的次数合计）
     *
     * @param saveSuccessTimes 抢救成功次数（患者进行抢救并成功的次数合计）
     */
    public void setSaveSuccessTimes(Long saveSuccessTimes) {
        this.saveSuccessTimes = saveSuccessTimes;
    }

    /**
     * 获取最高诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     *
     * @return DIAG_BASIS_CODE - 最高诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    public String getDiagBasisCode() {
        return diagBasisCode;
    }

    /**
     * 设置最高诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     *
     * @param diagBasisCode 最高诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    public void setDiagBasisCode(String diagBasisCode) {
        this.diagBasisCode = diagBasisCode == null ? null : diagBasisCode.trim();
    }

    /**
     * 获取最高诊断依据中文名称（患者最高诊断依据在特定编码体系中的中文名称）
     *
     * @return DIAG_BASIS_CN - 最高诊断依据中文名称（患者最高诊断依据在特定编码体系中的中文名称）
     */
    public String getDiagBasisCn() {
        return diagBasisCn;
    }

    /**
     * 设置最高诊断依据中文名称（患者最高诊断依据在特定编码体系中的中文名称）
     *
     * @param diagBasisCn 最高诊断依据中文名称（患者最高诊断依据在特定编码体系中的中文名称）
     */
    public void setDiagBasisCn(String diagBasisCn) {
        this.diagBasisCn = diagBasisCn == null ? null : diagBasisCn.trim();
    }

    /**
     * 获取分化程度代码DIR_DIFFER_LEVEL（分化程度在特定编码体系中的代码）
     *
     * @return DIFFER_LEVEL_CODE - 分化程度代码DIR_DIFFER_LEVEL（分化程度在特定编码体系中的代码）
     */
    public String getDifferLevelCode() {
        return differLevelCode;
    }

    /**
     * 设置分化程度代码DIR_DIFFER_LEVEL（分化程度在特定编码体系中的代码）
     *
     * @param differLevelCode 分化程度代码DIR_DIFFER_LEVEL（分化程度在特定编码体系中的代码）
     */
    public void setDifferLevelCode(String differLevelCode) {
        this.differLevelCode = differLevelCode == null ? null : differLevelCode.trim();
    }

    /**
     * 获取分化程度中文名称（分化程度在特定编码体系中的中文名称）
     *
     * @return DIFFER_LEVEL_CN - 分化程度中文名称（分化程度在特定编码体系中的中文名称）
     */
    public String getDifferLevelCn() {
        return differLevelCn;
    }

    /**
     * 设置分化程度中文名称（分化程度在特定编码体系中的中文名称）
     *
     * @param differLevelCn 分化程度中文名称（分化程度在特定编码体系中的中文名称）
     */
    public void setDifferLevelCn(String differLevelCn) {
        this.differLevelCn = differLevelCn == null ? null : differLevelCn.trim();
    }

    /**
     * 获取研究生实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return GRADUATE_INTERN_DOCTOR_NAME - 研究生实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getGraduateInternDoctorName() {
        return graduateInternDoctorName;
    }

    /**
     * 设置研究生实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param graduateInternDoctorName 研究生实习医师：姓名（在患者出院时所在科室实习并参与患者诊治的实习医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setGraduateInternDoctorName(String graduateInternDoctorName) {
        this.graduateInternDoctorName = graduateInternDoctorName == null ? null : graduateInternDoctorName.trim();
    }

    /**
     * 获取特级护理天数（个体在院期间接受特级护理的天数）
     *
     * @return PROTECT_SPECIAL - 特级护理天数（个体在院期间接受特级护理的天数）
     */
    public Long getProtectSpecial() {
        return protectSpecial;
    }

    /**
     * 设置特级护理天数（个体在院期间接受特级护理的天数）
     *
     * @param protectSpecial 特级护理天数（个体在院期间接受特级护理的天数）
     */
    public void setProtectSpecial(Long protectSpecial) {
        this.protectSpecial = protectSpecial;
    }

    /**
     * 获取一级护理天数（个体在院期间接受一级护理的天数）
     *
     * @return PROTECT_I - 一级护理天数（个体在院期间接受一级护理的天数）
     */
    public Long getProtectI() {
        return protectI;
    }

    /**
     * 设置一级护理天数（个体在院期间接受一级护理的天数）
     *
     * @param protectI 一级护理天数（个体在院期间接受一级护理的天数）
     */
    public void setProtectI(Long protectI) {
        this.protectI = protectI;
    }

    /**
     * 获取二级护理天数（个体接受二级护理的天数）
     *
     * @return PROTECT_II - 二级护理天数（个体接受二级护理的天数）
     */
    public Long getProtectIi() {
        return protectIi;
    }

    /**
     * 设置二级护理天数（个体接受二级护理的天数）
     *
     * @param protectIi 二级护理天数（个体接受二级护理的天数）
     */
    public void setProtectIi(Long protectIi) {
        this.protectIi = protectIi;
    }

    /**
     * 获取三级护理天数（患者接受三级护理的天数合计）
     *
     * @return PROTECT_III - 三级护理天数（患者接受三级护理的天数合计）
     */
    public Long getProtectIii() {
        return protectIii;
    }

    /**
     * 设置三级护理天数（患者接受三级护理的天数合计）
     *
     * @param protectIii 三级护理天数（患者接受三级护理的天数合计）
     */
    public void setProtectIii(Long protectIii) {
        this.protectIii = protectIii;
    }

    /**
     * 获取重症监护（重症监护过程的详细内容描述）
     *
     * @return INTENSIVE_CARE_THERAPY - 重症监护（重症监护过程的详细内容描述）
     */
    public String getIntensiveCareTherapy() {
        return intensiveCareTherapy;
    }

    /**
     * 设置重症监护（重症监护过程的详细内容描述）
     *
     * @param intensiveCareTherapy 重症监护（重症监护过程的详细内容描述）
     */
    public void setIntensiveCareTherapy(String intensiveCareTherapy) {
        this.intensiveCareTherapy = intensiveCareTherapy == null ? null : intensiveCareTherapy.trim();
    }

    /**
     * 获取手术患者类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @return OPER_PATIENT_TYPE_CODE - 手术患者类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public String getOperPatientTypeCode() {
        return operPatientTypeCode;
    }

    /**
     * 设置手术患者类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @param operPatientTypeCode 手术患者类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public void setOperPatientTypeCode(String operPatientTypeCode) {
        this.operPatientTypeCode = operPatientTypeCode == null ? null : operPatientTypeCode.trim();
    }

    /**
     * 获取手术患者类型中文名称（进行手术治疗的患者类型在特定编码体系中的中文名称）
     *
     * @return OPER_PATIENT_TYPE_CN - 手术患者类型中文名称（进行手术治疗的患者类型在特定编码体系中的中文名称）
     */
    public String getOperPatientTypeCn() {
        return operPatientTypeCn;
    }

    /**
     * 设置手术患者类型中文名称（进行手术治疗的患者类型在特定编码体系中的中文名称）
     *
     * @param operPatientTypeCn 手术患者类型中文名称（进行手术治疗的患者类型在特定编码体系中的中文名称）
     */
    public void setOperPatientTypeCn(String operPatientTypeCn) {
        this.operPatientTypeCn = operPatientTypeCn == null ? null : operPatientTypeCn.trim();
    }

    /**
     * 获取随诊周数（个体进行随诊的周数合计）
     *
     * @return FOLLOW_UP_WEEKS - 随诊周数（个体进行随诊的周数合计）
     */
    public Long getFollowUpWeeks() {
        return followUpWeeks;
    }

    /**
     * 设置随诊周数（个体进行随诊的周数合计）
     *
     * @param followUpWeeks 随诊周数（个体进行随诊的周数合计）
     */
    public void setFollowUpWeeks(Long followUpWeeks) {
        this.followUpWeeks = followUpWeeks;
    }

    /**
     * 获取随诊月数（当前已随诊时长，单位为月）
     *
     * @return FOLLOW_UP_MONTHS - 随诊月数（当前已随诊时长，单位为月）
     */
    public Long getFollowUpMonths() {
        return followUpMonths;
    }

    /**
     * 设置随诊月数（当前已随诊时长，单位为月）
     *
     * @param followUpMonths 随诊月数（当前已随诊时长，单位为月）
     */
    public void setFollowUpMonths(Long followUpMonths) {
        this.followUpMonths = followUpMonths;
    }

    /**
     * 获取随诊年数（当前已随诊时长，单位为年）
     *
     * @return FOLLOW_UP_YEARS - 随诊年数（当前已随诊时长，单位为年）
     */
    public Long getFollowUpYears() {
        return followUpYears;
    }

    /**
     * 设置随诊年数（当前已随诊时长，单位为年）
     *
     * @param followUpYears 随诊年数（当前已随诊时长，单位为年）
     */
    public void setFollowUpYears(Long followUpYears) {
        this.followUpYears = followUpYears;
    }

    /**
     * 获取住院患者示教病例标志0否 1是（标识该患者是否被作为教学示范病例）
     *
     * @return TEACHING_EXAMPLE_MARK - 住院患者示教病例标志0否 1是（标识该患者是否被作为教学示范病例）
     */
    public Long getTeachingExampleMark() {
        return teachingExampleMark;
    }

    /**
     * 设置住院患者示教病例标志0否 1是（标识该患者是否被作为教学示范病例）
     *
     * @param teachingExampleMark 住院患者示教病例标志0否 1是（标识该患者是否被作为教学示范病例）
     */
    public void setTeachingExampleMark(Long teachingExampleMark) {
        this.teachingExampleMark = teachingExampleMark;
    }

    /**
     * 获取住院患者输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @return TRANSFUSION_REACTION_MARK - 住院患者输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public Long getTransfusionReactionMark() {
        return transfusionReactionMark;
    }

    /**
     * 设置住院患者输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @param transfusionReactionMark 住院患者输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public void setTransfusionReactionMark(Long transfusionReactionMark) {
        this.transfusionReactionMark = transfusionReactionMark;
    }

    /**
     * 获取输红细胞量(单位)（输红细胞量(单位)）
     *
     * @return RED_BLOOD_CELL - 输红细胞量(单位)（输红细胞量(单位)）
     */
    public BigDecimal getRedBloodCell() {
        return redBloodCell;
    }

    /**
     * 设置输红细胞量(单位)（输红细胞量(单位)）
     *
     * @param redBloodCell 输红细胞量(单位)（输红细胞量(单位)）
     */
    public void setRedBloodCell(BigDecimal redBloodCell) {
        this.redBloodCell = redBloodCell;
    }

    /**
     * 获取输血小板量(袋)（输血小板量(袋)）
     *
     * @return PLATELET - 输血小板量(袋)（输血小板量(袋)）
     */
    public BigDecimal getPlatelet() {
        return platelet;
    }

    /**
     * 设置输血小板量(袋)（输血小板量(袋)）
     *
     * @param platelet 输血小板量(袋)（输血小板量(袋)）
     */
    public void setPlatelet(BigDecimal platelet) {
        this.platelet = platelet;
    }

    /**
     * 获取输血浆量(ml)（患者进行输血的血浆量结果值）
     *
     * @return PLASMA - 输血浆量(ml)（患者进行输血的血浆量结果值）
     */
    public BigDecimal getPlasma() {
        return plasma;
    }

    /**
     * 设置输血浆量(ml)（患者进行输血的血浆量结果值）
     *
     * @param plasma 输血浆量(ml)（患者进行输血的血浆量结果值）
     */
    public void setPlasma(BigDecimal plasma) {
        this.plasma = plasma;
    }

    /**
     * 获取输全血量(ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     *
     * @return WHOLE_BLOOD - 输全血量(ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    public BigDecimal getWholeBlood() {
        return wholeBlood;
    }

    /**
     * 设置输全血量(ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     *
     * @param wholeBlood 输全血量(ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    public void setWholeBlood(BigDecimal wholeBlood) {
        this.wholeBlood = wholeBlood;
    }

    /**
     * 获取自身回收(ml)（血液自身回收量，单位为(ml)）
     *
     * @return SELF_BLOOD - 自身回收(ml)（血液自身回收量，单位为(ml)）
     */
    public BigDecimal getSelfBlood() {
        return selfBlood;
    }

    /**
     * 设置自身回收(ml)（血液自身回收量，单位为(ml)）
     *
     * @param selfBlood 自身回收(ml)（血液自身回收量，单位为(ml)）
     */
    public void setSelfBlood(BigDecimal selfBlood) {
        this.selfBlood = selfBlood;
    }

    /**
     * 获取输其它血制品量(ml)（输其它血制品量(ml)）
     *
     * @return OTHER_BLOOD - 输其它血制品量(ml)（输其它血制品量(ml)）
     */
    public BigDecimal getOtherBlood() {
        return otherBlood;
    }

    /**
     * 设置输其它血制品量(ml)（输其它血制品量(ml)）
     *
     * @param otherBlood 输其它血制品量(ml)（输其它血制品量(ml)）
     */
    public void setOtherBlood(BigDecimal otherBlood) {
        this.otherBlood = otherBlood;
    }

    /**
     * 获取住院患者随诊标志0否 1是（标识该患者是否需要随诊）
     *
     * @return FOLLOW_MARK - 住院患者随诊标志0否 1是（标识该患者是否需要随诊）
     */
    public Long getFollowMark() {
        return followMark;
    }

    /**
     * 设置住院患者随诊标志0否 1是（标识该患者是否需要随诊）
     *
     * @param followMark 住院患者随诊标志0否 1是（标识该患者是否需要随诊）
     */
    public void setFollowMark(Long followMark) {
        this.followMark = followMark;
    }

    /**
     * 获取婴幼儿年龄（天）（婴幼儿的年龄，单位为天）
     *
     * @return AGE_BABY - 婴幼儿年龄（天）（婴幼儿的年龄，单位为天）
     */
    public Long getAgeBaby() {
        return ageBaby;
    }

    /**
     * 设置婴幼儿年龄（天）（婴幼儿的年龄，单位为天）
     *
     * @param ageBaby 婴幼儿年龄（天）（婴幼儿的年龄，单位为天）
     */
    public void setAgeBaby(Long ageBaby) {
        this.ageBaby = ageBaby;
    }

    /**
     * 获取呼吸机使用时间（h）（呼吸机使用时长，单位为小时）
     *
     * @return LIFE_SUPPORT_MACHINE_TIME - 呼吸机使用时间（h）（呼吸机使用时长，单位为小时）
     */
    public String getLifeSupportMachineTime() {
        return lifeSupportMachineTime;
    }

    /**
     * 设置呼吸机使用时间（h）（呼吸机使用时长，单位为小时）
     *
     * @param lifeSupportMachineTime 呼吸机使用时间（h）（呼吸机使用时长，单位为小时）
     */
    public void setLifeSupportMachineTime(String lifeSupportMachineTime) {
        this.lifeSupportMachineTime = lifeSupportMachineTime == null ? null : lifeSupportMachineTime.trim();
    }

    /**
     * 获取转入医院名称（转入的医疗机构名称）
     *
     * @return REF_IN_ORG_NAME - 转入医院名称（转入的医疗机构名称）
     */
    public String getRefInOrgName() {
        return refInOrgName;
    }

    /**
     * 设置转入医院名称（转入的医疗机构名称）
     *
     * @param refInOrgName 转入医院名称（转入的医疗机构名称）
     */
    public void setRefInOrgName(String refInOrgName) {
        this.refInOrgName = refInOrgName == null ? null : refInOrgName.trim();
    }

    /**
     * 获取入院本院科室代码（患者入院时，入住的科室本地代码）
     *
     * @return IN_DEPT_TYPE_CODE - 入院本院科室代码（患者入院时，入住的科室本地代码）
     */
    public String getInDeptTypeCode() {
        return inDeptTypeCode;
    }

    /**
     * 设置入院本院科室代码（患者入院时，入住的科室本地代码）
     *
     * @param inDeptTypeCode 入院本院科室代码（患者入院时，入住的科室本地代码）
     */
    public void setInDeptTypeCode(String inDeptTypeCode) {
        this.inDeptTypeCode = inDeptTypeCode == null ? null : inDeptTypeCode.trim();
    }

    /**
     * 获取入院本院科室名称（患者入院时，入住的科室本地名称）
     *
     * @return IN_DEPT_TYPE_NAME - 入院本院科室名称（患者入院时，入住的科室本地名称）
     */
    public String getInDeptTypeName() {
        return inDeptTypeName;
    }

    /**
     * 设置入院本院科室名称（患者入院时，入住的科室本地名称）
     *
     * @param inDeptTypeName 入院本院科室名称（患者入院时，入住的科室本地名称）
     */
    public void setInDeptTypeName(String inDeptTypeName) {
        this.inDeptTypeName = inDeptTypeName == null ? null : inDeptTypeName.trim();
    }

    /**
     * 获取转科本院科别代码（患者住院期间转科的转入科室本地代码）
     *
     * @return MOVE_DEPT_TYPE_CODE - 转科本院科别代码（患者住院期间转科的转入科室本地代码）
     */
    public String getMoveDeptTypeCode() {
        return moveDeptTypeCode;
    }

    /**
     * 设置转科本院科别代码（患者住院期间转科的转入科室本地代码）
     *
     * @param moveDeptTypeCode 转科本院科别代码（患者住院期间转科的转入科室本地代码）
     */
    public void setMoveDeptTypeCode(String moveDeptTypeCode) {
        this.moveDeptTypeCode = moveDeptTypeCode == null ? null : moveDeptTypeCode.trim();
    }

    /**
     * 获取转科本院科别名称（患者住院期间转科的转入科室本地名称，如果超过一次以上的转科，用“→”转接表示）
     *
     * @return MOVE_DEPT_TYPE_NAME - 转科本院科别名称（患者住院期间转科的转入科室本地名称，如果超过一次以上的转科，用“→”转接表示）
     */
    public String getMoveDeptTypeName() {
        return moveDeptTypeName;
    }

    /**
     * 设置转科本院科别名称（患者住院期间转科的转入科室本地名称，如果超过一次以上的转科，用“→”转接表示）
     *
     * @param moveDeptTypeName 转科本院科别名称（患者住院期间转科的转入科室本地名称，如果超过一次以上的转科，用“→”转接表示）
     */
    public void setMoveDeptTypeName(String moveDeptTypeName) {
        this.moveDeptTypeName = moveDeptTypeName == null ? null : moveDeptTypeName.trim();
    }

    /**
     * 获取出院本院科别代码（患者出院时的科室本地代码）
     *
     * @return OUT_DEPT_TYPE_CODE - 出院本院科别代码（患者出院时的科室本地代码）
     */
    public String getOutDeptTypeCode() {
        return outDeptTypeCode;
    }

    /**
     * 设置出院本院科别代码（患者出院时的科室本地代码）
     *
     * @param outDeptTypeCode 出院本院科别代码（患者出院时的科室本地代码）
     */
    public void setOutDeptTypeCode(String outDeptTypeCode) {
        this.outDeptTypeCode = outDeptTypeCode == null ? null : outDeptTypeCode.trim();
    }

    /**
     * 获取出院本院科别名称（患者出院时的科室本地名称）
     *
     * @return OUT_DEPT_TYPE_NAME - 出院本院科别名称（患者出院时的科室本地名称）
     */
    public String getOutDeptTypeName() {
        return outDeptTypeName;
    }

    /**
     * 设置出院本院科别名称（患者出院时的科室本地名称）
     *
     * @param outDeptTypeName 出院本院科别名称（患者出院时的科室本地名称）
     */
    public void setOutDeptTypeName(String outDeptTypeName) {
        this.outDeptTypeName = outDeptTypeName == null ? null : outDeptTypeName.trim();
    }

    /**
     * 获取死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @return DEATH_DTIME - 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public String getDeathDtime() {
        return deathDtime;
    }

    /**
     * 设置死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @param deathDtime 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public void setDeathDtime(String deathDtime) {
        this.deathDtime = deathDtime == null ? null : deathDtime.trim();
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
     * 获取病历解析
     *
     * @return EMR_PARSING - 病历解析
     */
    public String getEmrParsing() {
        return emrParsing;
    }

    /**
     * 设置病历解析
     *
     * @param emrParsing 病历解析
     */
    public void setEmrParsing(String emrParsing) {
        this.emrParsing = emrParsing == null ? null : emrParsing.trim();
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
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
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
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
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
}