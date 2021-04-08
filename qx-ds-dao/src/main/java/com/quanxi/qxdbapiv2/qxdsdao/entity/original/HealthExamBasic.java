package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HEALTH_EXAM_BASIC")
public class HealthExamBasic {
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
     * 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    @Id
    @Column(name = "HEALTH_EXAM_FORM_NO")
    private String healthExamFormNo;

    /**
     * 城乡居民健康档案编号 （城乡居民个人健康档案的编号）
     */
    @Column(name = "HEALTH_RECORD_NO")
    private String healthRecordNo;

    /**
     * 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码，或暂不填写）
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 体检开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述 ）
     */
    @Column(name = "EXAM_START_DATE")
    private String examStartDate;

    /**
     * 体检结束日期（诊疗/操作结束时当日的公元纪年日期 ）
     */
    @Column(name = "EXAM_END_DATE")
    private String examEndDate;

    /**
     * 归档检索日期 （文档归档的当日的公元纪年日期 ）
     */
    @Column(name = "RETRIEVE_DATE")
    private String retrieveDate;

    /**
     * 总费用（医疗服务所产生的的总费用）
     */
    @Column(name = "TOTAL_FEE")
    private BigDecimal totalFee;

    /**
     * 报告的标题（文档报告的标题）
     */
    @Column(name = "REPORT_TITLE")
    private String reportTitle;

    /**
     * 文档创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码 ）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别名称（本人生理性别的名称）
     */
    @Column(name = "SEX_NAME")
    private String sexName;

    /**
     * 出生日期（本人出生当日的公元纪年日期）
     */
    @Column(name = "BIRTH_DATE")
    private String birthDate;

    /**
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 现详细住址（目前居住地的详细地址）
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 单位名称（本人工作单位的组织机构名称）
     */
    @Column(name = "EMPLOYER_NAME")
    private String employerName;

    /**
     * 身份证号码 （身份证上唯一的法定标识符 ）
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    @Column(name = "OCCUPATION_CODE")
    private String occupationCode;

    /**
     * 职业类别名称（本人当前职业类别的名称）
     */
    @Column(name = "OCCUPATION_NAME")
    private String occupationName;

    /**
     * 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    @Column(name = "MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况名称（本人当前婚姻状况名称）
     */
    @Column(name = "MARRIAGE_NAME")
    private String marriageName;

    /**
     * 总检结论 （检验/检查/体检得出的结论详细描述 ）
     */
    @Column(name = "EXAM_SUMMARY")
    private String examSummary;

    /**
     * 总检医生 （医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "EXAM_CHIEF_DOCTOR")
    private String examChiefDoctor;

    /**
     * 健康指南（对患者健康指南的描述）
     */
    @Column(name = "HEALTH_GUIDE")
    private String healthGuide;

    /**
     * 备注 （需要添加的注释说明的具体内容 ）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 疾病解析 （对疾病的说明详细描述）
     */
    @Column(name = "DIAG_EXPLAN")
    private String diagExplan;

    /**
     * 饮食建议 （对个体饮食的建议详细描述 ）
     */
    @Column(name = "FOOD_GUIDANCE")
    private String foodGuidance;

    /**
     * 总检时间 （检验/检查/体检得出的结论当日的公元纪年时间 ）
     */
    @Column(name = "SUMMARIZE_DATE")
    private String summarizeDate;

    /**
     * 审核医生 （审核者在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "CHECK_DOCTOR")
    private String checkDoctor;

    /**
     * 审核时间（审核当日的公元纪年日期）
     */
    @Column(name = "CHECK_DATE")
    private String checkDate;

    /**
     * 打印时间 （打印体检报告单日的公元纪年时间 ）
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
     * 获取健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @return HEALTH_EXAM_FORM_NO - 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public String getHealthExamFormNo() {
        return healthExamFormNo;
    }

    /**
     * 设置健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @param healthExamFormNo 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public void setHealthExamFormNo(String healthExamFormNo) {
        this.healthExamFormNo = healthExamFormNo == null ? null : healthExamFormNo.trim();
    }

    /**
     * 获取城乡居民健康档案编号 （城乡居民个人健康档案的编号）
     *
     * @return HEALTH_RECORD_NO - 城乡居民健康档案编号 （城乡居民个人健康档案的编号）
     */
    public String getHealthRecordNo() {
        return healthRecordNo;
    }

    /**
     * 设置城乡居民健康档案编号 （城乡居民个人健康档案的编号）
     *
     * @param healthRecordNo 城乡居民健康档案编号 （城乡居民个人健康档案的编号）
     */
    public void setHealthRecordNo(String healthRecordNo) {
        this.healthRecordNo = healthRecordNo == null ? null : healthRecordNo.trim();
    }

    /**
     * 获取居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码，或暂不填写）
     *
     * @return CARD_NO - 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码，或暂不填写）
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码，或暂不填写）
     *
     * @param cardNo 居民健康卡号（患者持有的“中华人民共和国健康卡”的编号，或“就医卡号”等患者识别码，或暂不填写）
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取体检开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述 ）
     *
     * @return EXAM_START_DATE - 体检开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述 ）
     */
    public String getExamStartDate() {
        return examStartDate;
    }

