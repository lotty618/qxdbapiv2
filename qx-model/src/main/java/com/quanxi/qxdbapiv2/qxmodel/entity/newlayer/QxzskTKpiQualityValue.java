package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QXZSK_T_KPI_QUALITY_VALUE")
public class QxzskTKpiQualityValue {
    /**
     * 添加序列自增长
     */
    @Column(name = "ID")
    private Long id;

    /**
     * 指标编号
     */
    @Column(name = "KPIID")
    private String kpiid;

    /**
     * 指标值
     */
    @Column(name = "KPI_VALUE")
    private BigDecimal kpiValue;

    /**
     * 指标时间
     */
    @Column(name = "KPI_TIME")
    private String kpiTime;

    /**
     * 新增时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 获取添加序列自增长
     *
     * @return ID - 添加序列自增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置添加序列自增长
     *
     * @param id 添加序列自增长
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取指标编号
     *
     * @return KPIID - 指标编号
     */
    public String getKpiid() {
        return kpiid;
    }

    /**
     * 设置指标编号
     *
     * @param kpiid 指标编号
     */
    public void setKpiid(String kpiid) {
        this.kpiid = kpiid == null ? null : kpiid.trim();
    }

    /**
     * 获取指标值
     *
     * @return KPI_VALUE - 指标值
     */
    public BigDecimal getKpiValue() {
        return kpiValue;
    }

    /**
     * 设置指标值
     *
     * @param kpiValue 指标值
     */
    public void setKpiValue(BigDecimal kpiValue) {
        this.kpiValue = kpiValue;
    }

    /**
     * 获取指标时间
     *
     * @return KPI_TIME - 指标时间
     */
    public String getKpiTime() {
        return kpiTime;
    }

    /**
     * 设置指标时间
     *
     * @param kpiTime 指标时间
     */
    public void setKpiTime(String kpiTime) {
        this.kpiTime = kpiTime == null ? null : kpiTime.trim();
    }

    /**
     * 获取新增时间
     *
     * @return CREATE_TIME - 新增时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置新增时间
     *
     * @param createTime 新增时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}