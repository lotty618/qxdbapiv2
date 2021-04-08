package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_DOCTORADVICE")
public class QxTDoctoradvice {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 医嘱唯一标识
     */
    @Column(name = "DAUID")
    private String dauid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 机构ID
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 首次
     */
    @Column(name = "FIRST")
    private Long first;

    /**
     * 末次
     */
    @Column(name = "LAST")
    private Long last;

    /**
     * 药品唯一标识
     */
    @Column(name = "MEDUID")
    private String meduid;

    /**
     * 药品名称
     */
    @Column(name = "MED_NAME")
    private String medName;

    /**
     * 医嘱类别代码[主键]DIR_ORDER_TYPE（医嘱类别名称在特定编码体系里的代码）
     */
    @Column(name = "ORDER_TYPE_CODE")
    private String orderTypeCode;

    /**
     * 医嘱类别名称（医嘱类别名称在特定编码体系里的名称）
     */
    @Column(name = "ORDER_TYPE_NAME")
    private String orderTypeName;

    /**
     * 开嘱时间（医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ORDER_DATE")
    private String orderDate;

    /**
     * 开立医生姓名（开立医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ORDER_DOCTOR_NAME")
    private String orderDoctorName;

    /**
     * 校对护士姓名（核对护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHECK_NURSE_NAME")
    private String checkNurseName;

    /**
     * 停嘱时间（医嘱停止时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "ORDER_STOP_DATE")
    private String orderStopDate;

    /**
     * 停嘱医生姓名（停止医嘱医生签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ORDER_STOP_DOCTOR_NAME")
    private String orderStopDoctorName;

    /**
     * 停嘱护士姓名（停止医嘱护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "ORDER_STOP_NURSE_NAME")
    private String orderStopNurseName;

    /**
     * 医嘱标准代码当SUBJECT_CLASS_CODE为01时取值DIR_MEDICINE；当为06时取值DIR_MATERIAL；其他时取值DIR_TREATMENT（医嘱在标准编码体系中的代码）
     */
    @Column(name = "ORDER_STANDARD_CODE")
    private String orderStandardCode;

    /**
     * 医嘱标准中文名称（医嘱在标准编码体系中的中文名称）
     */
    @Column(name = "ORDER_STANDARD_CN")
    private String orderStandardCn;

    /**
     * 医嘱本地代码（医嘱本地特定编码体系中的代码）
     */
    @Column(name = "ORDER_LOCAL_CODE")
    private String orderLocalCode;

    /**
     * 医嘱本地中文名称（医嘱本地特定编码体系中的中文名称）
     */
    @Column(name = "ORDER_LOCAL_CN")
    private String orderLocalCn;

    /**
     * 频次代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    @Column(name = "ORDER_FREQ_CODE")
    private String orderFreqCode;

    /**
     * 频次中文名称（标识单位时间内药物使用的次数中文名称）
     */
    @Column(name = "ORDER_FREQ_CN")
    private String orderFreqCn;

    /**
     * 医嘱单号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "ORDER_FORM_NO")
    private String orderFormNo;

    /**
     * 医嘱子项序号（医嘱在每个医嘱申请单内部的顺序号）
     */
    @Column(name = "ORDER_ITEM_NO")
    private String orderItemNo;

    /**
     * 医嘱项目类型代码CV06.00.229（医嘱项目分类在特定编码体系中的代码）
     */
    @Column(name = "SUBJECT_CLASS_CODE")
    private String subjectClassCode;

    /**
     * 医嘱项目类型中文名称（医嘱项目分类在特定编码体系中的中文名称）
     */
    @Column(name = "SUBJECT_CLASS_CN")
    private String subjectClassCn;

    /**
     * 医嘱计划开始日期时间（医嘱计划开始时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PLAN_START_DATE")
    private String planStartDate;

    /**
     * 医嘱计划结束日期时间（医嘱计划结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PLAN_END_DATE")
    private String planEndDate;

    /**
     * 医嘱开立科室代码DIR_DEPT（开立医嘱的科室代码）
     */
    @Column(name = "APPLY_DEPT_CODE")
    private String applyDeptCode;

    /**
     * 医嘱开立科室中文名称（开立医嘱的科室中文名称）
     */
    @Column(name = "APPLY_DEPT_CN")
    private String applyDeptCn;

    /**
     * 医嘱开立科室唯一标识
     */
    @Column(name = "APPLY_DEPT_UID")
    private String applyDeptUid;

    /**
     * 医嘱审核人签名（对医嘱进行审核的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUDITOR_SIGNATURE")
    private String auditorSignature;

    /**
     * 医嘱审核日期时间（对医嘱进行审核时的公元纪年日期和时间的详细描述）
     */
    @Column(name = "AUDIT_DATE")
    private String auditDate;

