package com.qingshuo.questionservice.entity;

/**
 * 问题点赞表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class QuPraise extends QuPraiseKey {
    /**
     * 是否有效 0 否 1 是
     */
    private Integer yn;

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}