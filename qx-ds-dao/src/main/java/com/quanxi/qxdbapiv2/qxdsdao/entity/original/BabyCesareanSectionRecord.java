package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BABY_CESAREAN_SECTION_RECORD")
public class BabyCesareanSectionRecord {
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
     * 剖宫产记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "DELIVERY_ID")
    private String deliveryId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private Integer hospitaltalizationTimes;

    /**
     * 产妇姓名（产妇在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

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
     * 待产日期时间（产妇进入产房时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DELIVERY_DATE")
    private String deliveryDate;

    /**
     * 胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     */
    @Column(name = "INTACT_FETAL_MEMBRANES")
    private String intactFetalMembranes;

    /**
     * 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    @Column(name = "FUNICLE_LENGTH")
    private BigDecimal funicleLength;

    /**
     * 绕颈身（圈）（脐带绕颈身的周数，计量单位为周）
     */
    @Column(name = "ROUND_NECK")
    private Short roundNeck;

    /**
     * 产前诊断（产妇产前诊断的详细描述）
     */
    @Column(name = "PRENATAL_DIAG_NAME")
    private String prenatalDiagName;

    /**
     * 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    @Column(name = "OPERATION_INDICATION")
    private String operationIndication;

    /**
     * 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    @Column(name = "OPERATION_NAME")
    private String operationName;

    /**
     * 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_START_DATE")
    private String operationStartDate;

    /**
     * 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 麻醉体位（麻醉体位的详细描述）
     */
    @Column(name = "ANES_POSITION")
    private String anesPosition;

    /**
     * 麻醉效果（实施麻醉效果的描述）
     */
    @Column(name = "ANES_EFFECTIVE")
    private String anesEffective;

    /**
     * 剖宫产手术过程（剖宫产手术过程的详细描述，如腹壁脂肪层厚度、腹膜分离情况、腹腔粘连枪口、腹水情况、腹壁缝合、缝合膀胱腹膜反折情况等）
     */
    @Column(name = "OPERATION_DESC")
    private String operationDesc;

    /**
     * 子宫情况（子宫情况的详细描述）
     */
    @Column(name = "UTERUS_CONTRACTION")
    private String uterusContraction;

    /**
     * 胎儿娩出方式（胎儿娩出方式的详细描述）
     */
    @Column(name = "DELIVERY_BABY_METHOD")
    private String deliveryBabyMethod;

    /**
     * 胎儿娩出胎位（胎儿娩出胎位的详细描述）
     */
    @Column(name = "FETUS_POSITION")
    private String fetusPosition;

    /**
     * 胎盘黄染（胎盘黄染情况的详细描述 ）
     */
    @Column(name = "PLACENTA_YELLOW")
    private String placentaYellow;

    /**
     * 胎膜黄染（胎膜黄染情况的详细描述）
     */
    @Column(name = "MEMBRANE_YELLOW")
    private String membraneYellow;

    /**
     * 脐带缠绕情况（脐带缠绕方式及周数的详细描述）
     */
    @Column(name = "CORD_ENTANGLEMENT_STATE")
    private String cordEntanglementState;

    /**
     * 脐带扭转（周）（脐带扭转的周数，计量单位为周）
     */
    @Column(name = "UMBILICAL_CORD_TORSION")
    private Short umbilicalCordTorsion;

    /**
     * 存脐带血情况标志0否 1是（标识是否留存脐带血的标志）
     */
    @Column(name = "SAVE_CORD_BLOOD_MARK")
    private String saveCordBloodMark;

    /**
     * 子宫壁缝合情况（产妇子宫壁缝合情况的详细描述，如子宫壁缝合层数、缝合线、缝合方法等）
     */
    @Column(name = "UTERINE_SUTURE_STATE")
    private String uterineSutureState;

    /**
     * 宫缩剂名称（所使用宫缩剂的名称）
     */
    @Column(name = "UTEROTONIC_NAME")
    private String uterotonicName;

    /**
     * 宫缩剂使用方法（宫缩剂使用方法的详细描述）
     */
    @Column(name = "UTEROTONIC_USE_WAY")
    private String uterotonicUseWay;

    /**
     * 手术用药（手术所用药物的通用名称）
     */
    @Column(name = "OPERATION_DRUG")
    private String operationDrug;

    /**
     * 手术用药量（手术用药用量的详细描述）
     */
    @Column(name = "OPERATION_DRUG_AMOUNT")
    private String operationDrugAmount;

    /**
     * 腹腔探查子宫（腹腔探查时子宫情况的详细描述）
     */
    @Column(name = "EXPLORATION_UTERUS")
    private String explorationUterus;

    /**
     * 腹腔探查附件（腹腔探查时附件情况的详细描述）
     */
    @Column(name = "EXPLORATION_ADNEXA")
    private String explorationAdnexa;

    /**
     * 宫腔探查异常情况标志0否 1是（标识宫腔探查是否有异常的标志）
     */
    @Column(name = "UTEROTONIC_ABNORMAL_MARK")
    private String uterotonicAbnormalMark;

    /**
     * 宫腔探查处理方式代码1药物 2干 3湿（宫腔探查处理方式代码）
     */
    @Column(name = "UTEROTONIC_METHOD_CODE")
    private String uterotonicMethodCode;

    /**
     * 宫腔探查处理方式名称（宫腔探查处理方式名称）
     */
    @Column(name = "UTEROTONIC_METHOD_NAME")
    private String uterotonicMethodName;

    /**
     * 宫腔探查处理情况（宫腔探查后处理方式的详细描述）
     */
    @Column(name = "UTEROTONIC_STATE")
    private String uterotonicState;

    /**
     * 手术时产妇情况（手术时产妇情况的详细描述）
     */
    @Column(name = "OPERATION_MATERNAL_STATE")
    private String operationMaternalState;

    /**
     * 术中出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    @Column(name = "LOSSBLOOD_AMOUNT")
    private Integer lossbloodAmount;

    /**
     * 输血成分（输血成分的详细描述）
     */
    @Column(name = "TRANSFUSION_COMPONENT")
    private String transfusionComponent;

    /**
     * 输血量（mL）（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    @Column(name = "TRANSFUSION_AMOUNT")
    private Integer transfusionAmount;

    /**
     * 术时输液量（mL）（术中输液量的描述，单位为 Ml）
     */
    @Column(name = "INFUSION_AMOUNT")
    private Integer infusionAmount;

    /**
     * 供氧时间（min）（供氧时间的时长，计量单位为min）
     */
    @Column(name = "OXYGEN_TIME")
    private Integer oxygenTime;

    /**
     * 其他用药（其他使用药物的通用名称）
     */
    @Column(name = "OTHER_DRUG")
    private String otherDrug;

    /**
     * 其他情况（其他用药情况的详细描述）
     */
    @Column(name = "OTHER_STATE")
    private String otherState;

    /**
     * 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_END_DATE")
    private String operationEndDate;

    /**
     * 手术全程时间（min）（手术全程所用的总时长,计量单位为 min）
     */
    @Column(name = "OPERATION_WHOLE_TIME")
    private Integer operationWholeTime;

    /**
     * 产后诊断类别CV05.01.002（对产妇产后诊断（包括孕产次数）的类别代码）
     */
    @Column(name = "PARTURITION_DIAGNOSIS_TYPE")
    private String parturitionDiagnosisType;

    /**
     * 产后诊断类别名称（对产妇产后诊断（包括孕产次数）的类别名称）
     */
    @Column(name = "PARTURITION_DIAGNOSIS_NAME")
    private String parturitionDiagnosisName;

    /**
     * 产后观察日期时间（产后观察结束时间的公元纪年日期和时间的完整描述）
     */
    @Column(name = "POSTPARTUM_OBS_DATE")
    private String postpartumObsDate;

    /**
     * 产后检查时间（min）（产后检查时，距离分娩结束后的时间，计量单位为 min）
     */
    @Column(name = "POSTPARTUM_EXAM_TIME")
    private String postpartumExamTime;

    /**
     * 产后收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    @Column(name = "POSTPARTUM_SBP")
    private Short postpartumSbp;

    /**
     * 产后舒张压 （产后舒张压的测量值，计量单位为 mmHg ）
     */
    @Column(name = "POSTPARTUM_DBP")
    private Short postpartumDbp;

    /**
     * 产后脉搏（次/min ）（产后每分钟脉搏的次数测量值，计量单位为次/min）
     */
    @Column(name = "POSTPARTUM_PULSES")
    private Short postpartumPulses;

    /**
     * 产后心率（次/min ）（产后心脏搏动频率的测量值，计量单位为次/min）
     */
    @Column(name = "POSTPARTUM_HEART_RATE")
    private Short postpartumHeartRate;

    /**
     * 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    @Column(name = "POSTPARTUM_LOSSBLOOD_AMOUNT")
    private BigDecimal postpartumLossbloodAmount;

    /**
     * 产后宫缩（产妇分娩后宫缩强度等情况的详细描述）
     */
    @Column(name = "POSTPARTUM_UTERINE_CONTR")
    private String postpartumUterineContr;

    /**
     * 产后宫底高度（cm）（产妇产后耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    @Column(name = "POSTPARTUM_UTERUS_HEIGHT")
    private BigDecimal postpartumUterusHeight;

    /**
     * 产瘤大小（产瘤大小的详细描述，计量单位 cm）
     */
    @Column(name = "TUMOR_SIZE")
    private BigDecimal tumorSize;

    /**
     * 产瘤部位（产瘤部位的详细描述）
     */
    @Column(name = "TUMOR_PART")
    private String tumorPart;

    /**
     * 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPERATOR_SIGNATURE")
    private String operatorSignature;

    /**
     * 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHESIOLOGIST_NAME")
    private String anesthesiologistName;

    /**
     * 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DEVICE_NURSE_SIGNATURE")
    private String deviceNurseSignature;

    /**
     * 助手签名（助手签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT_SIGNATURE")
    private String assistantSignature;

    /**
     * 护婴者签名（护婴者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "BABY_CARE_SIGNATURE")
    private String babyCareSignature;

    /**
     * 指导者签名（分娩过程中，指导者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "INSTRUCTOR_SIGNATURE")
    private String instructorSignature;

    /**
     * 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "WRITOR_SIGNATURE")
    private String writorSignature;

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
     * 获取剖宫产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DELIVERY_ID - 剖宫产记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置剖宫产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param deliveryId 剖宫产记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId == null ? null : deliveryId.trim();
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
     * 获取产妇姓名（产妇在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 产妇姓名（产妇在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产妇姓名（产妇在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 产妇姓名（产妇在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取待产日期时间（产妇进入产房时的公元纪年日期和时间的完整描述）
     *
     * @return DELIVERY_DATE - 待产日期时间（产妇进入产房时的公元纪年日期和时间的完整描述）
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置待产日期时间（产妇进入产房时的公元纪年日期和时间的完整描述）
     *
     * @param deliveryDate 待产日期时间（产妇进入产房时的公元纪年日期和时间的完整描述）
     */
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate == null ? null : deliveryDate.trim();
    }

    /**
     * 获取胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     *
     * @return INTACT_FETAL_MEMBRANES - 胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     */
    public String getIntactFetalMembranes() {
        return intactFetalMembranes;
    }

    /**
     * 设置胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     *
     * @param intactFetalMembranes 胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     */
    public void setIntactFetalMembranes(String intactFetalMembranes) {
        this.intactFetalMembranes = intactFetalMembranes == null ? null : intactFetalMembranes.trim();
    }

    /**
     * 获取脐带长度（cm）（脐带的长度值，计量单位为 cm）
     *
     * @return FUNICLE_LENGTH - 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    public BigDecimal getFunicleLength() {
        return funicleLength;
    }

    /**
     * 设置脐带长度（cm）（脐带的长度值，计量单位为 cm）
     *
     * @param funicleLength 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    public void setFunicleLength(BigDecimal funicleLength) {
        this.funicleLength = funicleLength;
    }

    /**
     * 获取绕颈身（圈）（脐带绕颈身的周数，计量单位为周）
     *
     * @return ROUND_NECK - 绕颈身（圈）（脐带绕颈身的周数，计量单位为周）
     */
    public Short getRoundNeck() {
        return roundNeck;
    }

    /**
     * 设置绕颈身（圈）（脐带绕颈身的周数，计量单位为周）
     *
     * @param roundNeck 绕颈身（圈）（脐带绕颈身的周数，计量单位为周）
     */
    public void setRoundNeck(Short roundNeck) {
        this.roundNeck = roundNeck;
    }

    /**
     * 获取产前诊断（产妇产前诊断的详细描述）
     *
     * @return PRENATAL_DIAG_NAME - 产前诊断（产妇产前诊断的详细描述）
     */
    public String getPrenatalDiagName() {
        return prenatalDiagName;
    }

    /**
     * 设置产前诊断（产妇产前诊断的详细描述）
     *
     * @param prenatalDiagName 产前诊断（产妇产前诊断的详细描述）
     */
    public void setPrenatalDiagName(String prenatalDiagName) {
        this.prenatalDiagName = prenatalDiagName == null ? null : prenatalDiagName.trim();
    }

    /**
     * 获取手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     *
     * @return OPERATION_INDICATION - 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    public String getOperationIndication() {
        return operationIndication;
    }

    /**
     * 设置手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     *
     * @param operationIndication 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    public void setOperationIndication(String operationIndication) {
        this.operationIndication = operationIndication == null ? null : operationIndication.trim();
    }

    /**
     * 获取手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     *
     * @return OPERATION_NAME - 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     *
     * @param operationName 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    /**
     * 获取手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_START_DATE - 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationStartDate() {
        return operationStartDate;
    }

    /**
     * 设置手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationStartDate 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationStartDate(String operationStartDate) {
        this.operationStartDate = operationStartDate == null ? null : operationStartDate.trim();
    }

    /**
     * 获取麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANESTHESIA_CODE - 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }

    /**
     * 设置麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesthesiaCode 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode == null ? null : anesthesiaCode.trim();
    }

    /**
     * 获取麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_CN - 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaCn 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取麻醉体位（麻醉体位的详细描述）
     *
     * @return ANES_POSITION - 麻醉体位（麻醉体位的详细描述）
     */
    public String getAnesPosition() {
        return anesPosition;
    }

    /**
     * 设置麻醉体位（麻醉体位的详细描述）
     *
     * @param anesPosition 麻醉体位（麻醉体位的详细描述）
     */
    public void setAnesPosition(String anesPosition) {
        this.anesPosition = anesPosition == null ? null : anesPosition.trim();
    }

    /**
     * 获取麻醉效果（实施麻醉效果的描述）
     *
     * @return ANES_EFFECTIVE - 麻醉效果（实施麻醉效果的描述）
     */
    public String getAnesEffective() {
        return anesEffective;
    }

    /**
     * 设置麻醉效果（实施麻醉效果的描述）
     *
     * @param anesEffective 麻醉效果（实施麻醉效果的描述）
     */
    public void setAnesEffective(String anesEffective) {
        this.anesEffective = anesEffective == null ? null : anesEffective.trim();
    }

    /**
     * 获取剖宫产手术过程（剖宫产手术过程的详细描述，如腹壁脂肪层厚度、腹膜分离情况、腹腔粘连枪口、腹水情况、腹壁缝合、缝合膀胱腹膜反折情况等）
     *
     * @return OPERATION_DESC - 剖宫产手术过程（剖宫产手术过程的详细描述，如腹壁脂肪层厚度、腹膜分离情况、腹腔粘连枪口、腹水情况、腹壁缝合、缝合膀胱腹膜反折情况等）
     */
    public String getOperationDesc() {
        return operationDesc;
    }

    /**
     * 设置剖宫产手术过程（剖宫产手术过程的详细描述，如腹壁脂肪层厚度、腹膜分离情况、腹腔粘连枪口、腹水情况、腹壁缝合、缝合膀胱腹膜反折情况等）
     *
     * @param operationDesc 剖宫产手术过程（剖宫产手术过程的详细描述，如腹壁脂肪层厚度、腹膜分离情况、腹腔粘连枪口、腹水情况、腹壁缝合、缝合膀胱腹膜反折情况等）
     */
    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc == null ? null : operationDesc.trim();
    }

    /**
     * 获取子宫情况（子宫情况的详细描述）
     *
     * @return UTERUS_CONTRACTION - 子宫情况（子宫情况的详细描述）
     */
    public String getUterusContraction() {
        return uterusContraction;
    }

    /**
     * 设置子宫情况（子宫情况的详细描述）
     *
     * @param uterusContraction 子宫情况（子宫情况的详细描述）
     */
    public void setUterusContraction(String uterusContraction) {
        this.uterusContraction = uterusContraction == null ? null : uterusContraction.trim();
    }

    /**
     * 获取胎儿娩出方式（胎儿娩出方式的详细描述）
     *
     * @return DELIVERY_BABY_METHOD - 胎儿娩出方式（胎儿娩出方式的详细描述）
     */
    public String getDeliveryBabyMethod() {
        return deliveryBabyMethod;
    }

    /**
     * 设置胎儿娩出方式（胎儿娩出方式的详细描述）
     *
     * @param deliveryBabyMethod 胎儿娩出方式（胎儿娩出方式的详细描述）
     */
    public void setDeliveryBabyMethod(String deliveryBabyMethod) {
        this.deliveryBabyMethod = deliveryBabyMethod == null ? null : deliveryBabyMethod.trim();
    }

    /**
     * 获取胎儿娩出胎位（胎儿娩出胎位的详细描述）
     *
     * @return FETUS_POSITION - 胎儿娩出胎位（胎儿娩出胎位的详细描述）
     */
    public String getFetusPosition() {
        return fetusPosition;
    }

    /**
     * 设置胎儿娩出胎位（胎儿娩出胎位的详细描述）
     *
     * @param fetusPosition 胎儿娩出胎位（胎儿娩出胎位的详细描述）
     */
    public void setFetusPosition(String fetusPosition) {
        this.fetusPosition = fetusPosition == null ? null : fetusPosition.trim();
    }

    /**
     * 获取胎盘黄染（胎盘黄染情况的详细描述 ）
     *
     * @return PLACENTA_YELLOW - 胎盘黄染（胎盘黄染情况的详细描述 ）
     */
    public String getPlacentaYellow() {
        return placentaYellow;
    }

    /**
     * 设置胎盘黄染（胎盘黄染情况的详细描述 ）
     *
     * @param placentaYellow 胎盘黄染（胎盘黄染情况的详细描述 ）
     */
    public void setPlacentaYellow(String placentaYellow) {
        this.placentaYellow = placentaYellow == null ? null : placentaYellow.trim();
    }

    /**
     * 获取胎膜黄染（胎膜黄染情况的详细描述）
     *
     * @return MEMBRANE_YELLOW - 胎膜黄染（胎膜黄染情况的详细描述）
     */
    public String getMembraneYellow() {
        return membraneYellow;
    }

    /**
     * 设置胎膜黄染（胎膜黄染情况的详细描述）
     *
     * @param membraneYellow 胎膜黄染（胎膜黄染情况的详细描述）
     */
    public void setMembraneYellow(String membraneYellow) {
        this.membraneYellow = membraneYellow == null ? null : membraneYellow.trim();
    }

    /**
     * 获取脐带缠绕情况（脐带缠绕方式及周数的详细描述）
     *
     * @return CORD_ENTANGLEMENT_STATE - 脐带缠绕情况（脐带缠绕方式及周数的详细描述）
     */
    public String getCordEntanglementState() {
        return cordEntanglementState;
    }

    /**
     * 设置脐带缠绕情况（脐带缠绕方式及周数的详细描述）
     *
     * @param cordEntanglementState 脐带缠绕情况（脐带缠绕方式及周数的详细描述）
     */
    public void setCordEntanglementState(String cordEntanglementState) {
        this.cordEntanglementState = cordEntanglementState == null ? null : cordEntanglementState.trim();
    }

    /**
     * 获取脐带扭转（周）（脐带扭转的周数，计量单位为周）
     *
     * @return UMBILICAL_CORD_TORSION - 脐带扭转（周）（脐带扭转的周数，计量单位为周）
     */
    public Short getUmbilicalCordTorsion() {
        return umbilicalCordTorsion;
    }

    /**
     * 设置脐带扭转（周）（脐带扭转的周数，计量单位为周）
     *
     * @param umbilicalCordTorsion 脐带扭转（周）（脐带扭转的周数，计量单位为周）
     */
    public void setUmbilicalCordTorsion(Short umbilicalCordTorsion) {
        this.umbilicalCordTorsion = umbilicalCordTorsion;
    }

    /**
     * 获取存脐带血情况标志0否 1是（标识是否留存脐带血的标志）
     *
     * @return SAVE_CORD_BLOOD_MARK - 存脐带血情况标志0否 1是（标识是否留存脐带血的标志）
     */
    public String getSaveCordBloodMark() {
        return saveCordBloodMark;
    }

    /**
     * 设置存脐带血情况标志0否 1是（标识是否留存脐带血的标志）
     *
     * @param saveCordBloodMark 存脐带血情况标志0否 1是（标识是否留存脐带血的标志）
     */
    public void setSaveCordBloodMark(String saveCordBloodMark) {
        this.saveCordBloodMark = saveCordBloodMark == null ? null : saveCordBloodMark.trim();
    }

    /**
     * 获取子宫壁缝合情况（产妇子宫壁缝合情况的详细描述，如子宫壁缝合层数、缝合线、缝合方法等）
     *
     * @return UTERINE_SUTURE_STATE - 子宫壁缝合情况（产妇子宫壁缝合情况的详细描述，如子宫壁缝合层数、缝合线、缝合方法等）
     */
    public String getUterineSutureState() {
        return uterineSutureState;
    }

    /**
     * 设置子宫壁缝合情况（产妇子宫壁缝合情况的详细描述，如子宫壁缝合层数、缝合线、缝合方法等）
     *
     * @param uterineSutureState 子宫壁缝合情况（产妇子宫壁缝合情况的详细描述，如子宫壁缝合层数、缝合线、缝合方法等）
     */
    public void setUterineSutureState(String uterineSutureState) {
        this.uterineSutureState = uterineSutureState == null ? null : uterineSutureState.trim();
    }

    /**
     * 获取宫缩剂名称（所使用宫缩剂的名称）
     *
     * @return UTEROTONIC_NAME - 宫缩剂名称（所使用宫缩剂的名称）
     */
    public String getUterotonicName() {
        return uterotonicName;
    }

    /**
     * 设置宫缩剂名称（所使用宫缩剂的名称）
     *
     * @param uterotonicName 宫缩剂名称（所使用宫缩剂的名称）
     */
    public void setUterotonicName(String uterotonicName) {
        this.uterotonicName = uterotonicName == null ? null : uterotonicName.trim();
    }

    /**
     * 获取宫缩剂使用方法（宫缩剂使用方法的详细描述）
     *
     * @return UTEROTONIC_USE_WAY - 宫缩剂使用方法（宫缩剂使用方法的详细描述）
     */
    public String getUterotonicUseWay() {
        return uterotonicUseWay;
    }

    /**
     * 设置宫缩剂使用方法（宫缩剂使用方法的详细描述）
     *
     * @param uterotonicUseWay 宫缩剂使用方法（宫缩剂使用方法的详细描述）
     */
    public void setUterotonicUseWay(String uterotonicUseWay) {
        this.uterotonicUseWay = uterotonicUseWay == null ? null : uterotonicUseWay.trim();
    }

    /**
     * 获取手术用药（手术所用药物的通用名称）
     *
     * @return OPERATION_DRUG - 手术用药（手术所用药物的通用名称）
     */
    public String getOperationDrug() {
        return operationDrug;
    }

    /**
     * 设置手术用药（手术所用药物的通用名称）
     *
     * @param operationDrug 手术用药（手术所用药物的通用名称）
     */
    public void setOperationDrug(String operationDrug) {
        this.operationDrug = operationDrug == null ? null : operationDrug.trim();
    }

    /**
     * 获取手术用药量（手术用药用量的详细描述）
     *
     * @return OPERATION_DRUG_AMOUNT - 手术用药量（手术用药用量的详细描述）
     */
    public String getOperationDrugAmount() {
        return operationDrugAmount;
    }

    /**
     * 设置手术用药量（手术用药用量的详细描述）
     *
     * @param operationDrugAmount 手术用药量（手术用药用量的详细描述）
     */
    public void setOperationDrugAmount(String operationDrugAmount) {
        this.operationDrugAmount = operationDrugAmount == null ? null : operationDrugAmount.trim();
    }

    /**
     * 获取腹腔探查子宫（腹腔探查时子宫情况的详细描述）
     *
     * @return EXPLORATION_UTERUS - 腹腔探查子宫（腹腔探查时子宫情况的详细描述）
     */
    public String getExplorationUterus() {
        return explorationUterus;
    }

    /**
     * 设置腹腔探查子宫（腹腔探查时子宫情况的详细描述）
     *
     * @param explorationUterus 腹腔探查子宫（腹腔探查时子宫情况的详细描述）
     */
    public void setExplorationUterus(String explorationUterus) {
        this.explorationUterus = explorationUterus == null ? null : explorationUterus.trim();
    }

    /**
     * 获取腹腔探查附件（腹腔探查时附件情况的详细描述）
     *
     * @return EXPLORATION_ADNEXA - 腹腔探查附件（腹腔探查时附件情况的详细描述）
     */
    public String getExplorationAdnexa() {
        return explorationAdnexa;
    }

    /**
     * 设置腹腔探查附件（腹腔探查时附件情况的详细描述）
     *
     * @param explorationAdnexa 腹腔探查附件（腹腔探查时附件情况的详细描述）
     */
    public void setExplorationAdnexa(String explorationAdnexa) {
        this.explorationAdnexa = explorationAdnexa == null ? null : explorationAdnexa.trim();
    }

    /**
     * 获取宫腔探查异常情况标志0否 1是（标识宫腔探查是否有异常的标志）
     *
     * @return UTEROTONIC_ABNORMAL_MARK - 宫腔探查异常情况标志0否 1是（标识宫腔探查是否有异常的标志）
     */
    public String getUterotonicAbnormalMark() {
        return uterotonicAbnormalMark;
    }

    /**
     * 设置宫腔探查异常情况标志0否 1是（标识宫腔探查是否有异常的标志）
     *
     * @param uterotonicAbnormalMark 宫腔探查异常情况标志0否 1是（标识宫腔探查是否有异常的标志）
     */
    public void setUterotonicAbnormalMark(String uterotonicAbnormalMark) {
        this.uterotonicAbnormalMark = uterotonicAbnormalMark == null ? null : uterotonicAbnormalMark.trim();
    }

    /**
     * 获取宫腔探查处理方式代码1药物 2干 3湿（宫腔探查处理方式代码）
     *
     * @return UTEROTONIC_METHOD_CODE - 宫腔探查处理方式代码1药物 2干 3湿（宫腔探查处理方式代码）
     */
    public String getUterotonicMethodCode() {
        return uterotonicMethodCode;
    }

    /**
     * 设置宫腔探查处理方式代码1药物 2干 3湿（宫腔探查处理方式代码）
     *
     * @param uterotonicMethodCode 宫腔探查处理方式代码1药物 2干 3湿（宫腔探查处理方式代码）
     */
    public void setUterotonicMethodCode(String uterotonicMethodCode) {
        this.uterotonicMethodCode = uterotonicMethodCode == null ? null : uterotonicMethodCode.trim();
    }

    /**
     * 获取宫腔探查处理方式名称（宫腔探查处理方式名称）
     *
     * @return UTEROTONIC_METHOD_NAME - 宫腔探查处理方式名称（宫腔探查处理方式名称）
     */
    public String getUterotonicMethodName() {
        return uterotonicMethodName;
    }

    /**
     * 设置宫腔探查处理方式名称（宫腔探查处理方式名称）
     *
     * @param uterotonicMethodName 宫腔探查处理方式名称（宫腔探查处理方式名称）
     */
    public void setUterotonicMethodName(String uterotonicMethodName) {
        this.uterotonicMethodName = uterotonicMethodName == null ? null : uterotonicMethodName.trim();
    }

    /**
     * 获取宫腔探查处理情况（宫腔探查后处理方式的详细描述）
     *
     * @return UTEROTONIC_STATE - 宫腔探查处理情况（宫腔探查后处理方式的详细描述）
     */
    public String getUterotonicState() {
        return uterotonicState;
    }

    /**
     * 设置宫腔探查处理情况（宫腔探查后处理方式的详细描述）
     *
     * @param uterotonicState 宫腔探查处理情况（宫腔探查后处理方式的详细描述）
     */
    public void setUterotonicState(String uterotonicState) {
        this.uterotonicState = uterotonicState == null ? null : uterotonicState.trim();
    }

    /**
     * 获取手术时产妇情况（手术时产妇情况的详细描述）
     *
     * @return OPERATION_MATERNAL_STATE - 手术时产妇情况（手术时产妇情况的详细描述）
     */
    public String getOperationMaternalState() {
        return operationMaternalState;
    }

    /**
     * 设置手术时产妇情况（手术时产妇情况的详细描述）
     *
     * @param operationMaternalState 手术时产妇情况（手术时产妇情况的详细描述）
     */
    public void setOperationMaternalState(String operationMaternalState) {
        this.operationMaternalState = operationMaternalState == null ? null : operationMaternalState.trim();
    }

    /**
     * 获取术中出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     *
     * @return LOSSBLOOD_AMOUNT - 术中出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    public Integer getLossbloodAmount() {
        return lossbloodAmount;
    }

    /**
     * 设置术中出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     *
     * @param lossbloodAmount 术中出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    public void setLossbloodAmount(Integer lossbloodAmount) {
        this.lossbloodAmount = lossbloodAmount;
    }

    /**
     * 获取输血成分（输血成分的详细描述）
     *
     * @return TRANSFUSION_COMPONENT - 输血成分（输血成分的详细描述）
     */
    public String getTransfusionComponent() {
        return transfusionComponent;
    }

    /**
     * 设置输血成分（输血成分的详细描述）
     *
     * @param transfusionComponent 输血成分（输血成分的详细描述）
     */
    public void setTransfusionComponent(String transfusionComponent) {
        this.transfusionComponent = transfusionComponent == null ? null : transfusionComponent.trim();
    }

    /**
     * 获取输血量（mL）（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     *
     * @return TRANSFUSION_AMOUNT - 输血量（mL）（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    public Integer getTransfusionAmount() {
        return transfusionAmount;
    }

    /**
     * 设置输血量（mL）（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     *
     * @param transfusionAmount 输血量（mL）（输入红细胞、血小板、血浆、全血等的数量，计量单位为 mL）
     */
    public void setTransfusionAmount(Integer transfusionAmount) {
        this.transfusionAmount = transfusionAmount;
    }

    /**
     * 获取术时输液量（mL）（术中输液量的描述，单位为 Ml）
     *
     * @return INFUSION_AMOUNT - 术时输液量（mL）（术中输液量的描述，单位为 Ml）
     */
    public Integer getInfusionAmount() {
        return infusionAmount;
    }

    /**
     * 设置术时输液量（mL）（术中输液量的描述，单位为 Ml）
     *
     * @param infusionAmount 术时输液量（mL）（术中输液量的描述，单位为 Ml）
     */
    public void setInfusionAmount(Integer infusionAmount) {
        this.infusionAmount = infusionAmount;
    }

    /**
     * 获取供氧时间（min）（供氧时间的时长，计量单位为min）
     *
     * @return OXYGEN_TIME - 供氧时间（min）（供氧时间的时长，计量单位为min）
     */
    public Integer getOxygenTime() {
        return oxygenTime;
    }

    /**
     * 设置供氧时间（min）（供氧时间的时长，计量单位为min）
     *
     * @param oxygenTime 供氧时间（min）（供氧时间的时长，计量单位为min）
     */
    public void setOxygenTime(Integer oxygenTime) {
        this.oxygenTime = oxygenTime;
    }

    /**
     * 获取其他用药（其他使用药物的通用名称）
     *
     * @return OTHER_DRUG - 其他用药（其他使用药物的通用名称）
     */
    public String getOtherDrug() {
        return otherDrug;
    }

    /**
     * 设置其他用药（其他使用药物的通用名称）
     *
     * @param otherDrug 其他用药（其他使用药物的通用名称）
     */
    public void setOtherDrug(String otherDrug) {
        this.otherDrug = otherDrug == null ? null : otherDrug.trim();
    }

    /**
     * 获取其他情况（其他用药情况的详细描述）
     *
     * @return OTHER_STATE - 其他情况（其他用药情况的详细描述）
     */
    public String getOtherState() {
        return otherState;
    }

    /**
     * 设置其他情况（其他用药情况的详细描述）
     *
     * @param otherState 其他情况（其他用药情况的详细描述）
     */
    public void setOtherState(String otherState) {
        this.otherState = otherState == null ? null : otherState.trim();
    }

    /**
     * 获取手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_END_DATE - 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationEndDate() {
        return operationEndDate;
    }

    /**
     * 设置手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationEndDate 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationEndDate(String operationEndDate) {
        this.operationEndDate = operationEndDate == null ? null : operationEndDate.trim();
    }

    /**
     * 获取手术全程时间（min）（手术全程所用的总时长,计量单位为 min）
     *
     * @return OPERATION_WHOLE_TIME - 手术全程时间（min）（手术全程所用的总时长,计量单位为 min）
     */
    public Integer getOperationWholeTime() {
        return operationWholeTime;
    }

    /**
     * 设置手术全程时间（min）（手术全程所用的总时长,计量单位为 min）
     *
     * @param operationWholeTime 手术全程时间（min）（手术全程所用的总时长,计量单位为 min）
     */
    public void setOperationWholeTime(Integer operationWholeTime) {
        this.operationWholeTime = operationWholeTime;
    }

    /**
     * 获取产后诊断类别CV05.01.002（对产妇产后诊断（包括孕产次数）的类别代码）
     *
     * @return PARTURITION_DIAGNOSIS_TYPE - 产后诊断类别CV05.01.002（对产妇产后诊断（包括孕产次数）的类别代码）
     */
    public String getParturitionDiagnosisType() {
        return parturitionDiagnosisType;
    }

    /**
     * 设置产后诊断类别CV05.01.002（对产妇产后诊断（包括孕产次数）的类别代码）
     *
     * @param parturitionDiagnosisType 产后诊断类别CV05.01.002（对产妇产后诊断（包括孕产次数）的类别代码）
     */
    public void setParturitionDiagnosisType(String parturitionDiagnosisType) {
        this.parturitionDiagnosisType = parturitionDiagnosisType == null ? null : parturitionDiagnosisType.trim();
    }

    /**
     * 获取产后诊断类别名称（对产妇产后诊断（包括孕产次数）的类别名称）
     *
     * @return PARTURITION_DIAGNOSIS_NAME - 产后诊断类别名称（对产妇产后诊断（包括孕产次数）的类别名称）
     */
    public String getParturitionDiagnosisName() {
        return parturitionDiagnosisName;
    }

    /**
     * 设置产后诊断类别名称（对产妇产后诊断（包括孕产次数）的类别名称）
     *
     * @param parturitionDiagnosisName 产后诊断类别名称（对产妇产后诊断（包括孕产次数）的类别名称）
     */
    public void setParturitionDiagnosisName(String parturitionDiagnosisName) {
        this.parturitionDiagnosisName = parturitionDiagnosisName == null ? null : parturitionDiagnosisName.trim();
    }

    /**
     * 获取产后观察日期时间（产后观察结束时间的公元纪年日期和时间的完整描述）
     *
     * @return POSTPARTUM_OBS_DATE - 产后观察日期时间（产后观察结束时间的公元纪年日期和时间的完整描述）
     */
    public String getPostpartumObsDate() {
        return postpartumObsDate;
    }

    /**
     * 设置产后观察日期时间（产后观察结束时间的公元纪年日期和时间的完整描述）
     *
     * @param postpartumObsDate 产后观察日期时间（产后观察结束时间的公元纪年日期和时间的完整描述）
     */
    public void setPostpartumObsDate(String postpartumObsDate) {
        this.postpartumObsDate = postpartumObsDate == null ? null : postpartumObsDate.trim();
    }

    /**
     * 获取产后检查时间（min）（产后检查时，距离分娩结束后的时间，计量单位为 min）
     *
     * @return POSTPARTUM_EXAM_TIME - 产后检查时间（min）（产后检查时，距离分娩结束后的时间，计量单位为 min）
     */
    public String getPostpartumExamTime() {
        return postpartumExamTime;
    }

    /**
     * 设置产后检查时间（min）（产后检查时，距离分娩结束后的时间，计量单位为 min）
     *
     * @param postpartumExamTime 产后检查时间（min）（产后检查时，距离分娩结束后的时间，计量单位为 min）
     */
    public void setPostpartumExamTime(String postpartumExamTime) {
        this.postpartumExamTime = postpartumExamTime == null ? null : postpartumExamTime.trim();
    }

    /**
     * 获取产后收缩压（产后收缩压的测量值，计量单位为 mmHg）
     *
     * @return POSTPARTUM_SBP - 产后收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    public Short getPostpartumSbp() {
        return postpartumSbp;
    }

    /**
     * 设置产后收缩压（产后收缩压的测量值，计量单位为 mmHg）
     *
     * @param postpartumSbp 产后收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    public void setPostpartumSbp(Short postpartumSbp) {
        this.postpartumSbp = postpartumSbp;
    }

    /**
     * 获取产后舒张压 （产后舒张压的测量值，计量单位为 mmHg ）
     *
     * @return POSTPARTUM_DBP - 产后舒张压 （产后舒张压的测量值，计量单位为 mmHg ）
     */
    public Short getPostpartumDbp() {
        return postpartumDbp;
    }

    /**
     * 设置产后舒张压 （产后舒张压的测量值，计量单位为 mmHg ）
     *
     * @param postpartumDbp 产后舒张压 （产后舒张压的测量值，计量单位为 mmHg ）
     */
    public void setPostpartumDbp(Short postpartumDbp) {
        this.postpartumDbp = postpartumDbp;
    }

    /**
     * 获取产后脉搏（次/min ）（产后每分钟脉搏的次数测量值，计量单位为次/min）
     *
     * @return POSTPARTUM_PULSES - 产后脉搏（次/min ）（产后每分钟脉搏的次数测量值，计量单位为次/min）
     */
    public Short getPostpartumPulses() {
        return postpartumPulses;
    }

    /**
     * 设置产后脉搏（次/min ）（产后每分钟脉搏的次数测量值，计量单位为次/min）
     *
     * @param postpartumPulses 产后脉搏（次/min ）（产后每分钟脉搏的次数测量值，计量单位为次/min）
     */
    public void setPostpartumPulses(Short postpartumPulses) {
        this.postpartumPulses = postpartumPulses;
    }

    /**
     * 获取产后心率（次/min ）（产后心脏搏动频率的测量值，计量单位为次/min）
     *
     * @return POSTPARTUM_HEART_RATE - 产后心率（次/min ）（产后心脏搏动频率的测量值，计量单位为次/min）
     */
    public Short getPostpartumHeartRate() {
        return postpartumHeartRate;
    }

    /**
     * 设置产后心率（次/min ）（产后心脏搏动频率的测量值，计量单位为次/min）
     *
     * @param postpartumHeartRate 产后心率（次/min ）（产后心脏搏动频率的测量值，计量单位为次/min）
     */
    public void setPostpartumHeartRate(Short postpartumHeartRate) {
        this.postpartumHeartRate = postpartumHeartRate;
    }

    /**
     * 获取产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     *
     * @return POSTPARTUM_LOSSBLOOD_AMOUNT - 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    public BigDecimal getPostpartumLossbloodAmount() {
        return postpartumLossbloodAmount;
    }

    /**
     * 设置产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     *
     * @param postpartumLossbloodAmount 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    public void setPostpartumLossbloodAmount(BigDecimal postpartumLossbloodAmount) {
        this.postpartumLossbloodAmount = postpartumLossbloodAmount;
    }

    /**
     * 获取产后宫缩（产妇分娩后宫缩强度等情况的详细描述）
     *
     * @return POSTPARTUM_UTERINE_CONTR - 产后宫缩（产妇分娩后宫缩强度等情况的详细描述）
     */
    public String getPostpartumUterineContr() {
        return postpartumUterineContr;
    }

    /**
     * 设置产后宫缩（产妇分娩后宫缩强度等情况的详细描述）
     *
     * @param postpartumUterineContr 产后宫缩（产妇分娩后宫缩强度等情况的详细描述）
     */
    public void setPostpartumUterineContr(String postpartumUterineContr) {
        this.postpartumUterineContr = postpartumUterineContr == null ? null : postpartumUterineContr.trim();
    }

    /**
     * 获取产后宫底高度（cm）（产妇产后耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     *
     * @return POSTPARTUM_UTERUS_HEIGHT - 产后宫底高度（cm）（产妇产后耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    public BigDecimal getPostpartumUterusHeight() {
        return postpartumUterusHeight;
    }

    /**
     * 设置产后宫底高度（cm）（产妇产后耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     *
     * @param postpartumUterusHeight 产后宫底高度（cm）（产妇产后耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    public void setPostpartumUterusHeight(BigDecimal postpartumUterusHeight) {
        this.postpartumUterusHeight = postpartumUterusHeight;
    }

    /**
     * 获取产瘤大小（产瘤大小的详细描述，计量单位 cm）
     *
     * @return TUMOR_SIZE - 产瘤大小（产瘤大小的详细描述，计量单位 cm）
     */
    public BigDecimal getTumorSize() {
        return tumorSize;
    }

    /**
     * 设置产瘤大小（产瘤大小的详细描述，计量单位 cm）
     *
     * @param tumorSize 产瘤大小（产瘤大小的详细描述，计量单位 cm）
     */
    public void setTumorSize(BigDecimal tumorSize) {
        this.tumorSize = tumorSize;
    }

    /**
     * 获取产瘤部位（产瘤部位的详细描述）
     *
     * @return TUMOR_PART - 产瘤部位（产瘤部位的详细描述）
     */
    public String getTumorPart() {
        return tumorPart;
    }

    /**
     * 设置产瘤部位（产瘤部位的详细描述）
     *
     * @param tumorPart 产瘤部位（产瘤部位的详细描述）
     */
    public void setTumorPart(String tumorPart) {
        this.tumorPart = tumorPart == null ? null : tumorPart.trim();
    }

    /**
     * 获取手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return OPERATOR_SIGNATURE - 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOperatorSignature() {
        return operatorSignature;
    }

    /**
     * 设置手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param operatorSignature 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOperatorSignature(String operatorSignature) {
        this.operatorSignature = operatorSignature == null ? null : operatorSignature.trim();
    }

    /**
     * 获取麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANESTHESIOLOGIST_NAME - 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesthesiologistName() {
        return anesthesiologistName;
    }

    /**
     * 设置麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesthesiologistName 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesthesiologistName(String anesthesiologistName) {
        this.anesthesiologistName = anesthesiologistName == null ? null : anesthesiologistName.trim();
    }

    /**
     * 获取器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DEVICE_NURSE_SIGNATURE - 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDeviceNurseSignature() {
        return deviceNurseSignature;
    }

    /**
     * 设置器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param deviceNurseSignature 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDeviceNurseSignature(String deviceNurseSignature) {
        this.deviceNurseSignature = deviceNurseSignature == null ? null : deviceNurseSignature.trim();
    }

    /**
     * 获取助手签名（助手签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT_SIGNATURE - 助手签名（助手签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistantSignature() {
        return assistantSignature;
    }

    /**
     * 设置助手签名（助手签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistantSignature 助手签名（助手签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistantSignature(String assistantSignature) {
        this.assistantSignature = assistantSignature == null ? null : assistantSignature.trim();
    }

    /**
     * 获取护婴者签名（护婴者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return BABY_CARE_SIGNATURE - 护婴者签名（护婴者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getBabyCareSignature() {
        return babyCareSignature;
    }

    /**
     * 设置护婴者签名（护婴者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param babyCareSignature 护婴者签名（护婴者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setBabyCareSignature(String babyCareSignature) {
        this.babyCareSignature = babyCareSignature == null ? null : babyCareSignature.trim();
    }

    /**
     * 获取指导者签名（分娩过程中，指导者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return INSTRUCTOR_SIGNATURE - 指导者签名（分娩过程中，指导者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getInstructorSignature() {
        return instructorSignature;
    }

    /**
     * 设置指导者签名（分娩过程中，指导者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param instructorSignature 指导者签名（分娩过程中，指导者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setInstructorSignature(String instructorSignature) {
        this.instructorSignature = instructorSignature == null ? null : instructorSignature.trim();
    }

    /**
     * 获取记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return WRITOR_SIGNATURE - 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getWritorSignature() {
        return writorSignature;
    }

    /**
     * 设置记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param writorSignature 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setWritorSignature(String writorSignature) {
        this.writorSignature = writorSignature == null ? null : writorSignature.trim();
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