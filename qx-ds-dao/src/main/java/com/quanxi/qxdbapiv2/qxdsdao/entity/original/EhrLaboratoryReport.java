package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EHR_LABORATORY_REPORT")
public class EhrLaboratoryReport {
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
     * 检验报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
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
     * 归档检索日期（文档归档的当日的公元纪年日期）
     */
    @Column(name = "RETRIEVE_DATE")
    private String retrieveDate;

    /**
     * 检验报告的分类的编码DIR_LAB_EXAM_TYPE（受检者检查/检验项目在特定编码体系中的代码）
     */
    @Column(name = "CATALOG_CODE")
    private String catalogCode;

    /**
     * 检验报告的分类的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    @Column(name = "CATALOG_NAME")
    private String catalogName;

    /**
     * 报告的标题（文档报告的标题）
     */
    @Column(name = "REPORT_TITLE")
    private String reportTitle;

    /**
     * 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    @Column(name = "EFFECTIVE_DTIME")
    private String effectiveDtime;

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
     * 检查标本号（按照某一特定编码规则赋予检查标本的顺序号）
     */
    @Column(name = "SPECIMEN_NO")
    private String specimenNo;

    /**
     * 标本类别描述（对标本类别的描述）
     */
    @Column(name = "SPECIMEN_CLASS")
    private String specimenClass;

    /**
     * 标本采集部位代码DIR_SPECIMEN_DETERMINER（检验标本采集部位在特定编码体系中的代码）
     */
    @Column(name = "SPECIMEN_DETERMINER_CODE")
    private String specimenDeterminerCode;

    /**
     * 标本采集部位名称（检验标本采集部位在特定编码体系中的名称）
     */
    @Column(name = "SPECIMEN_DETERMINER_NAME")
    private String specimenDeterminerName;

    /**
     * 标本危险程度代码DIR_SPECIMEN_RISK（描述检验标本的危险程度情况代码）
     */
    @Column(name = "SPECIMEN_RISK_CODE")
    private String specimenRiskCode;

    /**
     * 标本危险程度名称（描述检验标本的危险程度情况名称）
     */
    @Column(name = "SPECIMEN_RISK_NAME")
    private String specimenRiskName;

    /**
     * 标本质量代码DIR_SAMPLE_QUATY（新生儿疾病筛查采取的血片标本质量是否合格代码）
     */
    @Column(name = "SPECIMEN_QUANTITY_CODE")
    private String specimenQuantityCode;

    /**
     * 标本质量名称（新生儿疾病筛查采取的血片标本质量是否合格名称）
     */
    @Column(name = "SPECIMEN_QUANTITY_NAME")
    private String specimenQuantityName;

    /**
     * 标本拒绝原因代码DIR_SPECIMEN_REJECT_REASON（拒绝采用此标本的原因详细描述代码）
     */
    @Column(name = "SPECIMEN_REJECTREASON_CD")
    private String specimenRejectreasonCd;

    /**
     * 标本拒绝原因名称（拒绝采用此标本的原因详细描述名称）
     */
    @Column(name = "SPECIMEN_REJECTREASON_NM")
    private String specimenRejectreasonNm;

    /**
     * 检验的执行科室代码DIR_DEPT（执行检查/检验的科室代码）
     */
    @Column(name = "PERFORMER_DEPT_CODE")
    private String performerDeptCode;

    /**
     * 检验的执行科室名称（执行检查/检验的科室名称）
     */
    @Column(name = "PERFORMER_DEPT_NAME")
    private String performerDeptName;

    /**
     * 检验的执行医生（执行校验的医务人员在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORMER_DOCTOR")
    private String performerDoctor;

    /**
     * 检验的执行时间（实际执行检验操作当日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAB_PERFORMER_DATE")
    private String labPerformerDate;

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
     * 诊断机构名称（对患者所患疾病作出诊断的医疗机构的组织机构名称）
     */
    @Column(name = "DIAG_ORG_NAME")
    private String diagOrgName;

    /**
     * 诊断日期（对患者所患疾病做出诊断时当日的公元纪年日期的完整描述）
     */
    @Column(name = "DIAG_DATE")
    private String diagDate;

