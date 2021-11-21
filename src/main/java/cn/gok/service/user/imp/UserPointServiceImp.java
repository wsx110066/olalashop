package cn.gok.service.user.imp;

import cn.gok.beans.user.UserPoint;
import cn.gok.dao.user.IUserDao;
import cn.gok.dao.user.IUserPointDao;
import cn.gok.service.user.IUserPointService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//用户积分service实现类
@Service
public class UserPointServiceImp implements IUserPointService {

    @Autowired
    IUserPointDao iUserPointDao;

    //查询积分
    @Override
    public List<UserPoint> queryCustomerPoints(String customerId) {
        return iUserPointDao.queryCustomerPoints(customerId);
    }

    //查询最后签到时间
    @Override
    public Date queryCustomerSignInPoints(String customerId) {
        return iUserPointDao.queryCustomerSignInPoints(customerId);
    }

    @Override
    public Integer insertCustomerPoints(@Param("customerId")String customerId, @Param("createTime") Date createTime) {
        return iUserPointDao.insertCustomerPoints(customerId,createTime);
    }
}
