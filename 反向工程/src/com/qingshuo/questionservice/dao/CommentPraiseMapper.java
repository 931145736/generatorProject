package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.CommentPraise;

public interface CommentPraiseMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(CommentPraise record);

    int insertSelective(CommentPraise record);

    CommentPraise selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(CommentPraise record);

    int updateByPrimaryKey(CommentPraise record);
}