package com.hhf.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Sku implements Serializable {
	private static final long serialVersionUID = 3625060647673155292L;

	private Integer skuId;

    private Integer prodId;

    private String skuSpecId;

    private String skuSpecName;

    private String prodCode;

    private String skuCode;
    
    private String sellerNo;	//商家编号

    private String skuImgUrl;

    private Integer stockBalance;

    private BigDecimal marketPrice;

    private BigDecimal salePrice;

    private String skuType;

    private String skuStatus;

    private Integer sortRank;

    private Date createDate;

    private String createByName;

    private Date lastUpdateDate;

    private String updateByName;
    
    private Product product;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getSkuSpecId() {
        return skuSpecId;
    }

    public void setSkuSpecId(String skuSpecId) {
        this.skuSpecId = skuSpecId;
    }

    public String getSkuSpecName() {
        return skuSpecName;
    }

    public void setSkuSpecName(String skuSpecName) {
        this.skuSpecName = skuSpecName;
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

    public String getSkuImgUrl() {
        return skuImgUrl;
    }

    public void setSkuImgUrl(String skuImgUrl) {
        this.skuImgUrl = skuImgUrl;
    }

    public Integer getStockBalance() {
        return stockBalance;
    }

    public void setStockBalance(Integer stockBalance) {
        this.stockBalance = stockBalance;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Integer getSortRank() {
		return sortRank;
	}

	public void setSortRank(Integer sortRank) {
		this.sortRank = sortRank;
	}

	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName;
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getSellerNo() {
		return sellerNo;
	}

	public void setSellerNo(String sellerNo) {
		this.sellerNo = sellerNo;
	}
	
	
}