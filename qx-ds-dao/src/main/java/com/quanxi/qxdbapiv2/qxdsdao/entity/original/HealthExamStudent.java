package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "HEALTH_EXAM_STUDENT")
public class HealthExamStudent {
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
     * 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    @Id
    @Column(name = "HEALTH_EXAM_FORM_NO")
    private String healthExamFormNo;

    /**
     * 学校名称
     */
    @Column(name = "SCHOOL_NAME")
    private String schoolName;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

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
     * 出生年月
     */
    @Column(name = "BIRTH_DATE")
    private String birthDate;

    /**
     * 国籍代码GB/T 2659（患者所属国籍在特定编码体系中的代码）
     */
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    /**
     * 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    @Column(name = "COUNTRY_NAME")
    private String countryName;

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
     * 现详细住址（目前居住地的详细地址）
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 身份证号码 （身份证上唯一的法定标识符 ）
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 既往病史DIR_STU_EXAM_DIS
     */
    @Column(name = "PAST_DISEASE_CODE")
    private String pastDiseaseCode;

    /**
     * 既往病史中文
     */
    @Column(name = "PAST_DISEASE_NAME")
    private String pastDiseaseName;

    /**
     * 地方病史
     */
    @Column(name = "LOCAL_DISEASE")
    private String localDisease;

    /**
     * 家族病史
     */
    @Column(name = "FAMILY_DISEASE")
    private String familyDisease;

    /**
     * 现病史
     */
    @Column(name = "PRESENT_DISEASE")
    private String presentDisease;

    /**
     * 体检时间
     */
    @Column(name = "EXAM_DATE")
    private String examDate;

    /**
     * 身高（cm)
     */
    @Column(name = "HEIGHT")
    private BigDecimal height;

    /**
     * 体重(kg)
     */
    @Column(name = "WEIGHT")
    private BigDecimal weight;

    /**
     * 肺活量（次/ml)
     */
    @Column(name = "LUNG_RATE")
    private Short lungRate;

    /**
     * 头部检查情况代码DIR_EXAMINE_RESULT
     */
    @Column(name = "HEAD_CODE")
    private String headCode;

    /**
     * 头部检查情况名称
     */
    @Column(name = "HEAD_NAME")
    private String headName;

    /**
     * 颈部检查情况代码DIR_EXAMINE_RESULT
     */
    @Column(name = "NICK_CODE")
    private String nickCode;

    /**
     * 颈部检查情况名称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 胸部检查情况代码DIR_STU_EXAM_BREAST
     */
    @Column(name = "BREAST_CODE")
    private String breastCode;

    /**
     * 胸部检查情况名称
     */
    @Column(name = "BREAST_NAME")
    private String breastName;

    /**
     * 脊柱检查情况代码DIR_STU_EXAM_BACK_BONE
     */
    @Column(name = "BACK_BONE_CODE")
    private String backBoneCode;

    /**
     * 脊柱检查情况名称
     */
    @Column(name = "BACK_BONE_NAME")
    private String backBoneName;

    /**
     * 外科四肢代码DIR_STU_EXAM_LIMBS
     */
    @Column(name = "LIMBS_CODE")
    private String limbsCode;

    /**
     * 外科四肢名称
     */
    @Column(name = "LIMBS_NAME")
    private String limbsName;

    /**
     * 外科皮肤代码DIR_EXAMINE_RESULT
     */
    @Column(name = "SKIN_CODE")
    private String skinCode;

    /**
     * 外科皮肤名称
     */
    @Column(name = "SKIN_NAME")
    private String skinName;

    /**
     * 外科淋巴结代码DIR_EXAMINE_RESULT
     */
    @Column(name = "LYMPH_CODE")
    private String lymphCode;

    /**
     * 外科淋巴结名称
     */
    @Column(name = "LYMPH_NAME")
    private String lymphName;

    /**
     * 外科甲状腺代码DIR_EXAMINE_RESULT
     */
    @Column(name = "THYROID_CODE")
    private String thyroidCode;

    /**
     * 外科甲状腺名称
     */
    @Column(name = "THYROID_NAME")
    private String thyroidName;

    /**
     * 视力左眼视力
     */
    @Column(name = "LEFT_VISION")
    private BigDecimal leftVision;

    /**
     * 视力右眼视力
     */
    @Column(name = "RIGHT_VISION")
    private BigDecimal rightVision;

    /**
     * 左眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    @Column(name = "LEFT_DETECT_CODE")
    private String leftDetectCode;

    /**
     * 左眼串镜情况名称
     */
    @Column(name = "LEFT_DETECT_NAME")
    private String leftDetectName;

    /**
     * 右眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    @Column(name = "RIGHT_DETECT_CODE")
    private String rightDetectCode;

    /**
     * 右眼串镜情况名称
     */
    @Column(name = "RIGHT_DETECT_NAME")
    private String rightDetectName;

    /**
     * 左眼是否有结膜炎0否 1是
     */
    @Column(name = "IS_LEFT_CONJUNCT")
    private String isLeftConjunct;

    /**
     * 右眼是否有结膜炎0否 1是
     */
    @Column(name = "IS_RIGHT_COUNJUNCT")
    private String isRightCounjunct;

    /**
     * 左眼是否有沙眼0否 1是
     */
    @Column(name = "IS_LEFT_TRACHOMA")
    private String isLeftTrachoma;

    /**
     * 右眼是否有沙眼0否 1是
     */
    @Column(name = "IS_RIGHT_TRACHOMA")
    private String isRightTrachoma;

    /**
     * 收缩压
     */
    @Column(name = "MINUS_PRESSURE")
    private Short minusPressure;

    /**
     * 扩张压
     */
    @Column(name = "EXTEND_PRESSURE")
    private Short extendPressure;

    /**
     * 心脏检查情况代码DIR_STU_EXAM_HEART
     */
    @Column(name = "HEART_CODE")
    private String heartCode;

    /**
     * 心脏检查情况名称
     */
    @Column(name = "HEART_NAME")
    private String heartName;

