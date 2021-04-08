package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "DAILY_REPORT_INPATIENT_FEE")
public class DailyReportInpatientFee {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * ID[主键]
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 统计业务日期[主键],YYYYMMDD（统计业务日期）
     */
    @Id
    @Column(name = "DATE_T")
    private String dateT;

    /**
     * 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 科室代码DIR_DEPT（统计科室的科室代码）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室名称（科室名称）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 床位费（床位费）
     */
    @Column(name = "FEE_BED")
    private BigDecimal feeBed;

    /**
     * 诊疗费（诊疗费）
     */
    @Column(name = "FEE_DIAGNOSIS")
    private BigDecimal feeDiagnosis;

    /**
     * 检查费（检查费）
     */
    @Column(name = "FEE_EXAM")
    private BigDecimal feeExam;

    /**
     * MRI费（MRI费）
     */
    @Column(name = "FEE_MRI")
    private BigDecimal feeMri;

    /**
     * CT费（CT费）
     */
    @Column(name = "FEE_CT")
    private BigDecimal feeCt;

    /**
     * 彩超费（彩超费）
     */
    @Column(name = "FEE_COLOR_BSCAN")
    private BigDecimal feeColorBscan;

    /**
     * 治疗费（治疗费）
     */
    @Column(name = "FEE_TREATMENT")
    private BigDecimal feeTreatment;

    /**
     * 化验费（化验费）
     */
    @Column(name = "FEE_LAB_TEST")
    private BigDecimal feeLabTest;

    /**
     * 输氧费（输氧费）
     */
    @Column(name = "FEE_OXYGEN")
    private BigDecimal feeOxygen;

    /**
     * 输血费（输血费）
     */
    @Column(name = "FEE_BLOOD")
    private BigDecimal feeBlood;

    /**
     * 手术费（手术费）
     */
    @Column(name = "FEE_OPERATION")
    private BigDecimal feeOperation;

    /**
     * 西药费（西药费）
     */
    @Column(name = "FEE_WESTERN_MEDICINE")
    private BigDecimal feeWesternMedicine;

    /**
     * 中成药费（中成药费）
     */
    @Column(name = "FEE_CN_MEDICINE")
    private BigDecimal feeCnMedicine;

    /**
     * 中草药费（中草药费）
     */
    @Column(name = "FEE_CN_HERBAL_MEDICINE")
    private BigDecimal feeCnHerbalMedicine;

    /**
     * 护理费（护理费）
     */
    @Column(name = "FEE_NURSING")
    private BigDecimal feeNursing;

    /**
     * 麻醉费（麻醉费）
     */
    @Column(name = "FEE_ANAES")
    private BigDecimal feeAnaes;

    /**
     * 麻醉相关费（麻醉相关费）
     */
    @Column(name = "FEE_ANAES_OTHERS")
    private BigDecimal feeAnaesOthers;

    /**
     * 救护车费（救护车费）
     */
    @Column(name = "FEE_AMBULANCE")
    private BigDecimal feeAmbulance;

    /**
     * 其他医疗费（其他医疗费）
     */
    @Column(name = "FEE_OTHER_1")
    private BigDecimal feeOther1;

    /**
     * 其他（其他）
     */
    @Column(name = "FEE_OTHER_2")
    private BigDecimal feeOther2;

    /**
     * 合计（合计）
     */
    @Column(name = "FEE_TOTAL")
    private BigDecimal feeTotal;

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
     * 获取ID[主键]
     *
     * @return ID - ID[主键]
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID[主键]
     *
     * @param id ID[主键]
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * 获取统计业务日期[主键],YYYYMMDD（统计业务日期）
     *
     * @return DATE_T - 统计业务日期[主键],YYYYMMDD（统计业务日期）
     */
    public String getDateT() {
        return dateT;
    }

    /**
     * 设置统计业务日期[主键],YYYYMMDD（统计业务日期）
     *
     * @param dateT 统计业务日期[主键],YYYYMMDD（统计业务日期）
     */
    public void setDateT(String dateT) {
        this.dateT = dateT == null ? null : dateT.trim();
    }

    /**
     * 获取机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @return ORG_NAME - 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     *
     * @param orgName 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取科室代码DIR_DEPT（统计科室的科室代码）
     *
     * @return DEPT_CODE - 科室代码DIR_DEPT（统计科室的科室代码）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置科室代码DIR_DEPT（统计科室的科室代码）
     *
     * @param deptCode 科室代码DIR_DEPT（统计科室的科室代码）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取科室名称（科室名称）
     *
     * @return DEPT_NAME - 科室名称（科室名称）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（科室名称）
     *
     * @param deptName 科室名称（科室名称）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取床位费（床位费）
     *
     * @return FEE_BED - 床位费（床位费）
     */
    public BigDecimal getFeeBed() {
        return feeBed;
    }

