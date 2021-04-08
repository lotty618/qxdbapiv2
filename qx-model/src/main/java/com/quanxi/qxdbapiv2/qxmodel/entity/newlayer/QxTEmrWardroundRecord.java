package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_WARDROUND_RECORD")
public class QxTEmrWardroundRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 查房记录唯一标识
     */
    @Column(name = "EWRUID")
    private String ewruid;

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
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    /**
     * 查房日期时间（开始查房时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "WARD_INSPECT_DATE")
    private String wardInspectDate;

    /**
     * 查房记录（对患者查房结果和诊疗相关意见的详细描述）
     */
    @Column(name = "WARD_INSPECT_RECORD")
    private String wardInspectRecord;

    /**
     * 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    @Column(name = "ORDER_CONTENT")
    private String orderContent;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    @Column(name = "SYNDROME_DIFFER_DESC")
    private String syndromeDifferDesc;

    /**
     * 中药煎煮方法（中药煎煮的方法的描述）
     */
    @Column(name = "TCM_DECOC_PIECE_METHOD")
    private String tcmDecocPieceMethod;

    /**
     * 中药用药方法（中药的用药方法的描述）
     */
    @Column(name = "TCM_USE_METHOD")
    private String tcmUseMethod;

    /**
     * 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    @Column(name = "DIAG_TREAT_PLAN")
    private String diagTreatPlan;

    /**
     * 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "WRITOR_SIGNATURE")
    private String writorSignature;

    /**
     * 主治医师签名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "IN_CHARGE_DOCTOR_NAME")
    private String inChargeDoctorName;

    /**
     * 主任医师签名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHIEF_DOCTOR_NAME")
    private String chiefDoctorName;

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
     * 获取查房记录唯一标识
     *
     * @return EWRUID - 查房记录唯一标识
     */
    public String getEwruid() {
        return ewruid;
    }

    /**
     * 设置查房记录唯一标识
     *
     * @param ewruid 查房记录唯一标识
     */
    public void setEwruid(String ewruid) {
        this.ewruid = ewruid == null ? null : ewruid.trim();
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
     * 获取查房日期时间（开始查房时的公元纪年日期和时间的完整描述）
     *
     * @return WARD_INSPECT_DATE - 查房日期时间（开始查房时的公元纪年日期和时间的完整描述）
     */
    public String getWardInspectDate() {
        return wardInspectDate;
    }

    /**
     * 设置查房日期时间（开始查房时的公元纪年日期和时间的完整描述）
     *
     * @param wardInspectDate 查房日期时间（开始查房时的公元纪年日期和时间的完整描述）
     */
    public void setWardInspectDate(String wardInspectDate) {
        this.wardInspectDate = wardInspectDate == null ? null : wardInspectDate.trim();
    }

    /**
     * 获取查房记录（对患者查房结果和诊疗相关意见的详细描述）
     *
     * @return WARD_INSPECT_RECORD - 查房记录（对患者查房结果和诊疗相关意见的详细描述）
     */
    public String getWardInspectRecord() {
        return wardInspectRecord;
    }

    /**
     * 设置查房记录（对患者查房结果和诊疗相关意见的详细描述）
     *
     * @param wardInspectRecord 查房记录（对患者查房结果和诊疗相关意见的详细描述）
     */
    public void setWardInspectRecord(String wardInspectRecord) {
        this.wardInspectRecord = wardInspectRecord == null ? null : wardInspectRecord.trim();
    }

    /**
     * 获取医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     *
     * @return ORDER_CONTENT - 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * 设置医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     *
     * @param orderContent 医嘱内容（医嘱内容的详细描述，中医依据《中药处方格式及书写规范》描述）
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
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
     * 获取辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     *
     * @return SYNDROME_DIFFER_DESC - 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    public String getSyndromeDifferDesc() {
        return syndromeDifferDesc;
    }

    /**
     * 设置辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     *
     * @param syndromeDifferDesc 辨证论治详细描述（对辨证分型的名称、主要依据和采用的治则治法的详细描述）
     */
    public void setSyndromeDifferDesc(String syndromeDifferDesc) {
        this.syndromeDifferDesc = syndromeDifferDesc == null ? null : syndromeDifferDesc.trim();
    }

    /**
     * 获取中药煎煮方法（中药煎煮的方法的描述）
     *
     * @return TCM_DECOC_PIECE_METHOD - 中药煎煮方法（中药煎煮的方法的描述）
     */
    public String getTcmDecocPieceMethod() {
        return tcmDecocPieceMethod;
    }

    /**
     * 设置中药煎煮方法（中药煎煮的方法的描述）
     *
     * @param tcmDecocPieceMethod 中药煎煮方法（中药煎煮的方法的描述）
     */
    public void setTcmDecocPieceMethod(String tcmDecocPieceMethod) {
        this.tcmDecocPieceMethod = tcmDecocPieceMethod == null ? null : tcmDecocPieceMethod.trim();
    }

    /**
     * 获取中药用药方法（中药的用药方法的描述）
     *
     * @return TCM_USE_METHOD - 中药用药方法（中药的用药方法的描述）
     */
    public String getTcmUseMethod() {
        return tcmUseMethod;
    }

    /**
     * 设置中药用药方法（中药的用药方法的描述）
     *
     * @param tcmUseMethod 中药用药方法（中药的用药方法的描述）
     */
    public void setTcmUseMethod(String tcmUseMethod) {
        this.tcmUseMethod = tcmUseMethod == null ? null : tcmUseMethod.trim();
    }

    /**
     * 获取诊疗计划（具体的检查、中西医治疗措施及中医调护）
     *
     * @return DIAG_TREAT_PLAN - 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    public String getDiagTreatPlan() {
        return diagTreatPlan;
    }

    /**
     * 设置诊疗计划（具体的检查、中西医治疗措施及中医调护）
     *
     * @param diagTreatPlan 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    public void setDiagTreatPlan(String diagTreatPlan) {
        this.diagTreatPlan = diagTreatPlan == null ? null : diagTreatPlan.trim();
    }

    /**
     * 获取记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return WRITOR_SIGNATURE - 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getWritorSignature() {
        return writorSignature;
    }

    /**
     * 设置记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param writorSignature 记录人签名（记录单填写者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setWritorSignature(String writorSignature) {
        this.writorSignature = writorSignature == null ? null : writorSignature.trim();
    }

    /**
     * 获取主治医师签名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return IN_CHARGE_DOCTOR_NAME - 主治医师签名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getInChargeDoctorName() {
        return inChargeDoctorName;
    }

    /**
     * 设置主治医师签名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param inChargeDoctorName 主治医师签名（患者出院时所在科室的具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setInChargeDoctorName(String inChargeDoctorName) {
        this.inChargeDoctorName = inChargeDoctorName == null ? null : inChargeDoctorName.trim();
    }

    /**
     * 获取主任医师签名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHIEF_DOCTOR_NAME - 主任医师签名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    /**
     * 设置主任医师签名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param chiefDoctorName 主任医师签名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
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