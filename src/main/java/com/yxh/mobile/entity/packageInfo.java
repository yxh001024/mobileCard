package com.yxh.mobile.entity;

public class packageInfo {
    private Long id;

    private String packageName;

    private Integer packageTalk;

    private Integer packageSms;

    private Integer packageFlow;

    private Double packagePrice;

    private Double overTalk;

    private Double overSms;

    private Double overFlow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getPackageTalk() {
        return packageTalk;
    }

    public void setPackageTalk(Integer packageTalk) {
        this.packageTalk = packageTalk;
    }

    public Integer getPackageSms() {
        return packageSms;
    }

    public void setPackageSms(Integer packageSms) {
        this.packageSms = packageSms;
    }

    public Integer getPackageFlow() {
        return packageFlow;
    }

    public void setPackageFlow(Integer packageFlow) {
        this.packageFlow = packageFlow;
    }

    public Double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Double getOverTalk() {
        return overTalk;
    }

    public void setOverTalk(Double overTalk) {
        this.overTalk = overTalk;
    }

    public Double getOverSms() {
        return overSms;
    }

    public void setOverSms(Double overSms) {
        this.overSms = overSms;
    }

    public Double getOverFlow() {
        return overFlow;
    }

    public void setOverFlow(Double overFlow) {
        this.overFlow = overFlow;
    }
}