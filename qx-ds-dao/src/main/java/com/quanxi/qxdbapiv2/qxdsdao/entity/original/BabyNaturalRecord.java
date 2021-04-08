package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BABY_NATURAL_RECORD")
public class BabyNaturalRecord {
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
     * 顺产记录ID[主键]（每条记录在数据库中的唯一序号）
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
     * 孕次（妊娠次数的累计值，包括异位妊娠，计量单位为次）
     */
    @Column(name = "GRAVIDITY")
    private Short gravidity;

    /**
     * 产次（产妇分娩总次数，包括28周后的引产，双多胎分娩只计1次）
     */
    @Column(name = "PARITY")
    private Short parity;

    /**
     * 预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     */
    @Column(name = "EXPECTED_CHILDBIRTH_DATE")
    private String expectedChildbirthDate;

    /**
     * 临产日期（产妇阵缩开始的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LABOR_DATE")
    private String laborDate;

    /**
     * 胎膜破裂日期（胎膜破裂时的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "RUPTURE_MEMBRANES")
    private String ruptureMembranes;

    /**
     * 前羊水性状（前羊水性状的详细描述）
     */
    @Column(name = "PRE_AMNIOTIC_FLUID_STATE")
    private String preAmnioticFluidState;

    /**
     * 前羊水量（前羊水量的描述，单位为ml）
     */
    @Column(name = "PRE_AMNIOTIC_FLUID")
    private Integer preAmnioticFluid;

    /**
     * 宫缩开始日时间（产妇宫缩开始的公元纪年日期和时间的完整描述）
     */
    @Column(name = "UTERINE_START_DATE")
    private String uterineStartDate;

    /**
     * 第一产程时长（min）（产妇分娩过程中，从开始出现间歇 3-4 分钟的规律宫缩到宫口开全的时长,计量单位为min ）
     */
    @Column(name = "FIRST_LABOR_STAGE")
    private Short firstLaborStage;

    /**
     * 宫口开全日期时间（产妇宫口开全时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "UTERUS_OPENS_DATE")
    private String uterusOpensDate;

    /**
     * 第二产程时长（min）（产妇分娩过程中，从宫口开全到胎儿娩出的时长,计量单位为min ）
     */
    @Column(name = "SECOND_LABOR_STAGE")
    private Short secondLaborStage;

    /**
     * 胎儿娩出日期时间 （胎儿娩出时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "FETAL_DISENGAGEMENT_DATE")
    private String fetalDisengagementDate;

    /**
     * 第三产程时长（min）（产妇分娩过程中，从胎儿娩出到胎盘娩出的时长,计量单位为min ）
     */
    @Column(name = "THIRD_LABOR_STAGE")
    private Short thirdLaborStage;

    /**
     * 胎盘娩出日期时间（胎盘娩出时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PLACENTAL_EXPULSION_DATE")
    private String placentalExpulsionDate;

    /**
     * 总产程时长（min）（产妇分娩过程中，从开始出现规律宫缩到胎盘娩出的时间长度，计量单位为min ）
     */
    @Column(name = "TOTAL_LABOR_STAGE")
    private Short totalLaborStage;

    /**
     * 胎儿娩出胎位（胎儿娩出胎位的详细描述）
     */
    @Column(name = "FETUS_POSITION")
    private String fetusPosition;

    /**
     * 胎儿娩出助产标志0否 1是（标识胎儿娩出是否助产）
     */
    @Column(name = "DELIVER_MARK")
    private String deliverMark;

    /**
     * 胎盘娩出情况（对胎盘娩出情况的描述，如娩出方式、胎盘重量、胎盘完整情况、胎盘附着位置等 ）
     */
    @Column(name = "PLACENTA_STATUS")
    private String placentaStatus;

    /**
     * 胎膜完整情况标志0否 1是（标识胎膜是否完整的标志）
     */
    @Column(name = "INTACT_FETAL_MEMBRANES")
    private String intactFetalMembranes;

    /**
     * 羊水性状（羊水性状的详细描述）
     */
    @Column(name = "AMNIOTIC_FLUID_STATE")
    private String amnioticFluidState;

    /**
     * 羊水量（羊水量的描述，单位为ml）
     */
    @Column(name = "AMNIOTIC_FLUID")
    private Integer amnioticFluid;

    /**
     * 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    @Column(name = "FUNICLE_LENGTH")
    private Integer funicleLength;

    /**
     * 绕颈身（圈）（脐带绕颈身的圈数，计量单位为圈）
     */
    @Column(name = "ROUND_NECK")
    private Short roundNeck;

    /**
     * 脐带异常情况标志0否 1是（标识脐带是否存在异常情况的标志）
     */
    @Column(name = "FUNICLE_ABNORMAL")
    private String funicleAbnormal;

    /**
     * 产时用药（产时所用药物的通用名称）
     */
    @Column(name = "MEDICATION_NAME")
    private String medicationName;

    /**
     * 预防措施（对产妇进行预防措施的详细描述）
     */
    @Column(name = "PREMUNITON")
    private String premuniton;

    /**
     * 产妇会阴切开标志0否 1是（标识产妇是否行会阴切开操作的标志）
     */
    @Column(name = "EPISIOTOMY_MARK")
    private String episiotomyMark;

    /**
     * 会阴切开位置（会阴切开位置的详细描述）
     */
    @Column(name = "EPISIOTOMY_POSITION")
    private String episiotomyPosition;

    /**
     * 产妇会阴缝合针数（产妇会阴缝合针数的计数值）
     */
    @Column(name = "PERINEUM_STITCHES_NUM")
    private Short perineumStitchesNum;

    /**
     * 产妇会阴裂伤程度代码CV05.01.010（产妇会阴裂伤程度分类代码）
     */
    @Column(name = "EPISIOTOMY_DEGREE_CODE")
    private String episiotomyDegreeCode;

    /**
     * 产妇会阴裂伤程度名称（产妇会阴裂伤程度分类名称）
     */
    @Column(name = "EPISIOTOMY_DEGREE_NAME")
    private String episiotomyDegreeName;

    /**
     * 会阴血肿标志0否 1是（标识会阴是否存在血肿的标志 ）
     */
    @Column(name = "PERINEUM_HEMATOMA_MARK")
    private String perineumHematomaMark;

    /**
     * 会阴血肿大小（会阴血肿大小的详细描述）
     */
    @Column(name = "PERINEUM_HEMATOMA_SIZE")
    private String perineumHematomaSize;

