package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_RISK_ASSESSMENT")
public class QxTKpiRiskAssessment {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 评估类型（0：未知，1：肇事肇祸评估，2：自杀自伤风险评估，3：擅自离院风险评估）
     */
    @Column(name = "RTYPE")
    private Long rtype;

    /**
     * 病人唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人住院号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 评估时间时间
     */
    @Column(name = "AS_TIME")
    private String asTime;

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
     * 获取评估类型（0：未知，1：肇事肇祸评估，2：自杀自伤风险评估，3：擅自离院风险评估）
     *
     * @return RTYPE - 评估类型（0：未知，1：肇事肇祸评估，2：自杀自伤风险评估，3：擅自离院风险评估）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置评估类型（0：未知，1：肇事肇祸评估，2：自杀自伤风险评估，3：擅自离院风险评估）
     *
     * @param rtype 评估类型（0：未知，1：肇事肇祸评估，2：自杀自伤风险评估，3：擅自离院风险评估）
     */
    public void setRtype(Long rtype) {
        this.rtype = rtype;
    }

    /**
     * 获取病人唯一标识
     *
     * @return IHUID - 病人唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param ihuid 病人唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人住院号
     *
     * @return INHOS_NO - 病人住院号
     */
    public String getInhosNo() {
        return inhosNo;
    }

    /**
     * 设置病人住院号
     *
     * @param inhosNo 病人住院号
     */
    public void setInhosNo(String inhosNo) {
        this.inhosNo = inhosNo == null ? null : inhosNo.trim();
    }

    /**
     * 获取评估时间时间
     *
     * @return AS_TIME - 评估时间时间
     */
    public String getAsTime() {
        return asTime;
    }

    /**
     * 设置评估时间时间
     *
     * @param asTime 评估时间时间
     */
    public void setAsTime(String asTime) {
        this.asTime = asTime == null ? null : asTime.trim();
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