package cn.gok.service.good.impl;

import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsReport;
import cn.gok.dao.good.IGoodsDao;
import cn.gok.service.good.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 14489
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    IGoodsDao iGoodsDao;

    /**
     * 通过商品id查询商品
     *
     * @param goodsId 商品id
     * @return
     */
    @Override
    public Goods queryGoodsByGoodsId(String goodsId) {
        return iGoodsDao.queryGoodsByGoodsId(goodsId);
    }
}
