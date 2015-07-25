/**
 * Copyright (c)2013-2014 by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.service.seller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.hhf.model.seller.Seller;
import com.hhf.model.seller.SellerRetAddress;

/**
 * 卖家服务接口
 * 
 * @author xuzunyuan
 * @date 2013年12月26日
 */
public interface ISellerService {
	// 根据登录ID取卖家信息
	public Seller getSellerByLoginId(int loginId);

	// 根据ID取卖家信息
	public Seller getSellerById(int sellerId);

	/**
	 * 更新卖家信息
	 * 
	 * @param seller
	 * @return 失败返回0
	 */
	public int updateSeller(Seller seller);

	/**
	 * 保证金到账确认
	 * 
	 * @param sellerId
	 * @param depositDate
	 * @param depositAuditor
	 * @return
	 */
	public int confirmDeposit(int sellerId, Date depositDate,
			String depositAuditor);

	/**
	 * 根据卖家id获取卖家信息
	 * @param sellerIds
	 * @return
	 */
	public List<Seller> getSellersByIds(Set<Long> sellerIds);
	
	/**
	 * 根据id获取卖家退货地址
	 * @param sRAId
	 * @return
	 */
	public SellerRetAddress getSellerRetAddress(Integer sRAId);
}
