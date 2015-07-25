package com.hhf.model.product.vo;

import com.hhf.model.product.BcAttribute;


public class BcAttributeVO extends BcAttribute {
	private static final long serialVersionUID = 1327810901529966407L;
	
	private String attrName;

	private String pinyin;
	
	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	
}
