package com.linda.mapperxml;

import com.linda.pojo.ConferenceStatus;
import com.linda.pojo.ConferenceStatusKey;

public interface ConferenceStatusMapper {
    int deleteByPrimaryKey(ConferenceStatusKey key);

    int insert(ConferenceStatus record);

    int insertSelective(ConferenceStatus record);

    ConferenceStatus selectByPrimaryKey(ConferenceStatusKey key);

    int updateByPrimaryKeySelective(ConferenceStatus record);

    int updateByPrimaryKey(ConferenceStatus record);
}