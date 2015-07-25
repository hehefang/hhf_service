/**
 * Copyright (c)2013-2014 by hhf. All rights reserved.
 * 
 */
package com.hhf.common.generator;

import java.util.UUID;

/**
 * 随机UUID生成器，基于jdk标准的UUID算法
 * 
 * @author xuzunyuan
 * @date 2013年12月25日
 */
public class UUIDGenerator {
	private UUIDGenerator() {
	}

	/**
	 * 生成一个标准的32位UUID，主要用于私钥的生成
	 * 
	 * @return
	 */
	public static String getUUID32() {
		String s = UUID.randomUUID().toString();

		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
				+ s.substring(19, 23) + s.substring(24);
	}

	/**
	 * 获得指定数目的UUID
	 * 
	 * @param num
	 * @return
	 */
	public static String[] getUUID32(int num) {
		String[] ss = new String[num];

		for (int i = 0; i < num; i++) {
			ss[i] = getUUID32();
		}
		return ss;
	}
}
