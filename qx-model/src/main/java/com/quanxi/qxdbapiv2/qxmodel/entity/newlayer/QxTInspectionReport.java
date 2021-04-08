package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_INSPECTION_REPORT")
public class QxTInspectionReport {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 检查唯一标识
     */
    @Column(name = "IRUID")
    private String iruid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 本地事件号（门诊号或者住院号）
     */
    @Column(name = "EVENTUID")
    private String eventuid;

    /**
     * 科室唯一标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 科室名称（患者在医疗机构就诊的科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 病区名称（患者当前所在病区的名称）
     */
    @Column(name = "WARD_NAME")
    private String wardName;

    /**
     * 症状开始日期时间（当次症状开始发生时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SYMPTOM_START_DATE")
    private String symptomStartDate;

    /**
     * 症状停止日期时间（当次症状停止时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SYMPTOM_END_DATE")
    private String symptomEndDate;

    /**
     * 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    @Column(name = "SPECIAL_EXAM_MARK")
    private Long specialExamMark;

    /**
     * 标本类别描述（对标本类别的描述）
     */
    @Column(name = "SPECIMEN_CLASS")
    private String specimenClass;

    /**
     * 检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     */
    @Column(name = "SPECIMEN_NO")
    private String specimenNo;

    /**
     * 标本状态（对受检标本状态的描述）
     */
    @Column(name = "SPECIMEN_STATUS")
    private String specimenStatus;

    /**
     * 标本固定液名称（标本固定液的名称，如 95%酒精、10%福尔马林）
     */
    @Column(name = "SPECIMEN_FIXATIVE")
    private String specimenFixative;

    /**
     * 标本采样日期时间（采集标本时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SPECIMEN_SAMPLE_DATE")
    private String specimenSampleDate;

    /**
     * 接收标本日期时间（检查科室实际接收标本时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SPECIMEN_RECEIVE_DATE")
    private String specimenReceiveDate;

    /**
     * 归档检索日期（文档归档的当日的公元纪年日期）
     */
    @Column(name = "RETRIEVE_DATE")
    private String retrieveDate;

    /**
     * 检查分类的标准编码（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     */
    @Column(name = "CLASS_TYPE_CODE")
    private String classTypeCode;

    /**
     * 检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     */
    @Column(name = "CLASS_TYPE_NAME")
    private String classTypeName;

    /**
     * 检查部位的标准编码（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    @Column(name = "EXAM_SITE_CODE")
    private String examSiteCode;

    /**
     * 检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     */
    @Column(name = "EXAM_SITE_NAME")
    private String examSiteName;

    /**
     * 检查项目的标准编码（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     */
    @Column(name = "EXAM_ITEM_CODE")
    private String examItemCode;

    /**
     * 检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    @Column(name = "EXAM_ITEM_NAME")
    private String examItemName;

    /**
     * 检查结果代码（患者检查结果的分类代码）
     */
    @Column(name = "EXAM_RESULT_CODE")
    private String examResultCode;

    /**
     * 检查结果名称（患者检查结果的分类名称）
     */
    @Column(name = "EXAM_RESULT_NAME")
    private String examResultName;

    /**
     * 检查定量结果（患者检查结果的测量值（定量））
     */
    @Column(name = "EXAM_QUANTITIVE_RESULT")
    private Long examQuantitiveResult;

    /**
     * 检查定量结果计量单位（患者定量检查测量值的计量单位）
     */
    @Column(name = "QUANTITIVE_UNIT")
    private String quantitiveUnit;

    /**
     * 报告的标题（文档报告的标题）
     */
    @Column(name = "REPORT_TITLE")
    private String reportTitle;

    /**
     * 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 填报者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHOR_ID")
    private String authorId;

    /**
     * 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    @Column(name = "REPORT_CREATE_DATE")
    private String reportCreateDate;

    /**
     * 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    /**
     * 审核者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHENTICATOR_ID")
    private String authenticatorId;

    /**
     * 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHENTICATOR_NAME")
    private String authenticatorName;

    /**
     * 审核者：审核时间（审核当日的公元纪年日期）
     */
    @Column(name = "AUTHENTICATOR_DATE")
    private String authenticatorDate;

    /**
     * 申请科室代码（申请检查的科室代码）
     */
    @Column(name = "PARTICIPANT_DEPT_CODE")
    private String participantDeptCode;

    /**
     * 申请科室名称（申请检查的科室名称）
     */
    @Column(name = "PARTICIPANT_DEPT_NAME")
    private String participantDeptName;

    /**
     * 申请医生：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "PARTICIPANT_ID")
    private String participantId;

    /**
     * 申请医生：姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PARTICIPANT_NAME")
    private String participantName;

    /**
     * 申请医生：申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PARTICIPANT_DATE")
    private String participantDate;

    /**
     * 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 对应的医嘱：优先级（对应医嘱类型的描述）
     */
    @Column(name = "ORDER_PRIORITY")
    private String orderPriority;

    /**
     * 检查的执行科室代码（执行检查的科室代码）
     */
    @Column(name = "PERFORMER_DEPT_CODE")
    private String performerDeptCode;

