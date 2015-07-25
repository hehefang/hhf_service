package com.hhf.service.product;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hhf.common.mybatis.Page;
import com.hhf.model.order.LogisticsCompany;
import com.hhf.model.product.BrandShow;
import com.hhf.model.product.BrandShowDetail;

public interface IBrandShowService {
	/**
	 * 新建特卖
	 * 
	 * @param brandShow
	 * @return
	 */
	public int newBrandShow(BrandShow brandShow);

	/**
	 * 修改特卖信息
	 * 
	 * @param brandShow
	 * @return
	 */
	public int modifyBrandShow(BrandShow brandShow);

	/**
	 * 修改特卖明细并提交
	 * 
	 * @param brandShowId
	 * @param details
	 * @return
	 */
	public int submitBrandShow(int brandShowId, BrandShowDetail[] details);

	/**
	 * 分页查询卖家的特卖
	 * 
	 * @param sellerId
	 * @param cond
	 * @param page
	 * @return
	 */
	public Page<BrandShow> queryMyBrandShowByPage(int sellerId,
			Map<String, ?> cond, int... page);

	/**
	 * 获得卖家所有正在进行的、结束的和终止的（曾经上线的）特卖
	 * 
	 * @param sellerId
	 * @return
	 */
	public List<BrandShow> getOnlinedBrandShowsOfSeller(int sellerId);

	/**
	 * 查询待审核的特卖
	 * 
	 * @param cond
	 * @param page
	 * @return
	 */
	public Page<BrandShow> queryWaitAuditBrandShowByPage(Map<String, ?> cond,
			int... page);

	public Page<BrandShow> queryBrandShowByPage(Map<String, ?> cond,
			int... page);

	/**
	 * 审核通过
	 * 
	 * @param brandShowId
	 * @param startDate
	 * @param endDate
	 * @param auditor
	 * @param opinion
	 * @return
	 */
	public int passAuditBrandShow(int brandShowId, Date startDate,
			Date endDate, String auditor, String opinion);

	/**
	 * 审核驳回
	 * 
	 * @param brandShowId
	 * @param auditor
	 * @param opinion
	 * @return
	 */
	public int rejectAuditBrandShow(int brandShowId, String auditor,
			String opinion);

	/**
	 * 开始活动
	 * 
	 * @param brandShowId
	 * @return
	 */
	public int startBrandShow(int brandShowId);

	/**
	 * 结束活动
	 * 
	 * @param brandShowId
	 * @return
	 */
	public int endBrandSow(int brandShowId);

	/**
	 * 
	 * @param brandShowId
	 *            特卖Id
	 * @return
	 */
	public BrandShow getBrandShowById(int brandShowId);

	public List<LogisticsCompany> getLogisticsCompanyListOfBrandShow(
			int brandShowId);

	/**
	 * 取活动明细
	 * 
	 * @param brandShowId
	 * @return
	 */
	public List<BrandShowDetail> getDetailsOfBrandShow(int brandShowId);

	/**
	 * 
	 * @param brandShowDetailId
	 *            特卖明细ID
	 * @return
	 */
	public BrandShowDetail getBrandShowDetailById(int brandShowDetailId);

	/**
	 * 
	 * @param brandShowIds
	 *            特卖ID列表
	 * @return
	 */
	public List<BrandShow> getBrandShowByIds(List<Integer> brandShowIds);

	/**
	 * 
	 * @param brandShowDetailIds
	 *            特卖明细ID列表
	 * @return
	 */
	public List<BrandShowDetail> getBrandShowDetailsByIds(
			List<Integer> brandShowDetailIds);

	/**
	 * 
	 * @param brandShowStockMapMq
	 */
	public void addStock(Map<Long, Long> brandShowStockMapMq);

	/**
	 * 
	 * @param brandShowDetailIds
	 *            有效的特卖明细列表
	 * @return
	 */
	public List<BrandShow> getValidBrandShows(BrandShow record);

	public BigDecimal getLowestPrice(int bsid);

	public Page<BrandShowDetail> getBrandShowDetailByPage(Map<?, ?> map,
			Page<BrandShowDetail> page);

	public BrandShowDetail getBrandShowDetailBySkuId(Integer brandShowId,
			Integer skuId);

	public int getBrandShowCountOfSellerByStatus(int sellerId, String status);
	
	public List<BrandShowDetail> getBrandShowDetailsByProdId(@Param("brandShowId")Integer brandShowId,
			@Param("prodId")Integer prodId);
}
