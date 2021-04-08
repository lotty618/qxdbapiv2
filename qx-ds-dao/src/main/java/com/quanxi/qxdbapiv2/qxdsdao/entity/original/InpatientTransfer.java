package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_TRANSFER")
public class InpatientTransfer {
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
     * 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Id
    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    /**
     * 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    @Id
    @Column(name = "TRANSFEE_NO")
    private String transfeeNo;

    /**
     * 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    @Column(name = "TRANSFER_TYPE_CODE")
    private String transferTypeCode;

    /**
     * 转科申请时间
     */
    @Column(name = "TRANSFER_APPLE_DATE")
    private String transferAppleDate;

    /**
     * 转科执行医生代码
     */
    @Column(name = "TRANSFER_DOCTOR_CODE")
    private String transferDoctorCode;

    /**
     * 转科执行医生（执行医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_DOCTOR_NAME")
    private String transferDoctorName;

    /**
     * 转科执行时间
     */
    @Column(name = "TRANSFER_DATE")
    private String transferDate;

    /**
     * 执行标志
     */
    @Column(name = "TRANSFER_SIGN")
    private String transferSign;

    /**
     * 转出医师代码
     */
    @Column(name = "TRANSFER_OUT_DOCTOR_CODE")
    private String transferOutDoctorCode;

    /**
     * 转出医师 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_OUT_DOCTOR_NAME")
    private String transferOutDoctorName;

    /**
     * 转出科室代码DIR_DEPT（患者转出的科室代码）
     */
    @Column(name = "TRANSFER_OUT_DEPT_CODE")
    private String transferOutDeptCode;

    /**
     * 转出床号
     */
    @Column(name = "TRANSFER_OUT_BED")
    private String transferOutBed;

    /**
     * 转入床号
     */
    @Column(name = "TRANSFER_IN_BED")
    private String transferInBed;

    /**
     * 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    @Column(name = "TRANSFER_IN_DEPT_CODE")
    private String transferInDeptCode;

    /**
     * 转入医生代码
     */
    @Column(name = "TRANSFER_IN_DOCTOR_CODE")
    private String transferInDoctorCode;

    /**
     * 转入医生（转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "TRANSFER_IN_DOCTOR_NAME")
    private String transferInDoctorName;

    /**
     * 转科目的（对患者转科目的的详细描述）
     */
    @Column(name = "TRANSFER_REASON")
    private String transferReason;

    /**
     * 转科注意事项（对患者转科需要注意的事项的描述）
     */
    @Column(name = "NOTICES")
    private String notices;

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
     * 获取住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @return INPATIENT_FORM_NO - 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * 设置住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     *
     * @param inpatientFormNo 住院记录表编号[主键]约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * 获取转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @return TRANSFEE_NO - 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public String getTransfeeNo() {
        return transfeeNo;
    }

    /**
     * 设置转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     *
     * @param transfeeNo 转诊记录表单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号 ）
     */
    public void setTransfeeNo(String transfeeNo) {
        this.transfeeNo = transfeeNo == null ? null : transfeeNo.trim();
    }

