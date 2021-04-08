package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "QX_DEL_LOG")
public class QxDelLog {
    /**
     * 自增ID——"新建层"应用到唯一主键
     */
    @Id
    @Column(name = "QID")
    private BigDecimal qid;

    @Column(name = "DEL_TABLE_NAME")
    private String delTableName;

    @Column(name = "DEL_QID")
    private BigDecimal delQid;

    @Column(name = "DEL_TIME")
    private String delTime;

    @Column(name = "COMMENTS")
    private String comments;

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
     * @return DEL_TABLE_NAME
     */
    public String getDelTableName() {
        return delTableName;
    }

    /**
     * @param delTableName
     */
    public void setDelTableName(String delTableName) {
        this.delTableName = delTableName == null ? null : delTableName.trim();
    }

    /**
     * @return DEL_QID
     */
    public BigDecimal getDelQid() {
        return delQid;
    }

    /**
     * @param delQid
     */
    public void setDelQid(BigDecimal delQid) {
        this.delQid = delQid;
    }

    /**
     * @return DEL_TIME
     */
    public String getDelTime() {
        return delTime;
    }

    /**
     * @param delTime
     */
    public void setDelTime(String delTime) {
        this.delTime = delTime == null ? null : delTime.trim();
    }

    /**
     * @return COMMENTS
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}