    /**
     * 会阴血肿处理（会阴血肿处理情况的详细描述）
     */
    @Column(name = "PERINEUM_HEMATOMA_HANDLE")
    private String perineumHematomaHandle;

    /**
     * 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_NAME")
    private String anesthesiaName;

    /**
     * 麻醉药物名称（药物通用名称）
     */
    @Column(name = "NARCOTIC_DRUG_NAME")
    private String narcoticDrugName;

    /**
     * 阴道裂伤标志0否 1是（标识阴道是否存在裂伤的标志 ）
     */
    @Column(name = "VAGINA_LACERATION_MARK")
    private String vaginaLacerationMark;

    /**
     * 阴道血肿标志 0否 1是（标识阴道是否存在血肿的标志 ）
     */
    @Column(name = "VAGINA_HEMATOMA_MARK")
    private String vaginaHematomaMark;

    /**
     * 宫颈裂伤标志0否 1是（标识宫颈是否裂伤的标志）
     */
    @Column(name = "CERVIX_LACERATION_MARK")
    private String cervixLacerationMark;

    /**
     * 宫颈缝合针数（产妇宫颈缝合针数的计数值）
     */
    @Column(name = "CERVIX_STITCHES_NUM")
    private Short cervixStitchesNum;

    /**
     * 产后用药（产后所用药物的通用名称）
     */
    @Column(name = "POSTPARTUM_DRUG_NAME")
    private String postpartumDrugName;

    /**
     * 分娩过程摘要（产妇分娩过程摘要）
     */
    @Column(name = "DELIVER_PROCESS_DESC")
    private String deliverProcessDesc;

    /**
     * 接生者签名 （接生者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "ACCOUCHE_SIGNATURE")
    private String accoucheSignature;

    /**
     * 宫缩情况 （对产妇宫缩情况的描述）
     */
    @Column(name = "UTERINE_CONTRACTION")
    private String uterineContraction;

    /**
     * 子宫情况（子宫情况的详细描述 ）
     */
    @Column(name = "UTERUS_CONTRACTION")
    private String uterusContraction;

    /**
     * 恶露状况 （对产妇产后恶露检查结果的详细描述 ）
     */
    @Column(name = "LOCHIA_CONTRACTION")
    private String lochiaContraction;

    /**
     * 会阴情况 （会阴情况的详细描述）
     */
    @Column(name = "PERINEUM_CONTRACTION")
    private String perineumContraction;

    /**
     * 修补手术过程 （修补手术过程情况的详细描述 ）
     */
    @Column(name = "REPAIR_POERATION")
    private String repairPoeration;

    /**
     * 助产者签名（助产者签署的在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DELIVER_SIGNATURE")
    private String deliverSignature;

    /**
     * 助手签名 （助手签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "ASSISTANT_SIGNATURE")
    private String assistantSignature;

    /**
     * 护婴者签名 （护婴者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "BABY_CARE_SIGNATURE")
    private String babyCareSignature;

    /**
     * 指导者签名 （分娩过程中，指导者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "INSTRUCTOR_SIGNATURE")
    private String instructorSignature;

    /**
     * 存脐带血情况标志 0否 1是（标识是否存脐带血的标志 ）
     */
    @Column(name = "SAVE_CORD_BLOOD_MARK")
    private String saveCordBloodMark;

    /**
     * 产后诊断 （产妇产后诊断的详细描述 ）
     */
    @Column(name = "POSTPARTUM_DIAGNOSIS")
    private String postpartumDiagnosis;

    /**
     * 产后观察日期时间 （产后观察的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "POSTPARTUM_OBSERV_DATE")
    private String postpartumObservDate;

    /**
     * 产后检查时间 （产后检查时，距离分娩结束后的时间，计量单位为分钟）
     */
    @Column(name = "POSTPARTUM_EXAM")
    private Short postpartumExam;

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
     * 产后脉搏（产后每分钟脉搏的次数测量值，计量单位为次/min ）
     */
    @Column(name = "POSTPARTUM_PULSES")
    private Short postpartumPulses;

    /**
     * 产后心率 （产后心脏搏动频率的测量值，计量单位为次/min ）
     */
    @Column(name = "POSTPARTUM_HEART_RATE")
    private Short postpartumHeartRate;

    /**
     * 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    @Column(name = "POSTPARTUM_LOSSBLOOD_AMOUNT")
    private Integer postpartumLossbloodAmount;

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
     * 肛查 （产妇分娩后肛查情况的详细描述 ）
     */
    @Column(name = "ANUS_EXAM")
    private String anusExam;

    /**
     * 产瘤大小 （产瘤大小的详细描述，计量单位 cm ）
     */
    @Column(name = "PRODUCTION_TUMOR_SIZE")
    private Integer productionTumorSize;

    /**
     * 产瘤部位 （产瘤部位的详细描述 ）
     */
    @Column(name = "PRODUCTION_TUMOR_POSITION")
    private String productionTumorPosition;

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
     * 获取顺产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DELIVERY_ID - 顺产记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置顺产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param deliveryId 顺产记录ID[主键]（每条记录在数据库中的唯一序号）
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
     * 获取孕次（妊娠次数的累计值，包括异位妊娠，计量单位为次）
     *
     * @return GRAVIDITY - 孕次（妊娠次数的累计值，包括异位妊娠，计量单位为次）
     */
    public Short getGravidity() {
        return gravidity;
    }

    /**
     * 设置孕次（妊娠次数的累计值，包括异位妊娠，计量单位为次）
     *
     * @param gravidity 孕次（妊娠次数的累计值，包括异位妊娠，计量单位为次）
     */
    public void setGravidity(Short gravidity) {
        this.gravidity = gravidity;
    }

    /**
     * 获取产次（产妇分娩总次数，包括28周后的引产，双多胎分娩只计1次）
     *
     * @return PARITY - 产次（产妇分娩总次数，包括28周后的引产，双多胎分娩只计1次）
     */
    public Short getParity() {
        return parity;
    }

    /**
     * 设置产次（产妇分娩总次数，包括28周后的引产，双多胎分娩只计1次）
     *
     * @param parity 产次（产妇分娩总次数，包括28周后的引产，双多胎分娩只计1次）
     */
    public void setParity(Short parity) {
        this.parity = parity;
    }

