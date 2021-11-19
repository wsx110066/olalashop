package cn.gok.controller;

import cn.gok.beans.Consignee;
import cn.gok.beans.UserInformation;
import cn.gok.beans.UserLogin;
import cn.gok.beans.order.OrderDetail;
import cn.gok.beans.order.OrderMaster;
import cn.gok.beans.order.Ordermsg;
import cn.gok.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cntApi")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    ConsigneeService consigneeService;
    @Autowired
    OrderDetailService detailService;
    @Autowired
    OrderMasterService masterService;

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
    public String Register(String email,String password,HttpSession session){
        int status=0;
        System.out.println("email="+email);
        System.out.println("password="+password);
        //判断注册状态
        if (userService.queryOneByName(email)!=null){//邮箱已被注册
            status=1;
        }else {
            userService.insertUserByEmailRegister(email, password);
            UserLogin user =userService.queryOneByName(email);
            int userID = user.getUserID();
            userInfoService.insertUserRegister(String.valueOf(userID));
            session.setAttribute("LoginUserName",email);
            session.setAttribute("LoginUser",user);
            status=10000;
        }
        System.out.println(status);
        return Integer.toString(status);
    }

    @RequestMapping("/info.do")
    public ModelAndView InfoReturn(HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/information");
        UserLogin user = (UserLogin) session.getAttribute("LoginUser");
        int userID = user.getUserID();
        String useridstr = String.valueOf(userID);
        UserInformation LoginUserInfo = userInfoService.queryInfoByNameCustomId(useridstr);
        view.addObject("LoginUserInfo",LoginUserInfo);
        return view;
    }

    @RequestMapping("/updateUserInfo.do")
    public ModelAndView updateUser(@RequestParam("ctm_name") String name, @RequestParam("r_name") String realname, @RequestParam("user-phone") String tel, @RequestParam("user-email") String email, HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/information");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        int userID = loginUser.getUserID();
        String useridstr = String.valueOf(userID);
        userInfoService.upadetUserInfo(name,realname,tel,email,useridstr);
        UserInformation LoginUserInfo = userInfoService.queryInfoByNameCustomId(useridstr);
        view.addObject("LoginUserInfo",LoginUserInfo);
        return view;
    }

    @RequestMapping("/consignee.do")
    public ModelAndView addressUser(HttpSession session){
        ModelAndView view =new ModelAndView("/business/person/address");
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        int userID = loginUser.getUserID();
        String useridstr = String.valueOf(userID);
        List<Consignee> consignees = consigneeService.queryUserConsignee(useridstr);
        view.addObject("consignee",consignees);
        return view;
    }

    @ResponseBody
    @RequestMapping("/addConsignee.do")
    public String addConsignee(@RequestParam("user_name") String name, @RequestParam("user_phone") String phone, @RequestParam("sheng") String province, @RequestParam("shi") String city, @RequestParam("qu") String district, @RequestParam("user_intro") String address,HttpSession session){
        String status="";
        UserLogin loginUser = (UserLogin) session.getAttribute("LoginUser");
        int userID = loginUser.getUserID();
        String useridstr = String.valueOf(userID);
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
        int userID = loginUser.getUserID();
        String useridstr = String.valueOf(userID);
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
                    msg.setGoodsName(od.getGoodName());
                    msg.setGoodsCnt(od.getGoodCnt());
                    msg.setGoodsPrice(od.getGoodPrice());
                }
                msgs.add(msg);

            }
        }
        view.addObject("orderManager",msgs);
        return view;
    }

    @RequestMapping("/commentGoods.do")

    public String Comment(){
        return "business/person/comment";
    }
}
