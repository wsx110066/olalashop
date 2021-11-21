package cn.gok.controller;

import cn.gok.beans.order.OrderShopCart;
import cn.gok.service.order.IOrderMasterService;
import cn.gok.service.order.IOrderShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 订单控制
 *
 * @author 14489
 */
@Controller
@RequestMapping("/orderApi")
public class OrderController {

    @Autowired
    IOrderShopCartService iOrderShopCartService;

    @Autowired
    IOrderMasterService iOrderMasterService;

    /**
     * 购物车预结算
     *
     * @return
     */
    @RequestMapping("/settleShopCart.do")
    public ModelAndView settleShopCart(String shopCartIdArr, String amountArr) {
        ModelAndView mv = new ModelAndView();
        Boolean flag = iOrderShopCartService.updateAmountByShopCartID(shopCartIdArr, amountArr);
        List<OrderShopCart> buyGoodsList = iOrderShopCartService.queryShopCartsByIdArray(shopCartIdArr);
        mv.addObject("buyGoodsList", buyGoodsList);
        mv.setViewName("business/home/pay");
        return mv;
    }

    @RequestMapping("/unifiedOrder.do")
    public ModelAndView unifiedOrder(String goodsIdArr, String amountArr, String priceArr, String orderMoney) {
        ModelAndView mv = new ModelAndView();
        String customerId = "1598777623923";
        System.out.println(goodsIdArr);
        System.out.println(amountArr);
        System.out.println(priceArr);
        System.out.println(orderMoney);
        iOrderMasterService.addOrderMaster(customerId,goodsIdArr,amountArr,priceArr,orderMoney);
        return mv;
    }
}
