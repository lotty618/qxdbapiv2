package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_KPI_TRAIN_PERSON")
public class QxTKpiTrainPerson {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 项目类型（0：其他，1：教育教学培训，2：省级及以上师资培训合格证书，3：承担医院专职从事院校医学教育，4：承担继续医学教育，5：医学相关公开期刊上发表论文数，6：教学相关发表的论文数，7：承担毕业后医学教育）
     */
    @Column(name = "RTYPE")
    private Long rtype;

    /**
     * 录入时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 人才姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 医生唯一ID
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
     * 获取项目类型（0：其他，1：教育教学培训，2：省级及以上师资培训合格证书，3：承担医院专职从事院校医学教育，4：承担继续医学教育，5：医学相关公开期刊上发表论文数，6：教学相关发表的论文数，7：承担毕业后医学教育）
     *
     * @return RTYPE - 项目类型（0：其他，1：教育教学培训，2：省级及以上师资培训合格证书，3：承担医院专职从事院校医学教育，4：承担继续医学教育，5：医学相关公开期刊上发表论文数，6：教学相关发表的论文数，7：承担毕业后医学教育）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置项目类型（0：其他，1：教育教学培训，2：省级及以上师资培训合格证书，3：承担医院专职从事院校医学教育，4：承担继续医学教育，5：医学相关公开期刊上发表论文数，6：教学相关发表的论文数，7：承担毕业后医学教育）
     *
     * @param rtype 项目类型（0：其他，1：教育教学培训，2：省级及以上师资培训合格证书，3：承担医院专职从事院校医学教育，4：承担继续医学教育，5：医学相关公开期刊上发表论文数，6：教学相关发表的论文数，7：承担毕业后医学教育）
     */
    public void setRtype(Long rtype) {
        this.rtype = rtype;
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
     * 获取人才姓名
     *
     * @return NAME - 人才姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置人才姓名
     *
     * @param name 人才姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取医生唯一ID
     *
     * @return AUID - 医生唯一ID
     */
    public String getAuid() {
        return auid;
    }

    /**
     * 设置医生唯一ID
     *
     * @param auid 医生唯一ID
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