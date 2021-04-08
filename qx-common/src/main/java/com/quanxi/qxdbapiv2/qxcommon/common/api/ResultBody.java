package com.quanxi.qxdbapiv2.qxcommon.common.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.quanxi.qxdbapiv2.qxcommon.common.baseEnum.ApiResultCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 接口返回结果
 */
public class ResultBody {
    // JsonResult的业务方法 - begin
    /**
     * 接口返回 Json 结果的基础方法
     * @param code 返回代码值
     * @param message 返回消息
     * @param result 返回结果对象（单一对象或混合型对象）
     * @param count 返回列表的记录总数（分页使用）
     * @param rows 返回列表当前页的所有数据（分页使用）
     * @return JSONObject 结果对象
     */
    public static JSONObject jsonResult(int code, String message, JSONObject result, int count, JSONArray rows){
        JSONObject rv = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("result", result);
        data.put("count", count);
        data.put("rows", rows);
        rv.put("code", code);
        rv.put("message", message);
        rv.put("data", data);
        rv.put("version", "v1");
        return rv;
    }
    //标准的空json
    public static JSONObject jsonResultVoid(int code){
        return jsonResult(code, "", new JSONObject(), 0, new JSONArray());
    }
    //失败的空json
    public static JSONObject jsonResultFailVoid(){
        return jsonResultVoid(ApiResultCode.FAILED.getCode());
    }
    //成功的空json
    public static JSONObject jsonResultSuccessVoid(){
        return jsonResultVoid(ApiResultCode.SUCCESS.getCode());
    }
    //失败json
    public static JSONObject jsonResultFail(){
        return jsonResultFail("");
    }
    //返回失败json并带说明
    public static JSONObject jsonResultFail(String message){
        return jsonResultFail(message, new JSONObject());
    }
    //失败json并带说明和结果数据
    public static JSONObject jsonResultFail(String message, JSONObject result){
        return jsonResult(ApiResultCode.FAILED.getCode(), message, result, 0, new JSONArray());
    }
    //未登录
    public static JSONObject jsonResultFailNotLogin(){
        return jsonResult(ApiResultCode.NOT_LOGIN.getCode(),ApiResultCode.NOT_LOGIN.getMessage(), new JSONObject());
    }
    //没有权限
    public static JSONObject jsonResultFailNoPower(){
        return jsonResult(ApiResultCode.NO_POWER.getCode(),ApiResultCode.NO_POWER.getMessage(), new JSONObject());
    }
    //成功
    public static JSONObject jsonResultSuccess(){
        return jsonResultSuccess("");
    }
    //成功json及说明
    public static JSONObject jsonResultSuccess(String message){
        return jsonResultSuccess(message, new JSONObject());
    }
    //成功json，说明为空，附带结果数据
    public static JSONObject jsonResultSuccess(JSONObject result){
        return jsonResultSuccess("", result);
    }
    //成功json，有说明及结果数据
    public static JSONObject jsonResultSuccess(String message, JSONObject result){
        return jsonResult(ApiResultCode.SUCCESS.getCode(), message, result, 0, new JSONArray());
    }
    //成功json，及空数据列表
    public static JSONObject jsonResultSuccessList(){
        return jsonResultSuccessList("", 0, new JSONArray());
    }
    //成功json，说明及空数据列表
    public static JSONObject jsonResultSuccessList(String message){
        return jsonResultSuccessList(message, 0, new JSONArray());
    }
    //成功json，说明及空数据列表
    public static JSONObject jsonResultSuccessList(int count, JSONArray rows){
        return jsonResult(ApiResultCode.SUCCESS.getCode(), "", new JSONObject(), count, rows);
    }
    //成功json，说明及空数据列表
    public static JSONObject jsonResultSuccessList(String message, int count, JSONArray rows){
        return jsonResult(ApiResultCode.SUCCESS.getCode(), message, new JSONObject(), count, rows);
    }
    //成功json，返回说明、记录总数和数据列表(List)
    public static JSONObject jsonResultSuccessList(String message, int count, List rows){
        JSONArray rowsList;
        if(rows == null){
            rowsList = new JSONArray();
        }else{
            rowsList = new JSONArray(new ArrayList<>(rows));
        }
        return jsonResult(ApiResultCode.SUCCESS.getCode(), message, new JSONObject(), count, rowsList);
    }
    //成功json，返回说明、记录总数和数据列表(List)
    public static JSONObject jsonResultSuccessList(int count, List rows){
        return jsonResultSuccessList("", count, rows);
    }
    //标准json，自定义代码及说明和结果数据
    public static JSONObject jsonResult(int code, String message, JSONObject result){
        return jsonResult(code, message, result, 0, new JSONArray());
    }
    //标准json，自定义代码及说明和列表数据
    public static JSONObject jsonResult(int code, String message, int count, JSONArray rows){
        return jsonResult(code, message, new JSONObject(), count, rows);
    }
    // JsonResult的业务方法 - end


}
