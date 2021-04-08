package com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTLog;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface QxTLogDao extends Mapper<QxTLog>, MySqlMapper<QxTLog> {
    QxTLog selectOneByTableName(String tableName);
    int insertLog(QxTLog log);
}