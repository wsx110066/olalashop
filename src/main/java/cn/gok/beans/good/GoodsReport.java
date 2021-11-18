package cn.gok.beans.good;

/**
 * 商品销量汇总类
 * @author 14489
 */
public class GoodsReport {

    /**
     * 商品主键ID
     */
    private String goodsId;

    /**
     * 月销量
     */
    private int monthSales;

    /**
     * 总销量
     */
    private int countSales;

    /**
     * 总评价数
     */
    private int countComms;

    /**
     * 评分
     */
    private int commendScore;

    public GoodsReport() {
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(int monthSales) {
        this.monthSales = monthSales;
    }

    public int getCountSales() {
        return countSales;
    }

    public void setCountSales(int countSales) {
        this.countSales = countSales;
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

    @Override
    public String toString() {
        return "GoodsReport{" +
                "goodsId='" + goodsId + '\'' +
                ", monthSales=" + monthSales +
                ", countSales=" + countSales +
                ", countComms=" + countComms +
                ", commendScore=" + commendScore +
                '}';
    }
}
