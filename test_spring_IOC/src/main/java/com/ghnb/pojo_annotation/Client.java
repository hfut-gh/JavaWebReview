package com.ghnb.pojo_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {
//    第一种注解自动装配方式：@Autowire +@Qualifier配合使用
    //使用@Autowired可以将set方法去掉,根据类型装配
    //@Autowired(required=false) 说明： false，对象可以为null；true，对象必须存对象，不能为null。

//    @Autowired(required = false)
//    private Cat cat;
//    @Autowired(required = false)
//    private Dog dog;

//    @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
//    @Qualifier不能单独使用。
//      @Autowired
//      @Qualifier(value = "cat2")
//      private Cat cat;
//      @Autowired
//      @Qualifier(value = "dog2")
//      private Dog dog;

//      第二种注解自动装配方式：@Resource
//    @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
//    其次再进行默认的byName方式进行装配；
//    如果以上都不成功，则按byType的方式自动装配。
//    都不成功，则报异常。


    private Cat cat;

    private Dog dog;

    private String name;

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
