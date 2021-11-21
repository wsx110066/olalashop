package cn.gok.beans.order;

import java.sql.Timestamp;

/**
 * 订单主类
 * @author 14489
 */
public class OrderMaster {

    /**
     * 订单ID
     */
    private long orderId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 交易流水号
     */
    private String transactionNo;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    private int payType;

    /**
     * 支付时间
     */
    private Timestamp payTime;

    /**
     * 订单金额（分）
     */
    private int orderMoney;

    /**
     * 优惠金额（分）
     */
    private int districtMoney;

    /**
     * 支付金额（分）
     */
    private int payMoney;

    /**
     * 下单时间
     */
    private Timestamp createTime;

    /**
     * 收货时间
     */
    private Timestamp receiveTime;

    /**
     * 订单状态 0未支付 1已支付 2已完成 3待退款 4已退款 5已关闭
     */
    private int orderStatus;

    /**
     * 订单积分
     */
    private int orderPoint;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 发票单号
     */
    private String invoiceNo;

    /**
     * 最后修改时间
     */
    private Timestamp modifiedTime;

    public OrderMaster() {
    }

    public OrderMaster(String orderSn, String transactionNo, String customerId, int payType, Timestamp payTime, int orderMoney, int districtMoney, int payMoney, Timestamp createTime, int orderStatus, int orderPoint, Timestamp modifiedTime) {
        this.orderSn = orderSn;
        this.transactionNo = transactionNo;
        this.customerId = customerId;
        this.payType = payType;
        this.payTime = payTime;
        this.orderMoney = orderMoney;
        this.districtMoney = districtMoney;
        this.payMoney = payMoney;
        this.createTime = createTime;
        this.orderStatus = orderStatus;
        this.orderPoint = orderPoint;
        this.modifiedTime = modifiedTime;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
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

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "OrderMaster{" +
                "orderId=" + orderId +
                ", orderSn='" + orderSn + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", customerId='" + customerId + '\'' +
                ", payType=" + payType +
                ", payTime=" + payTime +
                ", orderMoney=" + orderMoney +
                ", districtMoney=" + districtMoney +
                ", payMoney=" + payMoney +
                ", createTime=" + createTime +
                ", receiveTime=" + receiveTime +
                ", orderStatus=" + orderStatus +
                ", orderPoint=" + orderPoint +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
