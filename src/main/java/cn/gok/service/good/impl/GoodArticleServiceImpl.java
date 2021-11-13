package cn.gok.service.good.impl;

import cn.gok.dao.good.IGoodArticle;
import cn.gok.service.good.IGoodArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodArticleServiceImpl implements IGoodArticleService {

    @Autowired
    IGoodArticle iGoodArticle;

    //查询商品文章列表
    @Override
    public List<IGoodArticle> queryGoodArticleList() {
        return iGoodArticle.queryGoodArticleList();
    }
}
