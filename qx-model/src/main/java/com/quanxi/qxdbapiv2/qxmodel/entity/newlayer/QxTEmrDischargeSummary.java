package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_DISCHARGE_SUMMARY")
public class QxTEmrDischargeSummary {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 出院小结唯一标识
     */
    @Column(name = "EDSUID")
    private String edsuid;

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
     * 住院医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "RESIDENT_DOCTOR_ID")
    private String residentDoctorId;

    /**
     * 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "RESIDENT_DOCTOR_DATE")
    private String residentDoctorDate;

    /**
     * 主治医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "IN_CHARGE_DOCTOR_ID")
    private String inChargeDoctorId;

    /**
     * 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "IN_CHARGE_DOCTOR_NAME")
    private String inChargeDoctorName;

    /**
     * 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_CHARGE_DOCTOR_DATE")
    private String inChargeDoctorDate;

    /**
     * 出院小结类型代码DIR_OUT_SUMMARY_TYPE（出院小结类型在特定编码体系中的代码）
     */
    @Column(name = "OUTSUMMARY_TYPE_CODE")
    private String outsummaryTypeCode;

    /**
     * 出院小结类型中文名称（出院小结类型在特定编码体系中的中文名称）
     */
    @Column(name = "OUTSUMMARY_TYPE_CN")
    private String outsummaryTypeCn;

    /**
     * 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 入院科室编码DIR_DEPT（患者入院时的科室编码）
     */
    @Column(name = "IN_DEPT_CODE")
    private String inDeptCode;

    /**
     * 入院科室名称（患者入院时的标准科室名称）
     */
    @Column(name = "IN_DEPT_NAME")
    private String inDeptName;

    /**
     * 床位号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 入院诊断代码ICD-10（确诊诊断在西医诊断特定编码体系中的编码）
     */
    @Column(name = "IN_DIAGNOSIS_CODE")
    private String inDiagnosisCode;

    /**
     * 入院诊断中文名称（确诊诊断在西医诊断特定编码体系中的中文名称）
     */
    @Column(name = "IN_DIAGNOSIS_CN")
    private String inDiagnosisCn;

    /**
     * 入院诊断代码（中医）GB/T 15657
     */
    @Column(name = "TCM_IN_DIAGOSIS_CODE")
    private String tcmInDiagosisCode;

    /**
     * 入院诊断名称（中医）
     */
    @Column(name = "TMC_IN_DIAGOSIS_NAME")
    private String tmcInDiagosisName;

    /**
     * 入院情况代码CV05.10.019（对患者入院情况的代码）
     */
    @Column(name = "IN_CONDITION_CODE")
    private String inConditionCode;

    /**
     * 入院情况名称（对患者入院情况的名称）
     */
    @Column(name = "IN_CONDITION_NAME")
    private String inConditionName;

    /**
     * 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 出院情况（对患者出院情况的详细描述）
     */
    @Column(name = "OUT_CONDITION")
    private String outCondition;

    /**
     * 出院诊断代码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    @Column(name = "OUT_DIAGNOSIS_CODE")
    private String outDiagnosisCode;

    /**
     * 出院诊断中文名称（患者所患疾病在西医诊断特定编码体系中的中文名称）
     */
    @Column(name = "OUT_DIAGNOSIS_CN")
    private String outDiagnosisCn;

    /**
     * 出院诊断代码（中医）GB/T 15657
     */
    @Column(name = "TCM_OUT_DIAGOSIS_CODE")
    private String tcmOutDiagosisCode;

    /**
     * 出院诊断名称（中医）
     */
    @Column(name = "TMC_OUT_DIAGOSIS_NAME")
    private String tmcOutDiagosisName;

    /**
     * 出院医嘱（对患者出院医嘱的详细描述）
     */
    @Column(name = "OUT_ORDER")
    private String outOrder;

    /**
     * 治疗结果代码DIR_TREATMENT_RESULT（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的代码）
     */
    @Column(name = "TREATMENT_RESULT_CODE")
    private String treatmentResultCode;

    /**
     * 治疗结果中文名称（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的中文名称）
     */
    @Column(name = "TREATMENT_RESULT_CN")
    private String treatmentResultCn;

    /**
     * 阳性辅助检查结果（涉及到阳性结果的辅助检查结果的描述）
     */
    @Column(name = "AUXILIARY_POSITIVE_RESULT")
    private String auxiliaryPositiveResult;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    /**
     * 出院时症状与体征（患者出院时症状和体征的详细描述）
     */
    @Column(name = "DISCHARGE_SYMPTOM_SIGN")
    private String dischargeSymptomSign;

    /**
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    /**
     * 异常临床表现
     */
    @Column(name = "CHARACTERISTICS_ABNORMAL")
    private String characteristicsAbnormal;

    /**
     * 正常临床表现
     */
    @Column(name = "CHARACTERISTICS_NORMAL")
    private String characteristicsNormal;

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
     * 获取出院小结唯一标识
     *
     * @return EDSUID - 出院小结唯一标识
     */
    public String getEdsuid() {
        return edsuid;
    }

    /**
     * 设置出院小结唯一标识
     *
     * @param edsuid 出院小结唯一标识
     */
    public void setEdsuid(String edsuid) {
        this.edsuid = edsuid == null ? null : edsuid.trim();
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
     * 获取住院医师：编号（医疗服务人员的唯一编号）
     *
     * @return RESIDENT_DOCTOR_ID - 住院医师：编号（医疗服务人员的唯一编号）
     */
    public String getResidentDoctorId() {
        return residentDoctorId;
    }

    /**
     * 设置住院医师：编号（医疗服务人员的唯一编号）
     *
     * @param residentDoctorId 住院医师：编号（医疗服务人员的唯一编号）
     */
    public void setResidentDoctorId(String residentDoctorId) {
        this.residentDoctorId = residentDoctorId == null ? null : residentDoctorId.trim();
    }

    /**
     * 获取住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param residentDoctorName 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return RESIDENT_DOCTOR_DATE - 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getResidentDoctorDate() {
        return residentDoctorDate;
    }

    /**
     * 设置住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param residentDoctorDate 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setResidentDoctorDate(String residentDoctorDate) {
        this.residentDoctorDate = residentDoctorDate == null ? null : residentDoctorDate.trim();
    }

    /**
     * 获取主治医师：编号（医疗服务人员的唯一编号）
     *
     * @return IN_CHARGE_DOCTOR_ID - 主治医师：编号（医疗服务人员的唯一编号）
     */
    public String getInChargeDoctorId() {
        return inChargeDoctorId;
    }

    /**
     * 设置主治医师：编号（医疗服务人员的唯一编号）
     *
     * @param inChargeDoctorId 主治医师：编号（医疗服务人员的唯一编号）
     */
    public void setInChargeDoctorId(String inChargeDoctorId) {
        this.inChargeDoctorId = inChargeDoctorId == null ? null : inChargeDoctorId.trim();
    }

    /**
     * 获取主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return IN_CHARGE_DOCTOR_NAME - 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getInChargeDoctorName() {
        return inChargeDoctorName;
    }

    /**
     * 设置主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param inChargeDoctorName 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setInChargeDoctorName(String inChargeDoctorName) {
        this.inChargeDoctorName = inChargeDoctorName == null ? null : inChargeDoctorName.trim();
    }

    /**
     * 获取主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return IN_CHARGE_DOCTOR_DATE - 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getInChargeDoctorDate() {
        return inChargeDoctorDate;
    }

    /**
     * 设置主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param inChargeDoctorDate 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setInChargeDoctorDate(String inChargeDoctorDate) {
        this.inChargeDoctorDate = inChargeDoctorDate == null ? null : inChargeDoctorDate.trim();
    }

    /**
     * 获取出院小结类型代码DIR_OUT_SUMMARY_TYPE（出院小结类型在特定编码体系中的代码）
     *
     * @return OUTSUMMARY_TYPE_CODE - 出院小结类型代码DIR_OUT_SUMMARY_TYPE（出院小结类型在特定编码体系中的代码）
     */
    public String getOutsummaryTypeCode() {
        return outsummaryTypeCode;
    }

    /**
     * 设置出院小结类型代码DIR_OUT_SUMMARY_TYPE（出院小结类型在特定编码体系中的代码）
     *
     * @param outsummaryTypeCode 出院小结类型代码DIR_OUT_SUMMARY_TYPE（出院小结类型在特定编码体系中的代码）
     */
    public void setOutsummaryTypeCode(String outsummaryTypeCode) {
        this.outsummaryTypeCode = outsummaryTypeCode == null ? null : outsummaryTypeCode.trim();
    }

    /**
     * 获取出院小结类型中文名称（出院小结类型在特定编码体系中的中文名称）
     *
     * @return OUTSUMMARY_TYPE_CN - 出院小结类型中文名称（出院小结类型在特定编码体系中的中文名称）
     */
    public String getOutsummaryTypeCn() {
        return outsummaryTypeCn;
    }

    /**
     * 设置出院小结类型中文名称（出院小结类型在特定编码体系中的中文名称）
     *
     * @param outsummaryTypeCn 出院小结类型中文名称（出院小结类型在特定编码体系中的中文名称）
     */
    public void setOutsummaryTypeCn(String outsummaryTypeCn) {
        this.outsummaryTypeCn = outsummaryTypeCn == null ? null : outsummaryTypeCn.trim();
    }

    /**
     * 获取入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return ADMISSION_DATE - 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param admissionDate 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @return DISCHARGE_DATE - 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @param dischargeDate 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取入院科室编码DIR_DEPT（患者入院时的科室编码）
     *
     * @return IN_DEPT_CODE - 入院科室编码DIR_DEPT（患者入院时的科室编码）
     */
    public String getInDeptCode() {
        return inDeptCode;
    }

    /**
     * 设置入院科室编码DIR_DEPT（患者入院时的科室编码）
     *
     * @param inDeptCode 入院科室编码DIR_DEPT（患者入院时的科室编码）
     */
    public void setInDeptCode(String inDeptCode) {
        this.inDeptCode = inDeptCode == null ? null : inDeptCode.trim();
    }

    /**
     * 获取入院科室名称（患者入院时的标准科室名称）
     *
     * @return IN_DEPT_NAME - 入院科室名称（患者入院时的标准科室名称）
     */
    public String getInDeptName() {
        return inDeptName;
    }

    /**
     * 设置入院科室名称（患者入院时的标准科室名称）
     *
     * @param inDeptName 入院科室名称（患者入院时的标准科室名称）
     */
    public void setInDeptName(String inDeptName) {
        this.inDeptName = inDeptName == null ? null : inDeptName.trim();
    }

    /**
     * 获取床位号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 床位号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置床位号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 床位号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取入院诊断代码ICD-10（确诊诊断在西医诊断特定编码体系中的编码）
     *
     * @return IN_DIAGNOSIS_CODE - 入院诊断代码ICD-10（确诊诊断在西医诊断特定编码体系中的编码）
     */
    public String getInDiagnosisCode() {
        return inDiagnosisCode;
    }

    /**
     * 设置入院诊断代码ICD-10（确诊诊断在西医诊断特定编码体系中的编码）
     *
     * @param inDiagnosisCode 入院诊断代码ICD-10（确诊诊断在西医诊断特定编码体系中的编码）
     */
    public void setInDiagnosisCode(String inDiagnosisCode) {
        this.inDiagnosisCode = inDiagnosisCode == null ? null : inDiagnosisCode.trim();
    }

    /**
     * 获取入院诊断中文名称（确诊诊断在西医诊断特定编码体系中的中文名称）
     *
     * @return IN_DIAGNOSIS_CN - 入院诊断中文名称（确诊诊断在西医诊断特定编码体系中的中文名称）
     */
    public String getInDiagnosisCn() {
        return inDiagnosisCn;
    }

    /**
     * 设置入院诊断中文名称（确诊诊断在西医诊断特定编码体系中的中文名称）
     *
     * @param inDiagnosisCn 入院诊断中文名称（确诊诊断在西医诊断特定编码体系中的中文名称）
     */
    public void setInDiagnosisCn(String inDiagnosisCn) {
        this.inDiagnosisCn = inDiagnosisCn == null ? null : inDiagnosisCn.trim();
    }

    /**
     * 获取入院诊断代码（中医）GB/T 15657
     *
     * @return TCM_IN_DIAGOSIS_CODE - 入院诊断代码（中医）GB/T 15657
     */
    public String getTcmInDiagosisCode() {
        return tcmInDiagosisCode;
    }

    /**
     * 设置入院诊断代码（中医）GB/T 15657
     *
     * @param tcmInDiagosisCode 入院诊断代码（中医）GB/T 15657
     */
    public void setTcmInDiagosisCode(String tcmInDiagosisCode) {
        this.tcmInDiagosisCode = tcmInDiagosisCode == null ? null : tcmInDiagosisCode.trim();
    }

    /**
     * 获取入院诊断名称（中医）
     *
     * @return TMC_IN_DIAGOSIS_NAME - 入院诊断名称（中医）
     */
    public String getTmcInDiagosisName() {
        return tmcInDiagosisName;
    }

    /**
     * 设置入院诊断名称（中医）
     *
     * @param tmcInDiagosisName 入院诊断名称（中医）
     */
    public void setTmcInDiagosisName(String tmcInDiagosisName) {
        this.tmcInDiagosisName = tmcInDiagosisName == null ? null : tmcInDiagosisName.trim();
    }

    /**
     * 获取入院情况代码CV05.10.019（对患者入院情况的代码）
     *
     * @return IN_CONDITION_CODE - 入院情况代码CV05.10.019（对患者入院情况的代码）
     */
    public String getInConditionCode() {
        return inConditionCode;
    }

    /**
     * 设置入院情况代码CV05.10.019（对患者入院情况的代码）
     *
     * @param inConditionCode 入院情况代码CV05.10.019（对患者入院情况的代码）
     */
    public void setInConditionCode(String inConditionCode) {
        this.inConditionCode = inConditionCode == null ? null : inConditionCode.trim();
    }

    /**
     * 获取入院情况名称（对患者入院情况的名称）
     *
     * @return IN_CONDITION_NAME - 入院情况名称（对患者入院情况的名称）
     */
    public String getInConditionName() {
        return inConditionName;
    }

    /**
     * 设置入院情况名称（对患者入院情况的名称）
     *
     * @param inConditionName 入院情况名称（对患者入院情况的名称）
     */
    public void setInConditionName(String inConditionName) {
        this.inConditionName = inConditionName == null ? null : inConditionName.trim();
    }

    /**
     * 获取诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取出院情况（对患者出院情况的详细描述）
     *
     * @return OUT_CONDITION - 出院情况（对患者出院情况的详细描述）
     */
    public String getOutCondition() {
        return outCondition;
    }

    /**
     * 设置出院情况（对患者出院情况的详细描述）
     *
     * @param outCondition 出院情况（对患者出院情况的详细描述）
     */
    public void setOutCondition(String outCondition) {
        this.outCondition = outCondition == null ? null : outCondition.trim();
    }

    /**
     * 获取出院诊断代码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @return OUT_DIAGNOSIS_CODE - 出院诊断代码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public String getOutDiagnosisCode() {
        return outDiagnosisCode;
    }

    /**
     * 设置出院诊断代码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @param outDiagnosisCode 出院诊断代码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public void setOutDiagnosisCode(String outDiagnosisCode) {
        this.outDiagnosisCode = outDiagnosisCode == null ? null : outDiagnosisCode.trim();
    }

    /**
     * 获取出院诊断中文名称（患者所患疾病在西医诊断特定编码体系中的中文名称）
     *
     * @return OUT_DIAGNOSIS_CN - 出院诊断中文名称（患者所患疾病在西医诊断特定编码体系中的中文名称）
     */
    public String getOutDiagnosisCn() {
        return outDiagnosisCn;
    }

    /**
     * 设置出院诊断中文名称（患者所患疾病在西医诊断特定编码体系中的中文名称）
     *
     * @param outDiagnosisCn 出院诊断中文名称（患者所患疾病在西医诊断特定编码体系中的中文名称）
     */
    public void setOutDiagnosisCn(String outDiagnosisCn) {
        this.outDiagnosisCn = outDiagnosisCn == null ? null : outDiagnosisCn.trim();
    }

    /**
     * 获取出院诊断代码（中医）GB/T 15657
     *
     * @return TCM_OUT_DIAGOSIS_CODE - 出院诊断代码（中医）GB/T 15657
     */
    public String getTcmOutDiagosisCode() {
        return tcmOutDiagosisCode;
    }

    /**
     * 设置出院诊断代码（中医）GB/T 15657
     *
     * @param tcmOutDiagosisCode 出院诊断代码（中医）GB/T 15657
     */
    public void setTcmOutDiagosisCode(String tcmOutDiagosisCode) {
        this.tcmOutDiagosisCode = tcmOutDiagosisCode == null ? null : tcmOutDiagosisCode.trim();
    }

    /**
     * 获取出院诊断名称（中医）
     *
     * @return TMC_OUT_DIAGOSIS_NAME - 出院诊断名称（中医）
     */
    public String getTmcOutDiagosisName() {
        return tmcOutDiagosisName;
    }

    /**
     * 设置出院诊断名称（中医）
     *
     * @param tmcOutDiagosisName 出院诊断名称（中医）
     */
    public void setTmcOutDiagosisName(String tmcOutDiagosisName) {
        this.tmcOutDiagosisName = tmcOutDiagosisName == null ? null : tmcOutDiagosisName.trim();
    }

    /**
     * 获取出院医嘱（对患者出院医嘱的详细描述）
     *
     * @return OUT_ORDER - 出院医嘱（对患者出院医嘱的详细描述）
     */
    public String getOutOrder() {
        return outOrder;
    }

    /**
     * 设置出院医嘱（对患者出院医嘱的详细描述）
     *
     * @param outOrder 出院医嘱（对患者出院医嘱的详细描述）
     */
    public void setOutOrder(String outOrder) {
        this.outOrder = outOrder == null ? null : outOrder.trim();
    }

    /**
     * 获取治疗结果代码DIR_TREATMENT_RESULT（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的代码）
     *
     * @return TREATMENT_RESULT_CODE - 治疗结果代码DIR_TREATMENT_RESULT（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的代码）
     */
    public String getTreatmentResultCode() {
        return treatmentResultCode;
    }

    /**
     * 设置治疗结果代码DIR_TREATMENT_RESULT（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的代码）
     *
     * @param treatmentResultCode 治疗结果代码DIR_TREATMENT_RESULT（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的代码）
     */
    public void setTreatmentResultCode(String treatmentResultCode) {
        this.treatmentResultCode = treatmentResultCode == null ? null : treatmentResultCode.trim();
    }

    /**
     * 获取治疗结果中文名称（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的中文名称）
     *
     * @return TREATMENT_RESULT_CN - 治疗结果中文名称（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的中文名称）
     */
    public String getTreatmentResultCn() {
        return treatmentResultCn;
    }

    /**
     * 设置治疗结果中文名称（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的中文名称）
     *
     * @param treatmentResultCn 治疗结果中文名称（出院时患者所患的每种疾病的治疗结果类别在特定编码体系中的中文名称）
     */
    public void setTreatmentResultCn(String treatmentResultCn) {
        this.treatmentResultCn = treatmentResultCn == null ? null : treatmentResultCn.trim();
    }

    /**
     * 获取阳性辅助检查结果（涉及到阳性结果的辅助检查结果的描述）
     *
     * @return AUXILIARY_POSITIVE_RESULT - 阳性辅助检查结果（涉及到阳性结果的辅助检查结果的描述）
     */
    public String getAuxiliaryPositiveResult() {
        return auxiliaryPositiveResult;
    }

    /**
     * 设置阳性辅助检查结果（涉及到阳性结果的辅助检查结果的描述）
     *
     * @param auxiliaryPositiveResult 阳性辅助检查结果（涉及到阳性结果的辅助检查结果的描述）
     */
    public void setAuxiliaryPositiveResult(String auxiliaryPositiveResult) {
        this.auxiliaryPositiveResult = auxiliaryPositiveResult == null ? null : auxiliaryPositiveResult.trim();
    }

    /**
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
    }

    /**
     * 获取出院时症状与体征（患者出院时症状和体征的详细描述）
     *
     * @return DISCHARGE_SYMPTOM_SIGN - 出院时症状与体征（患者出院时症状和体征的详细描述）
     */
    public String getDischargeSymptomSign() {
        return dischargeSymptomSign;
    }

    /**
     * 设置出院时症状与体征（患者出院时症状和体征的详细描述）
     *
     * @param dischargeSymptomSign 出院时症状与体征（患者出院时症状和体征的详细描述）
     */
    public void setDischargeSymptomSign(String dischargeSymptomSign) {
        this.dischargeSymptomSign = dischargeSymptomSign == null ? null : dischargeSymptomSign.trim();
    }

    /**
     * 获取病历分析
     *
     * @return EMR_CONTENT_PARSE - 病历分析
     */
    public String getEmrContentParse() {
        return emrContentParse;
    }

    /**
     * 设置病历分析
     *
     * @param emrContentParse 病历分析
     */
    public void setEmrContentParse(String emrContentParse) {
        this.emrContentParse = emrContentParse == null ? null : emrContentParse.trim();
    }

    /**
     * 获取异常临床表现
     *
     * @return CHARACTERISTICS_ABNORMAL - 异常临床表现
     */
    public String getCharacteristicsAbnormal() {
        return characteristicsAbnormal;
    }

    /**
     * 设置异常临床表现
     *
     * @param characteristicsAbnormal 异常临床表现
     */
    public void setCharacteristicsAbnormal(String characteristicsAbnormal) {
        this.characteristicsAbnormal = characteristicsAbnormal == null ? null : characteristicsAbnormal.trim();
    }

    /**
     * 获取正常临床表现
     *
     * @return CHARACTERISTICS_NORMAL - 正常临床表现
     */
    public String getCharacteristicsNormal() {
        return characteristicsNormal;
    }

    /**
     * 设置正常临床表现
     *
     * @param characteristicsNormal 正常临床表现
     */
    public void setCharacteristicsNormal(String characteristicsNormal) {
        this.characteristicsNormal = characteristicsNormal == null ? null : characteristicsNormal.trim();
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