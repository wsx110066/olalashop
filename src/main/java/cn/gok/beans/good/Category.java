package cn.gok.beans.good;

import java.io.Serializable;

public class CateGory implements Serializable {
    private String categoryId;
    private String categoryName;
    private String parentId;
    private String keywords;
    private String catyDesc;
    private int sortOrl;
    private int isShowInNav;
    private int grade;
    private int filterAttr;
    private int isEnabled;
    private int isShow;
    private String createTime;
    private String createBy;
    private String updateTime;
    private String updateBy;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
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

    public int getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(int sortOrl) {
        this.sortOrl = sortOrl;
    }

    public int getIsShowInNav() {
        return isShowInNav;
    }

    public void setIsShowInNav(int isShowInNav) {
        this.isShowInNav = isShowInNav;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFilterAttr() {
        return filterAttr;
    }

    public void setFilterAttr(int filterAttr) {
        this.filterAttr = filterAttr;
    }

    public int getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(int isEnabled) {
        this.isEnabled = isEnabled;
    }
}
