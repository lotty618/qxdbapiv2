package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "IN_MEDICAL_RECORD_DIAG")
public class InMedicalRecordDiag {
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
     * 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "DIAGNOSIS_ID")
    private String diagnosisId;

    /**
     * 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    @Column(name = "CASE_TYPE_CODE")
    private String caseTypeCode;

    /**
     * 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    @Column(name = "CASE_TYPE_CN")
    private String caseTypeCn;

    /**
     * 机构类别（大类）代码DIR_CLASS_CODE（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_TYPE_CODE")
    private String orgTypeCode;

    /**
     * 机构类别（大类）中文名称（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的中文名称）
     */
    @Column(name = "ORG_TYPE_CN")
    private String orgTypeCn;

    /**
     * 诊断编码  ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 疾病诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 入院病情代码CV05.10.019（入院病情所对应的代码）
     */
    @Column(name = "IN_CONDITION_CODE")
    private String inConditionCode;

    /**
     * 入院病情中文名称（入院病情所对应的中文名称）
     */
    @Column(name = "IN_CONDITION_CN")
    private String inConditionCn;

    /**
     * 入院后确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期）
     */
    @Column(name = "LAST_DIAGNOSIS_DATE")
    private String lastDiagnosisDate;

    /**
     * 诊断结果（对患者罹患疾病诊断结果的结论性描述）
     */
    @Column(name = "DIAG_RESULT")
    private String diagResult;

    /**
     * 病理号（按照一定的编码规则赋予病理标本的编号）
     */
    @Column(name = "PATHOLOGICAL_NO")
    private String pathologicalNo;

    /**
     * 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    @Column(name = "DIAG_TYPE_CODE")
    private String diagTypeCode;

    /**
     * 诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     */
    @Column(name = "DIAG_TYPE_CN")
    private String diagTypeCn;

    /**
     * 中西医诊断标识代码DIR_DIAGNOSE_MARK（标识诊断的中西医类型代码）
     */
    @Column(name = "DIAG_TYPE_MARK")
    private String diagTypeMark;

    /**
     * 中西医诊断标识中文名称（标识诊断的中西医类型中文名称）
     */
    @Column(name = "DIAG_TYPE_MARK_NAME")
    private String diagTypeMarkName;

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
     * 获取所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
    }

    /**
     * 获取诊断序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DIAGNOSIS_ID - 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDiagnosisId() {
        return diagnosisId;
    }

    /**
     * 设置诊断序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param diagnosisId 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId == null ? null : diagnosisId.trim();
    }

    /**
     * 获取病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     *
     * @return CASE_TYPE_CODE - 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    public String getCaseTypeCode() {
        return caseTypeCode;
    }

    /**
     * 设置病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     *
     * @param caseTypeCode 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    public void setCaseTypeCode(String caseTypeCode) {
        this.caseTypeCode = caseTypeCode == null ? null : caseTypeCode.trim();
    }

    /**
     * 获取病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     *
     * @return CASE_TYPE_CN - 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    public String getCaseTypeCn() {
        return caseTypeCn;
    }

    /**
     * 设置病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     *
     * @param caseTypeCn 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    public void setCaseTypeCn(String caseTypeCn) {
        this.caseTypeCn = caseTypeCn == null ? null : caseTypeCn.trim();
    }

    /**
     * 获取机构类别（大类）代码DIR_CLASS_CODE（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_TYPE_CODE - 机构类别（大类）代码DIR_CLASS_CODE（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    /**
     * 设置机构类别（大类）代码DIR_CLASS_CODE（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgTypeCode 机构类别（大类）代码DIR_CLASS_CODE（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode == null ? null : orgTypeCode.trim();
    }

    /**
     * 获取机构类别（大类）中文名称（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的中文名称）
     *
     * @return ORG_TYPE_CN - 机构类别（大类）中文名称（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的中文名称）
     */
    public String getOrgTypeCn() {
        return orgTypeCn;
    }

    /**
     * 设置机构类别（大类）中文名称（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的中文名称）
     *
     * @param orgTypeCn 机构类别（大类）中文名称（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的中文名称）
     */
    public void setOrgTypeCn(String orgTypeCn) {
        this.orgTypeCn = orgTypeCn == null ? null : orgTypeCn.trim();
    }

    /**
     * 获取诊断编码  ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @return DIAGNOSIS_CODE - 诊断编码  ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置诊断编码  ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @param diagnosisCode 诊断编码  ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取疾病诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 疾病诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置疾病诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @param diagnosisName 疾病诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取入院病情代码CV05.10.019（入院病情所对应的代码）
     *
     * @return IN_CONDITION_CODE - 入院病情代码CV05.10.019（入院病情所对应的代码）
     */
    public String getInConditionCode() {
        return inConditionCode;
    }

    /**
     * 设置入院病情代码CV05.10.019（入院病情所对应的代码）
     *
     * @param inConditionCode 入院病情代码CV05.10.019（入院病情所对应的代码）
     */
    public void setInConditionCode(String inConditionCode) {
        this.inConditionCode = inConditionCode == null ? null : inConditionCode.trim();
    }

    /**
     * 获取入院病情中文名称（入院病情所对应的中文名称）
     *
     * @return IN_CONDITION_CN - 入院病情中文名称（入院病情所对应的中文名称）
     */
    public String getInConditionCn() {
        return inConditionCn;
    }

    /**
     * 设置入院病情中文名称（入院病情所对应的中文名称）
     *
     * @param inConditionCn 入院病情中文名称（入院病情所对应的中文名称）
     */
    public void setInConditionCn(String inConditionCn) {
        this.inConditionCn = inConditionCn == null ? null : inConditionCn.trim();
    }

    /**
     * 获取入院后确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期）
     *
     * @return LAST_DIAGNOSIS_DATE - 入院后确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期）
     */
    public String getLastDiagnosisDate() {
        return lastDiagnosisDate;
    }

    /**
     * 设置入院后确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期）
     *
     * @param lastDiagnosisDate 入院后确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期）
     */
    public void setLastDiagnosisDate(String lastDiagnosisDate) {
        this.lastDiagnosisDate = lastDiagnosisDate == null ? null : lastDiagnosisDate.trim();
    }

    /**
     * 获取诊断结果（对患者罹患疾病诊断结果的结论性描述）
     *
     * @return DIAG_RESULT - 诊断结果（对患者罹患疾病诊断结果的结论性描述）
     */
    public String getDiagResult() {
        return diagResult;
    }

    /**
     * 设置诊断结果（对患者罹患疾病诊断结果的结论性描述）
     *
     * @param diagResult 诊断结果（对患者罹患疾病诊断结果的结论性描述）
     */
    public void setDiagResult(String diagResult) {
        this.diagResult = diagResult == null ? null : diagResult.trim();
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
     * 获取诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     *
     * @return DIAG_TYPE_CODE - 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     *
     * @param diagTypeCode 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    public void setDiagTypeCode(String diagTypeCode) {
        this.diagTypeCode = diagTypeCode == null ? null : diagTypeCode.trim();
    }

    /**
     * 获取诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     *
     * @return DIAG_TYPE_CN - 诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     */
    public String getDiagTypeCn() {
        return diagTypeCn;
    }

    /**
     * 设置诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     *
     * @param diagTypeCn 诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     */
    public void setDiagTypeCn(String diagTypeCn) {
        this.diagTypeCn = diagTypeCn == null ? null : diagTypeCn.trim();
    }

    /**
     * 获取中西医诊断标识代码DIR_DIAGNOSE_MARK（标识诊断的中西医类型代码）
     *
     * @return DIAG_TYPE_MARK - 中西医诊断标识代码DIR_DIAGNOSE_MARK（标识诊断的中西医类型代码）
     */
    public String getDiagTypeMark() {
        return diagTypeMark;
    }

    /**
     * 设置中西医诊断标识代码DIR_DIAGNOSE_MARK（标识诊断的中西医类型代码）
     *
     * @param diagTypeMark 中西医诊断标识代码DIR_DIAGNOSE_MARK（标识诊断的中西医类型代码）
     */
    public void setDiagTypeMark(String diagTypeMark) {
        this.diagTypeMark = diagTypeMark == null ? null : diagTypeMark.trim();
    }

    /**
     * 获取中西医诊断标识中文名称（标识诊断的中西医类型中文名称）
     *
     * @return DIAG_TYPE_MARK_NAME - 中西医诊断标识中文名称（标识诊断的中西医类型中文名称）
     */
    public String getDiagTypeMarkName() {
        return diagTypeMarkName;
    }

    /**
     * 设置中西医诊断标识中文名称（标识诊断的中西医类型中文名称）
     *
     * @param diagTypeMarkName 中西医诊断标识中文名称（标识诊断的中西医类型中文名称）
     */
    public void setDiagTypeMarkName(String diagTypeMarkName) {
        this.diagTypeMarkName = diagTypeMarkName == null ? null : diagTypeMarkName.trim();
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