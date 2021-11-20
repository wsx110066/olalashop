package cn.gok.dao.sys;


import cn.gok.beans.sys.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryDao {
    public List<Category> queryCategoryList();
}
