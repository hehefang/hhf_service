package com.hhf.constants.user;

public interface UserConstants {
	/******************geo常量***************************/
	/**
	 * 缓存中省份的key
	 */
	public static final String GEO_PROVINCE = "provinces";
	
	/**
	 * 省份在geo表中的level
	 */
	public static final String GEO_LEVEL_PROVINCE = "1";
	
	/**
	 * 缓存中地址叶子节点的前缀
	 */
	public static final String GEO_BY_FID = "geoFid_";
	
	/**
	 * 缓存中地址前缀
	 */
	public static final String GEO = "geo_";
	
	/*********************收货地址常量*******************************/
	/**
	 * 收货地址有效
	 */
	public static final String ADDRESS_STATUS_VALID = "1";
	/**
	 * 收货地址无效
	 */
	public static final String ADDRESS_STATUS_INVALID = "0";
	/**
	 * 默认收货地址
	 */
	public static final String ADDRESS_IS_DEFAULT = "1";
	/**
	 * 非默认收货地址
	 */
	public static final String ADDRESS_IS_NOT_DEFAULT = "0";
	/*********************用户注册相关*******************************/
	/**
	 * 验证码前缀
	 */
	public static final String VALID_CODE = "validCode_";
	/**
	 * 验证码前缀
	 */
	public static final String FIND_PWD_U = "findPwdU_";
}
