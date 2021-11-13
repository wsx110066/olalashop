package cn.gok.service.good;

import cn.gok.dao.good.IGoodArticle;

import java.util.List;

public interface IGoodArticleService {
    //查询商品文章列表接口
    List<IGoodArticle> queryGoodArticleList();
}
