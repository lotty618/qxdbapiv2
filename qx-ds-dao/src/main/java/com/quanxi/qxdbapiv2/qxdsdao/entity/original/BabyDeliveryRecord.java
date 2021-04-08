package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BABY_DELIVERY_RECORD")
public class BabyDeliveryRecord {
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
     * 待产记录ID[主键]（每条记录在数据库中的唯一序号）
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
     * 末次月经日期（末次月经首日的公元纪年日期的完整描述）
     */
    @Column(name = "MENSES_LAST_DATE")
    private String mensesLastDate;

    /**
     * 受孕形式代码DIR_CONCEPTION_FORM（受孕采取的形式的分类代码）
     */
    @Column(name = "CONCEPTION_FORM_CODE")
    private String conceptionFormCode;

    /**
     * 受孕形式中文名称（受孕采取的形式的分类中文名称）
     */
    @Column(name = "CONCEPTION_FORM_CN")
    private String conceptionFormCn;

    /**
     * 预产期YYYYMMDD（根据产妇末次月经首日推算的预产期的公元纪年日期的完整描述）
     */
    @Column(name = "EXPECTED_CHILDBIRTH_DATE")
    private String expectedChildbirthDate;

    /**
     * 产前检查标志0否 1是（标识孕期患者是否已进行产前检查的标志）
     */
    @Column(name = "PREGNANCY_EXAM_MARK")
    private String pregnancyExamMark;

    /**
     * 产前检查异常情况（产妇产前检查异常情况的详细描述）
     */
    @Column(name = "PREGNANCY_EXAM_ABNORMAL")
    private String pregnancyExamAbnormal;

    /**
     * 孕前体重（kg）（产妇孕前体重的测量值，计量单位为 kg）
     */
    @Column(name = "PRE_PREGNANT_WEIGHT")
    private BigDecimal prePregnantWeight;

    /**
     * 身高（cm）（产妇身高的测量值，计量单位为 cm）
     */
    @Column(name = "HEIGHT")
    private BigDecimal height;

    /**
     * 产前体重（kg）（产妇产前体重的测量值，计量单位为 kg）
     */
    @Column(name = "ANTENATAL_WEIGHT")
    private BigDecimal antenatalWeight;

    /**
     * 此次妊娠特殊情况（对产妇此次妊娠特殊情况的详细描述）
     */
    @Column(name = "SPEC_PREGNANCY_CASE")
    private String specPregnancyCase;

    /**
     * 既往史（既往健康状况及重要相关病史的描述）
     */
    @Column(name = "DISEASE_HISTORY")
    private String diseaseHistory;

    /**
     * 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    @Column(name = "OPERATION_HISTORY")
    private String operationHistory;

    /**
     * 既往孕产史（对产妇既往孕产史的详细描述）
     */
    @Column(name = "MATERNAL_HISTORY")
    private String maternalHistory;

    /**
     * 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    @Column(name = "SBP")
    private Short sbp;

    /**
     * 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    @Column(name = "DBP")
    private Short dbp;

    /**
     * 体温（℃）（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERTURE")
    private BigDecimal temperture;

    /**
     * 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    @Column(name = "HEART_RATE")
    private Short heartRate;

    /**
     * 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private Short pulses;

    /**
     * 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "BREATHING_RATE")
    private Short breathingRate;

    /**
     * 宫底高度（cm）（患者耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    @Column(name = "UTERUS_HEIGHT")
    private BigDecimal uterusHeight;

    /**
     * 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    @Column(name = "ABDOMINAL_GIRTH")
    private BigDecimal abdominalGirth;

    /**
     * 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    @Column(name = "FETUS_POSITION_CODE")
    private String fetusPositionCode;

    /**
     * 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    @Column(name = "FETUS_POSITION_CN")
    private String fetusPositionCn;

    /**
     * 胎心率（次/min）（每分钟胎儿胎心搏动的次数，计量单位为次/min）
     */
    @Column(name = "FETAL_HEART_RATE")
    private Short fetalHeartRate;

    /**
     * 头位难产情况的评估（对头位难产情况的评估）
     */
    @Column(name = "HEAD_DIFFER_SITUATION_EVA")
    private String headDifferSituationEva;

    /**
     * 出口横径（cm）（产妇出口横径的测量值，计量单位为 cm）
     */
    @Column(name = "TRANSVERSE_QUTLET")
    private BigDecimal transverseQutlet;

