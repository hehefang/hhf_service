package com.hhf.model.product;

import java.io.Serializable;

public class BcAttribute implements Serializable {
	private static final long serialVersionUID = -719921388395222524L;

	private Long bcAttrId;

    private Integer bcId;

    private Long attrId;

    private Integer displayOrder;

    private String displayMode;
    
    private Boolean isRequire;

    private String status;

    private Boolean isFilter;

	public Long getBcAttrId() {
		return bcAttrId;
	}

	public void setBcAttrId(Long bcAttrId) {
		this.bcAttrId = bcAttrId;
	}

	public Integer getBcId() {
		return bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getDisplayMode() {
		return displayMode;
	}

	public void setDisplayMode(String displayMode) {
		this.displayMode = displayMode;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Boolean getIsRequire() {
		return isRequire;
	}

	public void setIsRequire(Boolean isRequire) {
		this.isRequire = isRequire;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsFilter() {
		return isFilter;
	}

	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

}