package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_INPATIENT_EXPENSE")
public class QxTInpatientExpense {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 住院费用唯一标识
     */
    @Column(name = "IEXUID")
    private String iexuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 结算流水号[主键]（每条记录在数据库中的唯一序号）
     */
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空）
     */
    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    /**
     * 住院费用金额（元)（患者在住院期间所有项目的费用总计，计量单位为人民币元）
     */
    @Column(name = "INPATIENT_FEE_AMOUNT")
    private String inpatientFeeAmount;

    /**
     * 医保金额（住院费用医保报销的金额）
     */
    @Column(name = "INSURANCE_CHARGES")
    private BigDecimal insuranceCharges;

    /**
     * 个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     */
    @Column(name = "SELF_PAYMENT")
    private BigDecimal selfPayment;

    /**
     * 自付（住院费用患者自付的金额，计量单位为人民币元）
     */
    @Column(name = "CHARGES")
    private BigDecimal charges;

    /**
     * 减免金额（住院费用减免的金额，计量单位为人民币元）
     */
    @Column(name = "DERATE_CHARGES")
    private BigDecimal derateCharges;

    /**
     * 医疗付款方式代码CV07.10.003（患者此次住院就医所发生费用的支付方式代码）
     */
    @Column(name = "PAY_WAY_CODE")
    private String payWayCode;

    /**
     * 医疗付款方式中文名称（患者此次住院就医所发生费用的支付方式中文名称）
     */
    @Column(name = "PAY_WAY_CN")
    private String payWayCn;

    /**
     * 住院费用结算方式代码 CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码 ）
     */
    @Column(name = "INPATIENT_SETTLE_WAY_CODE")
    private String inpatientSettleWayCode;

    /**
     * 住院费用结算方式中文名称（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的中文名称）
     */
    @Column(name = "INPATIENT_SETTLE_WAY_CN")
    private String inpatientSettleWayCn;

    /**
     * 医保自费比例（住院费用医保报销的比例（单位%））
     */
    @Column(name = "CINSUR_PERCENT")
    private BigDecimal cinsurPercent;

    /**
     * 西药费（本次就诊的西药费，计量单位为人民币元）
     */
    @Column(name = "WEST_MEDICINE_FEE")
    private BigDecimal westMedicineFee;

    /**
     * 中成药费（本次就诊的中草药费，计量单位为人民币元）
     */
    @Column(name = "PROPRIETARY_CH_FEE")
    private BigDecimal proprietaryChFee;

    /**
     * 中草药费（本次就诊的中成药费，计量单位为人民币元）
     */
    @Column(name = "CH_HERBAL_MEDICINE")
    private BigDecimal chHerbalMedicine;

    /**
     * 检查费（本次就诊的检查费，计量单位为人民币元）
     */
    @Column(name = "EXAM_FEE")
    private BigDecimal examFee;

    /**
     * 治疗费（本次就诊的治疗费，计量单位为人民币元）
     */
    @Column(name = "TREATMENT_FEE")
    private BigDecimal treatmentFee;

    /**
     * 手术费（本次就诊的手术费，计量单位为人民币元）
     */
    @Column(name = "OPERATION_FEE")
    private BigDecimal operationFee;

    /**
     * 放射费（本次就诊的放射费，计量单位为人民币元）
     */
    @Column(name = "RADIATION_FEE")
    private BigDecimal radiationFee;

    /**
     * 化验费（本次就诊的化验费，计量单位为人民币元）
     */
    @Column(name = "TEST_FEE")
    private BigDecimal testFee;

    /**
     * 诊察费（本次就诊的诊察费，计量单位为人民币元）
     */
    @Column(name = "INDAGATION_FEE")
    private BigDecimal indagationFee;

    /**
     * 卫生材料费用（本次就诊的卫生材料费，计量单位为人民币元）
     */
    @Column(name = "MATERIAL_FEE")
    private BigDecimal materialFee;

    /**
     * 其他费用（本次就诊的其他费，计量单位为人民币元）
     */
    @Column(name = "OTHER_FEE")
    private BigDecimal otherFee;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

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
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

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
     * 获取序列号
     *
     * @return SID - 序列号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置序列号
     *
     * @param sid 序列号
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取住院费用唯一标识
     *
     * @return IEXUID - 住院费用唯一标识
     */
    public String getIexuid() {
        return iexuid;
    }

