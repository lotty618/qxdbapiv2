package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_CONSULT")
public class InpatientConsult {
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
     * 会诊单号[主键]
     */
    @Id
    @Column(name = "CONSULT_RECORD_NO")
    private String consultRecordNo;

    /**
     * 会诊日期（个体在医疗卫生机构接受会诊时的公元纪年日期）
     */
    @Column(name = "CONSULT_DATE")
    private String consultDate;

    /**
     * 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    @Column(name = "CONSULT_ADVICE")
    private String consultAdvice;

    /**
     * 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CONSULT_DOCTOR_NAME")
    private String consultDoctorName;

    /**
     * 责任医师姓名（责任医师在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESP_DOCTOR_NAME")
    private String respDoctorName;

    /**
     * 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称（患者在医疗机构就诊的科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 病区名称（患者当前所在病区的名称）
     */
    @Column(name = "WARD_NAME")
    private String wardName;

    /**
     * 病房号（患者住院期间，所住病房对应的编号）
     */
    @Column(name = "DEPT_ROOM")
    private String deptRoom;

    /**
     * 病床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 病历摘要（对患者病情摘要的描述）
     */
    @Column(name = "MEDICAL_RECORD_DIGEST")
    private String medicalRecordDigest;

    /**
     * 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    @Column(name = "ASSIST_EXAM_RESULT")
    private String assistExamResult;

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
     * 病历摘要（对患者病情摘要的描述）
     */
    @Column(name = "CASE_HISTORY_SUMMARY")
    private String caseHistorySummary;

    /**
     * 诊疗过程名称（诊疗过程的名称描述）
     */
    @Column(name = "TREATDIAG_PROCESS_NAME")
    private String treatdiagProcessName;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

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
     * 类型（会诊类型1院内会诊2院外会诊）
     */
    @Column(name = "TYPE")
    private String type;

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
     * 获取会诊单号[主键]
     *
     * @return CONSULT_RECORD_NO - 会诊单号[主键]
     */
    public String getConsultRecordNo() {
        return consultRecordNo;
    }

    /**
     * 设置会诊单号[主键]
     *
     * @param consultRecordNo 会诊单号[主键]
     */
    public void setConsultRecordNo(String consultRecordNo) {
        this.consultRecordNo = consultRecordNo == null ? null : consultRecordNo.trim();
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
     * 获取会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     *
     * @return CONSULT_ADVICE - 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    public String getConsultAdvice() {
        return consultAdvice;
    }

    /**
     * 设置会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     *
     * @param consultAdvice 会诊意见（由会诊医生填写患者会诊时的主要处置、指导意见详细描述）
     */
    public void setConsultAdvice(String consultAdvice) {
        this.consultAdvice = consultAdvice == null ? null : consultAdvice.trim();
    }

    /**
     * 获取会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CONSULT_DOCTOR_NAME - 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getConsultDoctorName() {
        return consultDoctorName;
    }

    /**
     * 设置会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param consultDoctorName 会诊医师姓名（会诊医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setConsultDoctorName(String consultDoctorName) {
        this.consultDoctorName = consultDoctorName == null ? null : consultDoctorName.trim();
    }

    /**
     * 获取责任医师姓名（责任医师在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return RESP_DOCTOR_NAME - 责任医师姓名（责任医师在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getRespDoctorName() {
        return respDoctorName;
    }

    /**
     * 设置责任医师姓名（责任医师在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param respDoctorName 责任医师姓名（责任医师在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setRespDoctorName(String respDoctorName) {
        this.respDoctorName = respDoctorName == null ? null : respDoctorName.trim();
    }

    /**
     * 获取科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @return DEPT_CODE - 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @param deptCode 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称（患者在医疗机构就诊的科室名称）
     *
     * @return DEPT_NAME - 科室名称（患者在医疗机构就诊的科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（患者在医疗机构就诊的科室名称）
     *
     * @param deptName 科室名称（患者在医疗机构就诊的科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取病区名称（患者当前所在病区的名称）
     *
     * @return WARD_NAME - 病区名称（患者当前所在病区的名称）
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病区名称（患者当前所在病区的名称）
     *
     * @param wardName 病区名称（患者当前所在病区的名称）
     */
    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    /**
     * 获取病房号（患者住院期间，所住病房对应的编号）
     *
     * @return DEPT_ROOM - 病房号（患者住院期间，所住病房对应的编号）
     */
    public String getDeptRoom() {
        return deptRoom;
    }

    /**
     * 设置病房号（患者住院期间，所住病房对应的编号）
     *
     * @param deptRoom 病房号（患者住院期间，所住病房对应的编号）
     */
    public void setDeptRoom(String deptRoom) {
        this.deptRoom = deptRoom == null ? null : deptRoom.trim();
    }

    /**
     * 获取病床号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 病床号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置病床号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 病床号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取病历摘要（对患者病情摘要的描述）
     *
     * @return MEDICAL_RECORD_DIGEST - 病历摘要（对患者病情摘要的描述）
     */
    public String getMedicalRecordDigest() {
        return medicalRecordDigest;
    }

    /**
     * 设置病历摘要（对患者病情摘要的描述）
     *
     * @param medicalRecordDigest 病历摘要（对患者病情摘要的描述）
     */
    public void setMedicalRecordDigest(String medicalRecordDigest) {
        this.medicalRecordDigest = medicalRecordDigest == null ? null : medicalRecordDigest.trim();
    }

    /**
     * 获取辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     *
     * @return ASSIST_EXAM_RESULT - 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    public String getAssistExamResult() {
        return assistExamResult;
    }

    /**
     * 设置辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     *
     * @param assistExamResult 辅助检查结果描述（患者辅助检查、检验结果的详细描述）
     */
    public void setAssistExamResult(String assistExamResult) {
        this.assistExamResult = assistExamResult == null ? null : assistExamResult.trim();
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
     * 获取病历摘要（对患者病情摘要的描述）
     *
     * @return CASE_HISTORY_SUMMARY - 病历摘要（对患者病情摘要的描述）
     */
    public String getCaseHistorySummary() {
        return caseHistorySummary;
    }

    /**
     * 设置病历摘要（对患者病情摘要的描述）
     *
     * @param caseHistorySummary 病历摘要（对患者病情摘要的描述）
     */
    public void setCaseHistorySummary(String caseHistorySummary) {
        this.caseHistorySummary = caseHistorySummary == null ? null : caseHistorySummary.trim();
    }

    /**
     * 获取诊疗过程名称（诊疗过程的名称描述）
     *
     * @return TREATDIAG_PROCESS_NAME - 诊疗过程名称（诊疗过程的名称描述）
     */
    public String getTreatdiagProcessName() {
        return treatdiagProcessName;
    }

    /**
     * 设置诊疗过程名称（诊疗过程的名称描述）
     *
     * @param treatdiagProcessName 诊疗过程名称（诊疗过程的名称描述）
     */
    public void setTreatdiagProcessName(String treatdiagProcessName) {
        this.treatdiagProcessName = treatdiagProcessName == null ? null : treatdiagProcessName.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
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
     * 获取类型（会诊类型1院内会诊2院外会诊）
     *
     * @return TYPE - 类型（会诊类型1院内会诊2院外会诊）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型（会诊类型1院内会诊2院外会诊）
     *
     * @param type 类型（会诊类型1院内会诊2院外会诊）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
}