package cn.gok.dao.sys;


import cn.gok.beans.sys.SysCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryDao {
    public List<SysCategory> queryCategoryList();
}
