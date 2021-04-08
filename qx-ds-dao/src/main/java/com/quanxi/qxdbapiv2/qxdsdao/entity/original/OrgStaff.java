package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORG_STAFF")
public class OrgStaff {
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
    @Column(name = "STAFF_ID")
    private String staffId;

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
     * 姓名（医务人员在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    @Column(name = "SPELL")
    private Short spell;

    /**
     * 性别代码GB/T 2261.1（本人生理性别的代码 ）
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
     * 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
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
     * 职称代码 GB/T 8561（个体已取得的相关专业职称在特定编码体系中的代码 ）
     */
    @Column(name = "RESPONSIBILITY_CODE")
    private String responsibilityCode;

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
     * 在职状态代码 DIR_ACTIVE_STATUS_CODE（卫生人员的在职状态在特定编码体系中的编码 ）
     */
    @Column(name = "ACTIVE_STATUS_CODE")
    private String activeStatusCode;

    /**
     * 在职状态名称（卫生人员的在职状态在特定编码体系中的名称）
     */
    @Column(name = "ACTIVE_STATUS_NAME")
    private String activeStatusName;

    /**
     * 参加工作日期（本人参加工作(开始就 业)当日的公元纪年日期 ）
     */
    @Column(name = "ATTEND_DATE")
    private String attendDate;

    /**
     * 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    @Column(name = "NATIONALITY_CODE")
    private String nationalityCode;

    /**
     * 民族中文名称（本人所属民族的类别代码）
     */
    @Column(name = "NATIONALITY_NAME")
    private String nationalityName;

    /**
     * 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    @Column(name = "MARRIAGE_CODE")
    private String marriageCode;

    /**
     * 婚姻状况中文名称（本人当前婚姻状况中文名称）
     */
    @Column(name = "MARRIAGE_NAME")
    private String marriageName;

    /**
     * 文化程度代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    @Column(name = "EDUCATION_CODE")
    private String educationCode;

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
     * 电子邮件（患者的电子邮箱地址）
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 标准科室编码 DIR_DEPT（科室在特定编码体系中的代码 ）
     */
    @Column(name = "STD_DEPT_CODE")
    private String stdDeptCode;

    /**
     * 标准科室名称（科室在特定编码体系中的名称 ）
     */
    @Column(name = "STD_DEPT_NAME")
    private String stdDeptName;

    /**
     * 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    @Column(name = "IS_PERMANENT_STAFF")
    private String isPermanentStaff;

    /**
     * 医务人员类别代码 DIR_PRACTITIONER_TYPE（医务人员类别在特定编码体系中的代码 ）
     */
    @Column(name = "PRACTIONER_TYPE_CODE")
    private String practionerTypeCode;

    /**
     * 医务人员类别名称（医务人员类别在特定编码体系中的名称）
     */
    @Column(name = "PRACTIONER_TYPE_NAME")
    private String practionerTypeName;

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
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * 照片（照片）
     */
    @Column(name = "PHOTO")
    private byte[] photo;

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
     * @return STAFF_ID - ID[主键]
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * 设置ID[主键]
     *
     * @param staffId ID[主键]
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
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
     * 获取姓名（医务人员在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @return NAME - 姓名（医务人员在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（医务人员在公安户籍管理部门正式登记注册的姓氏和名称 ）
     *
     * @param name 姓名（医务人员在公安户籍管理部门正式登记注册的姓氏和名称 ）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取姓名拼音首码 （卫生人员名字的拼音首码 ）
     *
     * @return SPELL - 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    public Short getSpell() {
        return spell;
    }

    /**
     * 设置姓名拼音首码 （卫生人员名字的拼音首码 ）
     *
     * @param spell 姓名拼音首码 （卫生人员名字的拼音首码 ）
     */
    public void setSpell(Short spell) {
        this.spell = spell;
    }

    /**
     * 获取性别代码GB/T 2261.1（本人生理性别的代码 ）
     *
     * @return SEX_CODE - 性别代码GB/T 2261.1（本人生理性别的代码 ）
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * 设置性别代码GB/T 2261.1（本人生理性别的代码 ）
     *
     * @param sexCode 性别代码GB/T 2261.1（本人生理性别的代码 ）
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
     * 获取国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @return COUNTRY_CODE - 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     *
     * @param countryCode 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
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
     * 获取职称代码 GB/T 8561（个体已取得的相关专业职称在特定编码体系中的代码 ）
     *
     * @return RESPONSIBILITY_CODE - 职称代码 GB/T 8561（个体已取得的相关专业职称在特定编码体系中的代码 ）
     */
    public String getResponsibilityCode() {
        return responsibilityCode;
    }

