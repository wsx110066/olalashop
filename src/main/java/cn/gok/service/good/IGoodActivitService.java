package cn.gok.service.good;

import cn.gok.beans.good.GoodActivit;

import java.util.List;

public interface IGoodActivitService {

    //查询商城热门活动接口
    List<GoodActivit> queryGoodActivitList();
}
