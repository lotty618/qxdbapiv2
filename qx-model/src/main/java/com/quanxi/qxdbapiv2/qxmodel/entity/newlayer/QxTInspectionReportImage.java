package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_INSPECTION_REPORT_IMAGE")
public class QxTInspectionReportImage {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 检查图片唯一标识
     */
    @Column(name = "IRIUID")
    private String iriuid;

    /**
     * 检查唯一标识
     */
    @Column(name = "IRUID")
    private String iruid;

    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 患者基本信息ID[主键]约束引用PATIENT的Patient_Id（病人在特定编码体系中的唯一标识码）
     */
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 事件类型[主键]DIR_EVENT_TYPE（患者就诊类型的的分类代码）
     */
    @Column(name = "EVENT_TYPE")
    private String eventType;

    /**
     * 事件类型名称（患者就诊类型的的分类中文名称）
     */
    @Column(name = "EVENT_TYPE_CN")
    private String eventTypeCn;

    /**
     * 本地事件号（门诊号或者住院号）[主键]EVENT_TYPE值为1 时约束引用OUTPATIENT的OUTPAT_FORM_NO; EVENT_TYPE值为2时约束引用INPATIENT_REGIST的INPATIENT_FORM_NO（按照某一特定编码规则赋予个体相关信息记录表单的顺序号 ）
     */
    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 检查报告单号[主键]（按照某一特定编码规则赋予电子申请单的顺序号）
     */
    @Column(name = "REPORT_FORM_NO")
    private String reportFormNo;

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
     * 有效标志,标志数据是否有效 （1、有效 0、无效）
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
     * 获取检查图片唯一标识
     *
     * @return IRIUID - 检查图片唯一标识
     */
    public String getIriuid() {
        return iriuid;
    }

    /**
     * 设置检查图片唯一标识
     *
     * @param iriuid 检查图片唯一标识
     */
    public void setIriuid(String iriuid) {
        this.iriuid = iriuid == null ? null : iriuid.trim();
    }

    /**
     * 获取检查唯一标识
     *
     * @return IRUID - 检查唯一标识
     */
    public String getIruid() {
        return iruid;
    }

    /**
     * 设置检查唯一标识
     *
     * @param iruid 检查唯一标识
     */
    public void setIruid(String iruid) {
        this.iruid = iruid == null ? null : iruid.trim();
    }

    /**
     * 获取自增ID——"新建层"应用到唯一主键
     *
     * @return QID - 自增ID——"新建层"应用到唯一主键
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置自增ID——"新建层"应用到唯一主键
     *
     * @param qid 自增ID——"新建层"应用到唯一主键
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
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
     * 获取有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @return EFFECTIVE - 有效标志,标志数据是否有效 （1、有效 0、无效）
     */
    public String getEffective() {
        return effective;
    }

    /**
     * 设置有效标志,标志数据是否有效 （1、有效 0、无效）
     *
     * @param effective 有效标志,标志数据是否有效 （1、有效 0、无效）
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