package com.hhf.model.product;

import java.io.Serializable;

public class SpecSpecValue implements Serializable {
	private static final long serialVersionUID = -3688341900733524724L;

	private Long sSVId;

    private Long specId;

    private Long specValueId;

	private Integer displayOrder;
	
    public Long getsSVId() {
		return sSVId;
	}

	public void setsSVId(Long sSVId) {
		this.sSVId = sSVId;
	}

	public Long getSpecId() {
		return specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public Long getSpecValueId() {
		return specValueId;
	}

	public void setSpecValueId(Long specValueId) {
		this.specValueId = specValueId;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

}