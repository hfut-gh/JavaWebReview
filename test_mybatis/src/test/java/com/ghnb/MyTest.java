package com.ghnb;

import com.ghnb.Mapper.CityMapper;
import com.ghnb.pojo.City;
import com.ghnb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void selectCity(){
        SqlSession sqlSession = MybatisUtils.getSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities = cityMapper.selectCity();
        for(City city:cities){
            System.out.println(city);
        }
        sqlSession.close();
    }

}
