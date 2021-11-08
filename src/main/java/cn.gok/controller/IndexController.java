package cn.gok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    //跳转到主页
    @RequestMapping("/init.do")
    public String init(){
        return "business/home/index";
    }

        @RequestMapping("/test")
    public String sayHello1(ModelMap map){
                    map.put("userName","小明");
                    map.put("userAge",23);
                    return "test";
                 }



    @RequestMapping("/test1")
    public String sayHello2(){

        return "business/home/test1";
    }

}