    /**
     * 医嘱核对日期时间（对医嘱进行核对时的公元纪年日期和时间的详细描述）
     */
    @Column(name = "CHECK_DATE")
    private String checkDate;

    /**
     * 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORMER_SIGNATURE")
    private String performerSignature;

    /**
     * 医嘱执行日期时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PERFORMER_DATE")
    private String performerDate;

    /**
     * 医嘱执行科室代码DIR_DEPT（执行医嘱的科室代码）
     */
    @Column(name = "PERFORMER_DEPT_CODE")
    private String performerDeptCode;

    /**
     * 医嘱执行科室中文名称（执行医嘱的科室中文名称）
     */
    @Column(name = "PERFORMER_DEPT_CN")
    private String performerDeptCn;

    /**
     * 医嘱执行科室唯一标识
     */
    @Column(name = "PERFORMER_DEPT_UID")
    private String performerDeptUid;

    /**
     * 医嘱执行状态代码DIR_PRESCRIBE_STATUS（显示医嘱执行状态的代码）
     */
    @Column(name = "PERFORMER_STATUS_CODE")
    private String performerStatusCode;

    /**
     * 医嘱执行状态中文名称（显示医嘱执行状态的中文名称）
     */
    @Column(name = "PERFORMER_STATUS_CN")
    private String performerStatusCn;

    /**
     * 医嘱取消日期时间（取消医嘱时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "CANCEL_DATE")
    private String cancelDate;

    /**
     * 取消医嘱者签名（取消医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CANCEL_OPERATOR_SIGNATURE")
    private String cancelOperatorSignature;

    /**
     * 药物使用次剂量（单次使用药物的剂量）
     */
    @Column(name = "ORDER_DOSE")
    private String orderDose;

    /**
     * 药物使用剂量单位（药物使用的剂量单位）
     */
    @Column(name = "ORDER_DOSE_UNIT")
    private String orderDoseUnit;

    /**
     * 数量
     */
    @Column(name = "ORDER_QUANTITY")
    private String orderQuantity;

    /**
     * 数量单位
     */
    @Column(name = "ORDER_QUANTITY_UNIT")
    private String orderQuantityUnit;

    @Column(name = "ORDER_SPEC")
    private String orderSpec;

    @Column(name = "ORDER_ROUTE")
    private String orderRoute;

    @Column(name = "ORDER_USING_DAYS")
    private String orderUsingDays;

    @Column(name = "DDD_VALUE")
    private String dddValue;

    @Column(name = "ITEM_PRICE")
    private String itemPrice;

