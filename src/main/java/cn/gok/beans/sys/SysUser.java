package cn.gok.beans.sys;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {

    //后台用户主键ID
    private Integer userId;

    //用户名
    private String userName;

    //密码
    private String password;

    //用户真实姓名
    private String realName;

    //加密盐
    private String salt;

    //邮箱
    private String email;

    //手机号
    private String mobile;

    //状态0禁用1正常
    private Integer status;

    //所属部门
    private String deptName;

    //账户信息备注
    private String remark;

    //创建时间
    private Date createTime;
    //创建者
    private  String createBy;
    //更新时间
    private  Date updateTime;
    //更新者
    private  String updateBy;


}
