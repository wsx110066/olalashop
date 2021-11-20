package cn.gok.controller;


import cn.gok.beans.order.Comment;
import cn.gok.beans.order.OrderDetail;
import cn.gok.beans.order.OrderMaster;
import cn.gok.beans.order.Ordermsg;
import cn.gok.beans.user.Consignee;
import cn.gok.beans.user.UserInformation;
import cn.gok.beans.user.UserLogin;
import cn.gok.service.order.ICommentService;
import cn.gok.service.order.IOrderDetailService;
import cn.gok.service.order.IOrderMasterService;
import cn.gok.service.user.IConsigneeService;
import cn.gok.service.user.IUserInfoService;
import cn.gok.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cntApi")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    IUserInfoService userInfoService;
    @Autowired
    IConsigneeService consigneeService;
    @Autowired
    IOrderDetailService detailService;
    @Autowired
    IOrderMasterService masterService;
    @Autowired
    ICommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/login.do")
    public String Login(String userName, String password, HttpSession session){
        System.out.println(userName);
        System.out.println(password);
        System.out.println("调用login方法");
        String status="10000";
        UserLogin user = userService.queryUserLoginService(userName,password);
        System.out.println(user.getUserName());
        if (user == null){
            status = "-10000";
        }else {
            session.setAttribute("LoginUserName",user.getUserName());
            session.setAttribute("LoginUser",user);
        }

        System.out.println(status);
        return status;
    }
    @ResponseBody
    @RequestMapping("/register.do")
    public String Register(String email, String password, HttpSession session){
        int status=0;
        System.out.println("email="+email);
        System.out.println("password="+password);
        //判断注册状态
        if (userService.queryOneByName(email)!=null){//邮箱已被注册
            status=1;
        }else {
            String customerId= UUID.randomUUID().toString().replace("-", "").substring(0,13);
            System.out.println(customerId);
            userService.insertUserByEmailRegister(customerId,email, password);
            UserLogin user =userService.queryOneByName(email);
            String userID = user.getUserID();
            userInfoService.insertUserRegister(userID);
            System.out.println(1);
            session.setAttribute("LoginUserNam0e",email);
            session.setAttribute("LoginUser",user);
            System.out.println(2);
            status=10000;
        }
        System.out.println(3);
        System.out.println(status);
        return Integer.toString(status);
    }

    @RequestMapping("/info.do")
    public ModelAndView InfoReturn(HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/information");
        UserLogin user = (UserLogin) session.getAttribute("LoginUser");
        String userID = user.getUserID();
        String useridstr = userID;
        UserInformation LoginUserInfo = userInfoService.queryInfoByNameCustomId(useridstr);
        view.addObject("LoginUserInfo",LoginUserInfo);
        return view;
    }

    @RequestMapping("/updateUserInfo.do")
    public ModelAndView updateUser(@RequestParam("ctm_name") String name, @RequestParam("r_name") String realname, @RequestParam("user-phone") String tel, @RequestParam("user-email") String email, HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/information");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        String userID = loginUser.getUserID();
        String useridstr = userID;
        userInfoService.upadetUserInfo(name,realname,tel,email,useridstr);
        UserInformation LoginUserInfo = userInfoService.queryInfoByNameCustomId(useridstr);
        view.addObject("LoginUserInfo",LoginUserInfo);
        return view;
    }

    @RequestMapping("/consignee.do")
    public ModelAndView addressUser(HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/address");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        String userID = loginUser.getUserID();
        String useridstr = userID;
        List<Consignee> consignees = consigneeService.queryUserConsignee(useridstr);
        view.addObject("consignee",consignees);
        return view;
    }

    @ResponseBody
    @RequestMapping("/addConsignee.do")
    public String addConsignee(@RequestParam("user_name") String name, @RequestParam("user_phone") String phone, @RequestParam("sheng") String province, @RequestParam("shi") String city, @RequestParam("qu") String district, @RequestParam("user_intro") String address, HttpSession session){
        String status="";
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        String userID = loginUser.getUserID();
        String useridstr = userID;
        consigneeService.insertConsignee(name,phone,province,city,district,address,useridstr);
        return status;
    }
    @ResponseBody
    @RequestMapping("delConsignee.do")
    public String delConsignee(@RequestParam("user_addId") int addressId){
        String status="0";
        int i = consigneeService.deleteConsignee(addressId);
        if (i<1){
            status="-10000";
        }else {
            status="1";
        }
        return status;
    }

    @RequestMapping("/orderManager.do")
    public ModelAndView orderReturn(HttpSession session){
        ModelAndView view =new ModelAndView("business/person/order");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        String userID = loginUser.getUserID();
        String useridstr = userID;
        List<OrderMaster> orderMasters = masterService.queryOrderMaster(useridstr);
        List<Ordermsg> msgs = new ArrayList<>();
        if (orderMasters==null){
            return view;
        }else {
            for (OrderMaster om:orderMasters) {
                Ordermsg msg = new Ordermsg();
                List<OrderDetail> orderDetails = detailService.queryDetailByOrderId(om.getOrderId());
                msg.setOrderSn(om.getOrderSn());
                msg.setPayTime(om.getPayTime());
                msg.setOrderMoney(om.getOrderMoney());
                for (OrderDetail od:orderDetails) {
                    msg.setGoodsName(od.getGoodsName());
                    msg.setGoodsCnt(od.getGoodsCnt());
                    msg.setGoodsPrice(od.getGoodsPrice());
                }
                msgs.add(msg);

            }
        }
        view.addObject("orderManager",msgs);
        return view;
    }

    @RequestMapping("/commentGoods.do")
    public ModelAndView Comment(HttpSession session){
        ModelAndView view = new ModelAndView("business/person/comment");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        String userID = loginUser.getUserID();
        String useridstr = userID;
        List<Comment> comments = commentService.queryCommentByUserId(useridstr);
        view.addObject("comments",comments);
        return view;
    }


    @RequestMapping("/points.do")
    public ModelAndView points(){
        ModelAndView mv = new ModelAndView("business/person/points");
        return mv;
    }

    @ResponseBody
    @RequestMapping("/addPoint.do")
    public  String addPoint(){
        String date="10000";
        System.out.println(date);
        return date;
    }
}
