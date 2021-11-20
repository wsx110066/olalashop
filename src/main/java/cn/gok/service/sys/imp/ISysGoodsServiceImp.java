package cn.gok.service.sys.imp;

import cn.gok.beans.sys.SysGoods;
import cn.gok.dao.sys.ISysGoodsDao;
import cn.gok.service.sys.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ISysGoodsServiceImp implements ISysGoodsService {
    @Autowired
    ISysGoodsDao iSysGoodsDao;




    @Override
    public List<SysGoods> queryGoodsList(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength) {
        return iSysGoodsDao.queryGoodsList(Version,sEcho,iDisplayStart,iDisplayLength);
    }

    @Override
    public SysGoods queryGoodsInfoById(String goodsId) {
        System.out.println(goodsId);
        return iSysGoodsDao.queryGoodsInfoById(goodsId);
    }

    @Override
    public Integer saveGoodsInfo(String goodsId, String catyId, String goodsName, String keywords, String businessSn, String goodsBrief, Integer marketPrice, Integer shopPrice, Integer promotePrice, String goodsTitle, Integer sortOrl, Date effectiveDate, Integer expiryDays, Integer isComment, Integer costPrice, Date promoteStartDate, Date promoteEndDate, String goodsDesc) {
        return iSysGoodsDao.saveGoodsInfo(goodsId,catyId,goodsName, keywords, businessSn,  goodsBrief,marketPrice, shopPrice, promotePrice,goodsTitle,sortOrl, effectiveDate,expiryDays, isComment,costPrice, promoteStartDate,promoteEndDate, goodsDesc);

    }

    @Override
    public Integer updateGoodsIsOnById(String goodsId, Integer isOnSale) {
        return iSysGoodsDao.updateGoodsIsOnById(goodsId,isOnSale);
    }

    @Override
    public Integer removeGoodsById(String goodsId) {
        return iSysGoodsDao.removeGoodsById(goodsId);
    }
}
