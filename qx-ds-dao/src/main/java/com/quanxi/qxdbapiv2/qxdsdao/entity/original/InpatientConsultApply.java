package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "LG2HORI.INPATIENT_CONSULT_APPLY")
public class InpatientConsultApply {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 会诊申请单号[主键]
     */
    @Id
    @Column(name = "CONSULT_APPLY_NO")
    private String consultApplyNo;

    /**
     * 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    @Column(name = "CONSULT_APPLY_DEPT_CODE")
    private String consultApplyDeptCode;

    /**
     * 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    @Column(name = "CONSULT_APPLY_DEPT_CN")
    private String consultApplyDeptCn;

    /**
     * 会诊申请医师代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "CONSULT_APPLY_DOCTOR_CODE")
    private String consultApplyDoctorCode;

    /**
     * 会诊申请医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CONSULT_APPLY_DOCTOR_NAME")
    private String consultApplyDoctorName;

    /**
     * 会诊申请日期（个体在医疗卫生机构申请会诊时的公元纪年日期）
     */
    @Column(name = "CONSULT_APPLY_DATE")
    private String consultApplyDate;

    /**
     * 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    @Column(name = "CONSULT_REASON")
    private String consultReason;

    /**
     * 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    @Column(name = "CONSULTATION_TYPE")
    private String consultationType;

    /**
     * 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    @Column(name = "CONSULTATION_PURPOSE")
    private String consultationPurpose;

    /**
     * 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    @Column(name = "CONSULT_DATE")
    private String consultDate;

    /**
     * 邀请对象（受邀的科室名称、医生姓名或医院机构名称）
     */
    @Column(name = "INVITE_OBJECT")
    private String inviteObject;

    /**
     * 邀请科室（本院受邀科室名称）
     */
    @Column(name = "INVITE_DEPT")
    private String inviteDept;

    /**
     * 邀请医生（本院受邀医生姓名）
     */
    @Column(name = "INVITE_DOCTOR")
    private String inviteDoctor;

    /**
     * 紧急标志（会议的紧急程度）
     */
    @Column(name = "ISURGENT")
    private String isurgent;

    /**
     * 提交标志（会诊申请提交标志）
     */
    @Column(name = "ISSEND")
    private String issend;

    /**
     * 提交时间（会诊申请提交的时间）
     */
    @Column(name = "SEND_TIME")
    private String sendTime;

    /**
     * 结束标志（会诊结束标志）
     */
    @Column(name = "ISEND")
    private String isend;

    /**
     * 结束时间（会诊结束的时间）
     */
    @Column(name = "END_TIEM")
    private String endTiem;

    /**
     * 病历编号（电子病历记录中会诊记录ID）
     */
    @Column(name = "EMR_ID")
    private String emrId;

    /**
     * 录入人姓名（信息录入人姓名）
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    /**
     * 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
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
     * 获取住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取会诊申请单号[主键]
     *
     * @return CONSULT_APPLY_NO - 会诊申请单号[主键]
     */
    public String getConsultApplyNo() {
        return consultApplyNo;
    }

    /**
     * 设置会诊申请单号[主键]
     *
     * @param consultApplyNo 会诊申请单号[主键]
     */
    public void setConsultApplyNo(String consultApplyNo) {
        this.consultApplyNo = consultApplyNo == null ? null : consultApplyNo.trim();
    }

    /**
     * 获取会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     *
     * @return CONSULT_APPLY_DEPT_CODE - 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    public String getConsultApplyDeptCode() {
        return consultApplyDeptCode;
    }

    /**
     * 设置会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     *
     * @param consultApplyDeptCode 会诊申请科室代码DIR_DEPT（申请会诊的科室代码）
     */
    public void setConsultApplyDeptCode(String consultApplyDeptCode) {
        this.consultApplyDeptCode = consultApplyDeptCode == null ? null : consultApplyDeptCode.trim();
    }

    /**
     * 获取会诊申请科室中文名称（申请会诊的科室中文名称）
     *
     * @return CONSULT_APPLY_DEPT_CN - 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    public String getConsultApplyDeptCn() {
        return consultApplyDeptCn;
    }

    /**
     * 设置会诊申请科室中文名称（申请会诊的科室中文名称）
     *
     * @param consultApplyDeptCn 会诊申请科室中文名称（申请会诊的科室中文名称）
     */
    public void setConsultApplyDeptCn(String consultApplyDeptCn) {
        this.consultApplyDeptCn = consultApplyDeptCn == null ? null : consultApplyDeptCn.trim();
    }

