package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_DIAG")
public class QxTMedicalRecordDiag {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页诊断唯一标识
     */
    @Id
    @Column(name = "MRDUID")
    private String mrduid;

    /**
     * 病案首页唯一标识
     */
    @Column(name = "MRPUID")
    private String mrpuid;

    /**
     * 诊断编码（患者所患疾病在西医诊断特定编码体系中的编码）
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
     * 诊断类型代码（1出院诊断,10并发症诊断,11院内感染诊断,12主要诊断,13次要诊断,2门诊诊断,3入院初步诊断,4术前诊断,5术后诊断,6尸检诊断,7放射诊断,8超声诊断,9病理诊断,99其他）
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
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

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
     * 获取病案首页诊断唯一标识
     *
     * @return MRDUID - 病案首页诊断唯一标识
     */
    public String getMrduid() {
        return mrduid;
    }

    /**
     * 设置病案首页诊断唯一标识
     *
     * @param mrduid 病案首页诊断唯一标识
     */
    public void setMrduid(String mrduid) {
        this.mrduid = mrduid == null ? null : mrduid.trim();
    }

    /**
     * 获取病案首页唯一标识
     *
     * @return MRPUID - 病案首页唯一标识
     */
    public String getMrpuid() {
        return mrpuid;
    }

    /**
     * 设置病案首页唯一标识
     *
     * @param mrpuid 病案首页唯一标识
     */
    public void setMrpuid(String mrpuid) {
        this.mrpuid = mrpuid == null ? null : mrpuid.trim();
    }

    /**
     * 获取诊断编码（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @return DIAGNOSIS_CODE - 诊断编码（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置诊断编码（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @param diagnosisCode 诊断编码（患者所患疾病在西医诊断特定编码体系中的编码）
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
     * 获取诊断类型代码（1出院诊断,10并发症诊断,11院内感染诊断,12主要诊断,13次要诊断,2门诊诊断,3入院初步诊断,4术前诊断,5术后诊断,6尸检诊断,7放射诊断,8超声诊断,9病理诊断,99其他）
     *
     * @return DIAG_TYPE_CODE - 诊断类型代码（1出院诊断,10并发症诊断,11院内感染诊断,12主要诊断,13次要诊断,2门诊诊断,3入院初步诊断,4术前诊断,5术后诊断,6尸检诊断,7放射诊断,8超声诊断,9病理诊断,99其他）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型代码（1出院诊断,10并发症诊断,11院内感染诊断,12主要诊断,13次要诊断,2门诊诊断,3入院初步诊断,4术前诊断,5术后诊断,6尸检诊断,7放射诊断,8超声诊断,9病理诊断,99其他）
     *
     * @param diagTypeCode 诊断类型代码（1出院诊断,10并发症诊断,11院内感染诊断,12主要诊断,13次要诊断,2门诊诊断,3入院初步诊断,4术前诊断,5术后诊断,6尸检诊断,7放射诊断,8超声诊断,9病理诊断,99其他）
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
}