package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_TASK_LOG")
public class QxTaskLog {
    /**
     * 自增ID[主键]
     */
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 采集ID标识唯一一条采集记录
     */
    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 医疗机构代码[主键]DIR_ORG（医疗机构经《医疗机构执业许可证》登记的，并按照特定编码体系填写的代码）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 业务代码,标识采集业务类型
     */
    @Column(name = "TASK_CODE")
    private String taskCode;

    /**
     * 业务名称,标识采集业务类型名称
     */
    @Column(name = "TASK_NAME")
    private String taskName;

    /**
     * 采集类型代码,默认为1标识增量采集,2历史数据采集,3自动补采
     */
    @Column(name = "TASK_TYPE")
    private String taskType;

    /**
     * 采集开始时间,标识业务从什么时候开始采集数据
     */
    @Column(name = "BEGIN_DATE")
    private String beginDate;

    /**
     * 采集结束时间,标识业务采集到什么时候的数据
     */
    @Column(name = "END_DATE")
    private String endDate;

    /**
     * 业务更新时间,标识对应业务表最后采集时间
     */
    @Column(name = "UP_DATE")
    private String upDate;

    /**
     * 采集状态  1正在采集、2采集完成、3采集失败
     */
    @Column(name = "DAQ_STATUS")
    private String daqStatus;

    /**
     * 应采集数量，标识医院原始数据库对应时间段应有条数
     */
    @Column(name = "PLAN_NUM")
    private BigDecimal planNum;

    /**
     * 新增数量，采集新入库条数
     */
    @Column(name = "NEW_NUM")
    private BigDecimal newNum;

    /**
     * 修改数量，修改原有条数
     */
    @Column(name = "CHANGED_NUM")
    private BigDecimal changedNum;

    /**
     * 删除数量
     */
    @Column(name = "DELETE_NUM")
    private BigDecimal deleteNum;

    /**
     * 相同数量
     */
    @Column(name = "SAME_NUM")
    private BigDecimal sameNum;

    /**
     * 日志创建时间
     */
    @Column(name = "CREATE_DATE")
    private String createDate;

    /**
     * 日志最后修改时间
     */
    @Column(name = "LASTUP_DATE")
    private String lastupDate;

    /**
     * 获取自增ID[主键]
     *
     * @return ID - 自增ID[主键]
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 设置自增ID[主键]
     *
     * @param id 自增ID[主键]
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 获取采集ID标识唯一一条采集记录
     *
     * @return TASK_ID - 采集ID标识唯一一条采集记录
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置采集ID标识唯一一条采集记录
     *
     * @param taskId 采集ID标识唯一一条采集记录
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
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
     * 获取业务代码,标识采集业务类型
     *
     * @return TASK_CODE - 业务代码,标识采集业务类型
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * 设置业务代码,标识采集业务类型
     *
     * @param taskCode 业务代码,标识采集业务类型
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode == null ? null : taskCode.trim();
    }

    /**
     * 获取业务名称,标识采集业务类型名称
     *
     * @return TASK_NAME - 业务名称,标识采集业务类型名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置业务名称,标识采集业务类型名称
     *
     * @param taskName 业务名称,标识采集业务类型名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * 获取采集类型代码,默认为1标识增量采集,2历史数据采集,3自动补采
     *
     * @return TASK_TYPE - 采集类型代码,默认为1标识增量采集,2历史数据采集,3自动补采
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 设置采集类型代码,默认为1标识增量采集,2历史数据采集,3自动补采
     *
     * @param taskType 采集类型代码,默认为1标识增量采集,2历史数据采集,3自动补采
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * 获取采集开始时间,标识业务从什么时候开始采集数据
     *
     * @return BEGIN_DATE - 采集开始时间,标识业务从什么时候开始采集数据
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * 设置采集开始时间,标识业务从什么时候开始采集数据
     *
     * @param beginDate 采集开始时间,标识业务从什么时候开始采集数据
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate == null ? null : beginDate.trim();
    }

    /**
     * 获取采集结束时间,标识业务采集到什么时候的数据
     *
     * @return END_DATE - 采集结束时间,标识业务采集到什么时候的数据
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 设置采集结束时间,标识业务采集到什么时候的数据
     *
     * @param endDate 采集结束时间,标识业务采集到什么时候的数据
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * 获取业务更新时间,标识对应业务表最后采集时间
     *
     * @return UP_DATE - 业务更新时间,标识对应业务表最后采集时间
     */
    public String getUpDate() {
        return upDate;
    }

