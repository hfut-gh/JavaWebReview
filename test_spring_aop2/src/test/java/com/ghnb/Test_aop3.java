package com.ghnb;

import com.ghnb.aop3.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_aop3 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop3.xml");
        UserService serviceImpl =(UserService) context.getBean("serviceImpl");
        serviceImpl.update();
    }
}
