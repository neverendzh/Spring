package com.kaishengit.service.impl;

import com.kaishengit.dao.SpringJdbcTemplateTuserDao;
import com.kaishengit.entity.Tuser;
import com.kaishengit.service.ProductService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 * 在测试类中，需要用到的bean直接注入到单元测试中，需要引入spring-test的jar
 */
//表示在运行测试类是引入SpringJUnit4ClassRunner.class类
@RunWith(SpringJUnit4ClassRunner.class)
//读取配置文件，创建Spring容器
@ContextConfiguration(locations = "classpath:applicationContext.xml")//(classes = com.kaishengit.Application.class)//(locations = "classpath:applicationContext.xml")
public class ProductServiceImplTest {
    //注入这个接口的实现类，自动根据类型查找
    @Autowired
    private ProductService productService;
    @Autowired
    private SpringJdbcTemplateTuserDao tuserDao;

    /*@Test
    public  void save(){
        productService.save();
    }
*/
    @Test
    public void saveJdbc(){
        Tuser tuser = new Tuser();
        tuser.setUserName("neverend");
        tuser.setAddress("香港");
        tuser.setDeptId(100);
        tuser.setPasswords("123");
        productService.save(tuser);


    }

    @Test
    public void findById(){
        List<Tuser> tuser  =  tuserDao.findAll();
        for(Tuser tuser1 :tuser){
            System.out.println(tuser1);

        }
    }
}
