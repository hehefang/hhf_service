/**
 * Copyright (c)2013-2014 by www.hehefang.com. All rights reserved.
 * 
 */
package com.hhf.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正则表达式工具，用于验证用户输入
 * 
 * @author xuzunyuan
 * @date 2014年1月7日
 */
public class RegUtils {
	private static final Logger log = LoggerFactory.getLogger(RegUtils.class);

	/*----------常用输入验证------*/

	// 匹配双字节字符(包括汉字在内)：[^x00-xff] ---已验证
	public static boolean isDoubleByteString(String inputString) {
		return validateString("[^x00-xff]", inputString);
	}

	// 匹配HTML标记的正则表达式：/< (.*)>.*|< (.*) />/ ---未验证：可以实现HTML过滤
	public static boolean isHtmlString(String inputString) {
		return validateString("/< (.*)>.*|< (.*) />/", inputString);
	}

	// 匹配首尾空格的正则表达式：[\\s*)]+\\w+[\\s*$] ---已验证
	public static boolean isTrimStartAndEndInthisString(String inputString) {
		return validateString("[\\s*)]+\\w+[\\s*$]", inputString);
	}

	// 邮箱规则：用户名@服务器名.后缀 ---已验证
	// 匹配Email地址的正则表达式：^([a-z0-9A-Z]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}
	public static boolean isEmail(String inputString) {
		return validateString(
				"^([a-z0-9A-Z]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}",
				inputString);
	}

	// 匹配网址URL的正则表达式：^http://[a-zA-Z0-9./\\s] ---已验证
	public static boolean isUrl(String inputString) {
		return validateString("^http://[a-zA-Z0-9./\\s]", inputString);
	}

	// 验证用户密码:“^[a-zA-Z]\\w{5,17}$”
	// 正确格式为：以字母开头，长度在6-18 --已验证
	public static boolean isPassword(String inputString) {
		return validateString("^[a-zA-Z]\\w{5,17}$", inputString);
	}

	// 验证身份证是否有效15位或18位 ^\\d{15}(\\d{2}[0-9xX])?$ ---已验证<包括对年月日的合法性进行验证>
	public static boolean isIdCard(String inputString) {
		boolean b = validateString("^\\d{15}(\\d{2}[0-9xX])?$", inputString);
		if (b) { // 对年月日字符串的验证
			String power = inputString.substring(inputString.length() - 12,
					inputString.length() - 4);

			return validateString(
					"^[1-2]+([0-9]{3})+(0[1-9][0-2][0-9]|0[1-9]3[0-1]|1[0-2][0-3][0-1]|1[0-2][0-2][0-9])",
					power);
		}
		return false;
	}

	// 验证固定电话号码 ^(([0-9]{3,4})|([0-9]{3,4})-)?[0-9]{7,8}$ ---已验证
	public static boolean isTelePhone(String inputString) {
		return validateString("^(([0-9]{3,4})|([0-9]{3,4})-)?[0-9]{7,8}$",
				inputString);
	}

	// 验证移动电话号码 ^[1][3-8]+\\d{9} ---已验证
	public static boolean isMobilePhone(String inputString) {
		return validateString("^[1][3-8]+\\d{9}", inputString);
	}

	// 只能输入汉字，匹配中文字符的正则表达式：^[\u4e00-\u9fa5]*$--已验证
	public static boolean isChineseString(String inputString) {
		return validateString("^[\u4e00-\u9fa5]*$", inputString);
	}

	/*--------- 数字操作验证-----*/

	// 匹配正整数 ^[1-9]d*$　 　
	public static boolean isPositiveInteger(String inputString) {
		return validateString("^[1-9]d*$", inputString);
	}

	// 匹配负整数 ^-[1-9]d*$ 　
	public static boolean isNegativeInteger(String inputString) {
		return validateString("^-[1-9]d*$", inputString);
	}

	// 匹配整数 ^-?[1-9]d*$　　
	public static boolean isInteger(String inputString) {
		return validateString("^-?[1-9]d*$", inputString);
	}

	// 匹配非负整数（正整数 + 0） ^[1-9]d*|0$　
	public static boolean isNotNegativeInteger(String inputString) {
		return validateString("^[1-9]d*|0$", inputString);
	}

	// 匹配非正整数（负整数 + 0） ^-[1-9]d*|0$　
	public static boolean isNotPositiveInteger(String inputString) {
		return validateString("^-[1-9]d*|0$", inputString);
	}

	// 匹配正浮点数 ^[1-9]d*.d*|0.d*[1-9]d*$　　
	public static boolean isPositiveFloat(String inputString) {
		return validateString("^[1-9]d*.d*|0.d*[1-9]d*$", inputString);
	}

