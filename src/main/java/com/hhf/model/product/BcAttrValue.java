package com.hhf.model.product;

import java.io.Serializable;

public class BcAttrValue implements Serializable {
	private static final long serialVersionUID = 4460956852700566435L;

	private Long bcAvId;

    private Long bcAttrId;

    private Long attrValueId;

    private Long pBcAvId;

    private Boolean isSubAttr;

    private String icon;

    private Integer displayOrder;

    private String status;

    private Integer bcId;

    private Boolean isFilter;

    private Boolean isMobileDisplay;

	public Long getBcAvId() {
		return bcAvId;
	}

	public void setBcAvId(Long bcAvId) {
		this.bcAvId = bcAvId;
	}

	public Long getBcAttrId() {
		return bcAttrId;
	}

	public void setBcAttrId(Long bcAttrId) {
		this.bcAttrId = bcAttrId;
	}

	public Long getAttrValueId() {
		return attrValueId;
	}

	public void setAttrValueId(Long attrValueId) {
		this.attrValueId = attrValueId;
	}

	public Long getpBcAvId() {
		return pBcAvId;
	}

	public void setpBcAvId(Long pBcAvId) {
		this.pBcAvId = pBcAvId;
	}

	public Boolean getIsSubAttr() {
		return isSubAttr;
	}

	public void setIsSubAttr(Boolean isSubAttr) {
		this.isSubAttr = isSubAttr;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
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

}