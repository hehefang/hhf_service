package com.hhf.model.order;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hhf.model.product.Sku;

public class ReturnOrderItem implements Serializable{
	private static final long serialVersionUID = 8005746338092665813L;

	private Long retOrderItemId;

    private Long retOrderId;

    private Long prodId;

    private Long sellerId;

    private Long itemId;

    private Long skuId;

    private Long returnNumber;

    private BigDecimal retFee;
    
    private Sku sku;
    
    private OrderItem orderItem; 

    public Long getRetOrderItemId() {
        return retOrderItemId;
    }

    public void setRetOrderItemId(Long retOrderItemId) {
        this.retOrderItemId = retOrderItemId;
    }

    public Long getRetOrderId() {
        return retOrderId;
    }

    public void setRetOrderId(Long retOrderId) {
        this.retOrderId = retOrderId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(Long returnNumber) {
        this.returnNumber = returnNumber;
    }

    public BigDecimal getRetFee() {
        return retFee;
    }

    public void setRetFee(BigDecimal retFee) {
        this.retFee = retFee;
    }

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
}