package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "PATIENT_OBS")
public class PatientObs {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    /**
     * 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
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
     * 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    @Id
    @Column(name = "OBS_ID")
    private String obsId;

    /**
     * 既往观察项目名称（卫生服务对象既往接受免疫接种的疫苗名称代码）
     */
    @Column(name = "OBS_ITEM_NAME")
    private String obsItemName;

    /**
     * 既往观察项目代码体系名称（观察项目的编码体系的名称，如LOGSC等）
     */
    @Column(name = "OBS_ITEM_SYSTEM_CODE")
    private String obsItemSystemCode;

    /**
     * 既往观察项目代码（观察项目在特定编码体系中的代码值）
     */
    @Column(name = "OBS_ITEM_CODE")
    private String obsItemCode;

    /**
     * 既往观察方法名称（既往卫生服务对象接受医学观察项目的观察方法名称）
     */
    @Column(name = "OBS_WAY")
    private String obsWay;

    /**
     * 既往观察结果（既往卫生服务对象接受医学观察结果的详细文字记录）
     */
    @Column(name = "OBS_RESULT")
    private String obsResult;

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
     * 获取患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @return PATIENT_ID - 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * 设置患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
     *
     * @param patientId 患者基本信息ID[主键]（病人在特定编码体系中的唯一标识码）
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
     * 获取序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @return OBS_ID - 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public String getObsId() {
        return obsId;
    }

    /**
     * 设置序列号[主键]（每条记录在数据库中的唯一序号）
     *
     * @param obsId 序列号[主键]（每条记录在数据库中的唯一序号）
     */
    public void setObsId(String obsId) {
        this.obsId = obsId == null ? null : obsId.trim();
    }

    /**
     * 获取既往观察项目名称（卫生服务对象既往接受免疫接种的疫苗名称代码）
     *
     * @return OBS_ITEM_NAME - 既往观察项目名称（卫生服务对象既往接受免疫接种的疫苗名称代码）
     */
    public String getObsItemName() {
        return obsItemName;
    }

    /**
     * 设置既往观察项目名称（卫生服务对象既往接受免疫接种的疫苗名称代码）
     *
     * @param obsItemName 既往观察项目名称（卫生服务对象既往接受免疫接种的疫苗名称代码）
     */
    public void setObsItemName(String obsItemName) {
        this.obsItemName = obsItemName == null ? null : obsItemName.trim();
    }

    /**
     * 获取既往观察项目代码体系名称（观察项目的编码体系的名称，如LOGSC等）
     *
     * @return OBS_ITEM_SYSTEM_CODE - 既往观察项目代码体系名称（观察项目的编码体系的名称，如LOGSC等）
     */
    public String getObsItemSystemCode() {
        return obsItemSystemCode;
    }

    /**
     * 设置既往观察项目代码体系名称（观察项目的编码体系的名称，如LOGSC等）
     *
     * @param obsItemSystemCode 既往观察项目代码体系名称（观察项目的编码体系的名称，如LOGSC等）
     */
    public void setObsItemSystemCode(String obsItemSystemCode) {
        this.obsItemSystemCode = obsItemSystemCode == null ? null : obsItemSystemCode.trim();
    }

    /**
     * 获取既往观察项目代码（观察项目在特定编码体系中的代码值）
     *
     * @return OBS_ITEM_CODE - 既往观察项目代码（观察项目在特定编码体系中的代码值）
     */
    public String getObsItemCode() {
        return obsItemCode;
    }

    /**
     * 设置既往观察项目代码（观察项目在特定编码体系中的代码值）
     *
     * @param obsItemCode 既往观察项目代码（观察项目在特定编码体系中的代码值）
     */
    public void setObsItemCode(String obsItemCode) {
        this.obsItemCode = obsItemCode == null ? null : obsItemCode.trim();
    }

    /**
     * 获取既往观察方法名称（既往卫生服务对象接受医学观察项目的观察方法名称）
     *
     * @return OBS_WAY - 既往观察方法名称（既往卫生服务对象接受医学观察项目的观察方法名称）
     */
    public String getObsWay() {
        return obsWay;
    }

    /**
     * 设置既往观察方法名称（既往卫生服务对象接受医学观察项目的观察方法名称）
     *
     * @param obsWay 既往观察方法名称（既往卫生服务对象接受医学观察项目的观察方法名称）
     */
    public void setObsWay(String obsWay) {
        this.obsWay = obsWay == null ? null : obsWay.trim();
    }

    /**
     * 获取既往观察结果（既往卫生服务对象接受医学观察结果的详细文字记录）
     *
     * @return OBS_RESULT - 既往观察结果（既往卫生服务对象接受医学观察结果的详细文字记录）
     */
    public String getObsResult() {
        return obsResult;
    }

    /**
     * 设置既往观察结果（既往卫生服务对象接受医学观察结果的详细文字记录）
     *
     * @param obsResult 既往观察结果（既往卫生服务对象接受医学观察结果的详细文字记录）
     */
    public void setObsResult(String obsResult) {
        this.obsResult = obsResult == null ? null : obsResult.trim();
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