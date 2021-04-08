package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_INCOME")
public class OrgIncome {
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
    @Column(name = "INCOME_ID")
    private String incomeId;

    /**
     * 组织机构编码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 机构名称（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 年度
     */
    @Column(name = "YEAR")
    private Short year;

    /**
     * 月份
     */
    @Column(name = "MONTH")
    private Short month;

    /**
     * 门诊收入
     */
    @Column(name = "OUTPATIENT_INCOME")
    private BigDecimal outpatientIncome;

    /**
     * 门诊挂号收入
     */
    @Column(name = "OUTPATIENT_REGIST_INCOME")
    private BigDecimal outpatientRegistIncome;

    /**
     * 门诊诊察收入
     */
    @Column(name = "OUTPATIENT_INSPECT_INCOME")
    private BigDecimal outpatientInspectIncome;

    /**
     * 门诊检查收入
     */
    @Column(name = "OUTPATIENT_CHECK_INCOME")
    private BigDecimal outpatientCheckIncome;

    /**
     * 门诊化验收入
     */
    @Column(name = "OUTPATIENT_TEST_INCOME")
    private BigDecimal outpatientTestIncome;

    /**
     * 门诊治疗收入
     */
    @Column(name = "OUTPATIENT_TREATMENT_INCOME")
    private BigDecimal outpatientTreatmentIncome;

    /**
     * 门诊手术收入
     */
    @Column(name = "OUTPATIENT_OPERATE_INCOME")
    private BigDecimal outpatientOperateIncome;

    /**
     * 门诊卫生材料收入
     */
    @Column(name = "OUTPATIENT_MATERIAL_INCOME")
    private BigDecimal outpatientMaterialIncome;

    /**
     * 门诊药品收入
     */
    @Column(name = "OUTPATIENT_MED_INCOME")
    private BigDecimal outpatientMedIncome;

    /**
     * 门诊西药收入 
     */
    @Column(name = "OUTPATIENT_WESTERN_MED_INCOME")
    private BigDecimal outpatientWesternMedIncome;

    /**
     * 门诊中成药收入
     */
    @Column(name = "OUTPATIENT_CN_PATENT_INCOME")
    private BigDecimal outpatientCnPatentIncome;

    /**
     * 门诊中草药收入
     */
    @Column(name = "OUTPATIENT_CN_HERBAL_INCOME")
    private BigDecimal outpatientCnHerbalIncome;

    /**
     * 门诊其他门诊收入
     */
    @Column(name = "OUTPATIENT_OTHER_INCOME")
    private BigDecimal outpatientOtherIncome;

    /**
     * 住院收入 
     */
    @Column(name = "INPATIENT_INCOME")
    private BigDecimal inpatientIncome;

    /**
     * 住院床位收入 
     */
    @Column(name = "INPATIENT_BED_INCOME")
    private BigDecimal inpatientBedIncome;

    /**
     * 住院诊察收入
     */
    @Column(name = "INPATIENT_INSPECT_INCOME")
    private BigDecimal inpatientInspectIncome;

    /**
     * 住院检查收入
     */
    @Column(name = "INPATIENT_CHECK_INCOME")
    private BigDecimal inpatientCheckIncome;

    /**
     * 住院化验收入
     */
    @Column(name = "INPATIENT_TEST_INCOME")
    private BigDecimal inpatientTestIncome;

    /**
     * 住院治疗收入
     */
    @Column(name = "INPATIENT_TREATMENT_INCOME")
    private BigDecimal inpatientTreatmentIncome;

    /**
     * 住院手术收入 
     */
    @Column(name = "INPATIENT_OPERATE_INCOME")
    private BigDecimal inpatientOperateIncome;

    /**
     * 住院护理收入
     */
    @Column(name = "INPATIENT_NURSING_INCOME")
    private BigDecimal inpatientNursingIncome;

    /**
     * 住院卫生材料收入
     */
    @Column(name = "INPATIENT_MATERIAL_INCOME")
    private BigDecimal inpatientMaterialIncome;

    /**
     * 住院药品收入
     */
    @Column(name = "INPATIENT_MED_INCOME")
    private BigDecimal inpatientMedIncome;

