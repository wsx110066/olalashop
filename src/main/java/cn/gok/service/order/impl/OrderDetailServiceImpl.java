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
class OrderDetailServiceImp implements IOrderDetailService {
    @Autowired
    IOrderDetailDao detailDao;


    @Override
    public List<OrderDetail> queryDetailByOrderId(Long orderId) {
        return detailDao.queryDetailByOrderId(orderId);
    }
}