package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORDER_FREQ")
public class OrderFreq {
    /**
     * ID
     */
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 频次编码
     */
    @Column(name = "PCMC")
    private String pcmc;

    /**
     * 执行时间
     */
    @Column(name = "ZXSJ")
    private String zxsj;

    /**
     * 频次名称
     */
    @Column(name = "ZWDM")
    private String zwdm;

    /**
     * 最大末次
     */
    @Column(name = "MRCS")
    private BigDecimal mrcs;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 获取频次编码
     *
     * @return PCMC - 频次编码
     */
    public String getPcmc() {
        return pcmc;
    }

    /**
     * 设置频次编码
     *
     * @param pcmc 频次编码
     */
    public void setPcmc(String pcmc) {
        this.pcmc = pcmc == null ? null : pcmc.trim();
    }

    /**
     * 获取执行时间
     *
     * @return ZXSJ - 执行时间
     */
    public String getZxsj() {
        return zxsj;
    }

    /**
     * 设置执行时间
     *
     * @param zxsj 执行时间
     */
    public void setZxsj(String zxsj) {
        this.zxsj = zxsj == null ? null : zxsj.trim();
    }

    /**
     * 获取频次名称
     *
     * @return ZWDM - 频次名称
     */
    public String getZwdm() {
        return zwdm;
    }

    /**
     * 设置频次名称
     *
     * @param zwdm 频次名称
     */
    public void setZwdm(String zwdm) {
        this.zwdm = zwdm == null ? null : zwdm.trim();
    }

    /**
     * 获取最大末次
     *
     * @return MRCS - 最大末次
     */
    public BigDecimal getMrcs() {
        return mrcs;
    }

    /**
     * 设置最大末次
     *
     * @param mrcs 最大末次
     */
    public void setMrcs(BigDecimal mrcs) {
        this.mrcs = mrcs;
    }
}