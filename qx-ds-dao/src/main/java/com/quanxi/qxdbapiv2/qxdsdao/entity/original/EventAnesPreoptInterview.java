package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EVENT_ANES_PREOPT_INTERVIEW")
public class EventAnesPreoptInterview {
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
     * 麻醉术前访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "ANES_PRE_INTERVIEW_ID")
    private String anesPreInterviewId;

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
     * 手术间编码（手术间编码）
     */
    @Column(name = "OP_ROOM_NO")
    private String opRoomNo;

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
    @Column(name = "PRE_DIAGNOSIS")
    private String preDiagnosis;

    /**
     * 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    @Column(name = "PRE_DIAGNOSIS_NAME")
    private String preDiagnosisName;

    /**
     * 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "PLAN_OPERATION_CODE")
    private String planOperationCode;

    /**
     * 拟实施手术及操作名称（拟为患者实施的手术及操作在特定编码体系中的名称）
     */
    @Column(name = "PLAN_OPERATION_NAME")
    private String planOperationName;

    /**
     * 拟实施麻醉方法编码CV06.00.103（拟实施麻醉方法编码）
     */
    @Column(name = "PLAN_ANES_WAY_CODE")
    private String planAnesWayCode;

    /**
     * 拟实施麻醉方法中文名称（拟实施麻醉方法中文名称）
     */
    @Column(name = "PLAN_ANES_WAY_NAME")
    private String planAnesWayName;

    /**
     * 术前合并疾病（患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病）
     */
    @Column(name = "OP_PRE_COMBINED_DISEASE")
    private String opPreCombinedDisease;

    /**
     * 麻醉注意事项（对可能出现问题及采取相应措施的描述）
     */
    @Column(name = "NOTICE")
    private String notice;

    /**
     * 简要病史（对患者病史的简要描述）
     */
    @Column(name = "BRIEF_HISTORY")
    private String briefHistory;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 心电图检查结果（对患者心电图检查结果的详细描述）
     */
    @Column(name = "ECG_RESULT")
    private String ecgResult;

    /**
     * 胸部X线检查结果（对患者胸部 X 线检查结果的详细描述）
     */
    @Column(name = "XRAY_EXAM_RESULT")
    private String xrayExamResult;

    /**
     * CT检查结果（CT检查结果的详细描述）
     */
    @Column(name = "CT_EXAM_RESULT")
    private String ctExamResult;

    /**
     * B超检查结果（B超检查结果的详细描述）
     */
    @Column(name = "BSCAN_RESULT")
    private String bscanResult;

    /**
     * MRI 超检查结果（MRI 检查结果的详细描述）
     */
    @Column(name = "MRI_EXAM_RESULT")
    private String mriExamResult;

    /**
     * 肺功能检查结果（患者肺功能检查结果的详细描述）
     */
    @Column(name = "PULMONARY_EXAM_RESULT")
    private String pulmonaryExamResult;

    /**
     * 血常规检查结果（麻醉术前访视时，对患者血常规检查结果的详细描述）
     */
    @Column(name = "ROUTINE_TEST_RESULT")
    private String routineTestResult;

    /**
     * 尿常规检查结果（麻醉术前访视时，对患者尿常规检查结果的详细描述）
     */
    @Column(name = "URINE_TEST_RESULT")
    private String urineTestResult;

    /**
     * 凝血功能检查结果（麻醉术前访视时，对患者凝血功能检查结果的详细描述）
     */
    @Column(name = "BLOOD_COAGULA_TEST_RESULT")
    private String bloodCoagulaTestResult;

    /**
     * 肝功能检查结果（对患者肝功能检查结果的详细描述）
     */
    @Column(name = "LIVER_TEST_RESULT")
    private String liverTestResult;

    /**
     * 血气分析检查结果（麻醉术前访视时，对患者血气分析检查结果的详细描述）
     */
    @Column(name = "BLOOD_GAS_TEST_RESULT")
    private String bloodGasTestResult;

    /**
     * 一般状况检查结果（对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等等）
     */
    @Column(name = "GENERAL_EXAM_RESULT")
    private String generalExamResult;

    /**
     * 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    @Column(name = "MENTAL_STATE_MARK")
    private String mentalStateMark;

    /**
     * 心脏听诊结果（麻醉术前访视时，对心脏听诊结果的详细描述）
     */
    @Column(name = "HEART_AUSCULTATION")
    private String heartAuscultation;

    /**
     * 肺部听诊结果（麻醉术前访视时，对患者肺部听诊检查结果的描述）
     */
    @Column(name = "LUNG_AUSCULTATION")
    private String lungAuscultation;

    /**
     * 四肢检查结果（麻醉术前访视时，对四肢检查结果的详细描述）
     */
    @Column(name = "LIMBS_MEDICAL")
    private String limbsMedical;

    /**
     * 脊柱检查结果（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    @Column(name = "SPINE_MEDICAL")
    private String spineMedical;

    /**
     * 腹部检查结果（麻醉术前访视时，对腹部检查结果的详细描述）
     */
    @Column(name = "ABDOMINAL_EXAM_RESULT")
    private String abdominalExamResult;

    /**
     * 气管检查结果（麻醉术前访视时，对气管检查结果的详细描述）
     */
    @Column(name = "TRACHEA_EXAM_RESULT")
    private String tracheaExamResult;

    /**
     * 牙齿检查结果（麻醉术前访视时，对牙齿检查结果的详细描述）
     */
    @Column(name = "DENTAL_EXAM_RESULT")
    private String dentalExamResult;

    /**
     * 术前麻醉医嘱（术前麻醉医师下达的医嘱）
     */
    @Column(name = "OP_PRE_ANES_ORDER")
    private String opPreAnesOrder;

    /**
     * 麻醉适应证（麻醉适应证的描述）
     */
    @Column(name = "ANES_INDICATION")
    private String anesIndication;

    /**
     * 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHESIOLOGIST_NAME")
    private String anesthesiologistName;

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
     * 获取麻醉术前访视记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return ANES_PRE_INTERVIEW_ID - 麻醉术前访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getAnesPreInterviewId() {
        return anesPreInterviewId;
    }

    /**
     * 设置麻醉术前访视记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param anesPreInterviewId 麻醉术前访视记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setAnesPreInterviewId(String anesPreInterviewId) {
        this.anesPreInterviewId = anesPreInterviewId == null ? null : anesPreInterviewId.trim();
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
     * 获取手术间编码（手术间编码）
     *
     * @return OP_ROOM_NO - 手术间编码（手术间编码）
     */
    public String getOpRoomNo() {
        return opRoomNo;
    }

    /**
     * 设置手术间编码（手术间编码）
     *
     * @param opRoomNo 手术间编码（手术间编码）
     */
    public void setOpRoomNo(String opRoomNo) {
        this.opRoomNo = opRoomNo == null ? null : opRoomNo.trim();
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
     * @return PRE_DIAGNOSIS - 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public String getPreDiagnosis() {
        return preDiagnosis;
    }

    /**
     * 设置术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @param preDiagnosis 术前诊断编码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public void setPreDiagnosis(String preDiagnosis) {
        this.preDiagnosis = preDiagnosis == null ? null : preDiagnosis.trim();
    }

    /**
     * 获取术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @return PRE_DIAGNOSIS_NAME - 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public String getPreDiagnosisName() {
        return preDiagnosisName;
    }

    /**
     * 设置术前诊断名称（术前诊断在特定编码体系中的名称）
     *
     * @param preDiagnosisName 术前诊断名称（术前诊断在特定编码体系中的名称）
     */
    public void setPreDiagnosisName(String preDiagnosisName) {
        this.preDiagnosisName = preDiagnosisName == null ? null : preDiagnosisName.trim();
    }

    /**
     * 获取拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     *
     * @return PLAN_OPERATION_CODE - 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    public String getPlanOperationCode() {
        return planOperationCode;
    }

    /**
     * 设置拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     *
     * @param planOperationCode 拟实施手术及操作编码ICD-9（拟为患者实施的手术及操作在特定编码体系中的编码）
     */
    public void setPlanOperationCode(String planOperationCode) {
        this.planOperationCode = planOperationCode == null ? null : planOperationCode.trim();
    }

    /**
     * 获取拟实施手术及操作名称（拟为患者实施的手术及操作在特定编码体系中的名称）
     *
     * @return PLAN_OPERATION_NAME - 拟实施手术及操作名称（拟为患者实施的手术及操作在特定编码体系中的名称）
     */
    public String getPlanOperationName() {
        return planOperationName;
    }

    /**
     * 设置拟实施手术及操作名称（拟为患者实施的手术及操作在特定编码体系中的名称）
     *
     * @param planOperationName 拟实施手术及操作名称（拟为患者实施的手术及操作在特定编码体系中的名称）
     */
    public void setPlanOperationName(String planOperationName) {
        this.planOperationName = planOperationName == null ? null : planOperationName.trim();
    }

    /**
     * 获取拟实施麻醉方法编码CV06.00.103（拟实施麻醉方法编码）
     *
     * @return PLAN_ANES_WAY_CODE - 拟实施麻醉方法编码CV06.00.103（拟实施麻醉方法编码）
     */
    public String getPlanAnesWayCode() {
        return planAnesWayCode;
    }

    /**
     * 设置拟实施麻醉方法编码CV06.00.103（拟实施麻醉方法编码）
     *
     * @param planAnesWayCode 拟实施麻醉方法编码CV06.00.103（拟实施麻醉方法编码）
     */
    public void setPlanAnesWayCode(String planAnesWayCode) {
        this.planAnesWayCode = planAnesWayCode == null ? null : planAnesWayCode.trim();
    }

    /**
     * 获取拟实施麻醉方法中文名称（拟实施麻醉方法中文名称）
     *
     * @return PLAN_ANES_WAY_NAME - 拟实施麻醉方法中文名称（拟实施麻醉方法中文名称）
     */
    public String getPlanAnesWayName() {
        return planAnesWayName;
    }

    /**
     * 设置拟实施麻醉方法中文名称（拟实施麻醉方法中文名称）
     *
     * @param planAnesWayName 拟实施麻醉方法中文名称（拟实施麻醉方法中文名称）
     */
    public void setPlanAnesWayName(String planAnesWayName) {
        this.planAnesWayName = planAnesWayName == null ? null : planAnesWayName.trim();
    }

    /**
     * 获取术前合并疾病（患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病）
     *
     * @return OP_PRE_COMBINED_DISEASE - 术前合并疾病（患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病）
     */
    public String getOpPreCombinedDisease() {
        return opPreCombinedDisease;
    }

    /**
     * 设置术前合并疾病（患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病）
     *
     * @param opPreCombinedDisease 术前合并疾病（患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病）
     */
    public void setOpPreCombinedDisease(String opPreCombinedDisease) {
        this.opPreCombinedDisease = opPreCombinedDisease == null ? null : opPreCombinedDisease.trim();
    }

    /**
     * 获取麻醉注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @return NOTICE - 麻醉注意事项（对可能出现问题及采取相应措施的描述）
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置麻醉注意事项（对可能出现问题及采取相应措施的描述）
     *
     * @param notice 麻醉注意事项（对可能出现问题及采取相应措施的描述）
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * 获取简要病史（对患者病史的简要描述）
     *
     * @return BRIEF_HISTORY - 简要病史（对患者病史的简要描述）
     */
    public String getBriefHistory() {
        return briefHistory;
    }

    /**
     * 设置简要病史（对患者病史的简要描述）
     *
     * @param briefHistory 简要病史（对患者病史的简要描述）
     */
    public void setBriefHistory(String briefHistory) {
        this.briefHistory = briefHistory == null ? null : briefHistory.trim();
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
     * 获取心电图检查结果（对患者心电图检查结果的详细描述）
     *
     * @return ECG_RESULT - 心电图检查结果（对患者心电图检查结果的详细描述）
     */
    public String getEcgResult() {
        return ecgResult;
    }

    /**
     * 设置心电图检查结果（对患者心电图检查结果的详细描述）
     *
     * @param ecgResult 心电图检查结果（对患者心电图检查结果的详细描述）
     */
    public void setEcgResult(String ecgResult) {
        this.ecgResult = ecgResult == null ? null : ecgResult.trim();
    }

    /**
     * 获取胸部X线检查结果（对患者胸部 X 线检查结果的详细描述）
     *
     * @return XRAY_EXAM_RESULT - 胸部X线检查结果（对患者胸部 X 线检查结果的详细描述）
     */
    public String getXrayExamResult() {
        return xrayExamResult;
    }

    /**
     * 设置胸部X线检查结果（对患者胸部 X 线检查结果的详细描述）
     *
     * @param xrayExamResult 胸部X线检查结果（对患者胸部 X 线检查结果的详细描述）
     */
    public void setXrayExamResult(String xrayExamResult) {
        this.xrayExamResult = xrayExamResult == null ? null : xrayExamResult.trim();
    }

    /**
     * 获取CT检查结果（CT检查结果的详细描述）
     *
     * @return CT_EXAM_RESULT - CT检查结果（CT检查结果的详细描述）
     */
    public String getCtExamResult() {
        return ctExamResult;
    }

    /**
     * 设置CT检查结果（CT检查结果的详细描述）
     *
     * @param ctExamResult CT检查结果（CT检查结果的详细描述）
     */
    public void setCtExamResult(String ctExamResult) {
        this.ctExamResult = ctExamResult == null ? null : ctExamResult.trim();
    }

    /**
     * 获取B超检查结果（B超检查结果的详细描述）
     *
     * @return BSCAN_RESULT - B超检查结果（B超检查结果的详细描述）
     */
    public String getBscanResult() {
        return bscanResult;
    }

    /**
     * 设置B超检查结果（B超检查结果的详细描述）
     *
     * @param bscanResult B超检查结果（B超检查结果的详细描述）
     */
    public void setBscanResult(String bscanResult) {
        this.bscanResult = bscanResult == null ? null : bscanResult.trim();
    }

    /**
     * 获取MRI 超检查结果（MRI 检查结果的详细描述）
     *
     * @return MRI_EXAM_RESULT - MRI 超检查结果（MRI 检查结果的详细描述）
     */
    public String getMriExamResult() {
        return mriExamResult;
    }

    /**
     * 设置MRI 超检查结果（MRI 检查结果的详细描述）
     *
     * @param mriExamResult MRI 超检查结果（MRI 检查结果的详细描述）
     */
    public void setMriExamResult(String mriExamResult) {
        this.mriExamResult = mriExamResult == null ? null : mriExamResult.trim();
    }

    /**
     * 获取肺功能检查结果（患者肺功能检查结果的详细描述）
     *
     * @return PULMONARY_EXAM_RESULT - 肺功能检查结果（患者肺功能检查结果的详细描述）
     */
    public String getPulmonaryExamResult() {
        return pulmonaryExamResult;
    }

    /**
     * 设置肺功能检查结果（患者肺功能检查结果的详细描述）
     *
     * @param pulmonaryExamResult 肺功能检查结果（患者肺功能检查结果的详细描述）
     */
    public void setPulmonaryExamResult(String pulmonaryExamResult) {
        this.pulmonaryExamResult = pulmonaryExamResult == null ? null : pulmonaryExamResult.trim();
    }

    /**
     * 获取血常规检查结果（麻醉术前访视时，对患者血常规检查结果的详细描述）
     *
     * @return ROUTINE_TEST_RESULT - 血常规检查结果（麻醉术前访视时，对患者血常规检查结果的详细描述）
     */
    public String getRoutineTestResult() {
        return routineTestResult;
    }

    /**
     * 设置血常规检查结果（麻醉术前访视时，对患者血常规检查结果的详细描述）
     *
     * @param routineTestResult 血常规检查结果（麻醉术前访视时，对患者血常规检查结果的详细描述）
     */
    public void setRoutineTestResult(String routineTestResult) {
        this.routineTestResult = routineTestResult == null ? null : routineTestResult.trim();
    }

    /**
     * 获取尿常规检查结果（麻醉术前访视时，对患者尿常规检查结果的详细描述）
     *
     * @return URINE_TEST_RESULT - 尿常规检查结果（麻醉术前访视时，对患者尿常规检查结果的详细描述）
     */
    public String getUrineTestResult() {
        return urineTestResult;
    }

    /**
     * 设置尿常规检查结果（麻醉术前访视时，对患者尿常规检查结果的详细描述）
     *
     * @param urineTestResult 尿常规检查结果（麻醉术前访视时，对患者尿常规检查结果的详细描述）
     */
    public void setUrineTestResult(String urineTestResult) {
        this.urineTestResult = urineTestResult == null ? null : urineTestResult.trim();
    }

    /**
     * 获取凝血功能检查结果（麻醉术前访视时，对患者凝血功能检查结果的详细描述）
     *
     * @return BLOOD_COAGULA_TEST_RESULT - 凝血功能检查结果（麻醉术前访视时，对患者凝血功能检查结果的详细描述）
     */
    public String getBloodCoagulaTestResult() {
        return bloodCoagulaTestResult;
    }

    /**
     * 设置凝血功能检查结果（麻醉术前访视时，对患者凝血功能检查结果的详细描述）
     *
     * @param bloodCoagulaTestResult 凝血功能检查结果（麻醉术前访视时，对患者凝血功能检查结果的详细描述）
     */
    public void setBloodCoagulaTestResult(String bloodCoagulaTestResult) {
        this.bloodCoagulaTestResult = bloodCoagulaTestResult == null ? null : bloodCoagulaTestResult.trim();
    }

    /**
     * 获取肝功能检查结果（对患者肝功能检查结果的详细描述）
     *
     * @return LIVER_TEST_RESULT - 肝功能检查结果（对患者肝功能检查结果的详细描述）
     */
    public String getLiverTestResult() {
        return liverTestResult;
    }

    /**
     * 设置肝功能检查结果（对患者肝功能检查结果的详细描述）
     *
     * @param liverTestResult 肝功能检查结果（对患者肝功能检查结果的详细描述）
     */
    public void setLiverTestResult(String liverTestResult) {
        this.liverTestResult = liverTestResult == null ? null : liverTestResult.trim();
    }

    /**
     * 获取血气分析检查结果（麻醉术前访视时，对患者血气分析检查结果的详细描述）
     *
     * @return BLOOD_GAS_TEST_RESULT - 血气分析检查结果（麻醉术前访视时，对患者血气分析检查结果的详细描述）
     */
    public String getBloodGasTestResult() {
        return bloodGasTestResult;
    }

    /**
     * 设置血气分析检查结果（麻醉术前访视时，对患者血气分析检查结果的详细描述）
     *
     * @param bloodGasTestResult 血气分析检查结果（麻醉术前访视时，对患者血气分析检查结果的详细描述）
     */
    public void setBloodGasTestResult(String bloodGasTestResult) {
        this.bloodGasTestResult = bloodGasTestResult == null ? null : bloodGasTestResult.trim();
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
     * 获取精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     *
     * @return MENTAL_STATE_MARK - 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    public String getMentalStateMark() {
        return mentalStateMark;
    }

    /**
     * 设置精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     *
     * @param mentalStateMark 精神状态正常标志0否 1是（标识患者精神状态是否正常的标志）
     */
    public void setMentalStateMark(String mentalStateMark) {
        this.mentalStateMark = mentalStateMark == null ? null : mentalStateMark.trim();
    }

    /**
     * 获取心脏听诊结果（麻醉术前访视时，对心脏听诊结果的详细描述）
     *
     * @return HEART_AUSCULTATION - 心脏听诊结果（麻醉术前访视时，对心脏听诊结果的详细描述）
     */
    public String getHeartAuscultation() {
        return heartAuscultation;
    }

    /**
     * 设置心脏听诊结果（麻醉术前访视时，对心脏听诊结果的详细描述）
     *
     * @param heartAuscultation 心脏听诊结果（麻醉术前访视时，对心脏听诊结果的详细描述）
     */
    public void setHeartAuscultation(String heartAuscultation) {
        this.heartAuscultation = heartAuscultation == null ? null : heartAuscultation.trim();
    }

    /**
     * 获取肺部听诊结果（麻醉术前访视时，对患者肺部听诊检查结果的描述）
     *
     * @return LUNG_AUSCULTATION - 肺部听诊结果（麻醉术前访视时，对患者肺部听诊检查结果的描述）
     */
    public String getLungAuscultation() {
        return lungAuscultation;
    }

    /**
     * 设置肺部听诊结果（麻醉术前访视时，对患者肺部听诊检查结果的描述）
     *
     * @param lungAuscultation 肺部听诊结果（麻醉术前访视时，对患者肺部听诊检查结果的描述）
     */
    public void setLungAuscultation(String lungAuscultation) {
        this.lungAuscultation = lungAuscultation == null ? null : lungAuscultation.trim();
    }

    /**
     * 获取四肢检查结果（麻醉术前访视时，对四肢检查结果的详细描述）
     *
     * @return LIMBS_MEDICAL - 四肢检查结果（麻醉术前访视时，对四肢检查结果的详细描述）
     */
    public String getLimbsMedical() {
        return limbsMedical;
    }

    /**
     * 设置四肢检查结果（麻醉术前访视时，对四肢检查结果的详细描述）
     *
     * @param limbsMedical 四肢检查结果（麻醉术前访视时，对四肢检查结果的详细描述）
     */
    public void setLimbsMedical(String limbsMedical) {
        this.limbsMedical = limbsMedical == null ? null : limbsMedical.trim();
    }

    /**
     * 获取脊柱检查结果（麻醉术前访视时，对脊柱检查结果的详细描述）
     *
     * @return SPINE_MEDICAL - 脊柱检查结果（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    public String getSpineMedical() {
        return spineMedical;
    }

    /**
     * 设置脊柱检查结果（麻醉术前访视时，对脊柱检查结果的详细描述）
     *
     * @param spineMedical 脊柱检查结果（麻醉术前访视时，对脊柱检查结果的详细描述）
     */
    public void setSpineMedical(String spineMedical) {
        this.spineMedical = spineMedical == null ? null : spineMedical.trim();
    }

    /**
     * 获取腹部检查结果（麻醉术前访视时，对腹部检查结果的详细描述）
     *
     * @return ABDOMINAL_EXAM_RESULT - 腹部检查结果（麻醉术前访视时，对腹部检查结果的详细描述）
     */
    public String getAbdominalExamResult() {
        return abdominalExamResult;
    }

    /**
     * 设置腹部检查结果（麻醉术前访视时，对腹部检查结果的详细描述）
     *
     * @param abdominalExamResult 腹部检查结果（麻醉术前访视时，对腹部检查结果的详细描述）
     */
    public void setAbdominalExamResult(String abdominalExamResult) {
        this.abdominalExamResult = abdominalExamResult == null ? null : abdominalExamResult.trim();
    }

    /**
     * 获取气管检查结果（麻醉术前访视时，对气管检查结果的详细描述）
     *
     * @return TRACHEA_EXAM_RESULT - 气管检查结果（麻醉术前访视时，对气管检查结果的详细描述）
     */
    public String getTracheaExamResult() {
        return tracheaExamResult;
    }

    /**
     * 设置气管检查结果（麻醉术前访视时，对气管检查结果的详细描述）
     *
     * @param tracheaExamResult 气管检查结果（麻醉术前访视时，对气管检查结果的详细描述）
     */
    public void setTracheaExamResult(String tracheaExamResult) {
        this.tracheaExamResult = tracheaExamResult == null ? null : tracheaExamResult.trim();
    }

    /**
     * 获取牙齿检查结果（麻醉术前访视时，对牙齿检查结果的详细描述）
     *
     * @return DENTAL_EXAM_RESULT - 牙齿检查结果（麻醉术前访视时，对牙齿检查结果的详细描述）
     */
    public String getDentalExamResult() {
        return dentalExamResult;
    }

    /**
     * 设置牙齿检查结果（麻醉术前访视时，对牙齿检查结果的详细描述）
     *
     * @param dentalExamResult 牙齿检查结果（麻醉术前访视时，对牙齿检查结果的详细描述）
     */
    public void setDentalExamResult(String dentalExamResult) {
        this.dentalExamResult = dentalExamResult == null ? null : dentalExamResult.trim();
    }

    /**
     * 获取术前麻醉医嘱（术前麻醉医师下达的医嘱）
     *
     * @return OP_PRE_ANES_ORDER - 术前麻醉医嘱（术前麻醉医师下达的医嘱）
     */
    public String getOpPreAnesOrder() {
        return opPreAnesOrder;
    }

    /**
     * 设置术前麻醉医嘱（术前麻醉医师下达的医嘱）
     *
     * @param opPreAnesOrder 术前麻醉医嘱（术前麻醉医师下达的医嘱）
     */
    public void setOpPreAnesOrder(String opPreAnesOrder) {
        this.opPreAnesOrder = opPreAnesOrder == null ? null : opPreAnesOrder.trim();
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
     * @return ANESTHESIOLOGIST_NAME - 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesthesiologistName() {
        return anesthesiologistName;
    }

    /**
     * 设置麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesthesiologistName 麻醉医师签名（对患者实施麻醉的麻醉医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesthesiologistName(String anesthesiologistName) {
        this.anesthesiologistName = anesthesiologistName == null ? null : anesthesiologistName.trim();
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
}