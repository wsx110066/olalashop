package cn.gok.beans.user;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户地址管理
 *
 * @author 14489
 */
public class Consignee implements Serializable {

    /**
     * 自增主键ID
     */
    private int customerAddrId;

    /**
     * 消费者主键ID
     */
    private String customerId;

    /**
     * 客户名
     */
    private String customerUsername;

    /**
     * 邮编
     */
    private String zip;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 城市中的区域
     */
    private String district;

    /**
     * 客户手机号
     */
    private String customerUserphone;

    /**
     * 地址 具体到门牌号
     */
    private String address;

    /**
     * 是否默认 0否 1默认
     */
    private int defaultIs;

    /**
     *
     */
    private String backup;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedtime;

    public Consignee() {
    }

    public Consignee(String customerId, String customerUsername, String zip, String province, String city, String district, String customerUserphone, String address, int defaultIs, String backup, Timestamp modifiedtime) {
        this.customerId = customerId;
        this.customerUsername = customerUsername;
        this.zip = zip;
        this.province = province;
        this.city = city;
        this.district = district;
        this.customerUserphone = customerUserphone;
        this.address = address;
        this.defaultIs = defaultIs;
        this.backup = backup;
        this.modifiedtime = modifiedtime;
    }

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

    public String getCustomerUserphone() {
        return customerUserphone;
    }

    public void setCustomerUserphone(String customerUserphone) {
        this.customerUserphone = customerUserphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDefaultIs() {
        return defaultIs;
    }

    public void setDefaultIs(int defaultIs) {
        this.defaultIs = defaultIs;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public Timestamp getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Timestamp modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    @Override
    public String toString() {
        return "Consignee{" +
                "customerAddrId=" + customerAddrId +
                ", customerId='" + customerId + '\'' +
                ", customerUsername='" + customerUsername + '\'' +
                ", zip='" + zip + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", customerUserphone='" + customerUserphone + '\'' +
                ", address='" + address + '\'' +
                ", defaultIs=" + defaultIs +
                ", backup='" + backup + '\'' +
                ", modifiedtime=" + modifiedtime +
                '}';
    }
}