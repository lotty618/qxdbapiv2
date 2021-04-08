package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_PATIENT_DOCTORADVICE")
public class QxTPatientDoctoradvice {
    /**
     * 序列号
     */
    @Column(name = "SID")
    private Long sid;

    /**
     * 医嘱表唯一标识
     */
    @Column(name = "DAUID")
    private String dauid;

    /**
     * 入院标识
     */
    @Column(name = "IHUID")
    private String ihuid;

    /**
     * 病人标识
     */
    @Column(name = "PUID")
    private String puid;

    /**
     * 入院类型
     */
    @Column(name = "INHOSTYPE")
    private String inhostype;

    /**
     * 入院编号
     */
    @Column(name = "INHOSNO")
    private String inhosno;

    /**
     * 拟定时间
     */
    @Column(name = "PLANTIME")
    private String plantime;

    /**
     * 手术名称（以json数组的形式储存）
     */
    @Column(name = "OPNAME")
    private String opname;

    /**
     * 开嘱时间
     */
    @Column(name = "ORDERDATE")
    private String orderdate;

    /**
     * 开嘱医生
     */
    @Column(name = "ORDERDOCTORNAME")
    private String orderdoctorname;

    /**
     * 状态（1：已确认，2：已取消）
     */
    @Column(name = "STATUS")
    private Long status;

    /**
     * 手术类型
     */
    @Column(name = "OPTYPE")
    private Long optype;

    /**
     * 医嘱内容
     */
    @Column(name = "ORDERLOCALCN")
    private String orderlocalcn;

    /**
     * 数据状态（1：insert，2：update，3：已更新/已插入）
     */
    @Column(name = "DATASTATUS")
    private Long datastatus;

    /**
     * 是否无效
     */
    @Column(name = "ISINVALID")
    private Short isinvalid;

    /**
     * 是否逻辑删除
     */
    @Column(name = "ISDEL")
    private Short isdel;

    /**
     * 创建时间
     */
    @Column(name = "CREATETIME")
    private String createtime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATETIME")
    private String updatetime;

    /**
     * 手术麻醉方式
     */
    @Column(name = "HOCUS")
    private String hocus;

    /**
     * 开嘱医生代码
     */
    @Column(name = "ORDER_DOCTOR_CODE")
    private String orderDoctorCode;

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
     * 获取医嘱表唯一标识
     *
     * @return DAUID - 医嘱表唯一标识
     */
    public String getDauid() {
        return dauid;
    }

    /**
     * 设置医嘱表唯一标识
     *
     * @param dauid 医嘱表唯一标识
     */
    public void setDauid(String dauid) {
        this.dauid = dauid == null ? null : dauid.trim();
    }

    /**
     * 获取入院标识
     *
     * @return IHUID - 入院标识
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * 设置入院标识
     *
     * @param ihuid 入院标识
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * 获取病人标识
     *
     * @return PUID - 病人标识
     */
    public String getPuid() {
        return puid;
    }

    /**
     * 设置病人标识
     *
     * @param puid 病人标识
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * 获取入院类型
     *
     * @return INHOSTYPE - 入院类型
     */
    public String getInhostype() {
        return inhostype;
    }

    /**
     * 设置入院类型
     *
     * @param inhostype 入院类型
     */
    public void setInhostype(String inhostype) {
        this.inhostype = inhostype == null ? null : inhostype.trim();
    }

    /**
     * 获取入院编号
     *
     * @return INHOSNO - 入院编号
     */
    public String getInhosno() {
        return inhosno;
    }

    /**
     * 设置入院编号
     *
     * @param inhosno 入院编号
     */
    public void setInhosno(String inhosno) {
        this.inhosno = inhosno == null ? null : inhosno.trim();
    }

    /**
     * 获取拟定时间
     *
     * @return PLANTIME - 拟定时间
     */
    public String getPlantime() {
        return plantime;
    }

    /**
     * 设置拟定时间
     *
     * @param plantime 拟定时间
     */
    public void setPlantime(String plantime) {
        this.plantime = plantime == null ? null : plantime.trim();
    }

