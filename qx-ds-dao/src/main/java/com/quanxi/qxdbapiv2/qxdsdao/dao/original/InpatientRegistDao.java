package com.quanxi.qxdbapiv2.qxdsdao.dao.original;

import com.quanxi.qxdbapiv2.qxdsdao.entity.original.InpatientRegist;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface InpatientRegistDao extends Mapper<InpatientRegist>, MySqlMapper<InpatientRegist> {
}