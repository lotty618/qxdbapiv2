package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "OUTPATIENT_DRUG_DETAIL")
public class OutpatientDrugDetail {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    /**
     * 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Id
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    @Id
    @Column(name = "SET_SER_NUM")
    private String setSerNum;

    /**
     * 用药记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "OUTPAT_DRUG_ID")
    private String outpatDrugId;

    /**
     * 处方编号（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    @Column(name = "PRESCRIBE_NO")
    private String prescribeNo;

    /**
     * 中药类别代码CV06.00.101（中药使用类别代码）
     */
    @Column(name = "CN_MEDICINE_TYPE_CODE")
    private String cnMedicineTypeCode;

    /**
     * 药物类型代码DIR_DRUG_TYPE（药物的类型在编码体系中的代码）
     */
    @Column(name = "DRUG_TYPE_CODE")
    private String drugTypeCode;

    /**
     * 药物院内编码（药物在本机构内部编码体系中的代码）
     */
    @Column(name = "DRUG_LOCAL_CODE")
    private String drugLocalCode;

    /**
     * 药物名称（药物在本机构内部编码体系中的名称）
     */
    @Column(name = "DRUG_NAME")
    private String drugName;

    /**
     * 药物剂型代码CV08.50.002（药物剂型类别在特定编码体系中的代码）
     */
    @Column(name = "DRUG_FORM_CODE")
    private String drugFormCode;

    /**
     * 用药天数（持续用药的合计天数，计量单位为d）
     */
    @Column(name = "DRUG_USE_DAYS")
    private Integer drugUseDays;

    /**
     * 药物使用频率CV06.00.228（单位时间内药物使用的次数）
     */
    @Column(name = "DRUG_USE_FREQ")
    private String drugUseFreq;

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
     * 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    @Column(name = "DRUG_TOTAL_DOSE")
    private BigDecimal drugTotalDose;

    /**
     * 每次使用数量（每次服用的数量。）
     */
    @Column(name = "PER_USE_NUM")
    private BigDecimal perUseNum;

    /**
     * 每次使用数量单位（若是药品，必填。）
     */
    @Column(name = "PER_USE_NUM_UNIT")
    private String perUseNumUnit;

    /**
     * 给药途径名称（若是药品，必填。）
     */
    @Column(name = "GIVE_DRUG_WAY_NAME")
    private String giveDrugWayName;

    /**
     * 药物使用途径代码CV06.00.102（药物使用途径的代码）
     */
    @Column(name = "DRUG_ROUTE_CODE")
    private String drugRouteCode;

    /**
     * 药物标准代码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    @Column(name = "DRUG_STD_CODE")
    private String drugStdCode;

    /**
     * 药物标准名称（药物在标准编码体系中的名称）
     */
    @Column(name = "DRUG_STD_NAME")
    private String drugStdName;

    /**
     * 药物使用-总剂量单位（药物使用的剂量单位）
     */
    @Column(name = "DRUG_TOTAL_UNIT")
    private String drugTotalUnit;

    /**
     * 规格（药物规格的描述，如0.25g）
     */
    @Column(name = "SPEC")
    private BigDecimal spec;

    /**
     * 皮试判别0否 1是（若是药品，必填。该字典为可不对照字典，上传格式参考接口技术规范文档。）
     */
    @Column(name = "SKIN_TEST_DISCRIMINATION")
    private String skinTestDiscrimination;

    /**
     * 成组号(0-无分组)（成组号）
     */
    @Column(name = "GROUP_NO")
    private String groupNo;

    /**
     * DDD值/最小剂量（要求药物使用的最小剂量值）
     */
    @Column(name = "DDD_VALUE")
    private BigDecimal dddValue;

    /**
     * 关键药物名称（与本次就诊相关的关键药物通用名称）
     */
    @Column(name = "CRUCIAL_DRUG_NAME")
    private String crucialDrugName;

