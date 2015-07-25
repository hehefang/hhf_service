package com.hhf.model.product;

import java.io.Serializable;

public class BcSpecValue implements Serializable {
	private static final long serialVersionUID = 8376251680755359452L;

	private Long bcSvId;

    private Long bcSpecId;

    private Long specValueId;

    private String specValueName;

    private String imgUrl;

    private Integer displayOrder;

    private String status;

    private Integer bcId;

    private Boolean isFilter;

    private Boolean isMobileDisplay;

    private Integer mDisplayPosition;

	public Long getBcSvId() {
		return bcSvId;
	}

	public void setBcSvId(Long bcSvId) {
		this.bcSvId = bcSvId;
	}

	public Long getBcSpecId() {
		return bcSpecId;
	}

	public void setBcSpecId(Long bcSpecId) {
		this.bcSpecId = bcSpecId;
	}

	public Long getSpecValueId() {
		return specValueId;
	}

	public void setSpecValueId(Long specValueId) {
		this.specValueId = specValueId;
	}

	public String getSpecValueName() {
		return specValueName;
	}

	public void setSpecValueName(String specValueName) {
		this.specValueName = specValueName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBcId() {
		return bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}

	public Boolean getIsFilter() {
		return isFilter;
	}

	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

	public Boolean getIsMobileDisplay() {
		return isMobileDisplay;
	}

	public void setIsMobileDisplay(Boolean isMobileDisplay) {
		this.isMobileDisplay = isMobileDisplay;
	}

	public Integer getmDisplayPosition() {
		return mDisplayPosition;
	}

	public void setmDisplayPosition(Integer mDisplayPosition) {
		this.mDisplayPosition = mDisplayPosition;
	}
    
}