package cn.gok.service.sys.imp;

import cn.gok.beans.sys.SysCategory;
import cn.gok.dao.sys.ICategoryDao;
import cn.gok.service.sys.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICategoryServiceImp implements ICategoryService {
    @Autowired
    ICategoryDao iCategoryDao;


    @Override
    public List<SysCategory> queryCategoryList() {
        return iCategoryDao.queryCategoryList();
    }
}
