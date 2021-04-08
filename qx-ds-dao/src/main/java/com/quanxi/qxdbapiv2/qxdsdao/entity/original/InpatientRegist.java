package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_REGIST")
public class InpatientRegist {
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
     * 住院记录表编号[主键]（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 残疾情况类别代码CV05.10.001（本人残疾种类的代码）
     */
    @Column(name = "DISABILITY_CODE")
    private String disabilityCode;

    /**
     * 残疾情况类别的中文名称（本人残疾种类的中文名称）
     */
    @Column(name = "DISABILITY_CN")
    private String disabilityCn;

    /**
     * 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    @Column(name = "IN_MEDICAL_RECORD_NO")
    private String inMedicalRecordNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private Integer hospitaltalizationTimes;

    /**
     * 入院科室代码DIR_DEPT（住院患者入院科室代码）
     */
    @Column(name = "ADMISSION_DEPT_CODE")
    private String admissionDeptCode;

    /**
     * 入院科室中文名称（住院患者入院科室中文名称）
     */
    @Column(name = "ADMISSION_DEPT_CN")
    private String admissionDeptCn;

    /**
     * 入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 入院床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "ADMISSION_BED_NO")
    private String admissionBedNo;

    /**
     * 住院原因代码CV06.00.212（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     */
    @Column(name = "INPATIENT_REASON_CODE")
    private String inpatientReasonCode;

    /**
     * 住院原因中文名称（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病中文名称）
     */
    @Column(name = "INPATIENT_REASON_CN")
    private String inpatientReasonCn;

    /**
     * 住院者传染性标志0否 1是（标识住院者是否具有传染性 ）
     */
    @Column(name = "INPATIENT_INFECTIVITY_CODE")
    private String inpatientInfectivityCode;

    /**
     * 住院者疾病状态代码DIR_DISEASE_STATUS（住院者所患疾病所处的状态在特定编码体系中的代码）
     */
    @Column(name = "INPATIENT_DIS_STATUE_CODE")
    private String inpatientDisStatueCode;

    /**
     * 住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     */
    @Column(name = "INPATIENT_DIS_STATUE_CN")
    private String inpatientDisStatueCn;

    /**
     * 保险类型代码CV02.01.204（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    @Column(name = "PAY_WAY_CODE")
    private String payWayCode;

    /**
     * 保险类型中文名称（患者本人参加的医疗保险类别在特定编码体系中的中文名称）
     */
    @Column(name = "PAY_WAY_CN")
    private String payWayCn;

    /**
     * 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    @Column(name = "INSURANCE_NO")
    private String insuranceNo;

    /**
     * 出院日期YYYY/MM/DD（住院者实际办理出院手续当日的公元纪年日期）
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 出院科室代码DIR_DEPT（住院患者出院科室代码）
     */
    @Column(name = "DISCHARGE_DEPT_CODE")
    private String dischargeDeptCode;

    /**
     * 出院科室中文名称（住院患者出院科室中文名称）
     */
    @Column(name = "DISCHARGE_DEPT_CN")
    private String dischargeDeptCn;

    /**
     * 出院床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "DISCHARGE_BED_NO")
    private String dischargeBedNo;

    /**
     * 转诊标志0否 1是（标识患者是否经历转诊的过程）
     */
    @Column(name = "INPATIENT_REFERRAL_CODE")
    private String inpatientReferralCode;

    /**
     * 死亡标志0否 1是（标识是否死亡）
     */
    @Column(name = "DEATH_CODE")
    private String deathCode;

    /**
     * 根本死因代码ICD-10（导致个体死亡的最根本疾病的诊断在特定编码体系中的代码）
     */
    @Column(name = "DEATH_REASON_CODE")
    private String deathReasonCode;

    /**
     * 根本死因中文名称（导致个体死亡的最根本疾病的诊断在特定编码体系中的中文名称）
     */
    @Column(name = "DEATH_REASON_CN")
    private String deathReasonCn;