    /**
     * 住院西药收入
     */
    @Column(name = "INPATIENT_WESTERN_MED_INCOME")
    private BigDecimal inpatientWesternMedIncome;

    /**
     * 住院中成药收入
     */
    @Column(name = "INPATIENT_CN_PATENT_INCOME")
    private BigDecimal inpatientCnPatentIncome;

    /**
     * 住院中草药收入
     */
    @Column(name = "INPATIENT_CN_HERBAL_INCOME")
    private BigDecimal inpatientCnHerbalIncome;

    /**
     * 住院其他住院收入
     */
    @Column(name = "INPATIENT_OTHER_INCOME")
    private BigDecimal inpatientOtherIncome;

    /**
     * 财政补助收入
     */
    @Column(name = "FINANCE_SUB_INCOME")
    private BigDecimal financeSubIncome;

    /**
     * 总支出 
     */
    @Column(name = "TOTAL_EXPDEND")
    private BigDecimal totalExpdend;

    /**
     * 医疗业务成本
     */
    @Column(name = "MEDICAL_EXPDEND")
    private BigDecimal medicalExpdend;

    /**
     * 临床服务成本
     */
    @Column(name = "CLIN_SVR_EXPDEND")
    private BigDecimal clinSvrExpdend;

    /**
     * 医疗技术成本
     */
    @Column(name = "MEDICAL_TECH_EXPDEND")
    private BigDecimal medicalTechExpdend;

    /**
     * 医疗辅助成本
     */
    @Column(name = "MEDICAL_ASS_EXPDEND")
    private BigDecimal medicalAssExpdend;

    /**
     * 财政项目补助支出
     */
    @Column(name = "FINAC_ALC_EXPDEND")
    private BigDecimal finacAlcExpdend;

    /**
     * 科教项目支出
     */
    @Column(name = "EDU_ITEM_EXPDEND")
    private BigDecimal eduItemExpdend;

    /**
     * 管理费用 
     */
    @Column(name = "MNG_EXPDEND")
    private BigDecimal mngExpdend;

    /**
     * 离退休费
     */
    @Column(name = "RETIRED_EXPDEND")
    private BigDecimal retiredExpdend;

    /**
     * 人员支出
     */
    @Column(name = "STAFF_EXPDEND")
    private BigDecimal staffExpdend;

    /**
     * 基本工资支出
     */
    @Column(name = "BASE_WAGE_EXPDEND")
    private BigDecimal baseWageExpdend;

    /**
     * 津贴补贴支出
     */
    @Column(name = "ALLOWANCE_EXPDEND")
    private BigDecimal allowanceExpdend;

    /**
     * 奖金支出
     */
    @Column(name = "BONUS_EXPDEND")
    private BigDecimal bonusExpdend;

    /**
     * 绩效工资
     */
    @Column(name = "MERIT_EXPDEND")
    private BigDecimal meritExpdend;

    /**
     * 卫生材料费
     */
    @Column(name = "MATERIAL_EXPDEND")
    private BigDecimal materialExpdend;

    /**
     * 药品费支出
     */
    @Column(name = "MED_EXPDEND")
    private BigDecimal medExpdend;

    /**
     * 引智/培智投入经费
     */
    @Column(name = "INTRO_TALENTS_EXPDEND")
    private BigDecimal introTalentsExpdend;

    /**
     * 医疗事故发生责任赔偿总金额 
     */
    @Column(name = "MEDC_ACCI_COPST_FUNDS")
    private BigDecimal medcAcciCopstFunds;

    /**
     * 资产总额
     */
    @Column(name = "TOTAL_ASSET_FUNDS")
    private BigDecimal totalAssetFunds;

    /**
     * 卫生机构流动资产
     */
    @Column(name = "FLOW_ASSET_FUNDS")
    private BigDecimal flowAssetFunds;

    /**
     * 卫生机构净资产
     */
    @Column(name = "NET_ASSET_FUNDS")
    private BigDecimal netAssetFunds;

    /**
     * 卫生机构负债
     */
    @Column(name = "DEBT_FUNDS")
    private BigDecimal debtFunds;

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
     * @return INCOME_ID - ID[主键]
     */
    public String getIncomeId() {
        return incomeId;
    }