    /**
     * 设置床位费（床位费）
     *
     * @param feeBed 床位费（床位费）
     */
    public void setFeeBed(BigDecimal feeBed) {
        this.feeBed = feeBed;
    }

    /**
     * 获取诊疗费（诊疗费）
     *
     * @return FEE_DIAGNOSIS - 诊疗费（诊疗费）
     */
    public BigDecimal getFeeDiagnosis() {
        return feeDiagnosis;
    }

    /**
     * 设置诊疗费（诊疗费）
     *
     * @param feeDiagnosis 诊疗费（诊疗费）
     */
    public void setFeeDiagnosis(BigDecimal feeDiagnosis) {
        this.feeDiagnosis = feeDiagnosis;
    }

    /**
     * 获取检查费（检查费）
     *
     * @return FEE_EXAM - 检查费（检查费）
     */
    public BigDecimal getFeeExam() {
        return feeExam;
    }

    /**
     * 设置检查费（检查费）
     *
     * @param feeExam 检查费（检查费）
     */
    public void setFeeExam(BigDecimal feeExam) {
        this.feeExam = feeExam;
    }

    /**
     * 获取MRI费（MRI费）
     *
     * @return FEE_MRI - MRI费（MRI费）
     */
    public BigDecimal getFeeMri() {
        return feeMri;
    }

    /**
     * 设置MRI费（MRI费）
     *
     * @param feeMri MRI费（MRI费）
     */
    public void setFeeMri(BigDecimal feeMri) {
        this.feeMri = feeMri;
    }

    /**
     * 获取CT费（CT费）
     *
     * @return FEE_CT - CT费（CT费）
     */
    public BigDecimal getFeeCt() {
        return feeCt;
    }

    /**
     * 设置CT费（CT费）
     *
     * @param feeCt CT费（CT费）
     */
    public void setFeeCt(BigDecimal feeCt) {
        this.feeCt = feeCt;
    }

    /**
     * 获取彩超费（彩超费）
     *
     * @return FEE_COLOR_BSCAN - 彩超费（彩超费）
     */
    public BigDecimal getFeeColorBscan() {
        return feeColorBscan;
    }

    /**
     * 设置彩超费（彩超费）
     *
     * @param feeColorBscan 彩超费（彩超费）
     */
    public void setFeeColorBscan(BigDecimal feeColorBscan) {
        this.feeColorBscan = feeColorBscan;
    }

    /**
     * 获取治疗费（治疗费）
     *
     * @return FEE_TREATMENT - 治疗费（治疗费）
     */
    public BigDecimal getFeeTreatment() {
        return feeTreatment;
    }

    /**
     * 设置治疗费（治疗费）
     *
     * @param feeTreatment 治疗费（治疗费）
     */
    public void setFeeTreatment(BigDecimal feeTreatment) {
        this.feeTreatment = feeTreatment;
    }

    /**
     * 获取化验费（化验费）
     *
     * @return FEE_LAB_TEST - 化验费（化验费）
     */
    public BigDecimal getFeeLabTest() {
        return feeLabTest;
    }

    /**
     * 设置化验费（化验费）
     *
     * @param feeLabTest 化验费（化验费）
     */
    public void setFeeLabTest(BigDecimal feeLabTest) {
        this.feeLabTest = feeLabTest;
    }

    /**
     * 获取输氧费（输氧费）
     *
     * @return FEE_OXYGEN - 输氧费（输氧费）
     */
    public BigDecimal getFeeOxygen() {
        return feeOxygen;
    }

    /**
     * 设置输氧费（输氧费）
     *
     * @param feeOxygen 输氧费（输氧费）
     */
    public void setFeeOxygen(BigDecimal feeOxygen) {
        this.feeOxygen = feeOxygen;
    }

    /**
     * 获取输血费（输血费）
     *
     * @return FEE_BLOOD - 输血费（输血费）
     */
    public BigDecimal getFeeBlood() {
        return feeBlood;
    }

    /**
     * 设置输血费（输血费）
     *
     * @param feeBlood 输血费（输血费）
     */
    public void setFeeBlood(BigDecimal feeBlood) {
        this.feeBlood = feeBlood;
    }

    /**
     * 获取手术费（手术费）
     *
     * @return FEE_OPERATION - 手术费（手术费）
     */
    public BigDecimal getFeeOperation() {
        return feeOperation;
    }

    /**
     * 设置手术费（手术费）
     *
     * @param feeOperation 手术费（手术费）
     */
    public void setFeeOperation(BigDecimal feeOperation) {
        this.feeOperation = feeOperation;
    }

