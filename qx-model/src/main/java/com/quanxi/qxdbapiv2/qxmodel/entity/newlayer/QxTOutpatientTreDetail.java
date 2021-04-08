package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_TRE_DETAIL")
public class QxTOutpatientTreDetail {
    /**
     * 自增ID——序列号
     */
    @Id
    @Column(name = "SID")
    private BigDecimal sid;

    /**
     * 处置明细信息唯一标识
     */
    @Column(name = "PRDUID")
    private String prduid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 自增ID——新建层应用到原始层唯一主键
     */
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 医技编号[主键]（约束引用OUTPATIENT_TREATMENT的TREATMENT_NO按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    @Column(name = "TREATMENT_NO")
    private String treatmentNo;

    /**
     * 医技明细序号[主键]（按照某一特定编码规则赋予门(急)诊医技明细的顺序号）
     */
    @Column(name = "TREATMENT_DETAIL_NO")
    private String treatmentDetailNo;

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
     * 医技类别代码（医技类别在特定体系中的代码）
     */
    @Column(name = "TRE_CLASS_TYPE_CODE")
    private String treClassTypeCode;

    /**
     * 医技类别名称（医技类别在特定体系中的名称）
     */
    @Column(name = "TRE_CLASS_TYPE_NAME")
    private String treClassTypeName;

    /**
     * 医技代码（医技代码在特定编码体系中的代码）
     */
    @Column(name = "TREATMENT_CODE")
    private String treatmentCode;

    /**
     * 医技名称（医技名称在特定体系中的名称）
     */
    @Column(name = "TREATMENT_NAME")
    private String treatmentName;

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
     * 医技开立日期（门(急)诊医师开具医技当日的公元纪日期的完整描述）
     */
    @Column(name = "APPLY_TIME")
    private String applyTime;

    /**
     * 医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "APPLY_OPERATOR")
    private String applyOperator;

    /**
     * 医疗数量
     */
    @Column(name = "TRE_QUANTITY")
    private String treQuantity;

    /**
     * 医疗单价
     */
    @Column(name = "TRE_PRICE")
    private BigDecimal trePrice;

