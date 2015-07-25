package com.hhf.common.util;

import java.util.Map;

import com.google.common.collect.Maps;

public class RandomUtils {
	/**
	 * 产生指定范围内的一个随机数
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static final int randomInt(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}

	/**
	 * 产生指定范围内的一组随机数，且不重复
	 * 
	 * @param min
	 * @param max
	 * @param count
	 * @return
	 */
	public static final int[] randomInt(int min, int max, int count) {
		int[] array = new int[count];
		Map<Integer, Integer> swaps = Maps.newHashMap();

		for (int i = 0; i < count; i++) {
			int random = randomInt(min, max);

			if (swaps.containsKey(random)) {
				array[i] = swaps.get(random);

			} else {
				array[i] = random;
			}

			swaps.put(random, swaps.containsKey(min) ? swaps.get(min) : min);

			min++;
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = RandomUtils.randomInt(0, 10, 11);

		for (int i = 0; i < array.length; i++) {
			System.out.println("random2:" + array[i]);
		}
	}
}
