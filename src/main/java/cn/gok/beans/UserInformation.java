package cn.gok.beans;

import java.io.Serializable;

public class UserInformation implements Serializable {
    private int customerInfId;
    private String customerId;
    private String customerName;
    private String realName;
    private int identyCardType;
    private String identyCardNo;
    private String userMobile;
    private String email;
    private int gender;
    private String birthday;
    private String city;
    private int userPoint;
    private String registerTime;
    private int isdel;
    private int customerStatus;
    private int customerLevel;
    private int userBalance;
    private String remark;
    private String modifiedTime;

    public int getCustomerInfId() {
        return customerInfId;
    }

    public void setCustomerInfId(int customerInfId) {
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

    public int getIdentyCardType() {
        return identyCardType;
    }

    public void setIdentyCardType(int identyCardType) {
        this.identyCardType = identyCardType;
    }

    public String getIdentyCardNo() {
        return identyCardNo;
    }

    public void setIdentyCardNo(String identyCardNo) {
        this.identyCardNo = identyCardNo;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public int getIsdel() {
        return isdel;
    }

    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }

    public int getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(int customerStatus) {
        this.customerStatus = customerStatus;
    }

    public int getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(int customerLevel) {
        this.customerLevel = customerLevel;
    }

    public int getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(int userBalance) {
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
}
