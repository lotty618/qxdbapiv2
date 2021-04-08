package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TP_MED")
public class QxTpMed {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 药品唯一标识
     */
    @Column(name = "MEDUID")
    private String meduid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 药品名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 规格全称
     */
    @Column(name = "SPEC")
    private String spec;

    /**
     * 药品规格
     */
    @Column(name = "SPEC_MED")
    private String specMed;

    /**
     * 药房规格
     */
    @Column(name = "SPEC_PHARMACY")
    private String specPharmacy;

    /**
     * 病房规格
     */
    @Column(name = "SPEC_WARD")
    private String specWard;

    /**
     * 药品属性
     */
    @Column(name = "ATTRIBUTE_MED")
    private String attributeMed;

    /**
     * 特殊药品
     */
    @Column(name = "ISSPECIAL")
    private String isspecial;

    /**
     * 单位全称
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     * 药品单位
     */
    @Column(name = "UNIT_SIMPLE")
    private String unitSimple;

    /**
     * 最小单位
     */
    @Column(name = "UNIT_MIN")
    private String unitMin;

    /**
     * 药房单位
     */
    @Column(name = "UNIT_PHARMACY")
    private String unitPharmacy;

    /**
     * 病房单位
     */
    @Column(name = "UNIT_WARD")
    private String unitWard;

    /**
     * 最小包装
     */
    @Column(name = "PACK_MIN")
    private String packMin;

    /**
     * 药房包装
     */
    @Column(name = "PACK_PHARMACY")
    private String packPharmacy;

    /**
     * 病房包装
     */
    @Column(name = "PACK_WARD")
    private String packWard;

    /**
     * 注射收费
     */
    @Column(name = "PRICE_INJECT")
    private String priceInject;

    /**
     * 皮试判别
     */
    @Column(name = "IS_SKIN_TEST")
    private String isSkinTest;

    /**
     * 用量限制
     */
    @Column(name = "DOSAGE_LIMIT")
    private String dosageLimit;

    /**
     * 发药方式
     */
    @Column(name = "DISPENSING")
    private String dispensing;

    /**
     * 拼音代码
     */
    @Column(name = "CODE_PINYIN")
    private String codePinyin;

    /**
     * 五笔代码
     */
    @Column(name = "CODE_WUBI")
    private String codeWubi;

    /**
     * 角形代码
     */
    @Column(name = "CODE_JIAOXING")
    private String codeJiaoxing;

    /**
     * 其他代码
     */
    @Column(name = "CODE_OTHER")
    private String codeOther;

    /**
     * 药品编号
     */
    @Column(name = "MED_NUM")
    private String medNum;

    /**
     * 定价级别
     */
    @Column(name = "PRICE_LEVEL")
    private String priceLevel;

    /**
     * 药品效期
     */
    @Column(name = "EXPIRY_DATE")
    private String expiryDate;

    /**
     * 给药方法
     */
    @Column(name = "DOSE_TYPE")
    private String doseType;

    /**
     * 药品类别
     */
    @Column(name = "MED_TYPE")
    private String medType;

    /**
     * 药品编码
     */
    @Column(name = "MED_CODE")
    private String medCode;

    /**
     * 药品档次
     */
    @Column(name = "MED_LEVEL")
    private String medLevel;

    /**
     * 制剂判别
     */
    @Column(name = "IS_PREPARATIONS")
    private String isPreparations;

    /**
     * 急诊用药
     */
    @Column(name = "IS_EMERGENCY")
    private String isEmergency;

    /**
     * 药品剂量
     */
    @Column(name = "DOS_AGE")
    private String dosAge;

    /**
     * 剂量单位
     */
    @Column(name = "UNIT_DOSAGE")
    private String unitDosage;

    /**
     * 帐薄类别
     */
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    /**
     * ABC类别
     */
    @Column(name = "ABC_TYPE")
    private String abcType;

    /**
     * 取整策略
     */
    @Column(name = "ROUND_NUM")
    private String roundNum;

    /**
     * 自选产地
     */
    @Column(name = "PRODUCTION_PLACE")
    private String productionPlace;

