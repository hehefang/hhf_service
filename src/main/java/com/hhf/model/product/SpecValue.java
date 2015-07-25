package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class SpecValue implements Serializable {
	private static final long serialVersionUID = -1746196142698813995L;

	private Long specValueId;

    private String specValueName;

    private String pinyin;

    private String imgUrl;

    private String status;

    private String createByName;

    private Date createByDate;

    private String lastUpdateByName;

    private Date lastUpdateByDate;

    public Long getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Long specValueId) {
        this.specValueId = specValueId;
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public Date getCreateByDate() {
        return createByDate;
    }

    public void setCreateByDate(Date createByDate) {
        this.createByDate = createByDate;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

    public Date getLastUpdateByDate() {
        return lastUpdateByDate;
    }

    public void setLastUpdateByDate(Date lastUpdateByDate) {
        this.lastUpdateByDate = lastUpdateByDate;
    }
}