package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_HISTORY")
public class QxTOutpatientHistory {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 就诊唯一标识
     */
    @Id
    @Column(name = "OPHUID")
    private String ophuid;

    /**
     * 挂号唯一标识
     */
    @Column(name = "OPRUID")
    private String opruid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 就诊科室
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 门诊类别（例如：门诊、急诊等。）
     */
    @Column(name = "OUTPAT_TYPE_CODE")
    private String outpatTypeCode;

    /**
     * 就诊科室代码（患者就诊科室的院内科室代码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 就诊科室名称（标识个体在医院就诊的科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    /**
     * 医生代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    /**
     * 医生职称代码（填报人已取得的相关专业职称在特定编码体系中的代码）
     */
    @Column(name = "DOCTOR_TITLE_CODE")
    private String doctorTitleCode;

    /**
     * 卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     */
    @Column(name = "HEALTH_SERVICE_DEMAND")
    private String healthServiceDemand;

    /**
     * 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    @Column(name = "SBP")
    private Long sbp;

    /**
     * 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    @Column(name = "DBP")
    private Long dbp;

    /**
     * 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    @Column(name = "SEC_TYPE_CODE")
    private String secTypeCode;

    /**
     * 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    @Column(name = "SEC_NO")
    private String secNo;

    /**
     * 患者国籍代码（患者来源国国籍）
     */
    @Column(name = "NATIONALITY")
    private String nationality;

    /**
     * 本地标志0否 1是（标识对象是否为本地）
     */
    @Column(name = "IS_LOCAL")
    private Long isLocal;

    /**
     * 就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     */
    @Column(name = "OCCURRED_TIME")
    private String occurredTime;

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
     * 是否特需
     */
    @Column(name = "IS_SPECIAL")
    private Long isSpecial;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 健康问题评估（根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述）
     */
    @Column(name = "HEALTH_PROBLEM_EVAL")
    private String healthProblemEval;

    /**
     * 处置计划（在就诊者评估基础上为其制定的处置计划的详细描述）
     */
    @Column(name = "TREATMENT_PLAN")
    private String treatmentPlan;

    /**
     * 其他医学处置（临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述）
     */
    @Column(name = "OTHER_MEDICAL_TREATMENT")
    private String otherMedicalTreatment;

    /**
     * 咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     */
    @Column(name = "CONSULT_QUESTION")
    private String consultQuestion;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

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
     * 获取就诊唯一标识
     *
     * @return OPHUID - 就诊唯一标识
     */
    public String getOphuid() {
        return ophuid;
    }

    /**
     * 设置就诊唯一标识
     *
     * @param ophuid 就诊唯一标识
     */
    public void setOphuid(String ophuid) {
        this.ophuid = ophuid == null ? null : ophuid.trim();
    }

    /**
     * 获取挂号唯一标识
     *
     * @return OPRUID - 挂号唯一标识
     */
    public String getOpruid() {
        return opruid;
    }

    /**
     * 设置挂号唯一标识
     *
     * @param opruid 挂号唯一标识
     */
    public void setOpruid(String opruid) {
        this.opruid = opruid == null ? null : opruid.trim();
    }

    /**
     * 获取门诊记录唯一标识
     *
     * @return PNUID - 门诊记录唯一标识
     */
    public String getPnuid() {
        return pnuid;
    }

    /**
     * 设置门诊记录唯一标识
     *
     * @param pnuid 门诊记录唯一标识
     */
    public void setPnuid(String pnuid) {
        this.pnuid = pnuid == null ? null : pnuid.trim();
    }

    /**
     * 获取就诊科室
     *
     * @return DUID - 就诊科室
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置就诊科室
     *
     * @param duid 就诊科室
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取机构唯一标识
     *
     * @return ORGUID - 机构唯一标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构唯一标识
     *
     * @param orguid 机构唯一标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取门诊类别（例如：门诊、急诊等。）
     *
     * @return OUTPAT_TYPE_CODE - 门诊类别（例如：门诊、急诊等。）
     */
    public String getOutpatTypeCode() {
        return outpatTypeCode;
    }

    /**
     * 设置门诊类别（例如：门诊、急诊等。）
     *
     * @param outpatTypeCode 门诊类别（例如：门诊、急诊等。）
     */
    public void setOutpatTypeCode(String outpatTypeCode) {
        this.outpatTypeCode = outpatTypeCode == null ? null : outpatTypeCode.trim();
    }

    /**
     * 获取就诊科室代码（患者就诊科室的院内科室代码）
     *
     * @return DEPT_CODE - 就诊科室代码（患者就诊科室的院内科室代码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置就诊科室代码（患者就诊科室的院内科室代码）
     *
     * @param deptCode 就诊科室代码（患者就诊科室的院内科室代码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取就诊科室名称（标识个体在医院就诊的科室名称）
     *
     * @return DEPT_NAME - 就诊科室名称（标识个体在医院就诊的科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置就诊科室名称（标识个体在医院就诊的科室名称）
     *
     * @param deptName 就诊科室名称（标识个体在医院就诊的科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return DOCTOR_NAME - 医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param doctorName 医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取医生代码（医疗服务人员在院内的唯一编号）
     *
     * @return DOCTOR_CODE - 医生代码（医疗服务人员在院内的唯一编号）
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * 设置医生代码（医疗服务人员在院内的唯一编号）
     *
     * @param doctorCode 医生代码（医疗服务人员在院内的唯一编号）
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode == null ? null : doctorCode.trim();
    }

    /**
     * 获取医生职称代码（填报人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @return DOCTOR_TITLE_CODE - 医生职称代码（填报人已取得的相关专业职称在特定编码体系中的代码）
     */
    public String getDoctorTitleCode() {
        return doctorTitleCode;
    }

