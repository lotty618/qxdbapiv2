package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_REGISTER")
public class QxTOutpatientRegister {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 挂号唯一标识
     */
    @Column(name = "OPRUID")
    private String opruid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 挂号科室
     */
    @Column(name = "DUID")
    private String duid;

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
     * 门诊编号
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 科室名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    @Column(name = "CARD_TYPE_CODE")
    private String cardTypeCode;

    /**
     * 转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     */
    @Column(name = "REF_CAT")
    private String refCat;

    /**
     * 转诊医疗机构组织机构代码（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    @Column(name = "REF_MOD_CODE")
    private String refModCode;

    /**
     * 初次就诊0否 1是（患者是否初次就诊标识）
     */
    @Column(name = "IS_FIRST_VISIT")
    private Long isFirstVisit;

    /**
     * 是否预约0否 1是
     */
    @Column(name = "IS_OPT_RES")
    private Long isOptRes;

    /**
     * 退号标志0正常 1作废（0-正常；1-作废）
     */
    @Column(name = "IS_BACK_SIGN")
    private Long isBackSign;

    /**
     * 挂号时间
     */
    @Column(name = "REG_DTIME")
    private String regDtime;

    /**
     * 挂号类别（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    @Column(name = "REG_TYPE")
    private String regType;

    /**
     * 挂号方式（例如：窗口、预约等）
     */
    @Column(name = "REG_MET")
    private String regMet;

    /**
     * 挂号费
     */
    @Column(name = "REG_FEE")
    private BigDecimal regFee;

    /**
     * 诊疗费（本次挂号关联的诊疗费用（说明））
     */
    @Column(name = "MED_EXP")
    private BigDecimal medExp;

    /**
     * 其他费（本次挂号关联的其他费用）
     */
    @Column(name = "OTH_FEE")
    private BigDecimal othFee;

    /**
     * 挂号有效时间（挂号的有效时间，单位(小时)）
     */
    @Column(name = "VALID_HOURS")
    private String validHours;

    /**
     * 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAST_UPD_DATE")
    private String lastUpdDate;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

    /**
     * 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    @Column(name = "STATUS_CN")
    private String statusCn;

    /**
     * 删除时间YYYY/MM/DD（数据删除时间）
     */
    @Column(name = "CANCEL_TIME")
    private String cancelTime;

    /**
     * 录入人姓名（信息录入人姓名）
     */
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

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
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     * 获取挂号唯一标识
     *
     * @return OPRUID - 挂号唯一标识
     */
    public String getOpruid() {
        return opruid;
    }

    /**
     * 设置挂号唯一标识
     *
     * @param opruid 挂号唯一标识
     */
    public void setOpruid(String opruid) {
        this.opruid = opruid == null ? null : opruid.trim();
    }

    /**
     * 获取门诊记录唯一标识
     *
     * @return PNUID - 门诊记录唯一标识
     */
    public String getPnuid() {
        return pnuid;
    }

    /**
     * 设置门诊记录唯一标识
     *
     * @param pnuid 门诊记录唯一标识
     */
    public void setPnuid(String pnuid) {
        this.pnuid = pnuid == null ? null : pnuid.trim();
    }

