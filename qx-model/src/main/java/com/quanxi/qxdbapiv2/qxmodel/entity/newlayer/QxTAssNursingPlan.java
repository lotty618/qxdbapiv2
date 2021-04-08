package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_ASS_NURSING_PLAN")
public class QxTAssNursingPlan {
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
    @Column(name = "NURSING_PLAN_ID")
    private String nursingPlanId;

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
     * 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    @Column(name = "NURSING_GRADE_CODE")
    private String nursingGradeCode;

    /**
     * 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    @Column(name = "NURSING_GRADE_NAME")
    private String nursingGradeName;

    /**
     * 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    @Column(name = "NURSING_TYPE_CODE")
    private String nursingTypeCode;

    /**
     * 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    @Column(name = "NURSING_TYPE_NAME")
    private String nursingTypeName;

    /**
     * 护理问题（患者入院后需要采取相应护理措施的问题描述）
     */
    @Column(name = "NURSING_PROBLEM")
    private String nursingProblem;

    /**
     * 护理操作项目类目名称（多个护理操作项目的名称）
     */
    @Column(name = "NURSING_PRO_ITEM_NAME")
    private String nursingProItemName;

    /**
     * 护理操作名称（进行护理操作的具体名称）
     */
    @Column(name = "NURSING_PRO_NAME")
    private String nursingProName;

    /**
     * 护理操作结果（多个护理操作结果的详细描述）
     */
    @Column(name = "NURSING_PRO_RESULT")
    private String nursingProResult;

    /**
     * 导管护理描述（对患者进行导管护理的详细描述）
     */
    @Column(name = "CATHETER_NURSING_DESC")
    private String catheterNursingDesc;

    /**
     * 体位护理（标识体位护理的描述）
     */
    @Column(name = "POSITION_NURSING")
    private String positionNursing;

    /**
     * 皮肤护理（对患者进行皮肤护理的描述）
     */
    @Column(name = "SKIN_NURSING")
    private String skinNursing;

    /**
     * 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    @Column(name = "TRACHEA_NURSING_CODE")
    private String tracheaNursingCode;

    /**
     * 气管护理名称（气管护理类别的分类名称）
     */
    @Column(name = "TRACHEA_NURSING_NAME")
    private String tracheaNursingName;

    /**
     * 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    @Column(name = "SAFETY_NURSING_CODE")
    private String safetyNursingCode;

    /**
     * 安全护理名称（安全护理类别的分类名称）
     */
    @Column(name = "SAFETY_NURSING_NAME")
    private String safetyNursingName;

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

