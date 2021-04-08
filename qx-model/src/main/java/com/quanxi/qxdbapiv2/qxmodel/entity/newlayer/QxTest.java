package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_TEST")
public class QxTest {
    private Integer sid;

    private String ms;

    @Column(name = "creat_time")
    private String creatTime;

    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return ms
     */
    public String getMs() {
        return ms;
    }

    /**
     * @param ms
     */
    public void setMs(String ms) {
        this.ms = ms == null ? null : ms.trim();
    }

    /**
     * @return creat_time
     */
    public String getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }

    /**
     * @return UPDATE_TIME
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}