package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_ORIGINAL")
public class QxTEmrOriginal {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 病历唯一标识
     */
    @Column(name = "EMRUID")
    private String emruid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 病人住院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病历类型（1入院记录；2首次病程；3日常病程；4查房记录；5疑难病例讨论；6交接班记录；7转科记录；8阶段小结；9抢救记录；10会诊记录；11术前小结；12术前讨论；13术后首次病程；14出院记录；15死亡记录；16死亡病例讨论；17出院小结；18病案首页;24 二十四小时内入院死亡记录；26 二十四小时内入院记录；28手术记录；29转科转入记录；30转科转出记录；31住院风险评估记录表；40麻醉记录；41授权委托记录；42输血评估表；43输血记录；44其他记录；45手术同意书记录；46麻醉同意数记录；47输血同意书记录；48手术护理记录单；49手术风险评估单；50麻醉前访视记录单；51麻醉评估单；52麻醉前小结；53病理送检单；54病理申请单；55输血申请单；56术前护理访视单；57手术物品清点单；58手术安全核查表；59人工植入物告知书；60器械交接单；61护理记录单；62重大手术并发症报告表；63病人交接核对表；64病人交接记录单；）
     */
    @Column(name = "EMR_TYPE")
    private Long emrType;

    /**
     * 是否blob类型（0：text，1：blob）
     */
    @Column(name = "IS_BLOB")
    private Long isBlob;

    /**
     * 原始层ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 病历原文
     */
    @Column(name = "EMR_CONTENT_TEXT")
    private String emrContentText;

    /**
     * 病历原文
     */
    @Column(name = "EMR_CONTENT_BLOB")
    private byte[] emrContentBlob;

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
     * 获取病历唯一标识
     *
     * @return EMRUID - 病历唯一标识
     */
    public String getEmruid() {
        return emruid;
    }

