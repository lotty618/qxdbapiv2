package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_NIS_VITAL_SIGNS_MONITOR")
public class QxTNisVitalSignsMonitor {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 生命体征唯一标识
     */
    @Column(name = "NVSMUID")
    private String nvsmuid;

    /**
     * 住院唯一标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人唯一标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 科室唯一标识
     */
    @Column(name = "DUID")
    private String duid;

    /**
     * 科室名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 病区名称（患者当前所在病区的名称）
     */
    @Column(name = "WARD_NAME")
    private String wardName;

    /**
     * 病房号（患者住院期间，所住病房对应的编号）
     */
    @Column(name = "ROOM_NO")
    private String roomNo;

    /**
     * 病床号（患者住院期间，所住床位对应的编号）
     */
    @Column(name = "BED_NO")
    private String bedNo;

    /**
     * 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 原始层唯一ID
     */
    @Column(name = "QID")
    private String qid;

    /**
     * 性别中文名称（本人生理性别的中文名称）
     */
    @Column(name = "SEX_CN")
    private String sexCn;

    /**
     * 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    @Column(name = "AGE_YEAR")
    private Long ageYear;

    /**
     * 年龄（月）（年龄不足 1 周岁的实足年龄的月龄，XX月XX天）
     */
    @Column(name = "AGE_MONTH")
    private String ageMonth;

    /**
     * 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    @Column(name = "DIAGNOSIS_CODE")
    private String diagnosisCode;

    /**
     * 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    @Column(name = "DIAGNOSIS_NAME")
    private String diagnosisName;

    /**
     * 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "IN_DATE")
    private String inDate;

    /**
     * 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "WRITE_DATE")
    private String writeDate;

    /**
     * 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    @Column(name = "BREATHING_RATE")
    private String breathingRate;

    /**
     * 使用呼吸机标志0否 1是（标识患者是否同意使用呼吸机辅助通气的标志）
     */
    @Column(name = "VENTILATOR_MARK")
    private String ventilatorMark;

    /**
     * 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    @Column(name = "PULSES")
    private String pulses;

    /**
     * 起搏器心率（次/min）（患者佩戴起搏器后的心率，计量单位为次/min）
     */
    @Column(name = "HEART_RATE")
    private String heartRate;

    /**
     * 体温（℃）（体温的测量值，计量单位为℃）
     */
    @Column(name = "TEMPERATURE")
    private String temperature;

    /**
     * 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    @Column(name = "SBP")
    private String sbp;

    /**
     * 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    @Column(name = "DBP")
    private String dbp;

    /**
     * 体重（患者体重的测量值，计量单位为 kg）
     */
    @Column(name = "WEIGHT")
    private String weight;

    /**
     * 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    @Column(name = "ABDOMEN_CIRCUM")
    private String abdomenCircum;

    /**
     * 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    @Column(name = "NURSING_OBS_ITEM_NAME")
    private String nursingObsItemName;

    @Column(name = "NURSING_OBS_ITEM_CODE")
    private String nursingObsItemCode;

    /**
     * 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    @Column(name = "NURSE_SIGNATURE")
    private String nurseSignature;

    /**
     * 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    @Column(name = "SIGNATURE_DATE")
    private String signatureDate;

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
     * 护理观察结果（对护理观察项目结果的详细描述）
     */
    @Column(name = "NURSING_OBS_RESULT")
    private String nursingObsResult;

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
     * 获取生命体征唯一标识
     *
     * @return NVSMUID - 生命体征唯一标识
     */
    public String getNvsmuid() {
        return nvsmuid;
    }

    /**
     * 设置生命体征唯一标识
     *
     * @param nvsmuid 生命体征唯一标识
     */
    public void setNvsmuid(String nvsmuid) {
        this.nvsmuid = nvsmuid == null ? null : nvsmuid.trim();
    }