    /**
     * 获取挂号科室
     *
     * @return DUID - 挂号科室
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置挂号科室
     *
     * @param duid 挂号科室
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
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
     * 获取门诊编号
     *
     * @return OUTPAT_FORM_NO - 门诊编号
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊编号
     *
     * @param outpatFormNo 门诊编号
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取科室名称
     *
     * @return DEPT_NAME - 科室名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称
     *
     * @param deptName 科室名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @return CARD_NO - 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     *
     * @param cardNo 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取卡类型代码（就诊卡类型在特定编码体系中的编码）
     *
     * @return CARD_TYPE_CODE - 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * 设置卡类型代码（就诊卡类型在特定编码体系中的编码）
     *
     * @param cardTypeCode 卡类型代码（就诊卡类型在特定编码体系中的编码）
     */
    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode == null ? null : cardTypeCode.trim();
    }

    /**
     * 获取转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     *
     * @return REF_CAT - 转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     */
    public String getRefCat() {
        return refCat;
    }

    /**
     * 设置转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     *
     * @param refCat 转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     */
    public void setRefCat(String refCat) {
        this.refCat = refCat == null ? null : refCat.trim();
    }

    /**
     * 获取转诊医疗机构组织机构代码（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     *
     * @return REF_MOD_CODE - 转诊医疗机构组织机构代码（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    public String getRefModCode() {
        return refModCode;
    }

    /**
     * 设置转诊医疗机构组织机构代码（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     *
     * @param refModCode 转诊医疗机构组织机构代码（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    public void setRefModCode(String refModCode) {
        this.refModCode = refModCode == null ? null : refModCode.trim();
    }

    /**
     * 获取初次就诊0否 1是（患者是否初次就诊标识）
     *
     * @return IS_FIRST_VISIT - 初次就诊0否 1是（患者是否初次就诊标识）
     */
    public Long getIsFirstVisit() {
        return isFirstVisit;
    }

    /**
     * 设置初次就诊0否 1是（患者是否初次就诊标识）
     *
     * @param isFirstVisit 初次就诊0否 1是（患者是否初次就诊标识）
     */
    public void setIsFirstVisit(Long isFirstVisit) {
        this.isFirstVisit = isFirstVisit;
    }

    /**
     * 获取是否预约0否 1是
     *
     * @return IS_OPT_RES - 是否预约0否 1是
     */
    public Long getIsOptRes() {
        return isOptRes;
    }

    /**
     * 设置是否预约0否 1是
     *
     * @param isOptRes 是否预约0否 1是
     */
    public void setIsOptRes(Long isOptRes) {
        this.isOptRes = isOptRes;
    }

    /**
     * 获取退号标志0正常 1作废（0-正常；1-作废）
     *
     * @return IS_BACK_SIGN - 退号标志0正常 1作废（0-正常；1-作废）
     */
    public Long getIsBackSign() {
        return isBackSign;
    }

    /**
     * 设置退号标志0正常 1作废（0-正常；1-作废）
     *
     * @param isBackSign 退号标志0正常 1作废（0-正常；1-作废）
     */
    public void setIsBackSign(Long isBackSign) {
        this.isBackSign = isBackSign;
    }

    /**
     * 获取挂号时间
     *
     * @return REG_DTIME - 挂号时间
     */
    public String getRegDtime() {
        return regDtime;
    }

    /**
     * 设置挂号时间
     *
     * @param regDtime 挂号时间
     */
    public void setRegDtime(String regDtime) {
        this.regDtime = regDtime == null ? null : regDtime.trim();
    }

    /**
     * 获取挂号类别（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     *
     * @return REG_TYPE - 挂号类别（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    public String getRegType() {
        return regType;
    }

    /**
     * 设置挂号类别（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     *
     * @param regType 挂号类别（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    public void setRegType(String regType) {
        this.regType = regType == null ? null : regType.trim();
    }

    /**
     * 获取挂号方式（例如：窗口、预约等）
     *
     * @return REG_MET - 挂号方式（例如：窗口、预约等）
     */
    public String getRegMet() {
        return regMet;
    }

    /**
     * 设置挂号方式（例如：窗口、预约等）
     *
     * @param regMet 挂号方式（例如：窗口、预约等）
     */
    public void setRegMet(String regMet) {
        this.regMet = regMet == null ? null : regMet.trim();
    }

    /**
     * 获取挂号费
     *
     * @return REG_FEE - 挂号费
     */
    public BigDecimal getRegFee() {
        return regFee;
    }

    /**
     * 设置挂号费
     *
     * @param regFee 挂号费
     */
    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    /**
     * 获取诊疗费（本次挂号关联的诊疗费用（说明））
     *
     * @return MED_EXP - 诊疗费（本次挂号关联的诊疗费用（说明））
     */
    public BigDecimal getMedExp() {
        return medExp;
    }

    /**
     * 设置诊疗费（本次挂号关联的诊疗费用（说明））
     *
     * @param medExp 诊疗费（本次挂号关联的诊疗费用（说明））
     */
    public void setMedExp(BigDecimal medExp) {
        this.medExp = medExp;
    }

    /**
     * 获取其他费（本次挂号关联的其他费用）
     *
     * @return OTH_FEE - 其他费（本次挂号关联的其他费用）
     */
    public BigDecimal getOthFee() {
        return othFee;
    }

    /**
     * 设置其他费（本次挂号关联的其他费用）
     *
     * @param othFee 其他费（本次挂号关联的其他费用）
     */
    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    /**
     * 获取挂号有效时间（挂号的有效时间，单位(小时)）
     *
     * @return VALID_HOURS - 挂号有效时间（挂号的有效时间，单位(小时)）
     */
    public String getValidHours() {
        return validHours;
    }

    /**
     * 设置挂号有效时间（挂号的有效时间，单位(小时)）
     *
     * @param validHours 挂号有效时间（挂号的有效时间，单位(小时)）
     */
    public void setValidHours(String validHours) {
        this.validHours = validHours == null ? null : validHours.trim();
    }

    /**
     * 获取最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate == null ? null : lastUpdDate.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 获取状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @return STATUS_CN - 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public String getStatusCn() {
        return statusCn;
    }

    /**
     * 设置状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     *
     * @param statusCn 状态标识中文名称（表示业务数据在业务系统中状态信息中文名称）
     */
    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn == null ? null : statusCn.trim();
    }

    /**
     * 获取删除时间YYYY/MM/DD（数据删除时间）
     *
     * @return CANCEL_TIME - 删除时间YYYY/MM/DD（数据删除时间）
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置删除时间YYYY/MM/DD（数据删除时间）
     *
     * @param cancelTime 删除时间YYYY/MM/DD（数据删除时间）
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    /**
     * 获取录入人姓名（信息录入人姓名）
     *
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * 获取最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @return MODIFIED_TIME - 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     *
     * @param modifiedTime 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime == null ? null : modifiedTime.trim();
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
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}