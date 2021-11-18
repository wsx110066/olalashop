package cn.gok.service.imp;

import cn.gok.beans.good.CateGory;
import cn.gok.dao.CateGoryDao;
import cn.gok.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateGoryServiceImp implements CateGoryService {
    @Autowired
    CateGoryDao cateGoryDao;

    @Override
    public List<CateGory> queryAllObj() {
        return cateGoryDao.queryAllObj();
    }
}
