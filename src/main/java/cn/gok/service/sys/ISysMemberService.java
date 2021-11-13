package cn.gok.service.sys;

import cn.gok.beans.sys.sysMember;

public interface ISysMemberService {

    public Integer saveMember(sysMember sysmember);
    public sysMember queryMembersById(Integer customerInfId,Integer customerId);
}
