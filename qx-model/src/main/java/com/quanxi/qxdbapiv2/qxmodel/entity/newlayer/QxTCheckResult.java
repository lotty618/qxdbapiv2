package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CHECK_RESULT")
public class QxTCheckResult {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 检验结果唯一标识
     */
    @Column(name = "CRUID")
    private String cruid;

    /**
     * 检验单详情唯一标识
     */
    @Column(name = "CODUID")
    private String coduid;

    /**
     * 检验单唯一标识
     */
    @Column(name = "COUID")
    private String couid;

    /**
     * 检验项目ID
     */
    @Column(name = "ITEM_ID")
    private String itemId;

    /**
     * 检验项目名称
     */
    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 检验子项目ID
     */
    @Column(name = "ITEM_DETAIL_ID")
    private String itemDetailId;

    /**
     * 检验子项目名称
     */
    @Column(name = "ITEM_DETAIL_NAME")
    private String itemDetailName;

    /**
     * 异常提示
     */
    @Column(name = "RESULT_HINT")
    private String resultHint;

    /**
     * 结果类型代码（检查结果的类型代码）
     */
    @Column(name = "RESULT_TYPE_CODE")
    private String resultTypeCode;

    /**
     * 结果类型名称（检查结果的类型名称）
     */
    @Column(name = "RESULT_TYPE_NAME")
    private String resultTypeName;

    /**
     * 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    @Column(name = "RESULT_UNIT")
    private String resultUnit;

    /**
     * 正常参考值下限 （对正常参考值下限的描述）
     */
    @Column(name = "NORM_LOWER_LIMIT")
    private String normLowerLimit;

    /**
     * 正常参考值上限（检验/检查项目的正常参考上限值 ）
     */
    @Column(name = "NORM_UPPER_LIMIT")
    private String normUpperLimit;

    /**
     * 该项的创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    /**
     * 可互认标志0否 1是（标识项目是否为区域内医疗机构互相认可）
     */
    @Column(name = "RECOGNITION_MARK")
    private Long recognitionMark;

    /**
     * 打印时间（检查报告的打印的公元纪年时间）
     */
    @Column(name = "PRINT_DATE")
    private String printDate;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    @Column(name = "IS_ABNORMAL")
    private String isAbnormal;

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
     * 结果值（实验室检查的结果值）
     */
    @Column(name = "RESULT_VALUE")
    private String resultValue;

    @Column(name = "NORM_VALUE_NOTES")
    private String normValueNotes;

    @Column(name = "EXAMINE_WAY")
    private String examineWay;

    @Column(name = "RESULT_INTERPRE")
    private String resultInterpre;

    @Column(name = "EVENT_NO")
    private String eventNo;

    /**
     * 是否危急值(0-否,1-是)
     */
    @Column(name = "IS_CRITICAL")
    private Short isCritical;

    @Column(name = "PRI_ORDER")
    private String priOrder;

    /**
     * 子项的英文名称（受检者检查/检验项目在特定编码体系中的英文名称）
     */
    @Column(name = "CLASS_ENNAME")
    private String classEnname;

    /**
     * 医院机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     * 获取检验结果唯一标识
     *
     * @return CRUID - 检验结果唯一标识
     */
    public String getCruid() {
        return cruid;
    }

    /**
     * 设置检验结果唯一标识
     *
     * @param cruid 检验结果唯一标识
     */
    public void setCruid(String cruid) {
        this.cruid = cruid == null ? null : cruid.trim();
    }

    /**
     * 获取检验单详情唯一标识
     *
     * @return CODUID - 检验单详情唯一标识
     */
    public String getCoduid() {
        return coduid;
    }

    /**
     * 设置检验单详情唯一标识
     *
     * @param coduid 检验单详情唯一标识
     */
    public void setCoduid(String coduid) {
        this.coduid = coduid == null ? null : coduid.trim();
    }

    /**
     * 获取检验单唯一标识
     *
     * @return COUID - 检验单唯一标识
     */
    public String getCouid() {
        return couid;
    }

    /**
     * 设置检验单唯一标识
     *
     * @param couid 检验单唯一标识
     */
    public void setCouid(String couid) {
        this.couid = couid == null ? null : couid.trim();
    }

    /**
     * 获取检验项目ID
     *
     * @return ITEM_ID - 检验项目ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置检验项目ID
     *
     * @param itemId 检验项目ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取检验项目名称
     *
     * @return ITEM_NAME - 检验项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置检验项目名称
     *
     * @param itemName 检验项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取检验子项目ID
     *
     * @return ITEM_DETAIL_ID - 检验子项目ID
     */
    public String getItemDetailId() {
        return itemDetailId;
    }

