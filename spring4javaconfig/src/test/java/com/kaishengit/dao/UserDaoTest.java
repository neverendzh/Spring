package com.kaishengit.dao;

import com.kaishengit.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**@author zh
 * Created by Administrator on 2017/10/30.
 * 测试不使用配置文件手动吧类添加到Spring容器中
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class UserDaoTest {

   @Autowired
    private UserDao userDao;
   @Test
    public void uerDao(){

       userDao.save();
    }
}
