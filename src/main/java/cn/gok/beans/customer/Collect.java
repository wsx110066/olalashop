package cn.gok.beans.customer;

import java.sql.Timestamp;

/**
 * 我的收藏 类
 * @author 14489
 */
public class Collect {

    /**
     * 商品收藏ID
     */
    private int collectId;

    /**
     * 消费者ID
     */
    private String customerId;

    /**
     * 商品主键ID
     */
    private String goodsId;

    /**
     * 店铺主键ID
     */
    private String businessId;

    /**
     * 收藏时间
     */
    private Timestamp addTime;

    /**
     * 是否过期 0未过期 1过期
     */
    private boolean isExpires;

    /**
     * 过期时间
     */
    private Timestamp expiresDate;

    /**
     * 是否取消收藏 0否 1是
     */
    private boolean isCancel;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedTime;

    public Collect() {
    }

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public boolean isExpires() {
        return isExpires;
    }

    public void setExpires(boolean expires) {
        isExpires = expires;
    }

    public Timestamp getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Timestamp expiresDate) {
        this.expiresDate = expiresDate;
    }

    public boolean isCancel() {
        return isCancel;
    }

    public void setCancel(boolean cancel) {
        isCancel = cancel;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collectId=" + collectId +
                ", customerId='" + customerId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", businessId='" + businessId + '\'' +
                ", addTime=" + addTime +
                ", isExpires=" + isExpires +
                ", expiresDate=" + expiresDate +
                ", isCancel=" + isCancel +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
