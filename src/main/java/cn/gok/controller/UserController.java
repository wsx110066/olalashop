package cn.gok.controller;

import cn.gok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cntApi")
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/login.do")
    public String Login(String userName,String password){
        int status=0;
        status = userService.queryUserLoginService(userName,password);
        if (status <1){
            status = -10000;
        }

        return Integer.toString(status);
    }
    @ResponseBody
    @RequestMapping("/register.do")
    public String Register(String email,String password){
        int status=0;
        status = userService.insertUserRegisterService(email, password);

        return Integer.toString(status);
    }

}
