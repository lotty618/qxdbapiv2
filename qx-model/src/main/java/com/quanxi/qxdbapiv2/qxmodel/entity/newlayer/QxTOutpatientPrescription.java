package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_OUTPATIENT_PRESCRIPTION")
public class QxTOutpatientPrescription {
    /**
     * 序列号
     */
    @Id
    @Column(name = "SID")
    private Long sid;

    /**
     * 处方唯一标识
     */
    @Column(name = "PRUID")
    private String pruid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 门诊记录唯一标识
     */
    @Column(name = "PNUID")
    private String pnuid;

    /**
     * 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    @Column(name = "PRES_CLASS_TYPE_CODE")
    private String presClassTypeCode;

    /**
     * 处方类别名称（处方类别在特定体系中的名称）
     */
    @Column(name = "PRES_CLASS_TYPE_NAME")
    private String presClassTypeName;

    /**
     * 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    @Column(name = "GENDER_CODE")
    private String genderCode;

    /**
     * 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    @Column(name = "AGE_YEAR")
    private String ageYear;

    /**
     * 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_MONTH")
    private String ageMonth;

    /**
     * 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    @Column(name = "TCM_DIAGNOSIS_CODE")
    private String tcmDiagnosisCode;

    /**
     * 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    @Column(name = "TCM_DIAGNOSIS_NAME")
    private String tcmDiagnosisName;

    /**
     * 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    @Column(name = "THERAPEUTIC_PRINCIPLES")
    private String therapeuticPrinciples;

    /**
     * 处方说明（对处方的详细说明）
     */
    @Column(name = "PRES_DESCRIBE")
    private String presDescribe;

    /**
     * 中药煎煮方法（中药煎煮的方法的描述）
     */
    @Column(name = "TCM_DECOC_PIECE_METHOD")
    private String tcmDecocPieceMethod;

    /**
     * 中药用药方法（中药的用药方法的描述）
     */
    @Column(name = "TCM_USE_METHOD")
    private String tcmUseMethod;

    /**
     * 金额（处方金额）
     */
    @Column(name = "COST")
    private Long cost;

    /**
     * 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    @Column(name = "TERM_COUNT")
    private Long termCount;

    /**
     * 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    @Column(name = "APPLY_DEPT_CODE")
    private String applyDeptCode;

    /**
     * 开立科室中文名称（开立处方的科室中文名称）
     */
    @Column(name = "APPLY_DEPT_CN")
    private String applyDeptCn;

    /**
     * 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    @Column(name = "APPLY_TIME")
    private String applyTime;

    /**
     * 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "APPLY_OPERATOR")
    private String applyOperator;

    /**
     * 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "PERFORM_OPERATOR")
    private String performOperator;

    /**
     * 执行科室代码（执行科室在特定编码体系中的代码）
     */
    @Column(name = "PERFORM_DEPT_CODE")
    private String performDeptCode;

    /**
     * 执行科室名称（执行科室在特定编码体系中的名称）
     */
    @Column(name = "PERFORM_DEPT_NAME")
    private String performDeptName;

    /**
     * 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "PERFORM_DATE")
    private String performDate;

    /**
     * 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "AUDIT_OPERATOR")
    private String auditOperator;

    /**
     * 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    @Column(name = "AUDIT_DATE")
    private String auditDate;

    /**
     * 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DISTRIUTE_OPERATOR")
    private String distriuteOperator;

    /**
     * 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "CHECK_OPERATOR")
    private String checkOperator;

    /**
     * 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "DISPENSE_OPERATOR")
    private String dispenseOperator;

    /**
     * 药品代码DRUG(对应药品信息的药品代码)
     */
    @Column(name = "DRUG_CODE")
    private String drugCode;

    /**
     * 药品名称DRUG(对应药品信息的药品名称)
     */
    @Column(name = "DRUG_NAME")
    private String drugName;

