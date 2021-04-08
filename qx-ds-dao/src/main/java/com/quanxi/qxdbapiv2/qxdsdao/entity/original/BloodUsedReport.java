package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BLOOD_USED_REPORT")
public class BloodUsedReport {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 日期（日期）
     */
    @Id
    @Column(name = "DATE_T")
    private String dateT;

    /**
     * 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 科室代码DIR_DEPT
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 主诊断icdICD10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "ICD")
    private String icd;

    /**
     * 主诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    @Column(name = "DIAGNOSIS")
    private String diagnosis;

    /**
     * ABO血型代码CV04.50.005（受检者按照ABO血型系统决定的血型在特定编码体系中的代码）
     */
    @Column(name = "ABO_CODE")
    private String aboCode;

    /**
     * ABO血型名称（受检者按照ABO血型系统决定的血型在特定编码体系中的名称）
     */
    @Column(name = "ABO_NAME")
    private String aboName;

    /**
     * Rh血型代码CV04.50.020（受检者按照Rh血型系统决定的血型在特定编码体系中的代码）
     */
    @Column(name = "RH_CODE")
    private String rhCode;

    /**
     * Rh血型名称（受检者按照Rh血型系统决定的血型在特定编码体系中的名称）
     */
    @Column(name = "RH_NAME")
    private String rhName;

    /**
     * 血液类别代码CV04.50.021（可调配的血液类型代码）
     */
    @Column(name = "BLOOD_CLASS_TYPE_CODE")
    private String bloodClassTypeCode;

    /**
     * 血液类别名称（可调配的血液类型名称）
     */
    @Column(name = "BLOOD_CLASS_TYPE_NAME")
    private String bloodClassTypeName;

    /**
     * 用血量（用血的数量）
     */
    @Column(name = "VALUE")
    private Long value;

    /**
     * 血量单位（用血数量的单位）
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     * 用血人姓名（用血人在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 用血人身份证号（用血人身份证件上唯一的法定标识符）
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 用血人社保卡号（用血人社会保障卡上的编号）
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 事件类型DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Column(name = "EVENT_TYPE")
    private String eventType;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 本地事件号（门诊号或者住院号）EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

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
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param id 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_ID - 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgId 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取日期（日期）
     *
     * @return DATE_T - 日期（日期）
     */
    public String getDateT() {
        return dateT;
    }

    /**
     * 设置日期（日期）
     *
     * @param dateT 日期（日期）
     */
    public void setDateT(String dateT) {
        this.dateT = dateT == null ? null : dateT.trim();
    }

    /**
     * 获取机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_NAME - 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgName 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取科室代码DIR_DEPT
     *
     * @return DEPT_CODE - 科室代码DIR_DEPT
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室代码DIR_DEPT
     *
     * @param deptCode 科室代码DIR_DEPT
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称
     *
     * @return DEPT_NAME - 科室名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称
     *
     * @param deptName 科室名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取主诊断icdICD10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return ICD - 主诊断icdICD10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getIcd() {
        return icd;
    }

    /**
     * 设置主诊断icdICD10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param icd 主诊断icdICD10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setIcd(String icd) {
        this.icd = icd == null ? null : icd.trim();
    }

    /**
     * 获取主诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @return DIAGNOSIS - 主诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 设置主诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     *
     * @param diagnosis 主诊断（患者所患疾病的临床诊断在特定分类体系中的名称，这里指主要疾病诊断名称）
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    /**
     * 获取ABO血型代码CV04.50.005（受检者按照ABO血型系统决定的血型在特定编码体系中的代码）
     *
     * @return ABO_CODE - ABO血型代码CV04.50.005（受检者按照ABO血型系统决定的血型在特定编码体系中的代码）
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * 设置ABO血型代码CV04.50.005（受检者按照ABO血型系统决定的血型在特定编码体系中的代码）
     *
     * @param aboCode ABO血型代码CV04.50.005（受检者按照ABO血型系统决定的血型在特定编码体系中的代码）
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode == null ? null : aboCode.trim();
    }

    /**
     * 获取ABO血型名称（受检者按照ABO血型系统决定的血型在特定编码体系中的名称）
     *
     * @return ABO_NAME - ABO血型名称（受检者按照ABO血型系统决定的血型在特定编码体系中的名称）
     */
    public String getAboName() {
        return aboName;
    }

