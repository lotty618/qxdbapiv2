package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_EQUIP")
public class OrgEquip {
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    @Id
    @Column(name = "EQUIP_NUMBER")
    private String equipNumber;

    @Column(name = "DOCUMENT_NO")
    private String documentNo;

    @Column(name = "CONTRACT_NO")
    private String contractNo;

    @Column(name = "EQUIP_CODE")
    private String equipCode;

    @Column(name = "EQUIP_SPEC")
    private String equipSpec;

    @Column(name = "EQUIP_MODEL")
    private String equipModel;

    @Column(name = "EQUIP_UNIT")
    private String equipUnit;

    @Column(name = "FIRM_ID")
    private String firmId;

    @Column(name = "EQUIP_TYPE")
    private String equipType;

    @Column(name = "INITIAL_VALUE")
    private String initialValue;

    @Column(name = "FUND_SOURCE")
    private String fundSource;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_CODE_DEPR")
    private String deptCodeDepr;

    @Column(name = "PRODUCE_DATE")
    private String produceDate;

    @Column(name = "START_USE_DATE")
    private String startUseDate;

    @Column(name = "USE_YEARS_LIMITED")
    private String useYearsLimited;

    @Column(name = "USE_LIMITED_UNIT")
    private String useLimitedUnit;

    @Column(name = "QUALITY_GRAND")
    private String qualityGrand;

    @Column(name = "DEPR_MEAN")
    private String deprMean;

    @Column(name = "DEPR_PER_YEAR")
    private String deprPerYear;

    @Column(name = "DEPR_SUM")
    private String deprSum;

    @Column(name = "REPAIR_INDICATOR")
    private String repairIndicator;

    @Column(name = "USE_STATUS")
    private String useStatus;

