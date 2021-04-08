package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_DISCHARGE_RECORD_INFO")
public class QxTEmrDischargeRecordInfo {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 出院记录唯一标识
     */
    @Column(name = "EDRUID")
    private String edruid;

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
     * 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "IN_DISEASE_DIAG_CODE")
    private String inDiseaseDiagCode;

    /**
     * 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    @Column(name = "IN_DISEASE_DIAG_NAME")
    private String inDiseaseDiagName;

    /**
     * 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    @Column(name = "OUT_DATE")
    private String outDate;

    /**
     * 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    @Column(name = "OUT_DISEASE_DIAG_CODE")
    private String outDiseaseDiagCode;

    /**
     * 出院诊断 （患者所患疾病的西医诊断名称）
     */
    @Column(name = "OUT_DISEASE_DIAG_NAME")
    private String outDiseaseDiagName;

    /**
     * 出院情况 （对患者出院情况的详细描述 ）
     */
    @Column(name = "OUT_CONDITION_DESC")
    private String outConditionDesc;

    /**
     * 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    @Column(name = "POSITIVE_AUXI_EXAM_RESULT")
    private String positiveAuxiExamResult;

    /**
     * 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    @Column(name = "OUT_SYMPTOM")
    private String outSymptom;

    /**
     * 出院医嘱 （对患者出院医嘱的详细描述）
     */
    @Column(name = "OUT_ORDER")
    private String outOrder;

    /**
     * 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "HOSPITAL_DOCTOR_SIGNATURE")
    private String hospitalDoctorSignature;

    /**
     * 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "SUPERIOR_DOCTOR_SIGNATURE")
    private String superiorDoctorSignature;

    /**
     * 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

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
     * 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    @Column(name = "CHIEF_DOCTOR_SIGNATURE")
    private String chiefDoctorSignature;

    /**
     * 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "ATTENDING_DOCTOR_SIGNATURE")
    private String attendingDoctorSignature;

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
     * 地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 婚姻
     */
    @Column(name = "MARRIAGE")
    private String marriage;

    /**
     * 工作单位
     */
    @Column(name = "WORK_UNIT")
    private String workUnit;

    /**
     * 工作单位
     */
    @Column(name = "WORK")
    private String work;

    /**
     * 科室
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 床位号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

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
     * 获取出院记录唯一标识
     *
     * @return EDRUID - 出院记录唯一标识
     */
    public String getEdruid() {
        return edruid;
    }

    /**
     * 设置出院记录唯一标识
     *
     * @param edruid 出院记录唯一标识
     */
    public void setEdruid(String edruid) {
        this.edruid = edruid == null ? null : edruid.trim();
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
     * 获取入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return IN_DISEASE_DIAG_CODE - 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getInDiseaseDiagCode() {
        return inDiseaseDiagCode;
    }

    /**
     * 设置入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param inDiseaseDiagCode 入院诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setInDiseaseDiagCode(String inDiseaseDiagCode) {
        this.inDiseaseDiagCode = inDiseaseDiagCode == null ? null : inDiseaseDiagCode.trim();
    }

    /**
     * 获取入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @return IN_DISEASE_DIAG_NAME - 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public String getInDiseaseDiagName() {
        return inDiseaseDiagName;
    }

    /**
     * 设置入院诊断名称（患者所患疾病的西医诊断名称）
     *
     * @param inDiseaseDiagName 入院诊断名称（患者所患疾病的西医诊断名称）
     */
    public void setInDiseaseDiagName(String inDiseaseDiagName) {
        this.inDiseaseDiagName = inDiseaseDiagName == null ? null : inDiseaseDiagName.trim();
    }

    /**
     * 获取出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     *
     * @return OUT_DATE - 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    public String getOutDate() {
        return outDate;
    }

    /**
     * 设置出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     *
     * @param outDate 出院日期时间 （患者出院的公元纪年日期的完整描述 ）
     */
    public void setOutDate(String outDate) {
        this.outDate = outDate == null ? null : outDate.trim();
    }

    /**
     * 获取出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     *
     * @return OUT_DISEASE_DIAG_CODE - 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    public String getOutDiseaseDiagCode() {
        return outDiseaseDiagCode;
    }

    /**
     * 设置出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     *
     * @param outDiseaseDiagCode 出院诊断代码 ICD-10（对患者出院诊断在特定编码体系中的编码 ）
     */
    public void setOutDiseaseDiagCode(String outDiseaseDiagCode) {
        this.outDiseaseDiagCode = outDiseaseDiagCode == null ? null : outDiseaseDiagCode.trim();
    }

    /**
     * 获取出院诊断 （患者所患疾病的西医诊断名称）
     *
     * @return OUT_DISEASE_DIAG_NAME - 出院诊断 （患者所患疾病的西医诊断名称）
     */
    public String getOutDiseaseDiagName() {
        return outDiseaseDiagName;
    }

    /**
     * 设置出院诊断 （患者所患疾病的西医诊断名称）
     *
     * @param outDiseaseDiagName 出院诊断 （患者所患疾病的西医诊断名称）
     */
    public void setOutDiseaseDiagName(String outDiseaseDiagName) {
        this.outDiseaseDiagName = outDiseaseDiagName == null ? null : outDiseaseDiagName.trim();
    }

    /**
     * 获取出院情况 （对患者出院情况的详细描述 ）
     *
     * @return OUT_CONDITION_DESC - 出院情况 （对患者出院情况的详细描述 ）
     */
    public String getOutConditionDesc() {
        return outConditionDesc;
    }

    /**
     * 设置出院情况 （对患者出院情况的详细描述 ）
     *
     * @param outConditionDesc 出院情况 （对患者出院情况的详细描述 ）
     */
    public void setOutConditionDesc(String outConditionDesc) {
        this.outConditionDesc = outConditionDesc == null ? null : outConditionDesc.trim();
    }

    /**
     * 获取阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     *
     * @return POSITIVE_AUXI_EXAM_RESULT - 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    public String getPositiveAuxiExamResult() {
        return positiveAuxiExamResult;
    }

    /**
     * 设置阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     *
     * @param positiveAuxiExamResult 阳性辅助检查结果 （涉及到阳性结果的辅助检查结果的描述）
     */
    public void setPositiveAuxiExamResult(String positiveAuxiExamResult) {
        this.positiveAuxiExamResult = positiveAuxiExamResult == null ? null : positiveAuxiExamResult.trim();
    }

    /**
     * 获取出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     *
     * @return OUT_SYMPTOM - 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    public String getOutSymptom() {
        return outSymptom;
    }

    /**
     * 设置出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     *
     * @param outSymptom 出院时症状与体征 （患者出院时症状和体征的详细描述 ）
     */
    public void setOutSymptom(String outSymptom) {
        this.outSymptom = outSymptom == null ? null : outSymptom.trim();
    }

    /**
     * 获取出院医嘱 （对患者出院医嘱的详细描述）
     *
     * @return OUT_ORDER - 出院医嘱 （对患者出院医嘱的详细描述）
     */
    public String getOutOrder() {
        return outOrder;
    }

    /**
     * 设置出院医嘱 （对患者出院医嘱的详细描述）
     *
     * @param outOrder 出院医嘱 （对患者出院医嘱的详细描述）
     */
    public void setOutOrder(String outOrder) {
        this.outOrder = outOrder == null ? null : outOrder.trim();
    }

    /**
     * 获取住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return HOSPITAL_DOCTOR_SIGNATURE - 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getHospitalDoctorSignature() {
        return hospitalDoctorSignature;
    }

    /**
     * 设置住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param hospitalDoctorSignature 住院医师签名 （负责患者住院诊疗的住院医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setHospitalDoctorSignature(String hospitalDoctorSignature) {
        this.hospitalDoctorSignature = hospitalDoctorSignature == null ? null : hospitalDoctorSignature.trim();
    }

    /**
     * 获取上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return SUPERIOR_DOCTOR_SIGNATURE - 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getSuperiorDoctorSignature() {
        return superiorDoctorSignature;
    }

    /**
     * 设置上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param superiorDoctorSignature 上级医师签名 （具有主治医师以上专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setSuperiorDoctorSignature(String superiorDoctorSignature) {
        this.superiorDoctorSignature = superiorDoctorSignature == null ? null : superiorDoctorSignature.trim();
    }

    /**
     * 获取签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @return SIGNATURE_DATE - 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public String getSignatureDate() {
        return signatureDate;
    }

    /**
     * 设置签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     *
     * @param signatureDate 签名日期时间（填报记录表单时的公元纪年日期和时间的完整描述）
     */
    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate == null ? null : signatureDate.trim();
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
     * 获取中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @return TCM_OBSERVE - 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * 设置中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     *
     * @param tcmObserve 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容 ）
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
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
     * 获取主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     *
     * @return CHIEF_DOCTOR_SIGNATURE - 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    public String getChiefDoctorSignature() {
        return chiefDoctorSignature;
    }

    /**
     * 设置主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     *
     * @param chiefDoctorSignature 主任医师签名 （负责患者住院诊疗的主任医师在文书上做些的姓氏和名称 ）
     */
    public void setChiefDoctorSignature(String chiefDoctorSignature) {
        this.chiefDoctorSignature = chiefDoctorSignature == null ? null : chiefDoctorSignature.trim();
    }

    /**
     * 获取主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return ATTENDING_DOCTOR_SIGNATURE - 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getAttendingDoctorSignature() {
        return attendingDoctorSignature;
    }

    /**
     * 设置主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param attendingDoctorSignature 主治医师签名 （具有主治医师专业技术职务资格的主管医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setAttendingDoctorSignature(String attendingDoctorSignature) {
        this.attendingDoctorSignature = attendingDoctorSignature == null ? null : attendingDoctorSignature.trim();
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
     * 获取地址
     *
     * @return ADDRESS - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取婚姻
     *
     * @return MARRIAGE - 婚姻
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置婚姻
     *
     * @param marriage 婚姻
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    /**
     * 获取工作单位
     *
     * @return WORK_UNIT - 工作单位
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * 设置工作单位
     *
     * @param workUnit 工作单位
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    /**
     * 获取工作单位
     *
     * @return WORK - 工作单位
     */
    public String getWork() {
        return work;
    }

    /**
     * 设置工作单位
     *
     * @param work 工作单位
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
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
     * 获取床位号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 床位号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置床位号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 床位号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
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