package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TP_SICKBED")
public class QxTpSickbed {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 病床唯一标识
     */
    @Column(name = "HBUID")
    private String hbuid;

    /**
     * 病床描述
     */
    @Column(name = "BED_DESC")
    private String bedDesc;

    /**
     * 病人ID
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 病人入院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人入院编号
     */
    @Column(name = "INHOS_NO")
    private String inhosNo;

    /**
     * 所属病房ID
     */
    @Column(name = "HSUID")
    private String hsuid;

    /**
     * 机构标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 所属科室标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 床号唯一编码[主键]
     */
    @Column(name = "BED_ID")
    private String bedId;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 所属科室编码 ORG_DEPT
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 所属房间
     */
    @Column(name = "WARD")
    private String ward;

    /**
     * 床位编号
     */
    @Column(name = "BED_CODE")
    private String bedCode;

    /**
     * 床位名称
     */
    @Column(name = "BED_NEAM")
    private String bedNeam;

    /**
     * 管床医生代码
     */
    @Column(name = "BED_DOCTOR")
    private String bedDoctor;

    /**
     * 管床护士代码
     */
    @Column(name = "BED_NURSE")
    private String bedNurse;

    /**
     * 管床医生ID
     */
    @Column(name = "DOCTOR_ID")
    private String doctorId;

    /**
     * 管床护士ID
     */
    @Column(name = "NURSE_ID")
    private String nurseId;

    /**
     * 床位使用标志
     */
    @Column(name = "BED_MAKE")
    private String bedMake;

    /**
     * 加床标志
     */
    @Column(name = "BED_EXTRA")
    private String bedExtra;

    /**
     * 床位分类
     */
    @Column(name = "BED_TYPE")
    private String bedType;

    /**
     * 床位费
     */
    @Column(name = "BED_FEE")
    private String bedFee;

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
     * 是否优质
     */
    @Column(name = "IS_HQUALITY")
    private Long isHquality;

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
     * 获取病床唯一标识
     *
     * @return HBUID - 病床唯一标识
     */
    public String getHbuid() {
        return hbuid;
    }

    /**
     * 设置病床唯一标识
     *
     * @param hbuid 病床唯一标识
     */
    public void setHbuid(String hbuid) {
        this.hbuid = hbuid == null ? null : hbuid.trim();
    }

    /**
     * 获取病床描述
     *
     * @return BED_DESC - 病床描述
     */
    public String getBedDesc() {
        return bedDesc;
    }

    /**
     * 设置病床描述
     *
     * @param bedDesc 病床描述
     */
    public void setBedDesc(String bedDesc) {
        this.bedDesc = bedDesc == null ? null : bedDesc.trim();
    }

    /**
     * 获取病人ID
     *
     * @return PUID - 病人ID
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人ID
     *
     * @param puid 病人ID
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取病人入院标识
     *
     * @return IHUID - 病人入院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置病人入院标识
     *
     * @param ihuid 病人入院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人入院编号
     *
     * @return INHOS_NO - 病人入院编号
     */
    public String getInhosNo() {
        return inhosNo;
    }

    /**
     * 设置病人入院编号
     *
     * @param inhosNo 病人入院编号
     */
    public void setInhosNo(String inhosNo) {
        this.inhosNo = inhosNo == null ? null : inhosNo.trim();
    }

    /**
     * 获取所属病房ID
     *
     * @return HSUID - 所属病房ID
     */
    public String getHsuid() {
        return hsuid;
    }

    /**
     * 设置所属病房ID
     *
     * @param hsuid 所属病房ID
     */
    public void setHsuid(String hsuid) {
        this.hsuid = hsuid == null ? null : hsuid.trim();
    }

    /**
     * 获取机构标识
     *
     * @return ORGUID - 机构标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构标识
     *
     * @param orguid 机构标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取所属科室标识
     *
     * @return DUID - 所属科室标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置所属科室标识
     *
     * @param duid 所属科室标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
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
     * 获取床号唯一编码[主键]
     *
     * @return BED_ID - 床号唯一编码[主键]
     */
    public String getBedId() {
        return bedId;
    }

