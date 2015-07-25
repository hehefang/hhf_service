package com.hhf.param.product;

import java.io.Serializable;
import java.util.Date;

public class ProductCondition implements Serializable {
	private static final long serialVersionUID = 4303516093238416741L;
	private Integer sellerId;	//卖家ID
	private Integer prodId;	//商品ID
	private String prodCode;//商品编号
	private Integer bcId;	//基础类目ID（第三级）
	private String bcCode;  // bc_code
	private String title;	//标题
	private String status;	//状态
	private Date startDate;	//起始时间
	private Date endDate;	//结束时间
	private Date onDate;	//上架时间
	private Date downDate;	//下架时间
    private Date createDate;//创建时间
	private String auditStatus;	//审核状态
	private String lastAuditName;//审核人
	private Integer brandId;	//品牌ID
	private String brandName;	//品牌名称
	
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Date getOnDate() {
		return onDate;
	}
	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}
	public Date getDownDate() {
		return downDate;
	}
	public void setDownDate(Date downDate) {
		this.downDate = downDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getLastAuditName() {
		return lastAuditName;
	}
	public void setLastAuditName(String lastAuditName) {
		this.lastAuditName = lastAuditName;
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
	
}