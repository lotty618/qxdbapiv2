package com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTOrgBasicInfo;

import java.util.List;

public interface QxOrgService {
    // 获取新建层机构信息
    public List<QxTOrgBasicInfo> getQxOrgBasicInfo();
}
