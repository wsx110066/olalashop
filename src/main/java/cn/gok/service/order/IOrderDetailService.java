package cn.gok.service.order;

import cn.gok.beans.order.OrderDetail;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderDetailService {
    public List<OrderDetail> queryDetailByOrderId(Long orderId);

    /**
     * 添加一个订单明细
     * @param orderDetail 订单明细
     * @return
     */
    Boolean addOrderDetail(OrderDetail orderDetail);

    public List<OrderDetail> queryDetailByOrderId(int orderId);
}
