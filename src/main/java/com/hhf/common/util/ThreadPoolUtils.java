/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.common.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一个小的线程池工具，固定持有100个线程，适用于项目中实现的异步小作业
 * 
 * 在小作业完成后，其使用的工作线程进入等待状态，如此当下一请求来到后，可以使用等待中的线程，避免了创建线程的资源消耗
 * 
 * @author xuzunyuan
 * @date 2014年12月26日
 */
public class ThreadPoolUtils {
	private static final int threadCount = 100;
	private static ExecutorService executorService;
	static {
		executorService = Executors.newFixedThreadPool(threadCount);

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				executorService.shutdownNow();
			}

		});
	}

	private ThreadPoolUtils() {
	}

	public static void execute(Runnable runnable) {
		executorService.execute(runnable);
	}
}