    /**
     * 检查的执行科室名称（执行检查的科室名称）
     */
    @Column(name = "PERFORMER_DEPT_NAME")
    private String performerDeptName;

    /**
     * 检查的执行医生
     */
    @Column(name = "PERFORMER_DOCTOR_CODE")
    private String performerDoctorCode;

    /**
     * 检查的执行医生姓名（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORMER_DOCTOR_NAME")
    private String performerDoctorName;

    /**
     * 检查的执行时间（检验项目执行当日的公元纪年日期的完整描述）
     */
    @Column(name = "EXAM_PERFORMER_DATE")
    private String examPerformerDate;

    /**
     * 临床诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    @Column(name = "OUTPAT_DIAG_NAME")
    private String outpatDiagName;

    /**
     * 是否异常2否 1是（检验/检查结果是否异常的标志）
     */
    @Column(name = "IS_ABNORMAL")
    private Long isAbnormal;

    /**
     * 检查技师签名（检查技师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "EXAM_TECHNICIAN")
    private String examTechnician;

    /**
     * 诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     */
    @Column(name = "DIAG_DATE")
    private String diagDate;

    /**
     * 登记时间（患者进行检查的登记时间）
     */
    @Column(name = "REGISTER_DATE")
    private String registerDate;

    /**
     * 登记人（患者进行检查的登记人员姓名）
     */
    @Column(name = "REGISTER_OPERATOR")
    private String registerOperator;

    /**
     * 诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "DIAGNOSE_CODE")
    private String diagnoseCode;

    /**
     * 打印时间（检查报告的打印的公元纪年时间）
     */
    @Column(name = "PRINT_DATE")
    private String printDate;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 检查的执行科室标识
     */
    @Column(name = "PERFORMER_DUID")
    private String performerDuid;

    /**
     * 申请科室标识
     */
    @Column(name = "PARTICIPANT_DUID")
    private String participantDuid;

    /**
     * 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别中文名称（本人生理性别的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 病人出生日期（本人出生当日的公元纪年日期）
     */
    @Column(name = "BIRTH_DATE")
    private String birthDate;

    /**
     * 年龄（指患者的实足年龄，为患者出生后按照日历计算的历法年龄。年龄满 1 周岁的，以实足年龄的相应整数填写；年龄不足 1 周岁的，按照实足年龄的月龄填写，以分数形式表示：分数的整数部分代表实足月龄，分数部分分母为 30，分子为不足 1 个月的天数 ）
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     */
    @Column(name = "CONTACTS_TEL_NO")
    private String contactsTelNo;

    /**
     * 病房号（患者住院期间，所住病房对应的编号）
     */
    @Column(name = "ROOM_NO")
    private String roomNo;

    /**
     * 病床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 是否大型设备检查
     */
    @Column(name = "IS_BIGDEVICE")
    private Long isBigdevice;

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

    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    @Column(name = "SYMPTON_DESC")
    private String symptonDesc;

    @Column(name = "TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    @Column(name = "EXAM_PURPOSE")
    private String examPurpose;

    @Column(name = "IMAGE_DESCR")
    private String imageDescr;

    @Column(name = "CONCLUSION")
    private String conclusion;

    @Column(name = "DIAGNOSE_NAME")
    private String diagnoseName;

    /**
     * 检查设备
     */
    @Column(name = "M_DEVICE")
    private String mDevice;

    /**
     * 肉眼所见（对肉眼所见的详细情况描述）
     */
    @Column(name = "EYES_DESCR")
    private String eyesDescr;

    /**
     * 报告者对此份报告提出的建议或意见
     */
    @Column(name = "EXAM_ADVISE")
    private String examAdvise;

    /**
     * 影像编号，特定系统显示的编号。例如（US457977）
     */
    @Column(name = "EXAM_NUM")
    private String examNum;

    /**
     * 特殊的检查编号，各类检查报告特有的编号。例如“年月日+”（202007010001）
     */
    @Column(name = "EXAM_SPECIAL_NUM")
    private String examSpecialNum;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "EVENT_NO")
    private String eventNo;

    @Column(name = "PATIENT_ID")
    private String patientId;

    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
     * 获取检查唯一标识
     *
     * @return IRUID - 检查唯一标识
     */
    public String getIruid() {
        return iruid;
    }

