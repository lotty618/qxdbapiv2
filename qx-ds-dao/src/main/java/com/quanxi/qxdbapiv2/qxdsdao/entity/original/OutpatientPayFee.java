package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_PAY_FEE")
public class OutpatientPayFee {
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
     * 结算流水号[主键]（院内唯一，每张发票对应的流水号）
     */
    @Id
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
    private Short setSou;

    /**
     * 收费识别（收费识别）
     */
    @Column(name = "CHA_REC")
    private String chaRec;

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
    public Short getSetSou() {
        return setSou;
    }

    /**
     * 设置结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     *
     * @param setSou 结算来源DIR_SETTLEMENTSOURCE（该字典为可不对照字典，上传localText，格式参考接口技术规范文档。）
     */
    public void setSetSou(Short setSou) {
        this.setSou = setSou;
    }

    /**
     * 获取收费识别（收费识别）
     *
     * @return CHA_REC - 收费识别（收费识别）
     */
    public String getChaRec() {
        return chaRec;
    }

    /**
     * 设置收费识别（收费识别）
     *
     * @param chaRec 收费识别（收费识别）
     */
    public void setChaRec(String chaRec) {
        this.chaRec = chaRec == null ? null : chaRec.trim();
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