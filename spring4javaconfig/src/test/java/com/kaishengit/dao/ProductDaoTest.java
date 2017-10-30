package com.kaishengit.dao;
import com.kaishengit.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/10/30.
 */
public class ProductDaoTest {
   @Test
    public void save() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);//new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = (ProductDao) context.getBean("dao");
        productDao.save();
    }


}
