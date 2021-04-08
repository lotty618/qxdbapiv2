package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_DICT")
public class QxTDict {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 字典类型代码
     */
    @Column(name = "DICT_TYPE")
    private String dictType;

    /**
     * 字典名称
     */
    @Column(name = "DICT_NAME")
    private String dictName;

    /**
     * 字典代码
     */
    @Column(name = "DICT_CODE")
    private String dictCode;

    /**
     * 字典上级代码
     */
    @Column(name = "PARENT_CODE")
    private String parentCode;

    /**
     * 字典描述
     */
    @Column(name = "DICT_DESC")
    private String dictDesc;

    /**
     * 医院字典
     */
    @Column(name = "HOS_DICT")
    private String hosDict;

    /**
     * 排序
     */
    @Column(name = "SORT_NO")
    private Long sortNo;

    /**
     * 排序扩展
     */
    @Column(name = "SORT_NO_EXT")
    private Long sortNoExt;

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
     * @return DICT_TYPE - 字典类型代码
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 设置字典类型代码
     *
     * @param dictType 字典类型代码
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * 获取字典名称
     *
     * @return DICT_NAME - 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置字典名称
     *
     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    /**
     * 获取字典代码
     *
     * @return DICT_CODE - 字典代码
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * 设置字典代码
     *
     * @param dictCode 字典代码
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    /**
     * 获取字典上级代码
     *
     * @return PARENT_CODE - 字典上级代码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置字典上级代码
     *
     * @param parentCode 字典上级代码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 获取字典描述
     *
     * @return DICT_DESC - 字典描述
     */
    public String getDictDesc() {
        return dictDesc;
    }

    /**
     * 设置字典描述
     *
     * @param dictDesc 字典描述
     */
    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc == null ? null : dictDesc.trim();
    }

    /**
     * 获取医院字典
     *
     * @return HOS_DICT - 医院字典
     */
    public String getHosDict() {
        return hosDict;
    }

    /**
     * 设置医院字典
     *
     * @param hosDict 医院字典
     */
    public void setHosDict(String hosDict) {
        this.hosDict = hosDict == null ? null : hosDict.trim();
    }

    /**
     * 获取排序
     *
     * @return SORT_NO - 排序
     */
    public Long getSortNo() {
        return sortNo;
    }

    /**
     * 设置排序
     *
     * @param sortNo 排序
     */
    public void setSortNo(Long sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取排序扩展
     *
     * @return SORT_NO_EXT - 排序扩展
     */
    public Long getSortNoExt() {
        return sortNoExt;
    }

    /**
     * 设置排序扩展
     *
     * @param sortNoExt 排序扩展
     */
    public void setSortNoExt(Long sortNoExt) {
        this.sortNoExt = sortNoExt;
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