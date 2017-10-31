package com.kaishengit.dao;

import com.kaishengit.Application;
import com.kaishengit.ApplicationJDBC;
import com.kaishengit.BaseTest;
import com.kaishengit.entity.Tuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 *使用Spring连接数据库测试
 * Created by Administrator on 2017/10/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationJDBC.class)//(locations = "classpath:applicationContext.xml")
public class SpringJdbcTemplateTuserDaoTest {

    @Autowired
    private SpringJdbcTemplateTuserDao springJdbcTemplateTuserDao;

    @Test
    public void save(){
        Tuser tuser = new Tuser();
        tuser.setUserName("neverend");
        tuser.setAddress("香港");
        tuser.setDeptId(100);
        tuser.setPasswords("123321");
        springJdbcTemplateTuserDao.save(tuser);
    }

    @Test
    public void  findByid(){
        Tuser tuser = springJdbcTemplateTuserDao.findById(1L);
        System.out.println(tuser);
    }

    @Test
    public void findAll(){
        List<Tuser> tusers = springJdbcTemplateTuserDao.findAll();
        for(Tuser user : tusers){
            System.out.println(user);
        }
    }

    @Test
    public void count(){
        System.out.println(springJdbcTemplateTuserDao.count());
    }
}
