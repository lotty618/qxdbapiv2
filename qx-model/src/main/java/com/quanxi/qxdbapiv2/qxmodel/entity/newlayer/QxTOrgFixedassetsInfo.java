package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_ORG_FIXEDASSETS_INFO")
public class QxTOrgFixedassetsInfo {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * ID[主键]
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 会计年度[主键]（会计年度）
     */
    @Id
    @Column(name = "ACCT_YEAR")
    private String acctYear;

    /**
     * 会计月份[主键]（会计月份）
     */
    @Id
    @Column(name = "ACCT_MONTH")
    private String acctMonth;

    /**
     * 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 固定资产卡片号（固定资产卡片号，标识该资产唯一）
     */
    @Column(name = "CAPITAL_CARD_NO")
    private String capitalCardNo;

    /**
     * 卡片状态代码DIR_CARD_STATE_CODE（当前资产卡片的流程状态编码）
     */
    @Column(name = "CARD_STATE_CODE")
    private String cardStateCode;

    /**
     * 卡片状态名称（当前资产卡片的流程状态名称）
     */
    @Column(name = "CARD_STATE_NAME")
    private String cardStateName;

    /**
     * 固定资产所在位置类型代码DIR_CAPITAL_PLACE_TYPE_CODE（固定资产所在位置类型在特定编码体系中的代码）
     */
    @Column(name = "CAPITAL_PLACE_TYPE_CODE")
    private String capitalPlaceTypeCode;

    /**
     * 固定资产所在位置类型名称（固定资产所在位置类型在特定编码体系中的名称）
     */
    @Column(name = "CAPITAL_PLACE_TYPE_NAME")
    private String capitalPlaceTypeName;

    /**
     * 科室代码DIR_DEPT（若固定资产在科室就是具体的科室编码，若在库房，此字段值为空）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称（若固定资产在科室就是具体的科室名称，若在库房，此字段值为空）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 库存单元（若固定资产在库房就是具体的库房名称，若是在科室，此字段值为空）
     */
    @Column(name = "STORE_CODE")
    private String storeCode;

    /**
     * 大型设备管理类别代码DIR_ATT_CODE（大型设备管理类别在特定编码体系中的代码）
     */
    @Column(name = "ATT_CODE")
    private String attCode;

    /**
     * 大型设备管理类别名称（大型设备管理类别在特定编码体系中的名称）
     */
    @Column(name = "ATT_NAME")
    private String attName;

    /**
     * 固定资产名称（对固定资产名称的描述）
     */
    @Column(name = "FIXED_ASSETS_NAME")
    private String fixedAssetsName;

    /**
     * 甲乙类设备资产许可证号（甲乙类设备资产许可证号）
     */
    @Column(name = "ASSETS_LICENSE_NO")
    private String assetsLicenseNo;

    /**
     * 固定资产分类代码DIR_CAPITAL_TYPE_CODE（固定资产的分类编码）
     */
    @Column(name = "CAPITAL_TYPE_CODE")
    private String capitalTypeCode;

    /**
     * 固定资产分类名称（固定资产的分类名称）
     */
    @Column(name = "CAPITAL_TYPE_NAME")
    private String capitalTypeName;

    /**
     * 规格（固定资产的具体规格）
     */
    @Column(name = "SPEC")
    private String spec;

    /**
     * 型号（固定资产的具体型号）
     */
    @Column(name = "MODEL")
    private String model;

    /**
     * 计量单位（固定资产的计量单位）
     */
    @Column(name = "CALCULATE_UNIT")
    private String calculateUnit;

    /**
     * 品牌（固定资产的品牌）
     */
    @Column(name = "BRAND")
    private String brand;

    /**
     * 生产厂家（生产厂家的名称）
     */
    @Column(name = "PRODUCER")
    private String producer;

    /**
     * 出厂日期（固定资产出厂当日的公元纪年时间）
     */
    @Column(name = "FACTORY_DATE")
    private String factoryDate;

    /**
     * 固定资产产地国籍GB/T 2659（固定资产的生产所属国籍在特定编码体系中的代码）
     */
    @Column(name = "CAPITAL_PLACE_COUNTRY_CODE")
    private String capitalPlaceCountryCode;

    /**
     * 设备序列号（每台设备记录在数据库中的唯一序号）
     */
    @Column(name = "EQUIPMENT_NO")
    private String equipmentNo;

    /**
     * 采购流水号（每条采购记录在数据库中的唯一流水号）
     */
    @Column(name = "PURCHASE_NO")
    private String purchaseNo;

    /**
     * 采购员（采购员在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "BUYER")
    private String buyer;

    /**
     * 供应商名称（对固定资产供应商的描述）
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * 采购合同号（采购的合同号）
     */
    @Column(name = "PURCHASE_CONTRACT_NO")
    private String purchaseContractNo;

