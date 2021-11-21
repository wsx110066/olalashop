package cn.gok.controller;



import cn.gok.beans.good.*;
import cn.gok.service.good.*;
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

    @Autowired
    IGoodsReportService reportService;

    @Autowired
    GoodPicService picService;

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


    /*
商品详情控制
 */
    @RequestMapping("/queryGoodsDetail.do")
    public ModelAndView GoodDtailreturn(String goodsId){
        ModelAndView view =new ModelAndView("/business/home/introduction");
        Goods good = goodService.queryGoodsByGoodsId(goodsId);
        GoodsReport goodReport = reportService.queryGoodsReportByGoodsId(goodsId);
        List<Picture> goodPics = picService.queryPicByGoodId(goodsId);
        System.out.println(goodPics);
        if (goodPics!=null){
            good.setPictureVos(goodPics);
        }
        good.setMonthSales(goodReport.getMonthSales());
        good.setCountSales(goodReport.getCountSales());
        good.setCountComms(goodReport.getCountComms());
        good.setCommendScore(goodReport.getCommendScore());
        view.addObject("goodsInfo",good);
        return view;

    }

}
