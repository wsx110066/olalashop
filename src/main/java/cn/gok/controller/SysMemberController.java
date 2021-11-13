package cn.gok.controller;


import cn.gok.beans.sys.RespBean;
import cn.gok.beans.sys.sysMember;
import cn.gok.service.sys.ISysMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * 新增会员信息接口
 */
@Controller
@RequestMapping("/MemberApi")
public class SysMemberController {
    @Autowired
    ISysMemberService iSysMemberService;
    @ResponseBody
    @RequestMapping("/saveMember.do")
    public RespBean SaveMember(HttpServletRequest request ){
        Integer customerInfId = 34; ///Integer.parseInt(request.getParameter("customerInfId"));
        String customerId =  "15966103212";//(String)request.getParameter("customerId");
        String customerName =  (String)request.getParameter("customerName");
        String realName =  (String)request.getParameter("realName");
        Integer gender =  Integer.parseInt(request.getParameter("gender"));
        Integer identyCardType =  Integer.parseInt(request.getParameter("identyCardType"));
        String identyCardNo =  (String)request.getParameter("identyCardNo");
        String birthday =  (String)request.getParameter("birthday");
        String userMobile =  (String)request.getParameter("userMobile");
        String email =  (String)request.getParameter("email");
        String city =  (String)request.getParameter("city");

        sysMember sys1 = new sysMember(customerInfId,customerId,customerName,realName,gender,identyCardType,identyCardNo,birthday,userMobile,email,city);

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");

        int status = 0;
        status = iSysMemberService.saveMember(sys1);
        respBean.setResult(status);
        if (status == 1){
            respBean.setRespCode(10000);
            respBean.setRespMsg("添加成功啦");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("添加失败");

        }
        return respBean;
    }
}
