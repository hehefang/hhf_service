package com.hhf.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class CartItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4754561596172698295L;

	// 特卖明细ID
	private Long brandShowDetailId;
	// 商品id
	private Integer prodId;
	// skuid
	private Integer skuId;
	// 商品code
	private String prodCode;
	// skuCode
	private String skuCode;
	// 数量
	private Long num;
	// 商品名称
	private String prodName;
	// 商品图片url
	private String prodImgUrl;
	// 是否选中
	private boolean selected;
	// 明细状态码
	private long statusCode;
	// 规格id串
	private String specId;
	// 规格名称串
	private String specName;
	// sku的规格
	private List<Map<String, String>> specs;
	// 市场价
	private BigDecimal maketPrice;
	// 特卖价
	private BigDecimal showPrice;
	// 库存
	private Long stock;
	
	private Integer purchaseCountLimit; 
	// 排序权重
	private int sortWeight;
	// 基础类目三级id
	private Integer bcId;

//	/**
//	 * 获取促销的剩余时间(单位：秒)
//	 * 
//	 * @return
//	 */
//	public long getRestOfTime() {
//		//TODO
//		return 0l;
//	}

	public Integer getPurchaseCountLimit() {
		return purchaseCountLimit;
	}

	public void setPurchaseCountLimit(Integer purchaseCountLimit) {
		this.purchaseCountLimit = purchaseCountLimit;
	}
	
	public String getSpecId() {
		return specId;
	}
	
	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public Long getBrandShowDetailId() {
		return brandShowDetailId;
	}

	public void setBrandShowDetailId(Long brandShowDetailId) {
		this.brandShowDetailId = brandShowDetailId;
	}

	public BigDecimal getMaketPrice() {
		return maketPrice;
	}

	public void setMaketPrice(BigDecimal maketPrice) {
		this.maketPrice = maketPrice;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdImgUrl() {
		return prodImgUrl;
	}

	public void setProdImgUrl(String prodImgUrl) {
		this.prodImgUrl = prodImgUrl;
	}

	public List<Map<String, String>> getSpecs() {
		return specs;
	}

	public void setSpecs(List<Map<String, String>> specs) {
		this.specs = specs;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(long statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		return true;
	}

	public CookieCartItem transferCookieCartItem() {

		CookieCartItem cookieCartItem = new CookieCartItem();
		cookieCartItem.setBsdid(this.brandShowDetailId);
		cookieCartItem.setNum(this.num);
		cookieCartItem.setSelected(this.selected);
		
		return cookieCartItem;
	}

	public int getSortWeight() {
		return sortWeight;
	}

	public void setSortWeight(int sortWeight) {
		this.sortWeight = sortWeight;
	}

	public Integer getBcId() {
		return bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
}
