package cn.gok.service.good.impl;

import cn.gok.beans.good.GoodsBrand;
import cn.gok.dao.good.IGoodBrandDao;
import cn.gok.service.good.IGoodBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodBrandServiceImp implements IGoodBrandService {
    @Autowired
    IGoodBrandDao goodBrandDao;
    @Override
    public List<GoodsBrand> queryAllBrand() {
        return goodBrandDao.queryAllBrand();
    }
}
