package com.ghnb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class cookies_servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        Cookie[] cookies = req.getCookies();
        PrintWriter printWriter = resp.getWriter();
        //可以通过cookies获得当前cookies的一些信息，cookies是一个类

        if(cookies!=null){
            printWriter.write("你上次访问的时间是：");
            for (int i=0;i<cookies.length;i++){
                Cookie cookie=cookies[i];
                printWriter.write("hahahahahahahahh");
                printWriter.write(cookies[0].getName());
                if(cookie.getName().equals("loginTime")){
                    Date date=new Date(Long.parseLong(cookie.getValue())) ;
                    printWriter.write(date.toLocaleString());
                }
            }

            //匹配键值对

        }
        else{
            printWriter.write("这是你第一次访问本页面，访问时间是：");

        }
        //注意这里是每次访问都要为用户分配一个cookie
        Cookie cookie=new Cookie("loginTime",System.currentTimeMillis()+"");

        //设置cookie有效期为一天，使用cookie.setMaxAge函数
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