    /**
     * 骶耻外径（cm）（产妇第 5 腰椎棘突下至耻骨联合上缘中点距离的测量值,计量单位为 cm）
     */
    @Column(name = "EXTERNAL_CONJUGATE")
    private BigDecimal externalConjugate;

    /**
     * 坐骨结节间径（cm）（产妇两坐骨结节内侧缘的距离的测量值，又称骨盆出口横径，计量单位为 cm）
     */
    @Column(name = "BIISCHIAL_DIAMETER")
    private BigDecimal biischialDiameter;

    /**
     * 宫缩情况（对产妇宫缩强弱、频率、持续时间等情况的详细描述）
     */
    @Column(name = "CONTRACTION_STATE")
    private String contractionState;

    /**
     * 宫颈厚度（产妇宫颈厚度的详细描述）
     */
    @Column(name = "CERVICAL_THICKNESS")
    private String cervicalThickness;

    /**
     * 宫口情况（产妇宫口扩张大小情况的详细描述）
     */
    @Column(name = "PALACE_MOUTH_STATE")
    private String palaceMouthState;

    /**
     * 胎膜情况代码1已破 2未破（产妇胎膜是否已破裂的分类代码）
     */
    @Column(name = "MEMBRANE_CODE")
    private String membraneCode;

    /**
     * 胎膜情况中文名称（产妇胎膜是否已破裂的分类中文名称）
     */
    @Column(name = "MEMBRANE_CN")
    private String membraneCn;

    /**
     * 破膜方式代码DIR_RUPTURE_MEMBRAN_MODE（采用的破膜方式类别的分类代码）
     */
    @Column(name = "RUPTURE_WAY_CODE")
    private String ruptureWayCode;

    /**
     * 破膜方式中文名称（采用的破膜方式类别的分类中文名称）
     */
    @Column(name = "RUPTURE_WAY_CN")
    private String ruptureWayCn;

    /**
     * 先露位置（先露位置的详细描述）
     */
    @Column(name = "PRE_PART_STATION")
    private String prePartStation;

    /**
     * 羊水情况（羊水情况的详细描述）
     */
    @Column(name = "AMNIOTIC_FLUID_STATE")
    private String amnioticFluidState;

    /**
     * 膀胱充盈标志0否 1是（标识膀胱是否充盈的标志）
     */
    @Column(name = "FILLING_BLADDER_MARK")
    private String fillingBladderMark;

    /**
     * 肠胀气标志0否 1是（标识患者是否有肠胀气情况的标志）
     */
    @Column(name = "INTESTINAL_INFLATION_MARK")
    private String intestinalInflationMark;

    /**
     * 检查方式代码DIR_EXAMINE_MODE（待产检查方式的分类代码）
     */
    @Column(name = "EXAM_METHOD_CODE")
    private String examMethodCode;

    /**
     * 检查方式中文名称（待产检查方式的分类中文名称）
     */
    @Column(name = "EXAM_METHOD_CN")
    private String examMethodCn;

    /**
     * 处置计划（对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述）
     */
    @Column(name = "TREATMENT_PLAN")
    private String treatmentPlan;

    /**
     * 计划选取的分娩方式代码CV02.10.003（计划选取的分娩方式类别在特定编码体系中的代码）
     */
    @Column(name = "PLAN_DELIVERY_METHOD")
    private String planDeliveryMethod;

    /**
     * 计划选取的分娩方式名称（计划选取的分娩方式类别在特定编码体系中的名称）
     */
    @Column(name = "PLAN_DELIVERY_METHOD_NAME")
    private String planDeliveryMethodName;

    /**
     * 产程记录日期时间（产程记录完成时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LABOR_RECORD_DATE")
    private String laborRecordDate;

    /**
     * 产程经过（产程经过的详细描述）
     */
    @Column(name = "LABOR_COURSE")
    private String laborCourse;

    /**
     * 产程检查者签名（进行产程记录的检查者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "LABOR_INSPECTOR")
    private String laborInspector;

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
     * 获取待产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DELIVERY_ID - 待产记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置待产记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param deliveryId 待产记录ID[主键]（每条记录在数据库中的唯一序号）
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
     * 获取末次月经日期（末次月经首日的公元纪年日期的完整描述）
     *
     * @return MENSES_LAST_DATE - 末次月经日期（末次月经首日的公元纪年日期的完整描述）
     */
    public String getMensesLastDate() {
        return mensesLastDate;
    }

