package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EHR_INSPECTION_REPORT")
public class EhrInspectionReport {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    /**
     * 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 联系人电话号码（指联系人的联系电话号码，包括国际、国内区号和分机号 ）
     */
    @Column(name = "CONTACTS_TEL_NO")
    private String contactsTelNo;

    /**
     * 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

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
     * 主诉（对患者本次疾病相关的主要症状及其持续时间的描述，一般由患者本人或监护人描述）
     */
    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

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
     * 症状描述（对患者出现症状的详细描述）
     */
    @Column(name = "SYMPTON_DESC")
    private String symptonDesc;

    /**
     * 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    @Column(name = "SPECIAL_EXAM_MARK")
    private String specialExamMark;

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
     * 介入物名称（实施手术操作时使用/放置的材料/药物的名称）
     */
    @Column(name = "INTERVENTION")
    private String intervention;

    /**
     * 操作方法描述（操作方法的详细描述）
     */
    @Column(name = "OPERATION_WAY_DESC")
    private String operationWayDesc;

    /**
     * 操作次数（实施操作的次数）
     */
    @Column(name = "OPERATION_COUNT")
    private BigDecimal operationCount;

    /**
     * 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANES_WAY_CODE")
    private String anesWayCode;

    /**
     * 实施麻醉方法名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的名称）
     */
    @Column(name = "ANES_WAY_NAME")
    private String anesWayName;

    /**
     * 麻醉观察结果（多个麻醉观察项目结果的详细描述）
     */
    @Column(name = "ANES_OBSERVATION")
    private String anesObservation;

    /**
     * 麻醉中西医标识代码DIR_NARCOSIS_MARK（麻醉方法的中西医类别的分类代码）
     */
    @Column(name = "ANES_CLASS_CODE")
    private String anesClassCode;

    /**
     * 麻醉中西医标识名称（麻醉方法的中西医类别的分类名称）
     */
    @Column(name = "ANES_CLASS_NAME")
    private String anesClassName;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREATMENT_PROCESS_DESC")
    private String treatmentProcessDesc;

    /**
     * 标本类别描述（在检查过程中采集标本时，对标本类别的描述，例如胃镜检查时需要做病理分析的活检标本"胃体"）
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
     * 检查分类的标准编码DIR_TREATMENT_TYPE（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     */
    @Column(name = "CLASS_TYPE_CODE")
    private String classTypeCode;

    /**
     * 检查分类的标准名称（受检者检查/检验项目所属的类别的详细描述）
     */
    @Column(name = "CLASS_TYPE_NAME")
    private String classTypeName;

    /**
     * 检查部位的标准编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    @Column(name = "EXAM_SITE_CODE")
    private String examSiteCode;

    /**
     * 检查部位的标准名称（检查（含病理）的人体部位在特定编码体系中的名称）
     */
    @Column(name = "EXAM_SITE_NAME")
    private String examSiteName;

    /**
     * 检查项目的标准编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     */
    @Column(name = "EXAM_ITEM_CODE")
    private String examItemCode;

    /**
     * 检查项目的标准名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    @Column(name = "EXAM_ITEM_NAME")
    private String examItemName;

    /**
     * 检查结果代码DIR_EXAMINE_RESULT（患者检查结果的分类代码）
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
    private BigDecimal examQuantitiveResult;

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
     * 申请科室代码DIR_DEPT（申请检查的科室代码）
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
     * 检查的执行科室代码DIR_DEPT（执行检查的科室代码）
     */
    @Column(name = "PERFORMER_DEPT_CODE")
    private String performerDeptCode;

    /**
     * 检查的执行科室名称（执行检查的科室名称）
     */
    @Column(name = "PERFORMER_DEPT_NAME")
    private String performerDeptName;

    /**
     * 检查的执行医生（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORMER_DOCTOR")
    private String performerDoctor;

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
     * 检查目的（执行此项检查的目的详细描述）
     */
    @Column(name = "EXAM_PURPOSE")
    private String examPurpose;

    /**
     * 影像所见（对影响所见的详细情况描述）
     */
    @Column(name = "IMAGE_DESCR")
    private String imageDescr;

    /**
     * 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    @Column(name = "IS_ABNORMAL")
    private String isAbnormal;

    /**
     * 影像结论（对影像结果的结论描述）
     */
    @Column(name = "CONCLUSION")
    private String conclusion;

