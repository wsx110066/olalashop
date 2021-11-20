package cn.gok.service.user;

import cn.gok.beans.user.UserInformation;

public interface IUserInfoService {
    public int upadetUserInfo(String name, String realname, String tel, String email, String id);
    public UserInformation queryInfoByNameCustomId(String id);
    public int insertUserRegister(String customerId);
}
