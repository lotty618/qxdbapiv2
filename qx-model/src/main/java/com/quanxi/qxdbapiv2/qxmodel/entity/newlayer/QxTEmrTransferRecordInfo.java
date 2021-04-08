package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_TRANSFER_RECORD_INFO")
public class QxTEmrTransferRecordInfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 转科记录唯一标识
     */
    @Column(name = "ETRUID")
    private String etruid;

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
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

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
     * 入院日期
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 转出日期
     */
    @Column(name = "OUT_DEPT_DATE")
    private String outDeptDate;

    /**
     * 转入日期
     */
    @Column(name = "IN_DEPT_DATE")
    private String inDeptDate;

    /**
     * 转出科室
     */
    @Column(name = "OUT_DEPT_NAME")
    private String outDeptName;

    /**
     * 转入科室
     */
    @Column(name = "IN_DEPT_NAME")
    private String inDeptName;

    /**
     * 主诉
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 入院情况
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    /**
     * 入院诊断
     */
    @Column(name = "IN_DIAGNOSIS_CN")
    private String inDiagnosisCn;

    /**
     * 诊疗经过
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 目前情况
     */
    @Column(name = "CURRENT_SITUATION")
    private String currentSituation;

    /**
     * 目前诊断
     */
    @Column(name = "CURRENT_DIAGNOSIS")
    private String currentDiagnosis;

    /**
     * 转入诊疗计划
     */
    @Column(name = "IN_DIAG_TREAT_PLAN")
    private String inDiagTreatPlan;

    /**
     * 转科目的及注意事项
     */
    @Column(name = "PURPOSE")
    private String purpose;

    /**
     * 主治医师
     */
    @Column(name = "MIAN_DOCTOR")
    private String mianDoctor;

    /**
     * 主治医师签名时间
     */
    @Column(name = "MIAN_DOCTOR_DATE")
    private String mianDoctorDate;

    /**
     * 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    @Column(name = "TRANSFER_TYPE_CODE")
    private String transferTypeCode;

    /**
     * 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    @Column(name = "TRANSFER_TYPE_NAME")
    private String transferTypeName;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 获取转科记录唯一标识
     *
     * @return ETRUID - 转科记录唯一标识
     */
    public String getEtruid() {
        return etruid;
    }

    /**
     * 设置转科记录唯一标识
     *
     * @param etruid 转科记录唯一标识
     */
    public void setEtruid(String etruid) {
        this.etruid = etruid == null ? null : etruid.trim();
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
     * 获取转出日期
     *
     * @return OUT_DEPT_DATE - 转出日期
     */
    public String getOutDeptDate() {
        return outDeptDate;
    }

    /**
     * 设置转出日期
     *
     * @param outDeptDate 转出日期
     */
    public void setOutDeptDate(String outDeptDate) {
        this.outDeptDate = outDeptDate == null ? null : outDeptDate.trim();
    }

    /**
     * 获取转入日期
     *
     * @return IN_DEPT_DATE - 转入日期
     */
    public String getInDeptDate() {
        return inDeptDate;
    }

    /**
     * 设置转入日期
     *
     * @param inDeptDate 转入日期
     */
    public void setInDeptDate(String inDeptDate) {
        this.inDeptDate = inDeptDate == null ? null : inDeptDate.trim();
    }

    /**
     * 获取转出科室
     *
     * @return OUT_DEPT_NAME - 转出科室
     */
    public String getOutDeptName() {
        return outDeptName;
    }

    /**
     * 设置转出科室
     *
     * @param outDeptName 转出科室
     */
    public void setOutDeptName(String outDeptName) {
        this.outDeptName = outDeptName == null ? null : outDeptName.trim();
    }

    /**
     * 获取转入科室
     *
     * @return IN_DEPT_NAME - 转入科室
     */
    public String getInDeptName() {
        return inDeptName;
    }

    /**
     * 设置转入科室
     *
     * @param inDeptName 转入科室
     */
    public void setInDeptName(String inDeptName) {
        this.inDeptName = inDeptName == null ? null : inDeptName.trim();
    }

    /**
     * 获取主诉
     *
     * @return CHIEF_COMPLAINTS - 主诉
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉
     *
     * @param chiefComplaints 主诉
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
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
     * @return IN_DIAGNOSIS_CN - 入院诊断
     */
    public String getInDiagnosisCn() {
        return inDiagnosisCn;
    }

    /**
     * 设置入院诊断
     *
     * @param inDiagnosisCn 入院诊断
     */
    public void setInDiagnosisCn(String inDiagnosisCn) {
        this.inDiagnosisCn = inDiagnosisCn == null ? null : inDiagnosisCn.trim();
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
     * 获取目前情况
     *
     * @return CURRENT_SITUATION - 目前情况
     */
    public String getCurrentSituation() {
        return currentSituation;
    }

    /**
     * 设置目前情况
     *
     * @param currentSituation 目前情况
     */
    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation == null ? null : currentSituation.trim();
    }

    /**
     * 获取目前诊断
     *
     * @return CURRENT_DIAGNOSIS - 目前诊断
     */
    public String getCurrentDiagnosis() {
        return currentDiagnosis;
    }

    /**
     * 设置目前诊断
     *
     * @param currentDiagnosis 目前诊断
     */
    public void setCurrentDiagnosis(String currentDiagnosis) {
        this.currentDiagnosis = currentDiagnosis == null ? null : currentDiagnosis.trim();
    }

    /**
     * 获取转入诊疗计划
     *
     * @return IN_DIAG_TREAT_PLAN - 转入诊疗计划
     */
    public String getInDiagTreatPlan() {
        return inDiagTreatPlan;
    }

    /**
     * 设置转入诊疗计划
     *
     * @param inDiagTreatPlan 转入诊疗计划
     */
    public void setInDiagTreatPlan(String inDiagTreatPlan) {
        this.inDiagTreatPlan = inDiagTreatPlan == null ? null : inDiagTreatPlan.trim();
    }

    /**
     * 获取转科目的及注意事项
     *
     * @return PURPOSE - 转科目的及注意事项
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 设置转科目的及注意事项
     *
     * @param purpose 转科目的及注意事项
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * 获取主治医师
     *
     * @return MIAN_DOCTOR - 主治医师
     */
    public String getMianDoctor() {
        return mianDoctor;
    }

    /**
     * 设置主治医师
     *
     * @param mianDoctor 主治医师
     */
    public void setMianDoctor(String mianDoctor) {
        this.mianDoctor = mianDoctor == null ? null : mianDoctor.trim();
    }

    /**
     * 获取主治医师签名时间
     *
     * @return MIAN_DOCTOR_DATE - 主治医师签名时间
     */
    public String getMianDoctorDate() {
        return mianDoctorDate;
    }

    /**
     * 设置主治医师签名时间
     *
     * @param mianDoctorDate 主治医师签名时间
     */
    public void setMianDoctorDate(String mianDoctorDate) {
        this.mianDoctorDate = mianDoctorDate == null ? null : mianDoctorDate.trim();
    }

    /**
     * 获取转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @return TRANSFER_TYPE_CODE - 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    /**
     * 设置转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @param transferTypeCode 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode == null ? null : transferTypeCode.trim();
    }

    /**
     * 获取转科记录类型名称（标识患者在院期间的转科情况名称）
     *
     * @return TRANSFER_TYPE_NAME - 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    public String getTransferTypeName() {
        return transferTypeName;
    }

    /**
     * 设置转科记录类型名称（标识患者在院期间的转科情况名称）
     *
     * @param transferTypeName 转科记录类型名称（标识患者在院期间的转科情况名称）
     */
    public void setTransferTypeName(String transferTypeName) {
        this.transferTypeName = transferTypeName == null ? null : transferTypeName.trim();
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