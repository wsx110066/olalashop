package cn.gok.dao.order;

import cn.gok.beans.order.OrderMaster;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderMasterDao {

    /**
     * 添加一个订单主体
     *
     * @param orderMaster 订单主体
     * @return
     */
    Boolean addOrderMaster(OrderMaster orderMaster);

    /**
     * 通过订单编号查询订单
     * @param orderSn
     * @return
     */
    OrderMaster queryOrderMasterBySn(String orderSn);

    public List<OrderMaster> queryOrderMaster(String customerId);
}
