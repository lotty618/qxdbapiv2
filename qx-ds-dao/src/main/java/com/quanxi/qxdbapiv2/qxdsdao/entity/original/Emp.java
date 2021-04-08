package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "SCOTT.EMP")
public class Emp {
    @Id
    @Column(name = "EMPNO")
    private BigDecimal empno;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "JOB")
    private String job;

    @Column(name = "MGR")
    private BigDecimal mgr;

    @Column(name = "HIREDATE")
    private Date hiredate;

    @Column(name = "SAL")
    private BigDecimal sal;

    @Column(name = "COMM")
    private BigDecimal comm;

    @Column(name = "DEPTNO")
    private BigDecimal deptno;

    /**
     * @return EMPNO
     */
    public BigDecimal getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(BigDecimal empno) {
        this.empno = empno;
    }

    /**
     * @return ENAME
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * @return JOB
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * @return MGR
     */
    public BigDecimal getMgr() {
        return mgr;
    }

    /**
     * @param mgr
     */
    public void setMgr(BigDecimal mgr) {
        this.mgr = mgr;
    }

    /**
     * @return HIREDATE
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * @param hiredate
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * @return SAL
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * @param sal
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * @return COMM
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * @param comm
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * @return DEPTNO
     */
    public BigDecimal getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(BigDecimal deptno) {
        this.deptno = deptno;
    }
}