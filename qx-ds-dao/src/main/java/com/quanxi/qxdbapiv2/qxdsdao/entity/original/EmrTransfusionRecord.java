package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_TRANSFUSION_RECORD")
public class EmrTransfusionRecord {
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
    @Column(name = "TRANSFUSION_ID")
    private String transfusionId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

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
     * ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    @Column(name = "ABO_CODE")
    private String aboCode;

    /**
     * ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    @Column(name = "ABO_CN")
    private String aboCn;

    /**
     * RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    @Column(name = "RH_CODE")
    private String rhCode;

    /**
     * RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    @Column(name = "RH_CN")
    private String rhCn;

    /**
     * 输血史标识代码DIR_BOOLD_MARK（既往有无输血经历的分类代码）
     */
    @Column(name = "TRANSFUSE_HISTORY_CODE")
    private String transfuseHistoryCode;

    /**
     * 输血史标识中文名称（既往有无输血经历的分类中文名称）
     */
    @Column(name = "TRANSFUSE_HISTORY_CN")
    private String transfuseHistoryCn;

    /**
     * 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "DISEASE_DIAGNOSIS")
    private String diseaseDiagnosis;

    /**
     * 疾病诊断名称（患者所患的疾病诊断特定编码体系中的名称）
     */
    @Column(name = "DISEASE_DIAGNOSIS_NAME")
    private String diseaseDiagnosisName;

    /**
     * 诊断日期YYYYMMDD（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    @Column(name = "DIAGNOSIS_DATE")
    private String diagnosisDate;

    /**
     * 输血性质代码DIR_BOOLD_NATURE（输血性质类别的分类代码）
     */
    @Column(name = "TRANS_KIND_CODE")
    private String transKindCode;

    /**
     * 输血性质中文名称（输血性质类别的分类中文名称）
     */
    @Column(name = "TRANS_KIND_CN")
    private String transKindCn;

    /**
     * 申请ABO血型代码CV04.50.005（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的代码）
     */
    @Column(name = "APPLY_ABO_BLOOD_CODE")
    private String applyAboBloodCode;

    /**
     * 申请ABO血型中文名称（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的中文名称）
     */
    @Column(name = "APPLY_ABO_BLOOD_CN")
    private String applyAboBloodCn;

    /**
     * 申请 Rh 血型代码CV04.50.020（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的代码）
     */
    @Column(name = "APPLY_RH_BLOOD_CODE")
    private String applyRhBloodCode;

    /**
     * 申请 Rh 血型中文名称（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的中文名称）
     */
    @Column(name = "APPLY_RH_BLOOD_CN")
    private String applyRhBloodCn;

    /**
     * 输血指征（受血者接受输血治疗的指征描述）
     */
    @Column(name = "TRANSFUSION_INDICATION")
    private String transfusionIndication;

    /**
     * 输血过程记录（对患者输血过程的详细描述）
     */
    @Column(name = "TRANSFUSION_PROCESS_DESC")
    private String transfusionProcessDesc;

    /**
     * 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    @Column(name = "TRANSFUSION_CODE")
    private String transfusionCode;

    /**
     * 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    @Column(name = "TRANSFUSION_CN")
    private String transfusionCn;

    /**
     * 血袋编码（按照特定编码规则赋予血袋的顺序号）
     */
    @Column(name = "BAGS_CODING")
    private String bagsCoding;

    /**
     * 输血量（输入红细胞、血小板、血浆、全血等的数量）
     */
    @Column(name = "BLOOD")
    private BigDecimal blood;

    /**
     * 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    @Column(name = "TRANSFUSION_UNIT")
    private String transfusionUnit;

    /**
     * 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    @Column(name = "TRANSFUSION_REACTION_MARK")
    private String transfusionReactionMark;

    /**
     * 输血反应类型代码CV05.01.040（患者发生输血反应的分类在特定编码体系中的代码）
     */
    @Column(name = "TRANSFUSION_REACTION_TYPE")
    private String transfusionReactionType;

