package com.hhf.param.order;

import java.io.Serializable;

import com.hhf.model.order.Order;

public class OrderInfo implements Serializable {
	private static final long serialVersionUID = -761349533523103275L;
	private int code;
	private Order order;
	/**
	 * 
	 * @return
	 */
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
