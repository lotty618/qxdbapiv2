package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CHECK_DRUG_RESULT")
public class QxTCheckDrugResult {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 药敏结果唯一标识
     */
    @Column(name = "CDRUID")
    private String cdruid;

    /**
     * 检验结果唯一标识
     */
    @Column(name = "CRUID")
    private String cruid;

    /**
     * 检验单唯一标识
     */
    @Column(name = "COUID")
    private String couid;

    /**
     * 检验项目ID
     */
    @Column(name = "ITEM_ID")
    private String itemId;

    /**
     * 检验项目名称
     */
    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 药敏结果代码（药敏试验结果在特定编码体系中的代码）
     */
    @Column(name = "DRUG_SENSITIVITY_CODE")
    private String drugSensitivityCode;

    /**
     * 药敏结果名称（药敏试验结果在特定编码体系中的名称）
     */
    @Column(name = "DRUG_SENSITIVITY_NAME")
    private String drugSensitivityName;

    /**
     * 纸片含药量（描述纸片含药量的值）
     */
    @Column(name = "PIECE_DRUG")
    private String pieceDrug;

    /**
     * 抑菌浓度（药敏检验的抑菌浓度值）
     */
    @Column(name = "BACSTA_CONCEN")
    private String bacstaConcen;

    /**
     * 抑菌环直径（描述抑菌环直径的值）
     */
    @Column(name = "BACSTA_DIAMETER")
    private String bacstaDiameter;

    /**
     * 抗生素代码（抗生素在特定编码体系中的编码）
     */
    @Column(name = "ANTIBIOTICS_CODE")
    private String antibioticsCode;

    /**
     * 抗生素名称（抗生素在特定编码体系中的名称）
     */
    @Column(name = "ANTIBIOTICS_NAME")
    private String antibioticsName;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 检测方式
     */
    @Column(name = "METHOD")
    private String method;

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
     * 药敏检验结果的详细描述（药敏结果描述）
     */
    @Column(name = "DRUG_RESULT")
    private String drugResult;

    /**
     * 排序
     */
    @Column(name = "PRI_ORDER")
    private String priOrder;

    /**
     * 细菌代码
     */
    @Column(name = "BIO_CODE")
    private String bioCode;

    /**
     * 细菌结果（细菌的阴、阳性测定）
     */
    @Column(name = "BIO_RESULT")
    private String bioResult;

    /**
     * 细菌数量
     */
    @Column(name = "BIO_QUANTITY")
    private String bioQuantity;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 细菌名称
     */
    @Column(name = "BIO_NAME")
    private String bioName;

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
     * 获取药敏结果唯一标识
     *
     * @return CDRUID - 药敏结果唯一标识
     */
    public String getCdruid() {
        return cdruid;
    }

    /**
     * 设置药敏结果唯一标识
     *
     * @param cdruid 药敏结果唯一标识
     */
    public void setCdruid(String cdruid) {
        this.cdruid = cdruid == null ? null : cdruid.trim();
    }

    /**
     * 获取检验结果唯一标识
     *
     * @return CRUID - 检验结果唯一标识
     */
    public String getCruid() {
        return cruid;
    }

    /**
     * 设置检验结果唯一标识
     *
     * @param cruid 检验结果唯一标识
     */
    public void setCruid(String cruid) {
        this.cruid = cruid == null ? null : cruid.trim();
    }

    /**
     * 获取检验单唯一标识
     *
     * @return COUID - 检验单唯一标识
     */
    public String getCouid() {
        return couid;
    }

    /**
     * 设置检验单唯一标识
     *
     * @param couid 检验单唯一标识
     */
    public void setCouid(String couid) {
        this.couid = couid == null ? null : couid.trim();
    }

    /**
     * 获取检验项目ID
     *
     * @return ITEM_ID - 检验项目ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置检验项目ID
     *
     * @param itemId 检验项目ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取检验项目名称
     *
     * @return ITEM_NAME - 检验项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置检验项目名称
     *
     * @param itemName 检验项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取药敏结果代码（药敏试验结果在特定编码体系中的代码）
     *
     * @return DRUG_SENSITIVITY_CODE - 药敏结果代码（药敏试验结果在特定编码体系中的代码）
     */
    public String getDrugSensitivityCode() {
        return drugSensitivityCode;
    }

    /**
     * 设置药敏结果代码（药敏试验结果在特定编码体系中的代码）
     *
     * @param drugSensitivityCode 药敏结果代码（药敏试验结果在特定编码体系中的代码）
     */
    public void setDrugSensitivityCode(String drugSensitivityCode) {
        this.drugSensitivityCode = drugSensitivityCode == null ? null : drugSensitivityCode.trim();
    }

    /**
     * 获取药敏结果名称（药敏试验结果在特定编码体系中的名称）
     *
     * @return DRUG_SENSITIVITY_NAME - 药敏结果名称（药敏试验结果在特定编码体系中的名称）
     */
    public String getDrugSensitivityName() {
        return drugSensitivityName;
    }

    /**
     * 设置药敏结果名称（药敏试验结果在特定编码体系中的名称）
     *
     * @param drugSensitivityName 药敏结果名称（药敏试验结果在特定编码体系中的名称）
     */
    public void setDrugSensitivityName(String drugSensitivityName) {
        this.drugSensitivityName = drugSensitivityName == null ? null : drugSensitivityName.trim();
    }

    /**
     * 获取纸片含药量（描述纸片含药量的值）
     *
     * @return PIECE_DRUG - 纸片含药量（描述纸片含药量的值）
     */
    public String getPieceDrug() {
        return pieceDrug;
    }

