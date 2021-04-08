package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_WARM_HIGHTRISK_ANALYSE")
public class QxzskTWarmHightriskAnalyse {
    /**
     * 住院唯一编号
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 高风险护理单唯一编号（对应表QX_T_ASS_ORTHER_RECORD中的REPORT_ID）
     */
    @Column(name = "EMRID")
    private String emrid;

    /**
     * 高风险评估日期（yyyy-mm-rr）
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
     * 医嘱唯一dauid，数组[String]结构
     */
    @Column(name = "DAUID")
    private String dauid;

    /**
     * 出院时间
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 是否有出院评估（1有，空值为无或者未出院）
     */
    @Column(name = "OUTVALUE_IS")
    private String outvalueIs;

    /**
     * 数据组分析时间
     */
    @Column(name = "ANALYSE_TIME")
    private String analyseTime;

    /**
     * 自伤自杀高风险（1是，2否）
     */
    @Column(name = "RISKKILL")
    private String riskkill;

    /**
     * 肇事肇祸高风险（1是，2否）
     */
    @Column(name = "RISKTROUBLE")
    private String risktrouble;

    /**
     * 擅自离院高风险（1是，2否）
     */
    @Column(name = "RISKOUT")
    private String riskout;

    /**
     * 获取住院唯一编号
     *
     * @return IHUID - 住院唯一编号
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一编号
     *
     * @param ihuid 住院唯一编号
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取高风险护理单唯一编号（对应表QX_T_ASS_ORTHER_RECORD中的REPORT_ID）
     *
     * @return EMRID - 高风险护理单唯一编号（对应表QX_T_ASS_ORTHER_RECORD中的REPORT_ID）
     */
    public String getEmrid() {
        return emrid;
    }

    /**
     * 设置高风险护理单唯一编号（对应表QX_T_ASS_ORTHER_RECORD中的REPORT_ID）
     *
     * @param emrid 高风险护理单唯一编号（对应表QX_T_ASS_ORTHER_RECORD中的REPORT_ID）
     */
    public void setEmrid(String emrid) {
        this.emrid = emrid == null ? null : emrid.trim();
    }

    /**
     * 获取高风险评估日期（yyyy-mm-rr）
     *
     * @return VALUE_DATE - 高风险评估日期（yyyy-mm-rr）
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * 设置高风险评估日期（yyyy-mm-rr）
     *
     * @param valueDate 高风险评估日期（yyyy-mm-rr）
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
     * 获取医嘱唯一dauid，数组[String]结构
     *
     * @return DAUID - 医嘱唯一dauid，数组[String]结构
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱唯一dauid，数组[String]结构
     *
     * @param dauid 医嘱唯一dauid，数组[String]结构
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
     * 获取是否有出院评估（1有，空值为无或者未出院）
     *
     * @return OUTVALUE_IS - 是否有出院评估（1有，空值为无或者未出院）
     */
    public String getOutvalueIs() {
        return outvalueIs;
    }

    /**
     * 设置是否有出院评估（1有，空值为无或者未出院）
     *
     * @param outvalueIs 是否有出院评估（1有，空值为无或者未出院）
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
     * 获取自伤自杀高风险（1是，2否）
     *
     * @return RISKKILL - 自伤自杀高风险（1是，2否）
     */
    public String getRiskkill() {
        return riskkill;
    }

    /**
     * 设置自伤自杀高风险（1是，2否）
     *
     * @param riskkill 自伤自杀高风险（1是，2否）
     */
    public void setRiskkill(String riskkill) {
        this.riskkill = riskkill == null ? null : riskkill.trim();
    }

    /**
     * 获取肇事肇祸高风险（1是，2否）
     *
     * @return RISKTROUBLE - 肇事肇祸高风险（1是，2否）
     */
    public String getRisktrouble() {
        return risktrouble;
    }

    /**
     * 设置肇事肇祸高风险（1是，2否）
     *
     * @param risktrouble 肇事肇祸高风险（1是，2否）
     */
    public void setRisktrouble(String risktrouble) {
        this.risktrouble = risktrouble == null ? null : risktrouble.trim();
    }

    /**
     * 获取擅自离院高风险（1是，2否）
     *
     * @return RISKOUT - 擅自离院高风险（1是，2否）
     */
    public String getRiskout() {
        return riskout;
    }

    /**
     * 设置擅自离院高风险（1是，2否）
     *
     * @param riskout 擅自离院高风险（1是，2否）
     */
    public void setRiskout(String riskout) {
        this.riskout = riskout == null ? null : riskout.trim();
    }
}