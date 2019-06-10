package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.QuInfo;

public interface QuInfoMapper {
    int deleteByPrimaryKey(Long quId);

    int insert(QuInfo record);

    int insertSelective(QuInfo record);

    QuInfo selectByPrimaryKey(Long quId);

    int updateByPrimaryKeySelective(QuInfo record);

    int updateByPrimaryKey(QuInfo record);
}