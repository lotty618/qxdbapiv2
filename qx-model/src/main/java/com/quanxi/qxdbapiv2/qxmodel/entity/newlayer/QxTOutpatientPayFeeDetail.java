package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_PAY_FEE_DETAIL")
public class QxTOutpatientPayFeeDetail {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 诊断唯一标识
     */
    @Id
    @Column(name = "OPFDUID")
    private String opfduid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private String qid;

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
     * 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 费用明细序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Column(name = "OUTPAT_FEE_ID")
    private String outpatFeeId;

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
     * 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "APPLY_DOCTOR")
    private String applyDoctor;

    /**
     * 执行科室代码DIR_DEPT（执行医嘱的的医疗机构科室编码）
     */
    @Column(name = "EXEC_DEPT_CODE")
    private String execDeptCode;

    /**
     * 执行科室名称（执行医嘱的的医疗机构科室名称）
     */
    @Column(name = "EXEC_DEPT_NAME")
    private String execDeptName;

    /**
     * 执行医生（执行医嘱的医疗人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "EXEC_MAN")
    private String execMan;

    /**
     * 操作员（扣费操作人员在公安户籍部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPERATOR")
    private String operator;

    /**
     * 婴儿标志0否 1是（标识该费用是否是婴儿费用）
     */
    @Column(name = "BABY_FLAG")
    private Long babyFlag;

    /**
     * 门诊费用结算方式代码CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码）
     */
    @Column(name = "OUTPAT_SETTLE_WAY_CODE")
    private String outpatSettleWayCode;

    /**
     * 门诊费用分类代码CV07.10.001（就诊者发生的门诊费用种类在特定编码体系中的代码）
     */
    @Column(name = "OUTPAT_FEE_TYPE_CODE")
    private String outpatFeeTypeCode;

    /**
     * 门诊费用金额(元)（患者门诊就诊所发生的单项费用金额，计算方式为单价*数量，计量单位为人民币元）
     */
    @Column(name = "OUTPAT_FEE_AMOUNT")
    private BigDecimal outpatFeeAmount;

    /**
     * 医疗付款方式代码CV07.10.005（患者此次住院就医所发生费用的支付方式代码）
     */
    @Column(name = "PAY_WAY_CODE")
    private String payWayCode;

    /**
     * 价项院内代码（费用项目在本机构内部编码体系中的代码）
     */
    @Column(name = "PRICE_ITEM_LOCAL_CODE")
    private String priceItemLocalCode;

    /**
     * 价项院内名称（费用项目在本机构内部编码体系中的名称描述）
     */
    @Column(name = "PRICE_ITEM_LOCAL_NAME")
    private String priceItemLocalName;

    /**
     * 价项标准代码DIR_TREATMENT（费用项目在标准编码体系中的代码）
     */
    @Column(name = "PRICE_ITEM_STD_CODE")
    private String priceItemStdCode;

    /**
     * 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     * 单价（卫生费用的单价，计量单位为人民币元）
     */
    @Column(name = "PRICE")
    private Long price;

    /**
     * 数量（产生此项费用的数量）
     */
    @Column(name = "QUANTITY")
    private Long quantity;

    /**
     * 个人承担费用金额（因治疗疾病个人承担的费用金额，计量单位为人民币元）
     */
    @Column(name = "SELF_PAYMENT")
    private BigDecimal selfPayment;

    /**
     * 自付（门诊费用患者自付的金额）
     */
    @Column(name = "CHARGES")
    private BigDecimal charges;

    /**
     * 医保金额（门诊费用医保报销的金额）
     */
    @Column(name = "HEALTHCARE_CHARGES")
    private BigDecimal healthcareCharges;

    /**
     * 减免金额（门诊费用减免的金额）
     */
    @Column(name = "DERATE_CHARGES")
    private BigDecimal derateCharges;

    /**
     * 扣费日期（费用项目实际扣费当日的公元纪年日期）
     */
    @Column(name = "DEDUCT_FEES_DTIME")
    private String deductFeesDtime;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAST_UPD_DATE")
    private String lastUpdDate;

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
     * 获取诊断唯一标识
     *
     * @return OPFDUID - 诊断唯一标识
     */
    public String getOpfduid() {
        return opfduid;
    }

    /**
     * 设置诊断唯一标识
     *
     * @param opfduid 诊断唯一标识
     */
    public void setOpfduid(String opfduid) {
        this.opfduid = opfduid == null ? null : opfduid.trim();
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
     * 获取机构唯一标识
     *
     * @return ORGUID - 机构唯一标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构唯一标识
     *
     * @param orguid 机构唯一标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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
     * 获取结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     *
     * @param setSerNum 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取费用明细序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return OUTPAT_FEE_ID - 费用明细序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getOutpatFeeId() {
        return outpatFeeId;
    }

    /**
     * 设置费用明细序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param outpatFeeId 费用明细序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setOutpatFeeId(String outpatFeeId) {
        this.outpatFeeId = outpatFeeId == null ? null : outpatFeeId.trim();
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
     * 获取开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return APPLY_DOCTOR - 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getApplyDoctor() {
        return applyDoctor;
    }

    /**
     * 设置开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param applyDoctor 开单医生（下达医嘱的医师人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setApplyDoctor(String applyDoctor) {
        this.applyDoctor = applyDoctor == null ? null : applyDoctor.trim();
    }

    /**
     * 获取执行科室代码DIR_DEPT（执行医嘱的的医疗机构科室编码）
     *
     * @return EXEC_DEPT_CODE - 执行科室代码DIR_DEPT（执行医嘱的的医疗机构科室编码）
     */
    public String getExecDeptCode() {
        return execDeptCode;
    }

    /**
     * 设置执行科室代码DIR_DEPT（执行医嘱的的医疗机构科室编码）
     *
     * @param execDeptCode 执行科室代码DIR_DEPT（执行医嘱的的医疗机构科室编码）
     */
    public void setExecDeptCode(String execDeptCode) {
        this.execDeptCode = execDeptCode == null ? null : execDeptCode.trim();
    }

    /**
     * 获取执行科室名称（执行医嘱的的医疗机构科室名称）
     *
     * @return EXEC_DEPT_NAME - 执行科室名称（执行医嘱的的医疗机构科室名称）
     */
    public String getExecDeptName() {
        return execDeptName;
    }

    /**
     * 设置执行科室名称（执行医嘱的的医疗机构科室名称）
     *
     * @param execDeptName 执行科室名称（执行医嘱的的医疗机构科室名称）
     */
    public void setExecDeptName(String execDeptName) {
        this.execDeptName = execDeptName == null ? null : execDeptName.trim();
    }

    /**
     * 获取执行医生（执行医嘱的医疗人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return EXEC_MAN - 执行医生（执行医嘱的医疗人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getExecMan() {
        return execMan;
    }

    /**
     * 设置执行医生（执行医嘱的医疗人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param execMan 执行医生（执行医嘱的医疗人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setExecMan(String execMan) {
        this.execMan = execMan == null ? null : execMan.trim();
    }

    /**
     * 获取操作员（扣费操作人员在公安户籍部门正式登记注册的姓氏和名称）
     *
     * @return OPERATOR - 操作员（扣费操作人员在公安户籍部门正式登记注册的姓氏和名称）
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作员（扣费操作人员在公安户籍部门正式登记注册的姓氏和名称）
     *
     * @param operator 操作员（扣费操作人员在公安户籍部门正式登记注册的姓氏和名称）
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取婴儿标志0否 1是（标识该费用是否是婴儿费用）
     *
     * @return BABY_FLAG - 婴儿标志0否 1是（标识该费用是否是婴儿费用）
     */
    public Long getBabyFlag() {
        return babyFlag;
    }

    /**
     * 设置婴儿标志0否 1是（标识该费用是否是婴儿费用）
     *
     * @param babyFlag 婴儿标志0否 1是（标识该费用是否是婴儿费用）
     */
    public void setBabyFlag(Long babyFlag) {
        this.babyFlag = babyFlag;
    }

    /**
     * 获取门诊费用结算方式代码CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码）
     *
     * @return OUTPAT_SETTLE_WAY_CODE - 门诊费用结算方式代码CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码）
     */
    public String getOutpatSettleWayCode() {
        return outpatSettleWayCode;
    }

    /**
     * 设置门诊费用结算方式代码CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码）
     *
     * @param outpatSettleWayCode 门诊费用结算方式代码CV07.10.004（标识患者门诊就诊/住院治疗所发生费用的结算方式在特定编码体系中的代码）
     */
    public void setOutpatSettleWayCode(String outpatSettleWayCode) {
        this.outpatSettleWayCode = outpatSettleWayCode == null ? null : outpatSettleWayCode.trim();
    }

    /**
     * 获取门诊费用分类代码CV07.10.001（就诊者发生的门诊费用种类在特定编码体系中的代码）
     *
     * @return OUTPAT_FEE_TYPE_CODE - 门诊费用分类代码CV07.10.001（就诊者发生的门诊费用种类在特定编码体系中的代码）
     */
    public String getOutpatFeeTypeCode() {
        return outpatFeeTypeCode;
    }

    /**
     * 设置门诊费用分类代码CV07.10.001（就诊者发生的门诊费用种类在特定编码体系中的代码）
     *
     * @param outpatFeeTypeCode 门诊费用分类代码CV07.10.001（就诊者发生的门诊费用种类在特定编码体系中的代码）
     */
    public void setOutpatFeeTypeCode(String outpatFeeTypeCode) {
        this.outpatFeeTypeCode = outpatFeeTypeCode == null ? null : outpatFeeTypeCode.trim();
    }

    /**
     * 获取门诊费用金额(元)（患者门诊就诊所发生的单项费用金额，计算方式为单价*数量，计量单位为人民币元）
     *
     * @return OUTPAT_FEE_AMOUNT - 门诊费用金额(元)（患者门诊就诊所发生的单项费用金额，计算方式为单价*数量，计量单位为人民币元）
     */
    public BigDecimal getOutpatFeeAmount() {
        return outpatFeeAmount;
    }

    /**
     * 设置门诊费用金额(元)（患者门诊就诊所发生的单项费用金额，计算方式为单价*数量，计量单位为人民币元）
     *
     * @param outpatFeeAmount 门诊费用金额(元)（患者门诊就诊所发生的单项费用金额，计算方式为单价*数量，计量单位为人民币元）
     */
    public void setOutpatFeeAmount(BigDecimal outpatFeeAmount) {
        this.outpatFeeAmount = outpatFeeAmount;
    }

    /**
     * 获取医疗付款方式代码CV07.10.005（患者此次住院就医所发生费用的支付方式代码）
     *
     * @return PAY_WAY_CODE - 医疗付款方式代码CV07.10.005（患者此次住院就医所发生费用的支付方式代码）
     */
    public String getPayWayCode() {
        return payWayCode;
    }

    /**
     * 设置医疗付款方式代码CV07.10.005（患者此次住院就医所发生费用的支付方式代码）
     *
     * @param payWayCode 医疗付款方式代码CV07.10.005（患者此次住院就医所发生费用的支付方式代码）
     */
    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode == null ? null : payWayCode.trim();
    }

    /**
     * 获取价项院内代码（费用项目在本机构内部编码体系中的代码）
     *
     * @return PRICE_ITEM_LOCAL_CODE - 价项院内代码（费用项目在本机构内部编码体系中的代码）
     */
    public String getPriceItemLocalCode() {
        return priceItemLocalCode;
    }

    /**
     * 设置价项院内代码（费用项目在本机构内部编码体系中的代码）
     *
     * @param priceItemLocalCode 价项院内代码（费用项目在本机构内部编码体系中的代码）
     */
    public void setPriceItemLocalCode(String priceItemLocalCode) {
        this.priceItemLocalCode = priceItemLocalCode == null ? null : priceItemLocalCode.trim();
    }

    /**
     * 获取价项院内名称（费用项目在本机构内部编码体系中的名称描述）
     *
     * @return PRICE_ITEM_LOCAL_NAME - 价项院内名称（费用项目在本机构内部编码体系中的名称描述）
     */
    public String getPriceItemLocalName() {
        return priceItemLocalName;
    }

    /**
     * 设置价项院内名称（费用项目在本机构内部编码体系中的名称描述）
     *
     * @param priceItemLocalName 价项院内名称（费用项目在本机构内部编码体系中的名称描述）
     */
    public void setPriceItemLocalName(String priceItemLocalName) {
        this.priceItemLocalName = priceItemLocalName == null ? null : priceItemLocalName.trim();
    }

    /**
     * 获取价项标准代码DIR_TREATMENT（费用项目在标准编码体系中的代码）
     *
     * @return PRICE_ITEM_STD_CODE - 价项标准代码DIR_TREATMENT（费用项目在标准编码体系中的代码）
     */
    public String getPriceItemStdCode() {
        return priceItemStdCode;
    }

    /**
     * 设置价项标准代码DIR_TREATMENT（费用项目在标准编码体系中的代码）
     *
     * @param priceItemStdCode 价项标准代码DIR_TREATMENT（费用项目在标准编码体系中的代码）
     */
    public void setPriceItemStdCode(String priceItemStdCode) {
        this.priceItemStdCode = priceItemStdCode == null ? null : priceItemStdCode.trim();
    }

    /**
     * 获取单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @return UNIT - 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @param unit 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取单价（卫生费用的单价，计量单位为人民币元）
     *
     * @return PRICE - 单价（卫生费用的单价，计量单位为人民币元）
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置单价（卫生费用的单价，计量单位为人民币元）
     *
     * @param price 单价（卫生费用的单价，计量单位为人民币元）
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取数量（产生此项费用的数量）
     *
     * @return QUANTITY - 数量（产生此项费用的数量）
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * 设置数量（产生此项费用的数量）
     *
     * @param quantity 数量（产生此项费用的数量）
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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
     * 获取自付（门诊费用患者自付的金额）
     *
     * @return CHARGES - 自付（门诊费用患者自付的金额）
     */
    public BigDecimal getCharges() {
        return charges;
    }

    /**
     * 设置自付（门诊费用患者自付的金额）
     *
     * @param charges 自付（门诊费用患者自付的金额）
     */
    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    /**
     * 获取医保金额（门诊费用医保报销的金额）
     *
     * @return HEALTHCARE_CHARGES - 医保金额（门诊费用医保报销的金额）
     */
    public BigDecimal getHealthcareCharges() {
        return healthcareCharges;
    }

    /**
     * 设置医保金额（门诊费用医保报销的金额）
     *
     * @param healthcareCharges 医保金额（门诊费用医保报销的金额）
     */
    public void setHealthcareCharges(BigDecimal healthcareCharges) {
        this.healthcareCharges = healthcareCharges;
    }

    /**
     * 获取减免金额（门诊费用减免的金额）
     *
     * @return DERATE_CHARGES - 减免金额（门诊费用减免的金额）
     */
    public BigDecimal getDerateCharges() {
        return derateCharges;
    }

    /**
     * 设置减免金额（门诊费用减免的金额）
     *
     * @param derateCharges 减免金额（门诊费用减免的金额）
     */
    public void setDerateCharges(BigDecimal derateCharges) {
        this.derateCharges = derateCharges;
    }

    /**
     * 获取扣费日期（费用项目实际扣费当日的公元纪年日期）
     *
     * @return DEDUCT_FEES_DTIME - 扣费日期（费用项目实际扣费当日的公元纪年日期）
     */
    public String getDeductFeesDtime() {
        return deductFeesDtime;
    }

    /**
     * 设置扣费日期（费用项目实际扣费当日的公元纪年日期）
     *
     * @param deductFeesDtime 扣费日期（费用项目实际扣费当日的公元纪年日期）
     */
    public void setDeductFeesDtime(String deductFeesDtime) {
        this.deductFeesDtime = deductFeesDtime == null ? null : deductFeesDtime.trim();
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
     * 获取最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate == null ? null : lastUpdDate.trim();
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