    /**
     * 设置业务更新时间,标识对应业务表最后采集时间
     *
     * @param upDate 业务更新时间,标识对应业务表最后采集时间
     */
    public void setUpDate(String upDate) {
        this.upDate = upDate == null ? null : upDate.trim();
    }

    /**
     * 获取采集状态  1正在采集、2采集完成、3采集失败
     *
     * @return DAQ_STATUS - 采集状态  1正在采集、2采集完成、3采集失败
     */
    public String getDaqStatus() {
        return daqStatus;
    }

    /**
     * 设置采集状态  1正在采集、2采集完成、3采集失败
     *
     * @param daqStatus 采集状态  1正在采集、2采集完成、3采集失败
     */
    public void setDaqStatus(String daqStatus) {
        this.daqStatus = daqStatus == null ? null : daqStatus.trim();
    }

    /**
     * 获取应采集数量，标识医院原始数据库对应时间段应有条数
     *
     * @return PLAN_NUM - 应采集数量，标识医院原始数据库对应时间段应有条数
     */
    public BigDecimal getPlanNum() {
        return planNum;
    }

    /**
     * 设置应采集数量，标识医院原始数据库对应时间段应有条数
     *
     * @param planNum 应采集数量，标识医院原始数据库对应时间段应有条数
     */
    public void setPlanNum(BigDecimal planNum) {
        this.planNum = planNum;
    }

    /**
     * 获取新增数量，采集新入库条数
     *
     * @return NEW_NUM - 新增数量，采集新入库条数
     */
    public BigDecimal getNewNum() {
        return newNum;
    }

    /**
     * 设置新增数量，采集新入库条数
     *
     * @param newNum 新增数量，采集新入库条数
     */
    public void setNewNum(BigDecimal newNum) {
        this.newNum = newNum;
    }

    /**
     * 获取修改数量，修改原有条数
     *
     * @return CHANGED_NUM - 修改数量，修改原有条数
     */
    public BigDecimal getChangedNum() {
        return changedNum;
    }

    /**
     * 设置修改数量，修改原有条数
     *
     * @param changedNum 修改数量，修改原有条数
     */
    public void setChangedNum(BigDecimal changedNum) {
        this.changedNum = changedNum;
    }

    /**
     * 获取删除数量
     *
     * @return DELETE_NUM - 删除数量
     */
    public BigDecimal getDeleteNum() {
        return deleteNum;
    }

    /**
     * 设置删除数量
     *
     * @param deleteNum 删除数量
     */
    public void setDeleteNum(BigDecimal deleteNum) {
        this.deleteNum = deleteNum;
    }

    /**
     * 获取相同数量
     *
     * @return SAME_NUM - 相同数量
     */
    public BigDecimal getSameNum() {
        return sameNum;
    }

    /**
     * 设置相同数量
     *
     * @param sameNum 相同数量
     */
    public void setSameNum(BigDecimal sameNum) {
        this.sameNum = sameNum;
    }

    /**
     * 获取日志创建时间
     *
     * @return CREATE_DATE - 日志创建时间
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 设置日志创建时间
     *
     * @param createDate 日志创建时间
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    /**
     * 获取日志最后修改时间
     *
     * @return LASTUP_DATE - 日志最后修改时间
     */
    public String getLastupDate() {
        return lastupDate;
    }

    /**
     * 设置日志最后修改时间
     *
     * @param lastupDate 日志最后修改时间
     */
    public void setLastupDate(String lastupDate) {
        this.lastupDate = lastupDate == null ? null : lastupDate.trim();
    }
}