package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_INFO")
public class OutpatientInfo {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 门诊记录编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 门诊类别CV09.00.404（例如：门诊、急诊等。）
     */
    @Column(name = "OUTPAT_TYPE_CODE")
    private String outpatTypeCode;

    /**
     * 就诊科室代码DIR_DEPT（患者就诊科室的院内科室代码）
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
     * 医生职称代码GB/T 8561（填报人已取得的相关专业职称在特定编码体系中的代码）
     */
    @Column(name = "DOCTOR_TITLE_CODE")
    private String doctorTitleCode;

    /**
     * 卫生服务要求（患者就诊时对本人所患疾病提出的卫生服务要求的详细描述）
     */
    @Column(name = "HEALTH_SERVICE_DEMAND")
    private String healthServiceDemand;

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
     * 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    @Column(name = "SBP")
    private String sbp;

    /**
     * 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    @Column(name = "DBP")
    private String dbp;

    /**
     * 保险类型代码CV07.10.003（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    @Column(name = "SEC_TYPE_CODE")
    private String secTypeCode;

    /**
     * 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    @Column(name = "SEC_NO")
    private String secNo;

    /**
     * 患者国籍代码GB/T 2659（患者来源国国籍）
     */
    @Column(name = "NATIONALITY")
    private String nationality;

    /**
     * 本地标志0否 1是（标识对象是否为本地）
     */
    @Column(name = "IS_LOCAL")
    private String isLocal;

    /**
     * 咨询问题（对个体所患疾病提出的咨询问题的详细描述）
     */
    @Column(name = "CONSULT_QUESTION")
    private String consultQuestion;

    /**
     * 就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     */
    @Column(name = "OCCURRED_TIME")
    private String occurredTime;

    /**
     * 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAST_UPD_DATE")
    private String lastUpdDate;

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
     * 获取组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @return ORG_ID - 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @param orgId 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取门诊记录编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取门诊类别CV09.00.404（例如：门诊、急诊等。）
     *
     * @return OUTPAT_TYPE_CODE - 门诊类别CV09.00.404（例如：门诊、急诊等。）
     */
    public String getOutpatTypeCode() {
        return outpatTypeCode;
    }

    /**
     * 设置门诊类别CV09.00.404（例如：门诊、急诊等。）
     *
     * @param outpatTypeCode 门诊类别CV09.00.404（例如：门诊、急诊等。）
     */
    public void setOutpatTypeCode(String outpatTypeCode) {
        this.outpatTypeCode = outpatTypeCode == null ? null : outpatTypeCode.trim();
    }

    /**
     * 获取就诊科室代码DIR_DEPT（患者就诊科室的院内科室代码）
     *
     * @return DEPT_CODE - 就诊科室代码DIR_DEPT（患者就诊科室的院内科室代码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置就诊科室代码DIR_DEPT（患者就诊科室的院内科室代码）
     *
     * @param deptCode 就诊科室代码DIR_DEPT（患者就诊科室的院内科室代码）
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
     * 获取医生职称代码GB/T 8561（填报人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @return DOCTOR_TITLE_CODE - 医生职称代码GB/T 8561（填报人已取得的相关专业职称在特定编码体系中的代码）
     */
    public String getDoctorTitleCode() {
        return doctorTitleCode;
    }

    /**
     * 设置医生职称代码GB/T 8561（填报人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @param doctorTitleCode 医生职称代码GB/T 8561（填报人已取得的相关专业职称在特定编码体系中的代码）
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
     * 获取收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     *
     * @return SBP - 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    public String getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     *
     * @param sbp 收缩压(mmHg)（收缩压的测量值，计量单位为mmHg）
     */
    public void setSbp(String sbp) {
        this.sbp = sbp == null ? null : sbp.trim();
    }

    /**
     * 获取舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     *
     * @return DBP - 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    public String getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     *
     * @param dbp 舒张压(mmHg)（舒张压的测量值，计量单位为mmHg）
     */
    public void setDbp(String dbp) {
        this.dbp = dbp == null ? null : dbp.trim();
    }

    /**
     * 获取保险类型代码CV07.10.003（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @return SEC_TYPE_CODE - 保险类型代码CV07.10.003（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public String getSecTypeCode() {
        return secTypeCode;
    }

    /**
     * 设置保险类型代码CV07.10.003（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @param secTypeCode 保险类型代码CV07.10.003（患者本人参加的医疗保险类别在特定编码体系中的代码）
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
     * 获取患者国籍代码GB/T 2659（患者来源国国籍）
     *
     * @return NATIONALITY - 患者国籍代码GB/T 2659（患者来源国国籍）
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置患者国籍代码GB/T 2659（患者来源国国籍）
     *
     * @param nationality 患者国籍代码GB/T 2659（患者来源国国籍）
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * 获取本地标志0否 1是（标识对象是否为本地）
     *
     * @return IS_LOCAL - 本地标志0否 1是（标识对象是否为本地）
     */
    public String getIsLocal() {
        return isLocal;
    }

    /**
     * 设置本地标志0否 1是（标识对象是否为本地）
     *
     * @param isLocal 本地标志0否 1是（标识对象是否为本地）
     */
    public void setIsLocal(String isLocal) {
        this.isLocal = isLocal == null ? null : isLocal.trim();
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
     * 获取最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate == null ? null : lastUpdDate.trim();
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