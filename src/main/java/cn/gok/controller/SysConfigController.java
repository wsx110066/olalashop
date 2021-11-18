package cn.gok.controller;


import cn.gok.beans.sys.City;
import cn.gok.beans.sys.RespBean;
import cn.gok.service.sys.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sysConfigApi")
public class SysConfigController {
    @Autowired
    ICityService iCityService;
    @ResponseBody
    @RequestMapping("/queryAllCity.do")
    public RespBean queryAllCity(){
        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        List<City> cities = iCityService.queryAllCity();
        respBean.setResult(cities);
        if (cities != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("成功啦");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("失败");
        }

        return respBean;




    }


}
