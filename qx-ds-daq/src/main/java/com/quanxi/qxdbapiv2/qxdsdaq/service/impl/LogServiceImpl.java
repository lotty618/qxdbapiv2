package com.quanxi.qxdbapiv2.qxdsdaq.service.impl;

import com.quanxi.qxcommon.common.util.DateTimeUtil;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTLogDao;
import com.quanxi.qxdbapiv2.qxdsdaq.service.LogService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    QxTLogDao logDao;

    @Override
    public QxTLog selectOneByTableName(String tableName) {
        return logDao.selectOneByTableName(tableName);
    }

    @Override
    public void addSuccessLog(String tableName, int qid, long size, int status, String orgId) {
        String nowTime = DateTimeUtil.getCurrSysTime();
        QxTLog log = new QxTLog();
        log.setTableName(tableName);
        log.setQid(String.valueOf(qid));
        log.setRemark(status == 0 ? "数据导入成功" : "数据已是最新");
        log.setDataSize(size);
        log.setType(0L);
        log.setStatus((long) status);
        log.setIsInvalid((short) 0);
        log.setIsDel((short) 0);
        log.setCreateTime(nowTime);
        log.setUpdateTime(nowTime);
        log.setOrgId(orgId);
        logDao.insertLog(log);
    }

    @Override
    public void addFailedLog(String tableName, int qid, long size, String orgId, String remark) {
        String nowTime = DateTimeUtil.getCurrSysTime();
        QxTLog log = new QxTLog();
        log.setTableName(tableName);
        log.setQid(String.valueOf(qid));
        log.setRemark(remark);
        log.setDataSize(size);
        log.setType(0L);
        log.setStatus(0L);
        log.setIsInvalid((short) 0);
        log.setIsDel((short) 0);
        log.setCreateTime(nowTime);
        log.setUpdateTime(nowTime);
        log.setOrgId(orgId);
        logDao.insertLog(log);
    }
}
