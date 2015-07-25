package com.hhf.model.user;

import java.io.Serializable;
import java.util.Date;

public class Geo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4891783488114375863L;

	private Integer geoId;

	private String geoName;

	private String geoLevel;

	private String type;

	private Integer pGeoId;

	private Date createDate;

	public Integer getGeoId() {
		return geoId;
	}

	public void setGeoId(Integer geoId) {
		this.geoId = geoId;
	}

	public String getGeoName() {
		return geoName;
	}

	public void setGeoName(String geoName) {
		this.geoName = geoName == null ? null : geoName.trim();
	}

	public String getGeoLevel() {
		return geoLevel;
	}

	public void setGeoLevel(String geoLevel) {
		this.geoLevel = geoLevel == null ? null : geoLevel.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public Integer getpGeoId() {
		return pGeoId;
	}

	public void setpGeoId(Integer pGeoId) {
		this.pGeoId = pGeoId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}