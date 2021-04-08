package com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxPatientWithInhosAndClinic;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxTPatient;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface QxTPatientDao extends Mapper<QxTPatient>, MySqlMapper<QxTPatient> {
    QxPatientWithInhosAndClinic getPatientInfo(QxTPatient patient);
    boolean updatePatientBySelective(QxTPatient patient);
    int insertPatient(QxTPatient patient);
    int batchInsertPatient(List<QxTPatient> list);
}