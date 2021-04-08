package com.quanxi.qxdbapiv2.qxcommon.common.baseEnum;

public enum ApiResultCode {
    /**
     * 失败
     */
    FAILED(0,"failed"),
    /**
     * 成功
     */
    SUCCESS(1,"success"),
    /**
     * 未登录
     */
    NOT_LOGIN(10106, "未登录"),
    /**
     * 没有权限
     */
    NO_POWER(403, "没有权限");


    public int code;
    public String message;

    ApiResultCode(int code, String message) {
        this.code = code;
        this.message = message;

    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
