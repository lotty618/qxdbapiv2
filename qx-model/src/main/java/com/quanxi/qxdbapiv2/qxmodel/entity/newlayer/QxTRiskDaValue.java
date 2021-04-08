package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_RISK_DA_VALUE")
public class QxTRiskDaValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 高风险医嘱唯一标识
     */
    @Column(name = "RDVUID")
    private String rdvuid;

    /**
     * 高风险唯一标识
     */
    @Column(name = "RVUID")
    private String rvuid;

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
     * 开嘱日期
     */
    @Column(name = "ORDER_DATE")
    private String orderDate;

    /**
     * 开嘱意思名称
     */
    @Column(name = "ORDER_DOCTOR_NAME")
    private String orderDoctorName;

    /**
     * 医嘱名称
     */
    @Column(name = "ORDER_LOCAL_CN")
    private String orderLocalCn;

    /**
     * 医嘱唯一标识
     */
    @Column(name = "DAUID")
    private String dauid;

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
     * 获取高风险医嘱唯一标识
     *
     * @return RDVUID - 高风险医嘱唯一标识
     */
    public String getRdvuid() {
        return rdvuid;
    }

    /**
     * 设置高风险医嘱唯一标识
     *
     * @param rdvuid 高风险医嘱唯一标识
     */
    public void setRdvuid(String rdvuid) {
        this.rdvuid = rdvuid == null ? null : rdvuid.trim();
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
     * 获取开嘱日期
     *
     * @return ORDER_DATE - 开嘱日期
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 设置开嘱日期
     *
     * @param orderDate 开嘱日期
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    /**
     * 获取开嘱意思名称
     *
     * @return ORDER_DOCTOR_NAME - 开嘱意思名称
     */
    public String getOrderDoctorName() {
        return orderDoctorName;
    }

    /**
     * 设置开嘱意思名称
     *
     * @param orderDoctorName 开嘱意思名称
     */
    public void setOrderDoctorName(String orderDoctorName) {
        this.orderDoctorName = orderDoctorName == null ? null : orderDoctorName.trim();
    }

    /**
     * 获取医嘱名称
     *
     * @return ORDER_LOCAL_CN - 医嘱名称
     */
    public String getOrderLocalCn() {
        return orderLocalCn;
    }

    /**
     * 设置医嘱名称
     *
     * @param orderLocalCn 医嘱名称
     */
    public void setOrderLocalCn(String orderLocalCn) {
        this.orderLocalCn = orderLocalCn == null ? null : orderLocalCn.trim();
    }

    /**
     * 获取医嘱唯一标识
     *
     * @return DAUID - 医嘱唯一标识
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱唯一标识
     *
     * @param dauid 医嘱唯一标识
     */
    public void setDauid(String dauid) {
        this.dauid = dauid == null ? null : dauid.trim();
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