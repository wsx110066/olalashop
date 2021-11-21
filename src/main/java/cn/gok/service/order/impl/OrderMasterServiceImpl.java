package cn.gok.service.order.impl;

import cn.gok.beans.good.Goods;
import cn.gok.beans.order.OrderDetail;
import cn.gok.beans.order.OrderMaster;
import cn.gok.dao.good.IGoodsDao;
import cn.gok.dao.order.IOrderDetailDao;
import cn.gok.dao.order.IOrderMasterDao;
import cn.gok.service.order.IOrderMasterService;
import cn.gok.util.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * @author 14489
 */
@Service
public class OrderMasterServiceImpl implements IOrderMasterService {

    /**
     * 订单主体
     */
    @Autowired
    IOrderMasterDao iOrderMasterDao;

    /**
     * 订单明细主体
     */
    @Autowired
    IOrderDetailDao iOrderDetailDao;

    /**
     * 商品
     */
    @Autowired
    IGoodsDao iGoodsDao;

    @Override
    public List<OrderMaster> queryOrderMaster(String customerId) {
        return iOrderMasterDao.queryOrderMaster(customerId);
    }

    /**
     * 生成订单主体
     *
     * @param customerId 消费者id
     * @param goodsIdArr 商品id列表
     * @param amountArr  商品数量列表
     * @param priceArr   商品单价列表
     * @param orderMoney 订单总价
     * @return
     */
    @Override
    public Boolean addOrderMaster(String customerId, String goodsIdArr, String amountArr, String priceArr, String orderMoney) {
        List<String> goodsIdArray = Arrays.asList(goodsIdArr.split(","));
        List<String> amountArray = Arrays.asList(amountArr.split(","));
        List<String> priceArray = Arrays.asList(priceArr.split(","));
        Integer totalMoney = Integer.parseInt(orderMoney);

        // 订单编号
        String orderSn = GetUUID.getUUID();

        // 交易流水号
        String transactionNo = GetUUID.getUUID();

        System.out.println(goodsIdArray.toString());
        System.out.println(amountArray.toString());
        System.out.println(orderSn);
        System.out.println(transactionNo);

        OrderMaster orderMaster = new OrderMaster(orderSn, transactionNo, customerId, 1, new Timestamp(System.currentTimeMillis()), totalMoney, 0, totalMoney, new Timestamp(System.currentTimeMillis()), 0, 0, new Timestamp(System.currentTimeMillis()));
        Boolean flag = iOrderMasterDao.addOrderMaster(orderMaster);
        Boolean flagAll = true;
        if (flag) {
            // 生成订单明细
            OrderMaster orderMasterNow = iOrderMasterDao.queryOrderMasterBySn(orderSn);
            int orderId = Integer.parseInt(String.valueOf(orderMasterNow.getOrderId()));
            for (int i = 0; i < goodsIdArray.size(); i++) {
                String goodsId = goodsIdArray.get(i);
                Goods goods = iGoodsDao.queryGoodsByGoodsId(goodsId);
                String goodsName = goods.getGoodsName();
                int goodsCnt = Integer.parseInt(amountArray.get(i));
                int goodsPrice = Integer.parseInt(priceArray.get(i));
                OrderDetail orderDetail = new OrderDetail(orderId, goodsId, goodsName, goodsCnt, goodsPrice, new Timestamp(System.currentTimeMillis()));

                // 添加订单明细
                Boolean flag1 = iOrderDetailDao.addOrderDetail(orderDetail);
                if(!flag1){
                    flagAll = false;
                }
            }
        }else{
            flagAll = false;
        }
        return flagAll;
    }
}
