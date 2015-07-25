package com.hhf.model.seller;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4422000324471334304L;

	private Integer sellerId;

	private Integer sellerLoginId;

	private String sellerType;

	private Date createDate;

	private String status;

	private String coName;
	
	private String payeeName;

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

	private String branchAddress;
	
	private String contractType;

	private String contractImg;

	private String bizManName;

	private String bizManPosition;

	private String bizManIdNo;

	private String bizManMobile;

	private String bizManQq;

	private String bizManEmail;

	private String isPaidDeposit;

	private Date depositDate;

	private String depositAuditor;

	private Date depositAuditDate;

	private String bankLicenseImg;

	private String tel;

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getSellerLoginId() {
		return sellerLoginId;
	}

	public void setSellerLoginId(Integer sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSellerType() {
		return sellerType;
	}

	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	}

	public Date getBtEndDate() {
		return btEndDate;
	}

	public void setBtEndDate(Date btEndDate) {
		this.btEndDate = btEndDate;
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

	public String getIsPaidDeposit() {
		return isPaidDeposit;
	}

	public void setIsPaidDeposit(String isPaidDeposit) {
		this.isPaidDeposit = isPaidDeposit;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public String getDepositAuditor() {
		return depositAuditor;
	}

	public void setDepositAuditor(String depositAuditor) {
		this.depositAuditor = depositAuditor;
	}

	public Date getDepositAuditDate() {
		return depositAuditDate;
	}

	public void setDepositAuditDate(Date depositAuditDate) {
		this.depositAuditDate = depositAuditDate;
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
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
}