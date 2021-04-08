package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_SURGERY_RECORD")
public class QxTSurgeryRecord {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 手术记录唯一标识
     */
    @Column(name = "SRUID")
    private String sruid;

    /**
     * 手术科室标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 手术科室名称
     */
    @Column(name = "DEPT")
    private String dept;

    /**
     * 手术申请单号
     */
    @Column(name = "SURGERY_NO")
    private String surgeryNo;

    /**
     * 申请人
     */
    @Column(name = "APPLY")
    private String apply;

    /**
     * 申请人姓名
     */
    @Column(name = "APPLY_NAME")
    private String applyName;

    /**
     * 安排日期
     */
    @Column(name = "PLAN_DATE")
    private String planDate;

    /**
     * 手术日期
     */
    @Column(name = "SURGERY_DATE")
    private String surgeryDate;

    /**
     * 主刀医师
     */
    @Column(name = "SURGEON_ID")
    private String surgeonId;

    /**
     * 主刀医师名称
     */
    @Column(name = "SURGEON_NAME")
    private String surgeonName;

    /**
     * 手术级别
     */
    @Column(name = "SURGERY_LEVEL")
    private String surgeryLevel;

    /**
     * 手术房间
     */
    @Column(name = "ROOM")
    private String room;

    /**
     * 手术台号
     */
    @Column(name = "OPERATING_TABLE_NO")
    private String operatingTableNo;

    /**
     * 手术名称
     */
    @Column(name = "SURGERY_NAME")
    private String surgeryName;

    /**
     * 手术要求
     */
    @Column(name = "SURGERY_REQUIRE")
    private String surgeryRequire;

    /**
     * 注意事项
     */
    @Column(name = "OPERATION_NOTE")
    private String operationNote;

    /**
     * 术前诊断ICD
     */
    @Column(name = "DIAG_BEFORE_CODE")
    private String diagBeforeCode;

    /**
     * 术前诊断
     */
    @Column(name = "DIAG_BEFORE_NAME")
    private String diagBeforeName;

    /**
     * 术后诊断ICD
     */
    @Column(name = "DIAG_AFTER_CODE")
    private String diagAfterCode;

    /**
     * 术后诊断
     */
    @Column(name = "DIAG_AFTER_NAME")
    private String diagAfterName;

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
     * 获取手术记录唯一标识
     *
     * @return SRUID - 手术记录唯一标识
     */
    public String getSruid() {
        return sruid;
    }

    /**
     * 设置手术记录唯一标识
     *
     * @param sruid 手术记录唯一标识
     */
    public void setSruid(String sruid) {
        this.sruid = sruid == null ? null : sruid.trim();
    }

    /**
     * 获取手术科室标识
     *
     * @return DUID - 手术科室标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置手术科室标识
     *
     * @param duid 手术科室标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取手术科室名称
     *
     * @return DEPT - 手术科室名称
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置手术科室名称
     *
     * @param dept 手术科室名称
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * 获取手术申请单号
     *
     * @return SURGERY_NO - 手术申请单号
     */
    public String getSurgeryNo() {
        return surgeryNo;
    }

    /**
     * 设置手术申请单号
     *
     * @param surgeryNo 手术申请单号
     */
    public void setSurgeryNo(String surgeryNo) {
        this.surgeryNo = surgeryNo == null ? null : surgeryNo.trim();
    }

    /**
     * 获取申请人
     *
     * @return APPLY - 申请人
     */
    public String getApply() {
        return apply;
    }

    /**
     * 设置申请人
     *
     * @param apply 申请人
     */
    public void setApply(String apply) {
        this.apply = apply == null ? null : apply.trim();
    }

    /**
     * 获取申请人姓名
     *
     * @return APPLY_NAME - 申请人姓名
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * 设置申请人姓名
     *
     * @param applyName 申请人姓名
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    /**
     * 获取安排日期
     *
     * @return PLAN_DATE - 安排日期
     */
    public String getPlanDate() {
        return planDate;
    }

    /**
     * 设置安排日期
     *
     * @param planDate 安排日期
     */
    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    /**
     * 获取手术日期
     *
     * @return SURGERY_DATE - 手术日期
     */
    public String getSurgeryDate() {
        return surgeryDate;
    }

