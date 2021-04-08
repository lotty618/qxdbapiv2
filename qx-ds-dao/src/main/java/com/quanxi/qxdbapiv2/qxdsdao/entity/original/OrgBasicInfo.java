package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_BASIC_INFO")
public class OrgBasicInfo {
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 机构名称[主键]（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 机构地址-省（自治区、直辖市）（机构地址中的省、自治区或直辖市名称）
     */
    @Column(name = "PRESENT_ADDR_PROVINCE")
    private String presentAddrProvince;

    /**
     * 机构地址-市（地区、州）（机构地址中的市、地区或州的名称）
     */
    @Column(name = "PRESENT_ADDR_CITY")
    private String presentAddrCity;

    /**
     * 机构地址-县（区）（机构地址中的县（区）的名称）
     */
    @Column(name = "PRESENT_ADDR_COUNTY")
    private String presentAddrCounty;

    /**
     * 机构地址-乡(镇、街道办事处)（机构地址中的乡、镇或城市的衔道办事处名称）
     */
    @Column(name = "PRESENT_ADDR_TOWN")
    private String presentAddrTown;

    /**
     * 机构地址-村（街、路、弄等）（机构地址中的村或城市的街、路、里、弄等名称）
     */
    @Column(name = "PRESENT_ADDR_VILLAGE")
    private String presentAddrVillage;

    /**
     * 机构地址-门牌号码（机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "PRESENT_ADDR_HOUSE_NO")
    private String presentAddrHouseNo;

    /**
     * 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号）
     */
    @Column(name = "POSTAL_CODE")
    private String postalCode;

    /**
     * 行政区划代码（标识中华人民共和国县级及县级以上行政区划的代码）
     */
    @Column(name = "DISTRICT_CODE")
    private String districtCode;

    /**
     * 联系电话（电话号码，包括国际、国内区号和分机号）
     */
    @Column(name = "CONTACT_TEL_NO")
    private String contactTelNo;

    /**
     * 电子信箱（电子邮箱名称）
     */
    @Column(name = "EMAIL_ADRESS")
    private String emailAdress;

    /**
     * 单位网站域名
     */
    @Column(name = "WEBSITE_DOMAIN_NAME")
    private String websiteDomainName;

    /**
     * 单位成立时间
     */
    @Column(name = "ESTABLISHMENT_DATE")
    private String establishmentDate;

    /**
     * 单位负责人（法人）
     */
    @Column(name = "CHARGE_NAME")
    private String chargeName;

    /**
     * 下属单位数量
     */
    @Column(name = "SUB_INSTITUTION_COUNT")
    private Short subInstitutionCount;

    /**
     * 下属卫生服务站数量
     */
    @Column(name = "CHSS_COUNT")
    private Short chssCount;

    /**
     * 机构级别1一级 2二级 3三级 9未定级
     */
    @Column(name = "ORG_LEVEL")
    private String orgLevel;

    /**
     * 机构等次1甲等 2乙等 3丙等 9未定等
     */
    @Column(name = "ORG_CLASSES")
    private String orgClasses;

    /**
     * 是否区域医疗中心0否 1是
     */
    @Column(name = "IS_MEDICAL_CENTER")
    private String isMedicalCenter;

    /**
     * 医疗中心类别1综合性 2专科性
     */
    @Column(name = "MEDICAL_CENTER_TYPE")
    private String medicalCenterType;

    /**
     * 医疗中心级别1国家 2省级 3市级
     */
    @Column(name = "MEDICAL_CENTER_GRADE")
    private String medicalCenterGrade;

    /**
     * 编制人数
     */
    @Column(name = "STAFF_NO")
    private Integer staffNo;

    /**
     * 编制床位
     */
    @Column(name = "ESTABLISHMENT_BEDS")
    private Integer establishmentBeds;

    /**
     * 建筑面积（m2）
     */
    @Column(name = "BUILT_UP_AREA")
    private BigDecimal builtUpArea;

    /**
     * 经济类型代码GB/T 12402
     */
    @Column(name = "ECONOMIC_TYPE_CODE")
    private String economicTypeCode;

