package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CRITICAL_EMR_VALUE")
public class QxTCriticalEmrValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 危急值病历唯一标识
     */
    @Column(name = "CEVUID")
    private String cevuid;

    /**
     * 危急值唯一标识
     */
    @Column(name = "CVUID")
    private String cvuid;

    /**
     * 患者唯一ID
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 本地事件号（门诊号或者住院号）
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 项目（检验，影像）唯一标识
     */
    @Column(name = "ITEMUID")
    private String itemuid;

    /**
     * 结果时间==危急值发现时间
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    @Column(name = "TYPE")
    private Long type;

    /**
     * 病历类型（1：查房记录，2：护理处理）
     */
    @Column(name = "EMR_TYPE")
    private String emrType;

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
     * 病历内容
     */
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
     * 获取危急值病历唯一标识
     *
     * @return CEVUID - 危急值病历唯一标识
     */
    public String getCevuid() {
        return cevuid;
    }

    /**
     * 设置危急值病历唯一标识
     *
     * @param cevuid 危急值病历唯一标识
     */
    public void setCevuid(String cevuid) {
        this.cevuid = cevuid == null ? null : cevuid.trim();
    }

    /**
     * 获取危急值唯一标识
     *
     * @return CVUID - 危急值唯一标识
     */
    public String getCvuid() {
        return cvuid;
    }

    /**
     * 设置危急值唯一标识
     *
     * @param cvuid 危急值唯一标识
     */
    public void setCvuid(String cvuid) {
        this.cvuid = cvuid == null ? null : cvuid.trim();
    }

    /**
     * 获取患者唯一ID
     *
     * @return PUID - 患者唯一ID
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置患者唯一ID
     *
     * @param puid 患者唯一ID
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取本地事件号（门诊号或者住院号）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取项目（检验，影像）唯一标识
     *
     * @return ITEMUID - 项目（检验，影像）唯一标识
     */
    public String getItemuid() {
        return itemuid;
    }

    /**
     * 设置项目（检验，影像）唯一标识
     *
     * @param itemuid 项目（检验，影像）唯一标识
     */
    public void setItemuid(String itemuid) {
        this.itemuid = itemuid == null ? null : itemuid.trim();
    }

    /**
     * 获取结果时间==危急值发现时间
     *
     * @return EFFECTIVE_DATE - 结果时间==危急值发现时间
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置结果时间==危急值发现时间
     *
     * @param effectiveDate 结果时间==危急值发现时间
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取危急值来源类型(1:检验危急值 2:影像危急值)
     *
     * @return TYPE - 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    public Long getType() {
        return type;
    }

    /**
     * 设置危急值来源类型(1:检验危急值 2:影像危急值)
     *
     * @param type 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 获取病历类型（1：查房记录，2：护理处理）
     *
     * @return EMR_TYPE - 病历类型（1：查房记录，2：护理处理）
     */
    public String getEmrType() {
        return emrType;
    }

    /**
     * 设置病历类型（1：查房记录，2：护理处理）
     *
     * @param emrType 病历类型（1：查房记录，2：护理处理）
     */
    public void setEmrType(String emrType) {
        this.emrType = emrType == null ? null : emrType.trim();
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
     * 获取病历内容
     *
     * @return EMR_CONTENT - 病历内容
     */
    public String getEmrContent() {
        return emrContent;
    }

    /**
     * 设置病历内容
     *
     * @param emrContent 病历内容
     */
    public void setEmrContent(String emrContent) {
        this.emrContent = emrContent == null ? null : emrContent.trim();
    }
}