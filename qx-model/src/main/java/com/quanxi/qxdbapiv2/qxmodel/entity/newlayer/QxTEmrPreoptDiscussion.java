package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_PREOPT_DISCUSSION")
public class QxTEmrPreoptDiscussion {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 术前讨论唯一标识
     */
    @Column(name = "EPDUID")
    private String epduid;

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
     * 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCUSSION_DATE")
    private String discussionDate;

    /**
     * 讨论地点（患者诊疗相关讨论的地点）
     */
    @Column(name = "DISCUSSION_LOCALTION")
    private String discussionLocaltion;

    /**
     * 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "HOST_NAME")
    private String hostName;

    /**
     * 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    @Column(name = "DISCUSSION_LIST")
    private String discussionList;

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
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

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
     * 手术指征（患者具备的、适宜实施手术的主要症状和体征描述）
     */
    @Column(name = "OPERATION_INDICATION")
    private String operationIndication;

    /**
     * 手术方案（手术方案的详细描述）
     */
    @Column(name = "OPERATION_PLAN")
    private String operationPlan;

    /**
     * 注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 讨论意见（疑难病历讨论过程中的具体讨论意见的详细描述）
     */
    @Column(name = "DISCUSS_IDEA")
    private String discussIdea;

    /**
     * 讨论结论（术前讨论结论性意见的详细描述）
     */
    @Column(name = "DISCUSS_CONCLUSION")
    private String discussConclusion;

    /**
     * 手术者签名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPERATOR_SIGNATURE")
    private String operatorSignature;

    /**
     * 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHETIC_DOCTOR")
    private String anestheticDoctor;

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
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    /**
     * 异常临床表现
     */
    @Column(name = "CHARACTERISTICS_ABNORMAL")
    private String characteristicsAbnormal;

    /**
     * 正常临床表现
     */
    @Column(name = "CHARACTERISTICS_NORMAL")
    private String characteristicsNormal;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 讨论内容
     */
    @Column(name = "DISCUSS_CONTENT")
    private String discussContent;

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

    @Column(name = "EMR_CONTENT_TEXT")
    private String emrContentText;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

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
     * 获取术前讨论唯一标识
     *
     * @return EPDUID - 术前讨论唯一标识
     */
    public String getEpduid() {
        return epduid;
    }

