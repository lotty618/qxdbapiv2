package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_RESOURCE")
public class OrgResource {
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
    @Column(name = "RESOURCES_ID")
    private String resourcesId;

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
     * 科室数量
     */
    @Column(name = "DEPT_COUNT")
    private Integer deptCount;

    /**
     * 编制床位数床位数
     */
    @Column(name = "FORMATION_BEDS")
    private Integer formationBeds;

    /**
     * 实有床位数
     */
    @Column(name = "ACTION_BED_COUNT")
    private Integer actionBedCount;

    /**
     * 医生数量
     */
    @Column(name = "DOCTOR_COUNT")
    private Integer doctorCount;

    /**
     * 执业医师数量
     */
    @Column(name = "PRACTICING_DOC_COUNT")
    private Integer practicingDocCount;

    /**
     * 注册护士数量
     */
    @Column(name = "REGISTER_NURSE_COUNT")
    private Integer registerNurseCount;

    /**
     * 药师数量
     */
    @Column(name = "PHARMACIST_COUNT")
    private Integer pharmacistCount;

    /**
     * 卫生技术人员数量
     */
    @Column(name = "HEATH_TECHCS_COUNT")
    private Integer heathTechcsCount;

    /**
     * 其他技术人员数量
     */
    @Column(name = "OTHER_TECHCS_COUNT")
    private Integer otherTechcsCount;

    /**
     * 管理人员数量
     */
    @Column(name = "MANAGER_COUNT")
    private Integer managerCount;

    /**
     * 检验技师数量
     */
    @Column(name = "TEST_TECHCS_COUNT")
    private Integer testTechcsCount;

    /**
     * 影像技术数量
     */
    @Column(name = "IMGAGE_TECHCS_COUNT")
    private Integer imgageTechcsCount;

    /**
     * 实际开发总床日数
     */
    @Column(name = "ACTION_OPEN_BED_DAYS")
    private Integer actionOpenBedDays;

    /**
     * 实际占用总床日数
     */
    @Column(name = "ACTION_OCCU_BED_DAYS")
    private Integer actionOccuBedDays;

    /**
     * 出院占总床日数
     */
    @Column(name = "OUT_OCCU_BED_DAYS")
    private Integer outOccuBedDays;

    /**
     * 观察床数
     */
    @Column(name = "OBS_BED_DAYS")
    private Integer obsBedDays;

    /**
     * 出院人数
     */
    @Column(name = "OUT_COUNT")
    private Integer outCount;

    /**
     * 万元以上设备台数
     */
    @Column(name = "UP_TEN_THOUS_COUNT")
    private Integer upTenThousCount;

    /**
     * 10到49万设备台数 
     */
    @Column(name = "BET_10_49_W_COUNT")
    private Integer bet1049WCount;

    /**
     * 50到99万设备台数 
     */
    @Column(name = "BET_50_99_W_COUNT")
    private Integer bet5099WCount;

    /**
     * 100万以上设备台数
     */
    @Column(name = "UP_100_W_COUNT")
    private Integer up100WCount;

    /**
     * 万元以上设备总价值
     */
    @Column(name = "UP_TEN_THS_WORTH")
    private BigDecimal upTenThsWorth;

    /**
     * 负压病房床位数
     */
    @Column(name = "NEG_PRESS_BEDS")
    private Integer negPressBeds;

    /**
     * 儿童重症监护病房床位数 
     */
    @Column(name = "PICU_BEDS")
    private Integer picuBeds;

    /**
     * 呼吸重症监护治疗病房床位数 
     */
    @Column(name = "RICU_BEDS")
    private Integer ricuBeds;

    /**
     * 执业助理医师总数
     */
    @Column(name = "CERTFD_ASS_DOC_COUNT")
    private Integer certfdAssDocCount;

    /**
     * 公共卫生类别执业医师数 
     */
    @Column(name = "CERTFD_PUB_DOC_COUNT")
    private Integer certfdPubDocCount;

