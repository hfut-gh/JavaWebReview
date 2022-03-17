package com.ghnb;

import com.ghnb.aop1.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_aop1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop1.xml");
        UserService userservice = (UserService)context.getBean("userservice");
        userservice.query();
    }
}
