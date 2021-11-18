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
        for(OrderShopCart orderShopCart : orderShopCarts){

            // 获取图片集合
            List<Picture> pictures = iPictureDao.queryPictureListByRelationId(orderShopCart.getGoodsId());

            if(pictures != null){
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
        if(pictures != null){
            orderShopCart = new OrderShopCart(customerId, goodsId, goods.getGoodsSn(), goods.getGoodsName(),0, "", 3, goods.getMarketPrice(), goods.getShopPrice(), goods.getPromotePrice(), true, 0, false, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), pictures.get(0).getThumbImg());
        }else{
            orderShopCart = new OrderShopCart(customerId, goodsId, goods.getGoodsSn(), goods.getGoodsName(),0, "", 3, goods.getMarketPrice(), goods.getShopPrice(), goods.getPromotePrice(), true, 0, false, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), "");
        }
        return iOrderShopCartDao.addShopCart(orderShopCart);
    }


}
