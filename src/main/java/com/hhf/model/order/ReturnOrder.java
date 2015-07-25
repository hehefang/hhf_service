package com.hhf.model.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.hhf.constants.order.OrderConstants;
import com.hhf.model.seller.Seller;

public class ReturnOrder implements Serializable{
	private static final long serialVersionUID = 235156282514243901L;

	private Long retOrderId;

    private String retOrderCode;

    private Long orderId;

    private Long sellerId;

    private Long userId;

    private String returnType;

    private String returnReason;

    private String evidencePicUrl;

    private String status;

    private Date createDate;

    private String createIp;

    private String logisticsCode;

    private Byte logisticsCompId;
    
    private String logisticsCompName;

    private Date auditDate;

    private String auditByName;

    private String rejectReason;

    private String remarks;
    
    private Date confirmDate;
    
    private Date refundDate;
    
    private Date rejectDate;
    
    private Date cancelDate;
    
    private Long brandShowId;
    
    private String brandShowTitle;
    
    private Long orderCode;
    
    private Seller seller;

    public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public Date getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public Date getRejectDate() {
		return rejectDate;
	}

	public void setRejectDate(Date rejectDate) {
		this.rejectDate = rejectDate;
	}

    private List<ReturnOrderItem> retOrderItems;

    public Long getRetOrderId() {
        return retOrderId;
    }

    public void setRetOrderId(Long retOrderId) {
        this.retOrderId = retOrderId;
    }

    public String getRetOrderCode() {
        return retOrderCode;
    }

    public void setRetOrderCode(String retOrderCode) {
        this.retOrderCode = retOrderCode == null ? null : retOrderCode.trim();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getEvidencePicUrl() {
        return evidencePicUrl;
    }
    
    public List<String> getEvidencePics() {
		List<String> evidenceTemp = null;
		
		if (StringUtils.isNotBlank(this.evidencePicUrl)) {
			String[] urls = this.evidencePicUrl.split(",");
			evidenceTemp = new ArrayList<>(urls.length);
			for (String url : urls) {
				evidenceTemp.add(url);
			}
		}else{
			evidenceTemp = new ArrayList<>(0);
		}
		
		return evidenceTemp;
	}

    public void setEvidencePicUrl(String evidencePicUrl) {
        this.evidencePicUrl = evidencePicUrl == null ? null : evidencePicUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode == null ? null : logisticsCode.trim();
    }

    public Byte getLogisticsCompId() {
        return logisticsCompId;
    }

    public void setLogisticsCompId(Byte logisticsCompId) {
        this.logisticsCompId = logisticsCompId;
    }

    public String getLogisticsCompName() {
        return logisticsCompName;
    }

    public void setLogisticsCompName(String logisticsCompName) {
        this.logisticsCompName = logisticsCompName == null ? null : logisticsCompName.trim();
    }

    public String getAuditByName() {
        return auditByName;
    }

    public void setAuditByName(String auditByName) {
        this.auditByName = auditByName == null ? null : auditByName.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public List<ReturnOrderItem> getRetOrderItems() {
		return retOrderItems;
	}

	public void setRetOrderItems(List<ReturnOrderItem> retOrderItems) {
		this.retOrderItems = retOrderItems;
	}
	
	public String getStrStatus(){
		String strStatus = "";
		if(StringUtils.isNotBlank(this.status)){
			switch(this.status){
				case OrderConstants.order_return_reject:
					strStatus = "驳回";
					break;
				case OrderConstants.order_return_comfirm:
					strStatus = "卖家确认";
					break;
				case OrderConstants.order_return_cancel:
					strStatus = "买家取消";
					break;
				case OrderConstants.order_return_wait:
					strStatus = "等待卖家确认";
					break;
				case OrderConstants.order_return_audit:
					strStatus = "卖家受理";
					break;
				case OrderConstants.order_return_refund:
					strStatus = "卖家退款";
					break;
			}
		}
		return strStatus;
	}
	
	public String getSellerStatus(){
		String strStatus = "";
		if(StringUtils.isNotBlank(this.status)){
			switch(this.status){
				case OrderConstants.order_return_comfirm:
					strStatus = "已退货";
					break;
				case OrderConstants.order_return_cancel:
					strStatus = "退货取消";
					break;
				case OrderConstants.order_return_wait:
					strStatus = "买家申请退货";
					break;
				case OrderConstants.order_return_audit:
					strStatus = "卖家同意退货";
					break;
				case OrderConstants.order_return_refund:
					strStatus = "已退款";
			}
		}
		return strStatus;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;

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

	public Long getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Long orderCode) {
		this.orderCode = orderCode;
	}
}
