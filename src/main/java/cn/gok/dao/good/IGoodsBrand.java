package cn.gok.dao.good;

import cn.gok.beans.good.GoodsBrand;

import java.util.List;

public interface IGoodsBrand {

    //查询商品所有品牌接口
    List<GoodsBrand> queryGoodsBrandList();

    //按品牌类别查询商品所有品牌接口
    List<GoodsBrand> queryGoodsBrandListById(Integer categoryId);
}
