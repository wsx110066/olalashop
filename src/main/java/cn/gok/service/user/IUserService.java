package cn.gok.service.user;


import cn.gok.beans.user.UserLogin;

public interface IUserService {
    public UserLogin queryUserLoginService(String UserName, String Password);
    public int insertUserByEmailRegister(String customerId,String email, String Password);
    public int insertUserByMoblieRegister(String customerId,String mobile, String Password);
    public UserLogin queryOneByName(String name);
    public int queryOneIdByname(String name);
}