    /**
     * 关键药物用法（与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述）
     */
    @Column(name = "CRUCIAL_DRUG_USAGE")
    private String crucialDrugUsage;

    /**
     * 药物不良反应情况（对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    @Column(name = "DRUG_ADVERSE_REACTION")
    private String drugAdverseReaction;

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
     * 麻醉药物标志0-否；1-是；9-未知(S0051)（麻醉药物标识）
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
     * 药品包装规格单位（若是药品，必填。发药包装单位，例如：瓶、盒。对于医院自定义的包装，可以提供自定义的包装单位。）
     */
    @Column(name = "DRUG_PAC_SPE_UNIT")
    private String drugPacSpeUnit;

    /**
     * 药品包装规格系数（若是药品，必填。例如：12支/每盒中的12 ，是指每盒中有12支。这里的12是指当前包装中有12个药品规格字段中的装量单位“支”的数量。对于医院自定义的包装，请提供自定义的包装中包含的最小装量单位的数量，比如包装中包含有6支，其值就为6。）
     */
    @Column(name = "DRUG_PAC_SPE_FAC")
    private String drugPacSpeFac;

    /**
     * 发药数量（若是药品，必填。本次处方该药品的总数量。）
     */
    @Column(name = "MED_OFR_QUA")
    private BigDecimal medOfrQua;

    /**
     * 发药单位
     */
    @Column(name = "MED_OFR_UNIT")
    private String medOfrUnit;

    /**
     * 脚注（记录布包、先煎、后下等。）
     */
    @Column(name = "FOOTNOTE")
    private String footnote;

