package com.kaishengit.dao.spring;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author zh
 * Created by Administrator on 2017/10/28.
 */
public class AccessSpring {

    @Test
    public void hello(){
        //如果没有在Spring容器中设置一个类为单例类那么就会在容器加载时就会创建这个类实例化对象，默认情况下Spring容器中的类都是单例类
        //bean的属性lazy-init="true时表示懒加载
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //获取spring容器中类对象
        //UserDao userDao = (UserDao) context.getBean("userDao2");//当没有设置bean的id和name属性是，默认的属性值是类的完全限定名，如果有连个一样的bean节点，如果获取第二个节点在类的完全限定名称后边加#1
//        UserDao userDao1 = (UserDao) context.getBean("userDao");//如果设置了bean中的scope属性为prototype那么这个类就不是单例类
//        System.out.println(userDao==userDao1);
        //userDao.save();
    }

    @Test
    public  void setUserDao(){//set注入UserDao
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) context.getBean("userService");
        userService.save();

    }
    @Test
    public  void setUserServiceImplTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService =(UserServiceImpl) context.getBean("userService");
        int id = userService.getId();
        List<String> list = userService.getNameList();
        Map<String,UserDao> map =  userService.getUserDaoMap();
        Properties properties =  userService.getProperties();
        String name = userService.getName();
        Set<UserDao> userDaos = userService.getUserDaoSet();
        System.out.println("id="+id+"list"+list.toString()+"map"+map.toString()+"properties"+properties.toString()+"name"+name+"userDaos"+userDaos.toString());
    }
}
