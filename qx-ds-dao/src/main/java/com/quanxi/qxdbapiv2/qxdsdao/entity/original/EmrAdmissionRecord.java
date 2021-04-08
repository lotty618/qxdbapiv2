package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_ADMISSION_RECORD")
public class EmrAdmissionRecord {
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
     * 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    @Column(name = "REPRESENTOR_RELATION_CODE")
    private String representorRelationCode;

    /**
     * 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    @Column(name = "REPRESENTOR_RELATION_CN")
    private String representorRelationCn;

    /**
     * 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "REPRESENTOR_NAME")
    private String representorName;

    /**
     * 陈述时间（病历陈述时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "REPRESENT_DATE")
    private String representDate;

    /**
     * 记录者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHOR_ID")
    private String authorId;

    /**
     * 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    /**
     * 记录时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "AUTHOR_DATE")
    private String authorDate;

    /**
     * 审核者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHENTICATOR_ID")
    private String authenticatorId;

    /**
     * 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHENTICATOR_NAME")
    private String authenticatorName;

    /**
     * 审核时间（审核当日的公元纪年日期）
     */
    @Column(name = "AUTHENTICATOR_DATE")
    private String authenticatorDate;

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
     * 入院记录类型代码DIR_IN_RECORD_TYPE（入院记录类型在特定编码体系中的代码）
     */
    @Column(name = "INRECORD_TYPE_CODE")
    private String inrecordTypeCode;

    /**
     * 入院记录类型中文名称（入院记录类型在特定编码体系中的中文名称）
     */
    @Column(name = "INRECORD_TYPE_CN")
    private String inrecordTypeCn;

    /**
     * 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DEATH_DATE")
    private String deathDate;

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
     * 入院情况描述（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

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
     * 死亡诊断代码ICD-10（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的代码）
     */
    @Column(name = "DEATH_DIAGNOSIS_CODE")
    private String deathDiagnosisCode;

    /**
     * 死亡诊断中文名称（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的中文名称）
     */
    @Column(name = "DEATH_DIAGNOSIS_CN")
    private String deathDiagnosisCn;

    /**
     * 死亡原因描述（患者死亡直接原因的详细描述）
     */
    @Column(name = "DEATH_CAUSE")
    private String deathCause;

    /**
     * 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    @Column(name = "RELIABLE_STATEMENT_MARK")
    private String reliableStatementMark;

    /**
     * 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    @Column(name = "GENERAL_HEALTH_MARK")
    private String generalHealthMark;

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
     * 接诊医师签名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ACCEPT_PHYSICIAN")
    private String acceptPhysician;

    /**
     * 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 护理科室代码（患者在医疗机构进行护理的科室在特定编码体系中代码）
     */
    @Column(name = "NURSING_DEPT_CODE")
    private String nursingDeptCode;

    /**
     * 护理科室名称（患者在医疗机构进行护理的科室在特定编码体系中名称）
     */
    @Column(name = "NURSING_DEPT_NAME")
    private String nursingDeptName;

    /**
     * 主管护士：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "NURSE_ID")
    private String nurseId;

    /**
     * 主管护士：姓名（医疗人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NURSE_NAME")
    private String nurseName;

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
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

    /**
     * 病历原文（医院病历的原始内容）CLOB类型
     */
    @Column(name = "EMR_CONTENT_CLOB")
    private String emrContentClob;

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
     * 获取病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     *
     * @return REPRESENTOR_RELATION_CODE - 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    public String getRepresentorRelationCode() {
        return representorRelationCode;
    }

    /**
     * 设置病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     *
     * @param representorRelationCode 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    public void setRepresentorRelationCode(String representorRelationCode) {
        this.representorRelationCode = representorRelationCode == null ? null : representorRelationCode.trim();
    }

    /**
     * 获取病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     *
     * @return REPRESENTOR_RELATION_CN - 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    public String getRepresentorRelationCn() {
        return representorRelationCn;
    }

    /**
     * 设置病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     *
     * @param representorRelationCn 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    public void setRepresentorRelationCn(String representorRelationCn) {
        this.representorRelationCn = representorRelationCn == null ? null : representorRelationCn.trim();
    }

    /**
     * 获取病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return REPRESENTOR_NAME - 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getRepresentorName() {
        return representorName;
    }

    /**
     * 设置病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param representorName 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setRepresentorName(String representorName) {
        this.representorName = representorName == null ? null : representorName.trim();
    }

    /**
     * 获取陈述时间（病历陈述时的公元纪年日期和时间的完整描述）
     *
     * @return REPRESENT_DATE - 陈述时间（病历陈述时的公元纪年日期和时间的完整描述）
     */
    public String getRepresentDate() {
        return representDate;
    }

