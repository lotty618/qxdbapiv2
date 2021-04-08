package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EVENT_TREATMENT_RECORD")
public class EventTreatmentRecord {
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
     * 治疗记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "TREATMENT_ID")
    private String treatmentId;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 电子申请单编号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "E_ORDER_NO")
    private String eOrderNo;

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
     * 体重（kg）（患者体重的测量值，计量单位为kg）
     */
    @Column(name = "WEIGHT")
    private BigDecimal weight;

    /**
     * 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    @Column(name = "DISEASE_DIAGNOSIS")
    private String diseaseDiagnosis;

    /**
     * 疾病诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    @Column(name = "DISEASE_DIAGNOSIS_NAME")
    private String diseaseDiagnosisName;

    /**
     * 处理及指导意见（对某事件进行处理及指导意见内容的详细描述）
     */
    @Column(name = "GUIDE_SUGGEST")
    private String guideSuggest;

    /**
     * 有创诊疗操作标志0否 1是（标识患者是否接受过有创诊疗操作的标志）
     */
    @Column(name = "DIAG_OPERTION_MARK")
    private String diagOpertionMark;

    /**
     * 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    @Column(name = "ALLERGY_HISTORY_MARK")
    private String allergyHistoryMark;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 医嘱使用备注（医嘱执行过程中的注意事项）
     */
    @Column(name = "ORDER_REMARK")
    private String orderRemark;

    /**
     * 今后治疗方案（今后治疗方案的详细描述）
     */
    @Column(name = "TREAMENT_FUTURE")
    private String treamentFuture;

    /**
     * 随访方式代码CV06.00.207（进行医学随访的方式类别在特定编码体系中的代码）
     */
    @Column(name = "VISIT_WAY_CODE")
    private String visitWayCode;

    /**
     * 随访方式中文名称（进行医学随访的方式类别在特定编码体系中的中文名称）
     */
    @Column(name = "VISIT_WAY_CN")
    private String visitWayCn;

    /**
     * 随访日期（对患者进行随访时当日的公元纪年日期的完整描述）
     */
    @Column(name = "FOLLOWUP_DATE")
    private String followupDate;

    /**
     * 随访周期建议代码CV06.00.208（患者接受医学随访的建议间隔时长在特定编码体系中的代码）
     */
    @Column(name = "FOLLOWUP_PERIOD_CODE")
    private String followupPeriodCode;

    /**
     * 随访周期建议中文名称（患者接受医学随访的建议间隔时长在特定编码体系中的中文名称）
     */
    @Column(name = "FOLLOWUP_PERIOD_CN")
    private String followupPeriodCn;

    /**
     * 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    @Column(name = "OPERATION_CN")
    private String operationCn;

    /**
     * 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_DATE")
    private String operationDate;

    /**
     * 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    @Column(name = "BODY_PART_CODE")
    private String bodyPartCode;

    /**
     * 手术部位名称（实施手术的人体部位名称）
     */
    @Column(name = "BODY_PART_NAME")
    private String bodyPartName;

    /**
     * 操作方法描述（实施手术操作方法的详细描述）
     */
    @Column(name = "OPERATION_METHOD_DESC")
    private String operationMethodDesc;

    /**
     * 操作次数（手术操作的次数）
     */
    @Column(name = "OPERATION_COUNT")
    private Integer operationCount;

    /**
     * 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ORDER_PERFORMER")
    private String orderPerformer;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 药物名称（药物通用名称）
     */
    @Column(name = "MEDICINE_NAME")
    private String medicineName;

    /**
     * 药物用法（药物（含中药）治疗疾病具体用法的描述）
     */
    @Column(name = "DRUGS_USAGE")
    private String drugsUsage;

    /**
     * 药物使用频率代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    @Column(name = "DRUG_USING_FREQ_CODE")
    private String drugUsingFreqCode;

    /**
     * 药物使用频率中文名称（标识单位时间内药物使用的次数中文名称）
     */
    @Column(name = "DRUG_USING_FREQ_CN")
    private String drugUsingFreqCn;

    /**
     * 药物使用剂量单位（标识药物剂量的计量单位）
     */
    @Column(name = "DRUG_DOSE_UNIT")
    private String drugDoseUnit;

    /**
     * 药物使用次剂量（单次使用药物的剂量）
     */
    @Column(name = "DRUG_PRE_DOSE")
    private BigDecimal drugPreDose;

    /**
     * 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    @Column(name = "DRUG_TOTAL_DOSE")
    private BigDecimal drugTotalDose;

    /**
     * 药物使用途径代码CV06.00.102（药物使用途径在特定编码体系中的代码）
     */
    @Column(name = "DRUG_ROUTE_CODE")
    private String drugRouteCode;

    /**
     * 药物使用途径中文名称（药物使用途径在特定编码体系中的中文名称）
     */
    @Column(name = "DRUG_ROUTE_CN")
    private String drugRouteCn;

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
     * 获取治疗记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return TREATMENT_ID - 治疗记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getTreatmentId() {
        return treatmentId;
    }

    /**
     * 设置治疗记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param treatmentId 治疗记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId == null ? null : treatmentId.trim();
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
     * 获取电子申请单编号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return E_ORDER_NO - 电子申请单编号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String geteOrderNo() {
        return eOrderNo;
    }

    /**
     * 设置电子申请单编号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param eOrderNo 电子申请单编号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void seteOrderNo(String eOrderNo) {
        this.eOrderNo = eOrderNo == null ? null : eOrderNo.trim();
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
     * 获取体重（kg）（患者体重的测量值，计量单位为kg）
     *
     * @return WEIGHT - 体重（kg）（患者体重的测量值，计量单位为kg）
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置体重（kg）（患者体重的测量值，计量单位为kg）
     *
     * @param weight 体重（kg）（患者体重的测量值，计量单位为kg）
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @return DISEASE_DIAGNOSIS - 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public String getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    /**
     * 设置疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     *
     * @param diseaseDiagnosis 疾病诊断编码ICD-10（患者所患的疾病诊断特定编码体系中的编码）
     */
    public void setDiseaseDiagnosis(String diseaseDiagnosis) {
        this.diseaseDiagnosis = diseaseDiagnosis == null ? null : diseaseDiagnosis.trim();
    }

    /**
     * 获取疾病诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @return DISEASE_DIAGNOSIS_NAME - 疾病诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public String getDiseaseDiagnosisName() {
        return diseaseDiagnosisName;
    }

    /**
     * 设置疾病诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     *
     * @param diseaseDiagnosisName 疾病诊断名称（患者在住院前，由门（急）诊接诊医师在住院证上填写的门（急）诊诊断）
     */
    public void setDiseaseDiagnosisName(String diseaseDiagnosisName) {
        this.diseaseDiagnosisName = diseaseDiagnosisName == null ? null : diseaseDiagnosisName.trim();
    }

    /**
     * 获取处理及指导意见（对某事件进行处理及指导意见内容的详细描述）
     *
     * @return GUIDE_SUGGEST - 处理及指导意见（对某事件进行处理及指导意见内容的详细描述）
     */
    public String getGuideSuggest() {
        return guideSuggest;
    }

    /**
     * 设置处理及指导意见（对某事件进行处理及指导意见内容的详细描述）
     *
     * @param guideSuggest 处理及指导意见（对某事件进行处理及指导意见内容的详细描述）
     */
    public void setGuideSuggest(String guideSuggest) {
        this.guideSuggest = guideSuggest == null ? null : guideSuggest.trim();
    }

    /**
     * 获取有创诊疗操作标志0否 1是（标识患者是否接受过有创诊疗操作的标志）
     *
     * @return DIAG_OPERTION_MARK - 有创诊疗操作标志0否 1是（标识患者是否接受过有创诊疗操作的标志）
     */
    public String getDiagOpertionMark() {
        return diagOpertionMark;
    }

    /**
     * 设置有创诊疗操作标志0否 1是（标识患者是否接受过有创诊疗操作的标志）
     *
     * @param diagOpertionMark 有创诊疗操作标志0否 1是（标识患者是否接受过有创诊疗操作的标志）
     */
    public void setDiagOpertionMark(String diagOpertionMark) {
        this.diagOpertionMark = diagOpertionMark == null ? null : diagOpertionMark.trim();
    }

    /**
     * 获取过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @return ALLERGY_HISTORY_MARK - 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * 设置过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @param allergyHistoryMark 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark == null ? null : allergyHistoryMark.trim();
    }

    /**
     * 获取过敏史（患者既往发生过敏情况的详细描述）
     *
     * @return ALLERGY_HISTORY - 过敏史（患者既往发生过敏情况的详细描述）
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * 设置过敏史（患者既往发生过敏情况的详细描述）
     *
     * @param allergyHistory 过敏史（患者既往发生过敏情况的详细描述）
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
    }

    /**
     * 获取医嘱使用备注（医嘱执行过程中的注意事项）
     *
     * @return ORDER_REMARK - 医嘱使用备注（医嘱执行过程中的注意事项）
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * 设置医嘱使用备注（医嘱执行过程中的注意事项）
     *
     * @param orderRemark 医嘱使用备注（医嘱执行过程中的注意事项）
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    /**
     * 获取今后治疗方案（今后治疗方案的详细描述）
     *
     * @return TREAMENT_FUTURE - 今后治疗方案（今后治疗方案的详细描述）
     */
    public String getTreamentFuture() {
        return treamentFuture;
    }

    /**
     * 设置今后治疗方案（今后治疗方案的详细描述）
     *
     * @param treamentFuture 今后治疗方案（今后治疗方案的详细描述）
     */
    public void setTreamentFuture(String treamentFuture) {
        this.treamentFuture = treamentFuture == null ? null : treamentFuture.trim();
    }

    /**
     * 获取随访方式代码CV06.00.207（进行医学随访的方式类别在特定编码体系中的代码）
     *
     * @return VISIT_WAY_CODE - 随访方式代码CV06.00.207（进行医学随访的方式类别在特定编码体系中的代码）
     */
    public String getVisitWayCode() {
        return visitWayCode;
    }

    /**
     * 设置随访方式代码CV06.00.207（进行医学随访的方式类别在特定编码体系中的代码）
     *
     * @param visitWayCode 随访方式代码CV06.00.207（进行医学随访的方式类别在特定编码体系中的代码）
     */
    public void setVisitWayCode(String visitWayCode) {
        this.visitWayCode = visitWayCode == null ? null : visitWayCode.trim();
    }

    /**
     * 获取随访方式中文名称（进行医学随访的方式类别在特定编码体系中的中文名称）
     *
     * @return VISIT_WAY_CN - 随访方式中文名称（进行医学随访的方式类别在特定编码体系中的中文名称）
     */
    public String getVisitWayCn() {
        return visitWayCn;
    }

    /**
     * 设置随访方式中文名称（进行医学随访的方式类别在特定编码体系中的中文名称）
     *
     * @param visitWayCn 随访方式中文名称（进行医学随访的方式类别在特定编码体系中的中文名称）
     */
    public void setVisitWayCn(String visitWayCn) {
        this.visitWayCn = visitWayCn == null ? null : visitWayCn.trim();
    }

    /**
     * 获取随访日期（对患者进行随访时当日的公元纪年日期的完整描述）
     *
     * @return FOLLOWUP_DATE - 随访日期（对患者进行随访时当日的公元纪年日期的完整描述）
     */
    public String getFollowupDate() {
        return followupDate;
    }

    /**
     * 设置随访日期（对患者进行随访时当日的公元纪年日期的完整描述）
     *
     * @param followupDate 随访日期（对患者进行随访时当日的公元纪年日期的完整描述）
     */
    public void setFollowupDate(String followupDate) {
        this.followupDate = followupDate == null ? null : followupDate.trim();
    }

    /**
     * 获取随访周期建议代码CV06.00.208（患者接受医学随访的建议间隔时长在特定编码体系中的代码）
     *
     * @return FOLLOWUP_PERIOD_CODE - 随访周期建议代码CV06.00.208（患者接受医学随访的建议间隔时长在特定编码体系中的代码）
     */
    public String getFollowupPeriodCode() {
        return followupPeriodCode;
    }

    /**
     * 设置随访周期建议代码CV06.00.208（患者接受医学随访的建议间隔时长在特定编码体系中的代码）
     *
     * @param followupPeriodCode 随访周期建议代码CV06.00.208（患者接受医学随访的建议间隔时长在特定编码体系中的代码）
     */
    public void setFollowupPeriodCode(String followupPeriodCode) {
        this.followupPeriodCode = followupPeriodCode == null ? null : followupPeriodCode.trim();
    }

    /**
     * 获取随访周期建议中文名称（患者接受医学随访的建议间隔时长在特定编码体系中的中文名称）
     *
     * @return FOLLOWUP_PERIOD_CN - 随访周期建议中文名称（患者接受医学随访的建议间隔时长在特定编码体系中的中文名称）
     */
    public String getFollowupPeriodCn() {
        return followupPeriodCn;
    }

    /**
     * 设置随访周期建议中文名称（患者接受医学随访的建议间隔时长在特定编码体系中的中文名称）
     *
     * @param followupPeriodCn 随访周期建议中文名称（患者接受医学随访的建议间隔时长在特定编码体系中的中文名称）
     */
    public void setFollowupPeriodCn(String followupPeriodCn) {
        this.followupPeriodCn = followupPeriodCn == null ? null : followupPeriodCn.trim();
    }

    /**
     * 获取手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 手术（操作）编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     *
     * @return OPERATION_CN - 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    public String getOperationCn() {
        return operationCn;
    }

    /**
     * 设置手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     *
     * @param operationCn 手术（操作）中文名称（患者住院期间实施的手术及操作在特定编码体系中的中文名称）
     */
    public void setOperationCn(String operationCn) {
        this.operationCn = operationCn == null ? null : operationCn.trim();
    }

    /**
     * 获取手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_DATE - 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * 设置手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationDate 手术（操作）日期时间（患者住院期间开始实施手术及操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * 获取手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @return BODY_PART_CODE - 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public String getBodyPartCode() {
        return bodyPartCode;
    }

    /**
     * 设置手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     *
     * @param bodyPartCode 手术部位编码CV06.00.227（检查（含病理）的人体部位在特定编码体系中的代码）
     */
    public void setBodyPartCode(String bodyPartCode) {
        this.bodyPartCode = bodyPartCode == null ? null : bodyPartCode.trim();
    }

    /**
     * 获取手术部位名称（实施手术的人体部位名称）
     *
     * @return BODY_PART_NAME - 手术部位名称（实施手术的人体部位名称）
     */
    public String getBodyPartName() {
        return bodyPartName;
    }

    /**
     * 设置手术部位名称（实施手术的人体部位名称）
     *
     * @param bodyPartName 手术部位名称（实施手术的人体部位名称）
     */
    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName == null ? null : bodyPartName.trim();
    }

    /**
     * 获取操作方法描述（实施手术操作方法的详细描述）
     *
     * @return OPERATION_METHOD_DESC - 操作方法描述（实施手术操作方法的详细描述）
     */
    public String getOperationMethodDesc() {
        return operationMethodDesc;
    }

    /**
     * 设置操作方法描述（实施手术操作方法的详细描述）
     *
     * @param operationMethodDesc 操作方法描述（实施手术操作方法的详细描述）
     */
    public void setOperationMethodDesc(String operationMethodDesc) {
        this.operationMethodDesc = operationMethodDesc == null ? null : operationMethodDesc.trim();
    }

    /**
     * 获取操作次数（手术操作的次数）
     *
     * @return OPERATION_COUNT - 操作次数（手术操作的次数）
     */
    public Integer getOperationCount() {
        return operationCount;
    }

    /**
     * 设置操作次数（手术操作的次数）
     *
     * @param operationCount 操作次数（手术操作的次数）
     */
    public void setOperationCount(Integer operationCount) {
        this.operationCount = operationCount;
    }

    /**
     * 获取医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ORDER_PERFORMER - 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOrderPerformer() {
        return orderPerformer;
    }

    /**
     * 设置医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param orderPerformer 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOrderPerformer(String orderPerformer) {
        this.orderPerformer = orderPerformer == null ? null : orderPerformer.trim();
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
     * 获取药物名称（药物通用名称）
     *
     * @return MEDICINE_NAME - 药物名称（药物通用名称）
     */
    public String getMedicineName() {
        return medicineName;
    }

    /**
     * 设置药物名称（药物通用名称）
     *
     * @param medicineName 药物名称（药物通用名称）
     */
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    /**
     * 获取药物用法（药物（含中药）治疗疾病具体用法的描述）
     *
     * @return DRUGS_USAGE - 药物用法（药物（含中药）治疗疾病具体用法的描述）
     */
    public String getDrugsUsage() {
        return drugsUsage;
    }

    /**
     * 设置药物用法（药物（含中药）治疗疾病具体用法的描述）
     *
     * @param drugsUsage 药物用法（药物（含中药）治疗疾病具体用法的描述）
     */
    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    /**
     * 获取药物使用频率代码CV06.00.228（标识单位时间内药物使用的次数代码）
     *
     * @return DRUG_USING_FREQ_CODE - 药物使用频率代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    public String getDrugUsingFreqCode() {
        return drugUsingFreqCode;
    }

    /**
     * 设置药物使用频率代码CV06.00.228（标识单位时间内药物使用的次数代码）
     *
     * @param drugUsingFreqCode 药物使用频率代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    public void setDrugUsingFreqCode(String drugUsingFreqCode) {
        this.drugUsingFreqCode = drugUsingFreqCode == null ? null : drugUsingFreqCode.trim();
    }

    /**
     * 获取药物使用频率中文名称（标识单位时间内药物使用的次数中文名称）
     *
     * @return DRUG_USING_FREQ_CN - 药物使用频率中文名称（标识单位时间内药物使用的次数中文名称）
     */
    public String getDrugUsingFreqCn() {
        return drugUsingFreqCn;
    }

    /**
     * 设置药物使用频率中文名称（标识单位时间内药物使用的次数中文名称）
     *
     * @param drugUsingFreqCn 药物使用频率中文名称（标识单位时间内药物使用的次数中文名称）
     */
    public void setDrugUsingFreqCn(String drugUsingFreqCn) {
        this.drugUsingFreqCn = drugUsingFreqCn == null ? null : drugUsingFreqCn.trim();
    }

    /**
     * 获取药物使用剂量单位（标识药物剂量的计量单位）
     *
     * @return DRUG_DOSE_UNIT - 药物使用剂量单位（标识药物剂量的计量单位）
     */
    public String getDrugDoseUnit() {
        return drugDoseUnit;
    }

    /**
     * 设置药物使用剂量单位（标识药物剂量的计量单位）
     *
     * @param drugDoseUnit 药物使用剂量单位（标识药物剂量的计量单位）
     */
    public void setDrugDoseUnit(String drugDoseUnit) {
        this.drugDoseUnit = drugDoseUnit == null ? null : drugDoseUnit.trim();
    }

    /**
     * 获取药物使用次剂量（单次使用药物的剂量）
     *
     * @return DRUG_PRE_DOSE - 药物使用次剂量（单次使用药物的剂量）
     */
    public BigDecimal getDrugPreDose() {
        return drugPreDose;
    }

    /**
     * 设置药物使用次剂量（单次使用药物的剂量）
     *
     * @param drugPreDose 药物使用次剂量（单次使用药物的剂量）
     */
    public void setDrugPreDose(BigDecimal drugPreDose) {
        this.drugPreDose = drugPreDose;
    }

    /**
     * 获取药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     *
     * @return DRUG_TOTAL_DOSE - 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    public BigDecimal getDrugTotalDose() {
        return drugTotalDose;
    }

    /**
     * 设置药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     *
     * @param drugTotalDose 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    public void setDrugTotalDose(BigDecimal drugTotalDose) {
        this.drugTotalDose = drugTotalDose;
    }

    /**
     * 获取药物使用途径代码CV06.00.102（药物使用途径在特定编码体系中的代码）
     *
     * @return DRUG_ROUTE_CODE - 药物使用途径代码CV06.00.102（药物使用途径在特定编码体系中的代码）
     */
    public String getDrugRouteCode() {
        return drugRouteCode;
    }

    /**
     * 设置药物使用途径代码CV06.00.102（药物使用途径在特定编码体系中的代码）
     *
     * @param drugRouteCode 药物使用途径代码CV06.00.102（药物使用途径在特定编码体系中的代码）
     */
    public void setDrugRouteCode(String drugRouteCode) {
        this.drugRouteCode = drugRouteCode == null ? null : drugRouteCode.trim();
    }

    /**
     * 获取药物使用途径中文名称（药物使用途径在特定编码体系中的中文名称）
     *
     * @return DRUG_ROUTE_CN - 药物使用途径中文名称（药物使用途径在特定编码体系中的中文名称）
     */
    public String getDrugRouteCn() {
        return drugRouteCn;
    }

    /**
     * 设置药物使用途径中文名称（药物使用途径在特定编码体系中的中文名称）
     *
     * @param drugRouteCn 药物使用途径中文名称（药物使用途径在特定编码体系中的中文名称）
     */
    public void setDrugRouteCn(String drugRouteCn) {
        this.drugRouteCn = drugRouteCn == null ? null : drugRouteCn.trim();
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