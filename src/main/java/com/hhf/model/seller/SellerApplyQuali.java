package com.hhf.model.seller;

import java.io.Serializable;

public class SellerApplyQuali implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3701171069901658157L;

	private Integer applyQualiId;

	private Integer applyId;

	private String qualiName;

	private String quailUrl;

	private String expireDate;

	private Integer ccId;

	private String ccName;

	private String auditType;

	public Integer getApplyQualiId() {
		return applyQualiId;
	}

	public void setApplyQualiId(Integer applyQualiId) {
		this.applyQualiId = applyQualiId;
	}

	public Integer getApplyId() {
		return applyId;
	}

	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}

	public String getQualiName() {
		return qualiName;
	}

	public void setQualiName(String qualiName) {
		this.qualiName = qualiName;
	}

	public String getQuailUrl() {
		return quailUrl;
	}

	public void setQuailUrl(String quailUrl) {
		this.quailUrl = quailUrl;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public Integer getCcId() {
		return ccId;
	}

	public void setCcId(Integer ccId) {
		this.ccId = ccId;
	}

	public String getCcName() {
		return ccName;
	}

	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
}