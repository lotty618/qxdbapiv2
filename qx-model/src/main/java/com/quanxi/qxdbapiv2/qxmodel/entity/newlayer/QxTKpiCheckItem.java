package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_CHECK_ITEM")
public class QxTKpiCheckItem {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 质量管理类型（0：未知，1：实验室已开展且同时国家临床检验中线已组织的室间质评检验项目，2：参加国家临床检验中心组织的室间质评检验项目）
     */
    @Column(name = "RTYPE")
    private Long rtype;

    /**
     * 项目名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 是否合格
     */
    @Column(name = "IS_QUALIFIED")
    private Long isQualified;

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
     * 检测时间
     */
    @Column(name = "CHECK_TIME")
    private String checkTime;

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
     * 获取质量管理类型（0：未知，1：实验室已开展且同时国家临床检验中线已组织的室间质评检验项目，2：参加国家临床检验中心组织的室间质评检验项目）
     *
     * @return RTYPE - 质量管理类型（0：未知，1：实验室已开展且同时国家临床检验中线已组织的室间质评检验项目，2：参加国家临床检验中心组织的室间质评检验项目）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置质量管理类型（0：未知，1：实验室已开展且同时国家临床检验中线已组织的室间质评检验项目，2：参加国家临床检验中心组织的室间质评检验项目）
     *
     * @param rtype 质量管理类型（0：未知，1：实验室已开展且同时国家临床检验中线已组织的室间质评检验项目，2：参加国家临床检验中心组织的室间质评检验项目）
     */
    public void setRtype(Long rtype) {
        this.rtype = rtype;
    }

    /**
     * 获取项目名称
     *
     * @return NAME - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取是否合格
     *
     * @return IS_QUALIFIED - 是否合格
     */
    public Long getIsQualified() {
        return isQualified;
    }

    /**
     * 设置是否合格
     *
     * @param isQualified 是否合格
     */
    public void setIsQualified(Long isQualified) {
        this.isQualified = isQualified;
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
     * 获取检测时间
     *
     * @return CHECK_TIME - 检测时间
     */
    public String getCheckTime() {
        return checkTime;
    }

    /**
     * 设置检测时间
     *
     * @param checkTime 检测时间
     */
    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }
}