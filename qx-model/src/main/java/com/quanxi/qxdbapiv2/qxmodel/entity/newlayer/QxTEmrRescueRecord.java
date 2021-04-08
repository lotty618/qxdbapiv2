package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_RESCUE_RECORD")
public class QxTEmrRescueRecord {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 抢救记录唯一标识
     */
    @Column(name = "EDRRUID")
    private String edrruid;

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
    private String operationCount;

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
    private String quantitiveResult;

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
     * 病历分析
     */
    @Column(name = "EMR_CONTENT_PARSE")
    private String emrContentParse;

    /**
     * 查体
     */
    @Column(name = "EXAMINATION")
    private String examination;

    /**
     * 抢救时间
     */
    @Column(name = "RESCUE_DATE")
    private String rescueDate;

    /**
     * 参与抢救人员
     */
    @Column(name = "DISCUSSION_LIST")
    private String discussionList;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 死亡时间
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 主治医生签名
     */
    @Column(name = "MAIN_DOCTOR")
    private String mainDoctor;

    /**
     * 主治医生签名时间
     */
    @Column(name = "MAIN_DOCTOR_DATE")
    private String mainDoctorDate;

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
     * 获取抢救记录唯一标识
     *
     * @return EDRRUID - 抢救记录唯一标识
     */
    public String getEdrruid() {
        return edrruid;
    }

    /**
     * 设置抢救记录唯一标识
     *
     * @param edrruid 抢救记录唯一标识
     */
    public void setEdrruid(String edrruid) {
        this.edrruid = edrruid == null ? null : edrruid.trim();
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
    public String getOperationCount() {
        return operationCount;
    }

    /**
     * 设置操作次数（实施操作的次数）
     *
     * @param operationCount 操作次数（实施操作的次数）
     */
    public void setOperationCount(String operationCount) {
        this.operationCount = operationCount == null ? null : operationCount.trim();
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
    public String getQuantitiveResult() {
        return quantitiveResult;
    }

    /**
     * 设置检查/检验定量结果（患者检查/检验结果的测量值（定量））
     *
     * @param quantitiveResult 检查/检验定量结果（患者检查/检验结果的测量值（定量））
     */
    public void setQuantitiveResult(String quantitiveResult) {
        this.quantitiveResult = quantitiveResult == null ? null : quantitiveResult.trim();
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
     * 获取查体
     *
     * @return EXAMINATION - 查体
     */
    public String getExamination() {
        return examination;
    }

    /**
     * 设置查体
     *
     * @param examination 查体
     */
    public void setExamination(String examination) {
        this.examination = examination == null ? null : examination.trim();
    }

    /**
     * 获取抢救时间
     *
     * @return RESCUE_DATE - 抢救时间
     */
    public String getRescueDate() {
        return rescueDate;
    }

    /**
     * 设置抢救时间
     *
     * @param rescueDate 抢救时间
     */
    public void setRescueDate(String rescueDate) {
        this.rescueDate = rescueDate == null ? null : rescueDate.trim();
    }

    /**
     * 获取参与抢救人员
     *
     * @return DISCUSSION_LIST - 参与抢救人员
     */
    public String getDiscussionList() {
        return discussionList;
    }

    /**
     * 设置参与抢救人员
     *
     * @param discussionList 参与抢救人员
     */
    public void setDiscussionList(String discussionList) {
        this.discussionList = discussionList == null ? null : discussionList.trim();
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
     * 获取死亡时间
     *
     * @return DISCHARGE_DATE - 死亡时间
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置死亡时间
     *
     * @param dischargeDate 死亡时间
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取主治医生签名
     *
     * @return MAIN_DOCTOR - 主治医生签名
     */
    public String getMainDoctor() {
        return mainDoctor;
    }

    /**
     * 设置主治医生签名
     *
     * @param mainDoctor 主治医生签名
     */
    public void setMainDoctor(String mainDoctor) {
        this.mainDoctor = mainDoctor == null ? null : mainDoctor.trim();
    }

    /**
     * 获取主治医生签名时间
     *
     * @return MAIN_DOCTOR_DATE - 主治医生签名时间
     */
    public String getMainDoctorDate() {
        return mainDoctorDate;
    }

    /**
     * 设置主治医生签名时间
     *
     * @param mainDoctorDate 主治医生签名时间
     */
    public void setMainDoctorDate(String mainDoctorDate) {
        this.mainDoctorDate = mainDoctorDate == null ? null : mainDoctorDate.trim();
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