    /**
     * 设置检验子项目ID
     *
     * @param itemDetailId 检验子项目ID
     */
    public void setItemDetailId(String itemDetailId) {
        this.itemDetailId = itemDetailId == null ? null : itemDetailId.trim();
    }

    /**
     * 获取检验子项目名称
     *
     * @return ITEM_DETAIL_NAME - 检验子项目名称
     */
    public String getItemDetailName() {
        return itemDetailName;
    }

    /**
     * 设置检验子项目名称
     *
     * @param itemDetailName 检验子项目名称
     */
    public void setItemDetailName(String itemDetailName) {
        this.itemDetailName = itemDetailName == null ? null : itemDetailName.trim();
    }

    /**
     * 获取异常提示
     *
     * @return RESULT_HINT - 异常提示
     */
    public String getResultHint() {
        return resultHint;
    }

    /**
     * 设置异常提示
     *
     * @param resultHint 异常提示
     */
    public void setResultHint(String resultHint) {
        this.resultHint = resultHint == null ? null : resultHint.trim();
    }

    /**
     * 获取结果类型代码（检查结果的类型代码）
     *
     * @return RESULT_TYPE_CODE - 结果类型代码（检查结果的类型代码）
     */
    public String getResultTypeCode() {
        return resultTypeCode;
    }

    /**
     * 设置结果类型代码（检查结果的类型代码）
     *
     * @param resultTypeCode 结果类型代码（检查结果的类型代码）
     */
    public void setResultTypeCode(String resultTypeCode) {
        this.resultTypeCode = resultTypeCode == null ? null : resultTypeCode.trim();
    }

