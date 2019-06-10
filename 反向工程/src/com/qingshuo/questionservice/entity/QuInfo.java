package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 问题信息表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class QuInfo {
    /**
     * 主键
     */
    private Long quId;

    /**
     * 问题标题
     */
    private String quTitle;

    /**
     * 问题描述(服务器路径)
     */
    private String quDesc;

    /**
     * 问题状态 0 待审核 1 已发布
     */
    private Integer quStatus;

    /**
     * 发表人id
     */
    private Long createPin;

    /**
     * 发表时间
     */
    private Date createTime;

    /**
     * 是否匿名发布， 0 不是 1 是
     */
    private Integer isAnonymous;

    /**
     * 是否有效 0 不是 1 是
     */
    private Integer yn;

    /**
     * 关闭问题
     */
    private Integer isClose;

    public Long getQuId() {
        return quId;
    }

    public void setQuId(Long quId) {
        this.quId = quId;
    }

    public String getQuTitle() {
        return quTitle;
    }

    public void setQuTitle(String quTitle) {
        this.quTitle = quTitle == null ? null : quTitle.trim();
    }

    public String getQuDesc() {
        return quDesc;
    }

    public void setQuDesc(String quDesc) {
        this.quDesc = quDesc == null ? null : quDesc.trim();
    }

    public Integer getQuStatus() {
        return quStatus;
    }

    public void setQuStatus(Integer quStatus) {
        this.quStatus = quStatus;
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

    public Integer getIsClose() {
        return isClose;
    }

    public void setIsClose(Integer isClose) {
        this.isClose = isClose;
    }
}