    /**
     * 获取手术名称（以json数组的形式储存）
     *
     * @return OPNAME - 手术名称（以json数组的形式储存）
     */
    public String getOpname() {
        return opname;
    }

    /**
     * 设置手术名称（以json数组的形式储存）
     *
     * @param opname 手术名称（以json数组的形式储存）
     */
    public void setOpname(String opname) {
        this.opname = opname == null ? null : opname.trim();
    }

    /**
     * 获取开嘱时间
     *
     * @return ORDERDATE - 开嘱时间
     */
    public String getOrderdate() {
        return orderdate;
    }

    /**
     * 设置开嘱时间
     *
     * @param orderdate 开嘱时间
     */
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate == null ? null : orderdate.trim();
    }

    /**
     * 获取开嘱医生
     *
     * @return ORDERDOCTORNAME - 开嘱医生
     */
    public String getOrderdoctorname() {
        return orderdoctorname;
    }

    /**
     * 设置开嘱医生
     *
     * @param orderdoctorname 开嘱医生
     */
    public void setOrderdoctorname(String orderdoctorname) {
        this.orderdoctorname = orderdoctorname == null ? null : orderdoctorname.trim();
    }

    /**
     * 获取状态（1：已确认，2：已取消）
     *
     * @return STATUS - 状态（1：已确认，2：已取消）
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 设置状态（1：已确认，2：已取消）
     *
     * @param status 状态（1：已确认，2：已取消）
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 获取手术类型
     *
     * @return OPTYPE - 手术类型
     */
    public Long getOptype() {
        return optype;
    }

    /**
     * 设置手术类型
     *
     * @param optype 手术类型
     */
    public void setOptype(Long optype) {
        this.optype = optype;
    }

    /**
     * 获取医嘱内容
     *
     * @return ORDERLOCALCN - 医嘱内容
     */
    public String getOrderlocalcn() {
        return orderlocalcn;
    }

    /**
     * 设置医嘱内容
     *
     * @param orderlocalcn 医嘱内容
     */
    public void setOrderlocalcn(String orderlocalcn) {
        this.orderlocalcn = orderlocalcn == null ? null : orderlocalcn.trim();
    }

    /**
     * 获取数据状态（1：insert，2：update，3：已更新/已插入）
     *
     * @return DATASTATUS - 数据状态（1：insert，2：update，3：已更新/已插入）
     */
    public Long getDatastatus() {
        return datastatus;
    }

    /**
     * 设置数据状态（1：insert，2：update，3：已更新/已插入）
     *
     * @param datastatus 数据状态（1：insert，2：update，3：已更新/已插入）
     */
    public void setDatastatus(Long datastatus) {
        this.datastatus = datastatus;
    }

    /**
     * 获取是否无效
     *
     * @return ISINVALID - 是否无效
     */
    public Short getIsinvalid() {
        return isinvalid;
    }

    /**
     * 设置是否无效
     *
     * @param isinvalid 是否无效
     */
    public void setIsinvalid(Short isinvalid) {
        this.isinvalid = isinvalid;
    }

    /**
     * 获取是否逻辑删除
     *
     * @return ISDEL - 是否逻辑删除
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     * 设置是否逻辑删除
     *
     * @param isdel 是否逻辑删除
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    /**
     * 获取创建时间
     *
     * @return CREATETIME - 创建时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATETIME - 更新时间
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    /**
     * 获取手术麻醉方式
     *
     * @return HOCUS - 手术麻醉方式
     */
    public String getHocus() {
        return hocus;
    }

    /**
     * 设置手术麻醉方式
     *
     * @param hocus 手术麻醉方式
     */
    public void setHocus(String hocus) {
        this.hocus = hocus == null ? null : hocus.trim();
    }

    /**
     * 获取开嘱医生代码
     *
     * @return ORDER_DOCTOR_CODE - 开嘱医生代码
     */
    public String getOrderDoctorCode() {
        return orderDoctorCode;
    }

    /**
     * 设置开嘱医生代码
     *
     * @param orderDoctorCode 开嘱医生代码
     */
    public void setOrderDoctorCode(String orderDoctorCode) {
        this.orderDoctorCode = orderDoctorCode == null ? null : orderDoctorCode.trim();
    }
}