    /**
     * 固定资产采购单价（固定资产进货的单价）
     */
    @Column(name = "PURCHASE_UNIVALENT")
    private BigDecimal purchaseUnivalent;

    /**
     * 是否免税0否1是（标识采购的固定资产是否存在免税）
     */
    @Column(name = "DUTY_FREE_FLAG")
    private String dutyFreeFlag;

    /**
     * 固定资产采购资金来源代码DIR_CAPITAL_SOURCE_CODE（固定资产采购资金来源在特定编码体系中的代码）
     */
    @Column(name = "CAPITAL_SOURCE_CODE")
    private String capitalSourceCode;

    /**
     * 固定资产采购资金来源名称（固定资产采购资金来源在特定编码体系中的名称）
     */
    @Column(name = "CAPITAL_SOURCE_NAME")
    private String capitalSourceName;

    /**
     * 购买日期（购买设备当日的公元纪年日期）
     */
    @Column(name = "BUY_DATE")
    private String buyDate;

    /**
     * 验收日期（验收设备当日的公元纪年日期）
     */
    @Column(name = "ACCEPTANCE_DATE")
    private String acceptanceDate;

    /**
     * 验收人（验收人在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ACCEPTANCE_PERSON")
    private String acceptancePerson;

    /**
     * 开始使用日期（开始使用的公元纪年日期）
     */
    @Column(name = "START_USING_DATE")
    private String startUsingDate;

    /**
     * 设备单价（设备的进货单价）
     */
    @Column(name = "EQUIPMENT_OUTPAT_FEE_PRICE")
    private BigDecimal equipmentOutpatFeePrice;

    /**
     * 设备原值（设备的原值，包括单价、运输费、安装费等）
     */
    @Column(name = "EQUIPMENT_ORIGINAL_VALUE")
    private BigDecimal equipmentOriginalValue;

    /**
     * 设备现值（设备的当前价值）
     */
    @Column(name = "EQUIPMENT_PRESENT_VALUE")
    private BigDecimal equipmentPresentValue;

    /**
     * 预计残值（设备的残值）
     */
    @Column(name = "EXPECT_RESIDUAL_VALUE")
    private BigDecimal expectResidualValue;

    /**
     * 使用年限（距设备报废的使用时间）
     */
    @Column(name = "USE_YEARS")
    private Integer useYears;

    /**
     * 是否进口0否1是（标识该设备是否进口）
     */
    @Column(name = "IS_IMPORT")
    private String isImport;

    /**
     * 是否折旧0否1是（表示该设备是否进行折旧）
     */
    @Column(name = "IS_DEPRECIATION")
    private String isDepreciation;

    /**
     * 累计折旧（从固定资产开始折旧期的累计折旧值，理论上累计折旧+预计残值+资产现值=资产原值）
     */
    @Column(name = "ACCUMULATED_DEPRECIATION")
    private BigDecimal accumulatedDepreciation;

    /**
     * 是否旧设备0否1是（标识该设备是否是旧设备）
     */
    @Column(name = "IS_OLD_EQUIPMENT")
    private String isOldEquipment;

    /**
     * 已用年限（固定资产已使用的时间，计量单位(年)）
     */
    @Column(name = "UESD_YEARS")
    private Integer uesdYears;

    /**
     * 固定资产使用状态代码DIR_CAPITAL_USE_STATE_CODE（固定资产的使用状态在特定编码体系中的代码）
     */
    @Column(name = "CAPITAL_USE_STATE_CODE")
    private String capitalUseStateCode;

    /**
     * 固定资产使用状态名称（固定资产的使用状态在特定编码体系中的名称）
     */
    @Column(name = "CAPITAL_USE_STATE_NAME")
    private String capitalUseStateName;

    /**
     * 放置地点（对设备放置地点的描述）
     */
    @Column(name = "PLACE")
    private String place;

    /**
     * 是否停用0否1是（标识设备是否被停用）
     */
    @Column(name = "IS_DISABLE")
    private String isDisable;

    /**
     * 停用日期（设备停用当日的公元纪年日期）
     */
    @Column(name = "DISABLE_DATE")
    private String disableDate;

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
     * 获取ID[主键]
     *
     * @return ID - ID[主键]
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID[主键]
     *
     * @param id ID[主键]
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * 获取会计年度[主键]（会计年度）
     *
     * @return ACCT_YEAR - 会计年度[主键]（会计年度）
     */
    public String getAcctYear() {
        return acctYear;
    }

    /**
     * 设置会计年度[主键]（会计年度）
     *
     * @param acctYear 会计年度[主键]（会计年度）
     */
    public void setAcctYear(String acctYear) {
        this.acctYear = acctYear == null ? null : acctYear.trim();
    }

