package com.hhf.param.order;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.math.NumberUtils;

import com.hhf.common.util.DateUtils;



public class OrderCondition implements Serializable {
	private static final long serialVersionUID = -6683171394517125709L;
	//收货人姓名
	private String rName;
	private Long orderId;
	private String orderCode;
	private Date startDate;
	private Date endDate;
	private String orderStatus;
	private Integer sellerId;
	private String storeName;
	private String payType;
	private String payMode;
	private String prodCode;
	private String proTitle;
	private String userName;
	private String orderSource;
	private Date startTime;
	private Date endTime;
	private String payStatus;
	private String rMobile;
	private String sellerMobile;
	private String province;
	private String city;
	private String county;
	private String provinceName;
	private String cityName;
	private String countyName;
	private String brandShowId;
	
	//是否写库查询
	private boolean writable;
	
	public String getrMobile() {
		return rMobile;
	}
	public void setrMobile(String rMobile) {
		this.rMobile = rMobile;
	}
	public String getSellerMobile() {
		return sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		if(endDate != null){
			String strEndDate = DateUtils.formatDate(endDate, "yyyy-MM-dd");
			strEndDate = strEndDate+" 23:59:59";
			endDate = DateUtils.parseDate(strEndDate);
		}
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProTitle() {
		return proTitle;
	}
	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public boolean isWritable() {
		return writable;
	}
	public void setWritable(boolean writable) {
		this.writable = writable;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public int getBrandShowId() {
		return NumberUtils.toInt(brandShowId, 0);
	}
	public void setBrandShowId(String brandShowId) {
		this.brandShowId = brandShowId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

}