    /**
     * 设置ID[主键]
     *
     * @param incomeId ID[主键]
     */
    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId == null ? null : incomeId.trim();
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
     * 获取年度
     *
     * @return YEAR - 年度
     */
    public Short getYear() {
        return year;
    }

    /**
     * 设置年度
     *
     * @param year 年度
     */
    public void setYear(Short year) {
        this.year = year;
    }

    /**
     * 获取月份
     *
     * @return MONTH - 月份
     */
    public Short getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(Short month) {
        this.month = month;
    }

    /**
     * 获取门诊收入
     *
     * @return OUTPATIENT_INCOME - 门诊收入
     */
    public BigDecimal getOutpatientIncome() {
        return outpatientIncome;
    }

    /**
     * 设置门诊收入
     *
     * @param outpatientIncome 门诊收入
     */
    public void setOutpatientIncome(BigDecimal outpatientIncome) {
        this.outpatientIncome = outpatientIncome;
    }

    /**
     * 获取门诊挂号收入
     *
     * @return OUTPATIENT_REGIST_INCOME - 门诊挂号收入
     */
    public BigDecimal getOutpatientRegistIncome() {
        return outpatientRegistIncome;
    }

    /**
     * 设置门诊挂号收入
     *
     * @param outpatientRegistIncome 门诊挂号收入
     */
    public void setOutpatientRegistIncome(BigDecimal outpatientRegistIncome) {
        this.outpatientRegistIncome = outpatientRegistIncome;
    }

    /**
     * 获取门诊诊察收入
     *
     * @return OUTPATIENT_INSPECT_INCOME - 门诊诊察收入
     */
    public BigDecimal getOutpatientInspectIncome() {
        return outpatientInspectIncome;
    }

    /**
     * 设置门诊诊察收入
     *
     * @param outpatientInspectIncome 门诊诊察收入
     */
    public void setOutpatientInspectIncome(BigDecimal outpatientInspectIncome) {
        this.outpatientInspectIncome = outpatientInspectIncome;
    }

    /**
     * 获取门诊检查收入
     *
     * @return OUTPATIENT_CHECK_INCOME - 门诊检查收入
     */
    public BigDecimal getOutpatientCheckIncome() {
        return outpatientCheckIncome;
    }

    /**
     * 设置门诊检查收入
     *
     * @param outpatientCheckIncome 门诊检查收入
     */
    public void setOutpatientCheckIncome(BigDecimal outpatientCheckIncome) {
        this.outpatientCheckIncome = outpatientCheckIncome;
    }

    /**
     * 获取门诊化验收入
     *
     * @return OUTPATIENT_TEST_INCOME - 门诊化验收入
     */
    public BigDecimal getOutpatientTestIncome() {
        return outpatientTestIncome;
    }

    /**
     * 设置门诊化验收入
     *
     * @param outpatientTestIncome 门诊化验收入
     */
    public void setOutpatientTestIncome(BigDecimal outpatientTestIncome) {
        this.outpatientTestIncome = outpatientTestIncome;
    }

    /**
     * 获取门诊治疗收入
     *
     * @return OUTPATIENT_TREATMENT_INCOME - 门诊治疗收入
     */
    public BigDecimal getOutpatientTreatmentIncome() {
        return outpatientTreatmentIncome;
    }

    /**
     * 设置门诊治疗收入
     *
     * @param outpatientTreatmentIncome 门诊治疗收入
     */
    public void setOutpatientTreatmentIncome(BigDecimal outpatientTreatmentIncome) {
        this.outpatientTreatmentIncome = outpatientTreatmentIncome;
    }

    /**
     * 获取门诊手术收入
     *
     * @return OUTPATIENT_OPERATE_INCOME - 门诊手术收入
     */
    public BigDecimal getOutpatientOperateIncome() {
        return outpatientOperateIncome;
    }

    /**
     * 设置门诊手术收入
     *
     * @param outpatientOperateIncome 门诊手术收入
     */
    public void setOutpatientOperateIncome(BigDecimal outpatientOperateIncome) {
        this.outpatientOperateIncome = outpatientOperateIncome;
    }

