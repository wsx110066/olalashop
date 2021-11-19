package cn.gok.service.order.impl;

import cn.gok.beans.order.Comment;
import cn.gok.dao.order.ICommentDao;
import cn.gok.service.order.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImp implements ICommentService {
    @Autowired
    ICommentDao commentDao;

    @Override
    public List<Comment> queryCommentByUserId(String id) {
        return commentDao.queryCommentByUserId(id);
    }
}
