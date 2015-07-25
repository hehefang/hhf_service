/**
 * Copyright (c)2013-2014 by www.hehefang.com. All rights reserved.
 * 
 */
package com.hhf.service.seller;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.seller.SellerApply;
import com.hhf.model.seller.SellerAudit;

/**
 * 卖家申请服务接口
 * 
 * @author xuzunyuan
 * @date 2013年12月27日
 */
public interface ISellerApplyService {
	/**
	 * 获取用户申请信息
	 * 
	 * @param id
	 * @return
	 */
	public SellerApply getSellerApplyById(int id);

	/**
	 * 根据登录ID获取申请信息
	 * 
	 * @param loginId
	 * @return
	 */
	public SellerApply getSellerApplyByLoginId(int loginId);

	/**
	 * 提交新卖家申请
	 * 
	 * @param sellerApply
	 *            包含签约类目信息
	 * @return 申请ID，失败返回0
	 */
	public long commitNewSellerApply(SellerApply sellerApply);

	/**
	 * 提交修改后的卖家申请信息
	 * 
	 * @param sellerApply
	 *            包含签约类目信息
	 * @return 失败返回0
	 */
	public int commitUpdatedSellerApply(SellerApply sellerApply);

	/**
	 * 审核通过
	 * 
	 * @param appId
	 * @param auditor
	 * @param ip
	 * @param auditType
	 *            1:基本资料,2:店铺资料
	 * @param opinion
	 * @return 失败返回0
	 */
	public int passSellerApply(int appId, String auditType, String auditor,
			String ip, String opinion);

	/**
	 * 驳回申请
	 * 
	 * @param appId
	 * @param auditor
	 * @param ip
	 * @param auditType
	 *            1:基本资料,2:店铺资料
	 * @param opinion
	 * @return 失败返回0
	 */
	public int rejectSellerApply(int appId, String auditType, String auditor,
			String ip, String opinion);

	/**
	 * 批量通过申请
	 * 
	 * @param appid
	 * @param auditor
	 * @param ip
	 * @param opinion
	 * @return
	 */
	public void batchPassSellerApply(int[] appIds, String auditType,
			String auditor, String ip, String opinion);

	/**
	 * 批量驳回申请
	 * 
	 * @param appId
	 * @param auditor
	 * @param ip
	 * @param opinion
	 * @return
	 */
	public void batchRejectSellerApply(int[] appIds, String auditType,
			String auditor, String ip, String opinion);

	/**
	 * 获得最近一次审核结果
	 * 
	 * @param appId
	 * @return
	 */
	public SellerAudit getRecentAudit(int appId);

	/**
	 * 获得审批数据
	 * 
	 * @param auditId
	 * @return
	 */
	public SellerAudit getAudit(int auditId);

	/**
	 * 获得所有审核结果，以时间倒序
	 * 
	 * @param appId
	 * @return
	 */
	public List<SellerAudit> getAuditList(int appId);

	/**
	 * 查询待审核申请，按申请时间倒叙
	 * 
	 * @param queryCond
	 * @param page
	 * @return
	 */
	public Page<SellerApply> queryWaitAuditApply(Map<String, Object> queryCond,
			int... page);

	/**
	 * 查询待保证金审核申请，按申请时间倒叙
	 * 
	 * @param queryCond
	 * @param page
	 * @return
	 */
	public Page<SellerApply> queryWaitDepositAuditApply(
			Map<String, Object> queryCond, int... page);
}
