package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_INF_ORTHER")
public class QxTInfOrther {
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
     * 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    /**
     * 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 知情同意书编号[主键]（按照某一特定编码规则赋予患者本人的知情同意书的顺序号）
     */
    @Id
    @Column(name = "INFORMED_CONSENT_NO")
    private String informedConsentNo;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
    @Column(name = "ROOM_NO")
    private String roomNo;

    /**
     * 病床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别中文名称（本人生理性别的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

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
     * 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 知情同意内容（知情同意书中涉及的诊疗项目在实施或应用过程中可能存在的风险及其他意外或不良后果的详细描述）
     */
    @Column(name = "INFORMED_CONSENT")
    private String informedConsent;

    /**
     * 医疗机构意见（在此诊疗活动过程中，医疗机构对患者应尽责任的陈述以及对可能面临的风险或意外情况所采取的应对措施的详细描述）
     */
    @Column(name = "ORG_COMMENT")
    private String orgComment;

    /**
     * 患者/法定代理人意见（患者/法定代理人对手术同意书中告知内容的意见的详细描述）
     */
    @Column(name = "PAT_LEGAL_COMMENT")
    private String patLegalComment;

    /**
     * 患者签名（患者本人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PATIENT_SIGNATURE")
    private String patientSignature;

    /**
     * 法定代理人签名（法定代理人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "LEGAL_SIGNATURE")
    private String legalSignature;

    /**
     * 法定代理人与患者的关系代码GB/T 4761（法定代理人与患者的关系类别在特定编码体系中的代码）
     */
    @Column(name = "PAT_LEGAL_RELATION_CODE")
    private String patLegalRelationCode;

    /**
     * 法定代理人与患者的关系名称（法定代理人与患者的关系类别在特定编码体系中的名称）
     */
    @Column(name = "PAT_LEGAL_RELATION_NAME")
    private String patLegalRelationName;

    /**
     * 患者/法定代理人签名日期时间（患者/法定代理人签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PATIENT_SIGNATURE_DATE")
    private String patientSignatureDate;

    /**
     * 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DOCTOR_SIGNATURE")
    private String doctorSignature;

    /**
     * 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DOCTOR_SIGNATURE_DATE")
    private String doctorSignatureDate;

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
     * 住院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

    /**
     * 病历原文（医院病历的原始内容）(CLOB类型)
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
     * 获取事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @return EVENT_TYPE - 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @param eventType 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * 获取本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取知情同意书编号[主键]（按照某一特定编码规则赋予患者本人的知情同意书的顺序号）
     *
     * @return INFORMED_CONSENT_NO - 知情同意书编号[主键]（按照某一特定编码规则赋予患者本人的知情同意书的顺序号）
     */
    public String getInformedConsentNo() {
        return informedConsentNo;
    }

    /**
     * 设置知情同意书编号[主键]（按照某一特定编码规则赋予患者本人的知情同意书的顺序号）
     *
     * @param informedConsentNo 知情同意书编号[主键]（按照某一特定编码规则赋予患者本人的知情同意书的顺序号）
     */
    public void setInformedConsentNo(String informedConsentNo) {
        this.informedConsentNo = informedConsentNo == null ? null : informedConsentNo.trim();
    }

    /**
     * 获取事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @return EVENT_TYPE_CN - 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public String getEventTypeCn() {
        return eventTypeCn;
    }

    /**
     * 设置事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @param eventTypeCn 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public void setEventTypeCn(String eventTypeCn) {
        this.eventTypeCn = eventTypeCn == null ? null : eventTypeCn.trim();
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
     * @return ROOM_NO - 病房号（患者住院期间，所住病房对应的编号）
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置病房号（患者住院期间，所住病房对应的编号）
     *
     * @param roomNo 病房号（患者住院期间，所住病房对应的编号）
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
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
     * 获取姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别中文名称（本人生理性别的中文名称）
     *
     * @return SEX_CN - 性别中文名称（本人生理性别的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别中文名称（本人生理性别的中文名称）
     *
     * @param sexCn 性别中文名称（本人生理性别的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
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
     * 获取疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return DIAGNOSIS_CODE - 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param diagnosisCode 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @param diagnosisName 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取知情同意内容（知情同意书中涉及的诊疗项目在实施或应用过程中可能存在的风险及其他意外或不良后果的详细描述）
     *
     * @return INFORMED_CONSENT - 知情同意内容（知情同意书中涉及的诊疗项目在实施或应用过程中可能存在的风险及其他意外或不良后果的详细描述）
     */
    public String getInformedConsent() {
        return informedConsent;
    }

    /**
     * 设置知情同意内容（知情同意书中涉及的诊疗项目在实施或应用过程中可能存在的风险及其他意外或不良后果的详细描述）
     *
     * @param informedConsent 知情同意内容（知情同意书中涉及的诊疗项目在实施或应用过程中可能存在的风险及其他意外或不良后果的详细描述）
     */
    public void setInformedConsent(String informedConsent) {
        this.informedConsent = informedConsent == null ? null : informedConsent.trim();
    }

    /**
     * 获取医疗机构意见（在此诊疗活动过程中，医疗机构对患者应尽责任的陈述以及对可能面临的风险或意外情况所采取的应对措施的详细描述）
     *
     * @return ORG_COMMENT - 医疗机构意见（在此诊疗活动过程中，医疗机构对患者应尽责任的陈述以及对可能面临的风险或意外情况所采取的应对措施的详细描述）
     */
    public String getOrgComment() {
        return orgComment;
    }

