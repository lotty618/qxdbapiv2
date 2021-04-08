package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QXZSK_T_MFP")
public class QxzskTMfp {
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "IHUID")
    private String ihuid;

    @Column(name = "KEY")
    private String key;

    @Column(name = "VAL")
    private String val;

    @Column(name = "STR")
    private String str;

    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return IHUID
     */
    public String getIhuid() {
        return ihuid;
    }

    /**
     * @param ihuid
     */
    public void setIhuid(String ihuid) {
        this.ihuid = ihuid == null ? null : ihuid.trim();
    }

    /**
     * @return KEY
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * @return VAL
     */
    public String getVal() {
        return val;
    }

    /**
     * @param val
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    /**
     * @return STR
     */
    public String getStr() {
        return str;
    }

    /**
     * @param str
     */
    public void setStr(String str) {
        this.str = str == null ? null : str.trim();
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