package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_PAGE2")
public class QxTMedicalRecordPage2 {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页唯一标识
     */
    @Column(name = "MRPUID")
    private String mrpuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 离院方式
     */
    @Column(name = "DISCHARGE_CLASS_CN")
    private String dischargeClassCn;

    /**
     * 是否有出院31天内再住院计划
     */
    @Column(name = "REHOSP_AFTER31_MARK")
    private String rehospAfter31Mark;

    /**
     * 入院前颅脑损伤患者昏迷时间
     */
    @Column(name = "COMA_DURATION_BEFORE")
    private String comaDurationBefore;

    /**
     * 入院后颅脑损伤患者昏迷时间
     */
    @Column(name = "COMA_DURATION_AFTER")
    private String comaDurationAfter;

    /**
     * 呼吸机时间
     */
    @Column(name = "LIFE_SUPPORT_MACHINE_TIME")
    private String lifeSupportMachineTime;

    /**
     * 是否入重症监护室
     */
    @Column(name = "INTENSIVE_CARE_THERAPY")
    private String intensiveCareTherapy;

    /**
     * 住院总费用
     */
    @Column(name = "FEE_TOTAL")
    private String feeTotal;

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
     * 获取病案首页唯一标识
     *
     * @return MRPUID - 病案首页唯一标识
     */
    public String getMrpuid() {
        return mrpuid;
    }

    /**
     * 设置病案首页唯一标识
     *
     * @param mrpuid 病案首页唯一标识
     */
    public void setMrpuid(String mrpuid) {
        this.mrpuid = mrpuid == null ? null : mrpuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取机构唯一标识
     *
     * @return ORGUID - 机构唯一标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构唯一标识
     *
     * @param orguid 机构唯一标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取离院方式
     *
     * @return DISCHARGE_CLASS_CN - 离院方式
     */
    public String getDischargeClassCn() {
        return dischargeClassCn;
    }

    /**
     * 设置离院方式
     *
     * @param dischargeClassCn 离院方式
     */
    public void setDischargeClassCn(String dischargeClassCn) {
        this.dischargeClassCn = dischargeClassCn == null ? null : dischargeClassCn.trim();
    }

    /**
     * 获取是否有出院31天内再住院计划
     *
     * @return REHOSP_AFTER31_MARK - 是否有出院31天内再住院计划
     */
    public String getRehospAfter31Mark() {
        return rehospAfter31Mark;
    }

    /**
     * 设置是否有出院31天内再住院计划
     *
     * @param rehospAfter31Mark 是否有出院31天内再住院计划
     */
    public void setRehospAfter31Mark(String rehospAfter31Mark) {
        this.rehospAfter31Mark = rehospAfter31Mark == null ? null : rehospAfter31Mark.trim();
    }

    /**
     * 获取入院前颅脑损伤患者昏迷时间
     *
     * @return COMA_DURATION_BEFORE - 入院前颅脑损伤患者昏迷时间
     */
    public String getComaDurationBefore() {
        return comaDurationBefore;
    }

    /**
     * 设置入院前颅脑损伤患者昏迷时间
     *
     * @param comaDurationBefore 入院前颅脑损伤患者昏迷时间
     */
    public void setComaDurationBefore(String comaDurationBefore) {
        this.comaDurationBefore = comaDurationBefore == null ? null : comaDurationBefore.trim();
    }

    /**
     * 获取入院后颅脑损伤患者昏迷时间
     *
     * @return COMA_DURATION_AFTER - 入院后颅脑损伤患者昏迷时间
     */
    public String getComaDurationAfter() {
        return comaDurationAfter;
    }

    /**
     * 设置入院后颅脑损伤患者昏迷时间
     *
     * @param comaDurationAfter 入院后颅脑损伤患者昏迷时间
     */
    public void setComaDurationAfter(String comaDurationAfter) {
        this.comaDurationAfter = comaDurationAfter == null ? null : comaDurationAfter.trim();
    }

    /**
     * 获取呼吸机时间
     *
     * @return LIFE_SUPPORT_MACHINE_TIME - 呼吸机时间
     */
    public String getLifeSupportMachineTime() {
        return lifeSupportMachineTime;
    }

    /**
     * 设置呼吸机时间
     *
     * @param lifeSupportMachineTime 呼吸机时间
     */
    public void setLifeSupportMachineTime(String lifeSupportMachineTime) {
        this.lifeSupportMachineTime = lifeSupportMachineTime == null ? null : lifeSupportMachineTime.trim();
    }

    /**
     * 获取是否入重症监护室
     *
     * @return INTENSIVE_CARE_THERAPY - 是否入重症监护室
     */
    public String getIntensiveCareTherapy() {
        return intensiveCareTherapy;
    }

    /**
     * 设置是否入重症监护室
     *
     * @param intensiveCareTherapy 是否入重症监护室
     */
    public void setIntensiveCareTherapy(String intensiveCareTherapy) {
        this.intensiveCareTherapy = intensiveCareTherapy == null ? null : intensiveCareTherapy.trim();
    }

    /**
     * 获取住院总费用
     *
     * @return FEE_TOTAL - 住院总费用
     */
    public String getFeeTotal() {
        return feeTotal;
    }

    /**
     * 设置住院总费用
     *
     * @param feeTotal 住院总费用
     */
    public void setFeeTotal(String feeTotal) {
        this.feeTotal = feeTotal == null ? null : feeTotal.trim();
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