    /**
     * 药物类型代码(药物的类型在编码体系中的代码)
     */
    @Column(name = "DRUG_CLASSCODE")
    private String drugClasscode;

    /**
     * 药物类型名称(药物的类型在编码体系中的名称)
     */
    @Column(name = "DRUG_CLASSNAME")
    private String drugClassname;

    /**
     * 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    @Column(name = "DRUG_DOSECODE")
    private String drugDosecode;

    /**
     * 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    @Column(name = "DRUG_DOSENAME")
    private String drugDosename;

    /**
     * 用药天数(持续用药的合计天数，计量单位为d)
     */
    @Column(name = "DRUG_DAY")
    private String drugDay;

    /**
     * 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    @Column(name = "DRUG_FREQ_CODE")
    private String drugFreqCode;

    /**
     * 频次名称(单位时间内药物使用的次数)
     */
    @Column(name = "DRUG_FREQ_CN")
    private String drugFreqCn;

    /**
     * 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    @Column(name = "PRES_DOSE")
    private String presDose;

    /**
     * 剂量单位(药物使用的剂量单位)
     */
    @Column(name = "PRES_DOSE_UNIT")
    private String presDoseUnit;

    /**
     * 单次剂量(单次使用药物的剂量)
     */
    @Column(name = "PRES_ONE_DOSE")
    private String presOneDose;

    /**
     * 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    @Column(name = "PRES_QUANTITY")
    private String presQuantity;

    /**
     * 数量单位(药物使用的数量单位)
     */
    @Column(name = "PRES_QUANTITY_UNIT")
    private String presQuantityUnit;

    /**
     * 单次数量(单次服用的数量)
     */
    @Column(name = "PRES_ONE_QUANTITY")
    private String presOneQuantity;

    /**
     * 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    @Column(name = "PRES_ROUTE")
    private String presRoute;

    /**
     * 药物规格(药物规格的描述，如0.25g)
     */
    @Column(name = "PRES_SPEC")
    private String presSpec;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    @Column(name = "STATUS_CODE")
    private Long statusCode;

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
    @Column(name = "CREATE_NAME")
    private String createName;

    /**
     * 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    @Column(name = "INPUT_TIME")
    private String inputTime;

    /**
     * 最后更新人姓名（信息最后更新人姓名）
     */
    @Column(name = "UPDATE_NAME")
    private String updateName;

    /**
     * 最后更新时间YYYY/MM/DD HH24:MI:SS（信息最后更新时间）
     */
    @Column(name = "MODIFIED_TIME")
    private String modifiedTime;

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
     * 是否点评
     */
    @Column(name = "IS_REVIEWS")
    private Long isReviews;

    /**
     * 处方编号
     */
    @Column(name = "PRESCRIPTION_NO")
    private String prescriptionNo;

    /**
     * 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    @Column(name = "PRESCRIPTION_DETAIL_NO")
    private String prescriptionDetailNo;

    /**
     * 门诊记录表编号[主键]约束引用 Outpatient 的 Out_Form_No（按照某一特定编码规则赋予门(急)诊就诊对象的顺序号）
     */
    @Column(name = "OUTPAT_FORM_NO")
    private String outpatFormNo;

    /**
     * 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    @Column(name = "APPLY_OPERATOR_CODE")
    private String applyOperatorCode;

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
     * 获取处方唯一标识
     *
     * @return PRUID - 处方唯一标识
     */
    public String getPruid() {
        return pruid;
    }

    /**
     * 设置处方唯一标识
     *
     * @param pruid 处方唯一标识
     */
    public void setPruid(String pruid) {
        this.pruid = pruid == null ? null : pruid.trim();
    }

    /**
     * 获取病人唯一标识
     *
     * @return PUID - 病人唯一标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人唯一标识
     *
     * @param puid 病人唯一标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取门诊记录唯一标识
     *
     * @return PNUID - 门诊记录唯一标识
     */
    public String getPnuid() {
        return pnuid;
    }

