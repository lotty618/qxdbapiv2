package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DAILY_REPORT_INPATIENT")
public class DailyReportInpatient {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * ID[主键]
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
     * 统计业务日期[主键],YYYYMMDD（统计业务日期）
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
     * 科室代码DIR_DEPT（统计科室的科室代码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称（科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 入院人数（入院人数）
     */
    @Column(name = "ADMISSION_NUMBER")
    private Integer admissionNumber;

    /**
     * 转入人数（转入人数）
     */
    @Column(name = "MOVE_IN_NUMBER")
    private Integer moveInNumber;

    /**
     * 转出人数（转出人数）
     */
    @Column(name = "REFER_OUT_NUMBER")
    private Integer referOutNumber;

    /**
     * 出院人数（出院人数）
     */
    @Column(name = "DISCHARGE_NUMBER")
    private Integer dischargeNumber;

    /**
     * 死亡人数（死亡人数）
     */
    @Column(name = "DIED_NUMBER")
    private Integer diedNumber;

    /**
     * 危重人数（危重人数）
     */
    @Column(name = "CRITICAL_NUMBER")
    private Integer criticalNumber;

    /**
     * 危重抢救人数（危重抢救人数）
     */
    @Column(name = "RESCUE_NUMBER")
    private Integer rescueNumber;

    /**
     * 抢救成功人数（抢救成功人数）
     */
    @Column(name = "RESCUE_SUCCESS_NUMBER")
    private Integer rescueSuccessNumber;

    /**
     * 手术量（手术量）
     */
    @Column(name = "OPERATION")
    private Integer operation;

    /**
     * 会诊确诊病例数（会诊确诊病例数）
     */
    @Column(name = "CONSULT_REG_DIAG")
    private Integer consultRegDiag;

    /**
     * 会诊人数（会诊人数）
     */
    @Column(name = "CONSULT_TOTAL")
    private Integer consultTotal;

    /**
     * 经过重症监护病情好转重症病人人数（与抢救成功人数性质不同）
     */
    @Column(name = "SERVER_BETTER_TOTAL")
    private Integer serverBetterTotal;

    /**
     * 经过重症监护仍死亡的病人人数（与死亡人数性质不同）
     */
    @Column(name = "SERVER_DEATH_TOTAL")
    private Integer serverDeathTotal;

    /**
     * 特需病房病人占用床日数（指医院各科室每日夜晚12点钟实际占用病床数（即每日夜晚12点钟的住院人数）之总和）
     */
    @Column(name = "SERVICE_BED")
    private Integer serviceBed;

    /**
     * 特级护理人数（进行特级护理的人数）
     */
    @Column(name = "SPECIAL_CARE")
    private Integer specialCare;

    /**
     * 一级护理人数（进行一级护理的人数）
     */
    @Column(name = "CARE_LEVEL_1")
    private Integer careLevel1;

    /**
     * 二级护理人数（进行二级护理的人数）
     */
    @Column(name = "CARE_LEVEL_2")
    private Integer careLevel2;

    /**
     * 三级护理人数（进行三级护理的人数）
     */
    @Column(name = "CARE_LEVEL_3")
    private Integer careLevel3;

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
     * 获取ID[主键]
     *
     * @return ID - ID[主键]
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID[主键]
     *
     * @param id ID[主键]
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
     * 获取统计业务日期[主键],YYYYMMDD（统计业务日期）
     *
     * @return DATE_T - 统计业务日期[主键],YYYYMMDD（统计业务日期）
     */
    public String getDateT() {
        return dateT;
    }

    /**
     * 设置统计业务日期[主键],YYYYMMDD（统计业务日期）
     *
     * @param dateT 统计业务日期[主键],YYYYMMDD（统计业务日期）
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
     * 获取科室代码DIR_DEPT（统计科室的科室代码）
     *
     * @return DEPT_CODE - 科室代码DIR_DEPT（统计科室的科室代码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室代码DIR_DEPT（统计科室的科室代码）
     *
     * @param deptCode 科室代码DIR_DEPT（统计科室的科室代码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称（科室名称）
     *
     * @return DEPT_NAME - 科室名称（科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（科室名称）
     *
     * @param deptName 科室名称（科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取入院人数（入院人数）
     *
     * @return ADMISSION_NUMBER - 入院人数（入院人数）
     */
    public Integer getAdmissionNumber() {
        return admissionNumber;
    }

