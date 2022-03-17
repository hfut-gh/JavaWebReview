package com.ghnb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取servlet上下文，通过上下文context进行servlet之间的通信
        ServletContext ctx=this.getServletContext();
        //获取上下文路径
        String path= ctx.getContextPath();
        System.out.println(path);

//        //获取本地存储文件
//        this.getServletContext().getResourceAsStream("/WEB/");
        System.out.println("this is in servlet 01!!!!!");
        ctx.setAttribute("username","ghnb");
        resp.getWriter().print("this is servlet01!");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
