package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_EMR_ADMISSON_RECORD_24H")
public class QxTEmrAdmissonRecord24h {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 24小时内出入院记录唯一标识
     */
    @Column(name = "EARUID")
    private String earuid;

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
     * 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    /**
     * 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    @Column(name = "REPRESENTOR_RELATION_CODE")
    private String representorRelationCode;

    /**
     * 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    @Column(name = "REPRESENTOR_RELATION_CN")
    private String representorRelationCn;

    /**
     * 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "REPRESENTOR_NAME")
    private String representorName;

    /**
     * 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    @Column(name = "RELIABLE_STATEMENT_MARK")
    private Long reliableStatementMark;

    /**
     * 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    /**
     * 现病史（对患者当前所患疾病情况的详细描述）
     */
    @Column(name = "CURRENT_DISEASE")
    private String currentDisease;

    /**
     * 入院情况（对患者入院情况的详细描述）
     */
    @Column(name = "IN_CONDITION_DESE")
    private String inConditionDese;

    /**
     * 症状名称（患者出现的临床主要症状的名称）
     */
    @Column(name = "SYMPTOM_NAME")
    private String symptomName;

    /**
     * 症状描述（对患者出现症状的详细描述）
     */
    @Column(name = "SYMPTOM_DESC")
    private String symptomDesc;

    /**
     * 中医“四诊”观察结果（中医“四诊”观察结果的详细描述，包括望、闻、问、切四诊内容）
     */
    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    /**
     * 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 入院诊断代码（西医）ICD-10
     */
    @Column(name = "IN_DIAGOSIS_CODE")
    private String inDiagosisCode;

    /**
     * 入院诊断名称（西医）
     */
    @Column(name = "IN_DIAGOSIS_NAME")
    private String inDiagosisName;

    /**
     * 入院诊断代码（中医）GB/T 15657
     */
    @Column(name = "TCM_IN_DIAGOSIS_CODE")
    private String tcmInDiagosisCode;

    /**
     * 入院诊断名称（中医）
     */
    @Column(name = "TMC_IN_DIAGOSIS_NAME")
    private String tmcInDiagosisName;

    /**
     * 出院情况（对患者出院情况的详细描述）
     */
    @Column(name = "OUT_CONDITION")
    private String outCondition;

    /**
     * 出院诊断代码（西医）ICD-10
     */
    @Column(name = "OUT_DIAGOSIS_CODE")
    private String outDiagosisCode;

    /**
     * 出院诊断名称（西医）
     */
    @Column(name = "OUT_DIAGOSIS_NAME")
    private String outDiagosisName;

    /**
     * 出院诊断代码（中医）GB/T 15657
     */
    @Column(name = "TCM_OUT_DIAGOSIS_CODE")
    private String tcmOutDiagosisCode;

    /**
     * 出院诊断名称（中医）
     */
    @Column(name = "TMC_OUT_DIAGOSIS_NAME")
    private String tmcOutDiagosisName;

    /**
     * 出院医嘱（对患者出院医嘱的详细描述）
     */
    @Column(name = "OUT_ORDER")
    private String outOrder;

    /**
     * 出院医嘱开立人签名（开立出院医嘱人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ORDER_DOCTOR_SIGNATURE")
    private String orderDoctorSignature;

    /**
     * 出院医嘱开立日期时间（出院医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ORDER_SIGNATURE_DATE")
    private String orderSignatureDate;

    /**
     * 接诊医师:编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ACCEPT_PHYSICIAN_ID")
    private String acceptPhysicianId;

    /**
     * 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ACCEPT_PHYSICIAN_NAME")
    private String acceptPhysicianName;

    /**
     * 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ACCEPT_PHYSICIAN_DATE")
    private String acceptPhysicianDate;

    /**
     * 住院医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "RESIDENT_DOCTOR_ID")
    private String residentDoctorId;

    /**
     * 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    /**
     * 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "RESIDENT_DOCTOR_DATE")
    private String residentDoctorDate;

    /**
     * 主治医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "IN_CHARGE_DOCTOR_ID")
    private String inChargeDoctorId;

    /**
     * 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "IN_CHARGE_DOCTOR_NAME")
    private String inChargeDoctorName;

    /**
     * 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_CHARGE_DOCTOR_DATE")
    private String inChargeDoctorDate;

    /**
     * 主任医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "CHIEF_DOCTOR_ID")
    private String chiefDoctorId;

    /**
     * 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHIEF_DOCTOR_NAME")
    private String chiefDoctorName;

    /**
     * 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "CHIEF_DOCTOR_DATE")
    private String chiefDoctorDate;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

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
     * 住院号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

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
     * 婚姻
     */
    @Column(name = "MARRIAGE")
    private String marriage;

