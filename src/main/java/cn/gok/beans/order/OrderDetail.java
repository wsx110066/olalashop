package cn.gok.beans.order;

import java.sql.Timestamp;

/**
 * 订单详情类
 * @author 14489
 */
public class OrderDetail {

    /**
     * 订单详情表ID
     */
    private int orderDetailId;

    /**
     * 订单表ID
     */
    private int orderId;

    /**
     * 订单商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 购买商品数量
     */
    private int goodsCnt;

    /**
     * 购买商品单价（分）
     */
    private int goodsPrice;

    /**
     * 平均成本价格（分）
     */
    private int averagePrice;

    /**
     * 商品重量
     */
    private float weight;

    /**
     * 优惠分摊金额（分）
     */
    private int districtMoney;

    /**
     * 仓库ID
     */
    private int whid;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedTime;

    public OrderDetail() {
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public int getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDistrictMoney() {
        return districtMoney;
    }

    public void setDistrictMoney(int districtMoney) {
        this.districtMoney = districtMoney;
    }

    public int getWhid() {
        return whid;
    }

    public void setWhid(int whid) {
        this.whid = whid;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailId +
                ", orderId=" + orderId +
                ", goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsCnt=" + goodsCnt +
                ", goodsPrice=" + goodsPrice +
                ", averagePrice=" + averagePrice +
                ", weight=" + weight +
                ", districtMoney=" + districtMoney +
                ", whid=" + whid +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
