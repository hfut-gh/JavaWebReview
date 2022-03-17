package com.ghnb.proxy_try;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandlerGeneration implements InvocationHandler {
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }
    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    // proxy : 代理类
    // method : 代理类的调用处理程序的方法对象.
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
    public void log(String methodName){
        System.out.println("执行了"+methodName+"方法");
    }
}


//对应测试类
//public class Test {
//    public static void main(String[] args) {
//        //真实对象
//        UserServiceImpl userService = new UserServiceImpl();
//        //代理对象的调用处理程序
//        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        pih.setTarget(userService); //设置要代理的对象
//        UserService proxy = (UserService)pih.getProxy(); //动态生成代理类！
//        proxy.delete();
//    }
//}