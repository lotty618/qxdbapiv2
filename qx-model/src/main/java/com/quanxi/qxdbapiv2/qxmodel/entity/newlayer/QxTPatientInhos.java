package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_PATIENT_INHOS")
public class QxTPatientInhos {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

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
     * 所属科室
     */
    @Column(name = "DUID")
    private String duid;

    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 主治医生
     */
    @Column(name = "MAIN_DOCTOR_ID")
    private String mainDoctorId;

    /**
     * 主治医生名称
     */
    @Column(name = "MAIN_DOCTOR_NAME")
    private String mainDoctorName;

    /**
     * 主管护士
     */
    @Column(name = "MAIN_NURSE_ID")
    private String mainNurseId;

    /**
     * 主管护士名称
     */
    @Column(name = "MAIN_NURSE_NAME")
    private String mainNurseName;

    /**
     * 病床唯一标识
     */
    @Column(name = "HBUID")
    private String hbuid;

    /**
     * 病床编号
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 病人入院编号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 残疾情况类别代码（本人残疾种类的代码）
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
    private String hospitaltalizationTimes;

    /**
     * 病人账号下金额
     */
    @Column(name = "ACCOUNT_MONEY")
    private String accountMoney;

    /**
     * 欠费金额
     */
    @Column(name = "MONEY_ARREARAGE")
    private String moneyArrearage;

    /**
     * 入院日期YYYY/MM/DD（患者入院的公元纪年日期时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 住院原因代码（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
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
     * 住院者疾病状态代码（住院者所患疾病所处的状态在特定编码体系中的代码）
     */
    @Column(name = "INPATIENT_DIS_STATUE_CODE")
    private String inpatientDisStatueCode;

    /**
     * 住院者疾病状态中文名称（住院者所患疾病所处的状态在特定编码体系中的中文名称）
     */
    @Column(name = "INPATIENT_DIS_STATUE_CN")
    private String inpatientDisStatueCn;

    /**
     * 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
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
     * 出院科室代码（住院患者出院科室代码）
     */
    @Column(name = "DISCHARGE_DEPT_CODE")
    private String dischargeDeptCode;

    /**
     * 出院科室中文名称（住院患者出院科室中文名称）
     */
    @Column(name = "DISCHARGE_DEPT_CN")
    private String dischargeDeptCn;

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
     * 住院ID
     */
    @Column(name = "INHOS_ID")
    private String inhosId;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 主任医师代码
     */
    @Column(name = "CHIEF_PHYSICIAN")
    private String chiefPhysician;

    /**
     * 主任医师姓名
     */
    @Column(name = "CHIEF_PHYSICIAN_NAME")
    private String chiefPhysicianName;

    /**
     * 住院医师代码
     */
    @Column(name = "DOCTOR")
    private String doctor;

    /**
     * 住院医师姓名
     */
    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    /**
     * 病人状态代码
     */
    @Column(name = "TREAT_RESULT_CODE")
    private String treatResultCode;

    /**
     * 病人状态
     */
    @Column(name = "TREAT_RESULT_CN")
    private String treatResultCn;

    /**
     * 病人姓名
     */
    @Column(name = "PATIENT_NAME")
    private String patientName;

    /**
     * 病人性别
     */
    @Column(name = "SEX")
    private String sex;

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
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

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

    @Column(name = "ADMISSION_DEPT_CODE")
    private String admissionDeptCode;

    @Column(name = "ADMISSION_DEPT_CN")
    private String admissionDeptCn;

    @Column(name = "ADMISSION_BED_NO")
    private String admissionBedNo;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /** 入院天数 */
    private Integer inhosDays;

    /** 入院时年龄 */
    private Integer age;

    /** 主要诊段名称 */
    private String mainDiag;

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
     * 获取所属科室
     *
     * @return DUID - 所属科室
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置所属科室
     *
     * @param duid 所属科室
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * @return ORGUID
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * @param orguid
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取主治医生
     *
     * @return MAIN_DOCTOR_ID - 主治医生
     */
    public String getMainDoctorId() {
        return mainDoctorId;
    }

    /**
     * 设置主治医生
     *
     * @param mainDoctorId 主治医生
     */
    public void setMainDoctorId(String mainDoctorId) {
        this.mainDoctorId = mainDoctorId == null ? null : mainDoctorId.trim();
    }

