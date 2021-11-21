package cn.gok.service.user;

import cn.gok.beans.user.Consignee;

import java.util.List;


/**
 * 用户地址服务
 * @author 14489
 */

public interface IConsigneeService {

    /**
     * 添加一个新的用户地址
     * @param customerId 消费者id
     * @param userName 收货人
     * @param userPhone 手机号码
     * @param sheng 省
     * @param shi 市
     * @param qu 区
     * @param userInfo 详细地址
     * @return
     */
    Boolean addConsignee(String customerId, String userName, String userPhone, String sheng, String shi, String qu, String userInfo);

    /**
     * 通过消费者id查询用户的地址
     * @param customerId 消费者id
     * @return
     */
    List<cn.gok.beans.user.Consignee> queryConsigneeByCustomerId(String customerId);

    public List<Consignee> queryUserConsignee(String id);
    public int insertConsignee(String name, String phone, String province, String city, String district, String address, String id);
    public int deleteConsignee(int id);

}
