package com.quanxi.qxdbapiv2.qxdsdaq.controller.v2.qxdatabase.patient;

import com.quanxi.qxdbapiv2.qxcommon.common.api.ResultBody;
import com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.QxPatientService;
import com.quanxi.qxdbapiv2.qxdsdaq.service.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/database")
@Api(tags = {"数据导入接口"})
public class QxPatientDAQController {
    @Autowired
    QxPatientService qxPatientService;

    @Autowired
    PatientService patientService;

    @RequestMapping("/addPatientList")
    public Object importPatientList(
            @ApiParam(name = "size", value = "抽取数量") Integer size
    ) {
        if (patientService.importPatientData()) {
            return ResultBody.jsonResultSuccess("患者数据导入成功！");
        } else {
            return ResultBody.jsonResultFail("患者数据导入失败！");
        }
    }


    @RequestMapping("/addSinglePatientList")
    public Object importSinglePatientList(
            @ApiParam(name = "size", value = "抽取数量") Integer size
    ) {
        if (patientService.importSinglePatientData()) {
            return ResultBody.jsonResultSuccess("患者数据导入成功！");
        } else {
            return ResultBody.jsonResultFail("患者数据导入失败！");
        }
    }

    @RequestMapping("/addBatchPatientList")
    public Object importBatchPatientList(
            @ApiParam(name = "size", value = "抽取数量") Integer size
    ) {
        if (patientService.batchImportPatientData()) {
            return ResultBody.jsonResultSuccess("患者数据导入成功！");
        } else {
            return ResultBody.jsonResultFail("患者数据导入失败！");
        }
    }

    @RequestMapping("/addBatchPatientListEx")
    public Object importBatchPatientListEx(
            @ApiParam(name = "size", value = "抽取数量") Integer size
    ) {
        if (patientService.batchImportPatientDataEx()) {
            return ResultBody.jsonResultSuccess("患者数据导入成功！");
        } else {
            return ResultBody.jsonResultFail("患者数据导入失败！");
        }
    }
}
