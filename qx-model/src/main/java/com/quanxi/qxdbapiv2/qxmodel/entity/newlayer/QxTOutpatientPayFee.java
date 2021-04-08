package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_PAY_FEE")
public class QxTOutpatientPayFee {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 门诊收费唯一标识
     */
    @Id
    @Column(name = "OPFUID")
    private String opfuid;

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
     * 结算流水号[主键]（院内唯一，每张发票对应的流水号）
     */
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空。）
     */
    @Column(name = "INV_NUM")
    private String invNum;

    /**
     * 结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     */
    @Column(name = "SET_SOU")
    private BigDecimal setSou;

    /**
     * 收费识别（收费识别）
     */
    @Column(name = "CHA_REC")
    private BigDecimal chaRec;

    /**
     * 费用金额（患者门诊就诊所发生的费用金额，计量单位为元。）
     */
    @Column(name = "COST_AMOUNT")
    private BigDecimal costAmount;

    /**
     * 医保金额（患者门诊就诊发生费用中医保金额，计量单位为元。）
     */
    @Column(name = "HEALTHCARE_AMOUNT")
    private BigDecimal healthcareAmount;

    /**
     * 自费金额（患者门诊就诊发生费用中自费金额，计量单位为元。）
     */
    @Column(name = "OWN_EXP_AMOUNT")
    private BigDecimal ownExpAmount;

    /**
     * 检查费（本次就诊的检查费。）
     */
    @Column(name = "EXA_FEE")
    private BigDecimal exaFee;

    /**
     * 治疗费（本次就诊的治疗费用。）
     */
    @Column(name = "TRE_FEE")
    private BigDecimal treFee;

    /**
     * 手术费（本次就诊的手术费。）
     */
    @Column(name = "SUR_FEE")
    private BigDecimal surFee;

    /**
     * 放射费（本次就诊的放射费。）
     */
    @Column(name = "RADIO_CHA_FEE")
    private BigDecimal radioChaFee;

    /**
     * 化验费（本次就诊的化验费。）
     */
    @Column(name = "LAB_FEE")
    private BigDecimal labFee;

    /**
     * 诊察费（本次就诊的诊察费。）
     */
    @Column(name = "CHA_FEE")
    private BigDecimal chaFee;

    /**
     * 其他费（本次就诊的其他相关费用。）
     */
    @Column(name = "OTH_FEE")
    private BigDecimal othFee;

    /**
     * 中草药费（本次就诊的中草药费。）
     */
    @Column(name = "CN_HERB_MED")
    private BigDecimal cnHerbMed;

    /**
     * 中成药费（本次就诊的中成药费。）
     */
    @Column(name = "CN_MED_COSTS")
    private BigDecimal cnMedCosts;

    /**
     * 收费/退费时间（本次门诊收费/退费时间。）
     */
    @Column(name = "CHA_REF_TIME")
    private String chaRefTime;

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
     * 获取门诊收费唯一标识
     *
     * @return OPFUID - 门诊收费唯一标识
     */
    public String getOpfuid() {
        return opfuid;
    }

