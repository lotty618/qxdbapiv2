package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_REGISTER")
public class OutpatientRegister {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者Id主键约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 挂号科室代码DIR_DEPT（患者挂号科室的院内科室代码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 挂号科室名称（标识个体在医院就诊的科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码）
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     */
    @Column(name = "CARD_TYPE_CODE")
    private String cardTypeCode;

    /**
     * 转诊类别代码0非转诊，1转入，-1转出（默认为0：非转诊。）
     */
    @Column(name = "REF_CAT")
    private String refCat;

    /**
     * 转诊医疗机构组织机构代码DIR_ORG（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    @Column(name = "REF_MOD_CODE")
    private String refModCode;

    /**
     * 初次就诊0否 1是（患者是否初次就诊标识）
     */
    @Column(name = "IS_FIRST_VISIT")
    private String isFirstVisit;

    /**
     * 是否预约0否 1是
     */
    @Column(name = "IS_OPT_RES")
    private String isOptRes;

    /**
     * 退号标志0正常 1作废（0-正常；1-作废）
     */
    @Column(name = "IS_BACK_SIGN")
    private String isBackSign;

    /**
     * 挂号时间
     */
    @Column(name = "REG_DTIME")
    private String regDtime;

    /**
     * 挂号类别DIR_REG_TYPE（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    @Column(name = "REG_TYPE")
    private String regType;

    /**
     * 挂号方式DIR_REG_METHOD（例如：窗口、预约等）
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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    /**
     * 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
    }

    /**
     * 获取患者Id主键约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者Id主键约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者Id主键约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者Id主键约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @return ORG_ID - 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @param orgId 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取挂号科室代码DIR_DEPT（患者挂号科室的院内科室代码）
     *
     * @return DEPT_CODE - 挂号科室代码DIR_DEPT（患者挂号科室的院内科室代码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置挂号科室代码DIR_DEPT（患者挂号科室的院内科室代码）
     *
     * @param deptCode 挂号科室代码DIR_DEPT（患者挂号科室的院内科室代码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取挂号科室名称（标识个体在医院就诊的科室名称）
     *
     * @return DEPT_NAME - 挂号科室名称（标识个体在医院就诊的科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置挂号科室名称（标识个体在医院就诊的科室名称）
     *
     * @param deptName 挂号科室名称（标识个体在医院就诊的科室名称）
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
     * 获取卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     *
     * @return CARD_TYPE_CODE - 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * 设置卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
     *
     * @param cardTypeCode 卡类型代码DIR_CARD_TYPE（就诊卡类型在特定编码体系中的编码）
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
     * 获取转诊医疗机构组织机构代码DIR_ORG（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     *
     * @return REF_MOD_CODE - 转诊医疗机构组织机构代码DIR_ORG（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    public String getRefModCode() {
        return refModCode;
    }

    /**
     * 设置转诊医疗机构组织机构代码DIR_ORG（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     *
     * @param refModCode 转诊医疗机构组织机构代码DIR_ORG（转诊医疗机构组织机构代码。转诊类别为0：填写-1。转诊代码为-1时，填写患者转出所至医疗机构的组织机构代码；转诊代码为1时：填写患者转出的医疗机构代码。）
     */
    public void setRefModCode(String refModCode) {
        this.refModCode = refModCode == null ? null : refModCode.trim();
    }

    /**
     * 获取初次就诊0否 1是（患者是否初次就诊标识）
     *
     * @return IS_FIRST_VISIT - 初次就诊0否 1是（患者是否初次就诊标识）
     */
    public String getIsFirstVisit() {
        return isFirstVisit;
    }

    /**
     * 设置初次就诊0否 1是（患者是否初次就诊标识）
     *
     * @param isFirstVisit 初次就诊0否 1是（患者是否初次就诊标识）
     */
    public void setIsFirstVisit(String isFirstVisit) {
        this.isFirstVisit = isFirstVisit == null ? null : isFirstVisit.trim();
    }

    /**
     * 获取是否预约0否 1是
     *
     * @return IS_OPT_RES - 是否预约0否 1是
     */
    public String getIsOptRes() {
        return isOptRes;
    }

    /**
     * 设置是否预约0否 1是
     *
     * @param isOptRes 是否预约0否 1是
     */
    public void setIsOptRes(String isOptRes) {
        this.isOptRes = isOptRes == null ? null : isOptRes.trim();
    }

    /**
     * 获取退号标志0正常 1作废（0-正常；1-作废）
     *
     * @return IS_BACK_SIGN - 退号标志0正常 1作废（0-正常；1-作废）
     */
    public String getIsBackSign() {
        return isBackSign;
    }

    /**
     * 设置退号标志0正常 1作废（0-正常；1-作废）
     *
     * @param isBackSign 退号标志0正常 1作废（0-正常；1-作废）
     */
    public void setIsBackSign(String isBackSign) {
        this.isBackSign = isBackSign == null ? null : isBackSign.trim();
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
     * 获取挂号类别DIR_REG_TYPE（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     *
     * @return REG_TYPE - 挂号类别DIR_REG_TYPE（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    public String getRegType() {
        return regType;
    }

    /**
     * 设置挂号类别DIR_REG_TYPE（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     *
     * @param regType 挂号类别DIR_REG_TYPE（患者发生挂号业务时所挂号的类别，如普通门诊，专家门诊等）
     */
    public void setRegType(String regType) {
        this.regType = regType == null ? null : regType.trim();
    }

    /**
     * 获取挂号方式DIR_REG_METHOD（例如：窗口、预约等）
     *
     * @return REG_MET - 挂号方式DIR_REG_METHOD（例如：窗口、预约等）
     */
    public String getRegMet() {
        return regMet;
    }

    /**
     * 设置挂号方式DIR_REG_METHOD（例如：窗口、预约等）
     *
     * @param regMet 挂号方式DIR_REG_METHOD（例如：窗口、预约等）
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
     * 获取有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 获取系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @return SYSUP_TIME - 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * 设置系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @param sysupTime 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * 获取数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @return SYSCR_TIME - 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * 设置数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @param syscrTime 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
    }
}