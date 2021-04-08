package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_DB_TABLEINFO")
public class QxTDbTableinfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 字典类型代码
     */
    @Column(name = "BIGTABLE_NAME")
    private String bigtableName;

    /**
     * 字典名称
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

    /**
     * 字典代码
     */
    @Column(name = "DATA")
    private String data;

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
     * 获取字典类型代码
     *
     * @return BIGTABLE_NAME - 字典类型代码
     */
    public String getBigtableName() {
        return bigtableName;
    }

    /**
     * 设置字典类型代码
     *
     * @param bigtableName 字典类型代码
     */
    public void setBigtableName(String bigtableName) {
        this.bigtableName = bigtableName == null ? null : bigtableName.trim();
    }

    /**
     * 获取字典名称
     *
     * @return TABLE_NAME - 字典名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置字典名称
     *
     * @param tableName 字典名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取字典代码
     *
     * @return DATA - 字典代码
     */
    public String getData() {
        return data;
    }

    /**
     * 设置字典代码
     *
     * @param data 字典代码
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
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