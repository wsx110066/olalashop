package cn.gok.service.good;

import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsReport;

/**
 * @author 14489
 */
public interface IGoodsService {

    /**
     * 通过商品id查询商品
     * @param goodsId 商品id
     * @return
     */
    Goods queryGoodsByGoodsId(String goodsId);
}
