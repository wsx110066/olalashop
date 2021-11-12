package cn.gok.dao;

public interface UserDao {
    public int queryUserLogin(String name,String password);
    public int insertUserRegister(String email,String password);
}
