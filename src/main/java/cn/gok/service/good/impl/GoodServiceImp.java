package cn.gok.service.imp;

import cn.gok.beans.good.Good;
import cn.gok.dao.IGoodDao;
import cn.gok.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodServiceImp implements GoodService {
    @Autowired
    IGoodDao goodDao;
    @Override
    public List<Good> queryGoodListbyName(String name) {
        return goodDao.queryGoodListByname(name);
    }
}
