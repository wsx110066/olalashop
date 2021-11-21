package cn.gok.service.order.impl;

import cn.gok.beans.order.OrderDetail;
import cn.gok.dao.order.IOrderDetailDao;
import cn.gok.service.order.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 14489
 */
@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

    /**
     * 订单明细
     */
    @Autowired
    IOrderDetailDao iOrderDetailDao;

    @Override
    public List<OrderDetail> queryDetailByOrderId(Long orderId) {
        return iOrderDetailDao.queryDetailByOrderId(orderId);
    }

    /**
     * 添加一个订单明细
     *
     * @param orderDetail 订单明细
     * @return
     */
    @Override
    public Boolean addOrderDetail(OrderDetail orderDetail) {
        return iOrderDetailDao.addOrderDetail(orderDetail);
    }

    @Override
    public List<OrderDetail> queryDetailByOrderId(int orderId) {
        return iOrderDetailDao.queryDetailByOrderId(orderId);
    }
}