    /**
     * 输血反应类型名称（患者发生输血反应的分类在特定编码体系中的名称）
     */
    @Column(name = "TRANSFUSION_REACTION_NAME")
    private String transfusionReactionName;

    /**
     * 输血次数（输血次数的累计值）
     */
    @Column(name = "TRANSFUSION_COUNT")
    private BigDecimal transfusionCount;

    /**
     * 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "BLOOD_TRANSF_DATE")
    private String bloodTransfDate;

    /**
     * 输血原因（表示本次输血的原因）
     */
    @Column(name = "BLOOD_TRANSF_CAUSE")
    private String bloodTransfCause;

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
     * @return TRANSFUSION_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getTransfusionId() {
        return transfusionId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param transfusionId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setTransfusionId(String transfusionId) {
        this.transfusionId = transfusionId == null ? null : transfusionId.trim();
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
     * 获取ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     *
     * @return ABO_CODE - ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * 设置ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     *
     * @param aboCode ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode == null ? null : aboCode.trim();
    }

    /**
     * 获取ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     *
     * @return ABO_CN - ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    public String getAboCn() {
        return aboCn;
    }

    /**
     * 设置ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     *
     * @param aboCn ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    public void setAboCn(String aboCn) {
        this.aboCn = aboCn == null ? null : aboCn.trim();
    }

    /**
     * 获取RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     *
     * @return RH_CODE - RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * 设置RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     *
     * @param rhCode RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode == null ? null : rhCode.trim();
    }

    /**
     * 获取RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     *
     * @return RH_CN - RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    public String getRhCn() {
        return rhCn;
    }

    /**
     * 设置RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     *
     * @param rhCn RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    public void setRhCn(String rhCn) {
        this.rhCn = rhCn == null ? null : rhCn.trim();
    }

    /**
     * 获取输血史标识代码DIR_BOOLD_MARK（既往有无输血经历的分类代码）
     *
     * @return TRANSFUSE_HISTORY_CODE - 输血史标识代码DIR_BOOLD_MARK（既往有无输血经历的分类代码）
     */
    public String getTransfuseHistoryCode() {
        return transfuseHistoryCode;
    }

    /**
     * 设置输血史标识代码DIR_BOOLD_MARK（既往有无输血经历的分类代码）
     *
     * @param transfuseHistoryCode 输血史标识代码DIR_BOOLD_MARK（既往有无输血经历的分类代码）
     */
    public void setTransfuseHistoryCode(String transfuseHistoryCode) {
        this.transfuseHistoryCode = transfuseHistoryCode == null ? null : transfuseHistoryCode.trim();
    }

    /**
     * 获取输血史标识中文名称（既往有无输血经历的分类中文名称）
     *
     * @return TRANSFUSE_HISTORY_CN - 输血史标识中文名称（既往有无输血经历的分类中文名称）
     */
    public String getTransfuseHistoryCn() {
        return transfuseHistoryCn;
    }

    /**
     * 设置输血史标识中文名称（既往有无输血经历的分类中文名称）
     *
     * @param transfuseHistoryCn 输血史标识中文名称（既往有无输血经历的分类中文名称）
     */
    public void setTransfuseHistoryCn(String transfuseHistoryCn) {
        this.transfuseHistoryCn = transfuseHistoryCn == null ? null : transfuseHistoryCn.trim();
    }

    /**
     * 获取疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return DISEASE_DIAGNOSIS - 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    /**
     * 设置疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param diseaseDiagnosis 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setDiseaseDiagnosis(String diseaseDiagnosis) {
        this.diseaseDiagnosis = diseaseDiagnosis == null ? null : diseaseDiagnosis.trim();
    }

    /**
     * 获取疾病诊断名称（患者所患的疾病诊断特定编码体系中的名称）
     *
     * @return DISEASE_DIAGNOSIS_NAME - 疾病诊断名称（患者所患的疾病诊断特定编码体系中的名称）
     */
    public String getDiseaseDiagnosisName() {
        return diseaseDiagnosisName;
    }

    /**
     * 设置疾病诊断名称（患者所患的疾病诊断特定编码体系中的名称）
     *
     * @param diseaseDiagnosisName 疾病诊断名称（患者所患的疾病诊断特定编码体系中的名称）
     */
    public void setDiseaseDiagnosisName(String diseaseDiagnosisName) {
        this.diseaseDiagnosisName = diseaseDiagnosisName == null ? null : diseaseDiagnosisName.trim();
    }

    /**
     * 获取诊断日期YYYYMMDD（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @return DIAGNOSIS_DATE - 诊断日期YYYYMMDD（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * 设置诊断日期YYYYMMDD（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @param diagnosisDate 诊断日期YYYYMMDD（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public void setDiagnosisDate(String diagnosisDate) {
        this.diagnosisDate = diagnosisDate == null ? null : diagnosisDate.trim();
    }

    /**
     * 获取输血性质代码DIR_BOOLD_NATURE（输血性质类别的分类代码）
     *
     * @return TRANS_KIND_CODE - 输血性质代码DIR_BOOLD_NATURE（输血性质类别的分类代码）
     */
    public String getTransKindCode() {
        return transKindCode;
    }

    /**
     * 设置输血性质代码DIR_BOOLD_NATURE（输血性质类别的分类代码）
     *
     * @param transKindCode 输血性质代码DIR_BOOLD_NATURE（输血性质类别的分类代码）
     */
    public void setTransKindCode(String transKindCode) {
        this.transKindCode = transKindCode == null ? null : transKindCode.trim();
    }

    /**
     * 获取输血性质中文名称（输血性质类别的分类中文名称）
     *
     * @return TRANS_KIND_CN - 输血性质中文名称（输血性质类别的分类中文名称）
     */
    public String getTransKindCn() {
        return transKindCn;
    }

    /**
     * 设置输血性质中文名称（输血性质类别的分类中文名称）
     *
     * @param transKindCn 输血性质中文名称（输血性质类别的分类中文名称）
     */
    public void setTransKindCn(String transKindCn) {
        this.transKindCn = transKindCn == null ? null : transKindCn.trim();
    }

    /**
     * 获取申请ABO血型代码CV04.50.005（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的代码）
     *
     * @return APPLY_ABO_BLOOD_CODE - 申请ABO血型代码CV04.50.005（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的代码）
     */
    public String getApplyAboBloodCode() {
        return applyAboBloodCode;
    }

    /**
     * 设置申请ABO血型代码CV04.50.005（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的代码）
     *
     * @param applyAboBloodCode 申请ABO血型代码CV04.50.005（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的代码）
     */
    public void setApplyAboBloodCode(String applyAboBloodCode) {
        this.applyAboBloodCode = applyAboBloodCode == null ? null : applyAboBloodCode.trim();
    }

    /**
     * 获取申请ABO血型中文名称（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的中文名称）
     *
     * @return APPLY_ABO_BLOOD_CN - 申请ABO血型中文名称（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的中文名称）
     */
    public String getApplyAboBloodCn() {
        return applyAboBloodCn;
    }

    /**
     * 设置申请ABO血型中文名称（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的中文名称）
     *
     * @param applyAboBloodCn 申请ABO血型中文名称（为患者申请的并实际输入的与患者本人相同的 ABO血型类别在特定编码体系中的中文名称）
     */
    public void setApplyAboBloodCn(String applyAboBloodCn) {
        this.applyAboBloodCn = applyAboBloodCn == null ? null : applyAboBloodCn.trim();
    }

    /**
     * 获取申请 Rh 血型代码CV04.50.020（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的代码）
     *
     * @return APPLY_RH_BLOOD_CODE - 申请 Rh 血型代码CV04.50.020（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的代码）
     */
    public String getApplyRhBloodCode() {
        return applyRhBloodCode;
    }

    /**
     * 设置申请 Rh 血型代码CV04.50.020（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的代码）
     *
     * @param applyRhBloodCode 申请 Rh 血型代码CV04.50.020（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的代码）
     */
    public void setApplyRhBloodCode(String applyRhBloodCode) {
        this.applyRhBloodCode = applyRhBloodCode == null ? null : applyRhBloodCode.trim();
    }

    /**
     * 获取申请 Rh 血型中文名称（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的中文名称）
     *
     * @return APPLY_RH_BLOOD_CN - 申请 Rh 血型中文名称（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的中文名称）
     */
    public String getApplyRhBloodCn() {
        return applyRhBloodCn;
    }

    /**
     * 设置申请 Rh 血型中文名称（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的中文名称）
     *
     * @param applyRhBloodCn 申请 Rh 血型中文名称（为患者申请的并实际输入的与患者本人相同的 Rh血型类别在特定编码体系中的中文名称）
     */
    public void setApplyRhBloodCn(String applyRhBloodCn) {
        this.applyRhBloodCn = applyRhBloodCn == null ? null : applyRhBloodCn.trim();
    }

    /**
     * 获取输血指征（受血者接受输血治疗的指征描述）
     *
     * @return TRANSFUSION_INDICATION - 输血指征（受血者接受输血治疗的指征描述）
     */
    public String getTransfusionIndication() {
        return transfusionIndication;
    }

    /**
     * 设置输血指征（受血者接受输血治疗的指征描述）
     *
     * @param transfusionIndication 输血指征（受血者接受输血治疗的指征描述）
     */
    public void setTransfusionIndication(String transfusionIndication) {
        this.transfusionIndication = transfusionIndication == null ? null : transfusionIndication.trim();
    }

    /**
     * 获取输血过程记录（对患者输血过程的详细描述）
     *
     * @return TRANSFUSION_PROCESS_DESC - 输血过程记录（对患者输血过程的详细描述）
     */
    public String getTransfusionProcessDesc() {
        return transfusionProcessDesc;
    }

    /**
     * 设置输血过程记录（对患者输血过程的详细描述）
     *
     * @param transfusionProcessDesc 输血过程记录（对患者输血过程的详细描述）
     */
    public void setTransfusionProcessDesc(String transfusionProcessDesc) {
        this.transfusionProcessDesc = transfusionProcessDesc == null ? null : transfusionProcessDesc.trim();
    }

    /**
     * 获取输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     *
     * @return TRANSFUSION_CODE - 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    public String getTransfusionCode() {
        return transfusionCode;
    }

    /**
     * 设置输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     *
     * @param transfusionCode 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    public void setTransfusionCode(String transfusionCode) {
        this.transfusionCode = transfusionCode == null ? null : transfusionCode.trim();
    }

    /**
     * 获取输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     *
     * @return TRANSFUSION_CN - 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    public String getTransfusionCn() {
        return transfusionCn;
    }

    /**
     * 设置输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     *
     * @param transfusionCn 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    public void setTransfusionCn(String transfusionCn) {
        this.transfusionCn = transfusionCn == null ? null : transfusionCn.trim();
    }

    /**
     * 获取血袋编码（按照特定编码规则赋予血袋的顺序号）
     *
     * @return BAGS_CODING - 血袋编码（按照特定编码规则赋予血袋的顺序号）
     */
    public String getBagsCoding() {
        return bagsCoding;
    }

    /**
     * 设置血袋编码（按照特定编码规则赋予血袋的顺序号）
     *
     * @param bagsCoding 血袋编码（按照特定编码规则赋予血袋的顺序号）
     */
    public void setBagsCoding(String bagsCoding) {
        this.bagsCoding = bagsCoding == null ? null : bagsCoding.trim();
    }

    /**
     * 获取输血量（输入红细胞、血小板、血浆、全血等的数量）
     *
     * @return BLOOD - 输血量（输入红细胞、血小板、血浆、全血等的数量）
     */
    public BigDecimal getBlood() {
        return blood;
    }

    /**
     * 设置输血量（输入红细胞、血小板、血浆、全血等的数量）
     *
     * @param blood 输血量（输入红细胞、血小板、血浆、全血等的数量）
     */
    public void setBlood(BigDecimal blood) {
        this.blood = blood;
    }

    /**
     * 获取输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     *
     * @return TRANSFUSION_UNIT - 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    public String getTransfusionUnit() {
        return transfusionUnit;
    }

    /**
     * 设置输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     *
     * @param transfusionUnit 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    public void setTransfusionUnit(String transfusionUnit) {
        this.transfusionUnit = transfusionUnit == null ? null : transfusionUnit.trim();
    }

    /**
     * 获取输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @return TRANSFUSION_REACTION_MARK - 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public String getTransfusionReactionMark() {
        return transfusionReactionMark;
    }

    /**
     * 设置输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @param transfusionReactionMark 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public void setTransfusionReactionMark(String transfusionReactionMark) {
        this.transfusionReactionMark = transfusionReactionMark == null ? null : transfusionReactionMark.trim();
    }

    /**
     * 获取输血反应类型代码CV05.01.040（患者发生输血反应的分类在特定编码体系中的代码）
     *
     * @return TRANSFUSION_REACTION_TYPE - 输血反应类型代码CV05.01.040（患者发生输血反应的分类在特定编码体系中的代码）
     */
    public String getTransfusionReactionType() {
        return transfusionReactionType;
    }

    /**
     * 设置输血反应类型代码CV05.01.040（患者发生输血反应的分类在特定编码体系中的代码）
     *
     * @param transfusionReactionType 输血反应类型代码CV05.01.040（患者发生输血反应的分类在特定编码体系中的代码）
     */
    public void setTransfusionReactionType(String transfusionReactionType) {
        this.transfusionReactionType = transfusionReactionType == null ? null : transfusionReactionType.trim();
    }

    /**
     * 获取输血反应类型名称（患者发生输血反应的分类在特定编码体系中的名称）
     *
     * @return TRANSFUSION_REACTION_NAME - 输血反应类型名称（患者发生输血反应的分类在特定编码体系中的名称）
     */
    public String getTransfusionReactionName() {
        return transfusionReactionName;
    }

    /**
     * 设置输血反应类型名称（患者发生输血反应的分类在特定编码体系中的名称）
     *
     * @param transfusionReactionName 输血反应类型名称（患者发生输血反应的分类在特定编码体系中的名称）
     */
    public void setTransfusionReactionName(String transfusionReactionName) {
        this.transfusionReactionName = transfusionReactionName == null ? null : transfusionReactionName.trim();
    }

    /**
     * 获取输血次数（输血次数的累计值）
     *
     * @return TRANSFUSION_COUNT - 输血次数（输血次数的累计值）
     */
    public BigDecimal getTransfusionCount() {
        return transfusionCount;
    }

    /**
     * 设置输血次数（输血次数的累计值）
     *
     * @param transfusionCount 输血次数（输血次数的累计值）
     */
    public void setTransfusionCount(BigDecimal transfusionCount) {
        this.transfusionCount = transfusionCount;
    }

    /**
     * 获取输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     *
     * @return BLOOD_TRANSF_DATE - 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    public String getBloodTransfDate() {
        return bloodTransfDate;
    }

    /**
     * 设置输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     *
     * @param bloodTransfDate 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    public void setBloodTransfDate(String bloodTransfDate) {
        this.bloodTransfDate = bloodTransfDate == null ? null : bloodTransfDate.trim();
    }

    /**
     * 获取输血原因（表示本次输血的原因）
     *
     * @return BLOOD_TRANSF_CAUSE - 输血原因（表示本次输血的原因）
     */
    public String getBloodTransfCause() {
        return bloodTransfCause;
    }

    /**
     * 设置输血原因（表示本次输血的原因）
     *
     * @param bloodTransfCause 输血原因（表示本次输血的原因）
     */
    public void setBloodTransfCause(String bloodTransfCause) {
        this.bloodTransfCause = bloodTransfCause == null ? null : bloodTransfCause.trim();
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