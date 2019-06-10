package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class AnsInfo {
    /**
     * 主键
     */
    private Long ansId;

    /**
     * 问题ID
     */
    private Long qcId;

    /**
     * 回答摘要
     */
    private String ansSummary;

    /**
     * 回答对应文件服务器路径
     */
    private String ansContenturl;

    /**
     * 图片，音视频文件服务器路径
     */
    private String ansFileurl;

    /**
     * 回答状态 0待审核 1已发布
     */
    private Integer ansStatus;

    /**
     * 回答者id
     */
    private Long createPin;

    /**
     * 回答时间
     */
    private Date createTime;

    /**
     * 是否匿名回答 0 不是 1 是
     */
    private Integer isAnonymous;

    /**
     * 是否有效 0 不是 1 是
     */
    private Integer yn;

    /**
     * 针对回答是否允许回复  0不允许 1允许
     */
    private Integer isReply;

    public Long getAnsId() {
        return ansId;
    }

    public void setAnsId(Long ansId) {
        this.ansId = ansId;
    }

    public Long getQcId() {
        return qcId;
    }

    public void setQcId(Long qcId) {
        this.qcId = qcId;
    }

    public String getAnsSummary() {
        return ansSummary;
    }

    public void setAnsSummary(String ansSummary) {
        this.ansSummary = ansSummary == null ? null : ansSummary.trim();
    }

    public String getAnsContenturl() {
        return ansContenturl;
    }

    public void setAnsContenturl(String ansContenturl) {
        this.ansContenturl = ansContenturl == null ? null : ansContenturl.trim();
    }

    public String getAnsFileurl() {
        return ansFileurl;
    }

    public void setAnsFileurl(String ansFileurl) {
        this.ansFileurl = ansFileurl == null ? null : ansFileurl.trim();
    }

    public Integer getAnsStatus() {
        return ansStatus;
    }

    public void setAnsStatus(Integer ansStatus) {
        this.ansStatus = ansStatus;
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

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getIsReply() {
        return isReply;
    }

    public void setIsReply(Integer isReply) {
        this.isReply = isReply;
    }
}