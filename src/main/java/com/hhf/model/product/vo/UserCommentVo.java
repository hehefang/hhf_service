package com.hhf.model.product.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *  用户商品评论VO
 * @author hkM
 *
 */
public class UserCommentVo implements Serializable{
	private static final long serialVersionUID = 3045960851170185034L;
	
	private Integer pCommentId;	//主键ID
    private Integer skuId;		//skuID
    private Integer prodId;		//商品ID
    private Integer itemId;		//订单明细ID
    private Integer orderId;	//订单ID
    private String orderCode;	//订单编号
	private String createByIp;	//评论IP
	private Integer sellerId;	//卖家ID
	private Integer userId;		//评论会员ID
	private String nickname;	//评论会员昵称
	private String title;		//评论标题
	private String content;		//评论内容
	private Date buyDate;		//购买时间
	private Integer score;		//评论分数
    private String status;		//状态
    private String type;		//类型
    private	Integer serviceScore;	//服务态度得分
    private Integer prodScore;		//宝贝与描述相符得分
    private Integer logisticsScore;	//发货速度得分
    
	public Integer getpCommentId() {
		return pCommentId;
	}
	public void setpCommentId(Integer pCommentId) {
		this.pCommentId = pCommentId;
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
	public String getCreateByIp() {
		return createByIp;
	}
	public void setCreateByIp(String createByIp) {
		this.createByIp = createByIp;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getServiceScore() {
		return serviceScore;
	}
	public void setServiceScore(Integer serviceScore) {
		this.serviceScore = serviceScore;
	}
	public Integer getProdScore() {
		return prodScore;
	}
	public void setProdScore(Integer prodScore) {
		this.prodScore = prodScore;
	}
	public Integer getLogisticsScore() {
		return logisticsScore;
	}
	public void setLogisticsScore(Integer logisticsScore) {
		this.logisticsScore = logisticsScore;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    	
}
