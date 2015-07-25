package com.hhf.model.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2942237996139751825L;

	private Long userId;

	private String userName;

	private String pwd;

	private String pwdKey;

	private String nickname;

	private Short type;

	private Short status;

	private Short levelId;

	private String levelName;

	private String mobile;

	private String isMobileCheck;

	private String email;

	private String isEmailCheck;

	private String idCode;

	private String isBindId;

	private Date regDate;

	private String regFrom;

	private String marketFrom;

	private String regIp;

	private Date lastLoginDate;

	private String lastLoginIp;

	private String freezeByName;

	private Long freezeById;

	private Date freezeByDate;
	
	private UserExt userExt;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public String getPwdKey() {
		return pwdKey;
	}

	public void setPwdKey(String pwdKey) {
		this.pwdKey = pwdKey == null ? null : pwdKey.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getLevelId() {
		return levelId;
	}

	public void setLevelId(Short levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName == null ? null : levelName.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getIsMobileCheck() {
		return isMobileCheck;
	}

	public void setIsMobileCheck(String isMobileCheck) {
		this.isMobileCheck = isMobileCheck == null ? null : isMobileCheck
				.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getIsEmailCheck() {
		return isEmailCheck;
	}

	public void setIsEmailCheck(String isEmailCheck) {
		this.isEmailCheck = isEmailCheck == null ? null : isEmailCheck.trim();
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode == null ? null : idCode.trim();
	}

	public String getIsBindId() {
		return isBindId;
	}

	public void setIsBindId(String isBindId) {
		this.isBindId = isBindId == null ? null : isBindId.trim();
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegFrom() {
		return regFrom;
	}

	public void setRegFrom(String regFrom) {
		this.regFrom = regFrom == null ? null : regFrom.trim();
	}

	public String getMarketFrom() {
		return marketFrom;
	}

	public void setMarketFrom(String marketFrom) {
		this.marketFrom = marketFrom == null ? null : marketFrom.trim();
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp == null ? null : regIp.trim();
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
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}

	public String getFreezeByName() {
		return freezeByName;
	}

	public void setFreezeByName(String freezeByName) {
		this.freezeByName = freezeByName == null ? null : freezeByName.trim();
	}

	public Long getFreezeById() {
		return freezeById;
	}

	public void setFreezeById(Long freezeById) {
		this.freezeById = freezeById;
	}

	public Date getFreezeByDate() {
		return freezeByDate;
	}

	public void setFreezeByDate(Date freezeByDate) {
		this.freezeByDate = freezeByDate;
	}

	public UserExt getUserExt() {
		return userExt;
	}

	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}
}