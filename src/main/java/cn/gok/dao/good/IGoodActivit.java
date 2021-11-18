package cn.gok.dao.good;

import cn.gok.beans.good.GoodActivit;

import java.util.List;

public interface IGoodActivit {

    //查询商城热门活动接口
    List<GoodActivit> queryGoodActivitList();
}
