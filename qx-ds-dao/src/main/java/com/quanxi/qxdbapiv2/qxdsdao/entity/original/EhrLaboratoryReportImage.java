package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EHR_LABORATORY_REPORT_IMAGE")
public class EhrLaboratoryReportImage {
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
     * 检验报告单号[主键]约束引用LABORATORY_REPORT的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 子项序号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "SERIAL_NO")
    private String serialNo;

    /**
     * 子项的编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    @Column(name = "CLASS_CODE")
    private String classCode;

    /**
     * 子项的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * 图片存放全路径（图片存放全路径）
     */
    @Column(name = "IMAGE_SAVE_PATH")
    private String imageSavePath;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

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
     * 图片（图片）
     */
    @Column(name = "IMAGE")
    private byte[] image;

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
     * 获取检验报告单号[主键]约束引用LABORATORY_REPORT的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 检验报告单号[主键]约束引用LABORATORY_REPORT的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置检验报告单号[主键]约束引用LABORATORY_REPORT的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 检验报告单号[主键]约束引用LABORATORY_REPORT的REPORT_FORM_NO（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
    }

    /**
     * 获取子项序号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return SERIAL_NO - 子项序号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置子项序号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param serialNo 子项序号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * 获取子项的编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @return CLASS_CODE - 子项的编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * 设置子项的编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @param classCode 子项的编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    /**
     * 获取子项的名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @return CLASS_NAME - 子项的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置子项的名称（受检者检查/检验项目在特定编码体系中的名称）
     *
     * @param className 子项的名称（受检者检查/检验项目在特定编码体系中的名称）
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * 获取图片存放全路径（图片存放全路径）
     *
     * @return IMAGE_SAVE_PATH - 图片存放全路径（图片存放全路径）
     */
    public String getImageSavePath() {
        return imageSavePath;
    }

    /**
     * 设置图片存放全路径（图片存放全路径）
     *
     * @param imageSavePath 图片存放全路径（图片存放全路径）
     */
    public void setImageSavePath(String imageSavePath) {
        this.imageSavePath = imageSavePath == null ? null : imageSavePath.trim();
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

    /**
     * 获取图片（图片）
     *
     * @return IMAGE - 图片（图片）
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * 设置图片（图片）
     *
     * @param image 图片（图片）
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}