    /**
     * 设置体检开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述 ）
     *
     * @param examStartDate 体检开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述 ）
     */
    public void setExamStartDate(String examStartDate) {
        this.examStartDate = examStartDate == null ? null : examStartDate.trim();
    }

    /**
     * 获取体检结束日期（诊疗/操作结束时当日的公元纪年日期 ）
     *
     * @return EXAM_END_DATE - 体检结束日期（诊疗/操作结束时当日的公元纪年日期 ）
     */
    public String getExamEndDate() {
        return examEndDate;
    }

    /**
     * 设置体检结束日期（诊疗/操作结束时当日的公元纪年日期 ）
     *
     * @param examEndDate 体检结束日期（诊疗/操作结束时当日的公元纪年日期 ）
     */
    public void setExamEndDate(String examEndDate) {
        this.examEndDate = examEndDate == null ? null : examEndDate.trim();
    }

    /**
     * 获取归档检索日期 （文档归档的当日的公元纪年日期 ）
     *
     * @return RETRIEVE_DATE - 归档检索日期 （文档归档的当日的公元纪年日期 ）
     */
    public String getRetrieveDate() {
        return retrieveDate;
    }

    /**
     * 设置归档检索日期 （文档归档的当日的公元纪年日期 ）
     *
     * @param retrieveDate 归档检索日期 （文档归档的当日的公元纪年日期 ）
     */
    public void setRetrieveDate(String retrieveDate) {
        this.retrieveDate = retrieveDate == null ? null : retrieveDate.trim();
    }

    /**
     * 获取总费用（医疗服务所产生的的总费用）
     *
     * @return TOTAL_FEE - 总费用（医疗服务所产生的的总费用）
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * 设置总费用（医疗服务所产生的的总费用）
     *
     * @param totalFee 总费用（医疗服务所产生的的总费用）
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
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
     * 获取文档创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @return EFFECTIVE_DATE - 文档创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置文档创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @param effectiveDate 文档创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return NAME - 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param name 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码 ）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码 ）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码 ）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码 ）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别名称（本人生理性别的名称）
     *
     * @return SEX_NAME - 性别名称（本人生理性别的名称）
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * 设置性别名称（本人生理性别的名称）
     *
     * @param sexName 性别名称（本人生理性别的名称）
     */
    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    /**
     * 获取出生日期（本人出生当日的公元纪年日期）
     *
     * @return BIRTH_DATE - 出生日期（本人出生当日的公元纪年日期）
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期（本人出生当日的公元纪年日期）
     *
     * @param birthDate 出生日期（本人出生当日的公元纪年日期）
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
     * 获取现详细住址（目前居住地的详细地址）
     *
     * @return ADDRESS - 现详细住址（目前居住地的详细地址）
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置现详细住址（目前居住地的详细地址）
     *
     * @param address 现详细住址（目前居住地的详细地址）
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取单位名称（本人工作单位的组织机构名称）
     *
     * @return EMPLOYER_NAME - 单位名称（本人工作单位的组织机构名称）
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * 设置单位名称（本人工作单位的组织机构名称）
     *
     * @param employerName 单位名称（本人工作单位的组织机构名称）
     */
    public void setEmployerName(String employerName) {
        this.employerName = employerName == null ? null : employerName.trim();
    }

    /**
     * 获取身份证号码 （身份证上唯一的法定标识符 ）
     *
     * @return ID_NO - 身份证号码 （身份证上唯一的法定标识符 ）
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证号码 （身份证上唯一的法定标识符 ）
     *
     * @param idNo 身份证号码 （身份证上唯一的法定标识符 ）
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取职业类别代码GB/T 6565（本人当前职业类别的代码）
     *
     * @return OCCUPATION_CODE - 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * 设置职业类别代码GB/T 6565（本人当前职业类别的代码）
     *
     * @param occupationCode 职业类别代码GB/T 6565（本人当前职业类别的代码）
     */
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    /**
     * 获取职业类别名称（本人当前职业类别的名称）
     *
     * @return OCCUPATION_NAME - 职业类别名称（本人当前职业类别的名称）
     */
    public String getOccupationName() {
        return occupationName;
    }

