package cn.gok.dao;

import cn.gok.beans.UserLogin;

public interface UserDao {
    public UserLogin queryUserLogin(String name, String password);
    public int insertUserByEmailRegister(String email,String password);
    public int insertUserByMoblieRegister(String mobile,String password);
    public UserLogin queryUserByName(String name);
}
