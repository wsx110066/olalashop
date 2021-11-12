package cn.gok.beans.good;

import java.sql.Timestamp;

/**
 * @author 14489
 */
public class Picture {

    /**
     * 图片主键ID
     */
    private long pictureId;

    /**
     * 图片标题
     */
    private String pictureTitle;

    /**
     * 简短标题
     */
    private String prefTitle;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 关系主体的主键ID
     */
    private String relationId;

    /**
     * 图片所属类别
     */
    private long picCategory;

    /**
     * 关系类型 0，商品 1，店铺 2，文章资讯 3，热门活动
     */
    private int relationType;

    /**
     * 图片作者
     */
    private String author;

    /**
     * 图片来源
     */
    private String source;

    /**
     * 是否允许评论 0允许 1不允许
     */
    private boolean allowCommentIs;

    /**
     * 摘要
     */
    private String abstracts;

    /**
     * 图片描述
     */
    private String picDesc;

    /**
     * 商品在前台显示的微缩图片，如在分类筛选时显示的小图片
     */
    private String thumbImg;

    /**
     * 商品的实际大小图片，如进入该商品页时介绍商品属性所显示的大图片
     */
    private String realImg;

    /**
     * 商品的原始图片
     */
    private String originalImg;

    /**
     * 图片超链接地址
     */
    private String linkUrl;

    /**
     * 图片宽度
     */
    private String width;

    /**
     * 图片高度
     */
    private String height;

    /**
     * 图片排序
     */
    private int sortOrl;

    /**
     * 图片状态 0无效 1有效
     */
    private boolean status;

    /**
     * 发布时间
     */
    private Timestamp deployTime;

    /**
     * 下线时间
     */
    private Timestamp outlineTime;

    /**
     * 是否为主图 0否 1是
     */
    private boolean masterIs;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    /**
     * 更新者
     */
    private String updateBy;

    public Picture() {
    }

    public long getPictureId() {
        return pictureId;
    }

    public void setPictureId(long pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureTitle() {
        return pictureTitle;
    }

    public void setPictureTitle(String pictureTitle) {
        this.pictureTitle = pictureTitle;
    }

    public String getPrefTitle() {
        return prefTitle;
    }

    public void setPrefTitle(String prefTitle) {
        this.prefTitle = prefTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public long getPicCategory() {
        return picCategory;
    }

    public void setPicCategory(long picCategory) {
        this.picCategory = picCategory;
    }

    public int getRelationType() {
        return relationType;
    }

    public void setRelationType(int relationType) {
        this.relationType = relationType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isAllowCommentIs() {
        return allowCommentIs;
    }

    public void setAllowCommentIs(boolean allowCommentIs) {
        this.allowCommentIs = allowCommentIs;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public String getRealImg() {
        return realImg;
    }

    public void setRealImg(String realImg) {
        this.realImg = realImg;
    }

    public String getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(String originalImg) {
        this.originalImg = originalImg;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(int sortOrl) {
        this.sortOrl = sortOrl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timestamp getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Timestamp deployTime) {
        this.deployTime = deployTime;
    }

    public Timestamp getOutlineTime() {
        return outlineTime;
    }

    public void setOutlineTime(Timestamp outlineTime) {
        this.outlineTime = outlineTime;
    }

    public boolean isMasterIs() {
        return masterIs;
    }

    public void setMasterIs(boolean masterIs) {
        this.masterIs = masterIs;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
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
        return "Picture{" +
                "pictureId=" + pictureId +
                ", pictureTitle='" + pictureTitle + '\'' +
                ", prefTitle='" + prefTitle + '\'' +
                ", keywords='" + keywords + '\'' +
                ", relationId='" + relationId + '\'' +
                ", picCategory=" + picCategory +
                ", relationType=" + relationType +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", allowCommentIs=" + allowCommentIs +
                ", abstracts='" + abstracts + '\'' +
                ", picDesc='" + picDesc + '\'' +
                ", thumbImg='" + thumbImg + '\'' +
                ", realImg='" + realImg + '\'' +
                ", originalImg='" + originalImg + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", sortOrl=" + sortOrl +
                ", status=" + status +
                ", deployTime=" + deployTime +
                ", outlineTime=" + outlineTime +
                ", masterIs=" + masterIs +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
