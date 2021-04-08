package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_REFERRAL")
public class OutpatientReferral {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
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
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "CHANGE_NO")
    private String changeNo;

    /**
     * 转出医疗机构名称（患者转诊转人的医疗卫生机构的组织机构名称）
     */
    @Column(name = "REFER_FROM_ORG_NAME")
    private String referFromOrgName;

    /**
     * 转出医疗机构代码DIR_ORG（患者转诊转出的医疗机构名称）
     */
    @Column(name = "REFER_FROM_ORG_ID")
    private String referFromOrgId;

    /**
     * 转出医疗机构科室名称（患者转诊转出的医疗机构所属科室名称）
     */
    @Column(name = "REFER_FROM_DEPT_NAME")
    private String referFromDeptName;

    /**
     * 转入医疗机构名称（患者转诊转入的医疗机构名称）
     */
    @Column(name = "REFER_TO_ORG_NAME")
    private String referToOrgName;

    /**
     * 转入医疗机构代码DIR_ORG（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "REFER_TO_ORG_ID")
    private String referToOrgId;

    /**
     * 转入机构科室名称（患者转诊转入的医疗机构所属科室名称）
     */
    @Column(name = "REFER_TO_DEPT_NAME")
    private String referToDeptName;

    /**
     * 转诊记录（对患者转诊过程的描述）
     */
    @Column(name = "REFERRAL_RECORDS")
    private String referralRecords;

    /**
     * 转诊原因（对患者转诊原因的简要描述）
     */
    @Column(name = "REFERRAL_REASON")
    private String referralReason;

    /**
     * 转诊日期（患者转诊当日的公元纪年日期的完整描述）
     */
    @Column(name = "REFERRAL_DATE")
    private String referralDate;

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
     * 获取患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
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
     * 获取门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return CHANGE_NO - 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getChangeNo() {
        return changeNo;
    }

    /**
     * 设置转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param changeNo 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setChangeNo(String changeNo) {
        this.changeNo = changeNo == null ? null : changeNo.trim();
    }

    /**
     * 获取转出医疗机构名称（患者转诊转人的医疗卫生机构的组织机构名称）
     *
     * @return REFER_FROM_ORG_NAME - 转出医疗机构名称（患者转诊转人的医疗卫生机构的组织机构名称）
     */
    public String getReferFromOrgName() {
        return referFromOrgName;
    }

    /**
     * 设置转出医疗机构名称（患者转诊转人的医疗卫生机构的组织机构名称）
     *
     * @param referFromOrgName 转出医疗机构名称（患者转诊转人的医疗卫生机构的组织机构名称）
     */
    public void setReferFromOrgName(String referFromOrgName) {
        this.referFromOrgName = referFromOrgName == null ? null : referFromOrgName.trim();
    }

    /**
     * 获取转出医疗机构代码DIR_ORG（患者转诊转出的医疗机构名称）
     *
     * @return REFER_FROM_ORG_ID - 转出医疗机构代码DIR_ORG（患者转诊转出的医疗机构名称）
     */
    public String getReferFromOrgId() {
        return referFromOrgId;
    }

    /**
     * 设置转出医疗机构代码DIR_ORG（患者转诊转出的医疗机构名称）
     *
     * @param referFromOrgId 转出医疗机构代码DIR_ORG（患者转诊转出的医疗机构名称）
     */
    public void setReferFromOrgId(String referFromOrgId) {
        this.referFromOrgId = referFromOrgId == null ? null : referFromOrgId.trim();
    }

    /**
     * 获取转出医疗机构科室名称（患者转诊转出的医疗机构所属科室名称）
     *
     * @return REFER_FROM_DEPT_NAME - 转出医疗机构科室名称（患者转诊转出的医疗机构所属科室名称）
     */
    public String getReferFromDeptName() {
        return referFromDeptName;
    }

    /**
     * 设置转出医疗机构科室名称（患者转诊转出的医疗机构所属科室名称）
     *
     * @param referFromDeptName 转出医疗机构科室名称（患者转诊转出的医疗机构所属科室名称）
     */
    public void setReferFromDeptName(String referFromDeptName) {
        this.referFromDeptName = referFromDeptName == null ? null : referFromDeptName.trim();
    }

    /**
     * 获取转入医疗机构名称（患者转诊转入的医疗机构名称）
     *
     * @return REFER_TO_ORG_NAME - 转入医疗机构名称（患者转诊转入的医疗机构名称）
     */
    public String getReferToOrgName() {
        return referToOrgName;
    }

    /**
     * 设置转入医疗机构名称（患者转诊转入的医疗机构名称）
     *
     * @param referToOrgName 转入医疗机构名称（患者转诊转入的医疗机构名称）
     */
    public void setReferToOrgName(String referToOrgName) {
        this.referToOrgName = referToOrgName == null ? null : referToOrgName.trim();
    }

    /**
     * 获取转入医疗机构代码DIR_ORG（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return REFER_TO_ORG_ID - 转入医疗机构代码DIR_ORG（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getReferToOrgId() {
        return referToOrgId;
    }

    /**
     * 设置转入医疗机构代码DIR_ORG（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param referToOrgId 转入医疗机构代码DIR_ORG（建档医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setReferToOrgId(String referToOrgId) {
        this.referToOrgId = referToOrgId == null ? null : referToOrgId.trim();
    }

    /**
     * 获取转入机构科室名称（患者转诊转入的医疗机构所属科室名称）
     *
     * @return REFER_TO_DEPT_NAME - 转入机构科室名称（患者转诊转入的医疗机构所属科室名称）
     */
    public String getReferToDeptName() {
        return referToDeptName;
    }

    /**
     * 设置转入机构科室名称（患者转诊转入的医疗机构所属科室名称）
     *
     * @param referToDeptName 转入机构科室名称（患者转诊转入的医疗机构所属科室名称）
     */
    public void setReferToDeptName(String referToDeptName) {
        this.referToDeptName = referToDeptName == null ? null : referToDeptName.trim();
    }

    /**
     * 获取转诊记录（对患者转诊过程的描述）
     *
     * @return REFERRAL_RECORDS - 转诊记录（对患者转诊过程的描述）
     */
    public String getReferralRecords() {
        return referralRecords;
    }

    /**
     * 设置转诊记录（对患者转诊过程的描述）
     *
     * @param referralRecords 转诊记录（对患者转诊过程的描述）
     */
    public void setReferralRecords(String referralRecords) {
        this.referralRecords = referralRecords == null ? null : referralRecords.trim();
    }

    /**
     * 获取转诊原因（对患者转诊原因的简要描述）
     *
     * @return REFERRAL_REASON - 转诊原因（对患者转诊原因的简要描述）
     */
    public String getReferralReason() {
        return referralReason;
    }

    /**
     * 设置转诊原因（对患者转诊原因的简要描述）
     *
     * @param referralReason 转诊原因（对患者转诊原因的简要描述）
     */
    public void setReferralReason(String referralReason) {
        this.referralReason = referralReason == null ? null : referralReason.trim();
    }

    /**
     * 获取转诊日期（患者转诊当日的公元纪年日期的完整描述）
     *
     * @return REFERRAL_DATE - 转诊日期（患者转诊当日的公元纪年日期的完整描述）
     */
    public String getReferralDate() {
        return referralDate;
    }

    /**
     * 设置转诊日期（患者转诊当日的公元纪年日期的完整描述）
     *
     * @param referralDate 转诊日期（患者转诊当日的公元纪年日期的完整描述）
     */
    public void setReferralDate(String referralDate) {
        this.referralDate = referralDate == null ? null : referralDate.trim();
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