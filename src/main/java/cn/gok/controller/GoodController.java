package cn.gok.controller;

import cn.gok.beans.good.CateGory;
import cn.gok.beans.good.Good;
import cn.gok.beans.good.GoodBrand;
import cn.gok.service.CateGoryService;
import cn.gok.service.GoodBrandService;
import cn.gok.service.GoodService;
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
    GoodService goodService;
    CateGoryService goryService;
    GoodBrandService brandService;
    @RequestMapping("queryGoodsByParam.do")
    public ModelAndView queryGood(String keywords){
        List<Good> goods = goodService.queryGoodListbyName(keywords);
//        List<CateGory> cateGories = goryService.queryAllObj();
//        List<GoodBrand> goodBrands = brandService.queryAllBrand();
        ModelAndView view = new ModelAndView("/business/home/search");
        view.addObject("goodsList",goods);
//        view.addObject("categoryList",cateGories);
//        view.addObject("brandList",goodBrands);
        return view;
    }


    //控制跳转详情页面
    @RequestMapping("/queryGoodsDetail.do")
    public String GoodDtailreturn(){

        return "/business/home/introduction";

    }

}
