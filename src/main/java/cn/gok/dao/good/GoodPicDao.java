package cn.gok.dao.good;

import cn.gok.beans.good.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodPicDao {
    public List<Picture> queryPicByGoodId(@Param("id") String id);
}
