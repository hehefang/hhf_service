package com.hhf.model.product;

import java.io.Serializable;

public class BcSpec implements Serializable {
	private static final long serialVersionUID = -2750724936705067748L;

	private Long bcSpecId;

    private Integer bcId;

    private Long specId;

    private Integer displayOrder;

    private String status;

    private Boolean isFilter;

    public Long getBcSpecId() {
        return bcSpecId;
    }

    public void setBcSpecId(Long bcSpecId) {
        this.bcSpecId = bcSpecId;
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsFilter() {
        return isFilter;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }
}