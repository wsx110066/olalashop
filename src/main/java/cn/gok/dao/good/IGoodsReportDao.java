package cn.gok.dao.good;

import cn.gok.beans.good.GoodsReport;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * @author 14489
 */
@Repository
public interface IGoodsReportDao {

    /**
     * 通过商品id查询商品销量汇总
     * @param goodsId 商品id
     * @return
     */
    GoodsReport queryGoodsReportByGoodsId(String goodsId);

    public GoodsReport queryReportByGoodId(@Param("id") String id);
}
