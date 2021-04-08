package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_DEATH_CASE_DISCUSSION")
public class EmrDeathCaseDiscussion {
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
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "DEATH_CASE_DISCUSS_ID")
    private String deathCaseDiscussId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    /**
     * 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCUSSION_DATE")
    private String discussionDate;

    /**
     * 讨论地点（患者诊疗相关讨论的地点）
     */
    @Column(name = "DISCUSSION_LOCALTION")
    private String discussionLocaltion;

    /**
     * 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "HOST_NAME")
    private String hostName;

    /**
     * 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    @Column(name = "DISCUSSION_LIST")
    private String discussionList;

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
     * 直接死亡原因编码DIR_DEATH_CATALOG（直接导致患者死亡的最终疾病或原因在特定编码体系中的编码）
     */
    @Column(name = "DIRECT_DEATH_REASON_CODE")
    private String directDeathReasonCode;

    /**
     * 直接死亡原因名称（直接导致患者死亡的最终疾病或原因名称）
     */
    @Column(name = "DIRECT_DEATH_REASON_NAME")
    private String directDeathReasonName;

    /**
     * 死亡诊断编码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    @Column(name = "DEATH_DIAG_CODE")
    private String deathDiagCode;

    /**
     * 死亡诊断名称（导致患者死亡的疾病诊断名称，如果有多个疾病诊断，这里指与其他疾病有因果关系的，并因其发生发展引起其他疾病，最终导致死亡的一系列疾病诊断中最初确定的疾病诊断名称）
     */
    @Column(name = "DEATH_DIAG_NAME")
    private String deathDiagName;

    /**
     * 死亡讨论记录（死亡讨论过程中的具体意见描述）
     */
    @Column(name = "DEATH_DISCUSS_RECORD")
    private String deathDiscussRecord;

    /**
     * 主持人总结意见（主持人就疑难病例讨论过程总结意见的详细描述）
     */
    @Column(name = "HOST_SUMMARY_OPINTION")
    private String hostSummaryOpintion;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 病历模板类别代码（例如：11）
     */
    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    /**
     * 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    /**
     * 病历标题名称（例如：XX主任医师查房记录）
     */
    @Column(name = "EMR_TITLE")
    private String emrTitle;

    /**
     * 病历使用医院模板编号
     */
    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

    /**
     * 病历原文（医院病历的原始内容）
     */
    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

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
     * 获取住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return DEATH_CASE_DISCUSS_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDeathCaseDiscussId() {
        return deathCaseDiscussId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param deathCaseDiscussId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDeathCaseDiscussId(String deathCaseDiscussId) {
        this.deathCaseDiscussId = deathCaseDiscussId == null ? null : deathCaseDiscussId.trim();
    }

    /**
     * 获取病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @return CASE_NO - 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @param caseNo 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @return IN_HOSPITAL_TIMES - 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * 设置住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     *
     * @param inHospitalTimes 住院次数（即“第 次住院”指患者在本医疗机构住院诊治的次数）
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * 获取讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     *
     * @return DISCUSSION_DATE - 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    public String getDiscussionDate() {
        return discussionDate;
    }

    /**
     * 设置讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     *
     * @param discussionDate 讨论日期时间（医学相关讨论结束时的公元纪年日期和时间的完整描述）
     */
    public void setDiscussionDate(String discussionDate) {
        this.discussionDate = discussionDate == null ? null : discussionDate.trim();
    }

    /**
     * 获取讨论地点（患者诊疗相关讨论的地点）
     *
     * @return DISCUSSION_LOCALTION - 讨论地点（患者诊疗相关讨论的地点）
     */
    public String getDiscussionLocaltion() {
        return discussionLocaltion;
    }

    /**
     * 设置讨论地点（患者诊疗相关讨论的地点）
     *
     * @param discussionLocaltion 讨论地点（患者诊疗相关讨论的地点）
     */
    public void setDiscussionLocaltion(String discussionLocaltion) {
        this.discussionLocaltion = discussionLocaltion == null ? null : discussionLocaltion.trim();
    }

    /**
     * 获取主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return HOST_NAME - 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * 设置主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param hostName 主持人姓名（疑难病例讨论的主持人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * 获取参加讨论人员名单（参加术前讨论的人员姓名列表）
     *
     * @return DISCUSSION_LIST - 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    public String getDiscussionList() {
        return discussionList;
    }

    /**
     * 设置参加讨论人员名单（参加术前讨论的人员姓名列表）
     *
     * @param discussionList 参加讨论人员名单（参加术前讨论的人员姓名列表）
     */
    public void setDiscussionList(String discussionList) {
        this.discussionList = discussionList == null ? null : discussionList.trim();
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
     * 获取直接死亡原因编码DIR_DEATH_CATALOG（直接导致患者死亡的最终疾病或原因在特定编码体系中的编码）
     *
     * @return DIRECT_DEATH_REASON_CODE - 直接死亡原因编码DIR_DEATH_CATALOG（直接导致患者死亡的最终疾病或原因在特定编码体系中的编码）
     */
    public String getDirectDeathReasonCode() {
        return directDeathReasonCode;
    }

    /**
     * 设置直接死亡原因编码DIR_DEATH_CATALOG（直接导致患者死亡的最终疾病或原因在特定编码体系中的编码）
     *
     * @param directDeathReasonCode 直接死亡原因编码DIR_DEATH_CATALOG（直接导致患者死亡的最终疾病或原因在特定编码体系中的编码）
     */
    public void setDirectDeathReasonCode(String directDeathReasonCode) {
        this.directDeathReasonCode = directDeathReasonCode == null ? null : directDeathReasonCode.trim();
    }

    /**
     * 获取直接死亡原因名称（直接导致患者死亡的最终疾病或原因名称）
     *
     * @return DIRECT_DEATH_REASON_NAME - 直接死亡原因名称（直接导致患者死亡的最终疾病或原因名称）
     */
    public String getDirectDeathReasonName() {
        return directDeathReasonName;
    }

    /**
     * 设置直接死亡原因名称（直接导致患者死亡的最终疾病或原因名称）
     *
     * @param directDeathReasonName 直接死亡原因名称（直接导致患者死亡的最终疾病或原因名称）
     */
    public void setDirectDeathReasonName(String directDeathReasonName) {
        this.directDeathReasonName = directDeathReasonName == null ? null : directDeathReasonName.trim();
    }

    /**
     * 获取死亡诊断编码ICD-10（死亡诊断在特定编码体系中的编码）
     *
     * @return DEATH_DIAG_CODE - 死亡诊断编码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    public String getDeathDiagCode() {
        return deathDiagCode;
    }

    /**
     * 设置死亡诊断编码ICD-10（死亡诊断在特定编码体系中的编码）
     *
     * @param deathDiagCode 死亡诊断编码ICD-10（死亡诊断在特定编码体系中的编码）
     */
    public void setDeathDiagCode(String deathDiagCode) {
        this.deathDiagCode = deathDiagCode == null ? null : deathDiagCode.trim();
    }

    /**
     * 获取死亡诊断名称（导致患者死亡的疾病诊断名称，如果有多个疾病诊断，这里指与其他疾病有因果关系的，并因其发生发展引起其他疾病，最终导致死亡的一系列疾病诊断中最初确定的疾病诊断名称）
     *
     * @return DEATH_DIAG_NAME - 死亡诊断名称（导致患者死亡的疾病诊断名称，如果有多个疾病诊断，这里指与其他疾病有因果关系的，并因其发生发展引起其他疾病，最终导致死亡的一系列疾病诊断中最初确定的疾病诊断名称）
     */
    public String getDeathDiagName() {
        return deathDiagName;
    }

    /**
     * 设置死亡诊断名称（导致患者死亡的疾病诊断名称，如果有多个疾病诊断，这里指与其他疾病有因果关系的，并因其发生发展引起其他疾病，最终导致死亡的一系列疾病诊断中最初确定的疾病诊断名称）
     *
     * @param deathDiagName 死亡诊断名称（导致患者死亡的疾病诊断名称，如果有多个疾病诊断，这里指与其他疾病有因果关系的，并因其发生发展引起其他疾病，最终导致死亡的一系列疾病诊断中最初确定的疾病诊断名称）
     */
    public void setDeathDiagName(String deathDiagName) {
        this.deathDiagName = deathDiagName == null ? null : deathDiagName.trim();
    }

    /**
     * 获取死亡讨论记录（死亡讨论过程中的具体意见描述）
     *
     * @return DEATH_DISCUSS_RECORD - 死亡讨论记录（死亡讨论过程中的具体意见描述）
     */
    public String getDeathDiscussRecord() {
        return deathDiscussRecord;
    }

    /**
     * 设置死亡讨论记录（死亡讨论过程中的具体意见描述）
     *
     * @param deathDiscussRecord 死亡讨论记录（死亡讨论过程中的具体意见描述）
     */
    public void setDeathDiscussRecord(String deathDiscussRecord) {
        this.deathDiscussRecord = deathDiscussRecord == null ? null : deathDiscussRecord.trim();
    }

    /**
     * 获取主持人总结意见（主持人就疑难病例讨论过程总结意见的详细描述）
     *
     * @return HOST_SUMMARY_OPINTION - 主持人总结意见（主持人就疑难病例讨论过程总结意见的详细描述）
     */
    public String getHostSummaryOpintion() {
        return hostSummaryOpintion;
    }

    /**
     * 设置主持人总结意见（主持人就疑难病例讨论过程总结意见的详细描述）
     *
     * @param hostSummaryOpintion 主持人总结意见（主持人就疑难病例讨论过程总结意见的详细描述）
     */
    public void setHostSummaryOpintion(String hostSummaryOpintion) {
        this.hostSummaryOpintion = hostSummaryOpintion == null ? null : hostSummaryOpintion.trim();
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
     * 获取病历模板类别代码（例如：11）
     *
     * @return TEMPLATE_TYPE - 病历模板类别代码（例如：11）
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 设置病历模板类别代码（例如：11）
     *
     * @param templateType 病历模板类别代码（例如：11）
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * 获取病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @return TEMPLATE_TYPE_CN - 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * 设置病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     *
     * @param templateTypeCn 病历模板类别名称（例如：入院记录、再次入院记录、多次入院记录）
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * 获取病历标题名称（例如：XX主任医师查房记录）
     *
     * @return EMR_TITLE - 病历标题名称（例如：XX主任医师查房记录）
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * 设置病历标题名称（例如：XX主任医师查房记录）
     *
     * @param emrTitle 病历标题名称（例如：XX主任医师查房记录）
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * 获取病历使用医院模板编号
     *
     * @return EMR_TEMPLATE_CODE - 病历使用医院模板编号
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * 设置病历使用医院模板编号
     *
     * @param emrTemplateCode 病历使用医院模板编号
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
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