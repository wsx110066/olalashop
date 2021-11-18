package cn.gok.service;

import cn.gok.beans.UserInformation;
import org.apache.ibatis.annotations.Param;

public interface UserInfoService {
    public int upadetUserInfo(String name, String realname,String tel,String email,String id);
    public UserInformation queryInfoByNameCustomId(String id);
    public int insertUserRegister(String customerId);
}
