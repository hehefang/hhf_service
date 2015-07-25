/**
 * Copyright (c)2013-2014 by hhf. All rights reserved.
 * 
 */
package com.hhf.common.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.hhf.common.generator.UUIDGenerator;
import com.hhf.common.config.HhfConfig;

/**
 * MD5加密算法工具
 * 
 * @author xuzunyuan
 * @date 2013年12月25日
 */
public class MD5Encrypt {
	private MD5Encrypt() {
	}

	/**
	 * Used building output as Hex
	 */
	private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/**
	 * 对字符串进行MD5加密
	 * 
	 * @param text
	 *            明文
	 * 
	 * @return 密文
	 */
	public static String md5(String text) {
		MessageDigest msgDigest = null;

		try {
			msgDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(
					"System doesn't support MD5 algorithm.");
		}

		try {
			msgDigest.update(text.getBytes(HhfConfig.charset));

		} catch (UnsupportedEncodingException e) {

			throw new IllegalStateException(
					"System doesn't support your  EncodingException.");

		}

		byte[] bytes = msgDigest.digest();

		String md5Str = new String(encodeHex(bytes));

		return md5Str;
	}

	/**
	 * 对字符串进行MD5加密，用秘钥进行加权
	 * 
	 * @param key
	 * @param text
	 * @return
	 */
	public static String md5(String key, String text) {
		String s = text + (key == null ? "" : key);

		return md5(s);
	}

	private static char[] encodeHex(byte[] data) {

		int l = data.length;

		char[] out = new char[l << 1];

		// two characters form the hex value.
		for (int i = 0, j = 0; i < l; i++) {
			out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
			out[j++] = DIGITS[0x0F & data[i]];
		}

		return out;
	}

	public static void main(String[] args) {
		String s = "123456";

		for (int i = 0; i < 10; i++) {
			String key = UUIDGenerator.getUUID32();
			String encrypt = md5(key, s);
			System.out.println(encrypt + ":" + key);
		}
	}
}
