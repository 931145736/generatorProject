package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 回答与问题关联表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class AnsCount {
    /**
     * 回答与问题关联表主键
     */
    private Long ansId;

    /**
     * 回答点赞数
     */
    private Integer ansPraise;

    /**
     * 回答评论数
     */
    private Integer ansComment;

    /**
     * 回答分享转载数
     */
    private Integer ansShare;

    /**
     * 回答收藏数
     */
    private Integer ansCollect;

    /**
     * 回答者id
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

    public Long getAnsId() {
        return ansId;
    }

    public void setAnsId(Long ansId) {
        this.ansId = ansId;
    }

    public Integer getAnsPraise() {
        return ansPraise;
    }

    public void setAnsPraise(Integer ansPraise) {
        this.ansPraise = ansPraise;
    }

    public Integer getAnsComment() {
        return ansComment;
    }

    public void setAnsComment(Integer ansComment) {
        this.ansComment = ansComment;
    }

    public Integer getAnsShare() {
        return ansShare;
    }

    public void setAnsShare(Integer ansShare) {
        this.ansShare = ansShare;
    }

    public Integer getAnsCollect() {
        return ansCollect;
    }

    public void setAnsCollect(Integer ansCollect) {
        this.ansCollect = ansCollect;
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