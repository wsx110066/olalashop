package cn.gok.dao;

import cn.gok.beans.order.OrderDetail;
import org.apache.ibatis.annotations.Param;

import javax.management.Query;
import java.util.List;

public interface OrderDetailDao {
    public List<OrderDetail> queryDetailByOrderId(@Param("orderId") int orderId);
}
