package com.hhf.model.order;

import java.io.Serializable;
import java.math.BigDecimal;

public class PaymentDetail implements Serializable{
    private Long pDetailId;

    private Long paymentId;

    private Long orderId;

    private BigDecimal amount;

    private Long userAccountId;

    private String paymentType;

    public Long getpDetailId() {
        return pDetailId;
    }

    public void setpDetailId(Long pDetailId) {
        this.pDetailId = pDetailId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }
}