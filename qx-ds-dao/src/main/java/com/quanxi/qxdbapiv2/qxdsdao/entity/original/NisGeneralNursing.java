package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "NIS_GENERAL_NURSING")
public class NisGeneralNursing {
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
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "GENERAL_NURSING_ID")
    private String generalNursingId;

    /**
     * 护理报告ID（对应一次护理报告唯一ID）
     */
    @Id
    @Column(name = "REPORT_ID")
    private String reportId;

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
     * 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    @Column(name = "NURSIING_GRADE_CODE")
    private String nursiingGradeCode;

    /**
     * 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    @Column(name = "NURSIING_GRADE_NAME")
    private String nursiingGradeName;

    /**
     * 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    @Column(name = "NURSING_TYPE_CODE")
    private String nursingTypeCode;

    /**
     * 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    @Column(name = "NURSING_TYPE_NAME")
    private String nursingTypeName;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 体重（kg）（患者体重的测量值，计量单位为 kg）
     */
    @Column(name = "WEIGHT")
    private String weight;

    /**
     * 体温（℃）（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERATURE")
    private String temperature;

    /**
     * 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "BREATHING_RATE")
    private String breathingRate;

    /**
     * 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private String pulses;

    /**
     * 收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    @Column(name = "SBP")
    private String sbp;

    /**
     * 舒张压（产后舒张压的测量值，计量单位为 mmHg）
     */
    @Column(name = "DBP")
    private String dbp;

    /**
     * 血氧饱和度（%）（脉搏血氧饱和度的测量值，计量单位为%）
     */
    @Column(name = "OXYGEN_SATURATION")
    private String oxygenSaturation;

    /**
     * 足背动脉搏动标志0否 1是（标识患者是否存在足背动脉搏动的标志）
     */
    @Column(name = "POFDA_MARK")
    private String pofdaMark;

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
     * 导管护理描述（对患者进行导管护理的详细描述）
     */
    @Column(name = "CATHETER_NURSING_DESC")
    private String catheterNursingDesc;

    /**
     * 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    @Column(name = "TRACHEA_NURING_CODE")
    private String tracheaNuringCode;

    /**
     * 气管护理名称（气管护理类别的分类名称）
     */
    @Column(name = "TRACHEA_NURING_NAME")
    private String tracheaNuringName;

    /**
     * 体位护理（标识体位护理的描述）
     */
    @Column(name = "POSITION_NURSING")
    private String positionNursing;

    /**
     * 皮肤护理（对患者进行皮肤护理的描述）
     */
    @Column(name = "SKIN_NURING")
    private String skinNuring;

    /**
     * 营养护理（营养护理的描述）
     */
    @Column(name = "NUTRITION_NURSING")
    private String nutritionNursing;

    /**
     * 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    @Column(name = "DIET_GUIDE_CODE")
    private String dietGuideCode;

    /**
     * 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    @Column(name = "DIET_GUIDE_NAME")
    private String dietGuideName;

    /**
     * 心理护理代码DIR_PSYCHOLOGICAL_NURSING（心理护理类别的分类代码）
     */
    @Column(name = "MENTAL_NURING_CODE")
    private String mentalNuringCode;

    /**
     * 心理护理名称（心理护理类别的分类名称）
     */
    @Column(name = "MENTAL_NURING_NAME")
    private String mentalNuringName;

    /**
     * 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    @Column(name = "SAFETY_NURING_CODE")
    private String safetyNuringCode;

    /**
     * 安全护理名称（安全护理类别的分类名称）
     */
    @Column(name = "SAFETY_NURIN_NAME")
    private String safetyNurinName;

    /**
     * 简要病情（对病人简要病情的描述）
     */
    @Column(name = "BRIEF_DISEASE")
    private String briefDisease;

    /**
     * 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    @Column(name = "NURING_OBS_ITEM_NAME")
    private String nuringObsItemName;

    /**
     * 护理观察结果（对护理观察项目结果的详细描述）
     */
    @Column(name = "NURING_OBS_RESULT")
    private String nuringObsResult;

    /**
     * 护理操作项目类目名称（多个护理操作项目的名称）
     */
    @Column(name = "NURING_PRO_ITEM_NAME")
    private String nuringProItemName;

    /**
     * 护理操作名称（进行护理操作的具体名称）
     */
    @Column(name = "NURING_PRO_NAME")
    private String nuringProName;

    /**
     * 护理操作结果（多个护理操作结果的详细描述）
     */
    @Column(name = "NURING_PRO_RESULT")
    private String nuringProResult;

    /**
     * 发出手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术安全核对表的标志）
     */
    @Column(name = "SEND_OP_SAFE_CHK_MARK")
    private String sendOpSafeChkMark;

    /**
     * 收回手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术安全核对表的标志）
     */
    @Column(name = "BACK_OP_SAFE_CHK_MARK")
    private String backOpSafeChkMark;

    /**
     * 发出手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术风险评估表的标志）
     */
    @Column(name = "SEND_OP_RISK_EVA_MARK")
    private String sendOpRiskEvaMark;

    /**
     * 收回手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术风险评估表的标志）
     */
    @Column(name = "BACK_OP_RISK_EVA_MARK")
    private String backOpRiskEvaMark;

    /**
     * 隔离标志0否 1是（标识对患者是否采取隔离措施的标志）
     */
    @Column(name = "ISOLATED_MARK")
    private String isolatedMark;

    /**
     * 隔离种类代码CV06.00.222（对患者采取的隔离种类在特定编码体系中的代码）
     */
    @Column(name = "ISOLATED_CLASS_CODE")
    private String isolatedClassCode;

    /**
     * 隔离种类名称（对患者采取的隔离种类在特定编码体系中的名称）
     */
    @Column(name = "ISOLATED_CLASS_NAME")
    private String isolatedClassName;

    /**
     * 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NURSE_SIGNATURE")
    private String nurseSignature;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

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
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return GENERAL_NURSING_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getGeneralNursingId() {
        return generalNursingId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param generalNursingId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setGeneralNursingId(String generalNursingId) {
        this.generalNursingId = generalNursingId == null ? null : generalNursingId.trim();
    }

    /**
     * 获取护理报告ID（对应一次护理报告唯一ID）
     *
     * @return REPORT_ID - 护理报告ID（对应一次护理报告唯一ID）
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设置护理报告ID（对应一次护理报告唯一ID）
     *
     * @param reportId 护理报告ID（对应一次护理报告唯一ID）
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
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
     * 获取疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return DIAGNOSIS_CODE - 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param diagnosisCode 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @param diagnosisName 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     *
     * @return NURSIING_GRADE_CODE - 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    public String getNursiingGradeCode() {
        return nursiingGradeCode;
    }

    /**
     * 设置护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     *
     * @param nursiingGradeCode 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    public void setNursiingGradeCode(String nursiingGradeCode) {
        this.nursiingGradeCode = nursiingGradeCode == null ? null : nursiingGradeCode.trim();
    }

    /**
     * 获取护理等级名称（护理级别的分类在特定编码体系中的名称）
     *
     * @return NURSIING_GRADE_NAME - 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    public String getNursiingGradeName() {
        return nursiingGradeName;
    }

    /**
     * 设置护理等级名称（护理级别的分类在特定编码体系中的名称）
     *
     * @param nursiingGradeName 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    public void setNursiingGradeName(String nursiingGradeName) {
        this.nursiingGradeName = nursiingGradeName == null ? null : nursiingGradeName.trim();
    }

    /**
     * 获取护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     *
     * @return NURSING_TYPE_CODE - 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    public String getNursingTypeCode() {
        return nursingTypeCode;
    }

    /**
     * 设置护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     *
     * @param nursingTypeCode 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    public void setNursingTypeCode(String nursingTypeCode) {
        this.nursingTypeCode = nursingTypeCode == null ? null : nursingTypeCode.trim();
    }

    /**
     * 获取护理类型名称（护理类型的分类在特定编码体系中的名称）
     *
     * @return NURSING_TYPE_NAME - 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    public String getNursingTypeName() {
        return nursingTypeName;
    }

    /**
     * 设置护理类型名称（护理类型的分类在特定编码体系中的名称）
     *
     * @param nursingTypeName 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    public void setNursingTypeName(String nursingTypeName) {
        this.nursingTypeName = nursingTypeName == null ? null : nursingTypeName.trim();
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
     * 获取体重（kg）（患者体重的测量值，计量单位为 kg）
     *
     * @return WEIGHT - 体重（kg）（患者体重的测量值，计量单位为 kg）
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置体重（kg）（患者体重的测量值，计量单位为 kg）
     *
     * @param weight 体重（kg）（患者体重的测量值，计量单位为 kg）
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 获取体温（℃）（体温的测量值，计量单位为℃）
     *
     * @return TEMPERATURE - 体温（℃）（体温的测量值，计量单位为℃）
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 设置体温（℃）（体温的测量值，计量单位为℃）
     *
     * @param temperature 体温（℃）（体温的测量值，计量单位为℃）
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    /**
     * 获取呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @return BREATHING_RATE - 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public String getBreathingRate() {
        return breathingRate;
    }

    /**
     * 设置呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @param breathingRate 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public void setBreathingRate(String breathingRate) {
        this.breathingRate = breathingRate == null ? null : breathingRate.trim();
    }

    /**
     * 获取脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @return PULSES - 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public String getPulses() {
        return pulses;
    }

    /**
     * 设置脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @param pulses 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public void setPulses(String pulses) {
        this.pulses = pulses == null ? null : pulses.trim();
    }

    /**
     * 获取收缩压（产后收缩压的测量值，计量单位为 mmHg）
     *
     * @return SBP - 收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    public String getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压（产后收缩压的测量值，计量单位为 mmHg）
     *
     * @param sbp 收缩压（产后收缩压的测量值，计量单位为 mmHg）
     */
    public void setSbp(String sbp) {
        this.sbp = sbp == null ? null : sbp.trim();
    }

    /**
     * 获取舒张压（产后舒张压的测量值，计量单位为 mmHg）
     *
     * @return DBP - 舒张压（产后舒张压的测量值，计量单位为 mmHg）
     */
    public String getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压（产后舒张压的测量值，计量单位为 mmHg）
     *
     * @param dbp 舒张压（产后舒张压的测量值，计量单位为 mmHg）
     */
    public void setDbp(String dbp) {
        this.dbp = dbp == null ? null : dbp.trim();
    }

    /**
     * 获取血氧饱和度（%）（脉搏血氧饱和度的测量值，计量单位为%）
     *
     * @return OXYGEN_SATURATION - 血氧饱和度（%）（脉搏血氧饱和度的测量值，计量单位为%）
     */
    public String getOxygenSaturation() {
        return oxygenSaturation;
    }

    /**
     * 设置血氧饱和度（%）（脉搏血氧饱和度的测量值，计量单位为%）
     *
     * @param oxygenSaturation 血氧饱和度（%）（脉搏血氧饱和度的测量值，计量单位为%）
     */
    public void setOxygenSaturation(String oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation == null ? null : oxygenSaturation.trim();
    }

    /**
     * 获取足背动脉搏动标志0否 1是（标识患者是否存在足背动脉搏动的标志）
     *
     * @return POFDA_MARK - 足背动脉搏动标志0否 1是（标识患者是否存在足背动脉搏动的标志）
     */
    public String getPofdaMark() {
        return pofdaMark;
    }

    /**
     * 设置足背动脉搏动标志0否 1是（标识患者是否存在足背动脉搏动的标志）
     *
     * @param pofdaMark 足背动脉搏动标志0否 1是（标识患者是否存在足背动脉搏动的标志）
     */
    public void setPofdaMark(String pofdaMark) {
        this.pofdaMark = pofdaMark == null ? null : pofdaMark.trim();
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
     * 获取导管护理描述（对患者进行导管护理的详细描述）
     *
     * @return CATHETER_NURSING_DESC - 导管护理描述（对患者进行导管护理的详细描述）
     */
    public String getCatheterNursingDesc() {
        return catheterNursingDesc;
    }

    /**
     * 设置导管护理描述（对患者进行导管护理的详细描述）
     *
     * @param catheterNursingDesc 导管护理描述（对患者进行导管护理的详细描述）
     */
    public void setCatheterNursingDesc(String catheterNursingDesc) {
        this.catheterNursingDesc = catheterNursingDesc == null ? null : catheterNursingDesc.trim();
    }

    /**
     * 获取气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     *
     * @return TRACHEA_NURING_CODE - 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    public String getTracheaNuringCode() {
        return tracheaNuringCode;
    }

    /**
     * 设置气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     *
     * @param tracheaNuringCode 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    public void setTracheaNuringCode(String tracheaNuringCode) {
        this.tracheaNuringCode = tracheaNuringCode == null ? null : tracheaNuringCode.trim();
    }

    /**
     * 获取气管护理名称（气管护理类别的分类名称）
     *
     * @return TRACHEA_NURING_NAME - 气管护理名称（气管护理类别的分类名称）
     */
    public String getTracheaNuringName() {
        return tracheaNuringName;
    }

    /**
     * 设置气管护理名称（气管护理类别的分类名称）
     *
     * @param tracheaNuringName 气管护理名称（气管护理类别的分类名称）
     */
    public void setTracheaNuringName(String tracheaNuringName) {
        this.tracheaNuringName = tracheaNuringName == null ? null : tracheaNuringName.trim();
    }

    /**
     * 获取体位护理（标识体位护理的描述）
     *
     * @return POSITION_NURSING - 体位护理（标识体位护理的描述）
     */
    public String getPositionNursing() {
        return positionNursing;
    }

    /**
     * 设置体位护理（标识体位护理的描述）
     *
     * @param positionNursing 体位护理（标识体位护理的描述）
     */
    public void setPositionNursing(String positionNursing) {
        this.positionNursing = positionNursing == null ? null : positionNursing.trim();
    }

    /**
     * 获取皮肤护理（对患者进行皮肤护理的描述）
     *
     * @return SKIN_NURING - 皮肤护理（对患者进行皮肤护理的描述）
     */
    public String getSkinNuring() {
        return skinNuring;
    }

    /**
     * 设置皮肤护理（对患者进行皮肤护理的描述）
     *
     * @param skinNuring 皮肤护理（对患者进行皮肤护理的描述）
     */
    public void setSkinNuring(String skinNuring) {
        this.skinNuring = skinNuring == null ? null : skinNuring.trim();
    }

    /**
     * 获取营养护理（营养护理的描述）
     *
     * @return NUTRITION_NURSING - 营养护理（营养护理的描述）
     */
    public String getNutritionNursing() {
        return nutritionNursing;
    }

    /**
     * 设置营养护理（营养护理的描述）
     *
     * @param nutritionNursing 营养护理（营养护理的描述）
     */
    public void setNutritionNursing(String nutritionNursing) {
        this.nutritionNursing = nutritionNursing == null ? null : nutritionNursing.trim();
    }

    /**
     * 获取饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     *
     * @return DIET_GUIDE_CODE - 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    public String getDietGuideCode() {
        return dietGuideCode;
    }

    /**
     * 设置饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     *
     * @param dietGuideCode 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    public void setDietGuideCode(String dietGuideCode) {
        this.dietGuideCode = dietGuideCode == null ? null : dietGuideCode.trim();
    }

    /**
     * 获取饮食指导名称（饮食指导类别在特定编码体系中的名称）
     *
     * @return DIET_GUIDE_NAME - 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    public String getDietGuideName() {
        return dietGuideName;
    }

    /**
     * 设置饮食指导名称（饮食指导类别在特定编码体系中的名称）
     *
     * @param dietGuideName 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    public void setDietGuideName(String dietGuideName) {
        this.dietGuideName = dietGuideName == null ? null : dietGuideName.trim();
    }

    /**
     * 获取心理护理代码DIR_PSYCHOLOGICAL_NURSING（心理护理类别的分类代码）
     *
     * @return MENTAL_NURING_CODE - 心理护理代码DIR_PSYCHOLOGICAL_NURSING（心理护理类别的分类代码）
     */
    public String getMentalNuringCode() {
        return mentalNuringCode;
    }

    /**
     * 设置心理护理代码DIR_PSYCHOLOGICAL_NURSING（心理护理类别的分类代码）
     *
     * @param mentalNuringCode 心理护理代码DIR_PSYCHOLOGICAL_NURSING（心理护理类别的分类代码）
     */
    public void setMentalNuringCode(String mentalNuringCode) {
        this.mentalNuringCode = mentalNuringCode == null ? null : mentalNuringCode.trim();
    }

    /**
     * 获取心理护理名称（心理护理类别的分类名称）
     *
     * @return MENTAL_NURING_NAME - 心理护理名称（心理护理类别的分类名称）
     */
    public String getMentalNuringName() {
        return mentalNuringName;
    }

    /**
     * 设置心理护理名称（心理护理类别的分类名称）
     *
     * @param mentalNuringName 心理护理名称（心理护理类别的分类名称）
     */
    public void setMentalNuringName(String mentalNuringName) {
        this.mentalNuringName = mentalNuringName == null ? null : mentalNuringName.trim();
    }

    /**
     * 获取安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     *
     * @return SAFETY_NURING_CODE - 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    public String getSafetyNuringCode() {
        return safetyNuringCode;
    }

    /**
     * 设置安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     *
     * @param safetyNuringCode 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    public void setSafetyNuringCode(String safetyNuringCode) {
        this.safetyNuringCode = safetyNuringCode == null ? null : safetyNuringCode.trim();
    }

    /**
     * 获取安全护理名称（安全护理类别的分类名称）
     *
     * @return SAFETY_NURIN_NAME - 安全护理名称（安全护理类别的分类名称）
     */
    public String getSafetyNurinName() {
        return safetyNurinName;
    }

    /**
     * 设置安全护理名称（安全护理类别的分类名称）
     *
     * @param safetyNurinName 安全护理名称（安全护理类别的分类名称）
     */
    public void setSafetyNurinName(String safetyNurinName) {
        this.safetyNurinName = safetyNurinName == null ? null : safetyNurinName.trim();
    }

    /**
     * 获取简要病情（对病人简要病情的描述）
     *
     * @return BRIEF_DISEASE - 简要病情（对病人简要病情的描述）
     */
    public String getBriefDisease() {
        return briefDisease;
    }

    /**
     * 设置简要病情（对病人简要病情的描述）
     *
     * @param briefDisease 简要病情（对病人简要病情的描述）
     */
    public void setBriefDisease(String briefDisease) {
        this.briefDisease = briefDisease == null ? null : briefDisease.trim();
    }

    /**
     * 获取护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @return NURING_OBS_ITEM_NAME - 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public String getNuringObsItemName() {
        return nuringObsItemName;
    }

    /**
     * 设置护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @param nuringObsItemName 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public void setNuringObsItemName(String nuringObsItemName) {
        this.nuringObsItemName = nuringObsItemName == null ? null : nuringObsItemName.trim();
    }

    /**
     * 获取护理观察结果（对护理观察项目结果的详细描述）
     *
     * @return NURING_OBS_RESULT - 护理观察结果（对护理观察项目结果的详细描述）
     */
    public String getNuringObsResult() {
        return nuringObsResult;
    }

    /**
     * 设置护理观察结果（对护理观察项目结果的详细描述）
     *
     * @param nuringObsResult 护理观察结果（对护理观察项目结果的详细描述）
     */
    public void setNuringObsResult(String nuringObsResult) {
        this.nuringObsResult = nuringObsResult == null ? null : nuringObsResult.trim();
    }

    /**
     * 获取护理操作项目类目名称（多个护理操作项目的名称）
     *
     * @return NURING_PRO_ITEM_NAME - 护理操作项目类目名称（多个护理操作项目的名称）
     */
    public String getNuringProItemName() {
        return nuringProItemName;
    }

    /**
     * 设置护理操作项目类目名称（多个护理操作项目的名称）
     *
     * @param nuringProItemName 护理操作项目类目名称（多个护理操作项目的名称）
     */
    public void setNuringProItemName(String nuringProItemName) {
        this.nuringProItemName = nuringProItemName == null ? null : nuringProItemName.trim();
    }

    /**
     * 获取护理操作名称（进行护理操作的具体名称）
     *
     * @return NURING_PRO_NAME - 护理操作名称（进行护理操作的具体名称）
     */
    public String getNuringProName() {
        return nuringProName;
    }

    /**
     * 设置护理操作名称（进行护理操作的具体名称）
     *
     * @param nuringProName 护理操作名称（进行护理操作的具体名称）
     */
    public void setNuringProName(String nuringProName) {
        this.nuringProName = nuringProName == null ? null : nuringProName.trim();
    }

    /**
     * 获取护理操作结果（多个护理操作结果的详细描述）
     *
     * @return NURING_PRO_RESULT - 护理操作结果（多个护理操作结果的详细描述）
     */
    public String getNuringProResult() {
        return nuringProResult;
    }

    /**
     * 设置护理操作结果（多个护理操作结果的详细描述）
     *
     * @param nuringProResult 护理操作结果（多个护理操作结果的详细描述）
     */
    public void setNuringProResult(String nuringProResult) {
        this.nuringProResult = nuringProResult == null ? null : nuringProResult.trim();
    }

    /**
     * 获取发出手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术安全核对表的标志）
     *
     * @return SEND_OP_SAFE_CHK_MARK - 发出手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术安全核对表的标志）
     */
    public String getSendOpSafeChkMark() {
        return sendOpSafeChkMark;
    }

    /**
     * 设置发出手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术安全核对表的标志）
     *
     * @param sendOpSafeChkMark 发出手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术安全核对表的标志）
     */
    public void setSendOpSafeChkMark(String sendOpSafeChkMark) {
        this.sendOpSafeChkMark = sendOpSafeChkMark == null ? null : sendOpSafeChkMark.trim();
    }

    /**
     * 获取收回手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术安全核对表的标志）
     *
     * @return BACK_OP_SAFE_CHK_MARK - 收回手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术安全核对表的标志）
     */
    public String getBackOpSafeChkMark() {
        return backOpSafeChkMark;
    }

    /**
     * 设置收回手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术安全核对表的标志）
     *
     * @param backOpSafeChkMark 收回手术安全核对表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术安全核对表的标志）
     */
    public void setBackOpSafeChkMark(String backOpSafeChkMark) {
        this.backOpSafeChkMark = backOpSafeChkMark == null ? null : backOpSafeChkMark.trim();
    }

    /**
     * 获取发出手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术风险评估表的标志）
     *
     * @return SEND_OP_RISK_EVA_MARK - 发出手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术风险评估表的标志）
     */
    public String getSendOpRiskEvaMark() {
        return sendOpRiskEvaMark;
    }

    /**
     * 设置发出手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术风险评估表的标志）
     *
     * @param sendOpRiskEvaMark 发出手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已发出手术风险评估表的标志）
     */
    public void setSendOpRiskEvaMark(String sendOpRiskEvaMark) {
        this.sendOpRiskEvaMark = sendOpRiskEvaMark == null ? null : sendOpRiskEvaMark.trim();
    }

    /**
     * 获取收回手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术风险评估表的标志）
     *
     * @return BACK_OP_RISK_EVA_MARK - 收回手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术风险评估表的标志）
     */
    public String getBackOpRiskEvaMark() {
        return backOpRiskEvaMark;
    }

    /**
     * 设置收回手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术风险评估表的标志）
     *
     * @param backOpRiskEvaMark 收回手术风险评估表标志0否 1是（对接受手术治疗的患者，标识是否已收回手术风险评估表的标志）
     */
    public void setBackOpRiskEvaMark(String backOpRiskEvaMark) {
        this.backOpRiskEvaMark = backOpRiskEvaMark == null ? null : backOpRiskEvaMark.trim();
    }

    /**
     * 获取隔离标志0否 1是（标识对患者是否采取隔离措施的标志）
     *
     * @return ISOLATED_MARK - 隔离标志0否 1是（标识对患者是否采取隔离措施的标志）
     */
    public String getIsolatedMark() {
        return isolatedMark;
    }

    /**
     * 设置隔离标志0否 1是（标识对患者是否采取隔离措施的标志）
     *
     * @param isolatedMark 隔离标志0否 1是（标识对患者是否采取隔离措施的标志）
     */
    public void setIsolatedMark(String isolatedMark) {
        this.isolatedMark = isolatedMark == null ? null : isolatedMark.trim();
    }

    /**
     * 获取隔离种类代码CV06.00.222（对患者采取的隔离种类在特定编码体系中的代码）
     *
     * @return ISOLATED_CLASS_CODE - 隔离种类代码CV06.00.222（对患者采取的隔离种类在特定编码体系中的代码）
     */
    public String getIsolatedClassCode() {
        return isolatedClassCode;
    }

    /**
     * 设置隔离种类代码CV06.00.222（对患者采取的隔离种类在特定编码体系中的代码）
     *
     * @param isolatedClassCode 隔离种类代码CV06.00.222（对患者采取的隔离种类在特定编码体系中的代码）
     */
    public void setIsolatedClassCode(String isolatedClassCode) {
        this.isolatedClassCode = isolatedClassCode == null ? null : isolatedClassCode.trim();
    }

    /**
     * 获取隔离种类名称（对患者采取的隔离种类在特定编码体系中的名称）
     *
     * @return ISOLATED_CLASS_NAME - 隔离种类名称（对患者采取的隔离种类在特定编码体系中的名称）
     */
    public String getIsolatedClassName() {
        return isolatedClassName;
    }

    /**
     * 设置隔离种类名称（对患者采取的隔离种类在特定编码体系中的名称）
     *
     * @param isolatedClassName 隔离种类名称（对患者采取的隔离种类在特定编码体系中的名称）
     */
    public void setIsolatedClassName(String isolatedClassName) {
        this.isolatedClassName = isolatedClassName == null ? null : isolatedClassName.trim();
    }

    /**
     * 获取护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NURSE_SIGNATURE - 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getNurseSignature() {
        return nurseSignature;
    }

    /**
     * 设置护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param nurseSignature 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setNurseSignature(String nurseSignature) {
        this.nurseSignature = nurseSignature == null ? null : nurseSignature.trim();
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