package cn.gok.service.good;

import cn.gok.beans.good.Picture;

import java.util.List;

/**
 * @author 14489
 */
public interface IPictureService {

    /**
     * 通过关系主体id查询图片
     * @param relationId
     * @return
     */
    List<Picture> queryPictureListByRelationId(String relationId);
}
