package com.kaishengit.proxy;

import com.kaishengit.proxy.jdk.MyInvocationHandler;
import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import com.kaishengit.service.impl.UserServiceImplTwo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.*;
import java.lang.reflect.Proxy;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 */
public class JdkProxyTest {

    @Test
    public void proxy(){
        Dell dell = new Dell();//1.产生一个dell被代理的对象。
        //2.创建出自定义的执行模板
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(dell);
        //3.1我们要思考产生的dell代理类用什么对象来接收
        //3.2在产生代理类是，因为产生的是代理类，代理类是实现了一个接口的。也就是dell这个代理类实现了销售电脑的接口
        //3.3代理类是一个独立的对象，他实现了Sales接口。还有一个Dell电脑也实现了这个接口。
        //3.4dell的代理类，和dell电脑都同事实现的销售。
        //3.5所以dell代理类和dell电脑是一个兄弟类
        //3.6所以产生的代理类需要接口Sales接收
        //3.产生的代理类需要接口指向代理类,产生了dell的代理类

        //这一步就创建出了一个代理类
        Sales sales = (Sales) java.lang.reflect.Proxy.newProxyInstance
                (dell.getClass().getClassLoader(),
                dell.getClass().getInterfaces(),myInvocationHandler);
        //代理类sales调用salesPc()方法，实际上是执行代理类中的salesPs方法，在执行这个salesPc方法之前，
        //在创建这个代理类时，这个代理类通过构造放发吧dell电脑传进了代理类，
        //执行代理类中的salesPC方法，相当于执行了dell电脑总部中的sales方法
        sales.salesPc();
    }

    @Test
    public void serviceImlTestProxy(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImplTwo userServiceImplTwo =(UserServiceImplTwo) applicationContext.getBean("userServiceImplTwo");
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userServiceImplTwo);
        UserService userService1 =(UserService) Proxy.newProxyInstance(userServiceImplTwo.getClass().getClassLoader(),userServiceImplTwo.getClass().getInterfaces(),invocationHandler);
        userService1.save();
    }

}
