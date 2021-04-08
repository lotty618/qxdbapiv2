package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT_ADDRESS")
public class PatientAddress {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 地址类别代码[主键]CV02.01.205（本人地址类别在特定编码体系中的代码）
     */
    @Id
    @Column(name = "ADDRESS_TYPE_CODE")
    private String addressTypeCode;

    /**
     * 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

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
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
     * 获取事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @return EVENT_TYPE - 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @param eventType 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
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
     * 获取事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @return EVENT_TYPE_CN - 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public String getEventTypeCn() {
        return eventTypeCn;
    }

    /**
     * 设置事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @param eventTypeCn 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public void setEventTypeCn(String eventTypeCn) {
        this.eventTypeCn = eventTypeCn == null ? null : eventTypeCn.trim();
    }
}