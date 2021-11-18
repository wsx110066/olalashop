package cn.gok.service.imp;

import cn.gok.dao.UserDao;
import cn.gok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int queryUserLoginService(String UserName, String Password) {
        return userDao.queryUserLogin(UserName,Password);
    }

    @Override
    public int insertUserRegisterService(String email, String Password) {
        return userDao.insertUserRegister(email,Password);
    }
}
