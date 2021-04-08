package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_ASS_DISCHARGE_GUIDANCE")
public class QxTAssDischargeGuidance {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Column(name = "DISCHARGE_GUIDANCE_ID")
    private String dischargeGuidanceId;

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
     * 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
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
     * 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

    /**
     * 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_MONTH")
    private String ageMonth;

    /**
     * 出院日期时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DISCHARGE_DATE")
    private String dischargeDate;

    /**
     * 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    @Column(name = "DIET_QUALITY_CODE")
    private String dietQualityCode;

    /**
     * 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    @Column(name = "DIET_QUALITY_NAME")
    private String dietQualityName;

    /**
     * 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    @Column(name = "SELFCARE_CODE")
    private String selfcareCode;

    /**
     * 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    @Column(name = "SELFCARE_NAME")
    private String selfcareName;

    /**
     * 出院情况（对患者出院情况的详细描述）
     */
    @Column(name = "OUT_CONDITION")
    private String outCondition;

    /**
     * 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    @Column(name = "DISCHARGE_CLASS_CODE")
    private String dischargeClassCode;

    /**
     * 离院方式名称（患者本次住院离开医院的方式在特定编码体系中的名称）
     */
    @Column(name = "DISCHARGE_CLASS_NAME")
    private String dischargeClassName;

    /**
     * 用药指导（患者出院后用药指导的描述）
     */
    @Column(name = "DRUG_GUIDE")
    private String drugGuide;

    /**
     * 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    @Column(name = "DIET_GUIDE_CODE")
    private String dietGuideCode;

    /**
     * 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    @Column(name = "DIET_GUIDE_NAME")
    private String dietGuideName;

    /**
     * 生活方式指导（对患者出院后进行生活方式指导）
     */
    @Column(name = "LIFESTYLE_GUIDANCE")
    private String lifestyleGuidance;

    /**
     * 宣教内容（医护人员对服务对象进行相关宣传指导活动的详细描述）
     */
    @Column(name = "MISSION_CONTENT")
    private String missionContent;

    /**
     * 复诊指导（患者出院后再次就诊情况指导）
     */
    @Column(name = "VISIT_GUIDANCE")
    private String visitGuidance;

    /**
     * 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NURSE_SIGNATURE")
    private String nurseSignature;

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

    @Column(name = "IHUID")
    private String ihuid;

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
     * @return DISCHARGE_GUIDANCE_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getDischargeGuidanceId() {
        return dischargeGuidanceId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param dischargeGuidanceId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setDischargeGuidanceId(String dischargeGuidanceId) {
        this.dischargeGuidanceId = dischargeGuidanceId == null ? null : dischargeGuidanceId.trim();
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
     * 获取姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
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
     * 获取年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_YEAR - 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageYear 年龄（患者年龄满 1 周岁的实足年龄,XX岁XX月，年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeYear(String ageYear) {
        this.ageYear = ageYear == null ? null : ageYear.trim();
    }

    /**
     * 获取字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_MONTH - 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageMonth 字段作废无需填写，年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeMonth(String ageMonth) {
        this.ageMonth = ageMonth == null ? null : ageMonth.trim();
    }

    /**
     * 获取出院日期时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @return DISCHARGE_DATE - 出院日期时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 设置出院日期时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     *
     * @param dischargeDate 出院日期时间（患者实际办理出院手续时的公元纪年日期和时间的完整描述）
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 获取饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     *
     * @return DIET_QUALITY_CODE - 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    public String getDietQualityCode() {
        return dietQualityCode;
    }

    /**
     * 设置饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     *
     * @param dietQualityCode 饮食情况代码DIR_DIET_SITUATION（患者饮食情况所属类别的分类代码）
     */
    public void setDietQualityCode(String dietQualityCode) {
        this.dietQualityCode = dietQualityCode == null ? null : dietQualityCode.trim();
    }

    /**
     * 获取饮食情况名称（患者饮食情况所属类别的分类名称）
     *
     * @return DIET_QUALITY_NAME - 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    public String getDietQualityName() {
        return dietQualityName;
    }

    /**
     * 设置饮食情况名称（患者饮食情况所属类别的分类名称）
     *
     * @param dietQualityName 饮食情况名称（患者饮食情况所属类别的分类名称）
     */
    public void setDietQualityName(String dietQualityName) {
        this.dietQualityName = dietQualityName == null ? null : dietQualityName.trim();
    }

    /**
     * 获取自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     *
     * @return SELFCARE_CODE - 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    public String getSelfcareCode() {
        return selfcareCode;
    }

    /**
     * 设置自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     *
     * @param selfcareCode 自理能力代码DIR_SELF_CARE（患者本人的基本生活自我照料能力的分类代码）
     */
    public void setSelfcareCode(String selfcareCode) {
        this.selfcareCode = selfcareCode == null ? null : selfcareCode.trim();
    }

