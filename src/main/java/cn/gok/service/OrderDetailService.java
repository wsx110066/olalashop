package cn.gok.service;

import cn.gok.beans.order.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    public List<OrderDetail> queryDetailByOrderId(int orderId);
}
