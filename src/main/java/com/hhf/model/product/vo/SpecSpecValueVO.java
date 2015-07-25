package com.hhf.model.product.vo;

import com.hhf.model.product.SpecSpecValue;


public class SpecSpecValueVO extends SpecSpecValue {
	protected static final long serialVersionUID = -7492627339945376286L;

	private String specValueName;
	
	private String pinyin;

	private String imgUrl;

	public String getSpecValueName() {
		return specValueName;
	}

	public void setSpecValueName(String specValueName) {
		this.specValueName = specValueName;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
