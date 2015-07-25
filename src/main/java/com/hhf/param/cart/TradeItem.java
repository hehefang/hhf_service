package com.hhf.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 结算详细类
 * 
 * @author wxp
 */
public class TradeItem implements Serializable {

	private static final long serialVersionUID = -2118511479393229451L;

	// 特卖明细ID
	private Long brandShowDetailId;
	// 专场ID
	private Long brandShowId;
	// 专场标题
	private String brandShowTitle;
	// 商品id
	private Integer prodId;
	// skuid
	private Integer skuId;
	// 商品code
	private String prodCode;
	// 商品code
	private String skuCode;
	// 数量
	private Long num;

	private Long sellerId;
	
	private BigDecimal marketPrice;

	private BigDecimal showPrice;
	// 基础类目三级id
	private Long bcId;

	private String prodTitle;
	private String prodImg;
	private String prodSpecId;
	private String prodSpecName;

	public Long getBrandShowDetailId() {
		return brandShowDetailId;
	}

	public void setBrandShowDetailId(Long brandShowDetailId) {
		this.brandShowDetailId = brandShowDetailId;
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

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public BigDecimal getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getProdSpecId() {
		return prodSpecId;
	}

	public void setProdSpecId(String prodSpecId) {
		this.prodSpecId = prodSpecId;
	}

	public String getProdSpecName() {
		return prodSpecName;
	}

	public void setProdSpecName(String prodSpecName) {
		this.prodSpecName = prodSpecName;
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

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getBcId() {
		return bcId;
	}

	public void setBcId(Long bcId) {
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

	public String getProdImg() {
		return prodImg;
	}

	public void setProdImg(String prodImg) {
		this.prodImg = prodImg;
	}
}
