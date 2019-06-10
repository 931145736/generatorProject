package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 问题数据信息表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class QuCount {
    /**
     * 主键
     */
    private Long qcId;

    /**
     * 问题关注数
     */
    private Integer quAttention;

    /**
     * 问题回答数
     */
    private Integer quAnswer;

    /**
     * 问题点赞数
     */
    private Integer quPraise;

    /**
     * 问题转发分享数
     */
    private Integer quShare;

    /**
     * 创建者
     */
    private Long createPin;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否有效 0 不是 1 是
     */
    private Integer yn;

    public Long getQcId() {
        return qcId;
    }

    public void setQcId(Long qcId) {
        this.qcId = qcId;
    }

    public Integer getQuAttention() {
        return quAttention;
    }

    public void setQuAttention(Integer quAttention) {
        this.quAttention = quAttention;
    }

    public Integer getQuAnswer() {
        return quAnswer;
    }

    public void setQuAnswer(Integer quAnswer) {
        this.quAnswer = quAnswer;
    }

    public Integer getQuPraise() {
        return quPraise;
    }

    public void setQuPraise(Integer quPraise) {
        this.quPraise = quPraise;
    }

    public Integer getQuShare() {
        return quShare;
    }

    public void setQuShare(Integer quShare) {
        this.quShare = quShare;
    }

    public Long getCreatePin() {
        return createPin;
    }

    public void setCreatePin(Long createPin) {
        this.createPin = createPin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}