package com.ghnb.proxy_try2;

//先定义一个抽象业务，以便后面的功能复用
public interface UserServie {
     void update();
     void delete();
     void add();
     void query();
}
