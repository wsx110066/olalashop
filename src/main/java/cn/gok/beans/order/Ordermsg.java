package cn.gok.beans.order;

import java.sql.Timestamp;

public class Ordermsg {
    //OrderMaster属性
    private int orderId;
    //
    private String orderSn;
    private String transationNo;
    private String customerId;
    private int payType;
    //
    private Timestamp payTime;
    //
    private int orderMoney;
    private int districtMoney;
    private int payMoney;
    private String createTime;
    private String reciveTime;
    //
    private int orderStatus;
    private int orderPoint;
    private String invoiceTitle;
    private String invoiceNo;
    private String modifyTime;
    //OrderDetail属性
    private int orderDetailId;
    private String goodId;
    //
    private String goodsName;
    //
    private int goodsCnt;
    //
    private int goodsPrice;
    private int averageCost;
    private double weght;
    private int distictMoney;
    private int whid;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getTransationNo() {
        return transationNo;
    }

    public void setTransationNo(String transationNo) {
        this.transationNo = transationNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public int getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(int orderMoney) {
        this.orderMoney = orderMoney;
    }

    public int getDistrictMoney() {
        return districtMoney;
    }

    public void setDistrictMoney(int districtMoney) {
        this.districtMoney = districtMoney;
    }

    public int getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(int payMoney) {
        this.payMoney = payMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getReciveTime() {
        return reciveTime;
    }

    public void setReciveTime(String reciveTime) {
        this.reciveTime = reciveTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(int orderPoint) {
        this.orderPoint = orderPoint;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public int getGoodsCnt() {
        return goodsCnt;
    }

    public void setGoodsCnt(int goodsCnt) {
        this.goodsCnt = goodsCnt;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(int averageCost) {
        this.averageCost = averageCost;
    }

    public double getWeght() {
        return weght;
    }

    public void setWeght(double weght) {
        this.weght = weght;
    }

    public int getDistictMoney() {
        return distictMoney;
    }

    public void setDistictMoney(int distictMoney) {
        this.distictMoney = distictMoney;
    }

    public int getWhid() {
        return whid;
    }

    public void setWhid(int whid) {
        this.whid = whid;
    }
}
