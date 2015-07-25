package com.hhf.service.user;

import java.util.List;

import com.hhf.model.user.UserAddress;


public interface IAddressService {
	
	/**
	 * 根据地址id获取用户地址
	 * @param addressId
	 * @return
	 */
	public UserAddress getAddressById(long addressId);
	
	/**
	 * 根据用户id获取用户地址列表
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getAddressesByUserId(long userId);
	
	/**
	 * 添加收货地址
	 * @param address
	 * @return
	 */
	public int addAddress(UserAddress address);
	
	/**
	 * 删除收货地址
	 * @param addrId
	 * @return
	 */
	public int delAddress(long addrId);
	
	/**
	 * 修改收货地址
	 * @param address
	 * @return
	 */
	public int updateAddress(UserAddress address);

	/**
	 * 设置默认收货地址
	 * @param address
	 * @return
	 */
	public void setDefault(String addrId, String userId);

	/**
	 * 删除收货地址
	 * @param addrId
	 * @param userId
	 */
	public void delAddr(Long addrId, long userId);

	/**
	 * 获取收货地址
	 * @param addrId
	 * @param userId
	 * @return
	 */
	public UserAddress getAddressByIdUid(Long addrId, long userId);
}