    /**
     * 死亡日期YYYY/MM/DD（本人死亡当日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DEATH_DATE")
    private String deathDate;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

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
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

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
     * 主任医师代码
     */
    @Column(name = "CHIEF_PHYSICIAN")
    private String chiefPhysician;

    /**
     * 主任医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    @Column(name = "CHIEF_PHYSICIAN_NAME")
    private String chiefPhysicianName;

    /**
     * 主治医师代码
     */
    @Column(name = "ATTENDING_PHYSICIAN")
    private String attendingPhysician;

    /**
     * 主治医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    @Column(name = "ATTENDING_PHYSICIAN_NAME")
    private String attendingPhysicianName;

    /**
     * 住院医师代码
     */
    @Column(name = "DOCTOR")
    private String doctor;

    /**
     * 住院医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    /**
     * 患者姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PATIENT_NAME")
    private String patientName;

    /**
     * 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    @Column(name = "TREAT_RESULT_CODE")
    private String treatResultCode;

    /**
     *  治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    @Column(name = "TREAT_RESULT_CN")
    private String treatResultCn;

    /**
     * 患者性别，1男 2女
     */
    @Column(name = "SEX")
    private String sex;

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
     * 获取住院记录表编号[主键]（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取残疾情况类别代码CV05.10.001（本人残疾种类的代码）
     *
     * @return DISABILITY_CODE - 残疾情况类别代码CV05.10.001（本人残疾种类的代码）
     */
    public String getDisabilityCode() {
        return disabilityCode;
    }

    /**
     * 设置残疾情况类别代码CV05.10.001（本人残疾种类的代码）
     *
     * @param disabilityCode 残疾情况类别代码CV05.10.001（本人残疾种类的代码）
     */
    public void setDisabilityCode(String disabilityCode) {
        this.disabilityCode = disabilityCode == null ? null : disabilityCode.trim();
    }

    /**
     * 获取残疾情况类别的中文名称（本人残疾种类的中文名称）
     *
     * @return DISABILITY_CN - 残疾情况类别的中文名称（本人残疾种类的中文名称）
     */
    public String getDisabilityCn() {
        return disabilityCn;
    }

    /**
     * 设置残疾情况类别的中文名称（本人残疾种类的中文名称）
     *
     * @param disabilityCn 残疾情况类别的中文名称（本人残疾种类的中文名称）
     */
    public void setDisabilityCn(String disabilityCn) {
        this.disabilityCn = disabilityCn == null ? null : disabilityCn.trim();
    }