    @Column(name = "ANT_PURPOSE")
    private String antPurpose;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

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
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    /**
     * 是否无效
     */
    @Column(name = "IS_INVALID")
    private Short isInvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "IS_DEL")
    private Short isDel;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 是否点评
     */
    @Column(name = "IS_REVIEWS")
    private Long isReviews;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 医嘱状态代码( 0  新开,1  已提交,2  需校对,3  已作废,4  已停嘱,5  已复核,6  停嘱退回  0
     */
    @Column(name = "ORDER_STATUS_CODE")
    private String orderStatusCode;

    /**
     * 医嘱状态代码,中文名称医嘱状态代码（新开、提交、复核、停嘱、作废) 
     */
    @Column(name = "ORDER_STATUS_NAME")
    private String orderStatusName;

    /**
     * 医嘱状态代码
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 医嘱备注信息（对下达医嘱的补充说明和注意事项提示）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 获取序列号
     *
     * @return SID - 序列号
     */
    public Long getSid() {
        return sid;
    }

    /**
     * 设置序列号
     *
     * @param sid 序列号
     */
    public void setSid(Long sid) {
        this.sid = sid;
    }

    /**
     * 获取医嘱唯一标识
     *
     * @return DAUID - 医嘱唯一标识
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱唯一标识
     *
     * @param dauid 医嘱唯一标识
     */
    public void setDauid(String dauid) {
        this.dauid = dauid == null ? null : dauid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取机构ID
     *
     * @return ORGUID - 机构ID
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构ID
     *
     * @param orguid 机构ID
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取首次
     *
     * @return FIRST - 首次
     */
    public Long getFirst() {
        return first;
    }

    /**
     * 设置首次
     *
     * @param first 首次
     */
    public void setFirst(Long first) {
        this.first = first;
    }

    /**
     * 获取末次
     *
     * @return LAST - 末次
     */
    public Long getLast() {
        return last;
    }

    /**
     * 设置末次
     *
     * @param last 末次
     */
    public void setLast(Long last) {
        this.last = last;
    }

    /**
     * 获取药品唯一标识
     *
     * @return MEDUID - 药品唯一标识
     */
    public String getMeduid() {
        return meduid;
    }

    /**
     * 设置药品唯一标识
     *
     * @param meduid 药品唯一标识
     */
    public void setMeduid(String meduid) {
        this.meduid = meduid == null ? null : meduid.trim();
    }

    /**
     * 获取药品名称
     *
     * @return MED_NAME - 药品名称
     */
    public String getMedName() {
        return medName;
    }

    /**
     * 设置药品名称
     *
     * @param medName 药品名称
     */
    public void setMedName(String medName) {
        this.medName = medName == null ? null : medName.trim();
    }

    /**
     * 获取医嘱类别代码[主键]DIR_ORDER_TYPE（医嘱类别名称在特定编码体系里的代码）
     *
     * @return ORDER_TYPE_CODE - 医嘱类别代码[主键]DIR_ORDER_TYPE（医嘱类别名称在特定编码体系里的代码）
     */
    public String getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * 设置医嘱类别代码[主键]DIR_ORDER_TYPE（医嘱类别名称在特定编码体系里的代码）
     *
     * @param orderTypeCode 医嘱类别代码[主键]DIR_ORDER_TYPE（医嘱类别名称在特定编码体系里的代码）
     */
    public void setOrderTypeCode(String orderTypeCode) {
        this.orderTypeCode = orderTypeCode == null ? null : orderTypeCode.trim();
    }

    /**
     * 获取医嘱类别名称（医嘱类别名称在特定编码体系里的名称）
     *
     * @return ORDER_TYPE_NAME - 医嘱类别名称（医嘱类别名称在特定编码体系里的名称）
     */
    public String getOrderTypeName() {
        return orderTypeName;
    }

    /**
     * 设置医嘱类别名称（医嘱类别名称在特定编码体系里的名称）
     *
     * @param orderTypeName 医嘱类别名称（医嘱类别名称在特定编码体系里的名称）
     */
    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName == null ? null : orderTypeName.trim();
    }

    /**
     * 获取开嘱时间（医嘱开立结束时的公元纪年日期和时间的完整描述）
     *
     * @return ORDER_DATE - 开嘱时间（医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 设置开嘱时间（医嘱开立结束时的公元纪年日期和时间的完整描述）
     *
     * @param orderDate 开嘱时间（医嘱开立结束时的公元纪年日期和时间的完整描述）
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    /**
     * 获取开立医生姓名（开立医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ORDER_DOCTOR_NAME - 开立医生姓名（开立医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOrderDoctorName() {
        return orderDoctorName;
    }

    /**
     * 设置开立医生姓名（开立医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param orderDoctorName 开立医生姓名（开立医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOrderDoctorName(String orderDoctorName) {
        this.orderDoctorName = orderDoctorName == null ? null : orderDoctorName.trim();
    }

    /**
     * 获取校对护士姓名（核对护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHECK_NURSE_NAME - 校对护士姓名（核对护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCheckNurseName() {
        return checkNurseName;
    }

    /**
     * 设置校对护士姓名（核对护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param checkNurseName 校对护士姓名（核对护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCheckNurseName(String checkNurseName) {
        this.checkNurseName = checkNurseName == null ? null : checkNurseName.trim();
    }

    /**
     * 获取停嘱时间（医嘱停止时的公元纪年日期和时间的完整描述）
     *
     * @return ORDER_STOP_DATE - 停嘱时间（医嘱停止时的公元纪年日期和时间的完整描述）
     */
    public String getOrderStopDate() {
        return orderStopDate;
    }

    /**
     * 设置停嘱时间（医嘱停止时的公元纪年日期和时间的完整描述）
     *
     * @param orderStopDate 停嘱时间（医嘱停止时的公元纪年日期和时间的完整描述）
     */
    public void setOrderStopDate(String orderStopDate) {
        this.orderStopDate = orderStopDate == null ? null : orderStopDate.trim();
    }

    /**
     * 获取停嘱医生姓名（停止医嘱医生签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ORDER_STOP_DOCTOR_NAME - 停嘱医生姓名（停止医嘱医生签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOrderStopDoctorName() {
        return orderStopDoctorName;
    }

    /**
     * 设置停嘱医生姓名（停止医嘱医生签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param orderStopDoctorName 停嘱医生姓名（停止医嘱医生签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOrderStopDoctorName(String orderStopDoctorName) {
        this.orderStopDoctorName = orderStopDoctorName == null ? null : orderStopDoctorName.trim();
    }

    /**
     * 获取停嘱护士姓名（停止医嘱护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return ORDER_STOP_NURSE_NAME - 停嘱护士姓名（停止医嘱护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getOrderStopNurseName() {
        return orderStopNurseName;
    }

    /**
     * 设置停嘱护士姓名（停止医嘱护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param orderStopNurseName 停嘱护士姓名（停止医嘱护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setOrderStopNurseName(String orderStopNurseName) {
        this.orderStopNurseName = orderStopNurseName == null ? null : orderStopNurseName.trim();
    }

    /**
     * 获取医嘱标准代码当SUBJECT_CLASS_CODE为01时取值DIR_MEDICINE；当为06时取值DIR_MATERIAL；其他时取值DIR_TREATMENT（医嘱在标准编码体系中的代码）
     *
     * @return ORDER_STANDARD_CODE - 医嘱标准代码当SUBJECT_CLASS_CODE为01时取值DIR_MEDICINE；当为06时取值DIR_MATERIAL；其他时取值DIR_TREATMENT（医嘱在标准编码体系中的代码）
     */
    public String getOrderStandardCode() {
        return orderStandardCode;
    }

    /**
     * 设置医嘱标准代码当SUBJECT_CLASS_CODE为01时取值DIR_MEDICINE；当为06时取值DIR_MATERIAL；其他时取值DIR_TREATMENT（医嘱在标准编码体系中的代码）
     *
     * @param orderStandardCode 医嘱标准代码当SUBJECT_CLASS_CODE为01时取值DIR_MEDICINE；当为06时取值DIR_MATERIAL；其他时取值DIR_TREATMENT（医嘱在标准编码体系中的代码）
     */
    public void setOrderStandardCode(String orderStandardCode) {
        this.orderStandardCode = orderStandardCode == null ? null : orderStandardCode.trim();
    }

    /**
     * 获取医嘱标准中文名称（医嘱在标准编码体系中的中文名称）
     *
     * @return ORDER_STANDARD_CN - 医嘱标准中文名称（医嘱在标准编码体系中的中文名称）
     */
    public String getOrderStandardCn() {
        return orderStandardCn;
    }

    /**
     * 设置医嘱标准中文名称（医嘱在标准编码体系中的中文名称）
     *
     * @param orderStandardCn 医嘱标准中文名称（医嘱在标准编码体系中的中文名称）
     */
    public void setOrderStandardCn(String orderStandardCn) {
        this.orderStandardCn = orderStandardCn == null ? null : orderStandardCn.trim();
    }

    /**
     * 获取医嘱本地代码（医嘱本地特定编码体系中的代码）
     *
     * @return ORDER_LOCAL_CODE - 医嘱本地代码（医嘱本地特定编码体系中的代码）
     */
    public String getOrderLocalCode() {
        return orderLocalCode;
    }

    /**
     * 设置医嘱本地代码（医嘱本地特定编码体系中的代码）
     *
     * @param orderLocalCode 医嘱本地代码（医嘱本地特定编码体系中的代码）
     */
    public void setOrderLocalCode(String orderLocalCode) {
        this.orderLocalCode = orderLocalCode == null ? null : orderLocalCode.trim();
    }

    /**
     * 获取医嘱本地中文名称（医嘱本地特定编码体系中的中文名称）
     *
     * @return ORDER_LOCAL_CN - 医嘱本地中文名称（医嘱本地特定编码体系中的中文名称）
     */
    public String getOrderLocalCn() {
        return orderLocalCn;
    }

    /**
     * 设置医嘱本地中文名称（医嘱本地特定编码体系中的中文名称）
     *
     * @param orderLocalCn 医嘱本地中文名称（医嘱本地特定编码体系中的中文名称）
     */
    public void setOrderLocalCn(String orderLocalCn) {
        this.orderLocalCn = orderLocalCn == null ? null : orderLocalCn.trim();
    }

    /**
     * 获取频次代码CV06.00.228（标识单位时间内药物使用的次数代码）
     *
     * @return ORDER_FREQ_CODE - 频次代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    public String getOrderFreqCode() {
        return orderFreqCode;
    }

    /**
     * 设置频次代码CV06.00.228（标识单位时间内药物使用的次数代码）
     *
     * @param orderFreqCode 频次代码CV06.00.228（标识单位时间内药物使用的次数代码）
     */
    public void setOrderFreqCode(String orderFreqCode) {
        this.orderFreqCode = orderFreqCode == null ? null : orderFreqCode.trim();
    }

    /**
     * 获取频次中文名称（标识单位时间内药物使用的次数中文名称）
     *
     * @return ORDER_FREQ_CN - 频次中文名称（标识单位时间内药物使用的次数中文名称）
     */
    public String getOrderFreqCn() {
        return orderFreqCn;
    }

    /**
     * 设置频次中文名称（标识单位时间内药物使用的次数中文名称）
     *
     * @param orderFreqCn 频次中文名称（标识单位时间内药物使用的次数中文名称）
     */
    public void setOrderFreqCn(String orderFreqCn) {
        this.orderFreqCn = orderFreqCn == null ? null : orderFreqCn.trim();
    }

    /**
     * 获取医嘱单号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return ORDER_FORM_NO - 医嘱单号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getOrderFormNo() {
        return orderFormNo;
    }

    /**
     * 设置医嘱单号（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param orderFormNo 医嘱单号（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setOrderFormNo(String orderFormNo) {
        this.orderFormNo = orderFormNo == null ? null : orderFormNo.trim();
    }

    /**
     * 获取医嘱子项序号（医嘱在每个医嘱申请单内部的顺序号）
     *
     * @return ORDER_ITEM_NO - 医嘱子项序号（医嘱在每个医嘱申请单内部的顺序号）
     */
    public String getOrderItemNo() {
        return orderItemNo;
    }

    /**
     * 设置医嘱子项序号（医嘱在每个医嘱申请单内部的顺序号）
     *
     * @param orderItemNo 医嘱子项序号（医嘱在每个医嘱申请单内部的顺序号）
     */
    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo == null ? null : orderItemNo.trim();
    }

    /**
     * 获取医嘱项目类型代码CV06.00.229（医嘱项目分类在特定编码体系中的代码）
     *
     * @return SUBJECT_CLASS_CODE - 医嘱项目类型代码CV06.00.229（医嘱项目分类在特定编码体系中的代码）
     */
    public String getSubjectClassCode() {
        return subjectClassCode;
    }

    /**
     * 设置医嘱项目类型代码CV06.00.229（医嘱项目分类在特定编码体系中的代码）
     *
     * @param subjectClassCode 医嘱项目类型代码CV06.00.229（医嘱项目分类在特定编码体系中的代码）
     */
    public void setSubjectClassCode(String subjectClassCode) {
        this.subjectClassCode = subjectClassCode == null ? null : subjectClassCode.trim();
    }

    /**
     * 获取医嘱项目类型中文名称（医嘱项目分类在特定编码体系中的中文名称）
     *
     * @return SUBJECT_CLASS_CN - 医嘱项目类型中文名称（医嘱项目分类在特定编码体系中的中文名称）
     */
    public String getSubjectClassCn() {
        return subjectClassCn;
    }

    /**
     * 设置医嘱项目类型中文名称（医嘱项目分类在特定编码体系中的中文名称）
     *
     * @param subjectClassCn 医嘱项目类型中文名称（医嘱项目分类在特定编码体系中的中文名称）
     */
    public void setSubjectClassCn(String subjectClassCn) {
        this.subjectClassCn = subjectClassCn == null ? null : subjectClassCn.trim();
    }

    /**
     * 获取医嘱计划开始日期时间（医嘱计划开始时的公元纪年日期和时间的完整描述）
     *
     * @return PLAN_START_DATE - 医嘱计划开始日期时间（医嘱计划开始时的公元纪年日期和时间的完整描述）
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    /**
     * 设置医嘱计划开始日期时间（医嘱计划开始时的公元纪年日期和时间的完整描述）
     *
     * @param planStartDate 医嘱计划开始日期时间（医嘱计划开始时的公元纪年日期和时间的完整描述）
     */
    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate == null ? null : planStartDate.trim();
    }

    /**
     * 获取医嘱计划结束日期时间（医嘱计划结束时的公元纪年日期和时间的完整描述）
     *
     * @return PLAN_END_DATE - 医嘱计划结束日期时间（医嘱计划结束时的公元纪年日期和时间的完整描述）
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    /**
     * 设置医嘱计划结束日期时间（医嘱计划结束时的公元纪年日期和时间的完整描述）
     *
     * @param planEndDate 医嘱计划结束日期时间（医嘱计划结束时的公元纪年日期和时间的完整描述）
     */
    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate == null ? null : planEndDate.trim();
    }

    /**
     * 获取医嘱开立科室代码DIR_DEPT（开立医嘱的科室代码）
     *
     * @return APPLY_DEPT_CODE - 医嘱开立科室代码DIR_DEPT（开立医嘱的科室代码）
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * 设置医嘱开立科室代码DIR_DEPT（开立医嘱的科室代码）
     *
     * @param applyDeptCode 医嘱开立科室代码DIR_DEPT（开立医嘱的科室代码）
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    /**
     * 获取医嘱开立科室中文名称（开立医嘱的科室中文名称）
     *
     * @return APPLY_DEPT_CN - 医嘱开立科室中文名称（开立医嘱的科室中文名称）
     */
    public String getApplyDeptCn() {
        return applyDeptCn;
    }

    /**
     * 设置医嘱开立科室中文名称（开立医嘱的科室中文名称）
     *
     * @param applyDeptCn 医嘱开立科室中文名称（开立医嘱的科室中文名称）
     */
    public void setApplyDeptCn(String applyDeptCn) {
        this.applyDeptCn = applyDeptCn == null ? null : applyDeptCn.trim();
    }

    /**
     * 获取医嘱开立科室唯一标识
     *
     * @return APPLY_DEPT_UID - 医嘱开立科室唯一标识
     */
    public String getApplyDeptUid() {
        return applyDeptUid;
    }

    /**
     * 设置医嘱开立科室唯一标识
     *
     * @param applyDeptUid 医嘱开立科室唯一标识
     */
    public void setApplyDeptUid(String applyDeptUid) {
        this.applyDeptUid = applyDeptUid == null ? null : applyDeptUid.trim();
    }

    /**
     * 获取医嘱审核人签名（对医嘱进行审核的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUDITOR_SIGNATURE - 医嘱审核人签名（对医嘱进行审核的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuditorSignature() {
        return auditorSignature;
    }

    /**
     * 设置医嘱审核人签名（对医嘱进行审核的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param auditorSignature 医嘱审核人签名（对医嘱进行审核的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuditorSignature(String auditorSignature) {
        this.auditorSignature = auditorSignature == null ? null : auditorSignature.trim();
    }

    /**
     * 获取医嘱审核日期时间（对医嘱进行审核时的公元纪年日期和时间的详细描述）
     *
     * @return AUDIT_DATE - 医嘱审核日期时间（对医嘱进行审核时的公元纪年日期和时间的详细描述）
     */
    public String getAuditDate() {
        return auditDate;
    }

    /**
     * 设置医嘱审核日期时间（对医嘱进行审核时的公元纪年日期和时间的详细描述）
     *
     * @param auditDate 医嘱审核日期时间（对医嘱进行审核时的公元纪年日期和时间的详细描述）
     */
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    /**
     * 获取医嘱核对日期时间（对医嘱进行核对时的公元纪年日期和时间的详细描述）
     *
     * @return CHECK_DATE - 医嘱核对日期时间（对医嘱进行核对时的公元纪年日期和时间的详细描述）
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * 设置医嘱核对日期时间（对医嘱进行核对时的公元纪年日期和时间的详细描述）
     *
     * @param checkDate 医嘱核对日期时间（对医嘱进行核对时的公元纪年日期和时间的详细描述）
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    /**
     * 获取医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORMER_SIGNATURE - 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformerSignature() {
        return performerSignature;
    }

    /**
     * 设置医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param performerSignature 医嘱执行者签名（执行医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformerSignature(String performerSignature) {
        this.performerSignature = performerSignature == null ? null : performerSignature.trim();
    }

    /**
     * 获取医嘱执行日期时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @return PERFORMER_DATE - 医嘱执行日期时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public String getPerformerDate() {
        return performerDate;
    }

    /**
     * 设置医嘱执行日期时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @param performerDate 医嘱执行日期时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public void setPerformerDate(String performerDate) {
        this.performerDate = performerDate == null ? null : performerDate.trim();
    }

    /**
     * 获取医嘱执行科室代码DIR_DEPT（执行医嘱的科室代码）
     *
     * @return PERFORMER_DEPT_CODE - 医嘱执行科室代码DIR_DEPT（执行医嘱的科室代码）
     */
    public String getPerformerDeptCode() {
        return performerDeptCode;
    }

    /**
     * 设置医嘱执行科室代码DIR_DEPT（执行医嘱的科室代码）
     *
     * @param performerDeptCode 医嘱执行科室代码DIR_DEPT（执行医嘱的科室代码）
     */
    public void setPerformerDeptCode(String performerDeptCode) {
        this.performerDeptCode = performerDeptCode == null ? null : performerDeptCode.trim();
    }

    /**
     * 获取医嘱执行科室中文名称（执行医嘱的科室中文名称）
     *
     * @return PERFORMER_DEPT_CN - 医嘱执行科室中文名称（执行医嘱的科室中文名称）
     */
    public String getPerformerDeptCn() {
        return performerDeptCn;
    }

    /**
     * 设置医嘱执行科室中文名称（执行医嘱的科室中文名称）
     *
     * @param performerDeptCn 医嘱执行科室中文名称（执行医嘱的科室中文名称）
     */
    public void setPerformerDeptCn(String performerDeptCn) {
        this.performerDeptCn = performerDeptCn == null ? null : performerDeptCn.trim();
    }

    /**
     * 获取医嘱执行科室唯一标识
     *
     * @return PERFORMER_DEPT_UID - 医嘱执行科室唯一标识
     */
    public String getPerformerDeptUid() {
        return performerDeptUid;
    }

    /**
     * 设置医嘱执行科室唯一标识
     *
     * @param performerDeptUid 医嘱执行科室唯一标识
     */
    public void setPerformerDeptUid(String performerDeptUid) {
        this.performerDeptUid = performerDeptUid == null ? null : performerDeptUid.trim();
    }

    /**
     * 获取医嘱执行状态代码DIR_PRESCRIBE_STATUS（显示医嘱执行状态的代码）
     *
     * @return PERFORMER_STATUS_CODE - 医嘱执行状态代码DIR_PRESCRIBE_STATUS（显示医嘱执行状态的代码）
     */
    public String getPerformerStatusCode() {
        return performerStatusCode;
    }

    /**
     * 设置医嘱执行状态代码DIR_PRESCRIBE_STATUS（显示医嘱执行状态的代码）
     *
     * @param performerStatusCode 医嘱执行状态代码DIR_PRESCRIBE_STATUS（显示医嘱执行状态的代码）
     */
    public void setPerformerStatusCode(String performerStatusCode) {
        this.performerStatusCode = performerStatusCode == null ? null : performerStatusCode.trim();
    }

    /**
     * 获取医嘱执行状态中文名称（显示医嘱执行状态的中文名称）
     *
     * @return PERFORMER_STATUS_CN - 医嘱执行状态中文名称（显示医嘱执行状态的中文名称）
     */
    public String getPerformerStatusCn() {
        return performerStatusCn;
    }

    /**
     * 设置医嘱执行状态中文名称（显示医嘱执行状态的中文名称）
     *
     * @param performerStatusCn 医嘱执行状态中文名称（显示医嘱执行状态的中文名称）
     */
    public void setPerformerStatusCn(String performerStatusCn) {
        this.performerStatusCn = performerStatusCn == null ? null : performerStatusCn.trim();
    }

    /**
     * 获取医嘱取消日期时间（取消医嘱时的公元纪年日期和时间的完整描述）
     *
     * @return CANCEL_DATE - 医嘱取消日期时间（取消医嘱时的公元纪年日期和时间的完整描述）
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * 设置医嘱取消日期时间（取消医嘱时的公元纪年日期和时间的完整描述）
     *
     * @param cancelDate 医嘱取消日期时间（取消医嘱时的公元纪年日期和时间的完整描述）
     */
    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate == null ? null : cancelDate.trim();
    }

    /**
     * 获取取消医嘱者签名（取消医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CANCEL_OPERATOR_SIGNATURE - 取消医嘱者签名（取消医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCancelOperatorSignature() {
        return cancelOperatorSignature;
    }

    /**
     * 设置取消医嘱者签名（取消医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param cancelOperatorSignature 取消医嘱者签名（取消医嘱的人员签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCancelOperatorSignature(String cancelOperatorSignature) {
        this.cancelOperatorSignature = cancelOperatorSignature == null ? null : cancelOperatorSignature.trim();
    }

    /**
     * 获取药物使用次剂量（单次使用药物的剂量）
     *
     * @return ORDER_DOSE - 药物使用次剂量（单次使用药物的剂量）
     */
    public String getOrderDose() {
        return orderDose;
    }

    /**
     * 设置药物使用次剂量（单次使用药物的剂量）
     *
     * @param orderDose 药物使用次剂量（单次使用药物的剂量）
     */
    public void setOrderDose(String orderDose) {
        this.orderDose = orderDose == null ? null : orderDose.trim();
    }

    /**
     * 获取药物使用剂量单位（药物使用的剂量单位）
     *
     * @return ORDER_DOSE_UNIT - 药物使用剂量单位（药物使用的剂量单位）
     */
    public String getOrderDoseUnit() {
        return orderDoseUnit;
    }

    /**
     * 设置药物使用剂量单位（药物使用的剂量单位）
     *
     * @param orderDoseUnit 药物使用剂量单位（药物使用的剂量单位）
     */
    public void setOrderDoseUnit(String orderDoseUnit) {
        this.orderDoseUnit = orderDoseUnit == null ? null : orderDoseUnit.trim();
    }

    /**
     * 获取数量
     *
     * @return ORDER_QUANTITY - 数量
     */
    public String getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * 设置数量
     *
     * @param orderQuantity 数量
     */
    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity == null ? null : orderQuantity.trim();
    }

    /**
     * 获取数量单位
     *
     * @return ORDER_QUANTITY_UNIT - 数量单位
     */
    public String getOrderQuantityUnit() {
        return orderQuantityUnit;
    }

    /**
     * 设置数量单位
     *
     * @param orderQuantityUnit 数量单位
     */
    public void setOrderQuantityUnit(String orderQuantityUnit) {
        this.orderQuantityUnit = orderQuantityUnit == null ? null : orderQuantityUnit.trim();
    }

    /**
     * @return ORDER_SPEC
     */
    public String getOrderSpec() {
        return orderSpec;
    }

    /**
     * @param orderSpec
     */
    public void setOrderSpec(String orderSpec) {
        this.orderSpec = orderSpec == null ? null : orderSpec.trim();
    }

    /**
     * @return ORDER_ROUTE
     */
    public String getOrderRoute() {
        return orderRoute;
    }

    /**
     * @param orderRoute
     */
    public void setOrderRoute(String orderRoute) {
        this.orderRoute = orderRoute == null ? null : orderRoute.trim();
    }

    /**
     * @return ORDER_USING_DAYS
     */
    public String getOrderUsingDays() {
        return orderUsingDays;
    }

    /**
     * @param orderUsingDays
     */
    public void setOrderUsingDays(String orderUsingDays) {
        this.orderUsingDays = orderUsingDays == null ? null : orderUsingDays.trim();
    }

    /**
     * @return DDD_VALUE
     */
    public String getDddValue() {
        return dddValue;
    }

    /**
     * @param dddValue
     */
    public void setDddValue(String dddValue) {
        this.dddValue = dddValue == null ? null : dddValue.trim();
    }

    /**
     * @return ITEM_PRICE
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice
     */
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice == null ? null : itemPrice.trim();
    }

    /**
     * @return ANT_PURPOSE
     */
    public String getAntPurpose() {
        return antPurpose;
    }

    /**
     * @param antPurpose
     */
    public void setAntPurpose(String antPurpose) {
        this.antPurpose = antPurpose == null ? null : antPurpose.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
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
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
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
     * 获取是否无效
     *
     * @return IS_INVALID - 是否无效
     */
    public Short getIsInvalid() {
        return isInvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isInvalid 是否无效
     */
    public void setIsInvalid(Short isInvalid) {
        this.isInvalid = isInvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return IS_DEL - 是否逻辑删除
     */
    public Short getIsDel() {
        return isDel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isDel 是否逻辑删除
     */
    public void setIsDel(Short isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * 获取是否点评
     *
     * @return IS_REVIEWS - 是否点评
     */
    public Long getIsReviews() {
        return isReviews;
    }

    /**
     * 设置是否点评
     *
     * @param isReviews 是否点评
     */
    public void setIsReviews(Long isReviews) {
        this.isReviews = isReviews;
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取医嘱状态代码( 0  新开,1  已提交,2  需校对,3  已作废,4  已停嘱,5  已复核,6  停嘱退回  0
     *
     * @return ORDER_STATUS_CODE - 医嘱状态代码( 0  新开,1  已提交,2  需校对,3  已作废,4  已停嘱,5  已复核,6  停嘱退回  0
     */
    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    /**
     * 设置医嘱状态代码( 0  新开,1  已提交,2  需校对,3  已作废,4  已停嘱,5  已复核,6  停嘱退回  0
     *
     * @param orderStatusCode 医嘱状态代码( 0  新开,1  已提交,2  需校对,3  已作废,4  已停嘱,5  已复核,6  停嘱退回  0
     */
    public void setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode == null ? null : orderStatusCode.trim();
    }

    /**
     * 获取医嘱状态代码,中文名称医嘱状态代码（新开、提交、复核、停嘱、作废) 
     *
     * @return ORDER_STATUS_NAME - 医嘱状态代码,中文名称医嘱状态代码（新开、提交、复核、停嘱、作废) 
     */
    public String getOrderStatusName() {
        return orderStatusName;
    }

    /**
     * 设置医嘱状态代码,中文名称医嘱状态代码（新开、提交、复核、停嘱、作废) 
     *
     * @param orderStatusName 医嘱状态代码,中文名称医嘱状态代码（新开、提交、复核、停嘱、作废) 
     */
    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName == null ? null : orderStatusName.trim();
    }

    /**
     * 获取医嘱状态代码
     *
     * @return ORDER_ID - 医嘱状态代码
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置医嘱状态代码
     *
     * @param orderId 医嘱状态代码
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取医嘱备注信息（对下达医嘱的补充说明和注意事项提示）
     *
     * @return NOTES - 医嘱备注信息（对下达医嘱的补充说明和注意事项提示）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置医嘱备注信息（对下达医嘱的补充说明和注意事项提示）
     *
     * @param notes 医嘱备注信息（对下达医嘱的补充说明和注意事项提示）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}