    /**
     * 设置门诊记录唯一标识
     *
     * @param pnuid 门诊记录唯一标识
     */
    public void setPnuid(String pnuid) {
        this.pnuid = pnuid == null ? null : pnuid.trim();
    }

    /**
     * 获取处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     *
     * @return PRES_CLASS_TYPE_CODE - 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    public String getPresClassTypeCode() {
        return presClassTypeCode;
    }

    /**
     * 设置处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     *
     * @param presClassTypeCode 处方类别代码DIR_PRES_CLASS_TYPE（处方类别在特定体系中的代码）
     */
    public void setPresClassTypeCode(String presClassTypeCode) {
        this.presClassTypeCode = presClassTypeCode == null ? null : presClassTypeCode.trim();
    }

    /**
     * 获取处方类别名称（处方类别在特定体系中的名称）
     *
     * @return PRES_CLASS_TYPE_NAME - 处方类别名称（处方类别在特定体系中的名称）
     */
    public String getPresClassTypeName() {
        return presClassTypeName;
    }

    /**
     * 设置处方类别名称（处方类别在特定体系中的名称）
     *
     * @param presClassTypeName 处方类别名称（处方类别在特定体系中的名称）
     */
    public void setPresClassTypeName(String presClassTypeName) {
        this.presClassTypeName = presClassTypeName == null ? null : presClassTypeName.trim();
    }

    /**
     * 获取患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 患者姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @return GENDER_CODE - 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码）
     *
     * @param genderCode 性别代码GB/T 2261.1（本人生理性别的代码）
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    /**
     * 获取年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @return AGE_YEAR - 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public String getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @param ageYear 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public void setAgeYear(String ageYear) {
        this.ageYear = ageYear == null ? null : ageYear.trim();
    }

    /**
     * 获取年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @return AGE_MONTH - 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public String getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     *
     * @param ageMonth 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    public void setAgeMonth(String ageMonth) {
        this.ageMonth = ageMonth == null ? null : ageMonth.trim();
    }

    /**
     * 获取西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @return DIAGNOSIS_CODE - 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     *
     * @param diagnosisCode 西医诊断编码ICD-10（患者所患疾病在西医诊断特定编码体系中的编码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     *
     * @param diagnosisName 西医诊断名称（患者所患疾病在西医诊断特定编码体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     *
     * @return TCM_DIAGNOSIS_CODE - 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    public String getTcmDiagnosisCode() {
        return tcmDiagnosisCode;
    }

    /**
     * 设置中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     *
     * @param tcmDiagnosisCode 中医病名代码GB/T 15657（患者所患疾病在中医病名特定分类体系中的代码）
     */
    public void setTcmDiagnosisCode(String tcmDiagnosisCode) {
        this.tcmDiagnosisCode = tcmDiagnosisCode == null ? null : tcmDiagnosisCode.trim();
    }

    /**
     * 获取中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     *
     * @return TCM_DIAGNOSIS_NAME - 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    public String getTcmDiagnosisName() {
        return tcmDiagnosisName;
    }

    /**
     * 设置中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     *
     * @param tcmDiagnosisName 中医病名名称（患者所患疾病在中医病名特定分类体系中的名称）
     */
    public void setTcmDiagnosisName(String tcmDiagnosisName) {
        this.tcmDiagnosisName = tcmDiagnosisName == null ? null : tcmDiagnosisName.trim();
    }

    /**
     * 获取治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @return THERAPEUTIC_PRINCIPLES - 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public String getTherapeuticPrinciples() {
        return therapeuticPrinciples;
    }

    /**
     * 设置治则治法（根据辨证结果采用的治则治法名称术语）
     *
     * @param therapeuticPrinciples 治则治法（根据辨证结果采用的治则治法名称术语）
     */
    public void setTherapeuticPrinciples(String therapeuticPrinciples) {
        this.therapeuticPrinciples = therapeuticPrinciples == null ? null : therapeuticPrinciples.trim();
    }

