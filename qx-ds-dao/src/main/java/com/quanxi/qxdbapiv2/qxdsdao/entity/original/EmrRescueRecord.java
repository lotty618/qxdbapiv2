package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_RESCUE_RECORD")
public class EmrRescueRecord {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
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
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "RESCUE_RECORD_ID")
    private String rescueRecordId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    /**
     * 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "DISEASE_DIAG_CODE")
    private String diseaseDiagCode;

    /**
     * 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "DISEASE_DIAG_NAME")
    private String diseaseDiagName;

    /**
     * 病情变化情况（对患者病情变化的详细描述）
     */
    @Column(name = "DISEASE_CHANGE_CONDITION")
    private String diseaseChangeCondition;

    /**
     * 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    @Column(name = "OPERATION_NAME")
    private String operationName;

    /**
     * 手术及操作目标部位名称（实施手术/操作的人体部位名称）
     */
    @Column(name = "OPERATION_PART_NAME")
    private String operationPartName;

    /**
     * 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    @Column(name = "INTERVENTION")
    private String intervention;

    /**
     * 操作方法（手术/操作方法的详细描述）
     */
    @Column(name = "OPERATION_METHOD")
    private String operationMethod;

    /**
     * 操作次数（实施操作的次数）
     */
    @Column(name = "OPERATION_COUNT")
    private Long operationCount;

    /**
     * 抢救开始日期时间（实施抢救的开始时间的公元纪年日期和时间的完整描述）
     */
    @Column(name = "RESCUE_START_DATE")
    private String rescueStartDate;

    /**
     * 抢救结束日期时间（实施抢救的结束时间的公元纪年日期和时间的完整描述）
     */
    @Column(name = "RESCUE_END_DATE")
    private String rescueEndDate;

    /**
     * 检查/检验项目名称（患者检查/检验项目的正式名称）
     */
    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 检查/检验结果（检验或检查的结果）
     */
    @Column(name = "RESULT_DESC")
    private String resultDesc;

    /**
     * 检查/检验定量结果（患者检查/检验结果的测量值（定量））
     */
    @Column(name = "QUANTITIVE_RESULT")
    private BigDecimal quantitiveResult;

    /**
     * 检查/检验结果代码DIR_EXAMINE_RESULT（患者检查/检验结果的分类代码）
     */
    @Column(name = "RESULT_CODE")
    private String resultCode;

    /**
     * 检查/检验结果名称（患者检查/检验结果的分类名称）
     */
    @Column(name = "RESULT_NAME")
    private String resultName;

    /**
     * 注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 参加抢救人员名单（所有参加抢救医务人员姓名列表）
     */
    @Column(name = "PARTICIPATORS")
    private String participators;

    /**
     * 专业技术职务类别代码CV08.30.005（医护人员专业技术职务分类在特定编码体系中的代码）
     */
    @Column(name = "TITLE_CODE")
    private String titleCode;

    /**
     * 专业技术职务类别名称（医护人员专业技术职务分类在特定编码体系中的名称）
     */
    @Column(name = "TITLE_NAME")
    private String titleName;

    /**
     * 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DOCTOR_SIGNATURE")
    private String doctorSignature;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

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
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "MODIFIER")
    private String modifier;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 病历模板类别代码（例如：11）
     */
    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    /**
     * 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    /**
     * 病历标题名称（例如：XX主任医师查房记录）
     */
    @Column(name = "EMR_TITLE")
    private String emrTitle;

    /**
     * 病历使用医院模板编号
     */
    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

    /**
     * 病历原文（医院病历的原始内容）CLOB类型
     */
    @Column(name = "EMR_CONTENT_CLOB")
    private String emrContentClob;

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
     * 获取患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
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
     * 获取住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return RESCUE_RECORD_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getRescueRecordId() {
        return rescueRecordId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param rescueRecordId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setRescueRecordId(String rescueRecordId) {
        this.rescueRecordId = rescueRecordId == null ? null : rescueRecordId.trim();
    }

    /**
     * 获取病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @return CASE_NO - 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @param caseNo 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @return IN_HOSPITAL_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @param inHospitalTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * 获取疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return DISEASE_DIAG_CODE - 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getDiseaseDiagCode() {
        return diseaseDiagCode;
    }

    /**
     * 设置疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param diseaseDiagCode 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setDiseaseDiagCode(String diseaseDiagCode) {
        this.diseaseDiagCode = diseaseDiagCode == null ? null : diseaseDiagCode.trim();
    }

    /**
     * 获取疾病诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return DISEASE_DIAG_NAME - 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getDiseaseDiagName() {
        return diseaseDiagName;
    }

    /**
     * 设置疾病诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param diseaseDiagName 疾病诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setDiseaseDiagName(String diseaseDiagName) {
        this.diseaseDiagName = diseaseDiagName == null ? null : diseaseDiagName.trim();
    }

    /**
     * 获取病情变化情况（对患者病情变化的详细描述）
     *
     * @return DISEASE_CHANGE_CONDITION - 病情变化情况（对患者病情变化的详细描述）
     */
    public String getDiseaseChangeCondition() {
        return diseaseChangeCondition;
    }

    /**
     * 设置病情变化情况（对患者病情变化的详细描述）
     *
     * @param diseaseChangeCondition 病情变化情况（对患者病情变化的详细描述）
     */
    public void setDiseaseChangeCondition(String diseaseChangeCondition) {
        this.diseaseChangeCondition = diseaseChangeCondition == null ? null : diseaseChangeCondition.trim();
    }

    /**
     * 获取手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取手术及操作名称（按照 ICD-9-CM-3 的名称）
     *
     * @return OPERATION_NAME - 手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置手术及操作名称（按照 ICD-9-CM-3 的名称）
     *
     * @param operationName 手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    /**
     * 获取手术及操作目标部位名称（实施手术/操作的人体部位名称）
     *
     * @return OPERATION_PART_NAME - 手术及操作目标部位名称（实施手术/操作的人体部位名称）
     */
    public String getOperationPartName() {
        return operationPartName;
    }

    /**
     * 设置手术及操作目标部位名称（实施手术/操作的人体部位名称）
     *
     * @param operationPartName 手术及操作目标部位名称（实施手术/操作的人体部位名称）
     */
    public void setOperationPartName(String operationPartName) {
        this.operationPartName = operationPartName == null ? null : operationPartName.trim();
    }

    /**
     * 获取介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     *
     * @return INTERVENTION - 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    public String getIntervention() {
        return intervention;
    }

    /**
     * 设置介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     *
     * @param intervention 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    public void setIntervention(String intervention) {
        this.intervention = intervention == null ? null : intervention.trim();
    }

    /**
     * 获取操作方法（手术/操作方法的详细描述）
     *
     * @return OPERATION_METHOD - 操作方法（手术/操作方法的详细描述）
     */
    public String getOperationMethod() {
        return operationMethod;
    }

    /**
     * 设置操作方法（手术/操作方法的详细描述）
     *
     * @param operationMethod 操作方法（手术/操作方法的详细描述）
     */
    public void setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod == null ? null : operationMethod.trim();
    }

    /**
     * 获取操作次数（实施操作的次数）
     *
     * @return OPERATION_COUNT - 操作次数（实施操作的次数）
     */
    public Long getOperationCount() {
        return operationCount;
    }

    /**
     * 设置操作次数（实施操作的次数）
     *
     * @param operationCount 操作次数（实施操作的次数）
     */
    public void setOperationCount(Long operationCount) {
        this.operationCount = operationCount;
    }

    /**
     * 获取抢救开始日期时间（实施抢救的开始时间的公元纪年日期和时间的完整描述）
     *
     * @return RESCUE_START_DATE - 抢救开始日期时间（实施抢救的开始时间的公元纪年日期和时间的完整描述）
     */
    public String getRescueStartDate() {
        return rescueStartDate;
    }

    /**
     * 设置抢救开始日期时间（实施抢救的开始时间的公元纪年日期和时间的完整描述）
     *
     * @param rescueStartDate 抢救开始日期时间（实施抢救的开始时间的公元纪年日期和时间的完整描述）
     */
    public void setRescueStartDate(String rescueStartDate) {
        this.rescueStartDate = rescueStartDate == null ? null : rescueStartDate.trim();
    }

    /**
     * 获取抢救结束日期时间（实施抢救的结束时间的公元纪年日期和时间的完整描述）
     *
     * @return RESCUE_END_DATE - 抢救结束日期时间（实施抢救的结束时间的公元纪年日期和时间的完整描述）
     */
    public String getRescueEndDate() {
        return rescueEndDate;
    }

    /**
     * 设置抢救结束日期时间（实施抢救的结束时间的公元纪年日期和时间的完整描述）
     *
     * @param rescueEndDate 抢救结束日期时间（实施抢救的结束时间的公元纪年日期和时间的完整描述）
     */
    public void setRescueEndDate(String rescueEndDate) {
        this.rescueEndDate = rescueEndDate == null ? null : rescueEndDate.trim();
    }

    /**
     * 获取检查/检验项目名称（患者检查/检验项目的正式名称）
     *
     * @return ITEM_NAME - 检查/检验项目名称（患者检查/检验项目的正式名称）
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置检查/检验项目名称（患者检查/检验项目的正式名称）
     *
     * @param itemName 检查/检验项目名称（患者检查/检验项目的正式名称）
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取检查/检验结果（检验或检查的结果）
     *
     * @return RESULT_DESC - 检查/检验结果（检验或检查的结果）
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * 设置检查/检验结果（检验或检查的结果）
     *
     * @param resultDesc 检查/检验结果（检验或检查的结果）
     */
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc == null ? null : resultDesc.trim();
    }

    /**
     * 获取检查/检验定量结果（患者检查/检验结果的测量值（定量））
     *
     * @return QUANTITIVE_RESULT - 检查/检验定量结果（患者检查/检验结果的测量值（定量））
     */
    public BigDecimal getQuantitiveResult() {
        return quantitiveResult;
    }

    /**
     * 设置检查/检验定量结果（患者检查/检验结果的测量值（定量））
     *
     * @param quantitiveResult 检查/检验定量结果（患者检查/检验结果的测量值（定量））
     */
    public void setQuantitiveResult(BigDecimal quantitiveResult) {
        this.quantitiveResult = quantitiveResult;
    }

    /**
     * 获取检查/检验结果代码DIR_EXAMINE_RESULT（患者检查/检验结果的分类代码）
     *
     * @return RESULT_CODE - 检查/检验结果代码DIR_EXAMINE_RESULT（患者检查/检验结果的分类代码）
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置检查/检验结果代码DIR_EXAMINE_RESULT（患者检查/检验结果的分类代码）
     *
     * @param resultCode 检查/检验结果代码DIR_EXAMINE_RESULT（患者检查/检验结果的分类代码）
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取检查/检验结果名称（患者检查/检验结果的分类名称）
     *
     * @return RESULT_NAME - 检查/检验结果名称（患者检查/检验结果的分类名称）
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * 设置检查/检验结果名称（患者检查/检验结果的分类名称）
     *
     * @param resultName 检查/检验结果名称（患者检查/检验结果的分类名称）
     */
    public void setResultName(String resultName) {
        this.resultName = resultName == null ? null : resultName.trim();
    }

    /**
     * 获取注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @return OPERATION_NOTE - 注意事项（对可能出现问题及采取相应措施的描述）
     */
    public String getOperationNote() {
        return operationNote;
    }

    /**
     * 设置注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @param operationNote 注意事项（对可能出现问题及采取相应措施的描述）
     */
    public void setOperationNote(String operationNote) {
        this.operationNote = operationNote == null ? null : operationNote.trim();
    }

    /**
     * 获取参加抢救人员名单（所有参加抢救医务人员姓名列表）
     *
     * @return PARTICIPATORS - 参加抢救人员名单（所有参加抢救医务人员姓名列表）
     */
    public String getParticipators() {
        return participators;
    }

    /**
     * 设置参加抢救人员名单（所有参加抢救医务人员姓名列表）
     *
     * @param participators 参加抢救人员名单（所有参加抢救医务人员姓名列表）
     */
    public void setParticipators(String participators) {
        this.participators = participators == null ? null : participators.trim();
    }

    /**
     * 获取专业技术职务类别代码CV08.30.005（医护人员专业技术职务分类在特定编码体系中的代码）
     *
     * @return TITLE_CODE - 专业技术职务类别代码CV08.30.005（医护人员专业技术职务分类在特定编码体系中的代码）
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * 设置专业技术职务类别代码CV08.30.005（医护人员专业技术职务分类在特定编码体系中的代码）
     *
     * @param titleCode 专业技术职务类别代码CV08.30.005（医护人员专业技术职务分类在特定编码体系中的代码）
     */
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode == null ? null : titleCode.trim();
    }

    /**
     * 获取专业技术职务类别名称（医护人员专业技术职务分类在特定编码体系中的名称）
     *
     * @return TITLE_NAME - 专业技术职务类别名称（医护人员专业技术职务分类在特定编码体系中的名称）
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 设置专业技术职务类别名称（医护人员专业技术职务分类在特定编码体系中的名称）
     *
     * @param titleName 专业技术职务类别名称（医护人员专业技术职务分类在特定编码体系中的名称）
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    /**
     * 获取医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DOCTOR_SIGNATURE - 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDoctorSignature() {
        return doctorSignature;
    }

    /**
     * 设置医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param doctorSignature 医师签名（医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDoctorSignature(String doctorSignature) {
        this.doctorSignature = doctorSignature == null ? null : doctorSignature.trim();
    }

    /**
     * 获取签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return SIGNATURE_DATE - 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getSignatureDate() {
        return signatureDate;
    }

    /**
     * 设置签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param signatureDate 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate == null ? null : signatureDate.trim();
    }

    /**
     * 获取备注（需要添加的注释说明的具体内容）
     *
     * @return NOTES - 备注（需要添加的注释说明的具体内容）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注（需要添加的注释说明的具体内容）
     *
     * @param notes 备注（需要添加的注释说明的具体内容）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
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
     * @return CREATOR - 录入人姓名（信息录入人姓名）
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param creator 录入人姓名（信息录入人姓名）
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return CREATE_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param createTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return MODIFIER - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param modifier 最后更新人姓名（信息最后更新人姓名）
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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
     * 获取病历模板类别代码（例如：11）
     *
     * @return TEMPLATE_TYPE - 病历模板类别代码（例如：11）
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置病历模板类别代码（例如：11）
     *
     * @param templateType 病历模板类别代码（例如：11）
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * 获取病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @return TEMPLATE_TYPE_CN - 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * 设置病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @param templateTypeCn 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * 获取病历标题名称（例如：XX主任医师查房记录）
     *
     * @return EMR_TITLE - 病历标题名称（例如：XX主任医师查房记录）
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * 设置病历标题名称（例如：XX主任医师查房记录）
     *
     * @param emrTitle 病历标题名称（例如：XX主任医师查房记录）
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * 获取病历使用医院模板编号
     *
     * @return EMR_TEMPLATE_CODE - 病历使用医院模板编号
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * 设置病历使用医院模板编号
     *
     * @param emrTemplateCode 病历使用医院模板编号
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
    }

    /**
     * 获取病历原文（医院病历的原始内容）
     *
     * @return EMR_CONTENT - 病历原文（医院病历的原始内容）
     */
    public byte[] getEmrContent() {
        return emrContent;
    }

    /**
     * 设置病历原文（医院病历的原始内容）
     *
     * @param emrContent 病历原文（医院病历的原始内容）
     */
    public void setEmrContent(byte[] emrContent) {
        this.emrContent = emrContent;
    }

    /**
     * 获取病历原文（医院病历的原始内容）CLOB类型
     *
     * @return EMR_CONTENT_CLOB - 病历原文（医院病历的原始内容）CLOB类型
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * 设置病历原文（医院病历的原始内容）CLOB类型
     *
     * @param emrContentClob 病历原文（医院病历的原始内容）CLOB类型
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}