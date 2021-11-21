package cn.gok.beans.order;

public class OrderDetail {
    private int orderDetailId;
    private int orderId;
    private String goodId;
    private String goodName;
    private int goodCnt;
    private int goodPrice;
    private int averageCost;
    private double weight;
    private int distictMoney;
    private int whid;
    private String modifyTime;

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public OrderDetail(int orderId, String goodsId, String goodsName, int goodsCnt, int goodsPrice, Timestamp modifiedTime) {
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsCnt = goodsCnt;
        this.goodsPrice = goodsPrice;
        this.modifiedTime = modifiedTime;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public int getGoodCnt() {
        return goodCnt;
    }

    public void setGoodCnt(int goodCnt) {
        this.goodCnt = goodCnt;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(int averageCost) {
        this.averageCost = averageCost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}