    /**
     * 设置末次月经日期（末次月经首日的公元纪年日期的完整描述）
     *
     * @param mensesLastDate 末次月经日期（末次月经首日的公元纪年日期的完整描述）
     */
    public void setMensesLastDate(String mensesLastDate) {
        this.mensesLastDate = mensesLastDate == null ? null : mensesLastDate.trim();
    }

    /**
     * 获取受孕形式代码DIR_CONCEPTION_FORM（受孕采取的形式的分类代码）
     *
     * @return CONCEPTION_FORM_CODE - 受孕形式代码DIR_CONCEPTION_FORM（受孕采取的形式的分类代码）
     */
    public String getConceptionFormCode() {
        return conceptionFormCode;
    }

    /**
     * 设置受孕形式代码DIR_CONCEPTION_FORM（受孕采取的形式的分类代码）
     *
     * @param conceptionFormCode 受孕形式代码DIR_CONCEPTION_FORM（受孕采取的形式的分类代码）
     */
    public void setConceptionFormCode(String conceptionFormCode) {
        this.conceptionFormCode = conceptionFormCode == null ? null : conceptionFormCode.trim();
    }

    /**
     * 获取受孕形式中文名称（受孕采取的形式的分类中文名称）
     *
     * @return CONCEPTION_FORM_CN - 受孕形式中文名称（受孕采取的形式的分类中文名称）
     */
    public String getConceptionFormCn() {
        return conceptionFormCn;
    }

