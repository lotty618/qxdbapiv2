package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_BED")
public class OrgBed {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 床号唯一编码[主键]
     */
    @Id
    @Column(name = "BED_ID")
    private String bedId;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

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
}