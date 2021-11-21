package cn.gok.dao.user;

import cn.gok.beans.user.UserInformation;
import cn.gok.beans.user.UserInformation;
import org.apache.ibatis.annotations.Param;

public interface IUserInfoDao {
    public int upadetUserInfo(@Param("name") String name, @Param("realname") String realname, @Param("tel") String tel, @Param("email") String email,  @Param("id") String id);
    public UserInformation queryInfoByNameCustomId(@Param("id") String id);
    public int insertUserRegister(@Param("customerId") String customerId);
}
