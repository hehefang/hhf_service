/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.common.util;

import com.hhf.common.exception.TechException;

/**
 * 简单检查工具
 * 
 * @author xuzunyuan
 * @date 2014年6月13日
 */
public class SimpleCheckUtils {
	/**
	 * 检查参数
	 * 
	 * @param condition
	 * @param msg
	 * @throws ArgException
	 */
	public static final void checkArgument(boolean condition, String msg)
			throws TechException {

		if (!condition) {
			if (msg == null) {
				throw new TechException();
			} else {
				throw new TechException(msg);
			}
		}
	}

	public static final void checkArgument(boolean condition)
			throws TechException {

		checkArgument(condition, null);
	}
}