    /**
     * 住院唯一标识
     */
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
     * @return NURSING_PLAN_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getNursingPlanId() {
        return nursingPlanId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param nursingPlanId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setNursingPlanId(String nursingPlanId) {
        this.nursingPlanId = nursingPlanId == null ? null : nursingPlanId.trim();
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
     * 获取疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return DIAGNOSIS_CODE - 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param diagnosisCode 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @param diagnosisName 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     *
     * @return NURSING_GRADE_CODE - 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    public String getNursingGradeCode() {
        return nursingGradeCode;
    }

    /**
     * 设置护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     *
     * @param nursingGradeCode 护理等级代码CV06.00.220（护理级别的分类在特定编码体系中的代码）
     */
    public void setNursingGradeCode(String nursingGradeCode) {
        this.nursingGradeCode = nursingGradeCode == null ? null : nursingGradeCode.trim();
    }

    /**
     * 获取护理等级名称（护理级别的分类在特定编码体系中的名称）
     *
     * @return NURSING_GRADE_NAME - 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    public String getNursingGradeName() {
        return nursingGradeName;
    }

    /**
     * 设置护理等级名称（护理级别的分类在特定编码体系中的名称）
     *
     * @param nursingGradeName 护理等级名称（护理级别的分类在特定编码体系中的名称）
     */
    public void setNursingGradeName(String nursingGradeName) {
        this.nursingGradeName = nursingGradeName == null ? null : nursingGradeName.trim();
    }

    /**
     * 获取护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     *
     * @return NURSING_TYPE_CODE - 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    public String getNursingTypeCode() {
        return nursingTypeCode;
    }

    /**
     * 设置护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     *
     * @param nursingTypeCode 护理类型代码CV06.00.221（护理类型的分类在特定编码体系中的代码）
     */
    public void setNursingTypeCode(String nursingTypeCode) {
        this.nursingTypeCode = nursingTypeCode == null ? null : nursingTypeCode.trim();
    }

    /**
     * 获取护理类型名称（护理类型的分类在特定编码体系中的名称）
     *
     * @return NURSING_TYPE_NAME - 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    public String getNursingTypeName() {
        return nursingTypeName;
    }

    /**
     * 设置护理类型名称（护理类型的分类在特定编码体系中的名称）
     *
     * @param nursingTypeName 护理类型名称（护理类型的分类在特定编码体系中的名称）
     */
    public void setNursingTypeName(String nursingTypeName) {
        this.nursingTypeName = nursingTypeName == null ? null : nursingTypeName.trim();
    }

    /**
     * 获取护理问题（患者入院后需要采取相应护理措施的问题描述）
     *
     * @return NURSING_PROBLEM - 护理问题（患者入院后需要采取相应护理措施的问题描述）
     */
    public String getNursingProblem() {
        return nursingProblem;
    }

    /**
     * 设置护理问题（患者入院后需要采取相应护理措施的问题描述）
     *
     * @param nursingProblem 护理问题（患者入院后需要采取相应护理措施的问题描述）
     */
    public void setNursingProblem(String nursingProblem) {
        this.nursingProblem = nursingProblem == null ? null : nursingProblem.trim();
    }

    /**
     * 获取护理操作项目类目名称（多个护理操作项目的名称）
     *
     * @return NURSING_PRO_ITEM_NAME - 护理操作项目类目名称（多个护理操作项目的名称）
     */
    public String getNursingProItemName() {
        return nursingProItemName;
    }

    /**
     * 设置护理操作项目类目名称（多个护理操作项目的名称）
     *
     * @param nursingProItemName 护理操作项目类目名称（多个护理操作项目的名称）
     */
    public void setNursingProItemName(String nursingProItemName) {
        this.nursingProItemName = nursingProItemName == null ? null : nursingProItemName.trim();
    }

    /**
     * 获取护理操作名称（进行护理操作的具体名称）
     *
     * @return NURSING_PRO_NAME - 护理操作名称（进行护理操作的具体名称）
     */
    public String getNursingProName() {
        return nursingProName;
    }

    /**
     * 设置护理操作名称（进行护理操作的具体名称）
     *
     * @param nursingProName 护理操作名称（进行护理操作的具体名称）
     */
    public void setNursingProName(String nursingProName) {
        this.nursingProName = nursingProName == null ? null : nursingProName.trim();
    }

    /**
     * 获取护理操作结果（多个护理操作结果的详细描述）
     *
     * @return NURSING_PRO_RESULT - 护理操作结果（多个护理操作结果的详细描述）
     */
    public String getNursingProResult() {
        return nursingProResult;
    }

    /**
     * 设置护理操作结果（多个护理操作结果的详细描述）
     *
     * @param nursingProResult 护理操作结果（多个护理操作结果的详细描述）
     */
    public void setNursingProResult(String nursingProResult) {
        this.nursingProResult = nursingProResult == null ? null : nursingProResult.trim();
    }

    /**
     * 获取导管护理描述（对患者进行导管护理的详细描述）
     *
     * @return CATHETER_NURSING_DESC - 导管护理描述（对患者进行导管护理的详细描述）
     */
    public String getCatheterNursingDesc() {
        return catheterNursingDesc;
    }

    /**
     * 设置导管护理描述（对患者进行导管护理的详细描述）
     *
     * @param catheterNursingDesc 导管护理描述（对患者进行导管护理的详细描述）
     */
    public void setCatheterNursingDesc(String catheterNursingDesc) {
        this.catheterNursingDesc = catheterNursingDesc == null ? null : catheterNursingDesc.trim();
    }

    /**
     * 获取体位护理（标识体位护理的描述）
     *
     * @return POSITION_NURSING - 体位护理（标识体位护理的描述）
     */
    public String getPositionNursing() {
        return positionNursing;
    }

    /**
     * 设置体位护理（标识体位护理的描述）
     *
     * @param positionNursing 体位护理（标识体位护理的描述）
     */
    public void setPositionNursing(String positionNursing) {
        this.positionNursing = positionNursing == null ? null : positionNursing.trim();
    }

    /**
     * 获取皮肤护理（对患者进行皮肤护理的描述）
     *
     * @return SKIN_NURSING - 皮肤护理（对患者进行皮肤护理的描述）
     */
    public String getSkinNursing() {
        return skinNursing;
    }

    /**
     * 设置皮肤护理（对患者进行皮肤护理的描述）
     *
     * @param skinNursing 皮肤护理（对患者进行皮肤护理的描述）
     */
    public void setSkinNursing(String skinNursing) {
        this.skinNursing = skinNursing == null ? null : skinNursing.trim();
    }

    /**
     * 获取气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     *
     * @return TRACHEA_NURSING_CODE - 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    public String getTracheaNursingCode() {
        return tracheaNursingCode;
    }

    /**
     * 设置气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     *
     * @param tracheaNursingCode 气管护理代码DIR_TRACHEA_NURSING（气管护理类别的分类代码）
     */
    public void setTracheaNursingCode(String tracheaNursingCode) {
        this.tracheaNursingCode = tracheaNursingCode == null ? null : tracheaNursingCode.trim();
    }

    /**
     * 获取气管护理名称（气管护理类别的分类名称）
     *
     * @return TRACHEA_NURSING_NAME - 气管护理名称（气管护理类别的分类名称）
     */
    public String getTracheaNursingName() {
        return tracheaNursingName;
    }

    /**
     * 设置气管护理名称（气管护理类别的分类名称）
     *
     * @param tracheaNursingName 气管护理名称（气管护理类别的分类名称）
     */
    public void setTracheaNursingName(String tracheaNursingName) {
        this.tracheaNursingName = tracheaNursingName == null ? null : tracheaNursingName.trim();
    }

    /**
     * 获取安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     *
     * @return SAFETY_NURSING_CODE - 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    public String getSafetyNursingCode() {
        return safetyNursingCode;
    }

    /**
     * 设置安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     *
     * @param safetyNursingCode 安全护理代码DIR_SAFELY_NURSING（安全护理类别的分类代码）
     */
    public void setSafetyNursingCode(String safetyNursingCode) {
        this.safetyNursingCode = safetyNursingCode == null ? null : safetyNursingCode.trim();
    }

    /**
     * 获取安全护理名称（安全护理类别的分类名称）
     *
     * @return SAFETY_NURSING_NAME - 安全护理名称（安全护理类别的分类名称）
     */
    public String getSafetyNursingName() {
        return safetyNursingName;
    }

    /**
     * 设置安全护理名称（安全护理类别的分类名称）
     *
     * @param safetyNursingName 安全护理名称（安全护理类别的分类名称）
     */
    public void setSafetyNursingName(String safetyNursingName) {
        this.safetyNursingName = safetyNursingName == null ? null : safetyNursingName.trim();
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
}