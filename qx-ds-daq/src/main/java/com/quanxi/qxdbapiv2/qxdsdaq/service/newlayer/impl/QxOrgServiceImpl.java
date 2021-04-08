package com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.impl;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTOrgBasicInfo;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTOrgBasicInfoDao;
import com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.QxOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QxOrgServiceImpl implements QxOrgService {
    @Autowired
    QxTOrgBasicInfoDao qxOrgDao;

    @Override
    public List<QxTOrgBasicInfo> getQxOrgBasicInfo() {
        return qxOrgDao.selectAll();
    }
}
