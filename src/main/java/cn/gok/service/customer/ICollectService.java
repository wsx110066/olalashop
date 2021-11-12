package cn.gok.service.customer;

import cn.gok.beans.customer.Collect;
import cn.gok.beans.customer.CollectVo;

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
}
