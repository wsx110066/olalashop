package cn.gok.dao.sys;


import cn.gok.beans.sys.sysMember;
import cn.gok.service.sys.ISysMemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysMemberDao {
    public Integer saveMember(sysMember sysmember);
    public sysMember queryMembersById(@Param("customerInfId") Integer customerInfId);
    public List<sysMember> queryMembers(@Param("Version")Integer Version,@Param("sEcho") Integer sEcho,@Param("iDisplayStart") Integer iDisplayStart,@Param("iDisplayLength") Integer iDisplayLength);
    public Integer removeMember(@Param("customerInfId")Integer customerInfId,@Param("isDel")Integer isDel);
    public Integer modifyDelStatusById(@Param("customerInfId")Integer customerInfId,@Param("isDel")Integer isDel);
    public Integer removeLevelById(@Param("customerLevelId")Integer customerLevelId);
    public Integer updateMemberStatus(@Param("customerInfId")Integer customerInfId,@Param("status")Integer status);
    public Integer updateMemberPwd(@Param("customerId")Integer customerId,@Param("newPassword")Integer newPassword);
    public List<sysMember> queryLoginLog(@Param("Version")Integer Version,@Param("sEcho") Integer sEcho,@Param("iDisplayStart") Integer iDisplayStart,@Param("iDisplayLength") Integer iDisplayLength);
}