    /**
     * 获取病案号（个体在医疗机构住院或建立家庭病床的病案号）
     *
     * @return IN_MEDICAL_RECORD_NO - 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    public String getInMedicalRecordNo() {
        return inMedicalRecordNo;
    }

    /**
     * 设置病案号（个体在医疗机构住院或建立家庭病床的病案号）
     *
     * @param inMedicalRecordNo 病案号（个体在医疗机构住院或建立家庭病床的病案号）
     */
    public void setInMedicalRecordNo(String inMedicalRecordNo) {
        this.inMedicalRecordNo = inMedicalRecordNo == null ? null : inMedicalRecordNo.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @return HOSPITALTALIZATION_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public Integer getHospitaltalizationTimes() {
        return hospitaltalizationTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @param hospitaltalizationTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public void setHospitaltalizationTimes(Integer hospitaltalizationTimes) {
        this.hospitaltalizationTimes = hospitaltalizationTimes;
    }

    /**
     * 获取入院科室代码DIR_DEPT（住院患者入院科室代码）
     *
     * @return ADMISSION_DEPT_CODE - 入院科室代码DIR_DEPT（住院患者入院科室代码）
     */
    public String getAdmissionDeptCode() {
        return admissionDeptCode;
    }

    /**
     * 设置入院科室代码DIR_DEPT（住院患者入院科室代码）
     *
     * @param admissionDeptCode 入院科室代码DIR_DEPT（住院患者入院科室代码）
     */
    public void setAdmissionDeptCode(String admissionDeptCode) {
        this.admissionDeptCode = admissionDeptCode == null ? null : admissionDeptCode.trim();
    }

    /**
     * 获取入院科室中文名称（住院患者入院科室中文名称）
     *
     * @return ADMISSION_DEPT_CN - 入院科室中文名称（住院患者入院科室中文名称）
     */
    public String getAdmissionDeptCn() {
        return admissionDeptCn;
    }

    /**
     * 设置入院科室中文名称（住院患者入院科室中文名称）
     *
     * @param admissionDeptCn 入院科室中文名称（住院患者入院科室中文名称）
     */
    public void setAdmissionDeptCn(String admissionDeptCn) {
        this.admissionDeptCn = admissionDeptCn == null ? null : admissionDeptCn.trim();
    }

    /**
     * 获取入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     *
     * @return ADMISSION_DATE - 入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     *
     * @param admissionDate 入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取入院床号（患者住院期间，所住床位对应的编号）
     *
     * @return ADMISSION_BED_NO - 入院床号（患者住院期间，所住床位对应的编号）
     */
    public String getAdmissionBedNo() {
        return admissionBedNo;
    }

    /**
     * 设置入院床号（患者住院期间，所住床位对应的编号）
     *
     * @param admissionBedNo 入院床号（患者住院期间，所住床位对应的编号）
     */
    public void setAdmissionBedNo(String admissionBedNo) {
        this.admissionBedNo = admissionBedNo == null ? null : admissionBedNo.trim();
    }

    /**
     * 获取住院原因代码CV06.00.212（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     *
     * @return INPATIENT_REASON_CODE - 住院原因代码CV06.00.212（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     */
    public String getInpatientReasonCode() {
        return inpatientReasonCode;
    }

    /**
     * 设置住院原因代码CV06.00.212（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     *
     * @param inpatientReasonCode 住院原因代码CV06.00.212（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     */
    public void setInpatientReasonCode(String inpatientReasonCode) {
        this.inpatientReasonCode = inpatientReasonCode == null ? null : inpatientReasonCode.trim();
    }

    /**
     * 获取住院原因中文名称（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病中文名称）
     *
     * @return INPATIENT_REASON_CN - 住院原因中文名称（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病中文名称）
     */
    public String getInpatientReasonCn() {
        return inpatientReasonCn;
    }

    /**
     * 设置住院原因中文名称（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病中文名称）
     *
     * @param inpatientReasonCn 住院原因中文名称（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病中文名称）
     */
    public void setInpatientReasonCn(String inpatientReasonCn) {
        this.inpatientReasonCn = inpatientReasonCn == null ? null : inpatientReasonCn.trim();
    }

    /**
     * 获取住院者传染性标志0否 1是（标识住院者是否具有传染性 ）
     *
     * @return INPATIENT_INFECTIVITY_CODE - 住院者传染性标志0否 1是（标识住院者是否具有传染性 ）
     */
    public String getInpatientInfectivityCode() {
        return inpatientInfectivityCode;
    }

    /**
     * 设置住院者传染性标志0否 1是（标识住院者是否具有传染性 ）
     *
     * @param inpatientInfectivityCode 住院者传染性标志0否 1是（标识住院者是否具有传染性 ）
     */
    public void setInpatientInfectivityCode(String inpatientInfectivityCode) {
        this.inpatientInfectivityCode = inpatientInfectivityCode == null ? null : inpatientInfectivityCode.trim();
    }

    /**
     * 获取住院者疾病状态代码DIR_DISEASE_STATUS（住院者所患疾病所处的状态在特定编码体系中的代码）
     *
     * @return INPATIENT_DIS_STATUE_CODE - 住院者疾病状态代码DIR_DISEASE_STATUS（住院者所患疾病所处的状态在特定编码体系中的代码）
     */
    public String getInpatientDisStatueCode() {
        return inpatientDisStatueCode;
    }

    /**
     * 设置住院者疾病状态代码DIR_DISEASE_STATUS（住院者所患疾病所处的状态在特定编码体系中的代码）
     *
     * @param inpatientDisStatueCode 住院者疾病状态代码DIR_DISEASE_STATUS（住院者所患疾病所处的状态在特定编码体系中的代码）
     */
    public void setInpatientDisStatueCode(String inpatientDisStatueCode) {
        this.inpatientDisStatueCode = inpatientDisStatueCode == null ? null : inpatientDisStatueCode.trim();
    }

    /**
     * 获取住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     *
     * @return INPATIENT_DIS_STATUE_CN - 住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     */
    public String getInpatientDisStatueCn() {
        return inpatientDisStatueCn;
    }

    /**
     * 设置住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     *
     * @param inpatientDisStatueCn 住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     */
    public void setInpatientDisStatueCn(String inpatientDisStatueCn) {
        this.inpatientDisStatueCn = inpatientDisStatueCn == null ? null : inpatientDisStatueCn.trim();
    }

    /**
     * 获取保险类型代码CV02.01.204（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @return PAY_WAY_CODE - 保险类型代码CV02.01.204（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public String getPayWayCode() {
        return payWayCode;
    }

    /**
     * 设置保险类型代码CV02.01.204（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @param payWayCode 保险类型代码CV02.01.204（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode == null ? null : payWayCode.trim();
    }

    /**
     * 获取保险类型中文名称（患者本人参加的医疗保险类别在特定编码体系中的中文名称）
     *
     * @return PAY_WAY_CN - 保险类型中文名称（患者本人参加的医疗保险类别在特定编码体系中的中文名称）
     */
    public String getPayWayCn() {
        return payWayCn;
    }

    /**
     * 设置保险类型中文名称（患者本人参加的医疗保险类别在特定编码体系中的中文名称）
     *
     * @param payWayCn 保险类型中文名称（患者本人参加的医疗保险类别在特定编码体系中的中文名称）
     */
    public void setPayWayCn(String payWayCn) {
        this.payWayCn = payWayCn == null ? null : payWayCn.trim();
    }

    /**
     * 获取医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @return INSURANCE_NO - 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * 设置医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     *
     * @param insuranceNo 医疗保险号（个体参加的医疗保险的类别在特定编码体系中的代码）
     */
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo == null ? null : insuranceNo.trim();
    }

    /**
     * 获取出院日期YYYY/MM/DD（住院者实际办理出院手续当日的公元纪年日期）
     *
     * @return DISCHARGE_DATE - 出院日期YYYY/MM/DD（住院者实际办理出院手续当日的公元纪年日期）
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院日期YYYY/MM/DD（住院者实际办理出院手续当日的公元纪年日期）
     *
     * @param dischargeDate 出院日期YYYY/MM/DD（住院者实际办理出院手续当日的公元纪年日期）
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取出院科室代码DIR_DEPT（住院患者出院科室代码）
     *
     * @return DISCHARGE_DEPT_CODE - 出院科室代码DIR_DEPT（住院患者出院科室代码）
     */
    public String getDischargeDeptCode() {
        return dischargeDeptCode;
    }

    /**
     * 设置出院科室代码DIR_DEPT（住院患者出院科室代码）
     *
     * @param dischargeDeptCode 出院科室代码DIR_DEPT（住院患者出院科室代码）
     */
    public void setDischargeDeptCode(String dischargeDeptCode) {
        this.dischargeDeptCode = dischargeDeptCode == null ? null : dischargeDeptCode.trim();
    }

    /**
     * 获取出院科室中文名称（住院患者出院科室中文名称）
     *
     * @return DISCHARGE_DEPT_CN - 出院科室中文名称（住院患者出院科室中文名称）
     */
    public String getDischargeDeptCn() {
        return dischargeDeptCn;
    }

    /**
     * 设置出院科室中文名称（住院患者出院科室中文名称）
     *
     * @param dischargeDeptCn 出院科室中文名称（住院患者出院科室中文名称）
     */
    public void setDischargeDeptCn(String dischargeDeptCn) {
        this.dischargeDeptCn = dischargeDeptCn == null ? null : dischargeDeptCn.trim();
    }

    /**
     * 获取出院床号（患者住院期间，所住床位对应的编号）
     *
     * @return DISCHARGE_BED_NO - 出院床号（患者住院期间，所住床位对应的编号）
     */
    public String getDischargeBedNo() {
        return dischargeBedNo;
    }

    /**
     * 设置出院床号（患者住院期间，所住床位对应的编号）
     *
     * @param dischargeBedNo 出院床号（患者住院期间，所住床位对应的编号）
     */
    public void setDischargeBedNo(String dischargeBedNo) {
        this.dischargeBedNo = dischargeBedNo == null ? null : dischargeBedNo.trim();
    }

    /**
     * 获取转诊标志0否 1是（标识患者是否经历转诊的过程）
     *
     * @return INPATIENT_REFERRAL_CODE - 转诊标志0否 1是（标识患者是否经历转诊的过程）
     */
    public String getInpatientReferralCode() {
        return inpatientReferralCode;
    }

    /**
     * 设置转诊标志0否 1是（标识患者是否经历转诊的过程）
     *
     * @param inpatientReferralCode 转诊标志0否 1是（标识患者是否经历转诊的过程）
     */
    public void setInpatientReferralCode(String inpatientReferralCode) {
        this.inpatientReferralCode = inpatientReferralCode == null ? null : inpatientReferralCode.trim();
    }

    /**
     * 获取死亡标志0否 1是（标识是否死亡）
     *
     * @return DEATH_CODE - 死亡标志0否 1是（标识是否死亡）
     */
    public String getDeathCode() {
        return deathCode;
    }

    /**
     * 设置死亡标志0否 1是（标识是否死亡）
     *
     * @param deathCode 死亡标志0否 1是（标识是否死亡）
     */
    public void setDeathCode(String deathCode) {
        this.deathCode = deathCode == null ? null : deathCode.trim();
    }

    /**
     * 获取根本死因代码ICD-10（导致个体死亡的最根本疾病的诊断在特定编码体系中的代码）
     *
     * @return DEATH_REASON_CODE - 根本死因代码ICD-10（导致个体死亡的最根本疾病的诊断在特定编码体系中的代码）
     */
    public String getDeathReasonCode() {
        return deathReasonCode;
    }

    /**
     * 设置根本死因代码ICD-10（导致个体死亡的最根本疾病的诊断在特定编码体系中的代码）
     *
     * @param deathReasonCode 根本死因代码ICD-10（导致个体死亡的最根本疾病的诊断在特定编码体系中的代码）
     */
    public void setDeathReasonCode(String deathReasonCode) {
        this.deathReasonCode = deathReasonCode == null ? null : deathReasonCode.trim();
    }

    /**
     * 获取根本死因中文名称（导致个体死亡的最根本疾病的诊断在特定编码体系中的中文名称）
     *
     * @return DEATH_REASON_CN - 根本死因中文名称（导致个体死亡的最根本疾病的诊断在特定编码体系中的中文名称）
     */
    public String getDeathReasonCn() {
        return deathReasonCn;
    }

    /**
     * 设置根本死因中文名称（导致个体死亡的最根本疾病的诊断在特定编码体系中的中文名称）
     *
     * @param deathReasonCn 根本死因中文名称（导致个体死亡的最根本疾病的诊断在特定编码体系中的中文名称）
     */
    public void setDeathReasonCn(String deathReasonCn) {
        this.deathReasonCn = deathReasonCn == null ? null : deathReasonCn.trim();
    }

    /**
     * 获取死亡日期YYYY/MM/DD（本人死亡当日的公元纪年日期和时间的完整描述）
     *
     * @return DEATH_DATE - 死亡日期YYYY/MM/DD（本人死亡当日的公元纪年日期和时间的完整描述）
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * 设置死亡日期YYYY/MM/DD（本人死亡当日的公元纪年日期和时间的完整描述）
     *
     * @param deathDate 死亡日期YYYY/MM/DD（本人死亡当日的公元纪年日期和时间的完整描述）
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate == null ? null : deathDate.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
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

    /**
     * 获取主任医师代码
     *
     * @return CHIEF_PHYSICIAN - 主任医师代码
     */
    public String getChiefPhysician() {
        return chiefPhysician;
    }

    /**
     * 设置主任医师代码
     *
     * @param chiefPhysician 主任医师代码
     */
    public void setChiefPhysician(String chiefPhysician) {
        this.chiefPhysician = chiefPhysician == null ? null : chiefPhysician.trim();
    }

    /**
     * 获取主任医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @return CHIEF_PHYSICIAN_NAME - 主任医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public String getChiefPhysicianName() {
        return chiefPhysicianName;
    }

    /**
     * 设置主任医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @param chiefPhysicianName 主任医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public void setChiefPhysicianName(String chiefPhysicianName) {
        this.chiefPhysicianName = chiefPhysicianName == null ? null : chiefPhysicianName.trim();
    }

    /**
     * 获取主治医师代码
     *
     * @return ATTENDING_PHYSICIAN - 主治医师代码
     */
    public String getAttendingPhysician() {
        return attendingPhysician;
    }

    /**
     * 设置主治医师代码
     *
     * @param attendingPhysician 主治医师代码
     */
    public void setAttendingPhysician(String attendingPhysician) {
        this.attendingPhysician = attendingPhysician == null ? null : attendingPhysician.trim();
    }

    /**
     * 获取主治医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @return ATTENDING_PHYSICIAN_NAME - 主治医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    /**
     * 设置主治医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @param attendingPhysicianName 主治医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName == null ? null : attendingPhysicianName.trim();
    }

    /**
     * 获取住院医师代码
     *
     * @return DOCTOR - 住院医师代码
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * 设置住院医师代码
     *
     * @param doctor 住院医师代码
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor == null ? null : doctor.trim();
    }

    /**
     * 获取住院医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @return DOCTOR_NAME - 住院医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置住院医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     *
     * @param doctorName 住院医师姓名(医师在公安户籍管理部门正式登记注册的姓氏和名称)
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取患者姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return PATIENT_NAME - 患者姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 设置患者姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param patientName 患者姓名（本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * 获取治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     *
     * @return TREAT_RESULT_CODE - 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    public String getTreatResultCode() {
        return treatResultCode;
    }

    /**
     * 设置治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     *
     * @param treatResultCode 治疗结果代码DIR_TREATMENT_RESULT（出院时住院者每种疾病的治疗结果代码  ）
     */
    public void setTreatResultCode(String treatResultCode) {
        this.treatResultCode = treatResultCode == null ? null : treatResultCode.trim();
    }

    /**
     * 获取 治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     *
     * @return TREAT_RESULT_CN -  治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    public String getTreatResultCn() {
        return treatResultCn;
    }

    /**
     * 设置 治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     *
     * @param treatResultCn  治疗结果中文名称（出院时住院者每种疾病的治疗结果中文名称 ）
     */
    public void setTreatResultCn(String treatResultCn) {
        this.treatResultCn = treatResultCn == null ? null : treatResultCn.trim();
    }

    /**
     * 获取患者性别，1男 2女
     *
     * @return SEX - 患者性别，1男 2女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置患者性别，1男 2女
     *
     * @param sex 患者性别，1男 2女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}