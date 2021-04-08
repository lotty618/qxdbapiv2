package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "SCOTT.DEPT")
public class Dept {
    @Id
    @Column(name = "DEPTNO")
    private BigDecimal deptno;

    @Column(name = "DNAME")
    private String dname;

    @Column(name = "LOC")
    private String loc;

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

    /**
     * @return DNAME
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * @return LOC
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @param loc
     */
    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}