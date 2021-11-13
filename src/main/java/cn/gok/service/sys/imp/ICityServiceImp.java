package cn.gok.service.sys.imp;

import cn.gok.beans.sys.City;
import cn.gok.dao.sys.ICityDao;
import cn.gok.service.sys.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICityServiceImp implements ICityService {

    @Autowired
    ICityDao iCityDao;

    @Override
    public List<City> queryAllCity() {
        return iCityDao.queryAllCity();
    }
}
