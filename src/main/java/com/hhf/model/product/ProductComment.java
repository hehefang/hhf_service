package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class ProductComment implements Serializable {
	private static final long serialVersionUID = -3596968871351702734L;

	private Integer pCommentId;

    private Integer prodId;

    private Integer skuId;

    private Integer itemId;

    private Integer orderId;

    private String orderCode;

    private Date createDate;

    private String createByIp;

    private Integer sellerId;

    private Integer userId;

    private String nickname;

    private String title;

    private String content;

    private Date buyDate;

    private Integer score;

    private String status;

    private String type;

    private String isReply;

    private String replyContent;

    private Integer replyScore;

    private String replyStatus;

    private Integer replyById;

    private String replyByName;

    private Date replyDate;

    private String isHaveAdditional;

    private String isHaveContent;

    /*
     * 追加评论
     */
    private ProductCommentAdditional productCommentAdditional;
    /*
     * 评论统计
     */
    private  ProductCommentStat productCommentStat; // 评论统计

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public String getIsReply() {
        return isReply;
    }

    public void setIsReply(String isReply) {
        this.isReply = isReply;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getReplyScore() {
        return replyScore;
    }

    public void setReplyScore(Integer replyScore) {
        this.replyScore = replyScore;
    }

    public String getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(String replyStatus) {
        this.replyStatus = replyStatus;
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

    public String getIsHaveAdditional() {
        return isHaveAdditional;
    }

    public void setIsHaveAdditional(String isHaveAdditional) {
        this.isHaveAdditional = isHaveAdditional;
    }

    public String getIsHaveContent() {
        return isHaveContent;
    }

    public void setIsHaveContent(String isHaveContent) {
        this.isHaveContent = isHaveContent;
    }

	public ProductCommentAdditional getProductCommentAdditional() {
		return productCommentAdditional;
	}

	public void setProductCommentAdditional(
			ProductCommentAdditional productCommentAdditional) {
		this.productCommentAdditional = productCommentAdditional;
	}

	public ProductCommentStat getProductCommentStat() {
		return productCommentStat;
	}

	public void setProductCommentStat(ProductCommentStat productCommentStat) {
		this.productCommentStat = productCommentStat;
	}
    
}