    /**
     * 抗生素标志
     */
    @Column(name = "IS_ANTIBIOTICS")
    private String isAntibiotics;

    /**
     * 一次用量
     */
    @Column(name = "USED_ONCE")
    private String usedOnce;

    /**
     * 基本药物标志
     */
    @Column(name = "IS_BASE")
    private String isBase;

    /**
     * 运动员慎用
     */
    @Column(name = "IS_SPORT")
    private String isSport;

    /**
     * 冰箱冷藏
     */
    @Column(name = "IS_REFRIGERATE")
    private String isRefrigerate;

    /**
     * 处方用药备注
     */
    @Column(name = "REMARK_PM")
    private String remarkPm;

    /**
     * 药品贮藏
     */
    @Column(name = "STORAGE_MED")
    private String storageMed;

    /**
     * 医保分类
     */
    @Column(name = "INSURANCE_TYPE")
    private String insuranceType;

    /**
     * 处方药品
     */
    @Column(name = "IS_PRESCRIPTION_MED")
    private String isPrescriptionMed;

    /**
     * 通用名
     */
    @Column(name = "NAME_USUAL")
    private String nameUsual;

    /**
     * 英文名
     */
    @Column(name = "NAME_ENGLISH")
    private String nameEnglish;

    /**
     * ATC码
     */
    @Column(name = "ATC_CODE")
    private String atcCode;

    /**
     * 一次剂量
     */
    @Column(name = "DOSAGE_ONCE")
    private String dosageOnce;

    /**
     * 最大剂量
     */
    @Column(name = "DOSAGE_MAX")
    private String dosageMax;

    /**
     * 抗生素等级
     */
    @Column(name = "ANTIBIOTICS_LEVEL")
    private String antibioticsLevel;

    /**
     * 特殊人群用药
     */
    @Column(name = "SPECIALUSE")
    private String specialuse;

    /**
     * 特殊交代
     */
    @Column(name = "SPECIAL_REMARK")
    private String specialRemark;

    /**
     * 作废判别
     */
    @Column(name = "IS_ABOLISH")
    private String isAbolish;

    /**
     * 生产厂商
     */
    @Column(name = "FIRM")
    private String firm;

    @Column(name = "MED_CLASS")
    private String medClass;

    /**
     * 原始层ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 是否中标（0：未提醒，1：已提醒）
     */
    @Column(name = "IS_SELECTED")
    private Long isSelected;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 药品说明
     */
    @Column(name = "ILLUSTRATE_MED")
    private String illustrateMed;

    /**
     * 性状
     */
    @Column(name = "PROPERTY")
    private String property;

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
     * 获取药品唯一标识
     *
     * @return MEDUID - 药品唯一标识
     */
    public String getMeduid() {
        return meduid;
    }

