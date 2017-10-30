package com.kaishengit.proxy;

import com.kaishengit.dao.UserDao;
import com.kaishengit.proxy.cglib.MyMethodInterceptor;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Created by Administrator on 2017/10/30.
 */
public class CgLibProxy {


    @Test
    public void proxy(){
        Enhancer enhancer = new Enhancer();
        //设置目标对象
        enhancer.setSuperclass(UserDao.class);
        //设置MethodInterceptor接口的实现类
        enhancer.setCallback(new MyMethodInterceptor());
        //产生目标对象的子类（动态代理类）
        UserDao userDao =(UserDao) enhancer.create();

        userDao.save();
    }
}
