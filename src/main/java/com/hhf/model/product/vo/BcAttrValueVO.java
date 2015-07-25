package com.hhf.model.product.vo;

import java.util.ArrayList;
import java.util.List;

import com.hhf.model.product.BcAttrValue;


public class BcAttrValueVO extends BcAttrValue {
	
	private static final long serialVersionUID = 3917967656785093429L;
	private String attrValueName;

	private String pinyin;
	
	private List<BcAttrValueVO> subList = new ArrayList<>(0);
	
	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getAttrValueName() {
		return attrValueName;
	}

	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

	public List<BcAttrValueVO> getSubList() {
		return subList;
	}

	public void setSubList(List<BcAttrValueVO> subList) {
		this.subList = subList;
	}
	
	
}
