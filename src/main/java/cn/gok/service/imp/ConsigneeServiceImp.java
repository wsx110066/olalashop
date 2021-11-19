package cn.gok.service.imp;

import cn.gok.beans.Consignee;
import cn.gok.dao.ConsigneeDao;
import cn.gok.service.ConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsigneeServiceImp implements ConsigneeService {
    @Autowired
    ConsigneeDao consigneeDao;

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