    /**
     * 获取处方说明（对处方的详细说明）
     *
     * @return PRES_DESCRIBE - 处方说明（对处方的详细说明）
     */
    public String getPresDescribe() {
        return presDescribe;
    }

    /**
     * 设置处方说明（对处方的详细说明）
     *
     * @param presDescribe 处方说明（对处方的详细说明）
     */
    public void setPresDescribe(String presDescribe) {
        this.presDescribe = presDescribe == null ? null : presDescribe.trim();
    }

    /**
     * 获取中药煎煮方法（中药煎煮的方法的描述）
     *
     * @return TCM_DECOC_PIECE_METHOD - 中药煎煮方法（中药煎煮的方法的描述）
     */
    public String getTcmDecocPieceMethod() {
        return tcmDecocPieceMethod;
    }

    /**
     * 设置中药煎煮方法（中药煎煮的方法的描述）
     *
     * @param tcmDecocPieceMethod 中药煎煮方法（中药煎煮的方法的描述）
     */
    public void setTcmDecocPieceMethod(String tcmDecocPieceMethod) {
        this.tcmDecocPieceMethod = tcmDecocPieceMethod == null ? null : tcmDecocPieceMethod.trim();
    }

    /**
     * 获取中药用药方法（中药的用药方法的描述）
     *
     * @return TCM_USE_METHOD - 中药用药方法（中药的用药方法的描述）
     */
    public String getTcmUseMethod() {
        return tcmUseMethod;
    }

    /**
     * 设置中药用药方法（中药的用药方法的描述）
     *
     * @param tcmUseMethod 中药用药方法（中药的用药方法的描述）
     */
    public void setTcmUseMethod(String tcmUseMethod) {
        this.tcmUseMethod = tcmUseMethod == null ? null : tcmUseMethod.trim();
    }

    /**
     * 获取金额（处方金额）
     *
     * @return COST - 金额（处方金额）
     */
    public Long getCost() {
        return cost;
    }

    /**
     * 设置金额（处方金额）
     *
     * @param cost 金额（处方金额）
     */
    public void setCost(Long cost) {
        this.cost = cost;
    }

    /**
     * 获取处方有效天数（门(急)诊医师开具的处方的有效天数）
     *
     * @return TERM_COUNT - 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    public Long getTermCount() {
        return termCount;
    }

    /**
     * 设置处方有效天数（门(急)诊医师开具的处方的有效天数）
     *
     * @param termCount 处方有效天数（门(急)诊医师开具的处方的有效天数）
     */
    public void setTermCount(Long termCount) {
        this.termCount = termCount;
    }

    /**
     * 获取开立科室代码DIR_DEPT（开立处方的科室代码）
     *
     * @return APPLY_DEPT_CODE - 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * 设置开立科室代码DIR_DEPT（开立处方的科室代码）
     *
     * @param applyDeptCode 开立科室代码DIR_DEPT（开立处方的科室代码）
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    /**
     * 获取开立科室中文名称（开立处方的科室中文名称）
     *
     * @return APPLY_DEPT_CN - 开立科室中文名称（开立处方的科室中文名称）
     */
    public String getApplyDeptCn() {
        return applyDeptCn;
    }

    /**
     * 设置开立科室中文名称（开立处方的科室中文名称）
     *
     * @param applyDeptCn 开立科室中文名称（开立处方的科室中文名称）
     */
    public void setApplyDeptCn(String applyDeptCn) {
        this.applyDeptCn = applyDeptCn == null ? null : applyDeptCn.trim();
    }

