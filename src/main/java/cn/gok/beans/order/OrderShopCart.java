package cn.gok.beans.order;

import java.sql.Timestamp;

/**
 * 购物车类
 * @author 14489
 */
public class OrderShopCart {

    /**
     * 购物车ID
     */
    private long shopCartId;

    /**
     * 消费者主键ID
     */
    private String customerId;

    /**
     * 如果该用户退出,该Session_id对应的购物车中所有记录都将被删除
     */
    private String sessionId;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品的唯一货号
     */
    private String goodsSn;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 购物车商品类型;0普通;1团够;2拍卖;3夺宝奇兵
     */
    private int cartType;

    /**
     * 商品属性,JSON形式
     */
    private String goodsAttr;

    /**
     * 加入购物车商品数量
     */
    private int goodsAmount;

    /**
     * 市场价(分)
     */
    private int marketPrice;

    /**
     * 本店价(分)
     */
    private int shopPrice;

    /**
     * 实际购买价格(分)
     */
    private int realBuyPrice;

    /**
     * 是否开售 1是 0否
     */
    private boolean openSaleIs;

    /**
     * 该商品的父商品ID,没有该值为0,有的话那该商品就是该id的配件
     */
    private String parentGoodsId;

    /**
     * 是否赠品 0否;1其他(参与活动的活动ID等)
     */
    private int giftIs;

    /**
     * 能否处理 0可以 1不可以
     */
    private boolean canHandle;

    /**
     * 加入购物车时间
     */
    private Timestamp addTime;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedTime;

    public OrderShopCart() {
    }

    public long getShopCartId() {
        return shopCartId;
    }

    public void setShopCartId(long shopCartId) {
        this.shopCartId = shopCartId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getCartType() {
        return cartType;
    }

    public void setCartType(int cartType) {
        this.cartType = cartType;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getRealBuyPrice() {
        return realBuyPrice;
    }

    public void setRealBuyPrice(int realBuyPrice) {
        this.realBuyPrice = realBuyPrice;
    }

    public boolean isOpenSaleIs() {
        return openSaleIs;
    }

    public void setOpenSaleIs(boolean openSaleIs) {
        this.openSaleIs = openSaleIs;
    }

    public String getParentGoodsId() {
        return parentGoodsId;
    }

    public void setParentGoodsId(String parentGoodsId) {
        this.parentGoodsId = parentGoodsId;
    }

    public int getGiftIs() {
        return giftIs;
    }

    public void setGiftIs(int giftIs) {
        this.giftIs = giftIs;
    }

    public boolean isCanHandle() {
        return canHandle;
    }

    public void setCanHandle(boolean canHandle) {
        this.canHandle = canHandle;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "OrderShopCart{" +
                "shopCartId=" + shopCartId +
                ", customerId='" + customerId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsSn='" + goodsSn + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", cartType=" + cartType +
                ", goodsAttr='" + goodsAttr + '\'' +
                ", goodsAmount=" + goodsAmount +
                ", marketPrice=" + marketPrice +
                ", shopPrice=" + shopPrice +
                ", realBuyPrice=" + realBuyPrice +
                ", openSaleIs=" + openSaleIs +
                ", parentGoodsId='" + parentGoodsId + '\'' +
                ", giftIs=" + giftIs +
                ", canHandle=" + canHandle +
                ", addTime=" + addTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
