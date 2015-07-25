/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.log4j.Logger;

/**
 * 扩展apache BeanUtils, 忽略源对象null值的拷贝
 * 
 * @author xuzunyuan
 * @date 2014年6月19日
 */
public class BeanUtils {
	private static final Logger logger = Logger.getLogger(BeanUtils.class);

	// 忽略源对象null值的拷贝
	public static void copyProperties(Object dest, Object orig) {

		try {
			BeanUtilsBeanExt.getInstance().copyProperties(dest, orig);
		} catch (IllegalAccessException e) {
			logger.error(e, e);
		} catch (InvocationTargetException e) {
			logger.error(e, e);
		}
	}

	private static class BeanUtilsBeanExt extends BeanUtilsBean {
		private static BeanUtilsBeanExt instance = new BeanUtilsBeanExt();

		public static BeanUtilsBeanExt getInstance() {
			return instance;
		}

		@SuppressWarnings("rawtypes")
		public void copyProperties(Object dest, Object orig)
				throws IllegalAccessException, InvocationTargetException {

			// Validate existence of the specified beans
			if (dest == null) {
				throw new IllegalArgumentException(
						"No destination bean specified");
			}
			if (orig == null) {
				throw new IllegalArgumentException("No origin bean specified");
			}

			// Copy the properties, converting as necessary
			if (orig instanceof DynaBean) {
				DynaProperty[] origDescriptors = ((DynaBean) orig)
						.getDynaClass().getDynaProperties();
				for (int i = 0; i < origDescriptors.length; i++) {
					String name = origDescriptors[i].getName();
					if (getPropertyUtils().isReadable(orig, name)
							&& getPropertyUtils().isWriteable(dest, name)) {
						Object value = ((DynaBean) orig).get(name);
						if (value != null)
							copyProperty(dest, name, value);
					}
				}
			} else if (orig instanceof Map) {
				Iterator entries = ((Map) orig).entrySet().iterator();
				while (entries.hasNext()) {
					Map.Entry entry = (Map.Entry) entries.next();
					String name = (String) entry.getKey();
					if (getPropertyUtils().isWriteable(dest, name)) {
						Object value = entry.getValue();
						if (value != null)
							copyProperty(dest, name, value);
					}
				}
			} else /* if (orig is a standard JavaBean) */{
				PropertyDescriptor[] origDescriptors = getPropertyUtils()
						.getPropertyDescriptors(orig);
				for (int i = 0; i < origDescriptors.length; i++) {
					String name = origDescriptors[i].getName();
					if ("class".equals(name)) {
						continue; // No point in trying to set an object's class
					}
					if (getPropertyUtils().isReadable(orig, name)
							&& getPropertyUtils().isWriteable(dest, name)) {
						try {
							Object value = getPropertyUtils()
									.getSimpleProperty(orig, name);
							if (value != null)
								copyProperty(dest, name, value);
						} catch (NoSuchMethodException e) {
							// Should not happen
						}
					}
				}
			}

		}
	}
}
