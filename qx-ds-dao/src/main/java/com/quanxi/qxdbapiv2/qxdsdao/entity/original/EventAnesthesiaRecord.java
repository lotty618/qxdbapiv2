package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EVENT_ANESTHESIA_RECORD")
public class EventAnesthesiaRecord {
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
     * 麻醉记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "ANESTHESIA_ID")
    private String anesthesiaId;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 电子申请单编号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
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
    @Column(name = "OP_POST_DIAGNOSIS")
    private String opPostDiagnosis;

    /**
     * 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    @Column(name = "OP_POST_DIAGNOSIS_NAME")
    private String opPostDiagnosisName;

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
     * 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    @Column(name = "OP_POSITION_CODE")
    private String opPositionCode;

    /**
     * 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    @Column(name = "OP_POSITION_CN")
    private String opPositionCn;

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
     * 气管插管分类（标识全身麻醉时气管插管分类的描述）
     */
    @Column(name = "TRACHEA_CANNULA_CLASS")
    private String tracheaCannulaClass;

    /**
     * 麻醉药物名称（药物通用名称）
     */
    @Column(name = "ANES_DRUG_NAME")
    private String anesDrugName;

    /**
     * 麻醉体位描述（麻醉体位的详细描述）
     */
    @Column(name = "ANES_POSITION_DESC")
    private String anesPositionDesc;

    /**
     * 呼吸类型代码DIR_BREATHE_TYPE（呼吸类型的分类代码）
     */
    @Column(name = "BREATHE_TYPE_CODE")
    private String breatheTypeCode;

    /**
     * 呼吸类型中文名称（呼吸类型的分类中文名称）
     */
    @Column(name = "BREATHE_TYPE_CN")
    private String breatheTypeCn;

    /**
     * 麻醉描述（麻醉过程的详细描述）
     */
    @Column(name = "ANES_DESC")
    private String anesDesc;

    /**
     * 常规监测项目名称（麻醉过程中，需要常规监测项目的名称）
     */
    @Column(name = "ROUTE_MONITOR_ITEM_NAME")
    private String routeMonitorItemName;

    /**
     * 常规监测项目结果（麻醉过程中，常规监测项目结果的详细记录）
     */
    @Column(name = "ROUTE_MONITOR_ITEM_RESULT")
    private String routeMonitorItemResult;

    /**
     * 特殊监测项目名称（麻醉过程中，需要特殊监测项目的名称）
     */
    @Column(name = "SPEC_MONITOR_ITEM_NAME")
    private String specMonitorItemName;

    /**
     * 特殊监测项目结果（麻醉过程中，特殊监测项目结果的详细记录）
     */
    @Column(name = "SPEC_MONITOR_ITEM_RESULT")
    private String specMonitorItemResult;

    /**
     * 麻醉合并症标志代码0否 1是 2不确定（是否具有麻醉合并症的分类代码）
     */
    @Column(name = "ANES_COMP_CODE")
    private String anesCompCode;

    /**
     * 麻醉合并症标志中文名称（是否具有麻醉合并症的分类中文名称）
     */
    @Column(name = "ANES_COMP_CN")
    private String anesCompCn;

    /**
     * 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    /**
     * 穿刺过程（局部麻醉中穿刺过程的详细描述）
     */
    @Column(name = "PUNCTURE_PROCESS")
    private String punctureProcess;

    /**
     * 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    @Column(name = "SBP")
    private Short sbp;

    /**
     * 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    @Column(name = "DBP")
    private Short dbp;

    /**
     * 体温（℃）（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERTURE")
    private BigDecimal temperture;

    /**
     * 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    @Column(name = "HEART_RATE")
    private Short heartRate;

    /**
     * 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private Short pulses;

    /**
     * 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "BREATHING_RATE")
    private Short breathingRate;

    /**
     * 美国麻醉医师协会分级标准代码CV05.10.021（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的代码）
     */
    @Column(name = "ASA_LEVEL_CODE")
    private String asaLevelCode;

    /**
     * 美国麻醉医师协会分级标准中文名称（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的中文名称）
     */
    @Column(name = "ASA_LEVEL_CN")
    private String asaLevelCn;

    /**
     * 麻醉效果（实施麻醉效果的描述）
     */
    @Column(name = "ANES_EFFECT")
    private String anesEffect;

    /**
     * 麻醉前用药（在患者进行麻醉前给予的药品的具体描述）
     */
    @Column(name = "ANES_PRE_DRUG")
    private String anesPreDrug;

    /**
     * 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPREATION_START_DATE")
    private String opreationStartDate;

    /**
     * 麻醉开始日期时间（麻醉开始时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ANES_START_DATE")
    private String anesStartDate;

    /**
     * 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPREATION_END_DATE")
    private String opreationEndDate;

    /**
     * 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OUT_OPREATING_ROOM_DATE")
    private String outOpreatingRoomDate;

    /**
     * 手术者姓名（为患者实施手术的主要执行人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPREATOR_NAME")
    private String opreatorName;

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
     * 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "BLOOD_TRANSF_DATE")
    private String bloodTransfDate;

    /**
     * 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    @Column(name = "TRANSFUSION_CODE")
    private String transfusionCode;

    /**
     * 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    @Column(name = "TRANSFUSION_CN")
    private String transfusionCn;

    /**
     * 输血量（mL）（输入红细胞、血小板、血浆全血等的数量，计量单位为mL）
     */
    @Column(name = "BLOOD")
    private BigDecimal blood;

    /**
     * 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    @Column(name = "TRANSFUSION_UNIT")
    private String transfusionUnit;

    /**
     * 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    @Column(name = "TRANSFUSE_REACTION_MARK")
    private String transfuseReactionMark;

    /**
     * 术中输液项目（手术过程中输入液体的描述）
     */
    @Column(name = "OP_INFUSION_ITEM")
    private String opInfusionItem;

    /**
     * 出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    @Column(name = "LOSSBLOOD_AMOUNT")
    private BigDecimal lossbloodAmount;

    /**
     * 患者去向代码CV05.10.011（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向）
     */
    @Column(name = "PATIENT_TO_PLACE_CODE")
    private String patientToPlaceCode;

    /**
     * 患者去向中文名称（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向中文名称）
     */
    @Column(name = "PATIENT_TO_PLACE_CN")
    private String patientToPlaceCn;

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
     * 获取麻醉记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @return ANESTHESIA_ID - 麻醉记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public String getAnesthesiaId() {
        return anesthesiaId;
    }

    /**
     * 设置麻醉记录ID[主键]（每条记录在数据库中的唯一序号）
     *
     * @param anesthesiaId 麻醉记录ID[主键]（每条记录在数据库中的唯一序号）
     */
    public void setAnesthesiaId(String anesthesiaId) {
        this.anesthesiaId = anesthesiaId == null ? null : anesthesiaId.trim();
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
     * 获取电子申请单编号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return E_ORDER_NO - 电子申请单编号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String geteOrderNo() {
        return eOrderNo;
    }

    /**
     * 设置电子申请单编号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param eOrderNo 电子申请单编号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
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
     * @return OP_POST_DIAGNOSIS - 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public String getOpPostDiagnosis() {
        return opPostDiagnosis;
    }

    /**
     * 设置术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     *
     * @param opPostDiagnosis 术后诊断编码ICD-10（术后诊断在特定编码体系中的编码）
     */
    public void setOpPostDiagnosis(String opPostDiagnosis) {
        this.opPostDiagnosis = opPostDiagnosis == null ? null : opPostDiagnosis.trim();
    }

    /**
     * 获取术后诊断名称（术后诊断在特定编码体系中的名称）
     *
     * @return OP_POST_DIAGNOSIS_NAME - 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    public String getOpPostDiagnosisName() {
        return opPostDiagnosisName;
    }

    /**
     * 设置术后诊断名称（术后诊断在特定编码体系中的名称）
     *
     * @param opPostDiagnosisName 术后诊断名称（术后诊断在特定编码体系中的名称）
     */
    public void setOpPostDiagnosisName(String opPostDiagnosisName) {
        this.opPostDiagnosisName = opPostDiagnosisName == null ? null : opPostDiagnosisName.trim();
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
     * 获取手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     *
     * @return OP_POSITION_CODE - 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    public String getOpPositionCode() {
        return opPositionCode;
    }

    /**
     * 设置手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     *
     * @param opPositionCode 手术体位代码CV06.00.223（手术时患者采取的体位在特定编码体系中的代码）
     */
    public void setOpPositionCode(String opPositionCode) {
        this.opPositionCode = opPositionCode == null ? null : opPositionCode.trim();
    }

    /**
     * 获取手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     *
     * @return OP_POSITION_CN - 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    public String getOpPositionCn() {
        return opPositionCn;
    }

    /**
     * 设置手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     *
     * @param opPositionCn 手术体位中文名称（手术时患者采取的体位在特定编码体系中的中文名称）
     */
    public void setOpPositionCn(String opPositionCn) {
        this.opPositionCn = opPositionCn == null ? null : opPositionCn.trim();
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
     * 获取气管插管分类（标识全身麻醉时气管插管分类的描述）
     *
     * @return TRACHEA_CANNULA_CLASS - 气管插管分类（标识全身麻醉时气管插管分类的描述）
     */
    public String getTracheaCannulaClass() {
        return tracheaCannulaClass;
    }

    /**
     * 设置气管插管分类（标识全身麻醉时气管插管分类的描述）
     *
     * @param tracheaCannulaClass 气管插管分类（标识全身麻醉时气管插管分类的描述）
     */
    public void setTracheaCannulaClass(String tracheaCannulaClass) {
        this.tracheaCannulaClass = tracheaCannulaClass == null ? null : tracheaCannulaClass.trim();
    }

    /**
     * 获取麻醉药物名称（药物通用名称）
     *
     * @return ANES_DRUG_NAME - 麻醉药物名称（药物通用名称）
     */
    public String getAnesDrugName() {
        return anesDrugName;
    }

    /**
     * 设置麻醉药物名称（药物通用名称）
     *
     * @param anesDrugName 麻醉药物名称（药物通用名称）
     */
    public void setAnesDrugName(String anesDrugName) {
        this.anesDrugName = anesDrugName == null ? null : anesDrugName.trim();
    }

    /**
     * 获取麻醉体位描述（麻醉体位的详细描述）
     *
     * @return ANES_POSITION_DESC - 麻醉体位描述（麻醉体位的详细描述）
     */
    public String getAnesPositionDesc() {
        return anesPositionDesc;
    }

    /**
     * 设置麻醉体位描述（麻醉体位的详细描述）
     *
     * @param anesPositionDesc 麻醉体位描述（麻醉体位的详细描述）
     */
    public void setAnesPositionDesc(String anesPositionDesc) {
        this.anesPositionDesc = anesPositionDesc == null ? null : anesPositionDesc.trim();
    }

    /**
     * 获取呼吸类型代码DIR_BREATHE_TYPE（呼吸类型的分类代码）
     *
     * @return BREATHE_TYPE_CODE - 呼吸类型代码DIR_BREATHE_TYPE（呼吸类型的分类代码）
     */
    public String getBreatheTypeCode() {
        return breatheTypeCode;
    }

    /**
     * 设置呼吸类型代码DIR_BREATHE_TYPE（呼吸类型的分类代码）
     *
     * @param breatheTypeCode 呼吸类型代码DIR_BREATHE_TYPE（呼吸类型的分类代码）
     */
    public void setBreatheTypeCode(String breatheTypeCode) {
        this.breatheTypeCode = breatheTypeCode == null ? null : breatheTypeCode.trim();
    }

    /**
     * 获取呼吸类型中文名称（呼吸类型的分类中文名称）
     *
     * @return BREATHE_TYPE_CN - 呼吸类型中文名称（呼吸类型的分类中文名称）
     */
    public String getBreatheTypeCn() {
        return breatheTypeCn;
    }

    /**
     * 设置呼吸类型中文名称（呼吸类型的分类中文名称）
     *
     * @param breatheTypeCn 呼吸类型中文名称（呼吸类型的分类中文名称）
     */
    public void setBreatheTypeCn(String breatheTypeCn) {
        this.breatheTypeCn = breatheTypeCn == null ? null : breatheTypeCn.trim();
    }

    /**
     * 获取麻醉描述（麻醉过程的详细描述）
     *
     * @return ANES_DESC - 麻醉描述（麻醉过程的详细描述）
     */
    public String getAnesDesc() {
        return anesDesc;
    }

    /**
     * 设置麻醉描述（麻醉过程的详细描述）
     *
     * @param anesDesc 麻醉描述（麻醉过程的详细描述）
     */
    public void setAnesDesc(String anesDesc) {
        this.anesDesc = anesDesc == null ? null : anesDesc.trim();
    }

    /**
     * 获取常规监测项目名称（麻醉过程中，需要常规监测项目的名称）
     *
     * @return ROUTE_MONITOR_ITEM_NAME - 常规监测项目名称（麻醉过程中，需要常规监测项目的名称）
     */
    public String getRouteMonitorItemName() {
        return routeMonitorItemName;
    }

    /**
     * 设置常规监测项目名称（麻醉过程中，需要常规监测项目的名称）
     *
     * @param routeMonitorItemName 常规监测项目名称（麻醉过程中，需要常规监测项目的名称）
     */
    public void setRouteMonitorItemName(String routeMonitorItemName) {
        this.routeMonitorItemName = routeMonitorItemName == null ? null : routeMonitorItemName.trim();
    }

    /**
     * 获取常规监测项目结果（麻醉过程中，常规监测项目结果的详细记录）
     *
     * @return ROUTE_MONITOR_ITEM_RESULT - 常规监测项目结果（麻醉过程中，常规监测项目结果的详细记录）
     */
    public String getRouteMonitorItemResult() {
        return routeMonitorItemResult;
    }

    /**
     * 设置常规监测项目结果（麻醉过程中，常规监测项目结果的详细记录）
     *
     * @param routeMonitorItemResult 常规监测项目结果（麻醉过程中，常规监测项目结果的详细记录）
     */
    public void setRouteMonitorItemResult(String routeMonitorItemResult) {
        this.routeMonitorItemResult = routeMonitorItemResult == null ? null : routeMonitorItemResult.trim();
    }

    /**
     * 获取特殊监测项目名称（麻醉过程中，需要特殊监测项目的名称）
     *
     * @return SPEC_MONITOR_ITEM_NAME - 特殊监测项目名称（麻醉过程中，需要特殊监测项目的名称）
     */
    public String getSpecMonitorItemName() {
        return specMonitorItemName;
    }

    /**
     * 设置特殊监测项目名称（麻醉过程中，需要特殊监测项目的名称）
     *
     * @param specMonitorItemName 特殊监测项目名称（麻醉过程中，需要特殊监测项目的名称）
     */
    public void setSpecMonitorItemName(String specMonitorItemName) {
        this.specMonitorItemName = specMonitorItemName == null ? null : specMonitorItemName.trim();
    }

    /**
     * 获取特殊监测项目结果（麻醉过程中，特殊监测项目结果的详细记录）
     *
     * @return SPEC_MONITOR_ITEM_RESULT - 特殊监测项目结果（麻醉过程中，特殊监测项目结果的详细记录）
     */
    public String getSpecMonitorItemResult() {
        return specMonitorItemResult;
    }

    /**
     * 设置特殊监测项目结果（麻醉过程中，特殊监测项目结果的详细记录）
     *
     * @param specMonitorItemResult 特殊监测项目结果（麻醉过程中，特殊监测项目结果的详细记录）
     */
    public void setSpecMonitorItemResult(String specMonitorItemResult) {
        this.specMonitorItemResult = specMonitorItemResult == null ? null : specMonitorItemResult.trim();
    }

    /**
     * 获取麻醉合并症标志代码0否 1是 2不确定（是否具有麻醉合并症的分类代码）
     *
     * @return ANES_COMP_CODE - 麻醉合并症标志代码0否 1是 2不确定（是否具有麻醉合并症的分类代码）
     */
    public String getAnesCompCode() {
        return anesCompCode;
    }

    /**
     * 设置麻醉合并症标志代码0否 1是 2不确定（是否具有麻醉合并症的分类代码）
     *
     * @param anesCompCode 麻醉合并症标志代码0否 1是 2不确定（是否具有麻醉合并症的分类代码）
     */
    public void setAnesCompCode(String anesCompCode) {
        this.anesCompCode = anesCompCode == null ? null : anesCompCode.trim();
    }

    /**
     * 获取麻醉合并症标志中文名称（是否具有麻醉合并症的分类中文名称）
     *
     * @return ANES_COMP_CN - 麻醉合并症标志中文名称（是否具有麻醉合并症的分类中文名称）
     */
    public String getAnesCompCn() {
        return anesCompCn;
    }

    /**
     * 设置麻醉合并症标志中文名称（是否具有麻醉合并症的分类中文名称）
     *
     * @param anesCompCn 麻醉合并症标志中文名称（是否具有麻醉合并症的分类中文名称）
     */
    public void setAnesCompCn(String anesCompCn) {
        this.anesCompCn = anesCompCn == null ? null : anesCompCn.trim();
    }

    /**
     * 获取诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @return TREAT_RESCUE_COURSE - 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * 设置诊疗过程描述（对患者诊疗过程的详细描述）
     *
     * @param treatRescueCourse 诊疗过程描述（对患者诊疗过程的详细描述）
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * 获取穿刺过程（局部麻醉中穿刺过程的详细描述）
     *
     * @return PUNCTURE_PROCESS - 穿刺过程（局部麻醉中穿刺过程的详细描述）
     */
    public String getPunctureProcess() {
        return punctureProcess;
    }

    /**
     * 设置穿刺过程（局部麻醉中穿刺过程的详细描述）
     *
     * @param punctureProcess 穿刺过程（局部麻醉中穿刺过程的详细描述）
     */
    public void setPunctureProcess(String punctureProcess) {
        this.punctureProcess = punctureProcess == null ? null : punctureProcess.trim();
    }

    /**
     * 获取收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @return SBP - 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public Short getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压（收缩压的测量值，计量单位为 mmHg）
     *
     * @param sbp 收缩压（收缩压的测量值，计量单位为 mmHg）
     */
    public void setSbp(Short sbp) {
        this.sbp = sbp;
    }

    /**
     * 获取舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @return DBP - 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public Short getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压（舒张压的测量值，计量单位为 mmHg）
     *
     * @param dbp 舒张压（舒张压的测量值，计量单位为 mmHg）
     */
    public void setDbp(Short dbp) {
        this.dbp = dbp;
    }

    /**
     * 获取体温（℃）（体温的测量值，计量单位为℃）
     *
     * @return TEMPERTURE - 体温（℃）（体温的测量值，计量单位为℃）
     */
    public BigDecimal getTemperture() {
        return temperture;
    }

    /**
     * 设置体温（℃）（体温的测量值，计量单位为℃）
     *
     * @param temperture 体温（℃）（体温的测量值，计量单位为℃）
     */
    public void setTemperture(BigDecimal temperture) {
        this.temperture = temperture;
    }

    /**
     * 获取心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     *
     * @return HEART_RATE - 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    public Short getHeartRate() {
        return heartRate;
    }

    /**
     * 设置心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     *
     * @param heartRate 心率（次/min）（心脏搏动频率的测量值，计量单位为次/min）
     */
    public void setHeartRate(Short heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * 获取脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @return PULSES - 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public Short getPulses() {
        return pulses;
    }

    /**
     * 设置脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @param pulses 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public void setPulses(Short pulses) {
        this.pulses = pulses;
    }

    /**
     * 获取呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @return BREATHING_RATE - 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public Short getBreathingRate() {
        return breathingRate;
    }

    /**
     * 设置呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @param breathingRate 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public void setBreathingRate(Short breathingRate) {
        this.breathingRate = breathingRate;
    }

    /**
     * 获取美国麻醉医师协会分级标准代码CV05.10.021（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的代码）
     *
     * @return ASA_LEVEL_CODE - 美国麻醉医师协会分级标准代码CV05.10.021（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的代码）
     */
    public String getAsaLevelCode() {
        return asaLevelCode;
    }

    /**
     * 设置美国麻醉医师协会分级标准代码CV05.10.021（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的代码）
     *
     * @param asaLevelCode 美国麻醉医师协会分级标准代码CV05.10.021（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的代码）
     */
    public void setAsaLevelCode(String asaLevelCode) {
        this.asaLevelCode = asaLevelCode == null ? null : asaLevelCode.trim();
    }

    /**
     * 获取美国麻醉医师协会分级标准中文名称（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的中文名称）
     *
     * @return ASA_LEVEL_CN - 美国麻醉医师协会分级标准中文名称（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的中文名称）
     */
    public String getAsaLevelCn() {
        return asaLevelCn;
    }

    /**
     * 设置美国麻醉医师协会分级标准中文名称（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的中文名称）
     *
     * @param asaLevelCn 美国麻醉医师协会分级标准中文名称（根据美国麻醉师协会（ASA）制定的分级标准，对病人体质状况和对手术危险性进行评估分级的结果在特定编码体系中的中文名称）
     */
    public void setAsaLevelCn(String asaLevelCn) {
        this.asaLevelCn = asaLevelCn == null ? null : asaLevelCn.trim();
    }

    /**
     * 获取麻醉效果（实施麻醉效果的描述）
     *
     * @return ANES_EFFECT - 麻醉效果（实施麻醉效果的描述）
     */
    public String getAnesEffect() {
        return anesEffect;
    }

    /**
     * 设置麻醉效果（实施麻醉效果的描述）
     *
     * @param anesEffect 麻醉效果（实施麻醉效果的描述）
     */
    public void setAnesEffect(String anesEffect) {
        this.anesEffect = anesEffect == null ? null : anesEffect.trim();
    }

    /**
     * 获取麻醉前用药（在患者进行麻醉前给予的药品的具体描述）
     *
     * @return ANES_PRE_DRUG - 麻醉前用药（在患者进行麻醉前给予的药品的具体描述）
     */
    public String getAnesPreDrug() {
        return anesPreDrug;
    }

    /**
     * 设置麻醉前用药（在患者进行麻醉前给予的药品的具体描述）
     *
     * @param anesPreDrug 麻醉前用药（在患者进行麻醉前给予的药品的具体描述）
     */
    public void setAnesPreDrug(String anesPreDrug) {
        this.anesPreDrug = anesPreDrug == null ? null : anesPreDrug.trim();
    }

    /**
     * 获取手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPREATION_START_DATE - 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOpreationStartDate() {
        return opreationStartDate;
    }

    /**
     * 设置手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param opreationStartDate 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOpreationStartDate(String opreationStartDate) {
        this.opreationStartDate = opreationStartDate == null ? null : opreationStartDate.trim();
    }

    /**
     * 获取麻醉开始日期时间（麻醉开始时的公元纪年日期和时间的完整描述）
     *
     * @return ANES_START_DATE - 麻醉开始日期时间（麻醉开始时的公元纪年日期和时间的完整描述）
     */
    public String getAnesStartDate() {
        return anesStartDate;
    }

    /**
     * 设置麻醉开始日期时间（麻醉开始时的公元纪年日期和时间的完整描述）
     *
     * @param anesStartDate 麻醉开始日期时间（麻醉开始时的公元纪年日期和时间的完整描述）
     */
    public void setAnesStartDate(String anesStartDate) {
        this.anesStartDate = anesStartDate == null ? null : anesStartDate.trim();
    }

    /**
     * 获取手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPREATION_END_DATE - 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOpreationEndDate() {
        return opreationEndDate;
    }

    /**
     * 设置手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param opreationEndDate 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOpreationEndDate(String opreationEndDate) {
        this.opreationEndDate = opreationEndDate == null ? null : opreationEndDate.trim();
    }

    /**
     * 获取出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     *
     * @return OUT_OPREATING_ROOM_DATE - 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    public String getOutOpreatingRoomDate() {
        return outOpreatingRoomDate;
    }

    /**
     * 设置出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     *
     * @param outOpreatingRoomDate 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    public void setOutOpreatingRoomDate(String outOpreatingRoomDate) {
        this.outOpreatingRoomDate = outOpreatingRoomDate == null ? null : outOpreatingRoomDate.trim();
    }

    /**
     * 获取手术者姓名（为患者实施手术的主要执行人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return OPREATOR_NAME - 手术者姓名（为患者实施手术的主要执行人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOpreatorName() {
        return opreatorName;
    }

    /**
     * 设置手术者姓名（为患者实施手术的主要执行人员在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param opreatorName 手术者姓名（为患者实施手术的主要执行人员在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOpreatorName(String opreatorName) {
        this.opreatorName = opreatorName == null ? null : opreatorName.trim();
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
     * 获取输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     *
     * @return BLOOD_TRANSF_DATE - 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    public String getBloodTransfDate() {
        return bloodTransfDate;
    }

    /**
     * 设置输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     *
     * @param bloodTransfDate 输血日期时间（患者输血结束时的公元纪年日期和时间的完整描述）
     */
    public void setBloodTransfDate(String bloodTransfDate) {
        this.bloodTransfDate = bloodTransfDate == null ? null : bloodTransfDate.trim();
    }

    /**
     * 获取输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     *
     * @return TRANSFUSION_CODE - 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    public String getTransfusionCode() {
        return transfusionCode;
    }

    /**
     * 设置输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     *
     * @param transfusionCode 输血品种代码CV04.50.021（输入全血或血液成分类别在特定编码体系中的代码）
     */
    public void setTransfusionCode(String transfusionCode) {
        this.transfusionCode = transfusionCode == null ? null : transfusionCode.trim();
    }

    /**
     * 获取输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     *
     * @return TRANSFUSION_CN - 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    public String getTransfusionCn() {
        return transfusionCn;
    }

    /**
     * 设置输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     *
     * @param transfusionCn 输血品种中文名称（输入全血或血液成分类别在特定编码体系中的中文名称）
     */
    public void setTransfusionCn(String transfusionCn) {
        this.transfusionCn = transfusionCn == null ? null : transfusionCn.trim();
    }

    /**
     * 获取输血量（mL）（输入红细胞、血小板、血浆全血等的数量，计量单位为mL）
     *
     * @return BLOOD - 输血量（mL）（输入红细胞、血小板、血浆全血等的数量，计量单位为mL）
     */
    public BigDecimal getBlood() {
        return blood;
    }

    /**
     * 设置输血量（mL）（输入红细胞、血小板、血浆全血等的数量，计量单位为mL）
     *
     * @param blood 输血量（mL）（输入红细胞、血小板、血浆全血等的数量，计量单位为mL）
     */
    public void setBlood(BigDecimal blood) {
        this.blood = blood;
    }

    /**
     * 获取输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     *
     * @return TRANSFUSION_UNIT - 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    public String getTransfusionUnit() {
        return transfusionUnit;
    }

    /**
     * 设置输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     *
     * @param transfusionUnit 输血量计量单位（输入血液或血液成分的计量单位，可包含汉字的字符，如 mL，单位，治疗量等）
     */
    public void setTransfusionUnit(String transfusionUnit) {
        this.transfusionUnit = transfusionUnit == null ? null : transfusionUnit.trim();
    }

    /**
     * 获取输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @return TRANSFUSE_REACTION_MARK - 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public String getTransfuseReactionMark() {
        return transfuseReactionMark;
    }

    /**
     * 设置输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     *
     * @param transfuseReactionMark 输血反应标志0否 1是（标识患者术中输血后是否发生了输血反应的标志）
     */
    public void setTransfuseReactionMark(String transfuseReactionMark) {
        this.transfuseReactionMark = transfuseReactionMark == null ? null : transfuseReactionMark.trim();
    }

    /**
     * 获取术中输液项目（手术过程中输入液体的描述）
     *
     * @return OP_INFUSION_ITEM - 术中输液项目（手术过程中输入液体的描述）
     */
    public String getOpInfusionItem() {
        return opInfusionItem;
    }

    /**
     * 设置术中输液项目（手术过程中输入液体的描述）
     *
     * @param opInfusionItem 术中输液项目（手术过程中输入液体的描述）
     */
    public void setOpInfusionItem(String opInfusionItem) {
        this.opInfusionItem = opInfusionItem == null ? null : opInfusionItem.trim();
    }

    /**
     * 获取出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     *
     * @return LOSSBLOOD_AMOUNT - 出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    public BigDecimal getLossbloodAmount() {
        return lossbloodAmount;
    }

    /**
     * 设置出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     *
     * @param lossbloodAmount 出血量（mL）（手术中出血量的累计值，计量单位为 mL）
     */
    public void setLossbloodAmount(BigDecimal lossbloodAmount) {
        this.lossbloodAmount = lossbloodAmount;
    }

    /**
     * 获取患者去向代码CV05.10.011（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向）
     *
     * @return PATIENT_TO_PLACE_CODE - 患者去向代码CV05.10.011（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向）
     */
    public String getPatientToPlaceCode() {
        return patientToPlaceCode;
    }

    /**
     * 设置患者去向代码CV05.10.011（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向）
     *
     * @param patientToPlaceCode 患者去向代码CV05.10.011（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向）
     */
    public void setPatientToPlaceCode(String patientToPlaceCode) {
        this.patientToPlaceCode = patientToPlaceCode == null ? null : patientToPlaceCode.trim();
    }

    /**
     * 获取患者去向中文名称（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向中文名称）
     *
     * @return PATIENT_TO_PLACE_CN - 患者去向中文名称（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向中文名称）
     */
    public String getPatientToPlaceCn() {
        return patientToPlaceCn;
    }

    /**
     * 设置患者去向中文名称（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向中文名称）
     *
     * @param patientToPlaceCn 患者去向中文名称（患者当前诊疗过程结束后的去向在特定编码体系中的代码，这里指离开急诊观察室或监护室后的去向中文名称）
     */
    public void setPatientToPlaceCn(String patientToPlaceCn) {
        this.patientToPlaceCn = patientToPlaceCn == null ? null : patientToPlaceCn.trim();
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