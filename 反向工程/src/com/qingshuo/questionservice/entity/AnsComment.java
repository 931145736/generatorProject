package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 回答评论信息表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class AnsComment {
    /**
     * 回答评论信息表主键
     */
    private Long commentId;

    /**
     * 针对的回答id
     */
    private Long ansId;

    /**
     * 父评论id
     */
    private Long parentCommentId;

    /**
     * 评论内容(U文件服务器URL路径)
     */
    private String commentContent;

    /**
     * 评论者id
     */
    private Long createPin;

    /**
     * 评论时间
     */
    private Date createTime;

    /**
     * 是否有效 0 不是 1 是
     */
    private Integer yn;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getAnsId() {
        return ansId;
    }

    public void setAnsId(Long ansId) {
        this.ansId = ansId;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
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