    /**
     * 获取会诊申请医师代码（医疗服务人员在院内的唯一编号）
     *
     * @return CONSULT_APPLY_DOCTOR_CODE - 会诊申请医师代码（医疗服务人员在院内的唯一编号）
     */
    public String getConsultApplyDoctorCode() {
        return consultApplyDoctorCode;
    }

    /**
     * 设置会诊申请医师代码（医疗服务人员在院内的唯一编号）
     *
     * @param consultApplyDoctorCode 会诊申请医师代码（医疗服务人员在院内的唯一编号）
     */
    public void setConsultApplyDoctorCode(String consultApplyDoctorCode) {
        this.consultApplyDoctorCode = consultApplyDoctorCode == null ? null : consultApplyDoctorCode.trim();
    }

    /**
     * 获取会诊申请医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CONSULT_APPLY_DOCTOR_NAME - 会诊申请医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getConsultApplyDoctorName() {
        return consultApplyDoctorName;
    }

    /**
     * 设置会诊申请医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param consultApplyDoctorName 会诊申请医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setConsultApplyDoctorName(String consultApplyDoctorName) {
        this.consultApplyDoctorName = consultApplyDoctorName == null ? null : consultApplyDoctorName.trim();
    }

    /**
     * 获取会诊申请日期（个体在医疗卫生机构申请会诊时的公元纪年日期）
     *
     * @return CONSULT_APPLY_DATE - 会诊申请日期（个体在医疗卫生机构申请会诊时的公元纪年日期）
     */
    public String getConsultApplyDate() {
        return consultApplyDate;
    }

    /**
     * 设置会诊申请日期（个体在医疗卫生机构申请会诊时的公元纪年日期）
     *
     * @param consultApplyDate 会诊申请日期（个体在医疗卫生机构申请会诊时的公元纪年日期）
     */
    public void setConsultApplyDate(String consultApplyDate) {
        this.consultApplyDate = consultApplyDate == null ? null : consultApplyDate.trim();
    }

    /**
     * 获取会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     *
     * @return CONSULT_REASON - 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    public String getConsultReason() {
        return consultReason;
    }

    /**
     * 设置会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     *
     * @param consultReason 会诊原因（由会诊医生填写患者需会诊的主要情况的详细描述）
     */
    public void setConsultReason(String consultReason) {
        this.consultReason = consultReason == null ? null : consultReason.trim();
    }

