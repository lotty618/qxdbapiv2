package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_PARSE")
public class QxTEmrParse {
    /**
     * 序列号
     */
    @Id
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
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     * 评估时间
     */
    @Column(name = "VALUE_TIME")
    private String valueTime;

    /**
     * 病历解析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    @Column(name = "EMR_CONTENT")
    private String emrContent;

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
     * 获取评估时间
     *
     * @return VALUE_TIME - 评估时间
     */
    public String getValueTime() {
        return valueTime;
    }

    /**
     * 设置评估时间
     *
     * @param valueTime 评估时间
     */
    public void setValueTime(String valueTime) {
        this.valueTime = valueTime == null ? null : valueTime.trim();
    }

    /**
     * 获取病历解析
     *
     * @return EMR_CONTENT_PARSE - 病历解析
     */
    public String getEmrContentParse() {
        return emrContentParse;
    }

    /**
     * 设置病历解析
     *
     * @param emrContentParse 病历解析
     */
    public void setEmrContentParse(String emrContentParse) {
        this.emrContentParse = emrContentParse == null ? null : emrContentParse.trim();
    }

    /**
     * @return EMR_CONTENT
     */
    public String getEmrContent() {
        return emrContent;
    }

    /**
     * @param emrContent
     */
    public void setEmrContent(String emrContent) {
        this.emrContent = emrContent == null ? null : emrContent.trim();
    }
}