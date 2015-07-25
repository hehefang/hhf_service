package com.hhf.model.order;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with Liu Yong
 * User: melnnyy
 * Date: 2014/7/4
 * Time: 14:39
 */
public class PaymentOrder implements Serializable {
    private Long orderId;
    private String orderStatus;
    private String payStatus;
    private String payType;
    private String payMode;
    private String receiptMode;
    private String receiptType;
    private Date receiptDate;
    private Date lastUpdateDate;
    private String lastUpdateByName;

    // 支付结果
    private boolean payResult = true;
    private String info;

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isPayResult() {
        return payResult;
    }

    public void setPayResult(boolean payResult) {
        this.payResult = payResult;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getReceiptMode() {
        return receiptMode;
    }

    public void setReceiptMode(String receiptMode) {
        this.receiptMode = receiptMode;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
}
