package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_PAGEAC")
public class QxTMedicalRecordPageac {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页唯一标识
     */
    @Id
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
     * 本次入院是否属于同一疾病(主要诊断)非计
     */
    @Column(name = "SAME_DISEASE")
    private String sameDisease;

    /**
     * 非计划重返手术室
     */
    @Column(name = "OPERATING_ROOM")
    private String operatingRoom;

    /**
     * 手术名称
     */
    @Column(name = "SURGICAL_NAME")
    private String surgicalName;

    /**
     * 发生院内感染
     */
    @Column(name = "HOSPITAL_INFECT")
    private String hospitalInfect;

    /**
     * 院内感染名称
     */
    @Column(name = "INFECTION_NAME")
    private String infectionName;

    /**
     * 切口感染
     */
    @Column(name = "INCISION_INFECTION")
    private String incisionInfection;

    /**
     * 发生围术期死亡
     */
    @Column(name = "PERIOPERATIVE_DEATH")
    private String perioperativeDeath;

    /**
     * 发生手术并发症
     */
    @Column(name = "SURGICAL_COMPLICATIONS")
    private String surgicalComplications;

    /**
     * 输血反应
     */
    @Column(name = "TRANSFUSION_REACTION_MARK")
    private String transfusionReactionMark;

    /**
     * CT与手术
     */
    @Column(name = "CT_COMPLIANCE_MARK")
    private String ctComplianceMark;

    /**
     * MRI与手术
     */
    @Column(name = "MR_COMPLIANCE_MARK")
    private String mrComplianceMark;

    /**
     * X线与手术
     */
    @Column(name = "X_COMPLIANCE_MARK")
    private String xComplianceMark;

    /**
     * 超声与手术
     */
    @Column(name = "CS_COMPLIANCE_MARK")
    private String csComplianceMark;

    /**
     * 病理诊断与术前诊断符合情况
     */
    @Column(name = "DAIG_COMPLIANCE")
    private String daigCompliance;

    /**
     * Ⅰ类手术切口是否预防性应用抗菌药物（0.否  1.是） 
     */
    @Column(name = "ANTI_DRUGS_MARK")
    private String antiDrugsMark;

    /**
     * 是否联合用药（0.否  1.是） 
     */
    @Column(name = "DRUG_COMBINATION_MARK")
    private String drugCombinationMark;

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
     * 获取本次入院是否属于同一疾病(主要诊断)非计
     *
     * @return SAME_DISEASE - 本次入院是否属于同一疾病(主要诊断)非计
     */
    public String getSameDisease() {
        return sameDisease;
    }

    /**
     * 设置本次入院是否属于同一疾病(主要诊断)非计
     *
     * @param sameDisease 本次入院是否属于同一疾病(主要诊断)非计
     */
    public void setSameDisease(String sameDisease) {
        this.sameDisease = sameDisease == null ? null : sameDisease.trim();
    }

    /**
     * 获取非计划重返手术室
     *
     * @return OPERATING_ROOM - 非计划重返手术室
     */
    public String getOperatingRoom() {
        return operatingRoom;
    }

    /**
     * 设置非计划重返手术室
     *
     * @param operatingRoom 非计划重返手术室
     */
    public void setOperatingRoom(String operatingRoom) {
        this.operatingRoom = operatingRoom == null ? null : operatingRoom.trim();
    }

    /**
     * 获取手术名称
     *
     * @return SURGICAL_NAME - 手术名称
     */
    public String getSurgicalName() {
        return surgicalName;
    }

    /**
     * 设置手术名称
     *
     * @param surgicalName 手术名称
     */
    public void setSurgicalName(String surgicalName) {
        this.surgicalName = surgicalName == null ? null : surgicalName.trim();
    }

    /**
     * 获取发生院内感染
     *
     * @return HOSPITAL_INFECT - 发生院内感染
     */
    public String getHospitalInfect() {
        return hospitalInfect;
    }

    /**
     * 设置发生院内感染
     *
     * @param hospitalInfect 发生院内感染
     */
    public void setHospitalInfect(String hospitalInfect) {
        this.hospitalInfect = hospitalInfect == null ? null : hospitalInfect.trim();
    }

    /**
     * 获取院内感染名称
     *
     * @return INFECTION_NAME - 院内感染名称
     */
    public String getInfectionName() {
        return infectionName;
    }

    /**
     * 设置院内感染名称
     *
     * @param infectionName 院内感染名称
     */
    public void setInfectionName(String infectionName) {
        this.infectionName = infectionName == null ? null : infectionName.trim();
    }

    /**
     * 获取切口感染
     *
     * @return INCISION_INFECTION - 切口感染
     */
    public String getIncisionInfection() {
        return incisionInfection;
    }

    /**
     * 设置切口感染
     *
     * @param incisionInfection 切口感染
     */
    public void setIncisionInfection(String incisionInfection) {
        this.incisionInfection = incisionInfection == null ? null : incisionInfection.trim();
    }

