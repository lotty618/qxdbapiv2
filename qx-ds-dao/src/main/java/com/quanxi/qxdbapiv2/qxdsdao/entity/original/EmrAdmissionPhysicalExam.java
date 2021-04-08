package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_ADMISSION_PHYSICAL_EXAM")
public class EmrAdmissionPhysicalExam {
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
    private String hospitaltalizationTimes;

    /**
     * 体格检查：体温（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERATURE")
    private BigDecimal temperature;

    /**
     * 体格检查：脉搏（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private Short pulses;

    /**
     * 体格检查：呼吸（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "RESPIRATION")
    private Short respiration;

    /**
     * 体格检查：收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    @Column(name = "SBP")
    private Short sbp;

    /**
     * 体格检查：舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    @Column(name = "DBP")
    private Short dbp;

    /**
     * 体格检查：一般状况（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    @Column(name = "COMMON_STATUS")
    private String commonStatus;

    /**
     * 体格检查：皮肤粘膜（皮肤检查结果的详细描述）
     */
    @Column(name = "SKIN")
    private String skin;

    /**
     * 体格检查：淋巴结（对患者皮肤和黏膜检查结果的详细描述）
     */
    @Column(name = "LYMPH")
    private String lymph;

    /**
     * 体格检查：头部（对患者头部及其器官检查结果的详细描述）
     */
    @Column(name = "HEAD")
    private String head;

    /**
     * 体格检查：颈部 （对患者颈部检查结果的详细描述）
     */
    @Column(name = "NECK")
    private String neck;

    /**
     * 体格检查：胸部（对患者胸部（胸廓、肺部、心脏、血管）检查结果的详细描述，包括视触叩听的检查结果）
     */
    @Column(name = "CHEST")
    private String chest;

    /**
     * 体格检查：肺（对患者肺部检查结果的详细描述）
     */
    @Column(name = "LUNG")
    private String lung;

    /**
     * 体格检查：心（对患者心部检查结果的详细描述）
     */
    @Column(name = "HEART")
    private String heart;

    /**
     * 体格检查：周围血管（对患者周围血管检查结果的详细描述）
     */
    @Column(name = "PERIPHERAL_VESSELS")
    private String peripheralVessels;

    /**
     * 体格检查：腹部（对患者腹部（肝脾等）检查结果的详细描述，包括视触叩听的检查结果）
     */
    @Column(name = "ABDOMEN")
    private String abdomen;

    /**
     * 体格检查：生殖器（对患者外生殖器检查结果的详细描述）
     */
    @Column(name = "GENITALIA")
    private String genitalia;

    /**
     * 体格检查：肛门直肠（对患者肛门指诊检查结果的详细描述）
     */
    @Column(name = "ANUS")
    private String anus;

    /**
     * 体格检查：脊椎四肢（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    @Column(name = "ACANTHA")
    private String acantha;

    /**
     * 体格检查：神经系统（对患者神经系统检查结果的详细描述）
     */
    @Column(name = "NEURAL")
    private String neural;

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
     * 获取体格检查：体温（体温的测量值，计量单位为℃）
     *
     * @return TEMPERATURE - 体格检查：体温（体温的测量值，计量单位为℃）
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    /**
     * 设置体格检查：体温（体温的测量值，计量单位为℃）
     *
     * @param temperature 体格检查：体温（体温的测量值，计量单位为℃）
     */
    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取体格检查：脉搏（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @return PULSES - 体格检查：脉搏（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public Short getPulses() {
        return pulses;
    }

