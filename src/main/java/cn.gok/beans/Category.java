package cn.gok.beans;

import java.io.Serializable;

//商品类别
public class Category implements Serializable {
    //商品分类ID
    private  int categoryId;
    //商品分类名称
    private  String categoryName;
    //分类父级ID
    private  String parentId;
    //分类编码
    private  String keywords;
    //商品分类描述
    private  String catyDesc;
    //商品分类排序
    private  Integer sortOrl;
    //是否显示在导航栏:0不;1显示
    private  Integer isShowInNav;
    //价格区间
    private  Integer grade;
    //商品属性
    private  String filterAttr;
    //商品是否有效 0无效 1有效
    private  Integer isEnabled;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatyDesc() {
        return catyDesc;
    }

    public void setCatyDesc(String catyDesc) {
        this.catyDesc = catyDesc;
    }

    public Integer getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(Integer sortOrl) {
        this.sortOrl = sortOrl;
    }

    public Integer getIsShowInNav() {
        return isShowInNav;
    }

    public void setIsShowInNav(Integer isShowInNav) {
        this.isShowInNav = isShowInNav;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getFilterAttr() {
        return filterAttr;
    }

    public void setFilterAttr(String filterAttr) {
        this.filterAttr = filterAttr;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }
}
