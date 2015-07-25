package com.hhf.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.dubbo.common.utils.StringUtils;

public class OrderItem implements Serializable{
	private static final long serialVersionUID = 4467820503959940139L;

	private Long orderItemId;

	private Long orderId;

	private String orderCode;

	private Long skuId;

	private Long prodId;

	private String prodCode;

	private String skuCode;

	private String prodSpecId;

	private String prodSpecName;

	private String prodTitle;
	
	private String prodImg;

	private Long bcId;

	private Long sellerId;

	private BigDecimal salePrice;

	private BigDecimal transPrice;

	private Long number;

	private String status;

	private String isComment;

	private Long brandShowId;

	private String brandShowTitle;
	
	private Long bsdId;
	
	private Order order;

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
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

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode == null ? null : prodCode.trim();
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode == null ? null : skuCode.trim();
	}

	public String getProdSpecId() {
		return prodSpecId;
	}

	public void setProdSpecId(String prodSpecId) {
		this.prodSpecId = prodSpecId == null ? null : prodSpecId.trim();
	}

	public String getProdSpecName() {
		return prodSpecName;
	}

	public void setProdSpecName(String prodSpecName) {
		this.prodSpecName = prodSpecName == null ? null : prodSpecName.trim();
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle == null ? null : prodTitle.trim();
	}

	public Long getBcId() {
		return bcId;
	}

	public void setBcId(Long bcId) {
		this.bcId = bcId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getTransPrice() {
		return transPrice;
	}

	public void setTransPrice(BigDecimal transPrice) {
		this.transPrice = transPrice;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getIsComment() {
		return isComment;
	}

	public void setIsComment(String isComment) {
		this.isComment = isComment == null ? null : isComment.trim();
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
		this.brandShowTitle = brandShowTitle == null ? null : brandShowTitle
				.trim();
	}

	public Long getBsdId() {
		return bsdId;
	}

	public void setBsdId(Long bsdId) {
		this.bsdId = bsdId;
	}

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}
	
	public Map<String, String> getSpecNames() {
		String specNames = this.prodSpecName;
		
		Map<String, String> specTemp = new HashMap<String, String>();
		
		if (!StringUtils.isBlank(specNames)) {
			String[] specs = specNames.split("\\|\\|\\|");
			if (specs != null && specs.length > 0) {
				for (String spec : specs) {
					String[] opt = spec.split("\\:\\:\\:");
					if (opt != null && opt.length > 1) {
						String specName = opt[0];
						String specVal = opt[1];
						specTemp.put(specName, specVal);
					}
				}
			}
		}
		
		return specTemp;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}