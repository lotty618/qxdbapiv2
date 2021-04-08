package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_FIRST_COURSE_RECORD")
public class EmrFirstCourseRecord {
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
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "FIRST_COURSE_ID")
    private String firstCourseId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    /**
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_RECORD_DATE")
    private String operationRecordDate;

    /**
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    @Column(name = "CASE_CHARACTE")
    private String caseCharacte;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 诊断依据（疾病诊断的依据描述）
     */
    @Column(name = "DIAGNOSIS_BASIS")
    private String diagnosisBasis;

    /**
     * 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    @Column(name = "DIAG_TREAT_PLAN")
    private String diagTreatPlan;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PREINCIPLES")
    private String therapeuticPreinciples;

    /**
     * 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SUPERIOR_PHYSICIAN_NAME")
    private String superiorPhysicianName;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

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
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return FIRST_COURSE_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getFirstCourseId() {
        return firstCourseId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param firstCourseId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setFirstCourseId(String firstCourseId) {
        this.firstCourseId = firstCourseId == null ? null : firstCourseId.trim();
    }

    /**
     * 获取病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @return CASE_NO - 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @param caseNo 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @return IN_HOSPITAL_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @param inHospitalTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * 获取记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_RECORD_DATE - 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public String getOperationRecordDate() {
        return operationRecordDate;
    }

    /**
     * 设置记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @param operationRecordDate 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public void setOperationRecordDate(String operationRecordDate) {
        this.operationRecordDate = operationRecordDate == null ? null : operationRecordDate.trim();
    }

    /**
     * 获取主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @return CHIEF_COMPLAINTS - 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @param chiefComplaints 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * 获取病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     *
     * @return CASE_CHARACTE - 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    public String getCaseCharacte() {
        return caseCharacte;
    }

    /**
     * 设置病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     *
     * @param caseCharacte 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    public void setCaseCharacte(String caseCharacte) {
        this.caseCharacte = caseCharacte == null ? null : caseCharacte.trim();
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
     * 获取诊断依据（疾病诊断的依据描述）
     *
     * @return DIAGNOSIS_BASIS - 诊断依据（疾病诊断的依据描述）
     */
    public String getDiagnosisBasis() {
        return diagnosisBasis;
    }

    /**
     * 设置诊断依据（疾病诊断的依据描述）
     *
     * @param diagnosisBasis 诊断依据（疾病诊断的依据描述）
     */
    public void setDiagnosisBasis(String diagnosisBasis) {
        this.diagnosisBasis = diagnosisBasis == null ? null : diagnosisBasis.trim();
    }

    /**
     * 获取诊疗计划（具体的检查、中西医治疗措施及中医调护）
     *
     * @return DIAG_TREAT_PLAN - 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    public String getDiagTreatPlan() {
        return diagTreatPlan;
    }

    /**
     * 设置诊疗计划（具体的检查、中西医治疗措施及中医调护）
     *
     * @param diagTreatPlan 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    public void setDiagTreatPlan(String diagTreatPlan) {
        this.diagTreatPlan = diagTreatPlan == null ? null : diagTreatPlan.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PREINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPreinciples() {
        return therapeuticPreinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPreinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPreinciples(String therapeuticPreinciples) {
        this.therapeuticPreinciples = therapeuticPreinciples == null ? null : therapeuticPreinciples.trim();
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
     * 获取上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SUPERIOR_PHYSICIAN_NAME - 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSuperiorPhysicianName() {
        return superiorPhysicianName;
    }

    /**
     * 设置上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param superiorPhysicianName 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSuperiorPhysicianName(String superiorPhysicianName) {
        this.superiorPhysicianName = superiorPhysicianName == null ? null : superiorPhysicianName.trim();
    }

    /**
     * 获取备注（需要添加的注释说明的具体内容）
     *
     * @return NOTES - 备注（需要添加的注释说明的具体内容）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注（需要添加的注释说明的具体内容）
     *
     * @param notes 备注（需要添加的注释说明的具体内容）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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