    /**
     * 内科心率(次/分)
     */
    @Column(name = "BREATHING_RATE")
    private Short breathingRate;

    /**
     * 肺部检查情况代码DIR_EXAMINE_RESULT
     */
    @Column(name = "LUNG_CODE")
    private String lungCode;

    /**
     * 肺部检查情况名称
     */
    @Column(name = "LUNG_NAME")
    private String lungName;

    /**
     * 肝部检查情况代码DIR_EXAMINE_RESULT
     */
    @Column(name = "LIVER_CODE")
    private String liverCode;

    /**
     * 肝部检查情况名称
     */
    @Column(name = "LIVER_NAME")
    private String liverName;

    /**
     * 脾部检查情况代码DIR_EXAMINE_RESULT
     */
    @Column(name = "SPLEEN_CODE")
    private String spleenCode;

    /**
     * 脾部检查情况名称
     */
    @Column(name = "SPLEEN_NAME")
    private String spleenName;

    /**
     * 口腔牙周检查情况代码DIR_STU_EXAM_TOOTH_AROUND
     */
    @Column(name = "TOOTH_AROUND_CODE")
    private String toothAroundCode;

    /**
     * 口腔牙周检查情况名称
     */
    @Column(name = "TOOTH_AROUND_NAME")
    private String toothAroundName;

    /**
     * 扁桃体检查情况代码DIR_STU_EXAM_TONSIL
     */
    @Column(name = "TONSIL_CODE")
    private String tonsilCode;

    /**
     * 扁桃体检查情况名称
     */
    @Column(name = "TONSIL_NAME")
    private String tonsilName;

    /**
     * 患病牙齿数量
     */
    @Column(name = "TOOTH_NUM")
    private Short toothNum;

    /**
     * 身高检查医生签字
     */
    @Column(name = "HEIGHT_DOCTOR_NAME")
    private String heightDoctorName;

    /**
     * 体重检查医生签字
     */
    @Column(name = "WEIGHT_DOCTOR_NAME")
    private String weightDoctorName;

    /**
     * 肺活量检查医生签字
     */
    @Column(name = "LUNG_RATE_DOCTOR_NAME")
    private String lungRateDoctorName;

    /**
     * 头部检查医生签字
     */
    @Column(name = "HEAD_DOCTOR_NAME")
    private String headDoctorName;

    /**
     * 颈部检查医生签字
     */
    @Column(name = "NICK_DOCTOR_NAME")
    private String nickDoctorName;

    /**
     * 胸部检查医生签字
     */
    @Column(name = "BREAST_DOCTOR_NAME")
    private String breastDoctorName;

    /**
     * 脊椎检查医生签字
     */
    @Column(name = "BACK_BONE_DOCTOR_NAME")
    private String backBoneDoctorName;

    /**
     * 四肢检查医生签字
     */
    @Column(name = "LIMBS_DOCTOR_NAME")
    private String limbsDoctorName;

    /**
     * 皮肤检查医生签字
     */
    @Column(name = "SKIN_DOCTOR_NAME")
    private String skinDoctorName;

    /**
     * 淋巴结检查医生签字
     */
    @Column(name = "LYMPH_DOCTOR_NAME")
    private String lymphDoctorName;

    /**
     * 甲状腺检查医生签字
     */
    @Column(name = "THYROIDDOCTOR_NAME")
    private String thyroiddoctorName;

    /**
     * 牙周检查医生签字
     */
    @Column(name = "VISION_DOCTOR_NAME")
    private String visionDoctorName;

    /**
     * 串镜检查医生签字
     */
    @Column(name = "DETECT_DOCTOR_NAME")
    private String detectDoctorName;

    /**
     * 结膜炎检查医生签字
     */
    @Column(name = "CONJUNCT_DOCTOR_NAME")
    private String conjunctDoctorName;

    /**
     * 沙眼检查医生签字
     */
    @Column(name = "TRACHOMA_DOCTOR_NAME")
    private String trachomaDoctorName;

    /**
     * 血压检查医生签字
     */
    @Column(name = "PRESSURE_DOCTOR_NAME")
    private String pressureDoctorName;

    /**
     * 心部检查医生签字
     */
    @Column(name = "HEART_DOCTOR_NAME")
    private String heartDoctorName;

    /**
     * 心率检查医生签字
     */
    @Column(name = "BREATHING_RATE_DOCTOR_NAME")
    private String breathingRateDoctorName;

    /**
     * 肺部检查医生签字
     */
    @Column(name = "LUNG_DOCTOR_NAME")
    private String lungDoctorName;

    /**
     * 肝部检查医生签字
     */
    @Column(name = "LIVER_DOCTOR_NAME")
    private String liverDoctorName;

    /**
     * 脾部检查医生签字
     */
    @Column(name = "SPLEEN_DOCTOR_NAME")
    private String spleenDoctorName;

    /**
     * 牙周检查医生签字
     */
    @Column(name = "TOOTH_AROUND_DOCTOR_NAME")
    private String toothAroundDoctorName;

    /**
     * 牙齿检查医生签字
     */
    @Column(name = "TOOTH_DOCTOR_NAME")
    private String toothDoctorName;

    /**
     * 扁桃体检查医生签字
     */
    @Column(name = "TONSIL_DOCTOR_NAME")
    private String tonsilDoctorName;

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
     * 获取健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @return HEALTH_EXAM_FORM_NO - 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public String getHealthExamFormNo() {
        return healthExamFormNo;
    }

    /**
     * 设置健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     *
     * @param healthExamFormNo 健康体检表编号[主键]（按照某一特定编码规则规定的健康体检表顺序号 ）
     */
    public void setHealthExamFormNo(String healthExamFormNo) {
        this.healthExamFormNo = healthExamFormNo == null ? null : healthExamFormNo.trim();
    }