    /**
     * 获取西药费（西药费）
     *
     * @return FEE_WESTERN_MEDICINE - 西药费（西药费）
     */
    public BigDecimal getFeeWesternMedicine() {
        return feeWesternMedicine;
    }

    /**
     * 设置西药费（西药费）
     *
     * @param feeWesternMedicine 西药费（西药费）
     */
    public void setFeeWesternMedicine(BigDecimal feeWesternMedicine) {
        this.feeWesternMedicine = feeWesternMedicine;
    }

    /**
     * 获取中成药费（中成药费）
     *
     * @return FEE_CN_MEDICINE - 中成药费（中成药费）
     */
    public BigDecimal getFeeCnMedicine() {
        return feeCnMedicine;
    }

    /**
     * 设置中成药费（中成药费）
     *
     * @param feeCnMedicine 中成药费（中成药费）
     */
    public void setFeeCnMedicine(BigDecimal feeCnMedicine) {
        this.feeCnMedicine = feeCnMedicine;
    }

    /**
     * 获取中草药费（中草药费）
     *
     * @return FEE_CN_HERBAL_MEDICINE - 中草药费（中草药费）
     */
    public BigDecimal getFeeCnHerbalMedicine() {
        return feeCnHerbalMedicine;
    }

    /**
     * 设置中草药费（中草药费）
     *
     * @param feeCnHerbalMedicine 中草药费（中草药费）
     */
    public void setFeeCnHerbalMedicine(BigDecimal feeCnHerbalMedicine) {
        this.feeCnHerbalMedicine = feeCnHerbalMedicine;
    }

    /**
     * 获取护理费（护理费）
     *
     * @return FEE_NURSING - 护理费（护理费）
     */
    public BigDecimal getFeeNursing() {
        return feeNursing;
    }

    /**
     * 设置护理费（护理费）
     *
     * @param feeNursing 护理费（护理费）
     */
    public void setFeeNursing(BigDecimal feeNursing) {
        this.feeNursing = feeNursing;
    }

    /**
     * 获取麻醉费（麻醉费）
     *
     * @return FEE_ANAES - 麻醉费（麻醉费）
     */
    public BigDecimal getFeeAnaes() {
        return feeAnaes;
    }

    /**
     * 设置麻醉费（麻醉费）
     *
     * @param feeAnaes 麻醉费（麻醉费）
     */
    public void setFeeAnaes(BigDecimal feeAnaes) {
        this.feeAnaes = feeAnaes;
    }

    /**
     * 获取麻醉相关费（麻醉相关费）
     *
     * @return FEE_ANAES_OTHERS - 麻醉相关费（麻醉相关费）
     */
    public BigDecimal getFeeAnaesOthers() {
        return feeAnaesOthers;
    }

    /**
     * 设置麻醉相关费（麻醉相关费）
     *
     * @param feeAnaesOthers 麻醉相关费（麻醉相关费）
     */
    public void setFeeAnaesOthers(BigDecimal feeAnaesOthers) {
        this.feeAnaesOthers = feeAnaesOthers;
    }

    /**
     * 获取救护车费（救护车费）
     *
     * @return FEE_AMBULANCE - 救护车费（救护车费）
     */
    public BigDecimal getFeeAmbulance() {
        return feeAmbulance;
    }

    /**
     * 设置救护车费（救护车费）
     *
     * @param feeAmbulance 救护车费（救护车费）
     */
    public void setFeeAmbulance(BigDecimal feeAmbulance) {
        this.feeAmbulance = feeAmbulance;
    }

    /**
     * 获取其他医疗费（其他医疗费）
     *
     * @return FEE_OTHER_1 - 其他医疗费（其他医疗费）
     */
    public BigDecimal getFeeOther1() {
        return feeOther1;
    }

    /**
     * 设置其他医疗费（其他医疗费）
     *
     * @param feeOther1 其他医疗费（其他医疗费）
     */
    public void setFeeOther1(BigDecimal feeOther1) {
        this.feeOther1 = feeOther1;
    }

    /**
     * 获取其他（其他）
     *
     * @return FEE_OTHER_2 - 其他（其他）
     */
    public BigDecimal getFeeOther2() {
        return feeOther2;
    }

    /**
     * 设置其他（其他）
     *
     * @param feeOther2 其他（其他）
     */
    public void setFeeOther2(BigDecimal feeOther2) {
        this.feeOther2 = feeOther2;
    }

    /**
     * 获取合计（合计）
     *
     * @return FEE_TOTAL - 合计（合计）
     */
    public BigDecimal getFeeTotal() {
        return feeTotal;
    }

    /**
     * 设置合计（合计）
     *
     * @param feeTotal 合计（合计）
     */
    public void setFeeTotal(BigDecimal feeTotal) {
        this.feeTotal = feeTotal;
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