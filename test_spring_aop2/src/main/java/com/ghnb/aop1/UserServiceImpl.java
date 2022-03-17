package com.ghnb.aop1;

public class UserServiceImpl implements UserService {
    @Override
    public void update() {
        System.out.println(this.getClass().toString()+":update");
    }

    @Override
    public void delete() {
        System.out.println(this.getClass().toString()+":delete");
    }

    @Override
    public void add() {
        System.out.println(this.getClass().toString()+":add");
    }

    @Override
    public void query() {
        System.out.println(this.getClass().toString()+":query");
    }
}