    /**
     * 设置药品唯一标识
     *
     * @param meduid 药品唯一标识
     */
    public void setMeduid(String meduid) {
        this.meduid = meduid == null ? null : meduid.trim();
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
     * 获取药品名称
     *
     * @return NAME - 药品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置药品名称
     *
     * @param name 药品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取规格全称
     *
     * @return SPEC - 规格全称
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置规格全称
     *
     * @param spec 规格全称
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * 获取药品规格
     *
     * @return SPEC_MED - 药品规格
     */
    public String getSpecMed() {
        return specMed;
    }

    /**
     * 设置药品规格
     *
     * @param specMed 药品规格
     */
    public void setSpecMed(String specMed) {
        this.specMed = specMed == null ? null : specMed.trim();
    }

    /**
     * 获取药房规格
     *
     * @return SPEC_PHARMACY - 药房规格
     */
    public String getSpecPharmacy() {
        return specPharmacy;
    }

    /**
     * 设置药房规格
     *
     * @param specPharmacy 药房规格
     */
    public void setSpecPharmacy(String specPharmacy) {
        this.specPharmacy = specPharmacy == null ? null : specPharmacy.trim();
    }

    /**
     * 获取病房规格
     *
     * @return SPEC_WARD - 病房规格
     */
    public String getSpecWard() {
        return specWard;
    }

    /**
     * 设置病房规格
     *
     * @param specWard 病房规格
     */
    public void setSpecWard(String specWard) {
        this.specWard = specWard == null ? null : specWard.trim();
    }

    /**
     * 获取药品属性
     *
     * @return ATTRIBUTE_MED - 药品属性
     */
    public String getAttributeMed() {
        return attributeMed;
    }

    /**
     * 设置药品属性
     *
     * @param attributeMed 药品属性
     */
    public void setAttributeMed(String attributeMed) {
        this.attributeMed = attributeMed == null ? null : attributeMed.trim();
    }

    /**
     * 获取特殊药品
     *
     * @return ISSPECIAL - 特殊药品
     */
    public String getIsspecial() {
        return isspecial;
    }

    /**
     * 设置特殊药品
     *
     * @param isspecial 特殊药品
     */
    public void setIsspecial(String isspecial) {
        this.isspecial = isspecial == null ? null : isspecial.trim();
    }

    /**
     * 获取单位全称
     *
     * @return UNIT - 单位全称
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位全称
     *
     * @param unit 单位全称
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取药品单位
     *
     * @return UNIT_SIMPLE - 药品单位
     */
    public String getUnitSimple() {
        return unitSimple;
    }

    /**
     * 设置药品单位
     *
     * @param unitSimple 药品单位
     */
    public void setUnitSimple(String unitSimple) {
        this.unitSimple = unitSimple == null ? null : unitSimple.trim();
    }

    /**
     * 获取最小单位
     *
     * @return UNIT_MIN - 最小单位
     */
    public String getUnitMin() {
        return unitMin;
    }

    /**
     * 设置最小单位
     *
     * @param unitMin 最小单位
     */
    public void setUnitMin(String unitMin) {
        this.unitMin = unitMin == null ? null : unitMin.trim();
    }

    /**
     * 获取药房单位
     *
     * @return UNIT_PHARMACY - 药房单位
     */
    public String getUnitPharmacy() {
        return unitPharmacy;
    }

    /**
     * 设置药房单位
     *
     * @param unitPharmacy 药房单位
     */
    public void setUnitPharmacy(String unitPharmacy) {
        this.unitPharmacy = unitPharmacy == null ? null : unitPharmacy.trim();
    }

    /**
     * 获取病房单位
     *
     * @return UNIT_WARD - 病房单位
     */
    public String getUnitWard() {
        return unitWard;
    }

    /**
     * 设置病房单位
     *
     * @param unitWard 病房单位
     */
    public void setUnitWard(String unitWard) {
        this.unitWard = unitWard == null ? null : unitWard.trim();
    }

    /**
     * 获取最小包装
     *
     * @return PACK_MIN - 最小包装
     */
    public String getPackMin() {
        return packMin;
    }

    /**
     * 设置最小包装
     *
     * @param packMin 最小包装
     */
    public void setPackMin(String packMin) {
        this.packMin = packMin == null ? null : packMin.trim();
    }

    /**
     * 获取药房包装
     *
     * @return PACK_PHARMACY - 药房包装
     */
    public String getPackPharmacy() {
        return packPharmacy;
    }

    /**
     * 设置药房包装
     *
     * @param packPharmacy 药房包装
     */
    public void setPackPharmacy(String packPharmacy) {
        this.packPharmacy = packPharmacy == null ? null : packPharmacy.trim();
    }

    /**
     * 获取病房包装
     *
     * @return PACK_WARD - 病房包装
     */
    public String getPackWard() {
        return packWard;
    }

    /**
     * 设置病房包装
     *
     * @param packWard 病房包装
     */
    public void setPackWard(String packWard) {
        this.packWard = packWard == null ? null : packWard.trim();
    }

    /**
     * 获取注射收费
     *
     * @return PRICE_INJECT - 注射收费
     */
    public String getPriceInject() {
        return priceInject;
    }

    /**
     * 设置注射收费
     *
     * @param priceInject 注射收费
     */
    public void setPriceInject(String priceInject) {
        this.priceInject = priceInject == null ? null : priceInject.trim();
    }

    /**
     * 获取皮试判别
     *
     * @return IS_SKIN_TEST - 皮试判别
     */
    public String getIsSkinTest() {
        return isSkinTest;
    }

    /**
     * 设置皮试判别
     *
     * @param isSkinTest 皮试判别
     */
    public void setIsSkinTest(String isSkinTest) {
        this.isSkinTest = isSkinTest == null ? null : isSkinTest.trim();
    }

    /**
     * 获取用量限制
     *
     * @return DOSAGE_LIMIT - 用量限制
     */
    public String getDosageLimit() {
        return dosageLimit;
    }

    /**
     * 设置用量限制
     *
     * @param dosageLimit 用量限制
     */
    public void setDosageLimit(String dosageLimit) {
        this.dosageLimit = dosageLimit == null ? null : dosageLimit.trim();
    }

    /**
     * 获取发药方式
     *
     * @return DISPENSING - 发药方式
     */
    public String getDispensing() {
        return dispensing;
    }

    /**
     * 设置发药方式
     *
     * @param dispensing 发药方式
     */
    public void setDispensing(String dispensing) {
        this.dispensing = dispensing == null ? null : dispensing.trim();
    }

    /**
     * 获取拼音代码
     *
     * @return CODE_PINYIN - 拼音代码
     */
    public String getCodePinyin() {
        return codePinyin;
    }

    /**
     * 设置拼音代码
     *
     * @param codePinyin 拼音代码
     */
    public void setCodePinyin(String codePinyin) {
        this.codePinyin = codePinyin == null ? null : codePinyin.trim();
    }

    /**
     * 获取五笔代码
     *
     * @return CODE_WUBI - 五笔代码
     */
    public String getCodeWubi() {
        return codeWubi;
    }

    /**
     * 设置五笔代码
     *
     * @param codeWubi 五笔代码
     */
    public void setCodeWubi(String codeWubi) {
        this.codeWubi = codeWubi == null ? null : codeWubi.trim();
    }

    /**
     * 获取角形代码
     *
     * @return CODE_JIAOXING - 角形代码
     */
    public String getCodeJiaoxing() {
        return codeJiaoxing;
    }

    /**
     * 设置角形代码
     *
     * @param codeJiaoxing 角形代码
     */
    public void setCodeJiaoxing(String codeJiaoxing) {
        this.codeJiaoxing = codeJiaoxing == null ? null : codeJiaoxing.trim();
    }

    /**
     * 获取其他代码
     *
     * @return CODE_OTHER - 其他代码
     */
    public String getCodeOther() {
        return codeOther;
    }

    /**
     * 设置其他代码
     *
     * @param codeOther 其他代码
     */
    public void setCodeOther(String codeOther) {
        this.codeOther = codeOther == null ? null : codeOther.trim();
    }

    /**
     * 获取药品编号
     *
     * @return MED_NUM - 药品编号
     */
    public String getMedNum() {
        return medNum;
    }

    /**
     * 设置药品编号
     *
     * @param medNum 药品编号
     */
    public void setMedNum(String medNum) {
        this.medNum = medNum == null ? null : medNum.trim();
    }

    /**
     * 获取定价级别
     *
     * @return PRICE_LEVEL - 定价级别
     */
    public String getPriceLevel() {
        return priceLevel;
    }

    /**
     * 设置定价级别
     *
     * @param priceLevel 定价级别
     */
    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel == null ? null : priceLevel.trim();
    }