    /**
     * 设置职称代码 GB/T 8561（个体已取得的相关专业职称在特定编码体系中的代码 ）
     *
     * @param responsibilityCode 职称代码 GB/T 8561（个体已取得的相关专业职称在特定编码体系中的代码 ）
     */
    public void setResponsibilityCode(String responsibilityCode) {
        this.responsibilityCode = responsibilityCode == null ? null : responsibilityCode.trim();
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
     * 获取在职状态代码 DIR_ACTIVE_STATUS_CODE（卫生人员的在职状态在特定编码体系中的编码 ）
     *
     * @return ACTIVE_STATUS_CODE - 在职状态代码 DIR_ACTIVE_STATUS_CODE（卫生人员的在职状态在特定编码体系中的编码 ）
     */
    public String getActiveStatusCode() {
        return activeStatusCode;
    }

    /**
     * 设置在职状态代码 DIR_ACTIVE_STATUS_CODE（卫生人员的在职状态在特定编码体系中的编码 ）
     *
     * @param activeStatusCode 在职状态代码 DIR_ACTIVE_STATUS_CODE（卫生人员的在职状态在特定编码体系中的编码 ）
     */
    public void setActiveStatusCode(String activeStatusCode) {
        this.activeStatusCode = activeStatusCode == null ? null : activeStatusCode.trim();
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
     * 获取民族代码GB/T 3304（本人所属民族的类别代码）
     *
     * @return NATIONALITY_CODE - 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * 设置民族代码GB/T 3304（本人所属民族的类别代码）
     *
     * @param nationalityCode 民族代码GB/T 3304（本人所属民族的类别代码）
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode == null ? null : nationalityCode.trim();
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
     * 获取婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @return MARRIAGE_CODE - 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * 设置婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     *
     * @param marriageCode 婚姻状况代码GB/T 2261.2（本人当前婚姻状况代码）
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
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
     * 获取文化程度代码GB/T 4658（本人受教育最高程度的类别代码）
     *
     * @return EDUCATION_CODE - 文化程度代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    public String getEducationCode() {
        return educationCode;
    }

    /**
     * 设置文化程度代码GB/T 4658（本人受教育最高程度的类别代码）
     *
     * @param educationCode 文化程度代码GB/T 4658（本人受教育最高程度的类别代码）
     */
    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode == null ? null : educationCode.trim();
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
     * 获取电子邮件（患者的电子邮箱地址）
     *
     * @return EMAIL - 电子邮件（患者的电子邮箱地址）
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件（患者的电子邮箱地址）
     *
     * @param email 电子邮件（患者的电子邮箱地址）
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取医院科室本地代码 （医务人员所在的科室本地代码 ）
     *
     * @return DEPT_CODE - 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置医院科室本地代码 （医务人员所在的科室本地代码 ）
     *
     * @param deptCode 医院科室本地代码 （医务人员所在的科室本地代码 ）
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取医院科室本地名称 （医务人员所在的科室本地名称 ）
     *
     * @return DEPT_NAME - 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置医院科室本地名称 （医务人员所在的科室本地名称 ）
     *
     * @param deptName 医院科室本地名称 （医务人员所在的科室本地名称 ）
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取标准科室编码 DIR_DEPT（科室在特定编码体系中的代码 ）
     *
     * @return STD_DEPT_CODE - 标准科室编码 DIR_DEPT（科室在特定编码体系中的代码 ）
     */
    public String getStdDeptCode() {
        return stdDeptCode;
    }

    /**
     * 设置标准科室编码 DIR_DEPT（科室在特定编码体系中的代码 ）
     *
     * @param stdDeptCode 标准科室编码 DIR_DEPT（科室在特定编码体系中的代码 ）
     */
    public void setStdDeptCode(String stdDeptCode) {
        this.stdDeptCode = stdDeptCode == null ? null : stdDeptCode.trim();
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
     * 获取是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     *
     * @return IS_PERMANENT_STAFF - 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    public String getIsPermanentStaff() {
        return isPermanentStaff;
    }

    /**
     * 设置是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     *
     * @param isPermanentStaff 是否在编代码 0否 1是（标识卫生监督员是否在编的标志 ）
     */
    public void setIsPermanentStaff(String isPermanentStaff) {
        this.isPermanentStaff = isPermanentStaff == null ? null : isPermanentStaff.trim();
    }

    /**
     * 获取医务人员类别代码 DIR_PRACTITIONER_TYPE（医务人员类别在特定编码体系中的代码 ）
     *
     * @return PRACTIONER_TYPE_CODE - 医务人员类别代码 DIR_PRACTITIONER_TYPE（医务人员类别在特定编码体系中的代码 ）
     */
    public String getPractionerTypeCode() {
        return practionerTypeCode;
    }

    /**
     * 设置医务人员类别代码 DIR_PRACTITIONER_TYPE（医务人员类别在特定编码体系中的代码 ）
     *
     * @param practionerTypeCode 医务人员类别代码 DIR_PRACTITIONER_TYPE（医务人员类别在特定编码体系中的代码 ）
     */
    public void setPractionerTypeCode(String practionerTypeCode) {
        this.practionerTypeCode = practionerTypeCode == null ? null : practionerTypeCode.trim();
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
     * 获取照片（照片）
     *
     * @return PHOTO - 照片（照片）
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * 设置照片（照片）
     *
     * @param photo 照片（照片）
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}