    /**
     * 经济类型名称
     */
    @Column(name = "ECONOMIC_TYPE_NAME")
    private String economicTypeName;

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
     * 获取机构名称[主键]（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_NAME - 机构名称[主键]（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称[主键]（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgName 机构名称[主键]（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取机构地址-省（自治区、直辖市）（机构地址中的省、自治区或直辖市名称）
     *
     * @return PRESENT_ADDR_PROVINCE - 机构地址-省（自治区、直辖市）（机构地址中的省、自治区或直辖市名称）
     */
    public String getPresentAddrProvince() {
        return presentAddrProvince;
    }

    /**
     * 设置机构地址-省（自治区、直辖市）（机构地址中的省、自治区或直辖市名称）
     *
     * @param presentAddrProvince 机构地址-省（自治区、直辖市）（机构地址中的省、自治区或直辖市名称）
     */
    public void setPresentAddrProvince(String presentAddrProvince) {
        this.presentAddrProvince = presentAddrProvince == null ? null : presentAddrProvince.trim();
    }

    /**
     * 获取机构地址-市（地区、州）（机构地址中的市、地区或州的名称）
     *
     * @return PRESENT_ADDR_CITY - 机构地址-市（地区、州）（机构地址中的市、地区或州的名称）
     */
    public String getPresentAddrCity() {
        return presentAddrCity;
    }

    /**
     * 设置机构地址-市（地区、州）（机构地址中的市、地区或州的名称）
     *
     * @param presentAddrCity 机构地址-市（地区、州）（机构地址中的市、地区或州的名称）
     */
    public void setPresentAddrCity(String presentAddrCity) {
        this.presentAddrCity = presentAddrCity == null ? null : presentAddrCity.trim();
    }

    /**
     * 获取机构地址-县（区）（机构地址中的县（区）的名称）
     *
     * @return PRESENT_ADDR_COUNTY - 机构地址-县（区）（机构地址中的县（区）的名称）
     */
    public String getPresentAddrCounty() {
        return presentAddrCounty;
    }

    /**
     * 设置机构地址-县（区）（机构地址中的县（区）的名称）
     *
     * @param presentAddrCounty 机构地址-县（区）（机构地址中的县（区）的名称）
     */
    public void setPresentAddrCounty(String presentAddrCounty) {
        this.presentAddrCounty = presentAddrCounty == null ? null : presentAddrCounty.trim();
    }

    /**
     * 获取机构地址-乡(镇、街道办事处)（机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @return PRESENT_ADDR_TOWN - 机构地址-乡(镇、街道办事处)（机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public String getPresentAddrTown() {
        return presentAddrTown;
    }

    /**
     * 设置机构地址-乡(镇、街道办事处)（机构地址中的乡、镇或城市的衔道办事处名称）
     *
     * @param presentAddrTown 机构地址-乡(镇、街道办事处)（机构地址中的乡、镇或城市的衔道办事处名称）
     */
    public void setPresentAddrTown(String presentAddrTown) {
        this.presentAddrTown = presentAddrTown == null ? null : presentAddrTown.trim();
    }

    /**
     * 获取机构地址-村（街、路、弄等）（机构地址中的村或城市的街、路、里、弄等名称）
     *
     * @return PRESENT_ADDR_VILLAGE - 机构地址-村（街、路、弄等）（机构地址中的村或城市的街、路、里、弄等名称）
     */
    public String getPresentAddrVillage() {
        return presentAddrVillage;
    }

    /**
     * 设置机构地址-村（街、路、弄等）（机构地址中的村或城市的街、路、里、弄等名称）
     *
     * @param presentAddrVillage 机构地址-村（街、路、弄等）（机构地址中的村或城市的街、路、里、弄等名称）
     */
    public void setPresentAddrVillage(String presentAddrVillage) {
        this.presentAddrVillage = presentAddrVillage == null ? null : presentAddrVillage.trim();
    }

