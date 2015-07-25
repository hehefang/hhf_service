package com.hhf.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberUtils {
	public static final String pattern = "0.00";
	
	/**
	 * 格式化数字类型
	 * @param bd
	 * @param pattern
	 * @return
	 */
	public static String format(BigDecimal bd,String pattern){
		if(bd == null){
			bd = BigDecimal.ZERO;
		}
		
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(bd.doubleValue());
	}
	
	public static String format(BigDecimal bd){
		return format(bd,pattern);
	}
	
	
	private NumberUtils(){};
	
	public static void main(String[] args) {
		String aa = NumberUtils.format(null);
		System.out.println(aa);
	}
}
