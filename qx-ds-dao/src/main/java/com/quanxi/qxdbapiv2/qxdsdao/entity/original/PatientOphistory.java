package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT_OPHISTORY")
public class PatientOphistory {
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
     * 个人手术史序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "OPHISTORY_ID")
    private String ophistoryId;

    /**
     * 手术（操作）代码ICD-9（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类代码）
     */
    @Column(name = "OPT_CODE")
    private String optCode;

    /**
     * 手术（操作）中文名称（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类中文名称）
     */
    @Column(name = "OPT_NAME")
    private String optName;

    /**
     * 手术（操作）日期（对本人实施手术操作时的公元纪年日期时间 ）
     */
    @Column(name = "OCCURED_TIME")
    private String occuredTime;

    /**
     * 手术记录表单号（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    @Column(name = "OPERATION_FORM_NO")
    private String operationFormNo;

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
     * 获取个人手术史序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return OPHISTORY_ID - 个人手术史序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getOphistoryId() {
        return ophistoryId;
    }

    /**
     * 设置个人手术史序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param ophistoryId 个人手术史序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setOphistoryId(String ophistoryId) {
        this.ophistoryId = ophistoryId == null ? null : ophistoryId.trim();
    }

    /**
     * 获取手术（操作）代码ICD-9（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类代码）
     *
     * @return OPT_CODE - 手术（操作）代码ICD-9（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类代码）
     */
    public String getOptCode() {
        return optCode;
    }

    /**
     * 设置手术（操作）代码ICD-9（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类代码）
     *
     * @param optCode 手术（操作）代码ICD-9（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类代码）
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode == null ? null : optCode.trim();
    }

    /**
     * 获取手术（操作）中文名称（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类中文名称）
     *
     * @return OPT_NAME - 手术（操作）中文名称（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类中文名称）
     */
    public String getOptName() {
        return optName;
    }

    /**
     * 设置手术（操作）中文名称（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类中文名称）
     *
     * @param optName 手术（操作）中文名称（按照《国际疾病分类：手术与操作ICD-9-CM-3》手术/操作的分类中文名称）
     */
    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    /**
     * 获取手术（操作）日期（对本人实施手术操作时的公元纪年日期时间 ）
     *
     * @return OCCURED_TIME - 手术（操作）日期（对本人实施手术操作时的公元纪年日期时间 ）
     */
    public String getOccuredTime() {
        return occuredTime;
    }

    /**
     * 设置手术（操作）日期（对本人实施手术操作时的公元纪年日期时间 ）
     *
     * @param occuredTime 手术（操作）日期（对本人实施手术操作时的公元纪年日期时间 ）
     */
    public void setOccuredTime(String occuredTime) {
        this.occuredTime = occuredTime == null ? null : occuredTime.trim();
    }

    /**
     * 获取手术记录表单号（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @return OPERATION_FORM_NO - 手术记录表单号（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public String getOperationFormNo() {
        return operationFormNo;
    }

    /**
     * 设置手术记录表单号（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @param operationFormNo 手术记录表单号（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public void setOperationFormNo(String operationFormNo) {
        this.operationFormNo = operationFormNo == null ? null : operationFormNo.trim();
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