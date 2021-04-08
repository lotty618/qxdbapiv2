package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_DAILY_COURSE_RECORD")
public class QxTEmrDailyCourseRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 首次病程唯一标识
     */
    @Column(name = "EDCRUID")
    private String edcruid;

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
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_RECORD_DATE")
    private String operationRecordDate;

    /**
     * 住院病程（住院病历中病程记录内容的详细描述）
     */
    @Column(name = "HOS_DURATION")
    private String hosDuration;

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
     * 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DOCTOR_SIGNATURE_DATE")
    private String doctorSignatureDate;

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
     * 获取首次病程唯一标识
     *
     * @return EDCRUID - 首次病程唯一标识
     */
    public String getEdcruid() {
        return edcruid;
    }

    /**
     * 设置首次病程唯一标识
     *
     * @param edcruid 首次病程唯一标识
     */
    public void setEdcruid(String edcruid) {
        this.edcruid = edcruid == null ? null : edcruid.trim();
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
     * 获取记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_RECORD_DATE - 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public String getOperationRecordDate() {
        return operationRecordDate;
    }

    /**
     * 设置记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @param operationRecordDate 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public void setOperationRecordDate(String operationRecordDate) {
        this.operationRecordDate = operationRecordDate == null ? null : operationRecordDate.trim();
    }

    /**
     * 获取住院病程（住院病历中病程记录内容的详细描述）
     *
     * @return HOS_DURATION - 住院病程（住院病历中病程记录内容的详细描述）
     */
    public String getHosDuration() {
        return hosDuration;
    }

    /**
     * 设置住院病程（住院病历中病程记录内容的详细描述）
     *
     * @param hosDuration 住院病程（住院病历中病程记录内容的详细描述）
     */
    public void setHosDuration(String hosDuration) {
        this.hosDuration = hosDuration == null ? null : hosDuration.trim();
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
     * 获取医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return DOCTOR_SIGNATURE_DATE - 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getDoctorSignatureDate() {
        return doctorSignatureDate;
    }

    /**
     * 设置医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param doctorSignatureDate 医师签名日期时间（医师进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setDoctorSignatureDate(String doctorSignatureDate) {
        this.doctorSignatureDate = doctorSignatureDate == null ? null : doctorSignatureDate.trim();
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