    /**
     * 获取门诊卫生材料收入
     *
     * @return OUTPATIENT_MATERIAL_INCOME - 门诊卫生材料收入
     */
    public BigDecimal getOutpatientMaterialIncome() {
        return outpatientMaterialIncome;
    }

    /**
     * 设置门诊卫生材料收入
     *
     * @param outpatientMaterialIncome 门诊卫生材料收入
     */
    public void setOutpatientMaterialIncome(BigDecimal outpatientMaterialIncome) {
        this.outpatientMaterialIncome = outpatientMaterialIncome;
    }

    /**
     * 获取门诊药品收入
     *
     * @return OUTPATIENT_MED_INCOME - 门诊药品收入
     */
    public BigDecimal getOutpatientMedIncome() {
        return outpatientMedIncome;
    }

    /**
     * 设置门诊药品收入
     *
     * @param outpatientMedIncome 门诊药品收入
     */
    public void setOutpatientMedIncome(BigDecimal outpatientMedIncome) {
        this.outpatientMedIncome = outpatientMedIncome;
    }

    /**
     * 获取门诊西药收入 
     *
     * @return OUTPATIENT_WESTERN_MED_INCOME - 门诊西药收入 
     */
    public BigDecimal getOutpatientWesternMedIncome() {
        return outpatientWesternMedIncome;
    }

    /**
     * 设置门诊西药收入 
     *
     * @param outpatientWesternMedIncome 门诊西药收入 
     */
    public void setOutpatientWesternMedIncome(BigDecimal outpatientWesternMedIncome) {
        this.outpatientWesternMedIncome = outpatientWesternMedIncome;
    }

    /**
     * 获取门诊中成药收入
     *
     * @return OUTPATIENT_CN_PATENT_INCOME - 门诊中成药收入
     */
    public BigDecimal getOutpatientCnPatentIncome() {
        return outpatientCnPatentIncome;
    }

    /**
     * 设置门诊中成药收入
     *
     * @param outpatientCnPatentIncome 门诊中成药收入
     */
    public void setOutpatientCnPatentIncome(BigDecimal outpatientCnPatentIncome) {
        this.outpatientCnPatentIncome = outpatientCnPatentIncome;
    }

    /**
     * 获取门诊中草药收入
     *
     * @return OUTPATIENT_CN_HERBAL_INCOME - 门诊中草药收入
     */
    public BigDecimal getOutpatientCnHerbalIncome() {
        return outpatientCnHerbalIncome;
    }

    /**
     * 设置门诊中草药收入
     *
     * @param outpatientCnHerbalIncome 门诊中草药收入
     */
    public void setOutpatientCnHerbalIncome(BigDecimal outpatientCnHerbalIncome) {
        this.outpatientCnHerbalIncome = outpatientCnHerbalIncome;
    }

    /**
     * 获取门诊其他门诊收入
     *
     * @return OUTPATIENT_OTHER_INCOME - 门诊其他门诊收入
     */
    public BigDecimal getOutpatientOtherIncome() {
        return outpatientOtherIncome;
    }

    /**
     * 设置门诊其他门诊收入
     *
     * @param outpatientOtherIncome 门诊其他门诊收入
     */
    public void setOutpatientOtherIncome(BigDecimal outpatientOtherIncome) {
        this.outpatientOtherIncome = outpatientOtherIncome;
    }

    /**
     * 获取住院收入 
     *
     * @return INPATIENT_INCOME - 住院收入 
     */
    public BigDecimal getInpatientIncome() {
        return inpatientIncome;
    }

    /**
     * 设置住院收入 
     *
     * @param inpatientIncome 住院收入 
     */
    public void setInpatientIncome(BigDecimal inpatientIncome) {
        this.inpatientIncome = inpatientIncome;
    }

    /**
     * 获取住院床位收入 
     *
     * @return INPATIENT_BED_INCOME - 住院床位收入 
     */
    public BigDecimal getInpatientBedIncome() {
        return inpatientBedIncome;
    }

    /**
     * 设置住院床位收入 
     *
     * @param inpatientBedIncome 住院床位收入 
     */
    public void setInpatientBedIncome(BigDecimal inpatientBedIncome) {
        this.inpatientBedIncome = inpatientBedIncome;
    }

