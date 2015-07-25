package com.hhf.constants;

public interface SystemConstants {
	public static final String ENCODING = "utf-8";
	//网站秘钥
	public static final String WEB_KEY = "hhf_2015";
	//cookie中的用户
	public static final String COOKIE_U = "_u";
	//cookie中的_um
	public static final String COOKIE_UM = "_um";
	//cookie中的_ut
	public static final String COOKIE_UT = "_ut";
	//_u有效期
	public static final int COOKIE_U_PERIOD = 7*24*60*60;
	//_um有效期
	public static final int COOKIE_UT_PERIOD = 2*60*60;
	//延长有效期的时间段
	public static final int WARN_TIME_DIFF = 15;
	//注册url
	public static final String USER_REGISTER_URL = "http://yiwang.com/index.php?r=user/login";
	//用户登陆有效期
	public static final int USER_LOGIN_TIME = 2*60*60;
	
	public static final String USER_DEFAULT_PWD = "111111";
	
	/**
	 * 缓存前缀
	 */
	public static final String CACHE_PREFIX = "hhf_";
	
	/**
	 *  数据状态有效
	 */
	public static final String DB_STATUS_VALID = "1";
	
	/**
	 * 数据状态无效
	 */
	public static final String DB_STATUS_INVALID = "0";
	
	/**
	 *  数据状态删除
	 */
	public static final String DB_STATUS_DELETE = "2";
	
	// 图片上传路径
	public static final String IMG_UPLOAD_URL = "http://upload.yiwangimg.com/rc/upload";
	
}
	
	
