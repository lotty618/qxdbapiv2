package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_POSTOPT_COURSE_RECORD")
public class QxTEmrPostoptCourseRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 术后首次病程唯一标识
     */
    @Column(name = "EPCRUID")
    private String epcruid;

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
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_RECORD_DATE")
    private String operationRecordDate;

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
     * 操作目标部位代码CV06.00.227（对患者开始实施手术操作的部位的代码）
     */
    @Column(name = "OPERATION_PART_CODE")
    private String operationPartCode;

    /**
     * 操作目标部位名称（对患者开始实施手术操作的部位的名称）
     */
    @Column(name = "OPERATION_PART_NAME")
    private String operationPartName;

    /**
     * 实施手术及操作日期时间（对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_DATE")
    private String operationDate;

    /**
     * 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANES_WAY_CODE")
    private String anesWayCode;

    /**
     * 实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    @Column(name = "ANES_WAY_NAME")
    private String anesWayName;

    /**
     * 手术过程（手术过程的详细描述）
     */
    @Column(name = "OPERATION_DESC")
    private String operationDesc;

    /**
     * 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    @Column(name = "OP_POST_DIAG_CODE")
    private String opPostDiagCode;

    /**
     * 术后诊断名称（在对患者进行手术操作后做出的西医诊断名称）
     */
    @Column(name = "OP_POST_DIAG_NAME")
    private String opPostDiagName;

    /**
     * 诊断依据（疾病诊断的依据描述）
     */
    @Column(name = "DIAGNOSIS_BASIS")
    private String diagnosisBasis;

    /**
     * 注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "OPERATON_NOTE")
    private String operatonNote;

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
     * 手术方式
     */
    @Column(name = "OP_MODE")
    private String opMode;

    /**
     * 术前诊断
     */
    @Column(name = "OP_BEFORE_DIAG_NAME")
    private String opBeforeDiagName;

    /**
     * 术中诊断
     */
    @Column(name = "OP_IN_DIAG_NAME")
    private String opInDiagName;

    /**
     * 手术措施
     */
    @Column(name = "OP_TREATMENT")
    private String opTreatment;

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
     * 获取术后首次病程唯一标识
     *
     * @return EPCRUID - 术后首次病程唯一标识
     */
    public String getEpcruid() {
        return epcruid;
    }

    /**
     * 设置术后首次病程唯一标识
     *
     * @param epcruid 术后首次病程唯一标识
     */
    public void setEpcruid(String epcruid) {
        this.epcruid = epcruid == null ? null : epcruid.trim();
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
     * 获取操作目标部位代码CV06.00.227（对患者开始实施手术操作的部位的代码）
     *
     * @return OPERATION_PART_CODE - 操作目标部位代码CV06.00.227（对患者开始实施手术操作的部位的代码）
     */
    public String getOperationPartCode() {
        return operationPartCode;
    }

    /**
     * 设置操作目标部位代码CV06.00.227（对患者开始实施手术操作的部位的代码）
     *
     * @param operationPartCode 操作目标部位代码CV06.00.227（对患者开始实施手术操作的部位的代码）
     */
    public void setOperationPartCode(String operationPartCode) {
        this.operationPartCode = operationPartCode == null ? null : operationPartCode.trim();
    }

    /**
     * 获取操作目标部位名称（对患者开始实施手术操作的部位的名称）
     *
     * @return OPERATION_PART_NAME - 操作目标部位名称（对患者开始实施手术操作的部位的名称）
     */
    public String getOperationPartName() {
        return operationPartName;
    }

    /**
     * 设置操作目标部位名称（对患者开始实施手术操作的部位的名称）
     *
     * @param operationPartName 操作目标部位名称（对患者开始实施手术操作的部位的名称）
     */
    public void setOperationPartName(String operationPartName) {
        this.operationPartName = operationPartName == null ? null : operationPartName.trim();
    }

    /**
     * 获取实施手术及操作日期时间（对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_DATE - 实施手术及操作日期时间（对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * 设置实施手术及操作日期时间（对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     *
     * @param operationDate 实施手术及操作日期时间（对患者开始实施手术操作的公元纪年日期和时间的完整描述）
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * 获取实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANES_WAY_CODE - 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesWayCode() {
        return anesWayCode;
    }

    /**
     * 设置实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesWayCode 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesWayCode(String anesWayCode) {
        this.anesWayCode = anesWayCode == null ? null : anesWayCode.trim();
    }

    /**
     * 获取实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     *
     * @return ANES_WAY_NAME - 实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    public String getAnesWayName() {
        return anesWayName;
    }

    /**
     * 设置实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     *
     * @param anesWayName 实施麻醉方法名称（为患者进行手术、操作时拟使用的麻醉方法在特定编码体系中的名称）
     */
    public void setAnesWayName(String anesWayName) {
        this.anesWayName = anesWayName == null ? null : anesWayName.trim();
    }

    /**
     * 获取手术过程（手术过程的详细描述）
     *
     * @return OPERATION_DESC - 手术过程（手术过程的详细描述）
     */
    public String getOperationDesc() {
        return operationDesc;
    }

    /**
     * 设置手术过程（手术过程的详细描述）
     *
     * @param operationDesc 手术过程（手术过程的详细描述）
     */
    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc == null ? null : operationDesc.trim();
    }

    /**
     * 获取术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @return OP_POST_DIAG_CODE - 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public String getOpPostDiagCode() {
        return opPostDiagCode;
    }

    /**
     * 设置术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @param opPostDiagCode 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public void setOpPostDiagCode(String opPostDiagCode) {
        this.opPostDiagCode = opPostDiagCode == null ? null : opPostDiagCode.trim();
    }

    /**
     * 获取术后诊断名称（在对患者进行手术操作后做出的西医诊断名称）
     *
     * @return OP_POST_DIAG_NAME - 术后诊断名称（在对患者进行手术操作后做出的西医诊断名称）
     */
    public String getOpPostDiagName() {
        return opPostDiagName;
    }

    /**
     * 设置术后诊断名称（在对患者进行手术操作后做出的西医诊断名称）
     *
     * @param opPostDiagName 术后诊断名称（在对患者进行手术操作后做出的西医诊断名称）
     */
    public void setOpPostDiagName(String opPostDiagName) {
        this.opPostDiagName = opPostDiagName == null ? null : opPostDiagName.trim();
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
     * 获取注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @return OPERATON_NOTE - 注意事项（对可能出现问题及采取相应措施的描述）
     */
    public String getOperatonNote() {
        return operatonNote;
    }

    /**
     * 设置注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @param operatonNote 注意事项（对可能出现问题及采取相应措施的描述）
     */
    public void setOperatonNote(String operatonNote) {
        this.operatonNote = operatonNote == null ? null : operatonNote.trim();
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
     * 获取手术方式
     *
     * @return OP_MODE - 手术方式
     */
    public String getOpMode() {
        return opMode;
    }

    /**
     * 设置手术方式
     *
     * @param opMode 手术方式
     */
    public void setOpMode(String opMode) {
        this.opMode = opMode == null ? null : opMode.trim();
    }

    /**
     * 获取术前诊断
     *
     * @return OP_BEFORE_DIAG_NAME - 术前诊断
     */
    public String getOpBeforeDiagName() {
        return opBeforeDiagName;
    }

    /**
     * 设置术前诊断
     *
     * @param opBeforeDiagName 术前诊断
     */
    public void setOpBeforeDiagName(String opBeforeDiagName) {
        this.opBeforeDiagName = opBeforeDiagName == null ? null : opBeforeDiagName.trim();
    }

    /**
     * 获取术中诊断
     *
     * @return OP_IN_DIAG_NAME - 术中诊断
     */
    public String getOpInDiagName() {
        return opInDiagName;
    }

    /**
     * 设置术中诊断
     *
     * @param opInDiagName 术中诊断
     */
    public void setOpInDiagName(String opInDiagName) {
        this.opInDiagName = opInDiagName == null ? null : opInDiagName.trim();
    }

    /**
     * 获取手术措施
     *
     * @return OP_TREATMENT - 手术措施
     */
    public String getOpTreatment() {
        return opTreatment;
    }

    /**
     * 设置手术措施
     *
     * @param opTreatment 手术措施
     */
    public void setOpTreatment(String opTreatment) {
        this.opTreatment = opTreatment == null ? null : opTreatment.trim();
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