package com.quanxi.qxdbapiv2.qxdsapi.controller.v2.qxdatabase;

import com.alibaba.fastjson.JSONObject;
import com.quanxi.qxdbapiv2.qxdsservice.service.QxOrgService;
import com.quanxi.qxdbapiv2.qxdsservice.service.QxPatientService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTOrgBasicInfo;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTPatient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v2/database")
@Api(tags = {"组织机构相关接口"})
public class QxDatabaseController {

    @Autowired
    QxOrgService qxOrgService;

    @Autowired
    QxPatientService patientService;

    @RequestMapping(value = "/getOrgBasicInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "机构信息", notes = "")
    public Object getOrgBasicInfo() {
        JSONObject retJson = new JSONObject();

        List<QxTOrgBasicInfo> qxlist = qxOrgService.getQxOrgBasicInfo();

        retJson.put("qxorgbasicinfo", qxlist);
        return retJson;
    }

    @RequestMapping(value = "/patientInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "患者信息", notes = "")
    public Object getPatientInfo(@ApiParam(name = "uid", value = "患者ID", required = true) String uid) {
        JSONObject retJson = new JSONObject();

        QxTPatient patient = patientService.getPatientInfo(uid);
        //List<Patient> list = patientService.getPatientList();

        retJson.put("patientList", patient);
        return retJson;
    }
}