    /**
     * 获取主治医生名称
     *
     * @return MAIN_DOCTOR_NAME - 主治医生名称
     */
    public String getMainDoctorName() {
        return mainDoctorName;
    }

    /**
     * 设置主治医生名称
     *
     * @param mainDoctorName 主治医生名称
     */
    public void setMainDoctorName(String mainDoctorName) {
        this.mainDoctorName = mainDoctorName == null ? null : mainDoctorName.trim();
    }

    /**
     * 获取主管护士
     *
     * @return MAIN_NURSE_ID - 主管护士
     */
    public String getMainNurseId() {
        return mainNurseId;
    }

    /**
     * 设置主管护士
     *
     * @param mainNurseId 主管护士
     */
    public void setMainNurseId(String mainNurseId) {
        this.mainNurseId = mainNurseId == null ? null : mainNurseId.trim();
    }

    /**
     * 获取主管护士名称
     *
     * @return MAIN_NURSE_NAME - 主管护士名称
     */
    public String getMainNurseName() {
        return mainNurseName;
    }

    /**
     * 设置主管护士名称
     *
     * @param mainNurseName 主管护士名称
     */
    public void setMainNurseName(String mainNurseName) {
        this.mainNurseName = mainNurseName == null ? null : mainNurseName.trim();
    }

    /**
     * 获取病床唯一标识
     *
     * @return HBUID - 病床唯一标识
     */
    public String getHbuid() {
        return hbuid;
    }

    /**
     * 设置病床唯一标识
     *
     * @param hbuid 病床唯一标识
     */
    public void setHbuid(String hbuid) {
        this.hbuid = hbuid == null ? null : hbuid.trim();
    }

    /**
     * 获取病床编号
     *
     * @return BED_NO - 病床编号
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置病床编号
     *
     * @param bedNo 病床编号
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取病人入院编号
     *
     * @return INHOS_NO - 病人入院编号
     */
    public String getInhosNo() {
        return inhosNo;
    }

    /**
     * 设置病人入院编号
     *
     * @param inhosNo 病人入院编号
     */
    public void setInhosNo(String inhosNo) {
        this.inhosNo = inhosNo == null ? null : inhosNo.trim();
    }

    /**
     * 获取残疾情况类别代码（本人残疾种类的代码）
     *
     * @return DISABILITY_CODE - 残疾情况类别代码（本人残疾种类的代码）
     */
    public String getDisabilityCode() {
        return disabilityCode;
    }

    /**
     * 设置残疾情况类别代码（本人残疾种类的代码）
     *
     * @param disabilityCode 残疾情况类别代码（本人残疾种类的代码）
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
    public String getHospitaltalizationTimes() {
        return hospitaltalizationTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     *
     * @param hospitaltalizationTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    public void setHospitaltalizationTimes(String hospitaltalizationTimes) {
        this.hospitaltalizationTimes = hospitaltalizationTimes == null ? null : hospitaltalizationTimes.trim();
    }

    /**
     * 获取病人账号下金额
     *
     * @return ACCOUNT_MONEY - 病人账号下金额
     */
    public String getAccountMoney() {
        return accountMoney;
    }

    /**
     * 设置病人账号下金额
     *
     * @param accountMoney 病人账号下金额
     */
    public void setAccountMoney(String accountMoney) {
        this.accountMoney = accountMoney == null ? null : accountMoney.trim();
    }

    /**
     * 获取欠费金额
     *
     * @return MONEY_ARREARAGE - 欠费金额
     */
    public String getMoneyArrearage() {
        return moneyArrearage;
    }