    @Column(name = "CREA_DOCU_DATE")
    private String creaDocuDate;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "REMAINED_VALUE")
    private String remainedValue;

    @Column(name = "KEEPER")
    private String keeper;

    @Column(name = "FIXING_FEE")
    private String fixingFee;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "EFFECTIVE")
    private String effective;

    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * @return QID
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * @param qid
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * @return EQUIP_NUMBER
     */
    public String getEquipNumber() {
        return equipNumber;
    }

    /**
     * @param equipNumber
     */
    public void setEquipNumber(String equipNumber) {
        this.equipNumber = equipNumber == null ? null : equipNumber.trim();
    }

    /**
     * @return DOCUMENT_NO
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * @param documentNo
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo == null ? null : documentNo.trim();
    }

    /**
     * @return CONTRACT_NO
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * @param contractNo
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * @return EQUIP_CODE
     */
    public String getEquipCode() {
        return equipCode;
    }

    /**
     * @param equipCode
     */
    public void setEquipCode(String equipCode) {
        this.equipCode = equipCode == null ? null : equipCode.trim();
    }

    /**
     * @return EQUIP_SPEC
     */
    public String getEquipSpec() {
        return equipSpec;
    }

    /**
     * @param equipSpec
     */
    public void setEquipSpec(String equipSpec) {
        this.equipSpec = equipSpec == null ? null : equipSpec.trim();
    }

    /**
     * @return EQUIP_MODEL
     */
    public String getEquipModel() {
        return equipModel;
    }

    /**
     * @param equipModel
     */
    public void setEquipModel(String equipModel) {
        this.equipModel = equipModel == null ? null : equipModel.trim();
    }

    /**
     * @return EQUIP_UNIT
     */
    public String getEquipUnit() {
        return equipUnit;
    }

    /**
     * @param equipUnit
     */
    public void setEquipUnit(String equipUnit) {
        this.equipUnit = equipUnit == null ? null : equipUnit.trim();
    }

    /**
     * @return FIRM_ID
     */
    public String getFirmId() {
        return firmId;
    }

    /**
     * @param firmId
     */
    public void setFirmId(String firmId) {
        this.firmId = firmId == null ? null : firmId.trim();
    }

    /**
     * @return EQUIP_TYPE
     */
    public String getEquipType() {
        return equipType;
    }

    /**
     * @param equipType
     */
    public void setEquipType(String equipType) {
        this.equipType = equipType == null ? null : equipType.trim();
    }

    /**
     * @return INITIAL_VALUE
     */
    public String getInitialValue() {
        return initialValue;
    }

    /**
     * @param initialValue
     */
    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue == null ? null : initialValue.trim();
    }

    /**
     * @return FUND_SOURCE
     */
    public String getFundSource() {
        return fundSource;
    }

    /**
     * @param fundSource
     */
    public void setFundSource(String fundSource) {
        this.fundSource = fundSource == null ? null : fundSource.trim();
    }

    /**
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * @return DEPT_CODE_DEPR
     */
    public String getDeptCodeDepr() {
        return deptCodeDepr;
    }

    /**
     * @param deptCodeDepr
     */
    public void setDeptCodeDepr(String deptCodeDepr) {
        this.deptCodeDepr = deptCodeDepr == null ? null : deptCodeDepr.trim();
    }

    /**
     * @return PRODUCE_DATE
     */
    public String getProduceDate() {
        return produceDate;
    }

    /**
     * @param produceDate
     */
    public void setProduceDate(String produceDate) {
        this.produceDate = produceDate == null ? null : produceDate.trim();
    }

    /**
     * @return START_USE_DATE
     */
    public String getStartUseDate() {
        return startUseDate;
    }

    /**
     * @param startUseDate
     */
    public void setStartUseDate(String startUseDate) {
        this.startUseDate = startUseDate == null ? null : startUseDate.trim();
    }

    /**
     * @return USE_YEARS_LIMITED
     */
    public String getUseYearsLimited() {
        return useYearsLimited;
    }

    /**
     * @param useYearsLimited
     */
    public void setUseYearsLimited(String useYearsLimited) {
        this.useYearsLimited = useYearsLimited == null ? null : useYearsLimited.trim();
    }

    /**
     * @return USE_LIMITED_UNIT
     */
    public String getUseLimitedUnit() {
        return useLimitedUnit;
    }

    /**
     * @param useLimitedUnit
     */
    public void setUseLimitedUnit(String useLimitedUnit) {
        this.useLimitedUnit = useLimitedUnit == null ? null : useLimitedUnit.trim();
    }

    /**
     * @return QUALITY_GRAND
     */
    public String getQualityGrand() {
        return qualityGrand;
    }

    /**
     * @param qualityGrand
     */
    public void setQualityGrand(String qualityGrand) {
        this.qualityGrand = qualityGrand == null ? null : qualityGrand.trim();
    }

    /**
     * @return DEPR_MEAN
     */
    public String getDeprMean() {
        return deprMean;
    }

    /**
     * @param deprMean
     */
    public void setDeprMean(String deprMean) {
        this.deprMean = deprMean == null ? null : deprMean.trim();
    }

    /**
     * @return DEPR_PER_YEAR
     */
    public String getDeprPerYear() {
        return deprPerYear;
    }

    /**
     * @param deprPerYear
     */
    public void setDeprPerYear(String deprPerYear) {
        this.deprPerYear = deprPerYear == null ? null : deprPerYear.trim();
    }

    /**
     * @return DEPR_SUM
     */
    public String getDeprSum() {
        return deprSum;
    }

    /**
     * @param deprSum
     */
    public void setDeprSum(String deprSum) {
        this.deprSum = deprSum == null ? null : deprSum.trim();
    }

    /**
     * @return REPAIR_INDICATOR
     */
    public String getRepairIndicator() {
        return repairIndicator;
    }

    /**
     * @param repairIndicator
     */
    public void setRepairIndicator(String repairIndicator) {
        this.repairIndicator = repairIndicator == null ? null : repairIndicator.trim();
    }

    /**
     * @return USE_STATUS
     */
    public String getUseStatus() {
        return useStatus;
    }

    /**
     * @param useStatus
     */
    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus == null ? null : useStatus.trim();
    }

    /**
     * @return CREA_DOCU_DATE
     */
    public String getCreaDocuDate() {
        return creaDocuDate;
    }

    /**
     * @param creaDocuDate
     */
    public void setCreaDocuDate(String creaDocuDate) {
        this.creaDocuDate = creaDocuDate == null ? null : creaDocuDate.trim();
    }

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return REMAINED_VALUE
     */
    public String getRemainedValue() {
        return remainedValue;
    }

    /**
     * @param remainedValue
     */
    public void setRemainedValue(String remainedValue) {
        this.remainedValue = remainedValue == null ? null : remainedValue.trim();
    }

    /**
     * @return KEEPER
     */
    public String getKeeper() {
        return keeper;
    }

    /**
     * @param keeper
     */
    public void setKeeper(String keeper) {
        this.keeper = keeper == null ? null : keeper.trim();
    }

    /**
     * @return FIXING_FEE
     */
    public String getFixingFee() {
        return fixingFee;
    }

    /**
     * @param fixingFee
     */
    public void setFixingFee(String fixingFee) {
        this.fixingFee = fixingFee == null ? null : fixingFee.trim();
    }

    /**
     * @return CURRENCY
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * @return EFFECTIVE
     */
    public String getEffective() {
        return effective;
    }

    /**
     * @param effective
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * @return SYSUP_TIME
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * @param sysupTime
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * @return SYSCR_TIME
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * @param syscrTime
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
    }
}