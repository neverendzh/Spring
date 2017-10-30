package com.kaishengit.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 * 动态代理
 */
public class TimeInvocationHandler implements InvocationHandler {

    private Object object;

    public TimeInvocationHandler (Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long statrtTIme = System.currentTimeMillis();

        Object result =  method.invoke(object ,args);

        long endTime = System.currentTimeMillis();

        String className = object.getClass().getName();
        String methodName = method.getName();

        System.out.println(className+"--"+methodName+"--"+(endTime-statrtTIme)+"ms");

        return result;
    }
}
