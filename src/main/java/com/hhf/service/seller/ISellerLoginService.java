/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.service.seller;

import java.io.Serializable;
import java.util.Date;

import com.hhf.model.seller.Seller;
import com.hhf.model.seller.SellerLogin;

/**
 * 卖家登录服务接口
 * 
 * @author xuzunyuan
 * @date 2013年12月28日
 */
public interface ISellerLoginService {
	// 根据账号取登录账号
	public SellerLogin getLoginByLoginName(String loginName);

	// 根据ID取登录账号
	public SellerLogin getLoginById(int loginId);

	// 根据卖家ID取登录账号
	public SellerLogin getLoginBySellerId(int sellerId);

	/**
	 * 创建新账号
	 * 
	 * @param login
	 * @return 新账号的ID，失败返回0或负数（0:账号重复）
	 */
	public int newLogin(SellerLogin login);

	/**
	 * 冻结账号
	 * 
	 * @param loginId
	 * @param staffName
	 *            操作员姓名
	 * @return 失败返回0
	 */
	public int freezeLogin(int loginId, String staffName);

	/**
	 * 解冻账号
	 * 
	 * @param loginId
	 * @param staffName
	 *            操作员姓名
	 * @return 失败返回0
	 */
	public int unfreezeLogin(int loginId, String staffName);

	/**
	 * 判断账号是否已存在
	 * 
	 * @param loginName
	 * @return
	 */
	public boolean existLoginName(String loginName);

	/**
	 * 判断昵称是否已存在
	 * 
	 * @param nickname
	 * @return
	 */
	public boolean existNickname(String nickname);

	/**
	 * 账号、密码验证
	 * 
	 * @param loginName
	 * @param password
	 * @param ip
	 * @return <field>returnStatus</field> 1：通过验证； 0：账户不存在 ; -1：密码不正确 -2 : 账户冻结
	 *         处于效率方面的考虑，同时返回通过<field>sellerLogin</field>返回登录信息
	 */
	public SellerLoginValidate loginByLoginName(String loginName,
			String password, String ip);

	/**
	 * 记录登录信息
	 * 
	 * @param loginId
	 * @param date
	 * @param ip
	 */
	public void registerLoginInfo(int loginId, Date date, String ip);

	/**
	 * 修改密码
	 * 
	 * @param loginId
	 * @param newPassword
	 *            新密码
	 * @param oldPassword
	 *            旧密码（空值表示不作校验）
	 * @return 0和负数表示失败
	 */
	public int changePassword(int loginId, String newPassword,
			String oldPassword);

	public int changePassword(int loginId, String newPassword);

	public static class SellerLoginValidate implements Serializable {
		public static final int PASSED = 1; // 通过
		public static final int NOT_EXIST = 0; // 账号不存在
		public static final int INCORRECT_PASSWORD = -1; // 密码不正确
		public static final int FREEZED = -2; // 冻结

		/**
		 * 
		 */
		private static final long serialVersionUID = 5513716822016457467L;

		private int validateStatus;
		private SellerLogin sellerLogin;
		private Seller seller;

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}

		public int getValidateStatus() {
			return validateStatus;
		}

		public void setValidateStatus(int validateStatus) {
			this.validateStatus = validateStatus;
		}

		public SellerLogin getSellerLogin() {
			return sellerLogin;
		}

		public void setSellerLogin(SellerLogin sellerLogin) {
			this.sellerLogin = sellerLogin;
		}
	}

}
