package com.hhf.service.user;

import java.io.Serializable;

import com.hhf.common.mybatis.Page;
import com.hhf.model.user.User;
import com.hhf.model.user.UserExt;

public interface IUserService {
	/**
	 * 验证用户名是否唯一
	 * 
	 * @param userName
	 *            用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueUserName(String userName);

	/**
	 * 验证手机号是否唯一
	 * 
	 * @param userName
	 *            用户名
	 * @return true：唯一；false：不唯一
	 */
	public boolean uniqueMobile(String mobile);

	/**
	 * 根据用户id获取用户
	 * 
	 * @param userId
	 * @return
	 */
	public User getUserById(Long userId);

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @return
	 */
	public Long register(User user);

	/**
	 * 根据用户名查询用户
	 * 
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName);

	/**
	 * 根据手机号查询用户
	 * 
	 * @param userName
	 * @return
	 */
	public User getUserByMobile(String mobile);

	/**
	 * 更新用户
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

	/**
	 * 更新用户密码
	 * 
	 * @param user
	 * @return
	 */
	public int chgPwd(String mobile, String pwd);

	public int chgPwdById(long userId, String pwd);

	/**
	 * 通过id获取用户所有信息
	 * 
	 * @param userId
	 * @return
	 */
	public User getUserInfoById(long userId);

	/**
	 * 更新用户扩展信息
	 * 
	 * @param userExt
	 * @return
	 */
	public int updateUserExt(UserExt userExt);

	/**
	 * 分页查询用户
	 * 
	 * @param cond
	 * @param page
	 * @return
	 */
	public Page<User> queryUserByPage(UserQueryCondition cond, int... page);

	// 查询用户条件
	public static final class UserQueryCondition implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5199326509810216774L;

		private String userName;
		private String nickname;
		private String mobile;
		private String regDateStart;
		private String regDateEnd;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getRegDateStart() {
			return regDateStart;
		}

		public void setRegDateStart(String regDateStart) {
			this.regDateStart = regDateStart;
		}

		public String getRegDateEnd() {
			return regDateEnd;
		}

		public void setRegDateEnd(String regDateEnd) {
			this.regDateEnd = regDateEnd;
		}
	}
}
