package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_ADMISSON_DEATH_RECORD_24H")
public class EmrAdmissonDeathRecord24h {
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
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数 ）
     */
    @Column(name = "HOSPITALTALIZATION_TIMES")
    private Integer hospitaltalizationTimes;

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
     * 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    @Column(name = "RELIABLE_STATEMENT_MARK")
    private String reliableStatementMark;

    /**
     * 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 死亡日期时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DEATH_DATE")
    private String deathDate;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESE")
    private String inConditionDese;

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
     * 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 入院诊断代码（西医）ICD-10
     */
    @Column(name = "IN_DIAGOSIS_CODE")
    private String inDiagosisCode;

    /**
     * 入院诊断名称（西医）
     */
    @Column(name = "IN_DIAGOSIS_NAME")
    private String inDiagosisName;

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
     * 死亡原因（患者死亡直接原因的详细描述）
     */
    @Column(name = "DEATH_CAUSE")
    private String deathCause;

    /**
     * 死亡诊断代码（西医）ICD-10
     */
    @Column(name = "DEATH_DIAGOSIS_CODE")
    private String deathDiagosisCode;

    /**
     * 死亡诊断名称（西医）
     */
    @Column(name = "DEATH_DIAGOSIS_NAME")
    private String deathDiagosisName;

    /**
     * 死亡诊断代码（中医）GB/T 15657
     */
    @Column(name = "TCM_DEATH_DIAGOSIS_CODE")
    private String tcmDeathDiagosisCode;

    /**
     * 死亡诊断名称（中医）
     */
    @Column(name = "TMC_DEATH_DIAGOSIS_NAME")
    private String tmcDeathDiagosisName;

