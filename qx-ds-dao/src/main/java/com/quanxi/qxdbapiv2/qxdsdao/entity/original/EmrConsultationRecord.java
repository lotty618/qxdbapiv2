package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_CONSULTATION_RECORD")
public class EmrConsultationRecord {
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
     * 会诊记录表编号[主键]（医疗机构开具的会诊单的编号）
     */
    @Id
    @Column(name = "CONSULT_RECORD_NO")
    private String consultRecordNo;

    /**
     * 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "DISEASE_DIAG_CODE")
    private String diseaseDiagCode;

    /**
     * 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "DISEASE_DIAG_NAME")
    private String diseaseDiagName;

    /**
     * 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    @Column(name = "CONSULTATION_PURPOSE")
    private String consultationPurpose;

    /**
     * 病历摘要（对患者病情摘要的描述）
     */
    @Column(name = "CASE_HISTORY_SUMMARY")
    private String caseHistorySummary;

    /**
     * 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    @Column(name = "ASSIST_EXAM_RESULT")
    private String assistExamResult;

    /**
     * 诊疗过程名称（诊疗过程的名称描述）
     */
    @Column(name = "TREATDIAG_PROCESS_NAME")
    private String treatdiagProcessName;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    @Column(name = "CONSULT_REASON")
    private String consultReason;

    /**
     * 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    @Column(name = "CONSULTATION_TYPE")
    private String consultationType;

    /**
     * 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    @Column(name = "CONSULT_APPLY_DEPT_CODE")
    private String consultApplyDeptCode;

    /**
     * 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    @Column(name = "CONSULT_APPLY_DEPT_CN")
    private String consultApplyDeptCn;

    /**
     * 会诊申请医院 （申请会诊医院的名称 ）
     */
    @Column(name = "CONSULT_APPLY_HOSPITAL")
    private String consultApplyHospital;

    /**
     * 申请会诊医师签名 （申请会诊的医师签署的在公安管理部门正式登记注册姓氏和名称 ）
     */
    @Column(name = "CONSULT_APPLY_DOCTOR")
    private String consultApplyDoctor;

    /**
     * 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    @Column(name = "CONSULT_ADVICE")
    private String consultAdvice;

    /**
     * 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CONSULT_DOCTOR_NAME")
    private String consultDoctorName;

    /**
     * 会诊执行科室代码DIR_DEPT（会诊执行科室代码）
     */
    @Column(name = "CONSULTATION_DEPT_CODE")
    private String consultationDeptCode;

    /**
     * 会诊执行科室中文名称（会诊执行科室中文名称）
     */
    @Column(name = "CONSULTATION_DEPT_CN")
    private String consultationDeptCn;

    /**
     * 会诊所在医疗机构代码DIR_ORG（会诊所在机构对应的针对组织机构的特定编码体系中的代码 ）
     */
    @Column(name = "CONSULT_ORG_CODE")
    private String consultOrgCode;

    /**
     * 会诊所在医疗机构中文名称（会诊所在机构对应的针对组织机构的特定编码体系中的中文名称）
     */
    @Column(name = "CONSULT_ORG_NAME")
    private String consultOrgName;

    /**
     * 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    @Column(name = "CONSULT_DATE")
    private String consultDate;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

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
     * 获取会诊记录表编号[主键]（医疗机构开具的会诊单的编号）
     *
     * @return CONSULT_RECORD_NO - 会诊记录表编号[主键]（医疗机构开具的会诊单的编号）
     */
    public String getConsultRecordNo() {
        return consultRecordNo;
    }

    /**
     * 设置会诊记录表编号[主键]（医疗机构开具的会诊单的编号）
     *
     * @param consultRecordNo 会诊记录表编号[主键]（医疗机构开具的会诊单的编号）
     */
    public void setConsultRecordNo(String consultRecordNo) {
        this.consultRecordNo = consultRecordNo == null ? null : consultRecordNo.trim();
    }

    /**
     * 获取疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return DISEASE_DIAG_CODE - 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getDiseaseDiagCode() {
        return diseaseDiagCode;
    }

    /**
     * 设置疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param diseaseDiagCode 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setDiseaseDiagCode(String diseaseDiagCode) {
        this.diseaseDiagCode = diseaseDiagCode == null ? null : diseaseDiagCode.trim();
    }

    /**
     * 获取疾病诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return DISEASE_DIAG_NAME - 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getDiseaseDiagName() {
        return diseaseDiagName;
    }

    /**
     * 设置疾病诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param diseaseDiagName 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setDiseaseDiagName(String diseaseDiagName) {
        this.diseaseDiagName = diseaseDiagName == null ? null : diseaseDiagName.trim();
    }

    /**
     * 获取会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     *
     * @return CONSULTATION_PURPOSE - 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    public String getConsultationPurpose() {
        return consultationPurpose;
    }

    /**
     * 设置会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     *
     * @param consultationPurpose 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    public void setConsultationPurpose(String consultationPurpose) {
        this.consultationPurpose = consultationPurpose == null ? null : consultationPurpose.trim();
    }

    /**
     * 获取病历摘要（对患者病情摘要的描述）
     *
     * @return CASE_HISTORY_SUMMARY - 病历摘要（对患者病情摘要的描述）
     */
    public String getCaseHistorySummary() {
        return caseHistorySummary;
    }