    /**
     * 获取住院诊察收入
     *
     * @return INPATIENT_INSPECT_INCOME - 住院诊察收入
     */
    public BigDecimal getInpatientInspectIncome() {
        return inpatientInspectIncome;
    }

    /**
     * 设置住院诊察收入
     *
     * @param inpatientInspectIncome 住院诊察收入
     */
    public void setInpatientInspectIncome(BigDecimal inpatientInspectIncome) {
        this.inpatientInspectIncome = inpatientInspectIncome;
    }

    /**
     * 获取住院检查收入
     *
     * @return INPATIENT_CHECK_INCOME - 住院检查收入
     */
    public BigDecimal getInpatientCheckIncome() {
        return inpatientCheckIncome;
    }

    /**
     * 设置住院检查收入
     *
     * @param inpatientCheckIncome 住院检查收入
     */
    public void setInpatientCheckIncome(BigDecimal inpatientCheckIncome) {
        this.inpatientCheckIncome = inpatientCheckIncome;
    }

    /**
     * 获取住院化验收入
     *
     * @return INPATIENT_TEST_INCOME - 住院化验收入
     */
    public BigDecimal getInpatientTestIncome() {
        return inpatientTestIncome;
    }

    /**
     * 设置住院化验收入
     *
     * @param inpatientTestIncome 住院化验收入
     */
    public void setInpatientTestIncome(BigDecimal inpatientTestIncome) {
        this.inpatientTestIncome = inpatientTestIncome;
    }

    /**
     * 获取住院治疗收入
     *
     * @return INPATIENT_TREATMENT_INCOME - 住院治疗收入
     */
    public BigDecimal getInpatientTreatmentIncome() {
        return inpatientTreatmentIncome;
    }

    /**
     * 设置住院治疗收入
     *
     * @param inpatientTreatmentIncome 住院治疗收入
     */
    public void setInpatientTreatmentIncome(BigDecimal inpatientTreatmentIncome) {
        this.inpatientTreatmentIncome = inpatientTreatmentIncome;
    }

    /**
     * 获取住院手术收入 
     *
     * @return INPATIENT_OPERATE_INCOME - 住院手术收入 
     */
    public BigDecimal getInpatientOperateIncome() {
        return inpatientOperateIncome;
    }

    /**
     * 设置住院手术收入 
     *
     * @param inpatientOperateIncome 住院手术收入 
     */
    public void setInpatientOperateIncome(BigDecimal inpatientOperateIncome) {
        this.inpatientOperateIncome = inpatientOperateIncome;
    }

    /**
     * 获取住院护理收入
     *
     * @return INPATIENT_NURSING_INCOME - 住院护理收入
     */
    public BigDecimal getInpatientNursingIncome() {
        return inpatientNursingIncome;
    }

    /**
     * 设置住院护理收入
     *
     * @param inpatientNursingIncome 住院护理收入
     */
    public void setInpatientNursingIncome(BigDecimal inpatientNursingIncome) {
        this.inpatientNursingIncome = inpatientNursingIncome;
    }

    /**
     * 获取住院卫生材料收入
     *
     * @return INPATIENT_MATERIAL_INCOME - 住院卫生材料收入
     */
    public BigDecimal getInpatientMaterialIncome() {
        return inpatientMaterialIncome;
    }

    /**
     * 设置住院卫生材料收入
     *
     * @param inpatientMaterialIncome 住院卫生材料收入
     */
    public void setInpatientMaterialIncome(BigDecimal inpatientMaterialIncome) {
        this.inpatientMaterialIncome = inpatientMaterialIncome;
    }

    /**
     * 获取住院药品收入
     *
     * @return INPATIENT_MED_INCOME - 住院药品收入
     */
    public BigDecimal getInpatientMedIncome() {
        return inpatientMedIncome;
    }

    /**
     * 设置住院药品收入
     *
     * @param inpatientMedIncome 住院药品收入
     */
    public void setInpatientMedIncome(BigDecimal inpatientMedIncome) {
        this.inpatientMedIncome = inpatientMedIncome;
    }

    /**
     * 获取住院西药收入
     *
     * @return INPATIENT_WESTERN_MED_INCOME - 住院西药收入
     */
    public BigDecimal getInpatientWesternMedIncome() {
        return inpatientWesternMedIncome;
    }

