package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_MED_PURCHASE")
public class QxTKpiMedPurchase {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 药品采购唯一标识
     */
    @Column(name = "MEDPUID")
    private String medpuid;

    /**
     * 药品唯一标识
     */
    @Column(name = "MEDUID")
    private String meduid;

    /**
     * 药品类型代码
     */
    @Column(name = "MED_TYPE_CODE")
    private String medTypeCode;

    /**
     * 采购时间时间
     */
    @Column(name = "PURCHASE_TIME")
    private String purchaseTime;

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
     * 获取药品采购唯一标识
     *
     * @return MEDPUID - 药品采购唯一标识
     */
    public String getMedpuid() {
        return medpuid;
    }

    /**
     * 设置药品采购唯一标识
     *
     * @param medpuid 药品采购唯一标识
     */
    public void setMedpuid(String medpuid) {
        this.medpuid = medpuid == null ? null : medpuid.trim();
    }

    /**
     * 获取药品唯一标识
     *
     * @return MEDUID - 药品唯一标识
     */
    public String getMeduid() {
        return meduid;
    }

    /**
     * 设置药品唯一标识
     *
     * @param meduid 药品唯一标识
     */
    public void setMeduid(String meduid) {
        this.meduid = meduid == null ? null : meduid.trim();
    }

    /**
     * 获取药品类型代码
     *
     * @return MED_TYPE_CODE - 药品类型代码
     */
    public String getMedTypeCode() {
        return medTypeCode;
    }

    /**
     * 设置药品类型代码
     *
     * @param medTypeCode 药品类型代码
     */
    public void setMedTypeCode(String medTypeCode) {
        this.medTypeCode = medTypeCode == null ? null : medTypeCode.trim();
    }

    /**
     * 获取采购时间时间
     *
     * @return PURCHASE_TIME - 采购时间时间
     */
    public String getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * 设置采购时间时间
     *
     * @param purchaseTime 采购时间时间
     */
    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime == null ? null : purchaseTime.trim();
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