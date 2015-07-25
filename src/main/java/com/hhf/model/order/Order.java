package com.hhf.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.hhf.common.util.DateUtils;
import com.hhf.constants.order.OrderConstants;
import com.hhf.constants.order.PayModeEnum;


public class Order implements Serializable{
	private static final long serialVersionUID = -5041606926132260957L;

	private Long orderId;

    private String orderCode;

    private Long userId;

    private String userName;

    private Date createdDate;

    private Long sellerId;
    
	private Long brandShowId;

	private String brandShowTitle;
	
    private String orderType;

    private String orderStatus;

    private BigDecimal prodFee;

    private String prodDiscountType;

    private BigDecimal prodDiscountFee;

    private BigDecimal deliverFee;

    private BigDecimal deliverDiscount;

    private BigDecimal orderFee;

    private String rName;

    private String rProvince;

    private String rCity;

    private String rCounty;

    private String rTown;

    private String rAddr;

    private String rMobile;

    private String rPhone;

    private String rEmail;

    private String rZipcode;

    private String orderSource;

    private String payType;

    private String payMode;

    private String payStatus;

    private Date payDate;

    private Long logisticsCompa;

    private String logisticsName;

    private String awbNo;

    private Date sendTime;

    private String signedStatus;

    private String signedType;

    private Date signedTime;

    private String notSignedCause;

    private Date receiptDate;

    private String receiptType;

    private String receiptMode;

    private String createdByName;

    private String ywRemark;

    private String sellerRemark;

    private String userRemark;

    private Long sSAId;

    private Date cancelDate;

    private String cancelByName;

    private String cancelReason;

    private Date lastUpdateDate;

    private String lastUpdateByName;

    private List<OrderItem> orderItems;
    
    public long getPayRestTime() {
    	if(!OrderConstants.ORDER_STATUS_WAITPAYMENT.equals(this.orderStatus)) {
    		return 0l;
    	}
    	long now = System.currentTimeMillis();
    	long expireDate = this.createdDate.getTime() + 24 * 60 * 60 * 1000;
    	long payRestTime = (expireDate - now) / 1000;
    	return payRestTime;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public BigDecimal getProdFee() {
        return prodFee;
    }

    public void setProdFee(BigDecimal prodFee) {
        this.prodFee = prodFee;
    }

    public String getProdDiscountType() {
        return prodDiscountType;
    }

    public void setProdDiscountType(String prodDiscountType) {
        this.prodDiscountType = prodDiscountType == null ? null : prodDiscountType.trim();
    }

    public BigDecimal getProdDiscountFee() {
        return prodDiscountFee;
    }

    public void setProdDiscountFee(BigDecimal prodDiscountFee) {
        this.prodDiscountFee = prodDiscountFee;
    }

    public BigDecimal getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }

    public BigDecimal getDeliverDiscount() {
        return deliverDiscount;
    }

