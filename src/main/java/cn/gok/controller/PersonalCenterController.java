package cn.gok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 14489
 */
@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterController {

    /**
     * 跳转到 我的收藏 页面
     *
     * @return
     */
    @RequestMapping("/toCollectionPage.do")
    public String toCollectionPage() {
        return "business/person/collection";
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
