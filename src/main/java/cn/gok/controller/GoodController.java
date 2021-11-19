package cn.gok.controller;



import cn.gok.beans.good.Category;
import cn.gok.beans.good.Goods;
import cn.gok.beans.good.GoodsBrand;
import cn.gok.service.good.CategoryService;
import cn.gok.service.good.IGoodBrandService;
import cn.gok.service.good.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/goodsIndexApi")
public class GoodController {
    //控制跳转查询页面
    @Autowired
    IGoodsService goodService;
    @Autowired
    CategoryService goryService;
    @Autowired
    IGoodBrandService brandService;
    @RequestMapping("/queryGoodsByParam.do")
    public ModelAndView queryGood(String keywords){
        List<Goods> goods = goodService.queryGoodListByName(keywords);
        List<Category> cateGories = goryService.queryAllObj();
        List<GoodsBrand> goodBrands = brandService.queryAllBrand();
        ModelAndView view = new ModelAndView("/business/home/search");
        view.addObject("goodsList",goods);
        view.addObject("categoryList",cateGories);
        view.addObject("brandList",goodBrands);
        return view;
    }


    //控制跳转详情页面
    @RequestMapping("/queryGoodsDetail.do")
    public String GoodDtailreturn(){

        return "/business/home/introduction";

    }

}
