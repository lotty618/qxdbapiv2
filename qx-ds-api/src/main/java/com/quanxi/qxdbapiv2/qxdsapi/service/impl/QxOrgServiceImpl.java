package com.quanxi.qxdbapiv2.qxdsapi.service.impl;

import com.quanxi.qxdbapiv2.qxdsservice.service.QxOrgService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTOrgBasicInfo;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTOrgBasicInfoDao;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DubboService
public class QxOrgServiceImpl implements QxOrgService {
    @Autowired
    QxTOrgBasicInfoDao qxOrgDao;

    @Override
    public List<QxTOrgBasicInfo> getQxOrgBasicInfo() {
        return qxOrgDao.selectAll();
    }
}
