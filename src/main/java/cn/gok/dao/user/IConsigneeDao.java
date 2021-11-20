package cn.gok.dao.user;

import cn.gok.beans.user.Consignee;
import cn.gok.beans.user.Consignee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IConsigneeDao {
    public List<Consignee> queryUserConsignee(@Param("id") String id);
    public int insertConsignee(@Param("name") String name, @Param("phone") String phone, @Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("address") String address, @Param("id") String id);
    public int deleteConsignee(@Param("id") int id);
}
