package cn.gok.beans.sys;

import java.io.Serializable;

public class Category implements Serializable {
    public Integer categoryId;
    public String parentId;
    public String categoryName;
    public String keywords;
    public Integer sortOrl;
    public String catyDesc;

    public Category(){}

    public Category(Integer categoryId, String parentId, String categoryName, String keywords, Integer sortOrl, String catyDesc) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.categoryName = categoryName;
        this.keywords = keywords;
        this.sortOrl = sortOrl;
        this.catyDesc = catyDesc;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(Integer sortOrl) {
        this.sortOrl = sortOrl;
    }

    public String getCatyDesc() {
        return catyDesc;
    }

    public void setCatyDesc(String catyDesc) {
        this.catyDesc = catyDesc;
    }
}