    /**
     * 标本状态（对受检标本状态的描述）
     */
    @Column(name = "SPECIMEN_STATUS")
    private String specimenStatus;

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
     * 检验方法名称（患者接受医学检查项目所采用的检验方法名称）
     */
    @Column(name = "LAB_METHOD_NAME")
    private String labMethodName;

    /**
     * 标本名称（检验采集标本的名称）
     */
    @Column(name = "SPECIMEN_NAME")
    private String specimenName;

    /**
     * 检验仪器（进行检验操作的仪器的描述）
     */
    @Column(name = "LAB_INSTRUMENT")
    private String labInstrument;

    /**
     * 检验目的（对患者进行检验的目的描述）
     */
    @Column(name = "LAB_PURPOSE")
    private String labPurpose;

    /**
     * 采样人（标本采集人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SPECIMEN_COLLECT_OPERATOR")
    private String specimenCollectOperator;

    /**
     * 接收人（标本接收人员在在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SPECIMEN_ACCEPT_OPERATOR")
    private String specimenAcceptOperator;

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
     * 打印报告类别名称,报告打印的格式（例如生化报告、药敏报告、过敏报告）
     */
    @Column(name = "PRINT_REPORT_TYPE")
    private String printReportType;

    /**
     * 报告打印的格式所对应的代码
     */
    @Column(name = "PRINT_REPORT_TYPE_CODE")
    private String printReportTypeCode;

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
     * 获取检验报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 检验报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置检验报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 检验报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
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
     * 获取检验报告的分类的编码DIR_LAB_EXAM_TYPE（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @return CATALOG_CODE - 检验报告的分类的编码DIR_LAB_EXAM_TYPE（受检者检查/检验项目在特定编码体系中的代码）
     */
    public String getCatalogCode() {
        return catalogCode;
    }