    /**
     * 民族
     */
    @Column(name = "ETHNIC_NAME")
    private String ethnicName;

    /**
     * 出生地
     */
    @Column(name = "BIRTHPLACE")
    private String birthplace;

    /**
     * 职业
     */
    @Column(name = "WORK")
    private String work;

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
     * 获取24小时内出入院记录唯一标识
     *
     * @return EARUID - 24小时内出入院记录唯一标识
     */
    public String getEaruid() {
        return earuid;
    }

    /**
     * 设置24小时内出入院记录唯一标识
     *
     * @param earuid 24小时内出入院记录唯一标识
     */
    public void setEaruid(String earuid) {
        this.earuid = earuid == null ? null : earuid.trim();
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
     * 获取入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return ADMISSION_DATE - 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * 设置入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param admissionDate 入院时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * 获取出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @return DISCHARGE_DATE - 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @param dischargeDate 出院时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     *
     * @return REPRESENTOR_RELATION_CODE - 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    public String getRepresentorRelationCode() {
        return representorRelationCode;
    }

    /**
     * 设置病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     *
     * @param representorRelationCode 病历陈述者：关系代码GB/T 4761（患者病史陈述人与患者的关系类别在特定编码体系中的代码）
     */
    public void setRepresentorRelationCode(String representorRelationCode) {
        this.representorRelationCode = representorRelationCode == null ? null : representorRelationCode.trim();
    }

    /**
     * 获取病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     *
     * @return REPRESENTOR_RELATION_CN - 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    public String getRepresentorRelationCn() {
        return representorRelationCn;
    }

    /**
     * 设置病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     *
     * @param representorRelationCn 病历陈述者：关系中文名称（患者病史陈述人与患者的关系类别在特定编码体系中的中文名称）
     */
    public void setRepresentorRelationCn(String representorRelationCn) {
        this.representorRelationCn = representorRelationCn == null ? null : representorRelationCn.trim();
    }

    /**
     * 获取病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return REPRESENTOR_NAME - 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getRepresentorName() {
        return representorName;
    }

    /**
     * 设置病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param representorName 病历陈述者：姓名（患者病史的陈述人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setRepresentorName(String representorName) {
        this.representorName = representorName == null ? null : representorName.trim();
    }

    /**
     * 获取陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     *
     * @return RELIABLE_STATEMENT_MARK - 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    public Long getReliableStatementMark() {
        return reliableStatementMark;
    }

    /**
     * 设置陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     *
     * @param reliableStatementMark 陈述内容可靠标志0否 1是（标识陈述内容是否可信的标志）
     */
    public void setReliableStatementMark(Long reliableStatementMark) {
        this.reliableStatementMark = reliableStatementMark;
    }

    /**
     * 获取主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     *
     * @return CHIEF_COMPLAINTS - 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * 设置主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     *
     * @param chiefComplaints 主诉（患者向医师描述的对自身本次就诊的相关感受的主要记录）
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * 获取现病史（对患者当前所患疾病情况的详细描述）
     *
     * @return CURRENT_DISEASE - 现病史（对患者当前所患疾病情况的详细描述）
     */
    public String getCurrentDisease() {
        return currentDisease;
    }

    /**
     * 设置现病史（对患者当前所患疾病情况的详细描述）
     *
     * @param currentDisease 现病史（对患者当前所患疾病情况的详细描述）
     */
    public void setCurrentDisease(String currentDisease) {
        this.currentDisease = currentDisease == null ? null : currentDisease.trim();
    }

    /**
     * 获取入院情况（对患者入院情况的详细描述）
     *
     * @return IN_CONDITION_DESE - 入院情况（对患者入院情况的详细描述）
     */
    public String getInConditionDese() {
        return inConditionDese;
    }

    /**
     * 设置入院情况（对患者入院情况的详细描述）
     *
     * @param inConditionDese 入院情况（对患者入院情况的详细描述）
     */
    public void setInConditionDese(String inConditionDese) {
        this.inConditionDese = inConditionDese == null ? null : inConditionDese.trim();
    }

    /**
     * 获取症状名称（患者出现的临床主要症状的名称）
     *
     * @return SYMPTOM_NAME - 症状名称（患者出现的临床主要症状的名称）
     */
    public String getSymptomName() {
        return symptomName;
    }

    /**
     * 设置症状名称（患者出现的临床主要症状的名称）
     *
     * @param symptomName 症状名称（患者出现的临床主要症状的名称）
     */
    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName == null ? null : symptomName.trim();
    }

