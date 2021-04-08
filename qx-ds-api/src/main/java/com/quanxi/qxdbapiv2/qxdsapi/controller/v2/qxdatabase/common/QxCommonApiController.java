package com.quanxi.qxdbapiv2.qxdsapi.controller.v2.qxdatabase.common;

import com.alibaba.fastjson.JSONObject;
import com.quanxi.qxdbapiv2.qxdsservice.service.QxPatientService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxPatientWithInhosAndClinic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/databaseapi")
@Api(tags = {"数据通用接口"})
public class QxCommonApiController {

    @Autowired
    QxPatientService patientService;

    //region病人基本信息
    @RequestMapping(value = "/patientInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "病人信息展示", notes = "")
    @ResponseBody
    public Object getPatientInfo(String uid) {
        if (StringUtils.isEmpty(uid)) {
            return null;
        }

        QxPatientWithInhosAndClinic patient = patientService.getPatientInfo(uid);

        JSONObject rv = new JSONObject();
        rv.put("patientInfo", patient);
        return rv;
        //return JSONObject.toJSONString(patient); 不序列化NULL值对应的KEY
    }

    //endregion
}
