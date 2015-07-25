/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.common.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动dubbo服务 注：一网的dubbo服务是和spring绑定的，因此通过启动spring容器来提供服务
 * 
 * @author xuzunyuan
 * @date 2013年12月27日
 */
public class StartDubbo {
	private static final Logger logger = LoggerFactory
			.getLogger(StartDubbo.class);

	private static volatile boolean running = true; // 运行状态

	public static void main(String[] args) {
		System.setProperty("spring.profiles.default", "develop");
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/*.xml");

		// 增加一个停止钩子，用于关闭spring
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				try {
					context.stop();
					context.close();
					logger.info("Spring + Dubbo stopped...");
				} catch (Throwable t) {
					logger.error(t.getMessage(), t);
				}
				synchronized (StartDubbo.class) {
					running = false;
					StartDubbo.class.notify();
				}
			}

		});

		// 启动spring
		context.start();
		logger.info("Spring + Dubbo has been started...");

		// 显示设置mybatis的日志
		// org.apache.ibatis.logging.LogFactory.useSlf4jLogging();

		// 进入等待状态
		synchronized (StartDubbo.class) {
			while (running) {
				try {
					StartDubbo.class.wait();
				} catch (Throwable e) {
				}
			}
		}
	}
}