    /**
     * 获取发生围术期死亡
     *
     * @return PERIOPERATIVE_DEATH - 发生围术期死亡
     */
    public String getPerioperativeDeath() {
        return perioperativeDeath;
    }

    /**
     * 设置发生围术期死亡
     *
     * @param perioperativeDeath 发生围术期死亡
     */
    public void setPerioperativeDeath(String perioperativeDeath) {
        this.perioperativeDeath = perioperativeDeath == null ? null : perioperativeDeath.trim();
    }

    /**
     * 获取发生手术并发症
     *
     * @return SURGICAL_COMPLICATIONS - 发生手术并发症
     */
    public String getSurgicalComplications() {
        return surgicalComplications;
    }

    /**
     * 设置发生手术并发症
     *
     * @param surgicalComplications 发生手术并发症
     */
    public void setSurgicalComplications(String surgicalComplications) {
        this.surgicalComplications = surgicalComplications == null ? null : surgicalComplications.trim();
    }

    /**
     * 获取输血反应
     *
     * @return TRANSFUSION_REACTION_MARK - 输血反应
     */
    public String getTransfusionReactionMark() {
        return transfusionReactionMark;
    }

    /**
     * 设置输血反应
     *
     * @param transfusionReactionMark 输血反应
     */
    public void setTransfusionReactionMark(String transfusionReactionMark) {
        this.transfusionReactionMark = transfusionReactionMark == null ? null : transfusionReactionMark.trim();
    }

    /**
     * 获取CT与手术
     *
     * @return CT_COMPLIANCE_MARK - CT与手术
     */
    public String getCtComplianceMark() {
        return ctComplianceMark;
    }

    /**
     * 设置CT与手术
     *
     * @param ctComplianceMark CT与手术
     */
    public void setCtComplianceMark(String ctComplianceMark) {
        this.ctComplianceMark = ctComplianceMark == null ? null : ctComplianceMark.trim();
    }

    /**
     * 获取MRI与手术
     *
     * @return MR_COMPLIANCE_MARK - MRI与手术
     */
    public String getMrComplianceMark() {
        return mrComplianceMark;
    }

    /**
     * 设置MRI与手术
     *
     * @param mrComplianceMark MRI与手术
     */
    public void setMrComplianceMark(String mrComplianceMark) {
        this.mrComplianceMark = mrComplianceMark == null ? null : mrComplianceMark.trim();
    }

    /**
     * 获取X线与手术
     *
     * @return X_COMPLIANCE_MARK - X线与手术
     */
    public String getxComplianceMark() {
        return xComplianceMark;
    }

    /**
     * 设置X线与手术
     *
     * @param xComplianceMark X线与手术
     */
    public void setxComplianceMark(String xComplianceMark) {
        this.xComplianceMark = xComplianceMark == null ? null : xComplianceMark.trim();
    }

    /**
     * 获取超声与手术
     *
     * @return CS_COMPLIANCE_MARK - 超声与手术
     */
    public String getCsComplianceMark() {
        return csComplianceMark;
    }

    /**
     * 设置超声与手术
     *
     * @param csComplianceMark 超声与手术
     */
    public void setCsComplianceMark(String csComplianceMark) {
        this.csComplianceMark = csComplianceMark == null ? null : csComplianceMark.trim();
    }

    /**
     * 获取病理诊断与术前诊断符合情况
     *
     * @return DAIG_COMPLIANCE - 病理诊断与术前诊断符合情况
     */
    public String getDaigCompliance() {
        return daigCompliance;
    }

    /**
     * 设置病理诊断与术前诊断符合情况
     *
     * @param daigCompliance 病理诊断与术前诊断符合情况
     */
    public void setDaigCompliance(String daigCompliance) {
        this.daigCompliance = daigCompliance == null ? null : daigCompliance.trim();
    }

    /**
     * 获取Ⅰ类手术切口是否预防性应用抗菌药物（0.否  1.是） 
     *
     * @return ANTI_DRUGS_MARK - Ⅰ类手术切口是否预防性应用抗菌药物（0.否  1.是） 
     */
    public String getAntiDrugsMark() {
        return antiDrugsMark;
    }

    /**
     * 设置Ⅰ类手术切口是否预防性应用抗菌药物（0.否  1.是） 
     *
     * @param antiDrugsMark Ⅰ类手术切口是否预防性应用抗菌药物（0.否  1.是） 
     */
    public void setAntiDrugsMark(String antiDrugsMark) {
        this.antiDrugsMark = antiDrugsMark == null ? null : antiDrugsMark.trim();
    }

    /**
     * 获取是否联合用药（0.否  1.是） 
     *
     * @return DRUG_COMBINATION_MARK - 是否联合用药（0.否  1.是） 
     */
    public String getDrugCombinationMark() {
        return drugCombinationMark;
    }

    /**
     * 设置是否联合用药（0.否  1.是） 
     *
     * @param drugCombinationMark 是否联合用药（0.否  1.是） 
     */
    public void setDrugCombinationMark(String drugCombinationMark) {
        this.drugCombinationMark = drugCombinationMark == null ? null : drugCombinationMark.trim();
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