    /**
     * 设置术前讨论唯一标识
     *
     * @param epduid 术前讨论唯一标识
     */
    public void setEpduid(String epduid) {
        this.epduid = epduid == null ? null : epduid.trim();
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
     * 获取讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     *
     * @return DISCUSSION_DATE - 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    public String getDiscussionDate() {
        return discussionDate;
    }

    /**
     * 设置讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     *
     * @param discussionDate 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    public void setDiscussionDate(String discussionDate) {
        this.discussionDate = discussionDate == null ? null : discussionDate.trim();
    }

    /**
     * 获取讨论地点（患者诊疗相关讨论的地点）
     *
     * @return DISCUSSION_LOCALTION - 讨论地点（患者诊疗相关讨论的地点）
     */
    public String getDiscussionLocaltion() {
        return discussionLocaltion;
    }

    /**
     * 设置讨论地点（患者诊疗相关讨论的地点）
     *
     * @param discussionLocaltion 讨论地点（患者诊疗相关讨论的地点）
     */
    public void setDiscussionLocaltion(String discussionLocaltion) {
        this.discussionLocaltion = discussionLocaltion == null ? null : discussionLocaltion.trim();
    }

    /**
     * 获取主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return HOST_NAME - 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * 设置主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param hostName 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * 获取参加讨论人员名单（参加术前讨论的人员姓名列表）
     *
     * @return DISCUSSION_LIST - 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    public String getDiscussionList() {
        return discussionList;
    }

    /**
     * 设置参加讨论人员名单（参加术前讨论的人员姓名列表）
     *
     * @param discussionList 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    public void setDiscussionList(String discussionList) {
        this.discussionList = discussionList == null ? null : discussionList.trim();
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
     * 获取入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return IN_DATE - 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * 设置入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param inDate 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
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
     * 获取手术方案（手术方案的详细描述）
     *
     * @return OPERATION_PLAN - 手术方案（手术方案的详细描述）
     */
    public String getOperationPlan() {
        return operationPlan;
    }

    /**
     * 设置手术方案（手术方案的详细描述）
     *
     * @param operationPlan 手术方案（手术方案的详细描述）
     */
    public void setOperationPlan(String operationPlan) {
        this.operationPlan = operationPlan == null ? null : operationPlan.trim();
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
     * 获取讨论意见（疑难病历讨论过程中的具体讨论意见的详细描述）
     *
     * @return DISCUSS_IDEA - 讨论意见（疑难病历讨论过程中的具体讨论意见的详细描述）
     */
    public String getDiscussIdea() {
        return discussIdea;
    }

    /**
     * 设置讨论意见（疑难病历讨论过程中的具体讨论意见的详细描述）
     *
     * @param discussIdea 讨论意见（疑难病历讨论过程中的具体讨论意见的详细描述）
     */
    public void setDiscussIdea(String discussIdea) {
        this.discussIdea = discussIdea == null ? null : discussIdea.trim();
    }

    /**
     * 获取讨论结论（术前讨论结论性意见的详细描述）
     *
     * @return DISCUSS_CONCLUSION - 讨论结论（术前讨论结论性意见的详细描述）
     */
    public String getDiscussConclusion() {
        return discussConclusion;
    }

    /**
     * 设置讨论结论（术前讨论结论性意见的详细描述）
     *
     * @param discussConclusion 讨论结论（术前讨论结论性意见的详细描述）
     */
    public void setDiscussConclusion(String discussConclusion) {
        this.discussConclusion = discussConclusion == null ? null : discussConclusion.trim();
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
     * 获取麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANESTHETIC_DOCTOR - 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnestheticDoctor() {
        return anestheticDoctor;
    }

    /**
     * 设置麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anestheticDoctor 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnestheticDoctor(String anestheticDoctor) {
        this.anestheticDoctor = anestheticDoctor == null ? null : anestheticDoctor.trim();
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
     * 获取异常临床表现
     *
     * @return CHARACTERISTICS_ABNORMAL - 异常临床表现
     */
    public String getCharacteristicsAbnormal() {
        return characteristicsAbnormal;
    }

    /**
     * 设置异常临床表现
     *
     * @param characteristicsAbnormal 异常临床表现
     */
    public void setCharacteristicsAbnormal(String characteristicsAbnormal) {
        this.characteristicsAbnormal = characteristicsAbnormal == null ? null : characteristicsAbnormal.trim();
    }

    /**
     * 获取正常临床表现
     *
     * @return CHARACTERISTICS_NORMAL - 正常临床表现
     */
    public String getCharacteristicsNormal() {
        return characteristicsNormal;
    }

    /**
     * 设置正常临床表现
     *
     * @param characteristicsNormal 正常临床表现
     */
    public void setCharacteristicsNormal(String characteristicsNormal) {
        this.characteristicsNormal = characteristicsNormal == null ? null : characteristicsNormal.trim();
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
     * 获取讨论内容
     *
     * @return DISCUSS_CONTENT - 讨论内容
     */
    public String getDiscussContent() {
        return discussContent;
    }

    /**
     * 设置讨论内容
     *
     * @param discussContent 讨论内容
     */
    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent == null ? null : discussContent.trim();
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

    /**
     * @return EMR_CONTENT_TEXT
     */
    public String getEmrContentText() {
        return emrContentText;
    }

    /**
     * @param emrContentText
     */
    public void setEmrContentText(String emrContentText) {
        this.emrContentText = emrContentText == null ? null : emrContentText.trim();
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
}