package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TP_MED_HABITAT")
public class QxTpMedHabitat {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 药品产地标识
     */
    @Column(name = "PMHUID")
    private String pmhuid;

    /**
     * 药品产地
     */
    @Column(name = "PRODPLACE_CODE")
    private String prodplaceCode;

    /**
     * 产地名称
     */
    @Column(name = "PRODPLACE_NAME")
    private String prodplaceName;

    /**
     * 厂家全称
     */
    @Column(name = "PRODPLACE_CONTRAST")
    private String prodplaceContrast;

    /**
     * 创建人
     */
    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 创建时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

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
     * 原始层ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 获取药品产地标识
     *
     * @return PMHUID - 药品产地标识
     */
    public String getPmhuid() {
        return pmhuid;
    }

    /**
     * 设置药品产地标识
     *
     * @param pmhuid 药品产地标识
     */
    public void setPmhuid(String pmhuid) {
        this.pmhuid = pmhuid == null ? null : pmhuid.trim();
    }

    /**
     * 获取药品产地
     *
     * @return PRODPLACE_CODE - 药品产地
     */
    public String getProdplaceCode() {
        return prodplaceCode;
    }

    /**
     * 设置药品产地
     *
     * @param prodplaceCode 药品产地
     */
    public void setProdplaceCode(String prodplaceCode) {
        this.prodplaceCode = prodplaceCode == null ? null : prodplaceCode.trim();
    }

    /**
     * 获取产地名称
     *
     * @return PRODPLACE_NAME - 产地名称
     */
    public String getProdplaceName() {
        return prodplaceName;
    }

    /**
     * 设置产地名称
     *
     * @param prodplaceName 产地名称
     */
    public void setProdplaceName(String prodplaceName) {
        this.prodplaceName = prodplaceName == null ? null : prodplaceName.trim();
    }

    /**
     * 获取厂家全称
     *
     * @return PRODPLACE_CONTRAST - 厂家全称
     */
    public String getProdplaceContrast() {
        return prodplaceContrast;
    }

    /**
     * 设置厂家全称
     *
     * @param prodplaceContrast 厂家全称
     */
    public void setProdplaceContrast(String prodplaceContrast) {
        this.prodplaceContrast = prodplaceContrast == null ? null : prodplaceContrast.trim();
    }

    /**
     * 获取创建人
     *
     * @return CREATOR - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return ORGUID
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * @param orguid
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取创建时间
     *
     * @return INPUT_TIME - 创建时间
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置创建时间
     *
     * @param inputTime 创建时间
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
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