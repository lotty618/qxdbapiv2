package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_PRESCRIPTION_DETAIL")
public class OutpatientPrescriptionDetail {
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
     * 处方编号[主键]（约束引用OUTPATIENT_PRESCRIPTION的PRESCRIPTION_NO按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    @Id
    @Column(name = "PRESCRIPTION_NO")
    private String prescriptionNo;

    /**
     * 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    @Id
    @Column(name = "PRESCRIPTION_DETAIL_NO")
    private String prescriptionDetailNo;

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
     * 药品代码DRUG(对应药品信息的药品代码)
     */
    @Column(name = "DRUG_CODE")
    private String drugCode;

    /**
     * 药品名称DRUG(对应药品信息的药品名称)
     */
    @Column(name = "DRUG_NAME")
    private String drugName;

    /**
     * 药物类型代码(药物的类型在编码体系中的代码)
     */
    @Column(name = "DRUG_CLASSCODE")
    private String drugClasscode;

    /**
     * 药物类型名称(药物的类型在编码体系中的名称)
     */
    @Column(name = "DRUG_CLASSNAME")
    private String drugClassname;

    /**
     * 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    @Column(name = "DRUG_DOSECODE")
    private String drugDosecode;

    /**
     * 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    @Column(name = "DRUG_DOSENAME")
    private String drugDosename;

    /**
     * 用药天数(持续用药的合计天数，计量单位为d)
     */
    @Column(name = "DRUG_DAY")
    private String drugDay;

    /**
     * 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    @Column(name = "DRUG_FREQ_CODE")
    private String drugFreqCode;

    /**
     * 频次名称(单位时间内药物使用的次数)
     */
    @Column(name = "DRUG_FREQ_CN")
    private String drugFreqCn;

    /**
     * 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    @Column(name = "PRES_DOSE")
    private String presDose;

    /**
     * 剂量单位(药物使用的剂量单位)
     */
    @Column(name = "PRES_DOSE_UNIT")
    private String presDoseUnit;

    /**
     * 单次剂量(单次使用药物的剂量)
     */
    @Column(name = "PRES_ONE_DOSE")
    private String presOneDose;

    /**
     * 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    @Column(name = "PRES_QUANTITY")
    private String presQuantity;

    /**
     * 数量单位(药物使用的数量单位)
     */
    @Column(name = "PRES_QUANTITY_UNIT")
    private String presQuantityUnit;

    /**
     * 单次数量(单次服用的数量)
     */
    @Column(name = "PRES_ONE_QUANTITY")
    private String presOneQuantity;

    /**
     * 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    @Column(name = "PRES_ROUTE")
    private String presRoute;

    /**
     * 药物规格(药物规格的描述，如0.25g)
     */
    @Column(name = "PRES_SPEC")
    private String presSpec;

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
     * 获取处方编号[主键]（约束引用OUTPATIENT_PRESCRIPTION的PRESCRIPTION_NO按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @return PRESCRIPTION_NO - 处方编号[主键]（约束引用OUTPATIENT_PRESCRIPTION的PRESCRIPTION_NO按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    /**
     * 设置处方编号[主键]（约束引用OUTPATIENT_PRESCRIPTION的PRESCRIPTION_NO按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @param prescriptionNo 处方编号[主键]（约束引用OUTPATIENT_PRESCRIPTION的PRESCRIPTION_NO按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo == null ? null : prescriptionNo.trim();
    }

    /**
     * 获取处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     *
     * @return PRESCRIPTION_DETAIL_NO - 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    public String getPrescriptionDetailNo() {
        return prescriptionDetailNo;
    }

    /**
     * 设置处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     *
     * @param prescriptionDetailNo 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    public void setPrescriptionDetailNo(String prescriptionDetailNo) {
        this.prescriptionDetailNo = prescriptionDetailNo == null ? null : prescriptionDetailNo.trim();
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
     * 获取药品代码DRUG(对应药品信息的药品代码)
     *
     * @return DRUG_CODE - 药品代码DRUG(对应药品信息的药品代码)
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * 设置药品代码DRUG(对应药品信息的药品代码)
     *
     * @param drugCode 药品代码DRUG(对应药品信息的药品代码)
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    /**
     * 获取药品名称DRUG(对应药品信息的药品名称)
     *
     * @return DRUG_NAME - 药品名称DRUG(对应药品信息的药品名称)
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药品名称DRUG(对应药品信息的药品名称)
     *
     * @param drugName 药品名称DRUG(对应药品信息的药品名称)
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    /**
     * 获取药物类型代码(药物的类型在编码体系中的代码)
     *
     * @return DRUG_CLASSCODE - 药物类型代码(药物的类型在编码体系中的代码)
     */
    public String getDrugClasscode() {
        return drugClasscode;
    }

