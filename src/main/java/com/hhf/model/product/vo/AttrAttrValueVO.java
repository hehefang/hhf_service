package com.hhf.model.product.vo;

import java.util.ArrayList;
import java.util.List;

import com.hhf.model.product.AttrAttrValue;


public class AttrAttrValueVO extends AttrAttrValue {
	
	private static final long serialVersionUID = -1379673407881721158L;
	
	private String attrValueName;
	private String pinyin;
	private List<AttrAttrValueVO> subList = new ArrayList<>(0);
	
	public List<AttrAttrValueVO> getSubList() {
		return subList;
	}

	public void setSubList(List<AttrAttrValueVO> subList) {
		this.subList = subList;
	}

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
	
	
}
