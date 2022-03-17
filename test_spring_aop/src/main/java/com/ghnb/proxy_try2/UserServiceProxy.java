package com.ghnb.proxy_try2;

//实现一个代理，为前面已经实现的实际业务增加功能
public class UserServiceProxy implements UserServie{
    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy() {
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    @Override
    public void update() {
        this.log("update");
        this.userService.update();
    }

    @Override
    public void delete() {
        this.log("delete");
        this.userService.delete();
    }

    @Override
    public void add() {
        this.log("add");
        this.userService.add();
    }

    @Override
    public void query() {
        this.log("query");
        this.userService.query();
    }

    public void log(String msg){
        System.out.println(this.getClass().toString()+"#proxy log:");
    }
}
