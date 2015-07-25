package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class Brand implements Serializable {
	private static final long serialVersionUID = -4327474639191784199L;

	private Long brandId;

	private String brandName;

	private String brandEname;

	private String logoUrl;

	private String brandAbbr;

	private String brandStory;

	private Date createDate;

	private String status;

	private String createByName;

	private String pinyin;

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
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

	public String getBrandStory() {
		return brandStory;
	}

	public void setBrandStory(String brandStory) {
		this.brandStory = brandStory;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateByName() {
		return createByName;
	}

	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

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
}