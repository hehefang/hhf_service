package com.hhf.constants.product;

import com.hhf.constants.SystemConstants;

public class ProductCommentConstans {
	
	// 商品评论缓存 KEY
	public static final String PROD_COMMENT = SystemConstants.CACHE_PREFIX +"prod_comment";
	
	// 评论类型
	public static final String PROD_COMMENT_TYPE_USER = "1";	// 买家评论
	public static final String PROD_COMMENT_TYPE_SECRET = "2";	// 匿名评价
	public static final String PROD_COMMENT_TYPE_SYSTEM = "4";	// 系统评论
	
	// 状态
	public static final String PROD_COMMENT_STATUS_NORMAL = "1"; // 正常
	public static final String PROD_COMMENT_STATUS_DELETE = "2"; // 删除

	//是否有含有某值
	public static final String PRODUCT_COMMETN_IS_FALSE = "0";// 否 
	public static final String PRODUCT_COMMETN_IS_TRUE = "1"; // 是

	// 评分等级
	public static final int PRODUCT_GOOD_GRADE = 5;	 // 好评
	public static final int PRODUCT_COMMON_GRADE = 3;//中评
	public static final int PRODUCT_BAD_GRADE = 1;	 //差评
	
}
