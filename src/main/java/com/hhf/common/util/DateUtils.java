package com.hhf.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.common.utils.StringUtils;

public final class DateUtils {
	private static final Logger logger = LoggerFactory
			.getLogger(DateUtils.class);

	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String PART_TIME_PATTERN = "yyyy-MM-dd";

	/**
	 * 获取当前日期 注：开发人员不应在代码中使用new
	 * Date()方法生成当前日期，而应调用DateUtils.currentDate()，以便于应付将来可能的需求变化
	 * 
	 * @return
	 */
	public static Date currentDate() {
		return new Date();
	}

	/**
	 * 将日期增加相应的天数
	 * 
	 * @param date
	 *            日期
	 * @param amount
	 *            天数
	 * @return
	 */
	public static Date addDay(Date date, int amount) {
		return dateAdd(date, Calendar.DAY_OF_MONTH, amount);
	}

	/**
	 * 通过指定的域给日期加/减相应的时间
	 * 
	 * @param date
	 *            指定的日期
	 * @param field
	 *            指定的日期域(例如：Calendar.DAY_OF_MONTH)
	 * @param amount
	 *            加/减的数量(负数代表减)
	 * @return
	 */
	public static Date dateAdd(Date date, int field, int amount) {
		if (date != null) {
			Calendar now = Calendar.getInstance();
			now.setTime(date);
			now.add(field, amount);
			date = now.getTime();
		}
		return date;
	}

	/**
	 * 将Date类型转化为指定格式的String类型
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		String strDate = null;
		if (date != null) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			strDate = sdf.format(date);
		}
		return strDate;
	}

	/**
	 * 将Date类型转化为默认格式(yyyy-MM-dd HH:mm:ss)的String类型
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		return formatDate(date, DEFAULT_PATTERN);
	}

	/**
	 * 将String型的日期转化为Date型
	 * 
	 * @param strDate
	 * @param pattern
	 * @return
	 */
	public static Date parseDate(String strDate, String pattern) {
		Date date = null;
		if (!StringUtils.isBlank(strDate)) {
			SimpleDateFormat sdf = new SimpleDateFormat(
					StringUtils.isBlank(pattern) ? DEFAULT_PATTERN : pattern);
			try {
				date = sdf.parse(strDate);
			} catch (ParseException e) {
				logger.warn(e.getMessage(), e);
			}
		}
		return date;
	}

	/**
	 * 将String型的日期转化为Date型(必须为yyyy-MM-dd HH:mm:ss形式)
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date parseDate(String strDate) {
		return parseDate(strDate, DEFAULT_PATTERN);
	}

	/**
	 * 将long型的日期转化为Date型
	 * 
	 * @param time
	 * @return
	 */
	public static Date parseDate(long time) {
		Date rtnDate = new Date();
		rtnDate.setTime(time);
		return rtnDate;
	}

	private DateUtils() {
	}

}
