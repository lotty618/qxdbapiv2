package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_NIS_OPERATION_NURSING")
public class QxTNisOperationNursing {
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
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "OPERATION_NURSING_ID")
    private String operationNursingId;

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
     * 手术间编码（手术间编码）
     */
    @Column(name = "OP_ROMM_NO")
    private String opRommNo;

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
     * 体重（kg）（患者体重的测量值，计量单位为 kg）
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
     * 手术者姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "OPERATOR_SIGNATURE")
    private String operatorSignature;

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
     * 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_START_DATE")
    private String operationStartDate;

    /**
     * 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OPERATION_END_DATE")
    private String operationEndDate;

    /**
     * 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    @Column(name = "ALLERGY_MARK")
    private String allergyMark;

    /**
     * 过敏史（患者既往发生过敏情况的详细描述）
     */
    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 皮肤检查描述（皮肤检查结果的详细描述）
     */
    @Column(name = "SKIN_EXAM_DESC")
    private String skinExamDesc;

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
     * 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    @Column(name = "NURSING_OBS_ITEM_NAME")
    private String nursingObsItemName;

    /**
     * 护理观察结果（对护理观察项目结果的详细描述）
     */
    @Column(name = "NURSING_OBS_RESULT")
    private String nursingObsResult;

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
     * 入手术史日期时间（患者进入手术室时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_OPERATING_ROOM_DATE")
    private String inOperatingRoomDate;

    /**
     * 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "OUT_OPERATING_ROOM_DATE")
    private String outOperatingRoomDate;

    /**
     * 准备事项（针对病人实施手术的准备工作描述）
     */
    @Column(name = "PREPARE_ITEM")
    private String prepareItem;

    /**
     * 术中病理标志0否 1是（标识术中手术标本是否进行病理切片检查的标志）
     */
    @Column(name = "OP_PATHOLOGY_MARK")
    private String opPathologyMark;

    /**
     * 术中所用物品名称（术中所用物品的名称）
     */
    @Column(name = "OP_MATERIAL_NAME")
    private String opMaterialName;

    /**
     * 术前清点标志0否 1是（标识术前是否对即将使用的物品进行清点的标志）
     */
    @Column(name = "OP_PRE_CHECK_MARK")
    private String opPreCheckMark;

    /**
     * 关前核对标志0否 1是（标识手术切口缝合前对物品是否进行了清点核对的标志）
     */
    @Column(name = "OP_PRE_MATERIAL_CHK_MARK")
    private String opPreMaterialChkMark;

    /**
     * 关后核对标志0否 1是（标识手术切口缝合后对物品是否进行了清点核对的标志）
     */
    @Column(name = "OP_POST_MATERIAL_CHK_MARK")
    private String opPostMaterialChkMark;

    /**
     * 病人交接核对项目（病人在进行交接时需要核对的项目名称）
     */
    @Column(name = "PAT_HANDOVER_ITEM")
    private String patHandoverItem;

    /**
     * 巡台护士签名（巡台护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "TOUR_NURSE_SIGNATURE")
    private String tourNurseSignature;

    /**
     * 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DEVICE_NURE_SIGNATURE")
    private String deviceNureSignature;

    /**
     * 交接护士签名（病人交接时，交接护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "HANDOVER_NURSE_SIGNATURE")
    private String handoverNurseSignature;

    /**
     * 转运者签名（病人交接时，转运者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "TRANSPORTER_SIGNATURE")
    private String transporterSignature;

    /**
     * 交接日期时间（手术患者在转运过程（术前交接、术后交接及麻醉恢复后患者交接）中进行交接时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "HANDOVER_DATE")
    private String handoverDate;

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
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return OPERATION_NURSING_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getOperationNursingId() {
        return operationNursingId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param operationNursingId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setOperationNursingId(String operationNursingId) {
        this.operationNursingId = operationNursingId == null ? null : operationNursingId.trim();
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
     * 获取手术间编码（手术间编码）
     *
     * @return OP_ROMM_NO - 手术间编码（手术间编码）
     */
    public String getOpRommNo() {
        return opRommNo;
    }

    /**
     * 设置手术间编码（手术间编码）
     *
     * @param opRommNo 手术间编码（手术间编码）
     */
    public void setOpRommNo(String opRommNo) {
        this.opRommNo = opRommNo == null ? null : opRommNo.trim();
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
     * 获取体重（kg）（患者体重的测量值，计量单位为 kg）
     *
     * @return WEIGHT - 体重（kg）（患者体重的测量值，计量单位为 kg）
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置体重（kg）（患者体重的测量值，计量单位为 kg）
     *
     * @param weight 体重（kg）（患者体重的测量值，计量单位为 kg）
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
     * 获取手术者姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return OPERATOR_SIGNATURE - 手术者姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOperatorSignature() {
        return operatorSignature;
    }

    /**
     * 设置手术者姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param operatorSignature 手术者姓名（为患者实施手术的主要执行人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOperatorSignature(String operatorSignature) {
        this.operatorSignature = operatorSignature == null ? null : operatorSignature.trim();
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
     * 获取手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_START_DATE - 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationStartDate() {
        return operationStartDate;
    }

    /**
     * 设置手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationStartDate 手术开始日期时间（对患者开始手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationStartDate(String operationStartDate) {
        this.operationStartDate = operationStartDate == null ? null : operationStartDate.trim();
    }

    /**
     * 获取手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @return OPERATION_END_DATE - 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public String getOperationEndDate() {
        return operationEndDate;
    }

    /**
     * 设置手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     *
     * @param operationEndDate 手术结束日期时间（对患者结束手术操作时的公元纪年日期和时间的完整描述）
     */
    public void setOperationEndDate(String operationEndDate) {
        this.operationEndDate = operationEndDate == null ? null : operationEndDate.trim();
    }

    /**
     * 获取过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @return ALLERGY_MARK - 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public String getAllergyMark() {
        return allergyMark;
    }

    /**
     * 设置过敏史标志0否 1是（标识患者有无过敏经历的标志）
     *
     * @param allergyMark 过敏史标志0否 1是（标识患者有无过敏经历的标志）
     */
    public void setAllergyMark(String allergyMark) {
        this.allergyMark = allergyMark == null ? null : allergyMark.trim();
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
     * 获取皮肤检查描述（皮肤检查结果的详细描述）
     *
     * @return SKIN_EXAM_DESC - 皮肤检查描述（皮肤检查结果的详细描述）
     */
    public String getSkinExamDesc() {
        return skinExamDesc;
    }

    /**
     * 设置皮肤检查描述（皮肤检查结果的详细描述）
     *
     * @param skinExamDesc 皮肤检查描述（皮肤检查结果的详细描述）
     */
    public void setSkinExamDesc(String skinExamDesc) {
        this.skinExamDesc = skinExamDesc == null ? null : skinExamDesc.trim();
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
     * 获取护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @return NURSING_OBS_ITEM_NAME - 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public String getNursingObsItemName() {
        return nursingObsItemName;
    }

    /**
     * 设置护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @param nursingObsItemName 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public void setNursingObsItemName(String nursingObsItemName) {
        this.nursingObsItemName = nursingObsItemName == null ? null : nursingObsItemName.trim();
    }

    /**
     * 获取护理观察结果（对护理观察项目结果的详细描述）
     *
     * @return NURSING_OBS_RESULT - 护理观察结果（对护理观察项目结果的详细描述）
     */
    public String getNursingObsResult() {
        return nursingObsResult;
    }

    /**
     * 设置护理观察结果（对护理观察项目结果的详细描述）
     *
     * @param nursingObsResult 护理观察结果（对护理观察项目结果的详细描述）
     */
    public void setNursingObsResult(String nursingObsResult) {
        this.nursingObsResult = nursingObsResult == null ? null : nursingObsResult.trim();
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
     * 获取入手术史日期时间（患者进入手术室时的公元纪年日期和时间的完整描述）
     *
     * @return IN_OPERATING_ROOM_DATE - 入手术史日期时间（患者进入手术室时的公元纪年日期和时间的完整描述）
     */
    public String getInOperatingRoomDate() {
        return inOperatingRoomDate;
    }

    /**
     * 设置入手术史日期时间（患者进入手术室时的公元纪年日期和时间的完整描述）
     *
     * @param inOperatingRoomDate 入手术史日期时间（患者进入手术室时的公元纪年日期和时间的完整描述）
     */
    public void setInOperatingRoomDate(String inOperatingRoomDate) {
        this.inOperatingRoomDate = inOperatingRoomDate == null ? null : inOperatingRoomDate.trim();
    }

    /**
     * 获取出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     *
     * @return OUT_OPERATING_ROOM_DATE - 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    public String getOutOperatingRoomDate() {
        return outOperatingRoomDate;
    }

    /**
     * 设置出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     *
     * @param outOperatingRoomDate 出手术室日期时间（患者离开手术室时的公元纪年日期和时间的完整描述）
     */
    public void setOutOperatingRoomDate(String outOperatingRoomDate) {
        this.outOperatingRoomDate = outOperatingRoomDate == null ? null : outOperatingRoomDate.trim();
    }

    /**
     * 获取准备事项（针对病人实施手术的准备工作描述）
     *
     * @return PREPARE_ITEM - 准备事项（针对病人实施手术的准备工作描述）
     */
    public String getPrepareItem() {
        return prepareItem;
    }

    /**
     * 设置准备事项（针对病人实施手术的准备工作描述）
     *
     * @param prepareItem 准备事项（针对病人实施手术的准备工作描述）
     */
    public void setPrepareItem(String prepareItem) {
        this.prepareItem = prepareItem == null ? null : prepareItem.trim();
    }

    /**
     * 获取术中病理标志0否 1是（标识术中手术标本是否进行病理切片检查的标志）
     *
     * @return OP_PATHOLOGY_MARK - 术中病理标志0否 1是（标识术中手术标本是否进行病理切片检查的标志）
     */
    public String getOpPathologyMark() {
        return opPathologyMark;
    }

    /**
     * 设置术中病理标志0否 1是（标识术中手术标本是否进行病理切片检查的标志）
     *
     * @param opPathologyMark 术中病理标志0否 1是（标识术中手术标本是否进行病理切片检查的标志）
     */
    public void setOpPathologyMark(String opPathologyMark) {
        this.opPathologyMark = opPathologyMark == null ? null : opPathologyMark.trim();
    }

    /**
     * 获取术中所用物品名称（术中所用物品的名称）
     *
     * @return OP_MATERIAL_NAME - 术中所用物品名称（术中所用物品的名称）
     */
    public String getOpMaterialName() {
        return opMaterialName;
    }

    /**
     * 设置术中所用物品名称（术中所用物品的名称）
     *
     * @param opMaterialName 术中所用物品名称（术中所用物品的名称）
     */
    public void setOpMaterialName(String opMaterialName) {
        this.opMaterialName = opMaterialName == null ? null : opMaterialName.trim();
    }

    /**
     * 获取术前清点标志0否 1是（标识术前是否对即将使用的物品进行清点的标志）
     *
     * @return OP_PRE_CHECK_MARK - 术前清点标志0否 1是（标识术前是否对即将使用的物品进行清点的标志）
     */
    public String getOpPreCheckMark() {
        return opPreCheckMark;
    }

    /**
     * 设置术前清点标志0否 1是（标识术前是否对即将使用的物品进行清点的标志）
     *
     * @param opPreCheckMark 术前清点标志0否 1是（标识术前是否对即将使用的物品进行清点的标志）
     */
    public void setOpPreCheckMark(String opPreCheckMark) {
        this.opPreCheckMark = opPreCheckMark == null ? null : opPreCheckMark.trim();
    }

    /**
     * 获取关前核对标志0否 1是（标识手术切口缝合前对物品是否进行了清点核对的标志）
     *
     * @return OP_PRE_MATERIAL_CHK_MARK - 关前核对标志0否 1是（标识手术切口缝合前对物品是否进行了清点核对的标志）
     */
    public String getOpPreMaterialChkMark() {
        return opPreMaterialChkMark;
    }

    /**
     * 设置关前核对标志0否 1是（标识手术切口缝合前对物品是否进行了清点核对的标志）
     *
     * @param opPreMaterialChkMark 关前核对标志0否 1是（标识手术切口缝合前对物品是否进行了清点核对的标志）
     */
    public void setOpPreMaterialChkMark(String opPreMaterialChkMark) {
        this.opPreMaterialChkMark = opPreMaterialChkMark == null ? null : opPreMaterialChkMark.trim();
    }

    /**
     * 获取关后核对标志0否 1是（标识手术切口缝合后对物品是否进行了清点核对的标志）
     *
     * @return OP_POST_MATERIAL_CHK_MARK - 关后核对标志0否 1是（标识手术切口缝合后对物品是否进行了清点核对的标志）
     */
    public String getOpPostMaterialChkMark() {
        return opPostMaterialChkMark;
    }

    /**
     * 设置关后核对标志0否 1是（标识手术切口缝合后对物品是否进行了清点核对的标志）
     *
     * @param opPostMaterialChkMark 关后核对标志0否 1是（标识手术切口缝合后对物品是否进行了清点核对的标志）
     */
    public void setOpPostMaterialChkMark(String opPostMaterialChkMark) {
        this.opPostMaterialChkMark = opPostMaterialChkMark == null ? null : opPostMaterialChkMark.trim();
    }

    /**
     * 获取病人交接核对项目（病人在进行交接时需要核对的项目名称）
     *
     * @return PAT_HANDOVER_ITEM - 病人交接核对项目（病人在进行交接时需要核对的项目名称）
     */
    public String getPatHandoverItem() {
        return patHandoverItem;
    }

    /**
     * 设置病人交接核对项目（病人在进行交接时需要核对的项目名称）
     *
     * @param patHandoverItem 病人交接核对项目（病人在进行交接时需要核对的项目名称）
     */
    public void setPatHandoverItem(String patHandoverItem) {
        this.patHandoverItem = patHandoverItem == null ? null : patHandoverItem.trim();
    }

    /**
     * 获取巡台护士签名（巡台护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return TOUR_NURSE_SIGNATURE - 巡台护士签名（巡台护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getTourNurseSignature() {
        return tourNurseSignature;
    }

    /**
     * 设置巡台护士签名（巡台护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param tourNurseSignature 巡台护士签名（巡台护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setTourNurseSignature(String tourNurseSignature) {
        this.tourNurseSignature = tourNurseSignature == null ? null : tourNurseSignature.trim();
    }

    /**
     * 获取器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DEVICE_NURE_SIGNATURE - 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDeviceNureSignature() {
        return deviceNureSignature;
    }

    /**
     * 设置器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param deviceNureSignature 器械护士签名（器械护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDeviceNureSignature(String deviceNureSignature) {
        this.deviceNureSignature = deviceNureSignature == null ? null : deviceNureSignature.trim();
    }

    /**
     * 获取交接护士签名（病人交接时，交接护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return HANDOVER_NURSE_SIGNATURE - 交接护士签名（病人交接时，交接护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getHandoverNurseSignature() {
        return handoverNurseSignature;
    }

    /**
     * 设置交接护士签名（病人交接时，交接护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param handoverNurseSignature 交接护士签名（病人交接时，交接护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setHandoverNurseSignature(String handoverNurseSignature) {
        this.handoverNurseSignature = handoverNurseSignature == null ? null : handoverNurseSignature.trim();
    }

    /**
     * 获取转运者签名（病人交接时，转运者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return TRANSPORTER_SIGNATURE - 转运者签名（病人交接时，转运者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getTransporterSignature() {
        return transporterSignature;
    }

    /**
     * 设置转运者签名（病人交接时，转运者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param transporterSignature 转运者签名（病人交接时，转运者签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setTransporterSignature(String transporterSignature) {
        this.transporterSignature = transporterSignature == null ? null : transporterSignature.trim();
    }

    /**
     * 获取交接日期时间（手术患者在转运过程（术前交接、术后交接及麻醉恢复后患者交接）中进行交接时的公元纪年日期和时间的完整描述）
     *
     * @return HANDOVER_DATE - 交接日期时间（手术患者在转运过程（术前交接、术后交接及麻醉恢复后患者交接）中进行交接时的公元纪年日期和时间的完整描述）
     */
    public String getHandoverDate() {
        return handoverDate;
    }

    /**
     * 设置交接日期时间（手术患者在转运过程（术前交接、术后交接及麻醉恢复后患者交接）中进行交接时的公元纪年日期和时间的完整描述）
     *
     * @param handoverDate 交接日期时间（手术患者在转运过程（术前交接、术后交接及麻醉恢复后患者交接）中进行交接时的公元纪年日期和时间的完整描述）
     */
    public void setHandoverDate(String handoverDate) {
        this.handoverDate = handoverDate == null ? null : handoverDate.trim();
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