package cn.gok.beans.order;

import java.sql.Timestamp;

/**
 * 商品退货单类
 * @author 14489
 */
public class OrderRefund {

    /**
     * 退货单编号
     */
    private String refundOrderId;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 原始订单ID
     */
    private int orderId;

    /**
     * 交易流水号
     */
    private String transactionNo;

    /**
     * 配送费用（分）
     */
    private int delivFee;

    /**
     * 配送日期
     */
    private Timestamp delivDate;

    /**
     * 退货原因
     */
    private String refundReason;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品数量
     */
    private int quantity;

    /**
     * 退货人
     */
    private String custName;

    /**
     * 退货时间
     */
    private Timestamp refundDate;

    /**
     * 退货状态 0已提交审核 1审核通过，同意退货 2退货中 3退货完成
     */
    private int refundStatus;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedTime;

    public OrderRefund() {
    }

    public String getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public int getDelivFee() {
        return delivFee;
    }

    public void setDelivFee(int delivFee) {
        this.delivFee = delivFee;
    }

    public Timestamp getDelivDate() {
        return delivDate;
    }

    public void setDelivDate(Timestamp delivDate) {
        this.delivDate = delivDate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Timestamp getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Timestamp refundDate) {
        this.refundDate = refundDate;
    }

    public int getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(int refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "OrderRefund{" +
                "refundOrderId='" + refundOrderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderId=" + orderId +
                ", transactionNo='" + transactionNo + '\'' +
                ", delivFee=" + delivFee +
                ", delivDate=" + delivDate +
                ", refundReason='" + refundReason + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", quantity=" + quantity +
                ", custName='" + custName + '\'' +
                ", refundDate=" + refundDate +
                ", refundStatus=" + refundStatus +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
