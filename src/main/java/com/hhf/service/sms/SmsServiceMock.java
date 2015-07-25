package com.hhf.service.sms;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsServiceMock implements ISmsService {
	private static final Logger logger = LoggerFactory
			.getLogger(SmsServiceMock.class);

	@Override
	public int sendSmsMultiEx(String[] mobile, String smsContent, String bizCode) {
		logger.info("[mobile] " + ArrayUtils.toString(mobile)
				+ " [smsContent] " + smsContent + " [bizCode] " + bizCode);
		return 0;
	}

	@Override
	public int sendSmsMulti(String[] mobile, String smsContent) {
		logger.info("[mobile] " + ArrayUtils.toString(mobile)
				+ " [smsContent] " + smsContent);
		return 0;
	}

	@Override
	public int sendSmsEx(String mobile, String smsContent, String bizCode) {
		logger.info("[mobile] " + mobile + " [smsContent] " + smsContent
				+ " [bizCode] " + bizCode);
		return 0;
	}

	@Override
	public int sendSms(String mobile, String smsContent) {
		logger.info("[mobile] " + mobile + " [smsContent] " + smsContent);
		return 0;
	}

	@Override
	public int sendScheduledSmsMultiEx(String[] mobile, String smsContent,
			String sendTime, String bizCode) {
		return 0;
	}

	@Override
	public int sendScheduledSmsMulti(String[] mobile, String smsContent,
			String sendTime) {
		return 0;
	}

	@Override
	public int sendScheduledSmsEx(String mobile, String smsContent,
			String sendTime, String bizCode) {
		return 0;
	}

	@Override
	public int sendScheduledSms(String mobile, String smsContent,
			String sendTime) {
		return 0;
	}

}
