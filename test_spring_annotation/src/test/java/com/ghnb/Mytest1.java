package com.ghnb;

import com.ghnb.pojo.Client;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest1 {
    @Test
    public void test_annotationDevelop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Client client = (Client)context.getBean("client");
        System.out.println(client.getName());
    }
}
