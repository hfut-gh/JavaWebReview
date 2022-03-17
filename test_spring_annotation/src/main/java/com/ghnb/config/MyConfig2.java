package com.ghnb.config;

import com.ghnb.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
