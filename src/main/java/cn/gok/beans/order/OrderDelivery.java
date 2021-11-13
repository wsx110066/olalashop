package cn.gok.beans.order;

import java.sql.Timestamp;

/**
 * 商品配送单类
 * @author 14489
 */
public class OrderDelivery {

    /**
     * 配送单编码
     */
    private int delivNo;

    /**
     * 快递单号
     */
    private String shipNo;

    /**
     * 快递公司名称
     */
    private String shipCompName;

    /**
     * 客户主键ID
     */
    private String customerId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 商品主键ID
     */
    private String goodsId;

    /**
     * 商品数量
     */
    private int quantity;

    /**
     * 商品单价
     */
    private int unitPrice;

    /**
     * 订单总价
     */
    private int totalPrice;

    /**
     * 配送费用（分）
     */
    private int delivFee;

    /**
     * 收件人姓名
     */
    private String custName;

    /**
     * 收货地址邮编
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
     * 收货地址
     */
    private String address;

    /**
     * 收货人联系方式
     */
    private String telNo;

    /**
     * 配送日期
     */
    private Timestamp delivDate;

    public OrderDelivery() {
    }

    public int getDelivNo() {
        return delivNo;
    }

    public void setDelivNo(int delivNo) {
        this.delivNo = delivNo;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getShipCompName() {
        return shipCompName;
    }

    public void setShipCompName(String shipCompName) {
        this.shipCompName = shipCompName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getDelivFee() {
        return delivFee;
    }

    public void setDelivFee(int delivFee) {
        this.delivFee = delivFee;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public Timestamp getDelivDate() {
        return delivDate;
    }

    public void setDelivDate(Timestamp delivDate) {
        this.delivDate = delivDate;
    }

    @Override
    public String toString() {
        return "OrderDelivery{" +
                "delivNo=" + delivNo +
                ", shipNo='" + shipNo + '\'' +
                ", shipCompName='" + shipCompName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderSn='" + orderSn + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", delivFee=" + delivFee +
                ", custName='" + custName + '\'' +
                ", zip='" + zip + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", telNo='" + telNo + '\'' +
                ", delivDate=" + delivDate +
                '}';
    }
}