    /**
     * 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANES_DOCTOR")
    private String anesDoctor;

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
     * 诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    @Column(name = "DIAGNOSE_NAME")
    private String diagnoseName;

    /**
     * 打印时间（检查报告的打印的公元纪年时间）
     */
    @Column(name = "PRINT_DATE")
    private String printDate;

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
    @Column(name = "CREATE_TIME")
    private String createTime;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    /**
     * 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    /**
     * 肉眼所见（对肉眼所见的详细情况描述）
     */
    @Column(name = "EYES_DESCR")
    private String eyesDescr;

    /**
     * 检查设备
     */
    @Column(name = "M_DEVICE")
    private String mDevice;

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
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
    }

    /**
     * 获取患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @return EVENT_TYPE - 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @param eventType 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * 获取本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
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
     * 获取事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @return EVENT_TYPE_CN - 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public String getEventTypeCn() {
        return eventTypeCn;
    }

    /**
     * 设置事件类型名称（患者就诊类型的的分类中文名称）
     *
     * @param eventTypeCn 事件类型名称（患者就诊类型的的分类中文名称）
     */
    public void setEventTypeCn(String eventTypeCn) {
        this.eventTypeCn = eventTypeCn == null ? null : eventTypeCn.trim();
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
     * 获取年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE - 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param age 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
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
     * 获取科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @return DEPT_CODE - 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     *
     * @param deptCode 科室编码DIR_DEPT（患者在医疗机构就诊的科室编码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
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
     * 获取症状描述（对患者出现症状的详细描述）
     *
     * @return SYMPTON_DESC - 症状描述（对患者出现症状的详细描述）
     */
    public String getSymptonDesc() {
        return symptonDesc;
    }

    /**
     * 设置症状描述（对患者出现症状的详细描述）
     *
     * @param symptonDesc 症状描述（对患者出现症状的详细描述）
     */
    public void setSymptonDesc(String symptonDesc) {
        this.symptonDesc = symptonDesc == null ? null : symptonDesc.trim();
    }

    /**
     * 获取特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     *
     * @return SPECIAL_EXAM_MARK - 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    public String getSpecialExamMark() {
        return specialExamMark;
    }

    /**
     * 设置特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     *
     * @param specialExamMark 特殊检查标志0否 1是（标识患者有无特殊检查操作经历的标志）
     */
    public void setSpecialExamMark(String specialExamMark) {
        this.specialExamMark = specialExamMark == null ? null : specialExamMark.trim();
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
     * 获取操作方法描述（操作方法的详细描述）
     *
     * @return OPERATION_WAY_DESC - 操作方法描述（操作方法的详细描述）
     */
    public String getOperationWayDesc() {
        return operationWayDesc;
    }

    /**
     * 设置操作方法描述（操作方法的详细描述）
     *
     * @param operationWayDesc 操作方法描述（操作方法的详细描述）
     */
    public void setOperationWayDesc(String operationWayDesc) {
        this.operationWayDesc = operationWayDesc == null ? null : operationWayDesc.trim();
    }

    /**
     * 获取操作次数（实施操作的次数）
     *
     * @return OPERATION_COUNT - 操作次数（实施操作的次数）
     */
    public BigDecimal getOperationCount() {
        return operationCount;
    }

    /**
     * 设置操作次数（实施操作的次数）
     *
     * @param operationCount 操作次数（实施操作的次数）
     */
    public void setOperationCount(BigDecimal operationCount) {
        this.operationCount = operationCount;
    }

    /**
     * 获取实施麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANES_WAY_CODE - 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesWayCode() {
        return anesWayCode;
    }

    /**
     * 设置实施麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesWayCode 实施麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesWayCode(String anesWayCode) {
        this.anesWayCode = anesWayCode == null ? null : anesWayCode.trim();
    }

    /**
     * 获取实施麻醉方法名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的名称）
     *
     * @return ANES_WAY_NAME - 实施麻醉方法名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的名称）
     */
    public String getAnesWayName() {
        return anesWayName;
    }

    /**
     * 设置实施麻醉方法名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的名称）
     *
     * @param anesWayName 实施麻醉方法名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的名称）
     */
    public void setAnesWayName(String anesWayName) {
        this.anesWayName = anesWayName == null ? null : anesWayName.trim();
    }

    /**
     * 获取麻醉观察结果（多个麻醉观察项目结果的详细描述）
     *
     * @return ANES_OBSERVATION - 麻醉观察结果（多个麻醉观察项目结果的详细描述）
     */
    public String getAnesObservation() {
        return anesObservation;
    }

    /**
     * 设置麻醉观察结果（多个麻醉观察项目结果的详细描述）
     *
     * @param anesObservation 麻醉观察结果（多个麻醉观察项目结果的详细描述）
     */
    public void setAnesObservation(String anesObservation) {
        this.anesObservation = anesObservation == null ? null : anesObservation.trim();
    }

    /**
     * 获取麻醉中西医标识代码DIR_NARCOSIS_MARK（麻醉方法的中西医类别的分类代码）
     *
     * @return ANES_CLASS_CODE - 麻醉中西医标识代码DIR_NARCOSIS_MARK（麻醉方法的中西医类别的分类代码）
     */
    public String getAnesClassCode() {
        return anesClassCode;
    }

    /**
     * 设置麻醉中西医标识代码DIR_NARCOSIS_MARK（麻醉方法的中西医类别的分类代码）
     *
     * @param anesClassCode 麻醉中西医标识代码DIR_NARCOSIS_MARK（麻醉方法的中西医类别的分类代码）
     */
    public void setAnesClassCode(String anesClassCode) {
        this.anesClassCode = anesClassCode == null ? null : anesClassCode.trim();
    }

    /**
     * 获取麻醉中西医标识名称（麻醉方法的中西医类别的分类名称）
     *
     * @return ANES_CLASS_NAME - 麻醉中西医标识名称（麻醉方法的中西医类别的分类名称）
     */
    public String getAnesClassName() {
        return anesClassName;
    }

    /**
     * 设置麻醉中西医标识名称（麻醉方法的中西医类别的分类名称）
     *
     * @param anesClassName 麻醉中西医标识名称（麻醉方法的中西医类别的分类名称）
     */
    public void setAnesClassName(String anesClassName) {
        this.anesClassName = anesClassName == null ? null : anesClassName.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREATMENT_PROCESS_DESC - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatmentProcessDesc() {
        return treatmentProcessDesc;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatmentProcessDesc 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatmentProcessDesc(String treatmentProcessDesc) {
        this.treatmentProcessDesc = treatmentProcessDesc == null ? null : treatmentProcessDesc.trim();
    }

    /**
     * 获取标本类别描述（在检查过程中采集标本时，对标本类别的描述，例如胃镜检查时需要做病理分析的活检标本"胃体"）
     *
     * @return SPECIMEN_CLASS - 标本类别描述（在检查过程中采集标本时，对标本类别的描述，例如胃镜检查时需要做病理分析的活检标本"胃体"）
     */
    public String getSpecimenClass() {
        return specimenClass;
    }

    /**
     * 设置标本类别描述（在检查过程中采集标本时，对标本类别的描述，例如胃镜检查时需要做病理分析的活检标本"胃体"）
     *
     * @param specimenClass 标本类别描述（在检查过程中采集标本时，对标本类别的描述，例如胃镜检查时需要做病理分析的活检标本"胃体"）
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
     * 获取检查分类的标准编码DIR_TREATMENT_TYPE（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     *
     * @return CLASS_TYPE_CODE - 检查分类的标准编码DIR_TREATMENT_TYPE（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     */
    public String getClassTypeCode() {
        return classTypeCode;
    }

    /**
     * 设置检查分类的标准编码DIR_TREATMENT_TYPE（受检者检查/检验项目所属的类别在特定编码体系中的代码）
     *
     * @param classTypeCode 检查分类的标准编码DIR_TREATMENT_TYPE（受检者检查/检验项目所属的类别在特定编码体系中的代码）
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
     * 获取检查部位的标准编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @return EXAM_SITE_CODE - 检查部位的标准编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public String getExamSiteCode() {
        return examSiteCode;
    }

    /**
     * 设置检查部位的标准编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @param examSiteCode 检查部位的标准编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
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
     * 获取检查项目的标准编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     *
     * @return EXAM_ITEM_CODE - 检查项目的标准编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     */
    public String getExamItemCode() {
        return examItemCode;
    }

    /**
     * 设置检查项目的标准编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
     *
     * @param examItemCode 检查项目的标准编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码,如LOINC的代码值）
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
     * 获取检查结果代码DIR_EXAMINE_RESULT（患者检查结果的分类代码）
     *
     * @return EXAM_RESULT_CODE - 检查结果代码DIR_EXAMINE_RESULT（患者检查结果的分类代码）
     */
    public String getExamResultCode() {
        return examResultCode;
    }

    /**
     * 设置检查结果代码DIR_EXAMINE_RESULT（患者检查结果的分类代码）
     *
     * @param examResultCode 检查结果代码DIR_EXAMINE_RESULT（患者检查结果的分类代码）
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
    public BigDecimal getExamQuantitiveResult() {
        return examQuantitiveResult;
    }

    /**
     * 设置检查定量结果（患者检查结果的测量值（定量））
     *
     * @param examQuantitiveResult 检查定量结果（患者检查结果的测量值（定量））
     */
    public void setExamQuantitiveResult(BigDecimal examQuantitiveResult) {
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
     * 获取申请科室代码DIR_DEPT（申请检查的科室代码）
     *
     * @return PARTICIPANT_DEPT_CODE - 申请科室代码DIR_DEPT（申请检查的科室代码）
     */
    public String getParticipantDeptCode() {
        return participantDeptCode;
    }

    /**
     * 设置申请科室代码DIR_DEPT（申请检查的科室代码）
     *
     * @param participantDeptCode 申请科室代码DIR_DEPT（申请检查的科室代码）
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
     * 获取检查的执行科室代码DIR_DEPT（执行检查的科室代码）
     *
     * @return PERFORMER_DEPT_CODE - 检查的执行科室代码DIR_DEPT（执行检查的科室代码）
     */
    public String getPerformerDeptCode() {
        return performerDeptCode;
    }

    /**
     * 设置检查的执行科室代码DIR_DEPT（执行检查的科室代码）
     *
     * @param performerDeptCode 检查的执行科室代码DIR_DEPT（执行检查的科室代码）
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
     * 获取检查的执行医生（检查人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORMER_DOCTOR - 检查的执行医生（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformerDoctor() {
        return performerDoctor;
    }

    /**
     * 设置检查的执行医生（检查人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param performerDoctor 检查的执行医生（检查人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformerDoctor(String performerDoctor) {
        this.performerDoctor = performerDoctor == null ? null : performerDoctor.trim();
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
     * 获取检查目的（执行此项检查的目的详细描述）
     *
     * @return EXAM_PURPOSE - 检查目的（执行此项检查的目的详细描述）
     */
    public String getExamPurpose() {
        return examPurpose;
    }

    /**
     * 设置检查目的（执行此项检查的目的详细描述）
     *
     * @param examPurpose 检查目的（执行此项检查的目的详细描述）
     */
    public void setExamPurpose(String examPurpose) {
        this.examPurpose = examPurpose == null ? null : examPurpose.trim();
    }

    /**
     * 获取影像所见（对影响所见的详细情况描述）
     *
     * @return IMAGE_DESCR - 影像所见（对影响所见的详细情况描述）
     */
    public String getImageDescr() {
        return imageDescr;
    }

    /**
     * 设置影像所见（对影响所见的详细情况描述）
     *
     * @param imageDescr 影像所见（对影响所见的详细情况描述）
     */
    public void setImageDescr(String imageDescr) {
        this.imageDescr = imageDescr == null ? null : imageDescr.trim();
    }

    /**
     * 获取是否异常0否 1是（检验/检查结果是否异常的标志）
     *
     * @return IS_ABNORMAL - 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    public String getIsAbnormal() {
        return isAbnormal;
    }

    /**
     * 设置是否异常0否 1是（检验/检查结果是否异常的标志）
     *
     * @param isAbnormal 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    public void setIsAbnormal(String isAbnormal) {
        this.isAbnormal = isAbnormal == null ? null : isAbnormal.trim();
    }

    /**
     * 获取影像结论（对影像结果的结论描述）
     *
     * @return CONCLUSION - 影像结论（对影像结果的结论描述）
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * 设置影像结论（对影像结果的结论描述）
     *
     * @param conclusion 影像结论（对影像结果的结论描述）
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    /**
     * 获取麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANES_DOCTOR - 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesDoctor() {
        return anesDoctor;
    }

    /**
     * 设置麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesDoctor 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesDoctor(String anesDoctor) {
        this.anesDoctor = anesDoctor == null ? null : anesDoctor.trim();
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
     * 获取诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @return DIAGNOSE_NAME - 诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public String getDiagnoseName() {
        return diagnoseName;
    }

    /**
     * 设置诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @param diagnoseName 诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName == null ? null : diagnoseName.trim();
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
     * @return CREATE_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param createTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
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
     * 获取有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效  0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * 获取系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @return SYSUP_TIME - 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * 设置系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     *
     * @param sysupTime 系统修改时间YYYY/MM/DD HH24:MI:SS（数据采集做更新的最后更新时间）
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * 获取数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @return SYSCR_TIME - 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * 设置数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     *
     * @param syscrTime 数据采集入库时间YYYY/MM/DD HH24:MI:SS（默认sysdate）
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
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
}