    /**
     * 设置体格检查：脉搏（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @param pulses 体格检查：脉搏（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public void setPulses(Short pulses) {
        this.pulses = pulses;
    }

    /**
     * 获取体格检查：呼吸（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @return RESPIRATION - 体格检查：呼吸（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public Short getRespiration() {
        return respiration;
    }

    /**
     * 设置体格检查：呼吸（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @param respiration 体格检查：呼吸（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public void setRespiration(Short respiration) {
        this.respiration = respiration;
    }

    /**
     * 获取体格检查：收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @return SBP - 体格检查：收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public Short getSbp() {
        return sbp;
    }

    /**
     * 设置体格检查：收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @param sbp 体格检查：收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public void setSbp(Short sbp) {
        this.sbp = sbp;
    }

    /**
     * 获取体格检查：舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @return DBP - 体格检查：舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public Short getDbp() {
        return dbp;
    }

    /**
     * 设置体格检查：舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @param dbp 体格检查：舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public void setDbp(Short dbp) {
        this.dbp = dbp;
    }

    /**
     * 获取体格检查：一般状况（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     *
     * @return COMMON_STATUS - 体格检查：一般状况（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    public String getCommonStatus() {
        return commonStatus;
    }

    /**
     * 设置体格检查：一般状况（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     *
     * @param commonStatus 体格检查：一般状况（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    public void setCommonStatus(String commonStatus) {
        this.commonStatus = commonStatus == null ? null : commonStatus.trim();
    }

    /**
     * 获取体格检查：皮肤粘膜（皮肤检查结果的详细描述）
     *
     * @return SKIN - 体格检查：皮肤粘膜（皮肤检查结果的详细描述）
     */
    public String getSkin() {
        return skin;
    }

