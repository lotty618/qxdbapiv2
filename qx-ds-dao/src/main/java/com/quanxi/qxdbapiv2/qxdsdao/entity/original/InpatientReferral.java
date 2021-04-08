package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_REFERRAL")
public class InpatientReferral {
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
     * 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    @Id
    @Column(name = "CHANGE_NO")
    private String changeNo;

    /**
     * 转出医疗机构代码DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Column(name = "REFERFROM_ORG_CODE")
    private String referfromOrgCode;

    /**
     * 转出医疗机构名称（患者转诊转出的医疗卫生机构的组织机构名称 ）
     */
    @Column(name = "REFERFROM_ORG_NAME")
    private String referfromOrgName;

    /**
     * 转出医疗机构科室代码DIR_DEPT（患者转诊转出的科室代码）
     */
    @Column(name = "REFERFROM_DEPT_CODE")
    private String referfromDeptCode;

    /**
     * 转出医疗机构科室中文名称（患者转诊转出的科室中文名称）
     */
    @Column(name = "REFERFROM_DEPT_NAME")
    private String referfromDeptName;

    /**
     * 转入医疗机构代码DIR_ORG（患者转诊转入的机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Column(name = "REFERTO_ORG_CODE")
    private String refertoOrgCode;

    /**
     * 转入医疗机构名称（患者转诊转入的医疗卫生机构的组织机构名称 ）
     */
    @Column(name = "REFERTO_ORG_NAME")
    private String refertoOrgName;

    /**
     * 转入医疗机构科室代码DIR_DEPT（患者转诊转入的科室代码）
     */
    @Column(name = "REFERTO_DEPT_CODE")
    private String refertoDeptCode;

    /**
     * 转入医疗机构科室中文名称（患者转诊转入的科室中文名称）
     */
    @Column(name = "REFERTO_DEPT_NAME")
    private String refertoDeptName;

    /**
     * 转诊日期（患者转诊当日的公元纪年日期的完整描述 ）
     */
    @Column(name = "REFERRAL_DATE")
    private String referralDate;

    /**
     * 转诊原因（对患者转诊原因的简要描述）
     */
    @Column(name = "REFERRAL_REASON")
    private String referralReason;

    /**
     * 转诊记录（对患者转诊过程的描述）
     */
    @Column(name = "REFERRAL_RECORDS")
    private String referralRecords;

    /**
     * 治疗方案（今后治疗方案的详细描述）
     */
    @Column(name = "TREATMENT_PROPOSAL")
    private String treatmentProposal;

