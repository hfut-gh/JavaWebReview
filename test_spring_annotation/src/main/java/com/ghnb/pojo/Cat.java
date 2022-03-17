package com.ghnb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Value("cat")
    private String name;
    public void shout(){
        System.out.println("miao miao miao !");
    }
}