    /**
     * 接诊医师:编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ACCEPT_PHYSICIAN_ID")
    private String acceptPhysicianId;

    /**
     * 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ACCEPT_PHYSICIAN_NAME")
    private String acceptPhysicianName;

    /**
     * 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ACCEPT_PHYSICIAN_DATE")
    private String acceptPhysicianDate;

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
     * 主任医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "CHIEF_DOCTOR_ID")
    private String chiefDoctorId;

    /**
     * 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHIEF_DOCTOR_NAME")
    private String chiefDoctorName;

    /**
     * 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "CHIEF_DOCTOR_DATE")
    private String chiefDoctorDate;

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
     * 获取死亡日期时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @return DEATH_DATE - 死亡日期时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * 设置死亡日期时间（患者死亡时的公元纪年日期和时间的完整描述）
     *
     * @param deathDate 死亡日期时间（患者死亡时的公元纪年日期和时间的完整描述）
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate == null ? null : deathDate.trim();
    }

    /**
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESE - 入院情况（对患者入院情况的详细描述）
     */
    public String getInConditionDese() {
        return inConditionDese;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inConditionDese 入院情况（对患者入院情况的详细描述）
     */
    public void setInConditionDese(String inConditionDese) {
        this.inConditionDese = inConditionDese == null ? null : inConditionDese.trim();
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
     * 获取入院诊断代码（西医）ICD-10
     *
     * @return IN_DIAGOSIS_CODE - 入院诊断代码（西医）ICD-10
     */
    public String getInDiagosisCode() {
        return inDiagosisCode;
    }

    /**
     * 设置入院诊断代码（西医）ICD-10
     *
     * @param inDiagosisCode 入院诊断代码（西医）ICD-10
     */
    public void setInDiagosisCode(String inDiagosisCode) {
        this.inDiagosisCode = inDiagosisCode == null ? null : inDiagosisCode.trim();
    }

    /**
     * 获取入院诊断名称（西医）
     *
     * @return IN_DIAGOSIS_NAME - 入院诊断名称（西医）
     */
    public String getInDiagosisName() {
        return inDiagosisName;
    }

    /**
     * 设置入院诊断名称（西医）
     *
     * @param inDiagosisName 入院诊断名称（西医）
     */
    public void setInDiagosisName(String inDiagosisName) {
        this.inDiagosisName = inDiagosisName == null ? null : inDiagosisName.trim();
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
     * 获取死亡原因（患者死亡直接原因的详细描述）
     *
     * @return DEATH_CAUSE - 死亡原因（患者死亡直接原因的详细描述）
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * 设置死亡原因（患者死亡直接原因的详细描述）
     *
     * @param deathCause 死亡原因（患者死亡直接原因的详细描述）
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * 获取死亡诊断代码（西医）ICD-10
     *
     * @return DEATH_DIAGOSIS_CODE - 死亡诊断代码（西医）ICD-10
     */
    public String getDeathDiagosisCode() {
        return deathDiagosisCode;
    }

    /**
     * 设置死亡诊断代码（西医）ICD-10
     *
     * @param deathDiagosisCode 死亡诊断代码（西医）ICD-10
     */
    public void setDeathDiagosisCode(String deathDiagosisCode) {
        this.deathDiagosisCode = deathDiagosisCode == null ? null : deathDiagosisCode.trim();
    }

    /**
     * 获取死亡诊断名称（西医）
     *
     * @return DEATH_DIAGOSIS_NAME - 死亡诊断名称（西医）
     */
    public String getDeathDiagosisName() {
        return deathDiagosisName;
    }

    /**
     * 设置死亡诊断名称（西医）
     *
     * @param deathDiagosisName 死亡诊断名称（西医）
     */
    public void setDeathDiagosisName(String deathDiagosisName) {
        this.deathDiagosisName = deathDiagosisName == null ? null : deathDiagosisName.trim();
    }

    /**
     * 获取死亡诊断代码（中医）GB/T 15657
     *
     * @return TCM_DEATH_DIAGOSIS_CODE - 死亡诊断代码（中医）GB/T 15657
     */
    public String getTcmDeathDiagosisCode() {
        return tcmDeathDiagosisCode;
    }

    /**
     * 设置死亡诊断代码（中医）GB/T 15657
     *
     * @param tcmDeathDiagosisCode 死亡诊断代码（中医）GB/T 15657
     */
    public void setTcmDeathDiagosisCode(String tcmDeathDiagosisCode) {
        this.tcmDeathDiagosisCode = tcmDeathDiagosisCode == null ? null : tcmDeathDiagosisCode.trim();
    }

    /**
     * 获取死亡诊断名称（中医）
     *
     * @return TMC_DEATH_DIAGOSIS_NAME - 死亡诊断名称（中医）
     */
    public String getTmcDeathDiagosisName() {
        return tmcDeathDiagosisName;
    }

    /**
     * 设置死亡诊断名称（中医）
     *
     * @param tmcDeathDiagosisName 死亡诊断名称（中医）
     */
    public void setTmcDeathDiagosisName(String tmcDeathDiagosisName) {
        this.tmcDeathDiagosisName = tmcDeathDiagosisName == null ? null : tmcDeathDiagosisName.trim();
    }

    /**
     * 获取接诊医师:编号（医疗服务人员的唯一编号）
     *
     * @return ACCEPT_PHYSICIAN_ID - 接诊医师:编号（医疗服务人员的唯一编号）
     */
    public String getAcceptPhysicianId() {
        return acceptPhysicianId;
    }

    /**
     * 设置接诊医师:编号（医疗服务人员的唯一编号）
     *
     * @param acceptPhysicianId 接诊医师:编号（医疗服务人员的唯一编号）
     */
    public void setAcceptPhysicianId(String acceptPhysicianId) {
        this.acceptPhysicianId = acceptPhysicianId == null ? null : acceptPhysicianId.trim();
    }

    /**
     * 获取接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ACCEPT_PHYSICIAN_NAME - 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAcceptPhysicianName() {
        return acceptPhysicianName;
    }

    /**
     * 设置接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param acceptPhysicianName 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAcceptPhysicianName(String acceptPhysicianName) {
        this.acceptPhysicianName = acceptPhysicianName == null ? null : acceptPhysicianName.trim();
    }

    /**
     * 获取接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return ACCEPT_PHYSICIAN_DATE - 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getAcceptPhysicianDate() {
        return acceptPhysicianDate;
    }

    /**
     * 设置接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param acceptPhysicianDate 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setAcceptPhysicianDate(String acceptPhysicianDate) {
        this.acceptPhysicianDate = acceptPhysicianDate == null ? null : acceptPhysicianDate.trim();
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
     * 获取主任医师：编号（医疗服务人员的唯一编号）
     *
     * @return CHIEF_DOCTOR_ID - 主任医师：编号（医疗服务人员的唯一编号）
     */
    public String getChiefDoctorId() {
        return chiefDoctorId;
    }

    /**
     * 设置主任医师：编号（医疗服务人员的唯一编号）
     *
     * @param chiefDoctorId 主任医师：编号（医疗服务人员的唯一编号）
     */
    public void setChiefDoctorId(String chiefDoctorId) {
        this.chiefDoctorId = chiefDoctorId == null ? null : chiefDoctorId.trim();
    }

    /**
     * 获取主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHIEF_DOCTOR_NAME - 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    /**
     * 设置主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param chiefDoctorName 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
    }

    /**
     * 获取主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return CHIEF_DOCTOR_DATE - 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getChiefDoctorDate() {
        return chiefDoctorDate;
    }

    /**
     * 设置主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param chiefDoctorDate 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setChiefDoctorDate(String chiefDoctorDate) {
        this.chiefDoctorDate = chiefDoctorDate == null ? null : chiefDoctorDate.trim();
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
}