package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;

public class Spec implements Serializable {
	private static final long serialVersionUID = 6693394109810538750L;

	private Long specId;

    private String specName;

    private String pingyin;

    private String showMode;

    private String status;

    private String createByName;

    private Date createByDate;

    private String lastUpdateByName;

    private Date lastUpdateByDate;

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getPingyin() {
        return pingyin;
    }

    public void setPingyin(String pingyin) {
        this.pingyin = pingyin;
    }

    public String getShowMode() {
        return showMode;
    }

    public void setShowMode(String showMode) {
        this.showMode = showMode;
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