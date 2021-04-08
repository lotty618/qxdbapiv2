package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_AR_EXAM_DETAIL")
public class QxTEmrArExamDetail {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 入院体格检查详情唯一标识
     */
    @Column(name = "EAREDUID")
    private String eareduid;

    /**
     * 入院记录唯一标识
     */
    @Column(name = "EARUID")
    private String earuid;

    /**
     * 结构标识
     */
    @Column(name = "PARTS_CODE")
    private String partsCode;

    /**
     * 部位器官名称
     */
    @Column(name = "PARTS_NAME")
    private String partsName;

    /**
     * 部位器官描述
     */
    @Column(name = "PART_DESC")
    private String partDesc;

    /**
     * 一般情况
     */
    @Column(name = "GENERAL_DESC")
    private String generalDesc;

    /**
     * 听诊
     */
    @Column(name = "CONTENT_LISTEN")
    private String contentListen;

    /**
     * 视觉
     */
    @Column(name = "CONTENT_EYE")
    private String contentEye;

    /**
     * 叩诊
     */
    @Column(name = "CONTENT_KNCOK")
    private String contentKncok;

    /**
     * 触诊
     */
    @Column(name = "CONTENT_TOUCH")
    private String contentTouch;

    /**
     * 其他诊/没在四诊里面的内容
     */
    @Column(name = "CONTENT_OTHERS")
    private String contentOthers;

    /**
     * 表格（特殊）
     */
    @Column(name = "TABLE")
    private String table;

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
     * 获取入院体格检查详情唯一标识
     *
     * @return EAREDUID - 入院体格检查详情唯一标识
     */
    public String getEareduid() {
        return eareduid;
    }

    /**
     * 设置入院体格检查详情唯一标识
     *
     * @param eareduid 入院体格检查详情唯一标识
     */
    public void setEareduid(String eareduid) {
        this.eareduid = eareduid == null ? null : eareduid.trim();
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
     * 获取结构标识
     *
     * @return PARTS_CODE - 结构标识
     */
    public String getPartsCode() {
        return partsCode;
    }

    /**
     * 设置结构标识
     *
     * @param partsCode 结构标识
     */
    public void setPartsCode(String partsCode) {
        this.partsCode = partsCode == null ? null : partsCode.trim();
    }

    /**
     * 获取部位器官名称
     *
     * @return PARTS_NAME - 部位器官名称
     */
    public String getPartsName() {
        return partsName;
    }

    /**
     * 设置部位器官名称
     *
     * @param partsName 部位器官名称
     */
    public void setPartsName(String partsName) {
        this.partsName = partsName == null ? null : partsName.trim();
    }

    /**
     * 获取部位器官描述
     *
     * @return PART_DESC - 部位器官描述
     */
    public String getPartDesc() {
        return partDesc;
    }

    /**
     * 设置部位器官描述
     *
     * @param partDesc 部位器官描述
     */
    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc == null ? null : partDesc.trim();
    }

    /**
     * 获取一般情况
     *
     * @return GENERAL_DESC - 一般情况
     */
    public String getGeneralDesc() {
        return generalDesc;
    }

    /**
     * 设置一般情况
     *
     * @param generalDesc 一般情况
     */
    public void setGeneralDesc(String generalDesc) {
        this.generalDesc = generalDesc == null ? null : generalDesc.trim();
    }

    /**
     * 获取听诊
     *
     * @return CONTENT_LISTEN - 听诊
     */
    public String getContentListen() {
        return contentListen;
    }

    /**
     * 设置听诊
     *
     * @param contentListen 听诊
     */
    public void setContentListen(String contentListen) {
        this.contentListen = contentListen == null ? null : contentListen.trim();
    }

    /**
     * 获取视觉
     *
     * @return CONTENT_EYE - 视觉
     */
    public String getContentEye() {
        return contentEye;
    }

    /**
     * 设置视觉
     *
     * @param contentEye 视觉
     */
    public void setContentEye(String contentEye) {
        this.contentEye = contentEye == null ? null : contentEye.trim();
    }

    /**
     * 获取叩诊
     *
     * @return CONTENT_KNCOK - 叩诊
     */
    public String getContentKncok() {
        return contentKncok;
    }

    /**
     * 设置叩诊
     *
     * @param contentKncok 叩诊
     */
    public void setContentKncok(String contentKncok) {
        this.contentKncok = contentKncok == null ? null : contentKncok.trim();
    }

    /**
     * 获取触诊
     *
     * @return CONTENT_TOUCH - 触诊
     */
    public String getContentTouch() {
        return contentTouch;
    }

    /**
     * 设置触诊
     *
     * @param contentTouch 触诊
     */
    public void setContentTouch(String contentTouch) {
        this.contentTouch = contentTouch == null ? null : contentTouch.trim();
    }

    /**
     * 获取其他诊/没在四诊里面的内容
     *
     * @return CONTENT_OTHERS - 其他诊/没在四诊里面的内容
     */
    public String getContentOthers() {
        return contentOthers;
    }

    /**
     * 设置其他诊/没在四诊里面的内容
     *
     * @param contentOthers 其他诊/没在四诊里面的内容
     */
    public void setContentOthers(String contentOthers) {
        this.contentOthers = contentOthers == null ? null : contentOthers.trim();
    }

    /**
     * 获取表格（特殊）
     *
     * @return TABLE - 表格（特殊）
     */
    public String getTable() {
        return table;
    }

    /**
     * 设置表格（特殊）
     *
     * @param table 表格（特殊）
     */
    public void setTable(String table) {
        this.table = table == null ? null : table.trim();
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