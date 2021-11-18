package cn.gok.dao;

import cn.gok.beans.order.OrderMaster;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMasterDao {
    public List<OrderMaster> queryOrderMaster(@Param("customerId") String customerId);
}
