package com.kaishengit.service.impl;

import com.kaishengit.BaseTest;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 * 测试手动注入
 */
public class UserServiceImplTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void save(){
        userService.save();
    }
}
