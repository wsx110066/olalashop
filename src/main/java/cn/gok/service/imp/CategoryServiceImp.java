package cn.gok.service.imp;

import cn.gok.beans.Category;
import cn.gok.dao.ICategory;
import cn.gok.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    ICategory iCategory;
    //查询商品分类列表
    @Override
    public List<Category> queryCategoryList() {
        return iCategory.queryCategoryList();
    }
}