    /**
     * 获取自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     *
     * @return SELFCARE_NAME - 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    public String getSelfcareName() {
        return selfcareName;
    }

    /**
     * 设置自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     *
     * @param selfcareName 自理能力名称（患者本人的基本生活自我照料能力的分类名称）
     */
    public void setSelfcareName(String selfcareName) {
        this.selfcareName = selfcareName == null ? null : selfcareName.trim();
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
     * 获取离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     *
     * @return DISCHARGE_CLASS_CODE - 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    public String getDischargeClassCode() {
        return dischargeClassCode;
    }

    /**
     * 设置离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     *
     * @param dischargeClassCode 离院方式代码CV06.00.226（患者本次住院离开医院的方式在特定编码体系中的代码）
     */
    public void setDischargeClassCode(String dischargeClassCode) {
        this.dischargeClassCode = dischargeClassCode == null ? null : dischargeClassCode.trim();
    }

    /**
     * 获取离院方式名称（患者本次住院离开医院的方式在特定编码体系中的名称）
     *
     * @return DISCHARGE_CLASS_NAME - 离院方式名称（患者本次住院离开医院的方式在特定编码体系中的名称）
     */
    public String getDischargeClassName() {
        return dischargeClassName;
    }

    /**
     * 设置离院方式名称（患者本次住院离开医院的方式在特定编码体系中的名称）
     *
     * @param dischargeClassName 离院方式名称（患者本次住院离开医院的方式在特定编码体系中的名称）
     */
    public void setDischargeClassName(String dischargeClassName) {
        this.dischargeClassName = dischargeClassName == null ? null : dischargeClassName.trim();
    }

    /**
     * 获取用药指导（患者出院后用药指导的描述）
     *
     * @return DRUG_GUIDE - 用药指导（患者出院后用药指导的描述）
     */
    public String getDrugGuide() {
        return drugGuide;
    }

    /**
     * 设置用药指导（患者出院后用药指导的描述）
     *
     * @param drugGuide 用药指导（患者出院后用药指导的描述）
     */
    public void setDrugGuide(String drugGuide) {
        this.drugGuide = drugGuide == null ? null : drugGuide.trim();
    }

    /**
     * 获取饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     *
     * @return DIET_GUIDE_CODE - 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    public String getDietGuideCode() {
        return dietGuideCode;
    }

    /**
     * 设置饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     *
     * @param dietGuideCode 饮食指导代码CV06.00.224（饮食指导类别在特定编码体系中的代码）
     */
    public void setDietGuideCode(String dietGuideCode) {
        this.dietGuideCode = dietGuideCode == null ? null : dietGuideCode.trim();
    }

    /**
     * 获取饮食指导名称（饮食指导类别在特定编码体系中的名称）
     *
     * @return DIET_GUIDE_NAME - 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    public String getDietGuideName() {
        return dietGuideName;
    }

    /**
     * 设置饮食指导名称（饮食指导类别在特定编码体系中的名称）
     *
     * @param dietGuideName 饮食指导名称（饮食指导类别在特定编码体系中的名称）
     */
    public void setDietGuideName(String dietGuideName) {
        this.dietGuideName = dietGuideName == null ? null : dietGuideName.trim();
    }

    /**
     * 获取生活方式指导（对患者出院后进行生活方式指导）
     *
     * @return LIFESTYLE_GUIDANCE - 生活方式指导（对患者出院后进行生活方式指导）
     */
    public String getLifestyleGuidance() {
        return lifestyleGuidance;
    }

    /**
     * 设置生活方式指导（对患者出院后进行生活方式指导）
     *
     * @param lifestyleGuidance 生活方式指导（对患者出院后进行生活方式指导）
     */
    public void setLifestyleGuidance(String lifestyleGuidance) {
        this.lifestyleGuidance = lifestyleGuidance == null ? null : lifestyleGuidance.trim();
    }

    /**
     * 获取宣教内容（医护人员对服务对象进行相关宣传指导活动的详细描述）
     *
     * @return MISSION_CONTENT - 宣教内容（医护人员对服务对象进行相关宣传指导活动的详细描述）
     */
    public String getMissionContent() {
        return missionContent;
    }

    /**
     * 设置宣教内容（医护人员对服务对象进行相关宣传指导活动的详细描述）
     *
     * @param missionContent 宣教内容（医护人员对服务对象进行相关宣传指导活动的详细描述）
     */
    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent == null ? null : missionContent.trim();
    }

    /**
     * 获取复诊指导（患者出院后再次就诊情况指导）
     *
     * @return VISIT_GUIDANCE - 复诊指导（患者出院后再次就诊情况指导）
     */
    public String getVisitGuidance() {
        return visitGuidance;
    }

    /**
     * 设置复诊指导（患者出院后再次就诊情况指导）
     *
     * @param visitGuidance 复诊指导（患者出院后再次就诊情况指导）
     */
    public void setVisitGuidance(String visitGuidance) {
        this.visitGuidance = visitGuidance == null ? null : visitGuidance.trim();
    }

    /**
     * 获取护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NURSE_SIGNATURE - 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getNurseSignature() {
        return nurseSignature;
    }

    /**
     * 设置护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param nurseSignature 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setNurseSignature(String nurseSignature) {
        this.nurseSignature = nurseSignature == null ? null : nurseSignature.trim();
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
     * @return IHUID
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * @param ihuid
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }
}