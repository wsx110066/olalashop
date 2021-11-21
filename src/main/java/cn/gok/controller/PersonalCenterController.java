package cn.gok.controller;

import cn.gok.beans.customer.Collect;
import cn.gok.beans.customer.CollectVo;
import cn.gok.service.customer.ICollectService;
import cn.gok.service.good.IGoodsReportService;
import cn.gok.service.good.IGoodsService;
import cn.gok.service.good.IPictureService;
import cn.gok.service.user.IConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 14489
 */
@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterController {

    /**
     * 我的收藏服务
     */
    @Autowired
    ICollectService iCollectService;

    /**
     * 商品销量服务
     */
    @Autowired
    IGoodsReportService iGoodsReportService;

    /**
     * 商品服务
     */
    @Autowired
    IGoodsService iGoodsService;

    /**
     * 图片服务
     */
    @Autowired
    IPictureService iPictureService;

    /**
     * 地址服务
     */
    @Autowired
    IConsigneeService iConsigneeService;


    /**
     * 跳转到 我的收藏 页面
     *
     * @return
     */
    @RequestMapping("/toCollectionPage.do")
    public ModelAndView toCollectionPage() {
        ModelAndView mv = new ModelAndView();
//        String loginUserId = (String)request.getSession().getAttribute("1598777623923");
        String customerId = "1598777623923";
        List<CollectVo> collectVos = iCollectService.queryCollectsByCustomerId(customerId);
        mv.addObject("collectVos", collectVos);
        mv.setViewName("business/person/collection");
        return mv;

    }

    /**
     * 收藏中的增删改查
     *
     * @param collectId
     * @param isCancel
     * @param source
     * @return
     */
    @RequestMapping("/saveCollect.do")
    @ResponseBody
    public String saveCollect(Integer collectId, String goodsId, boolean isCancel, String source) {

        String customerId = "1598777623923";
        String msg = "";
        switch (source) {
            case "1": {
                // 更新已存在的信息
                Boolean flag = iCollectService.updateCollectCancelByCollectId(collectId, isCancel);
                if (flag) {
                    msg = "10000";
                } else {
                    msg = "-10000";
                }
                break;
            }
            case "2": {
                // 更新可能不存在的信息
                List<Collect> collects = iCollectService.queryCollectsByCuAndGoodsId(customerId, goodsId);
                if (collects.isEmpty()) {
                    // 添加一个收藏信息
                    Boolean flag = iCollectService.addCollect(customerId, goodsId);
                    if (flag) {
                        msg = "10000";
                    } else {
                        msg = "-10000";
                    }
                } else {
                    for (Collect collect : collects) {
                        if (collect.getCancelIs()) {
                            // 把未收藏变成已收藏
                            Boolean flag = iCollectService.updateCollectCancelByCollectId(collect.getCollectId(), false);
                            if (flag) {
                                msg = "10000";
                            } else {
                                msg = "-10000";
                            }
                        }else{
                            msg = "-10001";
                        }
                    }
                }

                break;
            }
            default: {

            }
        }
        return msg;
    }

    /**
     * 跳转到 我的足迹 页面
     *
     * @return
     */
    @RequestMapping("/toFootPage.do")
    public ModelAndView toFootPage() {
        ModelAndView mv = new ModelAndView();
//        String loginUserId = (String)request.getSession().getAttribute("1598777623923");
        String customerId = "1598777623923";
        List<CollectVo> collectVos = iCollectService.queryCollectsByCustomerId(customerId);
        mv.addObject("collectVos", collectVos);
        mv.setViewName("business/person/foot");
        return mv;
    }

    @RequestMapping("/addConsignee.do")
    @ResponseBody
    public String addConsignee(String userName, String userPhone, String sheng, String shi, String qu, String userInfo) {
        String msg = "";
        String customerId = "1598777623923";
        Boolean flag = iConsigneeService.addConsignee(customerId, userName, userPhone, sheng, shi, qu, userInfo);
        if (flag) {
            msg = "10000";
        } else {
            msg = "-10000";
        }
        return msg;

    }
}
