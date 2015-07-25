package com.hhf.model.seller;

import java.io.Serializable;
import java.util.Date;

public class SellerLogin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5221849954719721452L;

	private Integer sellerLoginId;

	private String loginName;

	private String loginPwd;

	private String pwdKey;

	private String mobile;

	private String nickname;

	private String status;

	private String type;

	private Date regDate;

	private String regIp;

	private Integer sellerId;

	private Integer sellerApplyId;

	private Date lastLoginDate;

	private String lastLoginIp;

	private Date freezeDate;

	private String freezeByName;

	private Date unfreezeDate;

	private String unfreezeByName;

	public Integer getSellerLoginId() {
		return sellerLoginId;
	}

	public void setSellerLoginId(Integer sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getPwdKey() {
		return pwdKey;
	}

	public void setPwdKey(String pwdKey) {
		this.pwdKey = pwdKey;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getSellerApplyId() {
		return sellerApplyId;
	}

	public void setSellerApplyId(Integer sellerApplyId) {
		this.sellerApplyId = sellerApplyId;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getFreezeDate() {
		return freezeDate;
	}

	public void setFreezeDate(Date freezeDate) {
		this.freezeDate = freezeDate;
	}

	public String getFreezeByName() {
		return freezeByName;
	}

	public void setFreezeByName(String freezeByName) {
		this.freezeByName = freezeByName;
	}

	public Date getUnfreezeDate() {
		return unfreezeDate;
	}

	public void setUnfreezeDate(Date unfreezeDate) {
		this.unfreezeDate = unfreezeDate;
	}

	public String getUnfreezeByName() {
		return unfreezeByName;
	}

	public void setUnfreezeByName(String unfreezeByName) {
		this.unfreezeByName = unfreezeByName;
	}
}