    /**
     * 获取学校名称
     *
     * @return SCHOOL_NAME - 学校名称
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置学校名称
     *
     * @param schoolName 学校名称
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取出生年月
     *
     * @return BIRTH_DATE - 出生年月
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生年月
     *
     * @param birthDate 出生年月
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
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
     * @return COUNTRY_NAME - 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     *
     * @param countryName 国籍中文名称（患者所属国籍在特定编码体系中的中文名称）
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
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
     * 获取现详细住址（目前居住地的详细地址）
     *
     * @return ADDRESS - 现详细住址（目前居住地的详细地址）
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置现详细住址（目前居住地的详细地址）
     *
     * @param address 现详细住址（目前居住地的详细地址）
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取身份证号码 （身份证上唯一的法定标识符 ）
     *
     * @return ID_NO - 身份证号码 （身份证上唯一的法定标识符 ）
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证号码 （身份证上唯一的法定标识符 ）
     *
     * @param idNo 身份证号码 （身份证上唯一的法定标识符 ）
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取既往病史DIR_STU_EXAM_DIS
     *
     * @return PAST_DISEASE_CODE - 既往病史DIR_STU_EXAM_DIS
     */
    public String getPastDiseaseCode() {
        return pastDiseaseCode;
    }

    /**
     * 设置既往病史DIR_STU_EXAM_DIS
     *
     * @param pastDiseaseCode 既往病史DIR_STU_EXAM_DIS
     */
    public void setPastDiseaseCode(String pastDiseaseCode) {
        this.pastDiseaseCode = pastDiseaseCode == null ? null : pastDiseaseCode.trim();
    }

    /**
     * 获取既往病史中文
     *
     * @return PAST_DISEASE_NAME - 既往病史中文
     */
    public String getPastDiseaseName() {
        return pastDiseaseName;
    }

    /**
     * 设置既往病史中文
     *
     * @param pastDiseaseName 既往病史中文
     */
    public void setPastDiseaseName(String pastDiseaseName) {
        this.pastDiseaseName = pastDiseaseName == null ? null : pastDiseaseName.trim();
    }

    /**
     * 获取地方病史
     *
     * @return LOCAL_DISEASE - 地方病史
     */
    public String getLocalDisease() {
        return localDisease;
    }

    /**
     * 设置地方病史
     *
     * @param localDisease 地方病史
     */
    public void setLocalDisease(String localDisease) {
        this.localDisease = localDisease == null ? null : localDisease.trim();
    }

    /**
     * 获取家族病史
     *
     * @return FAMILY_DISEASE - 家族病史
     */
    public String getFamilyDisease() {
        return familyDisease;
    }

    /**
     * 设置家族病史
     *
     * @param familyDisease 家族病史
     */
    public void setFamilyDisease(String familyDisease) {
        this.familyDisease = familyDisease == null ? null : familyDisease.trim();
    }

    /**
     * 获取现病史
     *
     * @return PRESENT_DISEASE - 现病史
     */
    public String getPresentDisease() {
        return presentDisease;
    }

    /**
     * 设置现病史
     *
     * @param presentDisease 现病史
     */
    public void setPresentDisease(String presentDisease) {
        this.presentDisease = presentDisease == null ? null : presentDisease.trim();
    }

    /**
     * 获取体检时间
     *
     * @return EXAM_DATE - 体检时间
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * 设置体检时间
     *
     * @param examDate 体检时间
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate == null ? null : examDate.trim();
    }

    /**
     * 获取身高（cm)
     *
     * @return HEIGHT - 身高（cm)
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设置身高（cm)
     *
     * @param height 身高（cm)
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * 获取体重(kg)
     *
     * @return WEIGHT - 体重(kg)
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置体重(kg)
     *
     * @param weight 体重(kg)
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取肺活量（次/ml)
     *
     * @return LUNG_RATE - 肺活量（次/ml)
     */
    public Short getLungRate() {
        return lungRate;
    }

    /**
     * 设置肺活量（次/ml)
     *
     * @param lungRate 肺活量（次/ml)
     */
    public void setLungRate(Short lungRate) {
        this.lungRate = lungRate;
    }

    /**
     * 获取头部检查情况代码DIR_EXAMINE_RESULT
     *
     * @return HEAD_CODE - 头部检查情况代码DIR_EXAMINE_RESULT
     */
    public String getHeadCode() {
        return headCode;
    }

    /**
     * 设置头部检查情况代码DIR_EXAMINE_RESULT
     *
     * @param headCode 头部检查情况代码DIR_EXAMINE_RESULT
     */
    public void setHeadCode(String headCode) {
        this.headCode = headCode == null ? null : headCode.trim();
    }

    /**
     * 获取头部检查情况名称
     *
     * @return HEAD_NAME - 头部检查情况名称
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置头部检查情况名称
     *
     * @param headName 头部检查情况名称
     */
    public void setHeadName(String headName) {
        this.headName = headName == null ? null : headName.trim();
    }

    /**
     * 获取颈部检查情况代码DIR_EXAMINE_RESULT
     *
     * @return NICK_CODE - 颈部检查情况代码DIR_EXAMINE_RESULT
     */
    public String getNickCode() {
        return nickCode;
    }

    /**
     * 设置颈部检查情况代码DIR_EXAMINE_RESULT
     *
     * @param nickCode 颈部检查情况代码DIR_EXAMINE_RESULT
     */
    public void setNickCode(String nickCode) {
        this.nickCode = nickCode == null ? null : nickCode.trim();
    }

    /**
     * 获取颈部检查情况名称
     *
     * @return NICK_NAME - 颈部检查情况名称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置颈部检查情况名称
     *
     * @param nickName 颈部检查情况名称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取胸部检查情况代码DIR_STU_EXAM_BREAST
     *
     * @return BREAST_CODE - 胸部检查情况代码DIR_STU_EXAM_BREAST
     */
    public String getBreastCode() {
        return breastCode;
    }

    /**
     * 设置胸部检查情况代码DIR_STU_EXAM_BREAST
     *
     * @param breastCode 胸部检查情况代码DIR_STU_EXAM_BREAST
     */
    public void setBreastCode(String breastCode) {
        this.breastCode = breastCode == null ? null : breastCode.trim();
    }

    /**
     * 获取胸部检查情况名称
     *
     * @return BREAST_NAME - 胸部检查情况名称
     */
    public String getBreastName() {
        return breastName;
    }

