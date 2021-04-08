package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_WARM_CRITICAL_ANALYSE")
public class QxzskTWarmCriticalAnalyse {
    /**
     * 住院编号
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 告危重时间（yyyy-mm-rr 24hh:mm:ss）
     */
    @Column(name = "VALUE_DATE")
    private String valueDate;

    /**
     * 是否异常（0无，1有）
     */
    @Column(name = "ABNORMAL_IS")
    private String abnormalIs;

    /**
     * 异常内容
     */
    @Column(name = "ABNORMAL_DETAIL")
    private String abnormalDetail;

    /**
     * 医嘱唯一编号
     */
    @Column(name = "DAUID")
    private String dauid;

    /**
     * 出院时间
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 是否有出院评估（1有，空值/0为无或者未出院）
     */
    @Column(name = "OUTVALUE_IS")
    private String outvalueIs;

    /**
     * 数据组分析时间
     */
    @Column(name = "ANALYSE_TIME")
    private String analyseTime;

    /**
     * 告危重医嘱
     */
    @Column(name = "ORDER_LOCAL_CN")
    private String orderLocalCn;

    /**
     * 获取住院编号
     *
     * @return IHUID - 住院编号
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院编号
     *
     * @param ihuid 住院编号
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取告危重时间（yyyy-mm-rr 24hh:mm:ss）
     *
     * @return VALUE_DATE - 告危重时间（yyyy-mm-rr 24hh:mm:ss）
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * 设置告危重时间（yyyy-mm-rr 24hh:mm:ss）
     *
     * @param valueDate 告危重时间（yyyy-mm-rr 24hh:mm:ss）
     */
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate == null ? null : valueDate.trim();
    }

    /**
     * 获取是否异常（0无，1有）
     *
     * @return ABNORMAL_IS - 是否异常（0无，1有）
     */
    public String getAbnormalIs() {
        return abnormalIs;
    }

    /**
     * 设置是否异常（0无，1有）
     *
     * @param abnormalIs 是否异常（0无，1有）
     */
    public void setAbnormalIs(String abnormalIs) {
        this.abnormalIs = abnormalIs == null ? null : abnormalIs.trim();
    }

    /**
     * 获取异常内容
     *
     * @return ABNORMAL_DETAIL - 异常内容
     */
    public String getAbnormalDetail() {
        return abnormalDetail;
    }

    /**
     * 设置异常内容
     *
     * @param abnormalDetail 异常内容
     */
    public void setAbnormalDetail(String abnormalDetail) {
        this.abnormalDetail = abnormalDetail == null ? null : abnormalDetail.trim();
    }

    /**
     * 获取医嘱唯一编号
     *
     * @return DAUID - 医嘱唯一编号
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱唯一编号
     *
     * @param dauid 医嘱唯一编号
     */
    public void setDauid(String dauid) {
        this.dauid = dauid == null ? null : dauid.trim();
    }

    /**
     * 获取出院时间
     *
     * @return DISCHARGE_DATE - 出院时间
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院时间
     *
     * @param dischargeDate 出院时间
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取是否有出院评估（1有，空值/0为无或者未出院）
     *
     * @return OUTVALUE_IS - 是否有出院评估（1有，空值/0为无或者未出院）
     */
    public String getOutvalueIs() {
        return outvalueIs;
    }

    /**
     * 设置是否有出院评估（1有，空值/0为无或者未出院）
     *
     * @param outvalueIs 是否有出院评估（1有，空值/0为无或者未出院）
     */
    public void setOutvalueIs(String outvalueIs) {
        this.outvalueIs = outvalueIs == null ? null : outvalueIs.trim();
    }

    /**
     * 获取数据组分析时间
     *
     * @return ANALYSE_TIME - 数据组分析时间
     */
    public String getAnalyseTime() {
        return analyseTime;
    }

    /**
     * 设置数据组分析时间
     *
     * @param analyseTime 数据组分析时间
     */
    public void setAnalyseTime(String analyseTime) {
        this.analyseTime = analyseTime == null ? null : analyseTime.trim();
    }

    /**
     * 获取告危重医嘱
     *
     * @return ORDER_LOCAL_CN - 告危重医嘱
     */
    public String getOrderLocalCn() {
        return orderLocalCn;
    }

    /**
     * 设置告危重医嘱
     *
     * @param orderLocalCn 告危重医嘱
     */
    public void setOrderLocalCn(String orderLocalCn) {
        this.orderLocalCn = orderLocalCn == null ? null : orderLocalCn.trim();
    }
}