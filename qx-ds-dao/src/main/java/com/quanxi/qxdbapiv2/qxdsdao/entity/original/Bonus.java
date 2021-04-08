package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "SCOTT.BONUS")
public class Bonus {
    @Column(name = "ENAME")
    private String ename;

    @Column(name = "JOB")
    private String job;

    @Column(name = "SAL")
    private BigDecimal sal;

    @Column(name = "COMM")
    private BigDecimal comm;

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
}