    /**
     * 获取住院唯一标识
     *
     * @return IHUID - 住院唯一标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置住院唯一标识
     *
     * @param ihuid 住院唯一标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
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
     * 获取科室名称
     *
     * @return DEPT_NAME - 科室名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室名称
     *
     * @param deptName 科室名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取病区名称（患者当前所在病区的名称）
     *
     * @return WARD_NAME - 病区名称（患者当前所在病区的名称）
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病区名称（患者当前所在病区的名称）
     *
     * @param wardName 病区名称（患者当前所在病区的名称）
     */
    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    /**
     * 获取病房号（患者住院期间，所住病房对应的编号）
     *
     * @return ROOM_NO - 病房号（患者住院期间，所住病房对应的编号）
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * 设置病房号（患者住院期间，所住病房对应的编号）
     *
     * @param roomNo 病房号（患者住院期间，所住病房对应的编号）
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * 获取病床号（患者住院期间，所住床位对应的编号）
     *
     * @return BED_NO - 病床号（患者住院期间，所住床位对应的编号）
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * 设置病床号（患者住院期间，所住床位对应的编号）
     *
     * @param bedNo 病床号（患者住院期间，所住床位对应的编号）
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    /**
     * 获取姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NAME - 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param name 姓名（患者本人在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 获取性别中文名称（本人生理性别的中文名称）
     *
     * @return SEX_CN - 性别中文名称（本人生理性别的中文名称）
     */
    public String getSexCn() {
        return sexCn;
    }

    /**
     * 设置性别中文名称（本人生理性别的中文名称）
     *
     * @param sexCn 性别中文名称（本人生理性别的中文名称）
     */
    public void setSexCn(String sexCn) {
        this.sexCn = sexCn == null ? null : sexCn.trim();
    }

    /**
     * 获取年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @return AGE_YEAR - 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public Long getAgeYear() {
        return ageYear;
    }

    /**
     * 设置年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     *
     * @param ageYear 年龄（岁）（患者年龄满 1 周岁的实足年龄，为患者出生后按照日历计算的历法年龄，以实足年龄的相应整数填写）
     */
    public void setAgeYear(Long ageYear) {
        this.ageYear = ageYear;
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
     * 获取疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @return DIAGNOSIS_CODE - 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    /**
     * 设置疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     *
     * @param diagnosisCode 疾病诊断代码ICD-10（疾病临床诊断在特定分类体系中的代码）
     */
    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    /**
     * 获取疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @return DIAGNOSIS_NAME - 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * 设置疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     *
     * @param diagnosisName 疾病诊断名称（疾病临床诊断在特定分类体系中的名称）
     */
    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    /**
     * 获取入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @return IN_DATE - 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * 设置入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     *
     * @param inDate 入院日期时间（患者实际办理入院手续时的公元纪年日期和时间的完整描述）
     */
    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    /**
     * 获取记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @return WRITE_DATE - 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public String getWriteDate() {
        return writeDate;
    }

    /**
     * 设置记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     *
     * @param writeDate 记录日期时间（完成此项业务活动时的公元纪年日期和时间的完整描述）
     */
    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate == null ? null : writeDate.trim();
    }

    /**
     * 获取呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @return BREATHING_RATE - 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public String getBreathingRate() {
        return breathingRate;
    }

    /**
     * 设置呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     *
     * @param breathingRate 呼吸频率（次/min）（患者单位时间内呼吸次数的测量值，计量单位为次/min）
     */
    public void setBreathingRate(String breathingRate) {
        this.breathingRate = breathingRate == null ? null : breathingRate.trim();
    }

    /**
     * 获取使用呼吸机标志0否 1是（标识患者是否同意使用呼吸机辅助通气的标志）
     *
     * @return VENTILATOR_MARK - 使用呼吸机标志0否 1是（标识患者是否同意使用呼吸机辅助通气的标志）
     */
    public String getVentilatorMark() {
        return ventilatorMark;
    }

    /**
     * 设置使用呼吸机标志0否 1是（标识患者是否同意使用呼吸机辅助通气的标志）
     *
     * @param ventilatorMark 使用呼吸机标志0否 1是（标识患者是否同意使用呼吸机辅助通气的标志）
     */
    public void setVentilatorMark(String ventilatorMark) {
        this.ventilatorMark = ventilatorMark == null ? null : ventilatorMark.trim();
    }

    /**
     * 获取脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @return PULSES - 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public String getPulses() {
        return pulses;
    }

    /**
     * 设置脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     *
     * @param pulses 脉率（次/min）（患者每分钟脉搏次数的测量值，计量单位为次/min）
     */
    public void setPulses(String pulses) {
        this.pulses = pulses == null ? null : pulses.trim();
    }

    /**
     * 获取起搏器心率（次/min）（患者佩戴起搏器后的心率，计量单位为次/min）
     *
     * @return HEART_RATE - 起搏器心率（次/min）（患者佩戴起搏器后的心率，计量单位为次/min）
     */
    public String getHeartRate() {
        return heartRate;
    }

