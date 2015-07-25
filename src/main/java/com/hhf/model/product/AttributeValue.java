package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class AttributeValue implements Serializable {
	private static final long serialVersionUID = 5836500081642997193L;

	private Long attrValueId;

    private String attrValueName;

    private String pinyin;

    private String status;

    private String createByName;

    private Date createByDate;

    private String lastUpdateByName;

    private Date lastUpdateByDate;

    public Long getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    public String getAttrValueName() {
        return attrValueName;
    }

    public void setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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