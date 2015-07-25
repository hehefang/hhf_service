package com.hhf.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Payment implements Serializable{
    private Long paymentId;

    private Long originPaymentId;

    private Date createDate;

    private Long createId;
    
    private Long userId;

    private String userName;

    private String createByIp;

    private BigDecimal payAmount;

    private String payGw;

    private String status;

    private String type;

    private String tradeNo;

    private Date callbackDate;

    private String realPayGw;

    private Date realPayDate;

    private String paymentType;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getOriginPaymentId() {
        return originPaymentId;
    }

    public void setOriginPaymentId(Long originPaymentId) {
        this.originPaymentId = originPaymentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCreateByIp() {
        return createByIp;
    }

    public void setCreateByIp(String createByIp) {
        this.createByIp = createByIp == null ? null : createByIp.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayGw() {
        return payGw;
    }

    public void setPayGw(String payGw) {
        this.payGw = payGw == null ? null : payGw.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(Date callbackDate) {
        this.callbackDate = callbackDate;
    }

    public String getRealPayGw() {
        return realPayGw;
    }

    public void setRealPayGw(String realPayGw) {
        this.realPayGw = realPayGw == null ? null : realPayGw.trim();
    }

    public Date getRealPayDate() {
        return realPayDate;
    }

    public void setRealPayDate(Date realPayDate) {
        this.realPayDate = realPayDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}