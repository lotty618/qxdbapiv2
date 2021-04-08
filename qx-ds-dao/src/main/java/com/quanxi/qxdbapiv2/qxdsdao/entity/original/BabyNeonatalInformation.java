package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "BABY_NEONATAL_INFORMATION")
public class BabyNeonatalInformation {
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
     * 分娩方式[主键]，1顺产 2剖宫产
     */
    @Id
    @Column(name = "DELIVERY_MODE")
    private String deliveryMode;

    /**
     * 分娩记录ID[主键]（当分娩方式为顺产时，取顺产记录ID；当为剖宫产时，取剖宫产记录ID）
     */
    @Id
    @Column(name = "DELIVERY_RECORD_ID")
    private String deliveryRecordId;

    /**
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "CESAREAN_DELIVERY_BABY_ID")
    private String cesareanDeliveryBabyId;

    /**
     * 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    @Column(name = "CASE_NO")
    private String caseNo;

    /**
     * 新生儿性别代码GB/T 2261.1（新生儿生理性别在特定编码体系中的代码）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 新生儿性别中文名称（新生儿生理性别在特定编码体系中的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 新生儿出生体重（g）（新生儿出生后第 1 小时内第 1 次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    @Column(name = "BRITH_WEIGHT")
    private Integer brithWeight;

    /**
     * 新生儿出生身长（cm）（新生儿出生后第 1 小时内身长的测量值，计量单位为cm）
     */
    @Column(name = "BRITH_LENGTH")
    private BigDecimal brithLength;

    /**
     * Apgar 评分间隔时间代码DIR_APGAR_RATING（Apgar 评分间隔时间代码）
     */
    @Column(name = "APGAR_SCORE_INTERVAL_CODE")
    private String apgarScoreIntervalCode;

    /**
     * Apgar 评分间隔时间中文名称（Apgar 评分间隔时间中文名称）
     */
    @Column(name = "APGAR_SCORE_INTERVAL_CN")
    private String apgarScoreIntervalCn;

    /**
     * Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    @Column(name = "APGAR_SCORE")
    private Integer apgarScore;

    /**
     * 分娩结局代码DIR_DELIVERY_RESULT（胎儿分娩结局的分类代码）
     */
    @Column(name = "DELIVERY_OUTCOME_CODE")
    private String deliveryOutcomeCode;

    /**
     * 分娩结局中文名称（胎儿分娩结局的分类中文名称）
     */
    @Column(name = "DELIVERY_OUTCOME_CN")
    private String deliveryOutcomeCn;

    /**
     * 新生儿异常情况代码CV05.10.020（新生儿异常情况类别在特定编码体系中的代码）
     */
    @Column(name = "NEWBORN_ABNORMAL_CODE")
    private String newbornAbnormalCode;

    /**
     * 新生儿异常情况中文名称（新生儿异常情况类别在特定编码体系中的中文名称）
     */
    @Column(name = "NEWBORN_ABNORMAL_CN")
    private String newbornAbnormalCn;

