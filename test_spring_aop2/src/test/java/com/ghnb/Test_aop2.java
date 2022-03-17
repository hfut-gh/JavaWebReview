package com.ghnb;

import com.ghnb.aop2.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_aop2 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop2.xml");
        UserService serviceImpl =(UserService) context.getBean("serviceImpl");
        serviceImpl.update();
    }
}
