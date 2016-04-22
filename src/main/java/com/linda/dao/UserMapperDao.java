package com.linda.dao;

import com.linda.dao.mapper.UserMapper;
import com.linda.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by jpan on 2016/4/5.
 */
@Repository
public interface UserMapperDao extends UserMapper {

    User selectByNameAndPwd(@Param(value = "userName") String userName, @Param(value = "password") String password);

    User selectByPrimaryKey(int userId);
}
