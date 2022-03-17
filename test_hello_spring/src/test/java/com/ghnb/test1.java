package com.ghnb;

import com.ghnb.pojo.Hello;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void testHello(){
        //解析beans.xml配置文件,生成相应的管理bean的对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)context.getBean("hello");
        hello.show();
    }
}
