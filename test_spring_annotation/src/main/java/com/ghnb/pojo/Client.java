package com.ghnb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("client")
@Scope("prototype")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class Client {
//    属性注入，@Value()
//    如果提供了set方法，在set方法上添加@value(“值”);
    private Cat cat;
    private Dog dog;


    private String name;


    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Value("gh")
    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }
}
