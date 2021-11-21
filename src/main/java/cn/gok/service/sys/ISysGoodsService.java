package cn.gok.service.sys;

import cn.gok.beans.sys.SysGoods;

import java.util.Date;
import java.util.List;

public interface ISysGoodsService {
    public List<SysGoods> queryGoodsList(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);
    public SysGoods queryGoodsInfoById(String goodsId);
    public Integer saveGoodsInfo(String goodsId,String catyId,String goodsName,String keywords,String businessSn,String goodsBrief,Integer marketPrice,Integer shopPrice,Integer promotePrice,String goodsTitle,Integer sortOrl,Date effectiveDate,Integer expiryDays,Integer isComment,Integer costPrice, Date promoteStartDate,Date promoteEndDate,String goodsDesc);
    public Integer updateGoodsIsOnById(String goodsId,Integer isOnSale);
    public Integer removeGoodsById(String goodsId);
}
