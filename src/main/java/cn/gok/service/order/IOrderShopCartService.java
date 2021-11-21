package cn.gok.service.order;

import cn.gok.beans.order.OrderShopCart;

import java.util.List;

/**
 * @author 14489
 */
public interface IOrderShopCartService {

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
     * @param customerId 消费者id
     * @param goodsId 商品id
     * @return
     */
    Boolean addShopCart(String customerId, String goodsId);

    /**
     * 更新购物车商品数量
     * @param shopCartIdArr 购物车id数组
     * @param goodsAmountArr 商品数量数组
     * @return
     */
    Boolean updateAmountByShopCartID(String shopCartIdArr, String goodsAmountArr);

    /**
     * 通过购物车id查询一个购物车信息
     * @param shopCartId 购物车id
     * @return
     */
    OrderShopCart queryShopCartById(Long shopCartId);

    /**
     * 通过购物车id数组查询购物车信息
     * @param shopCartIdArr 购物车id数组
     * @return
     */
    List<OrderShopCart> queryShopCartsByIdArray(String shopCartIdArr);
}
