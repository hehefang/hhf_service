package com.hhf.param.product;

import java.io.Serializable;

public class SkuSpecVal implements Serializable {

	private static final long serialVersionUID = -5657436700073574863L;

	private String specId;

	private String specName;

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

}