    /**
     * 获取机构地址-门牌号码（机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return PRESENT_ADDR_HOUSE_NO - 机构地址-门牌号码（机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getPresentAddrHouseNo() {
        return presentAddrHouseNo;
    }

    /**
     * 设置机构地址-门牌号码（机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param presentAddrHouseNo 机构地址-门牌号码（机构地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setPresentAddrHouseNo(String presentAddrHouseNo) {
        this.presentAddrHouseNo = presentAddrHouseNo == null ? null : presentAddrHouseNo.trim();
    }

    /**
     * 获取邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号）
     *
     * @return POSTAL_CODE - 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号）
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号）
     *
     * @param postalCode 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号）
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * 获取行政区划代码（标识中华人民共和国县级及县级以上行政区划的代码）
     *
     * @return DISTRICT_CODE - 行政区划代码（标识中华人民共和国县级及县级以上行政区划的代码）
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * 设置行政区划代码（标识中华人民共和国县级及县级以上行政区划的代码）
     *
     * @param districtCode 行政区划代码（标识中华人民共和国县级及县级以上行政区划的代码）
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    /**
     * 获取联系电话（电话号码，包括国际、国内区号和分机号）
     *
     * @return CONTACT_TEL_NO - 联系电话（电话号码，包括国际、国内区号和分机号）
     */
    public String getContactTelNo() {
        return contactTelNo;
    }

    /**
     * 设置联系电话（电话号码，包括国际、国内区号和分机号）
     *
     * @param contactTelNo 联系电话（电话号码，包括国际、国内区号和分机号）
     */
    public void setContactTelNo(String contactTelNo) {
        this.contactTelNo = contactTelNo == null ? null : contactTelNo.trim();
    }

    /**
     * 获取电子信箱（电子邮箱名称）
     *
     * @return EMAIL_ADRESS - 电子信箱（电子邮箱名称）
     */
    public String getEmailAdress() {
        return emailAdress;
    }

