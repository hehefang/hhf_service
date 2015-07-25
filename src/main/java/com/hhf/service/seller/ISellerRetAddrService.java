/**
 * Copyright (c)2015-? by www.hehefang.com. All rights reserved.
 * 
 */
package com.hhf.service.seller;

import java.util.List;

import com.hhf.model.seller.SellerRetAddress;

/**
 * 卖家退货地址服务
 * 
 * @author xuzunyuan
 * @date 2015年2月28日 */
public interface ISellerRetAddrService {
	int deleteSellerRetAddressById(Integer sRAId);
	
	int insertSellerRetAddress(SellerRetAddress retAddress);
	
	int updateSellerRetAddressById(SellerRetAddress retAddress);
	
	public List<SellerRetAddress> getValidAddrListOfSeller(int sellerId);

	public SellerRetAddress getAddrById(int id);
	
	/**
	 * @param sRAId
	 * @return 设置为默认收货地址
	 */
	public int setIsDefault(Integer sRAId, Integer sellerId);
}
