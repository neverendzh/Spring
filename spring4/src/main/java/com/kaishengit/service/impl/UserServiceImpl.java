package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.dao.UserDaoTwo;
import com.kaishengit.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zh
 * 注入类
 * Created by Administrator on 2017/10/28.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private UserDaoTwo userDaoTwo;
    private String name;
    public UserServiceImpl(){}

    public UserServiceImpl(UserDao userDao, UserDaoTwo userDaoTwo,String name){
        this.userDao = userDao;
        this.userDaoTwo = userDaoTwo;
        this.name = name;
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
            userDao.save();
            userDaoTwo.save();
            System.out.println("name :"+name);
    }
}
