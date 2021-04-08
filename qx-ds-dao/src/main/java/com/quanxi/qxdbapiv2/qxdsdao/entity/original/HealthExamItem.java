package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HEALTH_EXAM_ITEM")
public class HealthExamItem {
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
     * 健康体检表编号[主键]约束引用HEALTH_EXAM_BASIC的HEALTH_EXAM_FORM_NO（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    @Id
    @Column(name = "HEALTH_EXAM_FORM_NO")
    private String healthExamFormNo;

    /**
     * 子项序号[主键]（每条记录在数据库中的唯一序号 ）
     */
    @Id
    @Column(name = "SERIAL_NO")
    private String serialNo;

    /**
     * 体检项目编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    @Column(name = "CLASS_CODE")
    private String classCode;

    /**
     * 体检项目名称 （受检者检查/检验项目名称 ）
     */
    @Column(name = "CLASS_NAME")
    private String className;

    /**
     * 结果类型代码DIR_OBSERVATION_TYPE（检查结果的类型在特定编码体系中的代码 ）
     */
    @Column(name = "RESULT_TYPE_CODE")
    private String resultTypeCode;

    /**
     * 结果类型名称（检查结果的类型在特定编码体系中的名称）
     */
    @Column(name = "RESULT_TYPE_NAME")
    private String resultTypeName;

    /**
     * 结果值（检验/检查项目的结果值）
     */
    @Column(name = "RESULT_VALUE")
    private String resultValue;

    /**
     * 单位 （受检者定量检查/检验结果测量值的计量单位 ）
     */
    @Column(name = "RESULT_UNIT")
    private String resultUnit;

    /**
     * 正常参考值下限（对正常参考值下限的描述 ）
     */
    @Column(name = "NORM_LOWER_LIMIT")
    private String normLowerLimit;

    /**
     * 正常参考值上限 （检验/检查项目的正常参考上限值 ）
     */
    @Column(name = "NORM_UPPER_LIMIT")
    private String normUpperLimit;

    /**
     * 参考值备注 （对检验检查项目正常参考值的补充说明  ）
     */
    @Column(name = "NORM_VALUE_NOTES")
    private String normValueNotes;

    /**
     * 结果值的解释（对结果值的解释的详细情况描述 ）
     */
    @Column(name = "RESULT_INTERPRE")
    private String resultInterpre;

    /**
     * 该项的创建时间 （为服务对象建立相关档案当日的公元纪年日期 ）
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

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
     * 获取健康体检表编号[主键]约束引用HEALTH_EXAM_BASIC的HEALTH_EXAM_FORM_NO（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @return HEALTH_EXAM_FORM_NO - 健康体检表编号[主键]约束引用HEALTH_EXAM_BASIC的HEALTH_EXAM_FORM_NO（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public String getHealthExamFormNo() {
        return healthExamFormNo;
    }

    /**
     * 设置健康体检表编号[主键]约束引用HEALTH_EXAM_BASIC的HEALTH_EXAM_FORM_NO（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @param healthExamFormNo 健康体检表编号[主键]约束引用HEALTH_EXAM_BASIC的HEALTH_EXAM_FORM_NO（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public void setHealthExamFormNo(String healthExamFormNo) {
        this.healthExamFormNo = healthExamFormNo == null ? null : healthExamFormNo.trim();
    }

    /**
     * 获取子项序号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @return SERIAL_NO - 子项序号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置子项序号[主键]（每条记录在数据库中的唯一序号 ）
     *
     * @param serialNo 子项序号[主键]（每条记录在数据库中的唯一序号 ）
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * 获取体检项目编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @return CLASS_CODE - 体检项目编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * 设置体检项目编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     *
     * @param classCode 体检项目编码DIR_TREATMENT（受检者检查/检验项目在特定编码体系中的代码）
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    /**
     * 获取体检项目名称 （受检者检查/检验项目名称 ）
     *
     * @return CLASS_NAME - 体检项目名称 （受检者检查/检验项目名称 ）
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置体检项目名称 （受检者检查/检验项目名称 ）
     *
     * @param className 体检项目名称 （受检者检查/检验项目名称 ）
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * 获取结果类型代码DIR_OBSERVATION_TYPE（检查结果的类型在特定编码体系中的代码 ）
     *
     * @return RESULT_TYPE_CODE - 结果类型代码DIR_OBSERVATION_TYPE（检查结果的类型在特定编码体系中的代码 ）
     */
    public String getResultTypeCode() {
        return resultTypeCode;
    }

