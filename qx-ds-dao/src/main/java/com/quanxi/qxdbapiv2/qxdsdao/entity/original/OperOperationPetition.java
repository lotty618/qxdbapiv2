package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OPER_OPERATION_PETITION")
public class OperOperationPetition {
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
     * 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体某次诊疗事件的顺序号）
     */
    @Id
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 手术申请单号（电子申请单）[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "OPER_PETITION_NO")
    private String operPetitionNo;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 申请科室代码（申请手术的科室代码）
     */
    @Column(name = "PETITION_DEPT_CODE")
    private String petitionDeptCode;

    /**
     * 申请科室名称（申请手术的科室名称）
     */
    @Column(name = "PETITION_DEPT_NAME")
    private String petitionDeptName;

    /**
     * 申请医生:编号（医疗服务人员的唯一编号）
     */
    @Column(name = "PETITION_DOC_ID")
    private String petitionDocId;

    /**
     * 申请医生:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PETITION_DOC_NAME")
    private String petitionDocName;

    /**
     * 申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PETITION_DATE")
    private String petitionDate;

    /**
     * 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    @Column(name = "DIR_OPER_PATIENT_TYPE")
    private String dirOperPatientType;

    /**
     * 拟手术日期（手术（操作）开始日期时间（拟定对患者开始手术操作时的公元纪年日期和时间的完整描）
     */
    @Column(name = "OPERATION_DATE")
    private String operationDate;

    /**
     * 拟手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    @Column(name = "OPERATION_CODE")
    private String operationCode;

    /**
     * 拟手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    @Column(name = "OPERATION_CN")
    private String operationCn;

    /**
     * 手术医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "SURGEON_ID")
    private String surgeonId;

    /**
     * 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "SURGEON_NAME")
    private String surgeonName;

    /**
     * Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ASSISTANT1_ID")
    private String assistant1Id;

    /**
     * Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT1_NAME")
    private String assistant1Name;

    /**
     * Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ASSISTANT2_ID")
    private String assistant2Id;

    /**
     * Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT2_NAME")
    private String assistant2Name;

    /**
     * Ⅲ助：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ASSISTANT3_ID")
    private String assistant3Id;

    /**
     * Ⅲ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ASSISTANT3_NAME")
    private String assistant3Name;

    /**
     * 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "ANESTHESIOLOGIST_ID")
    private String anesthesiologistId;

    /**
     * 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ANESTHESIOLOGIST_NAME")
    private String anesthesiologistName;

    /**
     * 拟麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    @Column(name = "ANESTHESIA_CODE")
    private String anesthesiaCode;

    /**
     * 拟麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    @Column(name = "ANESTHESIA_CN")
    private String anesthesiaCn;

    /**
     * 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    @Column(name = "OPERATION_LEVEL_CODE")
    private String operationLevelCode;

    /**
     * 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    @Column(name = "OPERATION_LEVEL_NAME")
    private String operationLevelName;

    /**
     * 手术目标部位代码CV06.00.223（实施手术的人体部位代码）
     */
    @Column(name = "OPERATION_PART_CODE")
    private String operationPartCode;

    /**
     * 手术目标部位名称（实施手术的人体部位名称）
     */
    @Column(name = "OPERATION_PART_NAME")
    private String operationPartName;

    /**
     * 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    @Column(name = "PRE_DIAGNOSIS_CODE")
    private String preDiagnosisCode;

    /**
     * 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    @Column(name = "PRE_DIAGNOSIS_CN")
    private String preDiagnosisCn;

    /**
     * 传染病说明
     */
    @Column(name = "CONTAGION")
    private String contagion;

    /**
     * 是否备血
     */
    @Column(name = "OPERATION_BLOOD")
    private String operationBlood;

    /**
     * 是否预约术中快速病理
     */
    @Column(name = "OPERATION_PATHOLOGY")
    private String operationPathology;

    /**
     * 非计划再次手术标识
     */
    @Column(name = "UNPLANNED")
    private String unplanned;

    /**
     * 附加手术标识
     */
    @Column(name = "ISADDITIONAL")
    private String isadditional;

