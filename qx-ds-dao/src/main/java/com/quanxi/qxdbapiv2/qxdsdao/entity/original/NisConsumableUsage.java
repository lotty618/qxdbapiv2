package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "NIS_CONSUMABLE_USAGE")
public class NisConsumableUsage {
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
    @Column(name = "CONSUMABLE_USAGE_ID")
    private String consumableUsageId;

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
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "WRITE_DATE")
    private String writeDate;

    /**
     * 植入性耗材标志0否 1是（标识是否为植入性高值耗材的标志）
     */
    @Column(name = "IMPLANT_MARK")
    private String implantMark;

    /**
     * 材料名称（高值耗材名称）
     */
    @Column(name = "MATERIAL_NAME")
    private String materialName;

    /**
     * 产品编码（医用耗材出厂时的唯一代码/产品流水号）
     */
    @Column(name = "MATERIAL_CODE")
    private String materialCode;

    /**
     * 产品生产厂家（医用耗材生产单位的单位名称）
     */
    @Column(name = "FACTORY")
    private String factory;

    /**
     * 产品供应商（医用耗材供应单位的单位名称）
     */
    @Column(name = "SUPPLIER")
    private String supplier;

    /**
     * 耗材单位（高值耗材的单位规格）
     */
    @Column(name = "CONSUMABLES_UNIT")
    private String consumablesUnit;

    /**
     * 数量（高值耗材的实际使用数量）
     */
    @Column(name = "MOUNT")
    private BigDecimal mount;

    /**
     * 使用途径（高值耗材的使用途径）
     */
    @Column(name = "USAGE_METHOD")
    private String usageMethod;

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
     * @return CONSUMABLE_USAGE_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getConsumableUsageId() {
        return consumableUsageId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param consumableUsageId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setConsumableUsageId(String consumableUsageId) {
        this.consumableUsageId = consumableUsageId == null ? null : consumableUsageId.trim();
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
     * 获取记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @return WRITE_DATE - 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public String getWriteDate() {
        return writeDate;
    }

    /**
     * 设置记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @param writeDate 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate == null ? null : writeDate.trim();
    }

    /**
     * 获取植入性耗材标志0否 1是（标识是否为植入性高值耗材的标志）
     *
     * @return IMPLANT_MARK - 植入性耗材标志0否 1是（标识是否为植入性高值耗材的标志）
     */
    public String getImplantMark() {
        return implantMark;
    }

    /**
     * 设置植入性耗材标志0否 1是（标识是否为植入性高值耗材的标志）
     *
     * @param implantMark 植入性耗材标志0否 1是（标识是否为植入性高值耗材的标志）
     */
    public void setImplantMark(String implantMark) {
        this.implantMark = implantMark == null ? null : implantMark.trim();
    }

    /**
     * 获取材料名称（高值耗材名称）
     *
     * @return MATERIAL_NAME - 材料名称（高值耗材名称）
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * 设置材料名称（高值耗材名称）
     *
     * @param materialName 材料名称（高值耗材名称）
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    /**
     * 获取产品编码（医用耗材出厂时的唯一代码/产品流水号）
     *
     * @return MATERIAL_CODE - 产品编码（医用耗材出厂时的唯一代码/产品流水号）
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * 设置产品编码（医用耗材出厂时的唯一代码/产品流水号）
     *
     * @param materialCode 产品编码（医用耗材出厂时的唯一代码/产品流水号）
     */
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    /**
     * 获取产品生产厂家（医用耗材生产单位的单位名称）
     *
     * @return FACTORY - 产品生产厂家（医用耗材生产单位的单位名称）
     */
    public String getFactory() {
        return factory;
    }

    /**
     * 设置产品生产厂家（医用耗材生产单位的单位名称）
     *
     * @param factory 产品生产厂家（医用耗材生产单位的单位名称）
     */
    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    /**
     * 获取产品供应商（医用耗材供应单位的单位名称）
     *
     * @return SUPPLIER - 产品供应商（医用耗材供应单位的单位名称）
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * 设置产品供应商（医用耗材供应单位的单位名称）
     *
     * @param supplier 产品供应商（医用耗材供应单位的单位名称）
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    /**
     * 获取耗材单位（高值耗材的单位规格）
     *
     * @return CONSUMABLES_UNIT - 耗材单位（高值耗材的单位规格）
     */
    public String getConsumablesUnit() {
        return consumablesUnit;
    }

    /**
     * 设置耗材单位（高值耗材的单位规格）
     *
     * @param consumablesUnit 耗材单位（高值耗材的单位规格）
     */
    public void setConsumablesUnit(String consumablesUnit) {
        this.consumablesUnit = consumablesUnit == null ? null : consumablesUnit.trim();
    }

    /**
     * 获取数量（高值耗材的实际使用数量）
     *
     * @return MOUNT - 数量（高值耗材的实际使用数量）
     */
    public BigDecimal getMount() {
        return mount;
    }

    /**
     * 设置数量（高值耗材的实际使用数量）
     *
     * @param mount 数量（高值耗材的实际使用数量）
     */
    public void setMount(BigDecimal mount) {
        this.mount = mount;
    }

    /**
     * 获取使用途径（高值耗材的使用途径）
     *
     * @return USAGE_METHOD - 使用途径（高值耗材的使用途径）
     */
    public String getUsageMethod() {
        return usageMethod;
    }

    /**
     * 设置使用途径（高值耗材的使用途径）
     *
     * @param usageMethod 使用途径（高值耗材的使用途径）
     */
    public void setUsageMethod(String usageMethod) {
        this.usageMethod = usageMethod == null ? null : usageMethod.trim();
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