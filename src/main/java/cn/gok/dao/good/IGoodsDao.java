package cn.gok.dao.good;

import cn.gok.beans.good.Goods;
import org.springframework.stereotype.Repository;

/**
 * @author 14489
 */
@Repository
public interface IGoodsDao {

    /**
     * 通过商品id查询商品
     * @param goodsId 商品id
     * @return
     */
    Goods queryGoodsByGoodsId(String goodsId);
}