    /**
     * 设置受孕形式中文名称（受孕采取的形式的分类中文名称）
     *
     * @param conceptionFormCn 受孕形式中文名称（受孕采取的形式的分类中文名称）
     */
    public void setConceptionFormCn(String conceptionFormCn) {
        this.conceptionFormCn = conceptionFormCn == null ? null : conceptionFormCn.trim();
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
     * 获取产前检查标志0否 1是（标识孕期患者是否已进行产前检查的标志）
     *
     * @return PREGNANCY_EXAM_MARK - 产前检查标志0否 1是（标识孕期患者是否已进行产前检查的标志）
     */
    public String getPregnancyExamMark() {
        return pregnancyExamMark;
    }

    /**
     * 设置产前检查标志0否 1是（标识孕期患者是否已进行产前检查的标志）
     *
     * @param pregnancyExamMark 产前检查标志0否 1是（标识孕期患者是否已进行产前检查的标志）
     */
    public void setPregnancyExamMark(String pregnancyExamMark) {
        this.pregnancyExamMark = pregnancyExamMark == null ? null : pregnancyExamMark.trim();
    }

    /**
     * 获取产前检查异常情况（产妇产前检查异常情况的详细描述）
     *
     * @return PREGNANCY_EXAM_ABNORMAL - 产前检查异常情况（产妇产前检查异常情况的详细描述）
     */
    public String getPregnancyExamAbnormal() {
        return pregnancyExamAbnormal;
    }

    /**
     * 设置产前检查异常情况（产妇产前检查异常情况的详细描述）
     *
     * @param pregnancyExamAbnormal 产前检查异常情况（产妇产前检查异常情况的详细描述）
     */
    public void setPregnancyExamAbnormal(String pregnancyExamAbnormal) {
        this.pregnancyExamAbnormal = pregnancyExamAbnormal == null ? null : pregnancyExamAbnormal.trim();
    }

    /**
     * 获取孕前体重（kg）（产妇孕前体重的测量值，计量单位为 kg）
     *
     * @return PRE_PREGNANT_WEIGHT - 孕前体重（kg）（产妇孕前体重的测量值，计量单位为 kg）
     */
    public BigDecimal getPrePregnantWeight() {
        return prePregnantWeight;
    }

    /**
     * 设置孕前体重（kg）（产妇孕前体重的测量值，计量单位为 kg）
     *
     * @param prePregnantWeight 孕前体重（kg）（产妇孕前体重的测量值，计量单位为 kg）
     */
    public void setPrePregnantWeight(BigDecimal prePregnantWeight) {
        this.prePregnantWeight = prePregnantWeight;
    }

    /**
     * 获取身高（cm）（产妇身高的测量值，计量单位为 cm）
     *
     * @return HEIGHT - 身高（cm）（产妇身高的测量值，计量单位为 cm）
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设置身高（cm）（产妇身高的测量值，计量单位为 cm）
     *
     * @param height 身高（cm）（产妇身高的测量值，计量单位为 cm）
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * 获取产前体重（kg）（产妇产前体重的测量值，计量单位为 kg）
     *
     * @return ANTENATAL_WEIGHT - 产前体重（kg）（产妇产前体重的测量值，计量单位为 kg）
     */
    public BigDecimal getAntenatalWeight() {
        return antenatalWeight;
    }

    /**
     * 设置产前体重（kg）（产妇产前体重的测量值，计量单位为 kg）
     *
     * @param antenatalWeight 产前体重（kg）（产妇产前体重的测量值，计量单位为 kg）
     */
    public void setAntenatalWeight(BigDecimal antenatalWeight) {
        this.antenatalWeight = antenatalWeight;
    }

    /**
     * 获取此次妊娠特殊情况（对产妇此次妊娠特殊情况的详细描述）
     *
     * @return SPEC_PREGNANCY_CASE - 此次妊娠特殊情况（对产妇此次妊娠特殊情况的详细描述）
     */
    public String getSpecPregnancyCase() {
        return specPregnancyCase;
    }

    /**
     * 设置此次妊娠特殊情况（对产妇此次妊娠特殊情况的详细描述）
     *
     * @param specPregnancyCase 此次妊娠特殊情况（对产妇此次妊娠特殊情况的详细描述）
     */
    public void setSpecPregnancyCase(String specPregnancyCase) {
        this.specPregnancyCase = specPregnancyCase == null ? null : specPregnancyCase.trim();
    }

    /**
     * 获取既往史（既往健康状况及重要相关病史的描述）
     *
     * @return DISEASE_HISTORY - 既往史（既往健康状况及重要相关病史的描述）
     */
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    /**
     * 设置既往史（既往健康状况及重要相关病史的描述）
     *
     * @param diseaseHistory 既往史（既往健康状况及重要相关病史的描述）
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
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
     * 获取既往孕产史（对产妇既往孕产史的详细描述）
     *
     * @return MATERNAL_HISTORY - 既往孕产史（对产妇既往孕产史的详细描述）
     */
    public String getMaternalHistory() {
        return maternalHistory;
    }

    /**
     * 设置既往孕产史（对产妇既往孕产史的详细描述）
     *
     * @param maternalHistory 既往孕产史（对产妇既往孕产史的详细描述）
     */
    public void setMaternalHistory(String maternalHistory) {
        this.maternalHistory = maternalHistory == null ? null : maternalHistory.trim();
    }

    /**
     * 获取收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @return SBP - 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public Short getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @param sbp 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public void setSbp(Short sbp) {
        this.sbp = sbp;
    }

    /**
     * 获取舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @return DBP - 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public Short getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @param dbp 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public void setDbp(Short dbp) {
        this.dbp = dbp;
    }

    /**
     * 获取体温（℃）（体温的测量值，计量单位为℃）
     *
     * @return TEMPERTURE - 体温（℃）（体温的测量值，计量单位为℃）
     */
    public BigDecimal getTemperture() {
        return temperture;
    }

    /**
     * 设置体温（℃）（体温的测量值，计量单位为℃）
     *
     * @param temperture 体温（℃）（体温的测量值，计量单位为℃）
     */
    public void setTemperture(BigDecimal temperture) {
        this.temperture = temperture;
    }

    /**
     * 获取心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     *
     * @return HEART_RATE - 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    public Short getHeartRate() {
        return heartRate;
    }

    /**
     * 设置心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     *
     * @param heartRate 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    public void setHeartRate(Short heartRate) {
        this.heartRate = heartRate;
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
     * 获取宫底高度（cm）（患者耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     *
     * @return UTERUS_HEIGHT - 宫底高度（cm）（患者耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    public BigDecimal getUterusHeight() {
        return uterusHeight;
    }

    /**
     * 设置宫底高度（cm）（患者耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     *
     * @param uterusHeight 宫底高度（cm）（患者耻骨联合上缘至子宫底部距离的测量值，计量单位为 cm）
     */
    public void setUterusHeight(BigDecimal uterusHeight) {
        this.uterusHeight = uterusHeight;
    }

    /**
     * 获取腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     *
     * @return ABDOMINAL_GIRTH - 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    public BigDecimal getAbdominalGirth() {
        return abdominalGirth;
    }

    /**
     * 设置腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     *
     * @param abdominalGirth 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    public void setAbdominalGirth(BigDecimal abdominalGirth) {
        this.abdominalGirth = abdominalGirth;
    }

    /**
     * 获取胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     *
     * @return FETUS_POSITION_CODE - 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    public String getFetusPositionCode() {
        return fetusPositionCode;
    }

    /**
     * 设置胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     *
     * @param fetusPositionCode 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    public void setFetusPositionCode(String fetusPositionCode) {
        this.fetusPositionCode = fetusPositionCode == null ? null : fetusPositionCode.trim();
    }

    /**
     * 获取胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     *
     * @return FETUS_POSITION_CN - 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    public String getFetusPositionCn() {
        return fetusPositionCn;
    }

    /**
     * 设置胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     *
     * @param fetusPositionCn 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    public void setFetusPositionCn(String fetusPositionCn) {
        this.fetusPositionCn = fetusPositionCn == null ? null : fetusPositionCn.trim();
    }

    /**
     * 获取胎心率（次/min）（每分钟胎儿胎心搏动的次数，计量单位为次/min）
     *
     * @return FETAL_HEART_RATE - 胎心率（次/min）（每分钟胎儿胎心搏动的次数，计量单位为次/min）
     */
    public Short getFetalHeartRate() {
        return fetalHeartRate;
    }

    /**
     * 设置胎心率（次/min）（每分钟胎儿胎心搏动的次数，计量单位为次/min）
     *
     * @param fetalHeartRate 胎心率（次/min）（每分钟胎儿胎心搏动的次数，计量单位为次/min）
     */
    public void setFetalHeartRate(Short fetalHeartRate) {
        this.fetalHeartRate = fetalHeartRate;
    }

    /**
     * 获取头位难产情况的评估（对头位难产情况的评估）
     *
     * @return HEAD_DIFFER_SITUATION_EVA - 头位难产情况的评估（对头位难产情况的评估）
     */
    public String getHeadDifferSituationEva() {
        return headDifferSituationEva;
    }

    /**
     * 设置头位难产情况的评估（对头位难产情况的评估）
     *
     * @param headDifferSituationEva 头位难产情况的评估（对头位难产情况的评估）
     */
    public void setHeadDifferSituationEva(String headDifferSituationEva) {
        this.headDifferSituationEva = headDifferSituationEva == null ? null : headDifferSituationEva.trim();
    }

    /**
     * 获取出口横径（cm）（产妇出口横径的测量值，计量单位为 cm）
     *
     * @return TRANSVERSE_QUTLET - 出口横径（cm）（产妇出口横径的测量值，计量单位为 cm）
     */
    public BigDecimal getTransverseQutlet() {
        return transverseQutlet;
    }

    /**
     * 设置出口横径（cm）（产妇出口横径的测量值，计量单位为 cm）
     *
     * @param transverseQutlet 出口横径（cm）（产妇出口横径的测量值，计量单位为 cm）
     */
    public void setTransverseQutlet(BigDecimal transverseQutlet) {
        this.transverseQutlet = transverseQutlet;
    }

    /**
     * 获取骶耻外径（cm）（产妇第 5 腰椎棘突下至耻骨联合上缘中点距离的测量值,计量单位为 cm）
     *
     * @return EXTERNAL_CONJUGATE - 骶耻外径（cm）（产妇第 5 腰椎棘突下至耻骨联合上缘中点距离的测量值,计量单位为 cm）
     */
    public BigDecimal getExternalConjugate() {
        return externalConjugate;
    }

    /**
     * 设置骶耻外径（cm）（产妇第 5 腰椎棘突下至耻骨联合上缘中点距离的测量值,计量单位为 cm）
     *
     * @param externalConjugate 骶耻外径（cm）（产妇第 5 腰椎棘突下至耻骨联合上缘中点距离的测量值,计量单位为 cm）
     */
    public void setExternalConjugate(BigDecimal externalConjugate) {
        this.externalConjugate = externalConjugate;
    }

    /**
     * 获取坐骨结节间径（cm）（产妇两坐骨结节内侧缘的距离的测量值，又称骨盆出口横径，计量单位为 cm）
     *
     * @return BIISCHIAL_DIAMETER - 坐骨结节间径（cm）（产妇两坐骨结节内侧缘的距离的测量值，又称骨盆出口横径，计量单位为 cm）
     */
    public BigDecimal getBiischialDiameter() {
        return biischialDiameter;
    }

    /**
     * 设置坐骨结节间径（cm）（产妇两坐骨结节内侧缘的距离的测量值，又称骨盆出口横径，计量单位为 cm）
     *
     * @param biischialDiameter 坐骨结节间径（cm）（产妇两坐骨结节内侧缘的距离的测量值，又称骨盆出口横径，计量单位为 cm）
     */
    public void setBiischialDiameter(BigDecimal biischialDiameter) {
        this.biischialDiameter = biischialDiameter;
    }

    /**
     * 获取宫缩情况（对产妇宫缩强弱、频率、持续时间等情况的详细描述）
     *
     * @return CONTRACTION_STATE - 宫缩情况（对产妇宫缩强弱、频率、持续时间等情况的详细描述）
     */
    public String getContractionState() {
        return contractionState;
    }

    /**
     * 设置宫缩情况（对产妇宫缩强弱、频率、持续时间等情况的详细描述）
     *
     * @param contractionState 宫缩情况（对产妇宫缩强弱、频率、持续时间等情况的详细描述）
     */
    public void setContractionState(String contractionState) {
        this.contractionState = contractionState == null ? null : contractionState.trim();
    }

    /**
     * 获取宫颈厚度（产妇宫颈厚度的详细描述）
     *
     * @return CERVICAL_THICKNESS - 宫颈厚度（产妇宫颈厚度的详细描述）
     */
    public String getCervicalThickness() {
        return cervicalThickness;
    }

    /**
     * 设置宫颈厚度（产妇宫颈厚度的详细描述）
     *
     * @param cervicalThickness 宫颈厚度（产妇宫颈厚度的详细描述）
     */
    public void setCervicalThickness(String cervicalThickness) {
        this.cervicalThickness = cervicalThickness == null ? null : cervicalThickness.trim();
    }

    /**
     * 获取宫口情况（产妇宫口扩张大小情况的详细描述）
     *
     * @return PALACE_MOUTH_STATE - 宫口情况（产妇宫口扩张大小情况的详细描述）
     */
    public String getPalaceMouthState() {
        return palaceMouthState;
    }

    /**
     * 设置宫口情况（产妇宫口扩张大小情况的详细描述）
     *
     * @param palaceMouthState 宫口情况（产妇宫口扩张大小情况的详细描述）
     */
    public void setPalaceMouthState(String palaceMouthState) {
        this.palaceMouthState = palaceMouthState == null ? null : palaceMouthState.trim();
    }

    /**
     * 获取胎膜情况代码1已破 2未破（产妇胎膜是否已破裂的分类代码）
     *
     * @return MEMBRANE_CODE - 胎膜情况代码1已破 2未破（产妇胎膜是否已破裂的分类代码）
     */
    public String getMembraneCode() {
        return membraneCode;
    }

    /**
     * 设置胎膜情况代码1已破 2未破（产妇胎膜是否已破裂的分类代码）
     *
     * @param membraneCode 胎膜情况代码1已破 2未破（产妇胎膜是否已破裂的分类代码）
     */
    public void setMembraneCode(String membraneCode) {
        this.membraneCode = membraneCode == null ? null : membraneCode.trim();
    }

    /**
     * 获取胎膜情况中文名称（产妇胎膜是否已破裂的分类中文名称）
     *
     * @return MEMBRANE_CN - 胎膜情况中文名称（产妇胎膜是否已破裂的分类中文名称）
     */
    public String getMembraneCn() {
        return membraneCn;
    }

    /**
     * 设置胎膜情况中文名称（产妇胎膜是否已破裂的分类中文名称）
     *
     * @param membraneCn 胎膜情况中文名称（产妇胎膜是否已破裂的分类中文名称）
     */
    public void setMembraneCn(String membraneCn) {
        this.membraneCn = membraneCn == null ? null : membraneCn.trim();
    }

    /**
     * 获取破膜方式代码DIR_RUPTURE_MEMBRAN_MODE（采用的破膜方式类别的分类代码）
     *
     * @return RUPTURE_WAY_CODE - 破膜方式代码DIR_RUPTURE_MEMBRAN_MODE（采用的破膜方式类别的分类代码）
     */
    public String getRuptureWayCode() {
        return ruptureWayCode;
    }

    /**
     * 设置破膜方式代码DIR_RUPTURE_MEMBRAN_MODE（采用的破膜方式类别的分类代码）
     *
     * @param ruptureWayCode 破膜方式代码DIR_RUPTURE_MEMBRAN_MODE（采用的破膜方式类别的分类代码）
     */
    public void setRuptureWayCode(String ruptureWayCode) {
        this.ruptureWayCode = ruptureWayCode == null ? null : ruptureWayCode.trim();
    }

    /**
     * 获取破膜方式中文名称（采用的破膜方式类别的分类中文名称）
     *
     * @return RUPTURE_WAY_CN - 破膜方式中文名称（采用的破膜方式类别的分类中文名称）
     */
    public String getRuptureWayCn() {
        return ruptureWayCn;
    }

    /**
     * 设置破膜方式中文名称（采用的破膜方式类别的分类中文名称）
     *
     * @param ruptureWayCn 破膜方式中文名称（采用的破膜方式类别的分类中文名称）
     */
    public void setRuptureWayCn(String ruptureWayCn) {
        this.ruptureWayCn = ruptureWayCn == null ? null : ruptureWayCn.trim();
    }

    /**
     * 获取先露位置（先露位置的详细描述）
     *
     * @return PRE_PART_STATION - 先露位置（先露位置的详细描述）
     */
    public String getPrePartStation() {
        return prePartStation;
    }

    /**
     * 设置先露位置（先露位置的详细描述）
     *
     * @param prePartStation 先露位置（先露位置的详细描述）
     */
    public void setPrePartStation(String prePartStation) {
        this.prePartStation = prePartStation == null ? null : prePartStation.trim();
    }

    /**
     * 获取羊水情况（羊水情况的详细描述）
     *
     * @return AMNIOTIC_FLUID_STATE - 羊水情况（羊水情况的详细描述）
     */
    public String getAmnioticFluidState() {
        return amnioticFluidState;
    }

    /**
     * 设置羊水情况（羊水情况的详细描述）
     *
     * @param amnioticFluidState 羊水情况（羊水情况的详细描述）
     */
    public void setAmnioticFluidState(String amnioticFluidState) {
        this.amnioticFluidState = amnioticFluidState == null ? null : amnioticFluidState.trim();
    }

    /**
     * 获取膀胱充盈标志0否 1是（标识膀胱是否充盈的标志）
     *
     * @return FILLING_BLADDER_MARK - 膀胱充盈标志0否 1是（标识膀胱是否充盈的标志）
     */
    public String getFillingBladderMark() {
        return fillingBladderMark;
    }

    /**
     * 设置膀胱充盈标志0否 1是（标识膀胱是否充盈的标志）
     *
     * @param fillingBladderMark 膀胱充盈标志0否 1是（标识膀胱是否充盈的标志）
     */
    public void setFillingBladderMark(String fillingBladderMark) {
        this.fillingBladderMark = fillingBladderMark == null ? null : fillingBladderMark.trim();
    }

    /**
     * 获取肠胀气标志0否 1是（标识患者是否有肠胀气情况的标志）
     *
     * @return INTESTINAL_INFLATION_MARK - 肠胀气标志0否 1是（标识患者是否有肠胀气情况的标志）
     */
    public String getIntestinalInflationMark() {
        return intestinalInflationMark;
    }

    /**
     * 设置肠胀气标志0否 1是（标识患者是否有肠胀气情况的标志）
     *
     * @param intestinalInflationMark 肠胀气标志0否 1是（标识患者是否有肠胀气情况的标志）
     */
    public void setIntestinalInflationMark(String intestinalInflationMark) {
        this.intestinalInflationMark = intestinalInflationMark == null ? null : intestinalInflationMark.trim();
    }

    /**
     * 获取检查方式代码DIR_EXAMINE_MODE（待产检查方式的分类代码）
     *
     * @return EXAM_METHOD_CODE - 检查方式代码DIR_EXAMINE_MODE（待产检查方式的分类代码）
     */
    public String getExamMethodCode() {
        return examMethodCode;
    }

    /**
     * 设置检查方式代码DIR_EXAMINE_MODE（待产检查方式的分类代码）
     *
     * @param examMethodCode 检查方式代码DIR_EXAMINE_MODE（待产检查方式的分类代码）
     */
    public void setExamMethodCode(String examMethodCode) {
        this.examMethodCode = examMethodCode == null ? null : examMethodCode.trim();
    }

    /**
     * 获取检查方式中文名称（待产检查方式的分类中文名称）
     *
     * @return EXAM_METHOD_CN - 检查方式中文名称（待产检查方式的分类中文名称）
     */
    public String getExamMethodCn() {
        return examMethodCn;
    }

    /**
     * 设置检查方式中文名称（待产检查方式的分类中文名称）
     *
     * @param examMethodCn 检查方式中文名称（待产检查方式的分类中文名称）
     */
    public void setExamMethodCn(String examMethodCn) {
        this.examMethodCn = examMethodCn == null ? null : examMethodCn.trim();
    }

    /**
     * 获取处置计划（对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述）
     *
     * @return TREATMENT_PLAN - 处置计划（对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述）
     */
    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    /**
     * 设置处置计划（对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述）
     *
     * @param treatmentPlan 处置计划（对产妇情况进行综合评估的基础上，为其制定的处置计划的详细描述）
     */
    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan == null ? null : treatmentPlan.trim();
    }

