package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TP_PERSON")
public class QxTpPerson {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 人员唯一标识
     */
    @Column(name = "AUID")
    private String auid;

    /**
     * 科室唯一标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 机构唯一标识
     */
    @Column(name = "ORGUID")
    private String orguid;

    /**
     * 人员ID
     */
    @Column(name = "PERSON_ID")
    private String personId;

    /**
     * 科室ID（医务人员所在的科室本地代码 ）
     */
    @Column(name = "DEPT_ID")
    private String deptId;

    /**
     * 机构ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 职称唯一标识
     */
    @Column(name = "STSID")
    private String stsid;

    /**
     * 机构名称
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 科室名称（医务人员所在的科室本地名称 ）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 医务人员姓名
     */
    @Column(name = "PERSON_NAME")
    private String personName;

    /**
     * 职称（本地）
     */
    @Column(name = "TITLE_NAME")
    private String titleName;

    /**
     * 职称等级（0：其他，1：初级，2：高级，3：副高级，4：正高级）
     */
    @Column(name = "TITLE_TYPE")
    private Short titleType;

    /**
     * 工号
     */
    @Column(name = "WORKNO")
    private String workno;

    /**
     * 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    @Column(name = "SPELL")
    private String spell;

    /**
     * 性别代码（本人生理性别的代码 ）
     */
    @Column(name = "SEX_CODE")
    private String sexCode;

    /**
     * 性别名称（本人生理性别的名称）
     */
    @Column(name = "SEX_NAME")
    private String sexName;

    /**
     * 身份证号 （本人的身份证件上的唯一法定标识符 ）
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 国籍代码
     */
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    /**
     * 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    @Column(name = "COUNTRY_CN")
    private String countryCn;

    /**
     * 出生日期（本人出生当日的公元纪年日期 ）
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 从业资格证编号 （医疗卫生人员的从业资格证书编号 ）
     */
    @Column(name = "PRACTICIAN_CODE")
    private String practicianCode;

    /**
     * 医院内部编码 （管理相对人的唯一编号）
     */
    @Column(name = "NOSOCOMIAL_CODE")
    private String nosocomialCode;

    /**
     * 职称名称（个体已取得的相关专业职称在特定编码体系中的名称 ）
     */
    @Column(name = "RESPONSIBILITY_NAME")
    private String responsibilityName;

    /**
     * 职称评定日期（卫生人员职称评定的日期）
     */
    @Column(name = "ASSESS_DATE")
    private String assessDate;

    /**
     * 在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     */
    @Column(name = "ACTIVE_STATUS_NAME")
    private String activeStatusName;

    /**
     * 在职状态编码
     */
    @Column(name = "ACTIVE_STATUS_CODE")
    private String activeStatusCode;

    /**
     * 参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     */
    @Column(name = "ATTEND_DATE")
    private String attendDate;

    /**
     * 民族中文名称（本人所属民族的类别代码）
     */
    @Column(name = "NATIONALITY_NAME")
    private String nationalityName;

    /**
     * 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    @Column(name = "MARRIAGE_NAME")
    private String marriageName;

    /**
     * 文化程度中文名称（本人受教育最高程度的类别中文名称）
     */
    @Column(name = "EDUCATION_NAME")
    private String educationName;

    /**
     * 联系电话（联系方式中的的电话号码，包括国际、国内区号和分机号 ）
     */
    @Column(name = "TEL_NO")
    private String telNo;

    /**
     * 通讯地址 （个体的联系地址详细描述）
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 电子邮件
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 照片（照片路径）
     */
    @Column(name = "PHOTO")
    private String photo;

    /**
     * 标准科室名称（科室在特定编码体系中的名称 ）
     */
    @Column(name = "STD_DEPT_NAME")
    private String stdDeptName;

    /**
     * 政治面貌
     */
    @Column(name = "POLITICAL_STATUS")
    private String politicalStatus;

    /**
     * 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    @Column(name = "IS_PERMANENT_STAFF")
    private Long isPermanentStaff;

    /**
     * 医务人员类别名称（医务人员类别在特定编码体系中的名称）
     */
    @Column(name = "PRACTIONER_TYPE_NAME")
    private String practionerTypeName;

    /**
     * a
     */
    @Column(name = "PRACTIONER_TYPE_CODE")
    private String practionerTypeCode;

    /**
     * 姓名简拼
     */
    @Column(name = "NAME_PY")
    private String namePy;

    /**
     * 姓名全拼
     */
    @Column(name = "NAME_PINYIN")
    private String namePinyin;

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
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

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
     * 获取人员唯一标识
     *
     * @return AUID - 人员唯一标识
     */
    public String getAuid() {
        return auid;
    }

