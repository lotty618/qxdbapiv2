package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_SEVERE_VALUE")
public class QxTSevereValue {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 告危重唯一标识
     */
    @Column(name = "SVUID")
    private String svuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 重要时间点
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 医嘱标识
     */
    @Column(name = "DAUID")
    private String dauid;

    /**
     * 医嘱名称
     */
    @Column(name = "ORDER_NAME")
    private String orderName;

    /**
     * 异常问题点
     */
    @Column(name = "ABNORMAL")
    private String abnormal;

    /**
     * 是否异常（0：否，1：是）
     */
    @Column(name = "IS_ABNORMAL")
    private String isAbnormal;

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
     * 是否有出院评估（1有，空值/0为无或者未出院）
     */
    @Column(name = "OUTVALUE_IS")
    private String outvalueIs;

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
     * 获取重要时间点
     *
     * @return EFFECTIVE_DATE - 重要时间点
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置重要时间点
     *
     * @param effectiveDate 重要时间点
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取医嘱标识
     *
     * @return DAUID - 医嘱标识
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱标识
     *
     * @param dauid 医嘱标识
     */
    public void setDauid(String dauid) {
        this.dauid = dauid == null ? null : dauid.trim();
    }

    /**
     * 获取医嘱名称
     *
     * @return ORDER_NAME - 医嘱名称
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * 设置医嘱名称
     *
     * @param orderName 医嘱名称
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    /**
     * 获取异常问题点
     *
     * @return ABNORMAL - 异常问题点
     */
    public String getAbnormal() {
        return abnormal;
    }

    /**
     * 设置异常问题点
     *
     * @param abnormal 异常问题点
     */
    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal == null ? null : abnormal.trim();
    }

    /**
     * 获取是否异常（0：否，1：是）
     *
     * @return IS_ABNORMAL - 是否异常（0：否，1：是）
     */
    public String getIsAbnormal() {
        return isAbnormal;
    }

    /**
     * 设置是否异常（0：否，1：是）
     *
     * @param isAbnormal 是否异常（0：否，1：是）
     */
    public void setIsAbnormal(String isAbnormal) {
        this.isAbnormal = isAbnormal == null ? null : isAbnormal.trim();
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
     * 获取是否有出院评估（1有，空值/0为无或者未出院）
     *
     * @return OUTVALUE_IS - 是否有出院评估（1有，空值/0为无或者未出院）
     */
    public String getOutvalueIs() {
        return outvalueIs;
    }

    /**
     * 设置是否有出院评估（1有，空值/0为无或者未出院）
     *
     * @param outvalueIs 是否有出院评估（1有，空值/0为无或者未出院）
     */
    public void setOutvalueIs(String outvalueIs) {
        this.outvalueIs = outvalueIs == null ? null : outvalueIs.trim();
    }
}