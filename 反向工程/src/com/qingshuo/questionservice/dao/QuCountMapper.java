package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.QuCount;

public interface QuCountMapper {
    int deleteByPrimaryKey(Long qcId);

    int insert(QuCount record);

    int insertSelective(QuCount record);

    QuCount selectByPrimaryKey(Long qcId);

    int updateByPrimaryKeySelective(QuCount record);

    int updateByPrimaryKey(QuCount record);
}