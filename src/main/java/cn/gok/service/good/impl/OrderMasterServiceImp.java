package cn.gok.service.imp;

import cn.gok.beans.order.OrderMaster;
import cn.gok.dao.OrderMasterDao;
import cn.gok.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderMasterServiceImp implements OrderMasterService {
    @Autowired
    OrderMasterDao masterDao;
    @Override
    public List<OrderMaster> queryOrderMaster(String customerId) {
        return masterDao.queryOrderMaster(customerId);
    }
}
