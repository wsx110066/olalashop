package cn.gok.service.good.impl;

import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsReport;
import cn.gok.dao.good.IGoodsReportDao;
import cn.gok.service.good.IGoodsReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 14489
 */
@Service
public class GoodsReportServiceImpl implements IGoodsReportService {

    @Autowired
    IGoodsReportDao iGoodsReportDao;

    /**
     * 通过商品id查询商品销量汇总
     *
     * @param goodsId 商品id
     * @return
     */
    @Override
    public GoodsReport queryGoodsReportByGoodsId(String goodsId) {
        return iGoodsReportDao.queryGoodsReportByGoodsId(goodsId);
    }
}
