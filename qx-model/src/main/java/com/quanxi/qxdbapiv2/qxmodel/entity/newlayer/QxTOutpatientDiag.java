package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_DIAG")
public class QxTOutpatientDiag {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 诊断唯一标识
     */
    @Column(name = "OPDUID")
    private String opduid;

    /**
     * 就诊唯一标识
     */
    @Column(name = "OPHUID")
    private String ophuid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 传染标志0否 1是（是否传染病的标志）
     */
    @Column(name = "INFECT_FLAG")
    private Long infectFlag;

    /**
     * 传染上报标志0否 1是（传染病是否上报的标志）
     */
    @Column(name = "INFECT_REPORT_FLAG")
    private Long infectReportFlag;

    /**
     * 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    @Column(name = "OUTPAT_DIAG_NAME")
    private String outpatDiagName;

    /**
     * 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "OUTPAT_DIAG_CODE")
    private String outpatDiagCode;

    /**
     * 诊断类型代码（描述诊断类型在特定编码体系中的编码）
     */
    @Column(name = "DIAG_TYPE_CODE")
    private String diagTypeCode;

    /**
     * 诊断依据代码（患者最高诊断依据在特定编码体系中的代码）
     */
    @Column(name = "DIAG_BASIS_CODE")
    private String diagBasisCode;

    /**
     * 中医诊断类别编码（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    @Column(name = "CN_MED_DIA_CAT_CODE")
    private String cnMedDiaCatCode;

    /**
     * 西医诊断类别编码（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    @Column(name = "WEST_DIA_CAT_CODE")
    private String westDiaCatCode;

    /**
     * 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    @Column(name = "DIAG_DATE")
    private String diagDate;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

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
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 是否无效
     */
    @Column(name = "IS_INVALID")
    private Short isInvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "IS_DEL")
    private Short isDel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 获取序列号
     *
     * @return SID - 序列号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置序列号
     *
     * @param sid 序列号
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取诊断唯一标识
     *
     * @return OPDUID - 诊断唯一标识
     */
    public String getOpduid() {
        return opduid;
    }

    /**
     * 设置诊断唯一标识
     *
     * @param opduid 诊断唯一标识
     */
    public void setOpduid(String opduid) {
        this.opduid = opduid == null ? null : opduid.trim();
    }

    /**
     * 获取就诊唯一标识
     *
     * @return OPHUID - 就诊唯一标识
     */
    public String getOphuid() {
        return ophuid;
    }

    /**
     * 设置就诊唯一标识
     *
     * @param ophuid 就诊唯一标识
     */
    public void setOphuid(String ophuid) {
        this.ophuid = ophuid == null ? null : ophuid.trim();
    }

    /**
     * 获取门诊记录唯一标识
     *
     * @return PNUID - 门诊记录唯一标识
     */
    public String getPnuid() {
        return pnuid;
    }

    /**
     * 设置门诊记录唯一标识
     *
     * @param pnuid 门诊记录唯一标识
     */
    public void setPnuid(String pnuid) {
        this.pnuid = pnuid == null ? null : pnuid.trim();
    }

    /**
     * 获取传染标志0否 1是（是否传染病的标志）
     *
     * @return INFECT_FLAG - 传染标志0否 1是（是否传染病的标志）
     */
    public Long getInfectFlag() {
        return infectFlag;
    }

    /**
     * 设置传染标志0否 1是（是否传染病的标志）
     *
     * @param infectFlag 传染标志0否 1是（是否传染病的标志）
     */
    public void setInfectFlag(Long infectFlag) {
        this.infectFlag = infectFlag;
    }

    /**
     * 获取传染上报标志0否 1是（传染病是否上报的标志）
     *
     * @return INFECT_REPORT_FLAG - 传染上报标志0否 1是（传染病是否上报的标志）
     */
    public Long getInfectReportFlag() {
        return infectReportFlag;
    }

    /**
     * 设置传染上报标志0否 1是（传染病是否上报的标志）
     *
     * @param infectReportFlag 传染上报标志0否 1是（传染病是否上报的标志）
     */
    public void setInfectReportFlag(Long infectReportFlag) {
        this.infectReportFlag = infectReportFlag;
    }

    /**
     * 获取门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @return OUTPAT_DIAG_NAME - 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public String getOutpatDiagName() {
        return outpatDiagName;
    }

    /**
     * 设置门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @param outpatDiagName 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public void setOutpatDiagName(String outpatDiagName) {
        this.outpatDiagName = outpatDiagName == null ? null : outpatDiagName.trim();
    }

    /**
     * 获取门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return OUTPAT_DIAG_CODE - 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getOutpatDiagCode() {
        return outpatDiagCode;
    }

    /**
     * 设置门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param outpatDiagCode 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setOutpatDiagCode(String outpatDiagCode) {
        this.outpatDiagCode = outpatDiagCode == null ? null : outpatDiagCode.trim();
    }

    /**
     * 获取诊断类型代码（描述诊断类型在特定编码体系中的编码）
     *
     * @return DIAG_TYPE_CODE - 诊断类型代码（描述诊断类型在特定编码体系中的编码）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型代码（描述诊断类型在特定编码体系中的编码）
     *
     * @param diagTypeCode 诊断类型代码（描述诊断类型在特定编码体系中的编码）
     */
    public void setDiagTypeCode(String diagTypeCode) {
        this.diagTypeCode = diagTypeCode == null ? null : diagTypeCode.trim();
    }

    /**
     * 获取诊断依据代码（患者最高诊断依据在特定编码体系中的代码）
     *
     * @return DIAG_BASIS_CODE - 诊断依据代码（患者最高诊断依据在特定编码体系中的代码）
     */
    public String getDiagBasisCode() {
        return diagBasisCode;
    }

    /**
     * 设置诊断依据代码（患者最高诊断依据在特定编码体系中的代码）
     *
     * @param diagBasisCode 诊断依据代码（患者最高诊断依据在特定编码体系中的代码）
     */
    public void setDiagBasisCode(String diagBasisCode) {
        this.diagBasisCode = diagBasisCode == null ? null : diagBasisCode.trim();
    }

    /**
     * 获取中医诊断类别编码（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     *
     * @return CN_MED_DIA_CAT_CODE - 中医诊断类别编码（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    public String getCnMedDiaCatCode() {
        return cnMedDiaCatCode;
    }

    /**
     * 设置中医诊断类别编码（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     *
     * @param cnMedDiaCatCode 中医诊断类别编码（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    public void setCnMedDiaCatCode(String cnMedDiaCatCode) {
        this.cnMedDiaCatCode = cnMedDiaCatCode == null ? null : cnMedDiaCatCode.trim();
    }

    /**
     * 获取西医诊断类别编码（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     *
     * @return WEST_DIA_CAT_CODE - 西医诊断类别编码（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    public String getWestDiaCatCode() {
        return westDiaCatCode;
    }

    /**
     * 设置西医诊断类别编码（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     *
     * @param westDiaCatCode 西医诊断类别编码（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    public void setWestDiaCatCode(String westDiaCatCode) {
        this.westDiaCatCode = westDiaCatCode == null ? null : westDiaCatCode.trim();
    }

    /**
     * 获取诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @return DIAG_DATE - 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public String getDiagDate() {
        return diagDate;
    }

    /**
     * 设置诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @param diagDate 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public void setDiagDate(String diagDate) {
        this.diagDate = diagDate == null ? null : diagDate.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
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
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
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
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取是否无效
     *
     * @return IS_INVALID - 是否无效
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isInvalid 是否无效
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return IS_DEL - 是否逻辑删除
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isDel 是否逻辑删除
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }
}