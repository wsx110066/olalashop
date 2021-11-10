package cn.gok.service;

import cn.gok.beans.UserLogin;

public interface UserService {
    public UserLogin queryUserLoginService(String UserName,String Password);
    public int insertUserRegisterService(String email,String Password);
    public UserLogin queryOneByName(String name);
}
