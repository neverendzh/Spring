package com.kaishengit.proxy;

import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/10/30.
 * AOP通知测试
 */
public class AopTest {
    @Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) context.getBean("userService");
//        userService.save();
//        userService.update();
        userService.count();

    }
}
