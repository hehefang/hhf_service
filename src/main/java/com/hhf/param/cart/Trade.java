package com.hhf.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
/**
 * 结算类
 * @author wxp
 */
public class Trade implements Serializable {

	private static final long serialVersionUID = 8478055469560292445L;
	private Long userId;
	private Integer addressId;
	private String payType;
	private String payMode;
	private Long sellerId;
	private Long brandShowId;
	private String brandShowTitle;
	private BigDecimal deliverFee;
	private BigDecimal deliverDiscountFee;
	private BigDecimal discountFee;
	private String discountType;
	private List<TradeItem> tradeItems;
	private String userIP;
	private String orderType;
	private String orderSource;
	private String userRemark;
	private String optName;//操作人

	public Long getBrandShowId() {
		return brandShowId;
	}
	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public List<TradeItem> getTradeItems() {
		return tradeItems;
	}
	public void setTradeItems(List<TradeItem> tradeItems) {
		this.tradeItems = tradeItems;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public BigDecimal getDeliverFee() {
		return deliverFee;
	}
	public void setDeliverFee(BigDecimal deliverFee) {
		this.deliverFee = deliverFee;
	}
	public String getUserIP() {
		return userIP;
	}
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}
	public BigDecimal getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(BigDecimal discountFee) {
		this.discountFee = discountFee;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getUserRemark() {
		return userRemark;
	}
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}
	public BigDecimal getDeliverDiscountFee() {
		return deliverDiscountFee;
	}
	public void setDeliverDiscountFee(BigDecimal deliverDiscountFee) {
		this.deliverDiscountFee = deliverDiscountFee;
	}
	public String getOptName() {
		return optName;
	}
	public void setOptName(String optName) {
		this.optName = optName;
	}
	public String getBrandShowTitle() {
		return brandShowTitle;
	}
	public void setBrandShowTitle(String brandShowTitle) {
		this.brandShowTitle = brandShowTitle;
	}
}
