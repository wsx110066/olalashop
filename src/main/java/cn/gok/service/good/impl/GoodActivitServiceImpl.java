package cn.gok.service.good.impl;

import cn.gok.beans.good.GoodActivit;
import cn.gok.dao.good.IGoodActivit;
import cn.gok.service.good.IGoodActivitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodActivitServiceImpl implements IGoodActivitService {

    @Autowired
    IGoodActivit iGoodActivit;
    @Override
    public List<GoodActivit> queryGoodActivitList() {
        return iGoodActivit.queryGoodActivitList();
    }
}
