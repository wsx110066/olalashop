package cn.gok.service;

import cn.gok.beans.order.OrderMaster;

import java.util.List;

public interface OrderMasterService {
    public List<OrderMaster> queryOrderMaster(String customerId);
}
