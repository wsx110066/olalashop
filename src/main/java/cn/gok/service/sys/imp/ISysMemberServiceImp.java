package cn.gok.service.sys.imp;


import cn.gok.beans.sys.sysMember;
import cn.gok.dao.sys.ISysMemberDao;
import cn.gok.service.sys.ISysMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public sysMember queryMembersById(Integer customerInfId) {
        return iSysMemberDao.queryMembersById(customerInfId);
    }

    @Override
    public List<sysMember> queryMembers(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength) {
        return iSysMemberDao.queryMembers(Version,sEcho,iDisplayStart,iDisplayLength);
    }

    @Override
    public Integer removeMember(Integer customerInfId, Integer isDel) {
        return iSysMemberDao.removeMember(customerInfId,isDel);
    }

    @Override
    public Integer modifyDelStatusById(Integer customerInfId, Integer isDel) {
        return iSysMemberDao.modifyDelStatusById(customerInfId,isDel);
    }

    @Override
    public Integer removeLevelById(Integer customerLevelId) {
        return iSysMemberDao.removeLevelById(customerLevelId);
    }

    @Override
    public Integer updateMemberStatus(Integer customerInfId, Integer status) {
        return iSysMemberDao.updateMemberStatus(customerInfId,status);
    }

    @Override
    public Integer updateMemberPwd(Integer customerId, Integer newPassword) {
        return iSysMemberDao.updateMemberPwd(customerId,newPassword);
    }

    @Override
    public List<sysMember> queryLoginLog(Integer Version, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength) {
        return iSysMemberDao.queryLoginLog(Version,sEcho,iDisplayStart,iDisplayLength);
    }
}
