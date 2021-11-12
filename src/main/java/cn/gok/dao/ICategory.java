package cn.gok.dao;

import cn.gok.beans.Category;

import java.util.List;

public interface ICategory {
    //查询商品分类列表接口
    List<Category> queryCategoryList();
}
