package com.hhf.model.product.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductVo implements Serializable{
	private static final long serialVersionUID = -4853605375333087897L;
	
	private Integer prodId;	 	// 商品Id
	private String prodCode;	// 编码
	private String title; 	 	// 商品标题
	private String subtitle; 	// 卖点(子标题)
	private Integer bcId;		// 品类ID
	private String bcCode;		// 品类编码
	private Integer sellerId; 	// 卖家ID
	private String artNo; 		// 货号
    private Integer brandId;	// 品牌ID
    private String brandName;	// 品牌名称
	private String attrValueId;	//属性ID串 “|||”
	private String attrValueName;//属性名称串
	private String detail;		//描述
	private String imgUrl;		//图片url
	private String[] skuSpecId;	//规格
	private String[] skuSpecName;//规格名称
	private BigDecimal[] skuSalePrice;//销售价
	private BigDecimal[] skuMarketPrice;//特卖价
	private Integer[] skuStockBalance;//库存
	private Integer[] sellerNo;//商家编号
	private String[] skuImgUrl;	// sku图片
	private String auditStatus; //审核状态
	
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public Integer getBcId() {
		return bcId;
	}
	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}
	public String getBcCode() {
		return bcCode;
	}
	public void setBcCode(String bcCode) {
		this.bcCode = bcCode;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getArtNo() {
		return artNo;
	}
	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getAttrValueId() {
		return attrValueId;
	}
	public void setAttrValueId(String attrValueId) {
		this.attrValueId = attrValueId;
	}
	public String getAttrValueName() {
		return attrValueName;
	}
	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String[] getSkuSpecId() {
		return skuSpecId;
	}
	public void setSkuSpecId(String[] skuSpecId) {
		this.skuSpecId = skuSpecId;
	}
	public String[] getSkuSpecName() {
		return skuSpecName;
	}
	public void setSkuSpecName(String[] skuSpecName) {
		this.skuSpecName = skuSpecName;
	}
	public BigDecimal[] getSkuSalePrice() {
		return skuSalePrice;
	}
	public void setSkuSalePrice(BigDecimal[] skuSalePrice) {
		this.skuSalePrice = skuSalePrice;
	}
	public BigDecimal[] getSkuMarketPrice() {
		return skuMarketPrice;
	}
	public void setSkuMarketPrice(BigDecimal[] skuMarketPrice) {
		this.skuMarketPrice = skuMarketPrice;
	}
	public String[] getSkuImgUrl() {
		return skuImgUrl;
	}
	public void setSkuImgUrl(String[] skuImgUrl) {
		this.skuImgUrl = skuImgUrl;
	}
	public Integer[] getSkuStockBalance() {
		return skuStockBalance;
	}
	public void setSkuStockBalance(Integer[] skuStockBalance) {
		this.skuStockBalance = skuStockBalance;
	}
	public Integer[] getSellerNo() {
		return sellerNo;
	}
	public void setSellerNo(Integer[] sellerNo) {
		this.sellerNo = sellerNo;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	
	
}
