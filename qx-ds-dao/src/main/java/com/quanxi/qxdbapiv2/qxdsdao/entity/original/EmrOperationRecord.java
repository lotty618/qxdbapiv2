package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_OPERATION_RECORD")
public class EmrOperationRecord {
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
    @Column(name = "OPERATION_ID")
    private String operationId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 记录时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "AUTHOR_DATE")
    private String authorDate;

    /**
     * 记录者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHOR_ID")
    private String authorId;

    /**
     * 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    /**
     * 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    @Column(name = "DIR_OPER_PATIENT_TYPE")
    private String dirOperPatientType;

    /**
     * 手术医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "SURGEON_ID")
    private String surgeonId;

    /**
     * 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SURGEON_NAME")
    private String surgeonName;

    /**
     * Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ASSISTANT1_ID")
    private String assistant1Id;

    /**
     * Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT1_NAME")
    private String assistant1Name;

    /**
     * Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ASSISTANT2_ID")
    private String assistant2Id;

    /**
     * Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT2_NAME")
    private String assistant2Name;

    /**
     * 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ANESTHESIOLOGIST_ID")
    private String anesthesiologistId;

    /**
     * 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHESIOLOGIST_NAME")
    private String anesthesiologistName;

    /**
     * 手术（操作）开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_START_DATE")
    private String operationStartDate;

    /**
     * 手术（操作）结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_END_DATE")
    private String operationEndDate;

    /**
     * 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    @Column(name = "PRE_DIAGNOSIS_CODE")
    private String preDiagnosisCode;

    /**
     * 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    @Column(name = "PRE_DIAGNOSIS_CN")
    private String preDiagnosisCn;

    /**
     * 术中诊断代码ICD-10（术中诊断在特定编码体系中的编码）
     */
    @Column(name = "MID_DIAGNOSIS_CODE")
    private String midDiagnosisCode;

    /**
     * 术中诊断中文名称（术中诊断在特定编码体系中的中文名称）
     */
    @Column(name = "MID_DIAGNOSIS_CN")
    private String midDiagnosisCn;

    /**
     * 术后诊断代码ICD-10（术后诊断在特定编码体系中的编码）
     */
    @Column(name = "AFTER_DIAGNOSIS_CODE")
    private String afterDiagnosisCode;

    /**
     * 术后诊断中文名称（术后诊断在特定编码体系中的中文名称）
     */
    @Column(name = "AFTER_DIAGNOSIS_CN")
    private String afterDiagnosisCn;

    /**
     * 手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    @Column(name = "OPERATION_CN")
    private String operationCn;

    /**
     * 手术/操作-目标部位代码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    @Column(name = "OPERATION_SITECODE")
    private String operationSitecode;

    /**
     * 手术/操作-目标部位中文名称（实施手术的人体部位名称）
     */
    @Column(name = "OPERATION_SITE_CN")
    private String operationSiteCn;

    /**
     * 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    @Column(name = "OPERATION_LEVEL_CODE")
    private String operationLevelCode;

    /**
     * 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    @Column(name = "OPERATION_LEVEL_NAME")
    private String operationLevelName;

    /**
     * 切口愈合等级代码CV05.10.023（手术切口愈合类别在特编码体系中的代码）
     */
    @Column(name = "INCISION_HEALING_CODE")
    private String incisionHealingCode;

    /**
     * 切口愈合等级中文名称（手术切口愈合类别在特编码体系中的中文名称）
     */
    @Column(name = "INCISION_HEALING_CN")
    private String incisionHealingCn;

    /**
     * 手术经过（手术过程的详细描述）
     */
    @Column(name = "OPERATION_COURSE")
    private String operationCourse;

    /**
     * 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    @Column(name = "INTERVENTION")
    private String intervention;

    /**
     * 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    @Column(name = "OP_POSITION_CODE")
    private String opPositionCode;

    /**
     * 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    @Column(name = "OP_POSITION_CN")
    private String opPositionCn;

    /**
     * 手术过程描述（手术过程的详细描述）
     */
    @Column(name = "OPERATION_DESCRIBE")
    private String operationDescribe;

    /**
     * 皮肤消毒描述（对手术中皮肤消毒情况的具体描述）
     */
    @Column(name = "SKIN_THIMEROSAL")
    private String skinThimerosal;

    /**
     * 手术切口描述（对手术中皮肤切口情况的具体描述）
     */
    @Column(name = "WOUND_DESCRIBE")
    private String woundDescribe;

    /**
     * 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    @Column(name = "WOUND_CLASS_CODE")
    private String woundClassCode;

    /**
     * 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    @Column(name = "WOUND_CLASS_CN")
    private String woundClassCn;

    /**
     * 引流标志0否 1是（标识术中是否有引流的标志）
     */
    @Column(name = "DRAIN_MARK")
    private String drainMark;

    /**
     * 引流材料名称（对手术中引流材料名称的具体描述）
     */
    @Column(name = "DRAIN_MATERIAL_NAME")
    private String drainMaterialName;

    /**
     * 引流材料数量（引流材料数量）
     */
    @Column(name = "DRAIN_MATERIAL_AMOUNT")
    private BigDecimal drainMaterialAmount;

    /**
     * 放置部位（引流管放置在病人体内的具体位置的描述）
     */
    @Column(name = "PLACED_PART")
    private String placedPart;

    /**
     * 出血量（手术过程的出血量）
     */
    @Column(name = "BLEED_AMOUNT")
    private BigDecimal bleedAmount;

    /**
     * 输液量（手术过程的输液量，单位为ML）
     */
    @Column(name = "INFUSION_AMOUNT")
    private BigDecimal infusionAmount;

    /**
     * 输血量（手术过程的输血量）
     */
    @Column(name = "TRANSFUSION_AMOUNT")
    private BigDecimal transfusionAmount;

    /**
     * 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    @Column(name = "TRANSFUSE_REACTION_MARK")
    private String transfuseReactionMark;

    /**
     * 术前用药（对患者术前用药情况的描述）
     */
    @Column(name = "OP_PRE_DRUG")
    private String opPreDrug;

    /**
     * 术中用药（对患者术中用药情况的描述）
     */
    @Column(name = "OP_MID_DRUG")
    private String opMidDrug;

    /**
     * 器械护士姓名（器械护士在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DEVICE_NURSE_NAME")
    private String deviceNurseName;

    /**
     * 巡台护士姓名（巡台护士在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "TOUR_NURSE_NAME")
    private String tourNurseName;

    /**
     * 手术间编号（手术间的编号）
     */
    @Column(name = "OPERATION_ROOM_NO")
    private String operationRoomNo;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 病历模板类别代码（例如：11）
     */
    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    /**
     * 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    /**
     * 病历标题名称（例如：XX主任医师查房记录）
     */
    @Column(name = "EMR_TITLE")
    private String emrTitle;

    /**
     * 病历使用医院模板编号
     */
    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

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
     * @return OPERATION_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param operationId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId == null ? null : operationId.trim();
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
     * 获取记录时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @return AUTHOR_DATE - 记录时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public String getAuthorDate() {
        return authorDate;
    }

    /**
     * 设置记录时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @param authorDate 记录时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public void setAuthorDate(String authorDate) {
        this.authorDate = authorDate == null ? null : authorDate.trim();
    }

    /**
     * 获取记录者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHOR_ID - 记录者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 设置记录者：编号（医疗服务人员的唯一编号）
     *
     * @param authorId 记录者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    /**
     * 获取记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHOR_NAME - 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param authorName 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * 获取手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @return DIR_OPER_PATIENT_TYPE - 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public String getDirOperPatientType() {
        return dirOperPatientType;
    }

    /**
     * 设置手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @param dirOperPatientType 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public void setDirOperPatientType(String dirOperPatientType) {
        this.dirOperPatientType = dirOperPatientType == null ? null : dirOperPatientType.trim();
    }

    /**
     * 获取手术医师：编号（医疗服务人员的唯一编号）
     *
     * @return SURGEON_ID - 手术医师：编号（医疗服务人员的唯一编号）
     */
    public String getSurgeonId() {
        return surgeonId;
    }

    /**
     * 设置手术医师：编号（医疗服务人员的唯一编号）
     *
     * @param surgeonId 手术医师：编号（医疗服务人员的唯一编号）
     */
    public void setSurgeonId(String surgeonId) {
        this.surgeonId = surgeonId == null ? null : surgeonId.trim();
    }

    /**
     * 获取手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SURGEON_NAME - 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * 设置手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param surgeonName 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    /**
     * 获取Ⅰ助：编号（医疗服务人员的唯一编号）
     *
     * @return ASSISTANT1_ID - Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    public String getAssistant1Id() {
        return assistant1Id;
    }

    /**
     * 设置Ⅰ助：编号（医疗服务人员的唯一编号）
     *
     * @param assistant1Id Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    public void setAssistant1Id(String assistant1Id) {
        this.assistant1Id = assistant1Id == null ? null : assistant1Id.trim();
    }

    /**
     * 获取Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT1_NAME - Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant1Name() {
        return assistant1Name;
    }

    /**
     * 设置Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant1Name Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant1Name(String assistant1Name) {
        this.assistant1Name = assistant1Name == null ? null : assistant1Name.trim();
    }

    /**
     * 获取Ⅱ助：编号（医疗服务人员的唯一编号）
     *
     * @return ASSISTANT2_ID - Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    public String getAssistant2Id() {
        return assistant2Id;
    }

    /**
     * 设置Ⅱ助：编号（医疗服务人员的唯一编号）
     *
     * @param assistant2Id Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    public void setAssistant2Id(String assistant2Id) {
        this.assistant2Id = assistant2Id == null ? null : assistant2Id.trim();
    }

    /**
     * 获取Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT2_NAME - Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant2Name() {
        return assistant2Name;
    }

    /**
     * 设置Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant2Name Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant2Name(String assistant2Name) {
        this.assistant2Name = assistant2Name == null ? null : assistant2Name.trim();
    }

    /**
     * 获取麻醉医师：编号（医疗服务人员的唯一编号）
     *
     * @return ANESTHESIOLOGIST_ID - 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    public String getAnesthesiologistId() {
        return anesthesiologistId;
    }

    /**
     * 设置麻醉医师：编号（医疗服务人员的唯一编号）
     *
     * @param anesthesiologistId 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    public void setAnesthesiologistId(String anesthesiologistId) {
        this.anesthesiologistId = anesthesiologistId == null ? null : anesthesiologistId.trim();
    }

    /**
     * 获取麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANESTHESIOLOGIST_NAME - 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesthesiologistName() {
        return anesthesiologistName;
    }

    /**
     * 设置麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesthesiologistName 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesthesiologistName(String anesthesiologistName) {
        this.anesthesiologistName = anesthesiologistName == null ? null : anesthesiologistName.trim();
    }

    /**
     * 获取手术（操作）开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_START_DATE - 手术（操作）开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationStartDate() {
        return operationStartDate;
    }

    /**
     * 设置手术（操作）开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationStartDate 手术（操作）开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationStartDate(String operationStartDate) {
        this.operationStartDate = operationStartDate == null ? null : operationStartDate.trim();
    }

    /**
     * 获取手术（操作）结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_END_DATE - 手术（操作）结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationEndDate() {
        return operationEndDate;
    }

    /**
     * 设置手术（操作）结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationEndDate 手术（操作）结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationEndDate(String operationEndDate) {
        this.operationEndDate = operationEndDate == null ? null : operationEndDate.trim();
    }

    /**
     * 获取术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @return PRE_DIAGNOSIS_CODE - 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public String getPreDiagnosisCode() {
        return preDiagnosisCode;
    }

    /**
     * 设置术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @param preDiagnosisCode 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public void setPreDiagnosisCode(String preDiagnosisCode) {
        this.preDiagnosisCode = preDiagnosisCode == null ? null : preDiagnosisCode.trim();
    }

    /**
     * 获取术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     *
     * @return PRE_DIAGNOSIS_CN - 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    public String getPreDiagnosisCn() {
        return preDiagnosisCn;
    }

    /**
     * 设置术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     *
     * @param preDiagnosisCn 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    public void setPreDiagnosisCn(String preDiagnosisCn) {
        this.preDiagnosisCn = preDiagnosisCn == null ? null : preDiagnosisCn.trim();
    }

    /**
     * 获取术中诊断代码ICD-10（术中诊断在特定编码体系中的编码）
     *
     * @return MID_DIAGNOSIS_CODE - 术中诊断代码ICD-10（术中诊断在特定编码体系中的编码）
     */
    public String getMidDiagnosisCode() {
        return midDiagnosisCode;
    }

    /**
     * 设置术中诊断代码ICD-10（术中诊断在特定编码体系中的编码）
     *
     * @param midDiagnosisCode 术中诊断代码ICD-10（术中诊断在特定编码体系中的编码）
     */
    public void setMidDiagnosisCode(String midDiagnosisCode) {
        this.midDiagnosisCode = midDiagnosisCode == null ? null : midDiagnosisCode.trim();
    }

    /**
     * 获取术中诊断中文名称（术中诊断在特定编码体系中的中文名称）
     *
     * @return MID_DIAGNOSIS_CN - 术中诊断中文名称（术中诊断在特定编码体系中的中文名称）
     */
    public String getMidDiagnosisCn() {
        return midDiagnosisCn;
    }

    /**
     * 设置术中诊断中文名称（术中诊断在特定编码体系中的中文名称）
     *
     * @param midDiagnosisCn 术中诊断中文名称（术中诊断在特定编码体系中的中文名称）
     */
    public void setMidDiagnosisCn(String midDiagnosisCn) {
        this.midDiagnosisCn = midDiagnosisCn == null ? null : midDiagnosisCn.trim();
    }

    /**
     * 获取术后诊断代码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @return AFTER_DIAGNOSIS_CODE - 术后诊断代码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public String getAfterDiagnosisCode() {
        return afterDiagnosisCode;
    }

    /**
     * 设置术后诊断代码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @param afterDiagnosisCode 术后诊断代码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public void setAfterDiagnosisCode(String afterDiagnosisCode) {
        this.afterDiagnosisCode = afterDiagnosisCode == null ? null : afterDiagnosisCode.trim();
    }

    /**
     * 获取术后诊断中文名称（术后诊断在特定编码体系中的中文名称）
     *
     * @return AFTER_DIAGNOSIS_CN - 术后诊断中文名称（术后诊断在特定编码体系中的中文名称）
     */
    public String getAfterDiagnosisCn() {
        return afterDiagnosisCn;
    }

    /**
     * 设置术后诊断中文名称（术后诊断在特定编码体系中的中文名称）
     *
     * @param afterDiagnosisCn 术后诊断中文名称（术后诊断在特定编码体系中的中文名称）
     */
    public void setAfterDiagnosisCn(String afterDiagnosisCn) {
        this.afterDiagnosisCn = afterDiagnosisCn == null ? null : afterDiagnosisCn.trim();
    }

    /**
     * 获取手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     *
     * @return OPERATION_CN - 手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    public String getOperationCn() {
        return operationCn;
    }

    /**
     * 设置手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     *
     * @param operationCn 手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    public void setOperationCn(String operationCn) {
        this.operationCn = operationCn == null ? null : operationCn.trim();
    }

    /**
     * 获取手术/操作-目标部位代码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @return OPERATION_SITECODE - 手术/操作-目标部位代码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public String getOperationSitecode() {
        return operationSitecode;
    }

    /**
     * 设置手术/操作-目标部位代码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @param operationSitecode 手术/操作-目标部位代码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public void setOperationSitecode(String operationSitecode) {
        this.operationSitecode = operationSitecode == null ? null : operationSitecode.trim();
    }

    /**
     * 获取手术/操作-目标部位中文名称（实施手术的人体部位名称）
     *
     * @return OPERATION_SITE_CN - 手术/操作-目标部位中文名称（实施手术的人体部位名称）
     */
    public String getOperationSiteCn() {
        return operationSiteCn;
    }

    /**
     * 设置手术/操作-目标部位中文名称（实施手术的人体部位名称）
     *
     * @param operationSiteCn 手术/操作-目标部位中文名称（实施手术的人体部位名称）
     */
    public void setOperationSiteCn(String operationSiteCn) {
        this.operationSiteCn = operationSiteCn == null ? null : operationSiteCn.trim();
    }

    /**
     * 获取麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANESTHESIA_CODE - 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }

    /**
     * 设置麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesthesiaCode 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode == null ? null : anesthesiaCode.trim();
    }

    /**
     * 获取麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_CN - 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaCn 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     *
     * @return OPERATION_LEVEL_CODE - 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    public String getOperationLevelCode() {
        return operationLevelCode;
    }

    /**
     * 设置手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     *
     * @param operationLevelCode 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    public void setOperationLevelCode(String operationLevelCode) {
        this.operationLevelCode = operationLevelCode == null ? null : operationLevelCode.trim();
    }

    /**
     * 获取手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     *
     * @return OPERATION_LEVEL_NAME - 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    public String getOperationLevelName() {
        return operationLevelName;
    }

    /**
     * 设置手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     *
     * @param operationLevelName 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    public void setOperationLevelName(String operationLevelName) {
        this.operationLevelName = operationLevelName == null ? null : operationLevelName.trim();
    }

    /**
     * 获取切口愈合等级代码CV05.10.023（手术切口愈合类别在特编码体系中的代码）
     *
     * @return INCISION_HEALING_CODE - 切口愈合等级代码CV05.10.023（手术切口愈合类别在特编码体系中的代码）
     */
    public String getIncisionHealingCode() {
        return incisionHealingCode;
    }

    /**
     * 设置切口愈合等级代码CV05.10.023（手术切口愈合类别在特编码体系中的代码）
     *
     * @param incisionHealingCode 切口愈合等级代码CV05.10.023（手术切口愈合类别在特编码体系中的代码）
     */
    public void setIncisionHealingCode(String incisionHealingCode) {
        this.incisionHealingCode = incisionHealingCode == null ? null : incisionHealingCode.trim();
    }

    /**
     * 获取切口愈合等级中文名称（手术切口愈合类别在特编码体系中的中文名称）
     *
     * @return INCISION_HEALING_CN - 切口愈合等级中文名称（手术切口愈合类别在特编码体系中的中文名称）
     */
    public String getIncisionHealingCn() {
        return incisionHealingCn;
    }

    /**
     * 设置切口愈合等级中文名称（手术切口愈合类别在特编码体系中的中文名称）
     *
     * @param incisionHealingCn 切口愈合等级中文名称（手术切口愈合类别在特编码体系中的中文名称）
     */
    public void setIncisionHealingCn(String incisionHealingCn) {
        this.incisionHealingCn = incisionHealingCn == null ? null : incisionHealingCn.trim();
    }

    /**
     * 获取手术经过（手术过程的详细描述）
     *
     * @return OPERATION_COURSE - 手术经过（手术过程的详细描述）
     */
    public String getOperationCourse() {
        return operationCourse;
    }

    /**
     * 设置手术经过（手术过程的详细描述）
     *
     * @param operationCourse 手术经过（手术过程的详细描述）
     */
    public void setOperationCourse(String operationCourse) {
        this.operationCourse = operationCourse == null ? null : operationCourse.trim();
    }

    /**
     * 获取介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     *
     * @return INTERVENTION - 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    public String getIntervention() {
        return intervention;
    }

    /**
     * 设置介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     *
     * @param intervention 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    public void setIntervention(String intervention) {
        this.intervention = intervention == null ? null : intervention.trim();
    }

    /**
     * 获取手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     *
     * @return OP_POSITION_CODE - 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    public String getOpPositionCode() {
        return opPositionCode;
    }

    /**
     * 设置手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     *
     * @param opPositionCode 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    public void setOpPositionCode(String opPositionCode) {
        this.opPositionCode = opPositionCode == null ? null : opPositionCode.trim();
    }

    /**
     * 获取手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     *
     * @return OP_POSITION_CN - 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    public String getOpPositionCn() {
        return opPositionCn;
    }

    /**
     * 设置手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     *
     * @param opPositionCn 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    public void setOpPositionCn(String opPositionCn) {
        this.opPositionCn = opPositionCn == null ? null : opPositionCn.trim();
    }

    /**
     * 获取手术过程描述（手术过程的详细描述）
     *
     * @return OPERATION_DESCRIBE - 手术过程描述（手术过程的详细描述）
     */
    public String getOperationDescribe() {
        return operationDescribe;
    }

    /**
     * 设置手术过程描述（手术过程的详细描述）
     *
     * @param operationDescribe 手术过程描述（手术过程的详细描述）
     */
    public void setOperationDescribe(String operationDescribe) {
        this.operationDescribe = operationDescribe == null ? null : operationDescribe.trim();
    }

    /**
     * 获取皮肤消毒描述（对手术中皮肤消毒情况的具体描述）
     *
     * @return SKIN_THIMEROSAL - 皮肤消毒描述（对手术中皮肤消毒情况的具体描述）
     */
    public String getSkinThimerosal() {
        return skinThimerosal;
    }

    /**
     * 设置皮肤消毒描述（对手术中皮肤消毒情况的具体描述）
     *
     * @param skinThimerosal 皮肤消毒描述（对手术中皮肤消毒情况的具体描述）
     */
    public void setSkinThimerosal(String skinThimerosal) {
        this.skinThimerosal = skinThimerosal == null ? null : skinThimerosal.trim();
    }

    /**
     * 获取手术切口描述（对手术中皮肤切口情况的具体描述）
     *
     * @return WOUND_DESCRIBE - 手术切口描述（对手术中皮肤切口情况的具体描述）
     */
    public String getWoundDescribe() {
        return woundDescribe;
    }

    /**
     * 设置手术切口描述（对手术中皮肤切口情况的具体描述）
     *
     * @param woundDescribe 手术切口描述（对手术中皮肤切口情况的具体描述）
     */
    public void setWoundDescribe(String woundDescribe) {
        this.woundDescribe = woundDescribe == null ? null : woundDescribe.trim();
    }

    /**
     * 获取手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     *
     * @return WOUND_CLASS_CODE - 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    public String getWoundClassCode() {
        return woundClassCode;
    }

    /**
     * 设置手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     *
     * @param woundClassCode 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    public void setWoundClassCode(String woundClassCode) {
        this.woundClassCode = woundClassCode == null ? null : woundClassCode.trim();
    }

    /**
     * 获取手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     *
     * @return WOUND_CLASS_CN - 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    public String getWoundClassCn() {
        return woundClassCn;
    }

    /**
     * 设置手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     *
     * @param woundClassCn 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    public void setWoundClassCn(String woundClassCn) {
        this.woundClassCn = woundClassCn == null ? null : woundClassCn.trim();
    }

    /**
     * 获取引流标志0否 1是（标识术中是否有引流的标志）
     *
     * @return DRAIN_MARK - 引流标志0否 1是（标识术中是否有引流的标志）
     */
    public String getDrainMark() {
        return drainMark;
    }

    /**
     * 设置引流标志0否 1是（标识术中是否有引流的标志）
     *
     * @param drainMark 引流标志0否 1是（标识术中是否有引流的标志）
     */
    public void setDrainMark(String drainMark) {
        this.drainMark = drainMark == null ? null : drainMark.trim();
    }

    /**
     * 获取引流材料名称（对手术中引流材料名称的具体描述）
     *
     * @return DRAIN_MATERIAL_NAME - 引流材料名称（对手术中引流材料名称的具体描述）
     */
    public String getDrainMaterialName() {
        return drainMaterialName;
    }

    /**
     * 设置引流材料名称（对手术中引流材料名称的具体描述）
     *
     * @param drainMaterialName 引流材料名称（对手术中引流材料名称的具体描述）
     */
    public void setDrainMaterialName(String drainMaterialName) {
        this.drainMaterialName = drainMaterialName == null ? null : drainMaterialName.trim();
    }

    /**
     * 获取引流材料数量（引流材料数量）
     *
     * @return DRAIN_MATERIAL_AMOUNT - 引流材料数量（引流材料数量）
     */
    public BigDecimal getDrainMaterialAmount() {
        return drainMaterialAmount;
    }

    /**
     * 设置引流材料数量（引流材料数量）
     *
     * @param drainMaterialAmount 引流材料数量（引流材料数量）
     */
    public void setDrainMaterialAmount(BigDecimal drainMaterialAmount) {
        this.drainMaterialAmount = drainMaterialAmount;
    }

    /**
     * 获取放置部位（引流管放置在病人体内的具体位置的描述）
     *
     * @return PLACED_PART - 放置部位（引流管放置在病人体内的具体位置的描述）
     */
    public String getPlacedPart() {
        return placedPart;
    }

    /**
     * 设置放置部位（引流管放置在病人体内的具体位置的描述）
     *
     * @param placedPart 放置部位（引流管放置在病人体内的具体位置的描述）
     */
    public void setPlacedPart(String placedPart) {
        this.placedPart = placedPart == null ? null : placedPart.trim();
    }

    /**
     * 获取出血量（手术过程的出血量）
     *
     * @return BLEED_AMOUNT - 出血量（手术过程的出血量）
     */
    public BigDecimal getBleedAmount() {
        return bleedAmount;
    }

    /**
     * 设置出血量（手术过程的出血量）
     *
     * @param bleedAmount 出血量（手术过程的出血量）
     */
    public void setBleedAmount(BigDecimal bleedAmount) {
        this.bleedAmount = bleedAmount;
    }

    /**
     * 获取输液量（手术过程的输液量，单位为ML）
     *
     * @return INFUSION_AMOUNT - 输液量（手术过程的输液量，单位为ML）
     */
    public BigDecimal getInfusionAmount() {
        return infusionAmount;
    }

    /**
     * 设置输液量（手术过程的输液量，单位为ML）
     *
     * @param infusionAmount 输液量（手术过程的输液量，单位为ML）
     */
    public void setInfusionAmount(BigDecimal infusionAmount) {
        this.infusionAmount = infusionAmount;
    }

    /**
     * 获取输血量（手术过程的输血量）
     *
     * @return TRANSFUSION_AMOUNT - 输血量（手术过程的输血量）
     */
    public BigDecimal getTransfusionAmount() {
        return transfusionAmount;
    }

    /**
     * 设置输血量（手术过程的输血量）
     *
     * @param transfusionAmount 输血量（手术过程的输血量）
     */
    public void setTransfusionAmount(BigDecimal transfusionAmount) {
        this.transfusionAmount = transfusionAmount;
    }

    /**
     * 获取输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @return TRANSFUSE_REACTION_MARK - 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public String getTransfuseReactionMark() {
        return transfuseReactionMark;
    }

    /**
     * 设置输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @param transfuseReactionMark 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public void setTransfuseReactionMark(String transfuseReactionMark) {
        this.transfuseReactionMark = transfuseReactionMark == null ? null : transfuseReactionMark.trim();
    }

    /**
     * 获取术前用药（对患者术前用药情况的描述）
     *
     * @return OP_PRE_DRUG - 术前用药（对患者术前用药情况的描述）
     */
    public String getOpPreDrug() {
        return opPreDrug;
    }

    /**
     * 设置术前用药（对患者术前用药情况的描述）
     *
     * @param opPreDrug 术前用药（对患者术前用药情况的描述）
     */
    public void setOpPreDrug(String opPreDrug) {
        this.opPreDrug = opPreDrug == null ? null : opPreDrug.trim();
    }

    /**
     * 获取术中用药（对患者术中用药情况的描述）
     *
     * @return OP_MID_DRUG - 术中用药（对患者术中用药情况的描述）
     */
    public String getOpMidDrug() {
        return opMidDrug;
    }

    /**
     * 设置术中用药（对患者术中用药情况的描述）
     *
     * @param opMidDrug 术中用药（对患者术中用药情况的描述）
     */
    public void setOpMidDrug(String opMidDrug) {
        this.opMidDrug = opMidDrug == null ? null : opMidDrug.trim();
    }

    /**
     * 获取器械护士姓名（器械护士在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DEVICE_NURSE_NAME - 器械护士姓名（器械护士在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDeviceNurseName() {
        return deviceNurseName;
    }

    /**
     * 设置器械护士姓名（器械护士在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param deviceNurseName 器械护士姓名（器械护士在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDeviceNurseName(String deviceNurseName) {
        this.deviceNurseName = deviceNurseName == null ? null : deviceNurseName.trim();
    }

    /**
     * 获取巡台护士姓名（巡台护士在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return TOUR_NURSE_NAME - 巡台护士姓名（巡台护士在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getTourNurseName() {
        return tourNurseName;
    }

    /**
     * 设置巡台护士姓名（巡台护士在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param tourNurseName 巡台护士姓名（巡台护士在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setTourNurseName(String tourNurseName) {
        this.tourNurseName = tourNurseName == null ? null : tourNurseName.trim();
    }

    /**
     * 获取手术间编号（手术间的编号）
     *
     * @return OPERATION_ROOM_NO - 手术间编号（手术间的编号）
     */
    public String getOperationRoomNo() {
        return operationRoomNo;
    }

    /**
     * 设置手术间编号（手术间的编号）
     *
     * @param operationRoomNo 手术间编号（手术间的编号）
     */
    public void setOperationRoomNo(String operationRoomNo) {
        this.operationRoomNo = operationRoomNo == null ? null : operationRoomNo.trim();
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
     * 获取病历模板类别代码（例如：11）
     *
     * @return TEMPLATE_TYPE - 病历模板类别代码（例如：11）
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置病历模板类别代码（例如：11）
     *
     * @param templateType 病历模板类别代码（例如：11）
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * 获取病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @return TEMPLATE_TYPE_CN - 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * 设置病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @param templateTypeCn 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * 获取病历标题名称（例如：XX主任医师查房记录）
     *
     * @return EMR_TITLE - 病历标题名称（例如：XX主任医师查房记录）
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * 设置病历标题名称（例如：XX主任医师查房记录）
     *
     * @param emrTitle 病历标题名称（例如：XX主任医师查房记录）
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * 获取病历使用医院模板编号
     *
     * @return EMR_TEMPLATE_CODE - 病历使用医院模板编号
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * 设置病历使用医院模板编号
     *
     * @param emrTemplateCode 病历使用医院模板编号
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
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