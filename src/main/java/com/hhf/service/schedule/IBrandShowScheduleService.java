/**
 * Copyright (c)2015-? by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.service.schedule;

import java.util.Date;

/**
 * 品牌特卖注册启停服务
 * 
 * @author xuzunyuan
 * @date 2015年3月10日
 */
public interface IBrandShowScheduleService {
	// 注册特卖开始任务
	public int registerBrandShowStartJob(int brandShowId, Date startDate);

	// 注册特卖结束任务
	public int registerBrandShowEndJob(int brandShowId, Date endDate);
}
