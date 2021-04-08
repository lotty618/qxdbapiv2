package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_LOG_QID")
public class QxTLogQid {
    /**
     * id
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 数据来源表名
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * 原始层QID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     * 原始层表名
     */
    @Column(name = "ORIGINAL_TABLE_NAME")
    private String originalTableName;

    /**
     * 获取id
     *
     * @return SID - id
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置id
     *
     * @param sid id
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取数据来源表名
     *
     * @return TABLE_NAME - 数据来源表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置数据来源表名
     *
     * @param tableName 数据来源表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取原始层QID
     *
     * @return QID - 原始层QID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层QID
     *
     * @param qid 原始层QID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
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
     * 获取原始层表名
     *
     * @return ORIGINAL_TABLE_NAME - 原始层表名
     */
    public String getOriginalTableName() {
        return originalTableName;
    }

    /**
     * 设置原始层表名
     *
     * @param originalTableName 原始层表名
     */
    public void setOriginalTableName(String originalTableName) {
        this.originalTableName = originalTableName == null ? null : originalTableName.trim();
    }
}