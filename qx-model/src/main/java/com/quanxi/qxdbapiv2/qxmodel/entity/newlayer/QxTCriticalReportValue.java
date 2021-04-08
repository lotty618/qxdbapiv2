package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_CRITICAL_REPORT_VALUE")
public class QxTCriticalReportValue {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 危急报告唯一编号
     */
    @Column(name = "REPORT_ID")
    private String reportId;

    /**
     * 危急报告类型代码（例如：1.常规检验）
     */
    @Column(name = "REPORT_TYPE")
    private String reportType;

    /**
     * 危急报告类型中文名称（例如：1.常规检验）
     */
    @Column(name = "REPORT_TYPE_CN")
    private String reportTypeCn;

    /**
     * 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 就诊类型（患者就诊类型的的分类代码）
     */
    @Column(name = "VISIT_TYPE")
    private String visitType;

    /**
     * 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "VISIT_TYPE_CN")
    private String visitTypeCn;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "VISIT_NO")
    private String visitNo;

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
     * 填报者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "AUTHOR_ID")
    private String authorId;

    /**
     * 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    /**
     * 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    @Column(name = "REPORT_CREATE_DATE")
    private String reportCreateDate;

    /**
     * 危急报告当前状态（例如：1.已发送、2.已查看、3.已处理）
     */
    @Column(name = "REPORT_STATUS")
    private String reportStatus;

    /**
     * 危急报告当前状态中文名称（例如：1.已发送、2.已查看、3.已处理）
     */
    @Column(name = "REPORT_STATUS_CN")
    private String reportStatusCn;

    /**
     * 接受者：编号（医疗服务人员的唯一编号）
     */
    @Column(name = "RECEIVER_ID")
    private String receiverId;

    /**
     * 接受者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "RECEIVER_NAME")
    private String receiverName;

    /**
     * 接受时间（接受者查看报告当日的公元纪年日期的完整描述）
     */
    @Column(name = "RECEIVER__DATE")
    private String receiverDate;

    /**
     * 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 删除人姓名（信息删除人姓名）
     */
    @Column(name = "CANCEL_NAME")
    private String cancelName;

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
     * 危机值内容
     */
    @Column(name = "CRITICAL_VALUES")
    private String criticalValues;

    /**
     * 主键自增ID
     */
    @Column(name = "SID")
    private String sid;

