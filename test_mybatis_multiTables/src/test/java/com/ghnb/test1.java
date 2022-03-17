package com.ghnb;


import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;
import com.ghnb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test1 {
    @Test
    public void test_association(){
        SqlSession sqlSession = MybatisUtils.getSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities=mapper.getCityLanguage();
        for (City city:cities){
            System.out.println("CityName:"+city.getName()+"----Language:"+city.getCountryLanguage().getLanguage());
        }
        sqlSession.close();
    }
}
