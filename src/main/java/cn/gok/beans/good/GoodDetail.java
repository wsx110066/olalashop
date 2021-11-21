package cn.gok.beans.good;

public class GoodDetail {
    private String goodsId;

    /**
     * 商品的唯一货号
     */
    private String goodsSn;

    /**
     * 商品名称
     */
    private String goodsName;


    /**
     * 商品的简略标题
     */
    private String goodsTitle;


    /**
     * 商品关键字，放在商品页的关键字中，为搜索引擎收录用
     */
    private String keywords;


    /**
     * 商品分类ID
     */
    private String catyId;


    /**
     * 商品分类编码
     */
    private String catySn;


    /**
     * 所属店铺ID
     */
    private String businessSn;


    /**
     * 生产日期
     */
    private String effectiveDate;


    /**
     * 有效期(天)
     */
    private int expiryDays;


    /**
     * 商品的简短描述
     */
    private String goodsBrief;


    /**
     * 商品的详细描述
     */
    private String goodsDesc;


    /**
     * 市场售价(分)
     */
    private int marketPrice;


    /**
     * 折扣
     */
    private int discount;


    /**
     * 本店售价(分)
     */
    private int shopPrice;


    /**
     * 成本价
     */
    private int costPrice;


    /**
     * 促销价格（分）
     */
    private int promotePrice;

    /**
     * 促销开始时间
     */
    private String promoteStartDate;


    /**
     * 促销结束时间
     */
    private String promoteEndDate;


    /**
     * 优惠券编号
     */
    private String couponSn;


    /**
     * 是否删除 0否 1是
     */
    private int delIs;


    /**
     * 是否开售 1是 0否
     */
    private int onSaleOn;


    /**
     * 是否允许评论 0否 1是
     */
    private int commentIs;


    /**
     * 快递费（分）
     */
    private int shipFee;


    /**
     * 商品排序值
     */
    private int sortOrl;


    /**
     * 商品录入时间
     */
    private String createTime;


    /**
     * 创建者
     */
    private String createBy;


    /**
     * 商品更新时间
     */
    private String updateTime;


    /**
     * 更新者
     */
    private String updateBy;
    private String goodId;
    private int monthSale;
    private int countSale;
    private int countComms;
    private int commendScore;
    private Picture pictureVos;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatyId() {
        return catyId;
    }

    public void setCatyId(String catyId) {
        this.catyId = catyId;
    }

    public String getCatySn() {
        return catySn;
    }

    public void setCatySn(String catySn) {
        this.catySn = catySn;
    }

    public String getBusinessSn() {
        return businessSn;
    }

    public void setBusinessSn(String businessSn) {
        this.businessSn = businessSn;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(int promotePrice) {
        this.promotePrice = promotePrice;
    }

    public String getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(String promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    public String getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(String promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    public String getCouponSn() {
        return couponSn;
    }

    public void setCouponSn(String couponSn) {
        this.couponSn = couponSn;
    }

    public int getDelIs() {
        return delIs;
    }

    public void setDelIs(int delIs) {
        this.delIs = delIs;
    }

    public int getOnSaleOn() {
        return onSaleOn;
    }

    public void setOnSaleOn(int onSaleOn) {
        this.onSaleOn = onSaleOn;
    }

    public int getCommentIs() {
        return commentIs;
    }

    public void setCommentIs(int commentIs) {
        this.commentIs = commentIs;
    }

    public int getShipFee() {
        return shipFee;
    }

    public void setShipFee(int shipFee) {
        this.shipFee = shipFee;
    }

    public int getSortOrl() {
        return sortOrl;
    }

    public void setSortOrl(int sortOrl) {
        this.sortOrl = sortOrl;
    }

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

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public int getMonthSale() {
        return monthSale;
    }

    public void setMonthSale(int monthSale) {
        this.monthSale = monthSale;
    }

    public int getCountSale() {
        return countSale;
    }

    public void setCountSale(int countSale) {
        this.countSale = countSale;
    }

    public int getCountComms() {
        return countComms;
    }

    public void setCountComms(int countComms) {
        this.countComms = countComms;
    }

    public int getCommendScore() {
        return commendScore;
    }

    public void setCommendScore(int commendScore) {
        this.commendScore = commendScore;
    }

    public Picture getPictureVos() {
        return pictureVos;
    }

    public void setPictureVos(Picture pictureVos) {
        this.pictureVos = pictureVos;
    }
}
