package com.ghnb.proxy_try;

public class Client_useInvocationHandler {
    public static void main(String[] args){
        Host host=new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setRent(host);
        Rent proxy= (Rent) handler.getProxy();
        proxy.rent();
    }
}
