package com.hhf.service.seller;

import com.hhf.model.seller.SellerReceipt;

public interface ISellerReceiptService {

	/**
	 *  通过卖家ID获取开票信息
	 * @param receiptId 
	 * @return
	 */
	SellerReceipt getSellerReceiptById(int receiptId);
	/**
	 *  通过卖家ID获取开票信息
	 * @param sellerId
	 * @return
	 */
	SellerReceipt getSellerReceiptBySellerId(int sellerId);
	
	/**
	 *  更新发票信息
	 * @param receipt
	 * @return
	 */
	int updateSellerReceipt(SellerReceipt receipt);
	
	
}
