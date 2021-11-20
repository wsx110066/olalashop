package cn.gok.dao.order;

import cn.gok.beans.order.OrderMaster;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderMasterDao {
    public List<OrderMaster> queryOrderMaster(String customerId);
}
