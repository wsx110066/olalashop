package cn.gok.service.customer;

import cn.gok.beans.customer.Collect;
import cn.gok.beans.customer.CollectVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 14489
 */
public interface ICollectService {

    /**
     * 通过消费者id查询收藏信息
     * @param customerId 消费者id
     * @return
     */
    List<CollectVo> queryCollectsByCustomerId(String customerId);

    /**
     * 通过收藏id修改某收藏是否取消的信息
     * @param collectId
     * @param isCancel
     * @return
     */
    boolean updateCollectCancelByCollectId(int collectId, boolean isCancel);

    /**
     * 通过消费者id和商品id查询收藏信息
     * @param customerId
     * @param goodsId
     * @return
     */
    List<Collect> queryCollectsByCuAndGoodsId(@Param("customerId") String customerId, @Param("goodsId") String goodsId);

    /**
     * 添加一个收藏信息
     * @param customerId 消费者id
     * @param goodsId 商品id
     * @return
     */
    boolean addCollect(String customerId, String goodsId);
}
