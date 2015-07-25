package com.hhf.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletRequest;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.google.common.collect.Maps;

/**
 * 
 * 属性工具，固定从classpath:properties/my.properties中加载属性（根据spring.profiles.active加载)
 * 
 * @author xuzunyuan
 * @date 2015年1月23日
 */
public class PropertyUtils {
	private static Logger logger = LoggerFactory.getLogger(PropertyUtils.class);
	private Map<String, Object> props = null;

	private PropertyUtils() {
		loadProperty();
	}

	private static PropertyUtils instance = null;

	private static PropertyUtils getInstance() {
		if (instance == null) {
			createInstance();
		}

		return instance;
	}

	private static synchronized void createInstance() {
		if (instance == null)
			instance = new PropertyUtils();
	}

	/**
	 * 加载属性文件
	 */
	private void loadProperty() {
		String activeProfile = System.getProperty("spring.profiles.active");

		if (activeProfile == null)
			activeProfile = "develop";

		Resource resource = new ClassPathResource("/properties/my.properties");
		InputStream is = null;
		Properties properties = new Properties();

		try {
			is = resource.getInputStream();
			properties.load(is);

			props = Maps.newHashMap();
			Set<String> set = properties.stringPropertyNames();

			for (String key : set) {
				addProperty(key, properties.getProperty(key), activeProfile);
			}

		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void addProperty(String key, String value, String activeProfile) {
		key = key.trim();

		int profileIndex = key.indexOf(".");
		if (profileIndex != -1) {
			String profile = key.substring(0, profileIndex);
			if (!activeProfile.equalsIgnoreCase(profile))
				return;

			key = key.substring(profileIndex + 1);
		}

		int arrayIndex = key.indexOf("[");
		if (arrayIndex != -1)
			key = key.substring(0, arrayIndex);

		key = key.trim();

		Object val = value;
		if (arrayIndex != -1) {
			val = value.split("\\,");
		}

		// 缺省设置
		if (profileIndex == -1) {
			if (!props.containsKey(key)) {
				props.put(key, val);
			}

		} else {
			props.put(key, val);
		}
	}

	/**
	 * 获取属性
	 * 
	 * @param key
	 * @return
	 */
	public static Object getProperty(String key) {
		return getInstance().props == null ? null : getInstance().props
				.get(key);
	}

	public static Object getRandomProperty(String key) {
		Map<String, Object> props = getInstance().props;
		Object o = null;

		if (props != null) {
			o = props.get(key);
			if (o != null && o instanceof Object[]) {
				Object[] arr = (Object[]) o;
				o = ArrayUtils.isEmpty(arr) ? null : arr[RandomUtils.randomInt(
						0, arr.length - 1)];
			}
		}

		return o;
	}

	/**
	 * 获取属性集合
	 * 
	 * @return
	 */
	public static Map<String, Object> getProperties() {
		return getInstance().props;
	}

	/**
	 * 设置request attributes
	 * 
	 * @param request
	 */
	public static void setRequestProperties(ServletRequest request) {
		Map<String, Object> props = getInstance().props;

		if (props == null)
			return;

		for (String key : props.keySet()) {
			request.setAttribute(key, props.get(key));
		}
	}
}