    /**
     * 设置欠费金额
     *
     * @param moneyArrearage 欠费金额
     */
    public void setMoneyArrearage(String moneyArrearage) {
        this.moneyArrearage = moneyArrearage == null ? null : moneyArrearage.trim();
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
     * 获取住院原因代码（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     *
     * @return INPATIENT_REASON_CODE - 住院原因代码（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     */
    public String getInpatientReasonCode() {
        return inpatientReasonCode;
    }

    /**
     * 设置住院原因代码（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
     *
     * @param inpatientReasonCode 住院原因代码（此次住院的原因在特定编码体系中的代码，如是否卫生机构转诊、体检、分娩等默认值为患病代码）
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
     * 获取住院者疾病状态代码（住院者所患疾病所处的状态在特定编码体系中的代码）
     *
     * @return INPATIENT_DIS_STATUE_CODE - 住院者疾病状态代码（住院者所患疾病所处的状态在特定编码体系中的代码）
     */
    public String getInpatientDisStatueCode() {
        return inpatientDisStatueCode;
    }

    /**
     * 设置住院者疾病状态代码（住院者所患疾病所处的状态在特定编码体系中的代码）
     *
     * @param inpatientDisStatueCode 住院者疾病状态代码（住院者所患疾病所处的状态在特定编码体系中的代码）
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
     * 获取保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @return PAY_WAY_CODE - 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     */
    public String getPayWayCode() {
        return payWayCode;
    }

    /**
     * 设置保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
     *
     * @param payWayCode 保险类型代码（患者本人参加的医疗保险类别在特定编码体系中的代码）
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
     * 获取出院科室代码（住院患者出院科室代码）
     *
     * @return DISCHARGE_DEPT_CODE - 出院科室代码（住院患者出院科室代码）
     */
    public String getDischargeDeptCode() {
        return dischargeDeptCode;
    }

    /**
     * 设置出院科室代码（住院患者出院科室代码）
     *
     * @param dischargeDeptCode 出院科室代码（住院患者出院科室代码）
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
     * 获取住院ID
     *
     * @return INHOS_ID - 住院ID
     */
    public String getInhosId() {
        return inhosId;
    }

    /**
     * 设置住院ID
     *
     * @param inhosId 住院ID
     */
    public void setInhosId(String inhosId) {
        this.inhosId = inhosId == null ? null : inhosId.trim();
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
     * 获取主任医师姓名
     *
     * @return CHIEF_PHYSICIAN_NAME - 主任医师姓名
     */
    public String getChiefPhysicianName() {
        return chiefPhysicianName;
    }

    /**
     * 设置主任医师姓名
     *
     * @param chiefPhysicianName 主任医师姓名
     */
    public void setChiefPhysicianName(String chiefPhysicianName) {
        this.chiefPhysicianName = chiefPhysicianName == null ? null : chiefPhysicianName.trim();
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
     * 获取住院医师姓名
     *
     * @return DOCTOR_NAME - 住院医师姓名
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置住院医师姓名
     *
     * @param doctorName 住院医师姓名
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取病人状态代码
     *
     * @return TREAT_RESULT_CODE - 病人状态代码
     */
    public String getTreatResultCode() {
        return treatResultCode;
    }

    /**
     * 设置病人状态代码
     *
     * @param treatResultCode 病人状态代码
     */
    public void setTreatResultCode(String treatResultCode) {
        this.treatResultCode = treatResultCode == null ? null : treatResultCode.trim();
    }

    /**
     * 获取病人状态
     *
     * @return TREAT_RESULT_CN - 病人状态
     */
    public String getTreatResultCn() {
        return treatResultCn;
    }

    /**
     * 设置病人状态
     *
     * @param treatResultCn 病人状态
     */
    public void setTreatResultCn(String treatResultCn) {
        this.treatResultCn = treatResultCn == null ? null : treatResultCn.trim();
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
     * 获取病人性别
     *
     * @return SEX - 病人性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置病人性别
     *
     * @param sex 病人性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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
     * @return ADMISSION_DEPT_CODE
     */
    public String getAdmissionDeptCode() {
        return admissionDeptCode;
    }

    /**
     * @param admissionDeptCode
     */
    public void setAdmissionDeptCode(String admissionDeptCode) {
        this.admissionDeptCode = admissionDeptCode == null ? null : admissionDeptCode.trim();
    }

    /**
     * @return ADMISSION_DEPT_CN
     */
    public String getAdmissionDeptCn() {
        return admissionDeptCn;
    }

    /**
     * @param admissionDeptCn
     */
    public void setAdmissionDeptCn(String admissionDeptCn) {
        this.admissionDeptCn = admissionDeptCn == null ? null : admissionDeptCn.trim();
    }

    /**
     * @return ADMISSION_BED_NO
     */
    public String getAdmissionBedNo() {
        return admissionBedNo;
    }

    /**
     * @param admissionBedNo
     */
    public void setAdmissionBedNo(String admissionBedNo) {
        this.admissionBedNo = admissionBedNo == null ? null : admissionBedNo.trim();
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

    public Integer getInhosDays() {
        return inhosDays;
    }

    public void setInhosDays(Integer inhosDays) {
        this.inhosDays = inhosDays;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMainDiag() {
        return mainDiag;
    }

    public void setMainDiag(String mainDiag) {
        this.mainDiag = mainDiag;
    }
}