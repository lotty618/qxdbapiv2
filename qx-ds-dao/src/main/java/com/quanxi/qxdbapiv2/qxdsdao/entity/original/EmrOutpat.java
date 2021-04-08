package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_OUTPAT")
public class EmrOutpat {
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
     * 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 门诊病历记录表编号[主键]
     */
    @Id
    @Column(name = "EMR_ID")
    private String emrId;

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
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private String emrContent;

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
    private String infectiousMark;

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
     * 门诊病历模板类型代码(例如:初诊、复诊)
     */
    @Column(name = "EMR_CLASS")
    private String emrClass;

    /**
     * 门诊病历模板类型中文名称
     */
    @Column(name = "EMR_CLASS_NAME")
    private String emrClassName;

    /**
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

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
     * 病历标题名称（例如：XX主任医师查房记录）
     */
    @Column(name = "EMR_TITLE")
    private String emrTitle;

    /**
     * 病历使用医院模板编号
     */
    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

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
     * 获取门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
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
    public String getInfectiousMark() {
        return infectiousMark;
    }

    /**
     * 设置患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     *
     * @param infectiousMark 患者传染性标志0否 1是（标识患者是否具有传染性的标志）
     */
    public void setInfectiousMark(String infectiousMark) {
        this.infectiousMark = infectiousMark == null ? null : infectiousMark.trim();
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
     * 获取门诊病历模板类型代码(例如:初诊、复诊)
     *
     * @return EMR_CLASS - 门诊病历模板类型代码(例如:初诊、复诊)
     */
    public String getEmrClass() {
        return emrClass;
    }

    /**
     * 设置门诊病历模板类型代码(例如:初诊、复诊)
     *
     * @param emrClass 门诊病历模板类型代码(例如:初诊、复诊)
     */
    public void setEmrClass(String emrClass) {
        this.emrClass = emrClass == null ? null : emrClass.trim();
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
     * 获取病历标题名称（例如：XX主任医师查房记录）
     *
     * @return EMR_TITLE - 病历标题名称（例如：XX主任医师查房记录）
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * 设置病历标题名称（例如：XX主任医师查房记录）
     *
     * @param emrTitle 病历标题名称（例如：XX主任医师查房记录）
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * 获取病历使用医院模板编号
     *
     * @return EMR_TEMPLATE_CODE - 病历使用医院模板编号
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * 设置病历使用医院模板编号
     *
     * @param emrTemplateCode 病历使用医院模板编号
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
    }
}