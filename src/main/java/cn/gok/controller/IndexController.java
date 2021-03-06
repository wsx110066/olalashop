package cn.gok.controller;

import cn.gok.beans.good.Category;
import cn.gok.beans.good.GoodActivit;
import cn.gok.dao.good.IGoodArticle;
import cn.gok.service.good.CategoryService;
import cn.gok.service.good.IGoodActivitService;
import cn.gok.service.good.IGoodArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    IGoodArticleService iGoodArticleService;

    @Autowired
    IGoodActivitService iGoodActivitService;

    //跳转到主页
    @RequestMapping("/init.do")
    public ModelAndView init() {
        ModelAndView mv = new ModelAndView("business/home/index");
        //查询商品的分类
        List<Category> categoryList = categoryService.queryCategoryList();
        mv.addObject("categoryList",categoryList);

        //查询商城文章
        List<IGoodArticle> articleVoList = iGoodArticleService.queryGoodArticleList();
        mv.addObject("articleVoList",articleVoList);

        //查询商城活动
        List<GoodActivit> indexActivities = iGoodActivitService.queryGoodActivitList();
        mv.addObject("indexActivities",indexActivities);
        return mv;

    }



}

