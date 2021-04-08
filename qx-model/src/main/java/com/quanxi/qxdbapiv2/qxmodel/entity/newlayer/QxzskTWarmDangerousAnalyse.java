package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_WARM_DANGEROUS_ANALYSE")
public class QxzskTWarmDangerousAnalyse {
    /**
     * 检验指标项目单号
     */
    @Column(name = "CRUID")
    private String cruid;

    /**
     * 住院号
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 检验单号
     */
    @Column(name = "COUID")
    private String couid;

    /**
     * 检验时间=发现危急值时间
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 检验标本
     */
    @Column(name = "SPECIMEN_NAME")
    private String specimenName;

    /**
     * 检验项目id
     */
    @Column(name = "ITEM_DETAIL_ID")
    private String itemDetailId;

    /**
     * 检验项目名称
     */
    @Column(name = "ITEM_DETAIL_NAME")
    private String itemDetailName;

    /**
     * 检验提示（医院数据）
     */
    @Column(name = "RESULT_HINT")
    private String resultHint;

    /**
     * 检验结果
     */
    @Column(name = "RESULT_VALUE")
    private String resultValue;

    /**
     * 危急值分析结果（过高，过低，正常）
     */
    @Column(name = "ANALYSE_RESULT")
    private String analyseResult;

    /**
     * 危急值最大值（医学组定义）
     */
    @Column(name = "RANGEMAX")
    private String rangemax;

    /**
     * 危急值最大值单位
     */
    @Column(name = "RANGEMAXDW")
    private String rangemaxdw;

    /**
     * 危急值最小值（医学组定义）
     */
    @Column(name = "RANGEMIN")
    private String rangemin;

    /**
     * 危急值最小值单位
     */
    @Column(name = "RANGEMINDW")
    private String rangemindw;

    /**
     * 检验类别名称
     */
    @Column(name = "REPORT_TITLE")
    private String reportTitle;

    /**
     * 医院ID
     */
    @Column(name = "HOSPITAL")
    private String hospital;

    /**
     * 数据组（匹配主键）
     */
    @Column(name = "QX_MATCH_NAME")
    private String qxMatchName;

    /**
     * 数据组（匹配标本）
     */
    @Column(name = "QX_SPECIMEN_NAME")
    private String qxSpecimenName;

    /**
     * 数据组（匹配检验名称）
     */
    @Column(name = "QX_ITEM_NAME")
    private String qxItemName;

    /**
     * 获取检验指标项目单号
     *
     * @return CRUID - 检验指标项目单号
     */
    public String getCruid() {
        return cruid;
    }

    /**
     * 设置检验指标项目单号
     *
     * @param cruid 检验指标项目单号
     */
    public void setCruid(String cruid) {
        this.cruid = cruid == null ? null : cruid.trim();
    }

    /**
     * 获取住院号
     *
     * @return EVENT_NO - 住院号
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置住院号
     *
     * @param eventNo 住院号
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取检验单号
     *
     * @return COUID - 检验单号
     */
    public String getCouid() {
        return couid;
    }

    /**
     * 设置检验单号
     *
     * @param couid 检验单号
     */
    public void setCouid(String couid) {
        this.couid = couid == null ? null : couid.trim();
    }

    /**
     * 获取检验时间=发现危急值时间
     *
     * @return EFFECTIVE_DATE - 检验时间=发现危急值时间
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置检验时间=发现危急值时间
     *
     * @param effectiveDate 检验时间=发现危急值时间
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取检验标本
     *
     * @return SPECIMEN_NAME - 检验标本
     */
    public String getSpecimenName() {
        return specimenName;
    }

    /**
     * 设置检验标本
     *
     * @param specimenName 检验标本
     */
    public void setSpecimenName(String specimenName) {
        this.specimenName = specimenName == null ? null : specimenName.trim();
    }

    /**
     * 获取检验项目id
     *
     * @return ITEM_DETAIL_ID - 检验项目id
     */
    public String getItemDetailId() {
        return itemDetailId;
    }

    /**
     * 设置检验项目id
     *
     * @param itemDetailId 检验项目id
     */
    public void setItemDetailId(String itemDetailId) {
        this.itemDetailId = itemDetailId == null ? null : itemDetailId.trim();
    }

    /**
     * 获取检验项目名称
     *
     * @return ITEM_DETAIL_NAME - 检验项目名称
     */
    public String getItemDetailName() {
        return itemDetailName;
    }

    /**
     * 设置检验项目名称
     *
     * @param itemDetailName 检验项目名称
     */
    public void setItemDetailName(String itemDetailName) {
        this.itemDetailName = itemDetailName == null ? null : itemDetailName.trim();
    }

    /**
     * 获取检验提示（医院数据）
     *
     * @return RESULT_HINT - 检验提示（医院数据）
     */
    public String getResultHint() {
        return resultHint;
    }