    /**
     * 设置入院人数（入院人数）
     *
     * @param admissionNumber 入院人数（入院人数）
     */
    public void setAdmissionNumber(Integer admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    /**
     * 获取转入人数（转入人数）
     *
     * @return MOVE_IN_NUMBER - 转入人数（转入人数）
     */
    public Integer getMoveInNumber() {
        return moveInNumber;
    }

    /**
     * 设置转入人数（转入人数）
     *
     * @param moveInNumber 转入人数（转入人数）
     */
    public void setMoveInNumber(Integer moveInNumber) {
        this.moveInNumber = moveInNumber;
    }

    /**
     * 获取转出人数（转出人数）
     *
     * @return REFER_OUT_NUMBER - 转出人数（转出人数）
     */
    public Integer getReferOutNumber() {
        return referOutNumber;
    }

    /**
     * 设置转出人数（转出人数）
     *
     * @param referOutNumber 转出人数（转出人数）
     */
    public void setReferOutNumber(Integer referOutNumber) {
        this.referOutNumber = referOutNumber;
    }

    /**
     * 获取出院人数（出院人数）
     *
     * @return DISCHARGE_NUMBER - 出院人数（出院人数）
     */
    public Integer getDischargeNumber() {
        return dischargeNumber;
    }

    /**
     * 设置出院人数（出院人数）
     *
     * @param dischargeNumber 出院人数（出院人数）
     */
    public void setDischargeNumber(Integer dischargeNumber) {
        this.dischargeNumber = dischargeNumber;
    }

    /**
     * 获取死亡人数（死亡人数）
     *
     * @return DIED_NUMBER - 死亡人数（死亡人数）
     */
    public Integer getDiedNumber() {
        return diedNumber;
    }

    /**
     * 设置死亡人数（死亡人数）
     *
     * @param diedNumber 死亡人数（死亡人数）
     */
    public void setDiedNumber(Integer diedNumber) {
        this.diedNumber = diedNumber;
    }

    /**
     * 获取危重人数（危重人数）
     *
     * @return CRITICAL_NUMBER - 危重人数（危重人数）
     */
    public Integer getCriticalNumber() {
        return criticalNumber;
    }

    /**
     * 设置危重人数（危重人数）
     *
     * @param criticalNumber 危重人数（危重人数）
     */
    public void setCriticalNumber(Integer criticalNumber) {
        this.criticalNumber = criticalNumber;
    }

    /**
     * 获取危重抢救人数（危重抢救人数）
     *
     * @return RESCUE_NUMBER - 危重抢救人数（危重抢救人数）
     */
    public Integer getRescueNumber() {
        return rescueNumber;
    }

    /**
     * 设置危重抢救人数（危重抢救人数）
     *
     * @param rescueNumber 危重抢救人数（危重抢救人数）
     */
    public void setRescueNumber(Integer rescueNumber) {
        this.rescueNumber = rescueNumber;
    }

    /**
     * 获取抢救成功人数（抢救成功人数）
     *
     * @return RESCUE_SUCCESS_NUMBER - 抢救成功人数（抢救成功人数）
     */
    public Integer getRescueSuccessNumber() {
        return rescueSuccessNumber;
    }

    /**
     * 设置抢救成功人数（抢救成功人数）
     *
     * @param rescueSuccessNumber 抢救成功人数（抢救成功人数）
     */
    public void setRescueSuccessNumber(Integer rescueSuccessNumber) {
        this.rescueSuccessNumber = rescueSuccessNumber;
    }

    /**
     * 获取手术量（手术量）
     *
     * @return OPERATION - 手术量（手术量）
     */
    public Integer getOperation() {
        return operation;
    }

    /**
     * 设置手术量（手术量）
     *
     * @param operation 手术量（手术量）
     */
    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    /**
     * 获取会诊确诊病例数（会诊确诊病例数）
     *
     * @return CONSULT_REG_DIAG - 会诊确诊病例数（会诊确诊病例数）
     */
    public Integer getConsultRegDiag() {
        return consultRegDiag;
    }

    /**
     * 设置会诊确诊病例数（会诊确诊病例数）
     *
     * @param consultRegDiag 会诊确诊病例数（会诊确诊病例数）
     */
    public void setConsultRegDiag(Integer consultRegDiag) {
        this.consultRegDiag = consultRegDiag;
    }

    /**
     * 获取会诊人数（会诊人数）
     *
     * @return CONSULT_TOTAL - 会诊人数（会诊人数）
     */
    public Integer getConsultTotal() {
        return consultTotal;
    }

    /**
     * 设置会诊人数（会诊人数）
     *
     * @param consultTotal 会诊人数（会诊人数）
     */
    public void setConsultTotal(Integer consultTotal) {
        this.consultTotal = consultTotal;
    }

    /**
     * 获取经过重症监护病情好转重症病人人数（与抢救成功人数性质不同）
     *
     * @return SERVER_BETTER_TOTAL - 经过重症监护病情好转重症病人人数（与抢救成功人数性质不同）
     */
    public Integer getServerBetterTotal() {
        return serverBetterTotal;
    }

    /**
     * 设置经过重症监护病情好转重症病人人数（与抢救成功人数性质不同）
     *
     * @param serverBetterTotal 经过重症监护病情好转重症病人人数（与抢救成功人数性质不同）
     */
    public void setServerBetterTotal(Integer serverBetterTotal) {
        this.serverBetterTotal = serverBetterTotal;
    }

    /**
     * 获取经过重症监护仍死亡的病人人数（与死亡人数性质不同）
     *
     * @return SERVER_DEATH_TOTAL - 经过重症监护仍死亡的病人人数（与死亡人数性质不同）
     */
    public Integer getServerDeathTotal() {
        return serverDeathTotal;
    }

    /**
     * 设置经过重症监护仍死亡的病人人数（与死亡人数性质不同）
     *
     * @param serverDeathTotal 经过重症监护仍死亡的病人人数（与死亡人数性质不同）
     */
    public void setServerDeathTotal(Integer serverDeathTotal) {
        this.serverDeathTotal = serverDeathTotal;
    }

    /**
     * 获取特需病房病人占用床日数（指医院各科室每日夜晚12点钟实际占用病床数（即每日夜晚12点钟的住院人数）之总和）
     *
     * @return SERVICE_BED - 特需病房病人占用床日数（指医院各科室每日夜晚12点钟实际占用病床数（即每日夜晚12点钟的住院人数）之总和）
     */
    public Integer getServiceBed() {
        return serviceBed;
    }

    /**
     * 设置特需病房病人占用床日数（指医院各科室每日夜晚12点钟实际占用病床数（即每日夜晚12点钟的住院人数）之总和）
     *
     * @param serviceBed 特需病房病人占用床日数（指医院各科室每日夜晚12点钟实际占用病床数（即每日夜晚12点钟的住院人数）之总和）
     */
    public void setServiceBed(Integer serviceBed) {
        this.serviceBed = serviceBed;
    }

    /**
     * 获取特级护理人数（进行特级护理的人数）
     *
     * @return SPECIAL_CARE - 特级护理人数（进行特级护理的人数）
     */
    public Integer getSpecialCare() {
        return specialCare;
    }

    /**
     * 设置特级护理人数（进行特级护理的人数）
     *
     * @param specialCare 特级护理人数（进行特级护理的人数）
     */
    public void setSpecialCare(Integer specialCare) {
        this.specialCare = specialCare;
    }

    /**
     * 获取一级护理人数（进行一级护理的人数）
     *
     * @return CARE_LEVEL_1 - 一级护理人数（进行一级护理的人数）
     */
    public Integer getCareLevel1() {
        return careLevel1;
    }

    /**
     * 设置一级护理人数（进行一级护理的人数）
     *
     * @param careLevel1 一级护理人数（进行一级护理的人数）
     */
    public void setCareLevel1(Integer careLevel1) {
        this.careLevel1 = careLevel1;
    }

    /**
     * 获取二级护理人数（进行二级护理的人数）
     *
     * @return CARE_LEVEL_2 - 二级护理人数（进行二级护理的人数）
     */
    public Integer getCareLevel2() {
        return careLevel2;
    }

    /**
     * 设置二级护理人数（进行二级护理的人数）
     *
     * @param careLevel2 二级护理人数（进行二级护理的人数）
     */
    public void setCareLevel2(Integer careLevel2) {
        this.careLevel2 = careLevel2;
    }

    /**
     * 获取三级护理人数（进行三级护理的人数）
     *
     * @return CARE_LEVEL_3 - 三级护理人数（进行三级护理的人数）
     */
    public Integer getCareLevel3() {
        return careLevel3;
    }

    /**
     * 设置三级护理人数（进行三级护理的人数）
     *
     * @param careLevel3 三级护理人数（进行三级护理的人数）
     */
    public void setCareLevel3(Integer careLevel3) {
        this.careLevel3 = careLevel3;
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