package cn.gok.service;

public interface UserService {
    public int queryUserLoginService(String UserName,String Password);
    public int insertUserRegisterService(String email,String Password);
}
