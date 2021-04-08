package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_MATERIAL_DETAIL")
public class InpatientMaterialDetail {
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
     * 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 服务项目序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    @Id
    @Column(name = "MATREIAL_FEE_ID")
    private String matreialFeeId;

    /**
     * 项目标准代码DIR_MATERIAL（费用项目在标准编码体系中的代码 ）
     */
    @Column(name = "PRICE_ITEM_STD_CODE")
    private String priceItemStdCode;

    /**
     * 项目标准名称（费用项目在标准编码体系中的中文名称）
     */
    @Column(name = "PRICE_ITEM_STD_NAME")
    private String priceItemStdName;

    /**
     * 项目院内代码（费用项目在本机构内部编码体系中的代码 ）
     */
    @Column(name = "PRICE_ITEM_LOCAL_CODE")
    private String priceItemLocalCode;

    /**
     * 项目院内名称（费用项目在本机构内部编码体系中的名称描述 ）
     */
    @Column(name = "PRICE_ITEM_LOCAL_NAME")
    private String priceItemLocalName;

    /**
     * 规格（项目的规格）
     */
    @Column(name = "SPECIFICATION")
    private String specification;

    /**
     * 计价单位（受检者定量检查/检验结果测量值的计量单位）
     */
    @Column(name = "PRICE_ITEM_UNIT")
    private String priceItemUnit;

    /**
     * 单价（卫生费用的单价，计量单位为人民币元）
     */
    @Column(name = "PRICE_ITEM_PRICE")
    private BigDecimal priceItemPrice;

    /**
     * 数量（产生此项费用的数量）
     */
    @Column(name = "PRICE_ITEM_QUANTITY")
    private BigDecimal priceItemQuantity;

    /**
     * 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    @Column(name = "FEE_AMOUNT")
    private BigDecimal feeAmount;

    /**
     * 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    @Column(name = "INSURANCE_CHARGES")
    private BigDecimal insuranceCharges;

    /**
     * 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    @Column(name = "SELF_PAYMENT")
    private BigDecimal selfPayment;

    /**
     * 备注 （需要添加的注释说明的具体内容 ）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 开单科室代码DIR_DEPT（下达医嘱的医疗机构科室编码）
     */
    @Column(name = "APPLY_DEPT_CODE")
    private String applyDeptCode;

    /**
     * 开单科室名称（下达医嘱的医疗机构科室名称）
     */
    @Column(name = "APPLY_DEPT_NAME")
    private String applyDeptName;

    /**
     * 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "APPLY_DOCTOR")
    private String applyDoctor;

    /**
     * 是否高值耗材0否 1是（标识是否为高值耗材）
     */
    @Column(name = "IS_HIGH_VALUE")
    private String isHighValue;

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
     * 获取结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     *
     * @param setSerNum 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取服务项目序列号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @return MATREIAL_FEE_ID - 服务项目序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public String getMatreialFeeId() {
        return matreialFeeId;
    }

    /**
     * 设置服务项目序列号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @param matreialFeeId 服务项目序列号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public void setMatreialFeeId(String matreialFeeId) {
        this.matreialFeeId = matreialFeeId == null ? null : matreialFeeId.trim();
    }

    /**
     * 获取项目标准代码DIR_MATERIAL（费用项目在标准编码体系中的代码 ）
     *
     * @return PRICE_ITEM_STD_CODE - 项目标准代码DIR_MATERIAL（费用项目在标准编码体系中的代码 ）
     */
    public String getPriceItemStdCode() {
        return priceItemStdCode;
    }

    /**
     * 设置项目标准代码DIR_MATERIAL（费用项目在标准编码体系中的代码 ）
     *
     * @param priceItemStdCode 项目标准代码DIR_MATERIAL（费用项目在标准编码体系中的代码 ）
     */
    public void setPriceItemStdCode(String priceItemStdCode) {
        this.priceItemStdCode = priceItemStdCode == null ? null : priceItemStdCode.trim();
    }

    /**
     * 获取项目标准名称（费用项目在标准编码体系中的中文名称）
     *
     * @return PRICE_ITEM_STD_NAME - 项目标准名称（费用项目在标准编码体系中的中文名称）
     */
    public String getPriceItemStdName() {
        return priceItemStdName;
    }

    /**
     * 设置项目标准名称（费用项目在标准编码体系中的中文名称）
     *
     * @param priceItemStdName 项目标准名称（费用项目在标准编码体系中的中文名称）
     */
    public void setPriceItemStdName(String priceItemStdName) {
        this.priceItemStdName = priceItemStdName == null ? null : priceItemStdName.trim();
    }

    /**
     * 获取项目院内代码（费用项目在本机构内部编码体系中的代码 ）
     *
     * @return PRICE_ITEM_LOCAL_CODE - 项目院内代码（费用项目在本机构内部编码体系中的代码 ）
     */
    public String getPriceItemLocalCode() {
        return priceItemLocalCode;
    }

    /**
     * 设置项目院内代码（费用项目在本机构内部编码体系中的代码 ）
     *
     * @param priceItemLocalCode 项目院内代码（费用项目在本机构内部编码体系中的代码 ）
     */
    public void setPriceItemLocalCode(String priceItemLocalCode) {
        this.priceItemLocalCode = priceItemLocalCode == null ? null : priceItemLocalCode.trim();
    }

