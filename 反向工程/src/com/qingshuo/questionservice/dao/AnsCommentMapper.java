package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.AnsComment;

public interface AnsCommentMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(AnsComment record);

    int insertSelective(AnsComment record);

    AnsComment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(AnsComment record);

    int updateByPrimaryKey(AnsComment record);
}