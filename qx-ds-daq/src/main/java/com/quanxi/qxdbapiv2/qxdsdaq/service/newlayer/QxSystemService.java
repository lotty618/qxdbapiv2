package com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer;

import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTLogDao;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTLog;
import org.springframework.beans.factory.annotation.Autowired;

public class QxSystemService {
    @Autowired
    QxTLogDao logDao;

    public Integer getQidByLog(String tableName) {
        QxTLog log = logDao.selectOneByTableName(tableName);
        if (null == log) {
            return 0;
        }

        return Integer.parseInt(log.getQid());
    }
}