    /**
     * 获取处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @return APPLY_TIME - 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 设置处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     *
     * @param applyTime 处方开立日期（门(急)诊医师开具处方当日的公元纪日期的完整描述）
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime == null ? null : applyTime.trim();
    }

    /**
     * 获取处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return APPLY_OPERATOR - 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getApplyOperator() {
        return applyOperator;
    }

    /**
     * 设置处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param applyOperator 处方开立医师签名（开具门急诊处方的医师签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setApplyOperator(String applyOperator) {
        this.applyOperator = applyOperator == null ? null : applyOperator.trim();
    }

    /**
     * 获取执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return PERFORM_OPERATOR - 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getPerformOperator() {
        return performOperator;
    }

    /**
     * 设置执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param performOperator 执行人（执行人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setPerformOperator(String performOperator) {
        this.performOperator = performOperator == null ? null : performOperator.trim();
    }

    /**
     * 获取执行科室代码（执行科室在特定编码体系中的代码）
     *
     * @return PERFORM_DEPT_CODE - 执行科室代码（执行科室在特定编码体系中的代码）
     */
    public String getPerformDeptCode() {
        return performDeptCode;
    }

    /**
     * 设置执行科室代码（执行科室在特定编码体系中的代码）
     *
     * @param performDeptCode 执行科室代码（执行科室在特定编码体系中的代码）
     */
    public void setPerformDeptCode(String performDeptCode) {
        this.performDeptCode = performDeptCode == null ? null : performDeptCode.trim();
    }

    /**
     * 获取执行科室名称（执行科室在特定编码体系中的名称）
     *
     * @return PERFORM_DEPT_NAME - 执行科室名称（执行科室在特定编码体系中的名称）
     */
    public String getPerformDeptName() {
        return performDeptName;
    }

    /**
     * 设置执行科室名称（执行科室在特定编码体系中的名称）
     *
     * @param performDeptName 执行科室名称（执行科室在特定编码体系中的名称）
     */
    public void setPerformDeptName(String performDeptName) {
        this.performDeptName = performDeptName == null ? null : performDeptName.trim();
    }

    /**
     * 获取执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @return PERFORM_DATE - 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public String getPerformDate() {
        return performDate;
    }

    /**
     * 设置执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     *
     * @param performDate 执行时间（医嘱执行结束时的公元纪年日期和时间的完整描述）
     */
    public void setPerformDate(String performDate) {
        this.performDate = performDate == null ? null : performDate.trim();
    }

    /**
     * 获取处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return AUDIT_OPERATOR - 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getAuditOperator() {
        return auditOperator;
    }

    /**
     * 设置处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param auditOperator 处方审核医师（处方审核医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator == null ? null : auditOperator.trim();
    }

    /**
     * 获取审核日期（处方审核当日的公元纪日期的完整描述）
     *
     * @return AUDIT_DATE - 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    public String getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审核日期（处方审核当日的公元纪日期的完整描述）
     *
     * @param auditDate 审核日期（处方审核当日的公元纪日期的完整描述）
     */
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    /**
     * 获取处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DISTRIUTE_OPERATOR - 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDistriuteOperator() {
        return distriuteOperator;
    }

    /**
     * 设置处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param distriuteOperator 处方调配医师（处方调配医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDistriuteOperator(String distriuteOperator) {
        this.distriuteOperator = distriuteOperator == null ? null : distriuteOperator.trim();
    }

    /**
     * 获取处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return CHECK_OPERATOR - 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getCheckOperator() {
        return checkOperator;
    }

    /**
     * 设置处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param checkOperator 处方核对医师（处方核对医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setCheckOperator(String checkOperator) {
        this.checkOperator = checkOperator == null ? null : checkOperator.trim();
    }

    /**
     * 获取处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return DISPENSE_OPERATOR - 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getDispenseOperator() {
        return dispenseOperator;
    }

    /**
     * 设置处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param dispenseOperator 处方发药医师（处方发药医师在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setDispenseOperator(String dispenseOperator) {
        this.dispenseOperator = dispenseOperator == null ? null : dispenseOperator.trim();
    }

    /**
     * 获取药品代码DRUG(对应药品信息的药品代码)
     *
     * @return DRUG_CODE - 药品代码DRUG(对应药品信息的药品代码)
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * 设置药品代码DRUG(对应药品信息的药品代码)
     *
     * @param drugCode 药品代码DRUG(对应药品信息的药品代码)
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    /**
     * 获取药品名称DRUG(对应药品信息的药品名称)
     *
     * @return DRUG_NAME - 药品名称DRUG(对应药品信息的药品名称)
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药品名称DRUG(对应药品信息的药品名称)
     *
     * @param drugName 药品名称DRUG(对应药品信息的药品名称)
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    /**
     * 获取药物类型代码(药物的类型在编码体系中的代码)
     *
     * @return DRUG_CLASSCODE - 药物类型代码(药物的类型在编码体系中的代码)
     */
    public String getDrugClasscode() {
        return drugClasscode;
    }