    /**
     * 获取药品效期
     *
     * @return EXPIRY_DATE - 药品效期
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置药品效期
     *
     * @param expiryDate 药品效期
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }

    /**
     * 获取给药方法
     *
     * @return DOSE_TYPE - 给药方法
     */
    public String getDoseType() {
        return doseType;
    }

    /**
     * 设置给药方法
     *
     * @param doseType 给药方法
     */
    public void setDoseType(String doseType) {
        this.doseType = doseType == null ? null : doseType.trim();
    }

    /**
     * 获取药品类别
     *
     * @return MED_TYPE - 药品类别
     */
    public String getMedType() {
        return medType;
    }

    /**
     * 设置药品类别
     *
     * @param medType 药品类别
     */
    public void setMedType(String medType) {
        this.medType = medType == null ? null : medType.trim();
    }

    /**
     * 获取药品编码
     *
     * @return MED_CODE - 药品编码
     */
    public String getMedCode() {
        return medCode;
    }

    /**
     * 设置药品编码
     *
     * @param medCode 药品编码
     */
    public void setMedCode(String medCode) {
        this.medCode = medCode == null ? null : medCode.trim();
    }

    /**
     * 获取药品档次
     *
     * @return MED_LEVEL - 药品档次
     */
    public String getMedLevel() {
        return medLevel;
    }

