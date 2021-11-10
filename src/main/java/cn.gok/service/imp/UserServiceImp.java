package cn.gok.service.imp;

import cn.gok.beans.UserLogin;
import cn.gok.dao.UserDao;
import cn.gok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public  UserLogin queryUserLoginService(String UserName, String Password) {
        return userDao.queryUserLogin(UserName,Password);
    }

    @Override
    public int insertUserByEmailRegister(String email, String Password) {
        return userDao.insertUserByEmailRegister(email, Password);
    }

    @Override
    public int insertUserByMoblieRegister(String mobile, String Password) {
        return userDao.insertUserByMoblieRegister(mobile, Password);
    }


    @Override
    public UserLogin queryOneByName(String name) {
        return userDao.queryUserByName(name);
    }
}
