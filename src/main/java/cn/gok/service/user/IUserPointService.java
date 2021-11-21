package cn.gok.service.user;

import cn.gok.beans.user.UserPoint;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

//用户积分Dao
public interface IUserPointService {
    //查询会员积分接口
    List<UserPoint> queryCustomerPoints(String customerId);

    //查询最后签到时间
    Date queryCustomerSignInPoints(String customerId);

    //增加会员积分
    Integer insertCustomerPoints(@Param("customerId")String customerId, @Param("createTime") Date createTime);

}
