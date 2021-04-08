package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_KPI_TEMP")
public class QxzskTKpiTemp {
    private String kpitype;

    @Column(name = "ralateId")
    private String ralateid;

    private String kpiid;

    private String symbol;

    private String content;

    private String calculator;

    /**
     * @return kpitype
     */
    public String getKpitype() {
        return kpitype;
    }

    /**
     * @param kpitype
     */
    public void setKpitype(String kpitype) {
        this.kpitype = kpitype == null ? null : kpitype.trim();
    }

    /**
     * @return ralateId
     */
    public String getRalateid() {
        return ralateid;
    }

    /**
     * @param ralateid
     */
    public void setRalateid(String ralateid) {
        this.ralateid = ralateid == null ? null : ralateid.trim();
    }

    /**
     * @return kpiid
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
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return calculator
     */
    public String getCalculator() {
        return calculator;
    }

    /**
     * @param calculator
     */
    public void setCalculator(String calculator) {
        this.calculator = calculator == null ? null : calculator.trim();
    }
}