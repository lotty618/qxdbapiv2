package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_PATIENT_ADDRESS")
public class QxTPatientAddress {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病人地址唯一标识
     */
    @Column(name = "PAUID")
    private String pauid;

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
     * 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 医疗机构标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     */
    @Column(name = "ADDRESS_TYPE_CODE")
    private String addressTypeCode;

    /**
     * 地址-省（自治区、直辖市）（本人地址中的省、自治区或直辖市名称）
     */
    @Column(name = "PROV")
    private String prov;

    /**
     * 地址-市（地区、州）（本人地址中的市、地区或州的名称 ）
     */
    @Column(name = "CITY")
    private String city;

    /**
     * 地址-县（区）（本人地址中的县（区）的名称 ）
     */
    @Column(name = "COUNTY")
    private String county;

    /**
     * 地址-乡（镇、街道办事处） （本人地址中的乡、镇或城市的街道办事处名称）
     */
    @Column(name = "TOWN_SHIP")
    private String townShip;

    /**
     * 地址-村（街、路、弄等）（本人地址中的村或城市的街、路、里、弄等名称 ）
     */
    @Column(name = "STREET")
    private String street;

    /**
     * 地址-门牌号码（本人地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    @Column(name = "HOUSE_NUMBER")
    private String houseNumber;

    /**
     * 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号 ）
     */
    @Column(name = "POSETCODE")
    private String posetcode;

    /**
     * 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
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
     * 获取病人地址唯一标识
     *
     * @return PAUID - 病人地址唯一标识
     */
    public String getPauid() {
        return pauid;
    }

    /**
     * 设置病人地址唯一标识
     *
     * @param pauid 病人地址唯一标识
     */
    public void setPauid(String pauid) {
        this.pauid = pauid == null ? null : pauid.trim();
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
     * 获取患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
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
     * 获取医疗机构标识
     *
     * @return ORGUID - 医疗机构标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置医疗机构标识
     *
     * @param orguid 医疗机构标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     *
     * @return ADDRESS_TYPE_CODE - 地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * 设置地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     *
     * @param addressTypeCode 地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     */
    public void setAddressTypeCode(String addressTypeCode) {
        this.addressTypeCode = addressTypeCode == null ? null : addressTypeCode.trim();
    }

    /**
     * 获取地址-省（自治区、直辖市）（本人地址中的省、自治区或直辖市名称）
     *
     * @return PROV - 地址-省（自治区、直辖市）（本人地址中的省、自治区或直辖市名称）
     */
    public String getProv() {
        return prov;
    }

    /**
     * 设置地址-省（自治区、直辖市）（本人地址中的省、自治区或直辖市名称）
     *
     * @param prov 地址-省（自治区、直辖市）（本人地址中的省、自治区或直辖市名称）
     */
    public void setProv(String prov) {
        this.prov = prov == null ? null : prov.trim();
    }

    /**
     * 获取地址-市（地区、州）（本人地址中的市、地区或州的名称 ）
     *
     * @return CITY - 地址-市（地区、州）（本人地址中的市、地区或州的名称 ）
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置地址-市（地区、州）（本人地址中的市、地区或州的名称 ）
     *
     * @param city 地址-市（地区、州）（本人地址中的市、地区或州的名称 ）
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取地址-县（区）（本人地址中的县（区）的名称 ）
     *
     * @return COUNTY - 地址-县（区）（本人地址中的县（区）的名称 ）
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置地址-县（区）（本人地址中的县（区）的名称 ）
     *
     * @param county 地址-县（区）（本人地址中的县（区）的名称 ）
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * 获取地址-乡（镇、街道办事处） （本人地址中的乡、镇或城市的街道办事处名称）
     *
     * @return TOWN_SHIP - 地址-乡（镇、街道办事处） （本人地址中的乡、镇或城市的街道办事处名称）
     */
    public String getTownShip() {
        return townShip;
    }

    /**
     * 设置地址-乡（镇、街道办事处） （本人地址中的乡、镇或城市的街道办事处名称）
     *
     * @param townShip 地址-乡（镇、街道办事处） （本人地址中的乡、镇或城市的街道办事处名称）
     */
    public void setTownShip(String townShip) {
        this.townShip = townShip == null ? null : townShip.trim();
    }

    /**
     * 获取地址-村（街、路、弄等）（本人地址中的村或城市的街、路、里、弄等名称 ）
     *
     * @return STREET - 地址-村（街、路、弄等）（本人地址中的村或城市的街、路、里、弄等名称 ）
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置地址-村（街、路、弄等）（本人地址中的村或城市的街、路、里、弄等名称 ）
     *
     * @param street 地址-村（街、路、弄等）（本人地址中的村或城市的街、路、里、弄等名称 ）
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * 获取地址-门牌号码（本人地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @return HOUSE_NUMBER - 地址-门牌号码（本人地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * 设置地址-门牌号码（本人地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     *
     * @param houseNumber 地址-门牌号码（本人地址中的门牌号码，地址无法拆分时，统一将地址描述写入此字段）
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    /**
     * 获取邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号 ）
     *
     * @return POSETCODE - 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号 ）
     */
    public String getPosetcode() {
        return posetcode;
    }

    /**
     * 设置邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号 ）
     *
     * @param posetcode 邮政编码（由阿拉伯数字组成，用来表示与地址对应的邮局及其投递区域的邮政通信代号 ）
     */
    public void setPosetcode(String posetcode) {
        this.posetcode = posetcode == null ? null : posetcode.trim();
    }

    /**
     * 获取最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
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