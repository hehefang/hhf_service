package com.hhf.model.order;

import java.io.Serializable;
import java.util.Date;

public class LogisticsCompany implements Serializable{
    private Long logisticsCompId;

    private String logisticsCompName;

    private String linkman;

    private String tel;

    private String mobile;

    private Long province;

    private String provinceName;

    private Long city;

    private String cityName;

    private Long district;

    private String districtName;

    private Long town;

    private String townName;

    private String addr;

    private String zipCode;

    private String lawman;

    private String apiUrl;

    private String status;

    private Date createDate;

    private Date updateDate;

    private String updateByName;

    private String remark;

    public Long getLogisticsCompId() {
        return logisticsCompId;
    }

    public void setLogisticsCompId(Long logisticsCompId) {
        this.logisticsCompId = logisticsCompId;
    }

    public String getLogisticsCompName() {
        return logisticsCompName;
    }

    public void setLogisticsCompName(String logisticsCompName) {
        this.logisticsCompName = logisticsCompName == null ? null : logisticsCompName.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Long getDistrict() {
        return district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Long getTown() {
        return town;
    }

    public void setTown(Long town) {
        this.town = town;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getLawman() {
        return lawman;
    }

    public void setLawman(String lawman) {
        this.lawman = lawman == null ? null : lawman.trim();
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl == null ? null : apiUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName == null ? null : updateByName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}