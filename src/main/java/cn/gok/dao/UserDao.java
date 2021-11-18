package cn.gok.dao;

import cn.gok.beans.UserLogin;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public UserLogin queryUserLoginService(@Param("name") String name, @Param("password") String password);
    public int insertUserByEmailRegister(@Param("email") String email,@Param("password") String password);
    public int insertUserByMoblieRegister(@Param("mobile") String mobile,@Param("password") String password);
    public UserLogin queryOneByName(@Param("name") String name);
    public int queryOneIdByname(@Param("name") String name);
}