    /**
     * 设置门诊收费唯一标识
     *
     * @param opfuid 门诊收费唯一标识
     */
    public void setOpfuid(String opfuid) {
        this.opfuid = opfuid == null ? null : opfuid.trim();
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
     * 获取结算流水号[主键]（院内唯一，每张发票对应的流水号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]（院内唯一，每张发票对应的流水号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]（院内唯一，每张发票对应的流水号）
     *
     * @param setSerNum 结算流水号[主键]（院内唯一，每张发票对应的流水号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空。）
     *
     * @return INV_NUM - 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空。）
     */
    public String getInvNum() {
        return invNum;
    }

    /**
     * 设置发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空。）
     *
     * @param invNum 发票号码（记录费用的发票编号。存在诊间结算的情况，没有正式发票，所以发票号码可以为空。）
     */
    public void setInvNum(String invNum) {
        this.invNum = invNum == null ? null : invNum.trim();
    }

    /**
     * 获取结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     *
     * @return SET_SOU - 结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     */
    public BigDecimal getSetSou() {
        return setSou;
    }

    /**
     * 设置结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     *
     * @param setSou 结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     */
    public void setSetSou(BigDecimal setSou) {
        this.setSou = setSou;
    }

    /**
     * 获取收费识别（收费识别）
     *
     * @return CHA_REC - 收费识别（收费识别）
     */
    public BigDecimal getChaRec() {
        return chaRec;
    }

    /**
     * 设置收费识别（收费识别）
     *
     * @param chaRec 收费识别（收费识别）
     */
    public void setChaRec(BigDecimal chaRec) {
        this.chaRec = chaRec;
    }

    /**
     * 获取费用金额（患者门诊就诊所发生的费用金额，计量单位为元。）
     *
     * @return COST_AMOUNT - 费用金额（患者门诊就诊所发生的费用金额，计量单位为元。）
     */
    public BigDecimal getCostAmount() {
        return costAmount;
    }

    /**
     * 设置费用金额（患者门诊就诊所发生的费用金额，计量单位为元。）
     *
     * @param costAmount 费用金额（患者门诊就诊所发生的费用金额，计量单位为元。）
     */
    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    /**
     * 获取医保金额（患者门诊就诊发生费用中医保金额，计量单位为元。）
     *
     * @return HEALTHCARE_AMOUNT - 医保金额（患者门诊就诊发生费用中医保金额，计量单位为元。）
     */
    public BigDecimal getHealthcareAmount() {
        return healthcareAmount;
    }

    /**
     * 设置医保金额（患者门诊就诊发生费用中医保金额，计量单位为元。）
     *
     * @param healthcareAmount 医保金额（患者门诊就诊发生费用中医保金额，计量单位为元。）
     */
    public void setHealthcareAmount(BigDecimal healthcareAmount) {
        this.healthcareAmount = healthcareAmount;
    }

    /**
     * 获取自费金额（患者门诊就诊发生费用中自费金额，计量单位为元。）
     *
     * @return OWN_EXP_AMOUNT - 自费金额（患者门诊就诊发生费用中自费金额，计量单位为元。）
     */
    public BigDecimal getOwnExpAmount() {
        return ownExpAmount;
    }

    /**
     * 设置自费金额（患者门诊就诊发生费用中自费金额，计量单位为元。）
     *
     * @param ownExpAmount 自费金额（患者门诊就诊发生费用中自费金额，计量单位为元。）
     */
    public void setOwnExpAmount(BigDecimal ownExpAmount) {
        this.ownExpAmount = ownExpAmount;
    }

    /**
     * 获取检查费（本次就诊的检查费。）
     *
     * @return EXA_FEE - 检查费（本次就诊的检查费。）
     */
    public BigDecimal getExaFee() {
        return exaFee;
    }

    /**
     * 设置检查费（本次就诊的检查费。）
     *
     * @param exaFee 检查费（本次就诊的检查费。）
     */
    public void setExaFee(BigDecimal exaFee) {
        this.exaFee = exaFee;
    }

    /**
     * 获取治疗费（本次就诊的治疗费用。）
     *
     * @return TRE_FEE - 治疗费（本次就诊的治疗费用。）
     */
    public BigDecimal getTreFee() {
        return treFee;
    }

    /**
     * 设置治疗费（本次就诊的治疗费用。）
     *
     * @param treFee 治疗费（本次就诊的治疗费用。）
     */
    public void setTreFee(BigDecimal treFee) {
        this.treFee = treFee;
    }

    /**
     * 获取手术费（本次就诊的手术费。）
     *
     * @return SUR_FEE - 手术费（本次就诊的手术费。）
     */
    public BigDecimal getSurFee() {
        return surFee;
    }

    /**
     * 设置手术费（本次就诊的手术费。）
     *
     * @param surFee 手术费（本次就诊的手术费。）
     */
    public void setSurFee(BigDecimal surFee) {
        this.surFee = surFee;
    }

    /**
     * 获取放射费（本次就诊的放射费。）
     *
     * @return RADIO_CHA_FEE - 放射费（本次就诊的放射费。）
     */
    public BigDecimal getRadioChaFee() {
        return radioChaFee;
    }

    /**
     * 设置放射费（本次就诊的放射费。）
     *
     * @param radioChaFee 放射费（本次就诊的放射费。）
     */
    public void setRadioChaFee(BigDecimal radioChaFee) {
        this.radioChaFee = radioChaFee;
    }

    /**
     * 获取化验费（本次就诊的化验费。）
     *
     * @return LAB_FEE - 化验费（本次就诊的化验费。）
     */
    public BigDecimal getLabFee() {
        return labFee;
    }

    /**
     * 设置化验费（本次就诊的化验费。）
     *
     * @param labFee 化验费（本次就诊的化验费。）
     */
    public void setLabFee(BigDecimal labFee) {
        this.labFee = labFee;
    }

    /**
     * 获取诊察费（本次就诊的诊察费。）
     *
     * @return CHA_FEE - 诊察费（本次就诊的诊察费。）
     */
    public BigDecimal getChaFee() {
        return chaFee;
    }

    /**
     * 设置诊察费（本次就诊的诊察费。）
     *
     * @param chaFee 诊察费（本次就诊的诊察费。）
     */
    public void setChaFee(BigDecimal chaFee) {
        this.chaFee = chaFee;
    }

    /**
     * 获取其他费（本次就诊的其他相关费用。）
     *
     * @return OTH_FEE - 其他费（本次就诊的其他相关费用。）
     */
    public BigDecimal getOthFee() {
        return othFee;
    }

    /**
     * 设置其他费（本次就诊的其他相关费用。）
     *
     * @param othFee 其他费（本次就诊的其他相关费用。）
     */
    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    /**
     * 获取中草药费（本次就诊的中草药费。）
     *
     * @return CN_HERB_MED - 中草药费（本次就诊的中草药费。）
     */
    public BigDecimal getCnHerbMed() {
        return cnHerbMed;
    }

    /**
     * 设置中草药费（本次就诊的中草药费。）
     *
     * @param cnHerbMed 中草药费（本次就诊的中草药费。）
     */
    public void setCnHerbMed(BigDecimal cnHerbMed) {
        this.cnHerbMed = cnHerbMed;
    }

    /**
     * 获取中成药费（本次就诊的中成药费。）
     *
     * @return CN_MED_COSTS - 中成药费（本次就诊的中成药费。）
     */
    public BigDecimal getCnMedCosts() {
        return cnMedCosts;
    }

    /**
     * 设置中成药费（本次就诊的中成药费。）
     *
     * @param cnMedCosts 中成药费（本次就诊的中成药费。）
     */
    public void setCnMedCosts(BigDecimal cnMedCosts) {
        this.cnMedCosts = cnMedCosts;
    }

    /**
     * 获取收费/退费时间（本次门诊收费/退费时间。）
     *
     * @return CHA_REF_TIME - 收费/退费时间（本次门诊收费/退费时间。）
     */
    public String getChaRefTime() {
        return chaRefTime;
    }

    /**
     * 设置收费/退费时间（本次门诊收费/退费时间。）
     *
     * @param chaRefTime 收费/退费时间（本次门诊收费/退费时间。）
     */
    public void setChaRefTime(String chaRefTime) {
        this.chaRefTime = chaRefTime == null ? null : chaRefTime.trim();
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