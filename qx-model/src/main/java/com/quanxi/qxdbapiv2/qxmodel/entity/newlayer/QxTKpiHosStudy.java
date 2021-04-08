package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_HOS_STUDY")
public class QxTKpiHosStudy {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 进修人员姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 进修开始时间
     */
    @Column(name = "BEGIN_TIME")
    private String beginTime;

    /**
     * 进修结束时间
     */
    @Column(name = "END_TIME")
    private String endTime;

    /**
     * 录入时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 是否返回
     */
    @Column(name = "IS_BACK")
    private Long isBack;

    /**
     * 医院类型（0：其他，1:医联体内医院，2：对口支援医院）
     */
    @Column(name = "RTYPE")
    private Long rtype;

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
     * 获取进修人员姓名
     *
     * @return NAME - 进修人员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置进修人员姓名
     *
     * @param name 进修人员姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取进修开始时间
     *
     * @return BEGIN_TIME - 进修开始时间
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * 设置进修开始时间
     *
     * @param beginTime 进修开始时间
     */
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    /**
     * 获取进修结束时间
     *
     * @return END_TIME - 进修结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置进修结束时间
     *
     * @param endTime 进修结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * 获取录入时间
     *
     * @return INPUT_TIME - 录入时间
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间
     *
     * @param inputTime 录入时间
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取是否返回
     *
     * @return IS_BACK - 是否返回
     */
    public Long getIsBack() {
        return isBack;
    }

    /**
     * 设置是否返回
     *
     * @param isBack 是否返回
     */
    public void setIsBack(Long isBack) {
        this.isBack = isBack;
    }

    /**
     * 获取医院类型（0：其他，1:医联体内医院，2：对口支援医院）
     *
     * @return RTYPE - 医院类型（0：其他，1:医联体内医院，2：对口支援医院）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置医院类型（0：其他，1:医联体内医院，2：对口支援医院）
     *
     * @param rtype 医院类型（0：其他，1:医联体内医院，2：对口支援医院）
     */
    public void setRtype(Long rtype) {
        this.rtype = rtype;
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