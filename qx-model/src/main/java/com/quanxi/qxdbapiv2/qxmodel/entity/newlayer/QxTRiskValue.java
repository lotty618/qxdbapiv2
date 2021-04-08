package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_RISK_VALUE")
public class QxTRiskValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 高风险唯一标识
     */
    @Column(name = "RVUID")
    private String rvuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 高风险重要时间点
     */
    @Column(name = "RISKIMPTIME")
    private String riskimptime;

    /**
     * 发现天数
     */
    @Column(name = "RISKDAY")
    private String riskday;

    /**
     * 高风险类型
     */
    @Column(name = "RISKTYPE")
    private String risktype;

    /**
     * 高风险发现时间
     */
    @Column(name = "RISKTIME")
    private String risktime;

    /**
     * 风险复评(0=无,1=有)
     */
    @Column(name = "ISRISKCOMMENT")
    private Long isriskcomment;

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
     * 是否有出院评估（1：有，0：无）
     */
    private String isoutvalue;

    /**
     * 出院去向
     */
    private String outfrom;

    /**
     * 风险复评时间
     */
    @Column(name = "RISKCOMMENTTIME")
    private String riskcommenttime;

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
     * 获取高风险唯一标识
     *
     * @return RVUID - 高风险唯一标识
     */
    public String getRvuid() {
        return rvuid;
    }

    /**
     * 设置高风险唯一标识
     *
     * @param rvuid 高风险唯一标识
     */
    public void setRvuid(String rvuid) {
        this.rvuid = rvuid == null ? null : rvuid.trim();
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
     * 获取高风险重要时间点
     *
     * @return RISKIMPTIME - 高风险重要时间点
     */
    public String getRiskimptime() {
        return riskimptime;
    }

    /**
     * 设置高风险重要时间点
     *
     * @param riskimptime 高风险重要时间点
     */
    public void setRiskimptime(String riskimptime) {
        this.riskimptime = riskimptime == null ? null : riskimptime.trim();
    }

    /**
     * 获取发现天数
     *
     * @return RISKDAY - 发现天数
     */
    public String getRiskday() {
        return riskday;
    }

    /**
     * 设置发现天数
     *
     * @param riskday 发现天数
     */
    public void setRiskday(String riskday) {
        this.riskday = riskday == null ? null : riskday.trim();
    }

    /**
     * 获取高风险类型
     *
     * @return RISKTYPE - 高风险类型
     */
    public String getRisktype() {
        return risktype;
    }

    /**
     * 设置高风险类型
     *
     * @param risktype 高风险类型
     */
    public void setRisktype(String risktype) {
        this.risktype = risktype == null ? null : risktype.trim();
    }

    /**
     * 获取高风险发现时间
     *
     * @return RISKTIME - 高风险发现时间
     */
    public String getRisktime() {
        return risktime;
    }

    /**
     * 设置高风险发现时间
     *
     * @param risktime 高风险发现时间
     */
    public void setRisktime(String risktime) {
        this.risktime = risktime == null ? null : risktime.trim();
    }

    /**
     * 获取风险复评(0=无,1=有)
     *
     * @return ISRISKCOMMENT - 风险复评(0=无,1=有)
     */
    public Long getIsriskcomment() {
        return isriskcomment;
    }

    /**
     * 设置风险复评(0=无,1=有)
     *
     * @param isriskcomment 风险复评(0=无,1=有)
     */
    public void setIsriskcomment(Long isriskcomment) {
        this.isriskcomment = isriskcomment;
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
     * 获取是否有出院评估（1：有，0：无）
     *
     * @return isoutvalue - 是否有出院评估（1：有，0：无）
     */
    public String getIsoutvalue() {
        return isoutvalue;
    }

    /**
     * 设置是否有出院评估（1：有，0：无）
     *
     * @param isoutvalue 是否有出院评估（1：有，0：无）
     */
    public void setIsoutvalue(String isoutvalue) {
        this.isoutvalue = isoutvalue == null ? null : isoutvalue.trim();
    }

    /**
     * 获取出院去向
     *
     * @return outfrom - 出院去向
     */
    public String getOutfrom() {
        return outfrom;
    }

    /**
     * 设置出院去向
     *
     * @param outfrom 出院去向
     */
    public void setOutfrom(String outfrom) {
        this.outfrom = outfrom == null ? null : outfrom.trim();
    }

    /**
     * 获取风险复评时间
     *
     * @return RISKCOMMENTTIME - 风险复评时间
     */
    public String getRiskcommenttime() {
        return riskcommenttime;
    }

    /**
     * 设置风险复评时间
     *
     * @param riskcommenttime 风险复评时间
     */
    public void setRiskcommenttime(String riskcommenttime) {
        this.riskcommenttime = riskcommenttime == null ? null : riskcommenttime.trim();
    }
}