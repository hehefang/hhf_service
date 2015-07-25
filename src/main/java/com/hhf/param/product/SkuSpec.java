package com.hhf.param.product;

import java.io.Serializable;
import java.util.Map;

public class SkuSpec implements Serializable{

	private static final long serialVersionUID = 7471796343700715593L;
	
	private String specId;

    private String specName;
    
    private Map<String,SkuSpecVal> specVals;

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

	public Map<String, SkuSpecVal> getSpecVals() {
		return specVals;
	}

	public void setSpecVals(Map<String, SkuSpecVal> specVals) {
		this.specVals = specVals;
	}

}
