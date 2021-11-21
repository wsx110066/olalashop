package cn.gok.controller;


import cn.gok.beans.sys.RespBean;
import cn.gok.beans.sys.sysMember;
import cn.gok.service.sys.ISysMemberService;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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

    //通过id寻找会员
    @RequestMapping("/queryMembersById.do")
    public RespBean QueryMembersById( HttpServletRequest request){
        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        Integer customerInfId = jsonObject.getInteger("customerInfId");


        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");

        sysMember member = iSysMemberService.queryMembersById(customerInfId);
        respBean.setResult(member);
        if (member != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("查询成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("查询失败");

        }
        return respBean;

    }
    //查找全部会员
    @RequestMapping("/queryMembers.do")
    public RespBean queryMembers( HttpServletRequest request){
        //Integer Version = Integer.parseInt(request.getParameter("Version"));
        Integer Version = 1;
        Integer sEcho = Integer.parseInt(request.getParameter("sEcho"));
        Integer iDisplayStart = Integer.parseInt(request.getParameter("iDisplayStart"));
        Integer iDisplayLength = Integer.parseInt(request.getParameter("iDisplayLength"));
        System.out.println(sEcho + iDisplayStart + iDisplayLength);

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");

        List<sysMember> sysMembers = iSysMemberService.queryMembers(Version, sEcho, iDisplayStart, iDisplayLength);
        respBean.setResult(sysMembers);
        respBean.setData(sysMembers);
        if (sysMembers != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("查询成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("查询失败");

        }
        return respBean;

    }
    //删除会员（把会员的IS_DEL数值改为1）
    @RequestMapping("/removeMember.do")
    public RespBean removeMember(HttpServletRequest request){
        Integer customerInfId = Integer.parseInt(request.getParameter("customerInfId"));
        Integer isDel = Integer.parseInt(request.getParameter("isDel"));

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");
        Integer removeMember = iSysMemberService.removeMember(customerInfId,isDel);
        respBean.setResult(removeMember);
        if (removeMember != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("删除成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("删除失败");

        }
        return respBean;

    }
    //按照id把帐号恢复
    @RequestMapping("/modifyDelStatusById.do")
    public RespBean modifyDelStatusById(HttpServletRequest request){
        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        Integer customerInfId = Integer.parseInt(jsonObject.getString("customerInfId"));
        Integer isDel = jsonObject.getInteger("isDel");

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");
        Integer modifyDelStatusById = iSysMemberService.modifyDelStatusById(customerInfId,isDel);
        respBean.setResult(modifyDelStatusById);
        if (modifyDelStatusById != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("恢复成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("恢复失败");

        }
        return respBean;

    }
    //删除会员等级接口
    @RequestMapping("/removeLevelById.do")
    public RespBean removeLevelById(HttpServletRequest request){
        Integer customerLevelId = Integer.parseInt(request.getParameter("customerLevelId"));

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");
        Integer removeLevelById = iSysMemberService.removeLevelById(customerLevelId);
        respBean.setResult(removeLevelById);
        if (removeLevelById != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("删除成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("删除失败");

        }
        return respBean;

    }
    //修改会员状态接口
    @RequestMapping("/updateMemberStatus.do")
    public RespBean updateMemberStatus(HttpServletRequest request){
        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        Integer customerInfId = Integer.parseInt(jsonObject.getString("customerInfId"));
        Integer status = jsonObject.getInteger("status");

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");
        Integer updateMemberStatus = iSysMemberService.updateMemberStatus(customerInfId, status);
        respBean.setResult(updateMemberStatus);
        respBean.setData(customerInfId);
        if (updateMemberStatus != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("修改成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("修改失败");

        }
        return respBean;

    }
    //更新会员密码
    @RequestMapping("/updateMemberPwd.do")
    public RespBean updateMemberPwd(HttpServletRequest request){
        String params = request.getParameter("params");
        JSONObject jsonObject = JSONObject.parseObject(params);
        Integer customerId = Integer.parseInt(jsonObject.getString("customerId"));
        Integer newPassword = Integer.parseInt(jsonObject.getString("newPassword"));

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");
        Integer updateMemberPwd = iSysMemberService.updateMemberPwd(customerId, newPassword);
        respBean.setResult(updateMemberPwd);
        if (updateMemberPwd != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("修改成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("修改失败");

        }
        return respBean;

    }
    //查询登入日志
    @RequestMapping("/queryLoginLog.do")
    public RespBean queryLoginLog(HttpServletRequest request){

        Integer Version = 1;
        Integer sEcho = Integer.parseInt(request.getParameter("sEcho"));
        Integer iDisplayStart = Integer.parseInt(request.getParameter("iDisplayStart"));
        Integer iDisplayLength = Integer.parseInt(request.getParameter("iDisplayLength"));

        RespBean respBean = new RespBean();
        respBean.setRespCode(10000);
        respBean.setRespMsg("chucuola");

        List<sysMember> sysMembers = iSysMemberService.queryLoginLog(Version, sEcho, iDisplayStart, iDisplayLength);
        respBean.setResult(sysMembers);
        respBean.setData(sysMembers);
        if (sysMembers != null){
            respBean.setRespCode(10000);
            respBean.setRespMsg("查询成功");
        }
        else{
            respBean.setRespCode(-10000);
            respBean.setRespMsg("查询失败");

        }
        return respBean;

    }


}
