package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TP_MED_TYPE")
public class QxTpMedType {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    @Column(name = "MEDTUID")
    private String medtuid;

    /**
     * 药品类型代码
     */
    @Column(name = "MED_TYPE_CODE")
    private String medTypeCode;

    /**
     * 药品类型
     */
    @Column(name = "MED_TYPE")
    private String medType;

    /**
     * 上级类型代码
     */
    @Column(name = "PARENT_CODE")
    private String parentCode;

    /**
     * 排序
     */
    @Column(name = "SORT_NO")
    private Long sortNo;

    /**
     * 分类描述
     */
    @Column(name = "TYPE_DESC")
    private String typeDesc;

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
     * 原始层到新建层的关联ID
     */
    @Column(name = "QID")
    private String qid;

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
     * @return MEDTUID
     */
    public String getMedtuid() {
        return medtuid;
    }

    /**
     * @param medtuid
     */
    public void setMedtuid(String medtuid) {
        this.medtuid = medtuid == null ? null : medtuid.trim();
    }

    /**
     * 获取药品类型代码
     *
     * @return MED_TYPE_CODE - 药品类型代码
     */
    public String getMedTypeCode() {
        return medTypeCode;
    }

    /**
     * 设置药品类型代码
     *
     * @param medTypeCode 药品类型代码
     */
    public void setMedTypeCode(String medTypeCode) {
        this.medTypeCode = medTypeCode == null ? null : medTypeCode.trim();
    }

    /**
     * 获取药品类型
     *
     * @return MED_TYPE - 药品类型
     */
    public String getMedType() {
        return medType;
    }

    /**
     * 设置药品类型
     *
     * @param medType 药品类型
     */
    public void setMedType(String medType) {
        this.medType = medType == null ? null : medType.trim();
    }

    /**
     * 获取上级类型代码
     *
     * @return PARENT_CODE - 上级类型代码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设置上级类型代码
     *
     * @param parentCode 上级类型代码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
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
     * 获取分类描述
     *
     * @return TYPE_DESC - 分类描述
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * 设置分类描述
     *
     * @param typeDesc 分类描述
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
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
     * 获取原始层到新建层的关联ID
     *
     * @return QID - 原始层到新建层的关联ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层到新建层的关联ID
     *
     * @param qid 原始层到新建层的关联ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }
}