    /**
     * 设置住院西药收入
     *
     * @param inpatientWesternMedIncome 住院西药收入
     */
    public void setInpatientWesternMedIncome(BigDecimal inpatientWesternMedIncome) {
        this.inpatientWesternMedIncome = inpatientWesternMedIncome;
    }

    /**
     * 获取住院中成药收入
     *
     * @return INPATIENT_CN_PATENT_INCOME - 住院中成药收入
     */
    public BigDecimal getInpatientCnPatentIncome() {
        return inpatientCnPatentIncome;
    }

    /**
     * 设置住院中成药收入
     *
     * @param inpatientCnPatentIncome 住院中成药收入
     */
    public void setInpatientCnPatentIncome(BigDecimal inpatientCnPatentIncome) {
        this.inpatientCnPatentIncome = inpatientCnPatentIncome;
    }

    /**
     * 获取住院中草药收入
     *
     * @return INPATIENT_CN_HERBAL_INCOME - 住院中草药收入
     */
    public BigDecimal getInpatientCnHerbalIncome() {
        return inpatientCnHerbalIncome;
    }

    /**
     * 设置住院中草药收入
     *
     * @param inpatientCnHerbalIncome 住院中草药收入
     */
    public void setInpatientCnHerbalIncome(BigDecimal inpatientCnHerbalIncome) {
        this.inpatientCnHerbalIncome = inpatientCnHerbalIncome;
    }

    /**
     * 获取住院其他住院收入
     *
     * @return INPATIENT_OTHER_INCOME - 住院其他住院收入
     */
    public BigDecimal getInpatientOtherIncome() {
        return inpatientOtherIncome;
    }

    /**
     * 设置住院其他住院收入
     *
     * @param inpatientOtherIncome 住院其他住院收入
     */
    public void setInpatientOtherIncome(BigDecimal inpatientOtherIncome) {
        this.inpatientOtherIncome = inpatientOtherIncome;
    }

    /**
     * 获取财政补助收入
     *
     * @return FINANCE_SUB_INCOME - 财政补助收入
     */
    public BigDecimal getFinanceSubIncome() {
        return financeSubIncome;
    }

    /**
     * 设置财政补助收入
     *
     * @param financeSubIncome 财政补助收入
     */
    public void setFinanceSubIncome(BigDecimal financeSubIncome) {
        this.financeSubIncome = financeSubIncome;
    }

    /**
     * 获取总支出 
     *
     * @return TOTAL_EXPDEND - 总支出 
     */
    public BigDecimal getTotalExpdend() {
        return totalExpdend;
    }

    /**
     * 设置总支出 
     *
     * @param totalExpdend 总支出 
     */
    public void setTotalExpdend(BigDecimal totalExpdend) {
        this.totalExpdend = totalExpdend;
    }

    /**
     * 获取医疗业务成本
     *
     * @return MEDICAL_EXPDEND - 医疗业务成本
     */
    public BigDecimal getMedicalExpdend() {
        return medicalExpdend;
    }

    /**
     * 设置医疗业务成本
     *
     * @param medicalExpdend 医疗业务成本
     */
    public void setMedicalExpdend(BigDecimal medicalExpdend) {
        this.medicalExpdend = medicalExpdend;
    }

    /**
     * 获取临床服务成本
     *
     * @return CLIN_SVR_EXPDEND - 临床服务成本
     */
    public BigDecimal getClinSvrExpdend() {
        return clinSvrExpdend;
    }

    /**
     * 设置临床服务成本
     *
     * @param clinSvrExpdend 临床服务成本
     */
    public void setClinSvrExpdend(BigDecimal clinSvrExpdend) {
        this.clinSvrExpdend = clinSvrExpdend;
    }

    /**
     * 获取医疗技术成本
     *
     * @return MEDICAL_TECH_EXPDEND - 医疗技术成本
     */
    public BigDecimal getMedicalTechExpdend() {
        return medicalTechExpdend;
    }