    /**
     * 获取结果类型名称（检查结果的类型名称）
     *
     * @return RESULT_TYPE_NAME - 结果类型名称（检查结果的类型名称）
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /**
     * 设置结果类型名称（检查结果的类型名称）
     *
     * @param resultTypeName 结果类型名称（检查结果的类型名称）
     */
    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName == null ? null : resultTypeName.trim();
    }

    /**
     * 获取单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @return RESULT_UNIT - 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public String getResultUnit() {
        return resultUnit;
    }

    /**
     * 设置单位（受检者定量检查/检验结果测量值的计量单位）
     *
     * @param resultUnit 单位（受检者定量检查/检验结果测量值的计量单位）
     */
    public void setResultUnit(String resultUnit) {
        this.resultUnit = resultUnit == null ? null : resultUnit.trim();
    }

    /**
     * 获取正常参考值下限 （对正常参考值下限的描述）
     *
     * @return NORM_LOWER_LIMIT - 正常参考值下限 （对正常参考值下限的描述）
     */
    public String getNormLowerLimit() {
        return normLowerLimit;
    }

    /**
     * 设置正常参考值下限 （对正常参考值下限的描述）
     *
     * @param normLowerLimit 正常参考值下限 （对正常参考值下限的描述）
     */
    public void setNormLowerLimit(String normLowerLimit) {
        this.normLowerLimit = normLowerLimit == null ? null : normLowerLimit.trim();
    }

    /**
     * 获取正常参考值上限（检验/检查项目的正常参考上限值 ）
     *
     * @return NORM_UPPER_LIMIT - 正常参考值上限（检验/检查项目的正常参考上限值 ）
     */
    public String getNormUpperLimit() {
        return normUpperLimit;
    }

    /**
     * 设置正常参考值上限（检验/检查项目的正常参考上限值 ）
     *
     * @param normUpperLimit 正常参考值上限（检验/检查项目的正常参考上限值 ）
     */
    public void setNormUpperLimit(String normUpperLimit) {
        this.normUpperLimit = normUpperLimit == null ? null : normUpperLimit.trim();
    }

    /**
     * 获取该项的创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @return EFFECTIVE_DATE - 该项的创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置该项的创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     *
     * @param effectiveDate 该项的创建时间（为服务对象建立相关档案当日的公元纪年日期 ）
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate == null ? null : effectiveDate.trim();
    }

    /**
     * 获取可互认标志0否 1是（标识项目是否为区域内医疗机构互相认可）
     *
     * @return RECOGNITION_MARK - 可互认标志0否 1是（标识项目是否为区域内医疗机构互相认可）
     */
    public Long getRecognitionMark() {
        return recognitionMark;
    }

    /**
     * 设置可互认标志0否 1是（标识项目是否为区域内医疗机构互相认可）
     *
     * @param recognitionMark 可互认标志0否 1是（标识项目是否为区域内医疗机构互相认可）
     */
    public void setRecognitionMark(Long recognitionMark) {
        this.recognitionMark = recognitionMark;
    }

    /**
     * 获取打印时间（检查报告的打印的公元纪年时间）
     *
     * @return PRINT_DATE - 打印时间（检查报告的打印的公元纪年时间）
     */
    public String getPrintDate() {
        return printDate;
    }

    /**
     * 设置打印时间（检查报告的打印的公元纪年时间）
     *
     * @param printDate 打印时间（检查报告的打印的公元纪年时间）
     */
    public void setPrintDate(String printDate) {
        this.printDate = printDate == null ? null : printDate.trim();
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
     * 获取是否异常0否 1是（检验/检查结果是否异常的标志）
     *
     * @return IS_ABNORMAL - 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    public String getIsAbnormal() {
        return isAbnormal;
    }

    /**
     * 设置是否异常0否 1是（检验/检查结果是否异常的标志）
     *
     * @param isAbnormal 是否异常0否 1是（检验/检查结果是否异常的标志）
     */
    public void setIsAbnormal(String isAbnormal) {
        this.isAbnormal = isAbnormal == null ? null : isAbnormal.trim();
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
     * 获取结果值（实验室检查的结果值）
     *
     * @return RESULT_VALUE - 结果值（实验室检查的结果值）
     */
    public String getResultValue() {
        return resultValue;
    }

    /**
     * 设置结果值（实验室检查的结果值）
     *
     * @param resultValue 结果值（实验室检查的结果值）
     */
    public void setResultValue(String resultValue) {
        this.resultValue = resultValue == null ? null : resultValue.trim();
    }

    /**
     * @return NORM_VALUE_NOTES
     */
    public String getNormValueNotes() {
        return normValueNotes;
    }

    /**
     * @param normValueNotes
     */
    public void setNormValueNotes(String normValueNotes) {
        this.normValueNotes = normValueNotes == null ? null : normValueNotes.trim();
    }

    /**
     * @return EXAMINE_WAY
     */
    public String getExamineWay() {
        return examineWay;
    }

    /**
     * @param examineWay
     */
    public void setExamineWay(String examineWay) {
        this.examineWay = examineWay == null ? null : examineWay.trim();
    }

    /**
     * @return RESULT_INTERPRE
     */
    public String getResultInterpre() {
        return resultInterpre;
    }

    /**
     * @param resultInterpre
     */
    public void setResultInterpre(String resultInterpre) {
        this.resultInterpre = resultInterpre == null ? null : resultInterpre.trim();
    }

    /**
     * @return EVENT_NO
     */
    public String getEventNo() {
        return eventNo;
    }

    /**
     * @param eventNo
     */
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    /**
     * 获取是否危急值(0-否,1-是)
     *
     * @return IS_CRITICAL - 是否危急值(0-否,1-是)
     */
    public Short getIsCritical() {
        return isCritical;
    }

    /**
     * 设置是否危急值(0-否,1-是)
     *
     * @param isCritical 是否危急值(0-否,1-是)
     */
    public void setIsCritical(Short isCritical) {
        this.isCritical = isCritical;
    }

    /**
     * @return PRI_ORDER
     */
    public String getPriOrder() {
        return priOrder;
    }

    /**
     * @param priOrder
     */
    public void setPriOrder(String priOrder) {
        this.priOrder = priOrder == null ? null : priOrder.trim();
    }

    /**
     * 获取子项的英文名称（受检者检查/检验项目在特定编码体系中的英文名称）
     *
     * @return CLASS_ENNAME - 子项的英文名称（受检者检查/检验项目在特定编码体系中的英文名称）
     */
    public String getClassEnname() {
        return classEnname;
    }

    /**
     * 设置子项的英文名称（受检者检查/检验项目在特定编码体系中的英文名称）
     *
     * @param classEnname 子项的英文名称（受检者检查/检验项目在特定编码体系中的英文名称）
     */
    public void setClassEnname(String classEnname) {
        this.classEnname = classEnname == null ? null : classEnname.trim();
    }

    /**
     * 获取医院机构ID
     *
     * @return ORG_ID - 医院机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置医院机构ID
     *
     * @param orgId 医院机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}