    /**
     * 用药停止日期时间（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DRUG_STOP_DTIME")
    private String drugStopDtime;

    /**
     * 开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "DRUG_START_DTIME")
    private String drugStartDtime;

    /**
     * 发药时间（服务对象用药的时点,以24h计）
     */
    @Column(name = "MED_OFR_DTIME")
    private String medOfrDtime;

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
     * 备注（需要添加的注释说明的具体内容）
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "LAST_UPD_DATE")
    private String lastUpdDate;

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
     * 获取患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者Id[主键]约束引用PATIENT的Patient_Id（患者在特定编码体系中的唯一标识码）
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * 获取组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @return ORG_ID - 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     *
     * @param orgId 组织机构代码[主键]DIR_ORG（机构对应的针对组织机构的特定编码体系中的代码）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @return OUTPAT_FORM_NO - 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public String getOutpatFormNo() {
        return outpatFormNo;
    }

    /**
     * 设置门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     *
     * @param outpatFormNo 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    public void setOutpatFormNo(String outpatFormNo) {
        this.outpatFormNo = outpatFormNo == null ? null : outpatFormNo.trim();
    }

    /**
     * 获取结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     *
     * @return SET_SER_NUM - 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    public String getSetSerNum() {
        return setSerNum;
    }

    /**
     * 设置结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     *
     * @param setSerNum 结算流水号[主键]约束引用 OUTPATIENT_PAYMENTOLL_FEE的SET_SER_NUM（院内唯一，每张发票对应的流水号）
     */
    public void setSetSerNum(String setSerNum) {
        this.setSerNum = setSerNum == null ? null : setSerNum.trim();
    }

    /**
     * 获取用药记录序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return OUTPAT_DRUG_ID - 用药记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getOutpatDrugId() {
        return outpatDrugId;
    }

    /**
     * 设置用药记录序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param outpatDrugId 用药记录序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setOutpatDrugId(String outpatDrugId) {
        this.outpatDrugId = outpatDrugId == null ? null : outpatDrugId.trim();
    }

    /**
     * 获取处方编号（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @return PRESCRIBE_NO - 处方编号（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public String getPrescribeNo() {
        return prescribeNo;
    }

    /**
     * 设置处方编号（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     *
     * @param prescribeNo 处方编号（按照某一特定编码规则赋予门(急)诊处方的顺序号）
     */
    public void setPrescribeNo(String prescribeNo) {
        this.prescribeNo = prescribeNo == null ? null : prescribeNo.trim();
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
     * 获取药物类型代码DIR_DRUG_TYPE（药物的类型在编码体系中的代码）
     *
     * @return DRUG_TYPE_CODE - 药物类型代码DIR_DRUG_TYPE（药物的类型在编码体系中的代码）
     */
    public String getDrugTypeCode() {
        return drugTypeCode;
    }

    /**
     * 设置药物类型代码DIR_DRUG_TYPE（药物的类型在编码体系中的代码）
     *
     * @param drugTypeCode 药物类型代码DIR_DRUG_TYPE（药物的类型在编码体系中的代码）
     */
    public void setDrugTypeCode(String drugTypeCode) {
        this.drugTypeCode = drugTypeCode == null ? null : drugTypeCode.trim();
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
     * 获取药物名称（药物在本机构内部编码体系中的名称）
     *
     * @return DRUG_NAME - 药物名称（药物在本机构内部编码体系中的名称）
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药物名称（药物在本机构内部编码体系中的名称）
     *
     * @param drugName 药物名称（药物在本机构内部编码体系中的名称）
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
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
     * 获取用药天数（持续用药的合计天数，计量单位为d）
     *
     * @return DRUG_USE_DAYS - 用药天数（持续用药的合计天数，计量单位为d）
     */
    public Integer getDrugUseDays() {
        return drugUseDays;
    }

    /**
     * 设置用药天数（持续用药的合计天数，计量单位为d）
     *
     * @param drugUseDays 用药天数（持续用药的合计天数，计量单位为d）
     */
    public void setDrugUseDays(Integer drugUseDays) {
        this.drugUseDays = drugUseDays;
    }

    /**
     * 获取药物使用频率CV06.00.228（单位时间内药物使用的次数）
     *
     * @return DRUG_USE_FREQ - 药物使用频率CV06.00.228（单位时间内药物使用的次数）
     */
    public String getDrugUseFreq() {
        return drugUseFreq;
    }

    /**
     * 设置药物使用频率CV06.00.228（单位时间内药物使用的次数）
     *
     * @param drugUseFreq 药物使用频率CV06.00.228（单位时间内药物使用的次数）
     */
    public void setDrugUseFreq(String drugUseFreq) {
        this.drugUseFreq = drugUseFreq == null ? null : drugUseFreq.trim();
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
     * 获取药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     *
     * @return DRUG_TOTAL_DOSE - 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    public BigDecimal getDrugTotalDose() {
        return drugTotalDose;
    }

    /**
     * 设置药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     *
     * @param drugTotalDose 药物使用总剂量（服药者在一段时间内累计服用某药物的剂量总计）
     */
    public void setDrugTotalDose(BigDecimal drugTotalDose) {
        this.drugTotalDose = drugTotalDose;
    }

    /**
     * 获取每次使用数量（每次服用的数量。）
     *
     * @return PER_USE_NUM - 每次使用数量（每次服用的数量。）
     */
    public BigDecimal getPerUseNum() {
        return perUseNum;
    }

    /**
     * 设置每次使用数量（每次服用的数量。）
     *
     * @param perUseNum 每次使用数量（每次服用的数量。）
     */
    public void setPerUseNum(BigDecimal perUseNum) {
        this.perUseNum = perUseNum;
    }

    /**
     * 获取每次使用数量单位（若是药品，必填。）
     *
     * @return PER_USE_NUM_UNIT - 每次使用数量单位（若是药品，必填。）
     */
    public String getPerUseNumUnit() {
        return perUseNumUnit;
    }

    /**
     * 设置每次使用数量单位（若是药品，必填。）
     *
     * @param perUseNumUnit 每次使用数量单位（若是药品，必填。）
     */
    public void setPerUseNumUnit(String perUseNumUnit) {
        this.perUseNumUnit = perUseNumUnit == null ? null : perUseNumUnit.trim();
    }

    /**
     * 获取给药途径名称（若是药品，必填。）
     *
     * @return GIVE_DRUG_WAY_NAME - 给药途径名称（若是药品，必填。）
     */
    public String getGiveDrugWayName() {
        return giveDrugWayName;
    }

    /**
     * 设置给药途径名称（若是药品，必填。）
     *
     * @param giveDrugWayName 给药途径名称（若是药品，必填。）
     */
    public void setGiveDrugWayName(String giveDrugWayName) {
        this.giveDrugWayName = giveDrugWayName == null ? null : giveDrugWayName.trim();
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
     * 获取药物标准代码DIR_MEDICINE（药物在标准编码体系中的代码）
     *
     * @return DRUG_STD_CODE - 药物标准代码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    public String getDrugStdCode() {
        return drugStdCode;
    }

    /**
     * 设置药物标准代码DIR_MEDICINE（药物在标准编码体系中的代码）
     *
     * @param drugStdCode 药物标准代码DIR_MEDICINE（药物在标准编码体系中的代码）
     */
    public void setDrugStdCode(String drugStdCode) {
        this.drugStdCode = drugStdCode == null ? null : drugStdCode.trim();
    }

    /**
     * 获取药物标准名称（药物在标准编码体系中的名称）
     *
     * @return DRUG_STD_NAME - 药物标准名称（药物在标准编码体系中的名称）
     */
    public String getDrugStdName() {
        return drugStdName;
    }

    /**
     * 设置药物标准名称（药物在标准编码体系中的名称）
     *
     * @param drugStdName 药物标准名称（药物在标准编码体系中的名称）
     */
    public void setDrugStdName(String drugStdName) {
        this.drugStdName = drugStdName == null ? null : drugStdName.trim();
    }

    /**
     * 获取药物使用-总剂量单位（药物使用的剂量单位）
     *
     * @return DRUG_TOTAL_UNIT - 药物使用-总剂量单位（药物使用的剂量单位）
     */
    public String getDrugTotalUnit() {
        return drugTotalUnit;
    }

    /**
     * 设置药物使用-总剂量单位（药物使用的剂量单位）
     *
     * @param drugTotalUnit 药物使用-总剂量单位（药物使用的剂量单位）
     */
    public void setDrugTotalUnit(String drugTotalUnit) {
        this.drugTotalUnit = drugTotalUnit == null ? null : drugTotalUnit.trim();
    }

    /**
     * 获取规格（药物规格的描述，如0.25g）
     *
     * @return SPEC - 规格（药物规格的描述，如0.25g）
     */
    public BigDecimal getSpec() {
        return spec;
    }

    /**
     * 设置规格（药物规格的描述，如0.25g）
     *
     * @param spec 规格（药物规格的描述，如0.25g）
     */
    public void setSpec(BigDecimal spec) {
        this.spec = spec;
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
     * 获取成组号(0-无分组)（成组号）
     *
     * @return GROUP_NO - 成组号(0-无分组)（成组号）
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置成组号(0-无分组)（成组号）
     *
     * @param groupNo 成组号(0-无分组)（成组号）
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
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
     * 获取关键药物名称（与本次就诊相关的关键药物通用名称）
     *
     * @return CRUCIAL_DRUG_NAME - 关键药物名称（与本次就诊相关的关键药物通用名称）
     */
    public String getCrucialDrugName() {
        return crucialDrugName;
    }

    /**
     * 设置关键药物名称（与本次就诊相关的关键药物通用名称）
     *
     * @param crucialDrugName 关键药物名称（与本次就诊相关的关键药物通用名称）
     */
    public void setCrucialDrugName(String crucialDrugName) {
        this.crucialDrugName = crucialDrugName == null ? null : crucialDrugName.trim();
    }

    /**
     * 获取关键药物用法（与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述）
     *
     * @return CRUCIAL_DRUG_USAGE - 关键药物用法（与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述）
     */
    public String getCrucialDrugUsage() {
        return crucialDrugUsage;
    }

    /**
     * 设置关键药物用法（与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述）
     *
     * @param crucialDrugUsage 关键药物用法（与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述）
     */
    public void setCrucialDrugUsage(String crucialDrugUsage) {
        this.crucialDrugUsage = crucialDrugUsage == null ? null : crucialDrugUsage.trim();
    }

    /**
     * 获取药物不良反应情况（对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     *
     * @return DRUG_ADVERSE_REACTION - 药物不良反应情况（对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    public String getDrugAdverseReaction() {
        return drugAdverseReaction;
    }

    /**
     * 设置药物不良反应情况（对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     *
     * @param drugAdverseReaction 药物不良反应情况（对可能影响患者诊治的、严重的药物不良反应描述，包括：药物不良反应的表现、相关处理及结局）
     */
    public void setDrugAdverseReaction(String drugAdverseReaction) {
        this.drugAdverseReaction = drugAdverseReaction == null ? null : drugAdverseReaction.trim();
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
     * 获取麻醉药物标志0-否；1-是；9-未知(S0051)（麻醉药物标识）
     *
     * @return HAS_ANE_DRUG - 麻醉药物标志0-否；1-是；9-未知(S0051)（麻醉药物标识）
     */
    public String getHasAneDrug() {
        return hasAneDrug;
    }

    /**
     * 设置麻醉药物标志0-否；1-是；9-未知(S0051)（麻醉药物标识）
     *
     * @param hasAneDrug 麻醉药物标志0-否；1-是；9-未知(S0051)（麻醉药物标识）
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
     * 获取药品包装规格单位（若是药品，必填。发药包装单位，例如：瓶、盒。对于医院自定义的包装，可以提供自定义的包装单位。）
     *
     * @return DRUG_PAC_SPE_UNIT - 药品包装规格单位（若是药品，必填。发药包装单位，例如：瓶、盒。对于医院自定义的包装，可以提供自定义的包装单位。）
     */
    public String getDrugPacSpeUnit() {
        return drugPacSpeUnit;
    }

    /**
     * 设置药品包装规格单位（若是药品，必填。发药包装单位，例如：瓶、盒。对于医院自定义的包装，可以提供自定义的包装单位。）
     *
     * @param drugPacSpeUnit 药品包装规格单位（若是药品，必填。发药包装单位，例如：瓶、盒。对于医院自定义的包装，可以提供自定义的包装单位。）
     */
    public void setDrugPacSpeUnit(String drugPacSpeUnit) {
        this.drugPacSpeUnit = drugPacSpeUnit == null ? null : drugPacSpeUnit.trim();
    }

    /**
     * 获取药品包装规格系数（若是药品，必填。例如：12支/每盒中的12 ，是指每盒中有12支。这里的12是指当前包装中有12个药品规格字段中的装量单位“支”的数量。对于医院自定义的包装，请提供自定义的包装中包含的最小装量单位的数量，比如包装中包含有6支，其值就为6。）
     *
     * @return DRUG_PAC_SPE_FAC - 药品包装规格系数（若是药品，必填。例如：12支/每盒中的12 ，是指每盒中有12支。这里的12是指当前包装中有12个药品规格字段中的装量单位“支”的数量。对于医院自定义的包装，请提供自定义的包装中包含的最小装量单位的数量，比如包装中包含有6支，其值就为6。）
     */
    public String getDrugPacSpeFac() {
        return drugPacSpeFac;
    }

    /**
     * 设置药品包装规格系数（若是药品，必填。例如：12支/每盒中的12 ，是指每盒中有12支。这里的12是指当前包装中有12个药品规格字段中的装量单位“支”的数量。对于医院自定义的包装，请提供自定义的包装中包含的最小装量单位的数量，比如包装中包含有6支，其值就为6。）
     *
     * @param drugPacSpeFac 药品包装规格系数（若是药品，必填。例如：12支/每盒中的12 ，是指每盒中有12支。这里的12是指当前包装中有12个药品规格字段中的装量单位“支”的数量。对于医院自定义的包装，请提供自定义的包装中包含的最小装量单位的数量，比如包装中包含有6支，其值就为6。）
     */
    public void setDrugPacSpeFac(String drugPacSpeFac) {
        this.drugPacSpeFac = drugPacSpeFac == null ? null : drugPacSpeFac.trim();
    }

    /**
     * 获取发药数量（若是药品，必填。本次处方该药品的总数量。）
     *
     * @return MED_OFR_QUA - 发药数量（若是药品，必填。本次处方该药品的总数量。）
     */
    public BigDecimal getMedOfrQua() {
        return medOfrQua;
    }

    /**
     * 设置发药数量（若是药品，必填。本次处方该药品的总数量。）
     *
     * @param medOfrQua 发药数量（若是药品，必填。本次处方该药品的总数量。）
     */
    public void setMedOfrQua(BigDecimal medOfrQua) {
        this.medOfrQua = medOfrQua;
    }

    /**
     * 获取发药单位
     *
     * @return MED_OFR_UNIT - 发药单位
     */
    public String getMedOfrUnit() {
        return medOfrUnit;
    }

    /**
     * 设置发药单位
     *
     * @param medOfrUnit 发药单位
     */
    public void setMedOfrUnit(String medOfrUnit) {
        this.medOfrUnit = medOfrUnit == null ? null : medOfrUnit.trim();
    }

    /**
     * 获取脚注（记录布包、先煎、后下等。）
     *
     * @return FOOTNOTE - 脚注（记录布包、先煎、后下等。）
     */
    public String getFootnote() {
        return footnote;
    }

    /**
     * 设置脚注（记录布包、先煎、后下等。）
     *
     * @param footnote 脚注（记录布包、先煎、后下等。）
     */
    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }

    /**
     * 获取用药停止日期时间（患者用药停止日的公元纪年日期和时间的完整描述）
     *
     * @return DRUG_STOP_DTIME - 用药停止日期时间（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    public String getDrugStopDtime() {
        return drugStopDtime;
    }

    /**
     * 设置用药停止日期时间（患者用药停止日的公元纪年日期和时间的完整描述）
     *
     * @param drugStopDtime 用药停止日期时间（患者用药停止日的公元纪年日期和时间的完整描述）
     */
    public void setDrugStopDtime(String drugStopDtime) {
        this.drugStopDtime = drugStopDtime == null ? null : drugStopDtime.trim();
    }

    /**
     * 获取开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述）
     *
     * @return DRUG_START_DTIME - 开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述）
     */
    public String getDrugStartDtime() {
        return drugStartDtime;
    }

    /**
     * 设置开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述）
     *
     * @param drugStartDtime 开始时间（诊疗/操作开始时的公元纪年日期和时间的完整描述）
     */
    public void setDrugStartDtime(String drugStartDtime) {
        this.drugStartDtime = drugStartDtime == null ? null : drugStartDtime.trim();
    }

    /**
     * 获取发药时间（服务对象用药的时点,以24h计）
     *
     * @return MED_OFR_DTIME - 发药时间（服务对象用药的时点,以24h计）
     */
    public String getMedOfrDtime() {
        return medOfrDtime;
    }

    /**
     * 设置发药时间（服务对象用药的时点,以24h计）
     *
     * @param medOfrDtime 发药时间（服务对象用药的时点,以24h计）
     */
    public void setMedOfrDtime(String medOfrDtime) {
        this.medOfrDtime = medOfrDtime == null ? null : medOfrDtime.trim();
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
     * 获取最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @return LAST_UPD_DATE - 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public String getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 设置最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     *
     * @param lastUpdDate 最后修改时间（最后修改时的公元纪年日期和时间的完整描述）
     */
    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate == null ? null : lastUpdDate.trim();
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