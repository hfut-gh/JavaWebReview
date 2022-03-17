package com.ghnb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog") //将这个类放到spring的bean容器中
public class Dog {

    private String name;

    @Value("dog")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout(){
        System.out.println("wow wow wow!");
    }
}
