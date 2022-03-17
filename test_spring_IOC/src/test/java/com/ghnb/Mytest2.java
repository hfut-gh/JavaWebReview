package com.ghnb;

import com.ghnb.pojo.Client;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest2 {
        @Test
        public void testMethodAutowire() {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowired.xml");
            Client client = (Client) context.getBean("client");
            client.getCat().shout();
            client.getDog().shout();
        }
}