    /**
     * 获取会计月份[主键]（会计月份）
     *
     * @return ACCT_MONTH - 会计月份[主键]（会计月份）
     */
    public String getAcctMonth() {
        return acctMonth;
    }

    /**
     * 设置会计月份[主键]（会计月份）
     *
     * @param acctMonth 会计月份[主键]（会计月份）
     */
    public void setAcctMonth(String acctMonth) {
        this.acctMonth = acctMonth == null ? null : acctMonth.trim();
    }

    /**
     * 获取机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_NAME - 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgName 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取固定资产卡片号（固定资产卡片号，标识该资产唯一）
     *
     * @return CAPITAL_CARD_NO - 固定资产卡片号（固定资产卡片号，标识该资产唯一）
     */
    public String getCapitalCardNo() {
        return capitalCardNo;
    }

    /**
     * 设置固定资产卡片号（固定资产卡片号，标识该资产唯一）
     *
     * @param capitalCardNo 固定资产卡片号（固定资产卡片号，标识该资产唯一）
     */
    public void setCapitalCardNo(String capitalCardNo) {
        this.capitalCardNo = capitalCardNo == null ? null : capitalCardNo.trim();
    }

    /**
     * 获取卡片状态代码DIR_CARD_STATE_CODE（当前资产卡片的流程状态编码）
     *
     * @return CARD_STATE_CODE - 卡片状态代码DIR_CARD_STATE_CODE（当前资产卡片的流程状态编码）
     */
    public String getCardStateCode() {
        return cardStateCode;
    }

    /**
     * 设置卡片状态代码DIR_CARD_STATE_CODE（当前资产卡片的流程状态编码）
     *
     * @param cardStateCode 卡片状态代码DIR_CARD_STATE_CODE（当前资产卡片的流程状态编码）
     */
    public void setCardStateCode(String cardStateCode) {
        this.cardStateCode = cardStateCode == null ? null : cardStateCode.trim();
    }

    /**
     * 获取卡片状态名称（当前资产卡片的流程状态名称）
     *
     * @return CARD_STATE_NAME - 卡片状态名称（当前资产卡片的流程状态名称）
     */
    public String getCardStateName() {
        return cardStateName;
    }

    /**
     * 设置卡片状态名称（当前资产卡片的流程状态名称）
     *
     * @param cardStateName 卡片状态名称（当前资产卡片的流程状态名称）
     */
    public void setCardStateName(String cardStateName) {
        this.cardStateName = cardStateName == null ? null : cardStateName.trim();
    }

    /**
     * 获取固定资产所在位置类型代码DIR_CAPITAL_PLACE_TYPE_CODE（固定资产所在位置类型在特定编码体系中的代码）
     *
     * @return CAPITAL_PLACE_TYPE_CODE - 固定资产所在位置类型代码DIR_CAPITAL_PLACE_TYPE_CODE（固定资产所在位置类型在特定编码体系中的代码）
     */
    public String getCapitalPlaceTypeCode() {
        return capitalPlaceTypeCode;
    }

    /**
     * 设置固定资产所在位置类型代码DIR_CAPITAL_PLACE_TYPE_CODE（固定资产所在位置类型在特定编码体系中的代码）
     *
     * @param capitalPlaceTypeCode 固定资产所在位置类型代码DIR_CAPITAL_PLACE_TYPE_CODE（固定资产所在位置类型在特定编码体系中的代码）
     */
    public void setCapitalPlaceTypeCode(String capitalPlaceTypeCode) {
        this.capitalPlaceTypeCode = capitalPlaceTypeCode == null ? null : capitalPlaceTypeCode.trim();
    }

    /**
     * 获取固定资产所在位置类型名称（固定资产所在位置类型在特定编码体系中的名称）
     *
     * @return CAPITAL_PLACE_TYPE_NAME - 固定资产所在位置类型名称（固定资产所在位置类型在特定编码体系中的名称）
     */
    public String getCapitalPlaceTypeName() {
        return capitalPlaceTypeName;
    }

    /**
     * 设置固定资产所在位置类型名称（固定资产所在位置类型在特定编码体系中的名称）
     *
     * @param capitalPlaceTypeName 固定资产所在位置类型名称（固定资产所在位置类型在特定编码体系中的名称）
     */
    public void setCapitalPlaceTypeName(String capitalPlaceTypeName) {
        this.capitalPlaceTypeName = capitalPlaceTypeName == null ? null : capitalPlaceTypeName.trim();
    }

