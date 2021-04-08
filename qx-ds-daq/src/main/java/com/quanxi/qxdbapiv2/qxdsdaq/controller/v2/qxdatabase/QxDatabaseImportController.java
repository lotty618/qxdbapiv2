package com.quanxi.qxdbapiv2.qxdsdaq.controller.v2.qxdatabase;

import com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.QxOrgService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/database")
@Api(tags = {"数据导入接口"})
public class QxDatabaseImportController {

    @Autowired
    QxOrgService qxOrgService;

    public Object addHosInfo() {
        return null;
    }
}
