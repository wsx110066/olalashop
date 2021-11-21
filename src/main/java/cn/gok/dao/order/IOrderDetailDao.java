package cn.gok.dao.order;

import cn.gok.beans.order.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderDetailDao {
    public List<OrderDetail> queryDetailByOrderId(@Param("orderId") long orderId);

    /**
     * 添加一个订单详细信息
     * @param orderDetail 订单详细信息
     * @return
     */
    Boolean addOrderDetail(OrderDetail orderDetail);

    public List<OrderDetail> queryDetailByOrderId(@Param("orderId") int orderId);
}