    /**
     * 设置医疗技术成本
     *
     * @param medicalTechExpdend 医疗技术成本
     */
    public void setMedicalTechExpdend(BigDecimal medicalTechExpdend) {
        this.medicalTechExpdend = medicalTechExpdend;
    }

    /**
     * 获取医疗辅助成本
     *
     * @return MEDICAL_ASS_EXPDEND - 医疗辅助成本
     */
    public BigDecimal getMedicalAssExpdend() {
        return medicalAssExpdend;
    }

    /**
     * 设置医疗辅助成本
     *
     * @param medicalAssExpdend 医疗辅助成本
     */
    public void setMedicalAssExpdend(BigDecimal medicalAssExpdend) {
        this.medicalAssExpdend = medicalAssExpdend;
    }

    /**
     * 获取财政项目补助支出
     *
     * @return FINAC_ALC_EXPDEND - 财政项目补助支出
     */
    public BigDecimal getFinacAlcExpdend() {
        return finacAlcExpdend;
    }

    /**
     * 设置财政项目补助支出
     *
     * @param finacAlcExpdend 财政项目补助支出
     */
    public void setFinacAlcExpdend(BigDecimal finacAlcExpdend) {
        this.finacAlcExpdend = finacAlcExpdend;
    }

    /**
     * 获取科教项目支出
     *
     * @return EDU_ITEM_EXPDEND - 科教项目支出
     */
    public BigDecimal getEduItemExpdend() {
        return eduItemExpdend;
    }

    /**
     * 设置科教项目支出
     *
     * @param eduItemExpdend 科教项目支出
     */
    public void setEduItemExpdend(BigDecimal eduItemExpdend) {
        this.eduItemExpdend = eduItemExpdend;
    }

    /**
     * 获取管理费用 
     *
     * @return MNG_EXPDEND - 管理费用 
     */
    public BigDecimal getMngExpdend() {
        return mngExpdend;
    }

    /**
     * 设置管理费用 
     *
     * @param mngExpdend 管理费用 
     */
    public void setMngExpdend(BigDecimal mngExpdend) {
        this.mngExpdend = mngExpdend;
    }

    /**
     * 获取离退休费
     *
     * @return RETIRED_EXPDEND - 离退休费
     */
    public BigDecimal getRetiredExpdend() {
        return retiredExpdend;
    }

    /**
     * 设置离退休费
     *
     * @param retiredExpdend 离退休费
     */
    public void setRetiredExpdend(BigDecimal retiredExpdend) {
        this.retiredExpdend = retiredExpdend;
    }

    /**
     * 获取人员支出
     *
     * @return STAFF_EXPDEND - 人员支出
     */
    public BigDecimal getStaffExpdend() {
        return staffExpdend;
    }

    /**
     * 设置人员支出
     *
     * @param staffExpdend 人员支出
     */
    public void setStaffExpdend(BigDecimal staffExpdend) {
        this.staffExpdend = staffExpdend;
    }

    /**
     * 获取基本工资支出
     *
     * @return BASE_WAGE_EXPDEND - 基本工资支出
     */
    public BigDecimal getBaseWageExpdend() {
        return baseWageExpdend;
    }

    /**
     * 设置基本工资支出
     *
     * @param baseWageExpdend 基本工资支出
     */
    public void setBaseWageExpdend(BigDecimal baseWageExpdend) {
        this.baseWageExpdend = baseWageExpdend;
    }

    /**
     * 获取津贴补贴支出
     *
     * @return ALLOWANCE_EXPDEND - 津贴补贴支出
     */
    public BigDecimal getAllowanceExpdend() {
        return allowanceExpdend;
    }

    /**
     * 设置津贴补贴支出
     *
     * @param allowanceExpdend 津贴补贴支出
     */
    public void setAllowanceExpdend(BigDecimal allowanceExpdend) {
        this.allowanceExpdend = allowanceExpdend;
    }

    /**
     * 获取奖金支出
     *
     * @return BONUS_EXPDEND - 奖金支出
     */
    public BigDecimal getBonusExpdend() {
        return bonusExpdend;
    }

    /**
     * 设置奖金支出
     *
     * @param bonusExpdend 奖金支出
     */
    public void setBonusExpdend(BigDecimal bonusExpdend) {
        this.bonusExpdend = bonusExpdend;
    }

