package com.qingshuo.questionservice.entity;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class CommentPraise {
    /**
     * 评论id
     */
    private Long commentId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 是否有效 0 否  1  是
     */
    private Integer yn;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}