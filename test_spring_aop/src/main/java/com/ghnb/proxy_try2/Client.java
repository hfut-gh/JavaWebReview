package com.ghnb.proxy_try2;

public class Client {
    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
