package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_MEDICAL_RECORD_OPERATION")
public class QxTMedicalRecordOperation {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 病案首页手术唯一标识
     */
    @Id
    @Column(name = "MROUID")
    private String mrouid;

    /**
     * 病案首页唯一标识
     */
    @Column(name = "MRPUID")
    private String mrpuid;

    /**
     * 手术记录唯一标识
     */
    @Column(name = "SRUID")
    private String sruid;

    /**
     * 手术科室标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 手术科室名称
     */
    @Column(name = "DEPT")
    private String dept;

    /**
     * 手术申请单号
     */
    @Column(name = "SURGERY_NO")
    private String surgeryNo;

    /**
     * 申请人
     */
    @Column(name = "APPLY")
    private String apply;

    /**
     * 申请人姓名
     */
    @Column(name = "APPLY_NAME")
    private String applyName;

    /**
     * 安排日期
     */
    @Column(name = "PLAN_DATE")
    private String planDate;

    /**
     * 手术日期
     */
    @Column(name = "SURGERY_DATE")
    private String surgeryDate;

    /**
     * 所属报告单号[主键]约束引用病案首页的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 手术记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
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
    private String operDuration;

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
     * 择期手术
     */
    @Column(name = "OTHER_DATE_OPER")
    private String otherDateOper;

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
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

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
     * 获取病案首页手术唯一标识
     *
     * @return MROUID - 病案首页手术唯一标识
     */
    public String getMrouid() {
        return mrouid;
    }

    /**
     * 设置病案首页手术唯一标识
     *
     * @param mrouid 病案首页手术唯一标识
     */
    public void setMrouid(String mrouid) {
        this.mrouid = mrouid == null ? null : mrouid.trim();
    }

    /**
     * 获取病案首页唯一标识
     *
     * @return MRPUID - 病案首页唯一标识
     */
    public String getMrpuid() {
        return mrpuid;
    }

    /**
     * 设置病案首页唯一标识
     *
     * @param mrpuid 病案首页唯一标识
     */
    public void setMrpuid(String mrpuid) {
        this.mrpuid = mrpuid == null ? null : mrpuid.trim();
    }

    /**
     * 获取手术记录唯一标识
     *
     * @return SRUID - 手术记录唯一标识
     */
    public String getSruid() {
        return sruid;
    }

    /**
     * 设置手术记录唯一标识
     *
     * @param sruid 手术记录唯一标识
     */
    public void setSruid(String sruid) {
        this.sruid = sruid == null ? null : sruid.trim();
    }

    /**
     * 获取手术科室标识
     *
     * @return DUID - 手术科室标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置手术科室标识
     *
     * @param duid 手术科室标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取手术科室名称
     *
     * @return DEPT - 手术科室名称
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置手术科室名称
     *
     * @param dept 手术科室名称
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * 获取手术申请单号
     *
     * @return SURGERY_NO - 手术申请单号
     */
    public String getSurgeryNo() {
        return surgeryNo;
    }

    /**
     * 设置手术申请单号
     *
     * @param surgeryNo 手术申请单号
     */
    public void setSurgeryNo(String surgeryNo) {
        this.surgeryNo = surgeryNo == null ? null : surgeryNo.trim();
    }

    /**
     * 获取申请人
     *
     * @return APPLY - 申请人
     */
    public String getApply() {
        return apply;
    }

    /**
     * 设置申请人
     *
     * @param apply 申请人
     */
    public void setApply(String apply) {
        this.apply = apply == null ? null : apply.trim();
    }

    /**
     * 获取申请人姓名
     *
     * @return APPLY_NAME - 申请人姓名
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * 设置申请人姓名
     *
     * @param applyName 申请人姓名
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    /**
     * 获取安排日期
     *
     * @return PLAN_DATE - 安排日期
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * 设置安排日期
     *
     * @param planDate 安排日期
     */
    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    /**
     * 获取手术日期
     *
     * @return SURGERY_DATE - 手术日期
     */
    public String getSurgeryDate() {
        return surgeryDate;
    }

    /**
     * 设置手术日期
     *
     * @param surgeryDate 手术日期
     */
    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate == null ? null : surgeryDate.trim();
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
    public String getOperDuration() {
        return operDuration;
    }

    /**
     * 设置手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     *
     * @param operDuration 手术持续时间（小时）（手术操作实际持续的时长，单位为小时）
     */
    public void setOperDuration(String operDuration) {
        this.operDuration = operDuration == null ? null : operDuration.trim();
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
     * 获取择期手术
     *
     * @return OTHER_DATE_OPER - 择期手术
     */
    public String getOtherDateOper() {
        return otherDateOper;
    }

    /**
     * 设置择期手术
     *
     * @param otherDateOper 择期手术
     */
    public void setOtherDateOper(String otherDateOper) {
        this.otherDateOper = otherDateOper == null ? null : otherDateOper.trim();
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
}