    /**
     * 获取会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     *
     * @return CONSULTATION_TYPE - 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    public String getConsultationType() {
        return consultationType;
    }

    /**
     * 设置会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     *
     * @param consultationType 会诊类型描述（申请会诊的类型描述，如：院内会诊、院外会诊、多科会诊等 ）
     */
    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType == null ? null : consultationType.trim();
    }

    /**
     * 获取会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     *
     * @return CONSULTATION_PURPOSE - 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    public String getConsultationPurpose() {
        return consultationPurpose;
    }

    /**
     * 设置会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     *
     * @param consultationPurpose 会诊目的（申请会诊医师就患者目前存在问题提出会诊要达到的目的）
     */
    public void setConsultationPurpose(String consultationPurpose) {
        this.consultationPurpose = consultationPurpose == null ? null : consultationPurpose.trim();
    }

    /**
     * 获取会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     *
     * @return CONSULT_DATE - 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    public String getConsultDate() {
        return consultDate;
    }

    /**
     * 设置会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     *
     * @param consultDate 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    public void setConsultDate(String consultDate) {
        this.consultDate = consultDate == null ? null : consultDate.trim();
    }

    /**
     * 获取邀请对象（受邀的科室名称、医生姓名或医院机构名称）
     *
     * @return INVITE_OBJECT - 邀请对象（受邀的科室名称、医生姓名或医院机构名称）
     */
    public String getInviteObject() {
        return inviteObject;
    }

    /**
     * 设置邀请对象（受邀的科室名称、医生姓名或医院机构名称）
     *
     * @param inviteObject 邀请对象（受邀的科室名称、医生姓名或医院机构名称）
     */
    public void setInviteObject(String inviteObject) {
        this.inviteObject = inviteObject == null ? null : inviteObject.trim();
    }

    /**
     * 获取邀请科室（本院受邀科室名称）
     *
     * @return INVITE_DEPT - 邀请科室（本院受邀科室名称）
     */
    public String getInviteDept() {
        return inviteDept;
    }

    /**
     * 设置邀请科室（本院受邀科室名称）
     *
     * @param inviteDept 邀请科室（本院受邀科室名称）
     */
    public void setInviteDept(String inviteDept) {
        this.inviteDept = inviteDept == null ? null : inviteDept.trim();
    }

    /**
     * 获取邀请医生（本院受邀医生姓名）
     *
     * @return INVITE_DOCTOR - 邀请医生（本院受邀医生姓名）
     */
    public String getInviteDoctor() {
        return inviteDoctor;
    }

    /**
     * 设置邀请医生（本院受邀医生姓名）
     *
     * @param inviteDoctor 邀请医生（本院受邀医生姓名）
     */
    public void setInviteDoctor(String inviteDoctor) {
        this.inviteDoctor = inviteDoctor == null ? null : inviteDoctor.trim();
    }

    /**
     * 获取紧急标志（会议的紧急程度）
     *
     * @return ISURGENT - 紧急标志（会议的紧急程度）
     */
    public String getIsurgent() {
        return isurgent;
    }

    /**
     * 设置紧急标志（会议的紧急程度）
     *
     * @param isurgent 紧急标志（会议的紧急程度）
     */
    public void setIsurgent(String isurgent) {
        this.isurgent = isurgent == null ? null : isurgent.trim();
    }

    /**
     * 获取提交标志（会诊申请提交标志）
     *
     * @return ISSEND - 提交标志（会诊申请提交标志）
     */
    public String getIssend() {
        return issend;
    }

    /**
     * 设置提交标志（会诊申请提交标志）
     *
     * @param issend 提交标志（会诊申请提交标志）
     */
    public void setIssend(String issend) {
        this.issend = issend == null ? null : issend.trim();
    }

    /**
     * 获取提交时间（会诊申请提交的时间）
     *
     * @return SEND_TIME - 提交时间（会诊申请提交的时间）
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * 设置提交时间（会诊申请提交的时间）
     *
     * @param sendTime 提交时间（会诊申请提交的时间）
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    /**
     * 获取结束标志（会诊结束标志）
     *
     * @return ISEND - 结束标志（会诊结束标志）
     */
    public String getIsend() {
        return isend;
    }

    /**
     * 设置结束标志（会诊结束标志）
     *
     * @param isend 结束标志（会诊结束标志）
     */
    public void setIsend(String isend) {
        this.isend = isend == null ? null : isend.trim();
    }

    /**
     * 获取结束时间（会诊结束的时间）
     *
     * @return END_TIEM - 结束时间（会诊结束的时间）
     */
    public String getEndTiem() {
        return endTiem;
    }

    /**
     * 设置结束时间（会诊结束的时间）
     *
     * @param endTiem 结束时间（会诊结束的时间）
     */
    public void setEndTiem(String endTiem) {
        this.endTiem = endTiem == null ? null : endTiem.trim();
    }

    /**
     * 获取病历编号（电子病历记录中会诊记录ID）
     *
     * @return EMR_ID - 病历编号（电子病历记录中会诊记录ID）
     */
    public String getEmrId() {
        return emrId;
    }

    /**
     * 设置病历编号（电子病历记录中会诊记录ID）
     *
     * @param emrId 病历编号（电子病历记录中会诊记录ID）
     */
    public void setEmrId(String emrId) {
        this.emrId = emrId == null ? null : emrId.trim();
    }

    /**
     * 获取录入人姓名（信息录入人姓名）
     *
     * @return CREATOR - 录入人姓名（信息录入人姓名）
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param creator 录入人姓名（信息录入人姓名）
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return CREATE_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param createTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 获取系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @return SYSUP_TIME - 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * 设置系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @param sysupTime 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * 获取数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @return SYSCR_TIME - 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * 设置数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @param syscrTime 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
    }
}