    /**
     * 设置胸部检查情况名称
     *
     * @param breastName 胸部检查情况名称
     */
    public void setBreastName(String breastName) {
        this.breastName = breastName == null ? null : breastName.trim();
    }

    /**
     * 获取脊柱检查情况代码DIR_STU_EXAM_BACK_BONE
     *
     * @return BACK_BONE_CODE - 脊柱检查情况代码DIR_STU_EXAM_BACK_BONE
     */
    public String getBackBoneCode() {
        return backBoneCode;
    }

    /**
     * 设置脊柱检查情况代码DIR_STU_EXAM_BACK_BONE
     *
     * @param backBoneCode 脊柱检查情况代码DIR_STU_EXAM_BACK_BONE
     */
    public void setBackBoneCode(String backBoneCode) {
        this.backBoneCode = backBoneCode == null ? null : backBoneCode.trim();
    }

    /**
     * 获取脊柱检查情况名称
     *
     * @return BACK_BONE_NAME - 脊柱检查情况名称
     */
    public String getBackBoneName() {
        return backBoneName;
    }

    /**
     * 设置脊柱检查情况名称
     *
     * @param backBoneName 脊柱检查情况名称
     */
    public void setBackBoneName(String backBoneName) {
        this.backBoneName = backBoneName == null ? null : backBoneName.trim();
    }

    /**
     * 获取外科四肢代码DIR_STU_EXAM_LIMBS
     *
     * @return LIMBS_CODE - 外科四肢代码DIR_STU_EXAM_LIMBS
     */
    public String getLimbsCode() {
        return limbsCode;
    }

    /**
     * 设置外科四肢代码DIR_STU_EXAM_LIMBS
     *
     * @param limbsCode 外科四肢代码DIR_STU_EXAM_LIMBS
     */
    public void setLimbsCode(String limbsCode) {
        this.limbsCode = limbsCode == null ? null : limbsCode.trim();
    }

    /**
     * 获取外科四肢名称
     *
     * @return LIMBS_NAME - 外科四肢名称
     */
    public String getLimbsName() {
        return limbsName;
    }

    /**
     * 设置外科四肢名称
     *
     * @param limbsName 外科四肢名称
     */
    public void setLimbsName(String limbsName) {
        this.limbsName = limbsName == null ? null : limbsName.trim();
    }

    /**
     * 获取外科皮肤代码DIR_EXAMINE_RESULT
     *
     * @return SKIN_CODE - 外科皮肤代码DIR_EXAMINE_RESULT
     */
    public String getSkinCode() {
        return skinCode;
    }

    /**
     * 设置外科皮肤代码DIR_EXAMINE_RESULT
     *
     * @param skinCode 外科皮肤代码DIR_EXAMINE_RESULT
     */
    public void setSkinCode(String skinCode) {
        this.skinCode = skinCode == null ? null : skinCode.trim();
    }

    /**
     * 获取外科皮肤名称
     *
     * @return SKIN_NAME - 外科皮肤名称
     */
    public String getSkinName() {
        return skinName;
    }

    /**
     * 设置外科皮肤名称
     *
     * @param skinName 外科皮肤名称
     */
    public void setSkinName(String skinName) {
        this.skinName = skinName == null ? null : skinName.trim();
    }

    /**
     * 获取外科淋巴结代码DIR_EXAMINE_RESULT
     *
     * @return LYMPH_CODE - 外科淋巴结代码DIR_EXAMINE_RESULT
     */
    public String getLymphCode() {
        return lymphCode;
    }

    /**
     * 设置外科淋巴结代码DIR_EXAMINE_RESULT
     *
     * @param lymphCode 外科淋巴结代码DIR_EXAMINE_RESULT
     */
    public void setLymphCode(String lymphCode) {
        this.lymphCode = lymphCode == null ? null : lymphCode.trim();
    }

    /**
     * 获取外科淋巴结名称
     *
     * @return LYMPH_NAME - 外科淋巴结名称
     */
    public String getLymphName() {
        return lymphName;
    }

    /**
     * 设置外科淋巴结名称
     *
     * @param lymphName 外科淋巴结名称
     */
    public void setLymphName(String lymphName) {
        this.lymphName = lymphName == null ? null : lymphName.trim();
    }

    /**
     * 获取外科甲状腺代码DIR_EXAMINE_RESULT
     *
     * @return THYROID_CODE - 外科甲状腺代码DIR_EXAMINE_RESULT
     */
    public String getThyroidCode() {
        return thyroidCode;
    }

    /**
     * 设置外科甲状腺代码DIR_EXAMINE_RESULT
     *
     * @param thyroidCode 外科甲状腺代码DIR_EXAMINE_RESULT
     */
    public void setThyroidCode(String thyroidCode) {
        this.thyroidCode = thyroidCode == null ? null : thyroidCode.trim();
    }

    /**
     * 获取外科甲状腺名称
     *
     * @return THYROID_NAME - 外科甲状腺名称
     */
    public String getThyroidName() {
        return thyroidName;
    }

    /**
     * 设置外科甲状腺名称
     *
     * @param thyroidName 外科甲状腺名称
     */
    public void setThyroidName(String thyroidName) {
        this.thyroidName = thyroidName == null ? null : thyroidName.trim();
    }

    /**
     * 获取视力左眼视力
     *
     * @return LEFT_VISION - 视力左眼视力
     */
    public BigDecimal getLeftVision() {
        return leftVision;
    }

    /**
     * 设置视力左眼视力
     *
     * @param leftVision 视力左眼视力
     */
    public void setLeftVision(BigDecimal leftVision) {
        this.leftVision = leftVision;
    }

    /**
     * 获取视力右眼视力
     *
     * @return RIGHT_VISION - 视力右眼视力
     */
    public BigDecimal getRightVision() {
        return rightVision;
    }

    /**
     * 设置视力右眼视力
     *
     * @param rightVision 视力右眼视力
     */
    public void setRightVision(BigDecimal rightVision) {
        this.rightVision = rightVision;
    }

