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
}
