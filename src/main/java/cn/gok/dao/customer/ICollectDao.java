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
     * 通过收藏id修改某收藏是否取消的信息
     * @param collectId
     * @param isCancel
     * @return
     */
    boolean updateCollectCancelByCollectId(@Param("collectId") int collectId, @Param("isCancel") boolean isCancel);
}
