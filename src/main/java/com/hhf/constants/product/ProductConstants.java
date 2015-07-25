package com.hhf.constants.product;

import com.hhf.constants.SystemConstants;

public interface ProductConstants {
	// 商品状态
	public static final String PROD_STATUS_ON = "0"; // 上架
	public static final String PROD_STATUS_DOWN = "1"; // 下架
	public static final String PROD_STATUS_REMOVE = "2"; // 删除
	public static final String PROD_STATUS_SUSPEND_SALE = "3";// 暂停销售（店铺冻结）

	// 商品审核状态
	public static final String PROD_AUDIT_STATUS_PASS = "0"; // 审核通过
	public static final String  PROD_AUDIT_STATUS_WAIT = "1"; // 待审核
	public static final String PROD_AUDIT_STATUS_NO_PASS = "2"; // 审核驳回

	// sku状态
	public static final String SKU_STATUS_NORMAL = "1";// 正常
	public static final String SKU_STATUS_DELETE = "2";// 删除

	// 商品图片状态
	public static final String PROD_IMG_STATUS_NORMAL = "1";// 正常
	public static final String PROD_IMG_STATUS_REMOVE = "2";// 删除

	// 缓存中库存id的前缀
	public static final String CACHE_PERFIX_INVENTORY = "inventory_";
	// 产品缓存
	public static final String CACHE_PERFIX_PRODUCT = "product_";

	
	/************************************* 商品相关常量 *************************************/
	
	/**
	 * 商品缓存中的KEY值
	 */
	public static final String PROD_ = SystemConstants.CACHE_PREFIX + "product_";
	
	
	/************************************* 类目相关常量 *************************************/

	/**
	 * 基本类目缓存中的KEY值
	 */
	public static final String BC = SystemConstants.CACHE_PREFIX + "bc";
	/**
	 * 基本类目缓存中的基本信息HASHKEY前缀
	 */
	public static final String BC_ = SystemConstants.CACHE_PREFIX + "bc_";
	/**
	 * 基本类目缓存中的基本信息列表HASHKEY前缀
	 */
	public static final String BC_LIST = SystemConstants.CACHE_PREFIX
			+ "bc_list_pid_";
	/**
	 * 签约类目缓存中的KEY值
	 */
	public static final String CC = SystemConstants.CACHE_PREFIX + "cc";
	/**
	 * 签约类目缓存中的基本信息HASHKEY前缀
	 */
	public static final String CC_ = SystemConstants.CACHE_PREFIX + "cc_";
	/**
	 * 签约类目缓存中的基本信息列表HASHKEY前缀
	 */
	public static final String CC_LIST = SystemConstants.CACHE_PREFIX
			+ "cc_list_pid_";
	/**
	 * 销售类目缓存中的KEY值
	 */
	public static final String SC = SystemConstants.CACHE_PREFIX + "sc";
	/**
	 * 销售类目缓存中的基本信息HASHKEY前缀
	 */
	public static final String SC_ = SystemConstants.CACHE_PREFIX + "sc_";
	/**
	 * 销售类目缓存中的基本信息列表HASHKEY前缀
	 */
	public static final String SC_LIST = SystemConstants.CACHE_PREFIX
			+ "sc_list_pid_";

	/**
	 * 基本类目和属性规格集体KEY
	 */
	public static final String BASB = SystemConstants.CACHE_PREFIX + "basb";
	/**
	 * 基本类目和相关属性规格以如下为HASHKEY前缀(后面再加上类目的id)组成
	 */
	public static final String BC_ATTR_SPEC_BRAND = SystemConstants.CACHE_PREFIX
			+ "bc_a_s_b_";
	/**
	 * 签约类目关联基本类目KEY
	 */
	public static final String CB = SystemConstants.CACHE_PREFIX + "cb";
	/**
	 * 签约类目关联基本类目HASHKEY前缀
	 */
	public static final String CB_CCID = SystemConstants.CACHE_PREFIX + "cb_";
	/**
	 * 销售类目关联基本类目KEY
	 */
	public static final String SB = SystemConstants.CACHE_PREFIX + "sb";
	/**
	 * 销售类目关联基本类目HASHKEY前缀
	 */
	public static final String SB_SCID = SystemConstants.CACHE_PREFIX + "sb_";

	/**
	 * 卖家上次选择类目缓存KEY
	 */
	public static final String BC_RECORD_ = SystemConstants.CACHE_PREFIX
			+ "bc_record_";

	public static final String BRAND = SystemConstants.CACHE_PREFIX + "br_";

	/**
	 * 一级类目PID为0
	 */
	public static final int CATE_LEVEL_FIRST_PID = 0;

	/**
	 * 一级类目
	 */
	public static final String CATE_LEVEL_FIRST = "1";
	/**
	 * 二级类目
	 */
	public static final String CATE_LEVEL_SECOND = "2";
	/**
	 * 三级类目
	 */
	public static final String CATE_LEVEL_THREE = "3";
	/**
	 * 四级类目
	 */
	public static final String CATE_LEVEL_FOUR = "4";

	/**
	 * 显示方式-下拉框
	 */
	public static final String DISPLAY_MODE_SELECT = "1";
	/**
	 * 显示方式-复选框
	 */
	public static final String DISPLAY_MODE_CHECKBOX = "2";
	/**
	 * 显示方式-单选框
	 */
	public static final String DISPLAY_MODE_RADIO = "3";
	/**
	 * 显示方式-图标
	 */
	public static final String DISPLAY_MODE_ICON = "4";

	/**
	 * 品牌未关联类目
	 */
	public static final String BRAND_UNLINK = "0";

	/**
	 * 品牌已关联类目
	 */
	public static final String BRAND_LINKED = "1";

	/************************************* 类目相关常量 *************************************/

	public static interface SellerBrand$Status {
		public static final String DELETED = "0";
		public static final String VALID = "1";
		public static final String WAIT_AUDIT = "2";
		public static final String REJECT = "3";
	}

	public static interface BrandShow$Status {
		public static final String INVALID = "0";
		public static final String ONLINE = "1"; // 进行中
		public static final String FINISHED = "2"; // 结束
		public static final String EXCEPTION = "3"; // 异常终止
		public static final String EDITING = "4"; // 编辑中
		public static final String WAIT_AUDIT = "5"; // 待审核
		public static final String AUDITING = "6"; // 审核中
		public static final String WAIT_ONLINE = "7"; // 等待上线
		public static final String REJECTED = "8"; // 驳回
	}

	public static interface BrandShowDetail$Status {
		public static final String REMOVED = "0";
		public static final String VALID = "1";
	}
}