    /**
     * 设置病历唯一标识
     *
     * @param emruid 病历唯一标识
     */
    public void setEmruid(String emruid) {
        this.emruid = emruid == null ? null : emruid.trim();
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
     * 获取病人住院标识
     *
     * @return IHUID - 病人住院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置病人住院标识
     *
     * @param ihuid 病人住院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病历类型（1入院记录；2首次病程；3日常病程；4查房记录；5疑难病例讨论；6交接班记录；7转科记录；8阶段小结；9抢救记录；10会诊记录；11术前小结；12术前讨论；13术后首次病程；14出院记录；15死亡记录；16死亡病例讨论；17出院小结；18病案首页;24 二十四小时内入院死亡记录；26 二十四小时内入院记录；28手术记录；29转科转入记录；30转科转出记录；31住院风险评估记录表；40麻醉记录；41授权委托记录；42输血评估表；43输血记录；44其他记录；45手术同意书记录；46麻醉同意数记录；47输血同意书记录；48手术护理记录单；49手术风险评估单；50麻醉前访视记录单；51麻醉评估单；52麻醉前小结；53病理送检单；54病理申请单；55输血申请单；56术前护理访视单；57手术物品清点单；58手术安全核查表；59人工植入物告知书；60器械交接单；61护理记录单；62重大手术并发症报告表；63病人交接核对表；64病人交接记录单；）
     *
     * @return EMR_TYPE - 病历类型（1入院记录；2首次病程；3日常病程；4查房记录；5疑难病例讨论；6交接班记录；7转科记录；8阶段小结；9抢救记录；10会诊记录；11术前小结；12术前讨论；13术后首次病程；14出院记录；15死亡记录；16死亡病例讨论；17出院小结；18病案首页;24 二十四小时内入院死亡记录；26 二十四小时内入院记录；28手术记录；29转科转入记录；30转科转出记录；31住院风险评估记录表；40麻醉记录；41授权委托记录；42输血评估表；43输血记录；44其他记录；45手术同意书记录；46麻醉同意数记录；47输血同意书记录；48手术护理记录单；49手术风险评估单；50麻醉前访视记录单；51麻醉评估单；52麻醉前小结；53病理送检单；54病理申请单；55输血申请单；56术前护理访视单；57手术物品清点单；58手术安全核查表；59人工植入物告知书；60器械交接单；61护理记录单；62重大手术并发症报告表；63病人交接核对表；64病人交接记录单；）
     */
    public Long getEmrType() {
        return emrType;
    }

    /**
     * 设置病历类型（1入院记录；2首次病程；3日常病程；4查房记录；5疑难病例讨论；6交接班记录；7转科记录；8阶段小结；9抢救记录；10会诊记录；11术前小结；12术前讨论；13术后首次病程；14出院记录；15死亡记录；16死亡病例讨论；17出院小结；18病案首页;24 二十四小时内入院死亡记录；26 二十四小时内入院记录；28手术记录；29转科转入记录；30转科转出记录；31住院风险评估记录表；40麻醉记录；41授权委托记录；42输血评估表；43输血记录；44其他记录；45手术同意书记录；46麻醉同意数记录；47输血同意书记录；48手术护理记录单；49手术风险评估单；50麻醉前访视记录单；51麻醉评估单；52麻醉前小结；53病理送检单；54病理申请单；55输血申请单；56术前护理访视单；57手术物品清点单；58手术安全核查表；59人工植入物告知书；60器械交接单；61护理记录单；62重大手术并发症报告表；63病人交接核对表；64病人交接记录单；）
     *
     * @param emrType 病历类型（1入院记录；2首次病程；3日常病程；4查房记录；5疑难病例讨论；6交接班记录；7转科记录；8阶段小结；9抢救记录；10会诊记录；11术前小结；12术前讨论；13术后首次病程；14出院记录；15死亡记录；16死亡病例讨论；17出院小结；18病案首页;24 二十四小时内入院死亡记录；26 二十四小时内入院记录；28手术记录；29转科转入记录；30转科转出记录；31住院风险评估记录表；40麻醉记录；41授权委托记录；42输血评估表；43输血记录；44其他记录；45手术同意书记录；46麻醉同意数记录；47输血同意书记录；48手术护理记录单；49手术风险评估单；50麻醉前访视记录单；51麻醉评估单；52麻醉前小结；53病理送检单；54病理申请单；55输血申请单；56术前护理访视单；57手术物品清点单；58手术安全核查表；59人工植入物告知书；60器械交接单；61护理记录单；62重大手术并发症报告表；63病人交接核对表；64病人交接记录单；）
     */
    public void setEmrType(Long emrType) {
        this.emrType = emrType;
    }

    /**
     * 获取是否blob类型（0：text，1：blob）
     *
     * @return IS_BLOB - 是否blob类型（0：text，1：blob）
     */
    public Long getIsBlob() {
        return isBlob;
    }

    /**
     * 设置是否blob类型（0：text，1：blob）
     *
     * @param isBlob 是否blob类型（0：text，1：blob）
     */
    public void setIsBlob(Long isBlob) {
        this.isBlob = isBlob;
    }

    /**
     * 获取原始层ID
     *
     * @return QID - 原始层ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层ID
     *
     * @param qid 原始层ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取病历原文
     *
     * @return EMR_CONTENT_TEXT - 病历原文
     */
    public String getEmrContentText() {
        return emrContentText;
    }

    /**
     * 设置病历原文
     *
     * @param emrContentText 病历原文
     */
    public void setEmrContentText(String emrContentText) {
        this.emrContentText = emrContentText == null ? null : emrContentText.trim();
    }

    /**
     * 获取病历原文
     *
     * @return EMR_CONTENT_BLOB - 病历原文
     */
    public byte[] getEmrContentBlob() {
        return emrContentBlob;
    }

    /**
     * 设置病历原文
     *
     * @param emrContentBlob 病历原文
     */
    public void setEmrContentBlob(byte[] emrContentBlob) {
        this.emrContentBlob = emrContentBlob;
    }
}