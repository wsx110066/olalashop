package cn.gok.dao;

import cn.gok.beans.GoodsBrand;

import java.util.List;

public interface IGoodsBrand {

    //查询商品所有品牌接口
    List<GoodsBrand> queryGoodsBrandList();

    //按品牌类别查询商品所有品牌接口
    List<GoodsBrand> queryGoodsBrandListById(Integer categoryId);
}
