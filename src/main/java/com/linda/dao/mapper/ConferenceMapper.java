package com.linda.dao.mapper;

import com.linda.pojo.Conference;

public interface ConferenceMapper {
    int deleteByPrimaryKey(Integer conferenceId);

    int insert(Conference record);

    int insertSelective(Conference record);

    Conference selectByPrimaryKey(Integer conferenceId);

    int updateByPrimaryKeySelective(Conference record);

    int updateByPrimaryKey(Conference record);
}