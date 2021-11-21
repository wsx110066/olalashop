package cn.gok.service.order;

import cn.gok.beans.order.OrderMaster;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderMasterService {
    public List<OrderMaster> queryOrderMaster(String customerId);

    /**
     * 生成订单主体
     * @param customerId
     * @param goodsIdArr
     * @param amountArr
     * @param priceArr
     * @param orderMoney
     * @return
     */
    Boolean addOrderMaster(String customerId, String goodsIdArr, String amountArr, String priceArr, String orderMoney);


}
