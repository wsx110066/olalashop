package cn.gok.service;


import cn.gok.beans.good.Good;

import java.util.List;

public interface GoodService {
    public List<Good> queryGoodListbyName(String name);

}
