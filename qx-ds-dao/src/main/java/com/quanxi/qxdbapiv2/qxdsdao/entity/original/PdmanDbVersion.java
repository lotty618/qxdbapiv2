package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import javax.persistence.*;

@Table(name = "PDMAN_DB_VERSION")
public class PdmanDbVersion {
    @Column(name = "DB_VERSION")
    private String dbVersion;

    @Column(name = "VERSION_DESC")
    private String versionDesc;

    @Column(name = "CREATED_TIME")
    private String createdTime;

    /**
     * 有效标志,标志数据是否有效 （1、有效  0、无效）
     */
    @Column(name = "EFFECTIVE")
    private String effective;

    /**
     * @return DB_VERSION
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * @param dbVersion
     */
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion == null ? null : dbVersion.trim();
    }

    /**
     * @return VERSION_DESC
     */
    public String getVersionDesc() {
        return versionDesc;
    }

    /**
     * @param versionDesc
     */
    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc == null ? null : versionDesc.trim();
    }

    /**
     * @return CREATED_TIME
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
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
}