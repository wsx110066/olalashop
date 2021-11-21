package cn.gok.service.good.impl;


import cn.gok.beans.good.Picture;
import cn.gok.dao.good.GoodPicDao;
import cn.gok.service.good.GoodPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodPicServiceImp implements GoodPicService {
    @Autowired
    GoodPicDao goodPicDao;
    @Override
    public List<Picture> queryPicByGoodId(String id) {
        return goodPicDao.queryPicByGoodId(id);
    }
}
