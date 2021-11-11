package cn.gok.beans;

public class Good {
    private String GoodID;
    private String GoodSN;
    private String GoodName;
    private String GoodTitle;
    private String KeyWords;
    private String CatyID;
    private String CatySN;

    public String getGoodID() {
        return GoodID;
    }

    public void setGoodID(String goodID) {
        GoodID = goodID;
    }

    public String getGoodSN() {
        return GoodSN;
    }

    public void setGoodSN(String goodSN) {
        GoodSN = goodSN;
    }

    public String getGoodName() {
        return GoodName;
    }

    public void setGoodName(String goodName) {
        GoodName = goodName;
    }

    public String getGoodTitle() {
        return GoodTitle;
    }

    public void setGoodTitle(String goodTitle) {
        GoodTitle = goodTitle;
    }

    public String getKeyWords() {
        return KeyWords;
    }

    public void setKeyWords(String keyWords) {
        KeyWords = keyWords;
    }

    public String getCatyID() {
        return CatyID;
    }

    public void setCatyID(String catyID) {
        CatyID = catyID;
    }

    public String getCatySN() {
        return CatySN;
    }

    public void setCatySN(String catySN) {
        CatySN = catySN;
    }

    @Override
    public String toString() {
        return "Good{" +
                "GoodID='" + GoodID + '\'' +
                ", GoodSN='" + GoodSN + '\'' +
                ", GoodName='" + GoodName + '\'' +
                ", GoodTitle='" + GoodTitle + '\'' +
                ", KeyWords='" + KeyWords + '\'' +
                ", CatyID='" + CatyID + '\'' +
                ", CatySN='" + CatySN + '\'' +
                '}';
    }
}