    /**
     * 获取计划选取的分娩方式代码CV02.10.003（计划选取的分娩方式类别在特定编码体系中的代码）
     *
     * @return PLAN_DELIVERY_METHOD - 计划选取的分娩方式代码CV02.10.003（计划选取的分娩方式类别在特定编码体系中的代码）
     */
    public String getPlanDeliveryMethod() {
        return planDeliveryMethod;
    }

    /**
     * 设置计划选取的分娩方式代码CV02.10.003（计划选取的分娩方式类别在特定编码体系中的代码）
     *
     * @param planDeliveryMethod 计划选取的分娩方式代码CV02.10.003（计划选取的分娩方式类别在特定编码体系中的代码）
     */
    public void setPlanDeliveryMethod(String planDeliveryMethod) {
        this.planDeliveryMethod = planDeliveryMethod == null ? null : planDeliveryMethod.trim();
    }

    /**
     * 获取计划选取的分娩方式名称（计划选取的分娩方式类别在特定编码体系中的名称）
     *
     * @return PLAN_DELIVERY_METHOD_NAME - 计划选取的分娩方式名称（计划选取的分娩方式类别在特定编码体系中的名称）
     */
    public String getPlanDeliveryMethodName() {
        return planDeliveryMethodName;
    }

    /**
     * 设置计划选取的分娩方式名称（计划选取的分娩方式类别在特定编码体系中的名称）
     *
     * @param planDeliveryMethodName 计划选取的分娩方式名称（计划选取的分娩方式类别在特定编码体系中的名称）
     */
    public void setPlanDeliveryMethodName(String planDeliveryMethodName) {
        this.planDeliveryMethodName = planDeliveryMethodName == null ? null : planDeliveryMethodName.trim();
    }

