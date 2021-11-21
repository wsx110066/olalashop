package cn.gok.service.user.imp;

import cn.gok.beans.user.Consignee;
import cn.gok.dao.user.IConsigneeDao;
import cn.gok.service.user.IConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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

    @Autowired
    IConsigneeDao iConsigneeDao;

    /**
     * 添加一个新的用户地址
     *
     * @param customerId 消费者id
     * @param userName   收货人
     * @param userPhone  手机号码
     * @param sheng      省
     * @param shi        市
     * @param qu         区
     * @param userInfo   详细地址
     * @return
     */
    @Override
    public Boolean addConsignee(String customerId, String userName, String userPhone, String sheng, String shi, String qu, String userInfo) {
        Consignee consignee = new Consignee(customerId, userName, "000000", sheng, shi, qu, userPhone, userInfo, 0, "", new Timestamp(System.currentTimeMillis()));
        Boolean flag = iConsigneeDao.addConsignee(consignee);
        return flag;
    }

    /**
     * 通过消费者id查询用户的地址
     *
     * @param customerId 消费者id
     * @return
     */
    @Override
    public List<cn.gok.beans.user.Consignee> queryConsigneeByCustomerId(String customerId) {
        return iConsigneeDao.queryConsigneeByCustomerId(customerId);
    }


}
