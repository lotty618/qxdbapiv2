package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_PREOPT_SUMMARY_INFO")
public class QxTEmrPreoptSummaryInfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 术前小结唯一标识
     */
    @Column(name = "EPSUID")
    private String epsuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 小结日期时间（记录小结完成的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SUMMARY_DATE")
    private String summaryDate;

    /**
     * 病历摘要（对患者病情摘要的描述）
     */
    @Column(name = "CASE_SUMMARY")
    private String caseSummary;

    /**
     * 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    @Column(name = "PRE_DIAGNOSIS_CODE")
    private String preDiagnosisCode;

    /**
     * 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    @Column(name = "PRE_DIAGNOSIS_NAME")
    private String preDiagnosisName;

    /**
     * 诊断依据（疾病诊断的依据描述）
     */
    @Column(name = "DIAGNOSIS_BASIS")
    private String diagnosisBasis;

    /**
     * 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    @Column(name = "ALLERGY_HISTORY_MARK")
    private String allergyHistoryMark;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 辅助检查结果（患者辅助检查、检验结果的详细描述）
     */
    @Column(name = "ASSIST_EXAM_RESULT")
    private String assistExamResult;

    /**
     * 手术适应证（手术适应证的详细描述）
     */
    @Column(name = "OPERATION_SYMP_INDICATION")
    private String operationSympIndication;

    /**
     * 手术禁忌症（拟实施手术的禁忌症的描述）
     */
    @Column(name = "SURGICAL_CONTRAINDICATION")
    private String surgicalContraindication;

    /**
     * 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    @Column(name = "OPERATION_INDICATION")
    private String operationIndication;

    /**
     * 会诊意见（由会诊医师填写患者会诊时的主要处置、指导意见的详细描述）
     */
    @Column(name = "CONSULT_ADVICE")
    private String consultAdvice;

    /**
     * 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "PLAN_OPERATION_CODE")
    private String planOperationCode;

    /**
     * 拟实施手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    @Column(name = "PLAN_OPERATION_NAME")
    private String planOperationName;

    /**
     * 拟操作目标部位名称（拟对患者开始实施手术操作的部位的名称）
     */
    @Column(name = "PLAN_OPERATION_PART_NAME")
    private String planOperationPartName;

    /**
     * 拟实施手术及操作日期时间（拟对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PLAN_OPERATION_DATE")
    private String planOperationDate;

    /**
     * 拟实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "PLAN_ANES_WAY_CODE")
    private String planAnesWayCode;

    /**
     * 拟实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    @Column(name = "PLAN_ANES_WAY_NAME")
    private String planAnesWayName;

    /**
     * 注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 手术要点（手术要点的详细描述）
     */
    @Column(name = "OPERATION_KEY")
    private String operationKey;

    /**
     * 术前准备（手术前准备工作的详细描述）
     */
    @Column(name = "OP_PRE_PREPARATION")
    private String opPrePreparation;

    /**
     * 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPERATOR_SIGNATURE")
    private String operatorSignature;

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
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    /**
     * 简要病情
     */
    @Column(name = "BRIEF_CONDITION")
    private String briefCondition;

    /**
     * 手术后可能出现的并发症及处理方法
     */
    @Column(name = "OP_COMPLICATION_PROCESS")
    private String opComplicationProcess;

    /**
     * 术中可能出现的问题及对策
     */
    @Column(name = "OP_QUESTION")
    private String opQuestion;

    /**
     * 拟参加手术人员
     */
    @Column(name = "PLAN_DISCUSSION_LIST")
    private String planDiscussionList;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 住院号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 科室
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 床号
     */
    @Column(name = "BED_NO")
    private String bedNo;

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
     * 获取术前小结唯一标识
     *
     * @return EPSUID - 术前小结唯一标识
     */
    public String getEpsuid() {
        return epsuid;
    }

    /**
     * 设置术前小结唯一标识
     *
     * @param epsuid 术前小结唯一标识
     */
    public void setEpsuid(String epsuid) {
        this.epsuid = epsuid == null ? null : epsuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取小结日期时间（记录小结完成的公元纪年日期和时间的完整描述）
     *
     * @return SUMMARY_DATE - 小结日期时间（记录小结完成的公元纪年日期和时间的完整描述）
     */
    public String getSummaryDate() {
        return summaryDate;
    }

    /**
     * 设置小结日期时间（记录小结完成的公元纪年日期和时间的完整描述）
     *
     * @param summaryDate 小结日期时间（记录小结完成的公元纪年日期和时间的完整描述）
     */
    public void setSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate == null ? null : summaryDate.trim();
    }

    /**
     * 获取病历摘要（对患者病情摘要的描述）
     *
     * @return CASE_SUMMARY - 病历摘要（对患者病情摘要的描述）
     */
    public String getCaseSummary() {
        return caseSummary;
    }

    /**
     * 设置病历摘要（对患者病情摘要的描述）
     *
     * @param caseSummary 病历摘要（对患者病情摘要的描述）
     */
    public void setCaseSummary(String caseSummary) {
        this.caseSummary = caseSummary == null ? null : caseSummary.trim();
    }

    /**
     * 获取术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @return PRE_DIAGNOSIS_CODE - 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public String getPreDiagnosisCode() {
        return preDiagnosisCode;
    }

    /**
     * 设置术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @param preDiagnosisCode 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public void setPreDiagnosisCode(String preDiagnosisCode) {
        this.preDiagnosisCode = preDiagnosisCode == null ? null : preDiagnosisCode.trim();
    }

    /**
     * 获取术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @return PRE_DIAGNOSIS_NAME - 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public String getPreDiagnosisName() {
        return preDiagnosisName;
    }

    /**
     * 设置术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @param preDiagnosisName 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public void setPreDiagnosisName(String preDiagnosisName) {
        this.preDiagnosisName = preDiagnosisName == null ? null : preDiagnosisName.trim();
    }

    /**
     * 获取诊断依据（疾病诊断的依据描述）
     *
     * @return DIAGNOSIS_BASIS - 诊断依据（疾病诊断的依据描述）
     */
    public String getDiagnosisBasis() {
        return diagnosisBasis;
    }

    /**
     * 设置诊断依据（疾病诊断的依据描述）
     *
     * @param diagnosisBasis 诊断依据（疾病诊断的依据描述）
     */
    public void setDiagnosisBasis(String diagnosisBasis) {
        this.diagnosisBasis = diagnosisBasis == null ? null : diagnosisBasis.trim();
    }

    /**
     * 获取过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @return ALLERGY_HISTORY_MARK - 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * 设置过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @param allergyHistoryMark 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark == null ? null : allergyHistoryMark.trim();
    }

    /**
     * 获取过敏史（患者既往发生过敏情况的详细描述）
     *
     * @return ALLERGY_HISTORY - 过敏史（患者既往发生过敏情况的详细描述）
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * 设置过敏史（患者既往发生过敏情况的详细描述）
     *
     * @param allergyHistory 过敏史（患者既往发生过敏情况的详细描述）
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    /**
     * 获取辅助检查结果（患者辅助检查、检验结果的详细描述）
     *
     * @return ASSIST_EXAM_RESULT - 辅助检查结果（患者辅助检查、检验结果的详细描述）
     */
    public String getAssistExamResult() {
        return assistExamResult;
    }

    /**
     * 设置辅助检查结果（患者辅助检查、检验结果的详细描述）
     *
     * @param assistExamResult 辅助检查结果（患者辅助检查、检验结果的详细描述）
     */
    public void setAssistExamResult(String assistExamResult) {
        this.assistExamResult = assistExamResult == null ? null : assistExamResult.trim();
    }

    /**
     * 获取手术适应证（手术适应证的详细描述）
     *
     * @return OPERATION_SYMP_INDICATION - 手术适应证（手术适应证的详细描述）
     */
    public String getOperationSympIndication() {
        return operationSympIndication;
    }

    /**
     * 设置手术适应证（手术适应证的详细描述）
     *
     * @param operationSympIndication 手术适应证（手术适应证的详细描述）
     */
    public void setOperationSympIndication(String operationSympIndication) {
        this.operationSympIndication = operationSympIndication == null ? null : operationSympIndication.trim();
    }

    /**
     * 获取手术禁忌症（拟实施手术的禁忌症的描述）
     *
     * @return SURGICAL_CONTRAINDICATION - 手术禁忌症（拟实施手术的禁忌症的描述）
     */
    public String getSurgicalContraindication() {
        return surgicalContraindication;
    }

    /**
     * 设置手术禁忌症（拟实施手术的禁忌症的描述）
     *
     * @param surgicalContraindication 手术禁忌症（拟实施手术的禁忌症的描述）
     */
    public void setSurgicalContraindication(String surgicalContraindication) {
        this.surgicalContraindication = surgicalContraindication == null ? null : surgicalContraindication.trim();
    }

    /**
     * 获取手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     *
     * @return OPERATION_INDICATION - 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    public String getOperationIndication() {
        return operationIndication;
    }

    /**
     * 设置手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     *
     * @param operationIndication 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    public void setOperationIndication(String operationIndication) {
        this.operationIndication = operationIndication == null ? null : operationIndication.trim();
    }

    /**
     * 获取会诊意见（由会诊医师填写患者会诊时的主要处置、指导意见的详细描述）
     *
     * @return CONSULT_ADVICE - 会诊意见（由会诊医师填写患者会诊时的主要处置、指导意见的详细描述）
     */
    public String getConsultAdvice() {
        return consultAdvice;
    }

    /**
     * 设置会诊意见（由会诊医师填写患者会诊时的主要处置、指导意见的详细描述）
     *
     * @param consultAdvice 会诊意见（由会诊医师填写患者会诊时的主要处置、指导意见的详细描述）
     */
    public void setConsultAdvice(String consultAdvice) {
        this.consultAdvice = consultAdvice == null ? null : consultAdvice.trim();
    }

    /**
     * 获取拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     *
     * @return PLAN_OPERATION_CODE - 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    public String getPlanOperationCode() {
        return planOperationCode;
    }

    /**
     * 设置拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     *
     * @param planOperationCode 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    public void setPlanOperationCode(String planOperationCode) {
        this.planOperationCode = planOperationCode == null ? null : planOperationCode.trim();
    }

    /**
     * 获取拟实施手术及操作名称（按照 ICD-9-CM-3 的名称）
     *
     * @return PLAN_OPERATION_NAME - 拟实施手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    public String getPlanOperationName() {
        return planOperationName;
    }

    /**
     * 设置拟实施手术及操作名称（按照 ICD-9-CM-3 的名称）
     *
     * @param planOperationName 拟实施手术及操作名称（按照 ICD-9-CM-3 的名称）
     */
    public void setPlanOperationName(String planOperationName) {
        this.planOperationName = planOperationName == null ? null : planOperationName.trim();
    }

    /**
     * 获取拟操作目标部位名称（拟对患者开始实施手术操作的部位的名称）
     *
     * @return PLAN_OPERATION_PART_NAME - 拟操作目标部位名称（拟对患者开始实施手术操作的部位的名称）
     */
    public String getPlanOperationPartName() {
        return planOperationPartName;
    }

    /**
     * 设置拟操作目标部位名称（拟对患者开始实施手术操作的部位的名称）
     *
     * @param planOperationPartName 拟操作目标部位名称（拟对患者开始实施手术操作的部位的名称）
     */
    public void setPlanOperationPartName(String planOperationPartName) {
        this.planOperationPartName = planOperationPartName == null ? null : planOperationPartName.trim();
    }

    /**
     * 获取拟实施手术及操作日期时间（拟对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     *
     * @return PLAN_OPERATION_DATE - 拟实施手术及操作日期时间（拟对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    public String getPlanOperationDate() {
        return planOperationDate;
    }

    /**
     * 设置拟实施手术及操作日期时间（拟对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     *
     * @param planOperationDate 拟实施手术及操作日期时间（拟对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    public void setPlanOperationDate(String planOperationDate) {
        this.planOperationDate = planOperationDate == null ? null : planOperationDate.trim();
    }

    /**
     * 获取拟实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     *
     * @return PLAN_ANES_WAY_CODE - 拟实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    public String getPlanAnesWayCode() {
        return planAnesWayCode;
    }

    /**
     * 设置拟实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     *
     * @param planAnesWayCode 拟实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    public void setPlanAnesWayCode(String planAnesWayCode) {
        this.planAnesWayCode = planAnesWayCode == null ? null : planAnesWayCode.trim();
    }

    /**
     * 获取拟实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     *
     * @return PLAN_ANES_WAY_NAME - 拟实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    public String getPlanAnesWayName() {
        return planAnesWayName;
    }

    /**
     * 设置拟实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     *
     * @param planAnesWayName 拟实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    public void setPlanAnesWayName(String planAnesWayName) {
        this.planAnesWayName = planAnesWayName == null ? null : planAnesWayName.trim();
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
     * 获取手术要点（手术要点的详细描述）
     *
     * @return OPERATION_KEY - 手术要点（手术要点的详细描述）
     */
    public String getOperationKey() {
        return operationKey;
    }

    /**
     * 设置手术要点（手术要点的详细描述）
     *
     * @param operationKey 手术要点（手术要点的详细描述）
     */
    public void setOperationKey(String operationKey) {
        this.operationKey = operationKey == null ? null : operationKey.trim();
    }

    /**
     * 获取术前准备（手术前准备工作的详细描述）
     *
     * @return OP_PRE_PREPARATION - 术前准备（手术前准备工作的详细描述）
     */
    public String getOpPrePreparation() {
        return opPrePreparation;
    }

    /**
     * 设置术前准备（手术前准备工作的详细描述）
     *
     * @param opPrePreparation 术前准备（手术前准备工作的详细描述）
     */
    public void setOpPrePreparation(String opPrePreparation) {
        this.opPrePreparation = opPrePreparation == null ? null : opPrePreparation.trim();
    }

    /**
     * 获取手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return OPERATOR_SIGNATURE - 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOperatorSignature() {
        return operatorSignature;
    }

    /**
     * 设置手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param operatorSignature 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOperatorSignature(String operatorSignature) {
        this.operatorSignature = operatorSignature == null ? null : operatorSignature.trim();
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
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
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
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
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
     * 获取病历分析
     *
     * @return EMR_CONTENT_PARSE - 病历分析
     */
    public String getEmrContentParse() {
        return emrContentParse;
    }

    /**
     * 设置病历分析
     *
     * @param emrContentParse 病历分析
     */
    public void setEmrContentParse(String emrContentParse) {
        this.emrContentParse = emrContentParse == null ? null : emrContentParse.trim();
    }

    /**
     * 获取简要病情
     *
     * @return BRIEF_CONDITION - 简要病情
     */
    public String getBriefCondition() {
        return briefCondition;
    }

    /**
     * 设置简要病情
     *
     * @param briefCondition 简要病情
     */
    public void setBriefCondition(String briefCondition) {
        this.briefCondition = briefCondition == null ? null : briefCondition.trim();
    }

    /**
     * 获取手术后可能出现的并发症及处理方法
     *
     * @return OP_COMPLICATION_PROCESS - 手术后可能出现的并发症及处理方法
     */
    public String getOpComplicationProcess() {
        return opComplicationProcess;
    }

    /**
     * 设置手术后可能出现的并发症及处理方法
     *
     * @param opComplicationProcess 手术后可能出现的并发症及处理方法
     */
    public void setOpComplicationProcess(String opComplicationProcess) {
        this.opComplicationProcess = opComplicationProcess == null ? null : opComplicationProcess.trim();
    }

    /**
     * 获取术中可能出现的问题及对策
     *
     * @return OP_QUESTION - 术中可能出现的问题及对策
     */
    public String getOpQuestion() {
        return opQuestion;
    }

    /**
     * 设置术中可能出现的问题及对策
     *
     * @param opQuestion 术中可能出现的问题及对策
     */
    public void setOpQuestion(String opQuestion) {
        this.opQuestion = opQuestion == null ? null : opQuestion.trim();
    }

    /**
     * 获取拟参加手术人员
     *
     * @return PLAN_DISCUSSION_LIST - 拟参加手术人员
     */
    public String getPlanDiscussionList() {
        return planDiscussionList;
    }

    /**
     * 设置拟参加手术人员
     *
     * @param planDiscussionList 拟参加手术人员
     */
    public void setPlanDiscussionList(String planDiscussionList) {
        this.planDiscussionList = planDiscussionList == null ? null : planDiscussionList.trim();
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取住院号
     *
     * @return INHOS_NO - 住院号
     */
    public String getInhosNo() {
        return inhosNo;
    }

    /**
     * 设置住院号
     *
     * @param inhosNo 住院号
     */
    public void setInhosNo(String inhosNo) {
        this.inhosNo = inhosNo == null ? null : inhosNo.trim();
    }

    /**
     * 获取科室
     *
     * @return DEPT_NAME - 科室
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室
     *
     * @param deptName 科室
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取床号
     *
     * @return BED_NO - 床号
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置床号
     *
     * @param bedNo 床号
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
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