package cn.gok.service.good.impl;

import cn.gok.beans.good.Category;
import cn.gok.dao.good.ICategory;
import cn.gok.service.good.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ICategory iCategory;
    //查询商品分类列表
    @Override
    public List<Category> queryCategoryList() {
        return iCategory.queryCategoryList();
    }

    @Override
    public List<Category> queryAllObj() {
        return iCategory.queryAllObj();
    }
}
