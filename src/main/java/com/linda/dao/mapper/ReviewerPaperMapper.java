package com.linda.dao.mapper;

import com.linda.pojo.ReviewerPaperKey;

public interface ReviewerPaperMapper {
    int deleteByPrimaryKey(ReviewerPaperKey key);

    int insert(ReviewerPaperKey record);

    int insertSelective(ReviewerPaperKey record);
}