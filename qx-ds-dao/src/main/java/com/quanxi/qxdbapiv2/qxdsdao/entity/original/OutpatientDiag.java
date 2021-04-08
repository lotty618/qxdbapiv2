package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_DIAG")
public class OutpatientDiag {
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
     * 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "DIAGNOSIS_ID")
    private String diagnosisId;

    /**
     * 传染标志0否 1是（是否传染病的标志）
     */
    @Column(name = "INFECT_FLAG")
    private String infectFlag;

    /**
     * 传染上报标志0否 1是（传染病是否上报的标志）
     */
    @Column(name = "INFECT_REPORT_FLAG")
    private String infectReportFlag;

    /**
     * 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    @Column(name = "OUTPAT_DIAG_NAME")
    private String outpatDiagName;

    /**
     * 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "OUTPAT_DIAG_CODE")
    private String outpatDiagCode;

    /**
     * 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    @Column(name = "DIAG_TYPE_CODE")
    private String diagTypeCode;

    /**
     * 诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    @Column(name = "DIAG_BASIS_CODE")
    private String diagBasisCode;

    /**
     * 中医诊断类别编码CV05.02.21（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    @Column(name = "CN_MED_DIA_CAT_CODE")
    private String cnMedDiaCatCode;

    /**
     * 西医诊断类别编码CV05.02.20（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    @Column(name = "WEST_DIA_CAT_CODE")
    private String westDiaCatCode;

    /**
     * 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    @Column(name = "DIAG_DATE")
    private String diagDate;

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
     * 获取诊断序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DIAGNOSIS_ID - 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDiagnosisId() {
        return diagnosisId;
    }

    /**
     * 设置诊断序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param diagnosisId 诊断序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId == null ? null : diagnosisId.trim();
    }

    /**
     * 获取传染标志0否 1是（是否传染病的标志）
     *
     * @return INFECT_FLAG - 传染标志0否 1是（是否传染病的标志）
     */
    public String getInfectFlag() {
        return infectFlag;
    }

    /**
     * 设置传染标志0否 1是（是否传染病的标志）
     *
     * @param infectFlag 传染标志0否 1是（是否传染病的标志）
     */
    public void setInfectFlag(String infectFlag) {
        this.infectFlag = infectFlag == null ? null : infectFlag.trim();
    }

    /**
     * 获取传染上报标志0否 1是（传染病是否上报的标志）
     *
     * @return INFECT_REPORT_FLAG - 传染上报标志0否 1是（传染病是否上报的标志）
     */
    public String getInfectReportFlag() {
        return infectReportFlag;
    }

    /**
     * 设置传染上报标志0否 1是（传染病是否上报的标志）
     *
     * @param infectReportFlag 传染上报标志0否 1是（传染病是否上报的标志）
     */
    public void setInfectReportFlag(String infectReportFlag) {
        this.infectReportFlag = infectReportFlag == null ? null : infectReportFlag.trim();
    }

    /**
     * 获取门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @return OUTPAT_DIAG_NAME - 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public String getOutpatDiagName() {
        return outpatDiagName;
    }

    /**
     * 设置门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @param outpatDiagName 门诊诊断名称（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public void setOutpatDiagName(String outpatDiagName) {
        this.outpatDiagName = outpatDiagName == null ? null : outpatDiagName.trim();
    }

    /**
     * 获取门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return OUTPAT_DIAG_CODE - 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getOutpatDiagCode() {
        return outpatDiagCode;
    }

    /**
     * 设置门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param outpatDiagCode 门诊诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setOutpatDiagCode(String outpatDiagCode) {
        this.outpatDiagCode = outpatDiagCode == null ? null : outpatDiagCode.trim();
    }

    /**
     * 获取诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     *
     * @return DIAG_TYPE_CODE - 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    /**
     * 设置诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     *
     * @param diagTypeCode 诊断类型代码DIR_DISEASE_DIAG_TYPE（描述诊断类型在特定编码体系中的编码）
     */
    public void setDiagTypeCode(String diagTypeCode) {
        this.diagTypeCode = diagTypeCode == null ? null : diagTypeCode.trim();
    }

    /**
     * 获取诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     *
     * @return DIAG_BASIS_CODE - 诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    public String getDiagBasisCode() {
        return diagBasisCode;
    }

    /**
     * 设置诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     *
     * @param diagBasisCode 诊断依据代码DIR_DIAG_BASIS（患者最高诊断依据在特定编码体系中的代码）
     */
    public void setDiagBasisCode(String diagBasisCode) {
        this.diagBasisCode = diagBasisCode == null ? null : diagBasisCode.trim();
    }

    /**
     * 获取中医诊断类别编码CV05.02.21（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     *
     * @return CN_MED_DIA_CAT_CODE - 中医诊断类别编码CV05.02.21（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    public String getCnMedDiaCatCode() {
        return cnMedDiaCatCode;
    }

    /**
     * 设置中医诊断类别编码CV05.02.21（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     *
     * @param cnMedDiaCatCode 中医诊断类别编码CV05.02.21（标识诊断类别的代码;参照CV5502.21中医疾病诊断类别代码。可不对照字典。）
     */
    public void setCnMedDiaCatCode(String cnMedDiaCatCode) {
        this.cnMedDiaCatCode = cnMedDiaCatCode == null ? null : cnMedDiaCatCode.trim();
    }

    /**
     * 获取西医诊断类别编码CV05.02.20（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     *
     * @return WEST_DIA_CAT_CODE - 西医诊断类别编码CV05.02.20（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    public String getWestDiaCatCode() {
        return westDiaCatCode;
    }

    /**
     * 设置西医诊断类别编码CV05.02.20（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     *
     * @param westDiaCatCode 西医诊断类别编码CV05.02.20（西医诊断类别代码—标识诊断类别的代码；参照CV5502.20西医疾病诊断类别代码。可不对照字典。）
     */
    public void setWestDiaCatCode(String westDiaCatCode) {
        this.westDiaCatCode = westDiaCatCode == null ? null : westDiaCatCode.trim();
    }

    /**
     * 获取诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @return DIAG_DATE - 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public String getDiagDate() {
        return diagDate;
    }

    /**
     * 设置诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     *
     * @param diagDate 诊断日期（对患者所患疾病做出诊断时的公元纪年日期的完整描述）
     */
    public void setDiagDate(String diagDate) {
        this.diagDate = diagDate == null ? null : diagDate.trim();
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