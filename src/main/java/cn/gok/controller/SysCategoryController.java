package cn.gok.controller;


import cn.gok.beans.sys.Category;
import cn.gok.beans.sys.City;
import cn.gok.beans.sys.RespBean;
import cn.gok.service.sys.ICategoryService;
import cn.gok.service.sys.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/categoryApi")
public class SysCategoryController {
    @Autowired
    ICategoryService iCategoryService;

    //查询所有商品分类
    @RequestMapping("/queryCategoryList.do")
    public RespBean queryCategoryList(){
        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        List<Category> categories = iCategoryService.queryCategoryList();
        respBean.setResult(categories);
        if (categories != null){
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
