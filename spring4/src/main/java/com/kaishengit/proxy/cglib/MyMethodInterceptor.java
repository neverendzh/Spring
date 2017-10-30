package com.kaishengit.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zg
 * Created by Administrator on 2017/10/30.
 * cglib动态代理模板
 */
public class MyMethodInterceptor implements MethodInterceptor{
    //Method表示父类中的方法，MethodProxy表示子类中的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("-----------");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("~~~~~~~~~~~~");
        return result;
    }
}