    /**
     * 设置药物类型代码(药物的类型在编码体系中的代码)
     *
     * @param drugClasscode 药物类型代码(药物的类型在编码体系中的代码)
     */
    public void setDrugClasscode(String drugClasscode) {
        this.drugClasscode = drugClasscode == null ? null : drugClasscode.trim();
    }

    /**
     * 获取药物类型名称(药物的类型在编码体系中的名称)
     *
     * @return DRUG_CLASSNAME - 药物类型名称(药物的类型在编码体系中的名称)
     */
    public String getDrugClassname() {
        return drugClassname;
    }

    /**
     * 设置药物类型名称(药物的类型在编码体系中的名称)
     *
     * @param drugClassname 药物类型名称(药物的类型在编码体系中的名称)
     */
    public void setDrugClassname(String drugClassname) {
        this.drugClassname = drugClassname == null ? null : drugClassname.trim();
    }

    /**
     * 获取药物剂型代码(药物剂型类别在特定编码体系中的代码)
     *
     * @return DRUG_DOSECODE - 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    public String getDrugDosecode() {
        return drugDosecode;
    }

    /**
     * 设置药物剂型代码(药物剂型类别在特定编码体系中的代码)
     *
     * @param drugDosecode 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    public void setDrugDosecode(String drugDosecode) {
        this.drugDosecode = drugDosecode == null ? null : drugDosecode.trim();
    }

    /**
     * 获取药物剂型名称(药物剂型类别在特定编码体系中的名称)
     *
     * @return DRUG_DOSENAME - 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    public String getDrugDosename() {
        return drugDosename;
    }

    /**
     * 设置药物剂型名称(药物剂型类别在特定编码体系中的名称)
     *
     * @param drugDosename 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    public void setDrugDosename(String drugDosename) {
        this.drugDosename = drugDosename == null ? null : drugDosename.trim();
    }

    /**
     * 获取用药天数(持续用药的合计天数，计量单位为d)
     *
     * @return DRUG_DAY - 用药天数(持续用药的合计天数，计量单位为d)
     */
    public String getDrugDay() {
        return drugDay;
    }

    /**
     * 设置用药天数(持续用药的合计天数，计量单位为d)
     *
     * @param drugDay 用药天数(持续用药的合计天数，计量单位为d)
     */
    public void setDrugDay(String drugDay) {
        this.drugDay = drugDay == null ? null : drugDay.trim();
    }

    /**
     * 获取频次代码(单位时间内药物使用的次数缩写)例如：QT
     *
     * @return DRUG_FREQ_CODE - 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    public String getDrugFreqCode() {
        return drugFreqCode;
    }

    /**
     * 设置频次代码(单位时间内药物使用的次数缩写)例如：QT
     *
     * @param drugFreqCode 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    public void setDrugFreqCode(String drugFreqCode) {
        this.drugFreqCode = drugFreqCode == null ? null : drugFreqCode.trim();
    }

    /**
     * 获取频次名称(单位时间内药物使用的次数)
     *
     * @return DRUG_FREQ_CN - 频次名称(单位时间内药物使用的次数)
     */
    public String getDrugFreqCn() {
        return drugFreqCn;
    }