	// 匹配负浮点数 ^-([1-9]d*.d*|0.d*[1-9]d*)$　
	public static boolean isNegativeFloat(String inputString) {
		return validateString("^-([1-9]d*.d*|0.d*[1-9]d*)$", inputString);
	}

	// 匹配浮点数 ^-?([1-9]d*.d*|0.d*[1-9]d*|0?.0+|0)$　

	public static boolean isFloat(String inputString) {
		return validateString("^-?([1-9]d*.d*|0.d*[1-9]d*|0?.0+|0)$",
				inputString);
	}

	// 匹配非负浮点数（正浮点数 + 0）^[1-9]d*.d*|0.d*[1-9]d*|0?.0+|0$　　
	public static boolean isNotNegativeFloat(String inputString) {
		return validateString("^[1-9]d*.d*|0.d*[1-9]d*|0?.0+|0$", inputString);
	}

	// 匹配非正浮点数（负浮点数 + 0）^(-([1-9]d*.d*|0.d*[1-9]d*))|0?.0+|0$
	public static boolean isNotPositiveFloat(String inputString) {
		return validateString("^(-([1-9]d*.d*|0.d*[1-9]d*))|0?.0+|0$",
				inputString);
	}

	// 只能输入数字：“^[0-9]*$”
	public static boolean isNumber(String inputString) {
		return validateString("^[0-9]*$", inputString);
	}

	// 只能输入n位的数字：“^d{n}$”
	public static boolean isNumberFormatLength(int length, String inputString) {
		return validateString("^d{" + length + "}$", inputString);
	}

	// 只能输入至少n位数字：“^d{n,}$”
	public static boolean isNumberLengthLess(int length, String inputString) {
		return validateString("^d{" + length + ",}$", inputString);
	}

	// 只能输入m-n位的数字：“^d{m,n}$”
	public static boolean isNumberLengthBetweenLowerAndUpper(int lower,
			int upper, String inputString) {
		return validateString("^d{" + lower + "," + upper + "}$", inputString);
	}

	// 只能输入零和非零开头的数字：“^(0|[1-9][0-9]*)$”
	public static boolean isNumberStartWithZeroOrNot(String inputString) {
		return validateString("^(0|[1-9][0-9]*)$", inputString);
	}

	// 只能输入有两位小数的正实数：“^[0-9]+(.[0-9]{2})?$”
	public static boolean isNumberInPositiveWhichHasTwolengthAfterPoint(
			String inputString) {
		return validateString("^[0-9]+(.[0-9]{2})?$", inputString);
	}

	// 只能输入有1-3位小数的正实数：“^[0-9]+(.[0-9]{1,3})?$”
	public static boolean isNumberInPositiveWhichHasOneToThreelengthAfterPoint(
			String inputString) {
		return validateString("^[0-9]+(.[0-9]{1,3})?$", inputString);
	}

	// 只能输入非零的正整数：“^+?[1-9][0-9]*$”
	public static boolean isIntegerUpZero(String inputString) {
		return validateString("^+?[1-9][0-9]*$", inputString);
	}

	// 只能输入非零的负整数：“^-[1-9][0-9]*$”
	public static boolean isIntegerBlowZero(String inputString) {
		return validateString("^-[1-9][0-9]*$", inputString);
	}

	// 只能输入由26个英文字母组成的字符串：“^[A-Za-z]+$”
	public static boolean isEnglishAlphabetString(String inputString) {
		return validateString("^[A-Za-z]+$", inputString);
	}

	// 只能输入由26个大写英文字母组成的字符串：“^[A-Z]+$”
	public static boolean isUppercaseEnglishAlphabetString(String inputString) {
		return validateString("^[A-Z]+$", inputString);
	}

	// 只能输入由26个小写英文字母组成的字符串：“^[a-z]+$”
	public static boolean isLowerEnglishAlphabetString(String inputString) {
		return validateString("^[a-z]+$", inputString);
	}

	// 只能输入由数字和26个英文字母组成的字符串：“^[A-Za-z0-9]+$”
	public static boolean isNumberEnglishAlphabetString(String inputString) {
		return validateString("^[A-Za-z0-9]+$", inputString);
	}

	// 只能输入由数字、26个英文字母或者下划线组成的字符串：“^w+$”
	public static boolean isNumberEnglishAlphabetWithUnderlineString(
			String inputString) {
		return validateString("^w+$", inputString);
	}

	/**
	 * 根据正则表达式校验输入字符串
	 * 
	 * @param regExp
	 * @param inputString
	 * @return
	 */
	public static boolean validateString(String regExp, String inputString) {
		try {
			Pattern pattern = Pattern.compile(regExp);
			Matcher matcher = pattern.matcher(inputString);
			return matcher.find();
		} catch (Exception e) {
			log.warn(e.getMessage(), e);
			return false;
		}
	}

}
