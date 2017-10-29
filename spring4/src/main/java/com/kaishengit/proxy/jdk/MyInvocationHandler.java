package com.kaishengit.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 *  动态代理类的模板
 */
public class MyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    //method表示目标对象中的一个方法
    //在method方法之前和之后可以自定义执行的模板
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println(">>>>>>>>>");
        Object result = method.invoke(target,args);//代表目标对象方法的执行，也就是被代理对象中方法的执行。例如，在动态创建出代理类时dell电脑的代理类。然后就可以调用接口中的方法，也就是执行被代理
        //中的销售方法
        System.out.println("<<<<<<<<");
        return result;
    }
}
