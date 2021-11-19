package cn.gok.service.user.imp;

import cn.gok.beans.user.Consignee;
import cn.gok.dao.user.IConsigneeDao;
import cn.gok.service.user.IConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsigneeServiceImp implements IConsigneeService {
    @Autowired
    IConsigneeDao consigneeDao;

    @Override
    public List<Consignee> queryUserConsignee(String id) {
        return consigneeDao.queryUserConsignee(id);
    }

    @Override
    public int insertConsignee(String name, String phone, String province, String city, String district, String address, String id) {
        return consigneeDao.insertConsignee(name, phone, province, city, district, address, id);
    }

    @Override
    public int deleteConsignee(int id) {
        return consigneeDao.deleteConsignee(id);
    }
}