    /**
     * 设置陈述时间（病历陈述时的公元纪年日期和时间的完整描述）
     *
     * @param representDate 陈述时间（病历陈述时的公元纪年日期和时间的完整描述）
     */
    public void setRepresentDate(String representDate) {
        this.representDate = representDate == null ? null : representDate.trim();
    }

    /**
     * 获取记录者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHOR_ID - 记录者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 设置记录者：编号（医疗服务人员的唯一编号）
     *
     * @param authorId 记录者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    /**
     * 获取记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHOR_NAME - 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param authorName 记录者：姓名（记录者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * 获取记录时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @return AUTHOR_DATE - 记录时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public String getAuthorDate() {
        return authorDate;
    }

    /**
     * 设置记录时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @param authorDate 记录时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public void setAuthorDate(String authorDate) {
        this.authorDate = authorDate == null ? null : authorDate.trim();
    }

    /**
     * 获取审核者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHENTICATOR_ID - 审核者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthenticatorId() {
        return authenticatorId;
    }

    /**
     * 设置审核者：编号（医疗服务人员的唯一编号）
     *
     * @param authenticatorId 审核者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthenticatorId(String authenticatorId) {
        this.authenticatorId = authenticatorId == null ? null : authenticatorId.trim();
    }

    /**
     * 获取审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHENTICATOR_NAME - 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthenticatorName() {
        return authenticatorName;
    }

    /**
     * 设置审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param authenticatorName 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName == null ? null : authenticatorName.trim();
    }

    /**
     * 获取审核时间（审核当日的公元纪年日期）
     *
     * @return AUTHENTICATOR_DATE - 审核时间（审核当日的公元纪年日期）
     */
    public String getAuthenticatorDate() {
        return authenticatorDate;
    }

