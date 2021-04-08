package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_INPATIENT_ADMISSION_DIAG")
public class QxTInpatientAdmissionDiag {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 入院诊断唯一标识
     */
    @Id
    @Column(name = "IADUID")
    private String iaduid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 入院诊断-代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "INPATIENT_DIAG_CODE")
    private String inpatientDiagCode;

    /**
     * 入院诊断-名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    @Column(name = "INPATIENT_DIAG_NAME")
    private String inpatientDiagName;

    /**
     * 确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期 ）
     */
    @Column(name = "CONFIRMED_DIAG_DATE")
    private String confirmedDiagDate;

    /**
     * 性质代码（诊断性质在特定编码体系中的代码）
     */
    @Column(name = "PROPERTY_CODE")
    private String propertyCode;

    /**
     * 性质中文名称（诊断性质在特定编码体系中的中文名称）
     */
    @Column(name = "PROPERTY_CN")
    private String propertyCn;

    /**
     * 诊断类型编码（描述诊断类型在特定编码体系中的编码 ）
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
     * 原始层到新建层的关联ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 获取入院诊断唯一标识
     *
     * @return IADUID - 入院诊断唯一标识
     */
    public String getIaduid() {
        return iaduid;
    }

    /**
     * 设置入院诊断唯一标识
     *
     * @param iaduid 入院诊断唯一标识
     */
    public void setIaduid(String iaduid) {
        this.iaduid = iaduid == null ? null : iaduid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取入院诊断-代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return INPATIENT_DIAG_CODE - 入院诊断-代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getInpatientDiagCode() {
        return inpatientDiagCode;
    }

    /**
     * 设置入院诊断-代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param inpatientDiagCode 入院诊断-代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setInpatientDiagCode(String inpatientDiagCode) {
        this.inpatientDiagCode = inpatientDiagCode == null ? null : inpatientDiagCode.trim();
    }

    /**
     * 获取入院诊断-名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @return INPATIENT_DIAG_NAME - 入院诊断-名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public String getInpatientDiagName() {
        return inpatientDiagName;
    }

    /**
     * 设置入院诊断-名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @param inpatientDiagName 入院诊断-名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public void setInpatientDiagName(String inpatientDiagName) {
        this.inpatientDiagName = inpatientDiagName == null ? null : inpatientDiagName.trim();
    }

    /**
     * 获取确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期 ）
     *
     * @return CONFIRMED_DIAG_DATE - 确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期 ）
     */
    public String getConfirmedDiagDate() {
        return confirmedDiagDate;
    }

    /**
     * 设置确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期 ）
     *
     * @param confirmedDiagDate 确诊日期（对患者所患疾病做出明确诊断诊断当日的公元纪年日期 ）
     */
    public void setConfirmedDiagDate(String confirmedDiagDate) {
        this.confirmedDiagDate = confirmedDiagDate == null ? null : confirmedDiagDate.trim();
    }

    /**
     * 获取性质代码（诊断性质在特定编码体系中的代码）
     *
     * @return PROPERTY_CODE - 性质代码（诊断性质在特定编码体系中的代码）
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * 设置性质代码（诊断性质在特定编码体系中的代码）
     *
     * @param propertyCode 性质代码（诊断性质在特定编码体系中的代码）
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
     * 获取诊断类型编码（描述诊断类型在特定编码体系中的编码 ）
     *
     * @return DIAG_TYPE_CODE - 诊断类型编码（描述诊断类型在特定编码体系中的编码 ）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型编码（描述诊断类型在特定编码体系中的编码 ）
     *
     * @param diagTypeCode 诊断类型编码（描述诊断类型在特定编码体系中的编码 ）
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
     * 获取原始层到新建层的关联ID
     *
     * @return QID - 原始层到新建层的关联ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层到新建层的关联ID
     *
     * @param qid 原始层到新建层的关联ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }
}