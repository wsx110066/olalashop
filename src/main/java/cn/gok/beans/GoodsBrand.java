package cn.gok.beans;

import java.io.Serializable;
import java.util.Date;

//商品品牌
public class GoodsBrand implements Serializable {
    //品牌ID
    private Integer brandId;
    //品牌名称
    private String brandName;
    //品牌类别ID
    private  Integer categoryId;
    //上传的该品牌Logo图片
    private  String brandLogo;
    //品牌类型
    private  Integer brandType;
    //品牌描述
    private  String brandDesc;
    //品牌的网址
    private  String siteUrl;
    //品牌在前台页面的显示顺序
    private  Integer sortOrl;
    //该品牌是否显示;0否1显示
    private  Integer isShow;
    //创建时间
    private  Date createTime;
    //创建者
    private  String createBy;
    //更新时间
    private  Date updateTime;
    //更新者
    private  String updateBy;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public Integer getBrandType() {
        return brandType;
    }

    public void setBrandType(Integer brandType) {
        this.brandType = brandType;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Integer getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(Integer sortOrl) {
        this.sortOrl = sortOrl;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "GoodsBrand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", categoryId=" + categoryId +
                ", brandLogo='" + brandLogo + '\'' +
                ", brandType=" + brandType +
                ", brandDesc='" + brandDesc + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", sortOrl=" + sortOrl +
                ", isShow=" + isShow +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
