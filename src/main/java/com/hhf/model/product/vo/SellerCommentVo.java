package com.hhf.model.product.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *  卖家回复评价VO
 * @author hkM
 *
 */
public class SellerCommentVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer pCommentId;	//主键ID
	private Integer sellerId;	//卖家ID
    private Integer prodId;		//商品ID
    private Integer skuId;		//skuID
    private Integer itemId;		//订单明细ID
    private Integer orderId;	//订单ID
    private String orderCode;	//订单编号
    private String replyContent;//卖家回复内容
    private Integer replyById;	//卖家登录ID
    private String replyByName;	//卖家登录名
    private Integer userId;		//评论人ID	
    private String nickname;	//评论人昵称
    private Date replyDate;		//卖家回复日期
    private Integer score;		//评论分数
    private String isReply;		//是否已回复
    private String replyByIp;	//评论人IP
    private String replyStatus;	//卖家评论状态
    private Integer replyScore;	//卖家回复评分
    
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getpCommentId() {
		return pCommentId;
	}
	public void setpCommentId(Integer pCommentId) {
		this.pCommentId = pCommentId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Integer getReplyById() {
		return replyById;
	}
	public void setReplyById(Integer replyById) {
		this.replyById = replyById;
	}
	public String getReplyByName() {
		return replyByName;
	}
	public void setReplyByName(String replyByName) {
		this.replyByName = replyByName;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getIsReply() {
		return isReply;
	}
	public void setIsReply(String isReply) {
		this.isReply = isReply;
	}
	public String getReplyByIp() {
		return replyByIp;
	}
	public void setReplyByIp(String replyByIp) {
		this.replyByIp = replyByIp;
	}
	public String getReplyStatus() {
		return replyStatus;
	}
	public void setReplyStatus(String replyStatus) {
		this.replyStatus = replyStatus;
	}
	public Integer getReplyScore() {
		return replyScore;
	}
	public void setReplyScore(Integer replyScore) {
		this.replyScore = replyScore;
	}
    
}
