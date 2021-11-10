package cn.gok.controller;

import cn.gok.beans.UserLogin;
import cn.gok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cntApi")
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping(value = "/login.do")
    public String Login(String userName, String password, Model model){
        String status="00";
        UserLogin user = userService.queryUserLoginService(userName,password);
        if (user == null){
            status = "-10000";
        }else {
            model.addAttribute("user",user);
        }

        System.out.println(status);
        return status;
    }
    @ResponseBody
    @RequestMapping("/register.do")
    public String Register(String email,String pwd,String mobile){
        int status=0;
        if (email==userService.queryOneByName(email).getUserName()|| mobile==userService.queryOneByName(mobile).getUserName()){
            status=1;
        }else {
            if (mobile == null) {
                status = userService.insertUserByEmailRegister(email, pwd);
            }
            if (email == null) {
                status = userService.insertUserByMoblieRegister(mobile, pwd);
            }
        }

        return Integer.toString(status);
    }

}
