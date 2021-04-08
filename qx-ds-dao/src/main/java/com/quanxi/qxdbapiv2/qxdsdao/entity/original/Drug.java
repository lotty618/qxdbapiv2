package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DRUG")
public class Drug {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 药品代码
     */
    @Id
    @Column(name = "DRUG_CODE")
    private String drugCode;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 药品名称
     */
    @Column(name = "DRUG_NAME")
    private String drugName;

    /**
     * 药品剂型
     */
    @Column(name = "DRUG_FORM")
    private String drugForm;

    /**
     * 药品规格
     */
    @Column(name = "DRUG_SPEC")
    private String drugSpec;

    /**
     * 药品单位
     */
    @Column(name = "DRUG_UNITS")
    private String drugUnits;

    /**
     * 医保分类
     */
    @Column(name = "INSURANCETYPE")
    private String insurancetype;

    /**
     * 药库单位
     */
    @Column(name = "DISPENSARY_UNITS")
    private String dispensaryUnits;

    /**
     * 药房单位
     */
    @Column(name = "ROOM_UNITS")
    private String roomUnits;

    /**
     * 药品属性
     */
    @Column(name = "ATTRIBUTE")
    private String attribute;

    /**
     * 生产厂商
     */
    @Column(name = "FIRM")
    private String firm;

    /**
     * 最小单位
     */
    @Column(name = "MIN_UNITS")
    private String minUnits;

    /**
     * 最小包装
     */
    @Column(name = "MIN_PACK")
    private String minPack;

    /**
     * 药房包装
     */
    @Column(name = "ROOM_PACK")
    private String roomPack;

    /**
     * 拼音代码
     */
    @Column(name = "PINYIN_CODE")
    private String pinyinCode;

    /**
     * 五笔代码
     */
    @Column(name = "WUBI_CODE")
    private String wubiCode;

    /**
     * 药品说明
     */
    @Column(name = "ILLSTRATEMED")
    private String illstratemed;

    /**
     * 定价级别
     */
    @Column(name = "PRICELEVEL")
    private String pricelevel;

    /**
     * 药品效期
     */
    @Column(name = "EXPIRYDATE")
    private String expirydate;

    /**
     * 药品类别
     */
    @Column(name = "DRUG_TYPE")
    private String drugType;

    /**
     * 药品档次
     */
    @Column(name = "DRUG_LEVEL")
    private String drugLevel;

    /**
     * 制剂判断
     */
    @Column(name = "ISPREPARATION")
    private String ispreparation;

    /**
     * 急诊用药
     */
    @Column(name = "ISEMERGENCY")
    private String isemergency;

    /**
     * 药品剂量
     */
    @Column(name = "DOSAGE")
    private String dosage;

    /**
     * 剂量单位
     */
    @Column(name = "DOSAGE_UNIT")
    private String dosageUnit;

    /**
     * 帐蒲类别
     */
    @Column(name = "ACCOUNTTYPE")
    private String accounttype;

    /**
     * ABC类别
     */
    @Column(name = "ASCTYPE")
    private String asctype;

    /**
     * 自选产地
     */
    @Column(name = "PRODUCTIONPLACE")
    private String productionplace;

    /**
     * 抗生素标志
     */
    @Column(name = "ISANTIBIOTICS")
    private String isantibiotics;

    /**
     * 抗生素等级
     */
    @Column(name = "ANTIBIOTICSLEVEL")
    private String antibioticslevel;

    /**
     * 一次用量
     */
    @Column(name = "ONCE_DOSAGE")
    private String onceDosage;

    /**
     * 一次剂量
     */
    @Column(name = "ONCE_DOSE")
    private String onceDose;

    /**
     * 最大剂量
     */
    @Column(name = "MAX_DOSE")
    private String maxDose;

    /**
     * 基本药物标志
     */
    @Column(name = "ISBASE")
    private String isbase;

    /**
     * 处方用药备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 处方药品
     */
    @Column(name = "ISPX")
    private String ispx;

    /**
     * 通用名
     */
    @Column(name = "NAMEUSUAL")
    private String nameusual;

    /**
     * 英文名
     */
    @Column(name = "NAMEENGLISH")
    private String nameenglish;

    /**
     * ATC码
     */
    @Column(name = "ATCCODE")
    private String atccode;

    /**
     * 作废判断
     */
    @Column(name = "ISABOLISH")
    private String isabolish;

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
     * 抗生素类型
     */
    @Column(name = "ANT_CLASS")
    private String antClass;

    /**
     * 抗生素类型名称
     */
    @Column(name = "ANT_CLASS_NAME")
    private String antClassName;

