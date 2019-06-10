package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.AnsInfo;

public interface AnsInfoMapper {
    int deleteByPrimaryKey(Long ansId);

    int insert(AnsInfo record);

    int insertSelective(AnsInfo record);

    AnsInfo selectByPrimaryKey(Long ansId);

    int updateByPrimaryKeySelective(AnsInfo record);

    int updateByPrimaryKey(AnsInfo record);
}