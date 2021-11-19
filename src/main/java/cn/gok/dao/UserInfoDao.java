package cn.gok.dao;

import cn.gok.beans.UserInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserInfoDao {
    public int upadetUserInfo(@Param("name") String name, @Param("realname") String realname,@Param("tel") String tel,@Param("email") String email,@Param("id") String id);
    public UserInformation queryInfoByNameCustomId(@Param("id") String id);
    public int insertUserRegister(@Param("customerId") String customerId);
}
