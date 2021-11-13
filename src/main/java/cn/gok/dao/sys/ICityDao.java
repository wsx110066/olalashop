package cn.gok.dao.sys;

import cn.gok.beans.sys.City;
import cn.gok.beans.sys.RespBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICityDao {
    public List<City> queryAllCity();
}
