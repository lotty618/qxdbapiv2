package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CRITICAL_DA_VALUE")
public class QxTCriticalDaValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 危急值医嘱唯一标识
     */
    @Column(name = "CDVUID")
    private String cdvuid;

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
     * 住院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

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
     * 获取危急值医嘱唯一标识
     *
     * @return CDVUID - 危急值医嘱唯一标识
     */
    public String getCdvuid() {
        return cdvuid;
    }

    /**
     * 设置危急值医嘱唯一标识
     *
     * @param cdvuid 危急值医嘱唯一标识
     */
    public void setCdvuid(String cdvuid) {
        this.cdvuid = cdvuid == null ? null : cdvuid.trim();
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