    /**
     * 设置ABO血型名称（受检者按照ABO血型系统决定的血型在特定编码体系中的名称）
     *
     * @param aboName ABO血型名称（受检者按照ABO血型系统决定的血型在特定编码体系中的名称）
     */
    public void setAboName(String aboName) {
        this.aboName = aboName == null ? null : aboName.trim();
    }

    /**
     * 获取Rh血型代码CV04.50.020（受检者按照Rh血型系统决定的血型在特定编码体系中的代码）
     *
     * @return RH_CODE - Rh血型代码CV04.50.020（受检者按照Rh血型系统决定的血型在特定编码体系中的代码）
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * 设置Rh血型代码CV04.50.020（受检者按照Rh血型系统决定的血型在特定编码体系中的代码）
     *
     * @param rhCode Rh血型代码CV04.50.020（受检者按照Rh血型系统决定的血型在特定编码体系中的代码）
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode == null ? null : rhCode.trim();
    }

    /**
     * 获取Rh血型名称（受检者按照Rh血型系统决定的血型在特定编码体系中的名称）
     *
     * @return RH_NAME - Rh血型名称（受检者按照Rh血型系统决定的血型在特定编码体系中的名称）
     */
    public String getRhName() {
        return rhName;
    }

    /**
     * 设置Rh血型名称（受检者按照Rh血型系统决定的血型在特定编码体系中的名称）
     *
     * @param rhName Rh血型名称（受检者按照Rh血型系统决定的血型在特定编码体系中的名称）
     */
    public void setRhName(String rhName) {
        this.rhName = rhName == null ? null : rhName.trim();
    }

    /**
     * 获取血液类别代码CV04.50.021（可调配的血液类型代码）
     *
     * @return BLOOD_CLASS_TYPE_CODE - 血液类别代码CV04.50.021（可调配的血液类型代码）
     */
    public String getBloodClassTypeCode() {
        return bloodClassTypeCode;
    }

    /**
     * 设置血液类别代码CV04.50.021（可调配的血液类型代码）
     *
     * @param bloodClassTypeCode 血液类别代码CV04.50.021（可调配的血液类型代码）
     */
    public void setBloodClassTypeCode(String bloodClassTypeCode) {
        this.bloodClassTypeCode = bloodClassTypeCode == null ? null : bloodClassTypeCode.trim();
    }

    /**
     * 获取血液类别名称（可调配的血液类型名称）
     *
     * @return BLOOD_CLASS_TYPE_NAME - 血液类别名称（可调配的血液类型名称）
     */
    public String getBloodClassTypeName() {
        return bloodClassTypeName;
    }

    /**
     * 设置血液类别名称（可调配的血液类型名称）
     *
     * @param bloodClassTypeName 血液类别名称（可调配的血液类型名称）
     */
    public void setBloodClassTypeName(String bloodClassTypeName) {
        this.bloodClassTypeName = bloodClassTypeName == null ? null : bloodClassTypeName.trim();
    }

    /**
     * 获取用血量（用血的数量）
     *
     * @return VALUE - 用血量（用血的数量）
     */
    public Long getValue() {
        return value;
    }

    /**
     * 设置用血量（用血的数量）
     *
     * @param value 用血量（用血的数量）
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * 获取血量单位（用血数量的单位）
     *
     * @return UNIT - 血量单位（用血数量的单位）
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置血量单位（用血数量的单位）
     *
     * @param unit 血量单位（用血数量的单位）
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取用血人姓名（用血人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 用血人姓名（用血人在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用血人姓名（用血人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param name 用血人姓名（用血人在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取用血人身份证号（用血人身份证件上唯一的法定标识符）
     *
     * @return ID_NO - 用血人身份证号（用血人身份证件上唯一的法定标识符）
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置用血人身份证号（用血人身份证件上唯一的法定标识符）
     *
     * @param idNo 用血人身份证号（用血人身份证件上唯一的法定标识符）
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取用血人社保卡号（用血人社会保障卡上的编号）
     *
     * @return CARD_NO - 用血人社保卡号（用血人社会保障卡上的编号）
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置用血人社保卡号（用血人社会保障卡上的编号）
     *
     * @param cardNo 用血人社保卡号（用血人社会保障卡上的编号）
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取事件类型DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @return EVENT_TYPE - 事件类型DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     *
     * @param eventType 事件类型DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
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
     * 获取本地事件号（门诊号或者住院号）EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
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