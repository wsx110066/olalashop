package cn.gok.beans.customer;

/**
 * 收藏vo类
 * @author 14489
 */
public class CollectVo {

    /**
     * 商品收藏ID
     */
    private int collectId;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品的简略标题
     */
    private String goodsTitle;

    /**
     * 商品图片路径
     */
    private String imgPath;

    /**
     * 本店售价(分)
     */
    private int shopPrice;

    /**
     * 促销价格（分）
     */
    private int promotePrice;

    /**
     * 月销量
     */
    private int monthSales;

    public CollectVo() {
    }

    public CollectVo(int collectId, String goodsId, String goodsName, String goodsTitle, String imgPath, int shopPrice, int promotePrice, int monthSales) {
        this.collectId = collectId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsTitle = goodsTitle;
        this.imgPath = imgPath;
        this.shopPrice = shopPrice;
        this.promotePrice = promotePrice;
        this.monthSales = monthSales;
    }

    public int getCollectId() {
        return collectId;
    }

    public void setCollectId(int collectId) {
        this.collectId = collectId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int showPrice) {
        this.shopPrice = showPrice;
    }

    public int getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(int promotePrice) {
        this.promotePrice = promotePrice;
    }

    public int getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(int monthSales) {
        this.monthSales = monthSales;
    }

    @Override
    public String toString() {
        return "CollectVo{" +
                "collectId=" + collectId +
                ", goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", showPrice=" + shopPrice +
                ", promotePrice=" + promotePrice +
                ", monthSales=" + monthSales +
                '}';
    }
}
