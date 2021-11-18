package cn.gok.dao.order;

import cn.gok.beans.order.OrderShopCart;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderShopCartDao {

    /**
     * 查询某消费者的购物车信息
     * @param customerId 消费者id
     * @return
     */
    List<OrderShopCart> queryAllShopCartByCustomerId(String customerId);


    /**
     * 通过购物车id删除一个购物车信息
     * @param shopCartId 购物车id
     * @return
     */
    Boolean deleteShopCartById(Long shopCartId);

    /**
     * 添加一个购物车信息
     * @param orderShopCart
     * @return
     */
    Boolean addShopCart(OrderShopCart orderShopCart);
}