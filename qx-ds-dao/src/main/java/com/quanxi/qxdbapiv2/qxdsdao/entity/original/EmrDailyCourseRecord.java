package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "EMR_DAILY_COURSE_RECORD")
public class EmrDailyCourseRecord {
    @Column(name = "QID")
    private BigDecimal qid;

    @Column(name = "PATIENT_ID")
    private String patientId;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    @Column(name = "DAILY_COURSE_ID")
    private String dailyCourseId;

    @Column(name = "CASE_NO")
    private String caseNo;

    @Column(name = "IN_HOSPITAL_TIMES")
    private Integer inHospitalTimes;

    @Column(name = "OPERATION_RECORD_DATE")
    private String operationRecordDate;

    @Column(name = "HOS_DURATION")
    private String hosDuration;

    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    @Column(name = "SYNDROME_DIFFER_DESC")
    private String syndromeDifferDesc;

    @Column(name = "TITLE_CODE")
    private String titleCode;

    @Column(name = "TITLE_NAME")
    private String titleName;

    @Column(name = "DOCTOR_SIGNATURE")
    private String doctorSignature;

    @Column(name = "DOCTOR_SIGNATURE_DATE")
    private String doctorSignatureDate;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "STATUS_CN")
    private String statusCn;

    @Column(name = "CANCEL_TIME")
    private String cancelTime;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "CREATE_TIME")
    private String createTime;

    @Column(name = "MODIFIER")
    private String modifier;

    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

    @Column(name = "SYSUP_TIME")
    private String sysupTime;

    @Column(name = "SYSCR_TIME")
    private String syscrTime;

    @Column(name = "EFFECTIVE")
    private String effective;

    @Column(name = "TEMPLATE_TYPE")
    private String templateType;

    @Column(name = "TEMPLATE_TYPE_CN")
    private String templateTypeCn;

    @Column(name = "EMR_TITLE")
    private String emrTitle;

    @Column(name = "EMR_TEMPLATE_CODE")
    private String emrTemplateCode;

    @Column(name = "EMR_CONTENT")
    private byte[] emrContent;

    @Column(name = "EMR_CONTENT_CLOB")
    private String emrContentClob;

    /**
     * @return QID
     */
    public BigDecimal getQid() {
        return qid;
    }

    /**
     * @param qid
     */
    public void setQid(BigDecimal qid) {
        this.qid = qid;
    }

    /**
     * @return PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * @return INPATIENT_FORM_NO
     */
    public String getInpatientFormNo() {
        return inpatientFormNo;
    }

    /**
     * @param inpatientFormNo
     */
    public void setInpatientFormNo(String inpatientFormNo) {
        this.inpatientFormNo = inpatientFormNo == null ? null : inpatientFormNo.trim();
    }

    /**
     * @return DAILY_COURSE_ID
     */
    public String getDailyCourseId() {
        return dailyCourseId;
    }

    /**
     * @param dailyCourseId
     */
    public void setDailyCourseId(String dailyCourseId) {
        this.dailyCourseId = dailyCourseId == null ? null : dailyCourseId.trim();
    }

    /**
     * @return CASE_NO
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * @param caseNo
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * @return IN_HOSPITAL_TIMES
     */
    public Integer getInHospitalTimes() {
        return inHospitalTimes;
    }

    /**
     * @param inHospitalTimes
     */
    public void setInHospitalTimes(Integer inHospitalTimes) {
        this.inHospitalTimes = inHospitalTimes;
    }

    /**
     * @return OPERATION_RECORD_DATE
     */
    public String getOperationRecordDate() {
        return operationRecordDate;
    }

    /**
     * @param operationRecordDate
     */
    public void setOperationRecordDate(String operationRecordDate) {
        this.operationRecordDate = operationRecordDate == null ? null : operationRecordDate.trim();
    }

    /**
     * @return HOS_DURATION
     */
    public String getHosDuration() {
        return hosDuration;
    }

    /**
     * @param hosDuration
     */
    public void setHosDuration(String hosDuration) {
        this.hosDuration = hosDuration == null ? null : hosDuration.trim();
    }

    /**
     * @return TCM_OBSERVE
     */
    public String getTcmObserve() {
        return tcmObserve;
    }

    /**
     * @param tcmObserve
     */
    public void setTcmObserve(String tcmObserve) {
        this.tcmObserve = tcmObserve == null ? null : tcmObserve.trim();
    }

    /**
     * @return SYNDROME_DIFFER_DESC
     */
    public String getSyndromeDifferDesc() {
        return syndromeDifferDesc;
    }

    /**
     * @param syndromeDifferDesc
     */
    public void setSyndromeDifferDesc(String syndromeDifferDesc) {
        this.syndromeDifferDesc = syndromeDifferDesc == null ? null : syndromeDifferDesc.trim();
    }

    /**
     * @return TITLE_CODE
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * @param titleCode
     */
    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode == null ? null : titleCode.trim();
    }

    /**
     * @return TITLE_NAME
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * @param titleName
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    /**
     * @return DOCTOR_SIGNATURE
     */
    public String getDoctorSignature() {
        return doctorSignature;
    }

    /**
     * @param doctorSignature
     */
    public void setDoctorSignature(String doctorSignature) {
        this.doctorSignature = doctorSignature == null ? null : doctorSignature.trim();
    }

    /**
     * @return DOCTOR_SIGNATURE_DATE
     */
    public String getDoctorSignatureDate() {
        return doctorSignatureDate;
    }

    /**
     * @param doctorSignatureDate
     */
    public void setDoctorSignatureDate(String doctorSignatureDate) {
        this.doctorSignatureDate = doctorSignatureDate == null ? null : doctorSignatureDate.trim();
    }

    /**
     * @return NOTES
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * @return STATUS_CODE
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * @return STATUS_CN
     */
    public String getStatusCn() {
        return statusCn;
    }

    /**
     * @param statusCn
     */
    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn == null ? null : statusCn.trim();
    }

    /**
     * @return CANCEL_TIME
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * @param cancelTime
     */
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * @return MODIFIER
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * @return MODIFIED_TIME
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * @param modifiedTime
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime == null ? null : modifiedTime.trim();
    }

    /**
     * @return SYSUP_TIME
     */
    public String getSysupTime() {
        return sysupTime;
    }

    /**
     * @param sysupTime
     */
    public void setSysupTime(String sysupTime) {
        this.sysupTime = sysupTime == null ? null : sysupTime.trim();
    }

    /**
     * @return SYSCR_TIME
     */
    public String getSyscrTime() {
        return syscrTime;
    }

    /**
     * @param syscrTime
     */
    public void setSyscrTime(String syscrTime) {
        this.syscrTime = syscrTime == null ? null : syscrTime.trim();
    }

    /**
     * @return EFFECTIVE
     */
    public String getEffective() {
        return effective;
    }

    /**
     * @param effective
     */
    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
    }

    /**
     * @return TEMPLATE_TYPE
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * @param templateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * @return TEMPLATE_TYPE_CN
     */
    public String getTemplateTypeCn() {
        return templateTypeCn;
    }

    /**
     * @param templateTypeCn
     */
    public void setTemplateTypeCn(String templateTypeCn) {
        this.templateTypeCn = templateTypeCn == null ? null : templateTypeCn.trim();
    }

    /**
     * @return EMR_TITLE
     */
    public String getEmrTitle() {
        return emrTitle;
    }

    /**
     * @param emrTitle
     */
    public void setEmrTitle(String emrTitle) {
        this.emrTitle = emrTitle == null ? null : emrTitle.trim();
    }

    /**
     * @return EMR_TEMPLATE_CODE
     */
    public String getEmrTemplateCode() {
        return emrTemplateCode;
    }

    /**
     * @param emrTemplateCode
     */
    public void setEmrTemplateCode(String emrTemplateCode) {
        this.emrTemplateCode = emrTemplateCode == null ? null : emrTemplateCode.trim();
    }

    /**
     * @return EMR_CONTENT
     */
    public byte[] getEmrContent() {
        return emrContent;
    }

    /**
     * @param emrContent
     */
    public void setEmrContent(byte[] emrContent) {
        this.emrContent = emrContent;
    }

    /**
     * @return EMR_CONTENT_CLOB
     */
    public String getEmrContentClob() {
        return emrContentClob;
    }

    /**
     * @param emrContentClob
     */
    public void setEmrContentClob(String emrContentClob) {
        this.emrContentClob = emrContentClob == null ? null : emrContentClob.trim();
    }
}