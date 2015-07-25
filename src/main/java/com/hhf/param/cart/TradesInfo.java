package com.hhf.param.cart;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 结算页面映射类 收货地址，支付类型
 * 
 * @author xiaotao
 */
public class TradesInfo implements Serializable {
	private static final long serialVersionUID = -4085013559636722232L;
	
	private Integer payAddrId;
    
    private String payMode;
    
    private String orderType;
    
    private String orderSource;

	public Integer getPayAddrId() {
		return payAddrId;
	}

	public void setPayAddrId(Integer payAddrId) {
		this.payAddrId = payAddrId;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

}