package com.hhf.model.seller;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.hhf.common.util.DateUtils;

public class SellerApply implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6480141776131126491L;
	private Integer appId;

	private Integer sellerLoginId;

	private String applyType;

	private Date applyDate;

	private String applyIp;

	private String status;

	private String auditStatus;

	private Integer auditId;

	private String coName;

	private String coBln;

	private Date btStartDate;

	private Date btEndDate;

	private String btGeo;

	private String registerCapital;

	private String bizScope;

	private String lpName;

	private String lpMobile;

	private String contactAddr;

	private String fax;

	private String coSite;

	private String coBrand;

	private String btImg;

	private String orgCodeImg;

	private String taxImg;

	private String idAImg;

	private String idBImg;

	private String orgCode;

	private String taxNo;

	private String taxType;

	private String taxRatio;

	private String bankAcctName;

	private String bankAcctNo;

	private String branchName;

	private String branchNo;

	private String contractType;

	private String contractImg;

	private String bizManName;

	private String bizManPosition;

	private String bizManIdNo;

	private String bizManMobile;

	private String bizManQq;

	private String bizManEmail;

	private String remark;

	private String bankLicenseImg;

	private String tel;

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getSellerLoginId() {
		return sellerLoginId;
	}

	public void setSellerLoginId(Integer sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyIp() {
		return applyIp;
	}

	public void setApplyIp(String applyIp) {
		this.applyIp = applyIp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCoBln() {
		return coBln;
	}

	public void setCoBln(String coBln) {
		this.coBln = coBln;
	}

	public Date getBtStartDate() {
		return btStartDate;
	}

	public void setBtStartDate(Date btStartDate) {
		this.btStartDate = btStartDate;
		this.sBtStartDate = DateUtils.formatDate(btStartDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public Date getBtEndDate() {
		return btEndDate;
	}

	public void setBtEndDate(Date btEndDate) {
		this.btEndDate = btEndDate;
		this.sBtEndDate = DateUtils.formatDate(btEndDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public String getBtGeo() {
		return btGeo;
	}

	public void setBtGeo(String btGeo) {
		this.btGeo = btGeo;
	}

	public String getRegisterCapital() {
		return registerCapital;
	}

	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}

	public String getBizScope() {
		return bizScope;
	}

	public void setBizScope(String bizScope) {
		this.bizScope = bizScope;
	}

	public String getLpName() {
		return lpName;
	}

	public void setLpName(String lpName) {
		this.lpName = lpName;
	}

	public String getLpMobile() {
		return lpMobile;
	}

	public void setLpMobile(String lpMobile) {
		this.lpMobile = lpMobile;
	}

	public String getContactAddr() {
		return contactAddr;
	}

	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;

		if (fax == null) {
			faxArea = faxExt = faxNo = null;
		} else {
			String[] faxs = StringUtils.split(fax, SPLITTER);

			if (faxs.length >= 1)
				faxArea = faxs[0];
			if (faxs.length >= 2)
				faxNo = faxs[1];
			if (faxs.length >= 3)
				faxExt = faxs[2];
		}
	}

	public String getCoSite() {
		return coSite;
	}

	public void setCoSite(String coSite) {
		this.coSite = coSite;
	}

	public String getCoBrand() {
		return coBrand;
	}

	public void setCoBrand(String coBrand) {
		this.coBrand = coBrand;
	}

	public String getBtImg() {
		return btImg;
	}

	public void setBtImg(String btImg) {
		this.btImg = btImg;
	}

	public String getOrgCodeImg() {
		return orgCodeImg;
	}

	public void setOrgCodeImg(String orgCodeImg) {
		this.orgCodeImg = orgCodeImg;
	}

	public String getTaxImg() {
		return taxImg;
	}

	public void setTaxImg(String taxImg) {
		this.taxImg = taxImg;
	}

	public String getIdAImg() {
		return idAImg;
	}

	public void setIdAImg(String idAImg) {
		this.idAImg = idAImg;
	}

	public String getIdBImg() {
		return idBImg;
	}

	public void setIdBImg(String idBImg) {
		this.idBImg = idBImg;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTaxRatio() {
		return taxRatio;
	}

	public void setTaxRatio(String taxRatio) {
		this.taxRatio = taxRatio;
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

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractImg() {
		return contractImg;
	}

	public void setContractImg(String contractImg) {
		this.contractImg = contractImg;
	}

	public String getBizManName() {
		return bizManName;
	}

	public void setBizManName(String bizManName) {
		this.bizManName = bizManName;
	}

	public String getBizManPosition() {
		return bizManPosition;
	}

	public void setBizManPosition(String bizManPosition) {
		this.bizManPosition = bizManPosition;
	}

	public String getBizManIdNo() {
		return bizManIdNo;
	}

	public void setBizManIdNo(String bizManIdNo) {
		this.bizManIdNo = bizManIdNo;
	}

	public String getBizManMobile() {
		return bizManMobile;
	}

	public void setBizManMobile(String bizManMobile) {
		this.bizManMobile = bizManMobile;
	}

	public String getBizManQq() {
		return bizManQq;
	}

	public void setBizManQq(String bizManQq) {
		this.bizManQq = bizManQq;
	}

	public String getBizManEmail() {
		return bizManEmail;
	}

	public void setBizManEmail(String bizManEmail) {
		this.bizManEmail = bizManEmail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBankLicenseImg() {
		return bankLicenseImg;
	}

	public void setBankLicenseImg(String bankLicenseImg) {
		this.bankLicenseImg = bankLicenseImg;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
		if (tel == null) {
			telArea = telExt = telNo = null;
		} else {
			String[] tels = StringUtils.split(tel, SPLITTER);

			if (tels.length >= 1)
				telArea = tels[0];
			if (tels.length >= 2)
				telNo = tels[1];
			if (tels.length >= 3)
				telExt = tels[2];
		}
	}

	// 扩展
	private static final String SPLITTER = "-";
	private String sBtStartDate, sBtEndDate;
	private String telArea, telExt, telNo;
	private String faxArea, faxExt, faxNo;

	public String getsBtStartDate() {
		return sBtStartDate;
	}

	public void setsBtStartDate(String sBtStartDate) {
		this.sBtStartDate = sBtStartDate;
		this.btStartDate = DateUtils.parseDate(sBtStartDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public String getsBtEndDate() {
		return sBtEndDate;
	}

	public void setsBtEndDate(String sBtEndDate) {
		this.sBtEndDate = sBtEndDate;
		this.btEndDate = DateUtils.parseDate(sBtEndDate,
				DateUtils.PART_TIME_PATTERN);
	}

	public String getTelArea() {
		return telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
		this.tel = (telArea == null ? "" : telArea) + SPLITTER
				+ (telNo == null ? "" : telNo) + SPLITTER
				+ (telExt == null ? "" : telExt);
	}

	public String getTelExt() {
		return telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
		this.tel = (telArea == null ? "" : telArea) + SPLITTER
				+ (telNo == null ? "" : telNo) + SPLITTER
				+ (telExt == null ? "" : telExt);
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
		this.tel = (telArea == null ? "" : telArea) + SPLITTER
				+ (telNo == null ? "" : telNo) + SPLITTER
				+ (telExt == null ? "" : telExt);
	}

	public String getFaxArea() {
		return faxArea;
	}

	public void setFaxArea(String faxArea) {
		this.faxArea = faxArea;
		this.fax = (faxArea == null ? "" : faxArea) + SPLITTER
				+ (faxNo == null ? "" : faxNo) + SPLITTER
				+ (faxExt == null ? "" : faxExt);
	}

	public String getFaxExt() {
		return faxExt;
	}

	public void setFaxExt(String faxExt) {
		this.faxExt = faxExt;
		this.fax = (faxArea == null ? "" : faxArea) + SPLITTER
				+ (faxNo == null ? "" : faxNo) + SPLITTER
				+ (faxExt == null ? "" : faxExt);
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
		this.fax = (faxArea == null ? "" : faxArea) + SPLITTER
				+ (faxNo == null ? "" : faxNo) + SPLITTER
				+ (faxExt == null ? "" : faxExt);
	}

	// 扩展
	private String loginName;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}