    /**
     * 药品分类
     */
    @Column(name = "DRUG_CLASS")
    private String drugClass;

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
     * 获取药品代码
     *
     * @return DRUG_CODE - 药品代码
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * 设置药品代码
     *
     * @param drugCode 药品代码
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    /**
     * 获取组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取药品名称
     *
     * @return DRUG_NAME - 药品名称
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药品名称
     *
     * @param drugName 药品名称
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    /**
     * 获取药品剂型
     *
     * @return DRUG_FORM - 药品剂型
     */
    public String getDrugForm() {
        return drugForm;
    }

    /**
     * 设置药品剂型
     *
     * @param drugForm 药品剂型
     */
    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm == null ? null : drugForm.trim();
    }

    /**
     * 获取药品规格
     *
     * @return DRUG_SPEC - 药品规格
     */
    public String getDrugSpec() {
        return drugSpec;
    }

    /**
     * 设置药品规格
     *
     * @param drugSpec 药品规格
     */
    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec == null ? null : drugSpec.trim();
    }

    /**
     * 获取药品单位
     *
     * @return DRUG_UNITS - 药品单位
     */
    public String getDrugUnits() {
        return drugUnits;
    }

    /**
     * 设置药品单位
     *
     * @param drugUnits 药品单位
     */
    public void setDrugUnits(String drugUnits) {
        this.drugUnits = drugUnits == null ? null : drugUnits.trim();
    }

    /**
     * 获取医保分类
     *
     * @return INSURANCETYPE - 医保分类
     */
    public String getInsurancetype() {
        return insurancetype;
    }

    /**
     * 设置医保分类
     *
     * @param insurancetype 医保分类
     */
    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype == null ? null : insurancetype.trim();
    }

    /**
     * 获取药库单位
     *
     * @return DISPENSARY_UNITS - 药库单位
     */
    public String getDispensaryUnits() {
        return dispensaryUnits;
    }

    /**
     * 设置药库单位
     *
     * @param dispensaryUnits 药库单位
     */
    public void setDispensaryUnits(String dispensaryUnits) {
        this.dispensaryUnits = dispensaryUnits == null ? null : dispensaryUnits.trim();
    }

    /**
     * 获取药房单位
     *
     * @return ROOM_UNITS - 药房单位
     */
    public String getRoomUnits() {
        return roomUnits;
    }

    /**
     * 设置药房单位
     *
     * @param roomUnits 药房单位
     */
    public void setRoomUnits(String roomUnits) {
        this.roomUnits = roomUnits == null ? null : roomUnits.trim();
    }

    /**
     * 获取药品属性
     *
     * @return ATTRIBUTE - 药品属性
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * 设置药品属性
     *
     * @param attribute 药品属性
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    /**
     * 获取生产厂商
     *
     * @return FIRM - 生产厂商
     */
    public String getFirm() {
        return firm;
    }

    /**
     * 设置生产厂商
     *
     * @param firm 生产厂商
     */
    public void setFirm(String firm) {
        this.firm = firm == null ? null : firm.trim();
    }

    /**
     * 获取最小单位
     *
     * @return MIN_UNITS - 最小单位
     */
    public String getMinUnits() {
        return minUnits;
    }

    /**
     * 设置最小单位
     *
     * @param minUnits 最小单位
     */
    public void setMinUnits(String minUnits) {
        this.minUnits = minUnits == null ? null : minUnits.trim();
    }

    /**
     * 获取最小包装
     *
     * @return MIN_PACK - 最小包装
     */
    public String getMinPack() {
        return minPack;
    }

    /**
     * 设置最小包装
     *
     * @param minPack 最小包装
     */
    public void setMinPack(String minPack) {
        this.minPack = minPack == null ? null : minPack.trim();
    }

    /**
     * 获取药房包装
     *
     * @return ROOM_PACK - 药房包装
     */
    public String getRoomPack() {
        return roomPack;
    }

    /**
     * 设置药房包装
     *
     * @param roomPack 药房包装
     */
    public void setRoomPack(String roomPack) {
        this.roomPack = roomPack == null ? null : roomPack.trim();
    }

    /**
     * 获取拼音代码
     *
     * @return PINYIN_CODE - 拼音代码
     */
    public String getPinyinCode() {
        return pinyinCode;
    }

    /**
     * 设置拼音代码
     *
     * @param pinyinCode 拼音代码
     */
    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    /**
     * 获取五笔代码
     *
     * @return WUBI_CODE - 五笔代码
     */
    public String getWubiCode() {
        return wubiCode;
    }

    /**
     * 设置五笔代码
     *
     * @param wubiCode 五笔代码
     */
    public void setWubiCode(String wubiCode) {
        this.wubiCode = wubiCode == null ? null : wubiCode.trim();
    }

    /**
     * 获取药品说明
     *
     * @return ILLSTRATEMED - 药品说明
     */
    public String getIllstratemed() {
        return illstratemed;
    }

    /**
     * 设置药品说明
     *
     * @param illstratemed 药品说明
     */
    public void setIllstratemed(String illstratemed) {
        this.illstratemed = illstratemed == null ? null : illstratemed.trim();
    }

    /**
     * 获取定价级别
     *
     * @return PRICELEVEL - 定价级别
     */
    public String getPricelevel() {
        return pricelevel;
    }

    /**
     * 设置定价级别
     *
     * @param pricelevel 定价级别
     */
    public void setPricelevel(String pricelevel) {
        this.pricelevel = pricelevel == null ? null : pricelevel.trim();
    }

    /**
     * 获取药品效期
     *
     * @return EXPIRYDATE - 药品效期
     */
    public String getExpirydate() {
        return expirydate;
    }

    /**
     * 设置药品效期
     *
     * @param expirydate 药品效期
     */
    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate == null ? null : expirydate.trim();
    }

    /**
     * 获取药品类别
     *
     * @return DRUG_TYPE - 药品类别
     */
    public String getDrugType() {
        return drugType;
    }

    /**
     * 设置药品类别
     *
     * @param drugType 药品类别
     */
    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
    }

    /**
     * 获取药品档次
     *
     * @return DRUG_LEVEL - 药品档次
     */
    public String getDrugLevel() {
        return drugLevel;
    }

    /**
     * 设置药品档次
     *
     * @param drugLevel 药品档次
     */
    public void setDrugLevel(String drugLevel) {
        this.drugLevel = drugLevel == null ? null : drugLevel.trim();
    }

    /**
     * 获取制剂判断
     *
     * @return ISPREPARATION - 制剂判断
     */
    public String getIspreparation() {
        return ispreparation;
    }

    /**
     * 设置制剂判断
     *
     * @param ispreparation 制剂判断
     */
    public void setIspreparation(String ispreparation) {
        this.ispreparation = ispreparation == null ? null : ispreparation.trim();
    }

    /**
     * 获取急诊用药
     *
     * @return ISEMERGENCY - 急诊用药
     */
    public String getIsemergency() {
        return isemergency;
    }

    /**
     * 设置急诊用药
     *
     * @param isemergency 急诊用药
     */
    public void setIsemergency(String isemergency) {
        this.isemergency = isemergency == null ? null : isemergency.trim();
    }

    /**
     * 获取药品剂量
     *
     * @return DOSAGE - 药品剂量
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * 设置药品剂量
     *
     * @param dosage 药品剂量
     */
    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    /**
     * 获取剂量单位
     *
     * @return DOSAGE_UNIT - 剂量单位
     */
    public String getDosageUnit() {
        return dosageUnit;
    }

    /**
     * 设置剂量单位
     *
     * @param dosageUnit 剂量单位
     */
    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit == null ? null : dosageUnit.trim();
    }

    /**
     * 获取帐蒲类别
     *
     * @return ACCOUNTTYPE - 帐蒲类别
     */
    public String getAccounttype() {
        return accounttype;
    }

    /**
     * 设置帐蒲类别
     *
     * @param accounttype 帐蒲类别
     */
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    /**
     * 获取ABC类别
     *
     * @return ASCTYPE - ABC类别
     */
    public String getAsctype() {
        return asctype;
    }

    /**
     * 设置ABC类别
     *
     * @param asctype ABC类别
     */
    public void setAsctype(String asctype) {
        this.asctype = asctype == null ? null : asctype.trim();
    }

    /**
     * 获取自选产地
     *
     * @return PRODUCTIONPLACE - 自选产地
     */
    public String getProductionplace() {
        return productionplace;
    }

    /**
     * 设置自选产地
     *
     * @param productionplace 自选产地
     */
    public void setProductionplace(String productionplace) {
        this.productionplace = productionplace == null ? null : productionplace.trim();
    }

    /**
     * 获取抗生素标志
     *
     * @return ISANTIBIOTICS - 抗生素标志
     */
    public String getIsantibiotics() {
        return isantibiotics;
    }

    /**
     * 设置抗生素标志
     *
     * @param isantibiotics 抗生素标志
     */
    public void setIsantibiotics(String isantibiotics) {
        this.isantibiotics = isantibiotics == null ? null : isantibiotics.trim();
    }

    /**
     * 获取抗生素等级
     *
     * @return ANTIBIOTICSLEVEL - 抗生素等级
     */
    public String getAntibioticslevel() {
        return antibioticslevel;
    }

    /**
     * 设置抗生素等级
     *
     * @param antibioticslevel 抗生素等级
     */
    public void setAntibioticslevel(String antibioticslevel) {
        this.antibioticslevel = antibioticslevel == null ? null : antibioticslevel.trim();
    }

    /**
     * 获取一次用量
     *
     * @return ONCE_DOSAGE - 一次用量
     */
    public String getOnceDosage() {
        return onceDosage;
    }

    /**
     * 设置一次用量
     *
     * @param onceDosage 一次用量
     */
    public void setOnceDosage(String onceDosage) {
        this.onceDosage = onceDosage == null ? null : onceDosage.trim();
    }

    /**
     * 获取一次剂量
     *
     * @return ONCE_DOSE - 一次剂量
     */
    public String getOnceDose() {
        return onceDose;
    }

    /**
     * 设置一次剂量
     *
     * @param onceDose 一次剂量
     */
    public void setOnceDose(String onceDose) {
        this.onceDose = onceDose == null ? null : onceDose.trim();
    }

    /**
     * 获取最大剂量
     *
     * @return MAX_DOSE - 最大剂量
     */
    public String getMaxDose() {
        return maxDose;
    }

    /**
     * 设置最大剂量
     *
     * @param maxDose 最大剂量
     */
    public void setMaxDose(String maxDose) {
        this.maxDose = maxDose == null ? null : maxDose.trim();
    }

    /**
     * 获取基本药物标志
     *
     * @return ISBASE - 基本药物标志
     */
    public String getIsbase() {
        return isbase;
    }

    /**
     * 设置基本药物标志
     *
     * @param isbase 基本药物标志
     */
    public void setIsbase(String isbase) {
        this.isbase = isbase == null ? null : isbase.trim();
    }

    /**
     * 获取处方用药备注
     *
     * @return REMARK - 处方用药备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置处方用药备注
     *
     * @param remark 处方用药备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取处方药品
     *
     * @return ISPX - 处方药品
     */
    public String getIspx() {
        return ispx;
    }

    /**
     * 设置处方药品
     *
     * @param ispx 处方药品
     */
    public void setIspx(String ispx) {
        this.ispx = ispx == null ? null : ispx.trim();
    }

    /**
     * 获取通用名
     *
     * @return NAMEUSUAL - 通用名
     */
    public String getNameusual() {
        return nameusual;
    }

    /**
     * 设置通用名
     *
     * @param nameusual 通用名
     */
    public void setNameusual(String nameusual) {
        this.nameusual = nameusual == null ? null : nameusual.trim();
    }

    /**
     * 获取英文名
     *
     * @return NAMEENGLISH - 英文名
     */
    public String getNameenglish() {
        return nameenglish;
    }

    /**
     * 设置英文名
     *
     * @param nameenglish 英文名
     */
    public void setNameenglish(String nameenglish) {
        this.nameenglish = nameenglish == null ? null : nameenglish.trim();
    }

    /**
     * 获取ATC码
     *
     * @return ATCCODE - ATC码
     */
    public String getAtccode() {
        return atccode;
    }

    /**
     * 设置ATC码
     *
     * @param atccode ATC码
     */
    public void setAtccode(String atccode) {
        this.atccode = atccode == null ? null : atccode.trim();
    }

    /**
     * 获取作废判断
     *
     * @return ISABOLISH - 作废判断
     */
    public String getIsabolish() {
        return isabolish;
    }

    /**
     * 设置作废判断
     *
     * @param isabolish 作废判断
     */
    public void setIsabolish(String isabolish) {
        this.isabolish = isabolish == null ? null : isabolish.trim();
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
     * 获取抗生素类型
     *
     * @return ANT_CLASS - 抗生素类型
     */
    public String getAntClass() {
        return antClass;
    }

    /**
     * 设置抗生素类型
     *
     * @param antClass 抗生素类型
     */
    public void setAntClass(String antClass) {
        this.antClass = antClass == null ? null : antClass.trim();
    }

    /**
     * 获取抗生素类型名称
     *
     * @return ANT_CLASS_NAME - 抗生素类型名称
     */
    public String getAntClassName() {
        return antClassName;
    }

    /**
     * 设置抗生素类型名称
     *
     * @param antClassName 抗生素类型名称
     */
    public void setAntClassName(String antClassName) {
        this.antClassName = antClassName == null ? null : antClassName.trim();
    }

    /**
     * 获取药品分类
     *
     * @return DRUG_CLASS - 药品分类
     */
    public String getDrugClass() {
        return drugClass;
    }

    /**
     * 设置药品分类
     *
     * @param drugClass 药品分类
     */
    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass == null ? null : drugClass.trim();
    }
}