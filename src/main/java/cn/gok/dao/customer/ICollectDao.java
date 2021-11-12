package cn.gok.dao.customer;

import cn.gok.beans.customer.Collect;
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
}