    /**
     * 设置检查唯一标识
     *
     * @param iruid 检查唯一标识
     */
    public void setIruid(String iruid) {
        this.iruid = iruid == null ? null : iruid.trim();
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
     * 获取本地事件号（门诊号或者住院号）
     *
     * @return EVENTUID - 本地事件号（门诊号或者住院号）
     */
    public String getEventuid() {
        return eventuid;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）
     *
     * @param eventuid 本地事件号（门诊号或者住院号）
     */
    public void setEventuid(String eventuid) {
        this.eventuid = eventuid == null ? null : eventuid.trim();
    }

    /**
     * 获取科室唯一标识
     *
     * @return DUID - 科室唯一标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置科室唯一标识
     *
     * @param duid 科室唯一标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取科室名称（患者在医疗机构就诊的科室名称）
     *
     * @return DEPT_NAME - 科室名称（患者在医疗机构就诊的科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（患者在医疗机构就诊的科室名称）
     *
     * @param deptName 科室名称（患者在医疗机构就诊的科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取病区名称（患者当前所在病区的名称）
     *
     * @return WARD_NAME - 病区名称（患者当前所在病区的名称）
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病区名称（患者当前所在病区的名称）
     *
     * @param wardName 病区名称（患者当前所在病区的名称）
     */
    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    /**
     * 获取症状开始日期时间（当次症状开始发生时的公元纪年日期和时间的完整描述）
     *
     * @return SYMPTOM_START_DATE - 症状开始日期时间（当次症状开始发生时的公元纪年日期和时间的完整描述）
     */
    public String getSymptomStartDate() {
        return symptomStartDate;
    }

    /**
     * 设置症状开始日期时间（当次症状开始发生时的公元纪年日期和时间的完整描述）
     *
     * @param symptomStartDate 症状开始日期时间（当次症状开始发生时的公元纪年日期和时间的完整描述）
     */
    public void setSymptomStartDate(String symptomStartDate) {
        this.symptomStartDate = symptomStartDate == null ? null : symptomStartDate.trim();
    }

    /**
     * 获取症状停止日期时间（当次症状停止时的公元纪年日期和时间的完整描述）
     *
     * @return SYMPTOM_END_DATE - 症状停止日期时间（当次症状停止时的公元纪年日期和时间的完整描述）
     */
    public String getSymptomEndDate() {
        return symptomEndDate;
    }

    /**
     * 设置症状停止日期时间（当次症状停止时的公元纪年日期和时间的完整描述）
     *
     * @param symptomEndDate 症状停止日期时间（当次症状停止时的公元纪年日期和时间的完整描述）
     */
    public void setSymptomEndDate(String symptomEndDate) {
        this.symptomEndDate = symptomEndDate == null ? null : symptomEndDate.trim();
    }

    /**
     * 获取特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     *
     * @return SPECIAL_EXAM_MARK - 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    public Long getSpecialExamMark() {
        return specialExamMark;
    }

    /**
     * 设置特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     *
     * @param specialExamMark 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    public void setSpecialExamMark(Long specialExamMark) {
        this.specialExamMark = specialExamMark;
    }

    /**
     * 获取标本类别描述（对标本类别的描述）
     *
     * @return SPECIMEN_CLASS - 标本类别描述（对标本类别的描述）
     */
    public String getSpecimenClass() {
        return specimenClass;
    }

    /**
     * 设置标本类别描述（对标本类别的描述）
     *
     * @param specimenClass 标本类别描述（对标本类别的描述）
     */
    public void setSpecimenClass(String specimenClass) {
        this.specimenClass = specimenClass == null ? null : specimenClass.trim();
    }

    /**
     * 获取检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     *
     * @return SPECIMEN_NO - 检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     */
    public String getSpecimenNo() {
        return specimenNo;
    }

    /**
     * 设置检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     *
     * @param specimenNo 检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     */
    public void setSpecimenNo(String specimenNo) {
        this.specimenNo = specimenNo == null ? null : specimenNo.trim();
    }

    /**
     * 获取标本状态（对受检标本状态的描述）
     *
     * @return SPECIMEN_STATUS - 标本状态（对受检标本状态的描述）
     */
    public String getSpecimenStatus() {
        return specimenStatus;
    }

    /**
     * 设置标本状态（对受检标本状态的描述）
     *
     * @param specimenStatus 标本状态（对受检标本状态的描述）
     */
    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus == null ? null : specimenStatus.trim();
    }

    /**
     * 获取标本固定液名称（标本固定液的名称，如 95%酒精、10%福尔马林）
     *
     * @return SPECIMEN_FIXATIVE - 标本固定液名称（标本固定液的名称，如 95%酒精、10%福尔马林）
     */
    public String getSpecimenFixative() {
        return specimenFixative;
    }

    /**
     * 设置标本固定液名称（标本固定液的名称，如 95%酒精、10%福尔马林）
     *
     * @param specimenFixative 标本固定液名称（标本固定液的名称，如 95%酒精、10%福尔马林）
     */
    public void setSpecimenFixative(String specimenFixative) {
        this.specimenFixative = specimenFixative == null ? null : specimenFixative.trim();
    }

    /**
     * 获取标本采样日期时间（采集标本时的公元纪年日期和时间的完整描述）
     *
     * @return SPECIMEN_SAMPLE_DATE - 标本采样日期时间（采集标本时的公元纪年日期和时间的完整描述）
     */
    public String getSpecimenSampleDate() {
        return specimenSampleDate;
    }

    /**
     * 设置标本采样日期时间（采集标本时的公元纪年日期和时间的完整描述）
     *
     * @param specimenSampleDate 标本采样日期时间（采集标本时的公元纪年日期和时间的完整描述）
     */
    public void setSpecimenSampleDate(String specimenSampleDate) {
        this.specimenSampleDate = specimenSampleDate == null ? null : specimenSampleDate.trim();
    }

    /**
     * 获取接收标本日期时间（检查科室实际接收标本时的公元纪年日期和时间的完整描述）
     *
     * @return SPECIMEN_RECEIVE_DATE - 接收标本日期时间（检查科室实际接收标本时的公元纪年日期和时间的完整描述）
     */
    public String getSpecimenReceiveDate() {
        return specimenReceiveDate;
    }

    /**
     * 设置接收标本日期时间（检查科室实际接收标本时的公元纪年日期和时间的完整描述）
     *
     * @param specimenReceiveDate 接收标本日期时间（检查科室实际接收标本时的公元纪年日期和时间的完整描述）
     */
    public void setSpecimenReceiveDate(String specimenReceiveDate) {
        this.specimenReceiveDate = specimenReceiveDate == null ? null : specimenReceiveDate.trim();
    }

    /**
     * 获取归档检索日期（文档归档的当日的公元纪年日期）
     *
     * @return RETRIEVE_DATE - 归档检索日期（文档归档的当日的公元纪年日期）
     */
    public String getRetrieveDate() {
        return retrieveDate;
    }

    /**
     * 设置归档检索日期（文档归档的当日的公元纪年日期）
     *
     * @param retrieveDate 归档检索日期（文档归档的当日的公元纪年日期）
     */
    public void setRetrieveDate(String retrieveDate) {
        this.retrieveDate = retrieveDate == null ? null : retrieveDate.trim();
    }

    /**
     * 获取检查分类的标准编码（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     *
     * @return CLASS_TYPE_CODE - 检查分类的标准编码（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     */
    public String getClassTypeCode() {
        return classTypeCode;
    }

    /**
     * 设置检查分类的标准编码（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     *
     * @param classTypeCode 检查分类的标准编码（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     */
    public void setClassTypeCode(String classTypeCode) {
        this.classTypeCode = classTypeCode == null ? null : classTypeCode.trim();
    }

    /**
     * 获取检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     *
     * @return CLASS_TYPE_NAME - 检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     */
    public String getClassTypeName() {
        return classTypeName;
    }

    /**
     * 设置检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     *
     * @param classTypeName 检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     */
    public void setClassTypeName(String classTypeName) {
        this.classTypeName = classTypeName == null ? null : classTypeName.trim();
    }

    /**
     * 获取检查部位的标准编码（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @return EXAM_SITE_CODE - 检查部位的标准编码（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public String getExamSiteCode() {
        return examSiteCode;
    }

    /**
     * 设置检查部位的标准编码（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @param examSiteCode 检查部位的标准编码（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public void setExamSiteCode(String examSiteCode) {
        this.examSiteCode = examSiteCode == null ? null : examSiteCode.trim();
    }

    /**
     * 获取检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     *
     * @return EXAM_SITE_NAME - 检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     */
    public String getExamSiteName() {
        return examSiteName;
    }

    /**
     * 设置检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     *
     * @param examSiteName 检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     */
    public void setExamSiteName(String examSiteName) {
        this.examSiteName = examSiteName == null ? null : examSiteName.trim();
    }

    /**
     * 获取检查项目的标准编码（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     *
     * @return EXAM_ITEM_CODE - 检查项目的标准编码（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     */
    public String getExamItemCode() {
        return examItemCode;
    }

    /**
     * 设置检查项目的标准编码（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     *
     * @param examItemCode 检查项目的标准编码（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     */
    public void setExamItemCode(String examItemCode) {
        this.examItemCode = examItemCode == null ? null : examItemCode.trim();
    }

    /**
     * 获取检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @return EXAM_ITEM_NAME - 检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public String getExamItemName() {
        return examItemName;
    }

    /**
     * 设置检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @param examItemName 检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public void setExamItemName(String examItemName) {
        this.examItemName = examItemName == null ? null : examItemName.trim();
    }

    /**
     * 获取检查结果代码（患者检查结果的分类代码）
     *
     * @return EXAM_RESULT_CODE - 检查结果代码（患者检查结果的分类代码）
     */
    public String getExamResultCode() {
        return examResultCode;
    }

    /**
     * 设置检查结果代码（患者检查结果的分类代码）
     *
     * @param examResultCode 检查结果代码（患者检查结果的分类代码）
     */
    public void setExamResultCode(String examResultCode) {
        this.examResultCode = examResultCode == null ? null : examResultCode.trim();
    }

    /**
     * 获取检查结果名称（患者检查结果的分类名称）
     *
     * @return EXAM_RESULT_NAME - 检查结果名称（患者检查结果的分类名称）
     */
    public String getExamResultName() {
        return examResultName;
    }

    /**
     * 设置检查结果名称（患者检查结果的分类名称）
     *
     * @param examResultName 检查结果名称（患者检查结果的分类名称）
     */
    public void setExamResultName(String examResultName) {
        this.examResultName = examResultName == null ? null : examResultName.trim();
    }

    /**
     * 获取检查定量结果（患者检查结果的测量值（定量））
     *
     * @return EXAM_QUANTITIVE_RESULT - 检查定量结果（患者检查结果的测量值（定量））
     */
    public Long getExamQuantitiveResult() {
        return examQuantitiveResult;
    }

    /**
     * 设置检查定量结果（患者检查结果的测量值（定量））
     *
     * @param examQuantitiveResult 检查定量结果（患者检查结果的测量值（定量））
     */
    public void setExamQuantitiveResult(Long examQuantitiveResult) {
        this.examQuantitiveResult = examQuantitiveResult;
    }

    /**
     * 获取检查定量结果计量单位（患者定量检查测量值的计量单位）
     *
     * @return QUANTITIVE_UNIT - 检查定量结果计量单位（患者定量检查测量值的计量单位）
     */
    public String getQuantitiveUnit() {
        return quantitiveUnit;
    }

    /**
     * 设置检查定量结果计量单位（患者定量检查测量值的计量单位）
     *
     * @param quantitiveUnit 检查定量结果计量单位（患者定量检查测量值的计量单位）
     */
    public void setQuantitiveUnit(String quantitiveUnit) {
        this.quantitiveUnit = quantitiveUnit == null ? null : quantitiveUnit.trim();
    }

    /**
     * 获取报告的标题（文档报告的标题）
     *
     * @return REPORT_TITLE - 报告的标题（文档报告的标题）
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * 设置报告的标题（文档报告的标题）
     *
     * @param reportTitle 报告的标题（文档报告的标题）
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    /**
     * 获取文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     *
     * @return EFFECTIVE_DATE - 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     *
     * @param effectiveDate 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取填报者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHOR_ID - 填报者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 设置填报者：编号（医疗服务人员的唯一编号）
     *
     * @param authorId 填报者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    /**
     * 获取报告生成时间（检查报告当日的公元纪年日期的完整描述）
     *
     * @return REPORT_CREATE_DATE - 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    public String getReportCreateDate() {
        return reportCreateDate;
    }

    /**
     * 设置报告生成时间（检查报告当日的公元纪年日期的完整描述）
     *
     * @param reportCreateDate 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    public void setReportCreateDate(String reportCreateDate) {
        this.reportCreateDate = reportCreateDate == null ? null : reportCreateDate.trim();
    }

    /**
     * 获取填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHOR_NAME - 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param authorName 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * 获取审核者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHENTICATOR_ID - 审核者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthenticatorId() {
        return authenticatorId;
    }

    /**
     * 设置审核者：编号（医疗服务人员的唯一编号）
     *
     * @param authenticatorId 审核者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthenticatorId(String authenticatorId) {
        this.authenticatorId = authenticatorId == null ? null : authenticatorId.trim();
    }

    /**
     * 获取审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHENTICATOR_NAME - 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthenticatorName() {
        return authenticatorName;
    }

    /**
     * 设置审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param authenticatorName 审核者：姓名（审核者在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName == null ? null : authenticatorName.trim();
    }

    /**
     * 获取审核者：审核时间（审核当日的公元纪年日期）
     *
     * @return AUTHENTICATOR_DATE - 审核者：审核时间（审核当日的公元纪年日期）
     */
    public String getAuthenticatorDate() {
        return authenticatorDate;
    }

    /**
     * 设置审核者：审核时间（审核当日的公元纪年日期）
     *
     * @param authenticatorDate 审核者：审核时间（审核当日的公元纪年日期）
     */
    public void setAuthenticatorDate(String authenticatorDate) {
        this.authenticatorDate = authenticatorDate == null ? null : authenticatorDate.trim();
    }

    /**
     * 获取申请科室代码（申请检查的科室代码）
     *
     * @return PARTICIPANT_DEPT_CODE - 申请科室代码（申请检查的科室代码）
     */
    public String getParticipantDeptCode() {
        return participantDeptCode;
    }

    /**
     * 设置申请科室代码（申请检查的科室代码）
     *
     * @param participantDeptCode 申请科室代码（申请检查的科室代码）
     */
    public void setParticipantDeptCode(String participantDeptCode) {
        this.participantDeptCode = participantDeptCode == null ? null : participantDeptCode.trim();
    }

    /**
     * 获取申请科室名称（申请检查的科室名称）
     *
     * @return PARTICIPANT_DEPT_NAME - 申请科室名称（申请检查的科室名称）
     */
    public String getParticipantDeptName() {
        return participantDeptName;
    }

    /**
     * 设置申请科室名称（申请检查的科室名称）
     *
     * @param participantDeptName 申请科室名称（申请检查的科室名称）
     */
    public void setParticipantDeptName(String participantDeptName) {
        this.participantDeptName = participantDeptName == null ? null : participantDeptName.trim();
    }

    /**
     * 获取申请医生：编号（医疗服务人员的唯一编号）
     *
     * @return PARTICIPANT_ID - 申请医生：编号（医疗服务人员的唯一编号）
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * 设置申请医生：编号（医疗服务人员的唯一编号）
     *
     * @param participantId 申请医生：编号（医疗服务人员的唯一编号）
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId == null ? null : participantId.trim();
    }

    /**
     * 获取申请医生：姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PARTICIPANT_NAME - 申请医生：姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * 设置申请医生：姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param participantName 申请医生：姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName == null ? null : participantName.trim();
    }

    /**
     * 获取申请医生：申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     *
     * @return PARTICIPANT_DATE - 申请医生：申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    public String getParticipantDate() {
        return participantDate;
    }

    /**
     * 设置申请医生：申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     *
     * @param participantDate 申请医生：申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    public void setParticipantDate(String participantDate) {
        this.participantDate = participantDate == null ? null : participantDate.trim();
    }

    /**
     * 获取对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return ORDER_ID - 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param orderId 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取对应的医嘱：优先级（对应医嘱类型的描述）
     *
     * @return ORDER_PRIORITY - 对应的医嘱：优先级（对应医嘱类型的描述）
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * 设置对应的医嘱：优先级（对应医嘱类型的描述）
     *
     * @param orderPriority 对应的医嘱：优先级（对应医嘱类型的描述）
     */
    public void setOrderPriority(String orderPriority) {
        this.orderPriority = orderPriority == null ? null : orderPriority.trim();
    }

    /**
     * 获取检查的执行科室代码（执行检查的科室代码）
     *
     * @return PERFORMER_DEPT_CODE - 检查的执行科室代码（执行检查的科室代码）
     */
    public String getPerformerDeptCode() {
        return performerDeptCode;
    }

    /**
     * 设置检查的执行科室代码（执行检查的科室代码）
     *
     * @param performerDeptCode 检查的执行科室代码（执行检查的科室代码）
     */
    public void setPerformerDeptCode(String performerDeptCode) {
        this.performerDeptCode = performerDeptCode == null ? null : performerDeptCode.trim();
    }

    /**
     * 获取检查的执行科室名称（执行检查的科室名称）
     *
     * @return PERFORMER_DEPT_NAME - 检查的执行科室名称（执行检查的科室名称）
     */
    public String getPerformerDeptName() {
        return performerDeptName;
    }

    /**
     * 设置检查的执行科室名称（执行检查的科室名称）
     *
     * @param performerDeptName 检查的执行科室名称（执行检查的科室名称）
     */
    public void setPerformerDeptName(String performerDeptName) {
        this.performerDeptName = performerDeptName == null ? null : performerDeptName.trim();
    }

    /**
     * 获取检查的执行医生
     *
     * @return PERFORMER_DOCTOR_CODE - 检查的执行医生
     */
    public String getPerformerDoctorCode() {
        return performerDoctorCode;
    }

    /**
     * 设置检查的执行医生
     *
     * @param performerDoctorCode 检查的执行医生
     */
    public void setPerformerDoctorCode(String performerDoctorCode) {
        this.performerDoctorCode = performerDoctorCode == null ? null : performerDoctorCode.trim();
    }

    /**
     * 获取检查的执行医生姓名（检查人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORMER_DOCTOR_NAME - 检查的执行医生姓名（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformerDoctorName() {
        return performerDoctorName;
    }

    /**
     * 设置检查的执行医生姓名（检查人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param performerDoctorName 检查的执行医生姓名（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformerDoctorName(String performerDoctorName) {
        this.performerDoctorName = performerDoctorName == null ? null : performerDoctorName.trim();
    }

    /**
     * 获取检查的执行时间（检验项目执行当日的公元纪年日期的完整描述）
     *
     * @return EXAM_PERFORMER_DATE - 检查的执行时间（检验项目执行当日的公元纪年日期的完整描述）
     */
    public String getExamPerformerDate() {
        return examPerformerDate;
    }

    /**
     * 设置检查的执行时间（检验项目执行当日的公元纪年日期的完整描述）
     *
     * @param examPerformerDate 检查的执行时间（检验项目执行当日的公元纪年日期的完整描述）
     */
    public void setExamPerformerDate(String examPerformerDate) {
        this.examPerformerDate = examPerformerDate == null ? null : examPerformerDate.trim();
    }

    /**
     * 获取临床诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @return OUTPAT_DIAG_NAME - 临床诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public String getOutpatDiagName() {
        return outpatDiagName;
    }

    /**
     * 设置临床诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @param outpatDiagName 临床诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public void setOutpatDiagName(String outpatDiagName) {
        this.outpatDiagName = outpatDiagName == null ? null : outpatDiagName.trim();
    }

    /**
     * 获取是否异常2否 1是（检验/检查结果是否异常的标志）
     *
     * @return IS_ABNORMAL - 是否异常2否 1是（检验/检查结果是否异常的标志）
     */
    public Long getIsAbnormal() {
        return isAbnormal;
    }

    /**
     * 设置是否异常2否 1是（检验/检查结果是否异常的标志）
     *
     * @param isAbnormal 是否异常2否 1是（检验/检查结果是否异常的标志）
     */
    public void setIsAbnormal(Long isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    /**
     * 获取检查技师签名（检查技师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return EXAM_TECHNICIAN - 检查技师签名（检查技师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getExamTechnician() {
        return examTechnician;
    }

    /**
     * 设置检查技师签名（检查技师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param examTechnician 检查技师签名（检查技师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setExamTechnician(String examTechnician) {
        this.examTechnician = examTechnician == null ? null : examTechnician.trim();
    }

    /**
     * 获取诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     *
     * @return DIAG_DATE - 诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     */
    public String getDiagDate() {
        return diagDate;
    }

    /**
     * 设置诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     *
     * @param diagDate 诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     */
    public void setDiagDate(String diagDate) {
        this.diagDate = diagDate == null ? null : diagDate.trim();
    }

    /**
     * 获取登记时间（患者进行检查的登记时间）
     *
     * @return REGISTER_DATE - 登记时间（患者进行检查的登记时间）
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * 设置登记时间（患者进行检查的登记时间）
     *
     * @param registerDate 登记时间（患者进行检查的登记时间）
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate == null ? null : registerDate.trim();
    }

    /**
     * 获取登记人（患者进行检查的登记人员姓名）
     *
     * @return REGISTER_OPERATOR - 登记人（患者进行检查的登记人员姓名）
     */
    public String getRegisterOperator() {
        return registerOperator;
    }

    /**
     * 设置登记人（患者进行检查的登记人员姓名）
     *
     * @param registerOperator 登记人（患者进行检查的登记人员姓名）
     */
    public void setRegisterOperator(String registerOperator) {
        this.registerOperator = registerOperator == null ? null : registerOperator.trim();
    }

    /**
     * 获取诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return DIAGNOSE_CODE - 诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getDiagnoseCode() {
        return diagnoseCode;
    }

    /**
     * 设置诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param diagnoseCode 诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode == null ? null : diagnoseCode.trim();
    }

    /**
     * 获取打印时间（检查报告的打印的公元纪年时间）
     *
     * @return PRINT_DATE - 打印时间（检查报告的打印的公元纪年时间）
     */
    public String getPrintDate() {
        return printDate;
    }

    /**
     * 设置打印时间（检查报告的打印的公元纪年时间）
     *
     * @param printDate 打印时间（检查报告的打印的公元纪年时间）
     */
    public void setPrintDate(String printDate) {
        this.printDate = printDate == null ? null : printDate.trim();
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
     * 获取检查的执行科室标识
     *
     * @return PERFORMER_DUID - 检查的执行科室标识
     */
    public String getPerformerDuid() {
        return performerDuid;
    }

    /**
     * 设置检查的执行科室标识
     *
     * @param performerDuid 检查的执行科室标识
     */
    public void setPerformerDuid(String performerDuid) {
        this.performerDuid = performerDuid == null ? null : performerDuid.trim();
    }

    /**
     * 获取申请科室标识
     *
     * @return PARTICIPANT_DUID - 申请科室标识
     */
    public String getParticipantDuid() {
        return participantDuid;
    }

    /**
     * 设置申请科室标识
     *
     * @param participantDuid 申请科室标识
     */
    public void setParticipantDuid(String participantDuid) {
        this.participantDuid = participantDuid == null ? null : participantDuid.trim();
    }

    /**
     * 获取检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
    }

    /**
     * 获取病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别中文名称（本人生理性别的中文名称）
     *
     * @return SEX_CN - 性别中文名称（本人生理性别的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别中文名称（本人生理性别的中文名称）
     *
     * @param sexCn 性别中文名称（本人生理性别的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取病人出生日期（本人出生当日的公元纪年日期）
     *
     * @return BIRTH_DATE - 病人出生日期（本人出生当日的公元纪年日期）
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置病人出生日期（本人出生当日的公元纪年日期）
     *
     * @param birthDate 病人出生日期（本人出生当日的公元纪年日期）
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    /**
     * 获取年龄（指患者的实足年龄，为患者出生后按照日历计算的历法年龄。年龄满 1 周岁的，以实足年龄的相应整数填写；年龄不足 1 周岁的，按照实足年龄的月龄填写，以分数形式表示：分数的整数部分代表实足月龄，分数部分分母为 30，分子为不足 1 个月的天数 ）
     *
     * @return AGE - 年龄（指患者的实足年龄，为患者出生后按照日历计算的历法年龄。年龄满 1 周岁的，以实足年龄的相应整数填写；年龄不足 1 周岁的，按照实足年龄的月龄填写，以分数形式表示：分数的整数部分代表实足月龄，分数部分分母为 30，分子为不足 1 个月的天数 ）
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄（指患者的实足年龄，为患者出生后按照日历计算的历法年龄。年龄满 1 周岁的，以实足年龄的相应整数填写；年龄不足 1 周岁的，按照实足年龄的月龄填写，以分数形式表示：分数的整数部分代表实足月龄，分数部分分母为 30，分子为不足 1 个月的天数 ）
     *
     * @param age 年龄（指患者的实足年龄，为患者出生后按照日历计算的历法年龄。年龄满 1 周岁的，以实足年龄的相应整数填写；年龄不足 1 周岁的，按照实足年龄的月龄填写，以分数形式表示：分数的整数部分代表实足月龄，分数部分分母为 30，分子为不足 1 个月的天数 ）
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     *
     * @return CONTACTS_TEL_NO - 联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     */
    public String getContactsTelNo() {
        return contactsTelNo;
    }

    /**
     * 设置联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     *
     * @param contactsTelNo 联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     */
    public void setContactsTelNo(String contactsTelNo) {
        this.contactsTelNo = contactsTelNo == null ? null : contactsTelNo.trim();
    }

    /**
     * 获取病房号（患者住院期间，所住病房对应的编号）
     *
     * @return ROOM_NO - 病房号（患者住院期间，所住病房对应的编号）
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置病房号（患者住院期间，所住病房对应的编号）
     *
     * @param roomNo 病房号（患者住院期间，所住病房对应的编号）
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * 获取病床号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 病床号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置病床号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 病床号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取是否大型设备检查
     *
     * @return IS_BIGDEVICE - 是否大型设备检查
     */
    public Long getIsBigdevice() {
        return isBigdevice;
    }

    /**
     * 设置是否大型设备检查
     *
     * @param isBigdevice 是否大型设备检查
     */
    public void setIsBigdevice(Long isBigdevice) {
        this.isBigdevice = isBigdevice;
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
     * @return CHIEF_COMPLAINTS
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * @param chiefComplaints
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * @return SYMPTON_DESC
     */
    public String getSymptonDesc() {
        return symptonDesc;
    }

    /**
     * @param symptonDesc
     */
    public void setSymptonDesc(String symptonDesc) {
        this.symptonDesc = symptonDesc == null ? null : symptonDesc.trim();
    }

    /**
     * @return TREATMENT_PROCESS_DESC
     */
    public String getTreatmentProcessDesc() {
        return treatmentProcessDesc;
    }

    /**
     * @param treatmentProcessDesc
     */
    public void setTreatmentProcessDesc(String treatmentProcessDesc) {
        this.treatmentProcessDesc = treatmentProcessDesc == null ? null : treatmentProcessDesc.trim();
    }

    /**
     * @return EXAM_PURPOSE
     */
    public String getExamPurpose() {
        return examPurpose;
    }

    /**
     * @param examPurpose
     */
    public void setExamPurpose(String examPurpose) {
        this.examPurpose = examPurpose == null ? null : examPurpose.trim();
    }

    /**
     * @return IMAGE_DESCR
     */
    public String getImageDescr() {
        return imageDescr;
    }

    /**
     * @param imageDescr
     */
    public void setImageDescr(String imageDescr) {
        this.imageDescr = imageDescr == null ? null : imageDescr.trim();
    }

    /**
     * @return CONCLUSION
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * @param conclusion
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    /**
     * @return DIAGNOSE_NAME
     */
    public String getDiagnoseName() {
        return diagnoseName;
    }

    /**
     * @param diagnoseName
     */
    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName == null ? null : diagnoseName.trim();
    }

    /**
     * 获取检查设备
     *
     * @return M_DEVICE - 检查设备
     */
    public String getmDevice() {
        return mDevice;
    }

    /**
     * 设置检查设备
     *
     * @param mDevice 检查设备
     */
    public void setmDevice(String mDevice) {
        this.mDevice = mDevice == null ? null : mDevice.trim();
    }

    /**
     * 获取肉眼所见（对肉眼所见的详细情况描述）
     *
     * @return EYES_DESCR - 肉眼所见（对肉眼所见的详细情况描述）
     */
    public String getEyesDescr() {
        return eyesDescr;
    }

    /**
     * 设置肉眼所见（对肉眼所见的详细情况描述）
     *
     * @param eyesDescr 肉眼所见（对肉眼所见的详细情况描述）
     */
    public void setEyesDescr(String eyesDescr) {
        this.eyesDescr = eyesDescr == null ? null : eyesDescr.trim();
    }

    /**
     * 获取报告者对此份报告提出的建议或意见
     *
     * @return EXAM_ADVISE - 报告者对此份报告提出的建议或意见
     */
    public String getExamAdvise() {
        return examAdvise;
    }

    /**
     * 设置报告者对此份报告提出的建议或意见
     *
     * @param examAdvise 报告者对此份报告提出的建议或意见
     */
    public void setExamAdvise(String examAdvise) {
        this.examAdvise = examAdvise == null ? null : examAdvise.trim();
    }

    /**
     * 获取影像编号，特定系统显示的编号。例如（US457977）
     *
     * @return EXAM_NUM - 影像编号，特定系统显示的编号。例如（US457977）
     */
    public String getExamNum() {
        return examNum;
    }

    /**
     * 设置影像编号，特定系统显示的编号。例如（US457977）
     *
     * @param examNum 影像编号，特定系统显示的编号。例如（US457977）
     */
    public void setExamNum(String examNum) {
        this.examNum = examNum == null ? null : examNum.trim();
    }

    /**
     * 获取特殊的检查编号，各类检查报告特有的编号。例如“年月日+”（202007010001）
     *
     * @return EXAM_SPECIAL_NUM - 特殊的检查编号，各类检查报告特有的编号。例如“年月日+”（202007010001）
     */
    public String getExamSpecialNum() {
        return examSpecialNum;
    }

    /**
     * 设置特殊的检查编号，各类检查报告特有的编号。例如“年月日+”（202007010001）
     *
     * @param examSpecialNum 特殊的检查编号，各类检查报告特有的编号。例如“年月日+”（202007010001）
     */
    public void setExamSpecialNum(String examSpecialNum) {
        this.examSpecialNum = examSpecialNum == null ? null : examSpecialNum.trim();
    }

    /**
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * @return EVENT_NO
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * @param eventNo
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * @return PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * @return EVENT_TYPE
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * @return EVENT_TYPE_CN
     */
    public String getEventTypeCn() {
        return eventTypeCn;
    }

    /**
     * @param eventTypeCn
     */
    public void setEventTypeCn(String eventTypeCn) {
        this.eventTypeCn = eventTypeCn == null ? null : eventTypeCn.trim();
    }
}