    /**
     * 获取预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     *
     * @return EXPECTED_CHILDBIRTH_DATE - 预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     */
    public String getExpectedChildbirthDate() {
        return expectedChildbirthDate;
    }

    /**
     * 设置预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     *
     * @param expectedChildbirthDate 预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     */
    public void setExpectedChildbirthDate(String expectedChildbirthDate) {
        this.expectedChildbirthDate = expectedChildbirthDate == null ? null : expectedChildbirthDate.trim();
    }

    /**
     * 获取临产日期（产妇阵缩开始的公元纪年日期和时间的完整描述）
     *
     * @return LABOR_DATE - 临产日期（产妇阵缩开始的公元纪年日期和时间的完整描述）
     */
    public String getLaborDate() {
        return laborDate;
    }

    /**
     * 设置临产日期（产妇阵缩开始的公元纪年日期和时间的完整描述）
     *
     * @param laborDate 临产日期（产妇阵缩开始的公元纪年日期和时间的完整描述）
     */
    public void setLaborDate(String laborDate) {
        this.laborDate = laborDate == null ? null : laborDate.trim();
    }

    /**
     * 获取胎膜破裂日期（胎膜破裂时的公元纪年日期和时间的完整描述 ）
     *
     * @return RUPTURE_MEMBRANES - 胎膜破裂日期（胎膜破裂时的公元纪年日期和时间的完整描述 ）
     */
    public String getRuptureMembranes() {
        return ruptureMembranes;
    }

    /**
     * 设置胎膜破裂日期（胎膜破裂时的公元纪年日期和时间的完整描述 ）
     *
     * @param ruptureMembranes 胎膜破裂日期（胎膜破裂时的公元纪年日期和时间的完整描述 ）
     */
    public void setRuptureMembranes(String ruptureMembranes) {
        this.ruptureMembranes = ruptureMembranes == null ? null : ruptureMembranes.trim();
    }

    /**
     * 获取前羊水性状（前羊水性状的详细描述）
     *
     * @return PRE_AMNIOTIC_FLUID_STATE - 前羊水性状（前羊水性状的详细描述）
     */
    public String getPreAmnioticFluidState() {
        return preAmnioticFluidState;
    }

    /**
     * 设置前羊水性状（前羊水性状的详细描述）
     *
     * @param preAmnioticFluidState 前羊水性状（前羊水性状的详细描述）
     */
    public void setPreAmnioticFluidState(String preAmnioticFluidState) {
        this.preAmnioticFluidState = preAmnioticFluidState == null ? null : preAmnioticFluidState.trim();
    }

    /**
     * 获取前羊水量（前羊水量的描述，单位为ml）
     *
     * @return PRE_AMNIOTIC_FLUID - 前羊水量（前羊水量的描述，单位为ml）
     */
    public Integer getPreAmnioticFluid() {
        return preAmnioticFluid;
    }

    /**
     * 设置前羊水量（前羊水量的描述，单位为ml）
     *
     * @param preAmnioticFluid 前羊水量（前羊水量的描述，单位为ml）
     */
    public void setPreAmnioticFluid(Integer preAmnioticFluid) {
        this.preAmnioticFluid = preAmnioticFluid;
    }

    /**
     * 获取宫缩开始日时间（产妇宫缩开始的公元纪年日期和时间的完整描述）
     *
     * @return UTERINE_START_DATE - 宫缩开始日时间（产妇宫缩开始的公元纪年日期和时间的完整描述）
     */
    public String getUterineStartDate() {
        return uterineStartDate;
    }

    /**
     * 设置宫缩开始日时间（产妇宫缩开始的公元纪年日期和时间的完整描述）
     *
     * @param uterineStartDate 宫缩开始日时间（产妇宫缩开始的公元纪年日期和时间的完整描述）
     */
    public void setUterineStartDate(String uterineStartDate) {
        this.uterineStartDate = uterineStartDate == null ? null : uterineStartDate.trim();
    }

    /**
     * 获取第一产程时长（min）（产妇分娩过程中，从开始出现间歇 3-4 分钟的规律宫缩到宫口开全的时长,计量单位为min ）
     *
     * @return FIRST_LABOR_STAGE - 第一产程时长（min）（产妇分娩过程中，从开始出现间歇 3-4 分钟的规律宫缩到宫口开全的时长,计量单位为min ）
     */
    public Short getFirstLaborStage() {
        return firstLaborStage;
    }

    /**
     * 设置第一产程时长（min）（产妇分娩过程中，从开始出现间歇 3-4 分钟的规律宫缩到宫口开全的时长,计量单位为min ）
     *
     * @param firstLaborStage 第一产程时长（min）（产妇分娩过程中，从开始出现间歇 3-4 分钟的规律宫缩到宫口开全的时长,计量单位为min ）
     */
    public void setFirstLaborStage(Short firstLaborStage) {
        this.firstLaborStage = firstLaborStage;
    }

    /**
     * 获取宫口开全日期时间（产妇宫口开全时的公元纪年日期和时间的完整描述）
     *
     * @return UTERUS_OPENS_DATE - 宫口开全日期时间（产妇宫口开全时的公元纪年日期和时间的完整描述）
     */
    public String getUterusOpensDate() {
        return uterusOpensDate;
    }

    /**
     * 设置宫口开全日期时间（产妇宫口开全时的公元纪年日期和时间的完整描述）
     *
     * @param uterusOpensDate 宫口开全日期时间（产妇宫口开全时的公元纪年日期和时间的完整描述）
     */
    public void setUterusOpensDate(String uterusOpensDate) {
        this.uterusOpensDate = uterusOpensDate == null ? null : uterusOpensDate.trim();
    }

    /**
     * 获取第二产程时长（min）（产妇分娩过程中，从宫口开全到胎儿娩出的时长,计量单位为min ）
     *
     * @return SECOND_LABOR_STAGE - 第二产程时长（min）（产妇分娩过程中，从宫口开全到胎儿娩出的时长,计量单位为min ）
     */
    public Short getSecondLaborStage() {
        return secondLaborStage;
    }

    /**
     * 设置第二产程时长（min）（产妇分娩过程中，从宫口开全到胎儿娩出的时长,计量单位为min ）
     *
     * @param secondLaborStage 第二产程时长（min）（产妇分娩过程中，从宫口开全到胎儿娩出的时长,计量单位为min ）
     */
    public void setSecondLaborStage(Short secondLaborStage) {
        this.secondLaborStage = secondLaborStage;
    }

