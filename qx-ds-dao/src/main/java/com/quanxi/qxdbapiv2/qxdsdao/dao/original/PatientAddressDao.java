package com.quanxi.qxdbapiv2.qxdsdao.dao.original;

import com.quanxi.qxdbapiv2.qxdsdao.entity.original.PatientAddress;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PatientAddressDao extends Mapper<PatientAddress>, MySqlMapper<PatientAddress> {
}