    /**
     * 口腔类别执业医师数
     */
    @Column(name = "CERTFD_MOU_DOC_COUNT")
    private Integer certfdMouDocCount;

    /**
     * 临床类别执业医师数 
     */
    @Column(name = "CERTFD_CLIN_DOC_COUNT")
    private Integer certfdClinDocCount;

    /**
     * 中医类别执业医师数
     */
    @Column(name = "CERTFD_TRDN_DOC_COUNT")
    private Integer certfdTrdnDocCount;

    /**
     * 公共卫生类别执业助理医师数 
     */
    @Column(name = "CERTFD_ASS_PUB_DOC_COUNT")
    private Integer certfdAssPubDocCount;

    /**
     * 口腔类别执业助理医师数 
     */
    @Column(name = "CERTFD_ASS_MOU_DOC_COUNT")
    private Integer certfdAssMouDocCount;

    /**
     * 临床类别执业助理医师数 
     */
    @Column(name = "CERTFD_ASS_CLIN_DOC_COUNT")
    private Integer certfdAssClinDocCount;

    /**
     * 中医类别执业助理医师数 
     */
    @Column(name = "CERTFD_ASS_TRDN_DOC_COUNT")
    private Integer certfdAssTrdnDocCount;

    /**
     * 重症医学科（ICU）医师数
     */
    @Column(name = "ICU_DOC_COUNT")
    private Integer icuDocCount;

    /**
     * 临床护士数
     */
    @Column(name = "CLIN_NURSE_COUNT")
    private Integer clinNurseCount;

    /**
     * 病房护士数
     */
    @Column(name = "WARD_NURSE_COUNT")
    private Integer wardNurseCount;

    /**
     * 重症医学科（ICU)护士数 
     */
    @Column(name = "ICU_NURSE_COUNT")
    private Integer icuNurseCount;

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
     * @return RESOURCES_ID - ID[主键]
     */
    public String getResourcesId() {
        return resourcesId;
    }

