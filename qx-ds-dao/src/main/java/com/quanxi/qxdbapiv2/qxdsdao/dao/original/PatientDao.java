package com.quanxi.qxdbapiv2.qxdsdao.dao.original;

import com.quanxi.qxdbapiv2.qxdsdao.entity.original.Patient;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface PatientDao extends Mapper<Patient>, MySqlMapper<Patient> {
    List<Patient> getPatientList(@Param("qid") Integer qid, @Param("count") Integer count);
}