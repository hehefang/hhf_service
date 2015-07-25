package com.hhf.param.cart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hhf.param.cart.Cart;
import com.hhf.common.util.NumberUtils;

public class MiniCart implements Serializable{
	private static final long serialVersionUID = 1150920684376315390L;

	private Long totalNum;
	private BigDecimal totalMoney;
	private List<Cart> carts = new ArrayList<Cart>();
	public Long getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public BigDecimal getTotalMoney() {
		return totalMoney;
	}
	public String getStrTotalMoney(){
		return NumberUtils.format(this.getTotalMoney());
	}
	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
}
