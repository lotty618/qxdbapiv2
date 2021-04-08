package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BUY_PURCHASE")
public class BuyPurchase {
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    @Id
    @Column(name = "BUY_ID")
    private String buyId;

    @Id
    @Column(name = "BUY_NO")
    private String buyNo;

    @Column(name = "DRUG_CODE")
    private String drugCode;

    @Column(name = "DRUG_NAME")
    private String drugName;

    @Column(name = "DRUG_SPEC")
    private String drugSpec;

    @Column(name = "UNITS")
    private String units;

    @Column(name = "DRUG_FORM")
    private String drugForm;

    @Column(name = "TOXI_PROPERTY")
    private String toxiProperty;

    @Column(name = "DOSE_PER_UNIT")
    private String dosePerUnit;

    @Column(name = "DOSE_UNITS")
    private String doseUnits;

    @Column(name = "DRUG_INDICATOR")
    private String drugIndicator;

    @Column(name = "INPUT_CODE")
    private String inputCode;

    @Column(name = "WANT_NUMBER")
    private String wantNumber;

    @Column(name = "STORER")
    private String storer;

    @Column(name = "STOCK_NUMBER")
    private String stockNumber;

    @Column(name = "STOCK_SUPPLIER")
    private String stockSupplier;

    @Column(name = "BUYER")
    private String buyer;

    @Column(name = "CHECK_NUMBER")
    private String checkNumber;

    @Column(name = "CHECK_SUPPLIER")
    private String checkSupplier;

    @Column(name = "CHECKER")
    private String checker;

    @Column(name = "FLAG")
    private String flag;

    @Column(name = "PACK_SPEC")
    private String packSpec;

    @Column(name = "PACK_UNIT")
    private String packUnit;

    @Column(name = "FIRM_ID")
    private String firmId;

    @Column(name = "PURCHASE_PRICE")
    private String purchasePrice;

    @Column(name = "STORAGE")
    private String storage;

    @Column(name = "EXECUTED_NUMBER")
    private String executedNumber;

    @Column(name = "IMPORT_DOCUMENT")
    private String importDocument;

    @Column(name = "ISBASE")
    private String isbase;

    @Column(name = "ISCENTRALIZE")
    private String iscentralize;

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
     * @return BUY_ID
     */
    public String getBuyId() {
        return buyId;
    }

    /**
     * @param buyId
     */
    public void setBuyId(String buyId) {
        this.buyId = buyId == null ? null : buyId.trim();
    }

    /**
     * @return BUY_NO
     */
    public String getBuyNo() {
        return buyNo;
    }

    /**
     * @param buyNo
     */
    public void setBuyNo(String buyNo) {
        this.buyNo = buyNo == null ? null : buyNo.trim();
    }

    /**
     * @return DRUG_CODE
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * @param drugCode
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    /**
     * @return DRUG_NAME
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * @param drugName
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    /**
     * @return DRUG_SPEC
     */
    public String getDrugSpec() {
        return drugSpec;
    }