    /**
     * 设置结果类型代码DIR_OBSERVATION_TYPE（检查结果的类型在特定编码体系中的代码 ）
     *
     * @param resultTypeCode 结果类型代码DIR_OBSERVATION_TYPE（检查结果的类型在特定编码体系中的代码 ）
     */
    public void setResultTypeCode(String resultTypeCode) {
        this.resultTypeCode = resultTypeCode == null ? null : resultTypeCode.trim();
    }

    /**
     * 获取结果类型名称（检查结果的类型在特定编码体系中的名称）
     *
     * @return RESULT_TYPE_NAME - 结果类型名称（检查结果的类型在特定编码体系中的名称）
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /**
     * 设置结果类型名称（检查结果的类型在特定编码体系中的名称）
     *
     * @param resultTypeName 结果类型名称（检查结果的类型在特定编码体系中的名称）
     */
    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName == null ? null : resultTypeName.trim();
    }

    /**
     * 获取结果值（检验/检查项目的结果值）
     *
     * @return RESULT_VALUE - 结果值（检验/检查项目的结果值）
     */
    public String getResultValue() {
        return resultValue;
    }

    /**
     * 设置结果值（检验/检查项目的结果值）
     *
     * @param resultValue 结果值（检验/检查项目的结果值）
     */
    public void setResultValue(String resultValue) {
        this.resultValue = resultValue == null ? null : resultValue.trim();
    }

    /**
     * 获取单位 （受检者定量检查/检验结果测量值的计量单位 ）
     *
     * @return RESULT_UNIT - 单位 （受检者定量检查/检验结果测量值的计量单位 ）
     */
    public String getResultUnit() {
        return resultUnit;
    }

    /**
     * 设置单位 （受检者定量检查/检验结果测量值的计量单位 ）
     *
     * @param resultUnit 单位 （受检者定量检查/检验结果测量值的计量单位 ）
     */
    public void setResultUnit(String resultUnit) {
        this.resultUnit = resultUnit == null ? null : resultUnit.trim();
    }

    /**
     * 获取正常参考值下限（对正常参考值下限的描述 ）
     *
     * @return NORM_LOWER_LIMIT - 正常参考值下限（对正常参考值下限的描述 ）
     */
    public String getNormLowerLimit() {
        return normLowerLimit;
    }

    /**
     * 设置正常参考值下限（对正常参考值下限的描述 ）
     *
     * @param normLowerLimit 正常参考值下限（对正常参考值下限的描述 ）
     */
    public void setNormLowerLimit(String normLowerLimit) {
        this.normLowerLimit = normLowerLimit == null ? null : normLowerLimit.trim();
    }

    /**
     * 获取正常参考值上限 （检验/检查项目的正常参考上限值 ）
     *
     * @return NORM_UPPER_LIMIT - 正常参考值上限 （检验/检查项目的正常参考上限值 ）
     */
    public String getNormUpperLimit() {
        return normUpperLimit;
    }

    /**
     * 设置正常参考值上限 （检验/检查项目的正常参考上限值 ）
     *
     * @param normUpperLimit 正常参考值上限 （检验/检查项目的正常参考上限值 ）
     */
    public void setNormUpperLimit(String normUpperLimit) {
        this.normUpperLimit = normUpperLimit == null ? null : normUpperLimit.trim();
    }

    /**
     * 获取参考值备注 （对检验检查项目正常参考值的补充说明  ）
     *
     * @return NORM_VALUE_NOTES - 参考值备注 （对检验检查项目正常参考值的补充说明  ）
     */
    public String getNormValueNotes() {
        return normValueNotes;
    }

    /**
     * 设置参考值备注 （对检验检查项目正常参考值的补充说明  ）
     *
     * @param normValueNotes 参考值备注 （对检验检查项目正常参考值的补充说明  ）
     */
    public void setNormValueNotes(String normValueNotes) {
        this.normValueNotes = normValueNotes == null ? null : normValueNotes.trim();
    }

    /**
     * 获取结果值的解释（对结果值的解释的详细情况描述 ）
     *
     * @return RESULT_INTERPRE - 结果值的解释（对结果值的解释的详细情况描述 ）
     */
    public String getResultInterpre() {
        return resultInterpre;
    }

    /**
     * 设置结果值的解释（对结果值的解释的详细情况描述 ）
     *
     * @param resultInterpre 结果值的解释（对结果值的解释的详细情况描述 ）
     */
    public void setResultInterpre(String resultInterpre) {
        this.resultInterpre = resultInterpre == null ? null : resultInterpre.trim();
    }

    /**
     * 获取该项的创建时间 （为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @return EFFECTIVE_DATE - 该项的创建时间 （为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置该项的创建时间 （为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @param effectiveDate 该项的创建时间 （为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
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