package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class ProductCommentAdditional implements Serializable {
	private static final long serialVersionUID = 1200500306987840608L;

	private Integer pCAId;

    private Integer pCommentId;

    private Integer prodId;

    private Integer skuId;

    private String content;

    private Date createDate;

    private String createByIp;

    private Integer userId;

    private String nickname;

    private String status;

    public Integer getpCAId() {
        return pCAId;
    }

    public void setpCAId(Integer pCAId) {
        this.pCAId = pCAId;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}