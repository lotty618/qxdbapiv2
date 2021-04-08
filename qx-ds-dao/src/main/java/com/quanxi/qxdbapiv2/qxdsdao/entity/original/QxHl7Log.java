package com.quanxi.qxdbapiv2.qxdsdao.entity.original;

import javax.persistence.*;

@Table(name = "QX_HL7_LOG")
public class QxHl7Log {
    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private String createdTime;

    /**
     * 医院消息ID
     */
    @Column(name = "MSG_ID")
    private String msgId;

    /**
     * 医院消息类型
     */
    @Column(name = "MSG_TYPE")
    private String msgType;

    /**
     * 返回消息
     */
    @Column(name = "MSG_RV")
    private String msgRv;

    /**
     * HL7内容
     */
    @Column(name = "HL7_MESSAGES")
    private String hl7Messages;

    /**
     * 获取创建时间
     *
     * @return CREATED_TIME - 创建时间
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    /**
     * 获取医院消息ID
     *
     * @return MSG_ID - 医院消息ID
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * 设置医院消息ID
     *
     * @param msgId 医院消息ID
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    /**
     * 获取医院消息类型
     *
     * @return MSG_TYPE - 医院消息类型
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 设置医院消息类型
     *
     * @param msgType 医院消息类型
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    /**
     * 获取返回消息
     *
     * @return MSG_RV - 返回消息
     */
    public String getMsgRv() {
        return msgRv;
    }

    /**
     * 设置返回消息
     *
     * @param msgRv 返回消息
     */
    public void setMsgRv(String msgRv) {
        this.msgRv = msgRv == null ? null : msgRv.trim();
    }

    /**
     * 获取HL7内容
     *
     * @return HL7_MESSAGES - HL7内容
     */
    public String getHl7Messages() {
        return hl7Messages;
    }

    /**
     * 设置HL7内容
     *
     * @param hl7Messages HL7内容
     */
    public void setHl7Messages(String hl7Messages) {
        this.hl7Messages = hl7Messages == null ? null : hl7Messages.trim();
    }
}