    /**
     * 获取项目院内名称（费用项目在本机构内部编码体系中的名称描述 ）
     *
     * @return PRICE_ITEM_LOCAL_NAME - 项目院内名称（费用项目在本机构内部编码体系中的名称描述 ）
     */
    public String getPriceItemLocalName() {
        return priceItemLocalName;
    }

    /**
     * 设置项目院内名称（费用项目在本机构内部编码体系中的名称描述 ）
     *
     * @param priceItemLocalName 项目院内名称（费用项目在本机构内部编码体系中的名称描述 ）
     */
    public void setPriceItemLocalName(String priceItemLocalName) {
        this.priceItemLocalName = priceItemLocalName == null ? null : priceItemLocalName.trim();
    }

    /**
     * 获取规格（项目的规格）
     *
     * @return SPECIFICATION - 规格（项目的规格）
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 设置规格（项目的规格）
     *
     * @param specification 规格（项目的规格）
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * 获取计价单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @return PRICE_ITEM_UNIT - 计价单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public String getPriceItemUnit() {
        return priceItemUnit;
    }

    /**
     * 设置计价单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @param priceItemUnit 计价单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public void setPriceItemUnit(String priceItemUnit) {
        this.priceItemUnit = priceItemUnit == null ? null : priceItemUnit.trim();
    }

    /**
     * 获取单价（卫生费用的单价，计量单位为人民币元）
     *
     * @return PRICE_ITEM_PRICE - 单价（卫生费用的单价，计量单位为人民币元）
     */
    public BigDecimal getPriceItemPrice() {
        return priceItemPrice;
    }

    /**
     * 设置单价（卫生费用的单价，计量单位为人民币元）
     *
     * @param priceItemPrice 单价（卫生费用的单价，计量单位为人民币元）
     */
    public void setPriceItemPrice(BigDecimal priceItemPrice) {
        this.priceItemPrice = priceItemPrice;
    }

    /**
     * 获取数量（产生此项费用的数量）
     *
     * @return PRICE_ITEM_QUANTITY - 数量（产生此项费用的数量）
     */
    public BigDecimal getPriceItemQuantity() {
        return priceItemQuantity;
    }

    /**
     * 设置数量（产生此项费用的数量）
     *
     * @param priceItemQuantity 数量（产生此项费用的数量）
     */
    public void setPriceItemQuantity(BigDecimal priceItemQuantity) {
        this.priceItemQuantity = priceItemQuantity;
    }

    /**
     * 获取费用金额（元)（项目的费用金额，计量单位为人民币元）
     *
     * @return FEE_AMOUNT - 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * 设置费用金额（元)（项目的费用金额，计量单位为人民币元）
     *
     * @param feeAmount 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * 获取医保金额（该项目医保报销的金额，计量单位为人民币元）
     *
     * @return INSURANCE_CHARGES - 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    public BigDecimal getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * 设置医保金额（该项目医保报销的金额，计量单位为人民币元）
     *
     * @param insuranceCharges 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    public void setInsuranceCharges(BigDecimal insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    /**
     * 获取个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     *
     * @return SELF_PAYMENT - 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    public BigDecimal getSelfPayment() {
        return selfPayment;
    }

    /**
     * 设置个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     *
     * @param selfPayment 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    public void setSelfPayment(BigDecimal selfPayment) {
        this.selfPayment = selfPayment;
    }

    /**
     * 获取备注 （需要添加的注释说明的具体内容 ）
     *
     * @return NOTES - 备注 （需要添加的注释说明的具体内容 ）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注 （需要添加的注释说明的具体内容 ）
     *
     * @param notes 备注 （需要添加的注释说明的具体内容 ）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 获取开单科室代码DIR_DEPT（下达医嘱的医疗机构科室编码）
     *
     * @return APPLY_DEPT_CODE - 开单科室代码DIR_DEPT（下达医嘱的医疗机构科室编码）
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * 设置开单科室代码DIR_DEPT（下达医嘱的医疗机构科室编码）
     *
     * @param applyDeptCode 开单科室代码DIR_DEPT（下达医嘱的医疗机构科室编码）
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    /**
     * 获取开单科室名称（下达医嘱的医疗机构科室名称）
     *
     * @return APPLY_DEPT_NAME - 开单科室名称（下达医嘱的医疗机构科室名称）
     */
    public String getApplyDeptName() {
        return applyDeptName;
    }

    /**
     * 设置开单科室名称（下达医嘱的医疗机构科室名称）
     *
     * @param applyDeptName 开单科室名称（下达医嘱的医疗机构科室名称）
     */
    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName == null ? null : applyDeptName.trim();
    }

    /**
     * 获取开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return APPLY_DOCTOR - 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getApplyDoctor() {
        return applyDoctor;
    }

    /**
     * 设置开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param applyDoctor 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setApplyDoctor(String applyDoctor) {
        this.applyDoctor = applyDoctor == null ? null : applyDoctor.trim();
    }

    /**
     * 获取是否高值耗材0否 1是（标识是否为高值耗材）
     *
     * @return IS_HIGH_VALUE - 是否高值耗材0否 1是（标识是否为高值耗材）
     */
    public String getIsHighValue() {
        return isHighValue;
    }

    /**
     * 设置是否高值耗材0否 1是（标识是否为高值耗材）
     *
     * @param isHighValue 是否高值耗材0否 1是（标识是否为高值耗材）
     */
    public void setIsHighValue(String isHighValue) {
        this.isHighValue = isHighValue == null ? null : isHighValue.trim();
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