    /**
     * 设置药物类型代码(药物的类型在编码体系中的代码)
     *
     * @param drugClasscode 药物类型代码(药物的类型在编码体系中的代码)
     */
    public void setDrugClasscode(String drugClasscode) {
        this.drugClasscode = drugClasscode == null ? null : drugClasscode.trim();
    }

    /**
     * 获取药物类型名称(药物的类型在编码体系中的名称)
     *
     * @return DRUG_CLASSNAME - 药物类型名称(药物的类型在编码体系中的名称)
     */
    public String getDrugClassname() {
        return drugClassname;
    }

    /**
     * 设置药物类型名称(药物的类型在编码体系中的名称)
     *
     * @param drugClassname 药物类型名称(药物的类型在编码体系中的名称)
     */
    public void setDrugClassname(String drugClassname) {
        this.drugClassname = drugClassname == null ? null : drugClassname.trim();
    }

    /**
     * 获取药物剂型代码(药物剂型类别在特定编码体系中的代码)
     *
     * @return DRUG_DOSECODE - 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    public String getDrugDosecode() {
        return drugDosecode;
    }

    /**
     * 设置药物剂型代码(药物剂型类别在特定编码体系中的代码)
     *
     * @param drugDosecode 药物剂型代码(药物剂型类别在特定编码体系中的代码)
     */
    public void setDrugDosecode(String drugDosecode) {
        this.drugDosecode = drugDosecode == null ? null : drugDosecode.trim();
    }

    /**
     * 获取药物剂型名称(药物剂型类别在特定编码体系中的名称)
     *
     * @return DRUG_DOSENAME - 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    public String getDrugDosename() {
        return drugDosename;
    }

    /**
     * 设置药物剂型名称(药物剂型类别在特定编码体系中的名称)
     *
     * @param drugDosename 药物剂型名称(药物剂型类别在特定编码体系中的名称)
     */
    public void setDrugDosename(String drugDosename) {
        this.drugDosename = drugDosename == null ? null : drugDosename.trim();
    }

    /**
     * 获取用药天数(持续用药的合计天数，计量单位为d)
     *
     * @return DRUG_DAY - 用药天数(持续用药的合计天数，计量单位为d)
     */
    public String getDrugDay() {
        return drugDay;
    }

    /**
     * 设置用药天数(持续用药的合计天数，计量单位为d)
     *
     * @param drugDay 用药天数(持续用药的合计天数，计量单位为d)
     */
    public void setDrugDay(String drugDay) {
        this.drugDay = drugDay == null ? null : drugDay.trim();
    }

    /**
     * 获取频次代码(单位时间内药物使用的次数缩写)例如：QT
     *
     * @return DRUG_FREQ_CODE - 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    public String getDrugFreqCode() {
        return drugFreqCode;
    }

    /**
     * 设置频次代码(单位时间内药物使用的次数缩写)例如：QT
     *
     * @param drugFreqCode 频次代码(单位时间内药物使用的次数缩写)例如：QT
     */
    public void setDrugFreqCode(String drugFreqCode) {
        this.drugFreqCode = drugFreqCode == null ? null : drugFreqCode.trim();
    }

