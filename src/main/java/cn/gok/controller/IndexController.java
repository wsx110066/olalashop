package cn.gok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("/init.do")
    public String init(){
        return "business/home/index";
    }




}

