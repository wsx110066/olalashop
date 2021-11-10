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
        return 0;
    }
}
