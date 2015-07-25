package com.hhf.model.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductCommentStat implements Serializable {
	private static final long serialVersionUID = 2353856062320671742L;

	private Integer pCSId;

    private Integer prodId;

    private Integer totalNumber;

    private Integer systemNumber;

    private BigDecimal prodScore;

    private Integer bestNumber;

    private Integer midNumber;

    private Integer badNumber;

    private Integer additionalNumber;

    public Integer getpCSId() {
        return pCSId;
    }

    public void setpCSId(Integer pCSId) {
        this.pCSId = pCSId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getSystemNumber() {
        return systemNumber;
    }

    public void setSystemNumber(Integer systemNumber) {
        this.systemNumber = systemNumber;
    }

    public BigDecimal getProdScore() {
        return prodScore;
    }

    public void setProdScore(BigDecimal prodScore) {
        this.prodScore = prodScore;
    }

    public Integer getBestNumber() {
        return bestNumber;
    }

    public void setBestNumber(Integer bestNumber) {
        this.bestNumber = bestNumber;
    }

    public Integer getMidNumber() {
        return midNumber;
    }

    public void setMidNumber(Integer midNumber) {
        this.midNumber = midNumber;
    }

    public Integer getBadNumber() {
        return badNumber;
    }

    public void setBadNumber(Integer badNumber) {
        this.badNumber = badNumber;
    }

    public Integer getAdditionalNumber() {
        return additionalNumber;
    }

    public void setAdditionalNumber(Integer additionalNumber) {
        this.additionalNumber = additionalNumber;
    }
}