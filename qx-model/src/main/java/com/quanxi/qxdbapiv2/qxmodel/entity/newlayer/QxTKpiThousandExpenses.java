package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_KPI_THOUSAND_EXPENSES")
public class QxTKpiThousandExpenses {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 出入类型（0：其他，1：收入，2：耗能）
     */
    @Column(name = "IOTYPE")
    private Long iotype;

    /**
     * 收入类型（0：其他，1：政补助收入，2：科教项目收入，3：医疗收入，4：其他收入）
     */
    @Column(name = "RTYPE")
    private Long rtype;

    /**
     * 录入时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

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
     * 获取出入类型（0：其他，1：收入，2：耗能）
     *
     * @return IOTYPE - 出入类型（0：其他，1：收入，2：耗能）
     */
    public Long getIotype() {
        return iotype;
    }

    /**
     * 设置出入类型（0：其他，1：收入，2：耗能）
     *
     * @param iotype 出入类型（0：其他，1：收入，2：耗能）
     */
    public void setIotype(Long iotype) {
        this.iotype = iotype;
    }

    /**
     * 获取收入类型（0：其他，1：政补助收入，2：科教项目收入，3：医疗收入，4：其他收入）
     *
     * @return RTYPE - 收入类型（0：其他，1：政补助收入，2：科教项目收入，3：医疗收入，4：其他收入）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置收入类型（0：其他，1：政补助收入，2：科教项目收入，3：医疗收入，4：其他收入）
     *
     * @param rtype 收入类型（0：其他，1：政补助收入，2：科教项目收入，3：医疗收入，4：其他收入）
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
     * 获取金额
     *
     * @return AMOUNT - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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