    /**
     * 获取胎儿娩出日期时间 （胎儿娩出时的公元纪年日期和时间的完整描述）
     *
     * @return FETAL_DISENGAGEMENT_DATE - 胎儿娩出日期时间 （胎儿娩出时的公元纪年日期和时间的完整描述）
     */
    public String getFetalDisengagementDate() {
        return fetalDisengagementDate;
    }

    /**
     * 设置胎儿娩出日期时间 （胎儿娩出时的公元纪年日期和时间的完整描述）
     *
     * @param fetalDisengagementDate 胎儿娩出日期时间 （胎儿娩出时的公元纪年日期和时间的完整描述）
     */
    public void setFetalDisengagementDate(String fetalDisengagementDate) {
        this.fetalDisengagementDate = fetalDisengagementDate == null ? null : fetalDisengagementDate.trim();
    }

    /**
     * 获取第三产程时长（min）（产妇分娩过程中，从胎儿娩出到胎盘娩出的时长,计量单位为min ）
     *
     * @return THIRD_LABOR_STAGE - 第三产程时长（min）（产妇分娩过程中，从胎儿娩出到胎盘娩出的时长,计量单位为min ）
     */
    public Short getThirdLaborStage() {
        return thirdLaborStage;
    }

    /**
     * 设置第三产程时长（min）（产妇分娩过程中，从胎儿娩出到胎盘娩出的时长,计量单位为min ）
     *
     * @param thirdLaborStage 第三产程时长（min）（产妇分娩过程中，从胎儿娩出到胎盘娩出的时长,计量单位为min ）
     */
    public void setThirdLaborStage(Short thirdLaborStage) {
        this.thirdLaborStage = thirdLaborStage;
    }

    /**
     * 获取胎盘娩出日期时间（胎盘娩出时的公元纪年日期和时间的完整描述）
     *
     * @return PLACENTAL_EXPULSION_DATE - 胎盘娩出日期时间（胎盘娩出时的公元纪年日期和时间的完整描述）
     */
    public String getPlacentalExpulsionDate() {
        return placentalExpulsionDate;
    }

    /**
     * 设置胎盘娩出日期时间（胎盘娩出时的公元纪年日期和时间的完整描述）
     *
     * @param placentalExpulsionDate 胎盘娩出日期时间（胎盘娩出时的公元纪年日期和时间的完整描述）
     */
    public void setPlacentalExpulsionDate(String placentalExpulsionDate) {
        this.placentalExpulsionDate = placentalExpulsionDate == null ? null : placentalExpulsionDate.trim();
    }

    /**
     * 获取总产程时长（min）（产妇分娩过程中，从开始出现规律宫缩到胎盘娩出的时间长度，计量单位为min ）
     *
     * @return TOTAL_LABOR_STAGE - 总产程时长（min）（产妇分娩过程中，从开始出现规律宫缩到胎盘娩出的时间长度，计量单位为min ）
     */
    public Short getTotalLaborStage() {
        return totalLaborStage;
    }

