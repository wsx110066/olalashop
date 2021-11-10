package cn.gok.controller;

import cn.gok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/olalashop/cntApi/login.do")
    public int Login(String userName,String password){
        int status;
        status = userService.queryUserLoginService(userName,password);
        if (status <1){
            status = -10000;
        }
        return status;
    }
}
