package cn.gok.service.user.imp;

import cn.gok.beans.user.UserLogin;
import cn.gok.dao.user.IUserDao;
import cn.gok.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    IUserDao userDao;

    @Override
    public  UserLogin queryUserLoginService(String UserName, String Password) {
        return userDao.queryUserLoginService(UserName,Password);
    }

    @Override
    public int insertUserByEmailRegister(String customerId,String email, String Password) {


        return userDao.insertUserByEmailRegister(customerId,email, Password);
    }

    @Override
    public int insertUserByMoblieRegister(String customerId,String mobile, String Password) {
        return userDao.insertUserByMoblieRegister(customerId,mobile, Password);
    }


    @Override
    public UserLogin queryOneByName(String name) {
        return userDao.queryOneByName(name);
    }

    @Override
    public int queryOneIdByname(String name) {
        return userDao.queryOneIdByname(name);
    }
}
