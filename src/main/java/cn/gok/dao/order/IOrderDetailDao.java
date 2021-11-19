package cn.gok.dao.order;

import cn.gok.beans.order.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderDetailDao {
    public List<OrderDetail> queryDetailByOrderId(@Param("orderId") long orderId);
}