    /**
     * 设置起搏器心率（次/min）（患者佩戴起搏器后的心率，计量单位为次/min）
     *
     * @param heartRate 起搏器心率（次/min）（患者佩戴起搏器后的心率，计量单位为次/min）
     */
    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate == null ? null : heartRate.trim();
    }

    /**
     * 获取体温（℃）（体温的测量值，计量单位为℃）
     *
     * @return TEMPERATURE - 体温（℃）（体温的测量值，计量单位为℃）
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 设置体温（℃）（体温的测量值，计量单位为℃）
     *
     * @param temperature 体温（℃）（体温的测量值，计量单位为℃）
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    /**
     * 获取收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     *
     * @return SBP - 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    public String getSbp() {
        return sbp;
    }

    /**
     * 设置收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     *
     * @param sbp 收缩压（mmHg）（收缩压的测量值，计量单位为mmHg）
     */
    public void setSbp(String sbp) {
        this.sbp = sbp == null ? null : sbp.trim();
    }

    /**
     * 获取舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     *
     * @return DBP - 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    public String getDbp() {
        return dbp;
    }

    /**
     * 设置舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     *
     * @param dbp 舒张压（mmHg）（舒张压的测量值，计量单位为mmHg）
     */
    public void setDbp(String dbp) {
        this.dbp = dbp == null ? null : dbp.trim();
    }

    /**
     * 获取体重（患者体重的测量值，计量单位为 kg）
     *
     * @return WEIGHT - 体重（患者体重的测量值，计量单位为 kg）
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置体重（患者体重的测量值，计量单位为 kg）
     *
     * @param weight 体重（患者体重的测量值，计量单位为 kg）
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 获取腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     *
     * @return ABDOMEN_CIRCUM - 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    public String getAbdomenCircum() {
        return abdomenCircum;
    }

    /**
     * 设置腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     *
     * @param abdomenCircum 腹围（cm）（患者腹部周长的测量值，计量单位为 cm）
     */
    public void setAbdomenCircum(String abdomenCircum) {
        this.abdomenCircum = abdomenCircum == null ? null : abdomenCircum.trim();
    }

    /**
     * 获取护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @return NURSING_OBS_ITEM_NAME - 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public String getNursingObsItemName() {
        return nursingObsItemName;
    }

    /**
     * 设置护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     *
     * @param nursingObsItemName 护理观察项目名称（护理观察项目的名称，如患者神志状态、饮食情况，皮肤情况、氧疗情况、排尿排便情况，流量、出量、入量等等，根据护理内容的不同选择不同的观察项目名称）
     */
    public void setNursingObsItemName(String nursingObsItemName) {
        this.nursingObsItemName = nursingObsItemName == null ? null : nursingObsItemName.trim();
    }

    /**
     * @return NURSING_OBS_ITEM_CODE
     */
    public String getNursingObsItemCode() {
        return nursingObsItemCode;
    }

    /**
     * @param nursingObsItemCode
     */
    public void setNursingObsItemCode(String nursingObsItemCode) {
        this.nursingObsItemCode = nursingObsItemCode == null ? null : nursingObsItemCode.trim();
    }

    /**
     * 获取护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @return NURSE_SIGNATURE - 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public String getNurseSignature() {
        return nurseSignature;
    }

    /**
     * 设置护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     *
     * @param nurseSignature 护士签名（护士签署的在公安户籍管理部门正式登记注册的姓氏和名称）
     */
    public void setNurseSignature(String nurseSignature) {
        this.nurseSignature = nurseSignature == null ? null : nurseSignature.trim();
    }

    /**
     * 获取签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @return SIGNATURE_DATE - 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public String getSignatureDate() {
        return signatureDate;
    }

    /**
     * 设置签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     *
     * @param signatureDate 签名日期时间（进行电子签名时的公元纪年日期和时间的完整描述）
     */
    public void setSignatureDate(String signatureDate) {
        this.signatureDate = signatureDate == null ? null : signatureDate.trim();
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
     * 获取护理观察结果（对护理观察项目结果的详细描述）
     *
     * @return NURSING_OBS_RESULT - 护理观察结果（对护理观察项目结果的详细描述）
     */
    public String getNursingObsResult() {
        return nursingObsResult;
    }

    /**
     * 设置护理观察结果（对护理观察项目结果的详细描述）
     *
     * @param nursingObsResult 护理观察结果（对护理观察项目结果的详细描述）
     */
    public void setNursingObsResult(String nursingObsResult) {
        this.nursingObsResult = nursingObsResult == null ? null : nursingObsResult.trim();
    }
}