package com.quanxi.qxdbapiv2.qxdsdaq.service;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTLog;

public interface LogService {
    QxTLog selectOneByTableName(String tableName);
    void addSuccessLog(String tableName, int qid, long size, int status, String orgId);
    void addFailedLog(String tableName, int qid, long size, String orgId, String remark);
}
