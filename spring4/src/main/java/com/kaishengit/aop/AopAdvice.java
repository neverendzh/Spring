package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zg
 * Created by Administrator on 2017/10/30.
 * AOP通知类
 */
public class AopAdvice {

    public void before(){
        System.out.println("前置通知");
    }

    //在执行完方法，如果有一个返回值，则定义后置通知方法参数列表中有Object的参数类型
    public void  afterReturning(Object result){

        System.out.println("后置通知"+"result"+result);
    }

    public void afterThrowing(Exception ex){
        System.out.println("异常通知-->"+ex.getMessage());
    }

    public void after(){
        System.out.println("最终通知");
    }


    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("环绕前置通知");
           result = joinPoint.proceed();//表示目标对象的方法执行,并且如果放方法定义了参数，那么就会返回这个参数
            System.out.println("环绕后置通知" +result);
        }catch (Throwable throwable){
            System.out.println("环绕异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("环绕最终通知");
        }
        return result;
    }
}
