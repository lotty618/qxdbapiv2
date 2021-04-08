package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CRITICAL_VALUE")
public class QxTCriticalValue {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 危急值唯一标识
     */
    @Column(name = "CVUID")
    private String cvuid;

    /**
     * 患者唯一ID
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 本地事件号（门诊号或者住院号）
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 项目（检验，影像）唯一标识
     */
    @Column(name = "ITEMUID")
    private String itemuid;

    /**
     * 危急值名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 结果时间==危急值发现时间
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 项目名称
     */
    @Column(name = "EXAM_SITE_NAME")
    private String examSiteName;

    /**
     * 上报时间
     */
    @Column(name = "REPORT_TIME")
    private String reportTime;

    /**
     * 接受人
     */
    @Column(name = "RECEIVER")
    private String receiver;

    /**
     * 医嘱
     */
    @Column(name = "ADVICE")
    private String advice;

    /**
     * 医嘱处理时间
     */
    @Column(name = "ADVICE_TIME")
    private String adviceTime;

    /**
     * 6小时护理措施
     */
    @Column(name = "NURSE_MEASURES")
    private String nurseMeasures;

    /**
     * 6小时病程记录
     */
    @Column(name = "COURSE_RECORD")
    private String courseRecord;

    /**
     * 6小时告病重记录
     */
    @Column(name = "SERIOUSLY_COURSE_RECORD")
    private String seriouslyCourseRecord;

    /**
     * 6小时抢救记录
     */
    @Column(name = "RESCUE_RECORD")
    private String rescueRecord;

    /**
     * 危急值结果
     */
    @Column(name = "RESULT")
    private String result;

    /**
     * 异常问题点
     */
    @Column(name = "ABNORMAL_PROBLEM")
    private String abnormalProblem;

    /**
     * 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    @Column(name = "TYPE")
    private Long type;

    /**
     * 危急值范围最大值
     */
    @Column(name = "RANGE_MAX")
    private String rangeMax;

    /**
     * 危急值范围最小值
     */
    @Column(name = "RANGE_MIN")
    private String rangeMin;

    /**
     * 项目代码
     */
    @Column(name = "ITEM_CODE")
    private String itemCode;

    /**
     * 范围最大值单位
     */
    @Column(name = "RANGE_MAX_UNIT")
    private String rangeMaxUnit;

    /**
     * 范围最小值单位
     */
    @Column(name = "RANGE_MIN_UNIT")
    private String rangeMinUnit;

    /**
     * 项目名称
     */
    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 科室ID
     */
    @Column(name = "DEPT_ID")
    private String deptId;

    /**
     * 科室标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 住院号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 科室名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 病人姓名
     */
    @Column(name = "PATIENT_NAME")
    private String patientName;