    /**
     * 设置纸片含药量（描述纸片含药量的值）
     *
     * @param pieceDrug 纸片含药量（描述纸片含药量的值）
     */
    public void setPieceDrug(String pieceDrug) {
        this.pieceDrug = pieceDrug == null ? null : pieceDrug.trim();
    }

    /**
     * 获取抑菌浓度（药敏检验的抑菌浓度值）
     *
     * @return BACSTA_CONCEN - 抑菌浓度（药敏检验的抑菌浓度值）
     */
    public String getBacstaConcen() {
        return bacstaConcen;
    }

    /**
     * 设置抑菌浓度（药敏检验的抑菌浓度值）
     *
     * @param bacstaConcen 抑菌浓度（药敏检验的抑菌浓度值）
     */
    public void setBacstaConcen(String bacstaConcen) {
        this.bacstaConcen = bacstaConcen == null ? null : bacstaConcen.trim();
    }

    /**
     * 获取抑菌环直径（描述抑菌环直径的值）
     *
     * @return BACSTA_DIAMETER - 抑菌环直径（描述抑菌环直径的值）
     */
    public String getBacstaDiameter() {
        return bacstaDiameter;
    }

    /**
     * 设置抑菌环直径（描述抑菌环直径的值）
     *
     * @param bacstaDiameter 抑菌环直径（描述抑菌环直径的值）
     */
    public void setBacstaDiameter(String bacstaDiameter) {
        this.bacstaDiameter = bacstaDiameter == null ? null : bacstaDiameter.trim();
    }

    /**
     * 获取抗生素代码（抗生素在特定编码体系中的编码）
     *
     * @return ANTIBIOTICS_CODE - 抗生素代码（抗生素在特定编码体系中的编码）
     */
    public String getAntibioticsCode() {
        return antibioticsCode;
    }

    /**
     * 设置抗生素代码（抗生素在特定编码体系中的编码）
     *
     * @param antibioticsCode 抗生素代码（抗生素在特定编码体系中的编码）
     */
    public void setAntibioticsCode(String antibioticsCode) {
        this.antibioticsCode = antibioticsCode == null ? null : antibioticsCode.trim();
    }

    /**
     * 获取抗生素名称（抗生素在特定编码体系中的名称）
     *
     * @return ANTIBIOTICS_NAME - 抗生素名称（抗生素在特定编码体系中的名称）
     */
    public String getAntibioticsName() {
        return antibioticsName;
    }

    /**
     * 设置抗生素名称（抗生素在特定编码体系中的名称）
     *
     * @param antibioticsName 抗生素名称（抗生素在特定编码体系中的名称）
     */
    public void setAntibioticsName(String antibioticsName) {
        this.antibioticsName = antibioticsName == null ? null : antibioticsName.trim();
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
     * 获取检测方式
     *
     * @return METHOD - 检测方式
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置检测方式
     *
     * @param method 检测方式
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
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
     * 获取药敏检验结果的详细描述（药敏结果描述）
     *
     * @return DRUG_RESULT - 药敏检验结果的详细描述（药敏结果描述）
     */
    public String getDrugResult() {
        return drugResult;
    }

    /**
     * 设置药敏检验结果的详细描述（药敏结果描述）
     *
     * @param drugResult 药敏检验结果的详细描述（药敏结果描述）
     */
    public void setDrugResult(String drugResult) {
        this.drugResult = drugResult == null ? null : drugResult.trim();
    }

    /**
     * 获取排序
     *
     * @return PRI_ORDER - 排序
     */
    public String getPriOrder() {
        return priOrder;
    }

    /**
     * 设置排序
     *
     * @param priOrder 排序
     */
    public void setPriOrder(String priOrder) {
        this.priOrder = priOrder == null ? null : priOrder.trim();
    }

    /**
     * 获取细菌代码
     *
     * @return BIO_CODE - 细菌代码
     */
    public String getBioCode() {
        return bioCode;
    }

    /**
     * 设置细菌代码
     *
     * @param bioCode 细菌代码
     */
    public void setBioCode(String bioCode) {
        this.bioCode = bioCode == null ? null : bioCode.trim();
    }

    /**
     * 获取细菌结果（细菌的阴、阳性测定）
     *
     * @return BIO_RESULT - 细菌结果（细菌的阴、阳性测定）
     */
    public String getBioResult() {
        return bioResult;
    }

    /**
     * 设置细菌结果（细菌的阴、阳性测定）
     *
     * @param bioResult 细菌结果（细菌的阴、阳性测定）
     */
    public void setBioResult(String bioResult) {
        this.bioResult = bioResult == null ? null : bioResult.trim();
    }

    /**
     * 获取细菌数量
     *
     * @return BIO_QUANTITY - 细菌数量
     */
    public String getBioQuantity() {
        return bioQuantity;
    }

    /**
     * 设置细菌数量
     *
     * @param bioQuantity 细菌数量
     */
    public void setBioQuantity(String bioQuantity) {
        this.bioQuantity = bioQuantity == null ? null : bioQuantity.trim();
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
     * 获取细菌名称
     *
     * @return BIO_NAME - 细菌名称
     */
    public String getBioName() {
        return bioName;
    }

    /**
     * 设置细菌名称
     *
     * @param bioName 细菌名称
     */
    public void setBioName(String bioName) {
        this.bioName = bioName == null ? null : bioName.trim();
    }
}