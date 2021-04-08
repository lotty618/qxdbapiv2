package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CHECK_ITEM_DICT")
public class QxTCheckItemDict {
    @Column(name = "ITEM_QX_ID")
    private String itemQxId;

    @Column(name = "ITEM_QX_NAME")
    private String itemQxName;

    @Column(name = "ITEM_HOSPITAL_ID")
    private String itemHospitalId;

    @Column(name = "ITEM_HOSPITAL_NAME")
    private String itemHospitalName;

    /**
     * @return ITEM_QX_ID
     */
    public String getItemQxId() {
        return itemQxId;
    }

    /**
     * @param itemQxId
     */
    public void setItemQxId(String itemQxId) {
        this.itemQxId = itemQxId == null ? null : itemQxId.trim();
    }

    /**
     * @return ITEM_QX_NAME
     */
    public String getItemQxName() {
        return itemQxName;
    }

    /**
     * @param itemQxName
     */
    public void setItemQxName(String itemQxName) {
        this.itemQxName = itemQxName == null ? null : itemQxName.trim();
    }

    /**
     * @return ITEM_HOSPITAL_ID
     */
    public String getItemHospitalId() {
        return itemHospitalId;
    }

    /**
     * @param itemHospitalId
     */
    public void setItemHospitalId(String itemHospitalId) {
        this.itemHospitalId = itemHospitalId == null ? null : itemHospitalId.trim();
    }

    /**
     * @return ITEM_HOSPITAL_NAME
     */
    public String getItemHospitalName() {
        return itemHospitalName;
    }

    /**
     * @param itemHospitalName
     */
    public void setItemHospitalName(String itemHospitalName) {
        this.itemHospitalName = itemHospitalName == null ? null : itemHospitalName.trim();
    }
}