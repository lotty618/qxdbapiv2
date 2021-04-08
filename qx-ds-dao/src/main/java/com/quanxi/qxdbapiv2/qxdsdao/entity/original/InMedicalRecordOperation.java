package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "IN_MEDICAL_RECORD_OPERATION")
public class InMedicalRecordOperation {
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
     * 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "OPER_FORM_NO")
    private String operFormNo;

    /**
     * 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    @Column(name = "CASE_TYPE_CODE")
    private String caseTypeCode;

    /**
     * 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    @Column(name = "CASE_TYPE_CN")
    private String caseTypeCn;

    /**
     * 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    @Column(name = "OPERATION_CN")
    private String operationCn;

    /**
     * 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_DATE")
    private String operationDate;

    /**
     * 手术级别代码CV05.10.024（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的代码）
     */
    @Column(name = "OPERATION_LEVEL_CODE")
    private String operationLevelCode;

    /**
     * 手术级别中文名称（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的中文名称）
     */
    @Column(name = "OPERATION_LEVEL_CN")
    private String operationLevelCn;

    /**
     * 手术操作人员（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SURGEON_NAME")
    private String surgeonName;

    /**
     * Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT1_NAME")
    private String assistant1Name;

    /**
     * Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT2_NAME")
    private String assistant2Name;

    /**
     * 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    @Column(name = "INCISION_TYPE_CODE")
    private String incisionTypeCode;

    /**
     * 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    @Column(name = "INCISION_TYPE_CN")
    private String incisionTypeCn;

    /**
     * 切口愈合等级代码CV05.10.023（手术切口愈合类别在特定编码体系中的代码）
     */
    @Column(name = "INCISION_HEALING_CODE")
    private String incisionHealingCode;

    /**
     * 切口愈合等级中文名称（手术切口愈合类别在特定编码体系中的中文名称）
     */
    @Column(name = "INCISION_HEALING_CN")
    private String incisionHealingCn;

    /**
     * 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 麻醉医师：姓名（对患者实施麻醉的医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHESIOLOGIST_NAME")
    private String anesthesiologistName;

    /**
     * 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    @Column(name = "BODY_PART_CODE")
    private String bodyPartCode;

    /**
     * 手术部位名称（实施手术的人体部位名称）
     */
    @Column(name = "BODY_PART_NAME")
    private String bodyPartName;

    /**
     * 手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     */
    @Column(name = "OPER_DURATION")
    private BigDecimal operDuration;

    /**
     * 麻醉分级代码CV05.10.021（麻醉分级代码在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_LEVEL_CODE")
    private String anesthesiaLevelCode;

    /**
     * 麻醉分级中文名称（麻醉分级代码在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_LEVEL_CN")
    private String anesthesiaLevelCn;

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
     * 获取所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
    }

    /**
     * 获取手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return OPER_FORM_NO - 手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getOperFormNo() {
        return operFormNo;
    }

    /**
     * 设置手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param operFormNo 手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setOperFormNo(String operFormNo) {
        this.operFormNo = operFormNo == null ? null : operFormNo.trim();
    }

    /**
     * 获取病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     *
     * @return CASE_TYPE_CODE - 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    public String getCaseTypeCode() {
        return caseTypeCode;
    }

    /**
     * 设置病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     *
     * @param caseTypeCode 病案首页类型代码DIR_CASE_TYPE_CODE（病案类型在特定编码体系中的代码）
     */
    public void setCaseTypeCode(String caseTypeCode) {
        this.caseTypeCode = caseTypeCode == null ? null : caseTypeCode.trim();
    }

    /**
     * 获取病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     *
     * @return CASE_TYPE_CN - 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    public String getCaseTypeCn() {
        return caseTypeCn;
    }

    /**
     * 设置病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     *
     * @param caseTypeCn 病案首页类型中文名称（病案类型在特定编码体系中的中文名称）
     */
    public void setCaseTypeCn(String caseTypeCn) {
        this.caseTypeCn = caseTypeCn == null ? null : caseTypeCn.trim();
    }

    /**
     * 获取手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     *
     * @return OPERATION_CN - 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    public String getOperationCn() {
        return operationCn;
    }

    /**
     * 设置手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     *
     * @param operationCn 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    public void setOperationCn(String operationCn) {
        this.operationCn = operationCn == null ? null : operationCn.trim();
    }

    /**
     * 获取手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_DATE - 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * 设置手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationDate 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * 获取手术级别代码CV05.10.024（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的代码）
     *
     * @return OPERATION_LEVEL_CODE - 手术级别代码CV05.10.024（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的代码）
     */
    public String getOperationLevelCode() {
        return operationLevelCode;
    }

    /**
     * 设置手术级别代码CV05.10.024（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的代码）
     *
     * @param operationLevelCode 手术级别代码CV05.10.024（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的代码）
     */
    public void setOperationLevelCode(String operationLevelCode) {
        this.operationLevelCode = operationLevelCode == null ? null : operationLevelCode.trim();
    }

    /**
     * 获取手术级别中文名称（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的中文名称）
     *
     * @return OPERATION_LEVEL_CN - 手术级别中文名称（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的中文名称）
     */
    public String getOperationLevelCn() {
        return operationLevelCn;
    }

    /**
     * 设置手术级别中文名称（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的中文名称）
     *
     * @param operationLevelCn 手术级别中文名称（按照手术分级管理制度，根据风险性和难易程度不同划分的手术级别在特定编码体系中的中文名称）
     */
    public void setOperationLevelCn(String operationLevelCn) {
        this.operationLevelCn = operationLevelCn == null ? null : operationLevelCn.trim();
    }

    /**
     * 获取手术操作人员（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SURGEON_NAME - 手术操作人员（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * 设置手术操作人员（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param surgeonName 手术操作人员（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    /**
     * 获取Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT1_NAME - Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant1Name() {
        return assistant1Name;
    }

    /**
     * 设置Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant1Name Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant1Name(String assistant1Name) {
        this.assistant1Name = assistant1Name == null ? null : assistant1Name.trim();
    }

    /**
     * 获取Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT2_NAME - Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant2Name() {
        return assistant2Name;
    }

    /**
     * 设置Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant2Name Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant2Name(String assistant2Name) {
        this.assistant2Name = assistant2Name == null ? null : assistant2Name.trim();
    }

    /**
     * 获取手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     *
     * @return INCISION_TYPE_CODE - 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    public String getIncisionTypeCode() {
        return incisionTypeCode;
    }

    /**
     * 设置手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     *
     * @param incisionTypeCode 手术切口类别代码CV05.10.022（手术切口类别的分类在特定编码体系中的代码）
     */
    public void setIncisionTypeCode(String incisionTypeCode) {
        this.incisionTypeCode = incisionTypeCode == null ? null : incisionTypeCode.trim();
    }

    /**
     * 获取手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     *
     * @return INCISION_TYPE_CN - 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    public String getIncisionTypeCn() {
        return incisionTypeCn;
    }

    /**
     * 设置手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     *
     * @param incisionTypeCn 手术切口类别中文名称（手术切口类别的分类在特定编码体系中的中文名称）
     */
    public void setIncisionTypeCn(String incisionTypeCn) {
        this.incisionTypeCn = incisionTypeCn == null ? null : incisionTypeCn.trim();
    }

    /**
     * 获取切口愈合等级代码CV05.10.023（手术切口愈合类别在特定编码体系中的代码）
     *
     * @return INCISION_HEALING_CODE - 切口愈合等级代码CV05.10.023（手术切口愈合类别在特定编码体系中的代码）
     */
    public String getIncisionHealingCode() {
        return incisionHealingCode;
    }

    /**
     * 设置切口愈合等级代码CV05.10.023（手术切口愈合类别在特定编码体系中的代码）
     *
     * @param incisionHealingCode 切口愈合等级代码CV05.10.023（手术切口愈合类别在特定编码体系中的代码）
     */
    public void setIncisionHealingCode(String incisionHealingCode) {
        this.incisionHealingCode = incisionHealingCode == null ? null : incisionHealingCode.trim();
    }

    /**
     * 获取切口愈合等级中文名称（手术切口愈合类别在特定编码体系中的中文名称）
     *
     * @return INCISION_HEALING_CN - 切口愈合等级中文名称（手术切口愈合类别在特定编码体系中的中文名称）
     */
    public String getIncisionHealingCn() {
        return incisionHealingCn;
    }

    /**
     * 设置切口愈合等级中文名称（手术切口愈合类别在特定编码体系中的中文名称）
     *
     * @param incisionHealingCn 切口愈合等级中文名称（手术切口愈合类别在特定编码体系中的中文名称）
     */
    public void setIncisionHealingCn(String incisionHealingCn) {
        this.incisionHealingCn = incisionHealingCn == null ? null : incisionHealingCn.trim();
    }

    /**
     * 获取麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANESTHESIA_CODE - 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }

    /**
     * 设置麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesthesiaCode 麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode == null ? null : anesthesiaCode.trim();
    }

    /**
     * 获取麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_CN - 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaCn 麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取麻醉医师：姓名（对患者实施麻醉的医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANESTHESIOLOGIST_NAME - 麻醉医师：姓名（对患者实施麻醉的医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesthesiologistName() {
        return anesthesiologistName;
    }

    /**
     * 设置麻醉医师：姓名（对患者实施麻醉的医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesthesiologistName 麻醉医师：姓名（对患者实施麻醉的医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesthesiologistName(String anesthesiologistName) {
        this.anesthesiologistName = anesthesiologistName == null ? null : anesthesiologistName.trim();
    }

    /**
     * 获取手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @return BODY_PART_CODE - 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public String getBodyPartCode() {
        return bodyPartCode;
    }

    /**
     * 设置手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @param bodyPartCode 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public void setBodyPartCode(String bodyPartCode) {
        this.bodyPartCode = bodyPartCode == null ? null : bodyPartCode.trim();
    }

    /**
     * 获取手术部位名称（实施手术的人体部位名称）
     *
     * @return BODY_PART_NAME - 手术部位名称（实施手术的人体部位名称）
     */
    public String getBodyPartName() {
        return bodyPartName;
    }

    /**
     * 设置手术部位名称（实施手术的人体部位名称）
     *
     * @param bodyPartName 手术部位名称（实施手术的人体部位名称）
     */
    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName == null ? null : bodyPartName.trim();
    }

    /**
     * 获取手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     *
     * @return OPER_DURATION - 手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     */
    public BigDecimal getOperDuration() {
        return operDuration;
    }

    /**
     * 设置手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     *
     * @param operDuration 手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     */
    public void setOperDuration(BigDecimal operDuration) {
        this.operDuration = operDuration;
    }

    /**
     * 获取麻醉分级代码CV05.10.021（麻醉分级代码在特定编码体系中的代码）
     *
     * @return ANESTHESIA_LEVEL_CODE - 麻醉分级代码CV05.10.021（麻醉分级代码在特定编码体系中的代码）
     */
    public String getAnesthesiaLevelCode() {
        return anesthesiaLevelCode;
    }

    /**
     * 设置麻醉分级代码CV05.10.021（麻醉分级代码在特定编码体系中的代码）
     *
     * @param anesthesiaLevelCode 麻醉分级代码CV05.10.021（麻醉分级代码在特定编码体系中的代码）
     */
    public void setAnesthesiaLevelCode(String anesthesiaLevelCode) {
        this.anesthesiaLevelCode = anesthesiaLevelCode == null ? null : anesthesiaLevelCode.trim();
    }

    /**
     * 获取麻醉分级中文名称（麻醉分级代码在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_LEVEL_CN - 麻醉分级中文名称（麻醉分级代码在特定编码体系中的中文名称）
     */
    public String getAnesthesiaLevelCn() {
        return anesthesiaLevelCn;
    }

    /**
     * 设置麻醉分级中文名称（麻醉分级代码在特定编码体系中的中文名称）
     *
     * @param anesthesiaLevelCn 麻醉分级中文名称（麻醉分级代码在特定编码体系中的中文名称）
     */
    public void setAnesthesiaLevelCn(String anesthesiaLevelCn) {
        this.anesthesiaLevelCn = anesthesiaLevelCn == null ? null : anesthesiaLevelCn.trim();
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