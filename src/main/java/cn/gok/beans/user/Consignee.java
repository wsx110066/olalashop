package cn.gok.beans.user;

import java.io.Serializable;
//用户地址管理
public class Consignee implements Serializable {
    private int customerAddrId;
    private String customerId;
    private String customerUsername;
    private String zip;
    private String customerUserphone;
    private String province;
    private String city;
    private String district;
    private String address;
    private int isDefault;
    private String backup;
    private String modifiedtime;

    public int getCustomerAddrId() {
        return customerAddrId;
    }

    public void setCustomerAddrId(int customerAddrId) {
        this.customerAddrId = customerAddrId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCustomerUserphone() {
        return customerUserphone;
    }

    public void setCustomerUserphone(String customerUserphone) {
        this.customerUserphone = customerUserphone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}
