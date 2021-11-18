package cn.gok.controller;

import cn.gok.beans.order.OrderShopCart;
import cn.gok.service.order.IOrderShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 购物车控制
 *
 * @author 14489
 */
@Controller
@RequestMapping("/orderCartApi")
public class OrderCartController {

    @Autowired
    IOrderShopCartService iOrderShopCartService;

    /**
     * 查询某用户的购物车信息
     * @return
     */
    @RequestMapping("/queryAllShopCart.do")
    public ModelAndView queryAllShopCart() {
        ModelAndView mv = new ModelAndView();
        List<OrderShopCart> shopCartVos = iOrderShopCartService.queryAllShopCartByCustomerId("1598777623923");
        mv.addObject("shopCartVos", shopCartVos);
        mv.setViewName("business/home/shopcart");
        return mv;
    }

    /**
     * 删除某个购物车
     * @param shopCartId
     * @return
     */
    @RequestMapping("/removeShopCart.do")
    @ResponseBody
    public String removeShopCart(long shopCartId) {
        String msg = "";
        boolean flag = iOrderShopCartService.deleteShopCartById(shopCartId);
        if (flag) {
            msg = "10000";
        } else {
            msg = "-10000";
        }
        return msg;

    }

    /**
     * 给某用户添加一个购物车信息
     * @param goodsId
     * @return
     */
    @RequestMapping("/saveShopCart.do")
    @ResponseBody
    public String saveShopCart(String goodsId){
        String msg = "";
        String customerId = "1598777623923";
        boolean flag = iOrderShopCartService.addShopCart(customerId,goodsId);
        if(flag){
            msg = "10000";
        }else{
            msg = "-10000";
        }
        return msg;
    }
}