    /**
     * 获取左眼串镜情况代码DIR_STU_EXAM_DETECT
     *
     * @return LEFT_DETECT_CODE - 左眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    public String getLeftDetectCode() {
        return leftDetectCode;
    }

    /**
     * 设置左眼串镜情况代码DIR_STU_EXAM_DETECT
     *
     * @param leftDetectCode 左眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    public void setLeftDetectCode(String leftDetectCode) {
        this.leftDetectCode = leftDetectCode == null ? null : leftDetectCode.trim();
    }

    /**
     * 获取左眼串镜情况名称
     *
     * @return LEFT_DETECT_NAME - 左眼串镜情况名称
     */
    public String getLeftDetectName() {
        return leftDetectName;
    }

    /**
     * 设置左眼串镜情况名称
     *
     * @param leftDetectName 左眼串镜情况名称
     */
    public void setLeftDetectName(String leftDetectName) {
        this.leftDetectName = leftDetectName == null ? null : leftDetectName.trim();
    }

    /**
     * 获取右眼串镜情况代码DIR_STU_EXAM_DETECT
     *
     * @return RIGHT_DETECT_CODE - 右眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    public String getRightDetectCode() {
        return rightDetectCode;
    }

    /**
     * 设置右眼串镜情况代码DIR_STU_EXAM_DETECT
     *
     * @param rightDetectCode 右眼串镜情况代码DIR_STU_EXAM_DETECT
     */
    public void setRightDetectCode(String rightDetectCode) {
        this.rightDetectCode = rightDetectCode == null ? null : rightDetectCode.trim();
    }

    /**
     * 获取右眼串镜情况名称
     *
     * @return RIGHT_DETECT_NAME - 右眼串镜情况名称
     */
    public String getRightDetectName() {
        return rightDetectName;
    }

    /**
     * 设置右眼串镜情况名称
     *
     * @param rightDetectName 右眼串镜情况名称
     */
    public void setRightDetectName(String rightDetectName) {
        this.rightDetectName = rightDetectName == null ? null : rightDetectName.trim();
    }

    /**
     * 获取左眼是否有结膜炎0否 1是
     *
     * @return IS_LEFT_CONJUNCT - 左眼是否有结膜炎0否 1是
     */
    public String getIsLeftConjunct() {
        return isLeftConjunct;
    }

    /**
     * 设置左眼是否有结膜炎0否 1是
     *
     * @param isLeftConjunct 左眼是否有结膜炎0否 1是
     */
    public void setIsLeftConjunct(String isLeftConjunct) {
        this.isLeftConjunct = isLeftConjunct == null ? null : isLeftConjunct.trim();
    }

    /**
     * 获取右眼是否有结膜炎0否 1是
     *
     * @return IS_RIGHT_COUNJUNCT - 右眼是否有结膜炎0否 1是
     */
    public String getIsRightCounjunct() {
        return isRightCounjunct;
    }

    /**
     * 设置右眼是否有结膜炎0否 1是
     *
     * @param isRightCounjunct 右眼是否有结膜炎0否 1是
     */
    public void setIsRightCounjunct(String isRightCounjunct) {
        this.isRightCounjunct = isRightCounjunct == null ? null : isRightCounjunct.trim();
    }

    /**
     * 获取左眼是否有沙眼0否 1是
     *
     * @return IS_LEFT_TRACHOMA - 左眼是否有沙眼0否 1是
     */
    public String getIsLeftTrachoma() {
        return isLeftTrachoma;
    }

    /**
     * 设置左眼是否有沙眼0否 1是
     *
     * @param isLeftTrachoma 左眼是否有沙眼0否 1是
     */
    public void setIsLeftTrachoma(String isLeftTrachoma) {
        this.isLeftTrachoma = isLeftTrachoma == null ? null : isLeftTrachoma.trim();
    }

    /**
     * 获取右眼是否有沙眼0否 1是
     *
     * @return IS_RIGHT_TRACHOMA - 右眼是否有沙眼0否 1是
     */
    public String getIsRightTrachoma() {
        return isRightTrachoma;
    }

    /**
     * 设置右眼是否有沙眼0否 1是
     *
     * @param isRightTrachoma 右眼是否有沙眼0否 1是
     */
    public void setIsRightTrachoma(String isRightTrachoma) {
        this.isRightTrachoma = isRightTrachoma == null ? null : isRightTrachoma.trim();
    }

    /**
     * 获取收缩压
     *
     * @return MINUS_PRESSURE - 收缩压
     */
    public Short getMinusPressure() {
        return minusPressure;
    }

    /**
     * 设置收缩压
     *
     * @param minusPressure 收缩压
     */
    public void setMinusPressure(Short minusPressure) {
        this.minusPressure = minusPressure;
    }

    /**
     * 获取扩张压
     *
     * @return EXTEND_PRESSURE - 扩张压
     */
    public Short getExtendPressure() {
        return extendPressure;
    }

    /**
     * 设置扩张压
     *
     * @param extendPressure 扩张压
     */
    public void setExtendPressure(Short extendPressure) {
        this.extendPressure = extendPressure;
    }

    /**
     * 获取心脏检查情况代码DIR_STU_EXAM_HEART
     *
     * @return HEART_CODE - 心脏检查情况代码DIR_STU_EXAM_HEART
     */
    public String getHeartCode() {
        return heartCode;
    }

    /**
     * 设置心脏检查情况代码DIR_STU_EXAM_HEART
     *
     * @param heartCode 心脏检查情况代码DIR_STU_EXAM_HEART
     */
    public void setHeartCode(String heartCode) {
        this.heartCode = heartCode == null ? null : heartCode.trim();
    }

    /**
     * 获取心脏检查情况名称
     *
     * @return HEART_NAME - 心脏检查情况名称
     */
    public String getHeartName() {
        return heartName;
    }

    /**
     * 设置心脏检查情况名称
     *
     * @param heartName 心脏检查情况名称
     */
    public void setHeartName(String heartName) {
        this.heartName = heartName == null ? null : heartName.trim();
    }