    /**
     * 设置频次名称(单位时间内药物使用的次数)
     *
     * @param drugFreqCn 频次名称(单位时间内药物使用的次数)
     */
    public void setDrugFreqCn(String drugFreqCn) {
        this.drugFreqCn = drugFreqCn == null ? null : drugFreqCn.trim();
    }

    /**
     * 获取药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     *
     * @return PRES_DOSE - 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    public String getPresDose() {
        return presDose;
    }

    /**
     * 设置药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     *
     * @param presDose 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    public void setPresDose(String presDose) {
        this.presDose = presDose == null ? null : presDose.trim();
    }

    /**
     * 获取剂量单位(药物使用的剂量单位)
     *
     * @return PRES_DOSE_UNIT - 剂量单位(药物使用的剂量单位)
     */
    public String getPresDoseUnit() {
        return presDoseUnit;
    }

    /**
     * 设置剂量单位(药物使用的剂量单位)
     *
     * @param presDoseUnit 剂量单位(药物使用的剂量单位)
     */
    public void setPresDoseUnit(String presDoseUnit) {
        this.presDoseUnit = presDoseUnit == null ? null : presDoseUnit.trim();
    }

    /**
     * 获取单次剂量(单次使用药物的剂量)
     *
     * @return PRES_ONE_DOSE - 单次剂量(单次使用药物的剂量)
     */
    public String getPresOneDose() {
        return presOneDose;
    }

    /**
     * 设置单次剂量(单次使用药物的剂量)
     *
     * @param presOneDose 单次剂量(单次使用药物的剂量)
     */
    public void setPresOneDose(String presOneDose) {
        this.presOneDose = presOneDose == null ? null : presOneDose.trim();
    }

    /**
     * 获取总数量(服药者在一段时间内累计服用某药物的数量总计)
     *
     * @return PRES_QUANTITY - 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    public String getPresQuantity() {
        return presQuantity;
    }

    /**
     * 设置总数量(服药者在一段时间内累计服用某药物的数量总计)
     *
     * @param presQuantity 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    public void setPresQuantity(String presQuantity) {
        this.presQuantity = presQuantity == null ? null : presQuantity.trim();
    }

    /**
     * 获取数量单位(药物使用的数量单位)
     *
     * @return PRES_QUANTITY_UNIT - 数量单位(药物使用的数量单位)
     */
    public String getPresQuantityUnit() {
        return presQuantityUnit;
    }

    /**
     * 设置数量单位(药物使用的数量单位)
     *
     * @param presQuantityUnit 数量单位(药物使用的数量单位)
     */
    public void setPresQuantityUnit(String presQuantityUnit) {
        this.presQuantityUnit = presQuantityUnit == null ? null : presQuantityUnit.trim();
    }

    /**
     * 获取单次数量(单次服用的数量)
     *
     * @return PRES_ONE_QUANTITY - 单次数量(单次服用的数量)
     */
    public String getPresOneQuantity() {
        return presOneQuantity;
    }

    /**
     * 设置单次数量(单次服用的数量)
     *
     * @param presOneQuantity 单次数量(单次服用的数量)
     */
    public void setPresOneQuantity(String presOneQuantity) {
        this.presOneQuantity = presOneQuantity == null ? null : presOneQuantity.trim();
    }

    /**
     * 获取用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     *
     * @return PRES_ROUTE - 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    public String getPresRoute() {
        return presRoute;
    }

    /**
     * 设置用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     *
     * @param presRoute 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    public void setPresRoute(String presRoute) {
        this.presRoute = presRoute == null ? null : presRoute.trim();
    }

    /**
     * 获取药物规格(药物规格的描述，如0.25g)
     *
     * @return PRES_SPEC - 药物规格(药物规格的描述，如0.25g)
     */
    public String getPresSpec() {
        return presSpec;
    }

    /**
     * 设置药物规格(药物规格的描述，如0.25g)
     *
     * @param presSpec 药物规格(药物规格的描述，如0.25g)
     */
    public void setPresSpec(String presSpec) {
        this.presSpec = presSpec == null ? null : presSpec.trim();
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