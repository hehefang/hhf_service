/**
 * Copyright (c)2015-? by www.hhf.com. All rights reserved.
 * 
 */
package com.hhf.service.product;

import java.util.List;
import java.util.Map;

import com.hhf.common.mybatis.Page;
import com.hhf.model.product.Brand;
import com.hhf.model.product.SellerBrand;

/**
 * 卖家品牌服务
 * 
 * @author xuzunyuan
 * @date 2015年2月5日
 */
public interface ISellerBrandService {
	public SellerBrand getSellerBrandById(int id);

	// 获取卖家品牌，包括正常、待审核、驳回的品牌
	public List<SellerBrand> getSellerBrandList(int sellerId);

	// 获取卖家（有效）品牌
	public List<Brand> getValidBrandListOfSeller(int sellerId);

	// 新申请品牌
	public int applySellerBrand(SellerBrand sellerBrand);

	// 重新提交申请
	public int updateApplySellerBrand(SellerBrand sellerBrand);

	// 分页获取卖家申请，按提交时间倒叙
	public Page<SellerBrand> queryWaitAuditApplyByPage(
			Map<String, Object> cond, int... page);

	// 通过审核
	public int passApply(String auditor, String opinion, int... sellerBrandId);

	// 驳回审核
	public int rejectApply(String auditor, String opinion, int... sellerBrandId);

	// 是否已经存在卖家品牌（含有效、正在申请流程中的）
	public boolean existSellerBrand(int sellerId, int brandId);

}