    /**
     * 设置体格检查：皮肤粘膜（皮肤检查结果的详细描述）
     *
     * @param skin 体格检查：皮肤粘膜（皮肤检查结果的详细描述）
     */
    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }

    /**
     * 获取体格检查：淋巴结（对患者皮肤和黏膜检查结果的详细描述）
     *
     * @return LYMPH - 体格检查：淋巴结（对患者皮肤和黏膜检查结果的详细描述）
     */
    public String getLymph() {
        return lymph;
    }

    /**
     * 设置体格检查：淋巴结（对患者皮肤和黏膜检查结果的详细描述）
     *
     * @param lymph 体格检查：淋巴结（对患者皮肤和黏膜检查结果的详细描述）
     */
    public void setLymph(String lymph) {
        this.lymph = lymph == null ? null : lymph.trim();
    }

    /**
     * 获取体格检查：头部（对患者头部及其器官检查结果的详细描述）
     *
     * @return HEAD - 体格检查：头部（对患者头部及其器官检查结果的详细描述）
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置体格检查：头部（对患者头部及其器官检查结果的详细描述）
     *
     * @param head 体格检查：头部（对患者头部及其器官检查结果的详细描述）
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /**
     * 获取体格检查：颈部 （对患者颈部检查结果的详细描述）
     *
     * @return NECK - 体格检查：颈部 （对患者颈部检查结果的详细描述）
     */
    public String getNeck() {
        return neck;
    }

    /**
     * 设置体格检查：颈部 （对患者颈部检查结果的详细描述）
     *
     * @param neck 体格检查：颈部 （对患者颈部检查结果的详细描述）
     */
    public void setNeck(String neck) {
        this.neck = neck == null ? null : neck.trim();
    }

    /**
     * 获取体格检查：胸部（对患者胸部（胸廓、肺部、心脏、血管）检查结果的详细描述，包括视触叩听的检查结果）
     *
     * @return CHEST - 体格检查：胸部（对患者胸部（胸廓、肺部、心脏、血管）检查结果的详细描述，包括视触叩听的检查结果）
     */
    public String getChest() {
        return chest;
    }

    /**
     * 设置体格检查：胸部（对患者胸部（胸廓、肺部、心脏、血管）检查结果的详细描述，包括视触叩听的检查结果）
     *
     * @param chest 体格检查：胸部（对患者胸部（胸廓、肺部、心脏、血管）检查结果的详细描述，包括视触叩听的检查结果）
     */
    public void setChest(String chest) {
        this.chest = chest == null ? null : chest.trim();
    }

    /**
     * 获取体格检查：肺（对患者肺部检查结果的详细描述）
     *
     * @return LUNG - 体格检查：肺（对患者肺部检查结果的详细描述）
     */
    public String getLung() {
        return lung;
    }

    /**
     * 设置体格检查：肺（对患者肺部检查结果的详细描述）
     *
     * @param lung 体格检查：肺（对患者肺部检查结果的详细描述）
     */
    public void setLung(String lung) {
        this.lung = lung == null ? null : lung.trim();
    }

    /**
     * 获取体格检查：心（对患者心部检查结果的详细描述）
     *
     * @return HEART - 体格检查：心（对患者心部检查结果的详细描述）
     */
    public String getHeart() {
        return heart;
    }

    /**
     * 设置体格检查：心（对患者心部检查结果的详细描述）
     *
     * @param heart 体格检查：心（对患者心部检查结果的详细描述）
     */
    public void setHeart(String heart) {
        this.heart = heart == null ? null : heart.trim();
    }

    /**
     * 获取体格检查：周围血管（对患者周围血管检查结果的详细描述）
     *
     * @return PERIPHERAL_VESSELS - 体格检查：周围血管（对患者周围血管检查结果的详细描述）
     */
    public String getPeripheralVessels() {
        return peripheralVessels;
    }

    /**
     * 设置体格检查：周围血管（对患者周围血管检查结果的详细描述）
     *
     * @param peripheralVessels 体格检查：周围血管（对患者周围血管检查结果的详细描述）
     */
    public void setPeripheralVessels(String peripheralVessels) {
        this.peripheralVessels = peripheralVessels == null ? null : peripheralVessels.trim();
    }

    /**
     * 获取体格检查：腹部（对患者腹部（肝脾等）检查结果的详细描述，包括视触叩听的检查结果）
     *
     * @return ABDOMEN - 体格检查：腹部（对患者腹部（肝脾等）检查结果的详细描述，包括视触叩听的检查结果）
     */
    public String getAbdomen() {
        return abdomen;
    }

    /**
     * 设置体格检查：腹部（对患者腹部（肝脾等）检查结果的详细描述，包括视触叩听的检查结果）
     *
     * @param abdomen 体格检查：腹部（对患者腹部（肝脾等）检查结果的详细描述，包括视触叩听的检查结果）
     */
    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen == null ? null : abdomen.trim();
    }

    /**
     * 获取体格检查：生殖器（对患者外生殖器检查结果的详细描述）
     *
     * @return GENITALIA - 体格检查：生殖器（对患者外生殖器检查结果的详细描述）
     */
    public String getGenitalia() {
        return genitalia;
    }

    /**
     * 设置体格检查：生殖器（对患者外生殖器检查结果的详细描述）
     *
     * @param genitalia 体格检查：生殖器（对患者外生殖器检查结果的详细描述）
     */
    public void setGenitalia(String genitalia) {
        this.genitalia = genitalia == null ? null : genitalia.trim();
    }

    /**
     * 获取体格检查：肛门直肠（对患者肛门指诊检查结果的详细描述）
     *
     * @return ANUS - 体格检查：肛门直肠（对患者肛门指诊检查结果的详细描述）
     */
    public String getAnus() {
        return anus;
    }

    /**
     * 设置体格检查：肛门直肠（对患者肛门指诊检查结果的详细描述）
     *
     * @param anus 体格检查：肛门直肠（对患者肛门指诊检查结果的详细描述）
     */
    public void setAnus(String anus) {
        this.anus = anus == null ? null : anus.trim();
    }

    /**
     * 获取体格检查：脊椎四肢（麻醉术前访视时，对脊柱检查结果的详细描述）
     *
     * @return ACANTHA - 体格检查：脊椎四肢（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    public String getAcantha() {
        return acantha;
    }

    /**
     * 设置体格检查：脊椎四肢（麻醉术前访视时，对脊柱检查结果的详细描述）
     *
     * @param acantha 体格检查：脊椎四肢（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    public void setAcantha(String acantha) {
        this.acantha = acantha == null ? null : acantha.trim();
    }

    /**
     * 获取体格检查：神经系统（对患者神经系统检查结果的详细描述）
     *
     * @return NEURAL - 体格检查：神经系统（对患者神经系统检查结果的详细描述）
     */
    public String getNeural() {
        return neural;
    }

    /**
     * 设置体格检查：神经系统（对患者神经系统检查结果的详细描述）
     *
     * @param neural 体格检查：神经系统（对患者神经系统检查结果的详细描述）
     */
    public void setNeural(String neural) {
        this.neural = neural == null ? null : neural.trim();
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