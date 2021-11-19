package cn.gok.service.order;

import cn.gok.beans.order.Comment;

import java.util.List;

public interface ICommentService {
    public List<Comment> queryCommentByUserId(String id);
}
