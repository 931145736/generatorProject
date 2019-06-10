package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.AnsPraise;

public interface AnsPraiseMapper {
    int deleteByPrimaryKey(Long ansId);

    int insert(AnsPraise record);

    int insertSelective(AnsPraise record);

    AnsPraise selectByPrimaryKey(Long ansId);

    int updateByPrimaryKeySelective(AnsPraise record);

    int updateByPrimaryKey(AnsPraise record);
}