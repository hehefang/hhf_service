package com.hhf.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class BrandShow implements Serializable {
	private static final char SPLITTER = ',';

	private Integer brandShowId;
	private Integer sellerId;
	private Integer brandId;
	private String title;
	private String showBannerImg;
	private String bgColor;
	private String type;
	private String status;
	private Date createByDate;
	private Date auditDate;
	private String auditByName;
	private String auditContent;
	private Date startDate;
	private Date endDate;
	private Date endByDate;
	private String endByName;
	private Integer endById;
	private Short buyLimit;
	private Integer sRAId;
	private String homeBannerImg;
	private String serviceQq;
	private String serviceTel;
	private Integer deliverProvince;
	private Integer deliverCity;
	private String logisticsCompIds;
	private BigDecimal LowestPrice;

	public Integer getBrandShowId() {
		return brandShowId;
	}

	public void setBrandShowId(Integer brandShowId) {
		this.brandShowId = brandShowId;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShowBannerImg() {
		return showBannerImg;
	}

	public void setShowBannerImg(String showBannerImg) {
		this.showBannerImg = showBannerImg;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getEndByDate() {
		return endByDate;
	}

	public void setEndByDate(Date endByDate) {
		this.endByDate = endByDate;
	}

	public String getEndByName() {
		return endByName;
	}

	public void setEndByName(String endByName) {
		this.endByName = endByName;
	}

	public Integer getEndById() {
		return endById;
	}

	public void setEndById(Integer endById) {
		this.endById = endById;
	}

	public Short getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Short buyLimit) {
		this.buyLimit = buyLimit;
	}

	public Integer getsRAId() {
		return sRAId;
	}

	public void setsRAId(Integer sRAId) {
		this.sRAId = sRAId;
	}

	public String getHomeBannerImg() {
		return homeBannerImg;
	}

	public void setHomeBannerImg(String homeBannerImg) {
		this.homeBannerImg = homeBannerImg;
	}

	public String getServiceQq() {
		return serviceQq;
	}

	public void setServiceQq(String serviceQq) {
		this.serviceQq = serviceQq;

		if (StringUtils.isBlank(serviceQq)) {
			this.serviceQqs = null;
		} else {
			this.serviceQqs = StringUtils.split(serviceQq, SPLITTER);
		}
	}

	public String getServiceTel() {
		return serviceTel;
	}

	public void setServiceTel(String serviceTel) {
		this.serviceTel = serviceTel;

		if (StringUtils.isBlank(serviceTel)) {
			this.serviceTels = null;
		} else {
			this.serviceTels = StringUtils.split(serviceTel, SPLITTER);
		}
	}

	public Integer getDeliverProvince() {
		return deliverProvince;
	}

	public void setDeliverProvince(Integer deliverProvince) {
		this.deliverProvince = deliverProvince;
	}

	public Integer getDeliverCity() {
		return deliverCity;
	}

	public void setDeliverCity(Integer deliverCity) {
		this.deliverCity = deliverCity;
	}

	public String getLogisticsCompIds() {
		return logisticsCompIds;
	}

	public void setLogisticsCompIds(String logisticsCompIds) {
		this.logisticsCompIds = logisticsCompIds;

		if (StringUtils.isBlank(logisticsCompIds)) {
			this.logisticsCompId = null;
		} else {
			this.logisticsCompId = StringUtils
					.split(logisticsCompIds, SPLITTER);
		}
	}

	public BigDecimal getLowestPrice() {
		return LowestPrice;
	}

	public void setLowestPrice(BigDecimal lowestPrice) {
		LowestPrice = lowestPrice;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5266608886537929458L;

	private String[] serviceQqs;
	private String[] serviceTels;
	private String[] logisticsCompId;

	public String[] getServiceQqs() {
		return serviceQqs;
	}

	public void setServiceQqs(String[] serviceQqs) {
		this.serviceQqs = serviceQqs;

		if (ArrayUtils.isEmpty(serviceQqs)) {
			this.serviceQq = null;
		} else {
			this.serviceQq = StringUtils.join(serviceQqs, SPLITTER);
		}
	}

	public String[] getServiceTels() {
		return serviceTels;
	}

	public void setServiceTels(String[] serviceTels) {
		this.serviceTels = serviceTels;

		if (ArrayUtils.isEmpty(serviceTels)) {
			this.serviceTel = null;
		} else {
			this.serviceTel = StringUtils.join(serviceTels, SPLITTER);
		}
	}

	public String[] getLogisticsCompId() {
		return logisticsCompId;
	}

	public void setLogisticsCompId(String[] logisticsCompId) {
		this.logisticsCompId = logisticsCompId;
		if (ArrayUtils.isEmpty(logisticsCompId)) {
			this.logisticsCompIds = null;
		} else {
			this.logisticsCompIds = StringUtils.join(logisticsCompId, SPLITTER);
		}
	}

	private String brandName; // 品牌名称
	private String coName;

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}