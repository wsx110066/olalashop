package cn.gok.beans.good;

import java.io.Serializable;
import java.util.Date;

//商城热门活动
public class GoodActivit implements Serializable {
    //活动ID
    private  Integer  activitId;
    //活动主题标语
    private  String  slogan;
    //活动图片地址
    private  String  activitImg;
    //活动内容文字说明
    private  String  activitContent;
    //跳转链接地址
    private  String  linkUrl;
    //活动排序
    private  Integer  sortOrder;
    //活动开始时间
    private Date  startTime;
    //活动结束时间
    private Date  endTime;
    //活动是否结束，0未开始 1，结束；2，未结束
    private  Integer  isFinished;

    //创建时间
    private Date createTime;
    //创建者
    private  String createBy;
    //更新时间
    private  Date updateTime;
    //更新者
    private  String updateBy;

    public Integer getActivitId() {
        return activitId;
    }

    public void setActivitId(Integer activitId) {
        this.activitId = activitId;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getActivitImg() {
        return activitImg;
    }

    public void setActivitImg(String activitImg) {
        this.activitImg = activitImg;
    }

    public String getActivitContent() {
        return activitContent;
    }

    public void setActivitContent(String activitContent) {
        this.activitContent = activitContent;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
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
