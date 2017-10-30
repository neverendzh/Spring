package com.kaishengit.service.impl;

import com.kaishengit.service.UserService;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 */
public class UserServiceImplProxy implements UserService{

    @Override
    public void save() {
        System.out.println("UserService----save");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(){
        System.out.println("Service-----update");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int count() {
        return 100;
    }
}
