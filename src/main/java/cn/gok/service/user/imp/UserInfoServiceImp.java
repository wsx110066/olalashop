package cn.gok.service.user.imp;

import cn.gok.beans.user.UserInformation;
import cn.gok.dao.user.IUserInfoDao;
import cn.gok.service.user.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImp implements IUserInfoService {
    @Autowired
    IUserInfoDao userInfoDao;

    @Override
    public int upadetUserInfo(String name, String realname, String tel, String email, String id){
        return userInfoDao.upadetUserInfo(name,realname,tel,email,id);
    }

    public UserInformation queryInfoByNameCustomId(String id) {
        return userInfoDao.queryInfoByNameCustomId(id);
    }

    @Override
    public int insertUserRegister(String customerId) {
        return userInfoDao.insertUserRegister(customerId);
    }
}
