package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_DEATH_RECORD_INFO")
public class QxTEmrDeathRecordInfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 死亡记录唯一标识
     */
    @Column(name = "EDERUID")
    private String ederuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 科室
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 床号
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 住院号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 婚姻
     */
    @Column(name = "MARRIAGE")
    private String marriage;

    /**
     * 民族
     */
    @Column(name = "ETHNIC_NAME")
    private String ethnicName;

    /**
     * 单位
     */
    @Column(name = "WORK_UNIT")
    private String workUnit;

    /**
     * 职业
     */
    @Column(name = "WORK")
    private String work;

    /**
     * 家庭住址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 入院日期
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 死亡日期
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 住院天数
     */
    @Column(name = "INHOS_DAY")
    private String inhosDay;

    /**
     * 入院情况
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    /**
     * 入院诊断
     */
    @Column(name = "IN_DISEASE_DIAG_NAME")
    private String inDiseaseDiagName;

    /**
     * 诊疗经过
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 死亡原因
     */
    @Column(name = "DEATH_CAUSE")
    private String deathCause;

    /**
     * 死亡诊断
     */
    @Column(name = "DEATH_DAIG")
    private String deathDaig;

    /**
     * 主任医师签名
     */
    @Column(name = "MIAN_DOCTOR")
    private String mianDoctor;

    /**
     * 主任医师签名时间
     */
    @Column(name = "MIAN_DOCTOR_DATE")
    private String mianDoctorDate;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

    /**
     * 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    @Column(name = "STATUS_CN")
    private String statusCn;

    /**
     * 删除时间YYYY/MM/DD（数据删除时间）
     */
    @Column(name = "CANCEL_TIME")
    private String cancelTime;

    /**
     * 录入人姓名（信息录入人姓名）
     */
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

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
     * 获取死亡记录唯一标识
     *
     * @return EDERUID - 死亡记录唯一标识
     */
    public String getEderuid() {
        return ederuid;
    }

    /**
     * 设置死亡记录唯一标识
     *
     * @param ederuid 死亡记录唯一标识
     */
    public void setEderuid(String ederuid) {
        this.ederuid = ederuid == null ? null : ederuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取科室
     *
     * @return DEPT_NAME - 科室
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室
     *
     * @param deptName 科室
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取床号
     *
     * @return BED_NO - 床号
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置床号
     *
     * @param bedNo 床号
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
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
     * 获取性别
     *
     * @return SEX - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取婚姻
     *
     * @return MARRIAGE - 婚姻
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置婚姻
     *
     * @param marriage 婚姻
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    /**
     * 获取民族
     *
     * @return ETHNIC_NAME - 民族
     */
    public String getEthnicName() {
        return ethnicName;
    }

    /**
     * 设置民族
     *
     * @param ethnicName 民族
     */
    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName == null ? null : ethnicName.trim();
    }

    /**
     * 获取单位
     *
     * @return WORK_UNIT - 单位
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * 设置单位
     *
     * @param workUnit 单位
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    /**
     * 获取职业
     *
     * @return WORK - 职业
     */
    public String getWork() {
        return work;
    }

    /**
     * 设置职业
     *
     * @param work 职业
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    /**
     * 获取家庭住址
     *
     * @return ADDRESS - 家庭住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置家庭住址
     *
     * @param address 家庭住址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取入院日期
     *
     * @return IN_DATE - 入院日期
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * 设置入院日期
     *
     * @param inDate 入院日期
     */
    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    /**
     * 获取死亡日期
     *
     * @return DISCHARGE_DATE - 死亡日期
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置死亡日期
     *
     * @param dischargeDate 死亡日期
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取住院天数
     *
     * @return INHOS_DAY - 住院天数
     */
    public String getInhosDay() {
        return inhosDay;
    }

    /**
     * 设置住院天数
     *
     * @param inhosDay 住院天数
     */
    public void setInhosDay(String inhosDay) {
        this.inhosDay = inhosDay == null ? null : inhosDay.trim();
    }

    /**
     * 获取入院情况
     *
     * @return IN_CONDITION_DESC - 入院情况
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * 设置入院情况
     *
     * @param inConditionDesc 入院情况
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
    }

    /**
     * 获取入院诊断
     *
     * @return IN_DISEASE_DIAG_NAME - 入院诊断
     */
    public String getInDiseaseDiagName() {
        return inDiseaseDiagName;
    }

    /**
     * 设置入院诊断
     *
     * @param inDiseaseDiagName 入院诊断
     */
    public void setInDiseaseDiagName(String inDiseaseDiagName) {
        this.inDiseaseDiagName = inDiseaseDiagName == null ? null : inDiseaseDiagName.trim();
    }

    /**
     * 获取诊疗经过
     *
     * @return TREAT_RESCUE_COURSE - 诊疗经过
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗经过
     *
     * @param treatRescueCourse 诊疗经过
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取死亡原因
     *
     * @return DEATH_CAUSE - 死亡原因
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * 设置死亡原因
     *
     * @param deathCause 死亡原因
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * 获取死亡诊断
     *
     * @return DEATH_DAIG - 死亡诊断
     */
    public String getDeathDaig() {
        return deathDaig;
    }

    /**
     * 设置死亡诊断
     *
     * @param deathDaig 死亡诊断
     */
    public void setDeathDaig(String deathDaig) {
        this.deathDaig = deathDaig == null ? null : deathDaig.trim();
    }

    /**
     * 获取主任医师签名
     *
     * @return MIAN_DOCTOR - 主任医师签名
     */
    public String getMianDoctor() {
        return mianDoctor;
    }

    /**
     * 设置主任医师签名
     *
     * @param mianDoctor 主任医师签名
     */
    public void setMianDoctor(String mianDoctor) {
        this.mianDoctor = mianDoctor == null ? null : mianDoctor.trim();
    }

    /**
     * 获取主任医师签名时间
     *
     * @return MIAN_DOCTOR_DATE - 主任医师签名时间
     */
    public String getMianDoctorDate() {
        return mianDoctorDate;
    }

    /**
     * 设置主任医师签名时间
     *
     * @param mianDoctorDate 主任医师签名时间
     */
    public void setMianDoctorDate(String mianDoctorDate) {
        this.mianDoctorDate = mianDoctorDate == null ? null : mianDoctorDate.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 获取状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @return STATUS_CN - 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public String getStatusCn() {
        return statusCn;
    }

    /**
     * 设置状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @param statusCn 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn == null ? null : statusCn.trim();
    }

    /**
     * 获取删除时间YYYY/MM/DD（数据删除时间）
     *
     * @return CANCEL_TIME - 删除时间YYYY/MM/DD（数据删除时间）
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置删除时间YYYY/MM/DD（数据删除时间）
     *
     * @param cancelTime 删除时间YYYY/MM/DD（数据删除时间）
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    /**
     * 获取录入人姓名（信息录入人姓名）
     *
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * 获取最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @return MODIFIED_TIME - 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @param modifiedTime 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime == null ? null : modifiedTime.trim();
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