    /**
     * 康复措施指导（医师对患者实施康复措施指导的描述）
     */
    @Column(name = "MENTAL_REHAB_MEANS_GUIDE")
    private String mentalRehabMeansGuide;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "INPATIENT_CONDITION_DESC")
    private String inpatientConditionDesc;

    /**
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 中医“四诊”观察结果 （中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语 ）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

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
     * 中药处方医嘱内容 （对中药处方医嘱内容的详细描述 ）
     */
    @Column(name = "TCM_ORDER_CONTENT")
    private String tcmOrderContent;

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
     * 注意事项（对可能出现问题及采取相应措施的描述 ）
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 转科记录类型DIR_CHANGE_DEPT_TYPE（患者在院期间转科记录类别的分类代码 ）
     */
    @Column(name = "TRANSFER_RECORD_TYPE")
    private String transferRecordType;

    /**
     * 转科记录类型中文名称（患者在院期间转科记录类别的分类中文名称 ）
     */
    @Column(name = "TRANSFER_RECORD_TYPE_CN")
    private String transferRecordTypeCn;

    /**
     * 转出医师签名（转出医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_OUT_SIGNATURE")
    private String transferOutSignature;

    /**
     * 转入日期（患者转入时的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "TRANSFER_IN_DATE")
    private String transferInDate;

    /**
     * 转入医师签名（患者转入科室的相关医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_IN_SIGNATURE")
    private String transferInSignature;

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
     * 获取转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @return CHANGE_NO - 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public String getChangeNo() {
        return changeNo;
    }

    /**
     * 设置转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @param changeNo 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public void setChangeNo(String changeNo) {
        this.changeNo = changeNo == null ? null : changeNo.trim();
    }

    /**
     * 获取转出医疗机构代码DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @return REFERFROM_ORG_CODE - 转出医疗机构代码DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public String getReferfromOrgCode() {
        return referfromOrgCode;
    }

    /**
     * 设置转出医疗机构代码DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @param referfromOrgCode 转出医疗机构代码DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public void setReferfromOrgCode(String referfromOrgCode) {
        this.referfromOrgCode = referfromOrgCode == null ? null : referfromOrgCode.trim();
    }

    /**
     * 获取转出医疗机构名称（患者转诊转出的医疗卫生机构的组织机构名称 ）
     *
     * @return REFERFROM_ORG_NAME - 转出医疗机构名称（患者转诊转出的医疗卫生机构的组织机构名称 ）
     */
    public String getReferfromOrgName() {
        return referfromOrgName;
    }

    /**
     * 设置转出医疗机构名称（患者转诊转出的医疗卫生机构的组织机构名称 ）
     *
     * @param referfromOrgName 转出医疗机构名称（患者转诊转出的医疗卫生机构的组织机构名称 ）
     */
    public void setReferfromOrgName(String referfromOrgName) {
        this.referfromOrgName = referfromOrgName == null ? null : referfromOrgName.trim();
    }

    /**
     * 获取转出医疗机构科室代码DIR_DEPT（患者转诊转出的科室代码）
     *
     * @return REFERFROM_DEPT_CODE - 转出医疗机构科室代码DIR_DEPT（患者转诊转出的科室代码）
     */
    public String getReferfromDeptCode() {
        return referfromDeptCode;
    }

    /**
     * 设置转出医疗机构科室代码DIR_DEPT（患者转诊转出的科室代码）
     *
     * @param referfromDeptCode 转出医疗机构科室代码DIR_DEPT（患者转诊转出的科室代码）
     */
    public void setReferfromDeptCode(String referfromDeptCode) {
        this.referfromDeptCode = referfromDeptCode == null ? null : referfromDeptCode.trim();
    }

    /**
     * 获取转出医疗机构科室中文名称（患者转诊转出的科室中文名称）
     *
     * @return REFERFROM_DEPT_NAME - 转出医疗机构科室中文名称（患者转诊转出的科室中文名称）
     */
    public String getReferfromDeptName() {
        return referfromDeptName;
    }

    /**
     * 设置转出医疗机构科室中文名称（患者转诊转出的科室中文名称）
     *
     * @param referfromDeptName 转出医疗机构科室中文名称（患者转诊转出的科室中文名称）
     */
    public void setReferfromDeptName(String referfromDeptName) {
        this.referfromDeptName = referfromDeptName == null ? null : referfromDeptName.trim();
    }

    /**
     * 获取转入医疗机构代码DIR_ORG（患者转诊转入的机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @return REFERTO_ORG_CODE - 转入医疗机构代码DIR_ORG（患者转诊转入的机构对应的针对组织机构的特定编码体系中的代码）
     */
    public String getRefertoOrgCode() {
        return refertoOrgCode;
    }

    /**
     * 设置转入医疗机构代码DIR_ORG（患者转诊转入的机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @param refertoOrgCode 转入医疗机构代码DIR_ORG（患者转诊转入的机构对应的针对组织机构的特定编码体系中的代码）
     */
    public void setRefertoOrgCode(String refertoOrgCode) {
        this.refertoOrgCode = refertoOrgCode == null ? null : refertoOrgCode.trim();
    }

    /**
     * 获取转入医疗机构名称（患者转诊转入的医疗卫生机构的组织机构名称 ）
     *
     * @return REFERTO_ORG_NAME - 转入医疗机构名称（患者转诊转入的医疗卫生机构的组织机构名称 ）
     */
    public String getRefertoOrgName() {
        return refertoOrgName;
    }

    /**
     * 设置转入医疗机构名称（患者转诊转入的医疗卫生机构的组织机构名称 ）
     *
     * @param refertoOrgName 转入医疗机构名称（患者转诊转入的医疗卫生机构的组织机构名称 ）
     */
    public void setRefertoOrgName(String refertoOrgName) {
        this.refertoOrgName = refertoOrgName == null ? null : refertoOrgName.trim();
    }

    /**
     * 获取转入医疗机构科室代码DIR_DEPT（患者转诊转入的科室代码）
     *
     * @return REFERTO_DEPT_CODE - 转入医疗机构科室代码DIR_DEPT（患者转诊转入的科室代码）
     */
    public String getRefertoDeptCode() {
        return refertoDeptCode;
    }

    /**
     * 设置转入医疗机构科室代码DIR_DEPT（患者转诊转入的科室代码）
     *
     * @param refertoDeptCode 转入医疗机构科室代码DIR_DEPT（患者转诊转入的科室代码）
     */
    public void setRefertoDeptCode(String refertoDeptCode) {
        this.refertoDeptCode = refertoDeptCode == null ? null : refertoDeptCode.trim();
    }

    /**
     * 获取转入医疗机构科室中文名称（患者转诊转入的科室中文名称）
     *
     * @return REFERTO_DEPT_NAME - 转入医疗机构科室中文名称（患者转诊转入的科室中文名称）
     */
    public String getRefertoDeptName() {
        return refertoDeptName;
    }

    /**
     * 设置转入医疗机构科室中文名称（患者转诊转入的科室中文名称）
     *
     * @param refertoDeptName 转入医疗机构科室中文名称（患者转诊转入的科室中文名称）
     */
    public void setRefertoDeptName(String refertoDeptName) {
        this.refertoDeptName = refertoDeptName == null ? null : refertoDeptName.trim();
    }

    /**
     * 获取转诊日期（患者转诊当日的公元纪年日期的完整描述 ）
     *
     * @return REFERRAL_DATE - 转诊日期（患者转诊当日的公元纪年日期的完整描述 ）
     */
    public String getReferralDate() {
        return referralDate;
    }

    /**
     * 设置转诊日期（患者转诊当日的公元纪年日期的完整描述 ）
     *
     * @param referralDate 转诊日期（患者转诊当日的公元纪年日期的完整描述 ）
     */
    public void setReferralDate(String referralDate) {
        this.referralDate = referralDate == null ? null : referralDate.trim();
    }

    /**
     * 获取转诊原因（对患者转诊原因的简要描述）
     *
     * @return REFERRAL_REASON - 转诊原因（对患者转诊原因的简要描述）
     */
    public String getReferralReason() {
        return referralReason;
    }

    /**
     * 设置转诊原因（对患者转诊原因的简要描述）
     *
     * @param referralReason 转诊原因（对患者转诊原因的简要描述）
     */
    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason == null ? null : referralReason.trim();
    }

    /**
     * 获取转诊记录（对患者转诊过程的描述）
     *
     * @return REFERRAL_RECORDS - 转诊记录（对患者转诊过程的描述）
     */
    public String getReferralRecords() {
        return referralRecords;
    }

    /**
     * 设置转诊记录（对患者转诊过程的描述）
     *
     * @param referralRecords 转诊记录（对患者转诊过程的描述）
     */
    public void setReferralRecords(String referralRecords) {
        this.referralRecords = referralRecords == null ? null : referralRecords.trim();
    }

    /**
     * 获取治疗方案（今后治疗方案的详细描述）
     *
     * @return TREATMENT_PROPOSAL - 治疗方案（今后治疗方案的详细描述）
     */
    public String getTreatmentProposal() {
        return treatmentProposal;
    }

    /**
     * 设置治疗方案（今后治疗方案的详细描述）
     *
     * @param treatmentProposal 治疗方案（今后治疗方案的详细描述）
     */
    public void setTreatmentProposal(String treatmentProposal) {
        this.treatmentProposal = treatmentProposal == null ? null : treatmentProposal.trim();
    }

    /**
     * 获取康复措施指导（医师对患者实施康复措施指导的描述）
     *
     * @return MENTAL_REHAB_MEANS_GUIDE - 康复措施指导（医师对患者实施康复措施指导的描述）
     */
    public String getMentalRehabMeansGuide() {
        return mentalRehabMeansGuide;
    }

    /**
     * 设置康复措施指导（医师对患者实施康复措施指导的描述）
     *
     * @param mentalRehabMeansGuide 康复措施指导（医师对患者实施康复措施指导的描述）
     */
    public void setMentalRehabMeansGuide(String mentalRehabMeansGuide) {
        this.mentalRehabMeansGuide = mentalRehabMeansGuide == null ? null : mentalRehabMeansGuide.trim();
    }

    /**
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return INPATIENT_CONDITION_DESC - 入院情况（对患者入院情况的详细描述）
     */
    public String getInpatientConditionDesc() {
        return inpatientConditionDesc;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inpatientConditionDesc 入院情况（对患者入院情况的详细描述）
     */
    public void setInpatientConditionDesc(String inpatientConditionDesc) {
        this.inpatientConditionDesc = inpatientConditionDesc == null ? null : inpatientConditionDesc.trim();
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
     * 获取中医“四诊”观察结果 （中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果 （中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果 （中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @param tcmObserve 中医“四诊”观察结果 （中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语 ）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语 ）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语 ）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语 ）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
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
     * 获取中药处方医嘱内容 （对中药处方医嘱内容的详细描述 ）
     *
     * @return TCM_ORDER_CONTENT - 中药处方医嘱内容 （对中药处方医嘱内容的详细描述 ）
     */
    public String getTcmOrderContent() {
        return tcmOrderContent;
    }

    /**
     * 设置中药处方医嘱内容 （对中药处方医嘱内容的详细描述 ）
     *
     * @param tcmOrderContent 中药处方医嘱内容 （对中药处方医嘱内容的详细描述 ）
     */
    public void setTcmOrderContent(String tcmOrderContent) {
        this.tcmOrderContent = tcmOrderContent == null ? null : tcmOrderContent.trim();
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
     * 获取注意事项（对可能出现问题及采取相应措施的描述 ）
     *
     * @return OPERATION_NOTE - 注意事项（对可能出现问题及采取相应措施的描述 ）
     */
    public String getOperationNote() {
        return operationNote;
    }

    /**
     * 设置注意事项（对可能出现问题及采取相应措施的描述 ）
     *
     * @param operationNote 注意事项（对可能出现问题及采取相应措施的描述 ）
     */
    public void setOperationNote(String operationNote) {
        this.operationNote = operationNote == null ? null : operationNote.trim();
    }

    /**
     * 获取转科记录类型DIR_CHANGE_DEPT_TYPE（患者在院期间转科记录类别的分类代码 ）
     *
     * @return TRANSFER_RECORD_TYPE - 转科记录类型DIR_CHANGE_DEPT_TYPE（患者在院期间转科记录类别的分类代码 ）
     */
    public String getTransferRecordType() {
        return transferRecordType;
    }

    /**
     * 设置转科记录类型DIR_CHANGE_DEPT_TYPE（患者在院期间转科记录类别的分类代码 ）
     *
     * @param transferRecordType 转科记录类型DIR_CHANGE_DEPT_TYPE（患者在院期间转科记录类别的分类代码 ）
     */
    public void setTransferRecordType(String transferRecordType) {
        this.transferRecordType = transferRecordType == null ? null : transferRecordType.trim();
    }

    /**
     * 获取转科记录类型中文名称（患者在院期间转科记录类别的分类中文名称 ）
     *
     * @return TRANSFER_RECORD_TYPE_CN - 转科记录类型中文名称（患者在院期间转科记录类别的分类中文名称 ）
     */
    public String getTransferRecordTypeCn() {
        return transferRecordTypeCn;
    }

    /**
     * 设置转科记录类型中文名称（患者在院期间转科记录类别的分类中文名称 ）
     *
     * @param transferRecordTypeCn 转科记录类型中文名称（患者在院期间转科记录类别的分类中文名称 ）
     */
    public void setTransferRecordTypeCn(String transferRecordTypeCn) {
        this.transferRecordTypeCn = transferRecordTypeCn == null ? null : transferRecordTypeCn.trim();
    }

    /**
     * 获取转出医师签名（转出医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_OUT_SIGNATURE - 转出医师签名（转出医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferOutSignature() {
        return transferOutSignature;
    }

    /**
     * 设置转出医师签名（转出医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferOutSignature 转出医师签名（转出医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferOutSignature(String transferOutSignature) {
        this.transferOutSignature = transferOutSignature == null ? null : transferOutSignature.trim();
    }

    /**
     * 获取转入日期（患者转入时的公元纪年日期和时间的完整描述 ）
     *
     * @return TRANSFER_IN_DATE - 转入日期（患者转入时的公元纪年日期和时间的完整描述 ）
     */
    public String getTransferInDate() {
        return transferInDate;
    }

    /**
     * 设置转入日期（患者转入时的公元纪年日期和时间的完整描述 ）
     *
     * @param transferInDate 转入日期（患者转入时的公元纪年日期和时间的完整描述 ）
     */
    public void setTransferInDate(String transferInDate) {
        this.transferInDate = transferInDate == null ? null : transferInDate.trim();
    }

    /**
     * 获取转入医师签名（患者转入科室的相关医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_IN_SIGNATURE - 转入医师签名（患者转入科室的相关医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferInSignature() {
        return transferInSignature;
    }

    /**
     * 设置转入医师签名（患者转入科室的相关医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferInSignature 转入医师签名（患者转入科室的相关医师签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferInSignature(String transferInSignature) {
        this.transferInSignature = transferInSignature == null ? null : transferInSignature.trim();
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