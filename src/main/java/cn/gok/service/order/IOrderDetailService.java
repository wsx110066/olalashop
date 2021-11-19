package cn.gok.service.order;

import cn.gok.beans.order.OrderDetail;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderDetailService {
    public List<OrderDetail> queryDetailByOrderId(Long orderId);
}
