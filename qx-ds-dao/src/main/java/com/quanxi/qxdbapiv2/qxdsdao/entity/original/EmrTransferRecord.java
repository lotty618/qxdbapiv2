package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_TRANSFER_RECORD")
public class EmrTransferRecord {
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
    @Column(name = "TRANSFER_ID")
    private String transferId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    /**
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    /**
     * 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "IN_DISEASE_DIAG_CODE")
    private String inDiseaseDiagCode;

    /**
     * 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "IN_DISEASE_DIAG_NAME")
    private String inDiseaseDiagName;

    /**
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 目前情况（对患者当前的情况的描述）
     */
    @Column(name = "CURRENT_SITUATION")
    private String currentSituation;

    /**
     * 目前诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "CURRENT_DISEASE_DIAG_CODE")
    private String currentDiseaseDiagCode;

    /**
     * 目前诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "CURRENT_DISEASE_DIAG_NAME")
    private String currentDiseaseDiagName;

    /**
     * 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    @Column(name = "TRANSFER_TYPE_CODE")
    private String transferTypeCode;

    /**
     * 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    @Column(name = "TRANSFER_TYPE_NAME")
    private String transferTypeName;

    /**
     * 转出日期时间 （患者转出的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "TRANSFER_OUT_DATE")
    private String transferOutDate;

    /**
     * 转出科室代码DIR_DEPT（患者转出去的科室代码）
     */
    @Column(name = "TRANSFER_OUT_DEPT_CODE")
    private String transferOutDeptCode;

    /**
     * 转出科室名称（患者转出去的科室代码）
     */
    @Column(name = "TRANSFER_OUT_DEPT_NAME")
    private String transferOutDeptName;

    /**
     * 转出医师签名 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_OUT_DOCTOR_NAME")
    private String transferOutDoctorName;

    /**
     * 转入日期时间 （患者转入的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "TRANSFER_IN_DATE")
    private String transferInDate;

    /**
     * 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    @Column(name = "TRANSFER_IN_DEPT_CODE")
    private String transferInDeptCode;

    /**
     * 转入科室名称（患者转入的科室代码）
     */
    @Column(name = "TRANSFER_IN_DEPT_NAME")
    private String transferInDeptName;

    /**
     * 转入医师签名 （转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_IN_DOCTOR_NAME")
    private String transferInDoctorName;

    /**
     * 转科目的（对患者转科目的的详细描述）
     */
    @Column(name = "TRANSFER_REASON")
    private String transferReason;

    /**
     * 转科注意事项 （对患者转科需要注意的事项的描述）
     */
    @Column(name = "NOTICE")
    private String notice;

    /**
     * 转入诊疗计划 （患者转入科室后的诊疗计划，具体的检查、中西医治疗措施及中医调护 ）
     */
    @Column(name = "TRANSFER_IN_PLAN")
    private String transferInPlan;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PREINCIPLES")
    private String therapeuticPreinciples;

    /**
     * 中药煎煮方法（中药煎煮的方法的描述）
     */
    @Column(name = "TCM_DECOC_PIECE_METHOD")
    private String tcmDecocPieceMethod;

    /**
     * 中药用药方法（中药的用药方法的描述）
     */
    @Column(name = "TCM_USE_METHOD")
    private String tcmUseMethod;

    /**
     * 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    @Column(name = "ORDER_CONTENT")
    private String orderContent;

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
     * 病历原文（医院病历的原始内容）CLOB类型
     */
    @Column(name = "EMR_CONTENT_CLOB")
    private String emrContentClob;

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
     * @return TRANSFER_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param transferId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setTransferId(String transferId) {
        this.transferId = transferId == null ? null : transferId.trim();
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
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @return IN_HOSPITAL_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @param inHospitalTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * 获取入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return IN_DATE - 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * 设置入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param inDate 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    /**
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESC - 入院情况（对患者入院情况的详细描述）
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inConditionDesc 入院情况（对患者入院情况的详细描述）
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
    }

    /**
     * 获取入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return IN_DISEASE_DIAG_CODE - 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getInDiseaseDiagCode() {
        return inDiseaseDiagCode;
    }

    /**
     * 设置入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param inDiseaseDiagCode 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setInDiseaseDiagCode(String inDiseaseDiagCode) {
        this.inDiseaseDiagCode = inDiseaseDiagCode == null ? null : inDiseaseDiagCode.trim();
    }

    /**
     * 获取入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return IN_DISEASE_DIAG_NAME - 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getInDiseaseDiagName() {
        return inDiseaseDiagName;
    }

    /**
     * 设置入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param inDiseaseDiagName 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setInDiseaseDiagName(String inDiseaseDiagName) {
        this.inDiseaseDiagName = inDiseaseDiagName == null ? null : inDiseaseDiagName.trim();
    }

    /**
     * 获取主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @return CHIEF_COMPLAINTS - 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @param chiefComplaints 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取目前情况（对患者当前的情况的描述）
     *
     * @return CURRENT_SITUATION - 目前情况（对患者当前的情况的描述）
     */
    public String getCurrentSituation() {
        return currentSituation;
    }

    /**
     * 设置目前情况（对患者当前的情况的描述）
     *
     * @param currentSituation 目前情况（对患者当前的情况的描述）
     */
    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation == null ? null : currentSituation.trim();
    }

