package com.hhf.service.order;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.order.Order;
import com.hhf.model.order.OrderItem;
import com.hhf.param.cart.Trade;
import com.hhf.param.order.OrderCondition;
import com.hhf.param.order.OrderInfo;

public interface IOrderService {

	/**
	 * 根据订单号查询订单
	 * 
	 * @param orderId
	 * @return
	 */
	public Order getOrderById(Long orderId);

	/**
	 * 修改订单为已发送
	 * 
	 * @param order
	 * @return 1:修改成功,else:失败
	 */
	public int updateOrder2Sended(Order order);

	public List<Order> getOrdersByIds(Long[] orderIds);

	/**
	 * 根据订单id和用户id获取订单
	 * 
	 * @param orderIds
	 * @param userId
	 * @return
	 */
	public List<Order> getOrdersByIdsAndUserId(Long[] orderIds, Long userId);

	/**
	 * 取消订单
	 * 
	 * @param optName
	 *            操作人
	 * @param cancelReason
	 *            取消原因
	 * @param orderIds
	 *            订单id
	 * @return
	 */
	public int cancelOrderByIds(String optName, String cancelReason,
			Long... orderIds);

	/**
	 * 根据用户id获取订单列表
	 * 
	 * @param userId
	 * @return
	 */
	public Page<Order> getOrdersByUserId(Long userId, Page<Order> page);

	/**
	 * 根据用户Id和订单状态取得订单列表
	 * 
	 * @param userId
	 * @param status
	 * @return
	 */
	public Page<Order> getOrdersByUserIdAndStatus(Long userId, String status,
			Page<Order> page);

	/**
	 * 批量生成订单
	 * 
	 * @param trades
	 * @return
	 * @throws Exception
	 * @throws InventoryException
	 */
	public List<OrderInfo> batchSaveOrders(List<Trade> trades) throws Exception;

	/**
	 * boss系统查询订单
	 * 
	 * @param map
	 * @param page
	 * @return
	 */
	public Page<Order> queryOrderByCondition(Map<String, ?> map,
			Page<Order> page);

	/**
	 * 获取订单详情列表
	 * 
	 * @param orderId
	 *            订单Id
	 * @return
	 */
	public List<OrderItem> getOrderItemsByOrderId(Integer orderId);

	/**
	 * 根据查询条件获取订单
	 * 
	 * @param orderCondition
	 * @return
	 */
	public Page<Order> getOrdersByOrderConditon(OrderCondition orderCondition,
			Page<Order> page);

	/**
	 * 根据订单明细id获取订单明细
	 * 
	 * @param orderItemId
	 * @return
	 */
	public OrderItem getOrderItemById(Long orderItemId);

	/**
	 * 根据订单ID和用户ID获取订单（前台用）
	 * 
	 * @param orderId
	 * @param userId
	 * @return
	 */
	public Order getOrderByIdAndUser(Long orderId, Long userId);

	/**
	 * 取消订单（前台用）
	 * 
	 * @param orderId
	 * @param userId
	 * @param userName
	 * @param cancelReason
	 * @return
	 */
	public int cancelOrderByIdAndUser(Long orderId, Long userId,
			String userName, String cancelReason);

	/**
	 * 确认收货（前台用）
	 * 
	 * @param orderId
	 * @param userId
	 * @param userName
	 * @return
	 */
	public int confirmOrderByUser(Long orderId, Long userId, String userName);

	/**
	 * 删除订单（前台用）
	 * 
	 * @param orderId
	 * @param userId
	 * @param userName
	 * @return
	 */
	public int deleteOrderByUser(Long orderId, Long userId, String userName);

	public int getToBeProcessOrderCountOfSeller(int sellerId);
}
