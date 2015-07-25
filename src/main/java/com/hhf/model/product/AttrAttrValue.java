package com.hhf.model.product;

import java.io.Serializable;

public class AttrAttrValue implements Serializable {
	private static final long serialVersionUID = 4644425131428917414L;
	
    private Long aAvId;

    private Long attrId;

    private Long attrValueId;

    private Integer displayOrder;

    private Long pAAvId;

    private Boolean hasSub;

	public Long getaAvId() {
		return aAvId;
	}

	public void setaAvId(Long aAvId) {
		this.aAvId = aAvId;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public Long getAttrValueId() {
		return attrValueId;
	}

	public void setAttrValueId(Long attrValueId) {
		this.attrValueId = attrValueId;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Long getpAAvId() {
		return pAAvId;
	}

	public void setpAAvId(Long pAAvId) {
		this.pAAvId = pAAvId;
	}

	public Boolean getHasSub() {
		return hasSub;
	}

	public void setHasSub(Boolean hasSub) {
		this.hasSub = hasSub;
	}

}