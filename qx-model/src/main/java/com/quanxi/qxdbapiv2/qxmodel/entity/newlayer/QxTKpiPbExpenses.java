package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_KPI_PB_EXPENSES")
public class QxTKpiPbExpenses {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 支出类型（0：其他支出，1：人员支出，2：医疗业务成本，3：管理费用）
     */
    @Column(name = "RTYPE")
    private Long rtype;

    /**
     * 录入时间
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

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
     * 获取支出类型（0：其他支出，1：人员支出，2：医疗业务成本，3：管理费用）
     *
     * @return RTYPE - 支出类型（0：其他支出，1：人员支出，2：医疗业务成本，3：管理费用）
     */
    public Long getRtype() {
        return rtype;
    }

    /**
     * 设置支出类型（0：其他支出，1：人员支出，2：医疗业务成本，3：管理费用）
     *
     * @param rtype 支出类型（0：其他支出，1：人员支出，2：医疗业务成本，3：管理费用）
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