    /**
     * 获取内科心率(次/分)
     *
     * @return BREATHING_RATE - 内科心率(次/分)
     */
    public Short getBreathingRate() {
        return breathingRate;
    }

    /**
     * 设置内科心率(次/分)
     *
     * @param breathingRate 内科心率(次/分)
     */
    public void setBreathingRate(Short breathingRate) {
        this.breathingRate = breathingRate;
    }

    /**
     * 获取肺部检查情况代码DIR_EXAMINE_RESULT
     *
     * @return LUNG_CODE - 肺部检查情况代码DIR_EXAMINE_RESULT
     */
    public String getLungCode() {
        return lungCode;
    }

    /**
     * 设置肺部检查情况代码DIR_EXAMINE_RESULT
     *
     * @param lungCode 肺部检查情况代码DIR_EXAMINE_RESULT
     */
    public void setLungCode(String lungCode) {
        this.lungCode = lungCode == null ? null : lungCode.trim();
    }

    /**
     * 获取肺部检查情况名称
     *
     * @return LUNG_NAME - 肺部检查情况名称
     */
    public String getLungName() {
        return lungName;
    }

    /**
     * 设置肺部检查情况名称
     *
     * @param lungName 肺部检查情况名称
     */
    public void setLungName(String lungName) {
        this.lungName = lungName == null ? null : lungName.trim();
    }

    /**
     * 获取肝部检查情况代码DIR_EXAMINE_RESULT
     *
     * @return LIVER_CODE - 肝部检查情况代码DIR_EXAMINE_RESULT
     */
    public String getLiverCode() {
        return liverCode;
    }

    /**
     * 设置肝部检查情况代码DIR_EXAMINE_RESULT
     *
     * @param liverCode 肝部检查情况代码DIR_EXAMINE_RESULT
     */
    public void setLiverCode(String liverCode) {
        this.liverCode = liverCode == null ? null : liverCode.trim();
    }

    /**
     * 获取肝部检查情况名称
     *
     * @return LIVER_NAME - 肝部检查情况名称
     */
    public String getLiverName() {
        return liverName;
    }

    /**
     * 设置肝部检查情况名称
     *
     * @param liverName 肝部检查情况名称
     */
    public void setLiverName(String liverName) {
        this.liverName = liverName == null ? null : liverName.trim();
    }

    /**
     * 获取脾部检查情况代码DIR_EXAMINE_RESULT
     *
     * @return SPLEEN_CODE - 脾部检查情况代码DIR_EXAMINE_RESULT
     */
    public String getSpleenCode() {
        return spleenCode;
    }

    /**
     * 设置脾部检查情况代码DIR_EXAMINE_RESULT
     *
     * @param spleenCode 脾部检查情况代码DIR_EXAMINE_RESULT
     */
    public void setSpleenCode(String spleenCode) {
        this.spleenCode = spleenCode == null ? null : spleenCode.trim();
    }

    /**
     * 获取脾部检查情况名称
     *
     * @return SPLEEN_NAME - 脾部检查情况名称
     */
    public String getSpleenName() {
        return spleenName;
    }

    /**
     * 设置脾部检查情况名称
     *
     * @param spleenName 脾部检查情况名称
     */
    public void setSpleenName(String spleenName) {
        this.spleenName = spleenName == null ? null : spleenName.trim();
    }

    /**
     * 获取口腔牙周检查情况代码DIR_STU_EXAM_TOOTH_AROUND
     *
     * @return TOOTH_AROUND_CODE - 口腔牙周检查情况代码DIR_STU_EXAM_TOOTH_AROUND
     */
    public String getToothAroundCode() {
        return toothAroundCode;
    }

    /**
     * 设置口腔牙周检查情况代码DIR_STU_EXAM_TOOTH_AROUND
     *
     * @param toothAroundCode 口腔牙周检查情况代码DIR_STU_EXAM_TOOTH_AROUND
     */
    public void setToothAroundCode(String toothAroundCode) {
        this.toothAroundCode = toothAroundCode == null ? null : toothAroundCode.trim();
    }

    /**
     * 获取口腔牙周检查情况名称
     *
     * @return TOOTH_AROUND_NAME - 口腔牙周检查情况名称
     */
    public String getToothAroundName() {
        return toothAroundName;
    }

    /**
     * 设置口腔牙周检查情况名称
     *
     * @param toothAroundName 口腔牙周检查情况名称
     */
    public void setToothAroundName(String toothAroundName) {
        this.toothAroundName = toothAroundName == null ? null : toothAroundName.trim();
    }

    /**
     * 获取扁桃体检查情况代码DIR_STU_EXAM_TONSIL
     *
     * @return TONSIL_CODE - 扁桃体检查情况代码DIR_STU_EXAM_TONSIL
     */
    public String getTonsilCode() {
        return tonsilCode;
    }

    /**
     * 设置扁桃体检查情况代码DIR_STU_EXAM_TONSIL
     *
     * @param tonsilCode 扁桃体检查情况代码DIR_STU_EXAM_TONSIL
     */
    public void setTonsilCode(String tonsilCode) {
        this.tonsilCode = tonsilCode == null ? null : tonsilCode.trim();
    }

    /**
     * 获取扁桃体检查情况名称
     *
     * @return TONSIL_NAME - 扁桃体检查情况名称
     */
    public String getTonsilName() {
        return tonsilName;
    }

    /**
     * 设置扁桃体检查情况名称
     *
     * @param tonsilName 扁桃体检查情况名称
     */
    public void setTonsilName(String tonsilName) {
        this.tonsilName = tonsilName == null ? null : tonsilName.trim();
    }

    /**
     * 获取患病牙齿数量
     *
     * @return TOOTH_NUM - 患病牙齿数量
     */
    public Short getToothNum() {
        return toothNum;
    }

    /**
     * 设置患病牙齿数量
     *
     * @param toothNum 患病牙齿数量
     */
    public void setToothNum(Short toothNum) {
        this.toothNum = toothNum;
    }

    /**
     * 获取身高检查医生签字
     *
     * @return HEIGHT_DOCTOR_NAME - 身高检查医生签字
     */
    public String getHeightDoctorName() {
        return heightDoctorName;
    }

