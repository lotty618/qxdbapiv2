package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_CHANGE_SHIFTS_RECORD")
public class QxTEmrChangeShiftsRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 交接班唯一标识
     */
    @Column(name = "ECSRUID")
    private String ecsruid;

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
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    /**
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PREINCIPLES")
    private String therapeuticPreinciples;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 目前情况（对患者当前的情况的描述）
     */
    @Column(name = "CURRENT_SITUATION")
    private String currentSituation;

    /**
     * 注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 接班诊疗计划（接班后的诊疗计划，具体的检查、中西医治疗措施及中医调护）
     */
    @Column(name = "SUCCESSION_PLAN")
    private String successionPlan;

    /**
     * 交班日期时间（交班结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "HANDOVER_DATE")
    private String handoverDate;

    /**
     * 交班者签名（交班者在文书上签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "HANDOVER_OPERATOR")
    private String handoverOperator;

    /**
     * 接班日期时间（接班结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SUCCESSION_DATE")
    private String successionDate;

    /**
     * 接班者签名（接班者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SUCCESSION_OPERATOR")
    private String successionOperator;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

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
     * 获取交接班唯一标识
     *
     * @return ECSRUID - 交接班唯一标识
     */
    public String getEcsruid() {
        return ecsruid;
    }

    /**
     * 设置交接班唯一标识
     *
     * @param ecsruid 交接班唯一标识
     */
    public void setEcsruid(String ecsruid) {
        this.ecsruid = ecsruid == null ? null : ecsruid.trim();
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
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESC - 入院情况（对患者入院情况的详细描述）
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inConditionDesc 入院情况（对患者入院情况的详细描述）
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
    }

    /**
     * 获取主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @return CHIEF_COMPLAINTS - 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     *
     * @param chiefComplaints 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PREINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPreinciples() {
        return therapeuticPreinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPreinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPreinciples(String therapeuticPreinciples) {
        this.therapeuticPreinciples = therapeuticPreinciples == null ? null : therapeuticPreinciples.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取目前情况（对患者当前的情况的描述）
     *
     * @return CURRENT_SITUATION - 目前情况（对患者当前的情况的描述）
     */
    public String getCurrentSituation() {
        return currentSituation;
    }

    /**
     * 设置目前情况（对患者当前的情况的描述）
     *
     * @param currentSituation 目前情况（对患者当前的情况的描述）
     */
    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation == null ? null : currentSituation.trim();
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
     * 获取接班诊疗计划（接班后的诊疗计划，具体的检查、中西医治疗措施及中医调护）
     *
     * @return SUCCESSION_PLAN - 接班诊疗计划（接班后的诊疗计划，具体的检查、中西医治疗措施及中医调护）
     */
    public String getSuccessionPlan() {
        return successionPlan;
    }

    /**
     * 设置接班诊疗计划（接班后的诊疗计划，具体的检查、中西医治疗措施及中医调护）
     *
     * @param successionPlan 接班诊疗计划（接班后的诊疗计划，具体的检查、中西医治疗措施及中医调护）
     */
    public void setSuccessionPlan(String successionPlan) {
        this.successionPlan = successionPlan == null ? null : successionPlan.trim();
    }

    /**
     * 获取交班日期时间（交班结束时的公元纪年日期和时间的完整描述）
     *
     * @return HANDOVER_DATE - 交班日期时间（交班结束时的公元纪年日期和时间的完整描述）
     */
    public String getHandoverDate() {
        return handoverDate;
    }

    /**
     * 设置交班日期时间（交班结束时的公元纪年日期和时间的完整描述）
     *
     * @param handoverDate 交班日期时间（交班结束时的公元纪年日期和时间的完整描述）
     */
    public void setHandoverDate(String handoverDate) {
        this.handoverDate = handoverDate == null ? null : handoverDate.trim();
    }

    /**
     * 获取交班者签名（交班者在文书上签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return HANDOVER_OPERATOR - 交班者签名（交班者在文书上签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getHandoverOperator() {
        return handoverOperator;
    }

    /**
     * 设置交班者签名（交班者在文书上签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param handoverOperator 交班者签名（交班者在文书上签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setHandoverOperator(String handoverOperator) {
        this.handoverOperator = handoverOperator == null ? null : handoverOperator.trim();
    }

    /**
     * 获取接班日期时间（接班结束时的公元纪年日期和时间的完整描述）
     *
     * @return SUCCESSION_DATE - 接班日期时间（接班结束时的公元纪年日期和时间的完整描述）
     */
    public String getSuccessionDate() {
        return successionDate;
    }

    /**
     * 设置接班日期时间（接班结束时的公元纪年日期和时间的完整描述）
     *
     * @param successionDate 接班日期时间（接班结束时的公元纪年日期和时间的完整描述）
     */
    public void setSuccessionDate(String successionDate) {
        this.successionDate = successionDate == null ? null : successionDate.trim();
    }

    /**
     * 获取接班者签名（接班者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SUCCESSION_OPERATOR - 接班者签名（接班者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSuccessionOperator() {
        return successionOperator;
    }

    /**
     * 设置接班者签名（接班者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param successionOperator 接班者签名（接班者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSuccessionOperator(String successionOperator) {
        this.successionOperator = successionOperator == null ? null : successionOperator.trim();
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