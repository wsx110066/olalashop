package cn.gok.dao.sys;

import cn.gok.beans.sys.SysGoods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ISysGoodsDao {
    public List<SysGoods> queryGoodsList(@Param("Version")Integer Version, @Param("sEcho") Integer sEcho, @Param("iDisplayStart") Integer iDisplayStart, @Param("iDisplayLength") Integer iDisplayLength);
    public SysGoods queryGoodsInfoById(@Param("goodsId")String goodsId);
    public Integer saveGoodsInfo(@Param("goodsId")String goodsId, @Param("catyId")String catyId, @Param("goodsName")String goodsName, @Param("keywords")String keywords, @Param("businessSn")String businessSn, @Param("goodsBrief")String goodsBrief, @Param("marketPrice")Integer marketPrice, @Param("shopPrice")Integer shopPrice, @Param("promotePrice")Integer promotePrice, @Param("goodsTitle")String goodsTitle, @Param("sortOrl")Integer sortOrl, @Param("effectiveDate")Date effectiveDate, @Param("expiryDays")Integer expiryDays, @Param("isComment")Integer isComment, @Param("costPrice")Integer costPrice, @Param("promoteStartDate")Date promoteStartDate, @Param("promoteEndDate")Date promoteEndDate, @Param("goodsDesc")String goodsDesc);
    public Integer updateGoodsIsOnById(@Param("goodsId")String goodsId, @Param("isOnSale")Integer isOnSale);
    public Integer removeGoodsById(@Param("goodsId")String goodsId);

}
