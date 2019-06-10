package com.qingshuo.questionservice.entity;

import java.util.Date;

/**
 * 问题与父文集关联表
 * 
 * @author wcyong
 * 
 * @date 2019-06-10
 */
public class QuCorpus {
    /**
     * 主键
     */
    private Long qcId;

    /**
     * 问题id
     */
    private Long quId;

    /**
     * 父文集id
     */
    private Long corpId;

    /**
     * 操作类型 1 添加 2 收藏 3 转载分享
     */
    private Integer operationType;

    /**
     * 创建者id
     */
    private Long createPin;

    /**
     * 发布时间
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

    public Long getQuId() {
        return quId;
    }

    public void setQuId(Long quId) {
        this.quId = quId;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
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