    /**
     * 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    @Column(name = "FETUS_POSITION_CODE")
    private String fetusPositionCode;

    /**
     * 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    @Column(name = "FETUS_POSITION_CN")
    private String fetusPositionCn;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private String statusCode;

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
     * 获取分娩方式[主键]，1顺产 2剖宫产
     *
     * @return DELIVERY_MODE - 分娩方式[主键]，1顺产 2剖宫产
     */
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * 设置分娩方式[主键]，1顺产 2剖宫产
     *
     * @param deliveryMode 分娩方式[主键]，1顺产 2剖宫产
     */
    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode == null ? null : deliveryMode.trim();
    }

    /**
     * 获取分娩记录ID[主键]（当分娩方式为顺产时，取顺产记录ID；当为剖宫产时，取剖宫产记录ID）
     *
     * @return DELIVERY_RECORD_ID - 分娩记录ID[主键]（当分娩方式为顺产时，取顺产记录ID；当为剖宫产时，取剖宫产记录ID）
     */
    public String getDeliveryRecordId() {
        return deliveryRecordId;
    }

    /**
     * 设置分娩记录ID[主键]（当分娩方式为顺产时，取顺产记录ID；当为剖宫产时，取剖宫产记录ID）
     *
     * @param deliveryRecordId 分娩记录ID[主键]（当分娩方式为顺产时，取顺产记录ID；当为剖宫产时，取剖宫产记录ID）
     */
    public void setDeliveryRecordId(String deliveryRecordId) {
        this.deliveryRecordId = deliveryRecordId == null ? null : deliveryRecordId.trim();
    }

    /**
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return CESAREAN_DELIVERY_BABY_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getCesareanDeliveryBabyId() {
        return cesareanDeliveryBabyId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param cesareanDeliveryBabyId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setCesareanDeliveryBabyId(String cesareanDeliveryBabyId) {
        this.cesareanDeliveryBabyId = cesareanDeliveryBabyId == null ? null : cesareanDeliveryBabyId.trim();
    }

    /**
     * 获取病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @return CASE_NO - 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 设置病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     *
     * @param caseNo 病案号（本医疗机构为患者住院病案设置的唯一性编码。原则上，同一患者在同一医疗机构多次住院应当使用同一病案号）
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    /**
     * 获取新生儿性别代码GB/T 2261.1（新生儿生理性别在特定编码体系中的代码）
     *
     * @return SEX_CODE - 新生儿性别代码GB/T 2261.1（新生儿生理性别在特定编码体系中的代码）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置新生儿性别代码GB/T 2261.1（新生儿生理性别在特定编码体系中的代码）
     *
     * @param sexCode 新生儿性别代码GB/T 2261.1（新生儿生理性别在特定编码体系中的代码）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取新生儿性别中文名称（新生儿生理性别在特定编码体系中的中文名称）
     *
     * @return SEX_CN - 新生儿性别中文名称（新生儿生理性别在特定编码体系中的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置新生儿性别中文名称（新生儿生理性别在特定编码体系中的中文名称）
     *
     * @param sexCn 新生儿性别中文名称（新生儿生理性别在特定编码体系中的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取新生儿出生体重（g）（新生儿出生后第 1 小时内第 1 次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     *
     * @return BRITH_WEIGHT - 新生儿出生体重（g）（新生儿出生后第 1 小时内第 1 次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    public Integer getBrithWeight() {
        return brithWeight;
    }

    /**
     * 设置新生儿出生体重（g）（新生儿出生后第 1 小时内第 1 次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     *
     * @param brithWeight 新生儿出生体重（g）（新生儿出生后第 1 小时内第 1 次称得的重量，产妇病历和新生儿期住院的患儿都应填写）
     */
    public void setBrithWeight(Integer brithWeight) {
        this.brithWeight = brithWeight;
    }

    /**
     * 获取新生儿出生身长（cm）（新生儿出生后第 1 小时内身长的测量值，计量单位为cm）
     *
     * @return BRITH_LENGTH - 新生儿出生身长（cm）（新生儿出生后第 1 小时内身长的测量值，计量单位为cm）
     */
    public BigDecimal getBrithLength() {
        return brithLength;
    }

    /**
     * 设置新生儿出生身长（cm）（新生儿出生后第 1 小时内身长的测量值，计量单位为cm）
     *
     * @param brithLength 新生儿出生身长（cm）（新生儿出生后第 1 小时内身长的测量值，计量单位为cm）
     */
    public void setBrithLength(BigDecimal brithLength) {
        this.brithLength = brithLength;
    }

    /**
     * 获取Apgar 评分间隔时间代码DIR_APGAR_RATING（Apgar 评分间隔时间代码）
     *
     * @return APGAR_SCORE_INTERVAL_CODE - Apgar 评分间隔时间代码DIR_APGAR_RATING（Apgar 评分间隔时间代码）
     */
    public String getApgarScoreIntervalCode() {
        return apgarScoreIntervalCode;
    }

    /**
     * 设置Apgar 评分间隔时间代码DIR_APGAR_RATING（Apgar 评分间隔时间代码）
     *
     * @param apgarScoreIntervalCode Apgar 评分间隔时间代码DIR_APGAR_RATING（Apgar 评分间隔时间代码）
     */
    public void setApgarScoreIntervalCode(String apgarScoreIntervalCode) {
        this.apgarScoreIntervalCode = apgarScoreIntervalCode == null ? null : apgarScoreIntervalCode.trim();
    }

    /**
     * 获取Apgar 评分间隔时间中文名称（Apgar 评分间隔时间中文名称）
     *
     * @return APGAR_SCORE_INTERVAL_CN - Apgar 评分间隔时间中文名称（Apgar 评分间隔时间中文名称）
     */
    public String getApgarScoreIntervalCn() {
        return apgarScoreIntervalCn;
    }

    /**
     * 设置Apgar 评分间隔时间中文名称（Apgar 评分间隔时间中文名称）
     *
     * @param apgarScoreIntervalCn Apgar 评分间隔时间中文名称（Apgar 评分间隔时间中文名称）
     */
    public void setApgarScoreIntervalCn(String apgarScoreIntervalCn) {
        this.apgarScoreIntervalCn = apgarScoreIntervalCn == null ? null : apgarScoreIntervalCn.trim();
    }

    /**
     * 获取Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     *
     * @return APGAR_SCORE - Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    public Integer getApgarScore() {
        return apgarScore;
    }

    /**
     * 设置Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     *
     * @param apgarScore Apgar 评分值（对新生儿娩出后呼吸、心率、皮肤颜色、肌张力及对刺激的反应等 5 项指标的评分结果值，计量单位为分）
     */
    public void setApgarScore(Integer apgarScore) {
        this.apgarScore = apgarScore;
    }

    /**
     * 获取分娩结局代码DIR_DELIVERY_RESULT（胎儿分娩结局的分类代码）
     *
     * @return DELIVERY_OUTCOME_CODE - 分娩结局代码DIR_DELIVERY_RESULT（胎儿分娩结局的分类代码）
     */
    public String getDeliveryOutcomeCode() {
        return deliveryOutcomeCode;
    }

    /**
     * 设置分娩结局代码DIR_DELIVERY_RESULT（胎儿分娩结局的分类代码）
     *
     * @param deliveryOutcomeCode 分娩结局代码DIR_DELIVERY_RESULT（胎儿分娩结局的分类代码）
     */
    public void setDeliveryOutcomeCode(String deliveryOutcomeCode) {
        this.deliveryOutcomeCode = deliveryOutcomeCode == null ? null : deliveryOutcomeCode.trim();
    }

    /**
     * 获取分娩结局中文名称（胎儿分娩结局的分类中文名称）
     *
     * @return DELIVERY_OUTCOME_CN - 分娩结局中文名称（胎儿分娩结局的分类中文名称）
     */
    public String getDeliveryOutcomeCn() {
        return deliveryOutcomeCn;
    }

    /**
     * 设置分娩结局中文名称（胎儿分娩结局的分类中文名称）
     *
     * @param deliveryOutcomeCn 分娩结局中文名称（胎儿分娩结局的分类中文名称）
     */
    public void setDeliveryOutcomeCn(String deliveryOutcomeCn) {
        this.deliveryOutcomeCn = deliveryOutcomeCn == null ? null : deliveryOutcomeCn.trim();
    }

    /**
     * 获取新生儿异常情况代码CV05.10.020（新生儿异常情况类别在特定编码体系中的代码）
     *
     * @return NEWBORN_ABNORMAL_CODE - 新生儿异常情况代码CV05.10.020（新生儿异常情况类别在特定编码体系中的代码）
     */
    public String getNewbornAbnormalCode() {
        return newbornAbnormalCode;
    }

    /**
     * 设置新生儿异常情况代码CV05.10.020（新生儿异常情况类别在特定编码体系中的代码）
     *
     * @param newbornAbnormalCode 新生儿异常情况代码CV05.10.020（新生儿异常情况类别在特定编码体系中的代码）
     */
    public void setNewbornAbnormalCode(String newbornAbnormalCode) {
        this.newbornAbnormalCode = newbornAbnormalCode == null ? null : newbornAbnormalCode.trim();
    }

    /**
     * 获取新生儿异常情况中文名称（新生儿异常情况类别在特定编码体系中的中文名称）
     *
     * @return NEWBORN_ABNORMAL_CN - 新生儿异常情况中文名称（新生儿异常情况类别在特定编码体系中的中文名称）
     */
    public String getNewbornAbnormalCn() {
        return newbornAbnormalCn;
    }

    /**
     * 设置新生儿异常情况中文名称（新生儿异常情况类别在特定编码体系中的中文名称）
     *
     * @param newbornAbnormalCn 新生儿异常情况中文名称（新生儿异常情况类别在特定编码体系中的中文名称）
     */
    public void setNewbornAbnormalCn(String newbornAbnormalCn) {
        this.newbornAbnormalCn = newbornAbnormalCn == null ? null : newbornAbnormalCn.trim();
    }

    /**
     * 获取胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     *
     * @return FETUS_POSITION_CODE - 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    public String getFetusPositionCode() {
        return fetusPositionCode;
    }

    /**
     * 设置胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     *
     * @param fetusPositionCode 胎方位代码CV05.01.007（胎儿方位类别在特定编码体系中的代码）
     */
    public void setFetusPositionCode(String fetusPositionCode) {
        this.fetusPositionCode = fetusPositionCode == null ? null : fetusPositionCode.trim();
    }

    /**
     * 获取胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     *
     * @return FETUS_POSITION_CN - 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    public String getFetusPositionCn() {
        return fetusPositionCn;
    }

    /**
     * 设置胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     *
     * @param fetusPositionCn 胎方位中文名称（胎儿方位类别在特定编码体系中的中文名称）
     */
    public void setFetusPositionCn(String fetusPositionCn) {
        this.fetusPositionCn = fetusPositionCn == null ? null : fetusPositionCn.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
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