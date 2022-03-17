package com.ghnb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.io.IOException;

public class session_servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession reqSession = req.getSession();
        Cookie[] cookies = req.getCookies();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
