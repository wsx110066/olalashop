package cn.gok.service.sys.imp;


import cn.gok.beans.sys.sysMember;
import cn.gok.dao.sys.ISysMemberDao;
import cn.gok.service.sys.ISysMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISysMemberServiceImp implements ISysMemberService {

    @Autowired
    ISysMemberDao iSysMemberDao;

    // 新增会员
    @Override
    public Integer saveMember(sysMember sysmember) {
        return iSysMemberDao.saveMember(sysmember);
    }
    //按条件查询会员
    @Override
    public sysMember queryMembersById(Integer customerInfId, Integer customerId) {
        return iSysMemberDao.queryMembersById(customerInfId,customerId);
    }
}
