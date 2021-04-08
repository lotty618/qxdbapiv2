package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_RT_QCSKPI_VALUE")
public class QxTRtQcskpiValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 指标ID
     */
    @Column(name = "KPISID")
    private String kpisid;

    /**
     * 指标ID
     */
    @Column(name = "KPIID")
    private String kpiid;

    /**
     * 第几个指标
     */
    @Column(name = "KPI_TYPE")
    private String kpiType;

    /**
     * 指标结果
     */
    @Column(name = "KPI_VALUE")
    private String kpiValue;

    /**
     * 指标值
     */
    @Column(name = "DISEASE_NAME")
    private String diseaseName;

    /**
     * 指标类型
     */
    @Column(name = "DTYPE")
    private Long dtype;

    /**
     * 指标状态
     */
    @Column(name = "STATUS")
    private Long status;

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
     * 指标所属时间
     */
    @Column(name = "KPI_TIME")
    private String kpiTime;

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
     * 获取指标ID
     *
     * @return KPISID - 指标ID
     */
    public String getKpisid() {
        return kpisid;
    }

    /**
     * 设置指标ID
     *
     * @param kpisid 指标ID
     */
    public void setKpisid(String kpisid) {
        this.kpisid = kpisid == null ? null : kpisid.trim();
    }

    /**
     * 获取指标ID
     *
     * @return KPIID - 指标ID
     */
    public String getKpiid() {
        return kpiid;
    }

    /**
     * 设置指标ID
     *
     * @param kpiid 指标ID
     */
    public void setKpiid(String kpiid) {
        this.kpiid = kpiid == null ? null : kpiid.trim();
    }

    /**
     * 获取第几个指标
     *
     * @return KPI_TYPE - 第几个指标
     */
    public String getKpiType() {
        return kpiType;
    }

    /**
     * 设置第几个指标
     *
     * @param kpiType 第几个指标
     */
    public void setKpiType(String kpiType) {
        this.kpiType = kpiType == null ? null : kpiType.trim();
    }

    /**
     * 获取指标结果
     *
     * @return KPI_VALUE - 指标结果
     */
    public String getKpiValue() {
        return kpiValue;
    }

    /**
     * 设置指标结果
     *
     * @param kpiValue 指标结果
     */
    public void setKpiValue(String kpiValue) {
        this.kpiValue = kpiValue == null ? null : kpiValue.trim();
    }

    /**
     * 获取指标值
     *
     * @return DISEASE_NAME - 指标值
     */
    public String getDiseaseName() {
        return diseaseName;
    }

    /**
     * 设置指标值
     *
     * @param diseaseName 指标值
     */
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    /**
     * 获取指标类型
     *
     * @return DTYPE - 指标类型
     */
    public Long getDtype() {
        return dtype;
    }

    /**
     * 设置指标类型
     *
     * @param dtype 指标类型
     */
    public void setDtype(Long dtype) {
        this.dtype = dtype;
    }

    /**
     * 获取指标状态
     *
     * @return STATUS - 指标状态
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 设置指标状态
     *
     * @param status 指标状态
     */
    public void setStatus(Long status) {
        this.status = status;
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
     * 获取指标所属时间
     *
     * @return KPI_TIME - 指标所属时间
     */
    public String getKpiTime() {
        return kpiTime;
    }

    /**
     * 设置指标所属时间
     *
     * @param kpiTime 指标所属时间
     */
    public void setKpiTime(String kpiTime) {
        this.kpiTime = kpiTime == null ? null : kpiTime.trim();
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