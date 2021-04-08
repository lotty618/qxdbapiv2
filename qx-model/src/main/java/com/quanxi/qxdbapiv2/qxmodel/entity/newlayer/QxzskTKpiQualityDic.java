package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_KPI_QUALITY_DIC")
public class QxzskTKpiQualityDic {
    /**
     * 指标编号
     */
    private String kpitype;

    /**
     * 南君凯的库
     */
    @Column(name = "ralateId")
    private String ralateid;

    /**
     * 指标编号
     */
    private String kpiid;

    /**
     * 指标值
     */
    private String symbol;

    /**
     * 指标内容
     */
    private String content;

    /**
     * 计算方式
     */
    private String calculator;

    /**
     * 计算类型(1年 2月 3日)
     */
    private Long timecycletype;

    /**
     * 根据timecycletype字段填写年月天
     */
    private String timecycle;

    /**
     * 计算方式(0无法计算 1可算 2后端计算)
     */
    private Long calculatorcode;

    /**
     * 根据timecycletype字段填写无法计算,可算,后端计算
     */
    private String calculatorremark;

    /**
     * 编写SQL
     */
    @Column(name = "sql_content")
    private String sqlContent;

    /**
     * 获取指标编号
     *
     * @return kpitype - 指标编号
     */
    public String getKpitype() {
        return kpitype;
    }

    /**
     * 设置指标编号
     *
     * @param kpitype 指标编号
     */
    public void setKpitype(String kpitype) {
        this.kpitype = kpitype == null ? null : kpitype.trim();
    }

    /**
     * 获取南君凯的库
     *
     * @return ralateId - 南君凯的库
     */
    public String getRalateid() {
        return ralateid;
    }

    /**
     * 设置南君凯的库
     *
     * @param ralateid 南君凯的库
     */
    public void setRalateid(String ralateid) {
        this.ralateid = ralateid == null ? null : ralateid.trim();
    }

    /**
     * 获取指标编号
     *
     * @return kpiid - 指标编号
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
     * @return symbol - 指标值
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 设置指标值
     *
     * @param symbol 指标值
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    /**
     * 获取指标内容
     *
     * @return content - 指标内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置指标内容
     *
     * @param content 指标内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取计算方式
     *
     * @return calculator - 计算方式
     */
    public String getCalculator() {
        return calculator;
    }

    /**
     * 设置计算方式
     *
     * @param calculator 计算方式
     */
    public void setCalculator(String calculator) {
        this.calculator = calculator == null ? null : calculator.trim();
    }

    /**
     * 获取计算类型(1年 2月 3日)
     *
     * @return timecycletype - 计算类型(1年 2月 3日)
     */
    public Long getTimecycletype() {
        return timecycletype;
    }

    /**
     * 设置计算类型(1年 2月 3日)
     *
     * @param timecycletype 计算类型(1年 2月 3日)
     */
    public void setTimecycletype(Long timecycletype) {
        this.timecycletype = timecycletype;
    }

    /**
     * 获取根据timecycletype字段填写年月天
     *
     * @return timecycle - 根据timecycletype字段填写年月天
     */
    public String getTimecycle() {
        return timecycle;
    }

    /**
     * 设置根据timecycletype字段填写年月天
     *
     * @param timecycle 根据timecycletype字段填写年月天
     */
    public void setTimecycle(String timecycle) {
        this.timecycle = timecycle == null ? null : timecycle.trim();
    }

    /**
     * 获取计算方式(0无法计算 1可算 2后端计算)
     *
     * @return calculatorcode - 计算方式(0无法计算 1可算 2后端计算)
     */
    public Long getCalculatorcode() {
        return calculatorcode;
    }

    /**
     * 设置计算方式(0无法计算 1可算 2后端计算)
     *
     * @param calculatorcode 计算方式(0无法计算 1可算 2后端计算)
     */
    public void setCalculatorcode(Long calculatorcode) {
        this.calculatorcode = calculatorcode;
    }

    /**
     * 获取根据timecycletype字段填写无法计算,可算,后端计算
     *
     * @return calculatorremark - 根据timecycletype字段填写无法计算,可算,后端计算
     */
    public String getCalculatorremark() {
        return calculatorremark;
    }

    /**
     * 设置根据timecycletype字段填写无法计算,可算,后端计算
     *
     * @param calculatorremark 根据timecycletype字段填写无法计算,可算,后端计算
     */
    public void setCalculatorremark(String calculatorremark) {
        this.calculatorremark = calculatorremark == null ? null : calculatorremark.trim();
    }

    /**
     * 获取编写SQL
     *
     * @return sql_content - 编写SQL
     */
    public String getSqlContent() {
        return sqlContent;
    }

    /**
     * 设置编写SQL
     *
     * @param sqlContent 编写SQL
     */
    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent == null ? null : sqlContent.trim();
    }
}