    /**
     * 获取科室代码DIR_DEPT（若固定资产在科室就是具体的科室编码，若在库房，此字段值为空）
     *
     * @return DEPT_CODE - 科室代码DIR_DEPT（若固定资产在科室就是具体的科室编码，若在库房，此字段值为空）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室代码DIR_DEPT（若固定资产在科室就是具体的科室编码，若在库房，此字段值为空）
     *
     * @param deptCode 科室代码DIR_DEPT（若固定资产在科室就是具体的科室编码，若在库房，此字段值为空）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称（若固定资产在科室就是具体的科室名称，若在库房，此字段值为空）
     *
     * @return DEPT_NAME - 科室名称（若固定资产在科室就是具体的科室名称，若在库房，此字段值为空）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（若固定资产在科室就是具体的科室名称，若在库房，此字段值为空）
     *
     * @param deptName 科室名称（若固定资产在科室就是具体的科室名称，若在库房，此字段值为空）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取库存单元（若固定资产在库房就是具体的库房名称，若是在科室，此字段值为空）
     *
     * @return STORE_CODE - 库存单元（若固定资产在库房就是具体的库房名称，若是在科室，此字段值为空）
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 设置库存单元（若固定资产在库房就是具体的库房名称，若是在科室，此字段值为空）
     *
     * @param storeCode 库存单元（若固定资产在库房就是具体的库房名称，若是在科室，此字段值为空）
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 获取大型设备管理类别代码DIR_ATT_CODE（大型设备管理类别在特定编码体系中的代码）
     *
     * @return ATT_CODE - 大型设备管理类别代码DIR_ATT_CODE（大型设备管理类别在特定编码体系中的代码）
     */
    public String getAttCode() {
        return attCode;
    }

    /**
     * 设置大型设备管理类别代码DIR_ATT_CODE（大型设备管理类别在特定编码体系中的代码）
     *
     * @param attCode 大型设备管理类别代码DIR_ATT_CODE（大型设备管理类别在特定编码体系中的代码）
     */
    public void setAttCode(String attCode) {
        this.attCode = attCode == null ? null : attCode.trim();
    }

    /**
     * 获取大型设备管理类别名称（大型设备管理类别在特定编码体系中的名称）
     *
     * @return ATT_NAME - 大型设备管理类别名称（大型设备管理类别在特定编码体系中的名称）
     */
    public String getAttName() {
        return attName;
    }

    /**
     * 设置大型设备管理类别名称（大型设备管理类别在特定编码体系中的名称）
     *
     * @param attName 大型设备管理类别名称（大型设备管理类别在特定编码体系中的名称）
     */
    public void setAttName(String attName) {
        this.attName = attName == null ? null : attName.trim();
    }

    /**
     * 获取固定资产名称（对固定资产名称的描述）
     *
     * @return FIXED_ASSETS_NAME - 固定资产名称（对固定资产名称的描述）
     */
    public String getFixedAssetsName() {
        return fixedAssetsName;
    }

    /**
     * 设置固定资产名称（对固定资产名称的描述）
     *
     * @param fixedAssetsName 固定资产名称（对固定资产名称的描述）
     */
    public void setFixedAssetsName(String fixedAssetsName) {
        this.fixedAssetsName = fixedAssetsName == null ? null : fixedAssetsName.trim();
    }

    /**
     * 获取甲乙类设备资产许可证号（甲乙类设备资产许可证号）
     *
     * @return ASSETS_LICENSE_NO - 甲乙类设备资产许可证号（甲乙类设备资产许可证号）
     */
    public String getAssetsLicenseNo() {
        return assetsLicenseNo;
    }

    /**
     * 设置甲乙类设备资产许可证号（甲乙类设备资产许可证号）
     *
     * @param assetsLicenseNo 甲乙类设备资产许可证号（甲乙类设备资产许可证号）
     */
    public void setAssetsLicenseNo(String assetsLicenseNo) {
        this.assetsLicenseNo = assetsLicenseNo == null ? null : assetsLicenseNo.trim();
    }

    /**
     * 获取固定资产分类代码DIR_CAPITAL_TYPE_CODE（固定资产的分类编码）
     *
     * @return CAPITAL_TYPE_CODE - 固定资产分类代码DIR_CAPITAL_TYPE_CODE（固定资产的分类编码）
     */
    public String getCapitalTypeCode() {
        return capitalTypeCode;
    }

    /**
     * 设置固定资产分类代码DIR_CAPITAL_TYPE_CODE（固定资产的分类编码）
     *
     * @param capitalTypeCode 固定资产分类代码DIR_CAPITAL_TYPE_CODE（固定资产的分类编码）
     */
    public void setCapitalTypeCode(String capitalTypeCode) {
        this.capitalTypeCode = capitalTypeCode == null ? null : capitalTypeCode.trim();
    }

    /**
     * 获取固定资产分类名称（固定资产的分类名称）
     *
     * @return CAPITAL_TYPE_NAME - 固定资产分类名称（固定资产的分类名称）
     */
    public String getCapitalTypeName() {
        return capitalTypeName;
    }