    /**
     * 设置审核时间（审核当日的公元纪年日期）
     *
     * @param authenticatorDate 审核时间（审核当日的公元纪年日期）
     */
    public void setAuthenticatorDate(String authenticatorDate) {
        this.authenticatorDate = authenticatorDate == null ? null : authenticatorDate.trim();
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
     * 获取入院记录类型代码DIR_IN_RECORD_TYPE（入院记录类型在特定编码体系中的代码）
     *
     * @return INRECORD_TYPE_CODE - 入院记录类型代码DIR_IN_RECORD_TYPE（入院记录类型在特定编码体系中的代码）
     */
    public String getInrecordTypeCode() {
        return inrecordTypeCode;
    }

    /**
     * 设置入院记录类型代码DIR_IN_RECORD_TYPE（入院记录类型在特定编码体系中的代码）
     *
     * @param inrecordTypeCode 入院记录类型代码DIR_IN_RECORD_TYPE（入院记录类型在特定编码体系中的代码）
     */
    public void setInrecordTypeCode(String inrecordTypeCode) {
        this.inrecordTypeCode = inrecordTypeCode == null ? null : inrecordTypeCode.trim();
    }

    /**
     * 获取入院记录类型中文名称（入院记录类型在特定编码体系中的中文名称）
     *
     * @return INRECORD_TYPE_CN - 入院记录类型中文名称（入院记录类型在特定编码体系中的中文名称）
     */
    public String getInrecordTypeCn() {
        return inrecordTypeCn;
    }

    /**
     * 设置入院记录类型中文名称（入院记录类型在特定编码体系中的中文名称）
     *
     * @param inrecordTypeCn 入院记录类型中文名称（入院记录类型在特定编码体系中的中文名称）
     */
    public void setInrecordTypeCn(String inrecordTypeCn) {
        this.inrecordTypeCn = inrecordTypeCn == null ? null : inrecordTypeCn.trim();
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
     * 获取死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @return DEATH_DATE - 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * 设置死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @param deathDate 死亡时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate == null ? null : deathDate.trim();
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
     * 获取入院情况描述（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESC - 入院情况描述（对患者入院情况的详细描述）
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * 设置入院情况描述（对患者入院情况的详细描述）
     *
     * @param inConditionDesc 入院情况描述（对患者入院情况的详细描述）
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
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
     * 获取死亡诊断代码ICD-10（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的代码）
     *
     * @return DEATH_DIAGNOSIS_CODE - 死亡诊断代码ICD-10（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的代码）
     */
    public String getDeathDiagnosisCode() {
        return deathDiagnosisCode;
    }

    /**
     * 设置死亡诊断代码ICD-10（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的代码）
     *
     * @param deathDiagnosisCode 死亡诊断代码ICD-10（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的代码）
     */
    public void setDeathDiagnosisCode(String deathDiagnosisCode) {
        this.deathDiagnosisCode = deathDiagnosisCode == null ? null : deathDiagnosisCode.trim();
    }

    /**
     * 获取死亡诊断中文名称（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的中文名称）
     *
     * @return DEATH_DIAGNOSIS_CN - 死亡诊断中文名称（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的中文名称）
     */
    public String getDeathDiagnosisCn() {
        return deathDiagnosisCn;
    }

    /**
     * 设置死亡诊断中文名称（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的中文名称）
     *
     * @param deathDiagnosisCn 死亡诊断中文名称（对死亡进行最高效力诊断的机构的级别类别在特定编码体系中的中文名称）
     */
    public void setDeathDiagnosisCn(String deathDiagnosisCn) {
        this.deathDiagnosisCn = deathDiagnosisCn == null ? null : deathDiagnosisCn.trim();
    }

    /**
     * 获取死亡原因描述（患者死亡直接原因的详细描述）
     *
     * @return DEATH_CAUSE - 死亡原因描述（患者死亡直接原因的详细描述）
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * 设置死亡原因描述（患者死亡直接原因的详细描述）
     *
     * @param deathCause 死亡原因描述（患者死亡直接原因的详细描述）
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * 获取陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     *
     * @return RELIABLE_STATEMENT_MARK - 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    public String getReliableStatementMark() {
        return reliableStatementMark;
    }

    /**
     * 设置陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     *
     * @param reliableStatementMark 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    public void setReliableStatementMark(String reliableStatementMark) {
        this.reliableStatementMark = reliableStatementMark == null ? null : reliableStatementMark.trim();
    }

    /**
     * 获取一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     *
     * @return GENERAL_HEALTH_MARK - 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    public String getGeneralHealthMark() {
        return generalHealthMark;
    }

    /**
     * 设置一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     *
     * @param generalHealthMark 一般健康状况标志0否 1是（标识患者既往是否健康的标志）
     */
    public void setGeneralHealthMark(String generalHealthMark) {
        this.generalHealthMark = generalHealthMark == null ? null : generalHealthMark.trim();
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
     * 获取接诊医师签名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ACCEPT_PHYSICIAN - 接诊医师签名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAcceptPhysician() {
        return acceptPhysician;
    }

    /**
     * 设置接诊医师签名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param acceptPhysician 接诊医师签名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAcceptPhysician(String acceptPhysician) {
        this.acceptPhysician = acceptPhysician == null ? null : acceptPhysician.trim();
    }

    /**
     * 获取住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param residentDoctorName 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取护理科室代码（患者在医疗机构进行护理的科室在特定编码体系中代码）
     *
     * @return NURSING_DEPT_CODE - 护理科室代码（患者在医疗机构进行护理的科室在特定编码体系中代码）
     */
    public String getNursingDeptCode() {
        return nursingDeptCode;
    }

    /**
     * 设置护理科室代码（患者在医疗机构进行护理的科室在特定编码体系中代码）
     *
     * @param nursingDeptCode 护理科室代码（患者在医疗机构进行护理的科室在特定编码体系中代码）
     */
    public void setNursingDeptCode(String nursingDeptCode) {
        this.nursingDeptCode = nursingDeptCode == null ? null : nursingDeptCode.trim();
    }

    /**
     * 获取护理科室名称（患者在医疗机构进行护理的科室在特定编码体系中名称）
     *
     * @return NURSING_DEPT_NAME - 护理科室名称（患者在医疗机构进行护理的科室在特定编码体系中名称）
     */
    public String getNursingDeptName() {
        return nursingDeptName;
    }

    /**
     * 设置护理科室名称（患者在医疗机构进行护理的科室在特定编码体系中名称）
     *
     * @param nursingDeptName 护理科室名称（患者在医疗机构进行护理的科室在特定编码体系中名称）
     */
    public void setNursingDeptName(String nursingDeptName) {
        this.nursingDeptName = nursingDeptName == null ? null : nursingDeptName.trim();
    }

    /**
     * 获取主管护士：编号（医疗服务人员的唯一编号）
     *
     * @return NURSE_ID - 主管护士：编号（医疗服务人员的唯一编号）
     */
    public String getNurseId() {
        return nurseId;
    }

    /**
     * 设置主管护士：编号（医疗服务人员的唯一编号）
     *
     * @param nurseId 主管护士：编号（医疗服务人员的唯一编号）
     */
    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
    }

    /**
     * 获取主管护士：姓名（医疗人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NURSE_NAME - 主管护士：姓名（医疗人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getNurseName() {
        return nurseName;
    }

    /**
     * 设置主管护士：姓名（医疗人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param nurseName 主管护士：姓名（医疗人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName == null ? null : nurseName.trim();
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

    /**
     * 获取病历原文（医院病历的原始内容）CLOB类型
     *
     * @return EMR_CONTENT_CLOB - 病历原文（医院病历的原始内容）CLOB类型
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * 设置病历原文（医院病历的原始内容）CLOB类型
     *
     * @param emrContentClob 病历原文（医院病历的原始内容）CLOB类型
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}