    /**
     * @param drugSpec
     */
    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec == null ? null : drugSpec.trim();
    }

    /**
     * @return UNITS
     */
    public String getUnits() {
        return units;
    }

    /**
     * @param units
     */
    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    /**
     * @return DRUG_FORM
     */
    public String getDrugForm() {
        return drugForm;
    }

    /**
     * @param drugForm
     */
    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm == null ? null : drugForm.trim();
    }

    /**
     * @return TOXI_PROPERTY
     */
    public String getToxiProperty() {
        return toxiProperty;
    }

    /**
     * @param toxiProperty
     */
    public void setToxiProperty(String toxiProperty) {
        this.toxiProperty = toxiProperty == null ? null : toxiProperty.trim();
    }

    /**
     * @return DOSE_PER_UNIT
     */
    public String getDosePerUnit() {
        return dosePerUnit;
    }

    /**
     * @param dosePerUnit
     */
    public void setDosePerUnit(String dosePerUnit) {
        this.dosePerUnit = dosePerUnit == null ? null : dosePerUnit.trim();
    }

    /**
     * @return DOSE_UNITS
     */
    public String getDoseUnits() {
        return doseUnits;
    }

    /**
     * @param doseUnits
     */
    public void setDoseUnits(String doseUnits) {
        this.doseUnits = doseUnits == null ? null : doseUnits.trim();
    }

    /**
     * @return DRUG_INDICATOR
     */
    public String getDrugIndicator() {
        return drugIndicator;
    }

    /**
     * @param drugIndicator
     */
    public void setDrugIndicator(String drugIndicator) {
        this.drugIndicator = drugIndicator == null ? null : drugIndicator.trim();
    }

    /**
     * @return INPUT_CODE
     */
    public String getInputCode() {
        return inputCode;
    }

    /**
     * @param inputCode
     */
    public void setInputCode(String inputCode) {
        this.inputCode = inputCode == null ? null : inputCode.trim();
    }

    /**
     * @return WANT_NUMBER
     */
    public String getWantNumber() {
        return wantNumber;
    }

    /**
     * @param wantNumber
     */
    public void setWantNumber(String wantNumber) {
        this.wantNumber = wantNumber == null ? null : wantNumber.trim();
    }

    /**
     * @return STORER
     */
    public String getStorer() {
        return storer;
    }

    /**
     * @param storer
     */
    public void setStorer(String storer) {
        this.storer = storer == null ? null : storer.trim();
    }

    /**
     * @return STOCK_NUMBER
     */
    public String getStockNumber() {
        return stockNumber;
    }

    /**
     * @param stockNumber
     */
    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber == null ? null : stockNumber.trim();
    }

    /**
     * @return STOCK_SUPPLIER
     */
    public String getStockSupplier() {
        return stockSupplier;
    }

    /**
     * @param stockSupplier
     */
    public void setStockSupplier(String stockSupplier) {
        this.stockSupplier = stockSupplier == null ? null : stockSupplier.trim();
    }

    /**
     * @return BUYER
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * @param buyer
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    /**
     * @return CHECK_NUMBER
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber
     */
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber == null ? null : checkNumber.trim();
    }

    /**
     * @return CHECK_SUPPLIER
     */
    public String getCheckSupplier() {
        return checkSupplier;
    }

    /**
     * @param checkSupplier
     */
    public void setCheckSupplier(String checkSupplier) {
        this.checkSupplier = checkSupplier == null ? null : checkSupplier.trim();
    }

    /**
     * @return CHECKER
     */
    public String getChecker() {
        return checker;
    }

    /**
     * @param checker
     */
    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    /**
     * @return FLAG
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * @return PACK_SPEC
     */
    public String getPackSpec() {
        return packSpec;
    }

    /**
     * @param packSpec
     */
    public void setPackSpec(String packSpec) {
        this.packSpec = packSpec == null ? null : packSpec.trim();
    }

    /**
     * @return PACK_UNIT
     */
    public String getPackUnit() {
        return packUnit;
    }

    /**
     * @param packUnit
     */
    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit == null ? null : packUnit.trim();
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
     * @return PURCHASE_PRICE
     */
    public String getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice
     */
    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice == null ? null : purchasePrice.trim();
    }

    /**
     * @return STORAGE
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @param storage
     */
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    /**
     * @return EXECUTED_NUMBER
     */
    public String getExecutedNumber() {
        return executedNumber;
    }

    /**
     * @param executedNumber
     */
    public void setExecutedNumber(String executedNumber) {
        this.executedNumber = executedNumber == null ? null : executedNumber.trim();
    }

    /**
     * @return IMPORT_DOCUMENT
     */
    public String getImportDocument() {
        return importDocument;
    }

    /**
     * @param importDocument
     */
    public void setImportDocument(String importDocument) {
        this.importDocument = importDocument == null ? null : importDocument.trim();
    }

    /**
     * @return ISBASE
     */
    public String getIsbase() {
        return isbase;
    }

    /**
     * @param isbase
     */
    public void setIsbase(String isbase) {
        this.isbase = isbase == null ? null : isbase.trim();
    }

    /**
     * @return ISCENTRALIZE
     */
    public String getIscentralize() {
        return iscentralize;
    }

    /**
     * @param iscentralize
     */
    public void setIscentralize(String iscentralize) {
        this.iscentralize = iscentralize == null ? null : iscentralize.trim();
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