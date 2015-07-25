package com.hhf.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BrandShowDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4282655431598932203L;
	private Integer bSDId;
	private Integer brandShowId;
	private Integer prodId;
	private String prodCode;
	private String skuCode;
	private Integer skuId;
	private String prodName;
	private String prodTitle;
	private String prodImg;
	private String skuSpecName;
	private BigDecimal showPrice;
	private Integer showBalance;
	private Integer saleAmount;
	private Integer purchaseCountLimit;
	private Date startDate;
	private Date endDate;
	private String status;
	private Date createByDate;
	private String createByName;
	private Date removeDate;
	private BigDecimal orgPrice;
	private BigDecimal discount;
	private String artNo;
	private String brandName;

	private Sku sku;
	private Product product;
	private int removed;

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public int getRemoved() {
		return removed;
	}

	public void setRemoved(int removed) {
		this.removed = removed;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getbSDId() {
		return bSDId;
	}

	public void setbSDId(Integer bSDId) {
		this.bSDId = bSDId;
	}

	public Integer getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Integer brandShowId) {
		this.brandShowId = brandShowId;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
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

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}

	public String getSkuSpecName() {
		return skuSpecName;
	}

	public void setSkuSpecName(String skuSpecName) {
		this.skuSpecName = skuSpecName;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public Integer getShowBalance() {
		return showBalance;
	}

	public void setShowBalance(Integer showBalance) {
		this.showBalance = showBalance;
	}

	public Integer getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(Integer saleAmount) {
		this.saleAmount = saleAmount;
	}

	public Integer getPurchaseCountLimit() {
		return purchaseCountLimit;
	}

	public void setPurchaseCountLimit(Integer purchaseCountLimit) {
		this.purchaseCountLimit = purchaseCountLimit;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateByDate() {
		return createByDate;
	}

	public void setCreateByDate(Date createByDate) {
		this.createByDate = createByDate;
	}

	public String getCreateByName() {
		return createByName;
	}

	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}

	public Date getRemoveDate() {
		return removeDate;
	}

	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
	}

	public BigDecimal getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(BigDecimal orgPrice) {
		this.orgPrice = orgPrice;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}