    /**
     * 设置住院费用唯一标识
     *
     * @param iexuid 住院费用唯一标识
     */
    public void setIexuid(String iexuid) {
        this.iexuid = iexuid == null ? null : iexuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
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
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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
     * 获取结算流水号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param setSerNum 结算流水号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空）
     *
     * @return INVOICE_NO - 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空）
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 设置发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空）
     *
     * @param invoiceNo 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空）
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    /**
     * 获取住院费用金额（元)（患者在住院期间所有项目的费用总计，计量单位为人民币元）
     *
     * @return INPATIENT_FEE_AMOUNT - 住院费用金额（元)（患者在住院期间所有项目的费用总计，计量单位为人民币元）
     */
    public String getInpatientFeeAmount() {
        return inpatientFeeAmount;
    }

    /**
     * 设置住院费用金额（元)（患者在住院期间所有项目的费用总计，计量单位为人民币元）
     *
     * @param inpatientFeeAmount 住院费用金额（元)（患者在住院期间所有项目的费用总计，计量单位为人民币元）
     */
    public void setInpatientFeeAmount(String inpatientFeeAmount) {
        this.inpatientFeeAmount = inpatientFeeAmount == null ? null : inpatientFeeAmount.trim();
    }

    /**
     * 获取医保金额（住院费用医保报销的金额）
     *
     * @return INSURANCE_CHARGES - 医保金额（住院费用医保报销的金额）
     */
    public BigDecimal getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * 设置医保金额（住院费用医保报销的金额）
     *
     * @param insuranceCharges 医保金额（住院费用医保报销的金额）
     */
    public void setInsuranceCharges(BigDecimal insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    /**
     * 获取个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     *
     * @return SELF_PAYMENT - 个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     */
    public BigDecimal getSelfPayment() {
        return selfPayment;
    }

    /**
     * 设置个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     *
     * @param selfPayment 个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     */
    public void setSelfPayment(BigDecimal selfPayment) {
        this.selfPayment = selfPayment;
    }

    /**
     * 获取自付（住院费用患者自付的金额，计量单位为人民币元）
     *
     * @return CHARGES - 自付（住院费用患者自付的金额，计量单位为人民币元）
     */
    public BigDecimal getCharges() {
        return charges;
    }

    /**
     * 设置自付（住院费用患者自付的金额，计量单位为人民币元）
     *
     * @param charges 自付（住院费用患者自付的金额，计量单位为人民币元）
     */
    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    /**
     * 获取减免金额（住院费用减免的金额，计量单位为人民币元）
     *
     * @return DERATE_CHARGES - 减免金额（住院费用减免的金额，计量单位为人民币元）
     */
    public BigDecimal getDerateCharges() {
        return derateCharges;
    }

    /**
     * 设置减免金额（住院费用减免的金额，计量单位为人民币元）
     *
     * @param derateCharges 减免金额（住院费用减免的金额，计量单位为人民币元）
     */
    public void setDerateCharges(BigDecimal derateCharges) {
        this.derateCharges = derateCharges;
    }

    /**
     * 获取医疗付款方式代码CV07.10.003（患者此次住院就医所发生费用的支付方式代码）
     *
     * @return PAY_WAY_CODE - 医疗付款方式代码CV07.10.003（患者此次住院就医所发生费用的支付方式代码）
     */
    public String getPayWayCode() {
        return payWayCode;
    }

    /**
     * 设置医疗付款方式代码CV07.10.003（患者此次住院就医所发生费用的支付方式代码）
     *
     * @param payWayCode 医疗付款方式代码CV07.10.003（患者此次住院就医所发生费用的支付方式代码）
     */
    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode == null ? null : payWayCode.trim();
    }

    /**
     * 获取医疗付款方式中文名称（患者此次住院就医所发生费用的支付方式中文名称）
     *
     * @return PAY_WAY_CN - 医疗付款方式中文名称（患者此次住院就医所发生费用的支付方式中文名称）
     */
    public String getPayWayCn() {
        return payWayCn;
    }

    /**
     * 设置医疗付款方式中文名称（患者此次住院就医所发生费用的支付方式中文名称）
     *
     * @param payWayCn 医疗付款方式中文名称（患者此次住院就医所发生费用的支付方式中文名称）
     */
    public void setPayWayCn(String payWayCn) {
        this.payWayCn = payWayCn == null ? null : payWayCn.trim();
    }

    /**
     * 获取住院费用结算方式代码 CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码 ）
     *
     * @return INPATIENT_SETTLE_WAY_CODE - 住院费用结算方式代码 CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码 ）
     */
    public String getInpatientSettleWayCode() {
        return inpatientSettleWayCode;
    }

    /**
     * 设置住院费用结算方式代码 CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码 ）
     *
     * @param inpatientSettleWayCode 住院费用结算方式代码 CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码 ）
     */
    public void setInpatientSettleWayCode(String inpatientSettleWayCode) {
        this.inpatientSettleWayCode = inpatientSettleWayCode == null ? null : inpatientSettleWayCode.trim();
    }

    /**
     * 获取住院费用结算方式中文名称（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的中文名称）
     *
     * @return INPATIENT_SETTLE_WAY_CN - 住院费用结算方式中文名称（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的中文名称）
     */
    public String getInpatientSettleWayCn() {
        return inpatientSettleWayCn;
    }

    /**
     * 设置住院费用结算方式中文名称（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的中文名称）
     *
     * @param inpatientSettleWayCn 住院费用结算方式中文名称（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的中文名称）
     */
    public void setInpatientSettleWayCn(String inpatientSettleWayCn) {
        this.inpatientSettleWayCn = inpatientSettleWayCn == null ? null : inpatientSettleWayCn.trim();
    }

    /**
     * 获取医保自费比例（住院费用医保报销的比例（单位%））
     *
     * @return CINSUR_PERCENT - 医保自费比例（住院费用医保报销的比例（单位%））
     */
    public BigDecimal getCinsurPercent() {
        return cinsurPercent;
    }

    /**
     * 设置医保自费比例（住院费用医保报销的比例（单位%））
     *
     * @param cinsurPercent 医保自费比例（住院费用医保报销的比例（单位%））
     */
    public void setCinsurPercent(BigDecimal cinsurPercent) {
        this.cinsurPercent = cinsurPercent;
    }

    /**
     * 获取西药费（本次就诊的西药费，计量单位为人民币元）
     *
     * @return WEST_MEDICINE_FEE - 西药费（本次就诊的西药费，计量单位为人民币元）
     */
    public BigDecimal getWestMedicineFee() {
        return westMedicineFee;
    }

    /**
     * 设置西药费（本次就诊的西药费，计量单位为人民币元）
     *
     * @param westMedicineFee 西药费（本次就诊的西药费，计量单位为人民币元）
     */
    public void setWestMedicineFee(BigDecimal westMedicineFee) {
        this.westMedicineFee = westMedicineFee;
    }

    /**
     * 获取中成药费（本次就诊的中草药费，计量单位为人民币元）
     *
     * @return PROPRIETARY_CH_FEE - 中成药费（本次就诊的中草药费，计量单位为人民币元）
     */
    public BigDecimal getProprietaryChFee() {
        return proprietaryChFee;
    }

    /**
     * 设置中成药费（本次就诊的中草药费，计量单位为人民币元）
     *
     * @param proprietaryChFee 中成药费（本次就诊的中草药费，计量单位为人民币元）
     */
    public void setProprietaryChFee(BigDecimal proprietaryChFee) {
        this.proprietaryChFee = proprietaryChFee;
    }

    /**
     * 获取中草药费（本次就诊的中成药费，计量单位为人民币元）
     *
     * @return CH_HERBAL_MEDICINE - 中草药费（本次就诊的中成药费，计量单位为人民币元）
     */
    public BigDecimal getChHerbalMedicine() {
        return chHerbalMedicine;
    }

    /**
     * 设置中草药费（本次就诊的中成药费，计量单位为人民币元）
     *
     * @param chHerbalMedicine 中草药费（本次就诊的中成药费，计量单位为人民币元）
     */
    public void setChHerbalMedicine(BigDecimal chHerbalMedicine) {
        this.chHerbalMedicine = chHerbalMedicine;
    }

    /**
     * 获取检查费（本次就诊的检查费，计量单位为人民币元）
     *
     * @return EXAM_FEE - 检查费（本次就诊的检查费，计量单位为人民币元）
     */
    public BigDecimal getExamFee() {
        return examFee;
    }

    /**
     * 设置检查费（本次就诊的检查费，计量单位为人民币元）
     *
     * @param examFee 检查费（本次就诊的检查费，计量单位为人民币元）
     */
    public void setExamFee(BigDecimal examFee) {
        this.examFee = examFee;
    }

    /**
     * 获取治疗费（本次就诊的治疗费，计量单位为人民币元）
     *
     * @return TREATMENT_FEE - 治疗费（本次就诊的治疗费，计量单位为人民币元）
     */
    public BigDecimal getTreatmentFee() {
        return treatmentFee;
    }

    /**
     * 设置治疗费（本次就诊的治疗费，计量单位为人民币元）
     *
     * @param treatmentFee 治疗费（本次就诊的治疗费，计量单位为人民币元）
     */
    public void setTreatmentFee(BigDecimal treatmentFee) {
        this.treatmentFee = treatmentFee;
    }

    /**
     * 获取手术费（本次就诊的手术费，计量单位为人民币元）
     *
     * @return OPERATION_FEE - 手术费（本次就诊的手术费，计量单位为人民币元）
     */
    public BigDecimal getOperationFee() {
        return operationFee;
    }

    /**
     * 设置手术费（本次就诊的手术费，计量单位为人民币元）
     *
     * @param operationFee 手术费（本次就诊的手术费，计量单位为人民币元）
     */
    public void setOperationFee(BigDecimal operationFee) {
        this.operationFee = operationFee;
    }

    /**
     * 获取放射费（本次就诊的放射费，计量单位为人民币元）
     *
     * @return RADIATION_FEE - 放射费（本次就诊的放射费，计量单位为人民币元）
     */
    public BigDecimal getRadiationFee() {
        return radiationFee;
    }

    /**
     * 设置放射费（本次就诊的放射费，计量单位为人民币元）
     *
     * @param radiationFee 放射费（本次就诊的放射费，计量单位为人民币元）
     */
    public void setRadiationFee(BigDecimal radiationFee) {
        this.radiationFee = radiationFee;
    }

    /**
     * 获取化验费（本次就诊的化验费，计量单位为人民币元）
     *
     * @return TEST_FEE - 化验费（本次就诊的化验费，计量单位为人民币元）
     */
    public BigDecimal getTestFee() {
        return testFee;
    }

    /**
     * 设置化验费（本次就诊的化验费，计量单位为人民币元）
     *
     * @param testFee 化验费（本次就诊的化验费，计量单位为人民币元）
     */
    public void setTestFee(BigDecimal testFee) {
        this.testFee = testFee;
    }

    /**
     * 获取诊察费（本次就诊的诊察费，计量单位为人民币元）
     *
     * @return INDAGATION_FEE - 诊察费（本次就诊的诊察费，计量单位为人民币元）
     */
    public BigDecimal getIndagationFee() {
        return indagationFee;
    }

    /**
     * 设置诊察费（本次就诊的诊察费，计量单位为人民币元）
     *
     * @param indagationFee 诊察费（本次就诊的诊察费，计量单位为人民币元）
     */
    public void setIndagationFee(BigDecimal indagationFee) {
        this.indagationFee = indagationFee;
    }

    /**
     * 获取卫生材料费用（本次就诊的卫生材料费，计量单位为人民币元）
     *
     * @return MATERIAL_FEE - 卫生材料费用（本次就诊的卫生材料费，计量单位为人民币元）
     */
    public BigDecimal getMaterialFee() {
        return materialFee;
    }

    /**
     * 设置卫生材料费用（本次就诊的卫生材料费，计量单位为人民币元）
     *
     * @param materialFee 卫生材料费用（本次就诊的卫生材料费，计量单位为人民币元）
     */
    public void setMaterialFee(BigDecimal materialFee) {
        this.materialFee = materialFee;
    }

    /**
     * 获取其他费用（本次就诊的其他费，计量单位为人民币元）
     *
     * @return OTHER_FEE - 其他费用（本次就诊的其他费，计量单位为人民币元）
     */
    public BigDecimal getOtherFee() {
        return otherFee;
    }

    /**
     * 设置其他费用（本次就诊的其他费，计量单位为人民币元）
     *
     * @param otherFee 其他费用（本次就诊的其他费，计量单位为人民币元）
     */
    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
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
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
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
     * 获取有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
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
}