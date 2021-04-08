package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_OUTPATIENT")
public class QxTEmrOutpatient {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 唯一标识
     */
    @Column(name = "EOUID")
    private String eouid;

    /**
     * 科室唯一标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 病历记录名称
     */
    @Column(name = "EMR_NAME")
    private String emrName;

    /**
     * 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 医生代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    /**
     * 医生姓名（医师在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    /**
     * 就诊日期时间（患者门(急)诊就诊的公元纪年日期时间的完整描述）
     */
    @Column(name = "OCCURRED_TIME")
    private String occurredTime;

    /**
     * 专科情况（根据专科需要对患者进行专科特殊检查结果的详细描述）
     */
    @Column(name = "SPEC_SITUATION")
    private String specSituation;

    /**
     * 实验及辅助检查结果（患者辅助检查结果的详细描述）
     */
    @Column(name = "ASSIST_EXAM_RESULT")
    private String assistExamResult;

    /**
     * 初步诊断代码ICD-10（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的编码）
     */
    @Column(name = "FIRST_DIAGNOSIS_CODE")
    private String firstDiagnosisCode;

    /**
     * 初步诊断中文名称（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的中文名称）
     */
    @Column(name = "FIRST_DIAGNOSIS_CN")
    private String firstDiagnosisCn;

    /**
     * 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    @Column(name = "INFECTIOUS_MARK")
    private Long infectiousMark;

    /**
     * 门诊病历模板类型
     */
    @Column(name = "EMR_CLASS")
    private String emrClass;

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
     * 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    @Column(name = "INFECTION_HISTORY")
    private String infectionHistory;

    /**
     * 预防接种史（与患者预防接种情况的详细描述）
     */
    @Column(name = "VACCINATE_HISTORY")
    private String vaccinateHistory;

    /**
     * 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    @Column(name = "OPERATION_HISTORY")
    private String operationHistory;

    /**
     * 输血史（对患者既往输血史的详细描述）
     */
    @Column(name = "BLOOD_HISTORY")
    private String bloodHistory;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 现病史（对患者当前所患疾病情况的详细描述）
     */
    @Column(name = "CURRENT_DISEASE")
    private String currentDisease;

    /**
     * 既往史（既往健康状况及重要相关病史的描述）
     */
    @Column(name = "DISEASE_HISTORY")
    private String diseaseHistory;

    /**
     * 个人史（患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述）
     */
    @Column(name = "PERSONAL_HISTORY")
    private String personalHistory;

    /**
     * 婚育史（对患者婚育史的详细描述）
     */
    @Column(name = "MARRIAGE_HISTORY")
    private String marriageHistory;

    /**
     * 月经史（对患者月经史的详细描述）
     */
    @Column(name = "MENSES_HISTORY")
    private String mensesHistory;

    /**
     * 家族史（患者 3 代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    @Column(name = "FAMILY_HISTORY")
    private String familyHistory;

    /**
     * 原始层QID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 门诊病历模板类型中文名称
     */
    @Column(name = "EMR_CLASS_NAME")
    private String emrClassName;

    /**
     * 病历模板类别代码（例如：11）
     */
    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    /**
     * 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    /**
     * 门诊病历记录表编号[主键]
     */
    @Column(name = "EMR_ID")
    private String emrId;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private String emrContent;

    /**
     * 病历解析后内容(包含颜色标签)
     */
    @Column(name = "EMR_CONTENT_PARSE_COLR")
    private String emrContentParseColr;

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
     * 获取唯一标识
     *
     * @return EOUID - 唯一标识
     */
    public String getEouid() {
        return eouid;
    }

    /**
     * 设置唯一标识
     *
     * @param eouid 唯一标识
     */
    public void setEouid(String eouid) {
        this.eouid = eouid == null ? null : eouid.trim();
    }

    /**
     * 获取科室唯一标识
     *
     * @return DUID - 科室唯一标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置科室唯一标识
     *
     * @param duid 科室唯一标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
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
     * 获取病历记录名称
     *
     * @return EMR_NAME - 病历记录名称
     */
    public String getEmrName() {
        return emrName;
    }