    /**
     * 获取目前诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return CURRENT_DISEASE_DIAG_CODE - 目前诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getCurrentDiseaseDiagCode() {
        return currentDiseaseDiagCode;
    }

    /**
     * 设置目前诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param currentDiseaseDiagCode 目前诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setCurrentDiseaseDiagCode(String currentDiseaseDiagCode) {
        this.currentDiseaseDiagCode = currentDiseaseDiagCode == null ? null : currentDiseaseDiagCode.trim();
    }

    /**
     * 获取目前诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return CURRENT_DISEASE_DIAG_NAME - 目前诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getCurrentDiseaseDiagName() {
        return currentDiseaseDiagName;
    }

    /**
     * 设置目前诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param currentDiseaseDiagName 目前诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setCurrentDiseaseDiagName(String currentDiseaseDiagName) {
        this.currentDiseaseDiagName = currentDiseaseDiagName == null ? null : currentDiseaseDiagName.trim();
    }

    /**
     * 获取转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @return TRANSFER_TYPE_CODE - 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    /**
     * 设置转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @param transferTypeCode 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode == null ? null : transferTypeCode.trim();
    }

    /**
     * 获取转科记录类型名称（标识患者在院期间的转科情况名称）
     *
     * @return TRANSFER_TYPE_NAME - 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    public String getTransferTypeName() {
        return transferTypeName;
    }

    /**
     * 设置转科记录类型名称（标识患者在院期间的转科情况名称）
     *
     * @param transferTypeName 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    public void setTransferTypeName(String transferTypeName) {
        this.transferTypeName = transferTypeName == null ? null : transferTypeName.trim();
    }

    /**
     * 获取转出日期时间 （患者转出的公元纪年日期和时间的完整描述 ）
     *
     * @return TRANSFER_OUT_DATE - 转出日期时间 （患者转出的公元纪年日期和时间的完整描述 ）
     */
    public String getTransferOutDate() {
        return transferOutDate;
    }

    /**
     * 设置转出日期时间 （患者转出的公元纪年日期和时间的完整描述 ）
     *
     * @param transferOutDate 转出日期时间 （患者转出的公元纪年日期和时间的完整描述 ）
     */
    public void setTransferOutDate(String transferOutDate) {
        this.transferOutDate = transferOutDate == null ? null : transferOutDate.trim();
    }

    /**
     * 获取转出科室代码DIR_DEPT（患者转出去的科室代码）
     *
     * @return TRANSFER_OUT_DEPT_CODE - 转出科室代码DIR_DEPT（患者转出去的科室代码）
     */
    public String getTransferOutDeptCode() {
        return transferOutDeptCode;
    }

    /**
     * 设置转出科室代码DIR_DEPT（患者转出去的科室代码）
     *
     * @param transferOutDeptCode 转出科室代码DIR_DEPT（患者转出去的科室代码）
     */
    public void setTransferOutDeptCode(String transferOutDeptCode) {
        this.transferOutDeptCode = transferOutDeptCode == null ? null : transferOutDeptCode.trim();
    }

    /**
     * 获取转出科室名称（患者转出去的科室代码）
     *
     * @return TRANSFER_OUT_DEPT_NAME - 转出科室名称（患者转出去的科室代码）
     */
    public String getTransferOutDeptName() {
        return transferOutDeptName;
    }

    /**
     * 设置转出科室名称（患者转出去的科室代码）
     *
     * @param transferOutDeptName 转出科室名称（患者转出去的科室代码）
     */
    public void setTransferOutDeptName(String transferOutDeptName) {
        this.transferOutDeptName = transferOutDeptName == null ? null : transferOutDeptName.trim();
    }

    /**
     * 获取转出医师签名 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_OUT_DOCTOR_NAME - 转出医师签名 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferOutDoctorName() {
        return transferOutDoctorName;
    }

    /**
     * 设置转出医师签名 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferOutDoctorName 转出医师签名 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferOutDoctorName(String transferOutDoctorName) {
        this.transferOutDoctorName = transferOutDoctorName == null ? null : transferOutDoctorName.trim();
    }

    /**
     * 获取转入日期时间 （患者转入的公元纪年日期和时间的完整描述 ）
     *
     * @return TRANSFER_IN_DATE - 转入日期时间 （患者转入的公元纪年日期和时间的完整描述 ）
     */
    public String getTransferInDate() {
        return transferInDate;
    }

    /**
     * 设置转入日期时间 （患者转入的公元纪年日期和时间的完整描述 ）
     *
     * @param transferInDate 转入日期时间 （患者转入的公元纪年日期和时间的完整描述 ）
     */
    public void setTransferInDate(String transferInDate) {
        this.transferInDate = transferInDate == null ? null : transferInDate.trim();
    }

