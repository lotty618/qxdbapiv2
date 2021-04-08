package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_T_EMR_ORIGINAL_TEMP_TEST")
public class QxTEmrOriginalTempTest {
    @Column(name = "QID")
    private BigDecimal qid;

    @Column(name = "PATIENT_ID")
    private String patientId;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "INPATIENT_FORM_NO")
    private String inpatientFormNo;

    @Column(name = "REPRESENTOR_RELATION_CODE")
    private String representorRelationCode;

    @Column(name = "REPRESENTOR_RELATION_CN")
    private String representorRelationCn;

    @Column(name = "REPRESENTOR_NAME")
    private String representorName;

    @Column(name = "REPRESENT_DATE")
    private String representDate;

    @Column(name = "AUTHOR_ID")
    private String authorId;

    @Column(name = "AUTHOR_NAME")
    private String authorName;

    @Column(name = "AUTHOR_DATE")
    private String authorDate;

    @Column(name = "AUTHENTICATOR_ID")
    private String authenticatorId;

    @Column(name = "AUTHENTICATOR_NAME")
    private String authenticatorName;

    @Column(name = "AUTHENTICATOR_DATE")
    private String authenticatorDate;

    @Column(name = "IN_CHARGE_DOCTOR_ID")
    private String inChargeDoctorId;

    @Column(name = "IN_CHARGE_DOCTOR_NAME")
    private String inChargeDoctorName;

    @Column(name = "IN_CHARGE_DOCTOR_DATE")
    private String inChargeDoctorDate;

    @Column(name = "INRECORD_TYPE_CODE")
    private String inrecordTypeCode;

    @Column(name = "INRECORD_TYPE_CN")
    private String inrecordTypeCn;

    @Column(name = "ADMISSION_DATE")
    private String admissionDate;

    @Column(name = "DEATH_DATE")
    private String deathDate;

    @Column(name = "IN_DEPT_CODE")
    private String inDeptCode;

    @Column(name = "IN_DEPT_NAME")
    private String inDeptName;

    @Column(name = "BED_NO")
    private String bedNo;

    @Column(name = "CHIEF_COMPLAINTS")
    private String chiefComplaints;

    @Column(name = "CURRENT_DISEASE")
    private String currentDisease;

    @Column(name = "DISEASE_HISTORY")
    private String diseaseHistory;

    @Column(name = "PERSONAL_HISTORY")
    private String personalHistory;

    @Column(name = "MARRIAGE_HISTORY")
    private String marriageHistory;

    @Column(name = "MENSES_HISTORY")
    private String mensesHistory;

    @Column(name = "FAMILY_HISTORY")
    private String familyHistory;

    @Column(name = "SPEC_SITUATION")
    private String specSituation;

    @Column(name = "ASSIST_EXAM_RESULT")
    private String assistExamResult;

    @Column(name = "FIRST_DIAGNOSIS_CODE")
    private String firstDiagnosisCode;

    @Column(name = "FIRST_DIAGNOSIS_CN")
    private String firstDiagnosisCn;

    @Column(name = "IN_DIAGNOSIS_CODE")
    private String inDiagnosisCode;

    @Column(name = "IN_DIAGNOSIS_CN")
    private String inDiagnosisCn;

    @Column(name = "IN_CONDITION_DESC")
    private String inConditionDesc;

    @Column(name = "TREAT_RESCUE_COURSE")
    private String treatRescueCourse;

    @Column(name = "OUT_CONDITION")
    private String outCondition;

    @Column(name = "OUT_DIAGNOSIS_CODE")
    private String outDiagnosisCode;

    @Column(name = "OUT_DIAGNOSIS_CN")
    private String outDiagnosisCn;

    @Column(name = "OUT_ORDER")
    private String outOrder;

    @Column(name = "TREATMENT_RESULT_CODE")
    private String treatmentResultCode;

    @Column(name = "TREATMENT_RESULT_CN")
    private String treatmentResultCn;

    @Column(name = "DEATH_DIAGNOSIS_CODE")
    private String deathDiagnosisCode;

    @Column(name = "DEATH_DIAGNOSIS_CN")
    private String deathDiagnosisCn;

    @Column(name = "DEATH_CAUSE")
    private String deathCause;

    @Column(name = "RELIABLE_STATEMENT_MARK")
    private String reliableStatementMark;

    @Column(name = "GENERAL_HEALTH_MARK")
    private String generalHealthMark;

    @Column(name = "INFECTIOUS_MARK")
    private String infectiousMark;

    @Column(name = "INFECTION_HISTORY")
    private String infectionHistory;

    @Column(name = "VACCINATE_HISTORY")
    private String vaccinateHistory;

    @Column(name = "OPERATION_HISTORY")
    private String operationHistory;

    @Column(name = "BLOOD_HISTORY")
    private String bloodHistory;

    @Column(name = "ALLERGY_HISTORY")
    private String allergyHistory;

    @Column(name = "TCM_OBSERVE")
    private String tcmObserve;

    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    @Column(name = "ACCEPT_PHYSICIAN")
    private String acceptPhysician;

    @Column(name = "RESIDENT_DOCTOR_NAME")
    private String residentDoctorName;

    @Column(name = "NURSING_DEPT_CODE")
    private String nursingDeptCode;

    @Column(name = "NURSING_DEPT_NAME")
    private String nursingDeptName;

    @Column(name = "NURSE_ID")
    private String nurseId;

    @Column(name = "NURSE_NAME")
    private String nurseName;

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

    @Column(name = "EMRUID")
    private String emruid;

    @Column(name = "EMR_CONTENT_TEXT")
    private String emrContentText;

    @Column(name = "EMR_CONTENT_BLOB")
    private byte[] emrContentBlob;

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
     * @return REPRESENTOR_RELATION_CODE
     */
    public String getRepresentorRelationCode() {
        return representorRelationCode;
    }

    /**
     * @param representorRelationCode
     */
    public void setRepresentorRelationCode(String representorRelationCode) {
        this.representorRelationCode = representorRelationCode == null ? null : representorRelationCode.trim();
    }

    /**
     * @return REPRESENTOR_RELATION_CN
     */
    public String getRepresentorRelationCn() {
        return representorRelationCn;
    }

    /**
     * @param representorRelationCn
     */
    public void setRepresentorRelationCn(String representorRelationCn) {
        this.representorRelationCn = representorRelationCn == null ? null : representorRelationCn.trim();
    }

    /**
     * @return REPRESENTOR_NAME
     */
    public String getRepresentorName() {
        return representorName;
    }

    /**
     * @param representorName
     */
    public void setRepresentorName(String representorName) {
        this.representorName = representorName == null ? null : representorName.trim();
    }

    /**
     * @return REPRESENT_DATE
     */
    public String getRepresentDate() {
        return representDate;
    }

    /**
     * @param representDate
     */
    public void setRepresentDate(String representDate) {
        this.representDate = representDate == null ? null : representDate.trim();
    }

    /**
     * @return AUTHOR_ID
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    /**
     * @return AUTHOR_NAME
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * @return AUTHOR_DATE
     */
    public String getAuthorDate() {
        return authorDate;
    }

    /**
     * @param authorDate
     */
    public void setAuthorDate(String authorDate) {
        this.authorDate = authorDate == null ? null : authorDate.trim();
    }

    /**
     * @return AUTHENTICATOR_ID
     */
    public String getAuthenticatorId() {
        return authenticatorId;
    }

    /**
     * @param authenticatorId
     */
    public void setAuthenticatorId(String authenticatorId) {
        this.authenticatorId = authenticatorId == null ? null : authenticatorId.trim();
    }

    /**
     * @return AUTHENTICATOR_NAME
     */
    public String getAuthenticatorName() {
        return authenticatorName;
    }

    /**
     * @param authenticatorName
     */
    public void setAuthenticatorName(String authenticatorName) {
        this.authenticatorName = authenticatorName == null ? null : authenticatorName.trim();
    }

    /**
     * @return AUTHENTICATOR_DATE
     */
    public String getAuthenticatorDate() {
        return authenticatorDate;
    }

    /**
     * @param authenticatorDate
     */
    public void setAuthenticatorDate(String authenticatorDate) {
        this.authenticatorDate = authenticatorDate == null ? null : authenticatorDate.trim();
    }

    /**
     * @return IN_CHARGE_DOCTOR_ID
     */
    public String getInChargeDoctorId() {
        return inChargeDoctorId;
    }

    /**
     * @param inChargeDoctorId
     */
    public void setInChargeDoctorId(String inChargeDoctorId) {
        this.inChargeDoctorId = inChargeDoctorId == null ? null : inChargeDoctorId.trim();
    }

    /**
     * @return IN_CHARGE_DOCTOR_NAME
     */
    public String getInChargeDoctorName() {
        return inChargeDoctorName;
    }

    /**
     * @param inChargeDoctorName
     */
    public void setInChargeDoctorName(String inChargeDoctorName) {
        this.inChargeDoctorName = inChargeDoctorName == null ? null : inChargeDoctorName.trim();
    }

    /**
     * @return IN_CHARGE_DOCTOR_DATE
     */
    public String getInChargeDoctorDate() {
        return inChargeDoctorDate;
    }

    /**
     * @param inChargeDoctorDate
     */
    public void setInChargeDoctorDate(String inChargeDoctorDate) {
        this.inChargeDoctorDate = inChargeDoctorDate == null ? null : inChargeDoctorDate.trim();
    }

    /**
     * @return INRECORD_TYPE_CODE
     */
    public String getInrecordTypeCode() {
        return inrecordTypeCode;
    }

    /**
     * @param inrecordTypeCode
     */
    public void setInrecordTypeCode(String inrecordTypeCode) {
        this.inrecordTypeCode = inrecordTypeCode == null ? null : inrecordTypeCode.trim();
    }

    /**
     * @return INRECORD_TYPE_CN
     */
    public String getInrecordTypeCn() {
        return inrecordTypeCn;
    }

    /**
     * @param inrecordTypeCn
     */
    public void setInrecordTypeCn(String inrecordTypeCn) {
        this.inrecordTypeCn = inrecordTypeCn == null ? null : inrecordTypeCn.trim();
    }

    /**
     * @return ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * @param admissionDate
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    /**
     * @return DEATH_DATE
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * @param deathDate
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate == null ? null : deathDate.trim();
    }

    /**
     * @return IN_DEPT_CODE
     */
    public String getInDeptCode() {
        return inDeptCode;
    }

    /**
     * @param inDeptCode
     */
    public void setInDeptCode(String inDeptCode) {
        this.inDeptCode = inDeptCode == null ? null : inDeptCode.trim();
    }

    /**
     * @return IN_DEPT_NAME
     */
    public String getInDeptName() {
        return inDeptName;
    }

    /**
     * @param inDeptName
     */
    public void setInDeptName(String inDeptName) {
        this.inDeptName = inDeptName == null ? null : inDeptName.trim();
    }

    /**
     * @return BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * @param bedNo
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * @return CHIEF_COMPLAINTS
     */
    public String getChiefComplaints() {
        return chiefComplaints;
    }

    /**
     * @param chiefComplaints
     */
    public void setChiefComplaints(String chiefComplaints) {
        this.chiefComplaints = chiefComplaints == null ? null : chiefComplaints.trim();
    }

    /**
     * @return CURRENT_DISEASE
     */
    public String getCurrentDisease() {
        return currentDisease;
    }

    /**
     * @param currentDisease
     */
    public void setCurrentDisease(String currentDisease) {
        this.currentDisease = currentDisease == null ? null : currentDisease.trim();
    }

    /**
     * @return DISEASE_HISTORY
     */
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    /**
     * @param diseaseHistory
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    /**
     * @return PERSONAL_HISTORY
     */
    public String getPersonalHistory() {
        return personalHistory;
    }

    /**
     * @param personalHistory
     */
    public void setPersonalHistory(String personalHistory) {
        this.personalHistory = personalHistory == null ? null : personalHistory.trim();
    }

    /**
     * @return MARRIAGE_HISTORY
     */
    public String getMarriageHistory() {
        return marriageHistory;
    }

    /**
     * @param marriageHistory
     */
    public void setMarriageHistory(String marriageHistory) {
        this.marriageHistory = marriageHistory == null ? null : marriageHistory.trim();
    }

    /**
     * @return MENSES_HISTORY
     */
    public String getMensesHistory() {
        return mensesHistory;
    }

    /**
     * @param mensesHistory
     */
    public void setMensesHistory(String mensesHistory) {
        this.mensesHistory = mensesHistory == null ? null : mensesHistory.trim();
    }

    /**
     * @return FAMILY_HISTORY
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * @param familyHistory
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory == null ? null : familyHistory.trim();
    }

    /**
     * @return SPEC_SITUATION
     */
    public String getSpecSituation() {
        return specSituation;
    }

    /**
     * @param specSituation
     */
    public void setSpecSituation(String specSituation) {
        this.specSituation = specSituation == null ? null : specSituation.trim();
    }

    /**
     * @return ASSIST_EXAM_RESULT
     */
    public String getAssistExamResult() {
        return assistExamResult;
    }

    /**
     * @param assistExamResult
     */
    public void setAssistExamResult(String assistExamResult) {
        this.assistExamResult = assistExamResult == null ? null : assistExamResult.trim();
    }

    /**
     * @return FIRST_DIAGNOSIS_CODE
     */
    public String getFirstDiagnosisCode() {
        return firstDiagnosisCode;
    }

    /**
     * @param firstDiagnosisCode
     */
    public void setFirstDiagnosisCode(String firstDiagnosisCode) {
        this.firstDiagnosisCode = firstDiagnosisCode == null ? null : firstDiagnosisCode.trim();
    }

    /**
     * @return FIRST_DIAGNOSIS_CN
     */
    public String getFirstDiagnosisCn() {
        return firstDiagnosisCn;
    }

    /**
     * @param firstDiagnosisCn
     */
    public void setFirstDiagnosisCn(String firstDiagnosisCn) {
        this.firstDiagnosisCn = firstDiagnosisCn == null ? null : firstDiagnosisCn.trim();
    }

    /**
     * @return IN_DIAGNOSIS_CODE
     */
    public String getInDiagnosisCode() {
        return inDiagnosisCode;
    }

    /**
     * @param inDiagnosisCode
     */
    public void setInDiagnosisCode(String inDiagnosisCode) {
        this.inDiagnosisCode = inDiagnosisCode == null ? null : inDiagnosisCode.trim();
    }

    /**
     * @return IN_DIAGNOSIS_CN
     */
    public String getInDiagnosisCn() {
        return inDiagnosisCn;
    }

    /**
     * @param inDiagnosisCn
     */
    public void setInDiagnosisCn(String inDiagnosisCn) {
        this.inDiagnosisCn = inDiagnosisCn == null ? null : inDiagnosisCn.trim();
    }

    /**
     * @return IN_CONDITION_DESC
     */
    public String getInConditionDesc() {
        return inConditionDesc;
    }

    /**
     * @param inConditionDesc
     */
    public void setInConditionDesc(String inConditionDesc) {
        this.inConditionDesc = inConditionDesc == null ? null : inConditionDesc.trim();
    }

    /**
     * @return TREAT_RESCUE_COURSE
     */
    public String getTreatRescueCourse() {
        return treatRescueCourse;
    }

    /**
     * @param treatRescueCourse
     */
    public void setTreatRescueCourse(String treatRescueCourse) {
        this.treatRescueCourse = treatRescueCourse == null ? null : treatRescueCourse.trim();
    }

    /**
     * @return OUT_CONDITION
     */
    public String getOutCondition() {
        return outCondition;
    }

    /**
     * @param outCondition
     */
    public void setOutCondition(String outCondition) {
        this.outCondition = outCondition == null ? null : outCondition.trim();
    }

    /**
     * @return OUT_DIAGNOSIS_CODE
     */
    public String getOutDiagnosisCode() {
        return outDiagnosisCode;
    }

    /**
     * @param outDiagnosisCode
     */
    public void setOutDiagnosisCode(String outDiagnosisCode) {
        this.outDiagnosisCode = outDiagnosisCode == null ? null : outDiagnosisCode.trim();
    }

    /**
     * @return OUT_DIAGNOSIS_CN
     */
    public String getOutDiagnosisCn() {
        return outDiagnosisCn;
    }

    /**
     * @param outDiagnosisCn
     */
    public void setOutDiagnosisCn(String outDiagnosisCn) {
        this.outDiagnosisCn = outDiagnosisCn == null ? null : outDiagnosisCn.trim();
    }

    /**
     * @return OUT_ORDER
     */
    public String getOutOrder() {
        return outOrder;
    }

    /**
     * @param outOrder
     */
    public void setOutOrder(String outOrder) {
        this.outOrder = outOrder == null ? null : outOrder.trim();
    }

    /**
     * @return TREATMENT_RESULT_CODE
     */
    public String getTreatmentResultCode() {
        return treatmentResultCode;
    }

    /**
     * @param treatmentResultCode
     */
    public void setTreatmentResultCode(String treatmentResultCode) {
        this.treatmentResultCode = treatmentResultCode == null ? null : treatmentResultCode.trim();
    }

    /**
     * @return TREATMENT_RESULT_CN
     */
    public String getTreatmentResultCn() {
        return treatmentResultCn;
    }

    /**
     * @param treatmentResultCn
     */
    public void setTreatmentResultCn(String treatmentResultCn) {
        this.treatmentResultCn = treatmentResultCn == null ? null : treatmentResultCn.trim();
    }

    /**
     * @return DEATH_DIAGNOSIS_CODE
     */
    public String getDeathDiagnosisCode() {
        return deathDiagnosisCode;
    }

    /**
     * @param deathDiagnosisCode
     */
    public void setDeathDiagnosisCode(String deathDiagnosisCode) {
        this.deathDiagnosisCode = deathDiagnosisCode == null ? null : deathDiagnosisCode.trim();
    }

    /**
     * @return DEATH_DIAGNOSIS_CN
     */
    public String getDeathDiagnosisCn() {
        return deathDiagnosisCn;
    }

    /**
     * @param deathDiagnosisCn
     */
    public void setDeathDiagnosisCn(String deathDiagnosisCn) {
        this.deathDiagnosisCn = deathDiagnosisCn == null ? null : deathDiagnosisCn.trim();
    }

    /**
     * @return DEATH_CAUSE
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * @param deathCause
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * @return RELIABLE_STATEMENT_MARK
     */
    public String getReliableStatementMark() {
        return reliableStatementMark;
    }

    /**
     * @param reliableStatementMark
     */
    public void setReliableStatementMark(String reliableStatementMark) {
        this.reliableStatementMark = reliableStatementMark == null ? null : reliableStatementMark.trim();
    }

    /**
     * @return GENERAL_HEALTH_MARK
     */
    public String getGeneralHealthMark() {
        return generalHealthMark;
    }

    /**
     * @param generalHealthMark
     */
    public void setGeneralHealthMark(String generalHealthMark) {
        this.generalHealthMark = generalHealthMark == null ? null : generalHealthMark.trim();
    }

    /**
     * @return INFECTIOUS_MARK
     */
    public String getInfectiousMark() {
        return infectiousMark;
    }

    /**
     * @param infectiousMark
     */
    public void setInfectiousMark(String infectiousMark) {
        this.infectiousMark = infectiousMark == null ? null : infectiousMark.trim();
    }

    /**
     * @return INFECTION_HISTORY
     */
    public String getInfectionHistory() {
        return infectionHistory;
    }

    /**
     * @param infectionHistory
     */
    public void setInfectionHistory(String infectionHistory) {
        this.infectionHistory = infectionHistory == null ? null : infectionHistory.trim();
    }

    /**
     * @return VACCINATE_HISTORY
     */
    public String getVaccinateHistory() {
        return vaccinateHistory;
    }

    /**
     * @param vaccinateHistory
     */
    public void setVaccinateHistory(String vaccinateHistory) {
        this.vaccinateHistory = vaccinateHistory == null ? null : vaccinateHistory.trim();
    }

    /**
     * @return OPERATION_HISTORY
     */
    public String getOperationHistory() {
        return operationHistory;
    }

    /**
     * @param operationHistory
     */
    public void setOperationHistory(String operationHistory) {
        this.operationHistory = operationHistory == null ? null : operationHistory.trim();
    }

    /**
     * @return BLOOD_HISTORY
     */
    public String getBloodHistory() {
        return bloodHistory;
    }

    /**
     * @param bloodHistory
     */
    public void setBloodHistory(String bloodHistory) {
        this.bloodHistory = bloodHistory == null ? null : bloodHistory.trim();
    }

    /**
     * @return ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * @param allergyHistory
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
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
     * @return THERAPEUTIC_PRINCIPLES
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * @param therapeuticPrinciples
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
    }

    /**
     * @return ACCEPT_PHYSICIAN
     */
    public String getAcceptPhysician() {
        return acceptPhysician;
    }

    /**
     * @param acceptPhysician
     */
    public void setAcceptPhysician(String acceptPhysician) {
        this.acceptPhysician = acceptPhysician == null ? null : acceptPhysician.trim();
    }

    /**
     * @return RESIDENT_DOCTOR_NAME
     */
    public String getResidentDoctorName() {
        return residentDoctorName;
    }

    /**
     * @param residentDoctorName
     */
    public void setResidentDoctorName(String residentDoctorName) {
        this.residentDoctorName = residentDoctorName == null ? null : residentDoctorName.trim();
    }

    /**
     * @return NURSING_DEPT_CODE
     */
    public String getNursingDeptCode() {
        return nursingDeptCode;
    }

    /**
     * @param nursingDeptCode
     */
    public void setNursingDeptCode(String nursingDeptCode) {
        this.nursingDeptCode = nursingDeptCode == null ? null : nursingDeptCode.trim();
    }

    /**
     * @return NURSING_DEPT_NAME
     */
    public String getNursingDeptName() {
        return nursingDeptName;
    }

    /**
     * @param nursingDeptName
     */
    public void setNursingDeptName(String nursingDeptName) {
        this.nursingDeptName = nursingDeptName == null ? null : nursingDeptName.trim();
    }

    /**
     * @return NURSE_ID
     */
    public String getNurseId() {
        return nurseId;
    }

    /**
     * @param nurseId
     */
    public void setNurseId(String nurseId) {
        this.nurseId = nurseId == null ? null : nurseId.trim();
    }

    /**
     * @return NURSE_NAME
     */
    public String getNurseName() {
        return nurseName;
    }

    /**
     * @param nurseName
     */
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName == null ? null : nurseName.trim();
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
     * @return EMRUID
     */
    public String getEmruid() {
        return emruid;
    }

    /**
     * @param emruid
     */
    public void setEmruid(String emruid) {
        this.emruid = emruid == null ? null : emruid.trim();
    }

    /**
     * @return EMR_CONTENT_TEXT
     */
    public String getEmrContentText() {
        return emrContentText;
    }

    /**
     * @param emrContentText
     */
    public void setEmrContentText(String emrContentText) {
        this.emrContentText = emrContentText == null ? null : emrContentText.trim();
    }

    /**
     * @return EMR_CONTENT_BLOB
     */
    public byte[] getEmrContentBlob() {
        return emrContentBlob;
    }

    /**
     * @param emrContentBlob
     */
    public void setEmrContentBlob(byte[] emrContentBlob) {
        this.emrContentBlob = emrContentBlob;
    }
}