package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EVENT_ANES_POSTOPT_INTERVIEW")
public class EventAnesPostoptInterview {
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
     * 麻醉术后访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "ANES_POST_INTERVIEW_ID")
    private String anesPostInterviewId;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

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
     * ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    @Column(name = "ABO_CODE")
    private String aboCode;

    /**
     * ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    @Column(name = "ABO_CN")
    private String aboCn;

    /**
     * RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    @Column(name = "RH_CODE")
    private String rhCode;

    /**
     * RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    @Column(name = "RH_CN")
    private String rhCn;

    /**
     * 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    @Column(name = "OP_PRE_DIAGNOSIS")
    private String opPreDiagnosis;

    /**
     * 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    @Column(name = "OP_PRE_DIAGNOSIS_NAME")
    private String opPreDiagnosisName;

    /**
     * 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    @Column(name = "POST_DIAGNOSIS")
    private String postDiagnosis;

    /**
     * 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    @Column(name = "POST_DIAGNOSIS_NAME")
    private String postDiagnosisName;

    /**
     * 一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    @Column(name = "GENERAL_EXAM_RESULT")
    private String generalExamResult;

    /**
     * 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 麻醉恢复情况（对麻醉恢复情况的描述）
     */
    @Column(name = "ANES_RECOVERY_STATE")
    private String anesRecoveryState;

    /**
     * 清醒日期时间（麻醉后患者清醒时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "CONSCIOUS_DATE")
    private String consciousDate;

    /**
     * 拔除气管插管0否 1是（标识是否已拔除气管插管）
     */
    @Column(name = "EXTUBATION_MARK")
    private String extubationMark;

    /**
     * 特殊情况（对存在特殊情况的描述）
     */
    @Column(name = "SPECICAL_STATE")
    private String specicalState;

    /**
     * 麻醉适应证（麻醉适应证的描述）
     */
    @Column(name = "ANES_INDICATION")
    private String anesIndication;

    /**
     * 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANES_DOCTOR_SIGNATURE")
    private String anesDoctorSignature;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

    /**
     * 手术及操作编码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    @Column(name = "OPERATION_NAME")
    private String operationName;

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
     * 获取麻醉术后访视记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return ANES_POST_INTERVIEW_ID - 麻醉术后访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getAnesPostInterviewId() {
        return anesPostInterviewId;
    }

    /**
     * 设置麻醉术后访视记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param anesPostInterviewId 麻醉术后访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setAnesPostInterviewId(String anesPostInterviewId) {
        this.anesPostInterviewId = anesPostInterviewId == null ? null : anesPostInterviewId.trim();
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
     * 获取ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     *
     * @return ABO_CODE - ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * 设置ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     *
     * @param aboCode ABO血型代码CV04.50.005（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的代码）
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode == null ? null : aboCode.trim();
    }

    /**
     * 获取ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     *
     * @return ABO_CN - ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    public String getAboCn() {
        return aboCn;
    }

    /**
     * 设置ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     *
     * @param aboCn ABO血型名称（进行血型检查明确，或既往病历资料能够明确的患者 ABO血型类别在特定编码体系中的中文名称）
     */
    public void setAboCn(String aboCn) {
        this.aboCn = aboCn == null ? null : aboCn.trim();
    }

    /**
     * 获取RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     *
     * @return RH_CODE - RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * 设置RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     *
     * @param rhCode RH血型代码CV04.50.020（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别代码）
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode == null ? null : rhCode.trim();
    }

    /**
     * 获取RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     *
     * @return RH_CN - RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    public String getRhCn() {
        return rhCn;
    }

    /**
     * 设置RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     *
     * @param rhCn RH血型名称（进行血型检查明确，或既往病历资料能够明确的患者 Rh 血型的类别中文名称）
     */
    public void setRhCn(String rhCn) {
        this.rhCn = rhCn == null ? null : rhCn.trim();
    }

    /**
     * 获取术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @return OP_PRE_DIAGNOSIS - 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public String getOpPreDiagnosis() {
        return opPreDiagnosis;
    }

    /**
     * 设置术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @param opPreDiagnosis 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public void setOpPreDiagnosis(String opPreDiagnosis) {
        this.opPreDiagnosis = opPreDiagnosis == null ? null : opPreDiagnosis.trim();
    }

    /**
     * 获取术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @return OP_PRE_DIAGNOSIS_NAME - 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public String getOpPreDiagnosisName() {
        return opPreDiagnosisName;
    }

    /**
     * 设置术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @param opPreDiagnosisName 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public void setOpPreDiagnosisName(String opPreDiagnosisName) {
        this.opPreDiagnosisName = opPreDiagnosisName == null ? null : opPreDiagnosisName.trim();
    }

    /**
     * 获取术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @return POST_DIAGNOSIS - 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public String getPostDiagnosis() {
        return postDiagnosis;
    }

    /**
     * 设置术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @param postDiagnosis 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public void setPostDiagnosis(String postDiagnosis) {
        this.postDiagnosis = postDiagnosis == null ? null : postDiagnosis.trim();
    }

    /**
     * 获取术后诊断名称（术后诊断在特定编码体系中的名称）
     *
     * @return POST_DIAGNOSIS_NAME - 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    public String getPostDiagnosisName() {
        return postDiagnosisName;
    }

    /**
     * 设置术后诊断名称（术后诊断在特定编码体系中的名称）
     *
     * @param postDiagnosisName 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    public void setPostDiagnosisName(String postDiagnosisName) {
        this.postDiagnosisName = postDiagnosisName == null ? null : postDiagnosisName.trim();
    }

    /**
     * 获取一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     *
     * @return GENERAL_EXAM_RESULT - 一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    public String getGeneralExamResult() {
        return generalExamResult;
    }

    /**
     * 设置一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     *
     * @param generalExamResult 一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    public void setGeneralExamResult(String generalExamResult) {
        this.generalExamResult = generalExamResult == null ? null : generalExamResult.trim();
    }

    /**
     * 获取麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANESTHESIA_CODE - 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }

    /**
     * 设置麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesthesiaCode 麻醉方法代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode == null ? null : anesthesiaCode.trim();
    }

    /**
     * 获取麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_CN - 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaCn 麻醉方法中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取麻醉恢复情况（对麻醉恢复情况的描述）
     *
     * @return ANES_RECOVERY_STATE - 麻醉恢复情况（对麻醉恢复情况的描述）
     */
    public String getAnesRecoveryState() {
        return anesRecoveryState;
    }

    /**
     * 设置麻醉恢复情况（对麻醉恢复情况的描述）
     *
     * @param anesRecoveryState 麻醉恢复情况（对麻醉恢复情况的描述）
     */
    public void setAnesRecoveryState(String anesRecoveryState) {
        this.anesRecoveryState = anesRecoveryState == null ? null : anesRecoveryState.trim();
    }

    /**
     * 获取清醒日期时间（麻醉后患者清醒时的公元纪年日期和时间的完整描述）
     *
     * @return CONSCIOUS_DATE - 清醒日期时间（麻醉后患者清醒时的公元纪年日期和时间的完整描述）
     */
    public String getConsciousDate() {
        return consciousDate;
    }

    /**
     * 设置清醒日期时间（麻醉后患者清醒时的公元纪年日期和时间的完整描述）
     *
     * @param consciousDate 清醒日期时间（麻醉后患者清醒时的公元纪年日期和时间的完整描述）
     */
    public void setConsciousDate(String consciousDate) {
        this.consciousDate = consciousDate == null ? null : consciousDate.trim();
    }

    /**
     * 获取拔除气管插管0否 1是（标识是否已拔除气管插管）
     *
     * @return EXTUBATION_MARK - 拔除气管插管0否 1是（标识是否已拔除气管插管）
     */
    public String getExtubationMark() {
        return extubationMark;
    }

    /**
     * 设置拔除气管插管0否 1是（标识是否已拔除气管插管）
     *
     * @param extubationMark 拔除气管插管0否 1是（标识是否已拔除气管插管）
     */
    public void setExtubationMark(String extubationMark) {
        this.extubationMark = extubationMark == null ? null : extubationMark.trim();
    }

    /**
     * 获取特殊情况（对存在特殊情况的描述）
     *
     * @return SPECICAL_STATE - 特殊情况（对存在特殊情况的描述）
     */
    public String getSpecicalState() {
        return specicalState;
    }

    /**
     * 设置特殊情况（对存在特殊情况的描述）
     *
     * @param specicalState 特殊情况（对存在特殊情况的描述）
     */
    public void setSpecicalState(String specicalState) {
        this.specicalState = specicalState == null ? null : specicalState.trim();
    }

    /**
     * 获取麻醉适应证（麻醉适应证的描述）
     *
     * @return ANES_INDICATION - 麻醉适应证（麻醉适应证的描述）
     */
    public String getAnesIndication() {
        return anesIndication;
    }

    /**
     * 设置麻醉适应证（麻醉适应证的描述）
     *
     * @param anesIndication 麻醉适应证（麻醉适应证的描述）
     */
    public void setAnesIndication(String anesIndication) {
        this.anesIndication = anesIndication == null ? null : anesIndication.trim();
    }

    /**
     * 获取麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANES_DOCTOR_SIGNATURE - 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesDoctorSignature() {
        return anesDoctorSignature;
    }

    /**
     * 设置麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesDoctorSignature 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesDoctorSignature(String anesDoctorSignature) {
        this.anesDoctorSignature = anesDoctorSignature == null ? null : anesDoctorSignature.trim();
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
     * 获取手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     *
     * @return OPERATION_NAME - 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     *
     * @param operationName 手术及操作名称（患者住院期间实施的手术及操作在特定编码体系中的名称）
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
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
}