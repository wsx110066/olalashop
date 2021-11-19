package cn.gok.dao.good;

import cn.gok.beans.good.Category;

import java.util.List;

public interface ICategory {
    //查询商品分类列表接口
    List<Category> queryCategoryList();

    public List<Category> queryAllObj();
}
