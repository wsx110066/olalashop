package cn.gok.beans.sys;

import java.io.Serializable;

public class sysMember implements Serializable {
    private Integer customerInfId;
    private String customerId;
    private String customerName;
    private String realName;
    private Integer gender;
    private Integer identyCardType;
    private String identyCardNo;
    private String birthday;
    private String userMobile;
    private String email;
    private String city;
    private Integer userPoint;
    private String registerTime;
    private String customerStatus;
    private Integer idDel;
    private Integer customerLevel;
    private Integer userBalance;
    private String remark;
    private String modifiedTime;

    public Integer getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getIdDel() {
        return idDel;
    }

    public void setIdDel(Integer idDel) {
        this.idDel = idDel;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public sysMember(){

    }

    public sysMember(Integer customerInfId, String customerId, String customerName, String realName, Integer gender, Integer identyCardType, String identyCardNo, String birthday, String userMobile, String email, String city) {
        this.customerInfId = customerInfId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.realName = realName;
        this.gender = gender;
        this.identyCardType = identyCardType;
        this.identyCardNo = identyCardNo;
        this.birthday = birthday;
        this.userMobile = userMobile;
        this.email = email;
        this.city = city;
    }

    public Integer getCustomerInfId() {
        return customerInfId;
    }

    public void setCustomerInfId(Integer customerInfId) {
        this.customerInfId = customerInfId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIdentyCardType() {
        return identyCardType;
    }

    public void setIdentyCardType(Integer identyCardType) {
        this.identyCardType = identyCardType;
    }

    public String getIdentyCardNo() {
        return identyCardNo;
    }

    public void setIdentyCardNo(String identyCardNo) {
        this.identyCardNo = identyCardNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
