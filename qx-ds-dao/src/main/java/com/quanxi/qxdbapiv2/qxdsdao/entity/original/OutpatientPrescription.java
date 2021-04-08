package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_PRESCRIPTION")
public class OutpatientPrescription {
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
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 处方编号[主键]（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    @Id
    @Column(name = "PRESCRIPTION_NO")
    private String prescriptionNo;

    /**
     * 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    @Column(name = "PRES_CLASS_TYPE_CODE")
    private String presClassTypeCode;

    /**
     * 处方类别名称（处方类别在特定体系中的名称）
     */
    @Column(name = "PRES_CLASS_TYPE_NAME")
    private String presClassTypeName;

    /**
     * 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "GENDER_CODE")
    private String genderCode;

    /**
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

    /**
     * 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_MONTH")
    private String ageMonth;

    /**
     * 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    @Column(name = "TCM_DIAGNOSIS_CODE")
    private String tcmDiagnosisCode;

    /**
     * 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    @Column(name = "TCM_DIAGNOSIS_NAME")
    private String tcmDiagnosisName;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    /**
     * 处方说明（对处方的详细说明）
     */
    @Column(name = "PRES_DESCRIBE")
    private String presDescribe;

    /**
     * 中药煎煮方法（中药煎煮的方法的描述）
     */
    @Column(name = "TCM_DECOC_PIECE_METHOD")
    private String tcmDecocPieceMethod;

    /**
     * 中药用药方法（中药的用药方法的描述）
     */
    @Column(name = "TCM_USE_METHOD")
    private String tcmUseMethod;

    /**
     * 金额（处方金额）
     */
    @Column(name = "COST")
    private BigDecimal cost;

    /**
     * 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    @Column(name = "TERM_COUNT")
    private Integer termCount;

    /**
     * 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    @Column(name = "APPLY_DEPT_CODE")
    private String applyDeptCode;

    /**
     * 开立科室中文名称（开立处方的科室中文名称）
     */
    @Column(name = "APPLY_DEPT_CN")
    private String applyDeptCn;

    /**
     * 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    @Column(name = "APPLY_TIME")
    private String applyTime;

    /**
     * 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "APPLY_OPERATOR")
    private String applyOperator;

    /**
     * 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORM_OPERATOR")
    private String performOperator;

    /**
     * 执行科室代码（执行科室在特定编码体系中的代码）
     */
    @Column(name = "PERFORM_DEPT_CODE")
    private String performDeptCode;

    /**
     * 执行科室名称（执行科室在特定编码体系中的名称）
     */
    @Column(name = "PERFORM_DEPT_NAME")
    private String performDeptName;

    /**
     * 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PERFORM_DATE")
    private String performDate;

    /**
     * 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUDIT_OPERATOR")
    private String auditOperator;

    /**
     * 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    @Column(name = "AUDIT_DATE")
    private String auditDate;

    /**
     * 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DISTRIUTE_OPERATOR")
    private String distriuteOperator;

    /**
     * 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHECK_OPERATOR")
    private String checkOperator;

    /**
     * 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DISPENSE_OPERATOR")
    private String dispenseOperator;

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
     * 获取处方编号[主键]（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @return PRESCRIPTION_NO - 处方编号[主键]（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    /**
     * 设置处方编号[主键]（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @param prescriptionNo 处方编号[主键]（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo == null ? null : prescriptionNo.trim();
    }

    /**
     * 获取处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     *
     * @return PRES_CLASS_TYPE_CODE - 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    public String getPresClassTypeCode() {
        return presClassTypeCode;
    }

    /**
     * 设置处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     *
     * @param presClassTypeCode 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    public void setPresClassTypeCode(String presClassTypeCode) {
        this.presClassTypeCode = presClassTypeCode == null ? null : presClassTypeCode.trim();
    }

    /**
     * 获取处方类别名称（处方类别在特定体系中的名称）
     *
     * @return PRES_CLASS_TYPE_NAME - 处方类别名称（处方类别在特定体系中的名称）
     */
    public String getPresClassTypeName() {
        return presClassTypeName;
    }

