package com.linda.dao.mapper;

import com.linda.pojo.Comment;
import com.linda.pojo.CommentKey;

public interface CommentMapper {
    int deleteByPrimaryKey(CommentKey key);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(CommentKey key);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}