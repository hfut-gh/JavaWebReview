package com.ghnb.aop1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    //o是返回值  return value
    //method  被调用的方法  method
    //objects 被调用的方法的参数  args
    //o1 被调用的目标对象  target
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+o1.getClass().getName()+"的"+method.getName()+"方法，返回值"+o);
    }
    //接着取spring文件中注册，实现aop切入实现

}
