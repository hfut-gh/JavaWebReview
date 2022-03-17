package com.ghnb;

import com.ghnb.config.MyConfig;
import com.ghnb.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest_config {
    @Test
    public void test_config(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.getName());
    }



}
