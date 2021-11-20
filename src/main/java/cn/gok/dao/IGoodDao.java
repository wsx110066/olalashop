package cn.gok.dao;

import cn.gok.beans.good.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGoodDao {

    public List<Good> queryGoodListByname(@Param("name") String name);

}
