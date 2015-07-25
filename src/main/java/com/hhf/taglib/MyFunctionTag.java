package com.hhf.taglib;

import org.apache.commons.lang.ArrayUtils;

import com.hhf.common.util.RandomUtils;

public class MyFunctionTag {
	public static String random(String[] arr) {
		return ArrayUtils.isEmpty(arr) ? null : arr[RandomUtils.randomInt(0,
				arr.length - 1)];
	}

	public static Boolean inArray(Object[] array, Object objectToFind) {
		if (array == null) {
			return false;
		}

		if (objectToFind == null) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == null) {
					return true;
				}
			}
		} else if (array.getClass().getComponentType().isInstance(objectToFind)) {
			for (int i = 0; i < array.length; i++) {
				if (objectToFind.equals(array[i])) {
					return true;
				}
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != null
						&& objectToFind.toString().equals(array[i].toString())) {
					return true;
				}
			}
		}

		return false;
	}
}
