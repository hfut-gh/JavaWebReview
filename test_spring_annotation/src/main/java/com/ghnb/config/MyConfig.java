package com.ghnb.config;

import com.ghnb.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//代表一个配置类
@Import({MyConfig2.class})//引入其他的配置类
public class MyConfig {

    //通过方法注册一个bean，返回值就是Bean的类型，方法名就是bean的id；
    @Bean
    public Dog dog(){
        return new Dog();
    }




}
