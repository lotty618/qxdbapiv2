package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import javax.persistence.*;

@Table(name = "QXZSK_T_TEMP_MFP")
public class QxzskTTempMfp {
    @Column(name = "IHUID")
    private String ihuid;

    @Column(name = "PUID")
    private String puid;

    @Column(name = "ORG_ID")
    private String orgId;

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
     * @return PUID
     */
    public String getPuid() {
        return puid;
    }

    /**
     * @param puid
     */
    public void setPuid(String puid) {
        this.puid = puid == null ? null : puid.trim();
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}