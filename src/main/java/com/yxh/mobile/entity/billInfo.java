package com.yxh.mobile.entity;

public class billInfo {
    private Long id;

    private Long cardId;

    private Integer month;

    private Integer talk;

    private Integer sms;

    private Integer flow;

    private Double talkCost;

    private Double smsCost;

    private Double flowCost;

    private Double totalCost;

    private Double totalRecharge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getTalk() {
        return talk;
    }

    public void setTalk(Integer talk) {
        this.talk = talk;
    }

    public Integer getSms() {
        return sms;
    }

    public void setSms(Integer sms) {
        this.sms = sms;
    }

    public Integer getFlow() {
        return flow;
    }

    public void setFlow(Integer flow) {
        this.flow = flow;
    }

    public Double getTalkCost() {
        return talkCost;
    }

    public void setTalkCost(Double talkCost) {
        this.talkCost = talkCost;
    }

    public Double getSmsCost() {
        return smsCost;
    }

    public void setSmsCost(Double smsCost) {
        this.smsCost = smsCost;
    }

    public Double getFlowCost() {
        return flowCost;
    }

    public void setFlowCost(Double flowCost) {
        this.flowCost = flowCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalRecharge() {
        return totalRecharge;
    }

    public void setTotalRecharge(Double totalRecharge) {
        this.totalRecharge = totalRecharge;
    }
}