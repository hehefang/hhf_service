package com.hhf.service.order;

import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.order.ReturnOrder;

public interface IRetOrderService {
	/**
	 * 根据用户id获取退货订单
	 * 
	 * @param userId
	 * @return
	 */
	public Page<ReturnOrder> getRetOrdersByUserId(long userId,
			Page<ReturnOrder> page);

	public Page<ReturnOrder> getRetOrdersByPage(Map<String, ?> cond,
			Page<ReturnOrder> page);

	/**
	 * 生成退货单
	 * 
	 * @param retOrder
	 */
	public int addRetOrder(ReturnOrder retOrder);

	public ReturnOrder getRetOrderByRetOrderId(Long retOrderId);

	/**
	 * @param retOrderId
	 *            退货单ID
	 * @return 包括退货单及详情和商品的信息
	 */
	public ReturnOrder getRetOrderInfoByRetOrderId(Long retOrderId);

	/**
	 * 买家取消退货单
	 * 
	 * @param retOrderId
	 * @param uid
	 */
	public int cancelRetOrderById(Long retOrderId, Long uid);

	/**
	 * @param retOrder
	 * @return 1:成功,0:失败,-1:状态不对
	 */
	public int updateRetOrderByIdSelective(ReturnOrder retOrder);

	public int getToBeProcessRetOrderCountOfSeller(int sellerId);
}