    /**
     * 获取转入科室代码DIR_DEPT（患者转入的科室代码）
     *
     * @return TRANSFER_IN_DEPT_CODE - 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    public String getTransferInDeptCode() {
        return transferInDeptCode;
    }

    /**
     * 设置转入科室代码DIR_DEPT（患者转入的科室代码）
     *
     * @param transferInDeptCode 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    public void setTransferInDeptCode(String transferInDeptCode) {
        this.transferInDeptCode = transferInDeptCode == null ? null : transferInDeptCode.trim();
    }

    /**
     * 获取转入科室名称（患者转入的科室代码）
     *
     * @return TRANSFER_IN_DEPT_NAME - 转入科室名称（患者转入的科室代码）
     */
    public String getTransferInDeptName() {
        return transferInDeptName;
    }

    /**
     * 设置转入科室名称（患者转入的科室代码）
     *
     * @param transferInDeptName 转入科室名称（患者转入的科室代码）
     */
    public void setTransferInDeptName(String transferInDeptName) {
        this.transferInDeptName = transferInDeptName == null ? null : transferInDeptName.trim();
    }

    /**
     * 获取转入医师签名 （转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_IN_DOCTOR_NAME - 转入医师签名 （转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferInDoctorName() {
        return transferInDoctorName;
    }

    /**
     * 设置转入医师签名 （转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferInDoctorName 转入医师签名 （转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferInDoctorName(String transferInDoctorName) {
        this.transferInDoctorName = transferInDoctorName == null ? null : transferInDoctorName.trim();
    }

    /**
     * 获取转科目的（对患者转科目的的详细描述）
     *
     * @return TRANSFER_REASON - 转科目的（对患者转科目的的详细描述）
     */
    public String getTransferReason() {
        return transferReason;
    }

    /**
     * 设置转科目的（对患者转科目的的详细描述）
     *
     * @param transferReason 转科目的（对患者转科目的的详细描述）
     */
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    /**
     * 获取转科注意事项 （对患者转科需要注意的事项的描述）
     *
     * @return NOTICE - 转科注意事项 （对患者转科需要注意的事项的描述）
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置转科注意事项 （对患者转科需要注意的事项的描述）
     *
     * @param notice 转科注意事项 （对患者转科需要注意的事项的描述）
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * 获取转入诊疗计划 （患者转入科室后的诊疗计划，具体的检查、中西医治疗措施及中医调护 ）
     *
     * @return TRANSFER_IN_PLAN - 转入诊疗计划 （患者转入科室后的诊疗计划，具体的检查、中西医治疗措施及中医调护 ）
     */
    public String getTransferInPlan() {
        return transferInPlan;
    }

    /**
     * 设置转入诊疗计划 （患者转入科室后的诊疗计划，具体的检查、中西医治疗措施及中医调护 ）
     *
     * @param transferInPlan 转入诊疗计划 （患者转入科室后的诊疗计划，具体的检查、中西医治疗措施及中医调护 ）
     */
    public void setTransferInPlan(String transferInPlan) {
        this.transferInPlan = transferInPlan == null ? null : transferInPlan.trim();
    }

    /**
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PREINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPreinciples() {
        return therapeuticPreinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPreinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPreinciples(String therapeuticPreinciples) {
        this.therapeuticPreinciples = therapeuticPreinciples == null ? null : therapeuticPreinciples.trim();
    }

    /**
     * 获取中药煎煮方法（中药煎煮的方法的描述）
     *
     * @return TCM_DECOC_PIECE_METHOD - 中药煎煮方法（中药煎煮的方法的描述）
     */
    public String getTcmDecocPieceMethod() {
        return tcmDecocPieceMethod;
    }

    /**
     * 设置中药煎煮方法（中药煎煮的方法的描述）
     *
     * @param tcmDecocPieceMethod 中药煎煮方法（中药煎煮的方法的描述）
     */
    public void setTcmDecocPieceMethod(String tcmDecocPieceMethod) {
        this.tcmDecocPieceMethod = tcmDecocPieceMethod == null ? null : tcmDecocPieceMethod.trim();
    }

    /**
     * 获取中药用药方法（中药的用药方法的描述）
     *
     * @return TCM_USE_METHOD - 中药用药方法（中药的用药方法的描述）
     */
    public String getTcmUseMethod() {
        return tcmUseMethod;
    }

    /**
     * 设置中药用药方法（中药的用药方法的描述）
     *
     * @param tcmUseMethod 中药用药方法（中药的用药方法的描述）
     */
    public void setTcmUseMethod(String tcmUseMethod) {
        this.tcmUseMethod = tcmUseMethod == null ? null : tcmUseMethod.trim();
    }

    /**
     * 获取医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     *
     * @return ORDER_CONTENT - 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * 设置医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     *
     * @param orderContent 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
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

    /**
     * 获取病历原文（医院病历的原始内容）CLOB类型
     *
     * @return EMR_CONTENT_CLOB - 病历原文（医院病历的原始内容）CLOB类型
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * 设置病历原文（医院病历的原始内容）CLOB类型
     *
     * @param emrContentClob 病历原文（医院病历的原始内容）CLOB类型
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}