package com.kaishengit.service.impl;

import com.kaishengit.service.ProductService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zh
 * Created by Administrator on 2017/10/30.
 * 在测试类中，需要用到的bean直接注入到单元测试中，需要引入spring-test的jar
 */
//表示在运行测试类是引入SpringJUnit4ClassRunner.class类
@RunWith(SpringJUnit4ClassRunner.class)
//读取配置文件，创建Spring容器
@ContextConfiguration(classes = com.kaishengit.Application.class)//(locations = "classpath:applicationContext.xml")
public class ProductServiceImplTest {
    //注入这个接口的实现类，自动根据类型查找
    @Autowired
    private ProductService productService;

    @Test
    public  void save(){
        productService.save();
    }
}
