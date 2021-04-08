package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT_BLOODTRANS")
public class PatientBloodtrans {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 输血记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "BLOODTRANS_ID")
    private String bloodtransId;

    /**
     * 输血原因（本人既往榆血的原因）
     */
    @Column(name = "BLOOD_TRANSF_CAUSE")
    private String bloodTransfCause;

    /**
     * 输血类型代码 CV04.50.021（受检者按照 ABO 血型系统决定的血型在特定编码体系中的代码）
     */
    @Column(name = "BLOODTYPE")
    private String bloodtype;

    /**
     * 输血量(单位：ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为mL）
     */
    @Column(name = "BLOOD_AMOUNT")
    private BigDecimal bloodAmount;

    /**
     * 输血日期YYYY/MM/DD（本人接受输血当日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OCCURRED_DATE")
    private String occurredDate;

    /**
     * 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
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
     * 获取患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取输血记录序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return BLOODTRANS_ID - 输血记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getBloodtransId() {
        return bloodtransId;
    }

    /**
     * 设置输血记录序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param bloodtransId 输血记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setBloodtransId(String bloodtransId) {
        this.bloodtransId = bloodtransId == null ? null : bloodtransId.trim();
    }

    /**
     * 获取输血原因（本人既往榆血的原因）
     *
     * @return BLOOD_TRANSF_CAUSE - 输血原因（本人既往榆血的原因）
     */
    public String getBloodTransfCause() {
        return bloodTransfCause;
    }

    /**
     * 设置输血原因（本人既往榆血的原因）
     *
     * @param bloodTransfCause 输血原因（本人既往榆血的原因）
     */
    public void setBloodTransfCause(String bloodTransfCause) {
        this.bloodTransfCause = bloodTransfCause == null ? null : bloodTransfCause.trim();
    }

    /**
     * 获取输血类型代码 CV04.50.021（受检者按照 ABO 血型系统决定的血型在特定编码体系中的代码）
     *
     * @return BLOODTYPE - 输血类型代码 CV04.50.021（受检者按照 ABO 血型系统决定的血型在特定编码体系中的代码）
     */
    public String getBloodtype() {
        return bloodtype;
    }

    /**
     * 设置输血类型代码 CV04.50.021（受检者按照 ABO 血型系统决定的血型在特定编码体系中的代码）
     *
     * @param bloodtype 输血类型代码 CV04.50.021（受检者按照 ABO 血型系统决定的血型在特定编码体系中的代码）
     */
    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    /**
     * 获取输血量(单位：ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为mL）
     *
     * @return BLOOD_AMOUNT - 输血量(单位：ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为mL）
     */
    public BigDecimal getBloodAmount() {
        return bloodAmount;
    }

    /**
     * 设置输血量(单位：ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为mL）
     *
     * @param bloodAmount 输血量(单位：ml)（输入红细胞、血小板、血浆、全血等的数量，计量单位为mL）
     */
    public void setBloodAmount(BigDecimal bloodAmount) {
        this.bloodAmount = bloodAmount;
    }

    /**
     * 获取输血日期YYYY/MM/DD（本人接受输血当日的公元纪年日期和时间的完整描述）
     *
     * @return OCCURRED_DATE - 输血日期YYYY/MM/DD（本人接受输血当日的公元纪年日期和时间的完整描述）
     */
    public String getOccurredDate() {
        return occurredDate;
    }

    /**
     * 设置输血日期YYYY/MM/DD（本人接受输血当日的公元纪年日期和时间的完整描述）
     *
     * @param occurredDate 输血日期YYYY/MM/DD（本人接受输血当日的公元纪年日期和时间的完整描述）
     */
    public void setOccurredDate(String occurredDate) {
        this.occurredDate = occurredDate == null ? null : occurredDate.trim();
    }

    /**
     * 获取最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间YYYY/MM/DD HH24:MI:SS（最后修改时的公元纪年日期和时间的完整描述）
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