package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DRUG_CLASS")
public class DrugClass {
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
     * 药品分类代码
     */
    @Column(name = "DRUG_CLASS_CODE")
    private String drugClassCode;

    /**
     * 药品分类名称
     */
    @Column(name = "DRUG_CLASS")
    private String drugClass;

    /**
     * 当前分类级别
     */
    @Column(name = "DRUG_LEVEL")
    private String drugLevel;

    /**
     * 对应上级分类代码
     */
    @Column(name = "DRUG_PARENT")
    private String drugParent;

    /**
     * 当前分类描述
     */
    @Column(name = "DESCRIBE")
    private String describe;

    /**
     * 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

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
     * 获取药品分类代码
     *
     * @return DRUG_CLASS_CODE - 药品分类代码
     */
    public String getDrugClassCode() {
        return drugClassCode;
    }

    /**
     * 设置药品分类代码
     *
     * @param drugClassCode 药品分类代码
     */
    public void setDrugClassCode(String drugClassCode) {
        this.drugClassCode = drugClassCode == null ? null : drugClassCode.trim();
    }

    /**
     * 获取药品分类名称
     *
     * @return DRUG_CLASS - 药品分类名称
     */
    public String getDrugClass() {
        return drugClass;
    }

    /**
     * 设置药品分类名称
     *
     * @param drugClass 药品分类名称
     */
    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass == null ? null : drugClass.trim();
    }

    /**
     * 获取当前分类级别
     *
     * @return DRUG_LEVEL - 当前分类级别
     */
    public String getDrugLevel() {
        return drugLevel;
    }

    /**
     * 设置当前分类级别
     *
     * @param drugLevel 当前分类级别
     */
    public void setDrugLevel(String drugLevel) {
        this.drugLevel = drugLevel == null ? null : drugLevel.trim();
    }

    /**
     * 获取对应上级分类代码
     *
     * @return DRUG_PARENT - 对应上级分类代码
     */
    public String getDrugParent() {
        return drugParent;
    }

    /**
     * 设置对应上级分类代码
     *
     * @param drugParent 对应上级分类代码
     */
    public void setDrugParent(String drugParent) {
        this.drugParent = drugParent == null ? null : drugParent.trim();
    }

    /**
     * 获取当前分类描述
     *
     * @return DESCRIBE - 当前分类描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置当前分类描述
     *
     * @param describe 当前分类描述
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
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
}