    /**
     * 设置处方类别名称（处方类别在特定体系中的名称）
     *
     * @param presClassTypeName 处方类别名称（处方类别在特定体系中的名称）
     */
    public void setPresClassTypeName(String presClassTypeName) {
        this.presClassTypeName = presClassTypeName == null ? null : presClassTypeName.trim();
    }

    /**
     * 获取患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return GENDER_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param genderCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    /**
     * 获取年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_YEAR - 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageYear 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeYear(String ageYear) {
        this.ageYear = ageYear == null ? null : ageYear.trim();
    }

    /**
     * 获取字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_MONTH - 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageMonth 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeMonth(String ageMonth) {
        this.ageMonth = ageMonth == null ? null : ageMonth.trim();
    }

    /**
     * 获取西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @return DIAGNOSIS_CODE - 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @param diagnosisCode 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @param diagnosisName 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     *
     * @return TCM_DIAGNOSIS_CODE - 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    public String getTcmDiagnosisCode() {
        return tcmDiagnosisCode;
    }

    /**
     * 设置中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     *
     * @param tcmDiagnosisCode 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    public void setTcmDiagnosisCode(String tcmDiagnosisCode) {
        this.tcmDiagnosisCode = tcmDiagnosisCode == null ? null : tcmDiagnosisCode.trim();
    }

    /**
     * 获取中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     *
     * @return TCM_DIAGNOSIS_NAME - 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    public String getTcmDiagnosisName() {
        return tcmDiagnosisName;
    }

    /**
     * 设置中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     *
     * @param tcmDiagnosisName 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    public void setTcmDiagnosisName(String tcmDiagnosisName) {
        this.tcmDiagnosisName = tcmDiagnosisName == null ? null : tcmDiagnosisName.trim();
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
     * 获取处方说明（对处方的详细说明）
     *
     * @return PRES_DESCRIBE - 处方说明（对处方的详细说明）
     */
    public String getPresDescribe() {
        return presDescribe;
    }

    /**
     * 设置处方说明（对处方的详细说明）
     *
     * @param presDescribe 处方说明（对处方的详细说明）
     */
    public void setPresDescribe(String presDescribe) {
        this.presDescribe = presDescribe == null ? null : presDescribe.trim();
    }

    /**
     * 获取中药煎煮方法（中药煎煮的方法的描述）
     *
     * @return TCM_DECOC_PIECE_METHOD - 中药煎煮方法（中药煎煮的方法的描述）
     */
    public String getTcmDecocPieceMethod() {
        return tcmDecocPieceMethod;
    }

    /**
     * 设置中药煎煮方法（中药煎煮的方法的描述）
     *
     * @param tcmDecocPieceMethod 中药煎煮方法（中药煎煮的方法的描述）
     */
    public void setTcmDecocPieceMethod(String tcmDecocPieceMethod) {
        this.tcmDecocPieceMethod = tcmDecocPieceMethod == null ? null : tcmDecocPieceMethod.trim();
    }

    /**
     * 获取中药用药方法（中药的用药方法的描述）
     *
     * @return TCM_USE_METHOD - 中药用药方法（中药的用药方法的描述）
     */
    public String getTcmUseMethod() {
        return tcmUseMethod;
    }

    /**
     * 设置中药用药方法（中药的用药方法的描述）
     *
     * @param tcmUseMethod 中药用药方法（中药的用药方法的描述）
     */
    public void setTcmUseMethod(String tcmUseMethod) {
        this.tcmUseMethod = tcmUseMethod == null ? null : tcmUseMethod.trim();
    }

    /**
     * 获取金额（处方金额）
     *
     * @return COST - 金额（处方金额）
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置金额（处方金额）
     *
     * @param cost 金额（处方金额）
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * 获取处方有效天数（门(急)诊医师开具的处方的有效天数）
     *
     * @return TERM_COUNT - 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    public Integer getTermCount() {
        return termCount;
    }

    /**
     * 设置处方有效天数（门(急)诊医师开具的处方的有效天数）
     *
     * @param termCount 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    public void setTermCount(Integer termCount) {
        this.termCount = termCount;
    }

    /**
     * 获取开立科室代码DIR_DEPT（开立处方的科室代码）
     *
     * @return APPLY_DEPT_CODE - 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * 设置开立科室代码DIR_DEPT（开立处方的科室代码）
     *
     * @param applyDeptCode 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    /**
     * 获取开立科室中文名称（开立处方的科室中文名称）
     *
     * @return APPLY_DEPT_CN - 开立科室中文名称（开立处方的科室中文名称）
     */
    public String getApplyDeptCn() {
        return applyDeptCn;
    }

