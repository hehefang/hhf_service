package com.hhf.constants.order;

public interface OrderConstants {
/*************************************购物车常量*************************************/
	/**
	 * 购物车商品正常
	 */
	public static final long CARTITEM_SUCCESS = 0;
	/**
	 * 购物车商品专场明细为空
	 */
	public static final long CARTITEM_BS_DETAIL_IS_NULL = -1;
	/**
	 * 购物商品专场明细异常
	 */
	public static final long CARTITEM_BS_DETAIL_STATUS_UNNORMAL = -2;
	/**
	 * 购物车商品专场明细过期
	 */
	public static final long CARTITEM_BS_DETAIL_EXPIRED = -3;
	/**
	 * 购物车商品sku异常
	 */
	public static final long CARTITEM_SKU_STATUS_UNNORMAL = -4;
	/**
	 * 购物商品异常
	 */
	public static final long CARTITEM_PROD_STATUS_UNNORMAL = -5;
	/**
	 * 特卖商品无货
	 */
	public static final long CARTITEM_BS_DETAIL_OUTOFSTOCK = -7;
	/**
	 * 特卖商品库存不足
	 */
	public static final long CARTITEM_BS_DETAIL_LOWSTOCK = -8;
	/**
	 * 特卖商品超出限购数量
	 */
	public static final long CARTITEM_BS_DETAIL_EXCEED = -9;
	/**
	 * cookie中的购物车
	 */
	public static final String COOKIE_CART = "cart";
	
	public static final String COOKIE_CART_CONFIRM = "cartconfirm";
	/**
	 * cookie中购物车有效期
	 */
	public static final int COOKIE_CART_PERIOD = 60*60*24*7;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_1 = 1;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_2 = 2;
	/**
	 * 商品在购物车中的排序
	 */
	public static final int CARTITEM_SORTWEIGHT_3 = 3;
	
/*************************************订单常量*************************************/
	/**
	 * 订单来源：网站
	 */
	public static final String ORDER_SOURCE_WEB = "1";
	/**
	 * 订单来源：电话
	 */
	public static final String ORDER_SOURCE_CC = "2";
	/**
	 * 订单来源：手机IOS
	 */
	public static final String ORDER_SOURCE_IOS = "3";
	/**
	 * 订单来源：手机安卓
	 */
	public static final String ORDER_SOURCE_ANDROID = "4";
	/**
	 * 订单类型：实物
	 */
	public static final String ORDER_TYPE_REAL = "0";
	/**
	 * 订单类型：O2O
	 */
	public static final String ORDER_TYPE_O2O = "1";
	/**
	 * 订单状态：待处理
	 */
	public static final String ORDER_STATUS_TOBEPROCESS = "1";
	/**
	 * 订单状态：等待付款
	 */
	public static final String ORDER_STATUS_WAITPAYMENT = "2";
	/**
	 * 订单状态：买家已付款
	 */
	public static final String ORDER_STATUS_WAITDELIVERED = "3";
	/**
	 * 订单状态：交易取消
	 */
	public static final String ORDER_STATUS_CANCELLED = "4";
	/**
	 * 订单状态：商家已发货
	 */
	public static final String ORDER_STATUS_DELIVERED = "5";
	/**
	 * 订单状态：配送失败（废弃）
	 */
	public static final String ORDER_STATUS_DELIVERY_FAILURE = "6";
	/**
	 * 订单状态：拒收（废弃）
	 */
	public static final String ORDER_STATUS_REJECT = "7";
	/**
	 * 订单状态：交易完成
	 */
	public static final String ORDER_STATUS_COMPLETED = "8";
	/**
	 * 订单状态：已退货（废弃）
	 */
	public static final String ORDER_STATUS_RETURN = "9";
	/**
	 * 订单状态：待评论
	 */
	public static final String ORDER_STATUS_TOBECOMMENT = "c";
	/**
	 * 订单状态：已删除（前台不可见）
	 */
	public static final String ORDER_STATUS_DELETE = "d";
	/**
	 * 支付方式：货到付款
	 */
	public static final String PAY_TYPE_COD = "0";
	/**
	 * 订单状态：在线支付
	 */
	public static final String PAY_TYPE_ONLINE = "1";
	/**
	 * 支付模式：货到付款--现金
	 */
	public static final String PAY_MODE_COD_CASH = "00";
	/**
	 * 支付模式：货到付款--POS
	 */
	public static final String PAY_MODE_COD_POS = "01";
	/**
	 * 支付模式：支付宝
	 */
	public static final String PAY_MODE_APIPAY = "20";
	