    /**
     * 获取症状描述（对患者出现症状的详细描述）
     *
     * @return SYMPTOM_DESC - 症状描述（对患者出现症状的详细描述）
     */
    public String getSymptomDesc() {
        return symptomDesc;
    }

    /**
     * 设置症状描述（对患者出现症状的详细描述）
     *
     * @param symptomDesc 症状描述（对患者出现症状的详细描述）
     */
    public void setSymptomDesc(String symptomDesc) {
        this.symptomDesc = symptomDesc == null ? null : symptomDesc.trim();
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
     * 获取诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗经过（含抢救情况）（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取入院诊断代码（西医）ICD-10
     *
     * @return IN_DIAGOSIS_CODE - 入院诊断代码（西医）ICD-10
     */
    public String getInDiagosisCode() {
        return inDiagosisCode;
    }

    /**
     * 设置入院诊断代码（西医）ICD-10
     *
     * @param inDiagosisCode 入院诊断代码（西医）ICD-10
     */
    public void setInDiagosisCode(String inDiagosisCode) {
        this.inDiagosisCode = inDiagosisCode == null ? null : inDiagosisCode.trim();
    }

    /**
     * 获取入院诊断名称（西医）
     *
     * @return IN_DIAGOSIS_NAME - 入院诊断名称（西医）
     */
    public String getInDiagosisName() {
        return inDiagosisName;
    }

    /**
     * 设置入院诊断名称（西医）
     *
     * @param inDiagosisName 入院诊断名称（西医）
     */
    public void setInDiagosisName(String inDiagosisName) {
        this.inDiagosisName = inDiagosisName == null ? null : inDiagosisName.trim();
    }

    /**
     * 获取入院诊断代码（中医）GB/T 15657
     *
     * @return TCM_IN_DIAGOSIS_CODE - 入院诊断代码（中医）GB/T 15657
     */
    public String getTcmInDiagosisCode() {
        return tcmInDiagosisCode;
    }

    /**
     * 设置入院诊断代码（中医）GB/T 15657
     *
     * @param tcmInDiagosisCode 入院诊断代码（中医）GB/T 15657
     */
    public void setTcmInDiagosisCode(String tcmInDiagosisCode) {
        this.tcmInDiagosisCode = tcmInDiagosisCode == null ? null : tcmInDiagosisCode.trim();
    }

    /**
     * 获取入院诊断名称（中医）
     *
     * @return TMC_IN_DIAGOSIS_NAME - 入院诊断名称（中医）
     */
    public String getTmcInDiagosisName() {
        return tmcInDiagosisName;
    }

    /**
     * 设置入院诊断名称（中医）
     *
     * @param tmcInDiagosisName 入院诊断名称（中医）
     */
    public void setTmcInDiagosisName(String tmcInDiagosisName) {
        this.tmcInDiagosisName = tmcInDiagosisName == null ? null : tmcInDiagosisName.trim();
    }

    /**
     * 获取出院情况（对患者出院情况的详细描述）
     *
     * @return OUT_CONDITION - 出院情况（对患者出院情况的详细描述）
     */
    public String getOutCondition() {
        return outCondition;
    }

    /**
     * 设置出院情况（对患者出院情况的详细描述）
     *
     * @param outCondition 出院情况（对患者出院情况的详细描述）
     */
    public void setOutCondition(String outCondition) {
        this.outCondition = outCondition == null ? null : outCondition.trim();
    }

    /**
     * 获取出院诊断代码（西医）ICD-10
     *
     * @return OUT_DIAGOSIS_CODE - 出院诊断代码（西医）ICD-10
     */
    public String getOutDiagosisCode() {
        return outDiagosisCode;
    }

    /**
     * 设置出院诊断代码（西医）ICD-10
     *
     * @param outDiagosisCode 出院诊断代码（西医）ICD-10
     */
    public void setOutDiagosisCode(String outDiagosisCode) {
        this.outDiagosisCode = outDiagosisCode == null ? null : outDiagosisCode.trim();
    }

    /**
     * 获取出院诊断名称（西医）
     *
     * @return OUT_DIAGOSIS_NAME - 出院诊断名称（西医）
     */
    public String getOutDiagosisName() {
        return outDiagosisName;
    }

    /**
     * 设置出院诊断名称（西医）
     *
     * @param outDiagosisName 出院诊断名称（西医）
     */
    public void setOutDiagosisName(String outDiagosisName) {
        this.outDiagosisName = outDiagosisName == null ? null : outDiagosisName.trim();
    }

    /**
     * 获取出院诊断代码（中医）GB/T 15657
     *
     * @return TCM_OUT_DIAGOSIS_CODE - 出院诊断代码（中医）GB/T 15657
     */
    public String getTcmOutDiagosisCode() {
        return tcmOutDiagosisCode;
    }

    /**
     * 设置出院诊断代码（中医）GB/T 15657
     *
     * @param tcmOutDiagosisCode 出院诊断代码（中医）GB/T 15657
     */
    public void setTcmOutDiagosisCode(String tcmOutDiagosisCode) {
        this.tcmOutDiagosisCode = tcmOutDiagosisCode == null ? null : tcmOutDiagosisCode.trim();
    }

    /**
     * 获取出院诊断名称（中医）
     *
     * @return TMC_OUT_DIAGOSIS_NAME - 出院诊断名称（中医）
     */
    public String getTmcOutDiagosisName() {
        return tmcOutDiagosisName;
    }

    /**
     * 设置出院诊断名称（中医）
     *
     * @param tmcOutDiagosisName 出院诊断名称（中医）
     */
    public void setTmcOutDiagosisName(String tmcOutDiagosisName) {
        this.tmcOutDiagosisName = tmcOutDiagosisName == null ? null : tmcOutDiagosisName.trim();
    }

    /**
     * 获取出院医嘱（对患者出院医嘱的详细描述）
     *
     * @return OUT_ORDER - 出院医嘱（对患者出院医嘱的详细描述）
     */
    public String getOutOrder() {
        return outOrder;
    }

    /**
     * 设置出院医嘱（对患者出院医嘱的详细描述）
     *
     * @param outOrder 出院医嘱（对患者出院医嘱的详细描述）
     */
    public void setOutOrder(String outOrder) {
        this.outOrder = outOrder == null ? null : outOrder.trim();
    }

    /**
     * 获取出院医嘱开立人签名（开立出院医嘱人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ORDER_DOCTOR_SIGNATURE - 出院医嘱开立人签名（开立出院医嘱人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOrderDoctorSignature() {
        return orderDoctorSignature;
    }

    /**
     * 设置出院医嘱开立人签名（开立出院医嘱人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param orderDoctorSignature 出院医嘱开立人签名（开立出院医嘱人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOrderDoctorSignature(String orderDoctorSignature) {
        this.orderDoctorSignature = orderDoctorSignature == null ? null : orderDoctorSignature.trim();
    }

    /**
     * 获取出院医嘱开立日期时间（出院医嘱开立结束时的公元纪年日期和时间的完整描述）
     *
     * @return ORDER_SIGNATURE_DATE - 出院医嘱开立日期时间（出院医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    public String getOrderSignatureDate() {
        return orderSignatureDate;
    }

    /**
     * 设置出院医嘱开立日期时间（出院医嘱开立结束时的公元纪年日期和时间的完整描述）
     *
     * @param orderSignatureDate 出院医嘱开立日期时间（出院医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    public void setOrderSignatureDate(String orderSignatureDate) {
        this.orderSignatureDate = orderSignatureDate == null ? null : orderSignatureDate.trim();
    }

    /**
     * 获取接诊医师:编号（医疗服务人员的唯一编号）
     *
     * @return ACCEPT_PHYSICIAN_ID - 接诊医师:编号（医疗服务人员的唯一编号）
     */
    public String getAcceptPhysicianId() {
        return acceptPhysicianId;
    }

    /**
     * 设置接诊医师:编号（医疗服务人员的唯一编号）
     *
     * @param acceptPhysicianId 接诊医师:编号（医疗服务人员的唯一编号）
     */
    public void setAcceptPhysicianId(String acceptPhysicianId) {
        this.acceptPhysicianId = acceptPhysicianId == null ? null : acceptPhysicianId.trim();
    }

    /**
     * 获取接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ACCEPT_PHYSICIAN_NAME - 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAcceptPhysicianName() {
        return acceptPhysicianName;
    }

    /**
     * 设置接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param acceptPhysicianName 接诊医师:姓名（负责患者入院接诊的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAcceptPhysicianName(String acceptPhysicianName) {
        this.acceptPhysicianName = acceptPhysicianName == null ? null : acceptPhysicianName.trim();
    }

    /**
     * 获取接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return ACCEPT_PHYSICIAN_DATE - 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getAcceptPhysicianDate() {
        return acceptPhysicianDate;
    }

    /**
     * 设置接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param acceptPhysicianDate 接诊医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setAcceptPhysicianDate(String acceptPhysicianDate) {
        this.acceptPhysicianDate = acceptPhysicianDate == null ? null : acceptPhysicianDate.trim();
    }

    /**
     * 获取住院医师：编号（医疗服务人员的唯一编号）
     *
     * @return RESIDENT_DOCTOR_ID - 住院医师：编号（医疗服务人员的唯一编号）
     */
    public String getResidentDoctorId() {
        return residentDoctorId;
    }

    /**
     * 设置住院医师：编号（医疗服务人员的唯一编号）
     *
     * @param residentDoctorId 住院医师：编号（医疗服务人员的唯一编号）
     */
    public void setResidentDoctorId(String residentDoctorId) {
        this.residentDoctorId = residentDoctorId == null ? null : residentDoctorId.trim();
    }

    /**
     * 获取住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return RESIDENT_DOCTOR_NAME - 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * 设置住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param residentDoctorName 住院医师：姓名（患者出院时所在科室具体负责诊治的，具有住院医师专业技术职务任职资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * 获取住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return RESIDENT_DOCTOR_DATE - 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getResidentDoctorDate() {
        return residentDoctorDate;
    }

    /**
     * 设置住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param residentDoctorDate 住院医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setResidentDoctorDate(String residentDoctorDate) {
        this.residentDoctorDate = residentDoctorDate == null ? null : residentDoctorDate.trim();
    }

    /**
     * 获取主治医师：编号（医疗服务人员的唯一编号）
     *
     * @return IN_CHARGE_DOCTOR_ID - 主治医师：编号（医疗服务人员的唯一编号）
     */
    public String getInChargeDoctorId() {
        return inChargeDoctorId;
    }

    /**
     * 设置主治医师：编号（医疗服务人员的唯一编号）
     *
     * @param inChargeDoctorId 主治医师：编号（医疗服务人员的唯一编号）
     */
    public void setInChargeDoctorId(String inChargeDoctorId) {
        this.inChargeDoctorId = inChargeDoctorId == null ? null : inChargeDoctorId.trim();
    }

    /**
     * 获取主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return IN_CHARGE_DOCTOR_NAME - 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getInChargeDoctorName() {
        return inChargeDoctorName;
    }

    /**
     * 设置主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param inChargeDoctorName 主治医师：姓名（具有主治医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setInChargeDoctorName(String inChargeDoctorName) {
        this.inChargeDoctorName = inChargeDoctorName == null ? null : inChargeDoctorName.trim();
    }

    /**
     * 获取主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return IN_CHARGE_DOCTOR_DATE - 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getInChargeDoctorDate() {
        return inChargeDoctorDate;
    }

    /**
     * 设置主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param inChargeDoctorDate 主治医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setInChargeDoctorDate(String inChargeDoctorDate) {
        this.inChargeDoctorDate = inChargeDoctorDate == null ? null : inChargeDoctorDate.trim();
    }

    /**
     * 获取主任医师：编号（医疗服务人员的唯一编号）
     *
     * @return CHIEF_DOCTOR_ID - 主任医师：编号（医疗服务人员的唯一编号）
     */
    public String getChiefDoctorId() {
        return chiefDoctorId;
    }

    /**
     * 设置主任医师：编号（医疗服务人员的唯一编号）
     *
     * @param chiefDoctorId 主任医师：编号（医疗服务人员的唯一编号）
     */
    public void setChiefDoctorId(String chiefDoctorId) {
        this.chiefDoctorId = chiefDoctorId == null ? null : chiefDoctorId.trim();
    }

    /**
     * 获取主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHIEF_DOCTOR_NAME - 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getChiefDoctorName() {
        return chiefDoctorName;
    }

    /**
     * 设置主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param chiefDoctorName 主任医师：姓名（具有主任医师专业技术职务资格的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setChiefDoctorName(String chiefDoctorName) {
        this.chiefDoctorName = chiefDoctorName == null ? null : chiefDoctorName.trim();
    }

    /**
     * 获取主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return CHIEF_DOCTOR_DATE - 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getChiefDoctorDate() {
        return chiefDoctorDate;
    }

    /**
     * 设置主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param chiefDoctorDate 主任医师签名时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setChiefDoctorDate(String chiefDoctorDate) {
        this.chiefDoctorDate = chiefDoctorDate == null ? null : chiefDoctorDate.trim();
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
     * 获取民族
     *
     * @return ETHNIC_NAME - 民族
     */
    public String getEthnicName() {
        return ethnicName;
    }

    /**
     * 设置民族
     *
     * @param ethnicName 民族
     */
    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName == null ? null : ethnicName.trim();
    }

    /**
     * 获取出生地
     *
     * @return BIRTHPLACE - 出生地
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * 设置出生地
     *
     * @param birthplace 出生地
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    /**
     * 获取职业
     *
     * @return WORK - 职业
     */
    public String getWork() {
        return work;
    }

    /**
     * 设置职业
     *
     * @param work 职业
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
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