    public void setDeliverDiscount(BigDecimal deliverDiscount) {
        this.deliverDiscount = deliverDiscount;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrProvince() {
        return rProvince;
    }

    public void setrProvince(String rProvince) {
        this.rProvince = rProvince == null ? null : rProvince.trim();
    }

    public String getrCity() {
        return rCity;
    }

    public void setrCity(String rCity) {
        this.rCity = rCity == null ? null : rCity.trim();
    }

    public String getrCounty() {
        return rCounty;
    }

    public void setrCounty(String rCounty) {
        this.rCounty = rCounty == null ? null : rCounty.trim();
    }

    public String getrTown() {
        return rTown;
    }

    public void setrTown(String rTown) {
        this.rTown = rTown == null ? null : rTown.trim();
    }

    public String getrAddr() {
        return rAddr;
    }

    public void setrAddr(String rAddr) {
        this.rAddr = rAddr == null ? null : rAddr.trim();
    }

    public String getrMobile() {
        return rMobile;
    }

    public void setrMobile(String rMobile) {
        this.rMobile = rMobile == null ? null : rMobile.trim();
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone == null ? null : rPhone.trim();
    }

    public String getrEmail() {
        return rEmail;
    }

    public void setrEmail(String rEmail) {
        this.rEmail = rEmail == null ? null : rEmail.trim();
    }

    public String getrZipcode() {
        return rZipcode;
    }

    public void setrZipcode(String rZipcode) {
        this.rZipcode = rZipcode == null ? null : rZipcode.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Long getLogisticsCompa() {
        return logisticsCompa;
    }

    public void setLogisticsCompa(Long logisticsCompa) {
        this.logisticsCompa = logisticsCompa;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    public String getAwbNo() {
        return awbNo;
    }

    public void setAwbNo(String awbNo) {
        this.awbNo = awbNo == null ? null : awbNo.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getSignedStatus() {
        return signedStatus;
    }

    public void setSignedStatus(String signedStatus) {
        this.signedStatus = signedStatus == null ? null : signedStatus.trim();
    }

    public String getSignedType() {
        return signedType;
    }

    public void setSignedType(String signedType) {
        this.signedType = signedType == null ? null : signedType.trim();
    }

    public Date getSignedTime() {
        return signedTime;
    }

    public void setSignedTime(Date signedTime) {
        this.signedTime = signedTime;
    }

    public String getNotSignedCause() {
        return notSignedCause;
    }

    public void setNotSignedCause(String notSignedCause) {
        this.notSignedCause = notSignedCause == null ? null : notSignedCause.trim();
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType == null ? null : receiptType.trim();
    }

    public String getReceiptMode() {
        return receiptMode;
    }

    public void setReceiptMode(String receiptMode) {
        this.receiptMode = receiptMode == null ? null : receiptMode.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public String getYwRemark() {
        return ywRemark;
    }

    public void setYwRemark(String ywRemark) {
        this.ywRemark = ywRemark == null ? null : ywRemark.trim();
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark == null ? null : sellerRemark.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }

    public Long getsSAId() {
        return sSAId;
    }

    public void setsSAId(Long sSAId) {
        this.sSAId = sSAId;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelByName() {
        return cancelByName;
    }

    public void setCancelByName(String cancelByName) {
        this.cancelByName = cancelByName == null ? null : cancelByName.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName == null ? null : lastUpdateByName.trim();
    }

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Long getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Long brandShowId) {
		this.brandShowId = brandShowId;
	}

	public String getBrandShowTitle() {
		return brandShowTitle;
	}

	public void setBrandShowTitle(String brandShowTitle) {
		this.brandShowTitle = brandShowTitle;
	}
	
	public String getStrOrderStatus() {
		String orderStatusName = "";
		if(OrderConstants.ORDER_STATUS_TOBEPROCESS.equals(this.orderStatus)){
			orderStatusName = "待处理";
		}else if(OrderConstants.ORDER_STATUS_WAITPAYMENT.equals(this.orderStatus)){
			orderStatusName = "等待付款";
		}else if(OrderConstants.ORDER_STATUS_WAITDELIVERED.equals(this.orderStatus)){
			orderStatusName = "买家已付款";
		}else if(OrderConstants.ORDER_STATUS_CANCELLED.equals(this.orderStatus)){
			orderStatusName = "交易取消";
		}else if(OrderConstants.ORDER_STATUS_DELIVERED.equals(this.orderStatus)){
			orderStatusName = "商家已发货";
		}else if(OrderConstants.ORDER_STATUS_DELIVERY_FAILURE.equals(this.orderStatus)){
			orderStatusName = "配送失败";
		}else if(OrderConstants.ORDER_STATUS_REJECT.equals(this.orderStatus)){
			orderStatusName = "拒收";
		}else if(OrderConstants.ORDER_STATUS_COMPLETED.equals(this.orderStatus)){
			orderStatusName = "交易完成";
		}else if(OrderConstants.ORDER_STATUS_RETURN.equals(this.orderStatus)){
			orderStatusName = "已退货";
		}else if(OrderConstants.ORDER_STATUS_DELETE.equals(this.orderStatus)){
			orderStatusName = "已删除";
		}
		
		return orderStatusName;
	}
	
	public String getStrPayStatus() {
		String payStatusName = "";
		if(OrderConstants.PAY_STATUS_UNPAY.equals(this.payStatus)){
			payStatusName = "未支付";
		}else if(OrderConstants.PAY_STATUS_PAYED.equals(this.payStatus)){
			payStatusName = "已支付";
		}
		
		return payStatusName;
	}
	
	public String getStrOrderSource() {
		String orderSourceName = "";
		if(OrderConstants.ORDER_SOURCE_WEB.equals(this.orderSource)){
			orderSourceName = "网站";
		}else if(OrderConstants.ORDER_SOURCE_CC.equals(this.orderSource)){
			orderSourceName = "电话";
		}else if(OrderConstants.ORDER_SOURCE_IOS.equals(this.orderSource)){
			orderSourceName = "手机IOS";
		}else if(OrderConstants.ORDER_SOURCE_ANDROID.equals(this.orderSource)){
			orderSourceName = "手机安卓";
		}
		
		return orderSourceName;
	}
	
	public String getStrPayType() {
		String payTypeName = "";
		if(OrderConstants.PAY_TYPE_COD.equals(this.payType)){
			payTypeName = "货到付款";
		}else if(OrderConstants.PAY_TYPE_ONLINE.equals(this.payType)){
			payTypeName = "在线支付";
		}
		return payTypeName;
	}
	
	public String getStrPayMode() {
		String payModeName = "";
		if(StringUtils.isBlank(this.payMode)){
			return payModeName;
		}
		
		if(OrderConstants.PAY_MODE_COD_POS.equals(this.payMode)){
			payModeName = "货到付款（POS）";
		}else if(OrderConstants.PAY_MODE_COD_CASH.equals(this.payMode)){
			payModeName = "货到付款（现金）";
		}else if(OrderConstants.PAY_MODE_APIPAY.equals(this.payMode)){
			payModeName = "支付宝";
		}else {			
			PayModeEnum pme = PayModeEnum.get(this.payMode);
	        if(null != pme) {
	        	payModeName =pme.getDesc();
	        }else{
	        	payModeName = "银联";
	        }
		}
		
		return payModeName;
	}
	
}