    /**
     * 金额（医技金额）
     */
    @Column(name = "COST")
    private BigDecimal cost;

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
     * 是否无效
     */
    @Column(name = "IS_INVALID")
    private Short isInvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "IS_DEL")
    private Short isDel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 备注
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 数量单位
     */
    @Column(name = "QUANTITY_UNIT")
    private String quantityUnit;

    /**
     * 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "APPLY_OPERATOR_CODE")
    private String applyOperatorCode;

    /**
     * 获取自增ID——序列号
     *
     * @return SID - 自增ID——序列号
     */
    public BigDecimal getSid() {
        return sid;
    }

    /**
     * 设置自增ID——序列号
     *
     * @param sid 自增ID——序列号
     */
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    /**
     * 获取处置明细信息唯一标识
     *
     * @return PRDUID - 处置明细信息唯一标识
     */
    public String getPrduid() {
        return prduid;
    }

    /**
     * 设置处置明细信息唯一标识
     *
     * @param prduid 处置明细信息唯一标识
     */
    public void setPrduid(String prduid) {
        this.prduid = prduid == null ? null : prduid.trim();
    }

    /**
     * 获取门诊记录唯一标识
     *
     * @return PNUID - 门诊记录唯一标识
     */
    public String getPnuid() {
        return pnuid;
    }

    /**
     * 设置门诊记录唯一标识
     *
     * @param pnuid 门诊记录唯一标识
     */
    public void setPnuid(String pnuid) {
        this.pnuid = pnuid == null ? null : pnuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取自增ID——新建层应用到原始层唯一主键
     *
     * @return QID - 自增ID——新建层应用到原始层唯一主键
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * 设置自增ID——新建层应用到原始层唯一主键
     *
     * @param qid 自增ID——新建层应用到原始层唯一主键
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
     * 获取医技编号[主键]（约束引用OUTPATIENT_TREATMENT的TREATMENT_NO按照某一特定编码规则赋予门(急)诊医技的顺序号）
     *
     * @return TREATMENT_NO - 医技编号[主键]（约束引用OUTPATIENT_TREATMENT的TREATMENT_NO按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    public String getTreatmentNo() {
        return treatmentNo;
    }

    /**
     * 设置医技编号[主键]（约束引用OUTPATIENT_TREATMENT的TREATMENT_NO按照某一特定编码规则赋予门(急)诊医技的顺序号）
     *
     * @param treatmentNo 医技编号[主键]（约束引用OUTPATIENT_TREATMENT的TREATMENT_NO按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo == null ? null : treatmentNo.trim();
    }

    /**
     * 获取医技明细序号[主键]（按照某一特定编码规则赋予门(急)诊医技明细的顺序号）
     *
     * @return TREATMENT_DETAIL_NO - 医技明细序号[主键]（按照某一特定编码规则赋予门(急)诊医技明细的顺序号）
     */
    public String getTreatmentDetailNo() {
        return treatmentDetailNo;
    }

    /**
     * 设置医技明细序号[主键]（按照某一特定编码规则赋予门(急)诊医技明细的顺序号）
     *
     * @param treatmentDetailNo 医技明细序号[主键]（按照某一特定编码规则赋予门(急)诊医技明细的顺序号）
     */
    public void setTreatmentDetailNo(String treatmentDetailNo) {
        this.treatmentDetailNo = treatmentDetailNo == null ? null : treatmentDetailNo.trim();
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
     * 获取医技类别代码（医技类别在特定体系中的代码）
     *
     * @return TRE_CLASS_TYPE_CODE - 医技类别代码（医技类别在特定体系中的代码）
     */
    public String getTreClassTypeCode() {
        return treClassTypeCode;
    }

    /**
     * 设置医技类别代码（医技类别在特定体系中的代码）
     *
     * @param treClassTypeCode 医技类别代码（医技类别在特定体系中的代码）
     */
    public void setTreClassTypeCode(String treClassTypeCode) {
        this.treClassTypeCode = treClassTypeCode == null ? null : treClassTypeCode.trim();
    }

    /**
     * 获取医技类别名称（医技类别在特定体系中的名称）
     *
     * @return TRE_CLASS_TYPE_NAME - 医技类别名称（医技类别在特定体系中的名称）
     */
    public String getTreClassTypeName() {
        return treClassTypeName;
    }

    /**
     * 设置医技类别名称（医技类别在特定体系中的名称）
     *
     * @param treClassTypeName 医技类别名称（医技类别在特定体系中的名称）
     */
    public void setTreClassTypeName(String treClassTypeName) {
        this.treClassTypeName = treClassTypeName == null ? null : treClassTypeName.trim();
    }

    /**
     * 获取医技代码（医技代码在特定编码体系中的代码）
     *
     * @return TREATMENT_CODE - 医技代码（医技代码在特定编码体系中的代码）
     */
    public String getTreatmentCode() {
        return treatmentCode;
    }

    /**
     * 设置医技代码（医技代码在特定编码体系中的代码）
     *
     * @param treatmentCode 医技代码（医技代码在特定编码体系中的代码）
     */
    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode == null ? null : treatmentCode.trim();
    }

    /**
     * 获取医技名称（医技名称在特定体系中的名称）
     *
     * @return TREATMENT_NAME - 医技名称（医技名称在特定体系中的名称）
     */
    public String getTreatmentName() {
        return treatmentName;
    }

    /**
     * 设置医技名称（医技名称在特定体系中的名称）
     *
     * @param treatmentName 医技名称（医技名称在特定体系中的名称）
     */
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName == null ? null : treatmentName.trim();
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
     * 获取医技开立日期（门(急)诊医师开具医技当日的公元纪日期的完整描述）
     *
     * @return APPLY_TIME - 医技开立日期（门(急)诊医师开具医技当日的公元纪日期的完整描述）
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 设置医技开立日期（门(急)诊医师开具医技当日的公元纪日期的完整描述）
     *
     * @param applyTime 医技开立日期（门(急)诊医师开具医技当日的公元纪日期的完整描述）
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    /**
     * 获取医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return APPLY_OPERATOR - 医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getApplyOperator() {
        return applyOperator;
    }

    /**
     * 设置医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param applyOperator 医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setApplyOperator(String applyOperator) {
        this.applyOperator = applyOperator == null ? null : applyOperator.trim();
    }

    /**
     * 获取医疗数量
     *
     * @return TRE_QUANTITY - 医疗数量
     */
    public String getTreQuantity() {
        return treQuantity;
    }

    /**
     * 设置医疗数量
     *
     * @param treQuantity 医疗数量
     */
    public void setTreQuantity(String treQuantity) {
        this.treQuantity = treQuantity == null ? null : treQuantity.trim();
    }

    /**
     * 获取医疗单价
     *
     * @return TRE_PRICE - 医疗单价
     */
    public BigDecimal getTrePrice() {
        return trePrice;
    }

    /**
     * 设置医疗单价
     *
     * @param trePrice 医疗单价
     */
    public void setTrePrice(BigDecimal trePrice) {
        this.trePrice = trePrice;
    }

    /**
     * 获取金额（医技金额）
     *
     * @return COST - 金额（医技金额）
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置金额（医技金额）
     *
     * @param cost 金额（医技金额）
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
     * 获取是否无效
     *
     * @return IS_INVALID - 是否无效
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isInvalid 是否无效
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return IS_DEL - 是否逻辑删除
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isDel 是否逻辑删除
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * 获取备注
     *
     * @return NOTES - 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注
     *
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 获取数量单位
     *
     * @return QUANTITY_UNIT - 数量单位
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * 设置数量单位
     *
     * @param quantityUnit 数量单位
     */
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit == null ? null : quantityUnit.trim();
    }

    /**
     * 获取医技开立医师代码（医疗服务人员在院内的唯一编号）
     *
     * @return APPLY_OPERATOR_CODE - 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    public String getApplyOperatorCode() {
        return applyOperatorCode;
    }

    /**
     * 设置医技开立医师代码（医疗服务人员在院内的唯一编号）
     *
     * @param applyOperatorCode 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    public void setApplyOperatorCode(String applyOperatorCode) {
        this.applyOperatorCode = applyOperatorCode == null ? null : applyOperatorCode.trim();
    }
}