    /**
     * 设置ID[主键]
     *
     * @param resourcesId ID[主键]
     */
    public void setResourcesId(String resourcesId) {
        this.resourcesId = resourcesId == null ? null : resourcesId.trim();
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
     * 获取科室数量
     *
     * @return DEPT_COUNT - 科室数量
     */
    public Integer getDeptCount() {
        return deptCount;
    }

    /**
     * 设置科室数量
     *
     * @param deptCount 科室数量
     */
    public void setDeptCount(Integer deptCount) {
        this.deptCount = deptCount;
    }

    /**
     * 获取编制床位数床位数
     *
     * @return FORMATION_BEDS - 编制床位数床位数
     */
    public Integer getFormationBeds() {
        return formationBeds;
    }

    /**
     * 设置编制床位数床位数
     *
     * @param formationBeds 编制床位数床位数
     */
    public void setFormationBeds(Integer formationBeds) {
        this.formationBeds = formationBeds;
    }

    /**
     * 获取实有床位数
     *
     * @return ACTION_BED_COUNT - 实有床位数
     */
    public Integer getActionBedCount() {
        return actionBedCount;
    }

    /**
     * 设置实有床位数
     *
     * @param actionBedCount 实有床位数
     */
    public void setActionBedCount(Integer actionBedCount) {
        this.actionBedCount = actionBedCount;
    }

    /**
     * 获取医生数量
     *
     * @return DOCTOR_COUNT - 医生数量
     */
    public Integer getDoctorCount() {
        return doctorCount;
    }

    /**
     * 设置医生数量
     *
     * @param doctorCount 医生数量
     */
    public void setDoctorCount(Integer doctorCount) {
        this.doctorCount = doctorCount;
    }

    /**
     * 获取执业医师数量
     *
     * @return PRACTICING_DOC_COUNT - 执业医师数量
     */
    public Integer getPracticingDocCount() {
        return practicingDocCount;
    }

    /**
     * 设置执业医师数量
     *
     * @param practicingDocCount 执业医师数量
     */
    public void setPracticingDocCount(Integer practicingDocCount) {
        this.practicingDocCount = practicingDocCount;
    }

    /**
     * 获取注册护士数量
     *
     * @return REGISTER_NURSE_COUNT - 注册护士数量
     */
    public Integer getRegisterNurseCount() {
        return registerNurseCount;
    }

    /**
     * 设置注册护士数量
     *
     * @param registerNurseCount 注册护士数量
     */
    public void setRegisterNurseCount(Integer registerNurseCount) {
        this.registerNurseCount = registerNurseCount;
    }

    /**
     * 获取药师数量
     *
     * @return PHARMACIST_COUNT - 药师数量
     */
    public Integer getPharmacistCount() {
        return pharmacistCount;
    }

    /**
     * 设置药师数量
     *
     * @param pharmacistCount 药师数量
     */
    public void setPharmacistCount(Integer pharmacistCount) {
        this.pharmacistCount = pharmacistCount;
    }

    /**
     * 获取卫生技术人员数量
     *
     * @return HEATH_TECHCS_COUNT - 卫生技术人员数量
     */
    public Integer getHeathTechcsCount() {
        return heathTechcsCount;
    }

    /**
     * 设置卫生技术人员数量
     *
     * @param heathTechcsCount 卫生技术人员数量
     */
    public void setHeathTechcsCount(Integer heathTechcsCount) {
        this.heathTechcsCount = heathTechcsCount;
    }

    /**
     * 获取其他技术人员数量
     *
     * @return OTHER_TECHCS_COUNT - 其他技术人员数量
     */
    public Integer getOtherTechcsCount() {
        return otherTechcsCount;
    }

    /**
     * 设置其他技术人员数量
     *
     * @param otherTechcsCount 其他技术人员数量
     */
    public void setOtherTechcsCount(Integer otherTechcsCount) {
        this.otherTechcsCount = otherTechcsCount;
    }

    /**
     * 获取管理人员数量
     *
     * @return MANAGER_COUNT - 管理人员数量
     */
    public Integer getManagerCount() {
        return managerCount;
    }

    /**
     * 设置管理人员数量
     *
     * @param managerCount 管理人员数量
     */
    public void setManagerCount(Integer managerCount) {
        this.managerCount = managerCount;
    }

    /**
     * 获取检验技师数量
     *
     * @return TEST_TECHCS_COUNT - 检验技师数量
     */
    public Integer getTestTechcsCount() {
        return testTechcsCount;
    }

    /**
     * 设置检验技师数量
     *
     * @param testTechcsCount 检验技师数量
     */
    public void setTestTechcsCount(Integer testTechcsCount) {
        this.testTechcsCount = testTechcsCount;
    }

    /**
     * 获取影像技术数量
     *
     * @return IMGAGE_TECHCS_COUNT - 影像技术数量
     */
    public Integer getImgageTechcsCount() {
        return imgageTechcsCount;
    }

    /**
     * 设置影像技术数量
     *
     * @param imgageTechcsCount 影像技术数量
     */
    public void setImgageTechcsCount(Integer imgageTechcsCount) {
        this.imgageTechcsCount = imgageTechcsCount;
    }

    /**
     * 获取实际开发总床日数
     *
     * @return ACTION_OPEN_BED_DAYS - 实际开发总床日数
     */
    public Integer getActionOpenBedDays() {
        return actionOpenBedDays;
    }

    /**
     * 设置实际开发总床日数
     *
     * @param actionOpenBedDays 实际开发总床日数
     */
    public void setActionOpenBedDays(Integer actionOpenBedDays) {
        this.actionOpenBedDays = actionOpenBedDays;
    }

    /**
     * 获取实际占用总床日数
     *
     * @return ACTION_OCCU_BED_DAYS - 实际占用总床日数
     */
    public Integer getActionOccuBedDays() {
        return actionOccuBedDays;
    }

    /**
     * 设置实际占用总床日数
     *
     * @param actionOccuBedDays 实际占用总床日数
     */
    public void setActionOccuBedDays(Integer actionOccuBedDays) {
        this.actionOccuBedDays = actionOccuBedDays;
    }

    /**
     * 获取出院占总床日数
     *
     * @return OUT_OCCU_BED_DAYS - 出院占总床日数
     */
    public Integer getOutOccuBedDays() {
        return outOccuBedDays;
    }

    /**
     * 设置出院占总床日数
     *
     * @param outOccuBedDays 出院占总床日数
     */
    public void setOutOccuBedDays(Integer outOccuBedDays) {
        this.outOccuBedDays = outOccuBedDays;
    }

    /**
     * 获取观察床数
     *
     * @return OBS_BED_DAYS - 观察床数
     */
    public Integer getObsBedDays() {
        return obsBedDays;
    }

    /**
     * 设置观察床数
     *
     * @param obsBedDays 观察床数
     */
    public void setObsBedDays(Integer obsBedDays) {
        this.obsBedDays = obsBedDays;
    }

    /**
     * 获取出院人数
     *
     * @return OUT_COUNT - 出院人数
     */
    public Integer getOutCount() {
        return outCount;
    }

    /**
     * 设置出院人数
     *
     * @param outCount 出院人数
     */
    public void setOutCount(Integer outCount) {
        this.outCount = outCount;
    }

    /**
     * 获取万元以上设备台数
     *
     * @return UP_TEN_THOUS_COUNT - 万元以上设备台数
     */
    public Integer getUpTenThousCount() {
        return upTenThousCount;
    }

    /**
     * 设置万元以上设备台数
     *
     * @param upTenThousCount 万元以上设备台数
     */
    public void setUpTenThousCount(Integer upTenThousCount) {
        this.upTenThousCount = upTenThousCount;
    }

    /**
     * 获取10到49万设备台数 
     *
     * @return BET_10_49_W_COUNT - 10到49万设备台数 
     */
    public Integer getBet1049WCount() {
        return bet1049WCount;
    }

    /**
     * 设置10到49万设备台数 
     *
     * @param bet1049WCount 10到49万设备台数 
     */
    public void setBet1049WCount(Integer bet1049WCount) {
        this.bet1049WCount = bet1049WCount;
    }

    /**
     * 获取50到99万设备台数 
     *
     * @return BET_50_99_W_COUNT - 50到99万设备台数 
     */
    public Integer getBet5099WCount() {
        return bet5099WCount;
    }

    /**
     * 设置50到99万设备台数 
     *
     * @param bet5099WCount 50到99万设备台数 
     */
    public void setBet5099WCount(Integer bet5099WCount) {
        this.bet5099WCount = bet5099WCount;
    }

    /**
     * 获取100万以上设备台数
     *
     * @return UP_100_W_COUNT - 100万以上设备台数
     */
    public Integer getUp100WCount() {
        return up100WCount;
    }

    /**
     * 设置100万以上设备台数
     *
     * @param up100WCount 100万以上设备台数
     */
    public void setUp100WCount(Integer up100WCount) {
        this.up100WCount = up100WCount;
    }

    /**
     * 获取万元以上设备总价值
     *
     * @return UP_TEN_THS_WORTH - 万元以上设备总价值
     */
    public BigDecimal getUpTenThsWorth() {
        return upTenThsWorth;
    }

    /**
     * 设置万元以上设备总价值
     *
     * @param upTenThsWorth 万元以上设备总价值
     */
    public void setUpTenThsWorth(BigDecimal upTenThsWorth) {
        this.upTenThsWorth = upTenThsWorth;
    }

    /**
     * 获取负压病房床位数
     *
     * @return NEG_PRESS_BEDS - 负压病房床位数
     */
    public Integer getNegPressBeds() {
        return negPressBeds;
    }

    /**
     * 设置负压病房床位数
     *
     * @param negPressBeds 负压病房床位数
     */
    public void setNegPressBeds(Integer negPressBeds) {
        this.negPressBeds = negPressBeds;
    }

    /**
     * 获取儿童重症监护病房床位数 
     *
     * @return PICU_BEDS - 儿童重症监护病房床位数 
     */
    public Integer getPicuBeds() {
        return picuBeds;
    }

    /**
     * 设置儿童重症监护病房床位数 
     *
     * @param picuBeds 儿童重症监护病房床位数 
     */
    public void setPicuBeds(Integer picuBeds) {
        this.picuBeds = picuBeds;
    }

    /**
     * 获取呼吸重症监护治疗病房床位数 
     *
     * @return RICU_BEDS - 呼吸重症监护治疗病房床位数 
     */
    public Integer getRicuBeds() {
        return ricuBeds;
    }

    /**
     * 设置呼吸重症监护治疗病房床位数 
     *
     * @param ricuBeds 呼吸重症监护治疗病房床位数 
     */
    public void setRicuBeds(Integer ricuBeds) {
        this.ricuBeds = ricuBeds;
    }

    /**
     * 获取执业助理医师总数
     *
     * @return CERTFD_ASS_DOC_COUNT - 执业助理医师总数
     */
    public Integer getCertfdAssDocCount() {
        return certfdAssDocCount;
    }

    /**
     * 设置执业助理医师总数
     *
     * @param certfdAssDocCount 执业助理医师总数
     */
    public void setCertfdAssDocCount(Integer certfdAssDocCount) {
        this.certfdAssDocCount = certfdAssDocCount;
    }

    /**
     * 获取公共卫生类别执业医师数 
     *
     * @return CERTFD_PUB_DOC_COUNT - 公共卫生类别执业医师数 
     */
    public Integer getCertfdPubDocCount() {
        return certfdPubDocCount;
    }

    /**
     * 设置公共卫生类别执业医师数 
     *
     * @param certfdPubDocCount 公共卫生类别执业医师数 
     */
    public void setCertfdPubDocCount(Integer certfdPubDocCount) {
        this.certfdPubDocCount = certfdPubDocCount;
    }

    /**
     * 获取口腔类别执业医师数
     *
     * @return CERTFD_MOU_DOC_COUNT - 口腔类别执业医师数
     */
    public Integer getCertfdMouDocCount() {
        return certfdMouDocCount;
    }

    /**
     * 设置口腔类别执业医师数
     *
     * @param certfdMouDocCount 口腔类别执业医师数
     */
    public void setCertfdMouDocCount(Integer certfdMouDocCount) {
        this.certfdMouDocCount = certfdMouDocCount;
    }

    /**
     * 获取临床类别执业医师数 
     *
     * @return CERTFD_CLIN_DOC_COUNT - 临床类别执业医师数 
     */
    public Integer getCertfdClinDocCount() {
        return certfdClinDocCount;
    }

    /**
     * 设置临床类别执业医师数 
     *
     * @param certfdClinDocCount 临床类别执业医师数 
     */
    public void setCertfdClinDocCount(Integer certfdClinDocCount) {
        this.certfdClinDocCount = certfdClinDocCount;
    }

    /**
     * 获取中医类别执业医师数
     *
     * @return CERTFD_TRDN_DOC_COUNT - 中医类别执业医师数
     */
    public Integer getCertfdTrdnDocCount() {
        return certfdTrdnDocCount;
    }

    /**
     * 设置中医类别执业医师数
     *
     * @param certfdTrdnDocCount 中医类别执业医师数
     */
    public void setCertfdTrdnDocCount(Integer certfdTrdnDocCount) {
        this.certfdTrdnDocCount = certfdTrdnDocCount;
    }

    /**
     * 获取公共卫生类别执业助理医师数 
     *
     * @return CERTFD_ASS_PUB_DOC_COUNT - 公共卫生类别执业助理医师数 
     */
    public Integer getCertfdAssPubDocCount() {
        return certfdAssPubDocCount;
    }

    /**
     * 设置公共卫生类别执业助理医师数 
     *
     * @param certfdAssPubDocCount 公共卫生类别执业助理医师数 
     */
    public void setCertfdAssPubDocCount(Integer certfdAssPubDocCount) {
        this.certfdAssPubDocCount = certfdAssPubDocCount;
    }

    /**
     * 获取口腔类别执业助理医师数 
     *
     * @return CERTFD_ASS_MOU_DOC_COUNT - 口腔类别执业助理医师数 
     */
    public Integer getCertfdAssMouDocCount() {
        return certfdAssMouDocCount;
    }

    /**
     * 设置口腔类别执业助理医师数 
     *
     * @param certfdAssMouDocCount 口腔类别执业助理医师数 
     */
    public void setCertfdAssMouDocCount(Integer certfdAssMouDocCount) {
        this.certfdAssMouDocCount = certfdAssMouDocCount;
    }

    /**
     * 获取临床类别执业助理医师数 
     *
     * @return CERTFD_ASS_CLIN_DOC_COUNT - 临床类别执业助理医师数 
     */
    public Integer getCertfdAssClinDocCount() {
        return certfdAssClinDocCount;
    }

    /**
     * 设置临床类别执业助理医师数 
     *
     * @param certfdAssClinDocCount 临床类别执业助理医师数 
     */
    public void setCertfdAssClinDocCount(Integer certfdAssClinDocCount) {
        this.certfdAssClinDocCount = certfdAssClinDocCount;
    }

    /**
     * 获取中医类别执业助理医师数 
     *
     * @return CERTFD_ASS_TRDN_DOC_COUNT - 中医类别执业助理医师数 
     */
    public Integer getCertfdAssTrdnDocCount() {
        return certfdAssTrdnDocCount;
    }

    /**
     * 设置中医类别执业助理医师数 
     *
     * @param certfdAssTrdnDocCount 中医类别执业助理医师数 
     */
    public void setCertfdAssTrdnDocCount(Integer certfdAssTrdnDocCount) {
        this.certfdAssTrdnDocCount = certfdAssTrdnDocCount;
    }

    /**
     * 获取重症医学科（ICU）医师数
     *
     * @return ICU_DOC_COUNT - 重症医学科（ICU）医师数
     */
    public Integer getIcuDocCount() {
        return icuDocCount;
    }

    /**
     * 设置重症医学科（ICU）医师数
     *
     * @param icuDocCount 重症医学科（ICU）医师数
     */
    public void setIcuDocCount(Integer icuDocCount) {
        this.icuDocCount = icuDocCount;
    }

    /**
     * 获取临床护士数
     *
     * @return CLIN_NURSE_COUNT - 临床护士数
     */
    public Integer getClinNurseCount() {
        return clinNurseCount;
    }

    /**
     * 设置临床护士数
     *
     * @param clinNurseCount 临床护士数
     */
    public void setClinNurseCount(Integer clinNurseCount) {
        this.clinNurseCount = clinNurseCount;
    }

    /**
     * 获取病房护士数
     *
     * @return WARD_NURSE_COUNT - 病房护士数
     */
    public Integer getWardNurseCount() {
        return wardNurseCount;
    }

    /**
     * 设置病房护士数
     *
     * @param wardNurseCount 病房护士数
     */
    public void setWardNurseCount(Integer wardNurseCount) {
        this.wardNurseCount = wardNurseCount;
    }

    /**
     * 获取重症医学科（ICU)护士数 
     *
     * @return ICU_NURSE_COUNT - 重症医学科（ICU)护士数 
     */
    public Integer getIcuNurseCount() {
        return icuNurseCount;
    }

    /**
     * 设置重症医学科（ICU)护士数 
     *
     * @param icuNurseCount 重症医学科（ICU)护士数 
     */
    public void setIcuNurseCount(Integer icuNurseCount) {
        this.icuNurseCount = icuNurseCount;
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