    /**
     * 住院标识
     */
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
     * 获取危急报告唯一编号
     *
     * @return REPORT_ID - 危急报告唯一编号
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设置危急报告唯一编号
     *
     * @param reportId 危急报告唯一编号
     */
    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    /**
     * 获取危急报告类型代码（例如：1.常规检验）
     *
     * @return REPORT_TYPE - 危急报告类型代码（例如：1.常规检验）
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * 设置危急报告类型代码（例如：1.常规检验）
     *
     * @param reportType 危急报告类型代码（例如：1.常规检验）
     */
    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
    }

    /**
     * 获取危急报告类型中文名称（例如：1.常规检验）
     *
     * @return REPORT_TYPE_CN - 危急报告类型中文名称（例如：1.常规检验）
     */
    public String getReportTypeCn() {
        return reportTypeCn;
    }

    /**
     * 设置危急报告类型中文名称（例如：1.常规检验）
     *
     * @param reportTypeCn 危急报告类型中文名称（例如：1.常规检验）
     */
    public void setReportTypeCn(String reportTypeCn) {
        this.reportTypeCn = reportTypeCn == null ? null : reportTypeCn.trim();
    }

    /**
     * 获取病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 病人的姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取就诊类型（患者就诊类型的的分类代码）
     *
     * @return VISIT_TYPE - 就诊类型（患者就诊类型的的分类代码）
     */
    public String getVisitType() {
        return visitType;
    }

    /**
     * 设置就诊类型（患者就诊类型的的分类代码）
     *
     * @param visitType 就诊类型（患者就诊类型的的分类代码）
     */
    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    /**
     * 获取就诊类型名称（患者就诊类型的的分类中文名称）
     *
     * @return VISIT_TYPE_CN - 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    public String getVisitTypeCn() {
        return visitTypeCn;
    }

    /**
     * 设置就诊类型名称（患者就诊类型的的分类中文名称）
     *
     * @param visitTypeCn 就诊类型名称（患者就诊类型的的分类中文名称）
     */
    public void setVisitTypeCn(String visitTypeCn) {
        this.visitTypeCn = visitTypeCn == null ? null : visitTypeCn.trim();
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
     * 获取就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return VISIT_NO - 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getVisitNo() {
        return visitNo;
    }

    /**
     * 设置就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param visitNo 就诊号码（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo == null ? null : visitNo.trim();
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
     * 获取填报者：编号（医疗服务人员的唯一编号）
     *
     * @return AUTHOR_ID - 填报者：编号（医疗服务人员的唯一编号）
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * 设置填报者：编号（医疗服务人员的唯一编号）
     *
     * @param authorId 填报者：编号（医疗服务人员的唯一编号）
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    /**
     * 获取填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return AUTHOR_NAME - 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param authorName 填报者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * 获取报告生成时间（检查报告当日的公元纪年日期的完整描述）
     *
     * @return REPORT_CREATE_DATE - 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    public String getReportCreateDate() {
        return reportCreateDate;
    }

    /**
     * 设置报告生成时间（检查报告当日的公元纪年日期的完整描述）
     *
     * @param reportCreateDate 报告生成时间（检查报告当日的公元纪年日期的完整描述）
     */
    public void setReportCreateDate(String reportCreateDate) {
        this.reportCreateDate = reportCreateDate == null ? null : reportCreateDate.trim();
    }

    /**
     * 获取危急报告当前状态（例如：1.已发送、2.已查看、3.已处理）
     *
     * @return REPORT_STATUS - 危急报告当前状态（例如：1.已发送、2.已查看、3.已处理）
     */
    public String getReportStatus() {
        return reportStatus;
    }

    /**
     * 设置危急报告当前状态（例如：1.已发送、2.已查看、3.已处理）
     *
     * @param reportStatus 危急报告当前状态（例如：1.已发送、2.已查看、3.已处理）
     */
    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus == null ? null : reportStatus.trim();
    }

    /**
     * 获取危急报告当前状态中文名称（例如：1.已发送、2.已查看、3.已处理）
     *
     * @return REPORT_STATUS_CN - 危急报告当前状态中文名称（例如：1.已发送、2.已查看、3.已处理）
     */
    public String getReportStatusCn() {
        return reportStatusCn;
    }

    /**
     * 设置危急报告当前状态中文名称（例如：1.已发送、2.已查看、3.已处理）
     *
     * @param reportStatusCn 危急报告当前状态中文名称（例如：1.已发送、2.已查看、3.已处理）
     */
    public void setReportStatusCn(String reportStatusCn) {
        this.reportStatusCn = reportStatusCn == null ? null : reportStatusCn.trim();
    }

    /**
     * 获取接受者：编号（医疗服务人员的唯一编号）
     *
     * @return RECEIVER_ID - 接受者：编号（医疗服务人员的唯一编号）
     */
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * 设置接受者：编号（医疗服务人员的唯一编号）
     *
     * @param receiverId 接受者：编号（医疗服务人员的唯一编号）
     */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? null : receiverId.trim();
    }

    /**
     * 获取接受者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @return RECEIVER_NAME - 接受者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置接受者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     *
     * @param receiverName 接受者：姓名（填报人在公安管理部门正式登记注册的姓氏和名称）
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取接受时间（接受者查看报告当日的公元纪年日期的完整描述）
     *
     * @return RECEIVER__DATE - 接受时间（接受者查看报告当日的公元纪年日期的完整描述）
     */
    public String getReceiverDate() {
        return receiverDate;
    }

    /**
     * 设置接受时间（接受者查看报告当日的公元纪年日期的完整描述）
     *
     * @param receiverDate 接受时间（接受者查看报告当日的公元纪年日期的完整描述）
     */
    public void setReceiverDate(String receiverDate) {
        this.receiverDate = receiverDate == null ? null : receiverDate.trim();
    }

    /**
     * 获取对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return ORDER_ID - 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param orderId 对应的医嘱：医嘱号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取删除人姓名（信息删除人姓名）
     *
     * @return CANCEL_NAME - 删除人姓名（信息删除人姓名）
     */
    public String getCancelName() {
        return cancelName;
    }

    /**
     * 设置删除人姓名（信息删除人姓名）
     *
     * @param cancelName 删除人姓名（信息删除人姓名）
     */
    public void setCancelName(String cancelName) {
        this.cancelName = cancelName == null ? null : cancelName.trim();
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
     * 获取危机值内容
     *
     * @return CRITICAL_VALUES - 危机值内容
     */
    public String getCriticalValues() {
        return criticalValues;
    }

    /**
     * 设置危机值内容
     *
     * @param criticalValues 危机值内容
     */
    public void setCriticalValues(String criticalValues) {
        this.criticalValues = criticalValues == null ? null : criticalValues.trim();
    }

    /**
     * 获取主键自增ID
     *
     * @return SID - 主键自增ID
     */
    public String getSid() {
        return sid;
    }

    /**
     * 设置主键自增ID
     *
     * @param sid 主键自增ID
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * 获取住院标识
     *
     * @return IHUID - 住院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院标识
     *
     * @param ihuid 住院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }
}