    /**
     * 设置总产程时长（min）（产妇分娩过程中，从开始出现规律宫缩到胎盘娩出的时间长度，计量单位为min ）
     *
     * @param totalLaborStage 总产程时长（min）（产妇分娩过程中，从开始出现规律宫缩到胎盘娩出的时间长度，计量单位为min ）
     */
    public void setTotalLaborStage(Short totalLaborStage) {
        this.totalLaborStage = totalLaborStage;
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
     * 获取胎儿娩出助产标志0否 1是（标识胎儿娩出是否助产）
     *
     * @return DELIVER_MARK - 胎儿娩出助产标志0否 1是（标识胎儿娩出是否助产）
     */
    public String getDeliverMark() {
        return deliverMark;
    }

    /**
     * 设置胎儿娩出助产标志0否 1是（标识胎儿娩出是否助产）
     *
     * @param deliverMark 胎儿娩出助产标志0否 1是（标识胎儿娩出是否助产）
     */
    public void setDeliverMark(String deliverMark) {
        this.deliverMark = deliverMark == null ? null : deliverMark.trim();
    }

    /**
     * 获取胎盘娩出情况（对胎盘娩出情况的描述，如娩出方式、胎盘重量、胎盘完整情况、胎盘附着位置等 ）
     *
     * @return PLACENTA_STATUS - 胎盘娩出情况（对胎盘娩出情况的描述，如娩出方式、胎盘重量、胎盘完整情况、胎盘附着位置等 ）
     */
    public String getPlacentaStatus() {
        return placentaStatus;
    }

    /**
     * 设置胎盘娩出情况（对胎盘娩出情况的描述，如娩出方式、胎盘重量、胎盘完整情况、胎盘附着位置等 ）
     *
     * @param placentaStatus 胎盘娩出情况（对胎盘娩出情况的描述，如娩出方式、胎盘重量、胎盘完整情况、胎盘附着位置等 ）
     */
    public void setPlacentaStatus(String placentaStatus) {
        this.placentaStatus = placentaStatus == null ? null : placentaStatus.trim();
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
     * 获取羊水性状（羊水性状的详细描述）
     *
     * @return AMNIOTIC_FLUID_STATE - 羊水性状（羊水性状的详细描述）
     */
    public String getAmnioticFluidState() {
        return amnioticFluidState;
    }

    /**
     * 设置羊水性状（羊水性状的详细描述）
     *
     * @param amnioticFluidState 羊水性状（羊水性状的详细描述）
     */
    public void setAmnioticFluidState(String amnioticFluidState) {
        this.amnioticFluidState = amnioticFluidState == null ? null : amnioticFluidState.trim();
    }

    /**
     * 获取羊水量（羊水量的描述，单位为ml）
     *
     * @return AMNIOTIC_FLUID - 羊水量（羊水量的描述，单位为ml）
     */
    public Integer getAmnioticFluid() {
        return amnioticFluid;
    }

    /**
     * 设置羊水量（羊水量的描述，单位为ml）
     *
     * @param amnioticFluid 羊水量（羊水量的描述，单位为ml）
     */
    public void setAmnioticFluid(Integer amnioticFluid) {
        this.amnioticFluid = amnioticFluid;
    }

    /**
     * 获取脐带长度（cm）（脐带的长度值，计量单位为 cm）
     *
     * @return FUNICLE_LENGTH - 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    public Integer getFunicleLength() {
        return funicleLength;
    }

    /**
     * 设置脐带长度（cm）（脐带的长度值，计量单位为 cm）
     *
     * @param funicleLength 脐带长度（cm）（脐带的长度值，计量单位为 cm）
     */
    public void setFunicleLength(Integer funicleLength) {
        this.funicleLength = funicleLength;
    }

    /**
     * 获取绕颈身（圈）（脐带绕颈身的圈数，计量单位为圈）
     *
     * @return ROUND_NECK - 绕颈身（圈）（脐带绕颈身的圈数，计量单位为圈）
     */
    public Short getRoundNeck() {
        return roundNeck;
    }

    /**
     * 设置绕颈身（圈）（脐带绕颈身的圈数，计量单位为圈）
     *
     * @param roundNeck 绕颈身（圈）（脐带绕颈身的圈数，计量单位为圈）
     */
    public void setRoundNeck(Short roundNeck) {
        this.roundNeck = roundNeck;
    }

    /**
     * 获取脐带异常情况标志0否 1是（标识脐带是否存在异常情况的标志）
     *
     * @return FUNICLE_ABNORMAL - 脐带异常情况标志0否 1是（标识脐带是否存在异常情况的标志）
     */
    public String getFunicleAbnormal() {
        return funicleAbnormal;
    }

    /**
     * 设置脐带异常情况标志0否 1是（标识脐带是否存在异常情况的标志）
     *
     * @param funicleAbnormal 脐带异常情况标志0否 1是（标识脐带是否存在异常情况的标志）
     */
    public void setFunicleAbnormal(String funicleAbnormal) {
        this.funicleAbnormal = funicleAbnormal == null ? null : funicleAbnormal.trim();
    }

    /**
     * 获取产时用药（产时所用药物的通用名称）
     *
     * @return MEDICATION_NAME - 产时用药（产时所用药物的通用名称）
     */
    public String getMedicationName() {
        return medicationName;
    }

    /**
     * 设置产时用药（产时所用药物的通用名称）
     *
     * @param medicationName 产时用药（产时所用药物的通用名称）
     */
    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName == null ? null : medicationName.trim();
    }

    /**
     * 获取预防措施（对产妇进行预防措施的详细描述）
     *
     * @return PREMUNITON - 预防措施（对产妇进行预防措施的详细描述）
     */
    public String getPremuniton() {
        return premuniton;
    }

    /**
     * 设置预防措施（对产妇进行预防措施的详细描述）
     *
     * @param premuniton 预防措施（对产妇进行预防措施的详细描述）
     */
    public void setPremuniton(String premuniton) {
        this.premuniton = premuniton == null ? null : premuniton.trim();
    }

    /**
     * 获取产妇会阴切开标志0否 1是（标识产妇是否行会阴切开操作的标志）
     *
     * @return EPISIOTOMY_MARK - 产妇会阴切开标志0否 1是（标识产妇是否行会阴切开操作的标志）
     */
    public String getEpisiotomyMark() {
        return episiotomyMark;
    }

    /**
     * 设置产妇会阴切开标志0否 1是（标识产妇是否行会阴切开操作的标志）
     *
     * @param episiotomyMark 产妇会阴切开标志0否 1是（标识产妇是否行会阴切开操作的标志）
     */
    public void setEpisiotomyMark(String episiotomyMark) {
        this.episiotomyMark = episiotomyMark == null ? null : episiotomyMark.trim();
    }

    /**
     * 获取会阴切开位置（会阴切开位置的详细描述）
     *
     * @return EPISIOTOMY_POSITION - 会阴切开位置（会阴切开位置的详细描述）
     */
    public String getEpisiotomyPosition() {
        return episiotomyPosition;
    }

    /**
     * 设置会阴切开位置（会阴切开位置的详细描述）
     *
     * @param episiotomyPosition 会阴切开位置（会阴切开位置的详细描述）
     */
    public void setEpisiotomyPosition(String episiotomyPosition) {
        this.episiotomyPosition = episiotomyPosition == null ? null : episiotomyPosition.trim();
    }

    /**
     * 获取产妇会阴缝合针数（产妇会阴缝合针数的计数值）
     *
     * @return PERINEUM_STITCHES_NUM - 产妇会阴缝合针数（产妇会阴缝合针数的计数值）
     */
    public Short getPerineumStitchesNum() {
        return perineumStitchesNum;
    }

    /**
     * 设置产妇会阴缝合针数（产妇会阴缝合针数的计数值）
     *
     * @param perineumStitchesNum 产妇会阴缝合针数（产妇会阴缝合针数的计数值）
     */
    public void setPerineumStitchesNum(Short perineumStitchesNum) {
        this.perineumStitchesNum = perineumStitchesNum;
    }

    /**
     * 获取产妇会阴裂伤程度代码CV05.01.010（产妇会阴裂伤程度分类代码）
     *
     * @return EPISIOTOMY_DEGREE_CODE - 产妇会阴裂伤程度代码CV05.01.010（产妇会阴裂伤程度分类代码）
     */
    public String getEpisiotomyDegreeCode() {
        return episiotomyDegreeCode;
    }

    /**
     * 设置产妇会阴裂伤程度代码CV05.01.010（产妇会阴裂伤程度分类代码）
     *
     * @param episiotomyDegreeCode 产妇会阴裂伤程度代码CV05.01.010（产妇会阴裂伤程度分类代码）
     */
    public void setEpisiotomyDegreeCode(String episiotomyDegreeCode) {
        this.episiotomyDegreeCode = episiotomyDegreeCode == null ? null : episiotomyDegreeCode.trim();
    }

    /**
     * 获取产妇会阴裂伤程度名称（产妇会阴裂伤程度分类名称）
     *
     * @return EPISIOTOMY_DEGREE_NAME - 产妇会阴裂伤程度名称（产妇会阴裂伤程度分类名称）
     */
    public String getEpisiotomyDegreeName() {
        return episiotomyDegreeName;
    }

    /**
     * 设置产妇会阴裂伤程度名称（产妇会阴裂伤程度分类名称）
     *
     * @param episiotomyDegreeName 产妇会阴裂伤程度名称（产妇会阴裂伤程度分类名称）
     */
    public void setEpisiotomyDegreeName(String episiotomyDegreeName) {
        this.episiotomyDegreeName = episiotomyDegreeName == null ? null : episiotomyDegreeName.trim();
    }

    /**
     * 获取会阴血肿标志0否 1是（标识会阴是否存在血肿的标志 ）
     *
     * @return PERINEUM_HEMATOMA_MARK - 会阴血肿标志0否 1是（标识会阴是否存在血肿的标志 ）
     */
    public String getPerineumHematomaMark() {
        return perineumHematomaMark;
    }

    /**
     * 设置会阴血肿标志0否 1是（标识会阴是否存在血肿的标志 ）
     *
     * @param perineumHematomaMark 会阴血肿标志0否 1是（标识会阴是否存在血肿的标志 ）
     */
    public void setPerineumHematomaMark(String perineumHematomaMark) {
        this.perineumHematomaMark = perineumHematomaMark == null ? null : perineumHematomaMark.trim();
    }

    /**
     * 获取会阴血肿大小（会阴血肿大小的详细描述）
     *
     * @return PERINEUM_HEMATOMA_SIZE - 会阴血肿大小（会阴血肿大小的详细描述）
     */
    public String getPerineumHematomaSize() {
        return perineumHematomaSize;
    }

    /**
     * 设置会阴血肿大小（会阴血肿大小的详细描述）
     *
     * @param perineumHematomaSize 会阴血肿大小（会阴血肿大小的详细描述）
     */
    public void setPerineumHematomaSize(String perineumHematomaSize) {
        this.perineumHematomaSize = perineumHematomaSize == null ? null : perineumHematomaSize.trim();
    }

    /**
     * 获取会阴血肿处理（会阴血肿处理情况的详细描述）
     *
     * @return PERINEUM_HEMATOMA_HANDLE - 会阴血肿处理（会阴血肿处理情况的详细描述）
     */
    public String getPerineumHematomaHandle() {
        return perineumHematomaHandle;
    }

    /**
     * 设置会阴血肿处理（会阴血肿处理情况的详细描述）
     *
     * @param perineumHematomaHandle 会阴血肿处理（会阴血肿处理情况的详细描述）
     */
    public void setPerineumHematomaHandle(String perineumHematomaHandle) {
        this.perineumHematomaHandle = perineumHematomaHandle == null ? null : perineumHematomaHandle.trim();
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
     * @return ANESTHESIA_NAME - 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaName() {
        return anesthesiaName;
    }

    /**
     * 设置麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaName 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaName(String anesthesiaName) {
        this.anesthesiaName = anesthesiaName == null ? null : anesthesiaName.trim();
    }

    /**
     * 获取麻醉药物名称（药物通用名称）
     *
     * @return NARCOTIC_DRUG_NAME - 麻醉药物名称（药物通用名称）
     */
    public String getNarcoticDrugName() {
        return narcoticDrugName;
    }

    /**
     * 设置麻醉药物名称（药物通用名称）
     *
     * @param narcoticDrugName 麻醉药物名称（药物通用名称）
     */
    public void setNarcoticDrugName(String narcoticDrugName) {
        this.narcoticDrugName = narcoticDrugName == null ? null : narcoticDrugName.trim();
    }

    /**
     * 获取阴道裂伤标志0否 1是（标识阴道是否存在裂伤的标志 ）
     *
     * @return VAGINA_LACERATION_MARK - 阴道裂伤标志0否 1是（标识阴道是否存在裂伤的标志 ）
     */
    public String getVaginaLacerationMark() {
        return vaginaLacerationMark;
    }

    /**
     * 设置阴道裂伤标志0否 1是（标识阴道是否存在裂伤的标志 ）
     *
     * @param vaginaLacerationMark 阴道裂伤标志0否 1是（标识阴道是否存在裂伤的标志 ）
     */
    public void setVaginaLacerationMark(String vaginaLacerationMark) {
        this.vaginaLacerationMark = vaginaLacerationMark == null ? null : vaginaLacerationMark.trim();
    }

    /**
     * 获取阴道血肿标志 0否 1是（标识阴道是否存在血肿的标志 ）
     *
     * @return VAGINA_HEMATOMA_MARK - 阴道血肿标志 0否 1是（标识阴道是否存在血肿的标志 ）
     */
    public String getVaginaHematomaMark() {
        return vaginaHematomaMark;
    }

    /**
     * 设置阴道血肿标志 0否 1是（标识阴道是否存在血肿的标志 ）
     *
     * @param vaginaHematomaMark 阴道血肿标志 0否 1是（标识阴道是否存在血肿的标志 ）
     */
    public void setVaginaHematomaMark(String vaginaHematomaMark) {
        this.vaginaHematomaMark = vaginaHematomaMark == null ? null : vaginaHematomaMark.trim();
    }

    /**
     * 获取宫颈裂伤标志0否 1是（标识宫颈是否裂伤的标志）
     *
     * @return CERVIX_LACERATION_MARK - 宫颈裂伤标志0否 1是（标识宫颈是否裂伤的标志）
     */
    public String getCervixLacerationMark() {
        return cervixLacerationMark;
    }

    /**
     * 设置宫颈裂伤标志0否 1是（标识宫颈是否裂伤的标志）
     *
     * @param cervixLacerationMark 宫颈裂伤标志0否 1是（标识宫颈是否裂伤的标志）
     */
    public void setCervixLacerationMark(String cervixLacerationMark) {
        this.cervixLacerationMark = cervixLacerationMark == null ? null : cervixLacerationMark.trim();
    }

    /**
     * 获取宫颈缝合针数（产妇宫颈缝合针数的计数值）
     *
     * @return CERVIX_STITCHES_NUM - 宫颈缝合针数（产妇宫颈缝合针数的计数值）
     */
    public Short getCervixStitchesNum() {
        return cervixStitchesNum;
    }

    /**
     * 设置宫颈缝合针数（产妇宫颈缝合针数的计数值）
     *
     * @param cervixStitchesNum 宫颈缝合针数（产妇宫颈缝合针数的计数值）
     */
    public void setCervixStitchesNum(Short cervixStitchesNum) {
        this.cervixStitchesNum = cervixStitchesNum;
    }

    /**
     * 获取产后用药（产后所用药物的通用名称）
     *
     * @return POSTPARTUM_DRUG_NAME - 产后用药（产后所用药物的通用名称）
     */
    public String getPostpartumDrugName() {
        return postpartumDrugName;
    }

    /**
     * 设置产后用药（产后所用药物的通用名称）
     *
     * @param postpartumDrugName 产后用药（产后所用药物的通用名称）
     */
    public void setPostpartumDrugName(String postpartumDrugName) {
        this.postpartumDrugName = postpartumDrugName == null ? null : postpartumDrugName.trim();
    }

    /**
     * 获取分娩过程摘要（产妇分娩过程摘要）
     *
     * @return DELIVER_PROCESS_DESC - 分娩过程摘要（产妇分娩过程摘要）
     */
    public String getDeliverProcessDesc() {
        return deliverProcessDesc;
    }

    /**
     * 设置分娩过程摘要（产妇分娩过程摘要）
     *
     * @param deliverProcessDesc 分娩过程摘要（产妇分娩过程摘要）
     */
    public void setDeliverProcessDesc(String deliverProcessDesc) {
        this.deliverProcessDesc = deliverProcessDesc == null ? null : deliverProcessDesc.trim();
    }

    /**
     * 获取接生者签名 （接生者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return ACCOUCHE_SIGNATURE - 接生者签名 （接生者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getAccoucheSignature() {
        return accoucheSignature;
    }

    /**
     * 设置接生者签名 （接生者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param accoucheSignature 接生者签名 （接生者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setAccoucheSignature(String accoucheSignature) {
        this.accoucheSignature = accoucheSignature == null ? null : accoucheSignature.trim();
    }

    /**
     * 获取宫缩情况 （对产妇宫缩情况的描述）
     *
     * @return UTERINE_CONTRACTION - 宫缩情况 （对产妇宫缩情况的描述）
     */
    public String getUterineContraction() {
        return uterineContraction;
    }

    /**
     * 设置宫缩情况 （对产妇宫缩情况的描述）
     *
     * @param uterineContraction 宫缩情况 （对产妇宫缩情况的描述）
     */
    public void setUterineContraction(String uterineContraction) {
        this.uterineContraction = uterineContraction == null ? null : uterineContraction.trim();
    }

    /**
     * 获取子宫情况（子宫情况的详细描述 ）
     *
     * @return UTERUS_CONTRACTION - 子宫情况（子宫情况的详细描述 ）
     */
    public String getUterusContraction() {
        return uterusContraction;
    }

    /**
     * 设置子宫情况（子宫情况的详细描述 ）
     *
     * @param uterusContraction 子宫情况（子宫情况的详细描述 ）
     */
    public void setUterusContraction(String uterusContraction) {
        this.uterusContraction = uterusContraction == null ? null : uterusContraction.trim();
    }

    /**
     * 获取恶露状况 （对产妇产后恶露检查结果的详细描述 ）
     *
     * @return LOCHIA_CONTRACTION - 恶露状况 （对产妇产后恶露检查结果的详细描述 ）
     */
    public String getLochiaContraction() {
        return lochiaContraction;
    }

    /**
     * 设置恶露状况 （对产妇产后恶露检查结果的详细描述 ）
     *
     * @param lochiaContraction 恶露状况 （对产妇产后恶露检查结果的详细描述 ）
     */
    public void setLochiaContraction(String lochiaContraction) {
        this.lochiaContraction = lochiaContraction == null ? null : lochiaContraction.trim();
    }

    /**
     * 获取会阴情况 （会阴情况的详细描述）
     *
     * @return PERINEUM_CONTRACTION - 会阴情况 （会阴情况的详细描述）
     */
    public String getPerineumContraction() {
        return perineumContraction;
    }

    /**
     * 设置会阴情况 （会阴情况的详细描述）
     *
     * @param perineumContraction 会阴情况 （会阴情况的详细描述）
     */
    public void setPerineumContraction(String perineumContraction) {
        this.perineumContraction = perineumContraction == null ? null : perineumContraction.trim();
    }

    /**
     * 获取修补手术过程 （修补手术过程情况的详细描述 ）
     *
     * @return REPAIR_POERATION - 修补手术过程 （修补手术过程情况的详细描述 ）
     */
    public String getRepairPoeration() {
        return repairPoeration;
    }

    /**
     * 设置修补手术过程 （修补手术过程情况的详细描述 ）
     *
     * @param repairPoeration 修补手术过程 （修补手术过程情况的详细描述 ）
     */
    public void setRepairPoeration(String repairPoeration) {
        this.repairPoeration = repairPoeration == null ? null : repairPoeration.trim();
    }

    /**
     * 获取助产者签名（助产者签署的在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return DELIVER_SIGNATURE - 助产者签名（助产者签署的在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getDeliverSignature() {
        return deliverSignature;
    }

    /**
     * 设置助产者签名（助产者签署的在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param deliverSignature 助产者签名（助产者签署的在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setDeliverSignature(String deliverSignature) {
        this.deliverSignature = deliverSignature == null ? null : deliverSignature.trim();
    }

    /**
     * 获取助手签名 （助手签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return ASSISTANT_SIGNATURE - 助手签名 （助手签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getAssistantSignature() {
        return assistantSignature;
    }

    /**
     * 设置助手签名 （助手签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param assistantSignature 助手签名 （助手签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setAssistantSignature(String assistantSignature) {
        this.assistantSignature = assistantSignature == null ? null : assistantSignature.trim();
    }

    /**
     * 获取护婴者签名 （护婴者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return BABY_CARE_SIGNATURE - 护婴者签名 （护婴者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getBabyCareSignature() {
        return babyCareSignature;
    }

    /**
     * 设置护婴者签名 （护婴者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param babyCareSignature 护婴者签名 （护婴者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setBabyCareSignature(String babyCareSignature) {
        this.babyCareSignature = babyCareSignature == null ? null : babyCareSignature.trim();
    }

    /**
     * 获取指导者签名 （分娩过程中，指导者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return INSTRUCTOR_SIGNATURE - 指导者签名 （分娩过程中，指导者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getInstructorSignature() {
        return instructorSignature;
    }

    /**
     * 设置指导者签名 （分娩过程中，指导者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param instructorSignature 指导者签名 （分娩过程中，指导者签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setInstructorSignature(String instructorSignature) {
        this.instructorSignature = instructorSignature == null ? null : instructorSignature.trim();
    }

    /**
     * 获取存脐带血情况标志 0否 1是（标识是否存脐带血的标志 ）
     *
     * @return SAVE_CORD_BLOOD_MARK - 存脐带血情况标志 0否 1是（标识是否存脐带血的标志 ）
     */
    public String getSaveCordBloodMark() {
        return saveCordBloodMark;
    }

    /**
     * 设置存脐带血情况标志 0否 1是（标识是否存脐带血的标志 ）
     *
     * @param saveCordBloodMark 存脐带血情况标志 0否 1是（标识是否存脐带血的标志 ）
     */
    public void setSaveCordBloodMark(String saveCordBloodMark) {
        this.saveCordBloodMark = saveCordBloodMark == null ? null : saveCordBloodMark.trim();
    }

    /**
     * 获取产后诊断 （产妇产后诊断的详细描述 ）
     *
     * @return POSTPARTUM_DIAGNOSIS - 产后诊断 （产妇产后诊断的详细描述 ）
     */
    public String getPostpartumDiagnosis() {
        return postpartumDiagnosis;
    }

    /**
     * 设置产后诊断 （产妇产后诊断的详细描述 ）
     *
     * @param postpartumDiagnosis 产后诊断 （产妇产后诊断的详细描述 ）
     */
    public void setPostpartumDiagnosis(String postpartumDiagnosis) {
        this.postpartumDiagnosis = postpartumDiagnosis == null ? null : postpartumDiagnosis.trim();
    }

    /**
     * 获取产后观察日期时间 （产后观察的公元纪年日期和时间的完整描述 ）
     *
     * @return POSTPARTUM_OBSERV_DATE - 产后观察日期时间 （产后观察的公元纪年日期和时间的完整描述 ）
     */
    public String getPostpartumObservDate() {
        return postpartumObservDate;
    }

    /**
     * 设置产后观察日期时间 （产后观察的公元纪年日期和时间的完整描述 ）
     *
     * @param postpartumObservDate 产后观察日期时间 （产后观察的公元纪年日期和时间的完整描述 ）
     */
    public void setPostpartumObservDate(String postpartumObservDate) {
        this.postpartumObservDate = postpartumObservDate == null ? null : postpartumObservDate.trim();
    }

    /**
     * 获取产后检查时间 （产后检查时，距离分娩结束后的时间，计量单位为分钟）
     *
     * @return POSTPARTUM_EXAM - 产后检查时间 （产后检查时，距离分娩结束后的时间，计量单位为分钟）
     */
    public Short getPostpartumExam() {
        return postpartumExam;
    }

    /**
     * 设置产后检查时间 （产后检查时，距离分娩结束后的时间，计量单位为分钟）
     *
     * @param postpartumExam 产后检查时间 （产后检查时，距离分娩结束后的时间，计量单位为分钟）
     */
    public void setPostpartumExam(Short postpartumExam) {
        this.postpartumExam = postpartumExam;
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
     * 获取产后脉搏（产后每分钟脉搏的次数测量值，计量单位为次/min ）
     *
     * @return POSTPARTUM_PULSES - 产后脉搏（产后每分钟脉搏的次数测量值，计量单位为次/min ）
     */
    public Short getPostpartumPulses() {
        return postpartumPulses;
    }

    /**
     * 设置产后脉搏（产后每分钟脉搏的次数测量值，计量单位为次/min ）
     *
     * @param postpartumPulses 产后脉搏（产后每分钟脉搏的次数测量值，计量单位为次/min ）
     */
    public void setPostpartumPulses(Short postpartumPulses) {
        this.postpartumPulses = postpartumPulses;
    }

    /**
     * 获取产后心率 （产后心脏搏动频率的测量值，计量单位为次/min ）
     *
     * @return POSTPARTUM_HEART_RATE - 产后心率 （产后心脏搏动频率的测量值，计量单位为次/min ）
     */
    public Short getPostpartumHeartRate() {
        return postpartumHeartRate;
    }

    /**
     * 设置产后心率 （产后心脏搏动频率的测量值，计量单位为次/min ）
     *
     * @param postpartumHeartRate 产后心率 （产后心脏搏动频率的测量值，计量单位为次/min ）
     */
    public void setPostpartumHeartRate(Short postpartumHeartRate) {
        this.postpartumHeartRate = postpartumHeartRate;
    }

    /**
     * 获取产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     *
     * @return POSTPARTUM_LOSSBLOOD_AMOUNT - 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    public Integer getPostpartumLossbloodAmount() {
        return postpartumLossbloodAmount;
    }

    /**
     * 设置产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     *
     * @param postpartumLossbloodAmount 产后出血量（mL）（产妇产时和产后出血量的累计值，计量单位为 mL）
     */
    public void setPostpartumLossbloodAmount(Integer postpartumLossbloodAmount) {
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
     * 获取肛查 （产妇分娩后肛查情况的详细描述 ）
     *
     * @return ANUS_EXAM - 肛查 （产妇分娩后肛查情况的详细描述 ）
     */
    public String getAnusExam() {
        return anusExam;
    }

    /**
     * 设置肛查 （产妇分娩后肛查情况的详细描述 ）
     *
     * @param anusExam 肛查 （产妇分娩后肛查情况的详细描述 ）
     */
    public void setAnusExam(String anusExam) {
        this.anusExam = anusExam == null ? null : anusExam.trim();
    }

    /**
     * 获取产瘤大小 （产瘤大小的详细描述，计量单位 cm ）
     *
     * @return PRODUCTION_TUMOR_SIZE - 产瘤大小 （产瘤大小的详细描述，计量单位 cm ）
     */
    public Integer getProductionTumorSize() {
        return productionTumorSize;
    }

    /**
     * 设置产瘤大小 （产瘤大小的详细描述，计量单位 cm ）
     *
     * @param productionTumorSize 产瘤大小 （产瘤大小的详细描述，计量单位 cm ）
     */
    public void setProductionTumorSize(Integer productionTumorSize) {
        this.productionTumorSize = productionTumorSize;
    }

    /**
     * 获取产瘤部位 （产瘤部位的详细描述 ）
     *
     * @return PRODUCTION_TUMOR_POSITION - 产瘤部位 （产瘤部位的详细描述 ）
     */
    public String getProductionTumorPosition() {
        return productionTumorPosition;
    }

    /**
     * 设置产瘤部位 （产瘤部位的详细描述 ）
     *
     * @param productionTumorPosition 产瘤部位 （产瘤部位的详细描述 ）
     */
    public void setProductionTumorPosition(String productionTumorPosition) {
        this.productionTumorPosition = productionTumorPosition == null ? null : productionTumorPosition.trim();
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