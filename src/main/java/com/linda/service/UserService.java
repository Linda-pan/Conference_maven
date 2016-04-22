package com.linda.service;


import com.linda.pojo.User;

/**
 * Created by jpan on 2016/4/5.
 */

public interface UserService {
    /**
     * 获取用户
     *
     * @param uid 用户id
     */
    User getUser(int userId);


}