	/**
	 * 支付模式：银联在线(到银联网关，不去具体银行网关)
	 */
	public static final String PAY_MODE_CHINAPAY = "1z";
	/**
	 * 支付状态：未支付
	 */
	public static final String PAY_STATUS_UNPAY = "1";
	/**
	 * 支付状态：已支付
	 */
	public static final String PAY_STATUS_PAYED = "2";
    /**
	 * 支付状态：支付中
	 */
	public static final String PAY_STATUS_PAYING = "3";
    /**
	 * 支付状态：支付失败
	 */
	public static final String PAY_STATUS_FAILURE = "4";
	/**
	 * 签收状态：未签收
	 */
	public static final String SIGNED_STATUS_UNSIGNED = "0";
	/**
	 * 签收状态：已签收
	 */
	public static final String SIGNED_STATUS_SIGNED = "1";
	/**
	 * 签收状态：拒收
	 */
	public static final String SIGNED_STATUS_REJECT = "2";
	/**
	 * 签收类型：本人签收
	 */
	public static final String SIGNED_TYPE_SELF = "0";
	/**
	 * 签收类型：系统签收
	 */
	public static final String SIGNED_TYPE_SYSTEM = "1";
	/**
	 * 签收类型：EMS签收
	 */
	public static final String SIGNED_TYPE_EMS = "2";
	/**
	 * 评论状态：已评论
	 */
	public static final String ORDERITEM_COMMENT_YES = "1";
	/**
	 * 评论状态：未评论
	 */
	public static final String ORDERITEM_COMMENT_NO = "0";
	/**
	 * 评论状态：已互评
	 */
	public static final String ORDERITEM_COMMENT_EACHOTHER = "2";
	/**
	 * 订单明细状态：正常
	 */
	public static final String ORDERITEM_STATUS_NORMAL = "1";
	/**
	 * 订单明细状态：申请退货
	 */
	public static final String ORDERITEM_STATUS_RETURN_APPLY = "2";
	/**
	 * 更改订单成功
	 */
	public static final int ORDER_UPDATE_SUCCESS = 0;
	/**
	 * 更改订单失败：订单不存在
	 */
	public static final int ORDER_UPDATE_ORDER_NOT_EXIST = -1;
	/**
	 * 更改订单失败：订单状态异常
	 */
	public static final int ORDER_UPDATE_ORDER_STATUS_UNNORMAL = -2;
	/**
	 * 更改订单失败：确认订单失败
	 */
	public static final int ORDER_UPDATE_FAILURE = -3;
	
	/*************************************订单退货状常量*************************************/
	
	/**
	 * 订单退货状态：驳回
	 */
	public static final String  order_return_reject="-1";
	
	/**
	 * 订单退货状态：买家取消
	 */
	public static final String  order_return_cancel="0";
	
	/**
	 * 订单退货状态：等待卖家确认
	 */
	public static final String  order_return_wait="1";
	
	/**
	 * 订单退货状态：卖家受理
	 */
	public static final String  order_return_audit="2";
	/**
	 * 订单退货状态：卖家确认
	 */
	public static final String  order_return_comfirm="3";
	/**
	 * 订单退货状态：卖家退款
	 */
	public static final String  order_return_refund="4";
	/**
	 * 订单退货类型：全部退货
	 */
	public static final String  ORDER_RETURN_TYPE_ALL="1";
	/**
	 * 订单退货类型：部分退货
	 */
	public static final String  ORDER_RETURN_TYPE_PART="2";
	
}
