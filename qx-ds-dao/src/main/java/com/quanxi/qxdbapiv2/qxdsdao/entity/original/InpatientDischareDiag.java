package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_DISCHARE_DIAG")
public class InpatientDischareDiag {
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
     * 症状序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    @Id
    @Column(name = "DIAGNOSIS_ID")
    private String diagnosisId;

    /**
     * 出院诊断代码ICD-10（出院诊断在特定编码体系中的编码）
     */
    @Column(name = "OUTPATIENT_DIAG_CODE")
    private String outpatientDiagCode;

    /**
     * 出院诊断名称（患者出院的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称 ）
     */
    @Column(name = "OUTPATIENT_DIAG_NAME")
    private String outpatientDiagName;

    /**
     * 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    @Column(name = "TREAT_RESULT_CODE")
    private String treatResultCode;

    /**
     * 治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    @Column(name = "TREAT_RESULT_CN")
    private String treatResultCn;

    /**
     * 性质代码 DIR_DIAGNOSIS_PROP（诊断性质在特定编码体系中的代码）
     */
    @Column(name = "PROPERTY_CODE")
    private String propertyCode;

    /**
     * 性质中文名称（诊断性质在特定编码体系中的中文名称）
     */
    @Column(name = "PROPERTY_CN")
    private String propertyCn;

    /**
     * 诊断类型编码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码 ）
     */
    @Column(name = "DIAG_TYPE_CODE")
    private String diagTypeCode;

    /**
     * 诊断类型中文名称（描述诊断类型在特定编码体系中的中文名称）
     */
    @Column(name = "DIAG_TYPE_CN")
    private String diagTypeCn;

    /**
     * 诊断说明（对疾病的说明详细描述）
     */
    @Column(name = "DIAG_EXPLAN")
    private String diagExplan;

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
     * 获取症状序列号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @return DIAGNOSIS_ID - 症状序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public String getDiagnosisId() {
        return diagnosisId;
    }

    /**
     * 设置症状序列号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @param diagnosisId 症状序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId == null ? null : diagnosisId.trim();
    }

    /**
     * 获取出院诊断代码ICD-10（出院诊断在特定编码体系中的编码）
     *
     * @return OUTPATIENT_DIAG_CODE - 出院诊断代码ICD-10（出院诊断在特定编码体系中的编码）
     */
    public String getOutpatientDiagCode() {
        return outpatientDiagCode;
    }

    /**
     * 设置出院诊断代码ICD-10（出院诊断在特定编码体系中的编码）
     *
     * @param outpatientDiagCode 出院诊断代码ICD-10（出院诊断在特定编码体系中的编码）
     */
    public void setOutpatientDiagCode(String outpatientDiagCode) {
        this.outpatientDiagCode = outpatientDiagCode == null ? null : outpatientDiagCode.trim();
    }

    /**
     * 获取出院诊断名称（患者出院的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称 ）
     *
     * @return OUTPATIENT_DIAG_NAME - 出院诊断名称（患者出院的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称 ）
     */
    public String getOutpatientDiagName() {
        return outpatientDiagName;
    }

    /**
     * 设置出院诊断名称（患者出院的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称 ）
     *
     * @param outpatientDiagName 出院诊断名称（患者出院的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称 ）
     */
    public void setOutpatientDiagName(String outpatientDiagName) {
        this.outpatientDiagName = outpatientDiagName == null ? null : outpatientDiagName.trim();
    }

    /**
     * 获取治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     *
     * @return TREAT_RESULT_CODE - 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    public String getTreatResultCode() {
        return treatResultCode;
    }

    /**
     * 设置治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     *
     * @param treatResultCode 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    public void setTreatResultCode(String treatResultCode) {
        this.treatResultCode = treatResultCode == null ? null : treatResultCode.trim();
    }

    /**
     * 获取治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     *
     * @return TREAT_RESULT_CN - 治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    public String getTreatResultCn() {
        return treatResultCn;
    }

    /**
     * 设置治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     *
     * @param treatResultCn 治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    public void setTreatResultCn(String treatResultCn) {
        this.treatResultCn = treatResultCn == null ? null : treatResultCn.trim();
    }

    /**
     * 获取性质代码 DIR_DIAGNOSIS_PROP（诊断性质在特定编码体系中的代码）
     *
     * @return PROPERTY_CODE - 性质代码 DIR_DIAGNOSIS_PROP（诊断性质在特定编码体系中的代码）
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * 设置性质代码 DIR_DIAGNOSIS_PROP（诊断性质在特定编码体系中的代码）
     *
     * @param propertyCode 性质代码 DIR_DIAGNOSIS_PROP（诊断性质在特定编码体系中的代码）
     */
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode == null ? null : propertyCode.trim();
    }

    /**
     * 获取性质中文名称（诊断性质在特定编码体系中的中文名称）
     *
     * @return PROPERTY_CN - 性质中文名称（诊断性质在特定编码体系中的中文名称）
     */
    public String getPropertyCn() {
        return propertyCn;
    }

    /**
     * 设置性质中文名称（诊断性质在特定编码体系中的中文名称）
     *
     * @param propertyCn 性质中文名称（诊断性质在特定编码体系中的中文名称）
     */
    public void setPropertyCn(String propertyCn) {
        this.propertyCn = propertyCn == null ? null : propertyCn.trim();
    }

    /**
     * 获取诊断类型编码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码 ）
     *
     * @return DIAG_TYPE_CODE - 诊断类型编码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码 ）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型编码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码 ）
     *
     * @param diagTypeCode 诊断类型编码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码 ）
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
     * 获取诊断说明（对疾病的说明详细描述）
     *
     * @return DIAG_EXPLAN - 诊断说明（对疾病的说明详细描述）
     */
    public String getDiagExplan() {
        return diagExplan;
    }

    /**
     * 设置诊断说明（对疾病的说明详细描述）
     *
     * @param diagExplan 诊断说明（对疾病的说明详细描述）
     */
    public void setDiagExplan(String diagExplan) {
        this.diagExplan = diagExplan == null ? null : diagExplan.trim();
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