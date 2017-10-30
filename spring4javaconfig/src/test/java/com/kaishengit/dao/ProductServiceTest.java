package com.kaishengit.dao;

import com.kaishengit.Application;
import com.kaishengit.service.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zg
 * Created by Administrator on 2017/10/30.
 */
public class ProductServiceTest {

    @Test
    public void productServiceSave(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);//new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService =(ProductService) context.getBean("productServiceImpl");
        productService.save();
    }
}
