package cn.gok.service;

import cn.gok.beans.good.Category;

import java.util.List;

public interface CategoryService {
    //查询商品分类列表接口
    List<Category> queryCategoryList();
}
