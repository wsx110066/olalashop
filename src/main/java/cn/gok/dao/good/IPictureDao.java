package cn.gok.dao.good;

import cn.gok.beans.good.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 14489
 */
@Repository
public interface IPictureDao {

    /**
     * 通过关系主体id查询图片
     * @param relationId
     * @return
     */
    List<Picture> queryPictureListByRelationId(String relationId);



}
