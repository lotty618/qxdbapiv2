package com.quanxi.qxdbapiv2.qxdsdao.dao.original;

import com.quanxi.qxdbapiv2.qxdsdao.entity.original.InpatientExpense;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface InpatientExpenseDao extends Mapper<InpatientExpense>, MySqlMapper<InpatientExpense> {
}