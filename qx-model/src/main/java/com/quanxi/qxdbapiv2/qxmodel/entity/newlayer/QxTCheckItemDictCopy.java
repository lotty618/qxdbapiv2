package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QX_T_CHECK_ITEM_DICT_COPY")
public class QxTCheckItemDictCopy {
    @Column(name = "QX_MATCH_NAME")
    private String qxMatchName;

    @Column(name = "QX_ITEM_NAME")
    private String qxItemName;

    @Column(name = "QX_SPECIMEN_NAME")
    private String qxSpecimenName;

    @Column(name = "RANGEMAX")
    private String rangemax;

    @Column(name = "RANGEMAXDW")
    private String rangemaxdw;

    @Column(name = "RANGEMIN")
    private String rangemin;

    @Column(name = "RANGEMINDW")
    private String rangemindw;

    @Column(name = "HOSPITAL")
    private String hospital;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    /**
     * @return QX_MATCH_NAME
     */
    public String getQxMatchName() {
        return qxMatchName;
    }

    /**
     * @param qxMatchName
     */
    public void setQxMatchName(String qxMatchName) {
        this.qxMatchName = qxMatchName == null ? null : qxMatchName.trim();
    }

    /**
     * @return QX_ITEM_NAME
     */
    public String getQxItemName() {
        return qxItemName;
    }

    /**
     * @param qxItemName
     */
    public void setQxItemName(String qxItemName) {
        this.qxItemName = qxItemName == null ? null : qxItemName.trim();
    }

    /**
     * @return QX_SPECIMEN_NAME
     */
    public String getQxSpecimenName() {
        return qxSpecimenName;
    }

    /**
     * @param qxSpecimenName
     */
    public void setQxSpecimenName(String qxSpecimenName) {
        this.qxSpecimenName = qxSpecimenName == null ? null : qxSpecimenName.trim();
    }

    /**
     * @return RANGEMAX
     */
    public String getRangemax() {
        return rangemax;
    }

    /**
     * @param rangemax
     */
    public void setRangemax(String rangemax) {
        this.rangemax = rangemax == null ? null : rangemax.trim();
    }

    /**
     * @return RANGEMAXDW
     */
    public String getRangemaxdw() {
        return rangemaxdw;
    }

    /**
     * @param rangemaxdw
     */
    public void setRangemaxdw(String rangemaxdw) {
        this.rangemaxdw = rangemaxdw == null ? null : rangemaxdw.trim();
    }

    /**
     * @return RANGEMIN
     */
    public String getRangemin() {
        return rangemin;
    }

    /**
     * @param rangemin
     */
    public void setRangemin(String rangemin) {
        this.rangemin = rangemin == null ? null : rangemin.trim();
    }

    /**
     * @return RANGEMINDW
     */
    public String getRangemindw() {
        return rangemindw;
    }

    /**
     * @param rangemindw
     */
    public void setRangemindw(String rangemindw) {
        this.rangemindw = rangemindw == null ? null : rangemindw.trim();
    }

    /**
     * @return HOSPITAL
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital
     */
    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    /**
     * @return HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }
}