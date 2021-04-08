package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_PAGE3")
public class QxTMedicalRecordPage3 {
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
     * 肿瘤分期类型
     */
    @Column(name = "TUMOUR_STAGES_TYPE")
    private String tumourStagesType;

    /**
     * T
     */
    @Column(name = "TUMOUR_LIMITS")
    private String tumourLimits;

    /**
     * N
     */
    @Column(name = "TUMOUR_LYMPH")
    private String tumourLymph;

    /**
     * M
     */
    @Column(name = "TUMOUR_CHANGE")
    private String tumourChange;

    /**
     * 分期
     */
    @Column(name = "TUMOUR_STAGES")
    private String tumourStages;

    /**
     * Ⅰ放疗方式
     */
    @Column(name = "RADIO_WAY")
    private String radioWay;

    /**
     * 程式
     */
    @Column(name = "RADIO_DEVICE")
    private String radioDevice;

    /**
     * 装置
     */
    @Column(name = "RADIO_FORM")
    private String radioForm;

    /**
     * 1.始发灶
     */
    @Column(name = "PRIMARY_CODE")
    private String primaryCode;

    /**
     * 1.始发灶剂量
     */
    @Column(name = "PRIMARY_DOSAGE")
    private String primaryDosage;

    /**
     * 1.始发灶起止日期
     */
    @Column(name = "PRIMARY_BEGIN")
    private String primaryBegin;

    /**
     * 1.始发灶起止日期至
     */
    @Column(name = "PRIMARY_END")
    private String primaryEnd;

    /**
     * 2.区域淋巴结
     */
    @Column(name = "LYMPH_CODE")
    private String lymphCode;

    /**
     * 2.区域淋巴结剂量
     */
    @Column(name = "LYMPH_DOSAGE")
    private String lymphDosage;

    /**
     * 2.区域淋巴结起止日期
     */
    @Column(name = "LYMPH_BEGIN")
    private String lymphBegin;

    /**
     * 2.区域淋巴结起止日期至
     */
    @Column(name = "LYMPH_END")
    private String lymphEnd;

    /**
     * 转移灶内容
     */
    @Column(name = "CHANGE_PLACE")
    private String changePlace;

    /**
     * 转移灶剂量
     */
    @Column(name = "CHANGE_DOSAGE")
    private String changeDosage;

    /**
     * 转移灶起止日期
     */
    @Column(name = "CHANGE_BEGIN")
    private String changeBegin;

    /**
     * 转移灶起止日期至
     */
    @Column(name = "CHANGE_END")
    private String changeEnd;

    /**
     * 化疗方式1
     */
    @Column(name = "CHEMO_WAY")
    private String chemoWay;

    /**
     * 化疗方式2
     */
    @Column(name = "CHEMO_MEANS")
    private String chemoMeans;

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
     * 获取肿瘤分期类型
     *
     * @return TUMOUR_STAGES_TYPE - 肿瘤分期类型
     */
    public String getTumourStagesType() {
        return tumourStagesType;
    }

    /**
     * 设置肿瘤分期类型
     *
     * @param tumourStagesType 肿瘤分期类型
     */
    public void setTumourStagesType(String tumourStagesType) {
        this.tumourStagesType = tumourStagesType == null ? null : tumourStagesType.trim();
    }

    /**
     * 获取T
     *
     * @return TUMOUR_LIMITS - T
     */
    public String getTumourLimits() {
        return tumourLimits;
    }

    /**
     * 设置T
     *
     * @param tumourLimits T
     */
    public void setTumourLimits(String tumourLimits) {
        this.tumourLimits = tumourLimits == null ? null : tumourLimits.trim();
    }

    /**
     * 获取N
     *
     * @return TUMOUR_LYMPH - N
     */
    public String getTumourLymph() {
        return tumourLymph;
    }

    /**
     * 设置N
     *
     * @param tumourLymph N
     */
    public void setTumourLymph(String tumourLymph) {
        this.tumourLymph = tumourLymph == null ? null : tumourLymph.trim();
    }

