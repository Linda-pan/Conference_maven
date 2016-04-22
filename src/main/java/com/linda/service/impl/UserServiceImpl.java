package com.linda.service.impl;


import com.linda.dao.UserMapperDao;
import com.linda.pojo.User;
import com.linda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jpan on 2016/4/5.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public User getUser(int userId){
        return userMapperDao.selectByPrimaryKey(userId);
    }

   /* public User login(String userName,String password){
        if (userMapper.) {

        }
        return null;
    }*/
}
