package cn.gok.service.user;

import cn.gok.beans.user.Consignee;

import java.util.List;

public interface IConsigneeService {
    public List<Consignee> queryUserConsignee(String id);
    public int insertConsignee(String name, String phone, String province, String city, String district, String address, String id);
    public int deleteConsignee(int id);

}