    /**
     * 设置身高检查医生签字
     *
     * @param heightDoctorName 身高检查医生签字
     */
    public void setHeightDoctorName(String heightDoctorName) {
        this.heightDoctorName = heightDoctorName == null ? null : heightDoctorName.trim();
    }

    /**
     * 获取体重检查医生签字
     *
     * @return WEIGHT_DOCTOR_NAME - 体重检查医生签字
     */
    public String getWeightDoctorName() {
        return weightDoctorName;
    }

    /**
     * 设置体重检查医生签字
     *
     * @param weightDoctorName 体重检查医生签字
     */
    public void setWeightDoctorName(String weightDoctorName) {
        this.weightDoctorName = weightDoctorName == null ? null : weightDoctorName.trim();
    }

    /**
     * 获取肺活量检查医生签字
     *
     * @return LUNG_RATE_DOCTOR_NAME - 肺活量检查医生签字
     */
    public String getLungRateDoctorName() {
        return lungRateDoctorName;
    }

    /**
     * 设置肺活量检查医生签字
     *
     * @param lungRateDoctorName 肺活量检查医生签字
     */
    public void setLungRateDoctorName(String lungRateDoctorName) {
        this.lungRateDoctorName = lungRateDoctorName == null ? null : lungRateDoctorName.trim();
    }

    /**
     * 获取头部检查医生签字
     *
     * @return HEAD_DOCTOR_NAME - 头部检查医生签字
     */
    public String getHeadDoctorName() {
        return headDoctorName;
    }

    /**
     * 设置头部检查医生签字
     *
     * @param headDoctorName 头部检查医生签字
     */
    public void setHeadDoctorName(String headDoctorName) {
        this.headDoctorName = headDoctorName == null ? null : headDoctorName.trim();
    }

    /**
     * 获取颈部检查医生签字
     *
     * @return NICK_DOCTOR_NAME - 颈部检查医生签字
     */
    public String getNickDoctorName() {
        return nickDoctorName;
    }

    /**
     * 设置颈部检查医生签字
     *
     * @param nickDoctorName 颈部检查医生签字
     */
    public void setNickDoctorName(String nickDoctorName) {
        this.nickDoctorName = nickDoctorName == null ? null : nickDoctorName.trim();
    }

    /**
     * 获取胸部检查医生签字
     *
     * @return BREAST_DOCTOR_NAME - 胸部检查医生签字
     */
    public String getBreastDoctorName() {
        return breastDoctorName;
    }

    /**
     * 设置胸部检查医生签字
     *
     * @param breastDoctorName 胸部检查医生签字
     */
    public void setBreastDoctorName(String breastDoctorName) {
        this.breastDoctorName = breastDoctorName == null ? null : breastDoctorName.trim();
    }

    /**
     * 获取脊椎检查医生签字
     *
     * @return BACK_BONE_DOCTOR_NAME - 脊椎检查医生签字
     */
    public String getBackBoneDoctorName() {
        return backBoneDoctorName;
    }

    /**
     * 设置脊椎检查医生签字
     *
     * @param backBoneDoctorName 脊椎检查医生签字
     */
    public void setBackBoneDoctorName(String backBoneDoctorName) {
        this.backBoneDoctorName = backBoneDoctorName == null ? null : backBoneDoctorName.trim();
    }

    /**
     * 获取四肢检查医生签字
     *
     * @return LIMBS_DOCTOR_NAME - 四肢检查医生签字
     */
    public String getLimbsDoctorName() {
        return limbsDoctorName;
    }

    /**
     * 设置四肢检查医生签字
     *
     * @param limbsDoctorName 四肢检查医生签字
     */
    public void setLimbsDoctorName(String limbsDoctorName) {
        this.limbsDoctorName = limbsDoctorName == null ? null : limbsDoctorName.trim();
    }

    /**
     * 获取皮肤检查医生签字
     *
     * @return SKIN_DOCTOR_NAME - 皮肤检查医生签字
     */
    public String getSkinDoctorName() {
        return skinDoctorName;
    }

    /**
     * 设置皮肤检查医生签字
     *
     * @param skinDoctorName 皮肤检查医生签字
     */
    public void setSkinDoctorName(String skinDoctorName) {
        this.skinDoctorName = skinDoctorName == null ? null : skinDoctorName.trim();
    }

    /**
     * 获取淋巴结检查医生签字
     *
     * @return LYMPH_DOCTOR_NAME - 淋巴结检查医生签字
     */
    public String getLymphDoctorName() {
        return lymphDoctorName;
    }

    /**
     * 设置淋巴结检查医生签字
     *
     * @param lymphDoctorName 淋巴结检查医生签字
     */
    public void setLymphDoctorName(String lymphDoctorName) {
        this.lymphDoctorName = lymphDoctorName == null ? null : lymphDoctorName.trim();
    }

    /**
     * 获取甲状腺检查医生签字
     *
     * @return THYROIDDOCTOR_NAME - 甲状腺检查医生签字
     */
    public String getThyroiddoctorName() {
        return thyroiddoctorName;
    }

    /**
     * 设置甲状腺检查医生签字
     *
     * @param thyroiddoctorName 甲状腺检查医生签字
     */
    public void setThyroiddoctorName(String thyroiddoctorName) {
        this.thyroiddoctorName = thyroiddoctorName == null ? null : thyroiddoctorName.trim();
    }

    /**
     * 获取牙周检查医生签字
     *
     * @return VISION_DOCTOR_NAME - 牙周检查医生签字
     */
    public String getVisionDoctorName() {
        return visionDoctorName;
    }

    /**
     * 设置牙周检查医生签字
     *
     * @param visionDoctorName 牙周检查医生签字
     */
    public void setVisionDoctorName(String visionDoctorName) {
        this.visionDoctorName = visionDoctorName == null ? null : visionDoctorName.trim();
    }

    /**
     * 获取串镜检查医生签字
     *
     * @return DETECT_DOCTOR_NAME - 串镜检查医生签字
     */
    public String getDetectDoctorName() {
        return detectDoctorName;
    }

