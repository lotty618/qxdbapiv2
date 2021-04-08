package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EHR_INSPECTION_REPORT_IMAGE")
public class EhrInspectionReportImage {
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
     * 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Id
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 图片ID[主键]
     */
    @Column(name = "IMAGE_ID")
    private String imageId;

    /**
     * 图片存放全路径（图片存放全路径）
     */
    @Column(name = "IMAGE_SAVE_PATH")
    private String imageSavePath;

    /**
     * 图片
     */
    @Column(name = "IMAGE")
    private String image;

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
     * 访问图片地址所需要使用的用户名
     */
    @Column(name = "REMOTEUSER")
    private String remoteuser;

    /**
     * 访问图片地址所需要使用的密码
     */
    @Column(name = "REMOTEPWD")
    private String remotepwd;

    /**
     * 图片访问方式：LAN、FTP、QR
     */
    @Column(name = "PATH_TYPE")
    private String pathType;

    /**
     * 图片访问端口(使用FTP、QR访问时需要访问的端口)
     */
    @Column(name = "PATH_PORT")
    private String pathPort;

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
     * 图片在报告中显示标志（控制图片是否在检查报告中显示）
     */
    @Column(name = "REPORT_DISPLAY")
    private String reportDisplay;

    /**
     * 报告中图片显示顺序
     */
    @Column(name = "DISPLAY_DESC")
    private String displayDesc;

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
     * 获取检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @return REPORT_FORM_NO - 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public String getReportFormNo() {
        return reportFormNo;
    }

    /**
     * 设置检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     *
     * @param reportFormNo 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    public void setReportFormNo(String reportFormNo) {
        this.reportFormNo = reportFormNo == null ? null : reportFormNo.trim();
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
     * 获取图片ID[主键]
     *
     * @return IMAGE_ID - 图片ID[主键]
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 设置图片ID[主键]
     *
     * @param imageId 图片ID[主键]
     */
    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
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
     * 获取图片
     *
     * @return IMAGE - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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
     * 获取访问图片地址所需要使用的用户名
     *
     * @return REMOTEUSER - 访问图片地址所需要使用的用户名
     */
    public String getRemoteuser() {
        return remoteuser;
    }

    /**
     * 设置访问图片地址所需要使用的用户名
     *
     * @param remoteuser 访问图片地址所需要使用的用户名
     */
    public void setRemoteuser(String remoteuser) {
        this.remoteuser = remoteuser == null ? null : remoteuser.trim();
    }

    /**
     * 获取访问图片地址所需要使用的密码
     *
     * @return REMOTEPWD - 访问图片地址所需要使用的密码
     */
    public String getRemotepwd() {
        return remotepwd;
    }

    /**
     * 设置访问图片地址所需要使用的密码
     *
     * @param remotepwd 访问图片地址所需要使用的密码
     */
    public void setRemotepwd(String remotepwd) {
        this.remotepwd = remotepwd == null ? null : remotepwd.trim();
    }

    /**
     * 获取图片访问方式：LAN、FTP、QR
     *
     * @return PATH_TYPE - 图片访问方式：LAN、FTP、QR
     */
    public String getPathType() {
        return pathType;
    }

    /**
     * 设置图片访问方式：LAN、FTP、QR
     *
     * @param pathType 图片访问方式：LAN、FTP、QR
     */
    public void setPathType(String pathType) {
        this.pathType = pathType == null ? null : pathType.trim();
    }

    /**
     * 获取图片访问端口(使用FTP、QR访问时需要访问的端口)
     *
     * @return PATH_PORT - 图片访问端口(使用FTP、QR访问时需要访问的端口)
     */
    public String getPathPort() {
        return pathPort;
    }

    /**
     * 设置图片访问端口(使用FTP、QR访问时需要访问的端口)
     *
     * @param pathPort 图片访问端口(使用FTP、QR访问时需要访问的端口)
     */
    public void setPathPort(String pathPort) {
        this.pathPort = pathPort == null ? null : pathPort.trim();
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
     * 获取图片在报告中显示标志（控制图片是否在检查报告中显示）
     *
     * @return REPORT_DISPLAY - 图片在报告中显示标志（控制图片是否在检查报告中显示）
     */
    public String getReportDisplay() {
        return reportDisplay;
    }

    /**
     * 设置图片在报告中显示标志（控制图片是否在检查报告中显示）
     *
     * @param reportDisplay 图片在报告中显示标志（控制图片是否在检查报告中显示）
     */
    public void setReportDisplay(String reportDisplay) {
        this.reportDisplay = reportDisplay == null ? null : reportDisplay.trim();
    }

    /**
     * 获取报告中图片显示顺序
     *
     * @return DISPLAY_DESC - 报告中图片显示顺序
     */
    public String getDisplayDesc() {
        return displayDesc;
    }

    /**
     * 设置报告中图片显示顺序
     *
     * @param displayDesc 报告中图片显示顺序
     */
    public void setDisplayDesc(String displayDesc) {
        this.displayDesc = displayDesc == null ? null : displayDesc.trim();
    }
}