package cn.gok.service.good;

import cn.gok.beans.good.Picture;

import java.util.List;

public interface GoodPicService {
    public List<Picture> queryPicByGoodId(String id);
}
