package com.hhf.model.product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BaseCategory implements Serializable {
	private static final long serialVersionUID = -8469240612799673131L;

	private Integer bcId;

    private String bcName;

    private String bcCode;

    private String bcLevel;

    private Integer pBcId;

    private String pathId;

    private String pathName;

    private Boolean isLeaf;

    private Integer displayOrder;

    private Date createDate;

    private Date updateData;

    private String status;

    private List<BaseCategory> categories;
    
    public List<BaseCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<BaseCategory> categories) {
		this.categories = categories;
	}

	public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName;
    }

    public String getBcCode() {
        return bcCode;
    }

    public void setBcCode(String bcCode) {
        this.bcCode = bcCode;
    }

    public String getBcLevel() {
        return bcLevel;
    }

    public void setBcLevel(String bcLevel) {
        this.bcLevel = bcLevel;
    }

    public Integer getpBcId() {
		return pBcId;
	}

	public void setpBcId(Integer pBcId) {
		this.pBcId = pBcId;
	}

	public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public Boolean getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateData() {
        return updateData;
    }

    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}