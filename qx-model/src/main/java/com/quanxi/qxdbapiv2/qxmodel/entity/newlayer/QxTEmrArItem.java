package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_AR_ITEM")
public class QxTEmrArItem {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 入院记录唯一标识
     */
    @Column(name = "EARUID")
    private String earuid;

    /**
     * 入院记录项目唯一标识
     */
    @Column(name = "EARIUID")
    private String eariuid;

    /**
     * 项目名称（检查、方案、计划等等）
     */
    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 项目描述
     */
    @Column(name = "ITEM_DESC")
    private String itemDesc;

    /**
     * 项目描述分析
     */
    @Column(name = "ITEM_DESC_PARSE")
    private String itemDescParse;

    /**
     * 项目分类编号
     */
    @Column(name = "ITEM_CLASS_ID")
    private String itemClassId;

    /**
     * 项目分类名称
     */
    @Column(name = "ITEM_CLASS_NAME")
    private String itemClassName;

    @Column(name = "ITEM_CODE")
    private String itemCode;

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
     * 获取入院记录唯一标识
     *
     * @return EARUID - 入院记录唯一标识
     */
    public String getEaruid() {
        return earuid;
    }

    /**
     * 设置入院记录唯一标识
     *
     * @param earuid 入院记录唯一标识
     */
    public void setEaruid(String earuid) {
        this.earuid = earuid == null ? null : earuid.trim();
    }

    /**
     * 获取入院记录项目唯一标识
     *
     * @return EARIUID - 入院记录项目唯一标识
     */
    public String getEariuid() {
        return eariuid;
    }

    /**
     * 设置入院记录项目唯一标识
     *
     * @param eariuid 入院记录项目唯一标识
     */
    public void setEariuid(String eariuid) {
        this.eariuid = eariuid == null ? null : eariuid.trim();
    }

    /**
     * 获取项目名称（检查、方案、计划等等）
     *
     * @return ITEM_NAME - 项目名称（检查、方案、计划等等）
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置项目名称（检查、方案、计划等等）
     *
     * @param itemName 项目名称（检查、方案、计划等等）
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取项目描述
     *
     * @return ITEM_DESC - 项目描述
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置项目描述
     *
     * @param itemDesc 项目描述
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }

    /**
     * 获取项目描述分析
     *
     * @return ITEM_DESC_PARSE - 项目描述分析
     */
    public String getItemDescParse() {
        return itemDescParse;
    }

    /**
     * 设置项目描述分析
     *
     * @param itemDescParse 项目描述分析
     */
    public void setItemDescParse(String itemDescParse) {
        this.itemDescParse = itemDescParse == null ? null : itemDescParse.trim();
    }

    /**
     * 获取项目分类编号
     *
     * @return ITEM_CLASS_ID - 项目分类编号
     */
    public String getItemClassId() {
        return itemClassId;
    }

    /**
     * 设置项目分类编号
     *
     * @param itemClassId 项目分类编号
     */
    public void setItemClassId(String itemClassId) {
        this.itemClassId = itemClassId == null ? null : itemClassId.trim();
    }

    /**
     * 获取项目分类名称
     *
     * @return ITEM_CLASS_NAME - 项目分类名称
     */
    public String getItemClassName() {
        return itemClassName;
    }

    /**
     * 设置项目分类名称
     *
     * @param itemClassName 项目分类名称
     */
    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName == null ? null : itemClassName.trim();
    }

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
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