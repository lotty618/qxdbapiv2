package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_CONSULTATION_RECORD")
public class QxTEmrConsultationRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 会诊记录唯一标识
     */
    @Column(name = "ECRUID")
    private String ecruid;

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
     * 职业
     */
    @Column(name = "CAREER")
    private String career;

    /**
     * 会诊完成时间
     */
    @Column(name = "CL_OPINION_DATE")
    private String clOpinionDate;

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
     * 科室
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 申请人
     */
    @Column(name = "APPLICANT")
    private String applicant;

    /**
     * 申请时间
     */
    @Column(name = "APPLICATION_DATE")
    private String applicationDate;

    /**
     * 病情摘要
     */
    @Column(name = "DISEASE_SUMMARY")
    private String diseaseSummary;

    /**
     * 初步诊断
     */
    @Column(name = "INITIAL_DIAGNOSIS")
    private String initialDiagnosis;

    /**
     * 会诊理由
     */
    @Column(name = "CONSULTATION_REASON")
    private String consultationReason;

    /**
     * 会诊目的
     */
    @Column(name = "CONSULTATION_PURPOSE")
    private String consultationPurpose;

    /**
     * 邀请医生
     */
    @Column(name = "INVITE_DOCTOR")
    private String inviteDoctor;

    /**
     * 会诊意见
     */
    @Column(name = "CL_OPINION")
    private String clOpinion;

    /**
     * 会诊意见医师签名
     */
    @Column(name = "CL_OPINION_DOCTOR")
    private String clOpinionDoctor;

    /**
     * 会诊意见医师签名时间
     */
    @Column(name = "CL_OPINION_DOCTOR_DATE")
    private String clOpinionDoctorDate;

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

    @Column(name = "EMR_CONTENT_TEXT")
    private String emrContentText;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

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
     * 获取会诊记录唯一标识
     *
     * @return ECRUID - 会诊记录唯一标识
     */
    public String getEcruid() {
        return ecruid;
    }

    /**
     * 设置会诊记录唯一标识
     *
     * @param ecruid 会诊记录唯一标识
     */
    public void setEcruid(String ecruid) {
        this.ecruid = ecruid == null ? null : ecruid.trim();
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
     * 获取职业
     *
     * @return CAREER - 职业
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置职业
     *
     * @param career 职业
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    /**
     * 获取会诊完成时间
     *
     * @return CL_OPINION_DATE - 会诊完成时间
     */
    public String getClOpinionDate() {
        return clOpinionDate;
    }

    /**
     * 设置会诊完成时间
     *
     * @param clOpinionDate 会诊完成时间
     */
    public void setClOpinionDate(String clOpinionDate) {
        this.clOpinionDate = clOpinionDate == null ? null : clOpinionDate.trim();
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
     * 获取申请人
     *
     * @return APPLICANT - 申请人
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * 设置申请人
     *
     * @param applicant 申请人
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    /**
     * 获取申请时间
     *
     * @return APPLICATION_DATE - 申请时间
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * 设置申请时间
     *
     * @param applicationDate 申请时间
     */
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate == null ? null : applicationDate.trim();
    }

    /**
     * 获取病情摘要
     *
     * @return DISEASE_SUMMARY - 病情摘要
     */
    public String getDiseaseSummary() {
        return diseaseSummary;
    }

    /**
     * 设置病情摘要
     *
     * @param diseaseSummary 病情摘要
     */
    public void setDiseaseSummary(String diseaseSummary) {
        this.diseaseSummary = diseaseSummary == null ? null : diseaseSummary.trim();
    }

    /**
     * 获取初步诊断
     *
     * @return INITIAL_DIAGNOSIS - 初步诊断
     */
    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    /**
     * 设置初步诊断
     *
     * @param initialDiagnosis 初步诊断
     */
    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis == null ? null : initialDiagnosis.trim();
    }

    /**
     * 获取会诊理由
     *
     * @return CONSULTATION_REASON - 会诊理由
     */
    public String getConsultationReason() {
        return consultationReason;
    }

    /**
     * 设置会诊理由
     *
     * @param consultationReason 会诊理由
     */
    public void setConsultationReason(String consultationReason) {
        this.consultationReason = consultationReason == null ? null : consultationReason.trim();
    }

    /**
     * 获取会诊目的
     *
     * @return CONSULTATION_PURPOSE - 会诊目的
     */
    public String getConsultationPurpose() {
        return consultationPurpose;
    }

    /**
     * 设置会诊目的
     *
     * @param consultationPurpose 会诊目的
     */
    public void setConsultationPurpose(String consultationPurpose) {
        this.consultationPurpose = consultationPurpose == null ? null : consultationPurpose.trim();
    }

    /**
     * 获取邀请医生
     *
     * @return INVITE_DOCTOR - 邀请医生
     */
    public String getInviteDoctor() {
        return inviteDoctor;
    }

    /**
     * 设置邀请医生
     *
     * @param inviteDoctor 邀请医生
     */
    public void setInviteDoctor(String inviteDoctor) {
        this.inviteDoctor = inviteDoctor == null ? null : inviteDoctor.trim();
    }

    /**
     * 获取会诊意见
     *
     * @return CL_OPINION - 会诊意见
     */
    public String getClOpinion() {
        return clOpinion;
    }

    /**
     * 设置会诊意见
     *
     * @param clOpinion 会诊意见
     */
    public void setClOpinion(String clOpinion) {
        this.clOpinion = clOpinion == null ? null : clOpinion.trim();
    }

    /**
     * 获取会诊意见医师签名
     *
     * @return CL_OPINION_DOCTOR - 会诊意见医师签名
     */
    public String getClOpinionDoctor() {
        return clOpinionDoctor;
    }

    /**
     * 设置会诊意见医师签名
     *
     * @param clOpinionDoctor 会诊意见医师签名
     */
    public void setClOpinionDoctor(String clOpinionDoctor) {
        this.clOpinionDoctor = clOpinionDoctor == null ? null : clOpinionDoctor.trim();
    }

    /**
     * 获取会诊意见医师签名时间
     *
     * @return CL_OPINION_DOCTOR_DATE - 会诊意见医师签名时间
     */
    public String getClOpinionDoctorDate() {
        return clOpinionDoctorDate;
    }

    /**
     * 设置会诊意见医师签名时间
     *
     * @param clOpinionDoctorDate 会诊意见医师签名时间
     */
    public void setClOpinionDoctorDate(String clOpinionDoctorDate) {
        this.clOpinionDoctorDate = clOpinionDoctorDate == null ? null : clOpinionDoctorDate.trim();
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

    /**
     * @return EMR_CONTENT_TEXT
     */
    public String getEmrContentText() {
        return emrContentText;
    }

    /**
     * @param emrContentText
     */
    public void setEmrContentText(String emrContentText) {
        this.emrContentText = emrContentText == null ? null : emrContentText.trim();
    }

    /**
     * 获取病历原文（医院病历的原始内容）
     *
     * @return EMR_CONTENT - 病历原文（医院病历的原始内容）
     */
    public byte[] getEmrContent() {
        return emrContent;
    }

    /**
     * 设置病历原文（医院病历的原始内容）
     *
     * @param emrContent 病历原文（医院病历的原始内容）
     */
    public void setEmrContent(byte[] emrContent) {
        this.emrContent = emrContent;
    }
}