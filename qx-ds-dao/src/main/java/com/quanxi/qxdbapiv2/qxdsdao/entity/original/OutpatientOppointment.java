package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_OPPOINTMENT")
public class OutpatientOppointment {
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
     * 患者ID[主键]（患者在医院内部的唯一标识号）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 门诊记录表编号未就诊时为空（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 患者姓名（个体在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PATIENT_NAME")
    private String patientName;

    /**
     * 排队号（患者排队的顺序号）
     */
    @Column(name = "QUEUE_NUMBER")
    private String queueNumber;

    /**
     * 医生编码（医疗服务人员的唯一编号）
     */
    @Column(name = "STAFF_NO")
    private String staffNo;

    /**
     * 医生名称（医生在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "STAFF_NAME")
    private String staffName;

    /**
     * 班次代码DIR_AM_PM（医生排班的班次代码）
     */
    @Column(name = "DATE_TYPE_CODE")
    private String dateTypeCode;

    /**
     * 班次名称（医生排班的班次名称）
     */
    @Column(name = "DATE_TYPE_NAME")
    private String dateTypeName;

    /**
     * 预约时间（患者排队预约的时间）
     */
    @Column(name = "QUEUE_DATE")
    private String queueDate;

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
     * 诊室名称（患者预约排队候诊的诊室名称）
     */
    @Column(name = "ROOM_NAME")
    private String roomName;

    /**
     * 职称代码GB/T 8561（个人已取得的相关专业职称在特定编码体系中的代码）
     */
    @Column(name = "TITLE_CODE")
    private String titleCode;

    /**
     * 职称名称（个人已取得的相关专业职称在特定编码体系中的名称）
     */
    @Column(name = "TITLE_NAME")
    private String titleName;

    /**
     * 叫号时间（患者预约叫号时间）
     */
    @Column(name = "CALL_TIME")
    private String callTime;

    /**
     * 实际就诊时间未就诊时为空（患者就诊时的公元纪年时间）
     */
    @Column(name = "VISIT_TIME")
    private String visitTime;

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
     * 获取患者ID[主键]（患者在医院内部的唯一标识号）
     *
     * @return PATIENT_ID - 患者ID[主键]（患者在医院内部的唯一标识号）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者ID[主键]（患者在医院内部的唯一标识号）
     *
     * @param patientId 患者ID[主键]（患者在医院内部的唯一标识号）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
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
     * 获取门诊记录表编号未就诊时为空（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号未就诊时为空（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号未就诊时为空（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号未就诊时为空（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取患者姓名（个体在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return PATIENT_NAME - 患者姓名（个体在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 设置患者姓名（个体在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param patientName 患者姓名（个体在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * 获取排队号（患者排队的顺序号）
     *
     * @return QUEUE_NUMBER - 排队号（患者排队的顺序号）
     */
    public String getQueueNumber() {
        return queueNumber;
    }

    /**
     * 设置排队号（患者排队的顺序号）
     *
     * @param queueNumber 排队号（患者排队的顺序号）
     */
    public void setQueueNumber(String queueNumber) {
        this.queueNumber = queueNumber == null ? null : queueNumber.trim();
    }

    /**
     * 获取医生编码（医疗服务人员的唯一编号）
     *
     * @return STAFF_NO - 医生编码（医疗服务人员的唯一编号）
     */
    public String getStaffNo() {
        return staffNo;
    }

    /**
     * 设置医生编码（医疗服务人员的唯一编号）
     *
     * @param staffNo 医生编码（医疗服务人员的唯一编号）
     */
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    /**
     * 获取医生名称（医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return STAFF_NAME - 医生名称（医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置医生名称（医生在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param staffName 医生名称（医生在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * 获取班次代码DIR_AM_PM（医生排班的班次代码）
     *
     * @return DATE_TYPE_CODE - 班次代码DIR_AM_PM（医生排班的班次代码）
     */
    public String getDateTypeCode() {
        return dateTypeCode;
    }

    /**
     * 设置班次代码DIR_AM_PM（医生排班的班次代码）
     *
     * @param dateTypeCode 班次代码DIR_AM_PM（医生排班的班次代码）
     */
    public void setDateTypeCode(String dateTypeCode) {
        this.dateTypeCode = dateTypeCode == null ? null : dateTypeCode.trim();
    }

    /**
     * 获取班次名称（医生排班的班次名称）
     *
     * @return DATE_TYPE_NAME - 班次名称（医生排班的班次名称）
     */
    public String getDateTypeName() {
        return dateTypeName;
    }

    /**
     * 设置班次名称（医生排班的班次名称）
     *
     * @param dateTypeName 班次名称（医生排班的班次名称）
     */
    public void setDateTypeName(String dateTypeName) {
        this.dateTypeName = dateTypeName == null ? null : dateTypeName.trim();
    }

    /**
     * 获取预约时间（患者排队预约的时间）
     *
     * @return QUEUE_DATE - 预约时间（患者排队预约的时间）
     */
    public String getQueueDate() {
        return queueDate;
    }

    /**
     * 设置预约时间（患者排队预约的时间）
     *
     * @param queueDate 预约时间（患者排队预约的时间）
     */
    public void setQueueDate(String queueDate) {
        this.queueDate = queueDate == null ? null : queueDate.trim();
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
     * 获取诊室名称（患者预约排队候诊的诊室名称）
     *
     * @return ROOM_NAME - 诊室名称（患者预约排队候诊的诊室名称）
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置诊室名称（患者预约排队候诊的诊室名称）
     *
     * @param roomName 诊室名称（患者预约排队候诊的诊室名称）
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    /**
     * 获取职称代码GB/T 8561（个人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @return TITLE_CODE - 职称代码GB/T 8561（个人已取得的相关专业职称在特定编码体系中的代码）
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * 设置职称代码GB/T 8561（个人已取得的相关专业职称在特定编码体系中的代码）
     *
     * @param titleCode 职称代码GB/T 8561（个人已取得的相关专业职称在特定编码体系中的代码）
     */
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode == null ? null : titleCode.trim();
    }

    /**
     * 获取职称名称（个人已取得的相关专业职称在特定编码体系中的名称）
     *
     * @return TITLE_NAME - 职称名称（个人已取得的相关专业职称在特定编码体系中的名称）
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 设置职称名称（个人已取得的相关专业职称在特定编码体系中的名称）
     *
     * @param titleName 职称名称（个人已取得的相关专业职称在特定编码体系中的名称）
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    /**
     * 获取叫号时间（患者预约叫号时间）
     *
     * @return CALL_TIME - 叫号时间（患者预约叫号时间）
     */
    public String getCallTime() {
        return callTime;
    }

    /**
     * 设置叫号时间（患者预约叫号时间）
     *
     * @param callTime 叫号时间（患者预约叫号时间）
     */
    public void setCallTime(String callTime) {
        this.callTime = callTime == null ? null : callTime.trim();
    }

    /**
     * 获取实际就诊时间未就诊时为空（患者就诊时的公元纪年时间）
     *
     * @return VISIT_TIME - 实际就诊时间未就诊时为空（患者就诊时的公元纪年时间）
     */
    public String getVisitTime() {
        return visitTime;
    }

    /**
     * 设置实际就诊时间未就诊时为空（患者就诊时的公元纪年时间）
     *
     * @param visitTime 实际就诊时间未就诊时为空（患者就诊时的公元纪年时间）
     */
    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
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