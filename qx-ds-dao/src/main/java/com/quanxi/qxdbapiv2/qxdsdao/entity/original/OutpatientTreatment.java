package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_TREATMENT")
public class OutpatientTreatment {
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
     * 医技编号[主键]（按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    @Id
    @Column(name = "TREATMENT_NO")
    private String treatmentNo;

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
     * 金额（医技金额）
     */
    @Column(name = "COST")
    private BigDecimal cost;

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
     * 医技开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    @Column(name = "APPLY_TIME")
    private String applyTime;

    /**
     * 医技开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
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
     * 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "APPLY_OPERATOR_CODE")
    private String applyOperatorCode;

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
     * 获取医技编号[主键]（按照某一特定编码规则赋予门(急)诊医技的顺序号）
     *
     * @return TREATMENT_NO - 医技编号[主键]（按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    public String getTreatmentNo() {
        return treatmentNo;
    }

    /**
     * 设置医技编号[主键]（按照某一特定编码规则赋予门(急)诊医技的顺序号）
     *
     * @param treatmentNo 医技编号[主键]（按照某一特定编码规则赋予门(急)诊医技的顺序号）
     */
    public void setTreatmentNo(String treatmentNo) {
        this.treatmentNo = treatmentNo == null ? null : treatmentNo.trim();
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
     * 获取医技开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @return APPLY_TIME - 医技开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 设置医技开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @param applyTime 医技开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
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