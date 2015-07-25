package com.hhf.model.order;

import java.io.Serializable;
import java.util.Date;

public class OrderLog implements Serializable{
    private Long orderLogId;

    private Long orderId;

    private String orderCode;

    private String optByName;

    private Date optTime;

    private String optContent;

    private String optIp;

    private String fromOrderStatus;

    private String toOrderStatus;

    public Long getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Long orderLogId) {
        this.orderLogId = orderLogId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOptByName() {
        return optByName;
    }

    public void setOptByName(String optByName) {
        this.optByName = optByName == null ? null : optByName.trim();
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent == null ? null : optContent.trim();
    }

    public String getOptIp() {
        return optIp;
    }

    public void setOptIp(String optIp) {
        this.optIp = optIp == null ? null : optIp.trim();
    }

    public String getFromOrderStatus() {
        return fromOrderStatus;
    }

    public void setFromOrderStatus(String fromOrderStatus) {
        this.fromOrderStatus = fromOrderStatus == null ? null : fromOrderStatus.trim();
    }

    public String getToOrderStatus() {
        return toOrderStatus;
    }

    public void setToOrderStatus(String toOrderStatus) {
        this.toOrderStatus = toOrderStatus == null ? null : toOrderStatus.trim();
    }
}