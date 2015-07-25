package com.hhf.service.product;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.hhf.common.mybatis.Page;
import com.hhf.model.product.ProductComment;
import com.hhf.model.product.ProductCommentAdditional;
import com.hhf.model.product.ProductCommentStat;
import com.hhf.model.product.vo.SellerCommentVo;
import com.hhf.model.product.vo.UserCommentVo;

/**
 * 	商品评论服务
 * @author hkM
 *
 */
@Service("productCommentService")
public interface IProductCommentService {


	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----商品评论 CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	
	/**
	 * 添加买家评论信息（网站端调用）
	 * @param userCommentVo 买家回复信息
	 * @return
	 */
	public boolean addUserComment(UserCommentVo userCommentVo);
	
	/**
	 * 添加卖家回复评论信息
	 * @param sellerCommentVo
	 * @return
	 */
	public boolean addSellerComment(SellerCommentVo sellerCommentVo);
	
	/**
	 * 买家删除自己评论信息（不影响评分和统计结果）
	 * @param userId
	 * @param pCommentId
	 * @return
	 */
	public boolean delUserProductComment(Integer pCommentId,Integer userId);

	/**
	 * 卖家删除回复信息
	 * @param pCommentId
	 * @param sellerId	
	 * @return
	 */
	public boolean delSellerProductComment(Integer pCommentId,Integer sellerId);
	
	/**
	 *  通过主键ID获取评论信息
	 * @param pCommentId
	 * @return
	 */
	public ProductComment getProductCommentByPrimaryKey(Integer pCommentId);
	
	/**
	 *  买家评论列表
	 * @param userId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getUserProductCommentPage(Integer userId,Page<ProductComment> page);	
	
	/**
	 * 卖家评论列表 
	 * @param sellerId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getSellerProductCommentPage(Integer sellerId,Page<ProductComment> page);

	/**
	 * 待评价回复列表 （Seller 后台）
	 * @param sellerId
	 * @param page
	 * @return
	 */
	public Page<ProductComment> getWaitProductCommentPage(Integer sellerId,Page<ProductComment> page);
	
	/**
	 *  通过好评率获得评论列表	 例： 只看好评 4-5分
	 * @param startScore	好评起始分值
	 * @param endScore		好评结束分值
	 * @return
	 */
	public List<ProductComment> getProductCommentByReplyRate(Integer startScore,Integer endScore);
	
	/**
	 *  删除卖家评论 (seller后台)
	 * @param pCommentId
	 * @throws DataAccessException
	 */
	public boolean delSellerProductComment(Integer pCommentId) throws DataAccessException;
	
	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----商品统计 CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	
	/**
	 *  通过商品ID获取商品统计信息
	 * @param prodId
	 * @return
	 */
	public ProductCommentStat getProductCommentByProdId(Integer prodId);
	
	/*－－－－－－－－－－－－－－－－－－－-－－－-－－－－－-----追加评论 CRUD----－－－－－－－-－－－－－－－－－－－－－－－－－－－－－*/	
	
	/**
	 *  添加追加评论
	 * @param productCommentAdditional
	 * @return
	 */
	public boolean addProductCommentAdditional(ProductCommentAdditional pCommentAdditional);
	
	/**
	 * 修改追加评论信息
	 * @param productCommentAdditional
	 * @return
	 */
	public boolean editProductCommentAdditional(ProductCommentAdditional pCommentAdditional);
	
	/**
	 * 通过主键ID删除追加评论信息
	 * @param pCAId
	 * @return
	 */
	public boolean deleteProductCommentAdditional(Integer pCAId);
	
	/**
	 *  通过主键ID获取追加评论信息
	 * @param pCAId
	 * @return
	 */
	public ProductCommentAdditional getProductCommentAdditionalByPrimaryKey(Integer pCAId);
	
	/**
	 *  只看追加评论信息
	 * @param prodId 商品ID
	 * @return
	 */
	public Page<ProductCommentAdditional> getProductCommentAdditionalByProdId(Integer prodId,String status,Page<ProductCommentAdditional> page);
	
	/**
	 *  获得追加评论信息
	 * @param pCommentId
	 * @param status
	 * @return
	 */
	public ProductCommentAdditional getProductCommentAdditionalByPCommentId(Integer pCommentId,String status);
	
}
