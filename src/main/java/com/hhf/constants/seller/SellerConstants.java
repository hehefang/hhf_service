/**
 * Copyright (c)2015-? by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.constants.seller;

/**
 * 卖家常量定义
 * 
 * @author xuzunyuan
 * @date 2015年1月23日
 */
public interface SellerConstants {
	public static interface SellerLogin$Status {
		public static final String INIT = "0"; // 已注册，但未完成申请
		public static final String NORAML = "1"; // 正常
		public static final String FREEZED = "F"; // 冻结
	}

	public static interface Seller$Status {
		// 目前只有正常状态
		public static final String NORAML = "1"; // 正常
	}

	public static interface Seller$IsPaidDeposit {
		public static final String UNCHARGE = "0"; // 未交费
		public static final String CHARGED = "1"; // 已交费
	}

	public static interface SellerApply$Status {
		public static final String WAIT_AUDIT = "1"; // 待审核
		public static final String PASSED = "2"; // 通过
		public static final String REJECTED = "3"; // 驳回
	}

	public static interface SellerAudit$AuditType {
		public static final String BASE_INFO = "1";
	}

	public static interface SellerAudit$AuditResult {
		public static final String REJECTED = "0";
		public static final String PASSED = "1";
	}
}
