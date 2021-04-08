package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT_FAMILYDISEASE")
public class PatientFamilydisease {
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
     * 家族疾病史ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "FAMILYDISEASE_ID")
    private String familydiseaseId;

    /**
     * 与本人关系代码GB/T 4761（有疾病家族成员与本人关系代码）
     */
    @Column(name = "RELATIONSHIP_CODE")
    private String relationshipCode;

    /**
     * 家族性疾病代码CV02.10.005（本人近亲中患有的家族性疾病名称的代码）
     */
    @Column(name = "FAMILY_DISEASE_CODE")
    private String familyDiseaseCode;

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
     * 获取家族疾病史ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return FAMILYDISEASE_ID - 家族疾病史ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getFamilydiseaseId() {
        return familydiseaseId;
    }

    /**
     * 设置家族疾病史ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param familydiseaseId 家族疾病史ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setFamilydiseaseId(String familydiseaseId) {
        this.familydiseaseId = familydiseaseId == null ? null : familydiseaseId.trim();
    }

    /**
     * 获取与本人关系代码GB/T 4761（有疾病家族成员与本人关系代码）
     *
     * @return RELATIONSHIP_CODE - 与本人关系代码GB/T 4761（有疾病家族成员与本人关系代码）
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * 设置与本人关系代码GB/T 4761（有疾病家族成员与本人关系代码）
     *
     * @param relationshipCode 与本人关系代码GB/T 4761（有疾病家族成员与本人关系代码）
     */
    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode == null ? null : relationshipCode.trim();
    }

    /**
     * 获取家族性疾病代码CV02.10.005（本人近亲中患有的家族性疾病名称的代码）
     *
     * @return FAMILY_DISEASE_CODE - 家族性疾病代码CV02.10.005（本人近亲中患有的家族性疾病名称的代码）
     */
    public String getFamilyDiseaseCode() {
        return familyDiseaseCode;
    }

    /**
     * 设置家族性疾病代码CV02.10.005（本人近亲中患有的家族性疾病名称的代码）
     *
     * @param familyDiseaseCode 家族性疾病代码CV02.10.005（本人近亲中患有的家族性疾病名称的代码）
     */
    public void setFamilyDiseaseCode(String familyDiseaseCode) {
        this.familyDiseaseCode = familyDiseaseCode == null ? null : familyDiseaseCode.trim();
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