    /**
     * 设置检验报告的分类的编码DIR_LAB_EXAM_TYPE（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @param catalogCode 检验报告的分类的编码DIR_LAB_EXAM_TYPE（受检者检查/检验项目在特定编码体系中的代码）
     */
    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode == null ? null : catalogCode.trim();
    }

    /**
     * 获取检验报告的分类的名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @return CATALOG_NAME - 检验报告的分类的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * 设置检验报告的分类的名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @param catalogName 检验报告的分类的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
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
     * @return EFFECTIVE_DTIME - 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public String getEffectiveDtime() {
        return effectiveDtime;
    }

    /**
     * 设置文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     *
     * @param effectiveDtime 文档创建时间（为服务对象建立相关档案当日的公元纪年日期）
     */
    public void setEffectiveDtime(String effectiveDtime) {
        this.effectiveDtime = effectiveDtime == null ? null : effectiveDtime.trim();
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
     * 获取标本采集部位代码DIR_SPECIMEN_DETERMINER（检验标本采集部位在特定编码体系中的代码）
     *
     * @return SPECIMEN_DETERMINER_CODE - 标本采集部位代码DIR_SPECIMEN_DETERMINER（检验标本采集部位在特定编码体系中的代码）
     */
    public String getSpecimenDeterminerCode() {
        return specimenDeterminerCode;
    }

    /**
     * 设置标本采集部位代码DIR_SPECIMEN_DETERMINER（检验标本采集部位在特定编码体系中的代码）
     *
     * @param specimenDeterminerCode 标本采集部位代码DIR_SPECIMEN_DETERMINER（检验标本采集部位在特定编码体系中的代码）
     */
    public void setSpecimenDeterminerCode(String specimenDeterminerCode) {
        this.specimenDeterminerCode = specimenDeterminerCode == null ? null : specimenDeterminerCode.trim();
    }

    /**
     * 获取标本采集部位名称（检验标本采集部位在特定编码体系中的名称）
     *
     * @return SPECIMEN_DETERMINER_NAME - 标本采集部位名称（检验标本采集部位在特定编码体系中的名称）
     */
    public String getSpecimenDeterminerName() {
        return specimenDeterminerName;
    }

    /**
     * 设置标本采集部位名称（检验标本采集部位在特定编码体系中的名称）
     *
     * @param specimenDeterminerName 标本采集部位名称（检验标本采集部位在特定编码体系中的名称）
     */
    public void setSpecimenDeterminerName(String specimenDeterminerName) {
        this.specimenDeterminerName = specimenDeterminerName == null ? null : specimenDeterminerName.trim();
    }

    /**
     * 获取标本危险程度代码DIR_SPECIMEN_RISK（描述检验标本的危险程度情况代码）
     *
     * @return SPECIMEN_RISK_CODE - 标本危险程度代码DIR_SPECIMEN_RISK（描述检验标本的危险程度情况代码）
     */
    public String getSpecimenRiskCode() {
        return specimenRiskCode;
    }

    /**
     * 设置标本危险程度代码DIR_SPECIMEN_RISK（描述检验标本的危险程度情况代码）
     *
     * @param specimenRiskCode 标本危险程度代码DIR_SPECIMEN_RISK（描述检验标本的危险程度情况代码）
     */
    public void setSpecimenRiskCode(String specimenRiskCode) {
        this.specimenRiskCode = specimenRiskCode == null ? null : specimenRiskCode.trim();
    }

    /**
     * 获取标本危险程度名称（描述检验标本的危险程度情况名称）
     *
     * @return SPECIMEN_RISK_NAME - 标本危险程度名称（描述检验标本的危险程度情况名称）
     */
    public String getSpecimenRiskName() {
        return specimenRiskName;
    }

    /**
     * 设置标本危险程度名称（描述检验标本的危险程度情况名称）
     *
     * @param specimenRiskName 标本危险程度名称（描述检验标本的危险程度情况名称）
     */
    public void setSpecimenRiskName(String specimenRiskName) {
        this.specimenRiskName = specimenRiskName == null ? null : specimenRiskName.trim();
    }

    /**
     * 获取标本质量代码DIR_SAMPLE_QUATY（新生儿疾病筛查采取的血片标本质量是否合格代码）
     *
     * @return SPECIMEN_QUANTITY_CODE - 标本质量代码DIR_SAMPLE_QUATY（新生儿疾病筛查采取的血片标本质量是否合格代码）
     */
    public String getSpecimenQuantityCode() {
        return specimenQuantityCode;
    }

    /**
     * 设置标本质量代码DIR_SAMPLE_QUATY（新生儿疾病筛查采取的血片标本质量是否合格代码）
     *
     * @param specimenQuantityCode 标本质量代码DIR_SAMPLE_QUATY（新生儿疾病筛查采取的血片标本质量是否合格代码）
     */
    public void setSpecimenQuantityCode(String specimenQuantityCode) {
        this.specimenQuantityCode = specimenQuantityCode == null ? null : specimenQuantityCode.trim();
    }

    /**
     * 获取标本质量名称（新生儿疾病筛查采取的血片标本质量是否合格名称）
     *
     * @return SPECIMEN_QUANTITY_NAME - 标本质量名称（新生儿疾病筛查采取的血片标本质量是否合格名称）
     */
    public String getSpecimenQuantityName() {
        return specimenQuantityName;
    }

    /**
     * 设置标本质量名称（新生儿疾病筛查采取的血片标本质量是否合格名称）
     *
     * @param specimenQuantityName 标本质量名称（新生儿疾病筛查采取的血片标本质量是否合格名称）
     */
    public void setSpecimenQuantityName(String specimenQuantityName) {
        this.specimenQuantityName = specimenQuantityName == null ? null : specimenQuantityName.trim();
    }

    /**
     * 获取标本拒绝原因代码DIR_SPECIMEN_REJECT_REASON（拒绝采用此标本的原因详细描述代码）
     *
     * @return SPECIMEN_REJECTREASON_CD - 标本拒绝原因代码DIR_SPECIMEN_REJECT_REASON（拒绝采用此标本的原因详细描述代码）
     */
    public String getSpecimenRejectreasonCd() {
        return specimenRejectreasonCd;
    }

    /**
     * 设置标本拒绝原因代码DIR_SPECIMEN_REJECT_REASON（拒绝采用此标本的原因详细描述代码）
     *
     * @param specimenRejectreasonCd 标本拒绝原因代码DIR_SPECIMEN_REJECT_REASON（拒绝采用此标本的原因详细描述代码）
     */
    public void setSpecimenRejectreasonCd(String specimenRejectreasonCd) {
        this.specimenRejectreasonCd = specimenRejectreasonCd == null ? null : specimenRejectreasonCd.trim();
    }

    /**
     * 获取标本拒绝原因名称（拒绝采用此标本的原因详细描述名称）
     *
     * @return SPECIMEN_REJECTREASON_NM - 标本拒绝原因名称（拒绝采用此标本的原因详细描述名称）
     */
    public String getSpecimenRejectreasonNm() {
        return specimenRejectreasonNm;
    }

    /**
     * 设置标本拒绝原因名称（拒绝采用此标本的原因详细描述名称）
     *
     * @param specimenRejectreasonNm 标本拒绝原因名称（拒绝采用此标本的原因详细描述名称）
     */
    public void setSpecimenRejectreasonNm(String specimenRejectreasonNm) {
        this.specimenRejectreasonNm = specimenRejectreasonNm == null ? null : specimenRejectreasonNm.trim();
    }

    /**
     * 获取检验的执行科室代码DIR_DEPT（执行检查/检验的科室代码）
     *
     * @return PERFORMER_DEPT_CODE - 检验的执行科室代码DIR_DEPT（执行检查/检验的科室代码）
     */
    public String getPerformerDeptCode() {
        return performerDeptCode;
    }

    /**
     * 设置检验的执行科室代码DIR_DEPT（执行检查/检验的科室代码）
     *
     * @param performerDeptCode 检验的执行科室代码DIR_DEPT（执行检查/检验的科室代码）
     */
    public void setPerformerDeptCode(String performerDeptCode) {
        this.performerDeptCode = performerDeptCode == null ? null : performerDeptCode.trim();
    }

    /**
     * 获取检验的执行科室名称（执行检查/检验的科室名称）
     *
     * @return PERFORMER_DEPT_NAME - 检验的执行科室名称（执行检查/检验的科室名称）
     */
    public String getPerformerDeptName() {
        return performerDeptName;
    }

    /**
     * 设置检验的执行科室名称（执行检查/检验的科室名称）
     *
     * @param performerDeptName 检验的执行科室名称（执行检查/检验的科室名称）
     */
    public void setPerformerDeptName(String performerDeptName) {
        this.performerDeptName = performerDeptName == null ? null : performerDeptName.trim();
    }

    /**
     * 获取检验的执行医生（执行校验的医务人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORMER_DOCTOR - 检验的执行医生（执行校验的医务人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformerDoctor() {
        return performerDoctor;
    }

    /**
     * 设置检验的执行医生（执行校验的医务人员在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param performerDoctor 检验的执行医生（执行校验的医务人员在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformerDoctor(String performerDoctor) {
        this.performerDoctor = performerDoctor == null ? null : performerDoctor.trim();
    }

    /**
     * 获取检验的执行时间（实际执行检验操作当日的公元纪年日期和时间的完整描述）
     *
     * @return LAB_PERFORMER_DATE - 检验的执行时间（实际执行检验操作当日的公元纪年日期和时间的完整描述）
     */
    public String getLabPerformerDate() {
        return labPerformerDate;
    }

    /**
     * 设置检验的执行时间（实际执行检验操作当日的公元纪年日期和时间的完整描述）
     *
     * @param labPerformerDate 检验的执行时间（实际执行检验操作当日的公元纪年日期和时间的完整描述）
     */
    public void setLabPerformerDate(String labPerformerDate) {
        this.labPerformerDate = labPerformerDate == null ? null : labPerformerDate.trim();
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
     * 获取诊断机构名称（对患者所患疾病作出诊断的医疗机构的组织机构名称）
     *
     * @return DIAG_ORG_NAME - 诊断机构名称（对患者所患疾病作出诊断的医疗机构的组织机构名称）
     */
    public String getDiagOrgName() {
        return diagOrgName;
    }

    /**
     * 设置诊断机构名称（对患者所患疾病作出诊断的医疗机构的组织机构名称）
     *
     * @param diagOrgName 诊断机构名称（对患者所患疾病作出诊断的医疗机构的组织机构名称）
     */
    public void setDiagOrgName(String diagOrgName) {
        this.diagOrgName = diagOrgName == null ? null : diagOrgName.trim();
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
     * 获取检验方法名称（患者接受医学检查项目所采用的检验方法名称）
     *
     * @return LAB_METHOD_NAME - 检验方法名称（患者接受医学检查项目所采用的检验方法名称）
     */
    public String getLabMethodName() {
        return labMethodName;
    }

    /**
     * 设置检验方法名称（患者接受医学检查项目所采用的检验方法名称）
     *
     * @param labMethodName 检验方法名称（患者接受医学检查项目所采用的检验方法名称）
     */
    public void setLabMethodName(String labMethodName) {
        this.labMethodName = labMethodName == null ? null : labMethodName.trim();
    }

    /**
     * 获取标本名称（检验采集标本的名称）
     *
     * @return SPECIMEN_NAME - 标本名称（检验采集标本的名称）
     */
    public String getSpecimenName() {
        return specimenName;
    }

    /**
     * 设置标本名称（检验采集标本的名称）
     *
     * @param specimenName 标本名称（检验采集标本的名称）
     */
    public void setSpecimenName(String specimenName) {
        this.specimenName = specimenName == null ? null : specimenName.trim();
    }

    /**
     * 获取检验仪器（进行检验操作的仪器的描述）
     *
     * @return LAB_INSTRUMENT - 检验仪器（进行检验操作的仪器的描述）
     */
    public String getLabInstrument() {
        return labInstrument;
    }

    /**
     * 设置检验仪器（进行检验操作的仪器的描述）
     *
     * @param labInstrument 检验仪器（进行检验操作的仪器的描述）
     */
    public void setLabInstrument(String labInstrument) {
        this.labInstrument = labInstrument == null ? null : labInstrument.trim();
    }

    /**
     * 获取检验目的（对患者进行检验的目的描述）
     *
     * @return LAB_PURPOSE - 检验目的（对患者进行检验的目的描述）
     */
    public String getLabPurpose() {
        return labPurpose;
    }

    /**
     * 设置检验目的（对患者进行检验的目的描述）
     *
     * @param labPurpose 检验目的（对患者进行检验的目的描述）
     */
    public void setLabPurpose(String labPurpose) {
        this.labPurpose = labPurpose == null ? null : labPurpose.trim();
    }

    /**
     * 获取采样人（标本采集人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SPECIMEN_COLLECT_OPERATOR - 采样人（标本采集人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSpecimenCollectOperator() {
        return specimenCollectOperator;
    }

    /**
     * 设置采样人（标本采集人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param specimenCollectOperator 采样人（标本采集人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSpecimenCollectOperator(String specimenCollectOperator) {
        this.specimenCollectOperator = specimenCollectOperator == null ? null : specimenCollectOperator.trim();
    }

    /**
     * 获取接收人（标本接收人员在在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SPECIMEN_ACCEPT_OPERATOR - 接收人（标本接收人员在在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSpecimenAcceptOperator() {
        return specimenAcceptOperator;
    }

    /**
     * 设置接收人（标本接收人员在在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param specimenAcceptOperator 接收人（标本接收人员在在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSpecimenAcceptOperator(String specimenAcceptOperator) {
        this.specimenAcceptOperator = specimenAcceptOperator == null ? null : specimenAcceptOperator.trim();
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
     * 获取打印报告类别名称,报告打印的格式（例如生化报告、药敏报告、过敏报告）
     *
     * @return PRINT_REPORT_TYPE - 打印报告类别名称,报告打印的格式（例如生化报告、药敏报告、过敏报告）
     */
    public String getPrintReportType() {
        return printReportType;
    }

    /**
     * 设置打印报告类别名称,报告打印的格式（例如生化报告、药敏报告、过敏报告）
     *
     * @param printReportType 打印报告类别名称,报告打印的格式（例如生化报告、药敏报告、过敏报告）
     */
    public void setPrintReportType(String printReportType) {
        this.printReportType = printReportType == null ? null : printReportType.trim();
    }

    /**
     * 获取报告打印的格式所对应的代码
     *
     * @return PRINT_REPORT_TYPE_CODE - 报告打印的格式所对应的代码
     */
    public String getPrintReportTypeCode() {
        return printReportTypeCode;
    }

    /**
     * 设置报告打印的格式所对应的代码
     *
     * @param printReportTypeCode 报告打印的格式所对应的代码
     */
    public void setPrintReportTypeCode(String printReportTypeCode) {
        this.printReportTypeCode = printReportTypeCode == null ? null : printReportTypeCode.trim();
    }
}