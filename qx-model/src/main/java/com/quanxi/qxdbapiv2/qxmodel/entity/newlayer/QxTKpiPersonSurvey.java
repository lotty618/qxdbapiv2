package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_PERSON_SURVEY")
public class QxTKpiPersonSurvey {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 录入时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 医务人员满意度评分
     */
    @Column(name = "RESULT")
    private Long result;

    /**
     * 医务人员姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 医务人员所在科室
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

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
     * 获取医务人员满意度评分
     *
     * @return RESULT - 医务人员满意度评分
     */
    public Long getResult() {
        return result;
    }

    /**
     * 设置医务人员满意度评分
     *
     * @param result 医务人员满意度评分
     */
    public void setResult(Long result) {
        this.result = result;
    }

    /**
     * 获取医务人员姓名
     *
     * @return NAME - 医务人员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置医务人员姓名
     *
     * @param name 医务人员姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取医务人员所在科室
     *
     * @return DEPT_NAME - 医务人员所在科室
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置医务人员所在科室
     *
     * @param deptName 医务人员所在科室
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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