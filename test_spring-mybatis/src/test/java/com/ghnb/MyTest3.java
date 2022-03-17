package com.ghnb;

import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest3 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_way2.xml");
        CityMapper cityDao = (CityMapper) context.getBean("CityDao");
        List<City> cities=cityDao.selectCity();
        for(City city:cities){
            System.out.println(city);
        }
    }
}