    /**
     * 获取转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @return TRANSFER_TYPE_CODE - 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    /**
     * 设置转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     *
     * @param transferTypeCode 转科记录类型代码1转入记录 2转出记录（标识患者在院期间的转科情况代码）
     */
    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode == null ? null : transferTypeCode.trim();
    }

    /**
     * 获取转科申请时间
     *
     * @return TRANSFER_APPLE_DATE - 转科申请时间
     */
    public String getTransferAppleDate() {
        return transferAppleDate;
    }

    /**
     * 设置转科申请时间
     *
     * @param transferAppleDate 转科申请时间
     */
    public void setTransferAppleDate(String transferAppleDate) {
        this.transferAppleDate = transferAppleDate == null ? null : transferAppleDate.trim();
    }

    /**
     * 获取转科执行医生代码
     *
     * @return TRANSFER_DOCTOR_CODE - 转科执行医生代码
     */
    public String getTransferDoctorCode() {
        return transferDoctorCode;
    }

    /**
     * 设置转科执行医生代码
     *
     * @param transferDoctorCode 转科执行医生代码
     */
    public void setTransferDoctorCode(String transferDoctorCode) {
        this.transferDoctorCode = transferDoctorCode == null ? null : transferDoctorCode.trim();
    }

    /**
     * 获取转科执行医生（执行医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_DOCTOR_NAME - 转科执行医生（执行医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferDoctorName() {
        return transferDoctorName;
    }

    /**
     * 设置转科执行医生（执行医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferDoctorName 转科执行医生（执行医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferDoctorName(String transferDoctorName) {
        this.transferDoctorName = transferDoctorName == null ? null : transferDoctorName.trim();
    }

    /**
     * 获取转科执行时间
     *
     * @return TRANSFER_DATE - 转科执行时间
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * 设置转科执行时间
     *
     * @param transferDate 转科执行时间
     */
    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate == null ? null : transferDate.trim();
    }

    /**
     * 获取执行标志
     *
     * @return TRANSFER_SIGN - 执行标志
     */
    public String getTransferSign() {
        return transferSign;
    }

    /**
     * 设置执行标志
     *
     * @param transferSign 执行标志
     */
    public void setTransferSign(String transferSign) {
        this.transferSign = transferSign == null ? null : transferSign.trim();
    }

    /**
     * 获取转出医师代码
     *
     * @return TRANSFER_OUT_DOCTOR_CODE - 转出医师代码
     */
    public String getTransferOutDoctorCode() {
        return transferOutDoctorCode;
    }

    /**
     * 设置转出医师代码
     *
     * @param transferOutDoctorCode 转出医师代码
     */
    public void setTransferOutDoctorCode(String transferOutDoctorCode) {
        this.transferOutDoctorCode = transferOutDoctorCode == null ? null : transferOutDoctorCode.trim();
    }

    /**
     * 获取转出医师 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_OUT_DOCTOR_NAME - 转出医师 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferOutDoctorName() {
        return transferOutDoctorName;
    }

    /**
     * 设置转出医师 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferOutDoctorName 转出医师 （转出医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferOutDoctorName(String transferOutDoctorName) {
        this.transferOutDoctorName = transferOutDoctorName == null ? null : transferOutDoctorName.trim();
    }

    /**
     * 获取转出科室代码DIR_DEPT（患者转出的科室代码）
     *
     * @return TRANSFER_OUT_DEPT_CODE - 转出科室代码DIR_DEPT（患者转出的科室代码）
     */
    public String getTransferOutDeptCode() {
        return transferOutDeptCode;
    }

    /**
     * 设置转出科室代码DIR_DEPT（患者转出的科室代码）
     *
     * @param transferOutDeptCode 转出科室代码DIR_DEPT（患者转出的科室代码）
     */
    public void setTransferOutDeptCode(String transferOutDeptCode) {
        this.transferOutDeptCode = transferOutDeptCode == null ? null : transferOutDeptCode.trim();
    }

    /**
     * 获取转出床号
     *
     * @return TRANSFER_OUT_BED - 转出床号
     */
    public String getTransferOutBed() {
        return transferOutBed;
    }

    /**
     * 设置转出床号
     *
     * @param transferOutBed 转出床号
     */
    public void setTransferOutBed(String transferOutBed) {
        this.transferOutBed = transferOutBed == null ? null : transferOutBed.trim();
    }

    /**
     * 获取转入床号
     *
     * @return TRANSFER_IN_BED - 转入床号
     */
    public String getTransferInBed() {
        return transferInBed;
    }

    /**
     * 设置转入床号
     *
     * @param transferInBed 转入床号
     */
    public void setTransferInBed(String transferInBed) {
        this.transferInBed = transferInBed == null ? null : transferInBed.trim();
    }

    /**
     * 获取转入科室代码DIR_DEPT（患者转入的科室代码）
     *
     * @return TRANSFER_IN_DEPT_CODE - 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    public String getTransferInDeptCode() {
        return transferInDeptCode;
    }

    /**
     * 设置转入科室代码DIR_DEPT（患者转入的科室代码）
     *
     * @param transferInDeptCode 转入科室代码DIR_DEPT（患者转入的科室代码）
     */
    public void setTransferInDeptCode(String transferInDeptCode) {
        this.transferInDeptCode = transferInDeptCode == null ? null : transferInDeptCode.trim();
    }

    /**
     * 获取转入医生代码
     *
     * @return TRANSFER_IN_DOCTOR_CODE - 转入医生代码
     */
    public String getTransferInDoctorCode() {
        return transferInDoctorCode;
    }

    /**
     * 设置转入医生代码
     *
     * @param transferInDoctorCode 转入医生代码
     */
    public void setTransferInDoctorCode(String transferInDoctorCode) {
        this.transferInDoctorCode = transferInDoctorCode == null ? null : transferInDoctorCode.trim();
    }

    /**
     * 获取转入医生（转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @return TRANSFER_IN_DOCTOR_NAME - 转入医生（转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public String getTransferInDoctorName() {
        return transferInDoctorName;
    }

    /**
     * 设置转入医生（转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     *
     * @param transferInDoctorName 转入医生（转入医师签署的在公安管理部门正式登记注册的姓氏和名称 ）
     */
    public void setTransferInDoctorName(String transferInDoctorName) {
        this.transferInDoctorName = transferInDoctorName == null ? null : transferInDoctorName.trim();
    }

    /**
     * 获取转科目的（对患者转科目的的详细描述）
     *
     * @return TRANSFER_REASON - 转科目的（对患者转科目的的详细描述）
     */
    public String getTransferReason() {
        return transferReason;
    }

    /**
     * 设置转科目的（对患者转科目的的详细描述）
     *
     * @param transferReason 转科目的（对患者转科目的的详细描述）
     */
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    /**
     * 获取转科注意事项（对患者转科需要注意的事项的描述）
     *
     * @return NOTICES - 转科注意事项（对患者转科需要注意的事项的描述）
     */
    public String getNotices() {
        return notices;
    }

    /**
     * 设置转科注意事项（对患者转科需要注意的事项的描述）
     *
     * @param notices 转科注意事项（对患者转科需要注意的事项的描述）
     */
    public void setNotices(String notices) {
        this.notices = notices == null ? null : notices.trim();
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