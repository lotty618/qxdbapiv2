package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_KPI_QUALITY_DEPT_VALUE")
public class QxzskTKpiQualityDeptValue {
    @Column(name = "SID")
    private Integer sid;

    @Column(name = "KPIID")
    private String kpiid;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "KPI_VALUE")
    private String kpiValue;

    @Column(name = "KPI_TIME")
    private String kpiTime;

    @Column(name = "CREATE_TIME")
    private String createTime;

    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * @return SID
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return KPIID
     */
    public String getKpiid() {
        return kpiid;
    }

    /**
     * @param kpiid
     */
    public void setKpiid(String kpiid) {
        this.kpiid = kpiid == null ? null : kpiid.trim();
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * @return KPI_VALUE
     */
    public String getKpiValue() {
        return kpiValue;
    }

    /**
     * @param kpiValue
     */
    public void setKpiValue(String kpiValue) {
        this.kpiValue = kpiValue == null ? null : kpiValue.trim();
    }

    /**
     * @return KPI_TIME
     */
    public String getKpiTime() {
        return kpiTime;
    }

    /**
     * @param kpiTime
     */
    public void setKpiTime(String kpiTime) {
        this.kpiTime = kpiTime == null ? null : kpiTime.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * @return UPDATE_TIME
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}