    /**
     * 设置病历记录名称
     *
     * @param emrName 病历记录名称
     */
    public void setEmrName(String emrName) {
        this.emrName = emrName == null ? null : emrName.trim();
    }

    /**
     * 获取医院科室本地代码 （医务人员所在的科室本地代码 ）
     *
     * @return DEPT_CODE - 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置医院科室本地代码 （医务人员所在的科室本地代码 ）
     *
     * @param deptCode 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取医院科室本地名称 （医务人员所在的科室本地名称 ）
     *
     * @return DEPT_NAME - 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置医院科室本地名称 （医务人员所在的科室本地名称 ）
     *
     * @param deptName 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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
     * 获取专科情况（根据专科需要对患者进行专科特殊检查结果的详细描述）
     *
     * @return SPEC_SITUATION - 专科情况（根据专科需要对患者进行专科特殊检查结果的详细描述）
     */
    public String getSpecSituation() {
        return specSituation;
    }

    /**
     * 设置专科情况（根据专科需要对患者进行专科特殊检查结果的详细描述）
     *
     * @param specSituation 专科情况（根据专科需要对患者进行专科特殊检查结果的详细描述）
     */
    public void setSpecSituation(String specSituation) {
        this.specSituation = specSituation == null ? null : specSituation.trim();
    }

    /**
     * 获取实验及辅助检查结果（患者辅助检查结果的详细描述）
     *
     * @return ASSIST_EXAM_RESULT - 实验及辅助检查结果（患者辅助检查结果的详细描述）
     */
    public String getAssistExamResult() {
        return assistExamResult;
    }

    /**
     * 设置实验及辅助检查结果（患者辅助检查结果的详细描述）
     *
     * @param assistExamResult 实验及辅助检查结果（患者辅助检查结果的详细描述）
     */
    public void setAssistExamResult(String assistExamResult) {
        this.assistExamResult = assistExamResult == null ? null : assistExamResult.trim();
    }

    /**
     * 获取初步诊断代码ICD-10（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的编码）
     *
     * @return FIRST_DIAGNOSIS_CODE - 初步诊断代码ICD-10（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的编码）
     */
    public String getFirstDiagnosisCode() {
        return firstDiagnosisCode;
    }

    /**
     * 设置初步诊断代码ICD-10（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的编码）
     *
     * @param firstDiagnosisCode 初步诊断代码ICD-10（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的编码）
     */
    public void setFirstDiagnosisCode(String firstDiagnosisCode) {
        this.firstDiagnosisCode = firstDiagnosisCode == null ? null : firstDiagnosisCode.trim();
    }

    /**
     * 获取初步诊断中文名称（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的中文名称）
     *
     * @return FIRST_DIAGNOSIS_CN - 初步诊断中文名称（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的中文名称）
     */
    public String getFirstDiagnosisCn() {
        return firstDiagnosisCn;
    }

    /**
     * 设置初步诊断中文名称（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的中文名称）
     *
     * @param firstDiagnosisCn 初步诊断中文名称（患者入院后初步做出的疾病诊断在西医诊断特定编码体系中的中文名称）
     */
    public void setFirstDiagnosisCn(String firstDiagnosisCn) {
        this.firstDiagnosisCn = firstDiagnosisCn == null ? null : firstDiagnosisCn.trim();
    }

    /**
     * 获取患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     *
     * @return INFECTIOUS_MARK - 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    public Long getInfectiousMark() {
        return infectiousMark;
    }

    /**
     * 设置患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     *
     * @param infectiousMark 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    public void setInfectiousMark(Long infectiousMark) {
        this.infectiousMark = infectiousMark;
    }

    /**
     * 获取门诊病历模板类型
     *
     * @return EMR_CLASS - 门诊病历模板类型
     */
    public String getEmrClass() {
        return emrClass;
    }

