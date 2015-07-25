package com.hhf.param.cart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CookieCartItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5373641727775842709L;

	// 特卖明细ID
	private Long bsdid;
	// 数量
	private Long num;
	// 是否选中
	private boolean selected;

	public Long getNum() {
		return num;
	}
	public Long getBsdid() {
		return bsdid;
	}
	public void setBsdid(Long bsdid) {
		this.bsdid = bsdid;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public CartItem transferCartItem(){
		CartItem cartItem = new CartItem();
		cartItem.setBrandShowDetailId(this.bsdid);
		cartItem.setNum(this.num);
		cartItem.setSelected(this.selected);

		return cartItem;
	}
}