    /**
     * 设置手术日期
     *
     * @param surgeryDate 手术日期
     */
    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate == null ? null : surgeryDate.trim();
    }

    /**
     * 获取主刀医师
     *
     * @return SURGEON_ID - 主刀医师
     */
    public String getSurgeonId() {
        return surgeonId;
    }

    /**
     * 设置主刀医师
     *
     * @param surgeonId 主刀医师
     */
    public void setSurgeonId(String surgeonId) {
        this.surgeonId = surgeonId == null ? null : surgeonId.trim();
    }

    /**
     * 获取主刀医师名称
     *
     * @return SURGEON_NAME - 主刀医师名称
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * 设置主刀医师名称
     *
     * @param surgeonName 主刀医师名称
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    /**
     * 获取手术级别
     *
     * @return SURGERY_LEVEL - 手术级别
     */
    public String getSurgeryLevel() {
        return surgeryLevel;
    }

    /**
     * 设置手术级别
     *
     * @param surgeryLevel 手术级别
     */
    public void setSurgeryLevel(String surgeryLevel) {
        this.surgeryLevel = surgeryLevel == null ? null : surgeryLevel.trim();
    }

    /**
     * 获取手术房间
     *
     * @return ROOM - 手术房间
     */
    public String getRoom() {
        return room;
    }

    /**
     * 设置手术房间
     *
     * @param room 手术房间
     */
    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    /**
     * 获取手术台号
     *
     * @return OPERATING_TABLE_NO - 手术台号
     */
    public String getOperatingTableNo() {
        return operatingTableNo;
    }

    /**
     * 设置手术台号
     *
     * @param operatingTableNo 手术台号
     */
    public void setOperatingTableNo(String operatingTableNo) {
        this.operatingTableNo = operatingTableNo == null ? null : operatingTableNo.trim();
    }

    /**
     * 获取手术名称
     *
     * @return SURGERY_NAME - 手术名称
     */
    public String getSurgeryName() {
        return surgeryName;
    }

    /**
     * 设置手术名称
     *
     * @param surgeryName 手术名称
     */
    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName == null ? null : surgeryName.trim();
    }

    /**
     * 获取手术要求
     *
     * @return SURGERY_REQUIRE - 手术要求
     */
    public String getSurgeryRequire() {
        return surgeryRequire;
    }

    /**
     * 设置手术要求
     *
     * @param surgeryRequire 手术要求
     */
    public void setSurgeryRequire(String surgeryRequire) {
        this.surgeryRequire = surgeryRequire == null ? null : surgeryRequire.trim();
    }

    /**
     * 获取注意事项
     *
     * @return OPERATION_NOTE - 注意事项
     */
    public String getOperationNote() {
        return operationNote;
    }

    /**
     * 设置注意事项
     *
     * @param operationNote 注意事项
     */
    public void setOperationNote(String operationNote) {
        this.operationNote = operationNote == null ? null : operationNote.trim();
    }

    /**
     * 获取术前诊断ICD
     *
     * @return DIAG_BEFORE_CODE - 术前诊断ICD
     */
    public String getDiagBeforeCode() {
        return diagBeforeCode;
    }

    /**
     * 设置术前诊断ICD
     *
     * @param diagBeforeCode 术前诊断ICD
     */
    public void setDiagBeforeCode(String diagBeforeCode) {
        this.diagBeforeCode = diagBeforeCode == null ? null : diagBeforeCode.trim();
    }

    /**
     * 获取术前诊断
     *
     * @return DIAG_BEFORE_NAME - 术前诊断
     */
    public String getDiagBeforeName() {
        return diagBeforeName;
    }

    /**
     * 设置术前诊断
     *
     * @param diagBeforeName 术前诊断
     */
    public void setDiagBeforeName(String diagBeforeName) {
        this.diagBeforeName = diagBeforeName == null ? null : diagBeforeName.trim();
    }

    /**
     * 获取术后诊断ICD
     *
     * @return DIAG_AFTER_CODE - 术后诊断ICD
     */
    public String getDiagAfterCode() {
        return diagAfterCode;
    }

    /**
     * 设置术后诊断ICD
     *
     * @param diagAfterCode 术后诊断ICD
     */
    public void setDiagAfterCode(String diagAfterCode) {
        this.diagAfterCode = diagAfterCode == null ? null : diagAfterCode.trim();
    }

    /**
     * 获取术后诊断
     *
     * @return DIAG_AFTER_NAME - 术后诊断
     */
    public String getDiagAfterName() {
        return diagAfterName;
    }

    /**
     * 设置术后诊断
     *
     * @param diagAfterName 术后诊断
     */
    public void setDiagAfterName(String diagAfterName) {
        this.diagAfterName = diagAfterName == null ? null : diagAfterName.trim();
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
}