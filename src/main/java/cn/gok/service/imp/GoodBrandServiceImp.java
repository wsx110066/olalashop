package cn.gok.service.imp;

import cn.gok.beans.good.GoodBrand;
import cn.gok.dao.GoodBrandDao;
import cn.gok.service.GoodBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodBrandServiceImp implements GoodBrandService {
    @Autowired
    GoodBrandDao goodBrandDao;
    @Override
    public List<GoodBrand> queryAllBrand() {
        return goodBrandDao.queryAllBrand();
    }
}
