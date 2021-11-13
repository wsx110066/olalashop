package cn.gok.service.customer.impl;

import cn.gok.beans.customer.Collect;
import cn.gok.beans.customer.CollectVo;
import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsReport;
import cn.gok.beans.good.Picture;
import cn.gok.dao.customer.ICollectDao;
import cn.gok.dao.good.IGoodsDao;
import cn.gok.dao.good.IGoodsReportDao;
import cn.gok.dao.good.IPictureDao;
import cn.gok.service.customer.ICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 14489
 */
@Service
public class CollectServiceImpl implements ICollectService {

    @Autowired
    ICollectDao iCollectDao;

    @Autowired
    IGoodsReportDao iGoodsReportDao;

    @Autowired
    IGoodsDao iGoodsDao;

    @Autowired
    IPictureDao iPictureDao;

    /**
     * 通过消费者id查询收藏信息
     *
     * @param customerId 消费者id
     * @return
     */
    @Override
    public List<CollectVo> queryCollectsByCustomerId(String customerId) {
        List<CollectVo> result = new ArrayList<CollectVo>();
        List<Collect> collections = iCollectDao.queryCollectsByCustomerId(customerId);

        for(Collect collect : collections){
            Goods good = iGoodsDao.queryGoodsByGoodsId(collect.getGoodsId());
            GoodsReport goodsReport = iGoodsReportDao.queryGoodsReportByGoodsId(collect.getGoodsId());
            List<Picture> pictures = iPictureDao.queryPictureListByRelationId(collect.getGoodsId());

            if(good != null && goodsReport != null && pictures != null){
                CollectVo collectVo = new CollectVo(collect.getCollectId(),good.getGoodsId(),good.getGoodsName(),good.getGoodsTitle(),pictures.get(0).getRealImg(),good.getShopPrice(),good.getPromotePrice(),goodsReport.getMonthSales());
                result.add(collectVo);
            }

        }

        return result;
    }

    /**
     * 通过收藏id修改某收藏是否取消的信息
     *
     * @param collectId
     * @param isCancel
     * @return
     */
    @Override
    public boolean updateCollectCancelByCollectId(int collectId, boolean isCancel) {
        return iCollectDao.updateCollectCancelByCollectId(collectId, isCancel);
    }
}
