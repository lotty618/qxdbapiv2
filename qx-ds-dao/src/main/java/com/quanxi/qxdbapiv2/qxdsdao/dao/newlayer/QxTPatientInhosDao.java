package com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTPatientInhos;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface QxTPatientInhosDao extends Mapper<QxTPatientInhos>, MySqlMapper<QxTPatientInhos> {
    List<QxTPatientInhos> selectPatientInhos(String puid);
}