    /**
     * 获取频次名称(单位时间内药物使用的次数)
     *
     * @return DRUG_FREQ_CN - 频次名称(单位时间内药物使用的次数)
     */
    public String getDrugFreqCn() {
        return drugFreqCn;
    }

    /**
     * 设置频次名称(单位时间内药物使用的次数)
     *
     * @param drugFreqCn 频次名称(单位时间内药物使用的次数)
     */
    public void setDrugFreqCn(String drugFreqCn) {
        this.drugFreqCn = drugFreqCn == null ? null : drugFreqCn.trim();
    }

    /**
     * 获取药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     *
     * @return PRES_DOSE - 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    public String getPresDose() {
        return presDose;
    }

    /**
     * 设置药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     *
     * @param presDose 药物总剂量(服药者在一段时间内累计服用某药物的剂量总计)
     */
    public void setPresDose(String presDose) {
        this.presDose = presDose == null ? null : presDose.trim();
    }

    /**
     * 获取剂量单位(药物使用的剂量单位)
     *
     * @return PRES_DOSE_UNIT - 剂量单位(药物使用的剂量单位)
     */
    public String getPresDoseUnit() {
        return presDoseUnit;
    }

    /**
     * 设置剂量单位(药物使用的剂量单位)
     *
     * @param presDoseUnit 剂量单位(药物使用的剂量单位)
     */
    public void setPresDoseUnit(String presDoseUnit) {
        this.presDoseUnit = presDoseUnit == null ? null : presDoseUnit.trim();
    }

    /**
     * 获取单次剂量(单次使用药物的剂量)
     *
     * @return PRES_ONE_DOSE - 单次剂量(单次使用药物的剂量)
     */
    public String getPresOneDose() {
        return presOneDose;
    }

    /**
     * 设置单次剂量(单次使用药物的剂量)
     *
     * @param presOneDose 单次剂量(单次使用药物的剂量)
     */
    public void setPresOneDose(String presOneDose) {
        this.presOneDose = presOneDose == null ? null : presOneDose.trim();
    }

    /**
     * 获取总数量(服药者在一段时间内累计服用某药物的数量总计)
     *
     * @return PRES_QUANTITY - 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    public String getPresQuantity() {
        return presQuantity;
    }

    /**
     * 设置总数量(服药者在一段时间内累计服用某药物的数量总计)
     *
     * @param presQuantity 总数量(服药者在一段时间内累计服用某药物的数量总计)
     */
    public void setPresQuantity(String presQuantity) {
        this.presQuantity = presQuantity == null ? null : presQuantity.trim();
    }

    /**
     * 获取数量单位(药物使用的数量单位)
     *
     * @return PRES_QUANTITY_UNIT - 数量单位(药物使用的数量单位)
     */
    public String getPresQuantityUnit() {
        return presQuantityUnit;
    }

    /**
     * 设置数量单位(药物使用的数量单位)
     *
     * @param presQuantityUnit 数量单位(药物使用的数量单位)
     */
    public void setPresQuantityUnit(String presQuantityUnit) {
        this.presQuantityUnit = presQuantityUnit == null ? null : presQuantityUnit.trim();
    }

    /**
     * 获取单次数量(单次服用的数量)
     *
     * @return PRES_ONE_QUANTITY - 单次数量(单次服用的数量)
     */
    public String getPresOneQuantity() {
        return presOneQuantity;
    }

    /**
     * 设置单次数量(单次服用的数量)
     *
     * @param presOneQuantity 单次数量(单次服用的数量)
     */
    public void setPresOneQuantity(String presOneQuantity) {
        this.presOneQuantity = presOneQuantity == null ? null : presOneQuantity.trim();
    }

