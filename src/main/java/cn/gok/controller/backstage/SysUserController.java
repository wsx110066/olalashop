package cn.gok.controller.backstage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/sysAccountApi")
public class SysUserController {

    @ResponseBody
    @RequestMapping("/login.do")
    public String UserLogin(){
        System.out.println(1);

        return "10000";
    }

}