    /**
     * 设置人员唯一标识
     *
     * @param auid 人员唯一标识
     */
    public void setAuid(String auid) {
        this.auid = auid == null ? null : auid.trim();
    }

    /**
     * 获取科室唯一标识
     *
     * @return DUID - 科室唯一标识
     */
    public String getDuid() {
        return duid;
    }

    /**
     * 设置科室唯一标识
     *
     * @param duid 科室唯一标识
     */
    public void setDuid(String duid) {
        this.duid = duid == null ? null : duid.trim();
    }

    /**
     * 获取机构唯一标识
     *
     * @return ORGUID - 机构唯一标识
     */
    public String getOrguid() {
        return orguid;
    }

    /**
     * 设置机构唯一标识
     *
     * @param orguid 机构唯一标识
     */
    public void setOrguid(String orguid) {
        this.orguid = orguid == null ? null : orguid.trim();
    }

    /**
     * 获取人员ID
     *
     * @return PERSON_ID - 人员ID
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 设置人员ID
     *
     * @param personId 人员ID
     */
    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    /**
     * 获取科室ID（医务人员所在的科室本地代码 ）
     *
     * @return DEPT_ID - 科室ID（医务人员所在的科室本地代码 ）
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置科室ID（医务人员所在的科室本地代码 ）
     *
     * @param deptId 科室ID（医务人员所在的科室本地代码 ）
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * 获取机构ID
     *
     * @return ORG_ID - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * 获取职称唯一标识
     *
     * @return STSID - 职称唯一标识
     */
    public String getStsid() {
        return stsid;
    }

    /**
     * 设置职称唯一标识
     *
     * @param stsid 职称唯一标识
     */
    public void setStsid(String stsid) {
        this.stsid = stsid == null ? null : stsid.trim();
    }

    /**
     * 获取机构名称
     *
     * @return ORG_NAME - 机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称
     *
     * @param orgName 机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * 获取科室名称（医务人员所在的科室本地名称 ）
     *
     * @return DEPT_NAME - 科室名称（医务人员所在的科室本地名称 ）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称（医务人员所在的科室本地名称 ）
     *
     * @param deptName 科室名称（医务人员所在的科室本地名称 ）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取医务人员姓名
     *
     * @return PERSON_NAME - 医务人员姓名
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 设置医务人员姓名
     *
     * @param personName 医务人员姓名
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 获取职称（本地）
     *
     * @return TITLE_NAME - 职称（本地）
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 设置职称（本地）
     *
     * @param titleName 职称（本地）
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    /**
     * 获取职称等级（0：其他，1：初级，2：高级，3：副高级，4：正高级）
     *
     * @return TITLE_TYPE - 职称等级（0：其他，1：初级，2：高级，3：副高级，4：正高级）
     */
    public Short getTitleType() {
        return titleType;
    }

    /**
     * 设置职称等级（0：其他，1：初级，2：高级，3：副高级，4：正高级）
     *
     * @param titleType 职称等级（0：其他，1：初级，2：高级，3：副高级，4：正高级）
     */
    public void setTitleType(Short titleType) {
        this.titleType = titleType;
    }

    /**
     * 获取工号
     *
     * @return WORKNO - 工号
     */
    public String getWorkno() {
        return workno;
    }

    /**
     * 设置工号
     *
     * @param workno 工号
     */
    public void setWorkno(String workno) {
        this.workno = workno == null ? null : workno.trim();
    }

    /**
     * 获取姓名拼音首码 （卫生人员名字的拼音首码 ）
     *
     * @return SPELL - 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    public String getSpell() {
        return spell;
    }

    /**
     * 设置姓名拼音首码 （卫生人员名字的拼音首码 ）
     *
     * @param spell 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * 获取性别代码（本人生理性别的代码 ）
     *
     * @return SEX_CODE - 性别代码（本人生理性别的代码 ）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码（本人生理性别的代码 ）
     *
     * @param sexCode 性别代码（本人生理性别的代码 ）
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * 获取性别名称（本人生理性别的名称）
     *
     * @return SEX_NAME - 性别名称（本人生理性别的名称）
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * 设置性别名称（本人生理性别的名称）
     *
     * @param sexName 性别名称（本人生理性别的名称）
     */
    public void setSexName(String sexName) {
        this.sexName = sexName == null ? null : sexName.trim();
    }

