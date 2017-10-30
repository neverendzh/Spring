package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.dao.UserDaoTwo;
import com.kaishengit.proxy.Sales;
import com.kaishengit.service.UserService;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 */
public class UserServiceImplTwo implements UserService {

    private UserDaoTwo userDaoTwo;
    public UserServiceImplTwo(UserDaoTwo userDaoTwo){
        this.userDaoTwo = userDaoTwo;
    }

    public void setUserDaoTwo(UserDaoTwo userDaoTwo) {
        this.userDaoTwo = userDaoTwo;
    }

    @Override
    public void save() {
        System.out.println("service-----seve");
        userDaoTwo.save();
    }

    @Override
    public void update(){
        System.out.println("UserService-----Update");
    }

    @Override
    public int count() {
        return 100;
    }
}