    /**
     * 设置床号唯一编码[主键]
     *
     * @param bedId 床号唯一编码[主键]
     */
    public void setBedId(String bedId) {
        this.bedId = bedId == null ? null : bedId.trim();
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
     * 获取所属科室编码 ORG_DEPT
     *
     * @return DEPT_CODE - 所属科室编码 ORG_DEPT
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置所属科室编码 ORG_DEPT
     *
     * @param deptCode 所属科室编码 ORG_DEPT
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取所属房间
     *
     * @return WARD - 所属房间
     */
    public String getWard() {
        return ward;
    }

    /**
     * 设置所属房间
     *
     * @param ward 所属房间
     */
    public void setWard(String ward) {
        this.ward = ward == null ? null : ward.trim();
    }

    /**
     * 获取床位编号
     *
     * @return BED_CODE - 床位编号
     */
    public String getBedCode() {
        return bedCode;
    }

    /**
     * 设置床位编号
     *
     * @param bedCode 床位编号
     */
    public void setBedCode(String bedCode) {
        this.bedCode = bedCode == null ? null : bedCode.trim();
    }

    /**
     * 获取床位名称
     *
     * @return BED_NEAM - 床位名称
     */
    public String getBedNeam() {
        return bedNeam;
    }

    /**
     * 设置床位名称
     *
     * @param bedNeam 床位名称
     */
    public void setBedNeam(String bedNeam) {
        this.bedNeam = bedNeam == null ? null : bedNeam.trim();
    }

    /**
     * 获取管床医生代码
     *
     * @return BED_DOCTOR - 管床医生代码
     */
    public String getBedDoctor() {
        return bedDoctor;
    }

    /**
     * 设置管床医生代码
     *
     * @param bedDoctor 管床医生代码
     */
    public void setBedDoctor(String bedDoctor) {
        this.bedDoctor = bedDoctor == null ? null : bedDoctor.trim();
    }

    /**
     * 获取管床护士代码
     *
     * @return BED_NURSE - 管床护士代码
     */
    public String getBedNurse() {
        return bedNurse;
    }

    /**
     * 设置管床护士代码
     *
     * @param bedNurse 管床护士代码
     */
    public void setBedNurse(String bedNurse) {
        this.bedNurse = bedNurse == null ? null : bedNurse.trim();
    }

    /**
     * 获取管床医生ID
     *
     * @return DOCTOR_ID - 管床医生ID
     */
    public String getDoctorId() {
        return doctorId;
    }

    /**
     * 设置管床医生ID
     *
     * @param doctorId 管床医生ID
     */
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    /**
     * 获取管床护士ID
     *
     * @return NURSE_ID - 管床护士ID
     */
    public String getNurseId() {
        return nurseId;
    }

    /**
     * 设置管床护士ID
     *
     * @param nurseId 管床护士ID
     */
    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
    }

    /**
     * 获取床位使用标志
     *
     * @return BED_MAKE - 床位使用标志
     */
    public String getBedMake() {
        return bedMake;
    }

    /**
     * 设置床位使用标志
     *
     * @param bedMake 床位使用标志
     */
    public void setBedMake(String bedMake) {
        this.bedMake = bedMake == null ? null : bedMake.trim();
    }

    /**
     * 获取加床标志
     *
     * @return BED_EXTRA - 加床标志
     */
    public String getBedExtra() {
        return bedExtra;
    }

    /**
     * 设置加床标志
     *
     * @param bedExtra 加床标志
     */
    public void setBedExtra(String bedExtra) {
        this.bedExtra = bedExtra == null ? null : bedExtra.trim();
    }

    /**
     * 获取床位分类
     *
     * @return BED_TYPE - 床位分类
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * 设置床位分类
     *
     * @param bedType 床位分类
     */
    public void setBedType(String bedType) {
        this.bedType = bedType == null ? null : bedType.trim();
    }

    /**
     * 获取床位费
     *
     * @return BED_FEE - 床位费
     */
    public String getBedFee() {
        return bedFee;
    }

    /**
     * 设置床位费
     *
     * @param bedFee 床位费
     */
    public void setBedFee(String bedFee) {
        this.bedFee = bedFee == null ? null : bedFee.trim();
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
     * 获取是否优质
     *
     * @return IS_HQUALITY - 是否优质
     */
    public Long getIsHquality() {
        return isHquality;
    }

    /**
     * 设置是否优质
     *
     * @param isHquality 是否优质
     */
    public void setIsHquality(Long isHquality) {
        this.isHquality = isHquality;
    }
}