    /**
     * 获取用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     *
     * @return PRES_ROUTE - 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    public String getPresRoute() {
        return presRoute;
    }

    /**
     * 设置用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     *
     * @param presRoute 用法(与本次就诊相关的关键药物(含中药)治疗疾病具体用法的描述)
     */
    public void setPresRoute(String presRoute) {
        this.presRoute = presRoute == null ? null : presRoute.trim();
    }

    /**
     * 获取药物规格(药物规格的描述，如0.25g)
     *
     * @return PRES_SPEC - 药物规格(药物规格的描述，如0.25g)
     */
    public String getPresSpec() {
        return presSpec;
    }

    /**
     * 设置药物规格(药物规格的描述，如0.25g)
     *
     * @param presSpec 药物规格(药物规格的描述，如0.25g)
     */
    public void setPresSpec(String presSpec) {
        this.presSpec = presSpec == null ? null : presSpec.trim();
    }

    /**
     * 获取原始层唯一ID
     *
     * @return QID - 原始层唯一ID
     */
    public String getQid() {
        return qid;
    }

    /**
     * 设置原始层唯一ID
     *
     * @param qid 原始层唯一ID
     */
    public void setQid(String qid) {
        this.qid = qid == null ? null : qid.trim();
    }

    /**
     * 获取状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @return STATUS_CODE - 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     *
     * @param statusCode 状态标识0正常 1删除（表示业务数据在业务系统中状态信息）
     */
    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
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
     * @return CREATE_NAME - 录入人姓名（信息录入人姓名）
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置录入人姓名（信息录入人姓名）
     *
     * @param createName 录入人姓名（信息录入人姓名）
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 获取录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @return INPUT_TIME - 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public String getInputTime() {
        return inputTime;
    }

    /**
     * 设置录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     *
     * @param inputTime 录入时间YYYY/MM/DD HH24:MI:SS（信息录入时间）
     */
    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    /**
     * 获取最后更新人姓名（信息最后更新人姓名）
     *
     * @return UPDATE_NAME - 最后更新人姓名（信息最后更新人姓名）
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置最后更新人姓名（信息最后更新人姓名）
     *
     * @param updateName 最后更新人姓名（信息最后更新人姓名）
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
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

    /**
     * 获取是否点评
     *
     * @return IS_REVIEWS - 是否点评
     */
    public Long getIsReviews() {
        return isReviews;
    }

    /**
     * 设置是否点评
     *
     * @param isReviews 是否点评
     */
    public void setIsReviews(Long isReviews) {
        this.isReviews = isReviews;
    }

    /**
     * 获取处方编号
     *
     * @return PRESCRIPTION_NO - 处方编号
     */
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    /**
     * 设置处方编号
     *
     * @param prescriptionNo 处方编号
     */
    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo == null ? null : prescriptionNo.trim();
    }

    /**
     * 获取处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     *
     * @return PRESCRIPTION_DETAIL_NO - 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    public String getPrescriptionDetailNo() {
        return prescriptionDetailNo;
    }

    /**
     * 设置处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     *
     * @param prescriptionDetailNo 处方明细序号[主键]（按照某一特定编码规则赋予门(急)诊处方明细的顺序号）
     */
    public void setPrescriptionDetailNo(String prescriptionDetailNo) {
        this.prescriptionDetailNo = prescriptionDetailNo == null ? null : prescriptionDetailNo.trim();
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
     * 获取医技开立医师代码（医疗服务人员在院内的唯一编号）
     *
     * @return APPLY_OPERATOR_CODE - 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    public String getApplyOperatorCode() {
        return applyOperatorCode;
    }

    /**
     * 设置医技开立医师代码（医疗服务人员在院内的唯一编号）
     *
     * @param applyOperatorCode 医技开立医师代码（医疗服务人员在院内的唯一编号）
     */
    public void setApplyOperatorCode(String applyOperatorCode) {
        this.applyOperatorCode = applyOperatorCode == null ? null : applyOperatorCode.trim();
    }
}