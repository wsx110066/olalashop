package cn.gok.service.good;

import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsReport;

/**
 * @author 14489
 */
public interface IGoodsReportService {

    /**
     * 通过商品id查询商品销量汇总
     * @param goodsId 商品id
     * @return
     */
    GoodsReport queryGoodsReportByGoodsId(String goodsId);
}
