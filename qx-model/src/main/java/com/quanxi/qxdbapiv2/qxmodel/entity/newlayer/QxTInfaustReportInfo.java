package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_INFAUST_REPORT_INFO")
public class QxTInfaustReportInfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 不良事件报告唯一标识
     */
    @Column(name = "IRIUID")
    private String iriuid;

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
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 不良事件唯一编号（标记唯一一次不良事件编号）
     */
    @Column(name = "INFAUST_EVENT_NO")
    private String infaustEventNo;

    /**
     * 不良事件类型（发生不良事件的种类代码）
     */
    @Column(name = "INFAUST_EVENT_TYPE")
    private String infaustEventType;

    /**
     * 不良事件类型名称（发生不良事件的种类名称）
     */
    @Column(name = "INFAUST_EVENT_TYPE_CN")
    private String infaustEventTypeCn;

    /**
     * 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 就诊类型（患者就诊类型的的分类代码）
     */
    @Column(name = "VISIT_TYPE")
    private String visitType;

    /**
     * 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "VISIT_TYPE_CN")
    private String visitTypeCn;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "VISIT_NO")
    private String visitNo;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别中文名称（本人生理性别的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 不良事件等级代码（表示不不良事件的严重程度）
     */
    @Column(name = "INFAUST_LEVEL")
    private String infaustLevel;

    /**
     * 不良事件等级名称及其描述
     */
    @Column(name = "INFAUST_LEVEL_CN")
    private String infaustLevelCn;

    /**
     * 上报人:编号（医疗服务人员的唯一编号）
     */
    @Column(name = "REPORT_PERSON_ID")
    private String reportPersonId;

    /**
     * 上报人:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "REPORT_PERSON_NAME")
    private String reportPersonName;

    /**
     * 上报科室代码
     */
    @Column(name = "REPORT_DEPT_CODE")
    private String reportDeptCode;

    /**
     * 上报科室名称
     */
    @Column(name = "REPORT_DEPT_NAME")
    private String reportDeptName;

    /**
     * 上报时间（上报当日的公元纪年日期）
     */
    @Column(name = "REPORT_TIME")
    private String reportTime;

    /**
     * 发生时间（发生不良事件当日的公元纪年日期）
     */
    @Column(name = "EVENT_TIME")
    private String eventTime;

    /**
     * 发生科室代码
     */
    @Column(name = "EVENT_DEPT_CODE")
    private String eventDeptCode;

    /**
     * 发生科室名称
     */
    @Column(name = "EVENT_DEPT_NAME")
    private String eventDeptName;

    /**
     * 事件经过（发生不良事件的详细经过文字描述）
     */
    @Column(name = "EVENT_COURSE")
    private String eventCourse;

    /**
     * 原因分析（上报人填写的主观原因分析）
     */
    @Column(name = "EVENT_CAUSE")
    private String eventCause;

    /**
     * 整改措施（上报人填写的整改措施）
     */
    @Column(name = "CORRECTIVE_ACTION")
    private String correctiveAction;

    /**
     * 处理部门代码
     */
    @Column(name = "SOLVE_DEPT_CODE")
    private String solveDeptCode;

    /**
     * 处理部门名称
     */
    @Column(name = "SOLVE_DEPT_NAME")
    private String solveDeptName;

    /**
     * 处理人编号
     */
    @Column(name = "SOLVE_ID")
    private String solveId;

    /**
     * 处理人姓名
     */
    @Column(name = "SOLVE_NAME")
    private String solveName;

    /**
     * 处理人意见
     */
    @Column(name = "SOLVE_ADVISE")
    private String solveAdvise;

    /**
     * 处理间隔时间
     */
    @Column(name = "INTERVAL_TIME")
    private String intervalTime;

    /**
     * 报告状态编码
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

    /**
     * 报告状态名称
     */
    @Column(name = "STATUS_CN")
    private String statusCn;

    /**
     * 删除人姓名（信息删除人姓名）
     */
    @Column(name = "CANCEL_NAME")
    private String cancelName;

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
    @Column(name = "MODIFIER")
    private String modifier;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 典型事件标识（0：否 1：是）
     */
    @Column(name = "ISTYPICAL")
    private String istypical;

    /**
     * 下一步处理部门代码
     */
    @Column(name = "NSOLVE_DEPT_CODE")
    private String nsolveDeptCode;

    /**
     * 下一步处理部门名称
     */
    @Column(name = "NSOLVE_DEPT_NAME")
    private String nsolveDeptName;

    /**
     * 下一步处理人编号
     */
    @Column(name = "NSOLVE_ID")
    private String nsolveId;

    /**
     * 下一步处理人姓名
     */
    @Column(name = "NSOLVE_NAME")
    private String nsolveName;

    /**
     * 已处理部门代码
     */
    @Column(name = "SOLVED_DEPT_CODE")
    private String solvedDeptCode;

    /**
     * 已处理部门名称
     */
    @Column(name = "SOLVED_DEPT_NAME")
    private String solvedDeptName;

    /**
     * 已处理人编号
     */
    @Column(name = "SOLVED_ID")
    private String solvedId;

    /**
     * 已处理人姓名
     */
    @Column(name = "SOLVED_NAME")
    private String solvedName;

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
     * 获取不良事件报告唯一标识
     *
     * @return IRIUID - 不良事件报告唯一标识
     */
    public String getIriuid() {
        return iriuid;
    }

    /**
     * 设置不良事件报告唯一标识
     *
     * @param iriuid 不良事件报告唯一标识
     */
    public void setIriuid(String iriuid) {
        this.iriuid = iriuid == null ? null : iriuid.trim();
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
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取不良事件唯一编号（标记唯一一次不良事件编号）
     *
     * @return INFAUST_EVENT_NO - 不良事件唯一编号（标记唯一一次不良事件编号）
     */
    public String getInfaustEventNo() {
        return infaustEventNo;
    }

    /**
     * 设置不良事件唯一编号（标记唯一一次不良事件编号）
     *
     * @param infaustEventNo 不良事件唯一编号（标记唯一一次不良事件编号）
     */
    public void setInfaustEventNo(String infaustEventNo) {
        this.infaustEventNo = infaustEventNo == null ? null : infaustEventNo.trim();
    }

    /**
     * 获取不良事件类型（发生不良事件的种类代码）
     *
     * @return INFAUST_EVENT_TYPE - 不良事件类型（发生不良事件的种类代码）
     */
    public String getInfaustEventType() {
        return infaustEventType;
    }

    /**
     * 设置不良事件类型（发生不良事件的种类代码）
     *
     * @param infaustEventType 不良事件类型（发生不良事件的种类代码）
     */
    public void setInfaustEventType(String infaustEventType) {
        this.infaustEventType = infaustEventType == null ? null : infaustEventType.trim();
    }

    /**
     * 获取不良事件类型名称（发生不良事件的种类名称）
     *
     * @return INFAUST_EVENT_TYPE_CN - 不良事件类型名称（发生不良事件的种类名称）
     */
    public String getInfaustEventTypeCn() {
        return infaustEventTypeCn;
    }

    /**
     * 设置不良事件类型名称（发生不良事件的种类名称）
     *
     * @param infaustEventTypeCn 不良事件类型名称（发生不良事件的种类名称）
     */
    public void setInfaustEventTypeCn(String infaustEventTypeCn) {
        this.infaustEventTypeCn = infaustEventTypeCn == null ? null : infaustEventTypeCn.trim();
    }

    /**
     * 获取病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取就诊类型（患者就诊类型的的分类代码）
     *
     * @return VISIT_TYPE - 就诊类型（患者就诊类型的的分类代码）
     */
    public String getVisitType() {
        return visitType;
    }

    /**
     * 设置就诊类型（患者就诊类型的的分类代码）
     *
     * @param visitType 就诊类型（患者就诊类型的的分类代码）
     */
    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    /**
     * 获取就诊类型名称（患者就诊类型的的分类中文名称）
     *
     * @return VISIT_TYPE_CN - 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    public String getVisitTypeCn() {
        return visitTypeCn;
    }

    /**
     * 设置就诊类型名称（患者就诊类型的的分类中文名称）
     *
     * @param visitTypeCn 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    public void setVisitTypeCn(String visitTypeCn) {
        this.visitTypeCn = visitTypeCn == null ? null : visitTypeCn.trim();
    }

    /**
     * 获取患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return VISIT_NO - 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getVisitNo() {
        return visitNo;
    }

    /**
     * 设置就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param visitNo 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo == null ? null : visitNo.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别中文名称（本人生理性别的中文名称）
     *
     * @return SEX_CN - 性别中文名称（本人生理性别的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别中文名称（本人生理性别的中文名称）
     *
     * @param sexCn 性别中文名称（本人生理性别的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取不良事件等级代码（表示不不良事件的严重程度）
     *
     * @return INFAUST_LEVEL - 不良事件等级代码（表示不不良事件的严重程度）
     */
    public String getInfaustLevel() {
        return infaustLevel;
    }

    /**
     * 设置不良事件等级代码（表示不不良事件的严重程度）
     *
     * @param infaustLevel 不良事件等级代码（表示不不良事件的严重程度）
     */
    public void setInfaustLevel(String infaustLevel) {
        this.infaustLevel = infaustLevel == null ? null : infaustLevel.trim();
    }

    /**
     * 获取不良事件等级名称及其描述
     *
     * @return INFAUST_LEVEL_CN - 不良事件等级名称及其描述
     */
    public String getInfaustLevelCn() {
        return infaustLevelCn;
    }

    /**
     * 设置不良事件等级名称及其描述
     *
     * @param infaustLevelCn 不良事件等级名称及其描述
     */
    public void setInfaustLevelCn(String infaustLevelCn) {
        this.infaustLevelCn = infaustLevelCn == null ? null : infaustLevelCn.trim();
    }

    /**
     * 获取上报人:编号（医疗服务人员的唯一编号）
     *
     * @return REPORT_PERSON_ID - 上报人:编号（医疗服务人员的唯一编号）
     */
    public String getReportPersonId() {
        return reportPersonId;
    }

    /**
     * 设置上报人:编号（医疗服务人员的唯一编号）
     *
     * @param reportPersonId 上报人:编号（医疗服务人员的唯一编号）
     */
    public void setReportPersonId(String reportPersonId) {
        this.reportPersonId = reportPersonId == null ? null : reportPersonId.trim();
    }

    /**
     * 获取上报人:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return REPORT_PERSON_NAME - 上报人:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getReportPersonName() {
        return reportPersonName;
    }

    /**
     * 设置上报人:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param reportPersonName 上报人:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setReportPersonName(String reportPersonName) {
        this.reportPersonName = reportPersonName == null ? null : reportPersonName.trim();
    }

    /**
     * 获取上报科室代码
     *
     * @return REPORT_DEPT_CODE - 上报科室代码
     */
    public String getReportDeptCode() {
        return reportDeptCode;
    }

    /**
     * 设置上报科室代码
     *
     * @param reportDeptCode 上报科室代码
     */
    public void setReportDeptCode(String reportDeptCode) {
        this.reportDeptCode = reportDeptCode == null ? null : reportDeptCode.trim();
    }

    /**
     * 获取上报科室名称
     *
     * @return REPORT_DEPT_NAME - 上报科室名称
     */
    public String getReportDeptName() {
        return reportDeptName;
    }

    /**
     * 设置上报科室名称
     *
     * @param reportDeptName 上报科室名称
     */
    public void setReportDeptName(String reportDeptName) {
        this.reportDeptName = reportDeptName == null ? null : reportDeptName.trim();
    }

    /**
     * 获取上报时间（上报当日的公元纪年日期）
     *
     * @return REPORT_TIME - 上报时间（上报当日的公元纪年日期）
     */
    public String getReportTime() {
        return reportTime;
    }

    /**
     * 设置上报时间（上报当日的公元纪年日期）
     *
     * @param reportTime 上报时间（上报当日的公元纪年日期）
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    /**
     * 获取发生时间（发生不良事件当日的公元纪年日期）
     *
     * @return EVENT_TIME - 发生时间（发生不良事件当日的公元纪年日期）
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * 设置发生时间（发生不良事件当日的公元纪年日期）
     *
     * @param eventTime 发生时间（发生不良事件当日的公元纪年日期）
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime == null ? null : eventTime.trim();
    }

    /**
     * 获取发生科室代码
     *
     * @return EVENT_DEPT_CODE - 发生科室代码
     */
    public String getEventDeptCode() {
        return eventDeptCode;
    }

    /**
     * 设置发生科室代码
     *
     * @param eventDeptCode 发生科室代码
     */
    public void setEventDeptCode(String eventDeptCode) {
        this.eventDeptCode = eventDeptCode == null ? null : eventDeptCode.trim();
    }

    /**
     * 获取发生科室名称
     *
     * @return EVENT_DEPT_NAME - 发生科室名称
     */
    public String getEventDeptName() {
        return eventDeptName;
    }

    /**
     * 设置发生科室名称
     *
     * @param eventDeptName 发生科室名称
     */
    public void setEventDeptName(String eventDeptName) {
        this.eventDeptName = eventDeptName == null ? null : eventDeptName.trim();
    }

    /**
     * 获取事件经过（发生不良事件的详细经过文字描述）
     *
     * @return EVENT_COURSE - 事件经过（发生不良事件的详细经过文字描述）
     */
    public String getEventCourse() {
        return eventCourse;
    }

    /**
     * 设置事件经过（发生不良事件的详细经过文字描述）
     *
     * @param eventCourse 事件经过（发生不良事件的详细经过文字描述）
     */
    public void setEventCourse(String eventCourse) {
        this.eventCourse = eventCourse == null ? null : eventCourse.trim();
    }

    /**
     * 获取原因分析（上报人填写的主观原因分析）
     *
     * @return EVENT_CAUSE - 原因分析（上报人填写的主观原因分析）
     */
    public String getEventCause() {
        return eventCause;
    }

    /**
     * 设置原因分析（上报人填写的主观原因分析）
     *
     * @param eventCause 原因分析（上报人填写的主观原因分析）
     */
    public void setEventCause(String eventCause) {
        this.eventCause = eventCause == null ? null : eventCause.trim();
    }

    /**
     * 获取整改措施（上报人填写的整改措施）
     *
     * @return CORRECTIVE_ACTION - 整改措施（上报人填写的整改措施）
     */
    public String getCorrectiveAction() {
        return correctiveAction;
    }

    /**
     * 设置整改措施（上报人填写的整改措施）
     *
     * @param correctiveAction 整改措施（上报人填写的整改措施）
     */
    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction == null ? null : correctiveAction.trim();
    }

    /**
     * 获取处理部门代码
     *
     * @return SOLVE_DEPT_CODE - 处理部门代码
     */
    public String getSolveDeptCode() {
        return solveDeptCode;
    }

    /**
     * 设置处理部门代码
     *
     * @param solveDeptCode 处理部门代码
     */
    public void setSolveDeptCode(String solveDeptCode) {
        this.solveDeptCode = solveDeptCode == null ? null : solveDeptCode.trim();
    }

    /**
     * 获取处理部门名称
     *
     * @return SOLVE_DEPT_NAME - 处理部门名称
     */
    public String getSolveDeptName() {
        return solveDeptName;
    }

    /**
     * 设置处理部门名称
     *
     * @param solveDeptName 处理部门名称
     */
    public void setSolveDeptName(String solveDeptName) {
        this.solveDeptName = solveDeptName == null ? null : solveDeptName.trim();
    }

    /**
     * 获取处理人编号
     *
     * @return SOLVE_ID - 处理人编号
     */
    public String getSolveId() {
        return solveId;
    }

    /**
     * 设置处理人编号
     *
     * @param solveId 处理人编号
     */
    public void setSolveId(String solveId) {
        this.solveId = solveId == null ? null : solveId.trim();
    }

    /**
     * 获取处理人姓名
     *
     * @return SOLVE_NAME - 处理人姓名
     */
    public String getSolveName() {
        return solveName;
    }

    /**
     * 设置处理人姓名
     *
     * @param solveName 处理人姓名
     */
    public void setSolveName(String solveName) {
        this.solveName = solveName == null ? null : solveName.trim();
    }

    /**
     * 获取处理人意见
     *
     * @return SOLVE_ADVISE - 处理人意见
     */
    public String getSolveAdvise() {
        return solveAdvise;
    }

    /**
     * 设置处理人意见
     *
     * @param solveAdvise 处理人意见
     */
    public void setSolveAdvise(String solveAdvise) {
        this.solveAdvise = solveAdvise == null ? null : solveAdvise.trim();
    }

    /**
     * 获取处理间隔时间
     *
     * @return INTERVAL_TIME - 处理间隔时间
     */
    public String getIntervalTime() {
        return intervalTime;
    }

    /**
     * 设置处理间隔时间
     *
     * @param intervalTime 处理间隔时间
     */
    public void setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime == null ? null : intervalTime.trim();
    }

    /**
     * 获取报告状态编码
     *
     * @return STATUS_CODE - 报告状态编码
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置报告状态编码
     *
     * @param statusCode 报告状态编码
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * 获取报告状态名称
     *
     * @return STATUS_CN - 报告状态名称
     */
    public String getStatusCn() {
        return statusCn;
    }

    /**
     * 设置报告状态名称
     *
     * @param statusCn 报告状态名称
     */
    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn == null ? null : statusCn.trim();
    }

    /**
     * 获取删除人姓名（信息删除人姓名）
     *
     * @return CANCEL_NAME - 删除人姓名（信息删除人姓名）
     */
    public String getCancelName() {
        return cancelName;
    }

    /**
     * 设置删除人姓名（信息删除人姓名）
     *
     * @param cancelName 删除人姓名（信息删除人姓名）
     */
    public void setCancelName(String cancelName) {
        this.cancelName = cancelName == null ? null : cancelName.trim();
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
     * @return MODIFIER - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param modifier 最后更新人姓名（信息最后更新人姓名）
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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
     * 获取有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 获取典型事件标识（0：否 1：是）
     *
     * @return ISTYPICAL - 典型事件标识（0：否 1：是）
     */
    public String getIstypical() {
        return istypical;
    }

    /**
     * 设置典型事件标识（0：否 1：是）
     *
     * @param istypical 典型事件标识（0：否 1：是）
     */
    public void setIstypical(String istypical) {
        this.istypical = istypical == null ? null : istypical.trim();
    }

    /**
     * 获取下一步处理部门代码
     *
     * @return NSOLVE_DEPT_CODE - 下一步处理部门代码
     */
    public String getNsolveDeptCode() {
        return nsolveDeptCode;
    }

    /**
     * 设置下一步处理部门代码
     *
     * @param nsolveDeptCode 下一步处理部门代码
     */
    public void setNsolveDeptCode(String nsolveDeptCode) {
        this.nsolveDeptCode = nsolveDeptCode == null ? null : nsolveDeptCode.trim();
    }

    /**
     * 获取下一步处理部门名称
     *
     * @return NSOLVE_DEPT_NAME - 下一步处理部门名称
     */
    public String getNsolveDeptName() {
        return nsolveDeptName;
    }

    /**
     * 设置下一步处理部门名称
     *
     * @param nsolveDeptName 下一步处理部门名称
     */
    public void setNsolveDeptName(String nsolveDeptName) {
        this.nsolveDeptName = nsolveDeptName == null ? null : nsolveDeptName.trim();
    }

    /**
     * 获取下一步处理人编号
     *
     * @return NSOLVE_ID - 下一步处理人编号
     */
    public String getNsolveId() {
        return nsolveId;
    }

    /**
     * 设置下一步处理人编号
     *
     * @param nsolveId 下一步处理人编号
     */
    public void setNsolveId(String nsolveId) {
        this.nsolveId = nsolveId == null ? null : nsolveId.trim();
    }

    /**
     * 获取下一步处理人姓名
     *
     * @return NSOLVE_NAME - 下一步处理人姓名
     */
    public String getNsolveName() {
        return nsolveName;
    }

    /**
     * 设置下一步处理人姓名
     *
     * @param nsolveName 下一步处理人姓名
     */
    public void setNsolveName(String nsolveName) {
        this.nsolveName = nsolveName == null ? null : nsolveName.trim();
    }

    /**
     * 获取已处理部门代码
     *
     * @return SOLVED_DEPT_CODE - 已处理部门代码
     */
    public String getSolvedDeptCode() {
        return solvedDeptCode;
    }

    /**
     * 设置已处理部门代码
     *
     * @param solvedDeptCode 已处理部门代码
     */
    public void setSolvedDeptCode(String solvedDeptCode) {
        this.solvedDeptCode = solvedDeptCode == null ? null : solvedDeptCode.trim();
    }

    /**
     * 获取已处理部门名称
     *
     * @return SOLVED_DEPT_NAME - 已处理部门名称
     */
    public String getSolvedDeptName() {
        return solvedDeptName;
    }

    /**
     * 设置已处理部门名称
     *
     * @param solvedDeptName 已处理部门名称
     */
    public void setSolvedDeptName(String solvedDeptName) {
        this.solvedDeptName = solvedDeptName == null ? null : solvedDeptName.trim();
    }

    /**
     * 获取已处理人编号
     *
     * @return SOLVED_ID - 已处理人编号
     */
    public String getSolvedId() {
        return solvedId;
    }

    /**
     * 设置已处理人编号
     *
     * @param solvedId 已处理人编号
     */
    public void setSolvedId(String solvedId) {
        this.solvedId = solvedId == null ? null : solvedId.trim();
    }

    /**
     * 获取已处理人姓名
     *
     * @return SOLVED_NAME - 已处理人姓名
     */
    public String getSolvedName() {
        return solvedName;
    }

    /**
     * 设置已处理人姓名
     *
     * @param solvedName 已处理人姓名
     */
    public void setSolvedName(String solvedName) {
        this.solvedName = solvedName == null ? null : solvedName.trim();
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