    /**
     * 设置电子信箱（电子邮箱名称）
     *
     * @param emailAdress 电子信箱（电子邮箱名称）
     */
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress == null ? null : emailAdress.trim();
    }

    /**
     * 获取单位网站域名
     *
     * @return WEBSITE_DOMAIN_NAME - 单位网站域名
     */
    public String getWebsiteDomainName() {
        return websiteDomainName;
    }

    /**
     * 设置单位网站域名
     *
     * @param websiteDomainName 单位网站域名
     */
    public void setWebsiteDomainName(String websiteDomainName) {
        this.websiteDomainName = websiteDomainName == null ? null : websiteDomainName.trim();
    }

    /**
     * 获取单位成立时间
     *
     * @return ESTABLISHMENT_DATE - 单位成立时间
     */
    public String getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * 设置单位成立时间
     *
     * @param establishmentDate 单位成立时间
     */
    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate == null ? null : establishmentDate.trim();
    }

    /**
     * 获取单位负责人（法人）
     *
     * @return CHARGE_NAME - 单位负责人（法人）
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * 设置单位负责人（法人）
     *
     * @param chargeName 单位负责人（法人）
     */
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
    }

    /**
     * 获取下属单位数量
     *
     * @return SUB_INSTITUTION_COUNT - 下属单位数量
     */
    public Short getSubInstitutionCount() {
        return subInstitutionCount;
    }

    /**
     * 设置下属单位数量
     *
     * @param subInstitutionCount 下属单位数量
     */
    public void setSubInstitutionCount(Short subInstitutionCount) {
        this.subInstitutionCount = subInstitutionCount;
    }

    /**
     * 获取下属卫生服务站数量
     *
     * @return CHSS_COUNT - 下属卫生服务站数量
     */
    public Short getChssCount() {
        return chssCount;
    }

    /**
     * 设置下属卫生服务站数量
     *
     * @param chssCount 下属卫生服务站数量
     */
    public void setChssCount(Short chssCount) {
        this.chssCount = chssCount;
    }

    /**
     * 获取机构级别1一级 2二级 3三级 9未定级
     *
     * @return ORG_LEVEL - 机构级别1一级 2二级 3三级 9未定级
     */
    public String getOrgLevel() {
        return orgLevel;
    }

    /**
     * 设置机构级别1一级 2二级 3三级 9未定级
     *
     * @param orgLevel 机构级别1一级 2二级 3三级 9未定级
     */
    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    /**
     * 获取机构等次1甲等 2乙等 3丙等 9未定等
     *
     * @return ORG_CLASSES - 机构等次1甲等 2乙等 3丙等 9未定等
     */
    public String getOrgClasses() {
        return orgClasses;
    }

    /**
     * 设置机构等次1甲等 2乙等 3丙等 9未定等
     *
     * @param orgClasses 机构等次1甲等 2乙等 3丙等 9未定等
     */
    public void setOrgClasses(String orgClasses) {
        this.orgClasses = orgClasses == null ? null : orgClasses.trim();
    }

    /**
     * 获取是否区域医疗中心0否 1是
     *
     * @return IS_MEDICAL_CENTER - 是否区域医疗中心0否 1是
     */
    public String getIsMedicalCenter() {
        return isMedicalCenter;
    }

    /**
     * 设置是否区域医疗中心0否 1是
     *
     * @param isMedicalCenter 是否区域医疗中心0否 1是
     */
    public void setIsMedicalCenter(String isMedicalCenter) {
        this.isMedicalCenter = isMedicalCenter == null ? null : isMedicalCenter.trim();
    }

    /**
     * 获取医疗中心类别1综合性 2专科性
     *
     * @return MEDICAL_CENTER_TYPE - 医疗中心类别1综合性 2专科性
     */
    public String getMedicalCenterType() {
        return medicalCenterType;
    }

    /**
     * 设置医疗中心类别1综合性 2专科性
     *
     * @param medicalCenterType 医疗中心类别1综合性 2专科性
     */
    public void setMedicalCenterType(String medicalCenterType) {
        this.medicalCenterType = medicalCenterType == null ? null : medicalCenterType.trim();
    }

    /**
     * 获取医疗中心级别1国家 2省级 3市级
     *
     * @return MEDICAL_CENTER_GRADE - 医疗中心级别1国家 2省级 3市级
     */
    public String getMedicalCenterGrade() {
        return medicalCenterGrade;
    }

    /**
     * 设置医疗中心级别1国家 2省级 3市级
     *
     * @param medicalCenterGrade 医疗中心级别1国家 2省级 3市级
     */
    public void setMedicalCenterGrade(String medicalCenterGrade) {
        this.medicalCenterGrade = medicalCenterGrade == null ? null : medicalCenterGrade.trim();
    }

    /**
     * 获取编制人数
     *
     * @return STAFF_NO - 编制人数
     */
    public Integer getStaffNo() {
        return staffNo;
    }

    /**
     * 设置编制人数
     *
     * @param staffNo 编制人数
     */
    public void setStaffNo(Integer staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * 获取编制床位
     *
     * @return ESTABLISHMENT_BEDS - 编制床位
     */
    public Integer getEstablishmentBeds() {
        return establishmentBeds;
    }

    /**
     * 设置编制床位
     *
     * @param establishmentBeds 编制床位
     */
    public void setEstablishmentBeds(Integer establishmentBeds) {
        this.establishmentBeds = establishmentBeds;
    }

    /**
     * 获取建筑面积（m2）
     *
     * @return BUILT_UP_AREA - 建筑面积（m2）
     */
    public BigDecimal getBuiltUpArea() {
        return builtUpArea;
    }

    /**
     * 设置建筑面积（m2）
     *
     * @param builtUpArea 建筑面积（m2）
     */
    public void setBuiltUpArea(BigDecimal builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    /**
     * 获取经济类型代码GB/T 12402
     *
     * @return ECONOMIC_TYPE_CODE - 经济类型代码GB/T 12402
     */
    public String getEconomicTypeCode() {
        return economicTypeCode;
    }

    /**
     * 设置经济类型代码GB/T 12402
     *
     * @param economicTypeCode 经济类型代码GB/T 12402
     */
    public void setEconomicTypeCode(String economicTypeCode) {
        this.economicTypeCode = economicTypeCode == null ? null : economicTypeCode.trim();
    }

    /**
     * 获取经济类型名称
     *
     * @return ECONOMIC_TYPE_NAME - 经济类型名称
     */
    public String getEconomicTypeName() {
        return economicTypeName;
    }

    /**
     * 设置经济类型名称
     *
     * @param economicTypeName 经济类型名称
     */
    public void setEconomicTypeName(String economicTypeName) {
        this.economicTypeName = economicTypeName == null ? null : economicTypeName.trim();
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