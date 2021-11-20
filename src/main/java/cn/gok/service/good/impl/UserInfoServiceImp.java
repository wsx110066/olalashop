package cn.gok.service.imp;

import cn.gok.beans.UserInformation;
import cn.gok.dao.UserInfoDao;
import cn.gok.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;
    @Override
    public int upadetUserInfo(String name, String realname,String tel,String email,String id){
        return userInfoDao.upadetUserInfo(name, realname, tel, email,id);
    }

    @Override
    public UserInformation queryInfoByNameCustomId(String id) {
        return userInfoDao.queryInfoByNameCustomId(id);
    }

    @Override
    public int insertUserRegister(String customerId) {
        return userInfoDao.insertUserRegister(customerId);
    }
}
