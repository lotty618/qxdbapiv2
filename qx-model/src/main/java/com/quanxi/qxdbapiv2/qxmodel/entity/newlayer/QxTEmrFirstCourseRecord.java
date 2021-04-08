package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_FIRST_COURSE_RECORD")
public class QxTEmrFirstCourseRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 首次病程唯一标识
     */
    @Column(name = "EFCRUID")
    private String efcruid;

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
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_RECORD_DATE")
    private String operationRecordDate;

    /**
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    @Column(name = "CASE_CHARACTE")
    private String caseCharacte;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 诊疗计划（具体的检查、中西医治疗措施及中医调护）
     */
    @Column(name = "DIAG_TREAT_PLAN")
    private String diagTreatPlan;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PREINCIPLES")
    private String therapeuticPreinciples;

    /**
     * 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SUPERIOR_PHYSICIAN_NAME")
    private String superiorPhysicianName;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 拟诊断
     */
    @Column(name = "DIAGNOSIS_QUASI")
    private String diagnosisQuasi;

    /**
     * 鉴别诊断
     */
    @Column(name = "DIAGNOSIS_DISCEM")
    private String diagnosisDiscem;

    /**
     * 诊断依据（疾病诊断的依据描述）
     */
    @Column(name = "DIAGNOSIS_BASIS")
    private String diagnosisBasis;

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
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private byte[] emrContentParse;

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
     * @return EFCRUID - 首次病程唯一标识
     */
    public String getEfcruid() {
        return efcruid;
    }

    /**
     * 设置首次病程唯一标识
     *
     * @param efcruid 首次病程唯一标识
     */
    public void setEfcruid(String efcruid) {
        this.efcruid = efcruid == null ? null : efcruid.trim();
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
     * 获取病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     *
     * @return CASE_CHARACTE - 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    public String getCaseCharacte() {
        return caseCharacte;
    }

    /**
     * 设置病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     *
     * @param caseCharacte 病例特点（对病史、体格检查和辅助检查进行全面分析、归纳和整理后写出本病例特征,包括阳性发现和具有鉴别诊断意义的阴性症状和体征等）
     */
    public void setCaseCharacte(String caseCharacte) {
        this.caseCharacte = caseCharacte == null ? null : caseCharacte.trim();
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
     * 获取住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param residentDoctorName 住院医师签名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SUPERIOR_PHYSICIAN_NAME - 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSuperiorPhysicianName() {
        return superiorPhysicianName;
    }

    /**
     * 设置上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param superiorPhysicianName 上级医师签名（具有主治医师以上专业技术职务资格的主管医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSuperiorPhysicianName(String superiorPhysicianName) {
        this.superiorPhysicianName = superiorPhysicianName == null ? null : superiorPhysicianName.trim();
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
     * 获取拟诊断
     *
     * @return DIAGNOSIS_QUASI - 拟诊断
     */
    public String getDiagnosisQuasi() {
        return diagnosisQuasi;
    }

    /**
     * 设置拟诊断
     *
     * @param diagnosisQuasi 拟诊断
     */
    public void setDiagnosisQuasi(String diagnosisQuasi) {
        this.diagnosisQuasi = diagnosisQuasi == null ? null : diagnosisQuasi.trim();
    }

    /**
     * 获取鉴别诊断
     *
     * @return DIAGNOSIS_DISCEM - 鉴别诊断
     */
    public String getDiagnosisDiscem() {
        return diagnosisDiscem;
    }

    /**
     * 设置鉴别诊断
     *
     * @param diagnosisDiscem 鉴别诊断
     */
    public void setDiagnosisDiscem(String diagnosisDiscem) {
        this.diagnosisDiscem = diagnosisDiscem == null ? null : diagnosisDiscem.trim();
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

    /**
     * 获取病历分析
     *
     * @return EMR_CONTENT_PARSE - 病历分析
     */
    public byte[] getEmrContentParse() {
        return emrContentParse;
    }

    /**
     * 设置病历分析
     *
     * @param emrContentParse 病历分析
     */
    public void setEmrContentParse(byte[] emrContentParse) {
        this.emrContentParse = emrContentParse;
    }
}