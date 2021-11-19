package cn.gok.service.order;

import cn.gok.beans.order.OrderMaster;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderMasterService {
    public List<OrderMaster> queryOrderMaster(String customerId);
}
