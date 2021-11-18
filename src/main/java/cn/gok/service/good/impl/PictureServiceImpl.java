package cn.gok.service.good.impl;

import cn.gok.beans.good.Picture;
import cn.gok.dao.good.IPictureDao;
import cn.gok.service.good.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 14489
 */
@Service
public class PictureServiceImpl implements IPictureService {

    @Autowired
    IPictureDao iPictureDao;

    /**
     * 通过关系主体id查询图片
     *
     * @param relationId
     * @return
     */
    @Override
    public List<Picture> queryPictureListByRelationId(String relationId) {
        return iPictureDao.queryPictureListByRelationId(relationId);
    }
}