    /**
     * 特殊手术器械
     */
    @Column(name = "OPERATION_DEVICE")
    private String operationDevice;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 手术备选方案
     */
    @Column(name = "PLAN_B")
    private String planB;

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
     * 获取本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体某次诊疗事件的顺序号）
     *
     * @return EVENT_NO - 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体某次诊疗事件的顺序号）
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * 设置本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体某次诊疗事件的顺序号）
     *
     * @param eventNo 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体某次诊疗事件的顺序号）
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取手术申请单号（电子申请单）[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return OPER_PETITION_NO - 手术申请单号（电子申请单）[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getOperPetitionNo() {
        return operPetitionNo;
    }

    /**
     * 设置手术申请单号（电子申请单）[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param operPetitionNo 手术申请单号（电子申请单）[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setOperPetitionNo(String operPetitionNo) {
        this.operPetitionNo = operPetitionNo == null ? null : operPetitionNo.trim();
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
     * 获取申请科室代码（申请手术的科室代码）
     *
     * @return PETITION_DEPT_CODE - 申请科室代码（申请手术的科室代码）
     */
    public String getPetitionDeptCode() {
        return petitionDeptCode;
    }

    /**
     * 设置申请科室代码（申请手术的科室代码）
     *
     * @param petitionDeptCode 申请科室代码（申请手术的科室代码）
     */
    public void setPetitionDeptCode(String petitionDeptCode) {
        this.petitionDeptCode = petitionDeptCode == null ? null : petitionDeptCode.trim();
    }

    /**
     * 获取申请科室名称（申请手术的科室名称）
     *
     * @return PETITION_DEPT_NAME - 申请科室名称（申请手术的科室名称）
     */
    public String getPetitionDeptName() {
        return petitionDeptName;
    }

    /**
     * 设置申请科室名称（申请手术的科室名称）
     *
     * @param petitionDeptName 申请科室名称（申请手术的科室名称）
     */
    public void setPetitionDeptName(String petitionDeptName) {
        this.petitionDeptName = petitionDeptName == null ? null : petitionDeptName.trim();
    }

    /**
     * 获取申请医生:编号（医疗服务人员的唯一编号）
     *
     * @return PETITION_DOC_ID - 申请医生:编号（医疗服务人员的唯一编号）
     */
    public String getPetitionDocId() {
        return petitionDocId;
    }

    /**
     * 设置申请医生:编号（医疗服务人员的唯一编号）
     *
     * @param petitionDocId 申请医生:编号（医疗服务人员的唯一编号）
     */
    public void setPetitionDocId(String petitionDocId) {
        this.petitionDocId = petitionDocId == null ? null : petitionDocId.trim();
    }

    /**
     * 获取申请医生:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PETITION_DOC_NAME - 申请医生:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getPetitionDocName() {
        return petitionDocName;
    }

    /**
     * 设置申请医生:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param petitionDocName 申请医生:姓名（申请医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setPetitionDocName(String petitionDocName) {
        this.petitionDocName = petitionDocName == null ? null : petitionDocName.trim();
    }

    /**
     * 获取申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     *
     * @return PETITION_DATE - 申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    public String getPetitionDate() {
        return petitionDate;
    }

    /**
     * 设置申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     *
     * @param petitionDate 申请时间（操作实际申请时的公元纪年日期和时间的完整描述）
     */
    public void setPetitionDate(String petitionDate) {
        this.petitionDate = petitionDate == null ? null : petitionDate.trim();
    }

    /**
     * 获取手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @return DIR_OPER_PATIENT_TYPE - 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public String getDirOperPatientType() {
        return dirOperPatientType;
    }

    /**
     * 设置手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     *
     * @param dirOperPatientType 手术类型代码DIR_OPER_PATIENT_TYPE（进行手术治疗的患者类型在特定编码体系中的代码）
     */
    public void setDirOperPatientType(String dirOperPatientType) {
        this.dirOperPatientType = dirOperPatientType == null ? null : dirOperPatientType.trim();
    }

    /**
     * 获取拟手术日期（手术（操作）开始日期时间（拟定对患者开始手术操作时的公元纪年日期和时间的完整描）
     *
     * @return OPERATION_DATE - 拟手术日期（手术（操作）开始日期时间（拟定对患者开始手术操作时的公元纪年日期和时间的完整描）
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * 设置拟手术日期（手术（操作）开始日期时间（拟定对患者开始手术操作时的公元纪年日期和时间的完整描）
     *
     * @param operationDate 拟手术日期（手术（操作）开始日期时间（拟定对患者开始手术操作时的公元纪年日期和时间的完整描）
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * 获取拟手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @return OPERATION_CODE - 拟手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置拟手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     *
     * @param operationCode 拟手术（操作）代码ICD-9（患者住院期间实施的手术及操作在特定编码体系中的编码）
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * 获取拟手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     *
     * @return OPERATION_CN - 拟手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    public String getOperationCn() {
        return operationCn;
    }

    /**
     * 设置拟手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     *
     * @param operationCn 拟手术/操作-中文名称（按照 ICD-9-CM-3 的名称）
     */
    public void setOperationCn(String operationCn) {
        this.operationCn = operationCn == null ? null : operationCn.trim();
    }

    /**
     * 获取手术医师：编号（医疗服务人员的唯一编号）
     *
     * @return SURGEON_ID - 手术医师：编号（医疗服务人员的唯一编号）
     */
    public String getSurgeonId() {
        return surgeonId;
    }

    /**
     * 设置手术医师：编号（医疗服务人员的唯一编号）
     *
     * @param surgeonId 手术医师：编号（医疗服务人员的唯一编号）
     */
    public void setSurgeonId(String surgeonId) {
        this.surgeonId = surgeonId == null ? null : surgeonId.trim();
    }

    /**
     * 获取手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return SURGEON_NAME - 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * 设置手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param surgeonName 手术医师：姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    /**
     * 获取Ⅰ助：编号（医疗服务人员的唯一编号）
     *
     * @return ASSISTANT1_ID - Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    public String getAssistant1Id() {
        return assistant1Id;
    }

    /**
     * 设置Ⅰ助：编号（医疗服务人员的唯一编号）
     *
     * @param assistant1Id Ⅰ助：编号（医疗服务人员的唯一编号）
     */
    public void setAssistant1Id(String assistant1Id) {
        this.assistant1Id = assistant1Id == null ? null : assistant1Id.trim();
    }

    /**
     * 获取Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT1_NAME - Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant1Name() {
        return assistant1Name;
    }

    /**
     * 设置Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant1Name Ⅰ助：姓名（协助手术者完成手术及操作的第 1 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant1Name(String assistant1Name) {
        this.assistant1Name = assistant1Name == null ? null : assistant1Name.trim();
    }

    /**
     * 获取Ⅱ助：编号（医疗服务人员的唯一编号）
     *
     * @return ASSISTANT2_ID - Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    public String getAssistant2Id() {
        return assistant2Id;
    }

    /**
     * 设置Ⅱ助：编号（医疗服务人员的唯一编号）
     *
     * @param assistant2Id Ⅱ助：编号（医疗服务人员的唯一编号）
     */
    public void setAssistant2Id(String assistant2Id) {
        this.assistant2Id = assistant2Id == null ? null : assistant2Id.trim();
    }

    /**
     * 获取Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT2_NAME - Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant2Name() {
        return assistant2Name;
    }

    /**
     * 设置Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant2Name Ⅱ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant2Name(String assistant2Name) {
        this.assistant2Name = assistant2Name == null ? null : assistant2Name.trim();
    }

    /**
     * 获取Ⅲ助：编号（医疗服务人员的唯一编号）
     *
     * @return ASSISTANT3_ID - Ⅲ助：编号（医疗服务人员的唯一编号）
     */
    public String getAssistant3Id() {
        return assistant3Id;
    }

    /**
     * 设置Ⅲ助：编号（医疗服务人员的唯一编号）
     *
     * @param assistant3Id Ⅲ助：编号（医疗服务人员的唯一编号）
     */
    public void setAssistant3Id(String assistant3Id) {
        this.assistant3Id = assistant3Id == null ? null : assistant3Id.trim();
    }

    /**
     * 获取Ⅲ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ASSISTANT3_NAME - Ⅲ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAssistant3Name() {
        return assistant3Name;
    }

    /**
     * 设置Ⅲ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param assistant3Name Ⅲ助：姓名（协助手术者完成手术及操作的第 2 助手在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAssistant3Name(String assistant3Name) {
        this.assistant3Name = assistant3Name == null ? null : assistant3Name.trim();
    }

    /**
     * 获取麻醉医师：编号（医疗服务人员的唯一编号）
     *
     * @return ANESTHESIOLOGIST_ID - 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    public String getAnesthesiologistId() {
        return anesthesiologistId;
    }

    /**
     * 设置麻醉医师：编号（医疗服务人员的唯一编号）
     *
     * @param anesthesiologistId 麻醉医师：编号（医疗服务人员的唯一编号）
     */
    public void setAnesthesiologistId(String anesthesiologistId) {
        this.anesthesiologistId = anesthesiologistId == null ? null : anesthesiologistId.trim();
    }

    /**
     * 获取麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ANESTHESIOLOGIST_NAME - 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAnesthesiologistName() {
        return anesthesiologistName;
    }

    /**
     * 设置麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param anesthesiologistName 麻醉医师：姓名（对患者实施麻醉的麻醉医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAnesthesiologistName(String anesthesiologistName) {
        this.anesthesiologistName = anesthesiologistName == null ? null : anesthesiologistName.trim();
    }

    /**
     * 获取拟麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @return ANESTHESIA_CODE - 拟麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public String getAnesthesiaCode() {
        return anesthesiaCode;
    }

    /**
     * 设置拟麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     *
     * @param anesthesiaCode 拟麻醉方式代码CV06.00.103（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的代码）
     */
    public void setAnesthesiaCode(String anesthesiaCode) {
        this.anesthesiaCode = anesthesiaCode == null ? null : anesthesiaCode.trim();
    }

    /**
     * 获取拟麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @return ANESTHESIA_CN - 拟麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public String getAnesthesiaCn() {
        return anesthesiaCn;
    }

    /**
     * 设置拟麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     *
     * @param anesthesiaCn 拟麻醉方式中文名称（为患者进行手术、操作时使用的麻醉方法在特定编码体系中的中文名称）
     */
    public void setAnesthesiaCn(String anesthesiaCn) {
        this.anesthesiaCn = anesthesiaCn == null ? null : anesthesiaCn.trim();
    }

    /**
     * 获取手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     *
     * @return OPERATION_LEVEL_CODE - 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    public String getOperationLevelCode() {
        return operationLevelCode;
    }

    /**
     * 设置手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     *
     * @param operationLevelCode 手术级别代码CV05.10.024（为患者进行手术操作的等级在特定编码体系中的代码）
     */
    public void setOperationLevelCode(String operationLevelCode) {
        this.operationLevelCode = operationLevelCode == null ? null : operationLevelCode.trim();
    }

    /**
     * 获取手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     *
     * @return OPERATION_LEVEL_NAME - 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    public String getOperationLevelName() {
        return operationLevelName;
    }

    /**
     * 设置手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     *
     * @param operationLevelName 手术级别名称（为患者进行手术操作的等级在特定编码体系中的名称）
     */
    public void setOperationLevelName(String operationLevelName) {
        this.operationLevelName = operationLevelName == null ? null : operationLevelName.trim();
    }

    /**
     * 获取手术目标部位代码CV06.00.223（实施手术的人体部位代码）
     *
     * @return OPERATION_PART_CODE - 手术目标部位代码CV06.00.223（实施手术的人体部位代码）
     */
    public String getOperationPartCode() {
        return operationPartCode;
    }

    /**
     * 设置手术目标部位代码CV06.00.223（实施手术的人体部位代码）
     *
     * @param operationPartCode 手术目标部位代码CV06.00.223（实施手术的人体部位代码）
     */
    public void setOperationPartCode(String operationPartCode) {
        this.operationPartCode = operationPartCode == null ? null : operationPartCode.trim();
    }

    /**
     * 获取手术目标部位名称（实施手术的人体部位名称）
     *
     * @return OPERATION_PART_NAME - 手术目标部位名称（实施手术的人体部位名称）
     */
    public String getOperationPartName() {
        return operationPartName;
    }

    /**
     * 设置手术目标部位名称（实施手术的人体部位名称）
     *
     * @param operationPartName 手术目标部位名称（实施手术的人体部位名称）
     */
    public void setOperationPartName(String operationPartName) {
        this.operationPartName = operationPartName == null ? null : operationPartName.trim();
    }

    /**
     * 获取术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @return PRE_DIAGNOSIS_CODE - 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public String getPreDiagnosisCode() {
        return preDiagnosisCode;
    }

    /**
     * 设置术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     *
     * @param preDiagnosisCode 术前诊断代码ICD-10（术前诊断在特定编码体系中的编码）
     */
    public void setPreDiagnosisCode(String preDiagnosisCode) {
        this.preDiagnosisCode = preDiagnosisCode == null ? null : preDiagnosisCode.trim();
    }

    /**
     * 获取术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     *
     * @return PRE_DIAGNOSIS_CN - 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    public String getPreDiagnosisCn() {
        return preDiagnosisCn;
    }

    /**
     * 设置术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     *
     * @param preDiagnosisCn 术前诊断中文名称（术前诊断在特定编码体系中的中文名称）
     */
    public void setPreDiagnosisCn(String preDiagnosisCn) {
        this.preDiagnosisCn = preDiagnosisCn == null ? null : preDiagnosisCn.trim();
    }

    /**
     * 获取传染病说明
     *
     * @return CONTAGION - 传染病说明
     */
    public String getContagion() {
        return contagion;
    }

    /**
     * 设置传染病说明
     *
     * @param contagion 传染病说明
     */
    public void setContagion(String contagion) {
        this.contagion = contagion == null ? null : contagion.trim();
    }

    /**
     * 获取是否备血
     *
     * @return OPERATION_BLOOD - 是否备血
     */
    public String getOperationBlood() {
        return operationBlood;
    }

    /**
     * 设置是否备血
     *
     * @param operationBlood 是否备血
     */
    public void setOperationBlood(String operationBlood) {
        this.operationBlood = operationBlood == null ? null : operationBlood.trim();
    }

    /**
     * 获取是否预约术中快速病理
     *
     * @return OPERATION_PATHOLOGY - 是否预约术中快速病理
     */
    public String getOperationPathology() {
        return operationPathology;
    }

    /**
     * 设置是否预约术中快速病理
     *
     * @param operationPathology 是否预约术中快速病理
     */
    public void setOperationPathology(String operationPathology) {
        this.operationPathology = operationPathology == null ? null : operationPathology.trim();
    }

    /**
     * 获取非计划再次手术标识
     *
     * @return UNPLANNED - 非计划再次手术标识
     */
    public String getUnplanned() {
        return unplanned;
    }

    /**
     * 设置非计划再次手术标识
     *
     * @param unplanned 非计划再次手术标识
     */
    public void setUnplanned(String unplanned) {
        this.unplanned = unplanned == null ? null : unplanned.trim();
    }

    /**
     * 获取附加手术标识
     *
     * @return ISADDITIONAL - 附加手术标识
     */
    public String getIsadditional() {
        return isadditional;
    }

    /**
     * 设置附加手术标识
     *
     * @param isadditional 附加手术标识
     */
    public void setIsadditional(String isadditional) {
        this.isadditional = isadditional == null ? null : isadditional.trim();
    }

    /**
     * 获取特殊手术器械
     *
     * @return OPERATION_DEVICE - 特殊手术器械
     */
    public String getOperationDevice() {
        return operationDevice;
    }

    /**
     * 设置特殊手术器械
     *
     * @param operationDevice 特殊手术器械
     */
    public void setOperationDevice(String operationDevice) {
        this.operationDevice = operationDevice == null ? null : operationDevice.trim();
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
     * 获取手术备选方案
     *
     * @return PLAN_B - 手术备选方案
     */
    public String getPlanB() {
        return planB;
    }

    /**
     * 设置手术备选方案
     *
     * @param planB 手术备选方案
     */
    public void setPlanB(String planB) {
        this.planB = planB == null ? null : planB.trim();
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