    /**
     * 设置检验提示（医院数据）
     *
     * @param resultHint 检验提示（医院数据）
     */
    public void setResultHint(String resultHint) {
        this.resultHint = resultHint == null ? null : resultHint.trim();
    }

    /**
     * 获取检验结果
     *
     * @return RESULT_VALUE - 检验结果
     */
    public String getResultValue() {
        return resultValue;
    }

    /**
     * 设置检验结果
     *
     * @param resultValue 检验结果
     */
    public void setResultValue(String resultValue) {
        this.resultValue = resultValue == null ? null : resultValue.trim();
    }

    /**
     * 获取危急值分析结果（过高，过低，正常）
     *
     * @return ANALYSE_RESULT - 危急值分析结果（过高，过低，正常）
     */
    public String getAnalyseResult() {
        return analyseResult;
    }

    /**
     * 设置危急值分析结果（过高，过低，正常）
     *
     * @param analyseResult 危急值分析结果（过高，过低，正常）
     */
    public void setAnalyseResult(String analyseResult) {
        this.analyseResult = analyseResult == null ? null : analyseResult.trim();
    }

    /**
     * 获取危急值最大值（医学组定义）
     *
     * @return RANGEMAX - 危急值最大值（医学组定义）
     */
    public String getRangemax() {
        return rangemax;
    }

    /**
     * 设置危急值最大值（医学组定义）
     *
     * @param rangemax 危急值最大值（医学组定义）
     */
    public void setRangemax(String rangemax) {
        this.rangemax = rangemax == null ? null : rangemax.trim();
    }

    /**
     * 获取危急值最大值单位
     *
     * @return RANGEMAXDW - 危急值最大值单位
     */
    public String getRangemaxdw() {
        return rangemaxdw;
    }

    /**
     * 设置危急值最大值单位
     *
     * @param rangemaxdw 危急值最大值单位
     */
    public void setRangemaxdw(String rangemaxdw) {
        this.rangemaxdw = rangemaxdw == null ? null : rangemaxdw.trim();
    }

    /**
     * 获取危急值最小值（医学组定义）
     *
     * @return RANGEMIN - 危急值最小值（医学组定义）
     */
    public String getRangemin() {
        return rangemin;
    }

    /**
     * 设置危急值最小值（医学组定义）
     *
     * @param rangemin 危急值最小值（医学组定义）
     */
    public void setRangemin(String rangemin) {
        this.rangemin = rangemin == null ? null : rangemin.trim();
    }

    /**
     * 获取危急值最小值单位
     *
     * @return RANGEMINDW - 危急值最小值单位
     */
    public String getRangemindw() {
        return rangemindw;
    }

    /**
     * 设置危急值最小值单位
     *
     * @param rangemindw 危急值最小值单位
     */
    public void setRangemindw(String rangemindw) {
        this.rangemindw = rangemindw == null ? null : rangemindw.trim();
    }

    /**
     * 获取检验类别名称
     *
     * @return REPORT_TITLE - 检验类别名称
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * 设置检验类别名称
     *
     * @param reportTitle 检验类别名称
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    /**
     * 获取医院ID
     *
     * @return HOSPITAL - 医院ID
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * 设置医院ID
     *
     * @param hospital 医院ID
     */
    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    /**
     * 获取数据组（匹配主键）
     *
     * @return QX_MATCH_NAME - 数据组（匹配主键）
     */
    public String getQxMatchName() {
        return qxMatchName;
    }

    /**
     * 设置数据组（匹配主键）
     *
     * @param qxMatchName 数据组（匹配主键）
     */
    public void setQxMatchName(String qxMatchName) {
        this.qxMatchName = qxMatchName == null ? null : qxMatchName.trim();
    }

    /**
     * 获取数据组（匹配标本）
     *
     * @return QX_SPECIMEN_NAME - 数据组（匹配标本）
     */
    public String getQxSpecimenName() {
        return qxSpecimenName;
    }

    /**
     * 设置数据组（匹配标本）
     *
     * @param qxSpecimenName 数据组（匹配标本）
     */
    public void setQxSpecimenName(String qxSpecimenName) {
        this.qxSpecimenName = qxSpecimenName == null ? null : qxSpecimenName.trim();
    }

    /**
     * 获取数据组（匹配检验名称）
     *
     * @return QX_ITEM_NAME - 数据组（匹配检验名称）
     */
    public String getQxItemName() {
        return qxItemName;
    }

    /**
     * 设置数据组（匹配检验名称）
     *
     * @param qxItemName 数据组（匹配检验名称）
     */
    public void setQxItemName(String qxItemName) {
        this.qxItemName = qxItemName == null ? null : qxItemName.trim();
    }
}