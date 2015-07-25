package com.hhf.service.payment;

import com.hhf.model.order.PaymentOrder;
import com.hhf.model.payment.vo.ResultVO;

/**
 * 针对银联在线支付提供的相关订单服务接口
 * User: melnnyy
 * Date: 2014/7/4
 * Time: 14:14
 */
@SuppressWarnings("rawtypes")
public interface IUnionPayServices {
    /**
     * 验证订单是否可以付款
     *  1、验证订单状态是否合法；（状态只能为：等待支付）
     *  2、验证订单支付状态是否合法；（状态只能为：未支付 或 支付失败）
     *
     * @param orderId
     * @return
     */
    ResultVO verifyOrder(Long orderId);

    /**
     * 根据orderId，得到订单
     * @param orderId
     * @return
     */
    PaymentOrder getOrder(Long orderId);

    /**
     * 支付完成时更新订单信息
     *  1、支付失败时，只更新订单“支付状态”；
     *  2、支付成功时，更新订单“支付状态”、“实际支付类型”、“实际支付方式”、“实际支付时间”、“订单状态”；
     *
     * @param orderId
     * @param flag true为支付成功，false为支付失败；
     * @param gateId
     * @param info
     * @return
     */
    ResultVO updateOrder(Long orderId, boolean flag, String gateId, String info);
}