    /**
     * 设置开立科室中文名称（开立处方的科室中文名称）
     *
     * @param applyDeptCn 开立科室中文名称（开立处方的科室中文名称）
     */
    public void setApplyDeptCn(String applyDeptCn) {
        this.applyDeptCn = applyDeptCn == null ? null : applyDeptCn.trim();
    }

    /**
     * 获取处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @return APPLY_TIME - 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 设置处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @param applyTime 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    /**
     * 获取处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return APPLY_OPERATOR - 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getApplyOperator() {
        return applyOperator;
    }

    /**
     * 设置处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param applyOperator 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setApplyOperator(String applyOperator) {
        this.applyOperator = applyOperator == null ? null : applyOperator.trim();
    }

    /**
     * 获取执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORM_OPERATOR - 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformOperator() {
        return performOperator;
    }

    /**
     * 设置执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param performOperator 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformOperator(String performOperator) {
        this.performOperator = performOperator == null ? null : performOperator.trim();
    }

    /**
     * 获取执行科室代码（执行科室在特定编码体系中的代码）
     *
     * @return PERFORM_DEPT_CODE - 执行科室代码（执行科室在特定编码体系中的代码）
     */
    public String getPerformDeptCode() {
        return performDeptCode;
    }

    /**
     * 设置执行科室代码（执行科室在特定编码体系中的代码）
     *
     * @param performDeptCode 执行科室代码（执行科室在特定编码体系中的代码）
     */
    public void setPerformDeptCode(String performDeptCode) {
        this.performDeptCode = performDeptCode == null ? null : performDeptCode.trim();
    }

    /**
     * 获取执行科室名称（执行科室在特定编码体系中的名称）
     *
     * @return PERFORM_DEPT_NAME - 执行科室名称（执行科室在特定编码体系中的名称）
     */
    public String getPerformDeptName() {
        return performDeptName;
    }

    /**
     * 设置执行科室名称（执行科室在特定编码体系中的名称）
     *
     * @param performDeptName 执行科室名称（执行科室在特定编码体系中的名称）
     */
    public void setPerformDeptName(String performDeptName) {
        this.performDeptName = performDeptName == null ? null : performDeptName.trim();
    }

    /**
     * 获取执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @return PERFORM_DATE - 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public String getPerformDate() {
        return performDate;
    }

    /**
     * 设置执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @param performDate 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public void setPerformDate(String performDate) {
        this.performDate = performDate == null ? null : performDate.trim();
    }

    /**
     * 获取处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUDIT_OPERATOR - 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuditOperator() {
        return auditOperator;
    }

    /**
     * 设置处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param auditOperator 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator == null ? null : auditOperator.trim();
    }

    /**
     * 获取审核日期（处方审核当日的公元纪日期的完整描述）
     *
     * @return AUDIT_DATE - 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    public String getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审核日期（处方审核当日的公元纪日期的完整描述）
     *
     * @param auditDate 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    /**
     * 获取处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DISTRIUTE_OPERATOR - 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDistriuteOperator() {
        return distriuteOperator;
    }

    /**
     * 设置处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param distriuteOperator 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDistriuteOperator(String distriuteOperator) {
        this.distriuteOperator = distriuteOperator == null ? null : distriuteOperator.trim();
    }

    /**
     * 获取处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHECK_OPERATOR - 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCheckOperator() {
        return checkOperator;
    }

    /**
     * 设置处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param checkOperator 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCheckOperator(String checkOperator) {
        this.checkOperator = checkOperator == null ? null : checkOperator.trim();
    }

    /**
     * 获取处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DISPENSE_OPERATOR - 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDispenseOperator() {
        return dispenseOperator;
    }

    /**
     * 设置处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param dispenseOperator 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDispenseOperator(String dispenseOperator) {
        this.dispenseOperator = dispenseOperator == null ? null : dispenseOperator.trim();
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
}