    /**
     * 是否无效
     */
    @Column(name = "IS_INVALID")
    private Short isInvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "IS_DEL")
    private Short isDel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 获取序列号
     *
     * @return SID - 序列号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置序列号
     *
     * @param sid 序列号
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取危急值唯一标识
     *
     * @return CVUID - 危急值唯一标识
     */
    public String getCvuid() {
        return cvuid;
    }

    /**
     * 设置危急值唯一标识
     *
     * @param cvuid 危急值唯一标识
     */
    public void setCvuid(String cvuid) {
        this.cvuid = cvuid == null ? null : cvuid.trim();
    }

    /**
     * 获取患者唯一ID
     *
     * @return PUID - 患者唯一ID
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置患者唯一ID
     *
     * @param puid 患者唯一ID
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取本地事件号（门诊号或者住院号）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取项目（检验，影像）唯一标识
     *
     * @return ITEMUID - 项目（检验，影像）唯一标识
     */
    public String getItemuid() {
        return itemuid;
    }

    /**
     * 设置项目（检验，影像）唯一标识
     *
     * @param itemuid 项目（检验，影像）唯一标识
     */
    public void setItemuid(String itemuid) {
        this.itemuid = itemuid == null ? null : itemuid.trim();
    }

    /**
     * 获取危急值名称
     *
     * @return NAME - 危急值名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置危急值名称
     *
     * @param name 危急值名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取结果时间==危急值发现时间
     *
     * @return EFFECTIVE_DATE - 结果时间==危急值发现时间
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置结果时间==危急值发现时间
     *
     * @param effectiveDate 结果时间==危急值发现时间
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取项目名称
     *
     * @return EXAM_SITE_NAME - 项目名称
     */
    public String getExamSiteName() {
        return examSiteName;
    }

    /**
     * 设置项目名称
     *
     * @param examSiteName 项目名称
     */
    public void setExamSiteName(String examSiteName) {
        this.examSiteName = examSiteName == null ? null : examSiteName.trim();
    }

    /**
     * 获取上报时间
     *
     * @return REPORT_TIME - 上报时间
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 设置上报时间
     *
     * @param reportTime 上报时间
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 获取接受人
     *
     * @return RECEIVER - 接受人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置接受人
     *
     * @param receiver 接受人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * 获取医嘱
     *
     * @return ADVICE - 医嘱
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * 设置医嘱
     *
     * @param advice 医嘱
     */
    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    /**
     * 获取医嘱处理时间
     *
     * @return ADVICE_TIME - 医嘱处理时间
     */
    public String getAdviceTime() {
        return adviceTime;
    }

    /**
     * 设置医嘱处理时间
     *
     * @param adviceTime 医嘱处理时间
     */
    public void setAdviceTime(String adviceTime) {
        this.adviceTime = adviceTime == null ? null : adviceTime.trim();
    }

    /**
     * 获取6小时护理措施
     *
     * @return NURSE_MEASURES - 6小时护理措施
     */
    public String getNurseMeasures() {
        return nurseMeasures;
    }

    /**
     * 设置6小时护理措施
     *
     * @param nurseMeasures 6小时护理措施
     */
    public void setNurseMeasures(String nurseMeasures) {
        this.nurseMeasures = nurseMeasures == null ? null : nurseMeasures.trim();
    }

    /**
     * 获取6小时病程记录
     *
     * @return COURSE_RECORD - 6小时病程记录
     */
    public String getCourseRecord() {
        return courseRecord;
    }

    /**
     * 设置6小时病程记录
     *
     * @param courseRecord 6小时病程记录
     */
    public void setCourseRecord(String courseRecord) {
        this.courseRecord = courseRecord == null ? null : courseRecord.trim();
    }

    /**
     * 获取6小时告病重记录
     *
     * @return SERIOUSLY_COURSE_RECORD - 6小时告病重记录
     */
    public String getSeriouslyCourseRecord() {
        return seriouslyCourseRecord;
    }

    /**
     * 设置6小时告病重记录
     *
     * @param seriouslyCourseRecord 6小时告病重记录
     */
    public void setSeriouslyCourseRecord(String seriouslyCourseRecord) {
        this.seriouslyCourseRecord = seriouslyCourseRecord == null ? null : seriouslyCourseRecord.trim();
    }

    /**
     * 获取6小时抢救记录
     *
     * @return RESCUE_RECORD - 6小时抢救记录
     */
    public String getRescueRecord() {
        return rescueRecord;
    }

    /**
     * 设置6小时抢救记录
     *
     * @param rescueRecord 6小时抢救记录
     */
    public void setRescueRecord(String rescueRecord) {
        this.rescueRecord = rescueRecord == null ? null : rescueRecord.trim();
    }

    /**
     * 获取危急值结果
     *
     * @return RESULT - 危急值结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置危急值结果
     *
     * @param result 危急值结果
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * 获取异常问题点
     *
     * @return ABNORMAL_PROBLEM - 异常问题点
     */
    public String getAbnormalProblem() {
        return abnormalProblem;
    }

    /**
     * 设置异常问题点
     *
     * @param abnormalProblem 异常问题点
     */
    public void setAbnormalProblem(String abnormalProblem) {
        this.abnormalProblem = abnormalProblem == null ? null : abnormalProblem.trim();
    }

    /**
     * 获取危急值来源类型(1:检验危急值 2:影像危急值)
     *
     * @return TYPE - 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    public Long getType() {
        return type;
    }

    /**
     * 设置危急值来源类型(1:检验危急值 2:影像危急值)
     *
     * @param type 危急值来源类型(1:检验危急值 2:影像危急值)
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 获取危急值范围最大值
     *
     * @return RANGE_MAX - 危急值范围最大值
     */
    public String getRangeMax() {
        return rangeMax;
    }

    /**
     * 设置危急值范围最大值
     *
     * @param rangeMax 危急值范围最大值
     */
    public void setRangeMax(String rangeMax) {
        this.rangeMax = rangeMax == null ? null : rangeMax.trim();
    }

    /**
     * 获取危急值范围最小值
     *
     * @return RANGE_MIN - 危急值范围最小值
     */
    public String getRangeMin() {
        return rangeMin;
    }

    /**
     * 设置危急值范围最小值
     *
     * @param rangeMin 危急值范围最小值
     */
    public void setRangeMin(String rangeMin) {
        this.rangeMin = rangeMin == null ? null : rangeMin.trim();
    }

    /**
     * 获取项目代码
     *
     * @return ITEM_CODE - 项目代码
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置项目代码
     *
     * @param itemCode 项目代码
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * 获取范围最大值单位
     *
     * @return RANGE_MAX_UNIT - 范围最大值单位
     */
    public String getRangeMaxUnit() {
        return rangeMaxUnit;
    }

    /**
     * 设置范围最大值单位
     *
     * @param rangeMaxUnit 范围最大值单位
     */
    public void setRangeMaxUnit(String rangeMaxUnit) {
        this.rangeMaxUnit = rangeMaxUnit == null ? null : rangeMaxUnit.trim();
    }

    /**
     * 获取范围最小值单位
     *
     * @return RANGE_MIN_UNIT - 范围最小值单位
     */
    public String getRangeMinUnit() {
        return rangeMinUnit;
    }

    /**
     * 设置范围最小值单位
     *
     * @param rangeMinUnit 范围最小值单位
     */
    public void setRangeMinUnit(String rangeMinUnit) {
        this.rangeMinUnit = rangeMinUnit == null ? null : rangeMinUnit.trim();
    }

    /**
     * 获取项目名称
     *
     * @return ITEM_NAME - 项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置项目名称
     *
     * @param itemName 项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取科室ID
     *
     * @return DEPT_ID - 科室ID
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置科室ID
     *
     * @param deptId 科室ID
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * 获取科室标识
     *
     * @return DUID - 科室标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置科室标识
     *
     * @param duid 科室标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取住院号
     *
     * @return INHOS_NO - 住院号
     */
    public String getInhosNo() {
        return inhosNo;
    }

    /**
     * 设置住院号
     *
     * @param inhosNo 住院号
     */
    public void setInhosNo(String inhosNo) {
        this.inhosNo = inhosNo == null ? null : inhosNo.trim();
    }

    /**
     * 获取科室名称
     *
     * @return DEPT_NAME - 科室名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称
     *
     * @param deptName 科室名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取病人姓名
     *
     * @return PATIENT_NAME - 病人姓名
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 设置病人姓名
     *
     * @param patientName 病人姓名
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * 获取是否无效
     *
     * @return IS_INVALID - 是否无效
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isInvalid 是否无效
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return IS_DEL - 是否逻辑删除
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isDel 是否逻辑删除
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}