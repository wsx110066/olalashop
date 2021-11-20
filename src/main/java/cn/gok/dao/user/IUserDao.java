package cn.gok.dao.user;

import cn.gok.beans.user.UserLogin;
import cn.gok.beans.user.UserLogin;
import org.apache.ibatis.annotations.Param;


public interface IUserDao {
    public UserLogin queryUserLoginService(@Param("name") String name, @Param("password") String password);
    public int insertUserByEmailRegister(@Param("customerId") String customerId,@Param("email") String email, @Param("password") String password);
    public int insertUserByMoblieRegister(@Param("customerId") String customerId,@Param("mobile") String mobile, @Param("password") String password);
    public UserLogin queryOneByName(@Param("name") String name);
    public int queryOneIdByname(@Param("name") String name);
}