    /**
     * 获取绩效工资
     *
     * @return MERIT_EXPDEND - 绩效工资
     */
    public BigDecimal getMeritExpdend() {
        return meritExpdend;
    }

    /**
     * 设置绩效工资
     *
     * @param meritExpdend 绩效工资
     */
    public void setMeritExpdend(BigDecimal meritExpdend) {
        this.meritExpdend = meritExpdend;
    }

    /**
     * 获取卫生材料费
     *
     * @return MATERIAL_EXPDEND - 卫生材料费
     */
    public BigDecimal getMaterialExpdend() {
        return materialExpdend;
    }

    /**
     * 设置卫生材料费
     *
     * @param materialExpdend 卫生材料费
     */
    public void setMaterialExpdend(BigDecimal materialExpdend) {
        this.materialExpdend = materialExpdend;
    }

    /**
     * 获取药品费支出
     *
     * @return MED_EXPDEND - 药品费支出
     */
    public BigDecimal getMedExpdend() {
        return medExpdend;
    }

    /**
     * 设置药品费支出
     *
     * @param medExpdend 药品费支出
     */
    public void setMedExpdend(BigDecimal medExpdend) {
        this.medExpdend = medExpdend;
    }

    /**
     * 获取引智/培智投入经费
     *
     * @return INTRO_TALENTS_EXPDEND - 引智/培智投入经费
     */
    public BigDecimal getIntroTalentsExpdend() {
        return introTalentsExpdend;
    }

    /**
     * 设置引智/培智投入经费
     *
     * @param introTalentsExpdend 引智/培智投入经费
     */
    public void setIntroTalentsExpdend(BigDecimal introTalentsExpdend) {
        this.introTalentsExpdend = introTalentsExpdend;
    }

    /**
     * 获取医疗事故发生责任赔偿总金额 
     *
     * @return MEDC_ACCI_COPST_FUNDS - 医疗事故发生责任赔偿总金额 
     */
    public BigDecimal getMedcAcciCopstFunds() {
        return medcAcciCopstFunds;
    }

    /**
     * 设置医疗事故发生责任赔偿总金额 
     *
     * @param medcAcciCopstFunds 医疗事故发生责任赔偿总金额 
     */
    public void setMedcAcciCopstFunds(BigDecimal medcAcciCopstFunds) {
        this.medcAcciCopstFunds = medcAcciCopstFunds;
    }

    /**
     * 获取资产总额
     *
     * @return TOTAL_ASSET_FUNDS - 资产总额
     */
    public BigDecimal getTotalAssetFunds() {
        return totalAssetFunds;
    }

    /**
     * 设置资产总额
     *
     * @param totalAssetFunds 资产总额
     */
    public void setTotalAssetFunds(BigDecimal totalAssetFunds) {
        this.totalAssetFunds = totalAssetFunds;
    }

    /**
     * 获取卫生机构流动资产
     *
     * @return FLOW_ASSET_FUNDS - 卫生机构流动资产
     */
    public BigDecimal getFlowAssetFunds() {
        return flowAssetFunds;
    }

    /**
     * 设置卫生机构流动资产
     *
     * @param flowAssetFunds 卫生机构流动资产
     */
    public void setFlowAssetFunds(BigDecimal flowAssetFunds) {
        this.flowAssetFunds = flowAssetFunds;
    }

    /**
     * 获取卫生机构净资产
     *
     * @return NET_ASSET_FUNDS - 卫生机构净资产
     */
    public BigDecimal getNetAssetFunds() {
        return netAssetFunds;
    }

    /**
     * 设置卫生机构净资产
     *
     * @param netAssetFunds 卫生机构净资产
     */
    public void setNetAssetFunds(BigDecimal netAssetFunds) {
        this.netAssetFunds = netAssetFunds;
    }

    /**
     * 获取卫生机构负债
     *
     * @return DEBT_FUNDS - 卫生机构负债
     */
    public BigDecimal getDebtFunds() {
        return debtFunds;
    }

    /**
     * 设置卫生机构负债
     *
     * @param debtFunds 卫生机构负债
     */
    public void setDebtFunds(BigDecimal debtFunds) {
        this.debtFunds = debtFunds;
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