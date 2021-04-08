package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_KPI_DEPT_DIC")
public class QxzskTKpiDeptDic {
    @Column(name = "SID")
    private Short sid;

    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 1表示住院科室，2表示门诊科室，3表示其他科室
     */
    @Column(name = "DEPT_CODE")
    private Short deptCode;

    @Column(name = "DEPT_CODE_DESC")
    private String deptCodeDesc;

    /**
     * @return SID
     */
    public Short getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Short sid) {
        this.sid = sid;
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
     * 获取1表示住院科室，2表示门诊科室，3表示其他科室
     *
     * @return DEPT_CODE - 1表示住院科室，2表示门诊科室，3表示其他科室
     */
    public Short getDeptCode() {
        return deptCode;
    }

    /**
     * 设置1表示住院科室，2表示门诊科室，3表示其他科室
     *
     * @param deptCode 1表示住院科室，2表示门诊科室，3表示其他科室
     */
    public void setDeptCode(Short deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * @return DEPT_CODE_DESC
     */
    public String getDeptCodeDesc() {
        return deptCodeDesc;
    }

    /**
     * @param deptCodeDesc
     */
    public void setDeptCodeDesc(String deptCodeDesc) {
        this.deptCodeDesc = deptCodeDesc == null ? null : deptCodeDesc.trim();
    }
}