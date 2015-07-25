package com.hhf.service.payment;

import java.math.BigDecimal;
import java.util.List;

import com.hhf.model.order.OrderLog;
import com.hhf.model.order.Payment;
import com.hhf.model.order.PaymentDetail;
import com.hhf.model.order.PaymentOrder;
import com.hhf.model.payment.vo.ResultVO;

public interface IPaymentServices {
	public Long savePaymentId(List<Long> orderids,String paytype,String ip,Long userId,String payGw,String paymentType);
	public ResultVO checkPaymentIdIsValid(Long paymentId);
	public ResultVO checkAmountIsValid(Long paymentId,BigDecimal payamount);
	public int updatePayment(Payment payment);	
	public int updatePaymentpaying(Payment payment);
	public int addLog(OrderLog orderLog);
	public int updatePaySuccessOrder(PaymentOrder order);
	public int updatePayingOrder(PaymentOrder order);
	public int updatePayFailureOrder(PaymentOrder order);
	public PaymentOrder getOrderByOrderId(Long orderId);
	public Payment getPaymentInfo(Long paymentId);	
	public List<PaymentDetail> getPaymentDetailByPamentId(Long PaymentId);
	public void updatelNoPayOrder(int days);
}