    /**
     * 设置固定资产分类名称（固定资产的分类名称）
     *
     * @param capitalTypeName 固定资产分类名称（固定资产的分类名称）
     */
    public void setCapitalTypeName(String capitalTypeName) {
        this.capitalTypeName = capitalTypeName == null ? null : capitalTypeName.trim();
    }

    /**
     * 获取规格（固定资产的具体规格）
     *
     * @return SPEC - 规格（固定资产的具体规格）
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置规格（固定资产的具体规格）
     *
     * @param spec 规格（固定资产的具体规格）
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * 获取型号（固定资产的具体型号）
     *
     * @return MODEL - 型号（固定资产的具体型号）
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号（固定资产的具体型号）
     *
     * @param model 型号（固定资产的具体型号）
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * 获取计量单位（固定资产的计量单位）
     *
     * @return CALCULATE_UNIT - 计量单位（固定资产的计量单位）
     */
    public String getCalculateUnit() {
        return calculateUnit;
    }

    /**
     * 设置计量单位（固定资产的计量单位）
     *
     * @param calculateUnit 计量单位（固定资产的计量单位）
     */
    public void setCalculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit == null ? null : calculateUnit.trim();
    }

    /**
     * 获取品牌（固定资产的品牌）
     *
     * @return BRAND - 品牌（固定资产的品牌）
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌（固定资产的品牌）
     *
     * @param brand 品牌（固定资产的品牌）
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * 获取生产厂家（生产厂家的名称）
     *
     * @return PRODUCER - 生产厂家（生产厂家的名称）
     */
    public String getProducer() {
        return producer;
    }

    /**
     * 设置生产厂家（生产厂家的名称）
     *
     * @param producer 生产厂家（生产厂家的名称）
     */
    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    /**
     * 获取出厂日期（固定资产出厂当日的公元纪年时间）
     *
     * @return FACTORY_DATE - 出厂日期（固定资产出厂当日的公元纪年时间）
     */
    public String getFactoryDate() {
        return factoryDate;
    }

    /**
     * 设置出厂日期（固定资产出厂当日的公元纪年时间）
     *
     * @param factoryDate 出厂日期（固定资产出厂当日的公元纪年时间）
     */
    public void setFactoryDate(String factoryDate) {
        this.factoryDate = factoryDate == null ? null : factoryDate.trim();
    }

    /**
     * 获取固定资产产地国籍GB/T 2659（固定资产的生产所属国籍在特定编码体系中的代码）
     *
     * @return CAPITAL_PLACE_COUNTRY_CODE - 固定资产产地国籍GB/T 2659（固定资产的生产所属国籍在特定编码体系中的代码）
     */
    public String getCapitalPlaceCountryCode() {
        return capitalPlaceCountryCode;
    }

    /**
     * 设置固定资产产地国籍GB/T 2659（固定资产的生产所属国籍在特定编码体系中的代码）
     *
     * @param capitalPlaceCountryCode 固定资产产地国籍GB/T 2659（固定资产的生产所属国籍在特定编码体系中的代码）
     */
    public void setCapitalPlaceCountryCode(String capitalPlaceCountryCode) {
        this.capitalPlaceCountryCode = capitalPlaceCountryCode == null ? null : capitalPlaceCountryCode.trim();
    }

    /**
     * 获取设备序列号（每台设备记录在数据库中的唯一序号）
     *
     * @return EQUIPMENT_NO - 设备序列号（每台设备记录在数据库中的唯一序号）
     */
    public String getEquipmentNo() {
        return equipmentNo;
    }

    /**
     * 设置设备序列号（每台设备记录在数据库中的唯一序号）
     *
     * @param equipmentNo 设备序列号（每台设备记录在数据库中的唯一序号）
     */
    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo == null ? null : equipmentNo.trim();
    }

    /**
     * 获取采购流水号（每条采购记录在数据库中的唯一流水号）
     *
     * @return PURCHASE_NO - 采购流水号（每条采购记录在数据库中的唯一流水号）
     */
    public String getPurchaseNo() {
        return purchaseNo;
    }

    /**
     * 设置采购流水号（每条采购记录在数据库中的唯一流水号）
     *
     * @param purchaseNo 采购流水号（每条采购记录在数据库中的唯一流水号）
     */
    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo == null ? null : purchaseNo.trim();
    }

    /**
     * 获取采购员（采购员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return BUYER - 采购员（采购员在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * 设置采购员（采购员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param buyer 采购员（采购员在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    /**
     * 获取供应商名称（对固定资产供应商的描述）
     *
     * @return SUPPLIER_NAME - 供应商名称（对固定资产供应商的描述）
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称（对固定资产供应商的描述）
     *
     * @param supplierName 供应商名称（对固定资产供应商的描述）
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 获取采购合同号（采购的合同号）
     *
     * @return PURCHASE_CONTRACT_NO - 采购合同号（采购的合同号）
     */
    public String getPurchaseContractNo() {
        return purchaseContractNo;
    }

    /**
     * 设置采购合同号（采购的合同号）
     *
     * @param purchaseContractNo 采购合同号（采购的合同号）
     */
    public void setPurchaseContractNo(String purchaseContractNo) {
        this.purchaseContractNo = purchaseContractNo == null ? null : purchaseContractNo.trim();
    }

    /**
     * 获取固定资产采购单价（固定资产进货的单价）
     *
     * @return PURCHASE_UNIVALENT - 固定资产采购单价（固定资产进货的单价）
     */
    public BigDecimal getPurchaseUnivalent() {
        return purchaseUnivalent;
    }

    /**
     * 设置固定资产采购单价（固定资产进货的单价）
     *
     * @param purchaseUnivalent 固定资产采购单价（固定资产进货的单价）
     */
    public void setPurchaseUnivalent(BigDecimal purchaseUnivalent) {
        this.purchaseUnivalent = purchaseUnivalent;
    }

    /**
     * 获取是否免税0否1是（标识采购的固定资产是否存在免税）
     *
     * @return DUTY_FREE_FLAG - 是否免税0否1是（标识采购的固定资产是否存在免税）
     */
    public String getDutyFreeFlag() {
        return dutyFreeFlag;
    }

    /**
     * 设置是否免税0否1是（标识采购的固定资产是否存在免税）
     *
     * @param dutyFreeFlag 是否免税0否1是（标识采购的固定资产是否存在免税）
     */
    public void setDutyFreeFlag(String dutyFreeFlag) {
        this.dutyFreeFlag = dutyFreeFlag == null ? null : dutyFreeFlag.trim();
    }

    /**
     * 获取固定资产采购资金来源代码DIR_CAPITAL_SOURCE_CODE（固定资产采购资金来源在特定编码体系中的代码）
     *
     * @return CAPITAL_SOURCE_CODE - 固定资产采购资金来源代码DIR_CAPITAL_SOURCE_CODE（固定资产采购资金来源在特定编码体系中的代码）
     */
    public String getCapitalSourceCode() {
        return capitalSourceCode;
    }

    /**
     * 设置固定资产采购资金来源代码DIR_CAPITAL_SOURCE_CODE（固定资产采购资金来源在特定编码体系中的代码）
     *
     * @param capitalSourceCode 固定资产采购资金来源代码DIR_CAPITAL_SOURCE_CODE（固定资产采购资金来源在特定编码体系中的代码）
     */
    public void setCapitalSourceCode(String capitalSourceCode) {
        this.capitalSourceCode = capitalSourceCode == null ? null : capitalSourceCode.trim();
    }

    /**
     * 获取固定资产采购资金来源名称（固定资产采购资金来源在特定编码体系中的名称）
     *
     * @return CAPITAL_SOURCE_NAME - 固定资产采购资金来源名称（固定资产采购资金来源在特定编码体系中的名称）
     */
    public String getCapitalSourceName() {
        return capitalSourceName;
    }

    /**
     * 设置固定资产采购资金来源名称（固定资产采购资金来源在特定编码体系中的名称）
     *
     * @param capitalSourceName 固定资产采购资金来源名称（固定资产采购资金来源在特定编码体系中的名称）
     */
    public void setCapitalSourceName(String capitalSourceName) {
        this.capitalSourceName = capitalSourceName == null ? null : capitalSourceName.trim();
    }

    /**
     * 获取购买日期（购买设备当日的公元纪年日期）
     *
     * @return BUY_DATE - 购买日期（购买设备当日的公元纪年日期）
     */
    public String getBuyDate() {
        return buyDate;
    }

    /**
     * 设置购买日期（购买设备当日的公元纪年日期）
     *
     * @param buyDate 购买日期（购买设备当日的公元纪年日期）
     */
    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate == null ? null : buyDate.trim();
    }

    /**
     * 获取验收日期（验收设备当日的公元纪年日期）
     *
     * @return ACCEPTANCE_DATE - 验收日期（验收设备当日的公元纪年日期）
     */
    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * 设置验收日期（验收设备当日的公元纪年日期）
     *
     * @param acceptanceDate 验收日期（验收设备当日的公元纪年日期）
     */
    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate == null ? null : acceptanceDate.trim();
    }

    /**
     * 获取验收人（验收人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return ACCEPTANCE_PERSON - 验收人（验收人在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getAcceptancePerson() {
        return acceptancePerson;
    }

    /**
     * 设置验收人（验收人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param acceptancePerson 验收人（验收人在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setAcceptancePerson(String acceptancePerson) {
        this.acceptancePerson = acceptancePerson == null ? null : acceptancePerson.trim();
    }

    /**
     * 获取开始使用日期（开始使用的公元纪年日期）
     *
     * @return START_USING_DATE - 开始使用日期（开始使用的公元纪年日期）
     */
    public String getStartUsingDate() {
        return startUsingDate;
    }

    /**
     * 设置开始使用日期（开始使用的公元纪年日期）
     *
     * @param startUsingDate 开始使用日期（开始使用的公元纪年日期）
     */
    public void setStartUsingDate(String startUsingDate) {
        this.startUsingDate = startUsingDate == null ? null : startUsingDate.trim();
    }

    /**
     * 获取设备单价（设备的进货单价）
     *
     * @return EQUIPMENT_OUTPAT_FEE_PRICE - 设备单价（设备的进货单价）
     */
    public BigDecimal getEquipmentOutpatFeePrice() {
        return equipmentOutpatFeePrice;
    }

    /**
     * 设置设备单价（设备的进货单价）
     *
     * @param equipmentOutpatFeePrice 设备单价（设备的进货单价）
     */
    public void setEquipmentOutpatFeePrice(BigDecimal equipmentOutpatFeePrice) {
        this.equipmentOutpatFeePrice = equipmentOutpatFeePrice;
    }

    /**
     * 获取设备原值（设备的原值，包括单价、运输费、安装费等）
     *
     * @return EQUIPMENT_ORIGINAL_VALUE - 设备原值（设备的原值，包括单价、运输费、安装费等）
     */
    public BigDecimal getEquipmentOriginalValue() {
        return equipmentOriginalValue;
    }

    /**
     * 设置设备原值（设备的原值，包括单价、运输费、安装费等）
     *
     * @param equipmentOriginalValue 设备原值（设备的原值，包括单价、运输费、安装费等）
     */
    public void setEquipmentOriginalValue(BigDecimal equipmentOriginalValue) {
        this.equipmentOriginalValue = equipmentOriginalValue;
    }

    /**
     * 获取设备现值（设备的当前价值）
     *
     * @return EQUIPMENT_PRESENT_VALUE - 设备现值（设备的当前价值）
     */
    public BigDecimal getEquipmentPresentValue() {
        return equipmentPresentValue;
    }

    /**
     * 设置设备现值（设备的当前价值）
     *
     * @param equipmentPresentValue 设备现值（设备的当前价值）
     */
    public void setEquipmentPresentValue(BigDecimal equipmentPresentValue) {
        this.equipmentPresentValue = equipmentPresentValue;
    }

    /**
     * 获取预计残值（设备的残值）
     *
     * @return EXPECT_RESIDUAL_VALUE - 预计残值（设备的残值）
     */
    public BigDecimal getExpectResidualValue() {
        return expectResidualValue;
    }

    /**
     * 设置预计残值（设备的残值）
     *
     * @param expectResidualValue 预计残值（设备的残值）
     */
    public void setExpectResidualValue(BigDecimal expectResidualValue) {
        this.expectResidualValue = expectResidualValue;
    }

    /**
     * 获取使用年限（距设备报废的使用时间）
     *
     * @return USE_YEARS - 使用年限（距设备报废的使用时间）
     */
    public Integer getUseYears() {
        return useYears;
    }

    /**
     * 设置使用年限（距设备报废的使用时间）
     *
     * @param useYears 使用年限（距设备报废的使用时间）
     */
    public void setUseYears(Integer useYears) {
        this.useYears = useYears;
    }

    /**
     * 获取是否进口0否1是（标识该设备是否进口）
     *
     * @return IS_IMPORT - 是否进口0否1是（标识该设备是否进口）
     */
    public String getIsImport() {
        return isImport;
    }

    /**
     * 设置是否进口0否1是（标识该设备是否进口）
     *
     * @param isImport 是否进口0否1是（标识该设备是否进口）
     */
    public void setIsImport(String isImport) {
        this.isImport = isImport == null ? null : isImport.trim();
    }

    /**
     * 获取是否折旧0否1是（表示该设备是否进行折旧）
     *
     * @return IS_DEPRECIATION - 是否折旧0否1是（表示该设备是否进行折旧）
     */
    public String getIsDepreciation() {
        return isDepreciation;
    }

    /**
     * 设置是否折旧0否1是（表示该设备是否进行折旧）
     *
     * @param isDepreciation 是否折旧0否1是（表示该设备是否进行折旧）
     */
    public void setIsDepreciation(String isDepreciation) {
        this.isDepreciation = isDepreciation == null ? null : isDepreciation.trim();
    }

    /**
     * 获取累计折旧（从固定资产开始折旧期的累计折旧值，理论上累计折旧+预计残值+资产现值=资产原值）
     *
     * @return ACCUMULATED_DEPRECIATION - 累计折旧（从固定资产开始折旧期的累计折旧值，理论上累计折旧+预计残值+资产现值=资产原值）
     */
    public BigDecimal getAccumulatedDepreciation() {
        return accumulatedDepreciation;
    }

    /**
     * 设置累计折旧（从固定资产开始折旧期的累计折旧值，理论上累计折旧+预计残值+资产现值=资产原值）
     *
     * @param accumulatedDepreciation 累计折旧（从固定资产开始折旧期的累计折旧值，理论上累计折旧+预计残值+资产现值=资产原值）
     */
    public void setAccumulatedDepreciation(BigDecimal accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
    }

    /**
     * 获取是否旧设备0否1是（标识该设备是否是旧设备）
     *
     * @return IS_OLD_EQUIPMENT - 是否旧设备0否1是（标识该设备是否是旧设备）
     */
    public String getIsOldEquipment() {
        return isOldEquipment;
    }

    /**
     * 设置是否旧设备0否1是（标识该设备是否是旧设备）
     *
     * @param isOldEquipment 是否旧设备0否1是（标识该设备是否是旧设备）
     */
    public void setIsOldEquipment(String isOldEquipment) {
        this.isOldEquipment = isOldEquipment == null ? null : isOldEquipment.trim();
    }

    /**
     * 获取已用年限（固定资产已使用的时间，计量单位(年)）
     *
     * @return UESD_YEARS - 已用年限（固定资产已使用的时间，计量单位(年)）
     */
    public Integer getUesdYears() {
        return uesdYears;
    }

    /**
     * 设置已用年限（固定资产已使用的时间，计量单位(年)）
     *
     * @param uesdYears 已用年限（固定资产已使用的时间，计量单位(年)）
     */
    public void setUesdYears(Integer uesdYears) {
        this.uesdYears = uesdYears;
    }

    /**
     * 获取固定资产使用状态代码DIR_CAPITAL_USE_STATE_CODE（固定资产的使用状态在特定编码体系中的代码）
     *
     * @return CAPITAL_USE_STATE_CODE - 固定资产使用状态代码DIR_CAPITAL_USE_STATE_CODE（固定资产的使用状态在特定编码体系中的代码）
     */
    public String getCapitalUseStateCode() {
        return capitalUseStateCode;
    }

    /**
     * 设置固定资产使用状态代码DIR_CAPITAL_USE_STATE_CODE（固定资产的使用状态在特定编码体系中的代码）
     *
     * @param capitalUseStateCode 固定资产使用状态代码DIR_CAPITAL_USE_STATE_CODE（固定资产的使用状态在特定编码体系中的代码）
     */
    public void setCapitalUseStateCode(String capitalUseStateCode) {
        this.capitalUseStateCode = capitalUseStateCode == null ? null : capitalUseStateCode.trim();
    }

    /**
     * 获取固定资产使用状态名称（固定资产的使用状态在特定编码体系中的名称）
     *
     * @return CAPITAL_USE_STATE_NAME - 固定资产使用状态名称（固定资产的使用状态在特定编码体系中的名称）
     */
    public String getCapitalUseStateName() {
        return capitalUseStateName;
    }

    /**
     * 设置固定资产使用状态名称（固定资产的使用状态在特定编码体系中的名称）
     *
     * @param capitalUseStateName 固定资产使用状态名称（固定资产的使用状态在特定编码体系中的名称）
     */
    public void setCapitalUseStateName(String capitalUseStateName) {
        this.capitalUseStateName = capitalUseStateName == null ? null : capitalUseStateName.trim();
    }

    /**
     * 获取放置地点（对设备放置地点的描述）
     *
     * @return PLACE - 放置地点（对设备放置地点的描述）
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置放置地点（对设备放置地点的描述）
     *
     * @param place 放置地点（对设备放置地点的描述）
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * 获取是否停用0否1是（标识设备是否被停用）
     *
     * @return IS_DISABLE - 是否停用0否1是（标识设备是否被停用）
     */
    public String getIsDisable() {
        return isDisable;
    }

    /**
     * 设置是否停用0否1是（标识设备是否被停用）
     *
     * @param isDisable 是否停用0否1是（标识设备是否被停用）
     */
    public void setIsDisable(String isDisable) {
        this.isDisable = isDisable == null ? null : isDisable.trim();
    }

    /**
     * 获取停用日期（设备停用当日的公元纪年日期）
     *
     * @return DISABLE_DATE - 停用日期（设备停用当日的公元纪年日期）
     */
    public String getDisableDate() {
        return disableDate;
    }

    /**
     * 设置停用日期（设备停用当日的公元纪年日期）
     *
     * @param disableDate 停用日期（设备停用当日的公元纪年日期）
     */
    public void setDisableDate(String disableDate) {
        this.disableDate = disableDate == null ? null : disableDate.trim();
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