    /**
     * 设置医疗机构意见（在此诊疗活动过程中，医疗机构对患者应尽责任的陈述以及对可能面临的风险或意外情况所采取的应对措施的详细描述）
     *
     * @param orgComment 医疗机构意见（在此诊疗活动过程中，医疗机构对患者应尽责任的陈述以及对可能面临的风险或意外情况所采取的应对措施的详细描述）
     */
    public void setOrgComment(String orgComment) {
        this.orgComment = orgComment == null ? null : orgComment.trim();
    }

    /**
     * 获取患者/法定代理人意见（患者/法定代理人对手术同意书中告知内容的意见的详细描述）
     *
     * @return PAT_LEGAL_COMMENT - 患者/法定代理人意见（患者/法定代理人对手术同意书中告知内容的意见的详细描述）
     */
    public String getPatLegalComment() {
        return patLegalComment;
    }

    /**
     * 设置患者/法定代理人意见（患者/法定代理人对手术同意书中告知内容的意见的详细描述）
     *
     * @param patLegalComment 患者/法定代理人意见（患者/法定代理人对手术同意书中告知内容的意见的详细描述）
     */
    public void setPatLegalComment(String patLegalComment) {
        this.patLegalComment = patLegalComment == null ? null : patLegalComment.trim();
    }

    /**
     * 获取患者签名（患者本人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return PATIENT_SIGNATURE - 患者签名（患者本人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getPatientSignature() {
        return patientSignature;
    }

    /**
     * 设置患者签名（患者本人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param patientSignature 患者签名（患者本人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setPatientSignature(String patientSignature) {
        this.patientSignature = patientSignature == null ? null : patientSignature.trim();
    }

    /**
     * 获取法定代理人签名（法定代理人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return LEGAL_SIGNATURE - 法定代理人签名（法定代理人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getLegalSignature() {
        return legalSignature;
    }

    /**
     * 设置法定代理人签名（法定代理人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param legalSignature 法定代理人签名（法定代理人签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setLegalSignature(String legalSignature) {
        this.legalSignature = legalSignature == null ? null : legalSignature.trim();
    }

    /**
     * 获取法定代理人与患者的关系代码GB/T 4761（法定代理人与患者的关系类别在特定编码体系中的代码）
     *
     * @return PAT_LEGAL_RELATION_CODE - 法定代理人与患者的关系代码GB/T 4761（法定代理人与患者的关系类别在特定编码体系中的代码）
     */
    public String getPatLegalRelationCode() {
        return patLegalRelationCode;
    }

    /**
     * 设置法定代理人与患者的关系代码GB/T 4761（法定代理人与患者的关系类别在特定编码体系中的代码）
     *
     * @param patLegalRelationCode 法定代理人与患者的关系代码GB/T 4761（法定代理人与患者的关系类别在特定编码体系中的代码）
     */
    public void setPatLegalRelationCode(String patLegalRelationCode) {
        this.patLegalRelationCode = patLegalRelationCode == null ? null : patLegalRelationCode.trim();
    }

    /**
     * 获取法定代理人与患者的关系名称（法定代理人与患者的关系类别在特定编码体系中的名称）
     *
     * @return PAT_LEGAL_RELATION_NAME - 法定代理人与患者的关系名称（法定代理人与患者的关系类别在特定编码体系中的名称）
     */
    public String getPatLegalRelationName() {
        return patLegalRelationName;
    }

    /**
     * 设置法定代理人与患者的关系名称（法定代理人与患者的关系类别在特定编码体系中的名称）
     *
     * @param patLegalRelationName 法定代理人与患者的关系名称（法定代理人与患者的关系类别在特定编码体系中的名称）
     */
    public void setPatLegalRelationName(String patLegalRelationName) {
        this.patLegalRelationName = patLegalRelationName == null ? null : patLegalRelationName.trim();
    }

    /**
     * 获取患者/法定代理人签名日期时间（患者/法定代理人签名时的公元纪年日期和时间的完整描述）
     *
     * @return PATIENT_SIGNATURE_DATE - 患者/法定代理人签名日期时间（患者/法定代理人签名时的公元纪年日期和时间的完整描述）
     */
    public String getPatientSignatureDate() {
        return patientSignatureDate;
    }

    /**
     * 设置患者/法定代理人签名日期时间（患者/法定代理人签名时的公元纪年日期和时间的完整描述）
     *
     * @param patientSignatureDate 患者/法定代理人签名日期时间（患者/法定代理人签名时的公元纪年日期和时间的完整描述）
     */
    public void setPatientSignatureDate(String patientSignatureDate) {
        this.patientSignatureDate = patientSignatureDate == null ? null : patientSignatureDate.trim();
    }

    /**
     * 获取医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DOCTOR_SIGNATURE - 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDoctorSignature() {
        return doctorSignature;
    }

    /**
     * 设置医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param doctorSignature 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDoctorSignature(String doctorSignature) {
        this.doctorSignature = doctorSignature == null ? null : doctorSignature.trim();
    }

    /**
     * 获取医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return DOCTOR_SIGNATURE_DATE - 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getDoctorSignatureDate() {
        return doctorSignatureDate;
    }

    /**
     * 设置医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param doctorSignatureDate 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setDoctorSignatureDate(String doctorSignatureDate) {
        this.doctorSignatureDate = doctorSignatureDate == null ? null : doctorSignatureDate.trim();
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
     * 获取住院标识
     *
     * @return IHUID - 住院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院标识
     *
     * @param ihuid 住院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
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
     * 获取病历原文（医院病历的原始内容）(CLOB类型)
     *
     * @return EMR_CONTENT_CLOB - 病历原文（医院病历的原始内容）(CLOB类型)
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * 设置病历原文（医院病历的原始内容）(CLOB类型)
     *
     * @param emrContentClob 病历原文（医院病历的原始内容）(CLOB类型)
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}