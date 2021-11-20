package cn.gok.dao.order;

import cn.gok.beans.order.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICommentDao {
    public List<Comment> queryCommentByUserId(@Param("id") String id);
}
