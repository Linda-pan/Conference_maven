package com.linda.mapperxml;

import com.linda.pojo.ReviewerPaperKey;

public interface ReviewerPaperMapper {
    int deleteByPrimaryKey(ReviewerPaperKey key);

    int insert(ReviewerPaperKey record);

    int insertSelective(ReviewerPaperKey record);
}