    /**
     * 设置药品档次
     *
     * @param medLevel 药品档次
     */
    public void setMedLevel(String medLevel) {
        this.medLevel = medLevel == null ? null : medLevel.trim();
    }

    /**
     * 获取制剂判别
     *
     * @return IS_PREPARATIONS - 制剂判别
     */
    public String getIsPreparations() {
        return isPreparations;
    }

    /**
     * 设置制剂判别
     *
     * @param isPreparations 制剂判别
     */
    public void setIsPreparations(String isPreparations) {
        this.isPreparations = isPreparations == null ? null : isPreparations.trim();
    }

    /**
     * 获取急诊用药
     *
     * @return IS_EMERGENCY - 急诊用药
     */
    public String getIsEmergency() {
        return isEmergency;
    }

    /**
     * 设置急诊用药
     *
     * @param isEmergency 急诊用药
     */
    public void setIsEmergency(String isEmergency) {
        this.isEmergency = isEmergency == null ? null : isEmergency.trim();
    }

    /**
     * 获取药品剂量
     *
     * @return DOS_AGE - 药品剂量
     */
    public String getDosAge() {
        return dosAge;
    }

    /**
     * 设置药品剂量
     *
     * @param dosAge 药品剂量
     */
    public void setDosAge(String dosAge) {
        this.dosAge = dosAge == null ? null : dosAge.trim();
    }

    /**
     * 获取剂量单位
     *
     * @return UNIT_DOSAGE - 剂量单位
     */
    public String getUnitDosage() {
        return unitDosage;
    }

    /**
     * 设置剂量单位
     *
     * @param unitDosage 剂量单位
     */
    public void setUnitDosage(String unitDosage) {
        this.unitDosage = unitDosage == null ? null : unitDosage.trim();
    }

    /**
     * 获取帐薄类别
     *
     * @return ACCOUNT_TYPE - 帐薄类别
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置帐薄类别
     *
     * @param accountType 帐薄类别
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取ABC类别
     *
     * @return ABC_TYPE - ABC类别
     */
    public String getAbcType() {
        return abcType;
    }

    /**
     * 设置ABC类别
     *
     * @param abcType ABC类别
     */
    public void setAbcType(String abcType) {
        this.abcType = abcType == null ? null : abcType.trim();
    }

    /**
     * 获取取整策略
     *
     * @return ROUND_NUM - 取整策略
     */
    public String getRoundNum() {
        return roundNum;
    }

    /**
     * 设置取整策略
     *
     * @param roundNum 取整策略
     */
    public void setRoundNum(String roundNum) {
        this.roundNum = roundNum == null ? null : roundNum.trim();
    }

    /**
     * 获取自选产地
     *
     * @return PRODUCTION_PLACE - 自选产地
     */
    public String getProductionPlace() {
        return productionPlace;
    }

