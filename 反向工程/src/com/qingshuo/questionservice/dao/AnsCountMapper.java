package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.AnsCount;

public interface AnsCountMapper {
    int deleteByPrimaryKey(Long ansId);

    int insert(AnsCount record);

    int insertSelective(AnsCount record);

    AnsCount selectByPrimaryKey(Long ansId);

    int updateByPrimaryKeySelective(AnsCount record);

    int updateByPrimaryKey(AnsCount record);
}