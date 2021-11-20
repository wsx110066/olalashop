package cn.gok.beans.sys;

import java.io.Serializable;
import java.util.Date;

public class SysGoods implements Serializable {
    public String goodsId;
    public String catyId;
    public String goodsName;
    public String keywords;
    public String businessSn;
    public String catySn;
    public String goodsBrief;
    public Integer marketPrice;
    public Integer shopPrice;
    public Integer promotePrice;
    public Integer isOnSale;

    public String goodsTitle;
    public Integer sortOrl;
    public Date effectiveDate;
    public Integer expiryDays;
    public Integer isComment;
    public Integer costPrice;
    public Date promoteStartDate;
    public Date promoteEndDate;
    public String goodsDesc;



    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public Integer getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(Integer sortOrl) {
        this.sortOrl = sortOrl;
    }



    public Integer getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(Date promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    public Date getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(Date promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getCatyId() {
        return catyId;
    }

    public void setCatyId(String catyId) {
        this.catyId = catyId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBusinessSn() {
        return businessSn;
    }

    public void setBusinessSn(String businessSn) {
        this.businessSn = businessSn;
    }

    public String getCatySn() {
        return catySn;
    }

    public void setCatySn(String catySn) {
        this.catySn = catySn;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Integer shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Integer getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(Integer promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Integer isOnSale) {
        this.isOnSale = isOnSale;
    }
}
