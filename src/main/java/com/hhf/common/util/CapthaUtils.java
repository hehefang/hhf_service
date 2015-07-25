package com.hhf.common.util;

import java.util.Random;

/**
 * 
 * 验证码生成器
 * 
 * @author xuzunyuan
 * @date 2014年3月24日
 */
public class CapthaUtils {
	private final static char hexDigits[] = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z' };

	/**
	 * 生成一个纯由数字组成的验证码
	 * 
	 * @param count
	 * @return
	 */
	public static String getNumber(int count) {
		String str = "";
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			char ctmp = (char) (random.nextInt(10) + '0');
			str += ctmp;
		}

		return str;
	}

	public static String getLetter(int count) {
		String str = "";
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			char ctmp = (char) (random.nextInt(26) + 'a');
			str += ctmp;
		}
		return str;
	}

	public static String getRand(int count) {
		String str = "";
		Random random = new Random();
		int len = hexDigits.length;

		for (int i = 0; i < count; i++) {
			char ctmp = hexDigits[random.nextInt(len)];
			str += ctmp;
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(CapthaUtils.getLetter(6));
	}
}
