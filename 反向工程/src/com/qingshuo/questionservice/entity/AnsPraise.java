package com.qingshuo.questionservice.entity;

/**
 * 回答点赞表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class AnsPraise {
    /**
     * 主键
     */
    private Long ansId;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 是否有效 0 否 1 是
     */
    private Integer yn;

    public Long getAnsId() {
        return ansId;
    }

    public void setAnsId(Long ansId) {
        this.ansId = ansId;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}