    /**
     * 设置医生职称代码（填报人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @param doctorTitleCode 医生职称代码（填报人已取得的相关专业职称在特定编码体系中的代码）
     */
    public void setDoctorTitleCode(String doctorTitleCode) {
        this.doctorTitleCode = doctorTitleCode == null ? null : doctorTitleCode.trim();
    }

    /**
     * 获取卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     *
     * @return HEALTH_SERVICE_DEMAND - 卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     */
    public String getHealthServiceDemand() {
        return healthServiceDemand;
    }

    /**
     * 设置卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     *
     * @param healthServiceDemand 卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     */
    public void setHealthServiceDemand(String healthServiceDemand) {
        this.healthServiceDemand = healthServiceDemand == null ? null : healthServiceDemand.trim();
    }

    /**
     * 获取收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     *
     * @return SBP - 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    public Long getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     *
     * @param sbp 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    public void setSbp(Long sbp) {
        this.sbp = sbp;
    }

    /**
     * 获取舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     *
     * @return DBP - 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    public Long getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     *
     * @param dbp 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    public void setDbp(Long dbp) {
        this.dbp = dbp;
    }

    /**
     * 获取保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @return SEC_TYPE_CODE - 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public String getSecTypeCode() {
        return secTypeCode;
    }

    /**
     * 设置保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @param secTypeCode 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public void setSecTypeCode(String secTypeCode) {
        this.secTypeCode = secTypeCode == null ? null : secTypeCode.trim();
    }

    /**
     * 获取医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @return SEC_NO - 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public String getSecNo() {
        return secNo;
    }

    /**
     * 设置医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @param secNo 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public void setSecNo(String secNo) {
        this.secNo = secNo == null ? null : secNo.trim();
    }

    /**
     * 获取患者国籍代码（患者来源国国籍）
     *
     * @return NATIONALITY - 患者国籍代码（患者来源国国籍）
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置患者国籍代码（患者来源国国籍）
     *
     * @param nationality 患者国籍代码（患者来源国国籍）
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * 获取本地标志0否 1是（标识对象是否为本地）
     *
     * @return IS_LOCAL - 本地标志0否 1是（标识对象是否为本地）
     */
    public Long getIsLocal() {
        return isLocal;
    }

    /**
     * 设置本地标志0否 1是（标识对象是否为本地）
     *
     * @param isLocal 本地标志0否 1是（标识对象是否为本地）
     */
    public void setIsLocal(Long isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * 获取就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     *
     * @return OCCURRED_TIME - 就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     */
    public String getOccurredTime() {
        return occurredTime;
    }

    /**
     * 设置就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     *
     * @param occurredTime 就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     */
    public void setOccurredTime(String occurredTime) {
        this.occurredTime = occurredTime == null ? null : occurredTime.trim();
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
     * 获取是否特需
     *
     * @return IS_SPECIAL - 是否特需
     */
    public Long getIsSpecial() {
        return isSpecial;
    }

    /**
     * 设置是否特需
     *
     * @param isSpecial 是否特需
     */
    public void setIsSpecial(Long isSpecial) {
        this.isSpecial = isSpecial;
    }

    /**
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取健康问题评估（根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述）
     *
     * @return HEALTH_PROBLEM_EVAL - 健康问题评估（根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述）
     */
    public String getHealthProblemEval() {
        return healthProblemEval;
    }

    /**
     * 设置健康问题评估（根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述）
     *
     * @param healthProblemEval 健康问题评估（根据患者疾病临床表现、实验室检查结果等作出的健康问题评估结果的详细描述）
     */
    public void setHealthProblemEval(String healthProblemEval) {
        this.healthProblemEval = healthProblemEval == null ? null : healthProblemEval.trim();
    }

    /**
     * 获取处置计划（在就诊者评估基础上为其制定的处置计划的详细描述）
     *
     * @return TREATMENT_PLAN - 处置计划（在就诊者评估基础上为其制定的处置计划的详细描述）
     */
    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    /**
     * 设置处置计划（在就诊者评估基础上为其制定的处置计划的详细描述）
     *
     * @param treatmentPlan 处置计划（在就诊者评估基础上为其制定的处置计划的详细描述）
     */
    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan == null ? null : treatmentPlan.trim();
    }

    /**
     * 获取其他医学处置（临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述）
     *
     * @return OTHER_MEDICAL_TREATMENT - 其他医学处置（临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述）
     */
    public String getOtherMedicalTreatment() {
        return otherMedicalTreatment;
    }

    /**
     * 设置其他医学处置（临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述）
     *
     * @param otherMedicalTreatment 其他医学处置（临床医师对患者实施的除检查/检验、用药、手术/操作以外的医学处置的描述）
     */
    public void setOtherMedicalTreatment(String otherMedicalTreatment) {
        this.otherMedicalTreatment = otherMedicalTreatment == null ? null : otherMedicalTreatment.trim();
    }

    /**
     * 获取咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     *
     * @return CONSULT_QUESTION - 咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     */
    public String getConsultQuestion() {
        return consultQuestion;
    }

    /**
     * 设置咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     *
     * @param consultQuestion 咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     */
    public void setConsultQuestion(String consultQuestion) {
        this.consultQuestion = consultQuestion == null ? null : consultQuestion.trim();
    }

    /**
     * 获取门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
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
}