    /**
     * 获取M
     *
     * @return TUMOUR_CHANGE - M
     */
    public String getTumourChange() {
        return tumourChange;
    }

    /**
     * 设置M
     *
     * @param tumourChange M
     */
    public void setTumourChange(String tumourChange) {
        this.tumourChange = tumourChange == null ? null : tumourChange.trim();
    }

    /**
     * 获取分期
     *
     * @return TUMOUR_STAGES - 分期
     */
    public String getTumourStages() {
        return tumourStages;
    }

    /**
     * 设置分期
     *
     * @param tumourStages 分期
     */
    public void setTumourStages(String tumourStages) {
        this.tumourStages = tumourStages == null ? null : tumourStages.trim();
    }

    /**
     * 获取Ⅰ放疗方式
     *
     * @return RADIO_WAY - Ⅰ放疗方式
     */
    public String getRadioWay() {
        return radioWay;
    }

    /**
     * 设置Ⅰ放疗方式
     *
     * @param radioWay Ⅰ放疗方式
     */
    public void setRadioWay(String radioWay) {
        this.radioWay = radioWay == null ? null : radioWay.trim();
    }

    /**
     * 获取程式
     *
     * @return RADIO_DEVICE - 程式
     */
    public String getRadioDevice() {
        return radioDevice;
    }

    /**
     * 设置程式
     *
     * @param radioDevice 程式
     */
    public void setRadioDevice(String radioDevice) {
        this.radioDevice = radioDevice == null ? null : radioDevice.trim();
    }

    /**
     * 获取装置
     *
     * @return RADIO_FORM - 装置
     */
    public String getRadioForm() {
        return radioForm;
    }

    /**
     * 设置装置
     *
     * @param radioForm 装置
     */
    public void setRadioForm(String radioForm) {
        this.radioForm = radioForm == null ? null : radioForm.trim();
    }

    /**
     * 获取1.始发灶
     *
     * @return PRIMARY_CODE - 1.始发灶
     */
    public String getPrimaryCode() {
        return primaryCode;
    }

    /**
     * 设置1.始发灶
     *
     * @param primaryCode 1.始发灶
     */
    public void setPrimaryCode(String primaryCode) {
        this.primaryCode = primaryCode == null ? null : primaryCode.trim();
    }

    /**
     * 获取1.始发灶剂量
     *
     * @return PRIMARY_DOSAGE - 1.始发灶剂量
     */
    public String getPrimaryDosage() {
        return primaryDosage;
    }

    /**
     * 设置1.始发灶剂量
     *
     * @param primaryDosage 1.始发灶剂量
     */
    public void setPrimaryDosage(String primaryDosage) {
        this.primaryDosage = primaryDosage == null ? null : primaryDosage.trim();
    }

    /**
     * 获取1.始发灶起止日期
     *
     * @return PRIMARY_BEGIN - 1.始发灶起止日期
     */
    public String getPrimaryBegin() {
        return primaryBegin;
    }

    /**
     * 设置1.始发灶起止日期
     *
     * @param primaryBegin 1.始发灶起止日期
     */
    public void setPrimaryBegin(String primaryBegin) {
        this.primaryBegin = primaryBegin == null ? null : primaryBegin.trim();
    }

    /**
     * 获取1.始发灶起止日期至
     *
     * @return PRIMARY_END - 1.始发灶起止日期至
     */
    public String getPrimaryEnd() {
        return primaryEnd;
    }

    /**
     * 设置1.始发灶起止日期至
     *
     * @param primaryEnd 1.始发灶起止日期至
     */
    public void setPrimaryEnd(String primaryEnd) {
        this.primaryEnd = primaryEnd == null ? null : primaryEnd.trim();
    }

    /**
     * 获取2.区域淋巴结
     *
     * @return LYMPH_CODE - 2.区域淋巴结
     */
    public String getLymphCode() {
        return lymphCode;
    }

    /**
     * 设置2.区域淋巴结
     *
     * @param lymphCode 2.区域淋巴结
     */
    public void setLymphCode(String lymphCode) {
        this.lymphCode = lymphCode == null ? null : lymphCode.trim();
    }

