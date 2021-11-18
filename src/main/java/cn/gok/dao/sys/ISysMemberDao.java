package cn.gok.dao.sys;


import cn.gok.beans.sys.sysMember;
import cn.gok.service.sys.ISysMemberService;
import org.springframework.stereotype.Repository;

@Repository
public interface ISysMemberDao {
    public Integer saveMember(sysMember sysmember);
    public sysMember queryMembersById(Integer customerInfId,Integer customerId);
}
