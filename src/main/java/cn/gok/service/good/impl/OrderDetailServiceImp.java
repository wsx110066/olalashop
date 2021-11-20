package cn.gok.service.imp;

import cn.gok.beans.order.OrderDetail;
import cn.gok.dao.OrderDetailDao;
import cn.gok.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImp implements OrderDetailService {
    @Autowired
    OrderDetailDao detailDao;
    @Override
    public List<OrderDetail> queryDetailByOrderId(int orderId) {
        return detailDao.queryDetailByOrderId(orderId);
    }
}