    /**
     * 设置自选产地
     *
     * @param productionPlace 自选产地
     */
    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace == null ? null : productionPlace.trim();
    }

    /**
     * 获取抗生素标志
     *
     * @return IS_ANTIBIOTICS - 抗生素标志
     */
    public String getIsAntibiotics() {
        return isAntibiotics;
    }

    /**
     * 设置抗生素标志
     *
     * @param isAntibiotics 抗生素标志
     */
    public void setIsAntibiotics(String isAntibiotics) {
        this.isAntibiotics = isAntibiotics == null ? null : isAntibiotics.trim();
    }

    /**
     * 获取一次用量
     *
     * @return USED_ONCE - 一次用量
     */
    public String getUsedOnce() {
        return usedOnce;
    }

    /**
     * 设置一次用量
     *
     * @param usedOnce 一次用量
     */
    public void setUsedOnce(String usedOnce) {
        this.usedOnce = usedOnce == null ? null : usedOnce.trim();
    }

    /**
     * 获取基本药物标志
     *
     * @return IS_BASE - 基本药物标志
     */
    public String getIsBase() {
        return isBase;
    }

    /**
     * 设置基本药物标志
     *
     * @param isBase 基本药物标志
     */
    public void setIsBase(String isBase) {
        this.isBase = isBase == null ? null : isBase.trim();
    }

    /**
     * 获取运动员慎用
     *
     * @return IS_SPORT - 运动员慎用
     */
    public String getIsSport() {
        return isSport;
    }

    /**
     * 设置运动员慎用
     *
     * @param isSport 运动员慎用
     */
    public void setIsSport(String isSport) {
        this.isSport = isSport == null ? null : isSport.trim();
    }

    /**
     * 获取冰箱冷藏
     *
     * @return IS_REFRIGERATE - 冰箱冷藏
     */
    public String getIsRefrigerate() {
        return isRefrigerate;
    }

    /**
     * 设置冰箱冷藏
     *
     * @param isRefrigerate 冰箱冷藏
     */
    public void setIsRefrigerate(String isRefrigerate) {
        this.isRefrigerate = isRefrigerate == null ? null : isRefrigerate.trim();
    }

    /**
     * 获取处方用药备注
     *
     * @return REMARK_PM - 处方用药备注
     */
    public String getRemarkPm() {
        return remarkPm;
    }

    /**
     * 设置处方用药备注
     *
     * @param remarkPm 处方用药备注
     */
    public void setRemarkPm(String remarkPm) {
        this.remarkPm = remarkPm == null ? null : remarkPm.trim();
    }

    /**
     * 获取药品贮藏
     *
     * @return STORAGE_MED - 药品贮藏
     */
    public String getStorageMed() {
        return storageMed;
    }

    /**
     * 设置药品贮藏
     *
     * @param storageMed 药品贮藏
     */
    public void setStorageMed(String storageMed) {
        this.storageMed = storageMed == null ? null : storageMed.trim();
    }

    /**
     * 获取医保分类
     *
     * @return INSURANCE_TYPE - 医保分类
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * 设置医保分类
     *
     * @param insuranceType 医保分类
     */
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    /**
     * 获取处方药品
     *
     * @return IS_PRESCRIPTION_MED - 处方药品
     */
    public String getIsPrescriptionMed() {
        return isPrescriptionMed;
    }

    /**
     * 设置处方药品
     *
     * @param isPrescriptionMed 处方药品
     */
    public void setIsPrescriptionMed(String isPrescriptionMed) {
        this.isPrescriptionMed = isPrescriptionMed == null ? null : isPrescriptionMed.trim();
    }

    /**
     * 获取通用名
     *
     * @return NAME_USUAL - 通用名
     */
    public String getNameUsual() {
        return nameUsual;
    }

    /**
     * 设置通用名
     *
     * @param nameUsual 通用名
     */
    public void setNameUsual(String nameUsual) {
        this.nameUsual = nameUsual == null ? null : nameUsual.trim();
    }

    /**
     * 获取英文名
     *
     * @return NAME_ENGLISH - 英文名
     */
    public String getNameEnglish() {
        return nameEnglish;
    }

    /**
     * 设置英文名
     *
     * @param nameEnglish 英文名
     */
    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish == null ? null : nameEnglish.trim();
    }

    /**
     * 获取ATC码
     *
     * @return ATC_CODE - ATC码
     */
    public String getAtcCode() {
        return atcCode;
    }

    /**
     * 设置ATC码
     *
     * @param atcCode ATC码
     */
    public void setAtcCode(String atcCode) {
        this.atcCode = atcCode == null ? null : atcCode.trim();
    }

    /**
     * 获取一次剂量
     *
     * @return DOSAGE_ONCE - 一次剂量
     */
    public String getDosageOnce() {
        return dosageOnce;
    }

    /**
     * 设置一次剂量
     *
     * @param dosageOnce 一次剂量
     */
    public void setDosageOnce(String dosageOnce) {
        this.dosageOnce = dosageOnce == null ? null : dosageOnce.trim();
    }

    /**
     * 获取最大剂量
     *
     * @return DOSAGE_MAX - 最大剂量
     */
    public String getDosageMax() {
        return dosageMax;
    }

    /**
     * 设置最大剂量
     *
     * @param dosageMax 最大剂量
     */
    public void setDosageMax(String dosageMax) {
        this.dosageMax = dosageMax == null ? null : dosageMax.trim();
    }

    /**
     * 获取抗生素等级
     *
     * @return ANTIBIOTICS_LEVEL - 抗生素等级
     */
    public String getAntibioticsLevel() {
        return antibioticsLevel;
    }

    /**
     * 设置抗生素等级
     *
     * @param antibioticsLevel 抗生素等级
     */
    public void setAntibioticsLevel(String antibioticsLevel) {
        this.antibioticsLevel = antibioticsLevel == null ? null : antibioticsLevel.trim();
    }

    /**
     * 获取特殊人群用药
     *
     * @return SPECIALUSE - 特殊人群用药
     */
    public String getSpecialuse() {
        return specialuse;
    }

    /**
     * 设置特殊人群用药
     *
     * @param specialuse 特殊人群用药
     */
    public void setSpecialuse(String specialuse) {
        this.specialuse = specialuse == null ? null : specialuse.trim();
    }

    /**
     * 获取特殊交代
     *
     * @return SPECIAL_REMARK - 特殊交代
     */
    public String getSpecialRemark() {
        return specialRemark;
    }

    /**
     * 设置特殊交代
     *
     * @param specialRemark 特殊交代
     */
    public void setSpecialRemark(String specialRemark) {
        this.specialRemark = specialRemark == null ? null : specialRemark.trim();
    }

    /**
     * 获取作废判别
     *
     * @return IS_ABOLISH - 作废判别
     */
    public String getIsAbolish() {
        return isAbolish;
    }

    /**
     * 设置作废判别
     *
     * @param isAbolish 作废判别
     */
    public void setIsAbolish(String isAbolish) {
        this.isAbolish = isAbolish == null ? null : isAbolish.trim();
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
     * @return MED_CLASS
     */
    public String getMedClass() {
        return medClass;
    }

    /**
     * @param medClass
     */
    public void setMedClass(String medClass) {
        this.medClass = medClass == null ? null : medClass.trim();
    }

    /**
     * 获取原始层ID
     *
     * @return QID - 原始层ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层ID
     *
     * @param qid 原始层ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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
     * 获取是否中标（0：未提醒，1：已提醒）
     *
     * @return IS_SELECTED - 是否中标（0：未提醒，1：已提醒）
     */
    public Long getIsSelected() {
        return isSelected;
    }

    /**
     * 设置是否中标（0：未提醒，1：已提醒）
     *
     * @param isSelected 是否中标（0：未提醒，1：已提醒）
     */
    public void setIsSelected(Long isSelected) {
        this.isSelected = isSelected;
    }

    /**
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取药品说明
     *
     * @return ILLUSTRATE_MED - 药品说明
     */
    public String getIllustrateMed() {
        return illustrateMed;
    }

    /**
     * 设置药品说明
     *
     * @param illustrateMed 药品说明
     */
    public void setIllustrateMed(String illustrateMed) {
        this.illustrateMed = illustrateMed == null ? null : illustrateMed.trim();
    }

    /**
     * 获取性状
     *
     * @return PROPERTY - 性状
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置性状
     *
     * @param property 性状
     */
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }
}