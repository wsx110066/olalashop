package cn.gok.service.order.impl;

import cn.gok.beans.good.Goods;
import cn.gok.beans.good.Picture;
import cn.gok.beans.order.OrderShopCart;
import cn.gok.dao.good.IGoodsDao;
import cn.gok.dao.good.IPictureDao;
import cn.gok.dao.order.IOrderShopCartDao;
import cn.gok.service.order.IOrderShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 14489
 */
@Service
public class OrderShopCartServiceImpl implements IOrderShopCartService {

    @Autowired
    IOrderShopCartDao iOrderShopCartDao;

    @Autowired
    IPictureDao iPictureDao;

    @Autowired
    IGoodsDao iGoodsDao;

    /**
     * 查询某消费者的购物车信息
     *
     * @param customerId 消费者id
     * @return
     */
    @Override
    public List<OrderShopCart> queryAllShopCartByCustomerId(String customerId) {
        List<OrderShopCart> orderShopCarts = iOrderShopCartDao.queryAllShopCartByCustomerId(customerId);
        for (OrderShopCart orderShopCart : orderShopCarts) {

            // 获取图片集合
            List<Picture> pictures = iPictureDao.queryPictureListByRelationId(orderShopCart.getGoodsId());

            if (pictures != null) {
                orderShopCart.setImgPath(pictures.get(0).getThumbImg());
            }
        }
        return orderShopCarts;
    }

    /**
     * 通过购物车id删除一个购物车信息
     *
     * @param shopCartId 购物车id
     * @return
     */
    @Override
    public Boolean deleteShopCartById(Long shopCartId) {
        return iOrderShopCartDao.deleteShopCartById(shopCartId);
    }

    /**
     * 添加一个购物车信息
     *
     * @param customerId 消费者id
     * @param goodsId    商品id
     * @return
     */
    @Override
    public Boolean addShopCart(String customerId, String goodsId) {
        Goods goods = iGoodsDao.queryGoodsByGoodsId(goodsId);
        List<Picture> pictures = iPictureDao.queryPictureListByRelationId(goodsId);
        OrderShopCart orderShopCart;
        if (pictures != null) {
            orderShopCart = new OrderShopCart(customerId, goodsId, goods.getGoodsSn(), goods.getGoodsName(), 0, "", 3, goods.getMarketPrice(), goods.getShopPrice(), goods.getPromotePrice(), true, 0, false, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), pictures.get(0).getThumbImg());
        } else {
            orderShopCart = new OrderShopCart(customerId, goodsId, goods.getGoodsSn(), goods.getGoodsName(), 0, "", 3, goods.getMarketPrice(), goods.getShopPrice(), goods.getPromotePrice(), true, 0, false, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), "");
        }
        return iOrderShopCartDao.addShopCart(orderShopCart);
    }

    /**
     * 更新购物车商品数量
     *
     * @param shopCartIdArr  购物车id数组
     * @param goodsAmountArr 商品数量数组
     * @return
     */
    @Override
    public Boolean updateAmountByShopCartID(String shopCartIdArr, String goodsAmountArr) {
        List<String> shopCartIdArray = Arrays.asList(shopCartIdArr.split(","));
        List<String> goodsAmountArray = Arrays.asList(goodsAmountArr.split(","));
        Boolean flag = true;
        for (int i = 0; i < shopCartIdArray.size(); i++) {
            Long shopCartId = Long.valueOf(shopCartIdArray.get(i));
            Integer goodsAmount = Integer.valueOf(goodsAmountArray.get(i));
            Boolean flag1 = iOrderShopCartDao.updateAmountByShopCartID(shopCartId, goodsAmount);
            if (!flag1) {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * 通过购物车id查询一个购物车信息
     *
     * @param shopCartId 购物车id
     * @return
     */
    @Override
    public OrderShopCart queryShopCartById(Long shopCartId) {
        return iOrderShopCartDao.queryShopCartById(shopCartId);
    }

    /**
     * 通过购物车id数组查询购物车信息
     *
     * @param shopCartIdArr 购物车id数组
     * @return
     */
    @Override
    public List<OrderShopCart> queryShopCartsByIdArray(String shopCartIdArr) {
        List<String> shopCartIdArray = Arrays.asList(shopCartIdArr.split(","));
        List<OrderShopCart> result = new ArrayList<>();
        for (String orderShopCartIdS : shopCartIdArray) {
            Long orderShopCartId = Long.valueOf(orderShopCartIdS);
            OrderShopCart orderShopCart = iOrderShopCartDao.queryShopCartById(orderShopCartId);

            // 计算订单总价格
            orderShopCart.setOrderMoney(orderShopCart.getGoodsAmount() * orderShopCart.getRealBuyPrice());

            // 获取图片集合
            List<Picture> pictures = iPictureDao.queryPictureListByRelationId(orderShopCart.getGoodsId());
            if (pictures != null) {
                orderShopCart.setImgPath(pictures.get(0).getThumbImg());
            }

            result.add(orderShopCart);
        }
        return result;
    }


}
