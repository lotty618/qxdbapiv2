package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_QC_EXAM")
public class QxTKpiQcExam {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 医师姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 是否通过
     */
    @Column(name = "IS_SUCCESS")
    private Long isSuccess;

    /**
     * 考试时间
     */
    @Column(name = "EXAM_TIME")
    private String examTime;

    /**
     * 人员唯一标识
     */
    @Column(name = "AUID")
    private String auid;

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
     * 获取医师姓名
     *
     * @return NAME - 医师姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置医师姓名
     *
     * @param name 医师姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取是否通过
     *
     * @return IS_SUCCESS - 是否通过
     */
    public Long getIsSuccess() {
        return isSuccess;
    }

    /**
     * 设置是否通过
     *
     * @param isSuccess 是否通过
     */
    public void setIsSuccess(Long isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * 获取考试时间
     *
     * @return EXAM_TIME - 考试时间
     */
    public String getExamTime() {
        return examTime;
    }

    /**
     * 设置考试时间
     *
     * @param examTime 考试时间
     */
    public void setExamTime(String examTime) {
        this.examTime = examTime == null ? null : examTime.trim();
    }

    /**
     * 获取人员唯一标识
     *
     * @return AUID - 人员唯一标识
     */
    public String getAuid() {
        return auid;
    }

    /**
     * 设置人员唯一标识
     *
     * @param auid 人员唯一标识
     */
    public void setAuid(String auid) {
        this.auid = auid == null ? null : auid.trim();
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