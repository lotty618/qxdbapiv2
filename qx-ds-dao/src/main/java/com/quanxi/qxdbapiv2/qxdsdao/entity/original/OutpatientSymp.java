package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_SYMP")
public class OutpatientSymp {
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
     * 症状序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "SYMPTOM_ID")
    private String symptomId;

    /**
     * 症状名称（患者出现的临床主要症状的名称）
     */
    @Column(name = "SYMPTOM_NAME")
    private String symptomName;

    /**
     * 症状代码（患者的症状在特定编码体系中的代码）
     */
    @Column(name = "SYMPTOM_CODE")
    private String symptomCode;

    /**
     * 症状描述（对个体出现症状的详细描述。）
     */
    @Column(name = "SYMPTOM_DESCRIPTION")
    private String symptomDescription;

    /**
     * 症状持续时间(min)（某症状发作的持续时间，计量单位为min）
     */
    @Column(name = "SYMP_DURATION_MINS")
    private Short sympDurationMins;

    /**
     * 发病日期时间（疾病发病症状的首次出现当日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ONSET_DTIME")
    private String onsetDtime;

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
     * 获取症状序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return SYMPTOM_ID - 症状序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getSymptomId() {
        return symptomId;
    }

    /**
     * 设置症状序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param symptomId 症状序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setSymptomId(String symptomId) {
        this.symptomId = symptomId == null ? null : symptomId.trim();
    }

    /**
     * 获取症状名称（患者出现的临床主要症状的名称）
     *
     * @return SYMPTOM_NAME - 症状名称（患者出现的临床主要症状的名称）
     */
    public String getSymptomName() {
        return symptomName;
    }

    /**
     * 设置症状名称（患者出现的临床主要症状的名称）
     *
     * @param symptomName 症状名称（患者出现的临床主要症状的名称）
     */
    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName == null ? null : symptomName.trim();
    }

    /**
     * 获取症状代码（患者的症状在特定编码体系中的代码）
     *
     * @return SYMPTOM_CODE - 症状代码（患者的症状在特定编码体系中的代码）
     */
    public String getSymptomCode() {
        return symptomCode;
    }

    /**
     * 设置症状代码（患者的症状在特定编码体系中的代码）
     *
     * @param symptomCode 症状代码（患者的症状在特定编码体系中的代码）
     */
    public void setSymptomCode(String symptomCode) {
        this.symptomCode = symptomCode == null ? null : symptomCode.trim();
    }

    /**
     * 获取症状描述（对个体出现症状的详细描述。）
     *
     * @return SYMPTOM_DESCRIPTION - 症状描述（对个体出现症状的详细描述。）
     */
    public String getSymptomDescription() {
        return symptomDescription;
    }

    /**
     * 设置症状描述（对个体出现症状的详细描述。）
     *
     * @param symptomDescription 症状描述（对个体出现症状的详细描述。）
     */
    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription == null ? null : symptomDescription.trim();
    }

    /**
     * 获取症状持续时间(min)（某症状发作的持续时间，计量单位为min）
     *
     * @return SYMP_DURATION_MINS - 症状持续时间(min)（某症状发作的持续时间，计量单位为min）
     */
    public Short getSympDurationMins() {
        return sympDurationMins;
    }

    /**
     * 设置症状持续时间(min)（某症状发作的持续时间，计量单位为min）
     *
     * @param sympDurationMins 症状持续时间(min)（某症状发作的持续时间，计量单位为min）
     */
    public void setSympDurationMins(Short sympDurationMins) {
        this.sympDurationMins = sympDurationMins;
    }

    /**
     * 获取发病日期时间（疾病发病症状的首次出现当日的公元纪年日期和时间的完整描述）
     *
     * @return ONSET_DTIME - 发病日期时间（疾病发病症状的首次出现当日的公元纪年日期和时间的完整描述）
     */
    public String getOnsetDtime() {
        return onsetDtime;
    }

    /**
     * 设置发病日期时间（疾病发病症状的首次出现当日的公元纪年日期和时间的完整描述）
     *
     * @param onsetDtime 发病日期时间（疾病发病症状的首次出现当日的公元纪年日期和时间的完整描述）
     */
    public void setOnsetDtime(String onsetDtime) {
        this.onsetDtime = onsetDtime == null ? null : onsetDtime.trim();
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