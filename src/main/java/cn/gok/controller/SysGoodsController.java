package cn.gok.controller;


import cn.gok.beans.sys.Category;
import cn.gok.beans.sys.RespBean;
import cn.gok.beans.sys.SysGoods;
import cn.gok.service.sys.ISysGoodsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/goodsApi")
public class SysGoodsController {
    @Autowired
    ISysGoodsService iSysGoodsService;


    //查询所有商品
    @RequestMapping("/queryGoodsList.do")
    public RespBean queryGoodsList(HttpServletRequest request){

        Integer Version = 1;
        Integer sEcho = Integer.parseInt(request.getParameter("sEcho"));
        Integer iDisplayStart = Integer.parseInt(request.getParameter("iDisplayStart"));
        Integer iDisplayLength = Integer.parseInt(request.getParameter("iDisplayLength"));
        System.out.println(sEcho + iDisplayStart + iDisplayLength);

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        List<SysGoods> sysGoods = iSysGoodsService.queryGoodsList(Version,sEcho,iDisplayStart,iDisplayLength);
        respBean.setData(sysGoods);
        if (sysGoods != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("成功啦");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("失败");
        }

        return respBean;
    }
    //根据id查询goods
    @RequestMapping("/queryGoodsInfoById.do")
    public RespBean queryGoodsInfoById(HttpServletRequest request){

        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        String goodsId = jsonObject.getString("goodsId");

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        SysGoods sysGoods = iSysGoodsService.queryGoodsInfoById(goodsId);
        respBean.setResult(sysGoods);
        if (sysGoods != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("成功啦");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("失败");
        }

        return respBean;
    }
    //保存商品
    @RequestMapping("/saveGoodsInfo.do")
    public RespBean saveGoodsInfo(HttpServletRequest request) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("111111111111111111111111111");

        String goodsId = request.getParameter("goodsId");
        String catyId = request.getParameter("catyId");
        String goodsName = request.getParameter("goodsName");
        String keywords = request.getParameter("keywords");
        String businessSn = request.getParameter("businessSn");
        String goodsBrief = request.getParameter("goodsBrief");
        Integer marketPrice = Integer.parseInt(request.getParameter("marketPrice"));
        Integer shopPrice = Integer.parseInt(request.getParameter("shopPrice"));
        Integer promotePrice = Integer.parseInt(request.getParameter("promotePrice"));
        String goodsTitle = request.getParameter("goodsTitle");
        Integer sortOrl = Integer.parseInt(request.getParameter("sortOrl"));
        Date effectiveDate = formatter.parse(request.getParameter("effectiveDate"));
        Integer expiryDays = Integer.parseInt(request.getParameter("expiryDays"));
        Integer isComment = 0;
        Integer costPrice = Integer.parseInt(request.getParameter("costPrice"));
        Date promoteStartDate = formatter.parse(request.getParameter("promoteStartDate"));
        Date promoteEndDate = formatter.parse(request.getParameter("promoteEndDate"));
        String goodsDesc = request.getParameter("goodsDesc");
        Integer saveGoodsInfo = iSysGoodsService.saveGoodsInfo(goodsId, catyId, goodsName, keywords, businessSn, goodsBrief, marketPrice, shopPrice, promotePrice, goodsTitle, sortOrl, effectiveDate, expiryDays, isComment, costPrice, promoteStartDate, promoteEndDate, goodsDesc);

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");

        respBean.setResult(saveGoodsInfo);
        respBean.setData(saveGoodsInfo);
        if (saveGoodsInfo != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("查询成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("查询失败");

        }
        return respBean;

    }
    //下架商品
    @RequestMapping("/updateGoodsIsOnById.do")
    public RespBean updateGoodsIsOnById(HttpServletRequest request){

        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        String goodsId = jsonObject.getString("goodsId");
        int isOnSale = Integer.parseInt(jsonObject.getString("isOnSale"));

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        Integer updateGoodsIsOnById = iSysGoodsService.updateGoodsIsOnById(goodsId, isOnSale);
        respBean.setResult(updateGoodsIsOnById);
        if (updateGoodsIsOnById != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("成功啦");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("失败");
        }

        return respBean;
    }
    //删除商品
    @RequestMapping("/removeGoodsById.do")
    public RespBean removeGoodsById(HttpServletRequest request){

        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        String goodsId = jsonObject.getString("goodsId");

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("jinru");
        Integer removeGoodsById = iSysGoodsService.removeGoodsById(goodsId);
        respBean.setResult(removeGoodsById);
        if (removeGoodsById != null){
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