    /**
     * 设置职业类别名称（本人当前职业类别的名称）
     *
     * @param occupationName 职业类别名称（本人当前职业类别的名称）
     */
    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName == null ? null : occupationName.trim();
    }

    /**
     * 获取婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @return MARRIAGE_CODE - 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * 设置婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @param marriageCode 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
    }

    /**
     * 获取婚姻状况名称（本人当前婚姻状况名称）
     *
     * @return MARRIAGE_NAME - 婚姻状况名称（本人当前婚姻状况名称）
     */
    public String getMarriageName() {
        return marriageName;
    }

    /**
     * 设置婚姻状况名称（本人当前婚姻状况名称）
     *
     * @param marriageName 婚姻状况名称（本人当前婚姻状况名称）
     */
    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    /**
     * 获取总检结论 （检验/检查/体检得出的结论详细描述 ）
     *
     * @return EXAM_SUMMARY - 总检结论 （检验/检查/体检得出的结论详细描述 ）
     */
    public String getExamSummary() {
        return examSummary;
    }

    /**
     * 设置总检结论 （检验/检查/体检得出的结论详细描述 ）
     *
     * @param examSummary 总检结论 （检验/检查/体检得出的结论详细描述 ）
     */
    public void setExamSummary(String examSummary) {
        this.examSummary = examSummary == null ? null : examSummary.trim();
    }

    /**
     * 获取总检医生 （医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return EXAM_CHIEF_DOCTOR - 总检医生 （医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getExamChiefDoctor() {
        return examChiefDoctor;
    }

    /**
     * 设置总检医生 （医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param examChiefDoctor 总检医生 （医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setExamChiefDoctor(String examChiefDoctor) {
        this.examChiefDoctor = examChiefDoctor == null ? null : examChiefDoctor.trim();
    }

    /**
     * 获取健康指南（对患者健康指南的描述）
     *
     * @return HEALTH_GUIDE - 健康指南（对患者健康指南的描述）
     */
    public String getHealthGuide() {
        return healthGuide;
    }

    /**
     * 设置健康指南（对患者健康指南的描述）
     *
     * @param healthGuide 健康指南（对患者健康指南的描述）
     */
    public void setHealthGuide(String healthGuide) {
        this.healthGuide = healthGuide == null ? null : healthGuide.trim();
    }

    /**
     * 获取备注 （需要添加的注释说明的具体内容 ）
     *
     * @return NOTES - 备注 （需要添加的注释说明的具体内容 ）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注 （需要添加的注释说明的具体内容 ）
     *
     * @param notes 备注 （需要添加的注释说明的具体内容 ）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 获取疾病解析 （对疾病的说明详细描述）
     *
     * @return DIAG_EXPLAN - 疾病解析 （对疾病的说明详细描述）
     */
    public String getDiagExplan() {
        return diagExplan;
    }

    /**
     * 设置疾病解析 （对疾病的说明详细描述）
     *
     * @param diagExplan 疾病解析 （对疾病的说明详细描述）
     */
    public void setDiagExplan(String diagExplan) {
        this.diagExplan = diagExplan == null ? null : diagExplan.trim();
    }

    /**
     * 获取饮食建议 （对个体饮食的建议详细描述 ）
     *
     * @return FOOD_GUIDANCE - 饮食建议 （对个体饮食的建议详细描述 ）
     */
    public String getFoodGuidance() {
        return foodGuidance;
    }

    /**
     * 设置饮食建议 （对个体饮食的建议详细描述 ）
     *
     * @param foodGuidance 饮食建议 （对个体饮食的建议详细描述 ）
     */
    public void setFoodGuidance(String foodGuidance) {
        this.foodGuidance = foodGuidance == null ? null : foodGuidance.trim();
    }

    /**
     * 获取总检时间 （检验/检查/体检得出的结论当日的公元纪年时间 ）
     *
     * @return SUMMARIZE_DATE - 总检时间 （检验/检查/体检得出的结论当日的公元纪年时间 ）
     */
    public String getSummarizeDate() {
        return summarizeDate;
    }

    /**
     * 设置总检时间 （检验/检查/体检得出的结论当日的公元纪年时间 ）
     *
     * @param summarizeDate 总检时间 （检验/检查/体检得出的结论当日的公元纪年时间 ）
     */
    public void setSummarizeDate(String summarizeDate) {
        this.summarizeDate = summarizeDate == null ? null : summarizeDate.trim();
    }

    /**
     * 获取审核医生 （审核者在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return CHECK_DOCTOR - 审核医生 （审核者在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getCheckDoctor() {
        return checkDoctor;
    }

    /**
     * 设置审核医生 （审核者在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param checkDoctor 审核医生 （审核者在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setCheckDoctor(String checkDoctor) {
        this.checkDoctor = checkDoctor == null ? null : checkDoctor.trim();
    }

    /**
     * 获取审核时间（审核当日的公元纪年日期）
     *
     * @return CHECK_DATE - 审核时间（审核当日的公元纪年日期）
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * 设置审核时间（审核当日的公元纪年日期）
     *
     * @param checkDate 审核时间（审核当日的公元纪年日期）
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    /**
     * 获取打印时间 （打印体检报告单日的公元纪年时间 ）
     *
     * @return PRINT_DATE - 打印时间 （打印体检报告单日的公元纪年时间 ）
     */
    public String getPrintDate() {
        return printDate;
    }

    /**
     * 设置打印时间 （打印体检报告单日的公元纪年时间 ）
     *
     * @param printDate 打印时间 （打印体检报告单日的公元纪年时间 ）
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
}