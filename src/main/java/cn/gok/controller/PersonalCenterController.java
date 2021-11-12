package cn.gok.controller;

import cn.gok.beans.customer.CollectVo;
import cn.gok.dao.customer.ICollectDao;
import cn.gok.dao.good.IGoodsReportDao;
import cn.gok.service.customer.ICollectService;
import cn.gok.service.good.IGoodsReportService;
import cn.gok.service.good.IGoodsService;
import cn.gok.service.good.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 14489
 */
@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterController {

    /**
     * 我的收藏服务
     */
    @Autowired
    ICollectService iCollectService;

    /**
     * 商品销量服务
     */
    @Autowired
    IGoodsReportService iGoodsReportService;

    /**
     * 商品服务
     */
    @Autowired
    IGoodsService iGoodsService;

    /**
     * 图片服务
     */
    @Autowired
    IPictureService iPictureService;

    /**
     * 跳转到 我的收藏 页面
     *
     * @return
     */
    @RequestMapping("/toCollectionPage.do")
    public ModelAndView toCollectionPage() {
        ModelAndView mv = new ModelAndView();
//        String loginUserId = (String)request.getSession().getAttribute("1598777623923");
        String customerId = "1598777623923";
        List<CollectVo> collectVos = iCollectService.queryCollectsByCustomerId(customerId);
        mv.addObject("collectVos",collectVos);
        mv.setViewName("business/person/collection");
        return mv;

    }

    /**
     * 跳转到 我的足迹 页面
     * @return
     */
    @RequestMapping("/toFootPage.do")
    public String toFootPage(){
        return "business/person/foot";
    }
}
