package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_LOG_UPD")
public class QxTLogUpd {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 标准层表名
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * 标准层最后修改数据时间
     */
    @Column(name = "LAST_UPDATE")
    private String lastUpdate;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 修改条数
     */
    @Column(name = "DATA_SIZE")
    private Long dataSize;

    /**
     * 修改类型
     */
    @Column(name = "UPD_TYPE")
    private Long updType;

    /**
     * 最后修改数据时间
     */
    @Column(name = "LASTDB_UPDATE")
    private String lastdbUpdate;

    /**
     * 项目状态值
     */
    @Column(name = "QXHZ_STATUS")
    private Long qxhzStatus;

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
     * 获取标准层表名
     *
     * @return TABLE_NAME - 标准层表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置标准层表名
     *
     * @param tableName 标准层表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取标准层最后修改数据时间
     *
     * @return LAST_UPDATE - 标准层最后修改数据时间
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 设置标准层最后修改数据时间
     *
     * @param lastUpdate 标准层最后修改数据时间
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate == null ? null : lastUpdate.trim();
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
     * 获取修改条数
     *
     * @return DATA_SIZE - 修改条数
     */
    public Long getDataSize() {
        return dataSize;
    }

    /**
     * 设置修改条数
     *
     * @param dataSize 修改条数
     */
    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * 获取修改类型
     *
     * @return UPD_TYPE - 修改类型
     */
    public Long getUpdType() {
        return updType;
    }

    /**
     * 设置修改类型
     *
     * @param updType 修改类型
     */
    public void setUpdType(Long updType) {
        this.updType = updType;
    }

    /**
     * 获取最后修改数据时间
     *
     * @return LASTDB_UPDATE - 最后修改数据时间
     */
    public String getLastdbUpdate() {
        return lastdbUpdate;
    }

    /**
     * 设置最后修改数据时间
     *
     * @param lastdbUpdate 最后修改数据时间
     */
    public void setLastdbUpdate(String lastdbUpdate) {
        this.lastdbUpdate = lastdbUpdate == null ? null : lastdbUpdate.trim();
    }

    /**
     * 获取项目状态值
     *
     * @return QXHZ_STATUS - 项目状态值
     */
    public Long getQxhzStatus() {
        return qxhzStatus;
    }

    /**
     * 设置项目状态值
     *
     * @param qxhzStatus 项目状态值
     */
    public void setQxhzStatus(Long qxhzStatus) {
        this.qxhzStatus = qxhzStatus;
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