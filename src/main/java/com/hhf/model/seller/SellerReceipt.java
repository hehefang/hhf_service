package com.hhf.model.seller;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class SellerReceipt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3269396778853128723L;

	private Integer receiptId; //发票ID
	
	private Integer sellerId;	//卖家ID

	private String rName;		//收件人姓名

	private String rMobile;		//收件人电话

	private String rAddress;	//收件地址

	private String taxImg;		//税务等级证电子版

	private String taxNo;		//公司税号

	private String registerAddr;//公司注册地址

	private String registerTel;	//公司注册电话
	
	private String bankAcctName;//开户行

	private String bankAcctNo;	//银行账号

	private String taxType;		//发票类型

	private String coName;		//单位全称

	private String qualiUrl;	//纳税人资质证明电子版
	
	// 扩展
	private static final String SPLITTER = "-";
	private String telArea, telExt, telNo;
	

	public Integer getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrMobile() {
		return rMobile;
	}

	public void setrMobile(String rMobile) {
		this.rMobile = rMobile;
	}

	public String getrAddress() {
		return rAddress;
	}

	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}

	public String getTaxImg() {
		return taxImg;
	}

	public void setTaxImg(String taxImg) {
		this.taxImg = taxImg;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getRegisterAddr() {
		return registerAddr;
	}

	public void setRegisterAddr(String registerAddr) {
		this.registerAddr = registerAddr;
	}

	public String getRegisterTel() {
		return registerTel;
	}

	public void setRegisterTel(String registerTel) {
		this.registerTel = registerTel;
		if (registerTel == null) {
			telArea = telExt = telNo = null;
		} else {
			String[] tels = StringUtils.split(registerTel, SPLITTER);

			if (tels.length >= 1)
				telArea = tels[0];
			if (tels.length >= 2)
				telNo = tels[1];
			if (tels.length >= 3)
				telExt = tels[2];
		}
	}

	public String getBankAcctName() {
		return bankAcctName;
	}

	public void setBankAcctName(String bankAcctName) {
		this.bankAcctName = bankAcctName;
	}

	public String getBankAcctNo() {
		return bankAcctNo;
	}

	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getQualiUrl() {
		return qualiUrl;
	}

	public void setQualiUrl(String qualiUrl) {
		this.qualiUrl = qualiUrl;
	}

	public String getTelArea() {
		return telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
	}

	public String getTelExt() {
		return telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
}