    /**
     * 设置串镜检查医生签字
     *
     * @param detectDoctorName 串镜检查医生签字
     */
    public void setDetectDoctorName(String detectDoctorName) {
        this.detectDoctorName = detectDoctorName == null ? null : detectDoctorName.trim();
    }

    /**
     * 获取结膜炎检查医生签字
     *
     * @return CONJUNCT_DOCTOR_NAME - 结膜炎检查医生签字
     */
    public String getConjunctDoctorName() {
        return conjunctDoctorName;
    }

    /**
     * 设置结膜炎检查医生签字
     *
     * @param conjunctDoctorName 结膜炎检查医生签字
     */
    public void setConjunctDoctorName(String conjunctDoctorName) {
        this.conjunctDoctorName = conjunctDoctorName == null ? null : conjunctDoctorName.trim();
    }

    /**
     * 获取沙眼检查医生签字
     *
     * @return TRACHOMA_DOCTOR_NAME - 沙眼检查医生签字
     */
    public String getTrachomaDoctorName() {
        return trachomaDoctorName;
    }

    /**
     * 设置沙眼检查医生签字
     *
     * @param trachomaDoctorName 沙眼检查医生签字
     */
    public void setTrachomaDoctorName(String trachomaDoctorName) {
        this.trachomaDoctorName = trachomaDoctorName == null ? null : trachomaDoctorName.trim();
    }

    /**
     * 获取血压检查医生签字
     *
     * @return PRESSURE_DOCTOR_NAME - 血压检查医生签字
     */
    public String getPressureDoctorName() {
        return pressureDoctorName;
    }

    /**
     * 设置血压检查医生签字
     *
     * @param pressureDoctorName 血压检查医生签字
     */
    public void setPressureDoctorName(String pressureDoctorName) {
        this.pressureDoctorName = pressureDoctorName == null ? null : pressureDoctorName.trim();
    }

    /**
     * 获取心部检查医生签字
     *
     * @return HEART_DOCTOR_NAME - 心部检查医生签字
     */
    public String getHeartDoctorName() {
        return heartDoctorName;
    }

    /**
     * 设置心部检查医生签字
     *
     * @param heartDoctorName 心部检查医生签字
     */
    public void setHeartDoctorName(String heartDoctorName) {
        this.heartDoctorName = heartDoctorName == null ? null : heartDoctorName.trim();
    }

    /**
     * 获取心率检查医生签字
     *
     * @return BREATHING_RATE_DOCTOR_NAME - 心率检查医生签字
     */
    public String getBreathingRateDoctorName() {
        return breathingRateDoctorName;
    }

    /**
     * 设置心率检查医生签字
     *
     * @param breathingRateDoctorName 心率检查医生签字
     */
    public void setBreathingRateDoctorName(String breathingRateDoctorName) {
        this.breathingRateDoctorName = breathingRateDoctorName == null ? null : breathingRateDoctorName.trim();
    }

    /**
     * 获取肺部检查医生签字
     *
     * @return LUNG_DOCTOR_NAME - 肺部检查医生签字
     */
    public String getLungDoctorName() {
        return lungDoctorName;
    }

    /**
     * 设置肺部检查医生签字
     *
     * @param lungDoctorName 肺部检查医生签字
     */
    public void setLungDoctorName(String lungDoctorName) {
        this.lungDoctorName = lungDoctorName == null ? null : lungDoctorName.trim();
    }

    /**
     * 获取肝部检查医生签字
     *
     * @return LIVER_DOCTOR_NAME - 肝部检查医生签字
     */
    public String getLiverDoctorName() {
        return liverDoctorName;
    }

    /**
     * 设置肝部检查医生签字
     *
     * @param liverDoctorName 肝部检查医生签字
     */
    public void setLiverDoctorName(String liverDoctorName) {
        this.liverDoctorName = liverDoctorName == null ? null : liverDoctorName.trim();
    }

    /**
     * 获取脾部检查医生签字
     *
     * @return SPLEEN_DOCTOR_NAME - 脾部检查医生签字
     */
    public String getSpleenDoctorName() {
        return spleenDoctorName;
    }

    /**
     * 设置脾部检查医生签字
     *
     * @param spleenDoctorName 脾部检查医生签字
     */
    public void setSpleenDoctorName(String spleenDoctorName) {
        this.spleenDoctorName = spleenDoctorName == null ? null : spleenDoctorName.trim();
    }

    /**
     * 获取牙周检查医生签字
     *
     * @return TOOTH_AROUND_DOCTOR_NAME - 牙周检查医生签字
     */
    public String getToothAroundDoctorName() {
        return toothAroundDoctorName;
    }

    /**
     * 设置牙周检查医生签字
     *
     * @param toothAroundDoctorName 牙周检查医生签字
     */
    public void setToothAroundDoctorName(String toothAroundDoctorName) {
        this.toothAroundDoctorName = toothAroundDoctorName == null ? null : toothAroundDoctorName.trim();
    }

    /**
     * 获取牙齿检查医生签字
     *
     * @return TOOTH_DOCTOR_NAME - 牙齿检查医生签字
     */
    public String getToothDoctorName() {
        return toothDoctorName;
    }

    /**
     * 设置牙齿检查医生签字
     *
     * @param toothDoctorName 牙齿检查医生签字
     */
    public void setToothDoctorName(String toothDoctorName) {
        this.toothDoctorName = toothDoctorName == null ? null : toothDoctorName.trim();
    }

    /**
     * 获取扁桃体检查医生签字
     *
     * @return TONSIL_DOCTOR_NAME - 扁桃体检查医生签字
     */
    public String getTonsilDoctorName() {
        return tonsilDoctorName;
    }

    /**
     * 设置扁桃体检查医生签字
     *
     * @param tonsilDoctorName 扁桃体检查医生签字
     */
    public void setTonsilDoctorName(String tonsilDoctorName) {
        this.tonsilDoctorName = tonsilDoctorName == null ? null : tonsilDoctorName.trim();
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