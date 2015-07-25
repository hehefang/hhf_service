package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class ProductImg implements Serializable {
	private static final long serialVersionUID = 7289776196147712963L;

	private Integer prodImgId;

    private Integer prodId;

    private String imgTitle;

    private String imgUrl;

    private String imgDesc;

    private Byte sortRank;

    private String imgType;

    private String imgStatus;

    private Date createDate;

    public Integer getProdImgId() {
        return prodImgId;
    }

    public void setProdImgId(Integer prodImgId) {
        this.prodImgId = prodImgId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Byte getSortRank() {
        return sortRank;
    }

    public void setSortRank(Byte sortRank) {
        this.sortRank = sortRank;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public String getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(String imgStatus) {
        this.imgStatus = imgStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}