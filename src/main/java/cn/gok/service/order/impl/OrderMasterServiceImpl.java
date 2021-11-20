package cn.gok.service.order.impl;

import cn.gok.beans.order.OrderMaster;
import cn.gok.dao.order.IOrderMasterDao;
import cn.gok.service.order.IOrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 14489
 */
@Service
public class OrderMasterServiceImpl implements IOrderMasterService {

    @Autowired
    IOrderMasterDao masterDao;
    @Override
    public List<OrderMaster> queryOrderMaster(String customerId) {
        return masterDao.queryOrderMaster(customerId);
    }
}
