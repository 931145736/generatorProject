package com.qingshuo.questionservice.dao;

import com.qingshuo.questionservice.entity.QuCorpus;

public interface QuCorpusMapper {
    int deleteByPrimaryKey(Long qcId);

    int insert(QuCorpus record);

    int insertSelective(QuCorpus record);

    QuCorpus selectByPrimaryKey(Long qcId);

    int updateByPrimaryKeySelective(QuCorpus record);

    int updateByPrimaryKey(QuCorpus record);
}