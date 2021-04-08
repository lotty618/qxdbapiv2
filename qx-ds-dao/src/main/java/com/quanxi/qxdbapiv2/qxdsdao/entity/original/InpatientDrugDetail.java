package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "INPATIENT_DRUG_DETAIL")
public class InpatientDrugDetail {
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
     * 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 用药信息序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "INPATIENT_DRUG_ID")
    private String inpatientDrugId;

    /**
     * 药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     */
    @Column(name = "DRUG_FORM_CODE")
    private String drugFormCode;

    /**
     * 药物剂型中文名称（药物剂型类别在特定编码体系中的中文名称）
     */
    @Column(name = "DRUG_FORM_CN")
    private String drugFormCn;

    /**
     * 药物标准编码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    @Column(name = "DRUG_STANDARD_CODE")
    private String drugStandardCode;

    /**
     * 药物标准名称（药物在标准编码体系中的名称）
     */
    @Column(name = "DRUG_STANDARD_NAME")
    private String drugStandardName;

    /**
     * 药物院内编码（药物在本机构内部编码体系中的代码）
     */
    @Column(name = "DRUG_LOCAL_CODE")
    private String drugLocalCode;

    /**
     * 药物院内名称（药物在本机构内部编码体系中的名称）
     */
    @Column(name = "DRUG_LOCAL_NAME")
    private String drugLocalName;

    /**
     * 中药类别代码CV06.00.101（中药使用类别代码）
     */
    @Column(name = "CN_MEDICINE_TYPE_CODE")
    private String cnMedicineTypeCode;

    /**
     * 中药类别中文名称（中药使用类别中文名称）
     */
    @Column(name = "CN_MEDICINE_TYPE_CN")
    private String cnMedicineTypeCn;

    /**
     * 药物规格（药物规格的描述，如 0.25g）
     */
    @Column(name = "DRUG_SPEC")
    private String drugSpec;

    /**
     * 药物使用途径代码CV06.00.102（药物使用途径的代码）
     */
    @Column(name = "DRUG_ROUTE_CODE")
    private String drugRouteCode;

    /**
     * 药物使用途径中文名称（药物使用途径的中文名称）
     */
    @Column(name = "DRUG_ROUTE_CN")
    private String drugRouteCn;

    /**
     * 药物使用频率代码CV06.00.228（单位时间内药物使用的次数代码）
     */
    @Column(name = "DRUG_USING_FREQ_CODE")
    private String drugUsingFreqCode;

    /**
     * 药物使用频率中文名称（单位时间内药物使用的次数中文名称）
     */
    @Column(name = "DRUG_USING_FREQ_CN")
    private String drugUsingFreqCn;

    /**
     * 药物使用剂量单位（药物使用的剂量单位）
     */
    @Column(name = "DRUG_DOSE_UNIT")
    private String drugDoseUnit;

    /**
     * 药物使用次剂量（单次使用药物的剂量）
     */
    @Column(name = "DRUG_PER_DOSE")
    private BigDecimal drugPerDose;

    /**
     * 用药天数（持续用药的合计天数，计量单位为天）
     */
    @Column(name = "DRUG_USING_DAYS")
    private Integer drugUsingDays;

    /**
     * 用药停止日期（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DRUG_STOP_DATE")
    private String drugStopDate;

    /**
     * 药物使用-总剂量单位（药物使用总剂量单位）
     */
    @Column(name = "DRUG_TOTAL_UNIT")
    private String drugTotalUnit;

    /**
     * 药物使用总剂量（药物使用的总剂量）
     */
    @Column(name = "DRUG_TOTAL_DOSE")
    private BigDecimal drugTotalDose;

    /**
     * 成组号（0-无分组）（成组号）
     */
    @Column(name = "DRUG_GROUP_NO")
    private String drugGroupNo;

    /**
     * 开药日期（开药时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PRESCRIPTION_DATE")
    private String prescriptionDate;

    /**
     * 发药日期（服务对象用药的时点,以24小时计）
     */
    @Column(name = "DISPENSING_DATE")
    private String dispensingDate;

    /**
     * 单价（卫生费用的单价，计量单位为人民币元）
     */
    @Column(name = "PRICE_ITEM_PRICE")
    private BigDecimal priceItemPrice;

    /**
     * 数量（产生此项费用的数量）
     */
    @Column(name = "PRICE_ITEM_QUANTITY")
    private BigDecimal priceItemQuantity;

    /**
     * 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    @Column(name = "FEE_AMOUNT")
    private BigDecimal feeAmount;

    /**
     * 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    @Column(name = "INSURANCE_CHARGES")
    private BigDecimal insuranceCharges;

    /**
     * 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    @Column(name = "SELF_PAYMENT")
    private BigDecimal selfPayment;

    /**
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * DDD值/最小剂量（要求药物使用的最小剂量值）
     */
    @Column(name = "DDD_VALUE")
    private BigDecimal dddValue;

    /**
     * 抗菌药物标志0否 1是（标识是否是抗菌药物）
     */
    @Column(name = "ANTIBACTERIAL_FLAG")
    private String antibacterialFlag;

    /**
     * 药物不良反应情况 （对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    @Column(name = "DRUG_ADVERSE_REACTION")
    private String drugAdverseReaction;

    /**
     * 皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     */
    @Column(name = "SKIN_TEST_DISCRIMINATION")
    private String skinTestDiscrimination;

    /**
     * 预防性标志0否 1是（用药为预防性目的标志）
     */
    @Column(name = "HAS_CONTIGENCY")
    private Short hasContigency;

    /**
     * 产地名称（若是药品，必填。生产企业（或产地）名称。）
     */
    @Column(name = "PLACE_OF_ORI")
    private String placeOfOri;

    /**
     * 抗生素级别1-非限制使用级；2-限制使用级；3-特殊使用级；8-非抗菌药物；9-其他
     */
    @Column(name = "ANT_GRADE")
    private String antGrade;

    /**
     * 精神药物标志1-精一；2-精二；8-非精神用药；9-其他（精神药物标识）
     */
    @Column(name = "HAS_SPI_DRUG")
    private String hasSpiDrug;

    /**
     * 麻醉药物标志0-否；1-是；9-未知（麻醉药物标识）
     */
    @Column(name = "HAS_ANE_DRUG")
    private String hasAneDrug;

    /**
     * 基本药物标志1-国家基本药物；2-省增补基本药物；3-地市增补基本药物；4-区县增补基本药物；8-非基本药物；9-其他（基本药物标识）
     */
    @Column(name = "HAS_BASIC_DRUG")
    private String hasBasicDrug;

    /**
     * 输液用药标志0-否；1-是；9-未知（输液用药标识）
     */
    @Column(name = "HAS_DRUG_INF")
    private String hasDrugInf;

    /**
     * 省医保编码（上传全省统一的医保编码。）
     */
    @Column(name = "PROV_HEALTHCARE_CODE")
    private String provHealthcareCode;

    /**
     * 市医保代码（市医保相关的医保代码。）
     */
    @Column(name = "CITY_HEALTHCARE_CODE")
    private String cityHealthcareCode;

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
     * 医嘱编号（按照某一特定编码规则赋予医嘱的顺序号）
     */
    @Column(name = "ORDER_ID")
    private String orderId;

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
     * 获取结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     *
     * @param setSerNum 结算流水号[主键]约束引用INPATIENT_EXPENSE的SET_SER_NUM（每条记录在数据库中的唯一序号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取用药信息序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return INPATIENT_DRUG_ID - 用药信息序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getInpatientDrugId() {
        return inpatientDrugId;
    }

    /**
     * 设置用药信息序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param inpatientDrugId 用药信息序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setInpatientDrugId(String inpatientDrugId) {
        this.inpatientDrugId = inpatientDrugId == null ? null : inpatientDrugId.trim();
    }

    /**
     * 获取药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     *
     * @return DRUG_FORM_CODE - 药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     */
    public String getDrugFormCode() {
        return drugFormCode;
    }

    /**
     * 设置药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     *
     * @param drugFormCode 药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     */
    public void setDrugFormCode(String drugFormCode) {
        this.drugFormCode = drugFormCode == null ? null : drugFormCode.trim();
    }

    /**
     * 获取药物剂型中文名称（药物剂型类别在特定编码体系中的中文名称）
     *
     * @return DRUG_FORM_CN - 药物剂型中文名称（药物剂型类别在特定编码体系中的中文名称）
     */
    public String getDrugFormCn() {
        return drugFormCn;
    }

    /**
     * 设置药物剂型中文名称（药物剂型类别在特定编码体系中的中文名称）
     *
     * @param drugFormCn 药物剂型中文名称（药物剂型类别在特定编码体系中的中文名称）
     */
    public void setDrugFormCn(String drugFormCn) {
        this.drugFormCn = drugFormCn == null ? null : drugFormCn.trim();
    }

    /**
     * 获取药物标准编码DIR_MEDICINE（药物在标准编码体系中的代码）
     *
     * @return DRUG_STANDARD_CODE - 药物标准编码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    public String getDrugStandardCode() {
        return drugStandardCode;
    }

    /**
     * 设置药物标准编码DIR_MEDICINE（药物在标准编码体系中的代码）
     *
     * @param drugStandardCode 药物标准编码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    public void setDrugStandardCode(String drugStandardCode) {
        this.drugStandardCode = drugStandardCode == null ? null : drugStandardCode.trim();
    }

    /**
     * 获取药物标准名称（药物在标准编码体系中的名称）
     *
     * @return DRUG_STANDARD_NAME - 药物标准名称（药物在标准编码体系中的名称）
     */
    public String getDrugStandardName() {
        return drugStandardName;
    }

    /**
     * 设置药物标准名称（药物在标准编码体系中的名称）
     *
     * @param drugStandardName 药物标准名称（药物在标准编码体系中的名称）
     */
    public void setDrugStandardName(String drugStandardName) {
        this.drugStandardName = drugStandardName == null ? null : drugStandardName.trim();
    }

    /**
     * 获取药物院内编码（药物在本机构内部编码体系中的代码）
     *
     * @return DRUG_LOCAL_CODE - 药物院内编码（药物在本机构内部编码体系中的代码）
     */
    public String getDrugLocalCode() {
        return drugLocalCode;
    }

    /**
     * 设置药物院内编码（药物在本机构内部编码体系中的代码）
     *
     * @param drugLocalCode 药物院内编码（药物在本机构内部编码体系中的代码）
     */
    public void setDrugLocalCode(String drugLocalCode) {
        this.drugLocalCode = drugLocalCode == null ? null : drugLocalCode.trim();
    }

    /**
     * 获取药物院内名称（药物在本机构内部编码体系中的名称）
     *
     * @return DRUG_LOCAL_NAME - 药物院内名称（药物在本机构内部编码体系中的名称）
     */
    public String getDrugLocalName() {
        return drugLocalName;
    }

    /**
     * 设置药物院内名称（药物在本机构内部编码体系中的名称）
     *
     * @param drugLocalName 药物院内名称（药物在本机构内部编码体系中的名称）
     */
    public void setDrugLocalName(String drugLocalName) {
        this.drugLocalName = drugLocalName == null ? null : drugLocalName.trim();
    }

    /**
     * 获取中药类别代码CV06.00.101（中药使用类别代码）
     *
     * @return CN_MEDICINE_TYPE_CODE - 中药类别代码CV06.00.101（中药使用类别代码）
     */
    public String getCnMedicineTypeCode() {
        return cnMedicineTypeCode;
    }

    /**
     * 设置中药类别代码CV06.00.101（中药使用类别代码）
     *
     * @param cnMedicineTypeCode 中药类别代码CV06.00.101（中药使用类别代码）
     */
    public void setCnMedicineTypeCode(String cnMedicineTypeCode) {
        this.cnMedicineTypeCode = cnMedicineTypeCode == null ? null : cnMedicineTypeCode.trim();
    }

    /**
     * 获取中药类别中文名称（中药使用类别中文名称）
     *
     * @return CN_MEDICINE_TYPE_CN - 中药类别中文名称（中药使用类别中文名称）
     */
    public String getCnMedicineTypeCn() {
        return cnMedicineTypeCn;
    }

    /**
     * 设置中药类别中文名称（中药使用类别中文名称）
     *
     * @param cnMedicineTypeCn 中药类别中文名称（中药使用类别中文名称）
     */
    public void setCnMedicineTypeCn(String cnMedicineTypeCn) {
        this.cnMedicineTypeCn = cnMedicineTypeCn == null ? null : cnMedicineTypeCn.trim();
    }

    /**
     * 获取药物规格（药物规格的描述，如 0.25g）
     *
     * @return DRUG_SPEC - 药物规格（药物规格的描述，如 0.25g）
     */
    public String getDrugSpec() {
        return drugSpec;
    }

    /**
     * 设置药物规格（药物规格的描述，如 0.25g）
     *
     * @param drugSpec 药物规格（药物规格的描述，如 0.25g）
     */
    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec == null ? null : drugSpec.trim();
    }

    /**
     * 获取药物使用途径代码CV06.00.102（药物使用途径的代码）
     *
     * @return DRUG_ROUTE_CODE - 药物使用途径代码CV06.00.102（药物使用途径的代码）
     */
    public String getDrugRouteCode() {
        return drugRouteCode;
    }

    /**
     * 设置药物使用途径代码CV06.00.102（药物使用途径的代码）
     *
     * @param drugRouteCode 药物使用途径代码CV06.00.102（药物使用途径的代码）
     */
    public void setDrugRouteCode(String drugRouteCode) {
        this.drugRouteCode = drugRouteCode == null ? null : drugRouteCode.trim();
    }

    /**
     * 获取药物使用途径中文名称（药物使用途径的中文名称）
     *
     * @return DRUG_ROUTE_CN - 药物使用途径中文名称（药物使用途径的中文名称）
     */
    public String getDrugRouteCn() {
        return drugRouteCn;
    }

    /**
     * 设置药物使用途径中文名称（药物使用途径的中文名称）
     *
     * @param drugRouteCn 药物使用途径中文名称（药物使用途径的中文名称）
     */
    public void setDrugRouteCn(String drugRouteCn) {
        this.drugRouteCn = drugRouteCn == null ? null : drugRouteCn.trim();
    }

    /**
     * 获取药物使用频率代码CV06.00.228（单位时间内药物使用的次数代码）
     *
     * @return DRUG_USING_FREQ_CODE - 药物使用频率代码CV06.00.228（单位时间内药物使用的次数代码）
     */
    public String getDrugUsingFreqCode() {
        return drugUsingFreqCode;
    }

    /**
     * 设置药物使用频率代码CV06.00.228（单位时间内药物使用的次数代码）
     *
     * @param drugUsingFreqCode 药物使用频率代码CV06.00.228（单位时间内药物使用的次数代码）
     */
    public void setDrugUsingFreqCode(String drugUsingFreqCode) {
        this.drugUsingFreqCode = drugUsingFreqCode == null ? null : drugUsingFreqCode.trim();
    }

    /**
     * 获取药物使用频率中文名称（单位时间内药物使用的次数中文名称）
     *
     * @return DRUG_USING_FREQ_CN - 药物使用频率中文名称（单位时间内药物使用的次数中文名称）
     */
    public String getDrugUsingFreqCn() {
        return drugUsingFreqCn;
    }

    /**
     * 设置药物使用频率中文名称（单位时间内药物使用的次数中文名称）
     *
     * @param drugUsingFreqCn 药物使用频率中文名称（单位时间内药物使用的次数中文名称）
     */
    public void setDrugUsingFreqCn(String drugUsingFreqCn) {
        this.drugUsingFreqCn = drugUsingFreqCn == null ? null : drugUsingFreqCn.trim();
    }

    /**
     * 获取药物使用剂量单位（药物使用的剂量单位）
     *
     * @return DRUG_DOSE_UNIT - 药物使用剂量单位（药物使用的剂量单位）
     */
    public String getDrugDoseUnit() {
        return drugDoseUnit;
    }

    /**
     * 设置药物使用剂量单位（药物使用的剂量单位）
     *
     * @param drugDoseUnit 药物使用剂量单位（药物使用的剂量单位）
     */
    public void setDrugDoseUnit(String drugDoseUnit) {
        this.drugDoseUnit = drugDoseUnit == null ? null : drugDoseUnit.trim();
    }

    /**
     * 获取药物使用次剂量（单次使用药物的剂量）
     *
     * @return DRUG_PER_DOSE - 药物使用次剂量（单次使用药物的剂量）
     */
    public BigDecimal getDrugPerDose() {
        return drugPerDose;
    }

    /**
     * 设置药物使用次剂量（单次使用药物的剂量）
     *
     * @param drugPerDose 药物使用次剂量（单次使用药物的剂量）
     */
    public void setDrugPerDose(BigDecimal drugPerDose) {
        this.drugPerDose = drugPerDose;
    }

    /**
     * 获取用药天数（持续用药的合计天数，计量单位为天）
     *
     * @return DRUG_USING_DAYS - 用药天数（持续用药的合计天数，计量单位为天）
     */
    public Integer getDrugUsingDays() {
        return drugUsingDays;
    }

    /**
     * 设置用药天数（持续用药的合计天数，计量单位为天）
     *
     * @param drugUsingDays 用药天数（持续用药的合计天数，计量单位为天）
     */
    public void setDrugUsingDays(Integer drugUsingDays) {
        this.drugUsingDays = drugUsingDays;
    }

    /**
     * 获取用药停止日期（患者用药停止日的公元纪年日期和时间的完整描述）
     *
     * @return DRUG_STOP_DATE - 用药停止日期（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    public String getDrugStopDate() {
        return drugStopDate;
    }

    /**
     * 设置用药停止日期（患者用药停止日的公元纪年日期和时间的完整描述）
     *
     * @param drugStopDate 用药停止日期（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    public void setDrugStopDate(String drugStopDate) {
        this.drugStopDate = drugStopDate == null ? null : drugStopDate.trim();
    }

    /**
     * 获取药物使用-总剂量单位（药物使用总剂量单位）
     *
     * @return DRUG_TOTAL_UNIT - 药物使用-总剂量单位（药物使用总剂量单位）
     */
    public String getDrugTotalUnit() {
        return drugTotalUnit;
    }

    /**
     * 设置药物使用-总剂量单位（药物使用总剂量单位）
     *
     * @param drugTotalUnit 药物使用-总剂量单位（药物使用总剂量单位）
     */
    public void setDrugTotalUnit(String drugTotalUnit) {
        this.drugTotalUnit = drugTotalUnit == null ? null : drugTotalUnit.trim();
    }

    /**
     * 获取药物使用总剂量（药物使用的总剂量）
     *
     * @return DRUG_TOTAL_DOSE - 药物使用总剂量（药物使用的总剂量）
     */
    public BigDecimal getDrugTotalDose() {
        return drugTotalDose;
    }

    /**
     * 设置药物使用总剂量（药物使用的总剂量）
     *
     * @param drugTotalDose 药物使用总剂量（药物使用的总剂量）
     */
    public void setDrugTotalDose(BigDecimal drugTotalDose) {
        this.drugTotalDose = drugTotalDose;
    }

    /**
     * 获取成组号（0-无分组）（成组号）
     *
     * @return DRUG_GROUP_NO - 成组号（0-无分组）（成组号）
     */
    public String getDrugGroupNo() {
        return drugGroupNo;
    }

    /**
     * 设置成组号（0-无分组）（成组号）
     *
     * @param drugGroupNo 成组号（0-无分组）（成组号）
     */
    public void setDrugGroupNo(String drugGroupNo) {
        this.drugGroupNo = drugGroupNo == null ? null : drugGroupNo.trim();
    }

    /**
     * 获取开药日期（开药时的公元纪年日期和时间的完整描述）
     *
     * @return PRESCRIPTION_DATE - 开药日期（开药时的公元纪年日期和时间的完整描述）
     */
    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * 设置开药日期（开药时的公元纪年日期和时间的完整描述）
     *
     * @param prescriptionDate 开药日期（开药时的公元纪年日期和时间的完整描述）
     */
    public void setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = prescriptionDate == null ? null : prescriptionDate.trim();
    }

    /**
     * 获取发药日期（服务对象用药的时点,以24小时计）
     *
     * @return DISPENSING_DATE - 发药日期（服务对象用药的时点,以24小时计）
     */
    public String getDispensingDate() {
        return dispensingDate;
    }

    /**
     * 设置发药日期（服务对象用药的时点,以24小时计）
     *
     * @param dispensingDate 发药日期（服务对象用药的时点,以24小时计）
     */
    public void setDispensingDate(String dispensingDate) {
        this.dispensingDate = dispensingDate == null ? null : dispensingDate.trim();
    }

    /**
     * 获取单价（卫生费用的单价，计量单位为人民币元）
     *
     * @return PRICE_ITEM_PRICE - 单价（卫生费用的单价，计量单位为人民币元）
     */
    public BigDecimal getPriceItemPrice() {
        return priceItemPrice;
    }

    /**
     * 设置单价（卫生费用的单价，计量单位为人民币元）
     *
     * @param priceItemPrice 单价（卫生费用的单价，计量单位为人民币元）
     */
    public void setPriceItemPrice(BigDecimal priceItemPrice) {
        this.priceItemPrice = priceItemPrice;
    }

    /**
     * 获取数量（产生此项费用的数量）
     *
     * @return PRICE_ITEM_QUANTITY - 数量（产生此项费用的数量）
     */
    public BigDecimal getPriceItemQuantity() {
        return priceItemQuantity;
    }

    /**
     * 设置数量（产生此项费用的数量）
     *
     * @param priceItemQuantity 数量（产生此项费用的数量）
     */
    public void setPriceItemQuantity(BigDecimal priceItemQuantity) {
        this.priceItemQuantity = priceItemQuantity;
    }

    /**
     * 获取费用金额（元)（项目的费用金额，计量单位为人民币元）
     *
     * @return FEE_AMOUNT - 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * 设置费用金额（元)（项目的费用金额，计量单位为人民币元）
     *
     * @param feeAmount 费用金额（元)（项目的费用金额，计量单位为人民币元）
     */
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * 获取医保金额（该项目医保报销的金额，计量单位为人民币元）
     *
     * @return INSURANCE_CHARGES - 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    public BigDecimal getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * 设置医保金额（该项目医保报销的金额，计量单位为人民币元）
     *
     * @param insuranceCharges 医保金额（该项目医保报销的金额，计量单位为人民币元）
     */
    public void setInsuranceCharges(BigDecimal insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    /**
     * 获取个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     *
     * @return SELF_PAYMENT - 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    public BigDecimal getSelfPayment() {
        return selfPayment;
    }

    /**
     * 设置个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     *
     * @param selfPayment 个人承担费用金额（个人承担的费用金额，计量单位为人民币元）
     */
    public void setSelfPayment(BigDecimal selfPayment) {
        this.selfPayment = selfPayment;
    }

    /**
     * 获取备注（需要添加的注释说明的具体内容）
     *
     * @return NOTES - 备注（需要添加的注释说明的具体内容）
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注（需要添加的注释说明的具体内容）
     *
     * @param notes 备注（需要添加的注释说明的具体内容）
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * 获取DDD值/最小剂量（要求药物使用的最小剂量值）
     *
     * @return DDD_VALUE - DDD值/最小剂量（要求药物使用的最小剂量值）
     */
    public BigDecimal getDddValue() {
        return dddValue;
    }

    /**
     * 设置DDD值/最小剂量（要求药物使用的最小剂量值）
     *
     * @param dddValue DDD值/最小剂量（要求药物使用的最小剂量值）
     */
    public void setDddValue(BigDecimal dddValue) {
        this.dddValue = dddValue;
    }

    /**
     * 获取抗菌药物标志0否 1是（标识是否是抗菌药物）
     *
     * @return ANTIBACTERIAL_FLAG - 抗菌药物标志0否 1是（标识是否是抗菌药物）
     */
    public String getAntibacterialFlag() {
        return antibacterialFlag;
    }

    /**
     * 设置抗菌药物标志0否 1是（标识是否是抗菌药物）
     *
     * @param antibacterialFlag 抗菌药物标志0否 1是（标识是否是抗菌药物）
     */
    public void setAntibacterialFlag(String antibacterialFlag) {
        this.antibacterialFlag = antibacterialFlag == null ? null : antibacterialFlag.trim();
    }

    /**
     * 获取药物不良反应情况 （对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     *
     * @return DRUG_ADVERSE_REACTION - 药物不良反应情况 （对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    public String getDrugAdverseReaction() {
        return drugAdverseReaction;
    }

    /**
     * 设置药物不良反应情况 （对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     *
     * @param drugAdverseReaction 药物不良反应情况 （对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    public void setDrugAdverseReaction(String drugAdverseReaction) {
        this.drugAdverseReaction = drugAdverseReaction == null ? null : drugAdverseReaction.trim();
    }

    /**
     * 获取皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     *
     * @return SKIN_TEST_DISCRIMINATION - 皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     */
    public String getSkinTestDiscrimination() {
        return skinTestDiscrimination;
    }

    /**
     * 设置皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     *
     * @param skinTestDiscrimination 皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     */
    public void setSkinTestDiscrimination(String skinTestDiscrimination) {
        this.skinTestDiscrimination = skinTestDiscrimination == null ? null : skinTestDiscrimination.trim();
    }

    /**
     * 获取预防性标志0否 1是（用药为预防性目的标志）
     *
     * @return HAS_CONTIGENCY - 预防性标志0否 1是（用药为预防性目的标志）
     */
    public Short getHasContigency() {
        return hasContigency;
    }

    /**
     * 设置预防性标志0否 1是（用药为预防性目的标志）
     *
     * @param hasContigency 预防性标志0否 1是（用药为预防性目的标志）
     */
    public void setHasContigency(Short hasContigency) {
        this.hasContigency = hasContigency;
    }

    /**
     * 获取产地名称（若是药品，必填。生产企业（或产地）名称。）
     *
     * @return PLACE_OF_ORI - 产地名称（若是药品，必填。生产企业（或产地）名称。）
     */
    public String getPlaceOfOri() {
        return placeOfOri;
    }

    /**
     * 设置产地名称（若是药品，必填。生产企业（或产地）名称。）
     *
     * @param placeOfOri 产地名称（若是药品，必填。生产企业（或产地）名称。）
     */
    public void setPlaceOfOri(String placeOfOri) {
        this.placeOfOri = placeOfOri == null ? null : placeOfOri.trim();
    }

    /**
     * 获取抗生素级别1-非限制使用级；2-限制使用级；3-特殊使用级；8-非抗菌药物；9-其他
     *
     * @return ANT_GRADE - 抗生素级别1-非限制使用级；2-限制使用级；3-特殊使用级；8-非抗菌药物；9-其他
     */
    public String getAntGrade() {
        return antGrade;
    }

    /**
     * 设置抗生素级别1-非限制使用级；2-限制使用级；3-特殊使用级；8-非抗菌药物；9-其他
     *
     * @param antGrade 抗生素级别1-非限制使用级；2-限制使用级；3-特殊使用级；8-非抗菌药物；9-其他
     */
    public void setAntGrade(String antGrade) {
        this.antGrade = antGrade == null ? null : antGrade.trim();
    }

    /**
     * 获取精神药物标志1-精一；2-精二；8-非精神用药；9-其他（精神药物标识）
     *
     * @return HAS_SPI_DRUG - 精神药物标志1-精一；2-精二；8-非精神用药；9-其他（精神药物标识）
     */
    public String getHasSpiDrug() {
        return hasSpiDrug;
    }

    /**
     * 设置精神药物标志1-精一；2-精二；8-非精神用药；9-其他（精神药物标识）
     *
     * @param hasSpiDrug 精神药物标志1-精一；2-精二；8-非精神用药；9-其他（精神药物标识）
     */
    public void setHasSpiDrug(String hasSpiDrug) {
        this.hasSpiDrug = hasSpiDrug == null ? null : hasSpiDrug.trim();
    }

    /**
     * 获取麻醉药物标志0-否；1-是；9-未知（麻醉药物标识）
     *
     * @return HAS_ANE_DRUG - 麻醉药物标志0-否；1-是；9-未知（麻醉药物标识）
     */
    public String getHasAneDrug() {
        return hasAneDrug;
    }

    /**
     * 设置麻醉药物标志0-否；1-是；9-未知（麻醉药物标识）
     *
     * @param hasAneDrug 麻醉药物标志0-否；1-是；9-未知（麻醉药物标识）
     */
    public void setHasAneDrug(String hasAneDrug) {
        this.hasAneDrug = hasAneDrug == null ? null : hasAneDrug.trim();
    }

    /**
     * 获取基本药物标志1-国家基本药物；2-省增补基本药物；3-地市增补基本药物；4-区县增补基本药物；8-非基本药物；9-其他（基本药物标识）
     *
     * @return HAS_BASIC_DRUG - 基本药物标志1-国家基本药物；2-省增补基本药物；3-地市增补基本药物；4-区县增补基本药物；8-非基本药物；9-其他（基本药物标识）
     */
    public String getHasBasicDrug() {
        return hasBasicDrug;
    }

    /**
     * 设置基本药物标志1-国家基本药物；2-省增补基本药物；3-地市增补基本药物；4-区县增补基本药物；8-非基本药物；9-其他（基本药物标识）
     *
     * @param hasBasicDrug 基本药物标志1-国家基本药物；2-省增补基本药物；3-地市增补基本药物；4-区县增补基本药物；8-非基本药物；9-其他（基本药物标识）
     */
    public void setHasBasicDrug(String hasBasicDrug) {
        this.hasBasicDrug = hasBasicDrug == null ? null : hasBasicDrug.trim();
    }

    /**
     * 获取输液用药标志0-否；1-是；9-未知（输液用药标识）
     *
     * @return HAS_DRUG_INF - 输液用药标志0-否；1-是；9-未知（输液用药标识）
     */
    public String getHasDrugInf() {
        return hasDrugInf;
    }

    /**
     * 设置输液用药标志0-否；1-是；9-未知（输液用药标识）
     *
     * @param hasDrugInf 输液用药标志0-否；1-是；9-未知（输液用药标识）
     */
    public void setHasDrugInf(String hasDrugInf) {
        this.hasDrugInf = hasDrugInf == null ? null : hasDrugInf.trim();
    }

    /**
     * 获取省医保编码（上传全省统一的医保编码。）
     *
     * @return PROV_HEALTHCARE_CODE - 省医保编码（上传全省统一的医保编码。）
     */
    public String getProvHealthcareCode() {
        return provHealthcareCode;
    }

    /**
     * 设置省医保编码（上传全省统一的医保编码。）
     *
     * @param provHealthcareCode 省医保编码（上传全省统一的医保编码。）
     */
    public void setProvHealthcareCode(String provHealthcareCode) {
        this.provHealthcareCode = provHealthcareCode == null ? null : provHealthcareCode.trim();
    }

    /**
     * 获取市医保代码（市医保相关的医保代码。）
     *
     * @return CITY_HEALTHCARE_CODE - 市医保代码（市医保相关的医保代码。）
     */
    public String getCityHealthcareCode() {
        return cityHealthcareCode;
    }

    /**
     * 设置市医保代码（市医保相关的医保代码。）
     *
     * @param cityHealthcareCode 市医保代码（市医保相关的医保代码。）
     */
    public void setCityHealthcareCode(String cityHealthcareCode) {
        this.cityHealthcareCode = cityHealthcareCode == null ? null : cityHealthcareCode.trim();
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

    /**
     * 获取医嘱编号（按照某一特定编码规则赋予医嘱的顺序号）
     *
     * @return ORDER_ID - 医嘱编号（按照某一特定编码规则赋予医嘱的顺序号）
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置医嘱编号（按照某一特定编码规则赋予医嘱的顺序号）
     *
     * @param orderId 医嘱编号（按照某一特定编码规则赋予医嘱的顺序号）
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}