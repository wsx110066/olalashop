package cn.gok.dao.customer;

import cn.gok.beans.customer.Collect;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 14489
 */
@Repository
public interface ICollectDao {

    /**
     * 通过消费者id查询收藏信息
     * @param customerId 消费者id
     * @return
     */
    List<Collect> queryCollectsByCustomerId(String customerId);

    /**
     * 通过消费者id和商品id查询收藏信息
     * @param customerId 消费者id
     * @param goodsId 商品id
     * @return
     */
    List<Collect> queryCollectsByCuAndGoodsId(@Param("customerId") String customerId, @Param("goodsId") String goodsId);

    /**
     * 通过收藏id修改某收藏是否取消的信息
     * @param collectId 收藏id
     * @param isCancel 是否取消 0否 1是
     * @return
     */
    boolean updateCollectCancelByCollectId(@Param("collectId") int collectId, @Param("isCancel") boolean isCancel);

    /**
     * 添加一个收藏信息
     * @param collect 收藏主体
     * @return
     */
    boolean addCollect(Collect collect);
}
