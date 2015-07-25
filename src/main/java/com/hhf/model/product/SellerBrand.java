package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.hhf.common.util.DateUtils;

public class SellerBrand implements Serializable {
	private static final long serialVersionUID = -5142538361893949401L;

	private Integer sellerBrandId;

	private Integer sellerId;

	private Integer brandId;

	private Date submitDate;

	private String status;

	private String auditStatus;

	private Date auditDate;

	private String auditByName;

	private String auditContent;

	private String authType;

	private Date authStartDate;

	private Date authEndDate;

	private String categories;

	private String trademarkCert;

	private String otherCert;

	private String authCert;

	private String loginName;

	private String coName;

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public Integer getSellerBrandId() {
		return sellerBrandId;
	}

	public void setSellerBrandId(Integer sellerBrandId) {
		this.sellerBrandId = sellerBrandId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public String getAuditByName() {
		return auditByName;
	}

	public void setAuditByName(String auditByName) {
		this.auditByName = auditByName;
	}

	public String getAuditContent() {
		return auditContent;
	}

	public void setAuditContent(String auditContent) {
		this.auditContent = auditContent;
	}

	public Date getAuthStartDate() {
		return authStartDate;
	}

	public void setAuthStartDate(Date authStartDate) {
		this.authStartDate = authStartDate;
		this.sAuthStartDate = DateUtils.formatDate(authStartDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public Date getAuthEndDate() {
		return authEndDate;
	}

	public void setAuthEndDate(Date authEndDate) {
		this.authEndDate = authEndDate;
		this.sAuthEndDate = DateUtils.formatDate(authEndDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getTrademarkCert() {
		return trademarkCert;
	}

	public void setTrademarkCert(String trademarkCert) {
		this.trademarkCert = trademarkCert;
	}

	public String getOtherCert() {
		return otherCert;
	}

	public void setOtherCert(String otherCert) {
		this.otherCert = otherCert;
	}

	public String getAuthCert() {
		return authCert;
	}

	public void setAuthCert(String authCert) {
		this.authCert = authCert;
	}

	// 扩展
	private String brandName;

	private String brandEname;

	private String logoUrl;

	private String brandAbbr;

	private String sAuthStartDate;

	private String sAuthEndDate;

	public String getShowName() {
		String name = "";
		if (StringUtils.isNotEmpty(brandName)) {
			if (StringUtils.isNotEmpty(brandEname)) {
				name = brandName + "/" + brandEname;
			} else {
				name = brandName;
			}
		} else if (StringUtils.isNotEmpty(brandEname)) {
			name = brandEname;
		}

		return name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandEname() {
		return brandEname;
	}

	public void setBrandEname(String brandEname) {
		this.brandEname = brandEname;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getBrandAbbr() {
		return brandAbbr;
	}

	public void setBrandAbbr(String brandAbbr) {
		this.brandAbbr = brandAbbr;
	}

	public String getsAuthStartDate() {
		return sAuthStartDate;
	}

	public void setsAuthStartDate(String sAuthStartDate) {
		this.sAuthStartDate = sAuthStartDate;
		this.authStartDate = DateUtils.parseDate(sAuthStartDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public String getsAuthEndDate() {
		return sAuthEndDate;
	}

	public void setsAuthEndDate(String sAuthEndDate) {
		this.sAuthEndDate = sAuthEndDate;
		this.authEndDate = DateUtils.parseDate(sAuthEndDate,
				DateUtils.PART_TIME_PATTERN);
	}

}