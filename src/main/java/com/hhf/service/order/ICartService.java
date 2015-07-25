package com.hhf.service.order;

import java.util.List;
import java.util.Set;

import com.hhf.param.cart.Cart;
import com.hhf.param.cart.CartItem;
import com.hhf.param.cart.MiniCart;

public interface ICartService {
	/**
	 * 
	 * @param cookieCart
	 * @return
	 */
	public List<Cart> showCart(String cookieCart);
	
	
	/**
	 * 
	 * @param cookieCart
	 * @return
	 */
	public List<CartItem> getCartItemsByCookie(String cookieCart);
	
	/**
	 * 
	 * @param cookieCart
	 * @return
	 */
	public MiniCart showMiniCart(String cookieCart);

	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailId
	 * @param newQuantity
	 * @param oldQuantity
	 * @return
	 */
	public List<CartItem> modifyQuantity(String cookieCart, Long bsDetailId, long newQuantity, long oldQuantity);
	
	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailIds
	 * @return
	 */
	public List<CartItem> deleteCartItems(String cookieCart,Set<Long> bsDetailIds);

	/**
	 * 
	 * @param cookieCart
	 * @return
	 */
	public List<CartItem> clearFailureProduct(String cookieCart);

	/**
	 * 过滤选中的商品
	 * 
	 * @param cartItems
	 */
	public List<CartItem> filterSelectedCart(List<CartItem> cartItems);

	/**
	 * 
	 * @param cartItems
	 * @return
	 */
	public boolean hasErrorOnSelectedCart(List<CartItem> cartItems);

	/**
	 * 
	 * @param cookieCart
	 * @param bsDetailIds
	 * @param checked
	 * @return
	 */
	public List<CartItem> chgChecked(String cookieCart, Set<Long> bsDetailIds, boolean checked);
}
