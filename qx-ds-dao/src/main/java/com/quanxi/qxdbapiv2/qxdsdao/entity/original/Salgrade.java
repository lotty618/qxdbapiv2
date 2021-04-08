package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "SCOTT.SALGRADE")
public class Salgrade {
    @Column(name = "GRADE")
    private BigDecimal grade;

    @Column(name = "LOSAL")
    private BigDecimal losal;

    @Column(name = "HISAL")
    private BigDecimal hisal;

    /**
     * @return GRADE
     */
    public BigDecimal getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    /**
     * @return LOSAL
     */
    public BigDecimal getLosal() {
        return losal;
    }

    /**
     * @param losal
     */
    public void setLosal(BigDecimal losal) {
        this.losal = losal;
    }

    /**
     * @return HISAL
     */
    public BigDecimal getHisal() {
        return hisal;
    }

    /**
     * @param hisal
     */
    public void setHisal(BigDecimal hisal) {
        this.hisal = hisal;
    }
}