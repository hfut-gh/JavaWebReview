package com.ghnb;

import com.ghnb.Mapper.CityMapper;
import com.ghnb.pojo.City;
import com.ghnb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test_zhujie {
    @Test
    public void test_1(){
        SqlSession sqlSession = MybatisUtils.getSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities=mapper.selectCityByCode("NLD");
        for (City city:cities){
            System.out.println(city);
        }
        sqlSession.close();
    }
}
