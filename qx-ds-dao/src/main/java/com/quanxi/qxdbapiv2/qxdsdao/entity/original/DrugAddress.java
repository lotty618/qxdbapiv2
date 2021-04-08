package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DRUG_ADDRESS")
public class DrugAddress {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 产地标识
     */
    @Id
    @Column(name = "REVISION")
    private String revision;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 药品代码
     */
    @Id
    @Column(name = "DRUG_CODE")
    private String drugCode;

    /**
     * 药品产地
     */
    @Column(name = "DRUG_ORIGIN")
    private String drugOrigin;

    /**
     * 进货价格
     */
    @Column(name = "PRICESTOCK")
    private String pricestock;

    /**
     * 零售价格
     */
    @Column(name = "PRICERETAIL")
    private String priceretail;

    /**
     * 批发价格
     */
    @Column(name = "PRICEWHOLESALE")
    private String pricewholesale;

    /**
     * 进货金额
     */
    @Column(name = "MONEYSTOCK")
    private String moneystock;

    /**
     * 零售金额
     */
    @Column(name = "MONEYRETAIL")
    private String moneyretail;

    /**
     * 批发金额
     */
    @Column(name = "MONEYWHOLESALE")
    private String moneywholesale;

    /**
     * 作废判断
     */
    @Column(name = "ISABOLISH")
    private String isabolish;

    /**
     * 批准文号
     */
    @Column(name = "APPROVALNUM")
    private String approvalnum;

    /**
     * GMP认证
     */
    @Column(name = "GMPAPPROVE")
    private String gmpapprove;

    /**
     * 定价方式
     */
    @Column(name = "MAKEPRICETYPE")
    private String makepricetype;

    /**
     * 定价公式
     */
    @Column(name = "MAKEPRICEFORMULA")
    private String makepriceformula;

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
     * 获取产地标识
     *
     * @return REVISION - 产地标识
     */
    public String getRevision() {
        return revision;
    }

    /**
     * 设置产地标识
     *
     * @param revision 产地标识
     */
    public void setRevision(String revision) {
        this.revision = revision == null ? null : revision.trim();
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
     * 获取药品产地
     *
     * @return DRUG_ORIGIN - 药品产地
     */
    public String getDrugOrigin() {
        return drugOrigin;
    }

    /**
     * 设置药品产地
     *
     * @param drugOrigin 药品产地
     */
    public void setDrugOrigin(String drugOrigin) {
        this.drugOrigin = drugOrigin == null ? null : drugOrigin.trim();
    }

    /**
     * 获取进货价格
     *
     * @return PRICESTOCK - 进货价格
     */
    public String getPricestock() {
        return pricestock;
    }

    /**
     * 设置进货价格
     *
     * @param pricestock 进货价格
     */
    public void setPricestock(String pricestock) {
        this.pricestock = pricestock == null ? null : pricestock.trim();
    }

    /**
     * 获取零售价格
     *
     * @return PRICERETAIL - 零售价格
     */
    public String getPriceretail() {
        return priceretail;
    }

    /**
     * 设置零售价格
     *
     * @param priceretail 零售价格
     */
    public void setPriceretail(String priceretail) {
        this.priceretail = priceretail == null ? null : priceretail.trim();
    }

    /**
     * 获取批发价格
     *
     * @return PRICEWHOLESALE - 批发价格
     */
    public String getPricewholesale() {
        return pricewholesale;
    }

    /**
     * 设置批发价格
     *
     * @param pricewholesale 批发价格
     */
    public void setPricewholesale(String pricewholesale) {
        this.pricewholesale = pricewholesale == null ? null : pricewholesale.trim();
    }

    /**
     * 获取进货金额
     *
     * @return MONEYSTOCK - 进货金额
     */
    public String getMoneystock() {
        return moneystock;
    }

    /**
     * 设置进货金额
     *
     * @param moneystock 进货金额
     */
    public void setMoneystock(String moneystock) {
        this.moneystock = moneystock == null ? null : moneystock.trim();
    }

    /**
     * 获取零售金额
     *
     * @return MONEYRETAIL - 零售金额
     */
    public String getMoneyretail() {
        return moneyretail;
    }

    /**
     * 设置零售金额
     *
     * @param moneyretail 零售金额
     */
    public void setMoneyretail(String moneyretail) {
        this.moneyretail = moneyretail == null ? null : moneyretail.trim();
    }

    /**
     * 获取批发金额
     *
     * @return MONEYWHOLESALE - 批发金额
     */
    public String getMoneywholesale() {
        return moneywholesale;
    }

    /**
     * 设置批发金额
     *
     * @param moneywholesale 批发金额
     */
    public void setMoneywholesale(String moneywholesale) {
        this.moneywholesale = moneywholesale == null ? null : moneywholesale.trim();
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
     * 获取批准文号
     *
     * @return APPROVALNUM - 批准文号
     */
    public String getApprovalnum() {
        return approvalnum;
    }

    /**
     * 设置批准文号
     *
     * @param approvalnum 批准文号
     */
    public void setApprovalnum(String approvalnum) {
        this.approvalnum = approvalnum == null ? null : approvalnum.trim();
    }

    /**
     * 获取GMP认证
     *
     * @return GMPAPPROVE - GMP认证
     */
    public String getGmpapprove() {
        return gmpapprove;
    }

    /**
     * 设置GMP认证
     *
     * @param gmpapprove GMP认证
     */
    public void setGmpapprove(String gmpapprove) {
        this.gmpapprove = gmpapprove == null ? null : gmpapprove.trim();
    }

    /**
     * 获取定价方式
     *
     * @return MAKEPRICETYPE - 定价方式
     */
    public String getMakepricetype() {
        return makepricetype;
    }

    /**
     * 设置定价方式
     *
     * @param makepricetype 定价方式
     */
    public void setMakepricetype(String makepricetype) {
        this.makepricetype = makepricetype == null ? null : makepricetype.trim();
    }

    /**
     * 获取定价公式
     *
     * @return MAKEPRICEFORMULA - 定价公式
     */
    public String getMakepriceformula() {
        return makepriceformula;
    }

    /**
     * 设置定价公式
     *
     * @param makepriceformula 定价公式
     */
    public void setMakepriceformula(String makepriceformula) {
        this.makepriceformula = makepriceformula == null ? null : makepriceformula.trim();
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