    /**
     * 获取2.区域淋巴结剂量
     *
     * @return LYMPH_DOSAGE - 2.区域淋巴结剂量
     */
    public String getLymphDosage() {
        return lymphDosage;
    }

    /**
     * 设置2.区域淋巴结剂量
     *
     * @param lymphDosage 2.区域淋巴结剂量
     */
    public void setLymphDosage(String lymphDosage) {
        this.lymphDosage = lymphDosage == null ? null : lymphDosage.trim();
    }

    /**
     * 获取2.区域淋巴结起止日期
     *
     * @return LYMPH_BEGIN - 2.区域淋巴结起止日期
     */
    public String getLymphBegin() {
        return lymphBegin;
    }

    /**
     * 设置2.区域淋巴结起止日期
     *
     * @param lymphBegin 2.区域淋巴结起止日期
     */
    public void setLymphBegin(String lymphBegin) {
        this.lymphBegin = lymphBegin == null ? null : lymphBegin.trim();
    }

    /**
     * 获取2.区域淋巴结起止日期至
     *
     * @return LYMPH_END - 2.区域淋巴结起止日期至
     */
    public String getLymphEnd() {
        return lymphEnd;
    }

    /**
     * 设置2.区域淋巴结起止日期至
     *
     * @param lymphEnd 2.区域淋巴结起止日期至
     */
    public void setLymphEnd(String lymphEnd) {
        this.lymphEnd = lymphEnd == null ? null : lymphEnd.trim();
    }

    /**
     * 获取转移灶内容
     *
     * @return CHANGE_PLACE - 转移灶内容
     */
    public String getChangePlace() {
        return changePlace;
    }

    /**
     * 设置转移灶内容
     *
     * @param changePlace 转移灶内容
     */
    public void setChangePlace(String changePlace) {
        this.changePlace = changePlace == null ? null : changePlace.trim();
    }

    /**
     * 获取转移灶剂量
     *
     * @return CHANGE_DOSAGE - 转移灶剂量
     */
    public String getChangeDosage() {
        return changeDosage;
    }

    /**
     * 设置转移灶剂量
     *
     * @param changeDosage 转移灶剂量
     */
    public void setChangeDosage(String changeDosage) {
        this.changeDosage = changeDosage == null ? null : changeDosage.trim();
    }

    /**
     * 获取转移灶起止日期
     *
     * @return CHANGE_BEGIN - 转移灶起止日期
     */
    public String getChangeBegin() {
        return changeBegin;
    }

    /**
     * 设置转移灶起止日期
     *
     * @param changeBegin 转移灶起止日期
     */
    public void setChangeBegin(String changeBegin) {
        this.changeBegin = changeBegin == null ? null : changeBegin.trim();
    }

    /**
     * 获取转移灶起止日期至
     *
     * @return CHANGE_END - 转移灶起止日期至
     */
    public String getChangeEnd() {
        return changeEnd;
    }

    /**
     * 设置转移灶起止日期至
     *
     * @param changeEnd 转移灶起止日期至
     */
    public void setChangeEnd(String changeEnd) {
        this.changeEnd = changeEnd == null ? null : changeEnd.trim();
    }

    /**
     * 获取化疗方式1
     *
     * @return CHEMO_WAY - 化疗方式1
     */
    public String getChemoWay() {
        return chemoWay;
    }

    /**
     * 设置化疗方式1
     *
     * @param chemoWay 化疗方式1
     */
    public void setChemoWay(String chemoWay) {
        this.chemoWay = chemoWay == null ? null : chemoWay.trim();
    }

    /**
     * 获取化疗方式2
     *
     * @return CHEMO_MEANS - 化疗方式2
     */
    public String getChemoMeans() {
        return chemoMeans;
    }

    /**
     * 设置化疗方式2
     *
     * @param chemoMeans 化疗方式2
     */
    public void setChemoMeans(String chemoMeans) {
        this.chemoMeans = chemoMeans == null ? null : chemoMeans.trim();
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