    /**
     * 获取身份证号 （本人的身份证件上的唯一法定标识符 ）
     *
     * @return ID_NO - 身份证号 （本人的身份证件上的唯一法定标识符 ）
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证号 （本人的身份证件上的唯一法定标识符 ）
     *
     * @param idNo 身份证号 （本人的身份证件上的唯一法定标识符 ）
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取国籍代码
     *
     * @return COUNTRY_CODE - 国籍代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国籍代码
     *
     * @param countryCode 国籍代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 获取国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     *
     * @return COUNTRY_CN - 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public String getCountryCn() {
        return countryCn;
    }

    /**
     * 设置国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     *
     * @param countryCn 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    /**
     * 获取出生日期（本人出生当日的公元纪年日期 ）
     *
     * @return BIRTHDAY - 出生日期（本人出生当日的公元纪年日期 ）
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期（本人出生当日的公元纪年日期 ）
     *
     * @param birthday 出生日期（本人出生当日的公元纪年日期 ）
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取从业资格证编号 （医疗卫生人员的从业资格证书编号 ）
     *
     * @return PRACTICIAN_CODE - 从业资格证编号 （医疗卫生人员的从业资格证书编号 ）
     */
    public String getPracticianCode() {
        return practicianCode;
    }

    /**
     * 设置从业资格证编号 （医疗卫生人员的从业资格证书编号 ）
     *
     * @param practicianCode 从业资格证编号 （医疗卫生人员的从业资格证书编号 ）
     */
    public void setPracticianCode(String practicianCode) {
        this.practicianCode = practicianCode == null ? null : practicianCode.trim();
    }

    /**
     * 获取医院内部编码 （管理相对人的唯一编号）
     *
     * @return NOSOCOMIAL_CODE - 医院内部编码 （管理相对人的唯一编号）
     */
    public String getNosocomialCode() {
        return nosocomialCode;
    }

    /**
     * 设置医院内部编码 （管理相对人的唯一编号）
     *
     * @param nosocomialCode 医院内部编码 （管理相对人的唯一编号）
     */
    public void setNosocomialCode(String nosocomialCode) {
        this.nosocomialCode = nosocomialCode == null ? null : nosocomialCode.trim();
    }

    /**
     * 获取职称名称（个体已取得的相关专业职称在特定编码体系中的名称 ）
     *
     * @return RESPONSIBILITY_NAME - 职称名称（个体已取得的相关专业职称在特定编码体系中的名称 ）
     */
    public String getResponsibilityName() {
        return responsibilityName;
    }

    /**
     * 设置职称名称（个体已取得的相关专业职称在特定编码体系中的名称 ）
     *
     * @param responsibilityName 职称名称（个体已取得的相关专业职称在特定编码体系中的名称 ）
     */
    public void setResponsibilityName(String responsibilityName) {
        this.responsibilityName = responsibilityName == null ? null : responsibilityName.trim();
    }

    /**
     * 获取职称评定日期（卫生人员职称评定的日期）
     *
     * @return ASSESS_DATE - 职称评定日期（卫生人员职称评定的日期）
     */
    public String getAssessDate() {
        return assessDate;
    }

