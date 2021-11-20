package cn.gok.service.good.impl;

import cn.gok.beans.good.GoodsBrand;
import cn.gok.dao.good.IGoodsBrand;
import cn.gok.service.good.GoodsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBrandServiceImpl implements GoodsBrandService {

    @Autowired
    IGoodsBrand iGoodsBrand;

    //查询商品所有品牌
    @Override
    public List<GoodsBrand> queryGoodsBrandList() {
        return iGoodsBrand.queryGoodsBrandList();
    }


    //按品牌类别查询商品所有品牌
    @Override
    public List<GoodsBrand> queryGoodsBrandListById(Integer categoryId) {
        return iGoodsBrand.queryGoodsBrandListById(categoryId);
    }
}
