package com.ghnb.proxy_try;

public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        this.seeHouse();
        this.host.rent();
        this.fare();
    }

    public void seeHouse(){
        System.out.println("中介代理带客户看房");
    }
    public void fare(){
        System.out.println("中介代理收中介费");
    }

}
