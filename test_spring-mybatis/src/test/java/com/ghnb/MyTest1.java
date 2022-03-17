package com.ghnb;

import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest1 {
    @Test
    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities=mapper.selectCity();
        for(City city:cities){
            System.out.println(city);
        }
        sqlSession.close();
    }
}