    /**
     * 获取产程记录日期时间（产程记录完成时的公元纪年日期和时间的完整描述）
     *
     * @return LABOR_RECORD_DATE - 产程记录日期时间（产程记录完成时的公元纪年日期和时间的完整描述）
     */
    public String getLaborRecordDate() {
        return laborRecordDate;
    }

    /**
     * 设置产程记录日期时间（产程记录完成时的公元纪年日期和时间的完整描述）
     *
     * @param laborRecordDate 产程记录日期时间（产程记录完成时的公元纪年日期和时间的完整描述）
     */
    public void setLaborRecordDate(String laborRecordDate) {
        this.laborRecordDate = laborRecordDate == null ? null : laborRecordDate.trim();
    }

    /**
     * 获取产程经过（产程经过的详细描述）
     *
     * @return LABOR_COURSE - 产程经过（产程经过的详细描述）
     */
    public String getLaborCourse() {
        return laborCourse;
    }

    /**
     * 设置产程经过（产程经过的详细描述）
     *
     * @param laborCourse 产程经过（产程经过的详细描述）
     */
    public void setLaborCourse(String laborCourse) {
        this.laborCourse = laborCourse == null ? null : laborCourse.trim();
    }

    /**
     * 获取产程检查者签名（进行产程记录的检查者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return LABOR_INSPECTOR - 产程检查者签名（进行产程记录的检查者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getLaborInspector() {
        return laborInspector;
    }

    /**
     * 设置产程检查者签名（进行产程记录的检查者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param laborInspector 产程检查者签名（进行产程记录的检查者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setLaborInspector(String laborInspector) {
        this.laborInspector = laborInspector == null ? null : laborInspector.trim();
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