package cn.gok.beans.good;

import java.io.Serializable;
import java.util.Date;

//商城文章
public class GoodArticle implements Serializable {

    //文章主键ID
    private  Integer articleId;
    //文章标题
    private  String  articleTitle;
    //文章简要标题
    private  String  prefTitle;
    //关键字
    private  String  keywords;
    //文章摘要
    private  String  abstracts;
    //作者
    private  String  author;
    //文章类别
    private  Integer articleType;
    //文章栏目
    private  Integer articleColumn;
    //排序
    private  Integer articleSort;
    //文章内容
    private  String  content;
    //文章来源
    private  String  source;
    //新闻链接地址
    private  String  linkUrl;
    //是否允许评论 0不允许 1允许
    private  Integer allowComments;
    //评论开始时间
    private  Date commentBeginTime;
    //评论结束时间
    private  Date commentEndTime;
    //是否发布  1发布 0 未发布
    private  Integer isEnabled;
    //点击浏览次数
    private  Integer clickCount;
    //审核状态 0，未审核 1，审核通过 2，审核未通过
    private  Integer reviewStatus;
    //创建时间
    private  Date createTime;
    //创建者
    private  String createBy;
    //更新时间
    private  Date updateTime;
    //更新者
    private  String updateBy;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
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

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getArticleColumn() {
        return articleColumn;
    }

    public void setArticleColumn(Integer articleColumn) {
        this.articleColumn = articleColumn;
    }

    public Integer getArticleSort() {
        return articleSort;
    }

    public void setArticleSort(Integer articleSort) {
        this.articleSort = articleSort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Integer allowComments) {
        this.allowComments = allowComments;
    }

    public Date getCommentBeginTime() {
        return commentBeginTime;
    }

    public void setCommentBeginTime(Date commentBeginTime) {
        this.commentBeginTime = commentBeginTime;
    }

    public Date getCommentEndTime() {
        return commentEndTime;
    }

    public void setCommentEndTime(Date commentEndTime) {
        this.commentEndTime = commentEndTime;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
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
}