    /**
     * 设置门诊病历模板类型
     *
     * @param emrClass 门诊病历模板类型
     */
    public void setEmrClass(String emrClass) {
        this.emrClass = emrClass == null ? null : emrClass.trim();
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
     * 获取传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     *
     * @return INFECTION_HISTORY - 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    public String getInfectionHistory() {
        return infectionHistory;
    }

    /**
     * 设置传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     *
     * @param infectionHistory 传染病史（患者既往所患各种急性或慢性传染性疾病名称的详细描述）
     */
    public void setInfectionHistory(String infectionHistory) {
        this.infectionHistory = infectionHistory == null ? null : infectionHistory.trim();
    }

    /**
     * 获取预防接种史（与患者预防接种情况的详细描述）
     *
     * @return VACCINATE_HISTORY - 预防接种史（与患者预防接种情况的详细描述）
     */
    public String getVaccinateHistory() {
        return vaccinateHistory;
    }

    /**
     * 设置预防接种史（与患者预防接种情况的详细描述）
     *
     * @param vaccinateHistory 预防接种史（与患者预防接种情况的详细描述）
     */
    public void setVaccinateHistory(String vaccinateHistory) {
        this.vaccinateHistory = vaccinateHistory == null ? null : vaccinateHistory.trim();
    }

    /**
     * 获取手术史（对患者既往接受手术/操作经历的详细描述）
     *
     * @return OPERATION_HISTORY - 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    public String getOperationHistory() {
        return operationHistory;
    }

    /**
     * 设置手术史（对患者既往接受手术/操作经历的详细描述）
     *
     * @param operationHistory 手术史（对患者既往接受手术/操作经历的详细描述）
     */
    public void setOperationHistory(String operationHistory) {
        this.operationHistory = operationHistory == null ? null : operationHistory.trim();
    }

    /**
     * 获取输血史（对患者既往输血史的详细描述）
     *
     * @return BLOOD_HISTORY - 输血史（对患者既往输血史的详细描述）
     */
    public String getBloodHistory() {
        return bloodHistory;
    }

    /**
     * 设置输血史（对患者既往输血史的详细描述）
     *
     * @param bloodHistory 输血史（对患者既往输血史的详细描述）
     */
    public void setBloodHistory(String bloodHistory) {
        this.bloodHistory = bloodHistory == null ? null : bloodHistory.trim();
    }

    /**
     * 获取过敏史（患者既往发生过敏情况的详细描述）
     *
     * @return ALLERGY_HISTORY - 过敏史（患者既往发生过敏情况的详细描述）
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * 设置过敏史（患者既往发生过敏情况的详细描述）
     *
     * @param allergyHistory 过敏史（患者既往发生过敏情况的详细描述）
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    /**
     * 获取主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     *
     * @return CHIEF_COMPLAINTS - 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     *
     * @param chiefComplaints 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * 获取现病史（对患者当前所患疾病情况的详细描述）
     *
     * @return CURRENT_DISEASE - 现病史（对患者当前所患疾病情况的详细描述）
     */
    public String getCurrentDisease() {
        return currentDisease;
    }

    /**
     * 设置现病史（对患者当前所患疾病情况的详细描述）
     *
     * @param currentDisease 现病史（对患者当前所患疾病情况的详细描述）
     */
    public void setCurrentDisease(String currentDisease) {
        this.currentDisease = currentDisease == null ? null : currentDisease.trim();
    }

    /**
     * 获取既往史（既往健康状况及重要相关病史的描述）
     *
     * @return DISEASE_HISTORY - 既往史（既往健康状况及重要相关病史的描述）
     */
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    /**
     * 设置既往史（既往健康状况及重要相关病史的描述）
     *
     * @param diseaseHistory 既往史（既往健康状况及重要相关病史的描述）
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    /**
     * 获取个人史（患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述）
     *
     * @return PERSONAL_HISTORY - 个人史（患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述）
     */
    public String getPersonalHistory() {
        return personalHistory;
    }

    /**
     * 设置个人史（患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述）
     *
     * @param personalHistory 个人史（患者个人生活习惯及有无烟、酒、药物等嗜好，职业与工作条件及有无工业毒物、粉尘、放射性物质接触史，有无冶游史的描述）
     */
    public void setPersonalHistory(String personalHistory) {
        this.personalHistory = personalHistory == null ? null : personalHistory.trim();
    }

    /**
     * 获取婚育史（对患者婚育史的详细描述）
     *
     * @return MARRIAGE_HISTORY - 婚育史（对患者婚育史的详细描述）
     */
    public String getMarriageHistory() {
        return marriageHistory;
    }

    /**
     * 设置婚育史（对患者婚育史的详细描述）
     *
     * @param marriageHistory 婚育史（对患者婚育史的详细描述）
     */
    public void setMarriageHistory(String marriageHistory) {
        this.marriageHistory = marriageHistory == null ? null : marriageHistory.trim();
    }

    /**
     * 获取月经史（对患者月经史的详细描述）
     *
     * @return MENSES_HISTORY - 月经史（对患者月经史的详细描述）
     */
    public String getMensesHistory() {
        return mensesHistory;
    }

    /**
     * 设置月经史（对患者月经史的详细描述）
     *
     * @param mensesHistory 月经史（对患者月经史的详细描述）
     */
    public void setMensesHistory(String mensesHistory) {
        this.mensesHistory = mensesHistory == null ? null : mensesHistory.trim();
    }

    /**
     * 获取家族史（患者 3 代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     *
     * @return FAMILY_HISTORY - 家族史（患者 3 代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * 设置家族史（患者 3 代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     *
     * @param familyHistory 家族史（患者 3 代以内有血缘关系的家族成员中所患遗传疾病史的描述）
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory == null ? null : familyHistory.trim();
    }

    /**
     * 获取原始层QID
     *
     * @return QID - 原始层QID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层QID
     *
     * @param qid 原始层QID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取门诊病历模板类型中文名称
     *
     * @return EMR_CLASS_NAME - 门诊病历模板类型中文名称
     */
    public String getEmrClassName() {
        return emrClassName;
    }

    /**
     * 设置门诊病历模板类型中文名称
     *
     * @param emrClassName 门诊病历模板类型中文名称
     */
    public void setEmrClassName(String emrClassName) {
        this.emrClassName = emrClassName == null ? null : emrClassName.trim();
    }

    /**
     * 获取病历模板类别代码（例如：11）
     *
     * @return TEMPLATE_TYPE - 病历模板类别代码（例如：11）
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置病历模板类别代码（例如：11）
     *
     * @param templateType 病历模板类别代码（例如：11）
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * 获取病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @return TEMPLATE_TYPE_CN - 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * 设置病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @param templateTypeCn 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * 获取门诊病历记录表编号[主键]
     *
     * @return EMR_ID - 门诊病历记录表编号[主键]
     */
    public String getEmrId() {
        return emrId;
    }

    /**
     * 设置门诊病历记录表编号[主键]
     *
     * @param emrId 门诊病历记录表编号[主键]
     */
    public void setEmrId(String emrId) {
        this.emrId = emrId == null ? null : emrId.trim();
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
     * 获取病历原文（医院病历的原始内容）
     *
     * @return EMR_CONTENT - 病历原文（医院病历的原始内容）
     */
    public String getEmrContent() {
        return emrContent;
    }

    /**
     * 设置病历原文（医院病历的原始内容）
     *
     * @param emrContent 病历原文（医院病历的原始内容）
     */
    public void setEmrContent(String emrContent) {
        this.emrContent = emrContent == null ? null : emrContent.trim();
    }

    /**
     * 获取病历解析后内容(包含颜色标签)
     *
     * @return EMR_CONTENT_PARSE_COLR - 病历解析后内容(包含颜色标签)
     */
    public String getEmrContentParseColr() {
        return emrContentParseColr;
    }

    /**
     * 设置病历解析后内容(包含颜色标签)
     *
     * @param emrContentParseColr 病历解析后内容(包含颜色标签)
     */
    public void setEmrContentParseColr(String emrContentParseColr) {
        this.emrContentParseColr = emrContentParseColr == null ? null : emrContentParseColr.trim();
    }
}