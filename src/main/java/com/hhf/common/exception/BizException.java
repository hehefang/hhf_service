/**
 * Copyright (c)2013-2014 by hhf. All rights reserved.
 * 
 */
package com.hhf.common.exception;

/**
 * 业务异常
 * 
 * @author xuzunyuan
 * @date 2014年1月6日
 */
public class BizException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5288924946624486601L;

	public static final int DEFAULT_CODE = 0;

	protected int code = DEFAULT_CODE; // 异常码

	public int getCode() {
		return code;
	}

	public BizException() {
		super();
	}

	public BizException(String msg) {
		super(msg);
	}

	public BizException(Throwable e) {
		super(e);
	}

	public BizException(String msg, Throwable e) {
		super(msg, e);
	}

	public BizException(int code, String msg, Throwable e) {
		super(msg, e);
		this.code = code;
	}

	public BizException(int code, String msg) {
		super(msg);
		this.code = code;
	}

	public BizException(int code) {
		super();
		this.code = code;
	}
}
