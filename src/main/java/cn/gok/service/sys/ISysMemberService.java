package cn.gok.service.sys;

import cn.gok.beans.sys.sysMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysMemberService {

    public Integer saveMember(sysMember sysmember);
    public sysMember queryMembersById(Integer customerInfId);
    public List<sysMember> queryMembers(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);
    public Integer removeMember(Integer customerInfId,Integer isDel);
    public Integer modifyDelStatusById(Integer customerInfId,Integer isDel);
    public Integer removeLevelById(Integer customerLevelId);
    public Integer updateMemberStatus(Integer customerInfId,Integer status);
    public Integer updateMemberPwd(Integer customerId,Integer newPassword);
    public List<sysMember> queryLoginLog(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);
}
