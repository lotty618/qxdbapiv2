package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_SEVERE_EMR_VALUE")
public class QxTSevereEmrValue {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 告危重病历唯一标识
     */
    @Column(name = "SEVUID")
    private String sevuid;

    /**
     * 告危重唯一标识
     */
    @Column(name = "SVUID")
    private String svuid;

    /**
     * 患者唯一ID
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 住院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 项目（医嘱）唯一标识
     */
    @Column(name = "ITEMUID")
    private String itemuid;

    /**
     * 结果时间==危急值发现时间
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 病历类型（1：病历处理（查房记录），2：护理处理）
     */
    @Column(name = "EMR_TYPE")
    private Long emrType;

    /**
     * 病历时间
     */
    @Column(name = "EMR_TIME")
    private String emrTime;

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
     * 获取告危重病历唯一标识
     *
     * @return SEVUID - 告危重病历唯一标识
     */
    public String getSevuid() {
        return sevuid;
    }

    /**
     * 设置告危重病历唯一标识
     *
     * @param sevuid 告危重病历唯一标识
     */
    public void setSevuid(String sevuid) {
        this.sevuid = sevuid == null ? null : sevuid.trim();
    }

    /**
     * 获取告危重唯一标识
     *
     * @return SVUID - 告危重唯一标识
     */
    public String getSvuid() {
        return svuid;
    }

    /**
     * 设置告危重唯一标识
     *
     * @param svuid 告危重唯一标识
     */
    public void setSvuid(String svuid) {
        this.svuid = svuid == null ? null : svuid.trim();
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
     * 获取住院标识
     *
     * @return IHUID - 住院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院标识
     *
     * @param ihuid 住院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取项目（医嘱）唯一标识
     *
     * @return ITEMUID - 项目（医嘱）唯一标识
     */
    public String getItemuid() {
        return itemuid;
    }

    /**
     * 设置项目（医嘱）唯一标识
     *
     * @param itemuid 项目（医嘱）唯一标识
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
     * 获取病历类型（1：病历处理（查房记录），2：护理处理）
     *
     * @return EMR_TYPE - 病历类型（1：病历处理（查房记录），2：护理处理）
     */
    public Long getEmrType() {
        return emrType;
    }

    /**
     * 设置病历类型（1：病历处理（查房记录），2：护理处理）
     *
     * @param emrType 病历类型（1：病历处理（查房记录），2：护理处理）
     */
    public void setEmrType(Long emrType) {
        this.emrType = emrType;
    }

    /**
     * 获取病历时间
     *
     * @return EMR_TIME - 病历时间
     */
    public String getEmrTime() {
        return emrTime;
    }

    /**
     * 设置病历时间
     *
     * @param emrTime 病历时间
     */
    public void setEmrTime(String emrTime) {
        this.emrTime = emrTime == null ? null : emrTime.trim();
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