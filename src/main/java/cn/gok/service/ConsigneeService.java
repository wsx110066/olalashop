package cn.gok.service;

import cn.gok.beans.Consignee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsigneeService {
    public List<Consignee> queryUserConsignee(String id);
    public int insertConsignee(String name, String phone,String province,String city,String district,String address,String id);
    public int deleteConsignee( int id);

}
