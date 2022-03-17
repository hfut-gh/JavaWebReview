package com.ghnb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//导入controller接口
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","HelloSpringMVC!");
        modelAndView.setViewName("hello");  //   /WEB-INF/jsp/hello.jsp
        return modelAndView;
    }
}
