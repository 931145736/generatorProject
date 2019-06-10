package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.QuPraise;
import com.qingshuo.questionservice.entity.QuPraiseKey;

public interface QuPraiseMapper {
    int deleteByPrimaryKey(QuPraiseKey key);

    int insert(QuPraise record);

    int insertSelective(QuPraise record);

    QuPraise selectByPrimaryKey(QuPraiseKey key);

    int updateByPrimaryKeySelective(QuPraise record);

    int updateByPrimaryKey(QuPraise record);
}