    /**
     * 设置病历摘要（对患者病情摘要的描述）
     *
     * @param caseHistorySummary 病历摘要（对患者病情摘要的描述）
     */
    public void setCaseHistorySummary(String caseHistorySummary) {
        this.caseHistorySummary = caseHistorySummary == null ? null : caseHistorySummary.trim();
    }

    /**
     * 获取辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     *
     * @return ASSIST_EXAM_RESULT - 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    public String getAssistExamResult() {
        return assistExamResult;
    }

    /**
     * 设置辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     *
     * @param assistExamResult 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    public void setAssistExamResult(String assistExamResult) {
        this.assistExamResult = assistExamResult == null ? null : assistExamResult.trim();
    }

    /**
     * 获取诊疗过程名称（诊疗过程的名称描述）
     *
     * @return TREATDIAG_PROCESS_NAME - 诊疗过程名称（诊疗过程的名称描述）
     */
    public String getTreatdiagProcessName() {
        return treatdiagProcessName;
    }

    /**
     * 设置诊疗过程名称（诊疗过程的名称描述）
     *
     * @param treatdiagProcessName 诊疗过程名称（诊疗过程的名称描述）
     */
    public void setTreatdiagProcessName(String treatdiagProcessName) {
        this.treatdiagProcessName = treatdiagProcessName == null ? null : treatdiagProcessName.trim();
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
     * 获取会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     *
     * @return CONSULT_REASON - 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    public String getConsultReason() {
        return consultReason;
    }

    /**
     * 设置会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     *
     * @param consultReason 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    public void setConsultReason(String consultReason) {
        this.consultReason = consultReason == null ? null : consultReason.trim();
    }

    /**
     * 获取会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     *
     * @return CONSULTATION_TYPE - 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    public String getConsultationType() {
        return consultationType;
    }

    /**
     * 设置会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     *
     * @param consultationType 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType == null ? null : consultationType.trim();
    }

    /**
     * 获取会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     *
     * @return CONSULT_APPLY_DEPT_CODE - 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    public String getConsultApplyDeptCode() {
        return consultApplyDeptCode;
    }

    /**
     * 设置会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     *
     * @param consultApplyDeptCode 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    public void setConsultApplyDeptCode(String consultApplyDeptCode) {
        this.consultApplyDeptCode = consultApplyDeptCode == null ? null : consultApplyDeptCode.trim();
    }

    /**
     * 获取会诊申请科室中文名称（申请会诊的科室中文名称）
     *
     * @return CONSULT_APPLY_DEPT_CN - 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    public String getConsultApplyDeptCn() {
        return consultApplyDeptCn;
    }

    /**
     * 设置会诊申请科室中文名称（申请会诊的科室中文名称）
     *
     * @param consultApplyDeptCn 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    public void setConsultApplyDeptCn(String consultApplyDeptCn) {
        this.consultApplyDeptCn = consultApplyDeptCn == null ? null : consultApplyDeptCn.trim();
    }

    /**
     * 获取会诊申请医院 （申请会诊医院的名称 ）
     *
     * @return CONSULT_APPLY_HOSPITAL - 会诊申请医院 （申请会诊医院的名称 ）
     */
    public String getConsultApplyHospital() {
        return consultApplyHospital;
    }

    /**
     * 设置会诊申请医院 （申请会诊医院的名称 ）
     *
     * @param consultApplyHospital 会诊申请医院 （申请会诊医院的名称 ）
     */
    public void setConsultApplyHospital(String consultApplyHospital) {
        this.consultApplyHospital = consultApplyHospital == null ? null : consultApplyHospital.trim();
    }

    /**
     * 获取申请会诊医师签名 （申请会诊的医师签署的在公安管理部门正式登记注册姓氏和名称 ）
     *
     * @return CONSULT_APPLY_DOCTOR - 申请会诊医师签名 （申请会诊的医师签署的在公安管理部门正式登记注册姓氏和名称 ）
     */
    public String getConsultApplyDoctor() {
        return consultApplyDoctor;
    }

    /**
     * 设置申请会诊医师签名 （申请会诊的医师签署的在公安管理部门正式登记注册姓氏和名称 ）
     *
     * @param consultApplyDoctor 申请会诊医师签名 （申请会诊的医师签署的在公安管理部门正式登记注册姓氏和名称 ）
     */
    public void setConsultApplyDoctor(String consultApplyDoctor) {
        this.consultApplyDoctor = consultApplyDoctor == null ? null : consultApplyDoctor.trim();
    }

    /**
     * 获取会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     *
     * @return CONSULT_ADVICE - 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    public String getConsultAdvice() {
        return consultAdvice;
    }

    /**
     * 设置会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     *
     * @param consultAdvice 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    public void setConsultAdvice(String consultAdvice) {
        this.consultAdvice = consultAdvice == null ? null : consultAdvice.trim();
    }

    /**
     * 获取会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CONSULT_DOCTOR_NAME - 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getConsultDoctorName() {
        return consultDoctorName;
    }

    /**
     * 设置会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param consultDoctorName 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setConsultDoctorName(String consultDoctorName) {
        this.consultDoctorName = consultDoctorName == null ? null : consultDoctorName.trim();
    }

    /**
     * 获取会诊执行科室代码DIR_DEPT（会诊执行科室代码）
     *
     * @return CONSULTATION_DEPT_CODE - 会诊执行科室代码DIR_DEPT（会诊执行科室代码）
     */
    public String getConsultationDeptCode() {
        return consultationDeptCode;
    }

    /**
     * 设置会诊执行科室代码DIR_DEPT（会诊执行科室代码）
     *
     * @param consultationDeptCode 会诊执行科室代码DIR_DEPT（会诊执行科室代码）
     */
    public void setConsultationDeptCode(String consultationDeptCode) {
        this.consultationDeptCode = consultationDeptCode == null ? null : consultationDeptCode.trim();
    }

    /**
     * 获取会诊执行科室中文名称（会诊执行科室中文名称）
     *
     * @return CONSULTATION_DEPT_CN - 会诊执行科室中文名称（会诊执行科室中文名称）
     */
    public String getConsultationDeptCn() {
        return consultationDeptCn;
    }

    /**
     * 设置会诊执行科室中文名称（会诊执行科室中文名称）
     *
     * @param consultationDeptCn 会诊执行科室中文名称（会诊执行科室中文名称）
     */
    public void setConsultationDeptCn(String consultationDeptCn) {
        this.consultationDeptCn = consultationDeptCn == null ? null : consultationDeptCn.trim();
    }

    /**
     * 获取会诊所在医疗机构代码DIR_ORG（会诊所在机构对应的针对组织机构的特定编码体系中的代码 ）
     *
     * @return CONSULT_ORG_CODE - 会诊所在医疗机构代码DIR_ORG（会诊所在机构对应的针对组织机构的特定编码体系中的代码 ）
     */
    public String getConsultOrgCode() {
        return consultOrgCode;
    }

    /**
     * 设置会诊所在医疗机构代码DIR_ORG（会诊所在机构对应的针对组织机构的特定编码体系中的代码 ）
     *
     * @param consultOrgCode 会诊所在医疗机构代码DIR_ORG（会诊所在机构对应的针对组织机构的特定编码体系中的代码 ）
     */
    public void setConsultOrgCode(String consultOrgCode) {
        this.consultOrgCode = consultOrgCode == null ? null : consultOrgCode.trim();
    }

    /**
     * 获取会诊所在医疗机构中文名称（会诊所在机构对应的针对组织机构的特定编码体系中的中文名称）
     *
     * @return CONSULT_ORG_NAME - 会诊所在医疗机构中文名称（会诊所在机构对应的针对组织机构的特定编码体系中的中文名称）
     */
    public String getConsultOrgName() {
        return consultOrgName;
    }

    /**
     * 设置会诊所在医疗机构中文名称（会诊所在机构对应的针对组织机构的特定编码体系中的中文名称）
     *
     * @param consultOrgName 会诊所在医疗机构中文名称（会诊所在机构对应的针对组织机构的特定编码体系中的中文名称）
     */
    public void setConsultOrgName(String consultOrgName) {
        this.consultOrgName = consultOrgName == null ? null : consultOrgName.trim();
    }

    /**
     * 获取会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     *
     * @return CONSULT_DATE - 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    public String getConsultDate() {
        return consultDate;
    }

    /**
     * 设置会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     *
     * @param consultDate 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    public void setConsultDate(String consultDate) {
        this.consultDate = consultDate == null ? null : consultDate.trim();
    }

    /**
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
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