    /**
     * 设置职称评定日期（卫生人员职称评定的日期）
     *
     * @param assessDate 职称评定日期（卫生人员职称评定的日期）
     */
    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate == null ? null : assessDate.trim();
    }

    /**
     * 获取在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     *
     * @return ACTIVE_STATUS_NAME - 在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     */
    public String getActiveStatusName() {
        return activeStatusName;
    }

    /**
     * 设置在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     *
     * @param activeStatusName 在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     */
    public void setActiveStatusName(String activeStatusName) {
        this.activeStatusName = activeStatusName == null ? null : activeStatusName.trim();
    }

    /**
     * 获取在职状态编码
     *
     * @return ACTIVE_STATUS_CODE - 在职状态编码
     */
    public String getActiveStatusCode() {
        return activeStatusCode;
    }

    /**
     * 设置在职状态编码
     *
     * @param activeStatusCode 在职状态编码
     */
    public void setActiveStatusCode(String activeStatusCode) {
        this.activeStatusCode = activeStatusCode == null ? null : activeStatusCode.trim();
    }

    /**
     * 获取参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     *
     * @return ATTEND_DATE - 参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     */
    public String getAttendDate() {
        return attendDate;
    }

    /**
     * 设置参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     *
     * @param attendDate 参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     */
    public void setAttendDate(String attendDate) {
        this.attendDate = attendDate == null ? null : attendDate.trim();
    }

    /**
     * 获取民族中文名称（本人所属民族的类别代码）
     *
     * @return NATIONALITY_NAME - 民族中文名称（本人所属民族的类别代码）
     */
    public String getNationalityName() {
        return nationalityName;
    }

    /**
     * 设置民族中文名称（本人所属民族的类别代码）
     *
     * @param nationalityName 民族中文名称（本人所属民族的类别代码）
     */
    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName == null ? null : nationalityName.trim();
    }

    /**
     * 获取婚姻状况中文名称（本人当前婚姻状况中文名称）
     *
     * @return MARRIAGE_NAME - 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    public String getMarriageName() {
        return marriageName;
    }

    /**
     * 设置婚姻状况中文名称（本人当前婚姻状况中文名称）
     *
     * @param marriageName 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    /**
     * 获取文化程度中文名称（本人受教育最高程度的类别中文名称）
     *
     * @return EDUCATION_NAME - 文化程度中文名称（本人受教育最高程度的类别中文名称）
     */
    public String getEducationName() {
        return educationName;
    }

    /**
     * 设置文化程度中文名称（本人受教育最高程度的类别中文名称）
     *
     * @param educationName 文化程度中文名称（本人受教育最高程度的类别中文名称）
     */
    public void setEducationName(String educationName) {
        this.educationName = educationName == null ? null : educationName.trim();
    }

    /**
     * 获取联系电话（联系方式中的的电话号码，包括国际、国内区号和分机号 ）
     *
     * @return TEL_NO - 联系电话（联系方式中的的电话号码，包括国际、国内区号和分机号 ）
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * 设置联系电话（联系方式中的的电话号码，包括国际、国内区号和分机号 ）
     *
     * @param telNo 联系电话（联系方式中的的电话号码，包括国际、国内区号和分机号 ）
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    /**
     * 获取通讯地址 （个体的联系地址详细描述）
     *
     * @return ADDRESS - 通讯地址 （个体的联系地址详细描述）
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置通讯地址 （个体的联系地址详细描述）
     *
     * @param address 通讯地址 （个体的联系地址详细描述）
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取电子邮件
     *
     * @return EMAIL - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取照片（照片路径）
     *
     * @return PHOTO - 照片（照片路径）
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置照片（照片路径）
     *
     * @param photo 照片（照片路径）
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * 获取标准科室名称（科室在特定编码体系中的名称 ）
     *
     * @return STD_DEPT_NAME - 标准科室名称（科室在特定编码体系中的名称 ）
     */
    public String getStdDeptName() {
        return stdDeptName;
    }

    /**
     * 设置标准科室名称（科室在特定编码体系中的名称 ）
     *
     * @param stdDeptName 标准科室名称（科室在特定编码体系中的名称 ）
     */
    public void setStdDeptName(String stdDeptName) {
        this.stdDeptName = stdDeptName == null ? null : stdDeptName.trim();
    }

    /**
     * 获取政治面貌
     *
     * @return POLITICAL_STATUS - 政治面貌
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 设置政治面貌
     *
     * @param politicalStatus 政治面貌
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    /**
     * 获取是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     *
     * @return IS_PERMANENT_STAFF - 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    public Long getIsPermanentStaff() {
        return isPermanentStaff;
    }

    /**
     * 设置是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     *
     * @param isPermanentStaff 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    public void setIsPermanentStaff(Long isPermanentStaff) {
        this.isPermanentStaff = isPermanentStaff;
    }

    /**
     * 获取医务人员类别名称（医务人员类别在特定编码体系中的名称）
     *
     * @return PRACTIONER_TYPE_NAME - 医务人员类别名称（医务人员类别在特定编码体系中的名称）
     */
    public String getPractionerTypeName() {
        return practionerTypeName;
    }

    /**
     * 设置医务人员类别名称（医务人员类别在特定编码体系中的名称）
     *
     * @param practionerTypeName 医务人员类别名称（医务人员类别在特定编码体系中的名称）
     */
    public void setPractionerTypeName(String practionerTypeName) {
        this.practionerTypeName = practionerTypeName == null ? null : practionerTypeName.trim();
    }

    /**
     * 获取a
     *
     * @return PRACTIONER_TYPE_CODE - a
     */
    public String getPractionerTypeCode() {
        return practionerTypeCode;
    }

    /**
     * 设置a
     *
     * @param practionerTypeCode a
     */
    public void setPractionerTypeCode(String practionerTypeCode) {
        this.practionerTypeCode = practionerTypeCode == null ? null : practionerTypeCode.trim();
    }

    /**
     * 获取姓名简拼
     *
     * @return NAME_PY - 姓名简拼
     */
    public String getNamePy() {
        return namePy;
    }

    /**
     * 设置姓名简拼
     *
     * @param namePy 姓名简拼
     */
    public void setNamePy(String namePy) {
        this.namePy = namePy == null ? null : namePy.trim();
    }

    /**
     * 获取姓名全拼
     *
     * @return NAME_PINYIN - 姓名全拼
     */
    public String getNamePinyin() {
        return namePinyin;
    }

    /**
     * 设置姓名全拼
     *
     * @param namePinyin 姓名全拼
     */
    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin == null ? null : namePinyin.trim();
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
}